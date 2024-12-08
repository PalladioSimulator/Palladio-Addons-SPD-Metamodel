/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Competing Consumers
 * Group</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The CompetingConsumersGroup represents a set of elements that consume
 * messages from a channel/queue asynchronously. In SPD and Palladio it is represented as a set of
 * assembly context that deplete a queue modelled through a PassiveResource. The intention of use
 * behind CompetingConsumersGroup is to represent services that asynchronously process workload by
 * fetching messages from a queue. For understanding the pattern itself one can read
 * https://www.enterpriseintegrationpatterns.com/patterns/messaging/CompetingConsumers.html. <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly <em>Unit
 * Assembly</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage#getCompetingConsumersGroup()
 * @model
 * @generated
 */
public interface CompetingConsumersGroup extends TargetGroup {

    /**
     * Returns the value of the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The unitAssembly of the
     * CompetingConsumersGroup identifies the AssemblyContext which exists in the System model and
     * which shall be replicated upon scaling out. Furthermore, the unit assembly is the one which
     * will exist throughout the simulation independent of the adaptations. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Unit Assembly</em>' reference.
     * @see #setUnitAssembly(AssemblyContext)
     * @see org.palladiosimulator.spd.targets.TargetsPackage#getCompetingConsumersGroup_UnitAssembly()
     * @model
     * @generated
     */
    AssemblyContext getUnitAssembly();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.targets.CompetingConsumersGroup#getUnitAssembly <em>Unit
     * Assembly</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Unit Assembly</em>' reference.
     * @see #getUnitAssembly()
     * @generated
     */
    void setUnitAssembly(AssemblyContext value);
} // CompetingConsumersGroup
