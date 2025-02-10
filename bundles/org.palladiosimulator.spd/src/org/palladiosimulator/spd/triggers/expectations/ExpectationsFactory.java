/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage
 * @generated
 */
public interface ExpectationsFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ExpectationsFactory eINSTANCE = org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>No Expectation</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>No Expectation</em>'.
     * @generated
     */
    NoExpectation createNoExpectation();

    /**
     * Returns a new object of class '<em>Expected Percentage</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Expected Percentage</em>'.
     * @generated
     */
    ExpectedPercentage createExpectedPercentage();

    /**
     * Returns a new object of class '<em>Expected Count</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Expected Count</em>'.
     * @generated
     */
    ExpectedCount createExpectedCount();

    /**
     * Returns a new object of class '<em>Expected Time</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Expected Time</em>'.
     * @generated
     */
    ExpectedTime createExpectedTime();

    /**
     * Returns a new object of class '<em>Expected Trend</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Expected Trend</em>'.
     * @generated
     */
    ExpectedTrend createExpectedTrend();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    ExpectationsPackage getExpectationsPackage();

} // ExpectationsFactory
