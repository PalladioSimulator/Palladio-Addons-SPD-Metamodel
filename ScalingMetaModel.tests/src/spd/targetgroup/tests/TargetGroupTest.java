/**
 */
package spd.targetgroup.tests;

import junit.textui.TestRunner;

import spd.targetgroup.TargetGroup;
import spd.targetgroup.TargetgroupFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetGroupTest extends spd.tests.TargetGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetGroupTest.class);
	}

	/**
	 * Constructs a new Target Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetGroup getFixture() {
		return (TargetGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TargetgroupFactory.eINSTANCE.createTargetGroup());
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

} //TargetGroupTest
