/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Improved QLearning
 * Model</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class ImprovedQLearningModelTest extends LearningBasedModelTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImprovedQLearningModelTest.class);
	}

	/**
	 * Constructs a new Improved QLearning Model test case with the given name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovedQLearningModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Improved QLearning Model test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImprovedQLearningModel getFixture() {
		return (ImprovedQLearningModel) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelsFactory.eINSTANCE.createImprovedQLearningModel());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // ImprovedQLearningModelTest
