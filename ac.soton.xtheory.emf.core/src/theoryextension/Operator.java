/**
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamedCommentedActionElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Operator#getType <em>Type</em>}</li>
 *   <li>{@link theoryextension.Operator#getNotation <em>Notation</em>}</li>
 *   <li>{@link theoryextension.Operator#isAssociative <em>Associative</em>}</li>
 *   <li>{@link theoryextension.Operator#isCommutative <em>Commutative</em>}</li>
 *   <li>{@link theoryextension.Operator#getArguments <em>Arguments</em>}</li>
 *   <li>{@link theoryextension.Operator#getPrecedent <em>Precedent</em>}</li>
 *   <li>{@link theoryextension.Operator#getWd <em>Wd</em>}</li>
 *   <li>{@link theoryextension.Operator#getDefinition <em>Definition</em>}</li>
 *   <li>{@link theoryextension.Operator#getCases <em>Cases</em>}</li>
 *   <li>{@link theoryextension.Operator#getRecursivities <em>Recursivities</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EventBNamedCommentedActionElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link theoryextension.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see theoryextension.OperatorType
	 * @see #setType(OperatorType)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Type()
	 * @model
	 * @generated
	 */
	OperatorType getType();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see theoryextension.OperatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * The literals are from the enumeration {@link theoryextension.Notation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see theoryextension.Notation
	 * @see #setNotation(Notation)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Notation()
	 * @model
	 * @generated
	 */
	Notation getNotation();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see theoryextension.Notation
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(Notation value);

	/**
	 * Returns the value of the '<em><b>Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associative</em>' attribute.
	 * @see #setAssociative(boolean)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Associative()
	 * @model
	 * @generated
	 */
	boolean isAssociative();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#isAssociative <em>Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associative</em>' attribute.
	 * @see #isAssociative()
	 * @generated
	 */
	void setAssociative(boolean value);

	/**
	 * Returns the value of the '<em><b>Commutative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutative</em>' attribute.
	 * @see #setCommutative(boolean)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Commutative()
	 * @model
	 * @generated
	 */
	boolean isCommutative();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#isCommutative <em>Commutative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutative</em>' attribute.
	 * @see #isCommutative()
	 * @generated
	 */
	void setCommutative(boolean value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getOperator_Arguments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Precedent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedent</em>' attribute.
	 * @see #setPrecedent(int)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Precedent()
	 * @model
	 * @generated
	 */
	int getPrecedent();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#getPrecedent <em>Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedent</em>' attribute.
	 * @see #getPrecedent()
	 * @generated
	 */
	void setPrecedent(int value);

	/**
	 * Returns the value of the '<em><b>Wd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wd</em>' attribute.
	 * @see #setWd(String)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Wd()
	 * @model
	 * @generated
	 */
	String getWd();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#getWd <em>Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wd</em>' attribute.
	 * @see #getWd()
	 * @generated
	 */
	void setWd(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see theoryextension.TheoryextensionPackage#getOperator_Definition()
	 * @model
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link theoryextension.Operator#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getOperator_Cases()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Case> getCases();

	/**
	 * Returns the value of the '<em><b>Recursivities</b></em>' reference list.
	 * The list contents are of type {@link theoryextension.Recursivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursivities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursivities</em>' reference list.
	 * @see theoryextension.TheoryextensionPackage#getOperator_Recursivities()
	 * @model
	 * @generated
	 */
	EList<Recursivity> getRecursivities();

} // Operator
