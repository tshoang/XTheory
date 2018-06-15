/**
 */
package theoryextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import theoryextension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoryextensionFactoryImpl extends EFactoryImpl implements TheoryextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TheoryextensionFactory init() {
		try {
			TheoryextensionFactory theTheoryextensionFactory = (TheoryextensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://soton.ac.uk/models/eventb/theoryextension/2018"); 
			if (theTheoryextensionFactory != null) {
				return theTheoryextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TheoryextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoryextensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TheoryextensionPackage.THEORY: return createTheory();
			case TheoryextensionPackage.PARAMETER: return createParameter();
			case TheoryextensionPackage.OPERATOR: return createOperator();
			case TheoryextensionPackage.CASE: return createCase();
			case TheoryextensionPackage.ARGUMENT: return createArgument();
			case TheoryextensionPackage.TYPE: return createType();
			case TheoryextensionPackage.CONSTRUCTOR: return createConstructor();
			case TheoryextensionPackage.DESTRUCTOR: return createDestructor();
			case TheoryextensionPackage.AXIOM: return createAxiom();
			case TheoryextensionPackage.THEOREM: return createTheorem();
			case TheoryextensionPackage.RULE: return createRule();
			case TheoryextensionPackage.REWRITE_RULE: return createRewriteRule();
			case TheoryextensionPackage.REWRITE: return createRewrite();
			case TheoryextensionPackage.UNCONDITIONAL_REWRITE: return createUnconditionalRewrite();
			case TheoryextensionPackage.CONDITIONAL_REWRITE: return createConditionalRewrite();
			case TheoryextensionPackage.CONDITIONAL_REWRITE_RULE: return createConditionalRewriteRule();
			case TheoryextensionPackage.INFERENCE_RULE: return createInferenceRule();
			case TheoryextensionPackage.GIVEN: return createGiven();
			case TheoryextensionPackage.INFER: return createInfer();
			case TheoryextensionPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TheoryextensionPackage.NOTATION:
				return createNotationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TheoryextensionPackage.NOTATION:
				return convertNotationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theory createTheory() {
		TheoryImpl theory = new TheoryImpl();
		return theory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destructor createDestructor() {
		DestructorImpl destructor = new DestructorImpl();
		return destructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axiom createAxiom() {
		AxiomImpl axiom = new AxiomImpl();
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theorem createTheorem() {
		TheoremImpl theorem = new TheoremImpl();
		return theorem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteRule createRewriteRule() {
		RewriteRuleImpl rewriteRule = new RewriteRuleImpl();
		return rewriteRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rewrite createRewrite() {
		RewriteImpl rewrite = new RewriteImpl();
		return rewrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalRewrite createUnconditionalRewrite() {
		UnconditionalRewriteImpl unconditionalRewrite = new UnconditionalRewriteImpl();
		return unconditionalRewrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRewrite createConditionalRewrite() {
		ConditionalRewriteImpl conditionalRewrite = new ConditionalRewriteImpl();
		return conditionalRewrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRewriteRule createConditionalRewriteRule() {
		ConditionalRewriteRuleImpl conditionalRewriteRule = new ConditionalRewriteRuleImpl();
		return conditionalRewriteRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceRule createInferenceRule() {
		InferenceRuleImpl inferenceRule = new InferenceRuleImpl();
		return inferenceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given createGiven() {
		GivenImpl given = new GivenImpl();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infer createInfer() {
		InferImpl infer = new InferImpl();
		return infer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notation createNotationFromString(EDataType eDataType, String initialValue) {
		Notation result = Notation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoryextensionPackage getTheoryextensionPackage() {
		return (TheoryextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TheoryextensionPackage getPackage() {
		return TheoryextensionPackage.eINSTANCE;
	}

} //TheoryextensionFactoryImpl
