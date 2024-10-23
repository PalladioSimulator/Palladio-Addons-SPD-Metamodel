/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.QThresholdsModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>QThresholds Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QThresholdsModelTest extends LearningBasedModelTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QThresholdsModelTest.class);
	}

	/**
	 * Constructs a new QThresholds Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QThresholdsModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this QThresholds Model test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected QThresholdsModel getFixture() {
		return (QThresholdsModel) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelsFactory.eINSTANCE.createQThresholdsModel());
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

} // QThresholdsModelTest
