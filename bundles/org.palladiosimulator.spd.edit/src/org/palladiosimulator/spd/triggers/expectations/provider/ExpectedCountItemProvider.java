/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpectedCountItemProvider extends ExpectedPrimitiveItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ExpectedCountItemProvider(final AdapterFactory adapterFactory) {
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

            this.addCountPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Count feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addCountPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ExpectedCount_count_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ExpectedCount_count_feature",
                        "_UI_ExpectedCount_type"),
                ExpectationsPackage.Literals.EXPECTED_COUNT__COUNT, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ExpectedCount.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/ExpectedCount"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final ExpectedCount expectedCount = (ExpectedCount) object;
        return this.getString("_UI_ExpectedCount_type") + " " + expectedCount.getCount();
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

        switch (notification.getFeatureID(ExpectedCount.class)) {
        case ExpectationsPackage.EXPECTED_COUNT__COUNT:
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
