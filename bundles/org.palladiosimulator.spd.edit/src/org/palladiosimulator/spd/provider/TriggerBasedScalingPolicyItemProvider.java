/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;
import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.triggers.TriggersFactory;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.TriggerBasedScalingPolicy} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class TriggerBasedScalingPolicyItemProvider extends ScalingPolicyItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public TriggerBasedScalingPolicyItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE);
            this.childrenFeatures.add(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns TriggerBasedScalingPolicy.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/spdicons16/triggerbased-policy-icon.png"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        final String label = ((TriggerBasedScalingPolicy) object).getEntityName();
        return label == null || label.length() == 0 ? this.getString("_UI_TriggerBasedScalingPolicy_type")
                : this.getString("_UI_TriggerBasedScalingPolicy_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(TriggerBasedScalingPolicy.class)) {
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE,
                    AdjustmentsFactory.eINSTANCE.createRelativeAdjustment()));

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE,
                    AdjustmentsFactory.eINSTANCE.createAbsoluteAdjustment()));

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE,
                    AdjustmentsFactory.eINSTANCE.createStepAdjustment()));

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER,
                    TriggersFactory.eINSTANCE.createComposedTrigger()));

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER,
                    TriggersFactory.eINSTANCE.createSimpleFireOnValue()));

        newChildDescriptors
            .add(this.createChildParameter(SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER,
                    TriggersFactory.eINSTANCE.createSimpleFireOnTrend()));
    }

}
