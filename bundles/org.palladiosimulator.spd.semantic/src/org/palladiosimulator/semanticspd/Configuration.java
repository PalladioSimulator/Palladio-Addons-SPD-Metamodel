/**
 */
package org.palladiosimulator.semanticspd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.allocation.Allocation;

import org.palladiosimulator.pcm.repository.Repository;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.ScalingPolicy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getSpd <em>Spd</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getEnactedPolicy <em>Enacted Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getTargetCfgs <em>Target Cfgs</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getSystem <em>System</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticspd.Configuration#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Spd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spd</em>' reference.
	 * @see #setSpd(SPD)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_Spd()
	 * @model
	 * @generated
	 */
	SPD getSpd();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getSpd <em>Spd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spd</em>' reference.
	 * @see #getSpd()
	 * @generated
	 */
	void setSpd(SPD value);

	/**
	 * Returns the value of the '<em><b>Enacted Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enacted Policy</em>' reference.
	 * @see #setEnactedPolicy(ScalingPolicy)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_EnactedPolicy()
	 * @model
	 * @generated
	 */
	ScalingPolicy getEnactedPolicy();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getEnactedPolicy <em>Enacted Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enacted Policy</em>' reference.
	 * @see #getEnactedPolicy()
	 * @generated
	 */
	void setEnactedPolicy(ScalingPolicy value);

	/**
	 * Returns the value of the '<em><b>Target Cfgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.semanticspd.TargetGroupCfg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cfgs</em>' containment reference list.
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_TargetCfgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetGroupCfg> getTargetCfgs();

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' reference.
	 * @see #setAllocation(Allocation)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_Allocation()
	 * @model
	 * @generated
	 */
	Allocation getAllocation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getAllocation <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(Allocation value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(org.palladiosimulator.pcm.system.System)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_System()
	 * @model
	 * @generated
	 */
	org.palladiosimulator.pcm.system.System getSystem();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.palladiosimulator.pcm.system.System value);

	/**
	 * Returns the value of the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment</em>' reference.
	 * @see #setResourceEnvironment(ResourceEnvironment)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_ResourceEnvironment()
	 * @model
	 * @generated
	 */
	ResourceEnvironment getResourceEnvironment();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getResourceEnvironment <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment</em>' reference.
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	void setResourceEnvironment(ResourceEnvironment value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.palladiosimulator.semanticspd.SemanticspdPackage#getConfiguration_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.semanticspd.Configuration#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Configuration
