/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>spd</b></em>' package. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdTests extends TestSuite {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static Test suite() {
        final TestSuite suite = new SpdTests("spd Tests");
        suite.addTestSuite(TriggerBasedScalingPolicyTest.class);
        suite.addTestSuite(SPDTest.class);
        suite.addTestSuite(ModelBasedScalingPolicyTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdTests(final String name) {
        super(name);
    }

} // SpdTests
