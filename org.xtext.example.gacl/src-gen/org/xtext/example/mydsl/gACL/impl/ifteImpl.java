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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.IntExpression;
import org.xtext.example.mydsl.gACL.ifte;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ifte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ifteImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ifteImpl#getStmts <em>Stmts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ifteImpl#getEstmts <em>Estmts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ifteImpl extends MinimalEObjectImpl.Container implements ifte
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected IntExpression cond;

  /**
   * The cached value of the '{@link #getStmts() <em>Stmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmts()
   * @generated
   * @ordered
   */
  protected EList<EObject> stmts;

  /**
   * The cached value of the '{@link #getEstmts() <em>Estmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstmts()
   * @generated
   * @ordered
   */
  protected EList<EObject> estmts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ifteImpl()
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
    return GACLPackage.Literals.IFTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(IntExpression newCond, NotificationChain msgs)
  {
    IntExpression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.IFTE__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(IntExpression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.IFTE__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.IFTE__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.IFTE__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getStmts()
  {
    if (stmts == null)
    {
      stmts = new EObjectContainmentEList<EObject>(EObject.class, this, GACLPackage.IFTE__STMTS);
    }
    return stmts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getEstmts()
  {
    if (estmts == null)
    {
      estmts = new EObjectContainmentEList<EObject>(EObject.class, this, GACLPackage.IFTE__ESTMTS);
    }
    return estmts;
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
      case GACLPackage.IFTE__COND:
        return basicSetCond(null, msgs);
      case GACLPackage.IFTE__STMTS:
        return ((InternalEList<?>)getStmts()).basicRemove(otherEnd, msgs);
      case GACLPackage.IFTE__ESTMTS:
        return ((InternalEList<?>)getEstmts()).basicRemove(otherEnd, msgs);
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
      case GACLPackage.IFTE__COND:
        return getCond();
      case GACLPackage.IFTE__STMTS:
        return getStmts();
      case GACLPackage.IFTE__ESTMTS:
        return getEstmts();
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
      case GACLPackage.IFTE__COND:
        setCond((IntExpression)newValue);
        return;
      case GACLPackage.IFTE__STMTS:
        getStmts().clear();
        getStmts().addAll((Collection<? extends EObject>)newValue);
        return;
      case GACLPackage.IFTE__ESTMTS:
        getEstmts().clear();
        getEstmts().addAll((Collection<? extends EObject>)newValue);
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
      case GACLPackage.IFTE__COND:
        setCond((IntExpression)null);
        return;
      case GACLPackage.IFTE__STMTS:
        getStmts().clear();
        return;
      case GACLPackage.IFTE__ESTMTS:
        getEstmts().clear();
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
      case GACLPackage.IFTE__COND:
        return cond != null;
      case GACLPackage.IFTE__STMTS:
        return stmts != null && !stmts.isEmpty();
      case GACLPackage.IFTE__ESTMTS:
        return estmts != null && !estmts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ifteImpl
