/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.SpdPackage
 * @generated
 */
public class SpdValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final SpdValidator INSTANCE = new SpdValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.spd";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IdentifierValidator identifierValidator;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdValidator() {
        super();
        this.identifierValidator = IdentifierValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return SpdPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID) {
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY:
            return this.validateTriggerBasedScalingPolicy((TriggerBasedScalingPolicy) value, diagnostics, context);
        case SpdPackage.SPD:
            return this.validateSPD((SPD) value, diagnostics, context);
        case SpdPackage.SCALING_POLICY:
            return this.validateScalingPolicy((ScalingPolicy) value, diagnostics, context);
        case SpdPackage.MODEL_BASED_SCALING_POLICY:
            return this.validateModelBasedScalingPolicy((ModelBasedScalingPolicy) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTriggerBasedScalingPolicy(final TriggerBasedScalingPolicy triggerBasedScalingPolicy,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(triggerBasedScalingPolicy, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(triggerBasedScalingPolicy, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(triggerBasedScalingPolicy, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(triggerBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.identifierValidator.validateIdentifier_identifierIsUnique(triggerBasedScalingPolicy,
                    diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateScalingPolicy_policyNameInvariant(triggerBasedScalingPolicy, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateScalingPolicy(final ScalingPolicy scalingPolicy, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(scalingPolicy, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(scalingPolicy, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(scalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.identifierValidator.validateIdentifier_identifierIsUnique(scalingPolicy, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateScalingPolicy_policyNameInvariant(scalingPolicy, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the policyNameInvariant constraint of '<em>Scaling Policy</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateScalingPolicy_policyNameInvariant(final ScalingPolicy scalingPolicy,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        // TODO implement the constraint
        // -> specify the condition that violates the constraint
        // -> verify the diagnostic details, including severity, code, and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add(this.createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
                        "_UI_GenericConstraint_diagnostic",
                        new Object[] { "policyNameInvariant", getObjectLabel(scalingPolicy, context) },
                        new Object[] { scalingPolicy }, context));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateModelBasedScalingPolicy(final ModelBasedScalingPolicy modelBasedScalingPolicy,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(modelBasedScalingPolicy, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(modelBasedScalingPolicy, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(modelBasedScalingPolicy, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.identifierValidator.validateIdentifier_identifierIsUnique(modelBasedScalingPolicy,
                    diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateScalingPolicy_policyNameInvariant(modelBasedScalingPolicy, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSPD(final SPD spd, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(spd, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(spd, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.identifierValidator.validateIdentifier_identifierIsUnique(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateSPD_nameInvariant(spd, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateSPD_noSameTargetGroup(spd, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the nameInvariant constraint of '<em>SPD</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validateSPD_nameInvariant(final SPD spd, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO implement the constraint
        // -> specify the condition that violates the constraint
        // -> verify the diagnostic details, including severity, code, and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add(this.createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
                        "_UI_GenericConstraint_diagnostic",
                        new Object[] { "nameInvariant", getObjectLabel(spd, context) }, new Object[] { spd }, context));
            }
            return false;
        }
        return true;
    }

    /**
     * Validates the noSameTargetGroup constraint of '<em>SPD</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validateSPD_noSameTargetGroup(final SPD spd, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO implement the constraint
        // -> specify the condition that violates the constraint
        // -> verify the diagnostic details, including severity, code, and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add(this.createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
                        "_UI_GenericConstraint_diagnostic",
                        new Object[] { "noSameTargetGroup", getObjectLabel(spd, context) }, new Object[] { spd },
                        context));
            }
            return false;
        }
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // SpdValidator
