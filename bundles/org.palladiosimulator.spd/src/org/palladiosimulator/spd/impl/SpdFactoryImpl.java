/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.SpdFactory;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdFactoryImpl extends EFactoryImpl implements SpdFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SpdFactory init() {
        try {
            final SpdFactory theSpdFactory = (SpdFactory) EPackage.Registry.INSTANCE.getEFactory(SpdPackage.eNS_URI);
            if (theSpdFactory != null) {
                return theSpdFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SpdFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdFactoryImpl() {
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
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY:
            return this.createTriggerBasedScalingPolicy();
        case SpdPackage.SPD:
            return this.createSPD();
        case SpdPackage.MODEL_BASED_SCALING_POLICY:
            return this.createModelBasedScalingPolicy();
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
    public TriggerBasedScalingPolicy createTriggerBasedScalingPolicy() {
        final TriggerBasedScalingPolicyImpl triggerBasedScalingPolicy = new TriggerBasedScalingPolicyImpl();
        return triggerBasedScalingPolicy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SPD createSPD() {
        final SPDImpl spd = new SPDImpl();
        return spd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelBasedScalingPolicy createModelBasedScalingPolicy() {
        final ModelBasedScalingPolicyImpl modelBasedScalingPolicy = new ModelBasedScalingPolicyImpl();
        return modelBasedScalingPolicy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SpdPackage getSpdPackage() {
        return (SpdPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SpdPackage getPackage() {
        return SpdPackage.eINSTANCE;
    }

} // SpdFactoryImpl
