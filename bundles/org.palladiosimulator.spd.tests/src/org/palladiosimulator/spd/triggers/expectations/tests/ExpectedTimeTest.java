/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.tests;

import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Expected Time</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ExpectedTimeTest extends ExpectedPrimitiveTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ExpectedTimeTest.class);
    }

    /**
     * Constructs a new Expected Time test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ExpectedTimeTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Expected Time test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ExpectedTime getFixture() {
        return (ExpectedTime) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ExpectationsFactory.eINSTANCE.createExpectedTime());
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

} // ExpectedTimeTest
