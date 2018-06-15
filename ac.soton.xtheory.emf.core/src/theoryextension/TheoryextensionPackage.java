/**
 */
package theoryextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see theoryextension.TheoryextensionFactory
 * @model kind="package"
 * @generated
 */
public interface TheoryextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "theoryextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/theoryextension/2018";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "theoryextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheoryextensionPackage eINSTANCE = theoryextension.impl.TheoryextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link theoryextension.impl.TheoryImpl <em>Theory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.TheoryImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getTheory()
	 * @generated
	 */
	int THEORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__NAME = CorePackage.EVENT_BNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__IMPORTS = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__PARAMETERS = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__OPERATORS = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__TYPES = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__AXIOMS = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__THEOREMS = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__RULES = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__VARIABLES = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Theory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY_FEATURE_COUNT = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link theoryextension.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.ParameterImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CorePackage.EVENT_BNAMED__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CorePackage.EVENT_BNAMED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link theoryextension.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.OperatorImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NOTATION = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ASSOCIATIVE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commutative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COMMUTATIVE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ARGUMENTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Precedent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PRECEDENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__WD = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__DEFINITION = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CASE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__CASES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link theoryextension.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.CaseImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__EXPRESSION = CorePackage.EVENT_BEXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PATTERN = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__FORMULA = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link theoryextension.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.ArgumentImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.TypeImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONSTRUCTORS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link theoryextension.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.ConstructorImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Destructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DESTRUCTORS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.DestructorImpl <em>Destructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.DestructorImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getDestructor()
	 * @generated
	 */
	int DESTRUCTOR = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Destructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTOR_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.AxiomImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.TheoremImpl <em>Theorem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.TheoremImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getTheorem()
	 * @generated
	 */
	int THEOREM = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Theorem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.RuleImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RRULE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Irule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IRULE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link theoryextension.impl.RewriteRuleImpl <em>Rewrite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.RewriteRuleImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getRewriteRule()
	 * @generated
	 */
	int REWRITE_RULE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__ANNOTATIONS = CorePackage.EVENT_BOBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Case Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__IS_CASE_COMPLETE = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applicability Is Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applicability Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__PATTERN = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Urule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__URULE = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE__CRULE = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rewrite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_RULE_FEATURE_COUNT = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link theoryextension.impl.RewriteImpl <em>Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.RewriteImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getRewrite()
	 * @generated
	 */
	int REWRITE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__EXPRESSION = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__FORMULA = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link theoryextension.impl.UnconditionalRewriteImpl <em>Unconditional Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.UnconditionalRewriteImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getUnconditionalRewrite()
	 * @generated
	 */
	int UNCONDITIONAL_REWRITE = 13;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONAL_REWRITE__RHS = 0;

	/**
	 * The number of structural features of the '<em>Unconditional Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONDITIONAL_REWRITE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.ConditionalRewriteImpl <em>Conditional Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.ConditionalRewriteImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getConditionalRewrite()
	 * @generated
	 */
	int CONDITIONAL_REWRITE = 14;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE__REWRITES = 0;

	/**
	 * The number of structural features of the '<em>Conditional Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.ConditionalRewriteRuleImpl <em>Conditional Rewrite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.ConditionalRewriteRuleImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getConditionalRewriteRule()
	 * @generated
	 */
	int CONDITIONAL_REWRITE_RULE = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE_RULE__ANNOTATIONS = CorePackage.EVENT_BOBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE_RULE__LHS = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE_RULE__RHS = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Rewrite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REWRITE_RULE_FEATURE_COUNT = CorePackage.EVENT_BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link theoryextension.impl.InferenceRuleImpl <em>Inference Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.InferenceRuleImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getInferenceRule()
	 * @generated
	 */
	int INFERENCE_RULE = 16;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__GIVEN = 0;

	/**
	 * The feature id for the '<em><b>Infer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__INFER = 1;

	/**
	 * The feature id for the '<em><b>Applicability Is Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Applicability Is Automatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC = 3;

	/**
	 * The number of structural features of the '<em>Inference Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link theoryextension.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.GivenImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__EXPRESSION = CorePackage.EVENT_BEXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__REQUIRED = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.impl.InferImpl <em>Infer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.InferImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getInfer()
	 * @generated
	 */
	int INFER = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFER__EXPRESSION = CorePackage.EVENT_BEXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Infer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFER_FEATURE_COUNT = CorePackage.EVENT_BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link theoryextension.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.impl.VariableImpl
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link theoryextension.Notation <em>Notation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see theoryextension.Notation
	 * @see theoryextension.impl.TheoryextensionPackageImpl#getNotation()
	 * @generated
	 */
	int NOTATION = 20;

	/**
	 * Returns the meta object for class '{@link theoryextension.Theory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theory</em>'.
	 * @see theoryextension.Theory
	 * @generated
	 */
	EClass getTheory();

	/**
	 * Returns the meta object for the attribute list '{@link theoryextension.Theory#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see theoryextension.Theory#getImports()
	 * @see #getTheory()
	 * @generated
	 */
	EAttribute getTheory_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see theoryextension.Theory#getParameters()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see theoryextension.Theory#getOperators()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see theoryextension.Theory#getTypes()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getAxioms <em>Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axioms</em>'.
	 * @see theoryextension.Theory#getAxioms()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Axioms();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getTheorems <em>Theorems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theorems</em>'.
	 * @see theoryextension.Theory#getTheorems()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Theorems();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see theoryextension.Theory#getRules()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Theory#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see theoryextension.Theory#getVariables()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Variables();

	/**
	 * Returns the meta object for class '{@link theoryextension.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see theoryextension.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link theoryextension.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see theoryextension.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see theoryextension.Operator#getType()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Type();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see theoryextension.Operator#getNotation()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Notation();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#isAssociative <em>Associative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associative</em>'.
	 * @see theoryextension.Operator#isAssociative()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Associative();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#isCommutative <em>Commutative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutative</em>'.
	 * @see theoryextension.Operator#isCommutative()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Commutative();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Operator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see theoryextension.Operator#getArguments()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getPrecedent <em>Precedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precedent</em>'.
	 * @see theoryextension.Operator#getPrecedent()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Precedent();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getWd <em>Wd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wd</em>'.
	 * @see theoryextension.Operator#getWd()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Wd();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see theoryextension.Operator#getDefinition()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Definition();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Operator#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see theoryextension.Operator#getCase()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Operator#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see theoryextension.Operator#getCases()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Cases();

	/**
	 * Returns the meta object for class '{@link theoryextension.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see theoryextension.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Case#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see theoryextension.Case#getPattern()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Case#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see theoryextension.Case#getFormula()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Formula();

	/**
	 * Returns the meta object for class '{@link theoryextension.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see theoryextension.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see theoryextension.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Type();

	/**
	 * Returns the meta object for class '{@link theoryextension.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see theoryextension.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Type#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see theoryextension.Type#getConstructors()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Constructors();

	/**
	 * Returns the meta object for the reference list '{@link theoryextension.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see theoryextension.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link theoryextension.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see theoryextension.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.Constructor#getDestructors <em>Destructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destructors</em>'.
	 * @see theoryextension.Constructor#getDestructors()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Destructors();

	/**
	 * Returns the meta object for class '{@link theoryextension.Destructor <em>Destructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destructor</em>'.
	 * @see theoryextension.Destructor
	 * @generated
	 */
	EClass getDestructor();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Destructor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see theoryextension.Destructor#getType()
	 * @see #getDestructor()
	 * @generated
	 */
	EAttribute getDestructor_Type();

	/**
	 * Returns the meta object for class '{@link theoryextension.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see theoryextension.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Axiom#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see theoryextension.Axiom#getPredicate()
	 * @see #getAxiom()
	 * @generated
	 */
	EAttribute getAxiom_Predicate();

	/**
	 * Returns the meta object for class '{@link theoryextension.Theorem <em>Theorem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theorem</em>'.
	 * @see theoryextension.Theorem
	 * @generated
	 */
	EClass getTheorem();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Theorem#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see theoryextension.Theorem#getPredicate()
	 * @see #getTheorem()
	 * @generated
	 */
	EAttribute getTheorem_Predicate();

	/**
	 * Returns the meta object for class '{@link theoryextension.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see theoryextension.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link theoryextension.Rule#getRrule <em>Rrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rrule</em>'.
	 * @see theoryextension.Rule#getRrule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Rrule();

	/**
	 * Returns the meta object for the containment reference '{@link theoryextension.Rule#getIrule <em>Irule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Irule</em>'.
	 * @see theoryextension.Rule#getIrule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Irule();

	/**
	 * Returns the meta object for class '{@link theoryextension.RewriteRule <em>Rewrite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite Rule</em>'.
	 * @see theoryextension.RewriteRule
	 * @generated
	 */
	EClass getRewriteRule();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.RewriteRule#isIsCaseComplete <em>Is Case Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Case Complete</em>'.
	 * @see theoryextension.RewriteRule#isIsCaseComplete()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EAttribute getRewriteRule_IsCaseComplete();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.RewriteRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability Is Interactive</em>'.
	 * @see theoryextension.RewriteRule#isApplicabilityIsInteractive()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EAttribute getRewriteRule_ApplicabilityIsInteractive();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.RewriteRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability Is Automatic</em>'.
	 * @see theoryextension.RewriteRule#isApplicabilityIsAutomatic()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EAttribute getRewriteRule_ApplicabilityIsAutomatic();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.RewriteRule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see theoryextension.RewriteRule#getPattern()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EAttribute getRewriteRule_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link theoryextension.RewriteRule#getUrule <em>Urule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Urule</em>'.
	 * @see theoryextension.RewriteRule#getUrule()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EReference getRewriteRule_Urule();

	/**
	 * Returns the meta object for the containment reference '{@link theoryextension.RewriteRule#getCrule <em>Crule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crule</em>'.
	 * @see theoryextension.RewriteRule#getCrule()
	 * @see #getRewriteRule()
	 * @generated
	 */
	EReference getRewriteRule_Crule();

	/**
	 * Returns the meta object for class '{@link theoryextension.Rewrite <em>Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite</em>'.
	 * @see theoryextension.Rewrite
	 * @generated
	 */
	EClass getRewrite();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Rewrite#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see theoryextension.Rewrite#getFormula()
	 * @see #getRewrite()
	 * @generated
	 */
	EAttribute getRewrite_Formula();

	/**
	 * Returns the meta object for class '{@link theoryextension.UnconditionalRewrite <em>Unconditional Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unconditional Rewrite</em>'.
	 * @see theoryextension.UnconditionalRewrite
	 * @generated
	 */
	EClass getUnconditionalRewrite();

	/**
	 * Returns the meta object for the attribute list '{@link theoryextension.UnconditionalRewrite#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rhs</em>'.
	 * @see theoryextension.UnconditionalRewrite#getRhs()
	 * @see #getUnconditionalRewrite()
	 * @generated
	 */
	EAttribute getUnconditionalRewrite_Rhs();

	/**
	 * Returns the meta object for class '{@link theoryextension.ConditionalRewrite <em>Conditional Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Rewrite</em>'.
	 * @see theoryextension.ConditionalRewrite
	 * @generated
	 */
	EClass getConditionalRewrite();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.ConditionalRewrite#getRewrites <em>Rewrites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrites</em>'.
	 * @see theoryextension.ConditionalRewrite#getRewrites()
	 * @see #getConditionalRewrite()
	 * @generated
	 */
	EReference getConditionalRewrite_Rewrites();

	/**
	 * Returns the meta object for class '{@link theoryextension.ConditionalRewriteRule <em>Conditional Rewrite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Rewrite Rule</em>'.
	 * @see theoryextension.ConditionalRewriteRule
	 * @generated
	 */
	EClass getConditionalRewriteRule();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.ConditionalRewriteRule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs</em>'.
	 * @see theoryextension.ConditionalRewriteRule#getLhs()
	 * @see #getConditionalRewriteRule()
	 * @generated
	 */
	EAttribute getConditionalRewriteRule_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.ConditionalRewriteRule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs</em>'.
	 * @see theoryextension.ConditionalRewriteRule#getRhs()
	 * @see #getConditionalRewriteRule()
	 * @generated
	 */
	EAttribute getConditionalRewriteRule_Rhs();

	/**
	 * Returns the meta object for class '{@link theoryextension.InferenceRule <em>Inference Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inference Rule</em>'.
	 * @see theoryextension.InferenceRule
	 * @generated
	 */
	EClass getInferenceRule();

	/**
	 * Returns the meta object for the containment reference list '{@link theoryextension.InferenceRule#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given</em>'.
	 * @see theoryextension.InferenceRule#getGiven()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EReference getInferenceRule_Given();

	/**
	 * Returns the meta object for the containment reference '{@link theoryextension.InferenceRule#getInfer <em>Infer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infer</em>'.
	 * @see theoryextension.InferenceRule#getInfer()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EReference getInferenceRule_Infer();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.InferenceRule#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability Is Interactive</em>'.
	 * @see theoryextension.InferenceRule#isApplicabilityIsInteractive()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EAttribute getInferenceRule_ApplicabilityIsInteractive();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.InferenceRule#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability Is Automatic</em>'.
	 * @see theoryextension.InferenceRule#isApplicabilityIsAutomatic()
	 * @see #getInferenceRule()
	 * @generated
	 */
	EAttribute getInferenceRule_ApplicabilityIsAutomatic();

	/**
	 * Returns the meta object for class '{@link theoryextension.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see theoryextension.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Given#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see theoryextension.Given#isRequired()
	 * @see #getGiven()
	 * @generated
	 */
	EAttribute getGiven_Required();

	/**
	 * Returns the meta object for class '{@link theoryextension.Infer <em>Infer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infer</em>'.
	 * @see theoryextension.Infer
	 * @generated
	 */
	EClass getInfer();

	/**
	 * Returns the meta object for class '{@link theoryextension.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see theoryextension.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link theoryextension.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see theoryextension.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for enum '{@link theoryextension.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notation</em>'.
	 * @see theoryextension.Notation
	 * @generated
	 */
	EEnum getNotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TheoryextensionFactory getTheoryextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link theoryextension.impl.TheoryImpl <em>Theory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.TheoryImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getTheory()
		 * @generated
		 */
		EClass THEORY = eINSTANCE.getTheory();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEORY__IMPORTS = eINSTANCE.getTheory_Imports();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__PARAMETERS = eINSTANCE.getTheory_Parameters();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__OPERATORS = eINSTANCE.getTheory_Operators();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__TYPES = eINSTANCE.getTheory_Types();

		/**
		 * The meta object literal for the '<em><b>Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__AXIOMS = eINSTANCE.getTheory_Axioms();

		/**
		 * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__THEOREMS = eINSTANCE.getTheory_Theorems();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__RULES = eINSTANCE.getTheory_Rules();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__VARIABLES = eINSTANCE.getTheory_Variables();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.ParameterImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.OperatorImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__TYPE = eINSTANCE.getOperator_Type();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__NOTATION = eINSTANCE.getOperator_Notation();

		/**
		 * The meta object literal for the '<em><b>Associative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__ASSOCIATIVE = eINSTANCE.getOperator_Associative();

		/**
		 * The meta object literal for the '<em><b>Commutative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__COMMUTATIVE = eINSTANCE.getOperator_Commutative();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__ARGUMENTS = eINSTANCE.getOperator_Arguments();

		/**
		 * The meta object literal for the '<em><b>Precedent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__PRECEDENT = eINSTANCE.getOperator_Precedent();

		/**
		 * The meta object literal for the '<em><b>Wd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__WD = eINSTANCE.getOperator_Wd();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__DEFINITION = eINSTANCE.getOperator_Definition();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__CASE = eINSTANCE.getOperator_Case();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__CASES = eINSTANCE.getOperator_Cases();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.CaseImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__PATTERN = eINSTANCE.getCase_Pattern();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__FORMULA = eINSTANCE.getCase_Formula();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.ArgumentImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.TypeImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__CONSTRUCTORS = eINSTANCE.getType_Constructors();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.ConstructorImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Destructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__DESTRUCTORS = eINSTANCE.getConstructor_Destructors();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.DestructorImpl <em>Destructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.DestructorImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getDestructor()
		 * @generated
		 */
		EClass DESTRUCTOR = eINSTANCE.getDestructor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTRUCTOR__TYPE = eINSTANCE.getDestructor_Type();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.AxiomImpl <em>Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.AxiomImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getAxiom()
		 * @generated
		 */
		EClass AXIOM = eINSTANCE.getAxiom();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIOM__PREDICATE = eINSTANCE.getAxiom_Predicate();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.TheoremImpl <em>Theorem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.TheoremImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getTheorem()
		 * @generated
		 */
		EClass THEOREM = eINSTANCE.getTheorem();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEOREM__PREDICATE = eINSTANCE.getTheorem_Predicate();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.RuleImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rrule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RRULE = eINSTANCE.getRule_Rrule();

		/**
		 * The meta object literal for the '<em><b>Irule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__IRULE = eINSTANCE.getRule_Irule();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.RewriteRuleImpl <em>Rewrite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.RewriteRuleImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getRewriteRule()
		 * @generated
		 */
		EClass REWRITE_RULE = eINSTANCE.getRewriteRule();

		/**
		 * The meta object literal for the '<em><b>Is Case Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_RULE__IS_CASE_COMPLETE = eINSTANCE.getRewriteRule_IsCaseComplete();

		/**
		 * The meta object literal for the '<em><b>Applicability Is Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE = eINSTANCE.getRewriteRule_ApplicabilityIsInteractive();

		/**
		 * The meta object literal for the '<em><b>Applicability Is Automatic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC = eINSTANCE.getRewriteRule_ApplicabilityIsAutomatic();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_RULE__PATTERN = eINSTANCE.getRewriteRule_Pattern();

		/**
		 * The meta object literal for the '<em><b>Urule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITE_RULE__URULE = eINSTANCE.getRewriteRule_Urule();

		/**
		 * The meta object literal for the '<em><b>Crule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITE_RULE__CRULE = eINSTANCE.getRewriteRule_Crule();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.RewriteImpl <em>Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.RewriteImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getRewrite()
		 * @generated
		 */
		EClass REWRITE = eINSTANCE.getRewrite();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE__FORMULA = eINSTANCE.getRewrite_Formula();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.UnconditionalRewriteImpl <em>Unconditional Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.UnconditionalRewriteImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getUnconditionalRewrite()
		 * @generated
		 */
		EClass UNCONDITIONAL_REWRITE = eINSTANCE.getUnconditionalRewrite();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCONDITIONAL_REWRITE__RHS = eINSTANCE.getUnconditionalRewrite_Rhs();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.ConditionalRewriteImpl <em>Conditional Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.ConditionalRewriteImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getConditionalRewrite()
		 * @generated
		 */
		EClass CONDITIONAL_REWRITE = eINSTANCE.getConditionalRewrite();

		/**
		 * The meta object literal for the '<em><b>Rewrites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_REWRITE__REWRITES = eINSTANCE.getConditionalRewrite_Rewrites();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.ConditionalRewriteRuleImpl <em>Conditional Rewrite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.ConditionalRewriteRuleImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getConditionalRewriteRule()
		 * @generated
		 */
		EClass CONDITIONAL_REWRITE_RULE = eINSTANCE.getConditionalRewriteRule();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_REWRITE_RULE__LHS = eINSTANCE.getConditionalRewriteRule_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_REWRITE_RULE__RHS = eINSTANCE.getConditionalRewriteRule_Rhs();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.InferenceRuleImpl <em>Inference Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.InferenceRuleImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getInferenceRule()
		 * @generated
		 */
		EClass INFERENCE_RULE = eINSTANCE.getInferenceRule();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFERENCE_RULE__GIVEN = eINSTANCE.getInferenceRule_Given();

		/**
		 * The meta object literal for the '<em><b>Infer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFERENCE_RULE__INFER = eINSTANCE.getInferenceRule_Infer();

		/**
		 * The meta object literal for the '<em><b>Applicability Is Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE = eINSTANCE.getInferenceRule_ApplicabilityIsInteractive();

		/**
		 * The meta object literal for the '<em><b>Applicability Is Automatic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC = eINSTANCE.getInferenceRule_ApplicabilityIsAutomatic();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.GivenImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIVEN__REQUIRED = eINSTANCE.getGiven_Required();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.InferImpl <em>Infer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.InferImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getInfer()
		 * @generated
		 */
		EClass INFER = eINSTANCE.getInfer();

		/**
		 * The meta object literal for the '{@link theoryextension.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.impl.VariableImpl
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link theoryextension.Notation <em>Notation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see theoryextension.Notation
		 * @see theoryextension.impl.TheoryextensionPackageImpl#getNotation()
		 * @generated
		 */
		EEnum NOTATION = eINSTANCE.getNotation();

	}

} //TheoryextensionPackage
