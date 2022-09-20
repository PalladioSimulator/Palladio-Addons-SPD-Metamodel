/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.spd.triggers.RAMUtilizationTrigger;
import org.palladiosimulator.spd.triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RAM Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RAMUtilizationTriggerTest extends ProcessingResourceUtilizationBasedTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RAMUtilizationTriggerTest.class);
	}

	/**
	 * Constructs a new RAM Utilization Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMUtilizationTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RAM Utilization Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RAMUtilizationTrigger getFixture() {
		return (RAMUtilizationTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createRAMUtilizationTrigger());
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

} //RAMUtilizationTriggerTest