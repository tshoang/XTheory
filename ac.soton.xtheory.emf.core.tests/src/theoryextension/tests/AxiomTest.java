/**
 */
package theoryextension.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import theoryextension.Axiom;
import theoryextension.TheoryextensionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxiomTest extends TestCase {

	/**
	 * The fixture for this Axiom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Axiom fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxiomTest.class);
	}

	/**
	 * Constructs a new Axiom test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxiomTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Axiom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Axiom fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Axiom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Axiom getFixture() {
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
		setFixture(TheoryextensionFactory.eINSTANCE.createAxiom());
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

} //AxiomTest
