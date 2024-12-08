/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.constraints.policy.PolicyFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.ScalingPolicy} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ScalingPolicyItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ScalingPolicyItemProvider(final AdapterFactory adapterFactory) {
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

            this.addActivePropertyDescriptor(object);
            this.addTargetGroupPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Active feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addActivePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ScalingPolicy_active_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_active_feature",
                        "_UI_ScalingPolicy_type"),
                SpdPackage.Literals.SCALING_POLICY__ACTIVE, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Target Group feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addTargetGroupPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ScalingPolicy_targetGroup_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_targetGroup_feature",
                        "_UI_ScalingPolicy_type"),
                SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, true, false, true, null, null, null));
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
            this.childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS);
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
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ScalingPolicy) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ScalingPolicy_type")
                : this.getString("_UI_ScalingPolicy_type") + " " + label;
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

        switch (notification.getFeatureID(ScalingPolicy.class)) {
        case SpdPackage.SCALING_POLICY__ACTIVE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
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

        newChildDescriptors.add(this.createChildParameter(SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS,
                PolicyFactory.eINSTANCE.createIntervalConstraint()));

        newChildDescriptors.add(this.createChildParameter(SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS,
                PolicyFactory.eINSTANCE.createCooldownConstraint()));
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
