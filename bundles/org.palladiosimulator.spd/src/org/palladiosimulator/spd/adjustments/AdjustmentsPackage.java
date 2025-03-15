/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.palladiosimulator.spd.adjustments.AdjustmentsFactory
 * @model kind="package"
 * @generated
 */
public interface AdjustmentsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "adjustments";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "adjustments";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    AdjustmentsPackage eINSTANCE = org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.impl.AdjustmentTypeImpl <em>Adjustment
     * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentTypeImpl
     * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getAdjustmentType()
     * @generated
     */
    int ADJUSTMENT_TYPE = 0;

    /**
     * The number of structural features of the '<em>Adjustment Type</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ADJUSTMENT_TYPE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl <em>Relative
     * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl
     * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getRelativeAdjustment()
     * @generated
     */
    int RELATIVE_ADJUSTMENT = 1;

    /**
     * The feature id for the '<em><b>Percentage Growth Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min Adjustment Value</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Relative Adjustment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RELATIVE_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.impl.AbsoluteAdjustmentImpl <em>Absolute
     * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.impl.AbsoluteAdjustmentImpl
     * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getAbsoluteAdjustment()
     * @generated
     */
    int ABSOLUTE_ADJUSTMENT = 2;

    /**
     * The feature id for the '<em><b>Goal Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSOLUTE_ADJUSTMENT__GOAL_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Absolute Adjustment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSOLUTE_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.adjustments.impl.StepAdjustmentImpl <em>Step
     * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.adjustments.impl.StepAdjustmentImpl
     * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getStepAdjustment()
     * @generated
     */
    int STEP_ADJUSTMENT = 3;

    /**
     * The feature id for the '<em><b>Step Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STEP_ADJUSTMENT__STEP_VALUE = ADJUSTMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Step Adjustment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STEP_ADJUSTMENT_FEATURE_COUNT = ADJUSTMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.AdjustmentType <em>Adjustment Type</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Adjustment Type</em>'.
     * @see org.palladiosimulator.spd.adjustments.AdjustmentType
     * @generated
     */
    EClass getAdjustmentType();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.RelativeAdjustment <em>Relative
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Relative Adjustment</em>'.
     * @see org.palladiosimulator.spd.adjustments.RelativeAdjustment
     * @generated
     */
    EClass getRelativeAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.RelativeAdjustment#getPercentageGrowthValue
     * <em>Percentage Growth Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Percentage Growth Value</em>'.
     * @see org.palladiosimulator.spd.adjustments.RelativeAdjustment#getPercentageGrowthValue()
     * @see #getRelativeAdjustment()
     * @generated
     */
    EAttribute getRelativeAdjustment_PercentageGrowthValue();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.RelativeAdjustment#getMinAdjustmentValue
     * <em>Min Adjustment Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Min Adjustment Value</em>'.
     * @see org.palladiosimulator.spd.adjustments.RelativeAdjustment#getMinAdjustmentValue()
     * @see #getRelativeAdjustment()
     * @generated
     */
    EAttribute getRelativeAdjustment_MinAdjustmentValue();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.AbsoluteAdjustment <em>Absolute
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Absolute Adjustment</em>'.
     * @see org.palladiosimulator.spd.adjustments.AbsoluteAdjustment
     * @generated
     */
    EClass getAbsoluteAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.AbsoluteAdjustment#getGoalValue <em>Goal
     * Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Goal Value</em>'.
     * @see org.palladiosimulator.spd.adjustments.AbsoluteAdjustment#getGoalValue()
     * @see #getAbsoluteAdjustment()
     * @generated
     */
    EAttribute getAbsoluteAdjustment_GoalValue();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.adjustments.StepAdjustment <em>Step Adjustment</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Step Adjustment</em>'.
     * @see org.palladiosimulator.spd.adjustments.StepAdjustment
     * @generated
     */
    EClass getStepAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.adjustments.StepAdjustment#getStepValue <em>Step
     * Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Step Value</em>'.
     * @see org.palladiosimulator.spd.adjustments.StepAdjustment#getStepValue()
     * @see #getStepAdjustment()
     * @generated
     */
    EAttribute getStepAdjustment_StepValue();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AdjustmentsFactory getAdjustmentsFactory();

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
         * '{@link org.palladiosimulator.spd.adjustments.impl.AdjustmentTypeImpl <em>Adjustment
         * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentTypeImpl
         * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getAdjustmentType()
         * @generated
         */
        EClass ADJUSTMENT_TYPE = eINSTANCE.getAdjustmentType();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl <em>Relative
         * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl
         * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getRelativeAdjustment()
         * @generated
         */
        EClass RELATIVE_ADJUSTMENT = eINSTANCE.getRelativeAdjustment();

        /**
         * The meta object literal for the '<em><b>Percentage Growth Value</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE = eINSTANCE
            .getRelativeAdjustment_PercentageGrowthValue();

        /**
         * The meta object literal for the '<em><b>Min Adjustment Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE = eINSTANCE.getRelativeAdjustment_MinAdjustmentValue();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.impl.AbsoluteAdjustmentImpl <em>Absolute
         * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.impl.AbsoluteAdjustmentImpl
         * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getAbsoluteAdjustment()
         * @generated
         */
        EClass ABSOLUTE_ADJUSTMENT = eINSTANCE.getAbsoluteAdjustment();

        /**
         * The meta object literal for the '<em><b>Goal Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ABSOLUTE_ADJUSTMENT__GOAL_VALUE = eINSTANCE.getAbsoluteAdjustment_GoalValue();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.adjustments.impl.StepAdjustmentImpl <em>Step
         * Adjustment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.adjustments.impl.StepAdjustmentImpl
         * @see org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl#getStepAdjustment()
         * @generated
         */
        EClass STEP_ADJUSTMENT = eINSTANCE.getStepAdjustment();

        /**
         * The meta object literal for the '<em><b>Step Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute STEP_ADJUSTMENT__STEP_VALUE = eINSTANCE.getStepAdjustment_StepValue();

    }

} // AdjustmentsPackage
