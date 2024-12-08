/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.NumberOfElements;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Number Of Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumberOfElementsTest extends TargetGroupStateStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(NumberOfElementsTest.class);
    }

    /**
     * Constructs a new Number Of Elements test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NumberOfElementsTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Number Of Elements test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected NumberOfElements getFixture() {
        return (NumberOfElements) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createNumberOfElements());
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

} // NumberOfElementsTest
