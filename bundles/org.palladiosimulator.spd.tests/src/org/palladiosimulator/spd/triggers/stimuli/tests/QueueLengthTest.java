/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.QueueLength;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Queue Length</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class QueueLengthTest extends SourceInterfaceStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(QueueLengthTest.class);
    }

    /**
     * Constructs a new Queue Length test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public QueueLengthTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Queue Length test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected QueueLength getFixture() {
        return (QueueLength) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createQueueLength());
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

} // QueueLengthTest
