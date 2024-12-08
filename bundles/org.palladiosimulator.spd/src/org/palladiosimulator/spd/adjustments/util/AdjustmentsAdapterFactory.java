/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentType;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;
import org.palladiosimulator.spd.adjustments.StepAdjustment;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage
 * @generated
 */
public class AdjustmentsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static AdjustmentsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AdjustmentsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = AdjustmentsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected AdjustmentsSwitch<Adapter> modelSwitch = new AdjustmentsSwitch<>() {
        @Override
        public Adapter caseAdjustmentType(final AdjustmentType object) {
            return AdjustmentsAdapterFactory.this.createAdjustmentTypeAdapter();
        }

        @Override
        public Adapter caseRelativeAdjustment(final RelativeAdjustment object) {
            return AdjustmentsAdapterFactory.this.createRelativeAdjustmentAdapter();
        }

        @Override
        public Adapter caseAbsoluteAdjustment(final AbsoluteAdjustment object) {
            return AdjustmentsAdapterFactory.this.createAbsoluteAdjustmentAdapter();
        }

        @Override
        public Adapter caseStepAdjustment(final StepAdjustment object) {
            return AdjustmentsAdapterFactory.this.createStepAdjustmentAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return AdjustmentsAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.adjustments.AdjustmentType <em>Adjustment Type</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.adjustments.AdjustmentType
     * @generated
     */
    public Adapter createAdjustmentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.adjustments.RelativeAdjustment <em>Relative
     * Adjustment</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.adjustments.RelativeAdjustment
     * @generated
     */
    public Adapter createRelativeAdjustmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.adjustments.AbsoluteAdjustment <em>Absolute
     * Adjustment</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.adjustments.AbsoluteAdjustment
     * @generated
     */
    public Adapter createAbsoluteAdjustmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.adjustments.StepAdjustment <em>Step Adjustment</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.adjustments.StepAdjustment
     * @generated
     */
    public Adapter createStepAdjustmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // AdjustmentsAdapterFactory
