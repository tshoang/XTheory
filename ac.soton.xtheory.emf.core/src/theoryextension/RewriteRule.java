/**
 */
package theoryextension;

import org.eventb.emf.core.EventBObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewrite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.RewriteRule#isIsCaseComplete <em>Is Case Complete</em>}</li>
 *   <li>{@link theoryextension.RewriteRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.RewriteRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 *   <li>{@link theoryextension.RewriteRule#getPattern <em>Pattern</em>}</li>
 *   <li>{@link theoryextension.RewriteRule#getUrule <em>Urule</em>}</li>
 *   <li>{@link theoryextension.RewriteRule#getCrule <em>Crule</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRewriteRule()
 * @model
 * @generated
 */
public interface RewriteRule extends EventBObject {
	/**
	 * Returns the value of the '<em><b>Is Case Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Case Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Complete</em>' attribute.
	 * @see #setIsCaseComplete(boolean)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_IsCaseComplete()
	 * @model
	 * @generated
	 */
	boolean isIsCaseComplete();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#isIsCaseComplete <em>Is Case Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Case Complete</em>' attribute.
	 * @see #isIsCaseComplete()
	 * @generated
	 */
	void setIsCaseComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicability Is Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicability Is Interactive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability Is Interactive</em>' attribute.
	 * @see #setApplicabilityIsInteractive(boolean)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_ApplicabilityIsInteractive()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsInteractive();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Is Interactive</em>' attribute.
	 * @see #isApplicabilityIsInteractive()
	 * @generated
	 */
	void setApplicabilityIsInteractive(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicability Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicability Is Automatic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability Is Automatic</em>' attribute.
	 * @see #setApplicabilityIsAutomatic(boolean)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_ApplicabilityIsAutomatic()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsAutomatic();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Is Automatic</em>' attribute.
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 */
	void setApplicabilityIsAutomatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Urule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urule</em>' containment reference.
	 * @see #setUrule(UnconditionalRewrite)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_Urule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UnconditionalRewrite getUrule();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#getUrule <em>Urule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urule</em>' containment reference.
	 * @see #getUrule()
	 * @generated
	 */
	void setUrule(UnconditionalRewrite value);

	/**
	 * Returns the value of the '<em><b>Crule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crule</em>' containment reference.
	 * @see #setCrule(ConditionalRewrite)
	 * @see theoryextension.TheoryextensionPackage#getRewriteRule_Crule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ConditionalRewrite getCrule();

	/**
	 * Sets the value of the '{@link theoryextension.RewriteRule#getCrule <em>Crule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crule</em>' containment reference.
	 * @see #getCrule()
	 * @generated
	 */
	void setCrule(ConditionalRewrite value);

} // RewriteRule
