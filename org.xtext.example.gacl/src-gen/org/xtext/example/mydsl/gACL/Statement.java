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
 *   <li>{@link org.xtext.example.mydsl.gACL.Statement#getTd <em>Td</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.Statement#getVd <em>Vd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.Statement#getVin <em>Vin</em>}</li>
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
   * Returns the value of the '<em><b>Td</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Td</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Td</em>' containment reference.
   * @see #setTd(TypeDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getStatement_Td()
   * @model containment="true"
   * @generated
   */
  TypeDecl getTd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Statement#getTd <em>Td</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Td</em>' containment reference.
   * @see #getTd()
   * @generated
   */
  void setTd(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Vd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vd</em>' containment reference.
   * @see #setVd(VarDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getStatement_Vd()
   * @model containment="true"
   * @generated
   */
  VarDecl getVd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Statement#getVd <em>Vd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vd</em>' containment reference.
   * @see #getVd()
   * @generated
   */
  void setVd(VarDecl value);

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

} // Statement
