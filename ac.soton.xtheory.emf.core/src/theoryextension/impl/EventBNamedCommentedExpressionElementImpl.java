/**
 */
package theoryextension.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBCommentedElement;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.EventBObject;

import org.eventb.emf.core.impl.EventBExpressionImpl;
import org.eventb.emf.core.impl.StringToAttributeMapEntryImpl;

import theoryextension.EventBNamedCommentedExpressionElement;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event BNamed Commented Expression Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#isGenerated <em>Generated</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#isLocalGenerated <em>Local Generated</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getInternalId <em>Internal Id</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link theoryextension.impl.EventBNamedCommentedExpressionElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventBNamedCommentedExpressionElementImpl extends EventBExpressionImpl implements EventBNamedCommentedExpressionElement {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExtension> extensions;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Attribute> attributes;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = "";

	/**
	 * The default value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isLocalGenerated() <em>Local Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalGenerated() <em>Local Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalGenerated()
	 * @generated
	 * @ordered
	 */
	protected boolean localGenerated = LOCAL_GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected String internalId = INTERNAL_ID_EDEFAULT;

	/**
	 * This is true if the Internal Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean internalIdESet;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBNamedCommentedExpressionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS, CorePackage.ANNOTATION__EVENT_BOBJECT);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList.Resolving<AbstractExtension>(AbstractExtension.class, this, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EcoreEMap<String,Attribute>(CorePackage.Literals.STRING_TO_ATTRIBUTE_MAP_ENTRY, StringToAttributeMapEntryImpl.class, this, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		// TODO: implement this method to return the 'Reference' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerated() {
		// TODO: implement this method to return the 'Generated' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(boolean newGenerated) {
		// TODO: implement this method to set the 'Generated' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalGenerated() {
		return localGenerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalGenerated(boolean newLocalGenerated) {
		boolean oldLocalGenerated = localGenerated;
		localGenerated = newLocalGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED, oldLocalGenerated, localGenerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalId() {
		return internalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalId(String newInternalId) {
		String oldInternalId = internalId;
		internalId = newInternalId;
		boolean oldInternalIdESet = internalIdESet;
		internalIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID, oldInternalId, internalId, !oldInternalIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalId() {
		String oldInternalId = internalId;
		boolean oldInternalIdESet = internalIdESet;
		internalId = INTERNAL_ID_EDEFAULT;
		internalIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID, oldInternalId, INTERNAL_ID_EDEFAULT, oldInternalIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalId() {
		return internalIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String doGetName() {
		if (this.eIsProxy()){
			String fragment = ((InternalEObject)this).eProxyURI().fragment();
			int ind = fragment.lastIndexOf("::");
			if (ind>-1) fragment = fragment.substring(ind+2);
			fragment = fragment.substring(fragment.lastIndexOf('.')+1);
			return fragment;
		}else{
			return name;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String doGetReference() {
		if (this.eIsProxy()){
			return ((InternalEObject)this).eProxyURI().fragment();
		}else{
			String ref = getElementIdentification();
			EObject container = this.eContainer();
			while (container instanceof EventBElementImpl && !(container instanceof Project)){
				ref = ((EventBElementImpl)container).getElementIdentification()+"."+ref;
				container = container.eContainer();
			}
			ref = getElementTypePrefix()+"::"+ref;
			return ref;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementTypePrefix() {
		return this.eClass().getEPackage().getNsURI()+"::"+this.eClass().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBObject getContaining(final EClass eClass) {
		EventBObject bObject = this;
		while (!eClass.isSuperTypeOf(bObject.eClass()))
			if (bObject.eContainer() instanceof EventBObject) bObject=(EventBObject)bObject.eContainer();
			else return null;
		return bObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAllContained(final EClass eClass, final boolean resolve) {
		EList<EObject> typeObjects = new BasicEList<EObject>();
		typeObjects.add(null);	//include the null object
		for (TreeIterator<EObject>trit = EcoreUtil.getAllContents(this, resolve); trit.hasNext();){
			EObject o = trit.next();
			if (eClass.isSuperTypeOf(o.eClass())) typeObjects.add(o);
		}
		return typeObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation(final String source) {
		for (Annotation annotation : getAnnotations()){
			if (source.equals(annotation.getSource())) return annotation;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				return getAnnotations();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
				return getExtensions();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__REFERENCE:
				return getReference();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED:
				return isGenerated();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED:
				return isLocalGenerated();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID:
				return getInternalId();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT:
				return getComment();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME:
				return getName();
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
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends AbstractExtension>)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED:
				setGenerated((Boolean)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED:
				setLocalGenerated((Boolean)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID:
				setInternalId((String)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT:
				setComment((String)newValue);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME:
				setName((String)newValue);
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
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED:
				setGenerated(GENERATED_EDEFAULT);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED:
				setLocalGenerated(LOCAL_GENERATED_EDEFAULT);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID:
				unsetInternalId();
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED:
				return isGenerated() != GENERATED_EDEFAULT;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED:
				return localGenerated != LOCAL_GENERATED_EDEFAULT;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID:
				return isSetInternalId();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBObject.class) {
			switch (derivedFeatureID) {
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS: return CorePackage.EVENT_BOBJECT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == EventBElement.class) {
			switch (derivedFeatureID) {
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS: return CorePackage.EVENT_BELEMENT__EXTENSIONS;
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES: return CorePackage.EVENT_BELEMENT__ATTRIBUTES;
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__REFERENCE: return CorePackage.EVENT_BELEMENT__REFERENCE;
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED: return CorePackage.EVENT_BELEMENT__GENERATED;
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED: return CorePackage.EVENT_BELEMENT__LOCAL_GENERATED;
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID: return CorePackage.EVENT_BELEMENT__INTERNAL_ID;
				default: return -1;
			}
		}
		if (baseClass == EventBCommented.class) {
			switch (derivedFeatureID) {
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT: return CorePackage.EVENT_BCOMMENTED__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == EventBCommentedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBNamed.class) {
			switch (derivedFeatureID) {
				case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME: return CorePackage.EVENT_BNAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == EventBNamedCommentedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBObject.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BOBJECT__ANNOTATIONS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == EventBElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BELEMENT__EXTENSIONS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS;
				case CorePackage.EVENT_BELEMENT__ATTRIBUTES: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES;
				case CorePackage.EVENT_BELEMENT__REFERENCE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__REFERENCE;
				case CorePackage.EVENT_BELEMENT__GENERATED: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED;
				case CorePackage.EVENT_BELEMENT__LOCAL_GENERATED: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED;
				case CorePackage.EVENT_BELEMENT__INTERNAL_ID: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID;
				default: return -1;
			}
		}
		if (baseClass == EventBCommented.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BCOMMENTED__COMMENT: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == EventBCommentedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBNamed.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BNAMED__NAME: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == EventBNamedCommentedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseOperationID) {
				case EcorePackage.EOBJECT___ECLASS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == EventBObject.class) {
			switch (baseOperationID) {
				case CorePackage.EVENT_BOBJECT___GET_CONTAINING__ECLASS: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_CONTAINING__ECLASS;
				case CorePackage.EVENT_BOBJECT___GET_ALL_CONTAINED__ECLASS_BOOLEAN: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ALL_CONTAINED__ECLASS_BOOLEAN;
				case CorePackage.EVENT_BOBJECT___GET_ANNOTATION__STRING: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == EventBElement.class) {
			switch (baseOperationID) {
				case CorePackage.EVENT_BELEMENT___DO_GET_REFERENCE: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___DO_GET_REFERENCE;
				case CorePackage.EVENT_BELEMENT___GET_ELEMENT_TYPE_PREFIX: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ELEMENT_TYPE_PREFIX;
				default: return -1;
			}
		}
		if (baseClass == EventBCommented.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EventBCommentedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EventBNamed.class) {
			switch (baseOperationID) {
				case CorePackage.EVENT_BNAMED___DO_GET_NAME: return TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___DO_GET_NAME;
				default: return -1;
			}
		}
		if (baseClass == EventBNamedCommentedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___DO_GET_NAME:
				return doGetName();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___DO_GET_REFERENCE:
				return doGetReference();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ELEMENT_TYPE_PREFIX:
				return getElementTypePrefix();
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_CONTAINING__ECLASS:
				return getContaining((EClass)arguments.get(0));
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ALL_CONTAINED__ECLASS_BOOLEAN:
				return getAllContained((EClass)arguments.get(0), (Boolean)arguments.get(1));
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (localGenerated: ");
		result.append(localGenerated);
		result.append(", internalId: ");
		if (internalIdESet) result.append(internalId); else result.append("<unset>");
		result.append(", comment: ");
		result.append(comment);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EventBNamedCommentedExpressionElementImpl
