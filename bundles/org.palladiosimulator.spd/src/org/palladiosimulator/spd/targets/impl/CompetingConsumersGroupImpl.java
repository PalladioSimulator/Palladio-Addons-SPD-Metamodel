/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.spd.targets.CompetingConsumersGroup;
import org.palladiosimulator.spd.targets.TargetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Competing Consumers
 * Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl#getUnitAssembly <em>Unit Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumersGroupImpl extends TargetGroupImpl implements CompetingConsumersGroup {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompetingConsumersGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getUnitAssembly() {
		return (AssemblyContext) eDynamicGet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
				TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetUnitAssembly() {
		return (AssemblyContext) eDynamicGet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
				TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitAssembly(AssemblyContext newUnitAssembly) {
		eDynamicSet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
				TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, newUnitAssembly);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
			if (resolve)
				return getUnitAssembly();
			return basicGetUnitAssembly();
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
		case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
			setUnitAssembly((AssemblyContext) newValue);
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
		case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
			setUnitAssembly((AssemblyContext) null);
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
		case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
			return basicGetUnitAssembly() != null;
		}
		return super.eIsSet(featureID);
	}

} // CompetingConsumersGroupImpl
