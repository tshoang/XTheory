/**
 */
package theoryextension;

import org.eventb.emf.core.EventBExpression;
import org.eventb.emf.core.EventBNamedCommentedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Rewrite#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRewrite()
 * @model
 * @generated
 */
public interface Rewrite extends EventBNamedCommentedElement, EventBExpression {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see theoryextension.TheoryextensionPackage#getRewrite_Formula()
	 * @model
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link theoryextension.Rewrite#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

} // Rewrite
