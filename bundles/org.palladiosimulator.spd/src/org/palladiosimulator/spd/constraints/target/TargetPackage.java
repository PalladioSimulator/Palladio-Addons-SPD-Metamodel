/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;

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
 * @see org.palladiosimulator.spd.constraints.target.TargetFactory
 * @model kind="package"
 * @generated
 */
public interface TargetPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "target";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Constraints/Target/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "target";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TargetPackage eINSTANCE = org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.constraints.target.impl.TargetConstraintImpl
     * <em>Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.constraints.target.impl.TargetConstraintImpl
     * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getTargetConstraint()
     * @generated
     */
    int TARGET_CONSTRAINT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_CONSTRAINT__ID = ConstraintsPackage.ABSTRACT_CONSTRAINT__ID;

    /**
     * The number of structural features of the '<em>Constraint</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_CONSTRAINT_FEATURE_COUNT = ConstraintsPackage.ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl
     * <em>Group Size Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl
     * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getTargetGroupSizeConstraint()
     * @generated
     */
    int TARGET_GROUP_SIZE_CONSTRAINT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_SIZE_CONSTRAINT__ID = TARGET_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Min Size</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = TARGET_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Size</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = TARGET_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Group Size Constraint</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_SIZE_CONSTRAINT_FEATURE_COUNT = TARGET_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.constraints.target.impl.ThrashingConstraintImpl
     * <em>Thrashing Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.constraints.target.impl.ThrashingConstraintImpl
     * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getThrashingConstraint()
     * @generated
     */
    int THRASHING_CONSTRAINT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THRASHING_CONSTRAINT__ID = ConstraintsPackage.TEMPORAL_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Minimum Time No Thrashing</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Thrashing Constraint</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THRASHING_CONSTRAINT_FEATURE_COUNT = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.constraints.target.TargetConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Constraint</em>'.
     * @see org.palladiosimulator.spd.constraints.target.TargetConstraint
     * @generated
     */
    EClass getTargetConstraint();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint <em>Group Size
     * Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Group Size Constraint</em>'.
     * @see org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint
     * @generated
     */
    EClass getTargetGroupSizeConstraint();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMinSize
     * <em>Min Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Min Size</em>'.
     * @see org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMinSize()
     * @see #getTargetGroupSizeConstraint()
     * @generated
     */
    EAttribute getTargetGroupSizeConstraint_MinSize();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMaxSize
     * <em>Max Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Max Size</em>'.
     * @see org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMaxSize()
     * @see #getTargetGroupSizeConstraint()
     * @generated
     */
    EAttribute getTargetGroupSizeConstraint_MaxSize();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.constraints.target.ThrashingConstraint <em>Thrashing
     * Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Thrashing Constraint</em>'.
     * @see org.palladiosimulator.spd.constraints.target.ThrashingConstraint
     * @generated
     */
    EClass getThrashingConstraint();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.constraints.target.ThrashingConstraint#getMinimumTimeNoThrashing
     * <em>Minimum Time No Thrashing</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Minimum Time No Thrashing</em>'.
     * @see org.palladiosimulator.spd.constraints.target.ThrashingConstraint#getMinimumTimeNoThrashing()
     * @see #getThrashingConstraint()
     * @generated
     */
    EAttribute getThrashingConstraint_MinimumTimeNoThrashing();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TargetFactory getTargetFactory();

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
         * '{@link org.palladiosimulator.spd.constraints.target.impl.TargetConstraintImpl
         * <em>Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.constraints.target.impl.TargetConstraintImpl
         * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getTargetConstraint()
         * @generated
         */
        EClass TARGET_CONSTRAINT = eINSTANCE.getTargetConstraint();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl
         * <em>Group Size Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl
         * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getTargetGroupSizeConstraint()
         * @generated
         */
        EClass TARGET_GROUP_SIZE_CONSTRAINT = eINSTANCE.getTargetGroupSizeConstraint();

        /**
         * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MinSize();

        /**
         * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MaxSize();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.constraints.target.impl.ThrashingConstraintImpl
         * <em>Thrashing Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.constraints.target.impl.ThrashingConstraintImpl
         * @see org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl#getThrashingConstraint()
         * @generated
         */
        EClass THRASHING_CONSTRAINT = eINSTANCE.getThrashingConstraint();

        /**
         * The meta object literal for the '<em><b>Minimum Time No Thrashing</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = eINSTANCE
            .getThrashingConstraint_MinimumTimeNoThrashing();

    }

} // TargetPackage
