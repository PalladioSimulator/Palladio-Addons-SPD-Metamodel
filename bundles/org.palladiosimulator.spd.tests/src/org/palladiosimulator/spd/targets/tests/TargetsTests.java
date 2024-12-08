/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>targets</b></em>' package. <!-- end-user-doc
 * -->
 *
 * @generated
 */
public class TargetsTests extends TestSuite {

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
        final TestSuite suite = new TargetsTests("targets Tests");
        suite.addTestSuite(ElasticInfrastructureTest.class);
        suite.addTestSuite(ServiceGroupTest.class);
        suite.addTestSuite(CompetingConsumersGroupTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetsTests(final String name) {
        super(name);
    }

} // TargetsTests
