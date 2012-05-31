/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.SingleStatement#getTd <em>Td</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.SingleStatement#getVd <em>Vd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.SingleStatement#getVin <em>Vin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.SingleStatement#getIfst <em>Ifst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.SingleStatement#getFl <em>Fl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement()
 * @model
 * @generated
 */
public interface SingleStatement extends EObject
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement_Td()
   * @model containment="true"
   * @generated
   */
  TypeDecl getTd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.SingleStatement#getTd <em>Td</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement_Vd()
   * @model containment="true"
   * @generated
   */
  VarDecl getVd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.SingleStatement#getVd <em>Vd</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement_Vin()
   * @model containment="true"
   * @generated
   */
  VarInst getVin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.SingleStatement#getVin <em>Vin</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement_Ifst()
   * @model containment="true"
   * @generated
   */
  ifte getIfst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.SingleStatement#getIfst <em>Ifst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifst</em>' containment reference.
   * @see #getIfst()
   * @generated
   */
  void setIfst(ifte value);

  /**
   * Returns the value of the '<em><b>Fl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fl</em>' containment reference.
   * @see #setFl(forlp)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getSingleStatement_Fl()
   * @model containment="true"
   * @generated
   */
  forlp getFl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.SingleStatement#getFl <em>Fl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fl</em>' containment reference.
   * @see #getFl()
   * @generated
   */
  void setFl(forlp value);

} // SingleStatement
