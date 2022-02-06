/**
 */
package spd.policyconstraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spd.policyconstraint.PolicyconstraintPackage
 * @generated
 */
public interface PolicyconstraintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyconstraintFactory eINSTANCE = spd.policyconstraint.impl.PolicyconstraintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Group Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group Size Constraint</em>'.
	 * @generated
	 */
	TargetGroupSizeConstraint createTargetGroupSizeConstraint();

	/**
	 * Returns a new object of class '<em>Intervall Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervall Constraint</em>'.
	 * @generated
	 */
	IntervallConstraint createIntervallConstraint();

	/**
	 * Returns a new object of class '<em>Cooldown Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooldown Constraint</em>'.
	 * @generated
	 */
	CooldownConstraint createCooldownConstraint();

	/**
	 * Returns a new object of class '<em>Thrashing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thrashing Constraint</em>'.
	 * @generated
	 */
	ThrashingConstraint createThrashingConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolicyconstraintPackage getPolicyconstraintPackage();

} //PolicyconstraintFactory
