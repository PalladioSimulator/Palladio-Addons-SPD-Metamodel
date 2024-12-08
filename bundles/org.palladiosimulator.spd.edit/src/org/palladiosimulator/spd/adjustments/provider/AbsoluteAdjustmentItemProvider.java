/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.adjustments.AbsoluteAdjustment} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AbsoluteAdjustmentItemProvider extends AdjustmentTypeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public AbsoluteAdjustmentItemProvider(final AdapterFactory adapterFactory) {
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

            this.addGoalValuePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Goal Value feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addGoalValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AbsoluteAdjustment_goalValue_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_AbsoluteAdjustment_goalValue_feature",
                        "_UI_AbsoluteAdjustment_type"),
                AdjustmentsPackage.Literals.ABSOLUTE_ADJUSTMENT__GOAL_VALUE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * Returns adjustment icon. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return super.getImage(object);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final AbsoluteAdjustment absoluteAdjustment = (AbsoluteAdjustment) object;
        return this.getString("_UI_AbsoluteAdjustment_type") + " " + absoluteAdjustment.getGoalValue();
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

        switch (notification.getFeatureID(AbsoluteAdjustment.class)) {
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
