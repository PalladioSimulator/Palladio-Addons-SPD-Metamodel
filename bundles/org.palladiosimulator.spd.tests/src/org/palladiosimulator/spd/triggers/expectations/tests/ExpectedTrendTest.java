/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.tests;

import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Expected Trend</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ExpectedTrendTest extends ExpectedValueTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ExpectedTrendTest.class);
    }

    /**
     * Constructs a new Expected Trend test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ExpectedTrendTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Expected Trend test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ExpectedTrend getFixture() {
        return (ExpectedTrend) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ExpectationsFactory.eINSTANCE.createExpectedTrend());
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

} // ExpectedTrendTest
