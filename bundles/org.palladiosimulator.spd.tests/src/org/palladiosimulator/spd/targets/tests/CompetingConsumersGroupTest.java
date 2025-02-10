/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.tests;

import org.palladiosimulator.spd.targets.CompetingConsumersGroup;
import org.palladiosimulator.spd.targets.TargetsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Competing Consumers
 * Group</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CompetingConsumersGroupTest extends TargetGroupTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(CompetingConsumersGroupTest.class);
    }

    /**
     * Constructs a new Competing Consumers Group test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CompetingConsumersGroupTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Competing Consumers Group test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected CompetingConsumersGroup getFixture() {
        return (CompetingConsumersGroup) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TargetsFactory.eINSTANCE.createCompetingConsumersGroup());
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

} // CompetingConsumersGroupTest
