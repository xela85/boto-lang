/**
 * generated by Xtext 2.10.0
 */
package org.emn.fil.boto.botoLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.fil.boto.botoLang.Object#getHtml <em>Html</em>}</li>
 *   <li>{@link org.emn.fil.boto.botoLang.Object#getParam <em>Param</em>}</li>
 *   <li>{@link org.emn.fil.boto.botoLang.Object#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.emn.fil.boto.botoLang.BotoLangPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject
{
  /**
   * Returns the value of the '<em><b>Html</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Html</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Html</em>' containment reference.
   * @see #setHtml(Html)
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getObject_Html()
   * @model containment="true"
   * @generated
   */
  Html getHtml();

  /**
   * Sets the value of the '{@link org.emn.fil.boto.botoLang.Object#getHtml <em>Html</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Html</em>' containment reference.
   * @see #getHtml()
   * @generated
   */
  void setHtml(Html value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getObject_Param()
   * @model
   * @generated
   */
  String getParam();

  /**
   * Sets the value of the '{@link org.emn.fil.boto.botoLang.Object#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
  void setParam(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getObject_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.emn.fil.boto.botoLang.Object#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // Object