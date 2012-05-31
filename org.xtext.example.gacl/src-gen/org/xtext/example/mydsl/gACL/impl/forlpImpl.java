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

import org.xtext.example.mydsl.gACL.Expression;
import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.forlp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>forlp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.forlpImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.forlpImpl#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class forlpImpl extends MinimalEObjectImpl.Container implements forlp
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Expression cond;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected forlpImpl()
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
    return GACLPackage.Literals.FORLP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Expression newCond, NotificationChain msgs)
  {
    Expression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.FORLP__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Expression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.FORLP__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.FORLP__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.FORLP__COND, newCond, newCond));
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
      stmts = new EObjectContainmentEList<EObject>(EObject.class, this, GACLPackage.FORLP__STMTS);
    }
    return stmts;
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
      case GACLPackage.FORLP__COND:
        return basicSetCond(null, msgs);
      case GACLPackage.FORLP__STMTS:
        return ((InternalEList<?>)getStmts()).basicRemove(otherEnd, msgs);
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
      case GACLPackage.FORLP__COND:
        return getCond();
      case GACLPackage.FORLP__STMTS:
        return getStmts();
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
      case GACLPackage.FORLP__COND:
        setCond((Expression)newValue);
        return;
      case GACLPackage.FORLP__STMTS:
        getStmts().clear();
        getStmts().addAll((Collection<? extends EObject>)newValue);
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
      case GACLPackage.FORLP__COND:
        setCond((Expression)null);
        return;
      case GACLPackage.FORLP__STMTS:
        getStmts().clear();
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
      case GACLPackage.FORLP__COND:
        return cond != null;
      case GACLPackage.FORLP__STMTS:
        return stmts != null && !stmts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //forlpImpl
