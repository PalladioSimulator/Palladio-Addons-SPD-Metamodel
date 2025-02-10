/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.tests;

import org.palladiosimulator.spd.triggers.SimpleFireOnTrend;
import org.palladiosimulator.spd.triggers.TriggersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Simple Fire On Trend</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimpleFireOnTrendTest extends BaseTriggerTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(SimpleFireOnTrendTest.class);
    }

    /**
     * Constructs a new Simple Fire On Trend test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public SimpleFireOnTrendTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Simple Fire On Trend test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected SimpleFireOnTrend getFixture() {
        return (SimpleFireOnTrend) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TriggersFactory.eINSTANCE.createSimpleFireOnTrend());
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

} // SimpleFireOnTrendTest
