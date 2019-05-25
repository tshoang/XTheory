/*
 * generated by Xtext 2.13.0
 */
package ac.soton.xtheory.validation

import org.eclipse.xtext.validation.Check
import theoryextension.Theory
import theoryextension.Type
import theoryextension.Constructor
import theoryextension.Destructor
import theoryextension.Operator
import theoryextension.Notation

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TheoryValidator extends AbstractTheoryValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					TheoryPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	// Check the name of the .thy file is the same as the theory name
	@Check
	def checkTheoryName(Theory thy){
		val res = thy.eResource
		val fileName = res.URI.lastSegment.toString
		val thyName= fileName.substring(0, fileName.indexOf('.'))
		if (thyName != thy.name)
			error('Theory name should be the same as the file name', null)
	}
	/*
	// Check the name of the theory parameters as they must be distinct one another
	@Check
	def checkTheoryParametersName(Theory thy){
		var i=0
		for(; i<thy.parameters.size() ; i++){
			var j=i+1
			for(; j<thy.parameters.size() ; j++){
			if (thy.parameters.get(i).name == thy.parameters.get(j).name)
				error("Theory parameters' names should be distinct", thy.parameters.get(i).eClass().getEAllStructuralFeatures().get(0))
				//if none, all the file is underlined. Here we only have the theory name underlined
			}
		}
	}*/
	
	// Check the names of internal elements of a theory are distinct
	@Check
	def checkInternalElementsName(Theory thy) {
		var i=0
		for(; i<thy.internalElements.size() ; i++){
			var j=i+1
			for(; j<thy.internalElements.size() ; j++){
			if (thy.internalElements.get(i).name == thy.internalElements.get(j).name)
				error("Internal elements' names should be distinct", thy.internalElements.get(i).eClass().getEAllStructuralFeatures().get(0))
				//if none, all the file is underlined. Here we only have the theory name underlined
			}
		}
	}
	
	// Check the name of a constructor and of its destructor are distinct
	@Check
	def checkDestructorName(Constructor cons){
		for(Destructor des: cons.destructors){
			if (cons.name == des.name)
				error('Constructor and destructor name should be distinct', null)
		}
	}
	
	// Check the number of arguments of a infix operator is 2
	@Check
	def checkInfixArgumentsNumber(Operator op){
		if ((op.notation == Notation.INFIX) && !(op.arguments.size() == 2))
			error('Infix operator must need at least two arguments', null)
	}
	
	// Check the number of arguments of a postfix operator is greater than 1
	@Check
	def checkPostfixArgumentsNumber(Operator op){
		if ((op.notation == Notation.POSTFIX) && !(op.arguments.size() > 0))
			error('Postfix operator must need at least one argument', null)
	}

	// Check if the case is an argument of the operator
	@Check
	def checkCaseIsArgument(Operator op){
		var flag = false  // flag is the bool for: op.arguments contains an argument whose name is op.case
		var i = 0
		for (; i<op.arguments.size() ; i++){
			if (op.arguments.get(i).name == op.getCase()) // op.case make a syntax error, so we use the get method
				flag = true
		}
		if (!flag)
			error('Case must be an argument', null)
	}
	
	// Check if an associative operator has at least 2 arguments 
	@Check
	def checkAssociativeArgumentsNumber(Operator op){
		if ((op.associative) && (op.arguments.size() < 2))
			error("An associative operator must have at least 2 arguments", null)
	}
	
	// Check if a commutative operator has at least 2 arguments 
	@Check
	def checkCommutativeArgumentsNumber(Operator op){
		if ((op.commutative) && (op.arguments.size() < 2))
			error("A commutative operator must have at least 2 arguments", null)
	}
	
	// Check if a type has a base constructor
	@Check
	def checkBaseConstrutor(Type type){
		var flag = true
		for (Constructor cons: type.constructors)
			if (cons.destructors.size() == 0)
				flag = false 	// if we find a base constructor, it is fine
		if (flag)
			error("A type needs a base constructor", null)
	}
}
