/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CPU Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CPUUtilizationImpl extends ResourceUtilizationStimulusImpl implements CPUUtilization {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CPUUtilizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimuliPackage.Literals.CPU_UTILIZATION;
    }

} // CPUUtilizationImpl
