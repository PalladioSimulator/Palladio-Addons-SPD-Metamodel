/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.RandomModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Random Model</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class RandomModelTest extends BaseModelTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(RandomModelTest.class);
    }

    /**
     * Constructs a new Random Model test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public RandomModelTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Random Model test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected RandomModel getFixture() {
        return (RandomModel) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createRandomModel());
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

} // RandomModelTest
