/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import org.palladiosimulator.spd.ReactiveScalingPolicy;
import org.palladiosimulator.spd.SpdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Reactive Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ReactiveScalingPolicyTest extends ScalingPolicyTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ReactiveScalingPolicyTest.class);
    }

    /**
     * Constructs a new Reactive Scaling Policy test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ReactiveScalingPolicyTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Reactive Scaling Policy test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ReactiveScalingPolicy getFixture() {
        return (ReactiveScalingPolicy) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(SpdFactory.eINSTANCE.createReactiveScalingPolicy());
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

} // ReactiveScalingPolicyTest
