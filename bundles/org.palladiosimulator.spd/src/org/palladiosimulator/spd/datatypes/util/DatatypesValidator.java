/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.datatypes.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.spd.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final DatatypesValidator INSTANCE = new DatatypesValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.spd.datatypes";

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
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public DatatypesValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return DatatypesPackage.eINSTANCE;
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
        case DatatypesPackage.PERCENT_DOUBLE:
            return this.validatePercentDouble((Double) value, diagnostics, context);
        case DatatypesPackage.POSITIVE_INTEGER:
            return this.validatePositiveInteger((Integer) value, diagnostics, context);
        case DatatypesPackage.POSITIVE_DOUBLE:
            return validatePositiveDouble((Double) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePercentDouble(final double percentDouble, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        boolean result = this.validatePercentDouble_Min(percentDouble, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validatePercentDouble_Max(percentDouble, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validatePercentDouble_Min
     */
    public static final double PERCENT_DOUBLE__MIN__VALUE = 0.0;

    /**
     * Validates the Min constraint of '<em>Percent Double</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validatePercentDouble_Min(final double percentDouble, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = percentDouble >= PERCENT_DOUBLE__MIN__VALUE;
        if (!result && diagnostics != null) {
            this.reportMinViolation(DatatypesPackage.Literals.PERCENT_DOUBLE, percentDouble, PERCENT_DOUBLE__MIN__VALUE,
                    true, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validatePercentDouble_Max
     */
    public static final double PERCENT_DOUBLE__MAX__VALUE = 1.0;

    /**
     * Validates the Max constraint of '<em>Percent Double</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validatePercentDouble_Max(final double percentDouble, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = percentDouble <= PERCENT_DOUBLE__MAX__VALUE;
        if (!result && diagnostics != null) {
            this.reportMaxViolation(DatatypesPackage.Literals.PERCENT_DOUBLE, percentDouble, PERCENT_DOUBLE__MAX__VALUE,
                    true, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePositiveInteger(final int positiveInteger, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = this.validatePositiveInteger_Min(positiveInteger, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validatePositiveInteger_Min
     */
    public static final int POSITIVE_INTEGER__MIN__VALUE = 0;

    /**
     * Validates the Min constraint of '<em>Positive Integer</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validatePositiveInteger_Min(final int positiveInteger, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = positiveInteger >= POSITIVE_INTEGER__MIN__VALUE;
        if (!result && diagnostics != null) {
            this.reportMinViolation(DatatypesPackage.Literals.POSITIVE_INTEGER, positiveInteger,
                    POSITIVE_INTEGER__MIN__VALUE, true, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePositiveDouble(double positiveDouble, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean result = validatePositiveDouble_Min(positiveDouble, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @see #validatePositiveDouble_Min
     */
    public static final double POSITIVE_DOUBLE__MIN__VALUE = 0.0;

    /**
     * Validates the Min constraint of '<em>Positive Double</em>'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public boolean validatePositiveDouble_Min(double positiveDouble, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean result = positiveDouble >= POSITIVE_DOUBLE__MIN__VALUE;
        if (!result && diagnostics != null)
            reportMinViolation(DatatypesPackage.Literals.POSITIVE_DOUBLE, positiveDouble, POSITIVE_DOUBLE__MIN__VALUE,
                    true, diagnostics, context);
        return result;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // DatatypesValidator
