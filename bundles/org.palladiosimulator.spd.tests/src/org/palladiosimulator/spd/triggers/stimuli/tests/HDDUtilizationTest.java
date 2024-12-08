/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>HDD Utilization</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class HDDUtilizationTest extends ResourceUtilizationStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(HDDUtilizationTest.class);
    }

    /**
     * Constructs a new HDD Utilization test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public HDDUtilizationTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this HDD Utilization test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected HDDUtilization getFixture() {
        return (HDDUtilization) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createHDDUtilization());
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

} // HDDUtilizationTest
