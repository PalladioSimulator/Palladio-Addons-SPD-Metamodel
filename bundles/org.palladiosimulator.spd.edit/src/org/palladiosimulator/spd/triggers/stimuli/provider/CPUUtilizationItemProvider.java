/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.triggers.stimuli.CPUUtilization} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CPUUtilizationItemProvider extends ResourceUtilizationStimulusItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public CPUUtilizationItemProvider(final AdapterFactory adapterFactory) {
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
     * This returns the icon for the CPUUtil trigger. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/spdicons16/stimulus-cpu.png"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        final StringBuilder stringBuilder = new StringBuilder(this.getString("_UI_CPUUtilization_type"));
        final AGGREGATIONMETHOD labelValue = ((CPUUtilization) object).getAggregationOverElements();
        if (labelValue != null && labelValue.toString()
            .length() != 0) {
            stringBuilder.append(" ")
                .append(labelValue.toString());
        }
        stringBuilder.append(this.getRoleText(object));
        return stringBuilder.toString();
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
