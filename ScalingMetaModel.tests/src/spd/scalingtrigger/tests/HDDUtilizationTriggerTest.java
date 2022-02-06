/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.HDDUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDD Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDDUtilizationTriggerTest extends ProcessingResourceUtilizationBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDDUtilizationTriggerTest.class);
	}

	/**
	 * Constructs a new HDD Utilization Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDUtilizationTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HDD Utilization Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HDDUtilizationTrigger getFixture() {
		return (HDDUtilizationTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createHDDUtilizationTrigger());
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

} //HDDUtilizationTriggerTest
