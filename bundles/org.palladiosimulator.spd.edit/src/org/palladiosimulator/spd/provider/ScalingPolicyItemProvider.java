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
import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.constraints.policy.PolicyFactory;
import org.palladiosimulator.spd.triggers.TriggersFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.spd.ScalingPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingPolicyItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActivePropertyDescriptor(object);
			addTargetGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ScalingPolicy_active_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_active_feature",
								"_UI_ScalingPolicy_type"),
						SpdPackage.Literals.SCALING_POLICY__ACTIVE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ScalingPolicy_targetGroup_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_targetGroup_feature",
								"_UI_ScalingPolicy_type"),
						SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENT_TYPE);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__SCALING_TRIGGER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the icon for the ScalingPolicy.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/spdicons16/policy-icon.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScalingPolicy) object).getEntityName();
		return label == null || label.length() == 0 ? getString("_UI_ScalingPolicy_type")
				: getString("_UI_ScalingPolicy_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScalingPolicy.class)) {
		case SpdPackage.SCALING_POLICY__ACTIVE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SpdPackage.SCALING_POLICY__ADJUSTMENT_TYPE:
		case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
		case SpdPackage.SCALING_POLICY__SCALING_TRIGGER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENT_TYPE,
				AdjustmentsFactory.eINSTANCE.createRelativeAdjustment()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENT_TYPE,
				AdjustmentsFactory.eINSTANCE.createAbsoluteAdjustment()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENT_TYPE,
				AdjustmentsFactory.eINSTANCE.createStepAdjustment()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS,
				PolicyFactory.eINSTANCE.createIntervallConstraint()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__SCALING_TRIGGER,
				TriggersFactory.eINSTANCE.createComposedTrigger()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__SCALING_TRIGGER,
				TriggersFactory.eINSTANCE.createSimpleFireOnValue()));

		newChildDescriptors.add(createChildParameter(SpdPackage.Literals.SCALING_POLICY__SCALING_TRIGGER,
				TriggersFactory.eINSTANCE.createSimpleFireOnTrend()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScalingPolicyDefinitionEditPlugin.INSTANCE;
	}

}
