/**
 */
package spd.targetgroup.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import spd.targetgroup.TargetGroup;
import spd.targetgroup.TargetgroupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.targetgroup.impl.TargetGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link spd.targetgroup.impl.TargetGroupImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetGroupImpl extends spd.impl.TargetGroupImpl implements TargetGroup {
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
	 * The cached value of the '{@link #getResourceEnvironment() <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvironment resourceEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetgroupPackage.Literals.TARGET_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetgroupPackage.TARGET_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceEnvironment getResourceEnvironment() {
		if (resourceEnvironment != null && resourceEnvironment.eIsProxy()) {
			InternalEObject oldResourceEnvironment = (InternalEObject)resourceEnvironment;
			resourceEnvironment = (ResourceEnvironment)eResolveProxy(oldResourceEnvironment);
			if (resourceEnvironment != oldResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
			}
		}
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment basicGetResourceEnvironment() {
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		ResourceEnvironment oldResourceEnvironment = resourceEnvironment;
		resourceEnvironment = newResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetgroupPackage.TARGET_GROUP__NAME:
				return getName();
			case TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT:
				if (resolve) return getResourceEnvironment();
				return basicGetResourceEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetgroupPackage.TARGET_GROUP__NAME:
				setName((String)newValue);
				return;
			case TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)newValue);
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
			case TargetgroupPackage.TARGET_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)null);
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
			case TargetgroupPackage.TARGET_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetgroupPackage.TARGET_GROUP__RESOURCE_ENVIRONMENT:
				return resourceEnvironment != null;
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

} //TargetGroupImpl
