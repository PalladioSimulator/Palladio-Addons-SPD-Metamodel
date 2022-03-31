/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;
import spd.palladio.PCMOperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ResponseTimeTrigger is a TimeBasedTrigger that is based on the response time exceeding a reference threshold value. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ResponseTimeTrigger#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger()
 * @model
 * @generated
 */
public interface ResponseTimeTrigger extends TimeBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' reference list.
	 * The list contents are of type {@link spd.palladio.PCMOperationSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation from which the response time is used. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Signature</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResponseTimeTrigger_OperationSignature()
	 * @model
	 * @generated
	 */
	EList<PCMOperationSignature> getOperationSignature();

} // ResponseTimeTrigger
