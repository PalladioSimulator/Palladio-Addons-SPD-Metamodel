/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.models.LearningBasedModel} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class LearningBasedModelItemProvider extends BaseModelItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public LearningBasedModelItemProvider(final AdapterFactory adapterFactory) {
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

            this.addLearningRatePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Learning Rate feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addLearningRatePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_LearningBasedModel_learningRate_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_LearningBasedModel_learningRate_feature",
                        "_UI_LearningBasedModel_type"),
                ModelsPackage.Literals.LEARNING_BASED_MODEL__LEARNING_RATE, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns LearningBasedModel.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/LearningBasedModel"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final LearningBasedModel learningBasedModel = (LearningBasedModel) object;
        return this.getString("_UI_LearningBasedModel_type") + " " + learningBasedModel.getInterval();
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

        switch (notification.getFeatureID(LearningBasedModel.class)) {
        case ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE:
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
