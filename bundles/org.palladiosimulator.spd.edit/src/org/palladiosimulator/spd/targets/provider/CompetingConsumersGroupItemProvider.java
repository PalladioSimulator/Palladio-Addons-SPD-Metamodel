/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.spd.targets.CompetingConsumersGroup;
import org.palladiosimulator.spd.targets.TargetsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.targets.CompetingConsumersGroup} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CompetingConsumersGroupItemProvider extends TargetGroupItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public CompetingConsumersGroupItemProvider(final AdapterFactory adapterFactory) {
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

            this.addUnitAssemblyPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Unit Assembly feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addUnitAssemblyPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_CompetingConsumersGroup_unitAssembly_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_CompetingConsumersGroup_unitAssembly_feature",
                        "_UI_CompetingConsumersGroup_type"),
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY, true, false, true, null, null, null));
    }

    /*
     * This overrides and reuses the icon for a TargetGroup. <!-- begin-user-doc --> <!--
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
        final String label = ((CompetingConsumersGroup) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_CompetingConsumersGroup_type")
                : this.getString("_UI_CompetingConsumersGroup_type") + " " + label;
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
