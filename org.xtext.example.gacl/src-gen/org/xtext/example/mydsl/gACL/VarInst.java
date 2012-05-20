/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarInst#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarInst#getStrexp <em>Strexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarInst#getInexp <em>Inexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarInst()
 * @model
 * @generated
 */
public interface VarInst extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(VarDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarInst_Name()
   * @model
   * @generated
   */
  VarDecl getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarInst#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(VarDecl value);

  /**
   * Returns the value of the '<em><b>Strexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strexp</em>' containment reference.
   * @see #setStrexp(StringExpression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarInst_Strexp()
   * @model containment="true"
   * @generated
   */
  StringExpression getStrexp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarInst#getStrexp <em>Strexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strexp</em>' containment reference.
   * @see #getStrexp()
   * @generated
   */
  void setStrexp(StringExpression value);

  /**
   * Returns the value of the '<em><b>Inexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inexp</em>' containment reference.
   * @see #setInexp(IntExpression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarInst_Inexp()
   * @model containment="true"
   * @generated
   */
  IntExpression getInexp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarInst#getInexp <em>Inexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inexp</em>' containment reference.
   * @see #getInexp()
   * @generated
   */
  void setInexp(IntExpression value);

} // VarInst
