/**
 */
package spd.policyconstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import spd.SpdPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spd.policyconstraint.PolicyconstraintFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyconstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policyconstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "policyconstraint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policyconstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyconstraintPackage eINSTANCE = spd.policyconstraint.impl.PolicyconstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.PolicyConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getPolicyConstraint()
	 * @generated
	 */
	int POLICY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_FEATURE_COUNT = SpdPackage.POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_OPERATION_COUNT = SpdPackage.POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.TemporalConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTemporalConstraint()
	 * @generated
	 */
	int TEMPORAL_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.StateBasedContraintImpl <em>State Based Contraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.StateBasedContraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getStateBasedContraint()
	 * @generated
	 */
	int STATE_BASED_CONTRAINT = 5;

	/**
	 * The number of structural features of the '<em>State Based Contraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_CONTRAINT_FEATURE_COUNT = POLICY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Based Contraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_CONTRAINT_OPERATION_COUNT = POLICY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.TargetGroupSizeConstraintImpl <em>Target Group Size Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.TargetGroupSizeConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTargetGroupSizeConstraint()
	 * @generated
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = STATE_BASED_CONTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = STATE_BASED_CONTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT_FEATURE_COUNT = STATE_BASED_CONTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Group Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_SIZE_CONSTRAINT_OPERATION_COUNT = STATE_BASED_CONTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.IntervallConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getIntervallConstraint()
	 * @generated
	 */
	int INTERVALL_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__OFFSET = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervall Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__INTERVALL_DURATION = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.CooldownConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getCooldownConstraint()
	 * @generated
	 */
	int COOLDOWN_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Cooldown Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__COOLDOWN_TIME = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Scaling Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.policyconstraint.impl.ThrashingConstraintImpl <em>Thrashing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.policyconstraint.impl.ThrashingConstraintImpl
	 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getThrashingConstraint()
	 * @generated
	 */
	int THRASHING_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Minimum Time No Thrashing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thrashing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_FEATURE_COUNT = TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thrashing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRASHING_CONSTRAINT_OPERATION_COUNT = TEMPORAL_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Constraint</em>'.
	 * @see spd.policyconstraint.PolicyConstraint
	 * @generated
	 */
	EClass getPolicyConstraint();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.TemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Constraint</em>'.
	 * @see spd.policyconstraint.TemporalConstraint
	 * @generated
	 */
	EClass getTemporalConstraint();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.TargetGroupSizeConstraint <em>Target Group Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group Size Constraint</em>'.
	 * @see spd.policyconstraint.TargetGroupSizeConstraint
	 * @generated
	 */
	EClass getTargetGroupSizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see spd.policyconstraint.TargetGroupSizeConstraint#getMinSize()
	 * @see #getTargetGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getTargetGroupSizeConstraint_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see spd.policyconstraint.TargetGroupSizeConstraint#getMaxSize()
	 * @see #getTargetGroupSizeConstraint()
	 * @generated
	 */
	EAttribute getTargetGroupSizeConstraint_MaxSize();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.IntervallConstraint <em>Intervall Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervall Constraint</em>'.
	 * @see spd.policyconstraint.IntervallConstraint
	 * @generated
	 */
	EClass getIntervallConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.IntervallConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see spd.policyconstraint.IntervallConstraint#getOffset()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_Offset();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.IntervallConstraint#getIntervallDuration <em>Intervall Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intervall Duration</em>'.
	 * @see spd.policyconstraint.IntervallConstraint#getIntervallDuration()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_IntervallDuration();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.CooldownConstraint <em>Cooldown Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Constraint</em>'.
	 * @see spd.policyconstraint.CooldownConstraint
	 * @generated
	 */
	EClass getCooldownConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown Time</em>'.
	 * @see spd.policyconstraint.CooldownConstraint#getCooldownTime()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_CooldownTime();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scaling Operations</em>'.
	 * @see spd.policyconstraint.CooldownConstraint#getMaxScalingOperations()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_MaxScalingOperations();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.StateBasedContraint <em>State Based Contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Based Contraint</em>'.
	 * @see spd.policyconstraint.StateBasedContraint
	 * @generated
	 */
	EClass getStateBasedContraint();

	/**
	 * Returns the meta object for class '{@link spd.policyconstraint.ThrashingConstraint <em>Thrashing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thrashing Constraint</em>'.
	 * @see spd.policyconstraint.ThrashingConstraint
	 * @generated
	 */
	EClass getThrashingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.policyconstraint.ThrashingConstraint#getMinimumTimeNoThrashing <em>Minimum Time No Thrashing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Time No Thrashing</em>'.
	 * @see spd.policyconstraint.ThrashingConstraint#getMinimumTimeNoThrashing()
	 * @see #getThrashingConstraint()
	 * @generated
	 */
	EAttribute getThrashingConstraint_MinimumTimeNoThrashing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyconstraintFactory getPolicyconstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.PolicyConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getPolicyConstraint()
		 * @generated
		 */
		EClass POLICY_CONSTRAINT = eINSTANCE.getPolicyConstraint();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.TemporalConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTemporalConstraint()
		 * @generated
		 */
		EClass TEMPORAL_CONSTRAINT = eINSTANCE.getTemporalConstraint();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.TargetGroupSizeConstraintImpl <em>Target Group Size Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.TargetGroupSizeConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getTargetGroupSizeConstraint()
		 * @generated
		 */
		EClass TARGET_GROUP_SIZE_CONSTRAINT = eINSTANCE.getTargetGroupSizeConstraint();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MinSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE = eINSTANCE.getTargetGroupSizeConstraint_MaxSize();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.IntervallConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getIntervallConstraint()
		 * @generated
		 */
		EClass INTERVALL_CONSTRAINT = eINSTANCE.getIntervallConstraint();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALL_CONSTRAINT__OFFSET = eINSTANCE.getIntervallConstraint_Offset();

		/**
		 * The meta object literal for the '<em><b>Intervall Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALL_CONSTRAINT__INTERVALL_DURATION = eINSTANCE.getIntervallConstraint_IntervallDuration();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.CooldownConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getCooldownConstraint()
		 * @generated
		 */
		EClass COOLDOWN_CONSTRAINT = eINSTANCE.getCooldownConstraint();

		/**
		 * The meta object literal for the '<em><b>Cooldown Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOLDOWN_CONSTRAINT__COOLDOWN_TIME = eINSTANCE.getCooldownConstraint_CooldownTime();

		/**
		 * The meta object literal for the '<em><b>Max Scaling Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = eINSTANCE.getCooldownConstraint_MaxScalingOperations();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.StateBasedContraintImpl <em>State Based Contraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.StateBasedContraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getStateBasedContraint()
		 * @generated
		 */
		EClass STATE_BASED_CONTRAINT = eINSTANCE.getStateBasedContraint();

		/**
		 * The meta object literal for the '{@link spd.policyconstraint.impl.ThrashingConstraintImpl <em>Thrashing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.policyconstraint.impl.ThrashingConstraintImpl
		 * @see spd.policyconstraint.impl.PolicyconstraintPackageImpl#getThrashingConstraint()
		 * @generated
		 */
		EClass THRASHING_CONSTRAINT = eINSTANCE.getThrashingConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum Time No Thrashing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING = eINSTANCE.getThrashingConstraint_MinimumTimeNoThrashing();

	}

} //PolicyconstraintPackage
