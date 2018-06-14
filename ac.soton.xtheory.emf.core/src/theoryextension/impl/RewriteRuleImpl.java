/**
 */
package theoryextension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eventb.emf.core.impl.EventBObjectImpl;
import theoryextension.RewriteRule;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewrite Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isIsCaseComplete <em>Is Case Complete</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewriteRuleImpl extends EventBObjectImpl implements RewriteRule {
	/**
	 * The default value of the '{@link #isIsCaseComplete() <em>Is Case Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CASE_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCaseComplete() <em>Is Case Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isCaseComplete = IS_CASE_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplicabilityIsInteractive() <em>Applicability Is Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABILITY_IS_INTERACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicabilityIsInteractive() <em>Applicability Is Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean applicabilityIsInteractive = APPLICABILITY_IS_INTERACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplicabilityIsAutomatic() <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABILITY_IS_AUTOMATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicabilityIsAutomatic() <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected boolean applicabilityIsAutomatic = APPLICABILITY_IS_AUTOMATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RewriteRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.REWRITE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCaseComplete() {
		return isCaseComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseComplete(boolean newIsCaseComplete) {
		boolean oldIsCaseComplete = isCaseComplete;
		isCaseComplete = newIsCaseComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE, oldIsCaseComplete, isCaseComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicabilityIsInteractive() {
		return applicabilityIsInteractive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicabilityIsInteractive(boolean newApplicabilityIsInteractive) {
		boolean oldApplicabilityIsInteractive = applicabilityIsInteractive;
		applicabilityIsInteractive = newApplicabilityIsInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE, oldApplicabilityIsInteractive, applicabilityIsInteractive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicabilityIsAutomatic() {
		return applicabilityIsAutomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicabilityIsAutomatic(boolean newApplicabilityIsAutomatic) {
		boolean oldApplicabilityIsAutomatic = applicabilityIsAutomatic;
		applicabilityIsAutomatic = newApplicabilityIsAutomatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC, oldApplicabilityIsAutomatic, applicabilityIsAutomatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				return isIsCaseComplete();
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return isApplicabilityIsInteractive();
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return isApplicabilityIsAutomatic();
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				return getPattern();
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				setIsCaseComplete((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				setPattern((String)newValue);
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				setIsCaseComplete(IS_CASE_COMPLETE_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive(APPLICABILITY_IS_INTERACTIVE_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic(APPLICABILITY_IS_AUTOMATIC_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				return isCaseComplete != IS_CASE_COMPLETE_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return applicabilityIsInteractive != APPLICABILITY_IS_INTERACTIVE_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return applicabilityIsAutomatic != APPLICABILITY_IS_AUTOMATIC_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsCaseComplete: ");
		result.append(isCaseComplete);
		result.append(", ApplicabilityIsInteractive: ");
		result.append(applicabilityIsInteractive);
		result.append(", ApplicabilityIsAutomatic: ");
		result.append(applicabilityIsAutomatic);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //RewriteRuleImpl
