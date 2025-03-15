/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;
import org.palladiosimulator.spd.adjustments.StepAdjustment;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class AdjustmentsFactoryImpl extends EFactoryImpl implements AdjustmentsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static AdjustmentsFactory init() {
        try {
            final AdjustmentsFactory theAdjustmentsFactory = (AdjustmentsFactory) EPackage.Registry.INSTANCE
                .getEFactory(AdjustmentsPackage.eNS_URI);
            if (theAdjustmentsFactory != null) {
                return theAdjustmentsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AdjustmentsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AdjustmentsFactoryImpl() {
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
        case AdjustmentsPackage.RELATIVE_ADJUSTMENT:
            return this.createRelativeAdjustment();
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT:
            return this.createAbsoluteAdjustment();
        case AdjustmentsPackage.STEP_ADJUSTMENT:
            return this.createStepAdjustment();
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
    public RelativeAdjustment createRelativeAdjustment() {
        final RelativeAdjustmentImpl relativeAdjustment = new RelativeAdjustmentImpl();
        return relativeAdjustment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AbsoluteAdjustment createAbsoluteAdjustment() {
        final AbsoluteAdjustmentImpl absoluteAdjustment = new AbsoluteAdjustmentImpl();
        return absoluteAdjustment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StepAdjustment createStepAdjustment() {
        final StepAdjustmentImpl stepAdjustment = new StepAdjustmentImpl();
        return stepAdjustment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AdjustmentsPackage getAdjustmentsPackage() {
        return (AdjustmentsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AdjustmentsPackage getPackage() {
        return AdjustmentsPackage.eINSTANCE;
    }

} // AdjustmentsFactoryImpl
