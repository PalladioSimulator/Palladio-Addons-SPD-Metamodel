/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.ecore.EClass;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.TimeBasedTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TimeBasedTriggerImpl extends ThresholdBasedTriggerImpl implements TimeBasedTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBasedTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.TIME_BASED_TRIGGER;
	}

} //TimeBasedTriggerImpl
