/*
 * generated by Xtext 2.14.0
 */
package ac.soton.theory.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TheoryAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/theory/xtext/parser/antlr/internal/InternalTheory.tokens");
	}
}
