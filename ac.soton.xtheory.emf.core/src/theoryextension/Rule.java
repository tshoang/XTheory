/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Rule#getRrule <em>Rrule</em>}</li>
 *   <li>{@link theoryextension.Rule#getIrule <em>Irule</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rrule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rrule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrule</em>' containment reference.
	 * @see #setRrule(RewriteRule)
	 * @see theoryextension.TheoryextensionPackage#getRule_Rrule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	RewriteRule getRrule();

	/**
	 * Sets the value of the '{@link theoryextension.Rule#getRrule <em>Rrule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rrule</em>' containment reference.
	 * @see #getRrule()
	 * @generated
	 */
	void setRrule(RewriteRule value);

	/**
	 * Returns the value of the '<em><b>Irule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irule</em>' containment reference.
	 * @see #setIrule(InferenceRule)
	 * @see theoryextension.TheoryextensionPackage#getRule_Irule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	InferenceRule getIrule();

	/**
	 * Sets the value of the '{@link theoryextension.Rule#getIrule <em>Irule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irule</em>' containment reference.
	 * @see #getIrule()
	 * @generated
	 */
	void setIrule(InferenceRule value);

} // Rule
