/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyFactory;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class PolicyFactoryImpl extends EFactoryImpl implements PolicyFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static PolicyFactory init() {
        try {
            final PolicyFactory thePolicyFactory = (PolicyFactory) EPackage.Registry.INSTANCE
                .getEFactory(PolicyPackage.eNS_URI);
            if (thePolicyFactory != null) {
                return thePolicyFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PolicyFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PolicyFactoryImpl() {
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
        case PolicyPackage.INTERVAL_CONSTRAINT:
            return this.createIntervalConstraint();
        case PolicyPackage.COOLDOWN_CONSTRAINT:
            return this.createCooldownConstraint();
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
    public IntervalConstraint createIntervalConstraint() {
        final IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
        return intervalConstraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CooldownConstraint createCooldownConstraint() {
        final CooldownConstraintImpl cooldownConstraint = new CooldownConstraintImpl();
        return cooldownConstraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PolicyPackage getPolicyPackage() {
        return (PolicyPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PolicyPackage getPackage() {
        return PolicyPackage.eINSTANCE;
    }

} // PolicyFactoryImpl
