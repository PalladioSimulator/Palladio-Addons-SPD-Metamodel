/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.targets.CompetingConsumersGroup;
import org.palladiosimulator.spd.targets.ElasticInfrastructure;
import org.palladiosimulator.spd.targets.ServiceGroup;
import org.palladiosimulator.spd.targets.TargetsFactory;
import org.palladiosimulator.spd.targets.TargetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetsFactoryImpl extends EFactoryImpl implements TargetsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TargetsFactory init() {
        try {
            final TargetsFactory theTargetsFactory = (TargetsFactory) EPackage.Registry.INSTANCE
                .getEFactory(TargetsPackage.eNS_URI);
            if (theTargetsFactory != null) {
                return theTargetsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TargetsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetsFactoryImpl() {
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
        case TargetsPackage.ELASTIC_INFRASTRUCTURE:
            return this.createElasticInfrastructure();
        case TargetsPackage.SERVICE_GROUP:
            return this.createServiceGroup();
        case TargetsPackage.COMPETING_CONSUMERS_GROUP:
            return this.createCompetingConsumersGroup();
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
    public ElasticInfrastructure createElasticInfrastructure() {
        final ElasticInfrastructureImpl elasticInfrastructure = new ElasticInfrastructureImpl();
        return elasticInfrastructure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroup createServiceGroup() {
        final ServiceGroupImpl serviceGroup = new ServiceGroupImpl();
        return serviceGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumersGroup createCompetingConsumersGroup() {
        final CompetingConsumersGroupImpl competingConsumersGroup = new CompetingConsumersGroupImpl();
        return competingConsumersGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TargetsPackage getTargetsPackage() {
        return (TargetsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TargetsPackage getPackage() {
        return TargetsPackage.eINSTANCE;
    }

} // TargetsFactoryImpl
