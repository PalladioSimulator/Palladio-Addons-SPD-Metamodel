/**
 */
package spd.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import spd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see spd.SpdPackage
 * @generated
 */
public class SpdValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpdValidator INSTANCE = new SpdValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "spd";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SpdPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SpdPackage.SCALING_POLICY:
				return validateScalingPolicy((ScalingPolicy)value, diagnostics, context);
			case SpdPackage.SPD:
				return validateSPD((SPD)value, diagnostics, context);
			case SpdPackage.TARGET_GROUP:
				return validateTargetGroup((TargetGroup)value, diagnostics, context);
			case SpdPackage.ADJUSTMENT_TYPE:
				return validateAdjustmentType((AdjustmentType)value, diagnostics, context);
			case SpdPackage.SCALING_TRIGGER:
				return validateScalingTrigger((ScalingTrigger)value, diagnostics, context);
			case SpdPackage.POLICY_CONSTRAINT:
				return validatePolicyConstraint((PolicyConstraint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingPolicy(ScalingPolicy scalingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalingPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scalingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingPolicy_policyNameInvariant(scalingPolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the policyNameInvariant constraint of '<em>Scaling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingPolicy_policyNameInvariant(ScalingPolicy scalingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "policyNameInvariant", getObjectLabel(scalingPolicy, context) },
						 new Object[] { scalingPolicy },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPD(SPD spd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(spd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validateSPD_nameInvariant(spd, diagnostics, context);
		if (result || diagnostics != null) result &= validateSPD_noSameTargetGroup(spd, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameInvariant constraint of '<em>SPD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPD_nameInvariant(SPD spd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameInvariant", getObjectLabel(spd, context) },
						 new Object[] { spd },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the noSameTargetGroup constraint of '<em>SPD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPD_noSameTargetGroup(SPD spd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noSameTargetGroup", getObjectLabel(spd, context) },
						 new Object[] { spd },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetGroup(TargetGroup targetGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdjustmentType(AdjustmentType adjustmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adjustmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingTrigger(ScalingTrigger scalingTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalingTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyConstraint(PolicyConstraint policyConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policyConstraint, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SpdValidator
