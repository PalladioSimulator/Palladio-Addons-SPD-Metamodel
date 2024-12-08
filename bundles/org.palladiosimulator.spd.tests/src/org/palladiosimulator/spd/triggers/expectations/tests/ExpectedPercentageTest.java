/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.tests;

import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Expected Percentage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpectedPercentageTest extends ExpectedPrimitiveTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ExpectedPercentageTest.class);
    }

    /**
     * Constructs a new Expected Percentage test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ExpectedPercentageTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Expected Percentage test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ExpectedPercentage getFixture() {
        return (ExpectedPercentage) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ExpectationsFactory.eINSTANCE.createExpectedPercentage());
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

} // ExpectedPercentageTest
