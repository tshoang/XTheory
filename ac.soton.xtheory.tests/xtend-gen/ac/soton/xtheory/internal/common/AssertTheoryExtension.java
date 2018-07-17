package ac.soton.xtheory.internal.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eventb.emf.core.EventBNamed;
import org.junit.Assert;
import theoryextension.Argument;
import theoryextension.Axiom;
import theoryextension.Case;
import theoryextension.ConditionalRewriteRule;
import theoryextension.Constructor;
import theoryextension.Destructor;
import theoryextension.Given;
import theoryextension.Notation;
import theoryextension.Operator;
import theoryextension.Parameter;
import theoryextension.RewriteRule;
import theoryextension.RuleBlock;
import theoryextension.Theorem;
import theoryextension.Theory;
import theoryextension.TheoryextensionPackage;
import theoryextension.Type;
import theoryextension.UnconditionalRewrite;
import theoryextension.Variable;

@SuppressWarnings("all")
public class AssertTheoryExtension {
  /**
   * Utility method to register the Context EPackage. This is done by simply
   * access the eClass of the ContextPackage's {@link ContextPackage.eINSTANCE}.
   */
  public EClass registerTheoryEPackage() {
    return TheoryextensionPackage.eINSTANCE.eClass();
  }
  
  public void assertTheory(final Theory thy, final String expectedName, final String expectedComments) {
    Assert.assertNotNull("Input context must not be null", thy);
    Assert.assertEquals("Incorrect context\'s name", expectedName, thy.getName());
  }
  
  public void assertTheoryParameters(final Theory thy, final String... expectedParameters) {
    Assert.assertNotNull("Input theory must not be null", thy);
    final EList<Parameter> actualParameters = thy.getParameters();
    Assert.assertEquals("Incorrect number of parameters", 
      expectedParameters.length, ((Object[])Conversions.unwrapArray(actualParameters, Object.class)).length);
    for (int i = 0; (i < expectedParameters.length); i++) {
      Assert.assertEquals("Incorrect parameter name", 
        expectedParameters[i], this.prettyPrint(actualParameters.get(i)));
    }
  }
  
  public void assertTheoryInternalElements(final Theory thy, final String... expectedInternalElements) {
    Assert.assertNotNull("Input theory must not be null", thy);
    final EList<EventBNamed> actualInternalElements = thy.getInternalElements();
    Assert.assertEquals("Incorrect number of internalElements", 
      expectedInternalElements.length, ((Object[])Conversions.unwrapArray(actualInternalElements, Object.class)).length);
    for (int i = 0; (i < expectedInternalElements.length); i++) {
      Assert.assertEquals("Incorrect internalElement name", 
        expectedInternalElements[i], this.prettyPrint(actualInternalElements.get(i)));
    }
  }
  
  private String prettyPrint(final EventBNamed lmnt) {
    String str = lmnt.getName();
    if ((lmnt instanceof Type)) {
      int _length = ((Object[])Conversions.unwrapArray(((Type)lmnt).getParameters(), Object.class)).length;
      boolean _notEquals = (_length != 0);
      if (_notEquals) {
        String _str = str;
        str = (_str + "( ");
        EList<Parameter> _parameters = ((Type)lmnt).getParameters();
        for (final Parameter para : _parameters) {
          String _str_1 = str;
          Object _prettyPrint = this.prettyPrint(para);
          String _plus = (_prettyPrint + " ");
          str = (_str_1 + _plus);
        }
        String _str_2 = str;
        str = (_str_2 + ")");
      }
      String _str_3 = str;
      str = (_str_3 + " =");
      EList<Constructor> _constructors = ((Type)lmnt).getConstructors();
      for (final Constructor cons : _constructors) {
        {
          String _str_4 = str;
          String _name = cons.getName();
          String _plus_1 = (" " + _name);
          str = (_str_4 + _plus_1);
          int _length_1 = ((Object[])Conversions.unwrapArray(cons.getDestructors(), Object.class)).length;
          boolean _notEquals_1 = (_length_1 != 0);
          if (_notEquals_1) {
            String _str_5 = str;
            str = (_str_5 + "( ");
            EList<Destructor> _destructors = cons.getDestructors();
            for (final Destructor des : _destructors) {
              String _str_6 = str;
              String _name_1 = des.getName();
              String _plus_2 = (_name_1 + ": ");
              String _type = des.getType();
              String _plus_3 = (_plus_2 + _type);
              String _plus_4 = (_plus_3 + " ");
              str = (_str_6 + _plus_4);
            }
            String _str_7 = str;
            str = (_str_7 + ")");
          }
        }
      }
    }
    if ((lmnt instanceof Argument)) {
      String _str_4 = str;
      String _type = ((Argument)lmnt).getType();
      String _plus_1 = (": " + _type);
      str = (_str_4 + _plus_1);
    }
    if ((lmnt instanceof Operator)) {
      int _length_1 = ((Object[])Conversions.unwrapArray(((Operator)lmnt).getArguments(), Object.class)).length;
      boolean _notEquals_1 = (_length_1 != 0);
      if (_notEquals_1) {
        String _str_5 = str;
        str = (_str_5 + "( ");
        EList<Argument> _arguments = ((Operator)lmnt).getArguments();
        for (final Argument arg : _arguments) {
          String _str_6 = str;
          Object _prettyPrint_1 = this.prettyPrint(arg);
          String _plus_2 = (_prettyPrint_1 + " ");
          str = (_str_6 + _plus_2);
        }
        String _str_7 = str;
        str = (_str_7 + ")");
      }
      String _str_8 = str;
      String _elvis = null;
      String _type_1 = ((Operator)lmnt).getType();
      if (_type_1 != null) {
        _elvis = _type_1;
      } else {
        _elvis = "";
      }
      String _plus_3 = (":" + _elvis);
      String _plus_4 = (_plus_3 + ":");
      str = (_str_8 + _plus_4);
      String _str_9 = str;
      String _switchResult = null;
      Notation _notation = ((Operator)lmnt).getNotation();
      if (_notation != null) {
        switch (_notation) {
          case PREFIX:
            _switchResult = "prefix:";
            break;
          case INFIX:
            _switchResult = "infix:";
            break;
          case POSTFIX:
            _switchResult = "postfix:";
            break;
          default:
            break;
        }
      }
      str = (_str_9 + _switchResult);
      boolean _isAssociative = ((Operator)lmnt).isAssociative();
      if (_isAssociative) {
        String _str_10 = str;
        str = (_str_10 + "associative:");
      }
      boolean _isCommutative = ((Operator)lmnt).isCommutative();
      if (_isCommutative) {
        String _str_11 = str;
        str = (_str_11 + "commutative:");
      }
      String _str_12 = str;
      String _elvis_1 = null;
      String _string = Integer.valueOf(((Operator)lmnt).getPrecedent()).toString();
      if (_string != null) {
        _elvis_1 = _string;
      } else {
        _elvis_1 = "";
      }
      String _plus_5 = (_elvis_1 + ":");
      String _elvis_2 = null;
      String _wd = ((Operator)lmnt).getWd();
      if (_wd != null) {
        _elvis_2 = _wd;
      } else {
        _elvis_2 = "";
      }
      String _plus_6 = (_plus_5 + _elvis_2);
      str = (_str_12 + _plus_6);
      String _str_13 = str;
      String _elvis_3 = null;
      String _definition = ((Operator)lmnt).getDefinition();
      if (_definition != null) {
        _elvis_3 = _definition;
      } else {
        _elvis_3 = "";
      }
      String _plus_7 = ("=" + _elvis_3);
      String _plus_8 = (_plus_7 + "|");
      String _elvis_4 = null;
      String _case = ((Operator)lmnt).getCase();
      if (_case != null) {
        _elvis_4 = _case;
      } else {
        _elvis_4 = "";
      }
      String _string_1 = _elvis_4.toString();
      String _plus_9 = (_plus_8 + _string_1);
      str = (_str_13 + _plus_9);
      EList<Case> _cases = ((Operator)lmnt).getCases();
      for (final Case cas : _cases) {
        String _str_14 = str;
        String _pattern = cas.getPattern();
        String _plus_10 = (" " + _pattern);
        String _plus_11 = (_plus_10 + " => ");
        String _formula = cas.getFormula();
        String _plus_12 = (_plus_11 + _formula);
        str = (_str_14 + _plus_12);
      }
    }
    if ((lmnt instanceof Theorem)) {
      String _str_15 = str;
      String _predicate = ((Theorem)lmnt).getPredicate();
      String _plus_13 = (": " + _predicate);
      str = (_str_15 + _plus_13);
    }
    if ((lmnt instanceof Axiom)) {
      String _str_16 = str;
      String _predicate_1 = ((Axiom)lmnt).getPredicate();
      String _plus_14 = (": " + _predicate_1);
      str = (_str_16 + _plus_14);
    }
    if ((lmnt instanceof Variable)) {
      String _str_17 = str;
      String _type_2 = ((Variable)lmnt).getType();
      String _plus_15 = (": " + _type_2);
      str = (_str_17 + _plus_15);
    }
    if ((lmnt instanceof RuleBlock)) {
      String _str_18 = str;
      str = (_str_18 + ": ");
      EList<Variable> _variables = ((RuleBlock)lmnt).getVariables();
      for (final Variable vari : _variables) {
        String _str_19 = str;
        Object _prettyPrint_2 = this.prettyPrint(vari);
        String _plus_16 = (_prettyPrint_2 + " ");
        str = (_str_19 + _plus_16);
      }
      RewriteRule _rrule = ((RuleBlock)lmnt).getRule().getRrule();
      boolean _tripleNotEquals = (_rrule != null);
      if (_tripleNotEquals) {
        String _str_20 = str;
        String _pattern_1 = ((RuleBlock)lmnt).getRule().getRrule().getPattern();
        String _plus_17 = (_pattern_1 + " ==");
        str = (_str_20 + _plus_17);
        UnconditionalRewrite _urule = ((RuleBlock)lmnt).getRule().getRrule().getUrule();
        boolean _tripleNotEquals_1 = (_urule != null);
        if (_tripleNotEquals_1) {
          EList<String> _rhs = ((RuleBlock)lmnt).getRule().getRrule().getUrule().getRhs();
          for (final String s : _rhs) {
            String _str_21 = str;
            str = (_str_21 + (" " + s));
          }
        } else {
          EList<ConditionalRewriteRule> _rewrites = ((RuleBlock)lmnt).getRule().getRrule().getCrule().getRewrites();
          for (final ConditionalRewriteRule crr : _rewrites) {
            String _str_22 = str;
            String _lhs = crr.getLhs();
            String _plus_18 = (" " + _lhs);
            String _plus_19 = (_plus_18 + " => ");
            String _rhs_1 = crr.getRhs();
            String _plus_20 = (_plus_19 + _rhs_1);
            str = (_str_22 + _plus_20);
          }
        }
      } else {
        EList<Given> _given = ((RuleBlock)lmnt).getRule().getIrule().getGiven();
        for (final Given giv : _given) {
          {
            String _str_23 = str;
            String _expression = giv.getExpression();
            String _plus_21 = (_expression + " ");
            str = (_str_23 + _plus_21);
            boolean _isRequired = giv.isRequired();
            if (_isRequired) {
              String _str_24 = str;
              str = (_str_24 + "required ");
            }
          }
        }
        String _str_23 = str;
        String _expression = ((RuleBlock)lmnt).getRule().getIrule().getInfer().getExpression();
        String _plus_21 = ("|- " + _expression);
        str = (_str_23 + _plus_21);
      }
    }
    return str;
  }
}
