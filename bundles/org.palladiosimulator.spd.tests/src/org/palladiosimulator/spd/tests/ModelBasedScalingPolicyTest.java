/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.SpdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Model Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelBasedScalingPolicyTest extends ScalingPolicyTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ModelBasedScalingPolicyTest.class);
    }

    /**
     * Constructs a new Model Based Scaling Policy test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelBasedScalingPolicyTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Model Based Scaling Policy test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected ModelBasedScalingPolicy getFixture() {
        return (ModelBasedScalingPolicy) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(SpdFactory.eINSTANCE.createModelBasedScalingPolicy());
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

} // ModelBasedScalingPolicyTest
