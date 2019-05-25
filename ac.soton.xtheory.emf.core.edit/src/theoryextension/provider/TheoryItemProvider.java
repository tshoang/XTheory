/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.provider.EventBNamedItemProvider;

import theoryextension.Theory;
import theoryextension.TheoryextensionFactory;
import theoryextension.TheoryextensionPackage;

/**
 * This is the item provider adapter for a {@link theoryextension.Theory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoryItemProvider
	extends EventBNamedItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoryItemProvider(AdapterFactory adapterFactory) {
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

			addImportsPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addOperatorsPropertyDescriptor(object);
			addTypesPropertyDescriptor(object);
			addAxiomsPropertyDescriptor(object);
			addTheoremsPropertyDescriptor(object);
			addRulesPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_imports_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__IMPORTS,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_parameters_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__PARAMETERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_operators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_operators_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__OPERATORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_types_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Axioms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxiomsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_axioms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_axioms_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__AXIOMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Theorems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheoremsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_theorems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_theorems_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__THEOREMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_rules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_rules_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__RULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Theory_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Theory_variables_feature", "_UI_Theory_type"),
				 TheoryextensionPackage.Literals.THEORY__VARIABLES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS);
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
	 * This returns Theory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Theory"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Theory)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Theory_type") :
			getString("_UI_Theory_type") + " " + label;
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

		switch (notification.getFeatureID(Theory.class)) {
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
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
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createTheory()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createParameter()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createOperator()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createArgument()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createType()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createConstructor()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createDestructor()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createAxiom()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createTheorem()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createRuleBlock()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	TheoryextensionFactory.eINSTANCE.createVariable()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	CoreFactory.eINSTANCE.createProject()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createMachine()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createVariable()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createInvariant()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createEvent()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createParameter()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createGuard()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createWitness()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	MachineFactory.eINSTANCE.createAction()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	ContextFactory.eINSTANCE.createContext()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	ContextFactory.eINSTANCE.createConstant()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	ContextFactory.eINSTANCE.createCarrierSet()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.THEORY__INTERNAL_ELEMENTS,
				 	ContextFactory.eINSTANCE.createAxiom()));
	}

}
