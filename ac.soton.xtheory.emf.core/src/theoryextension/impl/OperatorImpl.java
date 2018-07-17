/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import theoryextension.Argument;
import theoryextension.Case;
import theoryextension.Notation;
import theoryextension.Operator;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.OperatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#isAssociative <em>Associative</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#isCommutative <em>Commutative</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getPrecedent <em>Precedent</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getWd <em>Wd</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getCase <em>Case</em>}</li>
 *   <li>{@link theoryextension.impl.OperatorImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorImpl extends EventBNamedCommentedElementImpl implements Operator {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final Notation NOTATION_EDEFAULT = Notation.PREFIX;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected Notation notation = NOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssociative() <em>Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssociative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSOCIATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssociative() <em>Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssociative()
	 * @generated
	 * @ordered
	 */
	protected boolean associative = ASSOCIATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommutative() <em>Commutative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommutative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMUTATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommutative() <em>Commutative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommutative()
	 * @generated
	 * @ordered
	 */
	protected boolean commutative = COMMUTATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The default value of the '{@link #getPrecedent() <em>Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedent()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECEDENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecedent() <em>Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedent()
	 * @generated
	 * @ordered
	 */
	protected int precedent = PRECEDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWd() <em>Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWd()
	 * @generated
	 * @ordered
	 */
	protected static final String WD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWd() <em>Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWd()
	 * @generated
	 * @ordered
	 */
	protected String wd = WD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected String case_ = CASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notation getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(Notation newNotation) {
		Notation oldNotation = notation;
		notation = newNotation == null ? NOTATION_EDEFAULT : newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssociative() {
		return associative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociative(boolean newAssociative) {
		boolean oldAssociative = associative;
		associative = newAssociative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__ASSOCIATIVE, oldAssociative, associative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommutative() {
		return commutative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommutative(boolean newCommutative) {
		boolean oldCommutative = commutative;
		commutative = newCommutative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__COMMUTATIVE, oldCommutative, commutative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList.Resolving<Argument>(Argument.class, this, TheoryextensionPackage.OPERATOR__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecedent() {
		return precedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedent(int newPrecedent) {
		int oldPrecedent = precedent;
		precedent = newPrecedent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__PRECEDENT, oldPrecedent, precedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWd() {
		return wd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWd(String newWd) {
		String oldWd = wd;
		wd = newWd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__WD, oldWd, wd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(String newCase) {
		String oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.OPERATOR__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList.Resolving<Case>(Case.class, this, TheoryextensionPackage.OPERATOR__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.OPERATOR__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.OPERATOR__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case TheoryextensionPackage.OPERATOR__TYPE:
				return getType();
			case TheoryextensionPackage.OPERATOR__NOTATION:
				return getNotation();
			case TheoryextensionPackage.OPERATOR__ASSOCIATIVE:
				return isAssociative();
			case TheoryextensionPackage.OPERATOR__COMMUTATIVE:
				return isCommutative();
			case TheoryextensionPackage.OPERATOR__ARGUMENTS:
				return getArguments();
			case TheoryextensionPackage.OPERATOR__PRECEDENT:
				return getPrecedent();
			case TheoryextensionPackage.OPERATOR__WD:
				return getWd();
			case TheoryextensionPackage.OPERATOR__DEFINITION:
				return getDefinition();
			case TheoryextensionPackage.OPERATOR__CASE:
				return getCase();
			case TheoryextensionPackage.OPERATOR__CASES:
				return getCases();
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
			case TheoryextensionPackage.OPERATOR__TYPE:
				setType((String)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__NOTATION:
				setNotation((Notation)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__ASSOCIATIVE:
				setAssociative((Boolean)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__COMMUTATIVE:
				setCommutative((Boolean)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__PRECEDENT:
				setPrecedent((Integer)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__WD:
				setWd((String)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__DEFINITION:
				setDefinition((String)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__CASE:
				setCase((String)newValue);
				return;
			case TheoryextensionPackage.OPERATOR__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
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
			case TheoryextensionPackage.OPERATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__NOTATION:
				setNotation(NOTATION_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__ASSOCIATIVE:
				setAssociative(ASSOCIATIVE_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__COMMUTATIVE:
				setCommutative(COMMUTATIVE_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__ARGUMENTS:
				getArguments().clear();
				return;
			case TheoryextensionPackage.OPERATOR__PRECEDENT:
				setPrecedent(PRECEDENT_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__WD:
				setWd(WD_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__CASE:
				setCase(CASE_EDEFAULT);
				return;
			case TheoryextensionPackage.OPERATOR__CASES:
				getCases().clear();
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
			case TheoryextensionPackage.OPERATOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TheoryextensionPackage.OPERATOR__NOTATION:
				return notation != NOTATION_EDEFAULT;
			case TheoryextensionPackage.OPERATOR__ASSOCIATIVE:
				return associative != ASSOCIATIVE_EDEFAULT;
			case TheoryextensionPackage.OPERATOR__COMMUTATIVE:
				return commutative != COMMUTATIVE_EDEFAULT;
			case TheoryextensionPackage.OPERATOR__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case TheoryextensionPackage.OPERATOR__PRECEDENT:
				return precedent != PRECEDENT_EDEFAULT;
			case TheoryextensionPackage.OPERATOR__WD:
				return WD_EDEFAULT == null ? wd != null : !WD_EDEFAULT.equals(wd);
			case TheoryextensionPackage.OPERATOR__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case TheoryextensionPackage.OPERATOR__CASE:
				return CASE_EDEFAULT == null ? case_ != null : !CASE_EDEFAULT.equals(case_);
			case TheoryextensionPackage.OPERATOR__CASES:
				return cases != null && !cases.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", notation: ");
		result.append(notation);
		result.append(", associative: ");
		result.append(associative);
		result.append(", commutative: ");
		result.append(commutative);
		result.append(", precedent: ");
		result.append(precedent);
		result.append(", wd: ");
		result.append(wd);
		result.append(", definition: ");
		result.append(definition);
		result.append(", case: ");
		result.append(case_);
		result.append(')');
		return result.toString();
	}

} //OperatorImpl
