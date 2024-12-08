/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;
import org.palladiosimulator.spd.triggers.expectations.NoExpectation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpectationsFactoryImpl extends EFactoryImpl implements ExpectationsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ExpectationsFactory init() {
        try {
            final ExpectationsFactory theExpectationsFactory = (ExpectationsFactory) EPackage.Registry.INSTANCE
                .getEFactory(ExpectationsPackage.eNS_URI);
            if (theExpectationsFactory != null) {
                return theExpectationsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpectationsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ExpectationsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ExpectationsPackage.NO_EXPECTATION:
            return this.createNoExpectation();
        case ExpectationsPackage.EXPECTED_PERCENTAGE:
            return this.createExpectedPercentage();
        case ExpectationsPackage.EXPECTED_COUNT:
            return this.createExpectedCount();
        case ExpectationsPackage.EXPECTED_TIME:
            return this.createExpectedTime();
        case ExpectationsPackage.EXPECTED_TREND:
            return this.createExpectedTrend();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NoExpectation createNoExpectation() {
        final NoExpectationImpl noExpectation = new NoExpectationImpl();
        return noExpectation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectedPercentage createExpectedPercentage() {
        final ExpectedPercentageImpl expectedPercentage = new ExpectedPercentageImpl();
        return expectedPercentage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectedCount createExpectedCount() {
        final ExpectedCountImpl expectedCount = new ExpectedCountImpl();
        return expectedCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectedTime createExpectedTime() {
        final ExpectedTimeImpl expectedTime = new ExpectedTimeImpl();
        return expectedTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectedTrend createExpectedTrend() {
        final ExpectedTrendImpl expectedTrend = new ExpectedTrendImpl();
        return expectedTrend;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectationsPackage getExpectationsPackage() {
        return (ExpectationsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpectationsPackage getPackage() {
        return ExpectationsPackage.eINSTANCE;
    }

} // ExpectationsFactoryImpl
