/**
 * generated by Xtext 2.10.0
 */
package org.emn.fil.boto.botoLang.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emn.fil.boto.botoLang.BotoLangPackage;
import org.emn.fil.boto.botoLang.Browser;
import org.emn.fil.boto.botoLang.Check;
import org.emn.fil.boto.botoLang.Click;
import org.emn.fil.boto.botoLang.Fill;
import org.emn.fil.boto.botoLang.Function;
import org.emn.fil.boto.botoLang.FunctionCall;
import org.emn.fil.boto.botoLang.Goto;
import org.emn.fil.boto.botoLang.Html;
import org.emn.fil.boto.botoLang.InstructionList;
import org.emn.fil.boto.botoLang.Model;
import org.emn.fil.boto.botoLang.Predicate;
import org.emn.fil.boto.botoLang.Put;
import org.emn.fil.boto.botoLang.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emn.fil.boto.botoLang.BotoLangPackage
 * @generated
 */
public class BotoLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BotoLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotoLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BotoLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BotoLangPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.BROWSER:
      {
        Browser browser = (Browser)theEObject;
        T result = caseBrowser(browser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.INSTRUCTION_LIST:
      {
        InstructionList instructionList = (InstructionList)theEObject;
        T result = caseInstructionList(instructionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.GOTO:
      {
        Goto goto_ = (Goto)theEObject;
        T result = caseGoto(goto_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.PUT:
      {
        Put put = (Put)theEObject;
        T result = casePut(put);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.OBJECT:
      {
        org.emn.fil.boto.botoLang.Object object = (org.emn.fil.boto.botoLang.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.HTML:
      {
        Html html = (Html)theEObject;
        T result = caseHtml(html);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotoLangPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Browser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Browser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrowser(Browser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionList(InstructionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoto(Goto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Put</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Put</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePut(Put object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.emn.fil.boto.botoLang.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Html</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Html</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHtml(Html object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BotoLangSwitch
