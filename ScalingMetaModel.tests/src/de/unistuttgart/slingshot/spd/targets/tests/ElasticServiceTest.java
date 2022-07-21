/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.targets.tests;

import de.unistuttgart.slingshot.spd.targets.ElasticService;
import de.unistuttgart.slingshot.spd.targets.TargetsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elastic Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticServiceTest extends TargetGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElasticServiceTest.class);
	}

	/**
	 * Constructs a new Elastic Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elastic Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElasticService getFixture() {
		return (ElasticService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TargetsFactory.eINSTANCE.createElasticService());
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

} //ElasticServiceTest
