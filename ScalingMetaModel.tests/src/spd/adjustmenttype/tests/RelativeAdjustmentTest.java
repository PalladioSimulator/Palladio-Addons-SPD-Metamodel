/**
 */
package spd.adjustmenttype.tests;

import junit.textui.TestRunner;

import spd.adjustmenttype.AdjustmenttypeFactory;
import spd.adjustmenttype.RelativeAdjustment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelativeAdjustmentTest extends AdjustmentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelativeAdjustmentTest.class);
	}

	/**
	 * Constructs a new Relative Adjustment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeAdjustmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relative Adjustment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelativeAdjustment getFixture() {
		return (RelativeAdjustment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdjustmenttypeFactory.eINSTANCE.createRelativeAdjustment());
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

} //RelativeAdjustmentTest
