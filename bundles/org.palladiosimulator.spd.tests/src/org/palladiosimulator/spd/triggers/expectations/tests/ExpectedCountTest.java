/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.tests;

import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Expected Count</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ExpectedCountTest extends ExpectedPrimitiveTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ExpectedCountTest.class);
    }

    /**
     * Constructs a new Expected Count test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ExpectedCountTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Expected Count test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ExpectedCount getFixture() {
        return (ExpectedCount) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ExpectationsFactory.eINSTANCE.createExpectedCount());
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

} // ExpectedCountTest
