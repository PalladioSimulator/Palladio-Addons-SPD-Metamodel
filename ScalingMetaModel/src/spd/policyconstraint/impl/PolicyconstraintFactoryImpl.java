/**
 */
package spd.policyconstraint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spd.policyconstraint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyconstraintFactoryImpl extends EFactoryImpl implements PolicyconstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolicyconstraintFactory init() {
		try {
			PolicyconstraintFactory thePolicyconstraintFactory = (PolicyconstraintFactory)EPackage.Registry.INSTANCE.getEFactory(PolicyconstraintPackage.eNS_URI);
			if (thePolicyconstraintFactory != null) {
				return thePolicyconstraintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolicyconstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyconstraintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT: return createTargetGroupSizeConstraint();
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT: return createIntervallConstraint();
			case PolicyconstraintPackage.COOLDOWN_CONSTRAINT: return createCooldownConstraint();
			case PolicyconstraintPackage.THRASHING_CONSTRAINT: return createThrashingConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroupSizeConstraint createTargetGroupSizeConstraint() {
		TargetGroupSizeConstraintImpl targetGroupSizeConstraint = new TargetGroupSizeConstraintImpl();
		return targetGroupSizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervallConstraint createIntervallConstraint() {
		IntervallConstraintImpl intervallConstraint = new IntervallConstraintImpl();
		return intervallConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CooldownConstraint createCooldownConstraint() {
		CooldownConstraintImpl cooldownConstraint = new CooldownConstraintImpl();
		return cooldownConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrashingConstraint createThrashingConstraint() {
		ThrashingConstraintImpl thrashingConstraint = new ThrashingConstraintImpl();
		return thrashingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyconstraintPackage getPolicyconstraintPackage() {
		return (PolicyconstraintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolicyconstraintPackage getPackage() {
		return PolicyconstraintPackage.eINSTANCE;
	}

} //PolicyconstraintFactoryImpl
