/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.PType;
import org.xtext.example.mydsl.gACL.element;
import org.xtext.example.mydsl.gACL.typeCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.typeCodeImpl#getPrm <em>Prm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.typeCodeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeCodeImpl extends MinimalEObjectImpl.Container implements typeCode
{
  /**
   * The cached value of the '{@link #getPrm() <em>Prm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrm()
   * @generated
   * @ordered
   */
  protected PType prm;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeCodeImpl()
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
    return GACLPackage.Literals.TYPE_CODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PType getPrm()
  {
    return prm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrm(PType newPrm, NotificationChain msgs)
  {
    PType oldPrm = prm;
    prm = newPrm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.TYPE_CODE__PRM, oldPrm, newPrm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrm(PType newPrm)
  {
    if (newPrm != prm)
    {
      NotificationChain msgs = null;
      if (prm != null)
        msgs = ((InternalEObject)prm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.TYPE_CODE__PRM, null, msgs);
      if (newPrm != null)
        msgs = ((InternalEObject)newPrm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.TYPE_CODE__PRM, null, msgs);
      msgs = basicSetPrm(newPrm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.TYPE_CODE__PRM, newPrm, newPrm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<element>(element.class, this, GACLPackage.TYPE_CODE__ELEMENTS);
    }
    return elements;
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
      case GACLPackage.TYPE_CODE__PRM:
        return basicSetPrm(null, msgs);
      case GACLPackage.TYPE_CODE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case GACLPackage.TYPE_CODE__PRM:
        return getPrm();
      case GACLPackage.TYPE_CODE__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_CODE__PRM:
        setPrm((PType)newValue);
        return;
      case GACLPackage.TYPE_CODE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends element>)newValue);
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
      case GACLPackage.TYPE_CODE__PRM:
        setPrm((PType)null);
        return;
      case GACLPackage.TYPE_CODE__ELEMENTS:
        getElements().clear();
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
      case GACLPackage.TYPE_CODE__PRM:
        return prm != null;
      case GACLPackage.TYPE_CODE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //typeCodeImpl
