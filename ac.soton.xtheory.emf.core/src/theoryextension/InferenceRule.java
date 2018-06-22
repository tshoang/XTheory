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
 * A representation of the model object '<em><b>Inference Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.InferenceRule#getGiven <em>Given</em>}</li>
 *   <li>{@link theoryextension.InferenceRule#getInfer <em>Infer</em>}</li>
 *   <li>{@link theoryextension.InferenceRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.InferenceRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getInferenceRule()
 * @model
 * @generated
 */
public interface InferenceRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Given}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getInferenceRule_Given()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Given> getGiven();

	/**
	 * Returns the value of the '<em><b>Infer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infer</em>' containment reference.
	 * @see #setInfer(Infer)
	 * @see theoryextension.TheoryextensionPackage#getInferenceRule_Infer()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Infer getInfer();

	/**
	 * Sets the value of the '{@link theoryextension.InferenceRule#getInfer <em>Infer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infer</em>' containment reference.
	 * @see #getInfer()
	 * @generated
	 */
	void setInfer(Infer value);

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
	 * @see theoryextension.TheoryextensionPackage#getInferenceRule_ApplicabilityIsInteractive()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsInteractive();

	/**
	 * Sets the value of the '{@link theoryextension.InferenceRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}' attribute.
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
	 * @see theoryextension.TheoryextensionPackage#getInferenceRule_ApplicabilityIsAutomatic()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsAutomatic();

	/**
	 * Sets the value of the '{@link theoryextension.InferenceRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Is Automatic</em>' attribute.
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 */
	void setApplicabilityIsAutomatic(boolean value);

} // InferenceRule
