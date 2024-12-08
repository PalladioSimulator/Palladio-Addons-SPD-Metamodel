/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ServiceGroup groups a set of components that are load balanced and
 * can be horizontally replicated. Upon replication the load balancer distributes the load to the
 * new replicas according to the predefined load balancing strategy. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.targets.ServiceGroup#getUnitAssembly <em>Unit
 * Assembly</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage#getServiceGroup()
 * @model
 * @generated
 */
public interface ServiceGroup extends TargetGroup {

    /**
     * Returns the value of the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The unitAssembly is used to point to the
     * ServiceGroup in PCM. It is used also for disinguishing between different service groups. A
     * prerequisite is that the unit assembly is already connected in a Service Group structure in
     * PCM. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Unit Assembly</em>' reference.
     * @see #setUnitAssembly(AssemblyContext)
     * @see org.palladiosimulator.spd.targets.TargetsPackage#getServiceGroup_UnitAssembly()
     * @model
     * @generated
     */
    AssemblyContext getUnitAssembly();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.targets.ServiceGroup#getUnitAssembly
     * <em>Unit Assembly</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Unit Assembly</em>' reference.
     * @see #getUnitAssembly()
     * @generated
     */
    void setUnitAssembly(AssemblyContext value);
} // ServiceGroup
