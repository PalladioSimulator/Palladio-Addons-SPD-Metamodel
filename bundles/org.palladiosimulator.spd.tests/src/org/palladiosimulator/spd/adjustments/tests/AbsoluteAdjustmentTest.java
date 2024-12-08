/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.tests;

import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Absolute Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AbsoluteAdjustmentTest extends AdjustmentTypeTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(AbsoluteAdjustmentTest.class);
    }

    /**
     * Constructs a new Absolute Adjustment test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public AbsoluteAdjustmentTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Absolute Adjustment test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected AbsoluteAdjustment getFixture() {
        return (AbsoluteAdjustment) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(AdjustmentsFactory.eINSTANCE.createAbsoluteAdjustment());
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

} // AbsoluteAdjustmentTest
