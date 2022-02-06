/**
 */
package spd.palladio.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spd.palladio.PCMResourceContainer;
import spd.palladio.PalladioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMResourceContainerTest extends TestCase {

	/**
	 * The fixture for this PCM Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMResourceContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMResourceContainerTest.class);
	}

	/**
	 * Constructs a new PCM Resource Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMResourceContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PCM Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PCMResourceContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PCM Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMResourceContainer getFixture() {
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
		setFixture(PalladioFactory.eINSTANCE.createPCMResourceContainer());
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

} //PCMResourceContainerTest
