/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>CPU Utilization</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class CPUUtilizationTest extends ResourceUtilizationStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(CPUUtilizationTest.class);
    }

    /**
     * Constructs a new CPU Utilization test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public CPUUtilizationTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this CPU Utilization test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected CPUUtilization getFixture() {
        return (CPUUtilization) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createCPUUtilization());
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

} // CPUUtilizationTest
