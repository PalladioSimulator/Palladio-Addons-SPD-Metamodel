/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;

import spd.palladio.PCMResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Utilization Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class for triggers based on the utilization of a processing resource such as CPU, RAM or HDD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getProcessingResourceUtilizationBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingResourceUtilizationBasedTrigger extends ResourceUtilizationBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link spd.palladio.PCMResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of resource containers for which the processing resource utilization is collected. If left empty, all resource containers as referenced by the TargetGroup are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getProcessingResourceUtilizationBasedTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<PCMResourceContainer> getResourceContainer();

} // ProcessingResourceUtilizationBasedTrigger
