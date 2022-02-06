/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.PointInTimeTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Point In Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointInTimeTriggerTest extends ScalingTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PointInTimeTriggerTest.class);
	}

	/**
	 * Constructs a new Point In Time Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointInTimeTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Point In Time Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PointInTimeTrigger getFixture() {
		return (PointInTimeTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createPointInTimeTrigger());
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

} //PointInTimeTriggerTest
