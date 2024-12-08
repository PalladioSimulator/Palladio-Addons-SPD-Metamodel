/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.triggers.stimuli.QueueLength} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueueLengthItemProvider extends SourceInterfaceStimulusItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public QueueLengthItemProvider(final AdapterFactory adapterFactory) {
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

            this.addPassiveResourcePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Passive Resource feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPassiveResourcePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_QueueLength_passiveResource_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_QueueLength_passiveResource_feature",
                        "_UI_QueueLength_type"),
                StimuliPackage.Literals.QUEUE_LENGTH__PASSIVE_RESOURCE, true, false, true, null, null, null));
    }

    /**
     * This returns the icon for queue length stimulus. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/spdicons16/stimulus-queuelength.png"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_QueueLength_type") + this.getRoleText(object);
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
