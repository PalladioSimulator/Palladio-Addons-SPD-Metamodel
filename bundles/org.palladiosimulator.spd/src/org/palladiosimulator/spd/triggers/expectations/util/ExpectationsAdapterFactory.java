/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;
import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;
import org.palladiosimulator.spd.triggers.expectations.NoExpectation;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage
 * @generated
 */
public class ExpectationsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ExpectationsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ExpectationsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpectationsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ExpectationsSwitch<Adapter> modelSwitch = new ExpectationsSwitch<>() {
        @Override
        public Adapter caseExpectedValue(final ExpectedValue object) {
            return ExpectationsAdapterFactory.this.createExpectedValueAdapter();
        }

        @Override
        public Adapter caseExpectedPrimitive(final ExpectedPrimitive object) {
            return ExpectationsAdapterFactory.this.createExpectedPrimitiveAdapter();
        }

        @Override
        public Adapter caseNoExpectation(final NoExpectation object) {
            return ExpectationsAdapterFactory.this.createNoExpectationAdapter();
        }

        @Override
        public Adapter caseExpectedPercentage(final ExpectedPercentage object) {
            return ExpectationsAdapterFactory.this.createExpectedPercentageAdapter();
        }

        @Override
        public Adapter caseExpectedCount(final ExpectedCount object) {
            return ExpectationsAdapterFactory.this.createExpectedCountAdapter();
        }

        @Override
        public Adapter caseExpectedTime(final ExpectedTime object) {
            return ExpectationsAdapterFactory.this.createExpectedTimeAdapter();
        }

        @Override
        public Adapter caseExpectedTrend(final ExpectedTrend object) {
            return ExpectationsAdapterFactory.this.createExpectedTrendAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ExpectationsAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedValue <em>Expected
     * Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedValue
     * @generated
     */
    public Adapter createExpectedValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive <em>Expected
     * Primitive</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive
     * @generated
     */
    public Adapter createExpectedPrimitiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.NoExpectation <em>No
     * Expectation</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.NoExpectation
     * @generated
     */
    public Adapter createNoExpectationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage <em>Expected
     * Percentage</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage
     * @generated
     */
    public Adapter createExpectedPercentageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount <em>Expected
     * Count</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedCount
     * @generated
     */
    public Adapter createExpectedCountAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTime <em>Expected
     * Time</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTime
     * @generated
     */
    public Adapter createExpectedTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTrend <em>Expected
     * Trend</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTrend
     * @generated
     */
    public Adapter createExpectedTrendAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ExpectationsAdapterFactory
