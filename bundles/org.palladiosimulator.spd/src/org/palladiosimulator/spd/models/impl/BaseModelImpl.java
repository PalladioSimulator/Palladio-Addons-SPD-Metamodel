/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.ModelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Model</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.BaseModelImpl#getInterval
 * <em>Interval</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.BaseModelImpl#getIntervalOffset <em>Interval
 * Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseModelImpl extends CDOObjectImpl implements BaseModel {
    /**
     * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected static final double INTERVAL_EDEFAULT = 0.0;
    /**
     * The default value of the '{@link #getIntervalOffset() <em>Interval Offset</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIntervalOffset()
     * @generated
     * @ordered
     */
    protected static final double INTERVAL_OFFSET_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BaseModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.BASE_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getInterval() {
        return (Double) this.eDynamicGet(ModelsPackage.BASE_MODEL__INTERVAL,
                ModelsPackage.Literals.BASE_MODEL__INTERVAL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInterval(final double newInterval) {
        this.eDynamicSet(ModelsPackage.BASE_MODEL__INTERVAL, ModelsPackage.Literals.BASE_MODEL__INTERVAL, newInterval);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getIntervalOffset() {
        return (Double) this.eDynamicGet(ModelsPackage.BASE_MODEL__INTERVAL_OFFSET,
                ModelsPackage.Literals.BASE_MODEL__INTERVAL_OFFSET, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIntervalOffset(final double newIntervalOffset) {
        this.eDynamicSet(ModelsPackage.BASE_MODEL__INTERVAL_OFFSET, ModelsPackage.Literals.BASE_MODEL__INTERVAL_OFFSET,
                newIntervalOffset);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ModelsPackage.BASE_MODEL__INTERVAL:
            return this.getInterval();
        case ModelsPackage.BASE_MODEL__INTERVAL_OFFSET:
            return this.getIntervalOffset();
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
        case ModelsPackage.BASE_MODEL__INTERVAL:
            this.setInterval((Double) newValue);
            return;
        case ModelsPackage.BASE_MODEL__INTERVAL_OFFSET:
            this.setIntervalOffset((Double) newValue);
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
        case ModelsPackage.BASE_MODEL__INTERVAL:
            this.setInterval(INTERVAL_EDEFAULT);
            return;
        case ModelsPackage.BASE_MODEL__INTERVAL_OFFSET:
            this.setIntervalOffset(INTERVAL_OFFSET_EDEFAULT);
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
        case ModelsPackage.BASE_MODEL__INTERVAL:
            return this.getInterval() != INTERVAL_EDEFAULT;
        case ModelsPackage.BASE_MODEL__INTERVAL_OFFSET:
            return this.getIntervalOffset() != INTERVAL_OFFSET_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // BaseModelImpl
