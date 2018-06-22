/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import theoryextension.Destructor;
import theoryextension.TheoryextensionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Destructor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DestructorTest extends TestCase {

	/**
	 * The fixture for this Destructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Destructor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DestructorTest.class);
	}

	/**
	 * Constructs a new Destructor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Destructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Destructor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Destructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Destructor getFixture() {
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
		setFixture(TheoryextensionFactory.eINSTANCE.createDestructor());
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

} //DestructorTest
