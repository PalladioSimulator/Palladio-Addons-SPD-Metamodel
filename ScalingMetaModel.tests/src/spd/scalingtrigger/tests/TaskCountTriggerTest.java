/**
 */
package spd.scalingtrigger.tests;

import junit.textui.TestRunner;

import spd.scalingtrigger.ScalingtriggerFactory;
import spd.scalingtrigger.TaskCountTrigger;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Count Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskCountTriggerTest extends ThresholdBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskCountTriggerTest.class);
	}

	/**
	 * Constructs a new Task Count Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCountTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Count Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskCountTrigger getFixture() {
		return (TaskCountTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalingtriggerFactory.eINSTANCE.createTaskCountTrigger());
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

} //TaskCountTriggerTest
