/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.tests;

import org.palladiosimulator.spd.constraints.policy.IntervallConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyFactory;
import org.palladiosimulator.spd.constraints.tests.TemporalConstraintTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intervall Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervallConstraintTest extends TemporalConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntervallConstraintTest.class);
	}

	/**
	 * Constructs a new Intervall Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervallConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intervall Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntervallConstraint getFixture() {
		return (IntervallConstraint) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyFactory.eINSTANCE.createIntervallConstraint());
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

} //IntervallConstraintTest
