/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.FuzzySARSAModel;
import org.palladiosimulator.spd.models.ModelsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Fuzzy SARSA Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FuzzySARSAModelTest extends FuzzyLearningModelTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(FuzzySARSAModelTest.class);
    }

    /**
     * Constructs a new Fuzzy SARSA Model test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FuzzySARSAModelTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Fuzzy SARSA Model test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected FuzzySARSAModel getFixture() {
        return (FuzzySARSAModel) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createFuzzySARSAModel());
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

} // FuzzySARSAModelTest
