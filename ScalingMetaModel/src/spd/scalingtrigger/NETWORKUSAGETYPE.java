/**
 */
package spd.scalingtrigger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NETWORKUSAGETYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enum for the following Network Usage types: SEND, RECEIVE which are relevant to distinuish the type of use for a network resource.
 * <!-- end-model-doc -->
 * @see spd.scalingtrigger.ScalingtriggerPackage#getNETWORKUSAGETYPE()
 * @model
 * @generated
 */
public enum NETWORKUSAGETYPE implements Enumerator {
	/**
	 * The '<em><b>SEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(0, "SEND", "SEND"),

	/**
	 * The '<em><b>RECEIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVE(1, "RECEIVE", "RECEIVE");

	/**
	 * The '<em><b>SEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 0;

	/**
	 * The '<em><b>RECEIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>NETWORKUSAGETYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NETWORKUSAGETYPE[] VALUES_ARRAY =
		new NETWORKUSAGETYPE[] {
			SEND,
			RECEIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>NETWORKUSAGETYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NETWORKUSAGETYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NETWORKUSAGETYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NETWORKUSAGETYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NETWORKUSAGETYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NETWORKUSAGETYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NETWORKUSAGETYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NETWORKUSAGETYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NETWORKUSAGETYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NETWORKUSAGETYPE get(int value) {
		switch (value) {
			case SEND_VALUE: return SEND;
			case RECEIVE_VALUE: return RECEIVE;
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
	private NETWORKUSAGETYPE(int value, String name, String literal) {
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
	
} //NETWORKUSAGETYPE
