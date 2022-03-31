/**
 */
package spd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see spd.SpdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SpdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "spd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdPackage eINSTANCE = spd.impl.SpdPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.ScalingPolicyImpl
	 * @see spd.impl.SpdPackageImpl#getScalingPolicy()
	 * @generated
	 */
	int SCALING_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Targetgroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__TARGETGROUP = 0;

	/**
	 * The feature id for the '<em><b>Adjustmenttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ADJUSTMENTTYPE = 1;

	/**
	 * The feature id for the '<em><b>Scalingtrigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__SCALINGTRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Policyconstraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__POLICYCONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__POLICY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ACTIVE = 5;

	/**
	 * The number of structural features of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.impl.SPDImpl <em>SPD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.SPDImpl
	 * @see spd.impl.SpdPackageImpl#getSPD()
	 * @generated
	 */
	int SPD = 1;

	/**
	 * The feature id for the '<em><b>Scalingpolicy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__SCALINGPOLICY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Targetgroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD__TARGETGROUPS = 2;

	/**
	 * The number of structural features of the '<em>SPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.impl.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.TargetGroupImpl
	 * @see spd.impl.SpdPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.impl.AdjustmentTypeImpl <em>Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.AdjustmentTypeImpl
	 * @see spd.impl.SpdPackageImpl#getAdjustmentType()
	 * @generated
	 */
	int ADJUSTMENT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUSTMENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUSTMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.impl.ScalingTriggerImpl <em>Scaling Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.ScalingTriggerImpl
	 * @see spd.impl.SpdPackageImpl#getScalingTrigger()
	 * @generated
	 */
	int SCALING_TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Scaling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scaling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spd.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.impl.PolicyConstraintImpl
	 * @see spd.impl.SpdPackageImpl#getPolicyConstraint()
	 * @generated
	 */
	int POLICY_CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Policy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link spd.ScalingPolicy <em>Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Policy</em>'.
	 * @see spd.ScalingPolicy
	 * @generated
	 */
	EClass getScalingPolicy();

	/**
	 * Returns the meta object for the reference '{@link spd.ScalingPolicy#getTargetgroup <em>Targetgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetgroup</em>'.
	 * @see spd.ScalingPolicy#getTargetgroup()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Targetgroup();

	/**
	 * Returns the meta object for the containment reference '{@link spd.ScalingPolicy#getAdjustmenttype <em>Adjustmenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adjustmenttype</em>'.
	 * @see spd.ScalingPolicy#getAdjustmenttype()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Adjustmenttype();

	/**
	 * Returns the meta object for the containment reference '{@link spd.ScalingPolicy#getScalingtrigger <em>Scalingtrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scalingtrigger</em>'.
	 * @see spd.ScalingPolicy#getScalingtrigger()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Scalingtrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link spd.ScalingPolicy#getPolicyconstraint <em>Policyconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policyconstraint</em>'.
	 * @see spd.ScalingPolicy#getPolicyconstraint()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Policyconstraint();

	/**
	 * Returns the meta object for the attribute '{@link spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see spd.ScalingPolicy#getPolicyName()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link spd.ScalingPolicy#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see spd.ScalingPolicy#isActive()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_Active();

	/**
	 * Returns the meta object for class '{@link spd.SPD <em>SPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPD</em>'.
	 * @see spd.SPD
	 * @generated
	 */
	EClass getSPD();

	/**
	 * Returns the meta object for the containment reference list '{@link spd.SPD#getScalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalingpolicy</em>'.
	 * @see spd.SPD#getScalingpolicy()
	 * @see #getSPD()
	 * @generated
	 */
	EReference getSPD_Scalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link spd.SPD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spd.SPD#getName()
	 * @see #getSPD()
	 * @generated
	 */
	EAttribute getSPD_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link spd.SPD#getTargetgroups <em>Targetgroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targetgroups</em>'.
	 * @see spd.SPD#getTargetgroups()
	 * @see #getSPD()
	 * @generated
	 */
	EReference getSPD_Targetgroups();

	/**
	 * Returns the meta object for class '{@link spd.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see spd.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for class '{@link spd.AdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type</em>'.
	 * @see spd.AdjustmentType
	 * @generated
	 */
	EClass getAdjustmentType();

	/**
	 * Returns the meta object for class '{@link spd.ScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Trigger</em>'.
	 * @see spd.ScalingTrigger
	 * @generated
	 */
	EClass getScalingTrigger();

	/**
	 * Returns the meta object for class '{@link spd.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Constraint</em>'.
	 * @see spd.PolicyConstraint
	 * @generated
	 */
	EClass getPolicyConstraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpdFactory getSpdFactory();

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
		 * The meta object literal for the '{@link spd.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.ScalingPolicyImpl
		 * @see spd.impl.SpdPackageImpl#getScalingPolicy()
		 * @generated
		 */
		EClass SCALING_POLICY = eINSTANCE.getScalingPolicy();

		/**
		 * The meta object literal for the '<em><b>Targetgroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__TARGETGROUP = eINSTANCE.getScalingPolicy_Targetgroup();

		/**
		 * The meta object literal for the '<em><b>Adjustmenttype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__ADJUSTMENTTYPE = eINSTANCE.getScalingPolicy_Adjustmenttype();

		/**
		 * The meta object literal for the '<em><b>Scalingtrigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__SCALINGTRIGGER = eINSTANCE.getScalingPolicy_Scalingtrigger();

		/**
		 * The meta object literal for the '<em><b>Policyconstraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__POLICYCONSTRAINT = eINSTANCE.getScalingPolicy_Policyconstraint();

		/**
		 * The meta object literal for the '<em><b>Policy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__POLICY_NAME = eINSTANCE.getScalingPolicy_PolicyName();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__ACTIVE = eINSTANCE.getScalingPolicy_Active();

		/**
		 * The meta object literal for the '{@link spd.impl.SPDImpl <em>SPD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.SPDImpl
		 * @see spd.impl.SpdPackageImpl#getSPD()
		 * @generated
		 */
		EClass SPD = eINSTANCE.getSPD();

		/**
		 * The meta object literal for the '<em><b>Scalingpolicy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD__SCALINGPOLICY = eINSTANCE.getSPD_Scalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPD__NAME = eINSTANCE.getSPD_Name();

		/**
		 * The meta object literal for the '<em><b>Targetgroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD__TARGETGROUPS = eINSTANCE.getSPD_Targetgroups();

		/**
		 * The meta object literal for the '{@link spd.impl.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.TargetGroupImpl
		 * @see spd.impl.SpdPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '{@link spd.impl.AdjustmentTypeImpl <em>Adjustment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.AdjustmentTypeImpl
		 * @see spd.impl.SpdPackageImpl#getAdjustmentType()
		 * @generated
		 */
		EClass ADJUSTMENT_TYPE = eINSTANCE.getAdjustmentType();

		/**
		 * The meta object literal for the '{@link spd.impl.ScalingTriggerImpl <em>Scaling Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.ScalingTriggerImpl
		 * @see spd.impl.SpdPackageImpl#getScalingTrigger()
		 * @generated
		 */
		EClass SCALING_TRIGGER = eINSTANCE.getScalingTrigger();

		/**
		 * The meta object literal for the '{@link spd.impl.PolicyConstraintImpl <em>Policy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.impl.PolicyConstraintImpl
		 * @see spd.impl.SpdPackageImpl#getPolicyConstraint()
		 * @generated
		 */
		EClass POLICY_CONSTRAINT = eINSTANCE.getPolicyConstraint();

	}

} //SpdPackage
