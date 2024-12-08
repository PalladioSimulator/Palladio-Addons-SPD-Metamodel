/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;
import org.palladiosimulator.spd.constraints.provider.TemporalConstraintItemProvider;
import org.palladiosimulator.spd.provider.ScalingPolicyDefinitionEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class IntervalConstraintItemProvider extends TemporalConstraintItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public IntervalConstraintItemProvider(final AdapterFactory adapterFactory) {
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

            this.addOffsetPropertyDescriptor(object);
            this.addIntervalDurationPropertyDescriptor(object);
            this.addRepeatPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Offset feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addOffsetPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_IntervalConstraint_offset_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_IntervalConstraint_offset_feature",
                        "_UI_IntervalConstraint_type"),
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__OFFSET, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Interval Duration feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addIntervalDurationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_IntervalConstraint_intervalDuration_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_IntervalConstraint_intervalDuration_feature",
                        "_UI_IntervalConstraint_type"),
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__INTERVAL_DURATION, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Repeat feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRepeatPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_IntervalConstraint_repeat_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_IntervalConstraint_repeat_feature",
                        "_UI_IntervalConstraint_type"),
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__REPEAT, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /*
     * This overrides and reuses the icon for a Constraint. <!-- begin-user-doc --> <!--
     * end-user-doc -->
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
        final String label = ((IntervalConstraint) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_IntervalConstraint_type")
                : this.getString("_UI_IntervalConstraint_type") + " " + label;
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

        switch (notification.getFeatureID(IntervalConstraint.class)) {
        case PolicyPackage.INTERVAL_CONSTRAINT__OFFSET:
        case PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION:
        case PolicyPackage.INTERVAL_CONSTRAINT__REPEAT:
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

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ScalingPolicyDefinitionEditPlugin.INSTANCE;
    }

}
