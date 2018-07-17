/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unconditional Rewrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.UnconditionalRewrite#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getUnconditionalRewrite()
 * @model
 * @generated
 */
public interface UnconditionalRewrite extends EObject {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' attribute list.
	 * @see theoryextension.TheoryextensionPackage#getUnconditionalRewrite_Rhs()
	 * @model
	 * @generated
	 */
	EList<String> getRhs();

} // UnconditionalRewrite
