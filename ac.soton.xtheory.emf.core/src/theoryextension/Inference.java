/**
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link theoryextension.Inference#getGiven <em>Given</em>}</li>
 *   <li>{@link theoryextension.Inference#getInfer <em>Infer</em>}</li>
 *   <li>{@link theoryextension.Inference#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.Inference#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 * </ul>
 *
 * @see theoryextension.TheoryextensionPackage#getInference()
 * @model
 * @generated
 */
public interface Inference extends EObject {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' reference list.
	 * The list contents are of type {@link theoryextension.Given}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' reference list.
	 * @see theoryextension.TheoryextensionPackage#getInference_Given()
	 * @model
	 * @generated
	 */
	EList<Given> getGiven();

	/**
	 * Returns the value of the '<em><b>Infer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infer</em>' reference.
	 * @see #setInfer(Infer)
	 * @see theoryextension.TheoryextensionPackage#getInference_Infer()
	 * @model required="true"
	 * @generated
	 */
	Infer getInfer();

	/**
	 * Sets the value of the '{@link theoryextension.Inference#getInfer <em>Infer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infer</em>' reference.
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
	 * @see theoryextension.TheoryextensionPackage#getInference_ApplicabilityIsInteractive()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsInteractive();

	/**
	 * Sets the value of the '{@link theoryextension.Inference#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}' attribute.
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
	 * @see theoryextension.TheoryextensionPackage#getInference_ApplicabilityIsAutomatic()
	 * @model
	 * @generated
	 */
	boolean isApplicabilityIsAutomatic();

	/**
	 * Sets the value of the '{@link theoryextension.Inference#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Is Automatic</em>' attribute.
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 */
	void setApplicabilityIsAutomatic(boolean value);

} // Inference
