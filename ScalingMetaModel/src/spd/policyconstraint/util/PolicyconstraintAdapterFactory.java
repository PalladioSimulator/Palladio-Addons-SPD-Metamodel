/**
 */
package spd.policyconstraint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spd.policyconstraint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spd.policyconstraint.PolicyconstraintPackage
 * @generated
 */
public class PolicyconstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyconstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyconstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolicyconstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyconstraintSwitch<Adapter> modelSwitch =
		new PolicyconstraintSwitch<Adapter>() {
			@Override
			public Adapter casePolicyConstraint(PolicyConstraint object) {
				return createPolicyConstraintAdapter();
			}
			@Override
			public Adapter caseTemporalConstraint(TemporalConstraint object) {
				return createTemporalConstraintAdapter();
			}
			@Override
			public Adapter caseTargetGroupSizeConstraint(TargetGroupSizeConstraint object) {
				return createTargetGroupSizeConstraintAdapter();
			}
			@Override
			public Adapter caseIntervallConstraint(IntervallConstraint object) {
				return createIntervallConstraintAdapter();
			}
			@Override
			public Adapter caseCooldownConstraint(CooldownConstraint object) {
				return createCooldownConstraintAdapter();
			}
			@Override
			public Adapter caseStateBasedContraint(StateBasedContraint object) {
				return createStateBasedContraintAdapter();
			}
			@Override
			public Adapter caseThrashingConstraint(ThrashingConstraint object) {
				return createThrashingConstraintAdapter();
			}
			@Override
			public Adapter caseSpd_PolicyConstraint(spd.PolicyConstraint object) {
				return createSpd_PolicyConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.PolicyConstraint
	 * @generated
	 */
	public Adapter createPolicyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.TemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.TemporalConstraint
	 * @generated
	 */
	public Adapter createTemporalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.TargetGroupSizeConstraint <em>Target Group Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.TargetGroupSizeConstraint
	 * @generated
	 */
	public Adapter createTargetGroupSizeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.IntervallConstraint <em>Intervall Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.IntervallConstraint
	 * @generated
	 */
	public Adapter createIntervallConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.CooldownConstraint <em>Cooldown Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.CooldownConstraint
	 * @generated
	 */
	public Adapter createCooldownConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.StateBasedContraint <em>State Based Contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.StateBasedContraint
	 * @generated
	 */
	public Adapter createStateBasedContraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.policyconstraint.ThrashingConstraint <em>Thrashing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.policyconstraint.ThrashingConstraint
	 * @generated
	 */
	public Adapter createThrashingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.PolicyConstraint <em>Policy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.PolicyConstraint
	 * @generated
	 */
	public Adapter createSpd_PolicyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolicyconstraintAdapterFactory
