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

import spd.SPD;
import spd.ScalingPolicy;
import spd.SpdPackage;
import spd.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.impl.SPDImpl#getScalingpolicy <em>Scalingpolicy</em>}</li>
 *   <li>{@link spd.impl.SPDImpl#getName <em>Name</em>}</li>
 *   <li>{@link spd.impl.SPDImpl#getTargetgroups <em>Targetgroups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDImpl extends MinimalEObjectImpl.Container implements SPD {
	/**
	 * The cached value of the '{@link #getScalingpolicy() <em>Scalingpolicy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingpolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalingPolicy> scalingpolicy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetgroups() <em>Targetgroups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetgroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetGroup> targetgroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScalingPolicy> getScalingpolicy() {
		if (scalingpolicy == null) {
			scalingpolicy = new EObjectContainmentEList<ScalingPolicy>(ScalingPolicy.class, this, SpdPackage.SPD__SCALINGPOLICY);
		}
		return scalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SPD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetGroup> getTargetgroups() {
		if (targetgroups == null) {
			targetgroups = new EObjectContainmentEList<TargetGroup>(TargetGroup.class, this, SpdPackage.SPD__TARGETGROUPS);
		}
		return targetgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.SPD__SCALINGPOLICY:
				return ((InternalEList<?>)getScalingpolicy()).basicRemove(otherEnd, msgs);
			case SpdPackage.SPD__TARGETGROUPS:
				return ((InternalEList<?>)getTargetgroups()).basicRemove(otherEnd, msgs);
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
			case SpdPackage.SPD__SCALINGPOLICY:
				return getScalingpolicy();
			case SpdPackage.SPD__NAME:
				return getName();
			case SpdPackage.SPD__TARGETGROUPS:
				return getTargetgroups();
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
			case SpdPackage.SPD__SCALINGPOLICY:
				getScalingpolicy().clear();
				getScalingpolicy().addAll((Collection<? extends ScalingPolicy>)newValue);
				return;
			case SpdPackage.SPD__NAME:
				setName((String)newValue);
				return;
			case SpdPackage.SPD__TARGETGROUPS:
				getTargetgroups().clear();
				getTargetgroups().addAll((Collection<? extends TargetGroup>)newValue);
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
			case SpdPackage.SPD__SCALINGPOLICY:
				getScalingpolicy().clear();
				return;
			case SpdPackage.SPD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpdPackage.SPD__TARGETGROUPS:
				getTargetgroups().clear();
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
			case SpdPackage.SPD__SCALINGPOLICY:
				return scalingpolicy != null && !scalingpolicy.isEmpty();
			case SpdPackage.SPD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpdPackage.SPD__TARGETGROUPS:
				return targetgroups != null && !targetgroups.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SPDImpl
