/**
 * generated by Xtext 2.10.0
 */
package org.emn.fil.boto.botoLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.fil.boto.botoLang.Browser#getName <em>Name</em>}</li>
 *   <li>{@link org.emn.fil.boto.botoLang.Browser#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.emn.fil.boto.botoLang.BotoLangPackage#getBrowser()
 * @model
 * @generated
 */
public interface Browser extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getBrowser_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.emn.fil.boto.botoLang.Browser#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference.
   * @see #setInstructions(InstructionList)
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getBrowser_Instructions()
   * @model containment="true"
   * @generated
   */
  InstructionList getInstructions();

  /**
   * Sets the value of the '{@link org.emn.fil.boto.botoLang.Browser#getInstructions <em>Instructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instructions</em>' containment reference.
   * @see #getInstructions()
   * @generated
   */
  void setInstructions(InstructionList value);

} // Browser
