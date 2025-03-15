/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.tests;

import org.palladiosimulator.spd.constraints.target.TargetFactory;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetGroupSizeConstraintTest extends TargetConstraintTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(TargetGroupSizeConstraintTest.class);
    }

    /**
     * Constructs a new Group Size Constraint test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetGroupSizeConstraintTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Group Size Constraint test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    protected TargetGroupSizeConstraint getFixture() {
        return (TargetGroupSizeConstraint) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TargetFactory.eINSTANCE.createTargetGroupSizeConstraint());
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

} // TargetGroupSizeConstraintTest
