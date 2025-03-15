/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.tests;

import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.SpdFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>SPD</b></em>'. <!-- end-user-doc
 * -->
 *
 * @generated
 */
public class SPDTest extends TestCase {

    /**
     * The fixture for this SPD test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SPD fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(SPDTest.class);
    }

    /**
     * Constructs a new SPD test case with the given name. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public SPDTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this SPD test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void setFixture(final SPD fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this SPD test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SPD getFixture() {
        return this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(SpdFactory.eINSTANCE.createSPD());
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

} // SPDTest
