/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Exps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarExps#getVrnm <em>Vrnm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarExps()
 * @model
 * @generated
 */
public interface VarExps extends Expression
{
  /**
   * Returns the value of the '<em><b>Vrnm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vrnm</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vrnm</em>' reference.
   * @see #setVrnm(VarDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarExps_Vrnm()
   * @model
   * @generated
   */
  VarDecl getVrnm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarExps#getVrnm <em>Vrnm</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vrnm</em>' reference.
   * @see #getVrnm()
   * @generated
   */
  void setVrnm(VarDecl value);

} // VarExps
