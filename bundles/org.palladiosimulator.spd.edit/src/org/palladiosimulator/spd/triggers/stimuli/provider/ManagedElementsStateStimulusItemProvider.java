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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ManagedElementsStateStimulusItemProvider extends TargetGroupStateStimulusItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ManagedElementsStateStimulusItemProvider(final AdapterFactory adapterFactory) {
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

            this.addAggregationOverElementsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aggregation Over Elements feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAggregationOverElementsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ManagedElementsStateStimulus_aggregationOverElements_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ManagedElementsStateStimulus_aggregationOverElements_feature",
                        "_UI_ManagedElementsStateStimulus_type"),
                StimuliPackage.Literals.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        return this.getTextForStimulusName(object, this.getString("_UI_ManagedElementsStateStimulus_type"));
    }

    /**
     * This is a helper function for constructing the label text for the adapted class.
     *
     * @param object
     * @param name
     *            The name of the stimulus, can be obtained with {@link #getString(String)}
     * @return
     */
    protected String getTextForStimulusName(final Object object, final String name) {
        final StringBuilder stringBuilder = new StringBuilder(name);
        final AGGREGATIONMETHOD labelValue = ((ManagedElementsStateStimulus) object).getAggregationOverElements();
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

        switch (notification.getFeatureID(ManagedElementsStateStimulus.class)) {
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
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
