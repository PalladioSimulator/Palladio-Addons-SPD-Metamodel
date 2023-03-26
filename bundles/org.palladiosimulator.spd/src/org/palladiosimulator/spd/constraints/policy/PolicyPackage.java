/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.constraints.policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Constraints/Policy/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyPackage eINSTANCE = org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.constraints.policy.impl.PolicyConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyConstraintImpl
	 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getPolicyConstraint()
	 * @generated
	 */
	int POLICY_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT__ID = ConstraintsPackage.ABSTRACT_CONSTRAINT__ID;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONSTRAINT_FEATURE_COUNT = ConstraintsPackage.ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl
	 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getIntervallConstraint()
	 * @generated
	 */
	int INTERVALL_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__ID = ConstraintsPackage.TEMPORAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__OFFSET = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervall Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT__INTERVALL_DURATION = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intervall Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALL_CONSTRAINT_FEATURE_COUNT = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl
	 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getCooldownConstraint()
	 * @generated
	 */
	int COOLDOWN_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__ID = ConstraintsPackage.TEMPORAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Cooldown Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__COOLDOWN_TIME = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Scaling Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooldown Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOLDOWN_CONSTRAINT_FEATURE_COUNT = ConstraintsPackage.TEMPORAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.constraints.policy.PolicyConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.PolicyConstraint
	 * @generated
	 */
	EClass getPolicyConstraint();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.constraints.policy.IntervallConstraint <em>Intervall Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervall Constraint</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.IntervallConstraint
	 * @generated
	 */
	EClass getIntervallConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.constraints.policy.IntervallConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.IntervallConstraint#getOffset()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.constraints.policy.IntervallConstraint#getIntervallDuration <em>Intervall Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intervall Duration</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.IntervallConstraint#getIntervallDuration()
	 * @see #getIntervallConstraint()
	 * @generated
	 */
	EAttribute getIntervallConstraint_IntervallDuration();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.constraints.policy.CooldownConstraint <em>Cooldown Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooldown Constraint</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.CooldownConstraint
	 * @generated
	 */
	EClass getCooldownConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.constraints.policy.CooldownConstraint#getCooldownTime <em>Cooldown Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown Time</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.CooldownConstraint#getCooldownTime()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_CooldownTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.constraints.policy.CooldownConstraint#getMaxScalingOperations <em>Max Scaling Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scaling Operations</em>'.
	 * @see org.palladiosimulator.spd.constraints.policy.CooldownConstraint#getMaxScalingOperations()
	 * @see #getCooldownConstraint()
	 * @generated
	 */
	EAttribute getCooldownConstraint_MaxScalingOperations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyFactory getPolicyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.constraints.policy.impl.PolicyConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyConstraintImpl
		 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getPolicyConstraint()
		 * @generated
		 */
		EClass POLICY_CONSTRAINT = eINSTANCE.getPolicyConstraint();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl <em>Intervall Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl
		 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getIntervallConstraint()
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
		 * The meta object literal for the '{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl <em>Cooldown Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl
		 * @see org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl#getCooldownConstraint()
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

	}

} //PolicyPackage
