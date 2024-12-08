/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.FuzzyQLearningModel;
import org.palladiosimulator.spd.models.ModelsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Fuzzy QLearning Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FuzzyQLearningModelTest extends FuzzyLearningModelTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(FuzzyQLearningModelTest.class);
    }

    /**
     * Constructs a new Fuzzy QLearning Model test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FuzzyQLearningModelTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Fuzzy QLearning Model test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected FuzzyQLearningModel getFixture() {
        return (FuzzyQLearningModel) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createFuzzyQLearningModel());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        this.setFixture(null);
    }

} // FuzzyQLearningModelTest
