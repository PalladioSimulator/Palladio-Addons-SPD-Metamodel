/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.palladiosimulator.spd.SpdFactory
 * @model kind="package"
 * @generated
 */
public interface SpdPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "spd";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "spd";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SpdPackage eINSTANCE = org.palladiosimulator.spd.impl.SpdPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl
     * <em>Scaling Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.impl.ScalingPolicyImpl
     * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getScalingPolicy()
     * @generated
     */
    int SCALING_POLICY = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY__ACTIVE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Policy Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY__POLICY_CONSTRAINTS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Group</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY__TARGET_GROUP = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Scaling Policy</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_POLICY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.impl.ReactiveScalingPolicyImpl
     * <em>Reactive Scaling Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.impl.ReactiveScalingPolicyImpl
     * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getReactiveScalingPolicy()
     * @generated
     */
    int REACTIVE_SCALING_POLICY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__ID = SCALING_POLICY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__ENTITY_NAME = SCALING_POLICY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__ACTIVE = SCALING_POLICY__ACTIVE;

    /**
     * The feature id for the '<em><b>Policy Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__POLICY_CONSTRAINTS = SCALING_POLICY__POLICY_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Target Group</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__TARGET_GROUP = SCALING_POLICY__TARGET_GROUP;

    /**
     * The feature id for the '<em><b>Adjustment Type</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__ADJUSTMENT_TYPE = SCALING_POLICY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Scaling Trigger</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY__SCALING_TRIGGER = SCALING_POLICY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Reactive Scaling Policy</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int REACTIVE_SCALING_POLICY_FEATURE_COUNT = SCALING_POLICY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.impl.SPDImpl <em>SPD</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.impl.SPDImpl
     * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getSPD()
     * @generated
     */
    int SPD = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Scaling Policies</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD__SCALING_POLICIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Groups</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD__TARGET_GROUPS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SPD</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl
     * <em>Model Based Scaling Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl
     * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getModelBasedScalingPolicy()
     * @generated
     */
    int MODEL_BASED_SCALING_POLICY = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__ID = SCALING_POLICY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__ENTITY_NAME = SCALING_POLICY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__ACTIVE = SCALING_POLICY__ACTIVE;

    /**
     * The feature id for the '<em><b>Policy Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__POLICY_CONSTRAINTS = SCALING_POLICY__POLICY_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Target Group</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__TARGET_GROUP = SCALING_POLICY__TARGET_GROUP;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__MODEL = SCALING_POLICY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Adjustment</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY__ADJUSTMENT = SCALING_POLICY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Model Based Scaling Policy</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MODEL_BASED_SCALING_POLICY_FEATURE_COUNT = SCALING_POLICY_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.ReactiveScalingPolicy
     * <em>Reactive Scaling Policy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Reactive Scaling Policy</em>'.
     * @see org.palladiosimulator.spd.ReactiveScalingPolicy
     * @generated
     */
    EClass getReactiveScalingPolicy();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.ReactiveScalingPolicy#getAdjustmentType <em>Adjustment
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Adjustment Type</em>'.
     * @see org.palladiosimulator.spd.ReactiveScalingPolicy#getAdjustmentType()
     * @see #getReactiveScalingPolicy()
     * @generated
     */
    EReference getReactiveScalingPolicy_AdjustmentType();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.ReactiveScalingPolicy#getScalingTrigger <em>Scaling
     * Trigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Scaling Trigger</em>'.
     * @see org.palladiosimulator.spd.ReactiveScalingPolicy#getScalingTrigger()
     * @see #getReactiveScalingPolicy()
     * @generated
     */
    EReference getReactiveScalingPolicy_ScalingTrigger();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.ScalingPolicy <em>Scaling
     * Policy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Scaling Policy</em>'.
     * @see org.palladiosimulator.spd.ScalingPolicy
     * @generated
     */
    EClass getScalingPolicy();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.ScalingPolicy#isActive <em>Active</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Active</em>'.
     * @see org.palladiosimulator.spd.ScalingPolicy#isActive()
     * @see #getScalingPolicy()
     * @generated
     */
    EAttribute getScalingPolicy_Active();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.ScalingPolicy#getTargetGroup <em>Target Group</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Target Group</em>'.
     * @see org.palladiosimulator.spd.ScalingPolicy#getTargetGroup()
     * @see #getScalingPolicy()
     * @generated
     */
    EReference getScalingPolicy_TargetGroup();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy
     * <em>Model Based Scaling Policy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Model Based Scaling Policy</em>'.
     * @see org.palladiosimulator.spd.ModelBasedScalingPolicy
     * @generated
     */
    EClass getModelBasedScalingPolicy();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getModel <em>Model</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see org.palladiosimulator.spd.ModelBasedScalingPolicy#getModel()
     * @see #getModelBasedScalingPolicy()
     * @generated
     */
    EReference getModelBasedScalingPolicy_Model();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getAdjustment
     * <em>Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Adjustment</em>'.
     * @see org.palladiosimulator.spd.ModelBasedScalingPolicy#getAdjustment()
     * @see #getModelBasedScalingPolicy()
     * @generated
     */
    EAttribute getModelBasedScalingPolicy_Adjustment();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spd.ScalingPolicy#getPolicyConstraints <em>Policy
     * Constraints</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Policy Constraints</em>'.
     * @see org.palladiosimulator.spd.ScalingPolicy#getPolicyConstraints()
     * @see #getScalingPolicy()
     * @generated
     */
    EReference getScalingPolicy_PolicyConstraints();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.SPD <em>SPD</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>SPD</em>'.
     * @see org.palladiosimulator.spd.SPD
     * @generated
     */
    EClass getSPD();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spd.SPD#getScalingPolicies <em>Scaling Policies</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Scaling Policies</em>'.
     * @see org.palladiosimulator.spd.SPD#getScalingPolicies()
     * @see #getSPD()
     * @generated
     */
    EReference getSPD_ScalingPolicies();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spd.SPD#getTargetGroups <em>Target Groups</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Target Groups</em>'.
     * @see org.palladiosimulator.spd.SPD#getTargetGroups()
     * @see #getSPD()
     * @generated
     */
    EReference getSPD_TargetGroups();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SpdFactory getSpdFactory();

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
         * '{@link org.palladiosimulator.spd.impl.ReactiveScalingPolicyImpl <em>Reactive Scaling
         * Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.impl.ReactiveScalingPolicyImpl
         * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getReactiveScalingPolicy()
         * @generated
         */
        EClass REACTIVE_SCALING_POLICY = eINSTANCE.getReactiveScalingPolicy();

        /**
         * The meta object literal for the '<em><b>Adjustment Type</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REACTIVE_SCALING_POLICY__ADJUSTMENT_TYPE = eINSTANCE.getReactiveScalingPolicy_AdjustmentType();

        /**
         * The meta object literal for the '<em><b>Scaling Trigger</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference REACTIVE_SCALING_POLICY__SCALING_TRIGGER = eINSTANCE.getReactiveScalingPolicy_ScalingTrigger();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl
         * <em>Scaling Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.impl.ScalingPolicyImpl
         * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getScalingPolicy()
         * @generated
         */
        EClass SCALING_POLICY = eINSTANCE.getScalingPolicy();

        /**
         * The meta object literal for the '<em><b>Active</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SCALING_POLICY__ACTIVE = eINSTANCE.getScalingPolicy_Active();

        /**
         * The meta object literal for the '<em><b>Target Group</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SCALING_POLICY__TARGET_GROUP = eINSTANCE.getScalingPolicy_TargetGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl <em>Model Based
         * Scaling Policy</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl
         * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getModelBasedScalingPolicy()
         * @generated
         */
        EClass MODEL_BASED_SCALING_POLICY = eINSTANCE.getModelBasedScalingPolicy();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference MODEL_BASED_SCALING_POLICY__MODEL = eINSTANCE.getModelBasedScalingPolicy_Model();

        /**
         * The meta object literal for the '<em><b>Adjustment</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MODEL_BASED_SCALING_POLICY__ADJUSTMENT = eINSTANCE.getModelBasedScalingPolicy_Adjustment();

        /**
         * The meta object literal for the '<em><b>Policy Constraints</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SCALING_POLICY__POLICY_CONSTRAINTS = eINSTANCE.getScalingPolicy_PolicyConstraints();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.spd.impl.SPDImpl
         * <em>SPD</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.impl.SPDImpl
         * @see org.palladiosimulator.spd.impl.SpdPackageImpl#getSPD()
         * @generated
         */
        EClass SPD = eINSTANCE.getSPD();

        /**
         * The meta object literal for the '<em><b>Scaling Policies</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SPD__SCALING_POLICIES = eINSTANCE.getSPD_ScalingPolicies();

        /**
         * The meta object literal for the '<em><b>Target Groups</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SPD__TARGET_GROUPS = eINSTANCE.getSPD_TargetGroups();

    }

} // SpdPackage
