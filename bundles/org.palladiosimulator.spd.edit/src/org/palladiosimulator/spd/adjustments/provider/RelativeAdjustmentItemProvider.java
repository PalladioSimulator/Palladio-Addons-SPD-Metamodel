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
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.adjustments.RelativeAdjustment} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RelativeAdjustmentItemProvider extends AdjustmentTypeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public RelativeAdjustmentItemProvider(final AdapterFactory adapterFactory) {
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

            this.addPercentageGrowthValuePropertyDescriptor(object);
            this.addMinAdjustmentValuePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Percentage Growth Value feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPercentageGrowthValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_RelativeAdjustment_percentageGrowthValue_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_RelativeAdjustment_percentageGrowthValue_feature", "_UI_RelativeAdjustment_type"),
                AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Min Adjustment Value feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMinAdjustmentValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_RelativeAdjustment_minAdjustmentValue_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_RelativeAdjustment_minAdjustmentValue_feature", "_UI_RelativeAdjustment_type"),
                AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * Overrides in case of RelativeAdjustment to show the icon pointing down when the value is
     * negative.
     *
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        final RelativeAdjustment relativeAdjustment = (RelativeAdjustment) object;
        if (relativeAdjustment.getPercentageGrowthValue() < 0) {
            return this.overlayImage(object, this.getResourceLocator()
                .getImage("full/spdicons16/adjustment-down.png"));
        }
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
        final RelativeAdjustment relativeAdjustment = (RelativeAdjustment) object;
        return this.getString("_UI_RelativeAdjustment_type") + " " + relativeAdjustment.getPercentageGrowthValue();
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

        switch (notification.getFeatureID(RelativeAdjustment.class)) {
        case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
        case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
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
