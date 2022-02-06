/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.CPUUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CPU Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPUUtilizationTriggerTest extends ProcessingResourceUtilizationBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CPUUtilizationTriggerTest.class);
	}

	/**
	 * Constructs a new CPU Utilization Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUUtilizationTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CPU Utilization Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CPUUtilizationTrigger getFixture() {
		return (CPUUtilizationTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createCPUUtilizationTrigger());
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

} //CPUUtilizationTriggerTest
