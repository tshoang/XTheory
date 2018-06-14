/**
 */
package theoryextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.provider.EventBExpressionItemProvider;

import theoryextension.EventBNamedCommentedExpressionElement;
import theoryextension.TheoryextensionPackage;

/**
 * This is the item provider adapter for a {@link theoryextension.EventBNamedCommentedExpressionElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventBNamedCommentedExpressionElementItemProvider extends EventBExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBNamedCommentedExpressionElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReferencePropertyDescriptor(object);
			addGeneratedPropertyDescriptor(object);
			addLocalGeneratedPropertyDescriptor(object);
			addInternalIdPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBElement_reference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBElement_reference_feature", "_UI_EventBElement_type"),
				 CorePackage.Literals.EVENT_BELEMENT__REFERENCE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBElement_generated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBElement_generated_feature", "_UI_EventBElement_type"),
				 CorePackage.Literals.EVENT_BELEMENT__GENERATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Generated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalGeneratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBElement_localGenerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBElement_localGenerated_feature", "_UI_EventBElement_type"),
				 CorePackage.Literals.EVENT_BELEMENT__LOCAL_GENERATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBElement_internalId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBElement_internalId_feature", "_UI_EventBElement_type"),
				 CorePackage.Literals.EVENT_BELEMENT__INTERNAL_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBCommented_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBCommented_comment_feature", "_UI_EventBCommented_type"),
				 CorePackage.Literals.EVENT_BCOMMENTED__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBNamed_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBNamed_name_feature", "_UI_EventBNamed_type"),
				 CorePackage.Literals.EVENT_BNAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.EVENT_BOBJECT__ANNOTATIONS);
			childrenFeatures.add(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS);
			childrenFeatures.add(CorePackage.Literals.EVENT_BELEMENT__ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EventBNamedCommentedExpressionElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EventBNamedCommentedExpressionElement_type") :
			getString("_UI_EventBNamedCommentedExpressionElement_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EventBNamedCommentedExpressionElement.class)) {
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__REFERENCE:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__GENERATED:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__LOCAL_GENERATED:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__INTERNAL_ID:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__COMMENT:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ANNOTATIONS:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__EXTENSIONS:
			case TheoryextensionPackage.EVENT_BNAMED_COMMENTED_EXPRESSION_ELEMENT__ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BOBJECT__ANNOTATIONS,
				 CoreFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 CoreFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BELEMENT__ATTRIBUTES,
				 CoreFactory.eINSTANCE.create(CorePackage.Literals.STRING_TO_ATTRIBUTE_MAP_ENTRY)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TheoryextensionEditPlugin.INSTANCE;
	}

}
