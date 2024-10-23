/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;
import org.palladiosimulator.spd.targets.TargetGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getPolicyConstraints <em>Policy Constraints</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getTargetGroup <em>Target Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScalingPolicyImpl extends EntityImpl implements ScalingPolicy {
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return (Boolean) eDynamicGet(SpdPackage.SCALING_POLICY__ACTIVE, SpdPackage.Literals.SCALING_POLICY__ACTIVE,
				true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		eDynamicSet(SpdPackage.SCALING_POLICY__ACTIVE, SpdPackage.Literals.SCALING_POLICY__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroup getTargetGroup() {
		return (TargetGroup) eDynamicGet(SpdPackage.SCALING_POLICY__TARGET_GROUP,
				SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup basicGetTargetGroup() {
		return (TargetGroup) eDynamicGet(SpdPackage.SCALING_POLICY__TARGET_GROUP,
				SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetGroup(TargetGroup newTargetGroup) {
		eDynamicSet(SpdPackage.SCALING_POLICY__TARGET_GROUP, SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP,
				newTargetGroup);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PolicyConstraint> getPolicyConstraints() {
		return (EList<PolicyConstraint>) eDynamicGet(SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS,
				SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
			return ((InternalEList<?>) getPolicyConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdPackage.SCALING_POLICY__ACTIVE:
			return isActive();
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
			return getPolicyConstraints();
		case SpdPackage.SCALING_POLICY__TARGET_GROUP:
			if (resolve)
				return getTargetGroup();
			return basicGetTargetGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdPackage.SCALING_POLICY__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
			getPolicyConstraints().clear();
			getPolicyConstraints().addAll((Collection<? extends PolicyConstraint>) newValue);
			return;
		case SpdPackage.SCALING_POLICY__TARGET_GROUP:
			setTargetGroup((TargetGroup) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpdPackage.SCALING_POLICY__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
			getPolicyConstraints().clear();
			return;
		case SpdPackage.SCALING_POLICY__TARGET_GROUP:
			setTargetGroup((TargetGroup) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpdPackage.SCALING_POLICY__ACTIVE:
			return isActive() != ACTIVE_EDEFAULT;
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
			return !getPolicyConstraints().isEmpty();
		case SpdPackage.SCALING_POLICY__TARGET_GROUP:
			return basicGetTargetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} // ScalingPolicyImpl
