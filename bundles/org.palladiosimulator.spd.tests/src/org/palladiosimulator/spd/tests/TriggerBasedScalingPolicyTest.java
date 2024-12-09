/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import org.palladiosimulator.spd.SpdFactory;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Trigger Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class TriggerBasedScalingPolicyTest extends ScalingPolicyTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(TriggerBasedScalingPolicyTest.class);
    }

    /**
     * Constructs a new Trigger Based Scaling Policy test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TriggerBasedScalingPolicyTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Trigger Based Scaling Policy test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected TriggerBasedScalingPolicy getFixture() {
        return (TriggerBasedScalingPolicy) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(SpdFactory.eINSTANCE.createTriggerBasedScalingPolicy());
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

} // TriggerBasedScalingPolicyTest
