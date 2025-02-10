/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Elastic
 * Infrastructure</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ElasticInfrastructure target groups resource containers on which
 * components are allocated. The ElasticInfrastructure allows the definition of scaling policies for
 * the whole infrastructure which is a common use case covered by the prominent cloud providers. For
 * example, AWS allows the definition of an Autoscaling Group where EC2 instances are automatically
 * provisioned. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment
 * <em>PCM Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage#getElasticInfrastructure()
 * @model
 * @generated
 */
public interface ElasticInfrastructure extends TargetGroup {
    /**
     * Returns the value of the '<em><b>PCM Resource Environment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>PCM Resource Environment</em>' reference.
     * @see #isSetPCM_ResourceEnvironment()
     * @see org.palladiosimulator.spd.targets.TargetsPackage#getElasticInfrastructure_PCM_ResourceEnvironment()
     * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    ResourceEnvironment getPCM_ResourceEnvironment();

    /**
     * Returns whether the value of the
     * '{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment
     * <em>PCM Resource Environment</em>}' reference is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>PCM Resource Environment</em>' reference is set.
     * @see #getPCM_ResourceEnvironment()
     * @generated
     */
    boolean isSetPCM_ResourceEnvironment();

    /**
     * Returns the value of the '<em><b>Unit</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Unit</em>' reference.
     * @see #setUnit(ResourceContainer)
     * @see org.palladiosimulator.spd.targets.TargetsPackage#getElasticInfrastructure_Unit()
     * @model
     * @generated
     */
    ResourceContainer getUnit();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getUnit
     * <em>Unit</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Unit</em>' reference.
     * @see #getUnit()
     * @generated
     */
    void setUnit(ResourceContainer value);

} // ElasticInfrastructure
