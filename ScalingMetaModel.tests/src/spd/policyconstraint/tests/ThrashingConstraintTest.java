/**
 */
package spd.policyconstraint.tests;

import junit.textui.TestRunner;

import spd.policyconstraint.PolicyconstraintFactory;
import spd.policyconstraint.ThrashingConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thrashing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrashingConstraintTest extends TemporalConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThrashingConstraintTest.class);
	}

	/**
	 * Constructs a new Thrashing Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrashingConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Thrashing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThrashingConstraint getFixture() {
		return (ThrashingConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyconstraintFactory.eINSTANCE.createThrashingConstraint());
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

} //ThrashingConstraintTest
