/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import theoryextension.Theory;
import theoryextension.TheoryextensionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoryTest extends TestCase {

	/**
	 * The fixture for this Theory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Theory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TheoryTest.class);
	}

	/**
	 * Constructs a new Theory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Theory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Theory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Theory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Theory getFixture() {
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
		setFixture(TheoryextensionFactory.eINSTANCE.createTheory());
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

} //TheoryTest
