/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.spd.targets.ElasticInfrastructure;
import org.palladiosimulator.spd.targets.TargetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Elastic
 * Infrastructure</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl#getPCM_ResourceEnvironment <em>PCM Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.targets.impl.ElasticInfrastructureImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticInfrastructureImpl extends TargetGroupImpl implements ElasticInfrastructure {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.ELASTIC_INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceEnvironment getPCM_ResourceEnvironment() {
		ResourceEnvironment pcM_ResourceEnvironment = basicGetPCM_ResourceEnvironment();
		return pcM_ResourceEnvironment != null && pcM_ResourceEnvironment.eIsProxy()
				? (ResourceEnvironment) eResolveProxy((InternalEObject) pcM_ResourceEnvironment)
				: pcM_ResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public ResourceEnvironment basicGetPCM_ResourceEnvironment() {
		// TODO: implement this method to return the 'PCM Resource Environment' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		return this.getUnit().getResourceEnvironment_ResourceContainer();
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isSetPCM_ResourceEnvironment() {
		// TODO: implement this method to return whether the 'PCM Resource Environment' reference is
		// set
		// Ensure that you remove @generated or mark it @generated NOT
		return this.basicGetUnit().getResourceEnvironment_ResourceContainer() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer getUnit() {
		return (ResourceContainer) eDynamicGet(TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT,
				TargetsPackage.Literals.ELASTIC_INFRASTRUCTURE__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetUnit() {
		return (ResourceContainer) eDynamicGet(TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT,
				TargetsPackage.Literals.ELASTIC_INFRASTRUCTURE__UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(ResourceContainer newUnit) {
		eDynamicSet(TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT, TargetsPackage.Literals.ELASTIC_INFRASTRUCTURE__UNIT,
				newUnit);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
			if (resolve)
				return getPCM_ResourceEnvironment();
			return basicGetPCM_ResourceEnvironment();
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT:
			if (resolve)
				return getUnit();
			return basicGetUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT:
			setUnit((ResourceContainer) newValue);
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
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT:
			setUnit((ResourceContainer) null);
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
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__PCM_RESOURCE_ENVIRONMENT:
			return isSetPCM_ResourceEnvironment();
		case TargetsPackage.ELASTIC_INFRASTRUCTURE__UNIT:
			return basicGetUnit() != null;
		}
		return super.eIsSet(featureID);
	}

} // ElasticInfrastructureImpl
