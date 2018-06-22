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
 * A representation of the model object '<em><b>Conditional Rewrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.ConditionalRewrite#getRewrites <em>Rewrites</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getConditionalRewrite()
 * @model
 * @generated
 */
public interface ConditionalRewrite extends EObject {
	/**
	 * Returns the value of the '<em><b>Rewrites</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.ConditionalRewriteRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrites</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getConditionalRewrite_Rewrites()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ConditionalRewriteRule> getRewrites();

} // ConditionalRewrite
