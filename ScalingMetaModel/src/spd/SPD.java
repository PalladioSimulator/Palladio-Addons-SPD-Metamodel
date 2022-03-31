/**
 */
package spd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root elements that consists of all scaling policies under analysis for a given cloud application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.SPD#getScalingpolicy <em>Scalingpolicy</em>}</li>
 *   <li>{@link spd.SPD#getName <em>Name</em>}</li>
 *   <li>{@link spd.SPD#getTargetgroups <em>Targetgroups</em>}</li>
 * </ul>
 *
 * @see spd.SpdPackage#getSPD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameInvariant noSameTargetGroup'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameInvariant='name &lt;&gt;\'\'' noSameTargetGroup='ScalingPolicy-&gt; forAll(scaling1 | ScalingPolicy-&gt;forAll(scaling2 | scaling1 &lt;&gt; scaling2 implies scaling1.targetgroup &lt;&gt; scaling2.targetgroup )) '"
 * @generated
 */
public interface SPD extends EObject {
	/**
	 * Returns the value of the '<em><b>Scalingpolicy</b></em>' containment reference list.
	 * The list contents are of type {@link spd.ScalingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of scaling policies under analysis for the given cloud application model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scalingpolicy</em>' containment reference list.
	 * @see spd.SpdPackage#getSPD_Scalingpolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ScalingPolicy> getScalingpolicy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Scaling Policy Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spd.SpdPackage#getSPD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spd.SPD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Targetgroups</b></em>' containment reference list.
	 * The list contents are of type {@link spd.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetgroups</em>' containment reference list.
	 * @see spd.SpdPackage#getSPD_Targetgroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetGroup> getTargetgroups();

} // SPD
