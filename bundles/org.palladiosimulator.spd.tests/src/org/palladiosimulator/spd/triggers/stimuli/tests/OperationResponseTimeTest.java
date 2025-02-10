/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Operation Response
 * Time</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class OperationResponseTimeTest extends SourceInterfaceStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(OperationResponseTimeTest.class);
    }

    /**
     * Constructs a new Operation Response Time test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    public OperationResponseTimeTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Operation Response Time test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected OperationResponseTime getFixture() {
        return (OperationResponseTime) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createOperationResponseTime());
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

} // OperationResponseTimeTest
