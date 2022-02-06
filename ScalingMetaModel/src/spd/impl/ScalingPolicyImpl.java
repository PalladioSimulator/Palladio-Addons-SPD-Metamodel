/**
 */
package spd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spd.AdjustmentType;
import spd.PolicyConstraint;
import spd.ScalingPolicy;
import spd.ScalingTrigger;
import spd.SpdPackage;
import spd.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.impl.ScalingPolicyImpl#getTargetgroup <em>Targetgroup</em>}</li>
 *   <li>{@link spd.impl.ScalingPolicyImpl#getAdjustmenttype <em>Adjustmenttype</em>}</li>
 *   <li>{@link spd.impl.ScalingPolicyImpl#getScalingtrigger <em>Scalingtrigger</em>}</li>
 *   <li>{@link spd.impl.ScalingPolicyImpl#getPolicyconstraint <em>Policyconstraint</em>}</li>
 *   <li>{@link spd.impl.ScalingPolicyImpl#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link spd.impl.ScalingPolicyImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalingPolicyImpl extends MinimalEObjectImpl.Container implements ScalingPolicy {
	/**
	 * The cached value of the '{@link #getTargetgroup() <em>Targetgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetgroup()
	 * @generated
	 * @ordered
	 */
	protected TargetGroup targetgroup;

	/**
	 * The cached value of the '{@link #getAdjustmenttype() <em>Adjustmenttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustmenttype()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustmenttype;

	/**
	 * The cached value of the '{@link #getScalingtrigger() <em>Scalingtrigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingtrigger()
	 * @generated
	 * @ordered
	 */
	protected ScalingTrigger scalingtrigger;

	/**
	 * The cached value of the '{@link #getPolicyconstraint() <em>Policyconstraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyConstraint> policyconstraint;

	/**
	 * The default value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected String policyName = POLICY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroup getTargetgroup() {
		return targetgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetgroup(TargetGroup newTargetgroup, NotificationChain msgs) {
		TargetGroup oldTargetgroup = targetgroup;
		targetgroup = newTargetgroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__TARGETGROUP, oldTargetgroup, newTargetgroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetgroup(TargetGroup newTargetgroup) {
		if (newTargetgroup != targetgroup) {
			NotificationChain msgs = null;
			if (targetgroup != null)
				msgs = ((InternalEObject)targetgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__TARGETGROUP, null, msgs);
			if (newTargetgroup != null)
				msgs = ((InternalEObject)newTargetgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__TARGETGROUP, null, msgs);
			msgs = basicSetTargetgroup(newTargetgroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__TARGETGROUP, newTargetgroup, newTargetgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmentType getAdjustmenttype() {
		return adjustmenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdjustmenttype(AdjustmentType newAdjustmenttype, NotificationChain msgs) {
		AdjustmentType oldAdjustmenttype = adjustmenttype;
		adjustmenttype = newAdjustmenttype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE, oldAdjustmenttype, newAdjustmenttype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustmenttype(AdjustmentType newAdjustmenttype) {
		if (newAdjustmenttype != adjustmenttype) {
			NotificationChain msgs = null;
			if (adjustmenttype != null)
				msgs = ((InternalEObject)adjustmenttype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE, null, msgs);
			if (newAdjustmenttype != null)
				msgs = ((InternalEObject)newAdjustmenttype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE, null, msgs);
			msgs = basicSetAdjustmenttype(newAdjustmenttype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE, newAdjustmenttype, newAdjustmenttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingTrigger getScalingtrigger() {
		return scalingtrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingtrigger(ScalingTrigger newScalingtrigger, NotificationChain msgs) {
		ScalingTrigger oldScalingtrigger = scalingtrigger;
		scalingtrigger = newScalingtrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__SCALINGTRIGGER, oldScalingtrigger, newScalingtrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingtrigger(ScalingTrigger newScalingtrigger) {
		if (newScalingtrigger != scalingtrigger) {
			NotificationChain msgs = null;
			if (scalingtrigger != null)
				msgs = ((InternalEObject)scalingtrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__SCALINGTRIGGER, null, msgs);
			if (newScalingtrigger != null)
				msgs = ((InternalEObject)newScalingtrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SCALING_POLICY__SCALINGTRIGGER, null, msgs);
			msgs = basicSetScalingtrigger(newScalingtrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__SCALINGTRIGGER, newScalingtrigger, newScalingtrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyConstraint> getPolicyconstraint() {
		if (policyconstraint == null) {
			policyconstraint = new EObjectContainmentEList<PolicyConstraint>(PolicyConstraint.class, this, SpdPackage.SCALING_POLICY__POLICYCONSTRAINT);
		}
		return policyconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyName() {
		return policyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyName(String newPolicyName) {
		String oldPolicyName = policyName;
		policyName = newPolicyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__POLICY_NAME, oldPolicyName, policyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SCALING_POLICY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
				return basicSetTargetgroup(null, msgs);
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
				return basicSetAdjustmenttype(null, msgs);
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
				return basicSetScalingtrigger(null, msgs);
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
				return ((InternalEList<?>)getPolicyconstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
				return getTargetgroup();
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
				return getAdjustmenttype();
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
				return getScalingtrigger();
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
				return getPolicyconstraint();
			case SpdPackage.SCALING_POLICY__POLICY_NAME:
				return getPolicyName();
			case SpdPackage.SCALING_POLICY__ACTIVE:
				return isActive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
				setTargetgroup((TargetGroup)newValue);
				return;
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
				setAdjustmenttype((AdjustmentType)newValue);
				return;
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
				setScalingtrigger((ScalingTrigger)newValue);
				return;
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
				getPolicyconstraint().clear();
				getPolicyconstraint().addAll((Collection<? extends PolicyConstraint>)newValue);
				return;
			case SpdPackage.SCALING_POLICY__POLICY_NAME:
				setPolicyName((String)newValue);
				return;
			case SpdPackage.SCALING_POLICY__ACTIVE:
				setActive((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
				setTargetgroup((TargetGroup)null);
				return;
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
				setAdjustmenttype((AdjustmentType)null);
				return;
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
				setScalingtrigger((ScalingTrigger)null);
				return;
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
				getPolicyconstraint().clear();
				return;
			case SpdPackage.SCALING_POLICY__POLICY_NAME:
				setPolicyName(POLICY_NAME_EDEFAULT);
				return;
			case SpdPackage.SCALING_POLICY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
				return targetgroup != null;
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
				return adjustmenttype != null;
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
				return scalingtrigger != null;
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
				return policyconstraint != null && !policyconstraint.isEmpty();
			case SpdPackage.SCALING_POLICY__POLICY_NAME:
				return POLICY_NAME_EDEFAULT == null ? policyName != null : !POLICY_NAME_EDEFAULT.equals(policyName);
			case SpdPackage.SCALING_POLICY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (policyName: ");
		result.append(policyName);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //ScalingPolicyImpl
