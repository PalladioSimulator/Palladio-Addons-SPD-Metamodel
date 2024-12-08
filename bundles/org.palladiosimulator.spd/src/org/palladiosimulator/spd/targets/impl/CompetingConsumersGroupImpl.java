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
 * <li>{@link org.palladiosimulator.spd.targets.impl.CompetingConsumersGroupImpl#getUnitAssembly
 * <em>Unit Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumersGroupImpl extends TargetGroupImpl implements CompetingConsumersGroup {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompetingConsumersGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AssemblyContext getUnitAssembly() {
        return (AssemblyContext) this.eDynamicGet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AssemblyContext basicGetUnitAssembly() {
        return (AssemblyContext) this.eDynamicGet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnitAssembly(final AssemblyContext newUnitAssembly) {
        this.eDynamicSet(TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, newUnitAssembly);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
            if (resolve) {
                return this.getUnitAssembly();
            }
            return this.basicGetUnitAssembly();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
            this.setUnitAssembly((AssemblyContext) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
            this.setUnitAssembly((AssemblyContext) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case TargetsPackage.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY:
            return this.basicGetUnitAssembly() != null;
        }
        return super.eIsSet(featureID);
    }

} // CompetingConsumersGroupImpl
