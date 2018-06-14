/**
 */
package theoryextension.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import theoryextension.Given;
import theoryextension.TheoryextensionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Given</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GivenTest extends TestCase {

	/**
	 * The fixture for this Given test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Given fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GivenTest.class);
	}

	/**
	 * Constructs a new Given test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Given test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Given fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Given test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Given getFixture() {
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
		setFixture(TheoryextensionFactory.eINSTANCE.createGiven());
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

} //GivenTest
