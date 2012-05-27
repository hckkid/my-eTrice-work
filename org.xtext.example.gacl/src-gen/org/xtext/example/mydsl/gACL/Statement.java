/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.Statement#getVin <em>Vin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.Statement#getIfst <em>Ifst</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Vin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vin</em>' containment reference.
   * @see #setVin(VarInst)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getStatement_Vin()
   * @model containment="true"
   * @generated
   */
  VarInst getVin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Statement#getVin <em>Vin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vin</em>' containment reference.
   * @see #getVin()
   * @generated
   */
  void setVin(VarInst value);

  /**
   * Returns the value of the '<em><b>Ifst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifst</em>' containment reference.
   * @see #setIfst(ifte)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getStatement_Ifst()
   * @model containment="true"
   * @generated
   */
  ifte getIfst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Statement#getIfst <em>Ifst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifst</em>' containment reference.
   * @see #getIfst()
   * @generated
   */
  void setIfst(ifte value);

} // Statement
