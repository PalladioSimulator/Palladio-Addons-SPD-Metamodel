/**
 */
package spd.scalingtrigger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>THRESHOLDDIRECTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The threshold direction can be either EXCEEDED or UNDERCUT.
 * <!-- end-model-doc -->
 * @see spd.scalingtrigger.ScalingtriggerPackage#getTHRESHOLDDIRECTION()
 * @model
 * @generated
 */
public enum THRESHOLDDIRECTION implements Enumerator {
	/**
	 * The '<em><b>EXCEDEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEDEED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEDEED(0, "EXCEDEED", "EXCEDEED"),

	/**
	 * The '<em><b>UNDERCUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERCUT_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERCUT(1, "UNDERCUT", "UNDERCUT");

	/**
	 * The '<em><b>EXCEDEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEDEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCEDEED_VALUE = 0;

	/**
	 * The '<em><b>UNDERCUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERCUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERCUT_VALUE = 1;

	/**
	 * An array of all the '<em><b>THRESHOLDDIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final THRESHOLDDIRECTION[] VALUES_ARRAY =
		new THRESHOLDDIRECTION[] {
			EXCEDEED,
			UNDERCUT,
		};

	/**
	 * A public read-only list of all the '<em><b>THRESHOLDDIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<THRESHOLDDIRECTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>THRESHOLDDIRECTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THRESHOLDDIRECTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			THRESHOLDDIRECTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>THRESHOLDDIRECTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THRESHOLDDIRECTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			THRESHOLDDIRECTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>THRESHOLDDIRECTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THRESHOLDDIRECTION get(int value) {
		switch (value) {
			case EXCEDEED_VALUE: return EXCEDEED;
			case UNDERCUT_VALUE: return UNDERCUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private THRESHOLDDIRECTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //THRESHOLDDIRECTION
