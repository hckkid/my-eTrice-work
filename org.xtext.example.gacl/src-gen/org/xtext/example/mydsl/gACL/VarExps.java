/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Exps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarExps#getVarex <em>Varex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarExps()
 * @model
 * @generated
 */
public interface VarExps extends EObject
{
  /**
   * Returns the value of the '<em><b>Varex</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varex</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varex</em>' reference.
   * @see #setVarex(VarDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarExps_Varex()
   * @model
   * @generated
   */
  VarDecl getVarex();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarExps#getVarex <em>Varex</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varex</em>' reference.
   * @see #getVarex()
   * @generated
   */
  void setVarex(VarDecl value);

} // VarExps
