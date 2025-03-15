/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Memory Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MemoryUtilizationTest extends ResourceUtilizationStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(MemoryUtilizationTest.class);
    }

    /**
     * Constructs a new Memory Utilization test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public MemoryUtilizationTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Memory Utilization test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected MemoryUtilization getFixture() {
        return (MemoryUtilization) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createMemoryUtilization());
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

} // MemoryUtilizationTest
