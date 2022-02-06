/**
 */
package spd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spd.SPD;
import spd.SpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPDTest extends TestCase {

	/**
	 * The fixture for this SPD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPD fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SPDTest.class);
	}

	/**
	 * Constructs a new SPD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this SPD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SPD fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SPD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPD getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createSPD());
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

} //SPDTest
