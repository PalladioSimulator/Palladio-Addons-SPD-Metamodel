/**
 */
package spd.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spd.ScalingPolicy;
import spd.SpdPackage;

import spd.adjustmenttype.AdjustmenttypeFactory;

import spd.policyconstraint.PolicyconstraintFactory;

import spd.scalingtrigger.ScalingtriggerFactory;
import spd.targetgroup.TargetgroupFactory;

/**
 * This is the item provider adapter for a {@link spd.ScalingPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingPolicyItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
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

			addTargetgroupPropertyDescriptor(object);
			addPolicyNamePropertyDescriptor(object);
			addActivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Targetgroup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetgroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalingPolicy_targetgroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_targetgroup_feature", "_UI_ScalingPolicy_type"),
				 SpdPackage.Literals.SCALING_POLICY__TARGETGROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Policy Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalingPolicy_policyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_policyName_feature", "_UI_ScalingPolicy_type"),
				 SpdPackage.Literals.SCALING_POLICY__POLICY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalingPolicy_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalingPolicy_active_feature", "_UI_ScalingPolicy_type"),
				 SpdPackage.Literals.SCALING_POLICY__ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__TARGETGROUP);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENTTYPE);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER);
			childrenFeatures.add(SpdPackage.Literals.SCALING_POLICY__POLICYCONSTRAINT);
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
	 * This returns ScalingPolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScalingPolicy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScalingPolicy)object).getPolicyName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScalingPolicy_type") :
			getString("_UI_ScalingPolicy_type") + " " + label;
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
			case SpdPackage.SCALING_POLICY__POLICY_NAME:
			case SpdPackage.SCALING_POLICY__ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpdPackage.SCALING_POLICY__TARGETGROUP:
			case SpdPackage.SCALING_POLICY__ADJUSTMENTTYPE:
			case SpdPackage.SCALING_POLICY__SCALINGTRIGGER:
			case SpdPackage.SCALING_POLICY__POLICYCONSTRAINT:
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

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__TARGETGROUP,
				 TargetgroupFactory.eINSTANCE.createTargetGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENTTYPE,
				 AdjustmenttypeFactory.eINSTANCE.createRelativeAdjustment()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENTTYPE,
				 AdjustmenttypeFactory.eINSTANCE.createAbsoluteAdjustment()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__ADJUSTMENTTYPE,
				 AdjustmenttypeFactory.eINSTANCE.createStepAdjustment()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createCPUUtilizationTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createRAMUtilizationTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createHDDUtilizationTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createPointInTimeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createIdleTimeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createTaskCountTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createNetworkUtilizationTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__SCALINGTRIGGER,
				 ScalingtriggerFactory.eINSTANCE.createResponseTimeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__POLICYCONSTRAINT,
				 PolicyconstraintFactory.eINSTANCE.createTargetGroupSizeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__POLICYCONSTRAINT,
				 PolicyconstraintFactory.eINSTANCE.createIntervallConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__POLICYCONSTRAINT,
				 PolicyconstraintFactory.eINSTANCE.createCooldownConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SpdPackage.Literals.SCALING_POLICY__POLICYCONSTRAINT,
				 PolicyconstraintFactory.eINSTANCE.createThrashingConstraint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SPDEditPlugin.INSTANCE;
	}

}
