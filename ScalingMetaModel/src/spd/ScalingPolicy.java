/**
 */
package spd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scaling policy determines the complete information for scaling a parituclar target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.ScalingPolicy#getTargetgroup <em>Targetgroup</em>}</li>
 *   <li>{@link spd.ScalingPolicy#getAdjustmenttype <em>Adjustmenttype</em>}</li>
 *   <li>{@link spd.ScalingPolicy#getScalingtrigger <em>Scalingtrigger</em>}</li>
 *   <li>{@link spd.ScalingPolicy#getPolicyconstraint <em>Policyconstraint</em>}</li>
 *   <li>{@link spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link spd.ScalingPolicy#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see spd.SpdPackage#getScalingPolicy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='policyNameInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot policyNameInvariant='policyName &lt;&gt;\'\''"
 * @generated
 */
public interface ScalingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Targetgroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TargetGroup on which the policy applies. It may be for example a the set of replicated components offering a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targetgroup</em>' reference.
	 * @see #setTargetgroup(TargetGroup)
	 * @see spd.SpdPackage#getScalingPolicy_Targetgroup()
	 * @model required="true"
	 * @generated
	 */
	TargetGroup getTargetgroup();

	/**
	 * Sets the value of the '{@link spd.ScalingPolicy#getTargetgroup <em>Targetgroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetgroup</em>' reference.
	 * @see #getTargetgroup()
	 * @generated
	 */
	void setTargetgroup(TargetGroup value);

	/**
	 * Returns the value of the '<em><b>Adjustmenttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way the number of unit elements (e.g., number of components) in the target group is adjusted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustmenttype</em>' containment reference.
	 * @see #setAdjustmenttype(AdjustmentType)
	 * @see spd.SpdPackage#getScalingPolicy_Adjustmenttype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdjustmentType getAdjustmenttype();

	/**
	 * Sets the value of the '{@link spd.ScalingPolicy#getAdjustmenttype <em>Adjustmenttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustmenttype</em>' containment reference.
	 * @see #getAdjustmenttype()
	 * @generated
	 */
	void setAdjustmenttype(AdjustmentType value);

	/**
	 * Returns the value of the '<em><b>Scalingtrigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger that determines when the policy should adjust the target group. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scalingtrigger</em>' containment reference.
	 * @see #setScalingtrigger(ScalingTrigger)
	 * @see spd.SpdPackage#getScalingPolicy_Scalingtrigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScalingTrigger getScalingtrigger();

	/**
	 * Sets the value of the '{@link spd.ScalingPolicy#getScalingtrigger <em>Scalingtrigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalingtrigger</em>' containment reference.
	 * @see #getScalingtrigger()
	 * @generated
	 */
	void setScalingtrigger(ScalingTrigger value);

	/**
	 * Returns the value of the '<em><b>Policyconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link spd.PolicyConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraints that define additional conditions to be met for the policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policyconstraint</em>' containment reference list.
	 * @see spd.SpdPackage#getScalingPolicy_Policyconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyConstraint> getPolicyconstraint();

	/**
	 * Returns the value of the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Name</em>' attribute.
	 * @see #setPolicyName(String)
	 * @see spd.SpdPackage#getScalingPolicy_PolicyName()
	 * @model
	 * @generated
	 */
	String getPolicyName();

	/**
	 * Sets the value of the '{@link spd.ScalingPolicy#getPolicyName <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name</em>' attribute.
	 * @see #getPolicyName()
	 * @generated
	 */
	void setPolicyName(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see spd.SpdPackage#getScalingPolicy_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link spd.ScalingPolicy#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // ScalingPolicy
