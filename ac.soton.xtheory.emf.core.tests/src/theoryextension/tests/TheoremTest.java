/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import theoryextension.Theorem;
import theoryextension.TheoryextensionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoremTest extends TestCase {

	/**
	 * The fixture for this Theorem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Theorem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TheoremTest.class);
	}

	/**
	 * Constructs a new Theorem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Theorem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Theorem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Theorem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Theorem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TheoryextensionFactory.eINSTANCE.createTheorem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TheoremTest
