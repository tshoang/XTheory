package ac.soton.xtheory.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import theoryextension.Theory
import ac.soton.xtheory.internal.common.AssertTheoryExtension
//import ac.soton.xtheory.validation.TheoryValidator
import theoryextension.TheoryextensionPackage

@RunWith(XtextRunner)
@InjectWith(TheoryInjectorProvider)
class TheoryValidatorTest {
	@Inject extension ParseHelper<Theory>
	@Inject extension ValidationTestHelper
	
	extension AssertTheoryExtension = new AssertTheoryExtension()
	
	@Before
	def void registerEPackages() {
		registerTheoryEPackage
	}
	
	@Test
	def void testTheoryName() {
		val testInput = 
		'''
			theory thy
			end
		''' // file's name is "__synthetic0.thy" by default while testing
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Theory name should be the same as the file name")
	}
	
	@Test
	def void testInternalElementsName() {
		val testInput = 
		'''
			theory __synthetic0
				theorems @thm0: "blablabla"
				axioms @thm0: "blablabla"
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Internal elements' names should be distinct")
	}
	
	@Test
	def void testInternalElementsName2() {
		val testInput = 
		'''
			theory __synthetic0
				types List = nil
				axioms @List: "blablabla"
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Internal elements' names should be distinct")
	}
	
	@Test
	def void testDestructorName() {
		val testInput =
		'''
			theory __synthetic0
				types List = nil | cons(head: "T", cons: "List(T)")
			end
		'''
		testInput.parse.assertNoErrors()
		//testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
		//						    "Constructor and destructor name should be distinct")
		//testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.constructor, null,
		//						    "Constructor and destructor name should be distinct")
		//testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.destructor, null,
		//						    "Constructor and destructor name should be distinct")
	}
	
	@Test
	def void testInfixArgumentsNumber() {
		val testInput = 
		'''
			theory __synthetic0
				operators op infix
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Infix operator must need at least two arguments")
	}
	
	@Test
	def void testInfixArgumentsNumber_2() {
		val testInput = 
		'''
			theory __synthetic0
				operators op(x: "NAT") infix
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Infix operator must need at least two arguments")
	}
	
	@Test
	def void testPostfixArgumentsNumber() {
		val testInput = 
		'''
			theory __synthetic0
				operators op postfix
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Postfix operator must need at least one argument")
	}
	
	@Test
	def void testCaseIsArgument() {
		val testInput = 
		'''
			theory __synthetic0
				operators plus(x: "NAT", y:"NAT") = case z "INT" => "x+y"
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "Case must be an argument")
	}
	
	@Test
	def void testAssociativeArgumentsNumber() {
		val testInput = 
		'''
			theory __synthetic0
				operators plus(x: "NAT") associative
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "An associative operator must have at least 2 arguments")
	}
	
	@Test
	def void testCommutativeArgumentsNumber() {
		val testInput = 
		'''
			theory __synthetic0
				operators plus(x: "NAT") associative
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "An commutative operator must have at least 2 arguments")
	}
	
	@Test
	def void testBaseConstrutor() {
		val testInput = 
		'''
			theory __synthetic0
				types int = cons(zero: "zero")
			end
		'''
		testInput.parse.assertError(TheoryextensionPackage::eINSTANCE.theory, null,
								    "A type needs a base constructor")
	}
}