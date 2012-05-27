/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.Statement;
import org.xtext.example.mydsl.gACL.VarInst;
import org.xtext.example.mydsl.gACL.ifte;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.StatementImpl#getVin <em>Vin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.StatementImpl#getIfst <em>Ifst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getVin() <em>Vin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVin()
   * @generated
   * @ordered
   */
  protected VarInst vin;

  /**
   * The cached value of the '{@link #getIfst() <em>Ifst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfst()
   * @generated
   * @ordered
   */
  protected ifte ifst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return GACLPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarInst getVin()
  {
    return vin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVin(VarInst newVin, NotificationChain msgs)
  {
    VarInst oldVin = vin;
    vin = newVin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.STATEMENT__VIN, oldVin, newVin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVin(VarInst newVin)
  {
    if (newVin != vin)
    {
      NotificationChain msgs = null;
      if (vin != null)
        msgs = ((InternalEObject)vin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.STATEMENT__VIN, null, msgs);
      if (newVin != null)
        msgs = ((InternalEObject)newVin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.STATEMENT__VIN, null, msgs);
      msgs = basicSetVin(newVin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.STATEMENT__VIN, newVin, newVin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifte getIfst()
  {
    return ifst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfst(ifte newIfst, NotificationChain msgs)
  {
    ifte oldIfst = ifst;
    ifst = newIfst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.STATEMENT__IFST, oldIfst, newIfst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfst(ifte newIfst)
  {
    if (newIfst != ifst)
    {
      NotificationChain msgs = null;
      if (ifst != null)
        msgs = ((InternalEObject)ifst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.STATEMENT__IFST, null, msgs);
      if (newIfst != null)
        msgs = ((InternalEObject)newIfst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.STATEMENT__IFST, null, msgs);
      msgs = basicSetIfst(newIfst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.STATEMENT__IFST, newIfst, newIfst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GACLPackage.STATEMENT__VIN:
        return basicSetVin(null, msgs);
      case GACLPackage.STATEMENT__IFST:
        return basicSetIfst(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GACLPackage.STATEMENT__VIN:
        return getVin();
      case GACLPackage.STATEMENT__IFST:
        return getIfst();
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
      case GACLPackage.STATEMENT__VIN:
        setVin((VarInst)newValue);
        return;
      case GACLPackage.STATEMENT__IFST:
        setIfst((ifte)newValue);
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
      case GACLPackage.STATEMENT__VIN:
        setVin((VarInst)null);
        return;
      case GACLPackage.STATEMENT__IFST:
        setIfst((ifte)null);
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
      case GACLPackage.STATEMENT__VIN:
        return vin != null;
      case GACLPackage.STATEMENT__IFST:
        return ifst != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
