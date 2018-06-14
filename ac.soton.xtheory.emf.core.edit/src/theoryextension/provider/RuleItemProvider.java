/**
 */
package theoryextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.provider.EventBNamedCommentedElementItemProvider;

import theoryextension.Rule;
import theoryextension.TheoryextensionFactory;
import theoryextension.TheoryextensionPackage;

/**
 * This is the item provider adapter for a {@link theoryextension.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider extends EventBNamedCommentedElementItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TheoryextensionPackage.Literals.RULE__RULE);
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
	 * This returns Rule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Rule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Rule_type") :
			getString("_UI_Rule_type") + " " + label;
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

		switch (notification.getFeatureID(Rule.class)) {
			case TheoryextensionPackage.RULE__RULE:
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
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createOperator()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createArgument()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createRecursivity()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createType()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createConstructor()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createDestructor()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createAxiom()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createTheorem()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createRule()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createRewriteRule()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createRewrite()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createConditionalRewriteRule()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	TheoryextensionFactory.eINSTANCE.createVariable()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	CoreFactory.eINSTANCE.createProject()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	CoreFactory.eINSTANCE.createExtension()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	CoreFactory.eINSTANCE.createAttribute()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	CoreFactory.eINSTANCE.createAnnotation()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createMachine()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createVariable()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createInvariant()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createVariant()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createEvent()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createParameter()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createGuard()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createWitness()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	MachineFactory.eINSTANCE.createAction()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	ContextFactory.eINSTANCE.createContext()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	ContextFactory.eINSTANCE.createConstant()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	ContextFactory.eINSTANCE.createCarrierSet()));
		
			newChildDescriptors.add
				(createChildParameter
					(TheoryextensionPackage.Literals.RULE__RULE,
				 	ContextFactory.eINSTANCE.createAxiom()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.EVENT_BOBJECT__ANNOTATIONS ||
			childFeature == TheoryextensionPackage.Literals.RULE__RULE ||
			childFeature == CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
