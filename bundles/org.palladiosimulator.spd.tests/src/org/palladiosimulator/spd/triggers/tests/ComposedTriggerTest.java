/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.tests;

import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.TriggersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Composed Trigger</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ComposedTriggerTest extends ScalingTriggerTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ComposedTriggerTest.class);
    }

    /**
     * Constructs a new Composed Trigger test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ComposedTriggerTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Composed Trigger test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ComposedTrigger getFixture() {
        return (ComposedTrigger) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TriggersFactory.eINSTANCE.createComposedTrigger());
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

} // ComposedTriggerTest
