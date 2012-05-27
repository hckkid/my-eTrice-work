/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.VarDecl;
import org.xtext.example.mydsl.gACL.VarExps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Exps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarExpsImpl#getVarex <em>Varex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarExpsImpl extends MinimalEObjectImpl.Container implements VarExps
{
  /**
   * The cached value of the '{@link #getVarex() <em>Varex</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarex()
   * @generated
   * @ordered
   */
  protected VarDecl varex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarExpsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GACLPackage.Literals.VAR_EXPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVarex()
  {
    if (varex != null && varex.eIsProxy())
    {
      InternalEObject oldVarex = (InternalEObject)varex;
      varex = (VarDecl)eResolveProxy(oldVarex);
      if (varex != oldVarex)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GACLPackage.VAR_EXPS__VAREX, oldVarex, varex));
      }
    }
    return varex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl basicGetVarex()
  {
    return varex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarex(VarDecl newVarex)
  {
    VarDecl oldVarex = varex;
    varex = newVarex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_EXPS__VAREX, oldVarex, varex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GACLPackage.VAR_EXPS__VAREX:
        if (resolve) return getVarex();
        return basicGetVarex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GACLPackage.VAR_EXPS__VAREX:
        setVarex((VarDecl)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GACLPackage.VAR_EXPS__VAREX:
        setVarex((VarDecl)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GACLPackage.VAR_EXPS__VAREX:
        return varex != null;
    }
    return super.eIsSet(featureID);
  }

} //VarExpsImpl
