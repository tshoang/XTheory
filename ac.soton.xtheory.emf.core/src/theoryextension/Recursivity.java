/**
 */
package theoryextension;

import org.eventb.emf.core.EventBCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Recursivity#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRecursivity()
 * @model
 * @generated
 */
public interface Recursivity extends EventBCommentedElement {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(String)
	 * @see theoryextension.TheoryextensionPackage#getRecursivity_Case()
	 * @model
	 * @generated
	 */
	String getCase();

	/**
	 * Sets the value of the '{@link theoryextension.Recursivity#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(String value);

} // Recursivity
