/**
 */
package spd.policyconstraint.tests;

import junit.textui.TestRunner;

import spd.policyconstraint.IntervallConstraint;
import spd.policyconstraint.PolicyconstraintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intervall Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervallConstraintTest extends TemporalConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntervallConstraintTest.class);
	}

	/**
	 * Constructs a new Intervall Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervallConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intervall Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntervallConstraint getFixture() {
		return (IntervallConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyconstraintFactory.eINSTANCE.createIntervallConstraint());
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

} //IntervallConstraintTest
