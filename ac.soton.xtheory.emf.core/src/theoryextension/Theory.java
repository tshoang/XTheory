/**
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.EventBNamed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Theory#getImports <em>Imports</em>}</li>
 *   <li>{@link theoryextension.Theory#getParameters <em>Parameters</em>}</li>
 *   <li>{@link theoryextension.Theory#getOperators <em>Operators</em>}</li>
 *   <li>{@link theoryextension.Theory#getTypes <em>Types</em>}</li>
 *   <li>{@link theoryextension.Theory#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link theoryextension.Theory#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link theoryextension.Theory#getRules <em>Rules</em>}</li>
 *   <li>{@link theoryextension.Theory#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getTheory()
 * @model
 * @generated
 */
public interface Theory extends EventBNamed {

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Parameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Operators()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Types()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Axiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axioms</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Axioms()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Axiom> getAxioms();

	/**
	 * Returns the value of the '<em><b>Theorems</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Theorem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theorems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theorems</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Theorems()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Theorem> getTheorems();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Rules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Variables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Variable> getVariables();
} // Theory
