/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import theoryextension.ConditionalRewrite;
import theoryextension.ConditionalRewriteRule;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Rewrite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.ConditionalRewriteImpl#getRewrites <em>Rewrites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalRewriteImpl extends MinimalEObjectImpl.Container implements ConditionalRewrite {
	/**
	 * The cached value of the '{@link #getRewrites() <em>Rewrites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewrites()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalRewriteRule> rewrites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalRewriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.CONDITIONAL_REWRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalRewriteRule> getRewrites() {
		if (rewrites == null) {
			rewrites = new EObjectContainmentEList.Resolving<ConditionalRewriteRule>(ConditionalRewriteRule.class, this, TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES);
		}
		return rewrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES:
				return ((InternalEList<?>)getRewrites()).basicRemove(otherEnd, msgs);
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
			case TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES:
				return getRewrites();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES:
				getRewrites().clear();
				getRewrites().addAll((Collection<? extends ConditionalRewriteRule>)newValue);
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
			case TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES:
				getRewrites().clear();
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
			case TheoryextensionPackage.CONDITIONAL_REWRITE__REWRITES:
				return rewrites != null && !rewrites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalRewriteImpl
