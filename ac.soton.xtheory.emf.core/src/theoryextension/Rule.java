/**
 */
package theoryextension;

import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.EventBObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Rule#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EventBNamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(EventBObject)
	 * @see theoryextension.TheoryextensionPackage#getRule_Rule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EventBObject getRule();

	/**
	 * Sets the value of the '{@link theoryextension.Rule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(EventBObject value);

} // Rule
