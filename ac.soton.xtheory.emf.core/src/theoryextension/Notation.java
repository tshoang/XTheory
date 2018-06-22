/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see theoryextension.TheoryextensionPackage#getNotation()
 * @model
 * @generated
 */
public enum Notation implements Enumerator {
	/**
	 * The '<em><b>PREFIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFIX_VALUE
	 * @generated
	 * @ordered
	 */
	PREFIX(0, "PREFIX", "PREFIX"),

	/**
	 * The '<em><b>INFIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIX_VALUE
	 * @generated
	 * @ordered
	 */
	INFIX(1, "INFIX", "INFIX"),

	/**
	 * The '<em><b>POSTFIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTFIX_VALUE
	 * @generated
	 * @ordered
	 */
	POSTFIX(2, "POSTFIX", "POSTFIX");

	/**
	 * The '<em><b>PREFIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREFIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREFIX_VALUE = 0;

	/**
	 * The '<em><b>INFIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFIX_VALUE = 1;

	/**
	 * The '<em><b>POSTFIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSTFIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTFIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSTFIX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Notation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Notation[] VALUES_ARRAY =
		new Notation[] {
			PREFIX,
			INFIX,
			POSTFIX,
		};

	/**
	 * A public read-only list of all the '<em><b>Notation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Notation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Notation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Notation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Notation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Notation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Notation get(int value) {
		switch (value) {
			case PREFIX_VALUE: return PREFIX;
			case INFIX_VALUE: return INFIX;
			case POSTFIX_VALUE: return POSTFIX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Notation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Notation
