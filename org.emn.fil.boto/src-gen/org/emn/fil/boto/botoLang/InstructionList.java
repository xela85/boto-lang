/**
 * generated by Xtext 2.10.0
 */
package org.emn.fil.boto.botoLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.fil.boto.botoLang.InstructionList#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.emn.fil.boto.botoLang.BotoLangPackage#getInstructionList()
 * @model
 * @generated
 */
public interface InstructionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see org.emn.fil.boto.botoLang.BotoLangPackage#getInstructionList_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getInstructions();

} // InstructionList