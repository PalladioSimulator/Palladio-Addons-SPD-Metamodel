/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.IdleTimeTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Idle Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdleTimeTriggerTest extends TimeBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IdleTimeTriggerTest.class);
	}

	/**
	 * Constructs a new Idle Time Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdleTimeTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Idle Time Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IdleTimeTrigger getFixture() {
		return (IdleTimeTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createIdleTimeTrigger());
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

} //IdleTimeTriggerTest
