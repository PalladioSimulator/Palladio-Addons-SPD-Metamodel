/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.constraints.target.TargetPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetGroupSizeConstraintItemProvider extends TargetConstraintItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public TargetGroupSizeConstraintItemProvider(final AdapterFactory adapterFactory) {
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

            this.addMinSizePropertyDescriptor(object);
            this.addMaxSizePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Min Size feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMinSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_TargetGroupSizeConstraint_minSize_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_TargetGroupSizeConstraint_minSize_feature",
                        "_UI_TargetGroupSizeConstraint_type"),
                TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Max Size feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMaxSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_TargetGroupSizeConstraint_maxSize_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_TargetGroupSizeConstraint_maxSize_feature",
                        "_UI_TargetGroupSizeConstraint_type"),
                TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
        final String label = ((TargetGroupSizeConstraint) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_TargetGroupSizeConstraint_type")
                : this.getString("_UI_TargetGroupSizeConstraint_type") + " " + label;
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

        switch (notification.getFeatureID(TargetGroupSizeConstraint.class)) {
        case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
        case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
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
