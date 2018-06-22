/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Constructor#getDestructors <em>Destructors</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends EventBNamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Destructors</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Destructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destructors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructors</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getConstructor_Destructors()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Destructor> getDestructors();

} // Constructor
