/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>theoryextension</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoryextensionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TheoryextensionTests("theoryextension Tests");
		suite.addTestSuite(TheoryTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(OperatorTest.class);
		suite.addTestSuite(ArgumentTest.class);
		suite.addTestSuite(TypeTest.class);
		suite.addTestSuite(ConstructorTest.class);
		suite.addTestSuite(DestructorTest.class);
		suite.addTestSuite(AxiomTest.class);
		suite.addTestSuite(TheoremTest.class);
		suite.addTestSuite(RuleTest.class);
		suite.addTestSuite(RewriteRuleTest.class);
		suite.addTestSuite(ConditionalRewriteRuleTest.class);
		suite.addTestSuite(VariableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoryextensionTests(String name) {
		super(name);
	}

} //TheoryextensionTests
