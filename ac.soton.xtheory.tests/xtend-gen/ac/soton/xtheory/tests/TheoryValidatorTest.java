package ac.soton.xtheory.tests;

import ac.soton.xtheory.internal.common.AssertTheoryExtension;
import ac.soton.xtheory.tests.TheoryInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import theoryextension.Theory;
import theoryextension.TheoryextensionPackage;

@RunWith(XtextRunner.class)
@InjectWith(TheoryInjectorProvider.class)
@SuppressWarnings("all")
public class TheoryValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Theory> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Extension
  private AssertTheoryExtension _assertTheoryExtension = new AssertTheoryExtension();
  
  @Before
  public void registerEPackages() {
    this._assertTheoryExtension.registerTheoryEPackage();
  }
  
  @Test
  public void testTheoryName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory thy");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Theory name should be the same as the file name");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInternalElementsName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("theorems @thm0: \"blablabla\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("axioms @thm0: \"blablabla\"");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Internal elements\' names should be distinct");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInternalElementsName2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("types List = nil");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("axioms @List: \"blablabla\"");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Internal elements\' names should be distinct");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDestructorName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("types List = nil | cons(head: \"T\", cons: \"List(T)\")");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(testInput));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixArgumentsNumber() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators op infix");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Infix operator must need at least two arguments");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInfixArgumentsNumber_2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators op(x: \"NAT\") infix");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Infix operator must need at least two arguments");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPostfixArgumentsNumber() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators op postfix");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Postfix operator must need at least one argument");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCaseIsArgument() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators plus(x: \"NAT\", y:\"NAT\") = case z \"INT\" => \"x+y\"");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "Case must be an argument");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssociativeArgumentsNumber() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators plus(x: \"NAT\") associative");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "An associative operator must have at least 2 arguments");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCommutativeArgumentsNumber() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("operators plus(x: \"NAT\") associative");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "An commutative operator must have at least 2 arguments");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBaseConstrutor() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("theory __synthetic0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("types int = cons(zero: \"zero\")");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(testInput), TheoryextensionPackage.eINSTANCE.getTheory(), null, 
        "A type needs a base constructor");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
