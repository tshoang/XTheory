/**
 */
package theoryextension;

import org.eventb.emf.core.EventBNamedCommentedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Axiom#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getAxiom()
 * @model
 * @generated
 */
public interface Axiom extends EventBNamedCommentedElement {

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see theoryextension.TheoryextensionPackage#getAxiom_Predicate()
	 * @model required="true"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link theoryextension.Axiom#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);
} // Axiom
