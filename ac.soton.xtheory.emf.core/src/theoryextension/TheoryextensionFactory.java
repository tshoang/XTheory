/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see theoryextension.TheoryextensionPackage
 * @generated
 */
public interface TheoryextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheoryextensionFactory eINSTANCE = theoryextension.impl.TheoryextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Theory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theory</em>'.
	 * @generated
	 */
	Theory createTheory();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator</em>'.
	 * @generated
	 */
	Operator createOperator();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Destructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destructor</em>'.
	 * @generated
	 */
	Destructor createDestructor();

	/**
	 * Returns a new object of class '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axiom</em>'.
	 * @generated
	 */
	Axiom createAxiom();

	/**
	 * Returns a new object of class '<em>Theorem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theorem</em>'.
	 * @generated
	 */
	Theorem createTheorem();

	/**
	 * Returns a new object of class '<em>Rule Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Block</em>'.
	 * @generated
	 */
	RuleBlock createRuleBlock();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Rewrite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rewrite Rule</em>'.
	 * @generated
	 */
	RewriteRule createRewriteRule();

	/**
	 * Returns a new object of class '<em>Unconditional Rewrite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unconditional Rewrite</em>'.
	 * @generated
	 */
	UnconditionalRewrite createUnconditionalRewrite();

	/**
	 * Returns a new object of class '<em>Conditional Rewrite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Rewrite</em>'.
	 * @generated
	 */
	ConditionalRewrite createConditionalRewrite();

	/**
	 * Returns a new object of class '<em>Conditional Rewrite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Rewrite Rule</em>'.
	 * @generated
	 */
	ConditionalRewriteRule createConditionalRewriteRule();

	/**
	 * Returns a new object of class '<em>Inference Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inference Rule</em>'.
	 * @generated
	 */
	InferenceRule createInferenceRule();

	/**
	 * Returns a new object of class '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given</em>'.
	 * @generated
	 */
	Given createGiven();

	/**
	 * Returns a new object of class '<em>Infer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infer</em>'.
	 * @generated
	 */
	Infer createInfer();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TheoryextensionPackage getTheoryextensionPackage();

} //TheoryextensionFactory
