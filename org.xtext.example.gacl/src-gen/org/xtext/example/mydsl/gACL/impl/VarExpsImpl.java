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
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarExpsImpl#getVrnm <em>Vrnm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarExpsImpl extends ExpressionImpl implements VarExps
{
  /**
   * The cached value of the '{@link #getVrnm() <em>Vrnm</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVrnm()
   * @generated
   * @ordered
   */
  protected VarDecl vrnm;

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
  public VarDecl getVrnm()
  {
    if (vrnm != null && vrnm.eIsProxy())
    {
      InternalEObject oldVrnm = (InternalEObject)vrnm;
      vrnm = (VarDecl)eResolveProxy(oldVrnm);
      if (vrnm != oldVrnm)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GACLPackage.VAR_EXPS__VRNM, oldVrnm, vrnm));
      }
    }
    return vrnm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl basicGetVrnm()
  {
    return vrnm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVrnm(VarDecl newVrnm)
  {
    VarDecl oldVrnm = vrnm;
    vrnm = newVrnm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_EXPS__VRNM, oldVrnm, vrnm));
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
      case GACLPackage.VAR_EXPS__VRNM:
        if (resolve) return getVrnm();
        return basicGetVrnm();
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
      case GACLPackage.VAR_EXPS__VRNM:
        setVrnm((VarDecl)newValue);
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
      case GACLPackage.VAR_EXPS__VRNM:
        setVrnm((VarDecl)null);
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
      case GACLPackage.VAR_EXPS__VRNM:
        return vrnm != null;
    }
    return super.eIsSet(featureID);
  }

} //VarExpsImpl
