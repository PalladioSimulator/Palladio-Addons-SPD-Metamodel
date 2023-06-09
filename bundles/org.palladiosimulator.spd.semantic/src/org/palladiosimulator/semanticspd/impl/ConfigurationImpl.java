/**
 */
package org.palladiosimulator.semanticspd.impl;

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

import org.palladiosimulator.pcm.allocation.Allocation;

import org.palladiosimulator.pcm.repository.Repository;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

import org.palladiosimulator.semanticspd.Configuration;
import org.palladiosimulator.semanticspd.SemanticspdPackage;
import org.palladiosimulator.semanticspd.TargetGroupCfg;

import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.ScalingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getSpd <em>Spd</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getEnactedPolicy <em>Enacted Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getTargetCfgs <em>Target Cfgs</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.impl.ConfigurationImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getSpd() <em>Spd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpd()
	 * @generated
	 * @ordered
	 */
	protected SPD spd;

	/**
	 * The cached value of the '{@link #getEnactedPolicy() <em>Enacted Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnactedPolicy()
	 * @generated
	 * @ordered
	 */
	protected ScalingPolicy enactedPolicy;

	/**
	 * The cached value of the '{@link #getTargetCfgs() <em>Target Cfgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCfgs()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetGroupCfg> targetCfgs;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation allocation;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.system.System system;

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
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticspdPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD getSpd() {
		if (spd != null && spd.eIsProxy()) {
			InternalEObject oldSpd = (InternalEObject)spd;
			spd = (SPD)eResolveProxy(oldSpd);
			if (spd != oldSpd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__SPD, oldSpd, spd));
			}
		}
		return spd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD basicGetSpd() {
		return spd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpd(SPD newSpd) {
		SPD oldSpd = spd;
		spd = newSpd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__SPD, oldSpd, spd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy getEnactedPolicy() {
		if (enactedPolicy != null && enactedPolicy.eIsProxy()) {
			InternalEObject oldEnactedPolicy = (InternalEObject)enactedPolicy;
			enactedPolicy = (ScalingPolicy)eResolveProxy(oldEnactedPolicy);
			if (enactedPolicy != oldEnactedPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__ENACTED_POLICY, oldEnactedPolicy, enactedPolicy));
			}
		}
		return enactedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy basicGetEnactedPolicy() {
		return enactedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnactedPolicy(ScalingPolicy newEnactedPolicy) {
		ScalingPolicy oldEnactedPolicy = enactedPolicy;
		enactedPolicy = newEnactedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__ENACTED_POLICY, oldEnactedPolicy, enactedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetGroupCfg> getTargetCfgs() {
		if (targetCfgs == null) {
			targetCfgs = new EObjectContainmentEList<TargetGroupCfg>(TargetGroupCfg.class, this, SemanticspdPackage.CONFIGURATION__TARGET_CFGS);
		}
		return targetCfgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getAllocation() {
		if (allocation != null && allocation.eIsProxy()) {
			InternalEObject oldAllocation = (InternalEObject)allocation;
			allocation = (Allocation)eResolveProxy(oldAllocation);
			if (allocation != oldAllocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__ALLOCATION, oldAllocation, allocation));
			}
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation basicGetAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(Allocation newAllocation) {
		Allocation oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__ALLOCATION, oldAllocation, allocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (org.palladiosimulator.pcm.system.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(org.palladiosimulator.pcm.system.System newSystem) {
		org.palladiosimulator.pcm.system.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getResourceEnvironment() {
		if (resourceEnvironment != null && resourceEnvironment.eIsProxy()) {
			InternalEObject oldResourceEnvironment = (InternalEObject)resourceEnvironment;
			resourceEnvironment = (ResourceEnvironment)eResolveProxy(oldResourceEnvironment);
			if (resourceEnvironment != oldResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
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
	public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		ResourceEnvironment oldResourceEnvironment = resourceEnvironment;
		resourceEnvironment = newResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (Repository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.CONFIGURATION__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.CONFIGURATION__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticspdPackage.CONFIGURATION__TARGET_CFGS:
				return ((InternalEList<?>)getTargetCfgs()).basicRemove(otherEnd, msgs);
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
			case SemanticspdPackage.CONFIGURATION__SPD:
				if (resolve) return getSpd();
				return basicGetSpd();
			case SemanticspdPackage.CONFIGURATION__ENACTED_POLICY:
				if (resolve) return getEnactedPolicy();
				return basicGetEnactedPolicy();
			case SemanticspdPackage.CONFIGURATION__TARGET_CFGS:
				return getTargetCfgs();
			case SemanticspdPackage.CONFIGURATION__ALLOCATION:
				if (resolve) return getAllocation();
				return basicGetAllocation();
			case SemanticspdPackage.CONFIGURATION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT:
				if (resolve) return getResourceEnvironment();
				return basicGetResourceEnvironment();
			case SemanticspdPackage.CONFIGURATION__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
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
			case SemanticspdPackage.CONFIGURATION__SPD:
				setSpd((SPD)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__ENACTED_POLICY:
				setEnactedPolicy((ScalingPolicy)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__TARGET_CFGS:
				getTargetCfgs().clear();
				getTargetCfgs().addAll((Collection<? extends TargetGroupCfg>)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__ALLOCATION:
				setAllocation((Allocation)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)newValue);
				return;
			case SemanticspdPackage.CONFIGURATION__REPOSITORY:
				setRepository((Repository)newValue);
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
			case SemanticspdPackage.CONFIGURATION__SPD:
				setSpd((SPD)null);
				return;
			case SemanticspdPackage.CONFIGURATION__ENACTED_POLICY:
				setEnactedPolicy((ScalingPolicy)null);
				return;
			case SemanticspdPackage.CONFIGURATION__TARGET_CFGS:
				getTargetCfgs().clear();
				return;
			case SemanticspdPackage.CONFIGURATION__ALLOCATION:
				setAllocation((Allocation)null);
				return;
			case SemanticspdPackage.CONFIGURATION__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)null);
				return;
			case SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)null);
				return;
			case SemanticspdPackage.CONFIGURATION__REPOSITORY:
				setRepository((Repository)null);
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
			case SemanticspdPackage.CONFIGURATION__SPD:
				return spd != null;
			case SemanticspdPackage.CONFIGURATION__ENACTED_POLICY:
				return enactedPolicy != null;
			case SemanticspdPackage.CONFIGURATION__TARGET_CFGS:
				return targetCfgs != null && !targetCfgs.isEmpty();
			case SemanticspdPackage.CONFIGURATION__ALLOCATION:
				return allocation != null;
			case SemanticspdPackage.CONFIGURATION__SYSTEM:
				return system != null;
			case SemanticspdPackage.CONFIGURATION__RESOURCE_ENVIRONMENT:
				return resourceEnvironment != null;
			case SemanticspdPackage.CONFIGURATION__REPOSITORY:
				return repository != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
