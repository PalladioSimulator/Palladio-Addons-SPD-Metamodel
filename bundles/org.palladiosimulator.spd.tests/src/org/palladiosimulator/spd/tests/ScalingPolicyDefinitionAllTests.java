/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import org.palladiosimulator.spd.targets.tests.TargetsTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>ScalingPolicyDefinition</b></em>' model.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScalingPolicyDefinitionAllTests extends TestSuite {

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
        final TestSuite suite = new ScalingPolicyDefinitionAllTests("ScalingPolicyDefinition Tests");
        suite.addTest(SpdTests.suite());
        suite.addTest(TargetsTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ScalingPolicyDefinitionAllTests(final String name) {
        super(name);
    }

} // ScalingPolicyDefinitionAllTests
