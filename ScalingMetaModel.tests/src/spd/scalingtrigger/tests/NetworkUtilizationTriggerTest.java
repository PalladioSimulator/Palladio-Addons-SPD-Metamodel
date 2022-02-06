/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.NetworkUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkUtilizationTriggerTest extends ResourceUtilizationBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkUtilizationTriggerTest.class);
	}

	/**
	 * Constructs a new Network Utilization Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkUtilizationTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Utilization Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkUtilizationTrigger getFixture() {
		return (NetworkUtilizationTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createNetworkUtilizationTrigger());
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

} //NetworkUtilizationTriggerTest
