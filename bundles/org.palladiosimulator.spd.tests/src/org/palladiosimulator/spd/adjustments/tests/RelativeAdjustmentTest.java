/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.tests;

import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RelativeAdjustmentTest extends AdjustmentTypeTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(RelativeAdjustmentTest.class);
    }

    /**
     * Constructs a new Relative Adjustment test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public RelativeAdjustmentTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Relative Adjustment test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected RelativeAdjustment getFixture() {
        return (RelativeAdjustment) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(AdjustmentsFactory.eINSTANCE.createRelativeAdjustment());
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

} // RelativeAdjustmentTest
