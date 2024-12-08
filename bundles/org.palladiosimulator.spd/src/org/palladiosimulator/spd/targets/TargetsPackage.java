/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.targets.TargetsFactory
 * @model kind="package"
 * @generated
 */
public interface TargetsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "targets";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Targets/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "targets";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TargetsPackage eINSTANCE = org.palladiosimulator.spd.targets.impl.TargetsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.targets.impl.TargetGroupImpl
     * <em>Target Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.targets.impl.TargetGroupImpl
     * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getTargetGroup()
     * @generated
     */
    int TARGET_GROUP = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__TARGET_CONSTRAINTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Target Group</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl <em>Elastic
     * Infrastructure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl
     * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getElasticInfrastructure()
     * @generated
     */
    int ELASTIC_INFRASTRUCTURE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>PCM Resource Environment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unit</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE__UNIT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Elastic Infrastructure</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.targets.impl.ServiceGroupImpl
     * <em>Service Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.targets.impl.ServiceGroupImpl
     * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getServiceGroup()
     * @generated
     */
    int SERVICE_GROUP = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__UNIT_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Group</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl <em>Competing
     * Consumers Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl
     * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getCompetingConsumersGroup()
     * @generated
     */
    int COMPETING_CONSUMERS_GROUP = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Competing Consumers Group</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.targets.TargetGroup
     * <em>Target Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Target Group</em>'.
     * @see org.palladiosimulator.spd.targets.TargetGroup
     * @generated
     */
    EClass getTargetGroup();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spd.targets.TargetGroup#getTargetConstraints <em>Target
     * Constraints</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Target Constraints</em>'.
     * @see org.palladiosimulator.spd.targets.TargetGroup#getTargetConstraints()
     * @see #getTargetGroup()
     * @generated
     */
    EReference getTargetGroup_TargetConstraints();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.targets.ElasticInfrastructure <em>Elastic
     * Infrastructure</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Elastic Infrastructure</em>'.
     * @see org.palladiosimulator.spd.targets.ElasticInfrastructure
     * @generated
     */
    EClass getElasticInfrastructure();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment
     * <em>PCM Resource Environment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>PCM Resource Environment</em>'.
     * @see org.palladiosimulator.spd.targets.ElasticInfrastructure#getPCM_ResourceEnvironment()
     * @see #getElasticInfrastructure()
     * @generated
     */
    EReference getElasticInfrastructure_PCM_ResourceEnvironment();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.targets.ElasticInfrastructure#getUnit <em>Unit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit</em>'.
     * @see org.palladiosimulator.spd.targets.ElasticInfrastructure#getUnit()
     * @see #getElasticInfrastructure()
     * @generated
     */
    EReference getElasticInfrastructure_Unit();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.targets.ServiceGroup
     * <em>Service Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Group</em>'.
     * @see org.palladiosimulator.spd.targets.ServiceGroup
     * @generated
     */
    EClass getServiceGroup();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.targets.ServiceGroup#getUnitAssembly <em>Unit
     * Assembly</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit Assembly</em>'.
     * @see org.palladiosimulator.spd.targets.ServiceGroup#getUnitAssembly()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_UnitAssembly();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup <em>Competing Consumers
     * Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Competing Consumers Group</em>'.
     * @see org.palladiosimulator.spd.targets.CompetingConsumersGroup
     * @generated
     */
    EClass getCompetingConsumersGroup();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly <em>Unit
     * Assembly</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit Assembly</em>'.
     * @see org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_UnitAssembly();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TargetsFactory getTargetsFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.targets.impl.TargetGroupImpl <em>Target Group</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.targets.impl.TargetGroupImpl
         * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getTargetGroup()
         * @generated
         */
        EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

        /**
         * The meta object literal for the '<em><b>Target Constraints</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TARGET_GROUP__TARGET_CONSTRAINTS = eINSTANCE.getTargetGroup_TargetConstraints();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl <em>Elastic
         * Infrastructure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl
         * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getElasticInfrastructure()
         * @generated
         */
        EClass ELASTIC_INFRASTRUCTURE = eINSTANCE.getElasticInfrastructure();

        /**
         * The meta object literal for the '<em><b>PCM Resource Environment</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT = eINSTANCE
            .getElasticInfrastructure_PCM_ResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ELASTIC_INFRASTRUCTURE__UNIT = eINSTANCE.getElasticInfrastructure_Unit();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.targets.impl.ServiceGroupImpl <em>Service Group</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.targets.impl.ServiceGroupImpl
         * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getServiceGroup()
         * @generated
         */
        EClass SERVICE_GROUP = eINSTANCE.getServiceGroup();

        /**
         * The meta object literal for the '<em><b>Unit Assembly</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERVICE_GROUP__UNIT_ASSEMBLY = eINSTANCE.getServiceGroup_UnitAssembly();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl <em>Competing
         * Consumers Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl
         * @see org.palladiosimulator.spd.targets.impl.TargetsPackageImpl#getCompetingConsumersGroup()
         * @generated
         */
        EClass COMPETING_CONSUMERS_GROUP = eINSTANCE.getCompetingConsumersGroup();

        /**
         * The meta object literal for the '<em><b>Unit Assembly</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY = eINSTANCE.getCompetingConsumersGroup_UnitAssembly();

    }

} // TargetsPackage
