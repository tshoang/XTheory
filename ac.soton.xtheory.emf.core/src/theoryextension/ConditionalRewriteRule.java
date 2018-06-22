/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eventb.emf.core.EventBObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Rewrite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.ConditionalRewriteRule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link theoryextension.ConditionalRewriteRule#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getConditionalRewriteRule()
 * @model
 * @generated
 */
public interface ConditionalRewriteRule extends EventBObject {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' attribute.
	 * @see #setLhs(String)
	 * @see theoryextension.TheoryextensionPackage#getConditionalRewriteRule_Lhs()
	 * @model required="true"
	 * @generated
	 */
	String getLhs();

	/**
	 * Sets the value of the '{@link theoryextension.ConditionalRewriteRule#getLhs <em>Lhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' attribute.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(String value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' attribute.
	 * @see #setRhs(String)
	 * @see theoryextension.TheoryextensionPackage#getConditionalRewriteRule_Rhs()
	 * @model required="true"
	 * @generated
	 */
	String getRhs();

	/**
	 * Sets the value of the '{@link theoryextension.ConditionalRewriteRule#getRhs <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' attribute.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(String value);

} // ConditionalRewriteRule
