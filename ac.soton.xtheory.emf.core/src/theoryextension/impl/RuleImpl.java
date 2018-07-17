/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import theoryextension.InferenceRule;
import theoryextension.RewriteRule;
import theoryextension.Rule;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.RuleImpl#getRrule <em>Rrule</em>}</li>
 *   <li>{@link theoryextension.impl.RuleImpl#getIrule <em>Irule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getRrule() <em>Rrule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrule()
	 * @generated
	 * @ordered
	 */
	protected RewriteRule rrule;

	/**
	 * The cached value of the '{@link #getIrule() <em>Irule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrule()
	 * @generated
	 * @ordered
	 */
	protected InferenceRule irule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteRule getRrule() {
		if (rrule != null && rrule.eIsProxy()) {
			InternalEObject oldRrule = (InternalEObject)rrule;
			rrule = (RewriteRule)eResolveProxy(oldRrule);
			if (rrule != oldRrule) {
				InternalEObject newRrule = (InternalEObject)rrule;
				NotificationChain msgs = oldRrule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__RRULE, null, null);
				if (newRrule.eInternalContainer() == null) {
					msgs = newRrule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__RRULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheoryextensionPackage.RULE__RRULE, oldRrule, rrule));
			}
		}
		return rrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteRule basicGetRrule() {
		return rrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRrule(RewriteRule newRrule, NotificationChain msgs) {
		RewriteRule oldRrule = rrule;
		rrule = newRrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.RULE__RRULE, oldRrule, newRrule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRrule(RewriteRule newRrule) {
		if (newRrule != rrule) {
			NotificationChain msgs = null;
			if (rrule != null)
				msgs = ((InternalEObject)rrule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__RRULE, null, msgs);
			if (newRrule != null)
				msgs = ((InternalEObject)newRrule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__RRULE, null, msgs);
			msgs = basicSetRrule(newRrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.RULE__RRULE, newRrule, newRrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceRule getIrule() {
		if (irule != null && irule.eIsProxy()) {
			InternalEObject oldIrule = (InternalEObject)irule;
			irule = (InferenceRule)eResolveProxy(oldIrule);
			if (irule != oldIrule) {
				InternalEObject newIrule = (InternalEObject)irule;
				NotificationChain msgs = oldIrule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__IRULE, null, null);
				if (newIrule.eInternalContainer() == null) {
					msgs = newIrule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__IRULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheoryextensionPackage.RULE__IRULE, oldIrule, irule));
			}
		}
		return irule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceRule basicGetIrule() {
		return irule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIrule(InferenceRule newIrule, NotificationChain msgs) {
		InferenceRule oldIrule = irule;
		irule = newIrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.RULE__IRULE, oldIrule, newIrule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrule(InferenceRule newIrule) {
		if (newIrule != irule) {
			NotificationChain msgs = null;
			if (irule != null)
				msgs = ((InternalEObject)irule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__IRULE, null, msgs);
			if (newIrule != null)
				msgs = ((InternalEObject)newIrule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.RULE__IRULE, null, msgs);
			msgs = basicSetIrule(newIrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.RULE__IRULE, newIrule, newIrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.RULE__RRULE:
				return basicSetRrule(null, msgs);
			case TheoryextensionPackage.RULE__IRULE:
				return basicSetIrule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TheoryextensionPackage.RULE__RRULE:
				if (resolve) return getRrule();
				return basicGetRrule();
			case TheoryextensionPackage.RULE__IRULE:
				if (resolve) return getIrule();
				return basicGetIrule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TheoryextensionPackage.RULE__RRULE:
				setRrule((RewriteRule)newValue);
				return;
			case TheoryextensionPackage.RULE__IRULE:
				setIrule((InferenceRule)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TheoryextensionPackage.RULE__RRULE:
				setRrule((RewriteRule)null);
				return;
			case TheoryextensionPackage.RULE__IRULE:
				setIrule((InferenceRule)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TheoryextensionPackage.RULE__RRULE:
				return rrule != null;
			case TheoryextensionPackage.RULE__IRULE:
				return irule != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
