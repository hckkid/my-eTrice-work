/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarDecl#getPt <em>Pt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarDecl#getTd <em>Td</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.VarDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends EObject
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pt</em>' containment reference.
   * @see #setPt(PType)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarDecl_Pt()
   * @model containment="true"
   * @generated
   */
  PType getPt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarDecl#getPt <em>Pt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pt</em>' containment reference.
   * @see #getPt()
   * @generated
   */
  void setPt(PType value);

  /**
   * Returns the value of the '<em><b>Td</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Td</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Td</em>' reference.
   * @see #setTd(TypeDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarDecl_Td()
   * @model
   * @generated
   */
  TypeDecl getTd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarDecl#getTd <em>Td</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Td</em>' reference.
   * @see #getTd()
   * @generated
   */
  void setTd(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(VarDecl)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getVarDecl_Type()
   * @model containment="true"
   * @generated
   */
  VarDecl getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.VarDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(VarDecl value);

} // VarDecl
