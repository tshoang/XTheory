package ac.soton.xtheory.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.xtheory.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'prefix'", "'infix'", "'postfix'", "'theory'", "'end'", "'('", "')'", "'imports'", "'types'", "'operators'", "'axioms'", "'theorems'", "'rules'", "'variables'", "'='", "'|'", "','", "':'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'=='", "'|-'", "'associative'", "'commutative'", "'required'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTheoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTheoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTheoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTheory.g"; }


    	private TheoryGrammarAccess grammarAccess;

    	public void setGrammarAccess(TheoryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTheory"
    // InternalTheory.g:53:1: entryRuleTheory : ruleTheory EOF ;
    public final void entryRuleTheory() throws RecognitionException {
        try {
            // InternalTheory.g:54:1: ( ruleTheory EOF )
            // InternalTheory.g:55:1: ruleTheory EOF
            {
             before(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            ruleTheory();

            state._fsp--;

             after(grammarAccess.getTheoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheory.g:62:1: ruleTheory : ( ( rule__Theory__Group__0 ) ) ;
    public final void ruleTheory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:66:2: ( ( ( rule__Theory__Group__0 ) ) )
            // InternalTheory.g:67:2: ( ( rule__Theory__Group__0 ) )
            {
            // InternalTheory.g:67:2: ( ( rule__Theory__Group__0 ) )
            // InternalTheory.g:68:3: ( rule__Theory__Group__0 )
            {
             before(grammarAccess.getTheoryAccess().getGroup()); 
            // InternalTheory.g:69:3: ( rule__Theory__Group__0 )
            // InternalTheory.g:69:4: rule__Theory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleParameter"
    // InternalTheory.g:78:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalTheory.g:79:1: ( ruleParameter EOF )
            // InternalTheory.g:80:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTheory.g:87:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:91:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalTheory.g:92:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalTheory.g:92:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalTheory.g:93:3: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // InternalTheory.g:94:3: ( rule__Parameter__NameAssignment )
            // InternalTheory.g:94:4: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalTheory.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalTheory.g:104:1: ( ruleType EOF )
            // InternalTheory.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTheory.g:112:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:116:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalTheory.g:117:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalTheory.g:117:2: ( ( rule__Type__Group__0 ) )
            // InternalTheory.g:118:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalTheory.g:119:3: ( rule__Type__Group__0 )
            // InternalTheory.g:119:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleConstructor"
    // InternalTheory.g:128:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // InternalTheory.g:129:1: ( ruleConstructor EOF )
            // InternalTheory.g:130:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalTheory.g:137:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:141:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // InternalTheory.g:142:2: ( ( rule__Constructor__Group__0 ) )
            {
            // InternalTheory.g:142:2: ( ( rule__Constructor__Group__0 ) )
            // InternalTheory.g:143:3: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // InternalTheory.g:144:3: ( rule__Constructor__Group__0 )
            // InternalTheory.g:144:4: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleDestructor"
    // InternalTheory.g:153:1: entryRuleDestructor : ruleDestructor EOF ;
    public final void entryRuleDestructor() throws RecognitionException {
        try {
            // InternalTheory.g:154:1: ( ruleDestructor EOF )
            // InternalTheory.g:155:1: ruleDestructor EOF
            {
             before(grammarAccess.getDestructorRule()); 
            pushFollow(FOLLOW_1);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getDestructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestructor"


    // $ANTLR start "ruleDestructor"
    // InternalTheory.g:162:1: ruleDestructor : ( ( rule__Destructor__Group__0 ) ) ;
    public final void ruleDestructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:166:2: ( ( ( rule__Destructor__Group__0 ) ) )
            // InternalTheory.g:167:2: ( ( rule__Destructor__Group__0 ) )
            {
            // InternalTheory.g:167:2: ( ( rule__Destructor__Group__0 ) )
            // InternalTheory.g:168:3: ( rule__Destructor__Group__0 )
            {
             before(grammarAccess.getDestructorAccess().getGroup()); 
            // InternalTheory.g:169:3: ( rule__Destructor__Group__0 )
            // InternalTheory.g:169:4: rule__Destructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestructor"


    // $ANTLR start "entryRuleOperator"
    // InternalTheory.g:178:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalTheory.g:179:1: ( ruleOperator EOF )
            // InternalTheory.g:180:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalTheory.g:187:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:191:2: ( ( ( rule__Operator__Group__0 ) ) )
            // InternalTheory.g:192:2: ( ( rule__Operator__Group__0 ) )
            {
            // InternalTheory.g:192:2: ( ( rule__Operator__Group__0 ) )
            // InternalTheory.g:193:3: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // InternalTheory.g:194:3: ( rule__Operator__Group__0 )
            // InternalTheory.g:194:4: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleArgument"
    // InternalTheory.g:203:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalTheory.g:204:1: ( ruleArgument EOF )
            // InternalTheory.g:205:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalTheory.g:212:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:216:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalTheory.g:217:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalTheory.g:217:2: ( ( rule__Argument__Group__0 ) )
            // InternalTheory.g:218:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalTheory.g:219:3: ( rule__Argument__Group__0 )
            // InternalTheory.g:219:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleCase"
    // InternalTheory.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalTheory.g:229:1: ( ruleCase EOF )
            // InternalTheory.g:230:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTheory.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalTheory.g:242:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalTheory.g:242:2: ( ( rule__Case__Group__0 ) )
            // InternalTheory.g:243:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalTheory.g:244:3: ( rule__Case__Group__0 )
            // InternalTheory.g:244:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAxiom"
    // InternalTheory.g:253:1: entryRuleAxiom : ruleAxiom EOF ;
    public final void entryRuleAxiom() throws RecognitionException {
        try {
            // InternalTheory.g:254:1: ( ruleAxiom EOF )
            // InternalTheory.g:255:1: ruleAxiom EOF
            {
             before(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getAxiomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalTheory.g:262:1: ruleAxiom : ( ( rule__Axiom__Group__0 ) ) ;
    public final void ruleAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:266:2: ( ( ( rule__Axiom__Group__0 ) ) )
            // InternalTheory.g:267:2: ( ( rule__Axiom__Group__0 ) )
            {
            // InternalTheory.g:267:2: ( ( rule__Axiom__Group__0 ) )
            // InternalTheory.g:268:3: ( rule__Axiom__Group__0 )
            {
             before(grammarAccess.getAxiomAccess().getGroup()); 
            // InternalTheory.g:269:3: ( rule__Axiom__Group__0 )
            // InternalTheory.g:269:4: rule__Axiom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTheorem"
    // InternalTheory.g:278:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // InternalTheory.g:279:1: ( ruleTheorem EOF )
            // InternalTheory.g:280:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_1);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // InternalTheory.g:287:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:291:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // InternalTheory.g:292:2: ( ( rule__Theorem__Group__0 ) )
            {
            // InternalTheory.g:292:2: ( ( rule__Theorem__Group__0 ) )
            // InternalTheory.g:293:3: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // InternalTheory.g:294:3: ( rule__Theorem__Group__0 )
            // InternalTheory.g:294:4: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:303:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTheory.g:304:1: ( ruleVariable EOF )
            // InternalTheory.g:305:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTheory.g:312:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:316:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTheory.g:317:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTheory.g:317:2: ( ( rule__Variable__Group__0 ) )
            // InternalTheory.g:318:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTheory.g:319:3: ( rule__Variable__Group__0 )
            // InternalTheory.g:319:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRule"
    // InternalTheory.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTheory.g:329:1: ( ruleRule EOF )
            // InternalTheory.g:330:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTheory.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTheory.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTheory.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalTheory.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTheory.g:344:3: ( rule__Rule__Group__0 )
            // InternalTheory.g:344:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:353:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:354:1: ( ruleRewriteRule EOF )
            // InternalTheory.g:355:1: ruleRewriteRule EOF
            {
             before(grammarAccess.getRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRewriteRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // InternalTheory.g:362:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:366:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // InternalTheory.g:367:2: ( ( rule__RewriteRule__Group__0 ) )
            {
            // InternalTheory.g:367:2: ( ( rule__RewriteRule__Group__0 ) )
            // InternalTheory.g:368:3: ( rule__RewriteRule__Group__0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:369:3: ( rule__RewriteRule__Group__0 )
            // InternalTheory.g:369:4: rule__RewriteRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleInferenceRule"
    // InternalTheory.g:378:1: entryRuleInferenceRule : ruleInferenceRule EOF ;
    public final void entryRuleInferenceRule() throws RecognitionException {
        try {
            // InternalTheory.g:379:1: ( ruleInferenceRule EOF )
            // InternalTheory.g:380:1: ruleInferenceRule EOF
            {
             before(grammarAccess.getInferenceRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getInferenceRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInferenceRule"


    // $ANTLR start "ruleInferenceRule"
    // InternalTheory.g:387:1: ruleInferenceRule : ( ( rule__InferenceRule__Group__0 ) ) ;
    public final void ruleInferenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:391:2: ( ( ( rule__InferenceRule__Group__0 ) ) )
            // InternalTheory.g:392:2: ( ( rule__InferenceRule__Group__0 ) )
            {
            // InternalTheory.g:392:2: ( ( rule__InferenceRule__Group__0 ) )
            // InternalTheory.g:393:3: ( rule__InferenceRule__Group__0 )
            {
             before(grammarAccess.getInferenceRuleAccess().getGroup()); 
            // InternalTheory.g:394:3: ( rule__InferenceRule__Group__0 )
            // InternalTheory.g:394:4: rule__InferenceRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInferenceRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInferenceRule"


    // $ANTLR start "entryRuleGiven"
    // InternalTheory.g:403:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalTheory.g:404:1: ( ruleGiven EOF )
            // InternalTheory.g:405:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalTheory.g:412:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:416:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalTheory.g:417:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalTheory.g:417:2: ( ( rule__Given__Group__0 ) )
            // InternalTheory.g:418:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalTheory.g:419:3: ( rule__Given__Group__0 )
            // InternalTheory.g:419:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleInfer"
    // InternalTheory.g:428:1: entryRuleInfer : ruleInfer EOF ;
    public final void entryRuleInfer() throws RecognitionException {
        try {
            // InternalTheory.g:429:1: ( ruleInfer EOF )
            // InternalTheory.g:430:1: ruleInfer EOF
            {
             before(grammarAccess.getInferRule()); 
            pushFollow(FOLLOW_1);
            ruleInfer();

            state._fsp--;

             after(grammarAccess.getInferRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfer"


    // $ANTLR start "ruleInfer"
    // InternalTheory.g:437:1: ruleInfer : ( ( rule__Infer__ExpressionAssignment ) ) ;
    public final void ruleInfer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:441:2: ( ( ( rule__Infer__ExpressionAssignment ) ) )
            // InternalTheory.g:442:2: ( ( rule__Infer__ExpressionAssignment ) )
            {
            // InternalTheory.g:442:2: ( ( rule__Infer__ExpressionAssignment ) )
            // InternalTheory.g:443:3: ( rule__Infer__ExpressionAssignment )
            {
             before(grammarAccess.getInferAccess().getExpressionAssignment()); 
            // InternalTheory.g:444:3: ( rule__Infer__ExpressionAssignment )
            // InternalTheory.g:444:4: rule__Infer__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Infer__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInferAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfer"


    // $ANTLR start "entryRuleUnconditionalRewrite"
    // InternalTheory.g:453:1: entryRuleUnconditionalRewrite : ruleUnconditionalRewrite EOF ;
    public final void entryRuleUnconditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:454:1: ( ruleUnconditionalRewrite EOF )
            // InternalTheory.g:455:1: ruleUnconditionalRewrite EOF
            {
             before(grammarAccess.getUnconditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            ruleUnconditionalRewrite();

            state._fsp--;

             after(grammarAccess.getUnconditionalRewriteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnconditionalRewrite"


    // $ANTLR start "ruleUnconditionalRewrite"
    // InternalTheory.g:462:1: ruleUnconditionalRewrite : ( ( rule__UnconditionalRewrite__RhsAssignment ) ) ;
    public final void ruleUnconditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:466:2: ( ( ( rule__UnconditionalRewrite__RhsAssignment ) ) )
            // InternalTheory.g:467:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            {
            // InternalTheory.g:467:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            // InternalTheory.g:468:3: ( rule__UnconditionalRewrite__RhsAssignment )
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 
            // InternalTheory.g:469:3: ( rule__UnconditionalRewrite__RhsAssignment )
            // InternalTheory.g:469:4: rule__UnconditionalRewrite__RhsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRewrite__RhsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnconditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewrite"
    // InternalTheory.g:478:1: entryRuleConditionalRewrite : ruleConditionalRewrite EOF ;
    public final void entryRuleConditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:479:1: ( ruleConditionalRewrite EOF )
            // InternalTheory.g:480:1: ruleConditionalRewrite EOF
            {
             before(grammarAccess.getConditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalRewrite();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalRewrite"


    // $ANTLR start "ruleConditionalRewrite"
    // InternalTheory.g:487:1: ruleConditionalRewrite : ( ( rule__ConditionalRewrite__Group__0 ) ) ;
    public final void ruleConditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:491:2: ( ( ( rule__ConditionalRewrite__Group__0 ) ) )
            // InternalTheory.g:492:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            {
            // InternalTheory.g:492:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            // InternalTheory.g:493:3: ( rule__ConditionalRewrite__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getGroup()); 
            // InternalTheory.g:494:3: ( rule__ConditionalRewrite__Group__0 )
            // InternalTheory.g:494:4: rule__ConditionalRewrite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewriteRule"
    // InternalTheory.g:503:1: entryRuleConditionalRewriteRule : ruleConditionalRewriteRule EOF ;
    public final void entryRuleConditionalRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:504:1: ( ruleConditionalRewriteRule EOF )
            // InternalTheory.g:505:1: ruleConditionalRewriteRule EOF
            {
             before(grammarAccess.getConditionalRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalRewriteRule"


    // $ANTLR start "ruleConditionalRewriteRule"
    // InternalTheory.g:512:1: ruleConditionalRewriteRule : ( ( rule__ConditionalRewriteRule__Group__0 ) ) ;
    public final void ruleConditionalRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:516:2: ( ( ( rule__ConditionalRewriteRule__Group__0 ) ) )
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            {
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            // InternalTheory.g:518:3: ( rule__ConditionalRewriteRule__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:519:3: ( rule__ConditionalRewriteRule__Group__0 )
            // InternalTheory.g:519:4: rule__ConditionalRewriteRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalRewriteRule"


    // $ANTLR start "ruleNotation"
    // InternalTheory.g:528:1: ruleNotation : ( ( rule__Notation__Alternatives ) ) ;
    public final void ruleNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:532:1: ( ( ( rule__Notation__Alternatives ) ) )
            // InternalTheory.g:533:2: ( ( rule__Notation__Alternatives ) )
            {
            // InternalTheory.g:533:2: ( ( rule__Notation__Alternatives ) )
            // InternalTheory.g:534:3: ( rule__Notation__Alternatives )
            {
             before(grammarAccess.getNotationAccess().getAlternatives()); 
            // InternalTheory.g:535:3: ( rule__Notation__Alternatives )
            // InternalTheory.g:535:4: rule__Notation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotation"


    // $ANTLR start "rule__Theory__Alternatives_4"
    // InternalTheory.g:543:1: rule__Theory__Alternatives_4 : ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) );
    public final void rule__Theory__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:547:1: ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTheory.g:548:2: ( ( rule__Theory__Group_4_0__0 ) )
                    {
                    // InternalTheory.g:548:2: ( ( rule__Theory__Group_4_0__0 ) )
                    // InternalTheory.g:549:3: ( rule__Theory__Group_4_0__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_0()); 
                    // InternalTheory.g:550:3: ( rule__Theory__Group_4_0__0 )
                    // InternalTheory.g:550:4: rule__Theory__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:554:2: ( ( rule__Theory__Group_4_1__0 ) )
                    {
                    // InternalTheory.g:554:2: ( ( rule__Theory__Group_4_1__0 ) )
                    // InternalTheory.g:555:3: ( rule__Theory__Group_4_1__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_1()); 
                    // InternalTheory.g:556:3: ( rule__Theory__Group_4_1__0 )
                    // InternalTheory.g:556:4: rule__Theory__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:560:2: ( ( rule__Theory__Group_4_2__0 ) )
                    {
                    // InternalTheory.g:560:2: ( ( rule__Theory__Group_4_2__0 ) )
                    // InternalTheory.g:561:3: ( rule__Theory__Group_4_2__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_2()); 
                    // InternalTheory.g:562:3: ( rule__Theory__Group_4_2__0 )
                    // InternalTheory.g:562:4: rule__Theory__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTheory.g:566:2: ( ( rule__Theory__Group_4_3__0 ) )
                    {
                    // InternalTheory.g:566:2: ( ( rule__Theory__Group_4_3__0 ) )
                    // InternalTheory.g:567:3: ( rule__Theory__Group_4_3__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_3()); 
                    // InternalTheory.g:568:3: ( rule__Theory__Group_4_3__0 )
                    // InternalTheory.g:568:4: rule__Theory__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTheory.g:572:2: ( ( rule__Theory__Group_4_4__0 ) )
                    {
                    // InternalTheory.g:572:2: ( ( rule__Theory__Group_4_4__0 ) )
                    // InternalTheory.g:573:3: ( rule__Theory__Group_4_4__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_4()); 
                    // InternalTheory.g:574:3: ( rule__Theory__Group_4_4__0 )
                    // InternalTheory.g:574:4: rule__Theory__Group_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Alternatives_4"


    // $ANTLR start "rule__Type__CommentAlternatives_0_0"
    // InternalTheory.g:582:1: rule__Type__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Type__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:586:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTheory.g:587:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:587:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:588:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getTypeAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:593:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:593:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:594:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getTypeAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommentAlternatives_0_0"


    // $ANTLR start "rule__Constructor__CommentAlternatives_0_0"
    // InternalTheory.g:603:1: rule__Constructor__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Constructor__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:607:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ML_COMMENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTheory.g:608:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:608:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:609:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getConstructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getConstructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:614:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:614:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:615:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getConstructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getConstructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__CommentAlternatives_0_0"


    // $ANTLR start "rule__Destructor__CommentAlternatives_0_0"
    // InternalTheory.g:624:1: rule__Destructor__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Destructor__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:628:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SL_COMMENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTheory.g:629:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:629:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:630:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getDestructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDestructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:635:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:635:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:636:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getDestructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDestructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__CommentAlternatives_0_0"


    // $ANTLR start "rule__Operator__CommentAlternatives_0_0"
    // InternalTheory.g:645:1: rule__Operator__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Operator__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:649:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SL_COMMENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTheory.g:650:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:650:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:651:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getOperatorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:656:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:656:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:657:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getOperatorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__CommentAlternatives_0_0"


    // $ANTLR start "rule__Operator__Alternatives_6_1"
    // InternalTheory.g:666:1: rule__Operator__Alternatives_6_1 : ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) );
    public final void rule__Operator__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:670:1: ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTheory.g:671:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    {
                    // InternalTheory.g:671:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    // InternalTheory.g:672:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    {
                     before(grammarAccess.getOperatorAccess().getDefinitionAssignment_6_1_0()); 
                    // InternalTheory.g:673:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    // InternalTheory.g:673:4: rule__Operator__DefinitionAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__DefinitionAssignment_6_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getDefinitionAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:677:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    {
                    // InternalTheory.g:677:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    // InternalTheory.g:678:3: ( rule__Operator__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_6_1_1()); 
                    // InternalTheory.g:679:3: ( rule__Operator__Group_6_1_1__0 )
                    // InternalTheory.g:679:4: rule__Operator__Group_6_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_6_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_6_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives_6_1"


    // $ANTLR start "rule__Argument__CommentAlternatives_0_0"
    // InternalTheory.g:687:1: rule__Argument__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Argument__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:691:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SL_COMMENT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTheory.g:692:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:692:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:693:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getArgumentAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:698:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:698:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:699:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getArgumentAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__CommentAlternatives_0_0"


    // $ANTLR start "rule__Axiom__CommentAlternatives_0_0"
    // InternalTheory.g:708:1: rule__Axiom__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Axiom__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:712:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SL_COMMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTheory.g:713:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:713:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:714:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getAxiomAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAxiomAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:719:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:719:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:720:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getAxiomAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAxiomAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__CommentAlternatives_0_0"


    // $ANTLR start "rule__Theorem__CommentAlternatives_0_0"
    // InternalTheory.g:729:1: rule__Theorem__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Theorem__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:733:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ML_COMMENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SL_COMMENT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTheory.g:734:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:734:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:735:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getTheoremAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTheoremAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:740:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:740:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:741:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getTheoremAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTheoremAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__CommentAlternatives_0_0"


    // $ANTLR start "rule__Variable__CommentAlternatives_0_0"
    // InternalTheory.g:750:1: rule__Variable__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Variable__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:754:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SL_COMMENT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTheory.g:755:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:755:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:756:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getVariableAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:761:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:761:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:762:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getVariableAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__CommentAlternatives_0_0"


    // $ANTLR start "rule__Rule__CommentAlternatives_0_0"
    // InternalTheory.g:771:1: rule__Rule__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Rule__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:775:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ML_COMMENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_SL_COMMENT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTheory.g:776:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:776:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:777:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getRuleAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:782:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:782:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:783:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__CommentAlternatives_0_0"


    // $ANTLR start "rule__Rule__Alternatives_4"
    // InternalTheory.g:792:1: rule__Rule__Alternatives_4 : ( ( ( rule__Rule__RruleAssignment_4_0 ) ) | ( ( rule__Rule__IruleAssignment_4_1 ) ) );
    public final void rule__Rule__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:796:1: ( ( ( rule__Rule__RruleAssignment_4_0 ) ) | ( ( rule__Rule__IruleAssignment_4_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==34) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_STRING||LA12_1==35||LA12_1==38) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTheory.g:797:2: ( ( rule__Rule__RruleAssignment_4_0 ) )
                    {
                    // InternalTheory.g:797:2: ( ( rule__Rule__RruleAssignment_4_0 ) )
                    // InternalTheory.g:798:3: ( rule__Rule__RruleAssignment_4_0 )
                    {
                     before(grammarAccess.getRuleAccess().getRruleAssignment_4_0()); 
                    // InternalTheory.g:799:3: ( rule__Rule__RruleAssignment_4_0 )
                    // InternalTheory.g:799:4: rule__Rule__RruleAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__RruleAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getRruleAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:803:2: ( ( rule__Rule__IruleAssignment_4_1 ) )
                    {
                    // InternalTheory.g:803:2: ( ( rule__Rule__IruleAssignment_4_1 ) )
                    // InternalTheory.g:804:3: ( rule__Rule__IruleAssignment_4_1 )
                    {
                     before(grammarAccess.getRuleAccess().getIruleAssignment_4_1()); 
                    // InternalTheory.g:805:3: ( rule__Rule__IruleAssignment_4_1 )
                    // InternalTheory.g:805:4: rule__Rule__IruleAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__IruleAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getIruleAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_4"


    // $ANTLR start "rule__RewriteRule__Alternatives_2"
    // InternalTheory.g:813:1: rule__RewriteRule__Alternatives_2 : ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) );
    public final void rule__RewriteRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:817:1: ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==32) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||(LA13_1>=RULE_ML_COMMENT && LA13_1<=RULE_SL_COMMENT)||LA13_1==15||(LA13_1>=19 && LA13_1<=23)||LA13_1==33) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTheory.g:818:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    {
                    // InternalTheory.g:818:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    // InternalTheory.g:819:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0()); 
                    // InternalTheory.g:820:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    // InternalTheory.g:820:4: rule__RewriteRule__UruleAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__UruleAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:824:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    {
                    // InternalTheory.g:824:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    // InternalTheory.g:825:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1()); 
                    // InternalTheory.g:826:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    // InternalTheory.g:826:4: rule__RewriteRule__CruleAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__CruleAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Alternatives_2"


    // $ANTLR start "rule__Notation__Alternatives"
    // InternalTheory.g:834:1: rule__Notation__Alternatives : ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) );
    public final void rule__Notation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:838:1: ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 13:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTheory.g:839:2: ( ( 'prefix' ) )
                    {
                    // InternalTheory.g:839:2: ( ( 'prefix' ) )
                    // InternalTheory.g:840:3: ( 'prefix' )
                    {
                     before(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 
                    // InternalTheory.g:841:3: ( 'prefix' )
                    // InternalTheory.g:841:4: 'prefix'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:845:2: ( ( 'infix' ) )
                    {
                    // InternalTheory.g:845:2: ( ( 'infix' ) )
                    // InternalTheory.g:846:3: ( 'infix' )
                    {
                     before(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 
                    // InternalTheory.g:847:3: ( 'infix' )
                    // InternalTheory.g:847:4: 'infix'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:851:2: ( ( 'postfix' ) )
                    {
                    // InternalTheory.g:851:2: ( ( 'postfix' ) )
                    // InternalTheory.g:852:3: ( 'postfix' )
                    {
                     before(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 
                    // InternalTheory.g:853:3: ( 'postfix' )
                    // InternalTheory.g:853:4: 'postfix'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Alternatives"


    // $ANTLR start "rule__Theory__Group__0"
    // InternalTheory.g:861:1: rule__Theory__Group__0 : rule__Theory__Group__0__Impl rule__Theory__Group__1 ;
    public final void rule__Theory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:865:1: ( rule__Theory__Group__0__Impl rule__Theory__Group__1 )
            // InternalTheory.g:866:2: rule__Theory__Group__0__Impl rule__Theory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__0"


    // $ANTLR start "rule__Theory__Group__0__Impl"
    // InternalTheory.g:873:1: rule__Theory__Group__0__Impl : ( 'theory' ) ;
    public final void rule__Theory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:877:1: ( ( 'theory' ) )
            // InternalTheory.g:878:1: ( 'theory' )
            {
            // InternalTheory.g:878:1: ( 'theory' )
            // InternalTheory.g:879:2: 'theory'
            {
             before(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__0__Impl"


    // $ANTLR start "rule__Theory__Group__1"
    // InternalTheory.g:888:1: rule__Theory__Group__1 : rule__Theory__Group__1__Impl rule__Theory__Group__2 ;
    public final void rule__Theory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:892:1: ( rule__Theory__Group__1__Impl rule__Theory__Group__2 )
            // InternalTheory.g:893:2: rule__Theory__Group__1__Impl rule__Theory__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__1"


    // $ANTLR start "rule__Theory__Group__1__Impl"
    // InternalTheory.g:900:1: rule__Theory__Group__1__Impl : ( ( rule__Theory__NameAssignment_1 ) ) ;
    public final void rule__Theory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:904:1: ( ( ( rule__Theory__NameAssignment_1 ) ) )
            // InternalTheory.g:905:1: ( ( rule__Theory__NameAssignment_1 ) )
            {
            // InternalTheory.g:905:1: ( ( rule__Theory__NameAssignment_1 ) )
            // InternalTheory.g:906:2: ( rule__Theory__NameAssignment_1 )
            {
             before(grammarAccess.getTheoryAccess().getNameAssignment_1()); 
            // InternalTheory.g:907:2: ( rule__Theory__NameAssignment_1 )
            // InternalTheory.g:907:3: rule__Theory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__1__Impl"


    // $ANTLR start "rule__Theory__Group__2"
    // InternalTheory.g:915:1: rule__Theory__Group__2 : rule__Theory__Group__2__Impl rule__Theory__Group__3 ;
    public final void rule__Theory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:919:1: ( rule__Theory__Group__2__Impl rule__Theory__Group__3 )
            // InternalTheory.g:920:2: rule__Theory__Group__2__Impl rule__Theory__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__2"


    // $ANTLR start "rule__Theory__Group__2__Impl"
    // InternalTheory.g:927:1: rule__Theory__Group__2__Impl : ( ( rule__Theory__Group_2__0 )? ) ;
    public final void rule__Theory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:931:1: ( ( ( rule__Theory__Group_2__0 )? ) )
            // InternalTheory.g:932:1: ( ( rule__Theory__Group_2__0 )? )
            {
            // InternalTheory.g:932:1: ( ( rule__Theory__Group_2__0 )? )
            // InternalTheory.g:933:2: ( rule__Theory__Group_2__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_2()); 
            // InternalTheory.g:934:2: ( rule__Theory__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTheory.g:934:3: rule__Theory__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__2__Impl"


    // $ANTLR start "rule__Theory__Group__3"
    // InternalTheory.g:942:1: rule__Theory__Group__3 : rule__Theory__Group__3__Impl rule__Theory__Group__4 ;
    public final void rule__Theory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:946:1: ( rule__Theory__Group__3__Impl rule__Theory__Group__4 )
            // InternalTheory.g:947:2: rule__Theory__Group__3__Impl rule__Theory__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__3"


    // $ANTLR start "rule__Theory__Group__3__Impl"
    // InternalTheory.g:954:1: rule__Theory__Group__3__Impl : ( ( rule__Theory__Group_3__0 )? ) ;
    public final void rule__Theory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:958:1: ( ( ( rule__Theory__Group_3__0 )? ) )
            // InternalTheory.g:959:1: ( ( rule__Theory__Group_3__0 )? )
            {
            // InternalTheory.g:959:1: ( ( rule__Theory__Group_3__0 )? )
            // InternalTheory.g:960:2: ( rule__Theory__Group_3__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_3()); 
            // InternalTheory.g:961:2: ( rule__Theory__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTheory.g:961:3: rule__Theory__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__3__Impl"


    // $ANTLR start "rule__Theory__Group__4"
    // InternalTheory.g:969:1: rule__Theory__Group__4 : rule__Theory__Group__4__Impl rule__Theory__Group__5 ;
    public final void rule__Theory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:973:1: ( rule__Theory__Group__4__Impl rule__Theory__Group__5 )
            // InternalTheory.g:974:2: rule__Theory__Group__4__Impl rule__Theory__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__4"


    // $ANTLR start "rule__Theory__Group__4__Impl"
    // InternalTheory.g:981:1: rule__Theory__Group__4__Impl : ( ( rule__Theory__Alternatives_4 )* ) ;
    public final void rule__Theory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:985:1: ( ( ( rule__Theory__Alternatives_4 )* ) )
            // InternalTheory.g:986:1: ( ( rule__Theory__Alternatives_4 )* )
            {
            // InternalTheory.g:986:1: ( ( rule__Theory__Alternatives_4 )* )
            // InternalTheory.g:987:2: ( rule__Theory__Alternatives_4 )*
            {
             before(grammarAccess.getTheoryAccess().getAlternatives_4()); 
            // InternalTheory.g:988:2: ( rule__Theory__Alternatives_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTheory.g:988:3: rule__Theory__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Theory__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__4__Impl"


    // $ANTLR start "rule__Theory__Group__5"
    // InternalTheory.g:996:1: rule__Theory__Group__5 : rule__Theory__Group__5__Impl ;
    public final void rule__Theory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1000:1: ( rule__Theory__Group__5__Impl )
            // InternalTheory.g:1001:2: rule__Theory__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__5"


    // $ANTLR start "rule__Theory__Group__5__Impl"
    // InternalTheory.g:1007:1: rule__Theory__Group__5__Impl : ( 'end' ) ;
    public final void rule__Theory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1011:1: ( ( 'end' ) )
            // InternalTheory.g:1012:1: ( 'end' )
            {
            // InternalTheory.g:1012:1: ( 'end' )
            // InternalTheory.g:1013:2: 'end'
            {
             before(grammarAccess.getTheoryAccess().getEndKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__5__Impl"


    // $ANTLR start "rule__Theory__Group_2__0"
    // InternalTheory.g:1023:1: rule__Theory__Group_2__0 : rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 ;
    public final void rule__Theory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1027:1: ( rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 )
            // InternalTheory.g:1028:2: rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__0"


    // $ANTLR start "rule__Theory__Group_2__0__Impl"
    // InternalTheory.g:1035:1: rule__Theory__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Theory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1039:1: ( ( '(' ) )
            // InternalTheory.g:1040:1: ( '(' )
            {
            // InternalTheory.g:1040:1: ( '(' )
            // InternalTheory.g:1041:2: '('
            {
             before(grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__0__Impl"


    // $ANTLR start "rule__Theory__Group_2__1"
    // InternalTheory.g:1050:1: rule__Theory__Group_2__1 : rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 ;
    public final void rule__Theory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1054:1: ( rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 )
            // InternalTheory.g:1055:2: rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Theory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__1"


    // $ANTLR start "rule__Theory__Group_2__1__Impl"
    // InternalTheory.g:1062:1: rule__Theory__Group_2__1__Impl : ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Theory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1066:1: ( ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1067:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1067:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1068:2: ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1068:2: ( ( rule__Theory__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1069:3: ( rule__Theory__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1070:3: ( rule__Theory__ParametersAssignment_2_1 )
            // InternalTheory.g:1070:4: rule__Theory__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Theory__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1073:2: ( ( rule__Theory__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1074:3: ( rule__Theory__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1075:3: ( rule__Theory__ParametersAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTheory.g:1075:4: rule__Theory__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__1__Impl"


    // $ANTLR start "rule__Theory__Group_2__2"
    // InternalTheory.g:1084:1: rule__Theory__Group_2__2 : rule__Theory__Group_2__2__Impl ;
    public final void rule__Theory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1088:1: ( rule__Theory__Group_2__2__Impl )
            // InternalTheory.g:1089:2: rule__Theory__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__2"


    // $ANTLR start "rule__Theory__Group_2__2__Impl"
    // InternalTheory.g:1095:1: rule__Theory__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Theory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1099:1: ( ( ')' ) )
            // InternalTheory.g:1100:1: ( ')' )
            {
            // InternalTheory.g:1100:1: ( ')' )
            // InternalTheory.g:1101:2: ')'
            {
             before(grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_2__2__Impl"


    // $ANTLR start "rule__Theory__Group_3__0"
    // InternalTheory.g:1111:1: rule__Theory__Group_3__0 : rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 ;
    public final void rule__Theory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1115:1: ( rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 )
            // InternalTheory.g:1116:2: rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__0"


    // $ANTLR start "rule__Theory__Group_3__0__Impl"
    // InternalTheory.g:1123:1: rule__Theory__Group_3__0__Impl : ( 'imports' ) ;
    public final void rule__Theory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1127:1: ( ( 'imports' ) )
            // InternalTheory.g:1128:1: ( 'imports' )
            {
            // InternalTheory.g:1128:1: ( 'imports' )
            // InternalTheory.g:1129:2: 'imports'
            {
             before(grammarAccess.getTheoryAccess().getImportsKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__0__Impl"


    // $ANTLR start "rule__Theory__Group_3__1"
    // InternalTheory.g:1138:1: rule__Theory__Group_3__1 : rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 ;
    public final void rule__Theory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1142:1: ( rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 )
            // InternalTheory.g:1143:2: rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__1"


    // $ANTLR start "rule__Theory__Group_3__1__Impl"
    // InternalTheory.g:1150:1: rule__Theory__Group_3__1__Impl : ( ( rule__Theory__ImportsAssignment_3_1 ) ) ;
    public final void rule__Theory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1154:1: ( ( ( rule__Theory__ImportsAssignment_3_1 ) ) )
            // InternalTheory.g:1155:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            {
            // InternalTheory.g:1155:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            // InternalTheory.g:1156:2: ( rule__Theory__ImportsAssignment_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 
            // InternalTheory.g:1157:2: ( rule__Theory__ImportsAssignment_3_1 )
            // InternalTheory.g:1157:3: rule__Theory__ImportsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__ImportsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__1__Impl"


    // $ANTLR start "rule__Theory__Group_3__2"
    // InternalTheory.g:1165:1: rule__Theory__Group_3__2 : rule__Theory__Group_3__2__Impl ;
    public final void rule__Theory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1169:1: ( rule__Theory__Group_3__2__Impl )
            // InternalTheory.g:1170:2: rule__Theory__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__2"


    // $ANTLR start "rule__Theory__Group_3__2__Impl"
    // InternalTheory.g:1176:1: rule__Theory__Group_3__2__Impl : ( ( rule__Theory__ImportsAssignment_3_2 )* ) ;
    public final void rule__Theory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1180:1: ( ( ( rule__Theory__ImportsAssignment_3_2 )* ) )
            // InternalTheory.g:1181:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            {
            // InternalTheory.g:1181:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            // InternalTheory.g:1182:2: ( rule__Theory__ImportsAssignment_3_2 )*
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 
            // InternalTheory.g:1183:2: ( rule__Theory__ImportsAssignment_3_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTheory.g:1183:3: rule__Theory__ImportsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ImportsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_3__2__Impl"


    // $ANTLR start "rule__Theory__Group_4_0__0"
    // InternalTheory.g:1192:1: rule__Theory__Group_4_0__0 : rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 ;
    public final void rule__Theory__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1196:1: ( rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 )
            // InternalTheory.g:1197:2: rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_0__0"


    // $ANTLR start "rule__Theory__Group_4_0__0__Impl"
    // InternalTheory.g:1204:1: rule__Theory__Group_4_0__0__Impl : ( 'types' ) ;
    public final void rule__Theory__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1208:1: ( ( 'types' ) )
            // InternalTheory.g:1209:1: ( 'types' )
            {
            // InternalTheory.g:1209:1: ( 'types' )
            // InternalTheory.g:1210:2: 'types'
            {
             before(grammarAccess.getTheoryAccess().getTypesKeyword_4_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTypesKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_0__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_0__1"
    // InternalTheory.g:1219:1: rule__Theory__Group_4_0__1 : rule__Theory__Group_4_0__1__Impl ;
    public final void rule__Theory__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1223:1: ( rule__Theory__Group_4_0__1__Impl )
            // InternalTheory.g:1224:2: rule__Theory__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_0__1"


    // $ANTLR start "rule__Theory__Group_4_0__1__Impl"
    // InternalTheory.g:1230:1: rule__Theory__Group_4_0__1__Impl : ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) ) ;
    public final void rule__Theory__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1234:1: ( ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) ) )
            // InternalTheory.g:1235:1: ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) )
            {
            // InternalTheory.g:1235:1: ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) )
            // InternalTheory.g:1236:2: ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* )
            {
            // InternalTheory.g:1236:2: ( ( rule__Theory__TypesAssignment_4_0_1 ) )
            // InternalTheory.g:1237:3: ( rule__Theory__TypesAssignment_4_0_1 )
            {
             before(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 
            // InternalTheory.g:1238:3: ( rule__Theory__TypesAssignment_4_0_1 )
            // InternalTheory.g:1238:4: rule__Theory__TypesAssignment_4_0_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__TypesAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 

            }

            // InternalTheory.g:1241:2: ( ( rule__Theory__TypesAssignment_4_0_1 )* )
            // InternalTheory.g:1242:3: ( rule__Theory__TypesAssignment_4_0_1 )*
            {
             before(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 
            // InternalTheory.g:1243:3: ( rule__Theory__TypesAssignment_4_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ML_COMMENT && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTheory.g:1243:4: rule__Theory__TypesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__TypesAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_0__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_1__0"
    // InternalTheory.g:1253:1: rule__Theory__Group_4_1__0 : rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 ;
    public final void rule__Theory__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1257:1: ( rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 )
            // InternalTheory.g:1258:2: rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_1__0"


    // $ANTLR start "rule__Theory__Group_4_1__0__Impl"
    // InternalTheory.g:1265:1: rule__Theory__Group_4_1__0__Impl : ( 'operators' ) ;
    public final void rule__Theory__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1269:1: ( ( 'operators' ) )
            // InternalTheory.g:1270:1: ( 'operators' )
            {
            // InternalTheory.g:1270:1: ( 'operators' )
            // InternalTheory.g:1271:2: 'operators'
            {
             before(grammarAccess.getTheoryAccess().getOperatorsKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getOperatorsKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_1__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_1__1"
    // InternalTheory.g:1280:1: rule__Theory__Group_4_1__1 : rule__Theory__Group_4_1__1__Impl ;
    public final void rule__Theory__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1284:1: ( rule__Theory__Group_4_1__1__Impl )
            // InternalTheory.g:1285:2: rule__Theory__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_1__1"


    // $ANTLR start "rule__Theory__Group_4_1__1__Impl"
    // InternalTheory.g:1291:1: rule__Theory__Group_4_1__1__Impl : ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) ) ;
    public final void rule__Theory__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1295:1: ( ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) ) )
            // InternalTheory.g:1296:1: ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) )
            {
            // InternalTheory.g:1296:1: ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) )
            // InternalTheory.g:1297:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* )
            {
            // InternalTheory.g:1297:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 ) )
            // InternalTheory.g:1298:3: ( rule__Theory__OperatorsAssignment_4_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 
            // InternalTheory.g:1299:3: ( rule__Theory__OperatorsAssignment_4_1_1 )
            // InternalTheory.g:1299:4: rule__Theory__OperatorsAssignment_4_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__OperatorsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 

            }

            // InternalTheory.g:1302:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 )* )
            // InternalTheory.g:1303:3: ( rule__Theory__OperatorsAssignment_4_1_1 )*
            {
             before(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 
            // InternalTheory.g:1304:3: ( rule__Theory__OperatorsAssignment_4_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTheory.g:1304:4: rule__Theory__OperatorsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__OperatorsAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_1__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_2__0"
    // InternalTheory.g:1314:1: rule__Theory__Group_4_2__0 : rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 ;
    public final void rule__Theory__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1318:1: ( rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 )
            // InternalTheory.g:1319:2: rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Theory__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_2__0"


    // $ANTLR start "rule__Theory__Group_4_2__0__Impl"
    // InternalTheory.g:1326:1: rule__Theory__Group_4_2__0__Impl : ( 'axioms' ) ;
    public final void rule__Theory__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1330:1: ( ( 'axioms' ) )
            // InternalTheory.g:1331:1: ( 'axioms' )
            {
            // InternalTheory.g:1331:1: ( 'axioms' )
            // InternalTheory.g:1332:2: 'axioms'
            {
             before(grammarAccess.getTheoryAccess().getAxiomsKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getAxiomsKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_2__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_2__1"
    // InternalTheory.g:1341:1: rule__Theory__Group_4_2__1 : rule__Theory__Group_4_2__1__Impl ;
    public final void rule__Theory__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1345:1: ( rule__Theory__Group_4_2__1__Impl )
            // InternalTheory.g:1346:2: rule__Theory__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_2__1"


    // $ANTLR start "rule__Theory__Group_4_2__1__Impl"
    // InternalTheory.g:1352:1: rule__Theory__Group_4_2__1__Impl : ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) ) ;
    public final void rule__Theory__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1356:1: ( ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) ) )
            // InternalTheory.g:1357:1: ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) )
            {
            // InternalTheory.g:1357:1: ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) )
            // InternalTheory.g:1358:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* )
            {
            // InternalTheory.g:1358:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 ) )
            // InternalTheory.g:1359:3: ( rule__Theory__AxiomsAssignment_4_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 
            // InternalTheory.g:1360:3: ( rule__Theory__AxiomsAssignment_4_2_1 )
            // InternalTheory.g:1360:4: rule__Theory__AxiomsAssignment_4_2_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__AxiomsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 

            }

            // InternalTheory.g:1363:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 )* )
            // InternalTheory.g:1364:3: ( rule__Theory__AxiomsAssignment_4_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 
            // InternalTheory.g:1365:3: ( rule__Theory__AxiomsAssignment_4_2_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ML_COMMENT && LA22_0<=RULE_SL_COMMENT)||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTheory.g:1365:4: rule__Theory__AxiomsAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__AxiomsAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_2__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_3__0"
    // InternalTheory.g:1375:1: rule__Theory__Group_4_3__0 : rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 ;
    public final void rule__Theory__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1379:1: ( rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 )
            // InternalTheory.g:1380:2: rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Theory__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_3__0"


    // $ANTLR start "rule__Theory__Group_4_3__0__Impl"
    // InternalTheory.g:1387:1: rule__Theory__Group_4_3__0__Impl : ( 'theorems' ) ;
    public final void rule__Theory__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1391:1: ( ( 'theorems' ) )
            // InternalTheory.g:1392:1: ( 'theorems' )
            {
            // InternalTheory.g:1392:1: ( 'theorems' )
            // InternalTheory.g:1393:2: 'theorems'
            {
             before(grammarAccess.getTheoryAccess().getTheoremsKeyword_4_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTheoremsKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_3__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_3__1"
    // InternalTheory.g:1402:1: rule__Theory__Group_4_3__1 : rule__Theory__Group_4_3__1__Impl ;
    public final void rule__Theory__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1406:1: ( rule__Theory__Group_4_3__1__Impl )
            // InternalTheory.g:1407:2: rule__Theory__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_3__1"


    // $ANTLR start "rule__Theory__Group_4_3__1__Impl"
    // InternalTheory.g:1413:1: rule__Theory__Group_4_3__1__Impl : ( ( ( rule__Theory__TheoremsAssignment_4_3_1 ) ) ( ( rule__Theory__TheoremsAssignment_4_3_1 )* ) ) ;
    public final void rule__Theory__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1417:1: ( ( ( ( rule__Theory__TheoremsAssignment_4_3_1 ) ) ( ( rule__Theory__TheoremsAssignment_4_3_1 )* ) ) )
            // InternalTheory.g:1418:1: ( ( ( rule__Theory__TheoremsAssignment_4_3_1 ) ) ( ( rule__Theory__TheoremsAssignment_4_3_1 )* ) )
            {
            // InternalTheory.g:1418:1: ( ( ( rule__Theory__TheoremsAssignment_4_3_1 ) ) ( ( rule__Theory__TheoremsAssignment_4_3_1 )* ) )
            // InternalTheory.g:1419:2: ( ( rule__Theory__TheoremsAssignment_4_3_1 ) ) ( ( rule__Theory__TheoremsAssignment_4_3_1 )* )
            {
            // InternalTheory.g:1419:2: ( ( rule__Theory__TheoremsAssignment_4_3_1 ) )
            // InternalTheory.g:1420:3: ( rule__Theory__TheoremsAssignment_4_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getTheoremsAssignment_4_3_1()); 
            // InternalTheory.g:1421:3: ( rule__Theory__TheoremsAssignment_4_3_1 )
            // InternalTheory.g:1421:4: rule__Theory__TheoremsAssignment_4_3_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__TheoremsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getTheoremsAssignment_4_3_1()); 

            }

            // InternalTheory.g:1424:2: ( ( rule__Theory__TheoremsAssignment_4_3_1 )* )
            // InternalTheory.g:1425:3: ( rule__Theory__TheoremsAssignment_4_3_1 )*
            {
             before(grammarAccess.getTheoryAccess().getTheoremsAssignment_4_3_1()); 
            // InternalTheory.g:1426:3: ( rule__Theory__TheoremsAssignment_4_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)||LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTheory.g:1426:4: rule__Theory__TheoremsAssignment_4_3_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__TheoremsAssignment_4_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getTheoremsAssignment_4_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_3__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_4__0"
    // InternalTheory.g:1436:1: rule__Theory__Group_4_4__0 : rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 ;
    public final void rule__Theory__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1440:1: ( rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 )
            // InternalTheory.g:1441:2: rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Theory__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__0"


    // $ANTLR start "rule__Theory__Group_4_4__0__Impl"
    // InternalTheory.g:1448:1: rule__Theory__Group_4_4__0__Impl : ( 'rules' ) ;
    public final void rule__Theory__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1452:1: ( ( 'rules' ) )
            // InternalTheory.g:1453:1: ( 'rules' )
            {
            // InternalTheory.g:1453:1: ( 'rules' )
            // InternalTheory.g:1454:2: 'rules'
            {
             before(grammarAccess.getTheoryAccess().getRulesKeyword_4_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRulesKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_4__1"
    // InternalTheory.g:1463:1: rule__Theory__Group_4_4__1 : rule__Theory__Group_4_4__1__Impl rule__Theory__Group_4_4__2 ;
    public final void rule__Theory__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1467:1: ( rule__Theory__Group_4_4__1__Impl rule__Theory__Group_4_4__2 )
            // InternalTheory.g:1468:2: rule__Theory__Group_4_4__1__Impl rule__Theory__Group_4_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Theory__Group_4_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__1"


    // $ANTLR start "rule__Theory__Group_4_4__1__Impl"
    // InternalTheory.g:1475:1: rule__Theory__Group_4_4__1__Impl : ( ( rule__Theory__Group_4_4_1__0 )? ) ;
    public final void rule__Theory__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1479:1: ( ( ( rule__Theory__Group_4_4_1__0 )? ) )
            // InternalTheory.g:1480:1: ( ( rule__Theory__Group_4_4_1__0 )? )
            {
            // InternalTheory.g:1480:1: ( ( rule__Theory__Group_4_4_1__0 )? )
            // InternalTheory.g:1481:2: ( rule__Theory__Group_4_4_1__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_4_4_1()); 
            // InternalTheory.g:1482:2: ( rule__Theory__Group_4_4_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTheory.g:1482:3: rule__Theory__Group_4_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_4__2"
    // InternalTheory.g:1490:1: rule__Theory__Group_4_4__2 : rule__Theory__Group_4_4__2__Impl ;
    public final void rule__Theory__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1494:1: ( rule__Theory__Group_4_4__2__Impl )
            // InternalTheory.g:1495:2: rule__Theory__Group_4_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__2"


    // $ANTLR start "rule__Theory__Group_4_4__2__Impl"
    // InternalTheory.g:1501:1: rule__Theory__Group_4_4__2__Impl : ( ( ( rule__Theory__RulesAssignment_4_4_2 ) ) ( ( rule__Theory__RulesAssignment_4_4_2 )* ) ) ;
    public final void rule__Theory__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1505:1: ( ( ( ( rule__Theory__RulesAssignment_4_4_2 ) ) ( ( rule__Theory__RulesAssignment_4_4_2 )* ) ) )
            // InternalTheory.g:1506:1: ( ( ( rule__Theory__RulesAssignment_4_4_2 ) ) ( ( rule__Theory__RulesAssignment_4_4_2 )* ) )
            {
            // InternalTheory.g:1506:1: ( ( ( rule__Theory__RulesAssignment_4_4_2 ) ) ( ( rule__Theory__RulesAssignment_4_4_2 )* ) )
            // InternalTheory.g:1507:2: ( ( rule__Theory__RulesAssignment_4_4_2 ) ) ( ( rule__Theory__RulesAssignment_4_4_2 )* )
            {
            // InternalTheory.g:1507:2: ( ( rule__Theory__RulesAssignment_4_4_2 ) )
            // InternalTheory.g:1508:3: ( rule__Theory__RulesAssignment_4_4_2 )
            {
             before(grammarAccess.getTheoryAccess().getRulesAssignment_4_4_2()); 
            // InternalTheory.g:1509:3: ( rule__Theory__RulesAssignment_4_4_2 )
            // InternalTheory.g:1509:4: rule__Theory__RulesAssignment_4_4_2
            {
            pushFollow(FOLLOW_13);
            rule__Theory__RulesAssignment_4_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getRulesAssignment_4_4_2()); 

            }

            // InternalTheory.g:1512:2: ( ( rule__Theory__RulesAssignment_4_4_2 )* )
            // InternalTheory.g:1513:3: ( rule__Theory__RulesAssignment_4_4_2 )*
            {
             before(grammarAccess.getTheoryAccess().getRulesAssignment_4_4_2()); 
            // InternalTheory.g:1514:3: ( rule__Theory__RulesAssignment_4_4_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ML_COMMENT && LA25_0<=RULE_SL_COMMENT)||LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTheory.g:1514:4: rule__Theory__RulesAssignment_4_4_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Theory__RulesAssignment_4_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getRulesAssignment_4_4_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4__2__Impl"


    // $ANTLR start "rule__Theory__Group_4_4_1__0"
    // InternalTheory.g:1524:1: rule__Theory__Group_4_4_1__0 : rule__Theory__Group_4_4_1__0__Impl rule__Theory__Group_4_4_1__1 ;
    public final void rule__Theory__Group_4_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1528:1: ( rule__Theory__Group_4_4_1__0__Impl rule__Theory__Group_4_4_1__1 )
            // InternalTheory.g:1529:2: rule__Theory__Group_4_4_1__0__Impl rule__Theory__Group_4_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4_1__0"


    // $ANTLR start "rule__Theory__Group_4_4_1__0__Impl"
    // InternalTheory.g:1536:1: rule__Theory__Group_4_4_1__0__Impl : ( 'variables' ) ;
    public final void rule__Theory__Group_4_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1540:1: ( ( 'variables' ) )
            // InternalTheory.g:1541:1: ( 'variables' )
            {
            // InternalTheory.g:1541:1: ( 'variables' )
            // InternalTheory.g:1542:2: 'variables'
            {
             before(grammarAccess.getTheoryAccess().getVariablesKeyword_4_4_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getVariablesKeyword_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4_1__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_4_1__1"
    // InternalTheory.g:1551:1: rule__Theory__Group_4_4_1__1 : rule__Theory__Group_4_4_1__1__Impl ;
    public final void rule__Theory__Group_4_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1555:1: ( rule__Theory__Group_4_4_1__1__Impl )
            // InternalTheory.g:1556:2: rule__Theory__Group_4_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4_1__1"


    // $ANTLR start "rule__Theory__Group_4_4_1__1__Impl"
    // InternalTheory.g:1562:1: rule__Theory__Group_4_4_1__1__Impl : ( ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* ) ) ;
    public final void rule__Theory__Group_4_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1566:1: ( ( ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* ) ) )
            // InternalTheory.g:1567:1: ( ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* ) )
            {
            // InternalTheory.g:1567:1: ( ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* ) )
            // InternalTheory.g:1568:2: ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* )
            {
            // InternalTheory.g:1568:2: ( ( rule__Theory__VariablesAssignment_4_4_1_1 ) )
            // InternalTheory.g:1569:3: ( rule__Theory__VariablesAssignment_4_4_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getVariablesAssignment_4_4_1_1()); 
            // InternalTheory.g:1570:3: ( rule__Theory__VariablesAssignment_4_4_1_1 )
            // InternalTheory.g:1570:4: rule__Theory__VariablesAssignment_4_4_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__VariablesAssignment_4_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getVariablesAssignment_4_4_1_1()); 

            }

            // InternalTheory.g:1573:2: ( ( rule__Theory__VariablesAssignment_4_4_1_1 )* )
            // InternalTheory.g:1574:3: ( rule__Theory__VariablesAssignment_4_4_1_1 )*
            {
             before(grammarAccess.getTheoryAccess().getVariablesAssignment_4_4_1_1()); 
            // InternalTheory.g:1575:3: ( rule__Theory__VariablesAssignment_4_4_1_1 )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case RULE_ML_COMMENT:
                    {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                    }
                    break;
                case RULE_SL_COMMENT:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_ID) ) {
                        alt26=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalTheory.g:1575:4: rule__Theory__VariablesAssignment_4_4_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__VariablesAssignment_4_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getVariablesAssignment_4_4_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_4_4_1__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalTheory.g:1585:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1589:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalTheory.g:1590:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalTheory.g:1597:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1601:1: ( ( ( rule__Type__CommentAssignment_0 )? ) )
            // InternalTheory.g:1602:1: ( ( rule__Type__CommentAssignment_0 )? )
            {
            // InternalTheory.g:1602:1: ( ( rule__Type__CommentAssignment_0 )? )
            // InternalTheory.g:1603:2: ( rule__Type__CommentAssignment_0 )?
            {
             before(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            // InternalTheory.g:1604:2: ( rule__Type__CommentAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ML_COMMENT && LA27_0<=RULE_SL_COMMENT)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTheory.g:1604:3: rule__Type__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalTheory.g:1612:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1616:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalTheory.g:1617:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalTheory.g:1624:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1628:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalTheory.g:1629:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalTheory.g:1629:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalTheory.g:1630:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalTheory.g:1631:2: ( rule__Type__NameAssignment_1 )
            // InternalTheory.g:1631:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalTheory.g:1639:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1643:1: ( rule__Type__Group__2__Impl )
            // InternalTheory.g:1644:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalTheory.g:1650:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1654:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalTheory.g:1655:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalTheory.g:1655:1: ( ( rule__Type__Group_2__0 )? )
            // InternalTheory.g:1656:2: ( rule__Type__Group_2__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_2()); 
            // InternalTheory.g:1657:2: ( rule__Type__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTheory.g:1657:3: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalTheory.g:1666:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1670:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalTheory.g:1671:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalTheory.g:1678:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1682:1: ( ( '(' ) )
            // InternalTheory.g:1683:1: ( '(' )
            {
            // InternalTheory.g:1683:1: ( '(' )
            // InternalTheory.g:1684:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalTheory.g:1693:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1697:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalTheory.g:1698:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalTheory.g:1705:1: rule__Type__Group_2__1__Impl : ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1709:1: ( ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1710:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1710:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1711:2: ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1711:2: ( ( rule__Type__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1712:3: ( rule__Type__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1713:3: ( rule__Type__ParametersAssignment_2_1 )
            // InternalTheory.g:1713:4: rule__Type__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Type__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1716:2: ( ( rule__Type__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1717:3: ( rule__Type__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1718:3: ( rule__Type__ParametersAssignment_2_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTheory.g:1718:4: rule__Type__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Type__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalTheory.g:1727:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1731:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalTheory.g:1732:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalTheory.g:1739:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1743:1: ( ( ')' ) )
            // InternalTheory.g:1744:1: ( ')' )
            {
            // InternalTheory.g:1744:1: ( ')' )
            // InternalTheory.g:1745:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalTheory.g:1754:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1758:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalTheory.g:1759:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalTheory.g:1766:1: rule__Type__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1770:1: ( ( '=' ) )
            // InternalTheory.g:1771:1: ( '=' )
            {
            // InternalTheory.g:1771:1: ( '=' )
            // InternalTheory.g:1772:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Type__Group_2__4"
    // InternalTheory.g:1781:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl rule__Type__Group_2__5 ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1785:1: ( rule__Type__Group_2__4__Impl rule__Type__Group_2__5 )
            // InternalTheory.g:1786:2: rule__Type__Group_2__4__Impl rule__Type__Group_2__5
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4"


    // $ANTLR start "rule__Type__Group_2__4__Impl"
    // InternalTheory.g:1793:1: rule__Type__Group_2__4__Impl : ( ( rule__Type__ConstructorsAssignment_2_4 ) ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1797:1: ( ( ( rule__Type__ConstructorsAssignment_2_4 ) ) )
            // InternalTheory.g:1798:1: ( ( rule__Type__ConstructorsAssignment_2_4 ) )
            {
            // InternalTheory.g:1798:1: ( ( rule__Type__ConstructorsAssignment_2_4 ) )
            // InternalTheory.g:1799:2: ( rule__Type__ConstructorsAssignment_2_4 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_2_4()); 
            // InternalTheory.g:1800:2: ( rule__Type__ConstructorsAssignment_2_4 )
            // InternalTheory.g:1800:3: rule__Type__ConstructorsAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_2__5"
    // InternalTheory.g:1808:1: rule__Type__Group_2__5 : rule__Type__Group_2__5__Impl ;
    public final void rule__Type__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1812:1: ( rule__Type__Group_2__5__Impl )
            // InternalTheory.g:1813:2: rule__Type__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__5"


    // $ANTLR start "rule__Type__Group_2__5__Impl"
    // InternalTheory.g:1819:1: rule__Type__Group_2__5__Impl : ( ( rule__Type__Group_2_5__0 )* ) ;
    public final void rule__Type__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1823:1: ( ( ( rule__Type__Group_2_5__0 )* ) )
            // InternalTheory.g:1824:1: ( ( rule__Type__Group_2_5__0 )* )
            {
            // InternalTheory.g:1824:1: ( ( rule__Type__Group_2_5__0 )* )
            // InternalTheory.g:1825:2: ( rule__Type__Group_2_5__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_2_5()); 
            // InternalTheory.g:1826:2: ( rule__Type__Group_2_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTheory.g:1826:3: rule__Type__Group_2_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Type__Group_2_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__5__Impl"


    // $ANTLR start "rule__Type__Group_2_5__0"
    // InternalTheory.g:1835:1: rule__Type__Group_2_5__0 : rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1 ;
    public final void rule__Type__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1839:1: ( rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1 )
            // InternalTheory.g:1840:2: rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_5__0"


    // $ANTLR start "rule__Type__Group_2_5__0__Impl"
    // InternalTheory.g:1847:1: rule__Type__Group_2_5__0__Impl : ( '|' ) ;
    public final void rule__Type__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1851:1: ( ( '|' ) )
            // InternalTheory.g:1852:1: ( '|' )
            {
            // InternalTheory.g:1852:1: ( '|' )
            // InternalTheory.g:1853:2: '|'
            {
             before(grammarAccess.getTypeAccess().getVerticalLineKeyword_2_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getVerticalLineKeyword_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_5__0__Impl"


    // $ANTLR start "rule__Type__Group_2_5__1"
    // InternalTheory.g:1862:1: rule__Type__Group_2_5__1 : rule__Type__Group_2_5__1__Impl ;
    public final void rule__Type__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1866:1: ( rule__Type__Group_2_5__1__Impl )
            // InternalTheory.g:1867:2: rule__Type__Group_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_5__1"


    // $ANTLR start "rule__Type__Group_2_5__1__Impl"
    // InternalTheory.g:1873:1: rule__Type__Group_2_5__1__Impl : ( ( rule__Type__ConstructorsAssignment_2_5_1 ) ) ;
    public final void rule__Type__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1877:1: ( ( ( rule__Type__ConstructorsAssignment_2_5_1 ) ) )
            // InternalTheory.g:1878:1: ( ( rule__Type__ConstructorsAssignment_2_5_1 ) )
            {
            // InternalTheory.g:1878:1: ( ( rule__Type__ConstructorsAssignment_2_5_1 ) )
            // InternalTheory.g:1879:2: ( rule__Type__ConstructorsAssignment_2_5_1 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_2_5_1()); 
            // InternalTheory.g:1880:2: ( rule__Type__ConstructorsAssignment_2_5_1 )
            // InternalTheory.g:1880:3: rule__Type__ConstructorsAssignment_2_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_2_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_5__1__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // InternalTheory.g:1889:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1893:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalTheory.g:1894:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // InternalTheory.g:1901:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__CommentAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1905:1: ( ( ( rule__Constructor__CommentAssignment_0 )? ) )
            // InternalTheory.g:1906:1: ( ( rule__Constructor__CommentAssignment_0 )? )
            {
            // InternalTheory.g:1906:1: ( ( rule__Constructor__CommentAssignment_0 )? )
            // InternalTheory.g:1907:2: ( rule__Constructor__CommentAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:1908:2: ( rule__Constructor__CommentAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ML_COMMENT && LA31_0<=RULE_SL_COMMENT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTheory.g:1908:3: rule__Constructor__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constructor__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // InternalTheory.g:1916:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1920:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // InternalTheory.g:1921:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // InternalTheory.g:1928:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 ) ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1932:1: ( ( ( rule__Constructor__NameAssignment_1 ) ) )
            // InternalTheory.g:1933:1: ( ( rule__Constructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:1933:1: ( ( rule__Constructor__NameAssignment_1 ) )
            // InternalTheory.g:1934:2: ( rule__Constructor__NameAssignment_1 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:1935:2: ( rule__Constructor__NameAssignment_1 )
            // InternalTheory.g:1935:3: rule__Constructor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // InternalTheory.g:1943:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1947:1: ( rule__Constructor__Group__2__Impl )
            // InternalTheory.g:1948:2: rule__Constructor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // InternalTheory.g:1954:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__Group_2__0 )? ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1958:1: ( ( ( rule__Constructor__Group_2__0 )? ) )
            // InternalTheory.g:1959:1: ( ( rule__Constructor__Group_2__0 )? )
            {
            // InternalTheory.g:1959:1: ( ( rule__Constructor__Group_2__0 )? )
            // InternalTheory.g:1960:2: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // InternalTheory.g:1961:2: ( rule__Constructor__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTheory.g:1961:3: rule__Constructor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constructor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group_2__0"
    // InternalTheory.g:1970:1: rule__Constructor__Group_2__0 : rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1974:1: ( rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 )
            // InternalTheory.g:1975:2: rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Constructor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__0"


    // $ANTLR start "rule__Constructor__Group_2__0__Impl"
    // InternalTheory.g:1982:1: rule__Constructor__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Constructor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1986:1: ( ( '(' ) )
            // InternalTheory.g:1987:1: ( '(' )
            {
            // InternalTheory.g:1987:1: ( '(' )
            // InternalTheory.g:1988:2: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__0__Impl"


    // $ANTLR start "rule__Constructor__Group_2__1"
    // InternalTheory.g:1997:1: rule__Constructor__Group_2__1 : rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2001:1: ( rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 )
            // InternalTheory.g:2002:2: rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Constructor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__1"


    // $ANTLR start "rule__Constructor__Group_2__1__Impl"
    // InternalTheory.g:2009:1: rule__Constructor__Group_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) ;
    public final void rule__Constructor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2013:1: ( ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) )
            // InternalTheory.g:2014:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            {
            // InternalTheory.g:2014:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            // InternalTheory.g:2015:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_1()); 
            // InternalTheory.g:2016:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            // InternalTheory.g:2016:3: rule__Constructor__DestructorsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__DestructorsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__1__Impl"


    // $ANTLR start "rule__Constructor__Group_2__2"
    // InternalTheory.g:2024:1: rule__Constructor__Group_2__2 : rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 ;
    public final void rule__Constructor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2028:1: ( rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 )
            // InternalTheory.g:2029:2: rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3
            {
            pushFollow(FOLLOW_18);
            rule__Constructor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__2"


    // $ANTLR start "rule__Constructor__Group_2__2__Impl"
    // InternalTheory.g:2036:1: rule__Constructor__Group_2__2__Impl : ( ( rule__Constructor__Group_2_2__0 )* ) ;
    public final void rule__Constructor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2040:1: ( ( ( rule__Constructor__Group_2_2__0 )* ) )
            // InternalTheory.g:2041:1: ( ( rule__Constructor__Group_2_2__0 )* )
            {
            // InternalTheory.g:2041:1: ( ( rule__Constructor__Group_2_2__0 )* )
            // InternalTheory.g:2042:2: ( rule__Constructor__Group_2_2__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_2()); 
            // InternalTheory.g:2043:2: ( rule__Constructor__Group_2_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalTheory.g:2043:3: rule__Constructor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Constructor__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__2__Impl"


    // $ANTLR start "rule__Constructor__Group_2__3"
    // InternalTheory.g:2051:1: rule__Constructor__Group_2__3 : rule__Constructor__Group_2__3__Impl ;
    public final void rule__Constructor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2055:1: ( rule__Constructor__Group_2__3__Impl )
            // InternalTheory.g:2056:2: rule__Constructor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__3"


    // $ANTLR start "rule__Constructor__Group_2__3__Impl"
    // InternalTheory.g:2062:1: rule__Constructor__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2066:1: ( ( ')' ) )
            // InternalTheory.g:2067:1: ( ')' )
            {
            // InternalTheory.g:2067:1: ( ')' )
            // InternalTheory.g:2068:2: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_2_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2__3__Impl"


    // $ANTLR start "rule__Constructor__Group_2_2__0"
    // InternalTheory.g:2078:1: rule__Constructor__Group_2_2__0 : rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 ;
    public final void rule__Constructor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2082:1: ( rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 )
            // InternalTheory.g:2083:2: rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Constructor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2_2__0"


    // $ANTLR start "rule__Constructor__Group_2_2__0__Impl"
    // InternalTheory.g:2090:1: rule__Constructor__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2094:1: ( ( ',' ) )
            // InternalTheory.g:2095:1: ( ',' )
            {
            // InternalTheory.g:2095:1: ( ',' )
            // InternalTheory.g:2096:2: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2_2__0__Impl"


    // $ANTLR start "rule__Constructor__Group_2_2__1"
    // InternalTheory.g:2105:1: rule__Constructor__Group_2_2__1 : rule__Constructor__Group_2_2__1__Impl ;
    public final void rule__Constructor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2109:1: ( rule__Constructor__Group_2_2__1__Impl )
            // InternalTheory.g:2110:2: rule__Constructor__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2_2__1"


    // $ANTLR start "rule__Constructor__Group_2_2__1__Impl"
    // InternalTheory.g:2116:1: rule__Constructor__Group_2_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) ;
    public final void rule__Constructor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2120:1: ( ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2121:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2121:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            // InternalTheory.g:2122:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_2_1()); 
            // InternalTheory.g:2123:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            // InternalTheory.g:2123:3: rule__Constructor__DestructorsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__DestructorsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_2_2__1__Impl"


    // $ANTLR start "rule__Destructor__Group__0"
    // InternalTheory.g:2132:1: rule__Destructor__Group__0 : rule__Destructor__Group__0__Impl rule__Destructor__Group__1 ;
    public final void rule__Destructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2136:1: ( rule__Destructor__Group__0__Impl rule__Destructor__Group__1 )
            // InternalTheory.g:2137:2: rule__Destructor__Group__0__Impl rule__Destructor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Destructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__0"


    // $ANTLR start "rule__Destructor__Group__0__Impl"
    // InternalTheory.g:2144:1: rule__Destructor__Group__0__Impl : ( ( rule__Destructor__CommentAssignment_0 )? ) ;
    public final void rule__Destructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2148:1: ( ( ( rule__Destructor__CommentAssignment_0 )? ) )
            // InternalTheory.g:2149:1: ( ( rule__Destructor__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2149:1: ( ( rule__Destructor__CommentAssignment_0 )? )
            // InternalTheory.g:2150:2: ( rule__Destructor__CommentAssignment_0 )?
            {
             before(grammarAccess.getDestructorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2151:2: ( rule__Destructor__CommentAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ML_COMMENT && LA34_0<=RULE_SL_COMMENT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTheory.g:2151:3: rule__Destructor__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Destructor__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDestructorAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__0__Impl"


    // $ANTLR start "rule__Destructor__Group__1"
    // InternalTheory.g:2159:1: rule__Destructor__Group__1 : rule__Destructor__Group__1__Impl rule__Destructor__Group__2 ;
    public final void rule__Destructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2163:1: ( rule__Destructor__Group__1__Impl rule__Destructor__Group__2 )
            // InternalTheory.g:2164:2: rule__Destructor__Group__1__Impl rule__Destructor__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Destructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__1"


    // $ANTLR start "rule__Destructor__Group__1__Impl"
    // InternalTheory.g:2171:1: rule__Destructor__Group__1__Impl : ( ( rule__Destructor__NameAssignment_1 ) ) ;
    public final void rule__Destructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2175:1: ( ( ( rule__Destructor__NameAssignment_1 ) ) )
            // InternalTheory.g:2176:1: ( ( rule__Destructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:2176:1: ( ( rule__Destructor__NameAssignment_1 ) )
            // InternalTheory.g:2177:2: ( rule__Destructor__NameAssignment_1 )
            {
             before(grammarAccess.getDestructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2178:2: ( rule__Destructor__NameAssignment_1 )
            // InternalTheory.g:2178:3: rule__Destructor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__1__Impl"


    // $ANTLR start "rule__Destructor__Group__2"
    // InternalTheory.g:2186:1: rule__Destructor__Group__2 : rule__Destructor__Group__2__Impl rule__Destructor__Group__3 ;
    public final void rule__Destructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2190:1: ( rule__Destructor__Group__2__Impl rule__Destructor__Group__3 )
            // InternalTheory.g:2191:2: rule__Destructor__Group__2__Impl rule__Destructor__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Destructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__2"


    // $ANTLR start "rule__Destructor__Group__2__Impl"
    // InternalTheory.g:2198:1: rule__Destructor__Group__2__Impl : ( ':' ) ;
    public final void rule__Destructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2202:1: ( ( ':' ) )
            // InternalTheory.g:2203:1: ( ':' )
            {
            // InternalTheory.g:2203:1: ( ':' )
            // InternalTheory.g:2204:2: ':'
            {
             before(grammarAccess.getDestructorAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__2__Impl"


    // $ANTLR start "rule__Destructor__Group__3"
    // InternalTheory.g:2213:1: rule__Destructor__Group__3 : rule__Destructor__Group__3__Impl ;
    public final void rule__Destructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2217:1: ( rule__Destructor__Group__3__Impl )
            // InternalTheory.g:2218:2: rule__Destructor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__3"


    // $ANTLR start "rule__Destructor__Group__3__Impl"
    // InternalTheory.g:2224:1: rule__Destructor__Group__3__Impl : ( ( rule__Destructor__TypeAssignment_3 ) ) ;
    public final void rule__Destructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2228:1: ( ( ( rule__Destructor__TypeAssignment_3 ) ) )
            // InternalTheory.g:2229:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            {
            // InternalTheory.g:2229:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            // InternalTheory.g:2230:2: ( rule__Destructor__TypeAssignment_3 )
            {
             before(grammarAccess.getDestructorAccess().getTypeAssignment_3()); 
            // InternalTheory.g:2231:2: ( rule__Destructor__TypeAssignment_3 )
            // InternalTheory.g:2231:3: rule__Destructor__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__Group__3__Impl"


    // $ANTLR start "rule__Operator__Group__0"
    // InternalTheory.g:2240:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2244:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // InternalTheory.g:2245:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__0"


    // $ANTLR start "rule__Operator__Group__0__Impl"
    // InternalTheory.g:2252:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__CommentAssignment_0 )? ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2256:1: ( ( ( rule__Operator__CommentAssignment_0 )? ) )
            // InternalTheory.g:2257:1: ( ( rule__Operator__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2257:1: ( ( rule__Operator__CommentAssignment_0 )? )
            // InternalTheory.g:2258:2: ( rule__Operator__CommentAssignment_0 )?
            {
             before(grammarAccess.getOperatorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2259:2: ( rule__Operator__CommentAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ML_COMMENT && LA35_0<=RULE_SL_COMMENT)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTheory.g:2259:3: rule__Operator__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__0__Impl"


    // $ANTLR start "rule__Operator__Group__1"
    // InternalTheory.g:2267:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2271:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // InternalTheory.g:2272:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__1"


    // $ANTLR start "rule__Operator__Group__1__Impl"
    // InternalTheory.g:2279:1: rule__Operator__Group__1__Impl : ( ( rule__Operator__NameAssignment_1 ) ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2283:1: ( ( ( rule__Operator__NameAssignment_1 ) ) )
            // InternalTheory.g:2284:1: ( ( rule__Operator__NameAssignment_1 ) )
            {
            // InternalTheory.g:2284:1: ( ( rule__Operator__NameAssignment_1 ) )
            // InternalTheory.g:2285:2: ( rule__Operator__NameAssignment_1 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2286:2: ( rule__Operator__NameAssignment_1 )
            // InternalTheory.g:2286:3: rule__Operator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__1__Impl"


    // $ANTLR start "rule__Operator__Group__2"
    // InternalTheory.g:2294:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2298:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // InternalTheory.g:2299:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__2"


    // $ANTLR start "rule__Operator__Group__2__Impl"
    // InternalTheory.g:2306:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__Group_2__0 )? ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2310:1: ( ( ( rule__Operator__Group_2__0 )? ) )
            // InternalTheory.g:2311:1: ( ( rule__Operator__Group_2__0 )? )
            {
            // InternalTheory.g:2311:1: ( ( rule__Operator__Group_2__0 )? )
            // InternalTheory.g:2312:2: ( rule__Operator__Group_2__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_2()); 
            // InternalTheory.g:2313:2: ( rule__Operator__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTheory.g:2313:3: rule__Operator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__2__Impl"


    // $ANTLR start "rule__Operator__Group__3"
    // InternalTheory.g:2321:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2325:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // InternalTheory.g:2326:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__3"


    // $ANTLR start "rule__Operator__Group__3__Impl"
    // InternalTheory.g:2333:1: rule__Operator__Group__3__Impl : ( ( rule__Operator__UnorderedGroup_3 ) ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2337:1: ( ( ( rule__Operator__UnorderedGroup_3 ) ) )
            // InternalTheory.g:2338:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            {
            // InternalTheory.g:2338:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            // InternalTheory.g:2339:2: ( rule__Operator__UnorderedGroup_3 )
            {
             before(grammarAccess.getOperatorAccess().getUnorderedGroup_3()); 
            // InternalTheory.g:2340:2: ( rule__Operator__UnorderedGroup_3 )
            // InternalTheory.g:2340:3: rule__Operator__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__3__Impl"


    // $ANTLR start "rule__Operator__Group__4"
    // InternalTheory.g:2348:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2352:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // InternalTheory.g:2353:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Operator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__4"


    // $ANTLR start "rule__Operator__Group__4__Impl"
    // InternalTheory.g:2360:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__Group_4__0 )? ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2364:1: ( ( ( rule__Operator__Group_4__0 )? ) )
            // InternalTheory.g:2365:1: ( ( rule__Operator__Group_4__0 )? )
            {
            // InternalTheory.g:2365:1: ( ( rule__Operator__Group_4__0 )? )
            // InternalTheory.g:2366:2: ( rule__Operator__Group_4__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_4()); 
            // InternalTheory.g:2367:2: ( rule__Operator__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTheory.g:2367:3: rule__Operator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__4__Impl"


    // $ANTLR start "rule__Operator__Group__5"
    // InternalTheory.g:2375:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl rule__Operator__Group__6 ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2379:1: ( rule__Operator__Group__5__Impl rule__Operator__Group__6 )
            // InternalTheory.g:2380:2: rule__Operator__Group__5__Impl rule__Operator__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Operator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__5"


    // $ANTLR start "rule__Operator__Group__5__Impl"
    // InternalTheory.g:2387:1: rule__Operator__Group__5__Impl : ( ( rule__Operator__Group_5__0 )? ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2391:1: ( ( ( rule__Operator__Group_5__0 )? ) )
            // InternalTheory.g:2392:1: ( ( rule__Operator__Group_5__0 )? )
            {
            // InternalTheory.g:2392:1: ( ( rule__Operator__Group_5__0 )? )
            // InternalTheory.g:2393:2: ( rule__Operator__Group_5__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_5()); 
            // InternalTheory.g:2394:2: ( rule__Operator__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTheory.g:2394:3: rule__Operator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__5__Impl"


    // $ANTLR start "rule__Operator__Group__6"
    // InternalTheory.g:2402:1: rule__Operator__Group__6 : rule__Operator__Group__6__Impl ;
    public final void rule__Operator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2406:1: ( rule__Operator__Group__6__Impl )
            // InternalTheory.g:2407:2: rule__Operator__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__6"


    // $ANTLR start "rule__Operator__Group__6__Impl"
    // InternalTheory.g:2413:1: rule__Operator__Group__6__Impl : ( ( rule__Operator__Group_6__0 )? ) ;
    public final void rule__Operator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2417:1: ( ( ( rule__Operator__Group_6__0 )? ) )
            // InternalTheory.g:2418:1: ( ( rule__Operator__Group_6__0 )? )
            {
            // InternalTheory.g:2418:1: ( ( rule__Operator__Group_6__0 )? )
            // InternalTheory.g:2419:2: ( rule__Operator__Group_6__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_6()); 
            // InternalTheory.g:2420:2: ( rule__Operator__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTheory.g:2420:3: rule__Operator__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__6__Impl"


    // $ANTLR start "rule__Operator__Group_2__0"
    // InternalTheory.g:2429:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2433:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalTheory.g:2434:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Operator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0"


    // $ANTLR start "rule__Operator__Group_2__0__Impl"
    // InternalTheory.g:2441:1: rule__Operator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2445:1: ( ( '(' ) )
            // InternalTheory.g:2446:1: ( '(' )
            {
            // InternalTheory.g:2446:1: ( '(' )
            // InternalTheory.g:2447:2: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2__1"
    // InternalTheory.g:2456:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2460:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalTheory.g:2461:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Operator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1"


    // $ANTLR start "rule__Operator__Group_2__1__Impl"
    // InternalTheory.g:2468:1: rule__Operator__Group_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2472:1: ( ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) )
            // InternalTheory.g:2473:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            {
            // InternalTheory.g:2473:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            // InternalTheory.g:2474:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_1()); 
            // InternalTheory.g:2475:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            // InternalTheory.g:2475:3: rule__Operator__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_2__2"
    // InternalTheory.g:2483:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2487:1: ( rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 )
            // InternalTheory.g:2488:2: rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3
            {
            pushFollow(FOLLOW_18);
            rule__Operator__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__2"


    // $ANTLR start "rule__Operator__Group_2__2__Impl"
    // InternalTheory.g:2495:1: rule__Operator__Group_2__2__Impl : ( ( rule__Operator__Group_2_2__0 )* ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2499:1: ( ( ( rule__Operator__Group_2_2__0 )* ) )
            // InternalTheory.g:2500:1: ( ( rule__Operator__Group_2_2__0 )* )
            {
            // InternalTheory.g:2500:1: ( ( rule__Operator__Group_2_2__0 )* )
            // InternalTheory.g:2501:2: ( rule__Operator__Group_2_2__0 )*
            {
             before(grammarAccess.getOperatorAccess().getGroup_2_2()); 
            // InternalTheory.g:2502:2: ( rule__Operator__Group_2_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalTheory.g:2502:3: rule__Operator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Operator__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__2__Impl"


    // $ANTLR start "rule__Operator__Group_2__3"
    // InternalTheory.g:2510:1: rule__Operator__Group_2__3 : rule__Operator__Group_2__3__Impl ;
    public final void rule__Operator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2514:1: ( rule__Operator__Group_2__3__Impl )
            // InternalTheory.g:2515:2: rule__Operator__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__3"


    // $ANTLR start "rule__Operator__Group_2__3__Impl"
    // InternalTheory.g:2521:1: rule__Operator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2525:1: ( ( ')' ) )
            // InternalTheory.g:2526:1: ( ')' )
            {
            // InternalTheory.g:2526:1: ( ')' )
            // InternalTheory.g:2527:2: ')'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__3__Impl"


    // $ANTLR start "rule__Operator__Group_2_2__0"
    // InternalTheory.g:2537:1: rule__Operator__Group_2_2__0 : rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 ;
    public final void rule__Operator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2541:1: ( rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 )
            // InternalTheory.g:2542:2: rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Operator__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2_2__0"


    // $ANTLR start "rule__Operator__Group_2_2__0__Impl"
    // InternalTheory.g:2549:1: rule__Operator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2553:1: ( ( ',' ) )
            // InternalTheory.g:2554:1: ( ',' )
            {
            // InternalTheory.g:2554:1: ( ',' )
            // InternalTheory.g:2555:2: ','
            {
             before(grammarAccess.getOperatorAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2_2__1"
    // InternalTheory.g:2564:1: rule__Operator__Group_2_2__1 : rule__Operator__Group_2_2__1__Impl ;
    public final void rule__Operator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2568:1: ( rule__Operator__Group_2_2__1__Impl )
            // InternalTheory.g:2569:2: rule__Operator__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2_2__1"


    // $ANTLR start "rule__Operator__Group_2_2__1__Impl"
    // InternalTheory.g:2575:1: rule__Operator__Group_2_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__Operator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2579:1: ( ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2580:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2580:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            // InternalTheory.g:2581:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_2_1()); 
            // InternalTheory.g:2582:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            // InternalTheory.g:2582:3: rule__Operator__ArgumentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_3_0__0"
    // InternalTheory.g:2591:1: rule__Operator__Group_3_0__0 : rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 ;
    public final void rule__Operator__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2595:1: ( rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 )
            // InternalTheory.g:2596:2: rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_0__0"


    // $ANTLR start "rule__Operator__Group_3_0__0__Impl"
    // InternalTheory.g:2603:1: rule__Operator__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Operator__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2607:1: ( ( ':' ) )
            // InternalTheory.g:2608:1: ( ':' )
            {
            // InternalTheory.g:2608:1: ( ':' )
            // InternalTheory.g:2609:2: ':'
            {
             before(grammarAccess.getOperatorAccess().getColonKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getColonKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_0__0__Impl"


    // $ANTLR start "rule__Operator__Group_3_0__1"
    // InternalTheory.g:2618:1: rule__Operator__Group_3_0__1 : rule__Operator__Group_3_0__1__Impl ;
    public final void rule__Operator__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2622:1: ( rule__Operator__Group_3_0__1__Impl )
            // InternalTheory.g:2623:2: rule__Operator__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_0__1"


    // $ANTLR start "rule__Operator__Group_3_0__1__Impl"
    // InternalTheory.g:2629:1: rule__Operator__Group_3_0__1__Impl : ( ( rule__Operator__TypeAssignment_3_0_1 ) ) ;
    public final void rule__Operator__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2633:1: ( ( ( rule__Operator__TypeAssignment_3_0_1 ) ) )
            // InternalTheory.g:2634:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            {
            // InternalTheory.g:2634:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            // InternalTheory.g:2635:2: ( rule__Operator__TypeAssignment_3_0_1 )
            {
             before(grammarAccess.getOperatorAccess().getTypeAssignment_3_0_1()); 
            // InternalTheory.g:2636:2: ( rule__Operator__TypeAssignment_3_0_1 )
            // InternalTheory.g:2636:3: rule__Operator__TypeAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__TypeAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getTypeAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_0__1__Impl"


    // $ANTLR start "rule__Operator__Group_3_2__0"
    // InternalTheory.g:2645:1: rule__Operator__Group_3_2__0 : rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 ;
    public final void rule__Operator__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2649:1: ( rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 )
            // InternalTheory.g:2650:2: rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Operator__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_2__0"


    // $ANTLR start "rule__Operator__Group_3_2__0__Impl"
    // InternalTheory.g:2657:1: rule__Operator__Group_3_2__0__Impl : ( ( rule__Operator__AssociativeAssignment_3_2_0 ) ) ;
    public final void rule__Operator__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2661:1: ( ( ( rule__Operator__AssociativeAssignment_3_2_0 ) ) )
            // InternalTheory.g:2662:1: ( ( rule__Operator__AssociativeAssignment_3_2_0 ) )
            {
            // InternalTheory.g:2662:1: ( ( rule__Operator__AssociativeAssignment_3_2_0 ) )
            // InternalTheory.g:2663:2: ( rule__Operator__AssociativeAssignment_3_2_0 )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssignment_3_2_0()); 
            // InternalTheory.g:2664:2: ( rule__Operator__AssociativeAssignment_3_2_0 )
            // InternalTheory.g:2664:3: rule__Operator__AssociativeAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AssociativeAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAssociativeAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_3_2__1"
    // InternalTheory.g:2672:1: rule__Operator__Group_3_2__1 : rule__Operator__Group_3_2__1__Impl ;
    public final void rule__Operator__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2676:1: ( rule__Operator__Group_3_2__1__Impl )
            // InternalTheory.g:2677:2: rule__Operator__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_2__1"


    // $ANTLR start "rule__Operator__Group_3_2__1__Impl"
    // InternalTheory.g:2683:1: rule__Operator__Group_3_2__1__Impl : ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) ;
    public final void rule__Operator__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2687:1: ( ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) )
            // InternalTheory.g:2688:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            {
            // InternalTheory.g:2688:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            // InternalTheory.g:2689:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            {
             before(grammarAccess.getOperatorAccess().getCommutativeAssignment_3_2_1()); 
            // InternalTheory.g:2690:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTheory.g:2690:3: rule__Operator__CommutativeAssignment_3_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__CommutativeAssignment_3_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getCommutativeAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_4__0"
    // InternalTheory.g:2699:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2703:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalTheory.g:2704:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Operator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_4__0"


    // $ANTLR start "rule__Operator__Group_4__0__Impl"
    // InternalTheory.g:2711:1: rule__Operator__Group_4__0__Impl : ( '#' ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2715:1: ( ( '#' ) )
            // InternalTheory.g:2716:1: ( '#' )
            {
            // InternalTheory.g:2716:1: ( '#' )
            // InternalTheory.g:2717:2: '#'
            {
             before(grammarAccess.getOperatorAccess().getNumberSignKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getNumberSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_4__0__Impl"


    // $ANTLR start "rule__Operator__Group_4__1"
    // InternalTheory.g:2726:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2730:1: ( rule__Operator__Group_4__1__Impl )
            // InternalTheory.g:2731:2: rule__Operator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_4__1"


    // $ANTLR start "rule__Operator__Group_4__1__Impl"
    // InternalTheory.g:2737:1: rule__Operator__Group_4__1__Impl : ( ( rule__Operator__PrecedentAssignment_4_1 ) ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2741:1: ( ( ( rule__Operator__PrecedentAssignment_4_1 ) ) )
            // InternalTheory.g:2742:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            {
            // InternalTheory.g:2742:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            // InternalTheory.g:2743:2: ( rule__Operator__PrecedentAssignment_4_1 )
            {
             before(grammarAccess.getOperatorAccess().getPrecedentAssignment_4_1()); 
            // InternalTheory.g:2744:2: ( rule__Operator__PrecedentAssignment_4_1 )
            // InternalTheory.g:2744:3: rule__Operator__PrecedentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__PrecedentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getPrecedentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_4__1__Impl"


    // $ANTLR start "rule__Operator__Group_5__0"
    // InternalTheory.g:2753:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2757:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalTheory.g:2758:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_5__0"


    // $ANTLR start "rule__Operator__Group_5__0__Impl"
    // InternalTheory.g:2765:1: rule__Operator__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2769:1: ( ( 'for' ) )
            // InternalTheory.g:2770:1: ( 'for' )
            {
            // InternalTheory.g:2770:1: ( 'for' )
            // InternalTheory.g:2771:2: 'for'
            {
             before(grammarAccess.getOperatorAccess().getForKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getForKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_5__0__Impl"


    // $ANTLR start "rule__Operator__Group_5__1"
    // InternalTheory.g:2780:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2784:1: ( rule__Operator__Group_5__1__Impl )
            // InternalTheory.g:2785:2: rule__Operator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_5__1"


    // $ANTLR start "rule__Operator__Group_5__1__Impl"
    // InternalTheory.g:2791:1: rule__Operator__Group_5__1__Impl : ( ( rule__Operator__WdAssignment_5_1 ) ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2795:1: ( ( ( rule__Operator__WdAssignment_5_1 ) ) )
            // InternalTheory.g:2796:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            {
            // InternalTheory.g:2796:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            // InternalTheory.g:2797:2: ( rule__Operator__WdAssignment_5_1 )
            {
             before(grammarAccess.getOperatorAccess().getWdAssignment_5_1()); 
            // InternalTheory.g:2798:2: ( rule__Operator__WdAssignment_5_1 )
            // InternalTheory.g:2798:3: rule__Operator__WdAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__WdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getWdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_5__1__Impl"


    // $ANTLR start "rule__Operator__Group_6__0"
    // InternalTheory.g:2807:1: rule__Operator__Group_6__0 : rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 ;
    public final void rule__Operator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2811:1: ( rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 )
            // InternalTheory.g:2812:2: rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__Operator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__0"


    // $ANTLR start "rule__Operator__Group_6__0__Impl"
    // InternalTheory.g:2819:1: rule__Operator__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Operator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2823:1: ( ( '=' ) )
            // InternalTheory.g:2824:1: ( '=' )
            {
            // InternalTheory.g:2824:1: ( '=' )
            // InternalTheory.g:2825:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__0__Impl"


    // $ANTLR start "rule__Operator__Group_6__1"
    // InternalTheory.g:2834:1: rule__Operator__Group_6__1 : rule__Operator__Group_6__1__Impl ;
    public final void rule__Operator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2838:1: ( rule__Operator__Group_6__1__Impl )
            // InternalTheory.g:2839:2: rule__Operator__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__1"


    // $ANTLR start "rule__Operator__Group_6__1__Impl"
    // InternalTheory.g:2845:1: rule__Operator__Group_6__1__Impl : ( ( rule__Operator__Alternatives_6_1 ) ) ;
    public final void rule__Operator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2849:1: ( ( ( rule__Operator__Alternatives_6_1 ) ) )
            // InternalTheory.g:2850:1: ( ( rule__Operator__Alternatives_6_1 ) )
            {
            // InternalTheory.g:2850:1: ( ( rule__Operator__Alternatives_6_1 ) )
            // InternalTheory.g:2851:2: ( rule__Operator__Alternatives_6_1 )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives_6_1()); 
            // InternalTheory.g:2852:2: ( rule__Operator__Alternatives_6_1 )
            // InternalTheory.g:2852:3: rule__Operator__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__1__Impl"


    // $ANTLR start "rule__Operator__Group_6_1_1__0"
    // InternalTheory.g:2861:1: rule__Operator__Group_6_1_1__0 : rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 ;
    public final void rule__Operator__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2865:1: ( rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 )
            // InternalTheory.g:2866:2: rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Operator__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__0"


    // $ANTLR start "rule__Operator__Group_6_1_1__0__Impl"
    // InternalTheory.g:2873:1: rule__Operator__Group_6_1_1__0__Impl : ( 'case' ) ;
    public final void rule__Operator__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2877:1: ( ( 'case' ) )
            // InternalTheory.g:2878:1: ( 'case' )
            {
            // InternalTheory.g:2878:1: ( 'case' )
            // InternalTheory.g:2879:2: 'case'
            {
             before(grammarAccess.getOperatorAccess().getCaseKeyword_6_1_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCaseKeyword_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__Operator__Group_6_1_1__1"
    // InternalTheory.g:2888:1: rule__Operator__Group_6_1_1__1 : rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 ;
    public final void rule__Operator__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2892:1: ( rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 )
            // InternalTheory.g:2893:2: rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group_6_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_6_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__1"


    // $ANTLR start "rule__Operator__Group_6_1_1__1__Impl"
    // InternalTheory.g:2900:1: rule__Operator__Group_6_1_1__1__Impl : ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) ;
    public final void rule__Operator__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2904:1: ( ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) )
            // InternalTheory.g:2905:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            {
            // InternalTheory.g:2905:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            // InternalTheory.g:2906:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            {
             before(grammarAccess.getOperatorAccess().getCaseAssignment_6_1_1_1()); 
            // InternalTheory.g:2907:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            // InternalTheory.g:2907:3: rule__Operator__CaseAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__CaseAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCaseAssignment_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__Operator__Group_6_1_1__2"
    // InternalTheory.g:2915:1: rule__Operator__Group_6_1_1__2 : rule__Operator__Group_6_1_1__2__Impl ;
    public final void rule__Operator__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2919:1: ( rule__Operator__Group_6_1_1__2__Impl )
            // InternalTheory.g:2920:2: rule__Operator__Group_6_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__2"


    // $ANTLR start "rule__Operator__Group_6_1_1__2__Impl"
    // InternalTheory.g:2926:1: rule__Operator__Group_6_1_1__2__Impl : ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) ;
    public final void rule__Operator__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2930:1: ( ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) )
            // InternalTheory.g:2931:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            {
            // InternalTheory.g:2931:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            // InternalTheory.g:2932:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            {
            // InternalTheory.g:2932:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) )
            // InternalTheory.g:2933:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2934:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            // InternalTheory.g:2934:4: rule__Operator__CasesAssignment_6_1_1_2
            {
            pushFollow(FOLLOW_27);
            rule__Operator__CasesAssignment_6_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 

            }

            // InternalTheory.g:2937:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            // InternalTheory.g:2938:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2939:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STRING) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalTheory.g:2939:4: rule__Operator__CasesAssignment_6_1_1_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Operator__CasesAssignment_6_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6_1_1__2__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalTheory.g:2949:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2953:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalTheory.g:2954:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalTheory.g:2961:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__CommentAssignment_0 )? ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2965:1: ( ( ( rule__Argument__CommentAssignment_0 )? ) )
            // InternalTheory.g:2966:1: ( ( rule__Argument__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2966:1: ( ( rule__Argument__CommentAssignment_0 )? )
            // InternalTheory.g:2967:2: ( rule__Argument__CommentAssignment_0 )?
            {
             before(grammarAccess.getArgumentAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2968:2: ( rule__Argument__CommentAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ML_COMMENT && LA43_0<=RULE_SL_COMMENT)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTheory.g:2968:3: rule__Argument__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Argument__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalTheory.g:2976:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2980:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalTheory.g:2981:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalTheory.g:2988:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2992:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalTheory.g:2993:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalTheory.g:2993:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalTheory.g:2994:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalTheory.g:2995:2: ( rule__Argument__NameAssignment_1 )
            // InternalTheory.g:2995:3: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // InternalTheory.g:3003:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3007:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // InternalTheory.g:3008:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Argument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // InternalTheory.g:3015:1: rule__Argument__Group__2__Impl : ( ':' ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3019:1: ( ( ':' ) )
            // InternalTheory.g:3020:1: ( ':' )
            {
            // InternalTheory.g:3020:1: ( ':' )
            // InternalTheory.g:3021:2: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__Argument__Group__3"
    // InternalTheory.g:3030:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3034:1: ( rule__Argument__Group__3__Impl )
            // InternalTheory.g:3035:2: rule__Argument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3"


    // $ANTLR start "rule__Argument__Group__3__Impl"
    // InternalTheory.g:3041:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__TypeAssignment_3 ) ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3045:1: ( ( ( rule__Argument__TypeAssignment_3 ) ) )
            // InternalTheory.g:3046:1: ( ( rule__Argument__TypeAssignment_3 ) )
            {
            // InternalTheory.g:3046:1: ( ( rule__Argument__TypeAssignment_3 ) )
            // InternalTheory.g:3047:2: ( rule__Argument__TypeAssignment_3 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_3()); 
            // InternalTheory.g:3048:2: ( rule__Argument__TypeAssignment_3 )
            // InternalTheory.g:3048:3: rule__Argument__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Argument__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalTheory.g:3057:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3061:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTheory.g:3062:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalTheory.g:3069:1: rule__Case__Group__0__Impl : ( ( rule__Case__PatternAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3073:1: ( ( ( rule__Case__PatternAssignment_0 ) ) )
            // InternalTheory.g:3074:1: ( ( rule__Case__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3074:1: ( ( rule__Case__PatternAssignment_0 ) )
            // InternalTheory.g:3075:2: ( rule__Case__PatternAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3076:2: ( rule__Case__PatternAssignment_0 )
            // InternalTheory.g:3076:3: rule__Case__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getPatternAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalTheory.g:3084:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3088:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTheory.g:3089:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalTheory.g:3096:1: rule__Case__Group__1__Impl : ( '=>' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3100:1: ( ( '=>' ) )
            // InternalTheory.g:3101:1: ( '=>' )
            {
            // InternalTheory.g:3101:1: ( '=>' )
            // InternalTheory.g:3102:2: '=>'
            {
             before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalTheory.g:3111:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3115:1: ( rule__Case__Group__2__Impl )
            // InternalTheory.g:3116:2: rule__Case__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalTheory.g:3122:1: rule__Case__Group__2__Impl : ( ( rule__Case__FormulaAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3126:1: ( ( ( rule__Case__FormulaAssignment_2 ) ) )
            // InternalTheory.g:3127:1: ( ( rule__Case__FormulaAssignment_2 ) )
            {
            // InternalTheory.g:3127:1: ( ( rule__Case__FormulaAssignment_2 ) )
            // InternalTheory.g:3128:2: ( rule__Case__FormulaAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 
            // InternalTheory.g:3129:2: ( rule__Case__FormulaAssignment_2 )
            // InternalTheory.g:3129:3: rule__Case__FormulaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__FormulaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Axiom__Group__0"
    // InternalTheory.g:3138:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3142:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // InternalTheory.g:3143:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Axiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__0"


    // $ANTLR start "rule__Axiom__Group__0__Impl"
    // InternalTheory.g:3150:1: rule__Axiom__Group__0__Impl : ( ( rule__Axiom__CommentAssignment_0 )? ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3154:1: ( ( ( rule__Axiom__CommentAssignment_0 )? ) )
            // InternalTheory.g:3155:1: ( ( rule__Axiom__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3155:1: ( ( rule__Axiom__CommentAssignment_0 )? )
            // InternalTheory.g:3156:2: ( rule__Axiom__CommentAssignment_0 )?
            {
             before(grammarAccess.getAxiomAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3157:2: ( rule__Axiom__CommentAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTheory.g:3157:3: rule__Axiom__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axiom__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__0__Impl"


    // $ANTLR start "rule__Axiom__Group__1"
    // InternalTheory.g:3165:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3169:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // InternalTheory.g:3170:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Axiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__1"


    // $ANTLR start "rule__Axiom__Group__1__Impl"
    // InternalTheory.g:3177:1: rule__Axiom__Group__1__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3181:1: ( ( '@' ) )
            // InternalTheory.g:3182:1: ( '@' )
            {
            // InternalTheory.g:3182:1: ( '@' )
            // InternalTheory.g:3183:2: '@'
            {
             before(grammarAccess.getAxiomAccess().getCommercialAtKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__1__Impl"


    // $ANTLR start "rule__Axiom__Group__2"
    // InternalTheory.g:3192:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3196:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // InternalTheory.g:3197:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Axiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__2"


    // $ANTLR start "rule__Axiom__Group__2__Impl"
    // InternalTheory.g:3204:1: rule__Axiom__Group__2__Impl : ( ( rule__Axiom__NameAssignment_2 ) ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3208:1: ( ( ( rule__Axiom__NameAssignment_2 ) ) )
            // InternalTheory.g:3209:1: ( ( rule__Axiom__NameAssignment_2 ) )
            {
            // InternalTheory.g:3209:1: ( ( rule__Axiom__NameAssignment_2 ) )
            // InternalTheory.g:3210:2: ( rule__Axiom__NameAssignment_2 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_2()); 
            // InternalTheory.g:3211:2: ( rule__Axiom__NameAssignment_2 )
            // InternalTheory.g:3211:3: rule__Axiom__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__2__Impl"


    // $ANTLR start "rule__Axiom__Group__3"
    // InternalTheory.g:3219:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl rule__Axiom__Group__4 ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3223:1: ( rule__Axiom__Group__3__Impl rule__Axiom__Group__4 )
            // InternalTheory.g:3224:2: rule__Axiom__Group__3__Impl rule__Axiom__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Axiom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__3"


    // $ANTLR start "rule__Axiom__Group__3__Impl"
    // InternalTheory.g:3231:1: rule__Axiom__Group__3__Impl : ( ':' ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3235:1: ( ( ':' ) )
            // InternalTheory.g:3236:1: ( ':' )
            {
            // InternalTheory.g:3236:1: ( ':' )
            // InternalTheory.g:3237:2: ':'
            {
             before(grammarAccess.getAxiomAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__3__Impl"


    // $ANTLR start "rule__Axiom__Group__4"
    // InternalTheory.g:3246:1: rule__Axiom__Group__4 : rule__Axiom__Group__4__Impl ;
    public final void rule__Axiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3250:1: ( rule__Axiom__Group__4__Impl )
            // InternalTheory.g:3251:2: rule__Axiom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__4"


    // $ANTLR start "rule__Axiom__Group__4__Impl"
    // InternalTheory.g:3257:1: rule__Axiom__Group__4__Impl : ( ( rule__Axiom__PredicateAssignment_4 ) ) ;
    public final void rule__Axiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3261:1: ( ( ( rule__Axiom__PredicateAssignment_4 ) ) )
            // InternalTheory.g:3262:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            {
            // InternalTheory.g:3262:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            // InternalTheory.g:3263:2: ( rule__Axiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 
            // InternalTheory.g:3264:2: ( rule__Axiom__PredicateAssignment_4 )
            // InternalTheory.g:3264:3: rule__Axiom__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__4__Impl"


    // $ANTLR start "rule__Theorem__Group__0"
    // InternalTheory.g:3273:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3277:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // InternalTheory.g:3278:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0"


    // $ANTLR start "rule__Theorem__Group__0__Impl"
    // InternalTheory.g:3285:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__CommentAssignment_0 )? ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3289:1: ( ( ( rule__Theorem__CommentAssignment_0 )? ) )
            // InternalTheory.g:3290:1: ( ( rule__Theorem__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3290:1: ( ( rule__Theorem__CommentAssignment_0 )? )
            // InternalTheory.g:3291:2: ( rule__Theorem__CommentAssignment_0 )?
            {
             before(grammarAccess.getTheoremAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3292:2: ( rule__Theorem__CommentAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ML_COMMENT && LA45_0<=RULE_SL_COMMENT)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTheory.g:3292:3: rule__Theorem__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theorem__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoremAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0__Impl"


    // $ANTLR start "rule__Theorem__Group__1"
    // InternalTheory.g:3300:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3304:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // InternalTheory.g:3305:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1"


    // $ANTLR start "rule__Theorem__Group__1__Impl"
    // InternalTheory.g:3312:1: rule__Theorem__Group__1__Impl : ( '@' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3316:1: ( ( '@' ) )
            // InternalTheory.g:3317:1: ( '@' )
            {
            // InternalTheory.g:3317:1: ( '@' )
            // InternalTheory.g:3318:2: '@'
            {
             before(grammarAccess.getTheoremAccess().getCommercialAtKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1__Impl"


    // $ANTLR start "rule__Theorem__Group__2"
    // InternalTheory.g:3327:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3331:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // InternalTheory.g:3332:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2"


    // $ANTLR start "rule__Theorem__Group__2__Impl"
    // InternalTheory.g:3339:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__NameAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3343:1: ( ( ( rule__Theorem__NameAssignment_2 ) ) )
            // InternalTheory.g:3344:1: ( ( rule__Theorem__NameAssignment_2 ) )
            {
            // InternalTheory.g:3344:1: ( ( rule__Theorem__NameAssignment_2 ) )
            // InternalTheory.g:3345:2: ( rule__Theorem__NameAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getNameAssignment_2()); 
            // InternalTheory.g:3346:2: ( rule__Theorem__NameAssignment_2 )
            // InternalTheory.g:3346:3: rule__Theorem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2__Impl"


    // $ANTLR start "rule__Theorem__Group__3"
    // InternalTheory.g:3354:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3358:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // InternalTheory.g:3359:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3"


    // $ANTLR start "rule__Theorem__Group__3__Impl"
    // InternalTheory.g:3366:1: rule__Theorem__Group__3__Impl : ( ':' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3370:1: ( ( ':' ) )
            // InternalTheory.g:3371:1: ( ':' )
            {
            // InternalTheory.g:3371:1: ( ':' )
            // InternalTheory.g:3372:2: ':'
            {
             before(grammarAccess.getTheoremAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3__Impl"


    // $ANTLR start "rule__Theorem__Group__4"
    // InternalTheory.g:3381:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3385:1: ( rule__Theorem__Group__4__Impl )
            // InternalTheory.g:3386:2: rule__Theorem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4"


    // $ANTLR start "rule__Theorem__Group__4__Impl"
    // InternalTheory.g:3392:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__PredicateAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3396:1: ( ( ( rule__Theorem__PredicateAssignment_4 ) ) )
            // InternalTheory.g:3397:1: ( ( rule__Theorem__PredicateAssignment_4 ) )
            {
            // InternalTheory.g:3397:1: ( ( rule__Theorem__PredicateAssignment_4 ) )
            // InternalTheory.g:3398:2: ( rule__Theorem__PredicateAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getPredicateAssignment_4()); 
            // InternalTheory.g:3399:2: ( rule__Theorem__PredicateAssignment_4 )
            // InternalTheory.g:3399:3: rule__Theorem__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTheory.g:3408:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3412:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTheory.g:3413:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalTheory.g:3420:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__CommentAssignment_0 )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3424:1: ( ( ( rule__Variable__CommentAssignment_0 )? ) )
            // InternalTheory.g:3425:1: ( ( rule__Variable__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3425:1: ( ( rule__Variable__CommentAssignment_0 )? )
            // InternalTheory.g:3426:2: ( rule__Variable__CommentAssignment_0 )?
            {
             before(grammarAccess.getVariableAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3427:2: ( rule__Variable__CommentAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ML_COMMENT && LA46_0<=RULE_SL_COMMENT)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTheory.g:3427:3: rule__Variable__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalTheory.g:3435:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3439:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTheory.g:3440:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalTheory.g:3447:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3451:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalTheory.g:3452:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalTheory.g:3452:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalTheory.g:3453:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalTheory.g:3454:2: ( rule__Variable__NameAssignment_1 )
            // InternalTheory.g:3454:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalTheory.g:3462:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3466:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalTheory.g:3467:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalTheory.g:3474:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3478:1: ( ( ':' ) )
            // InternalTheory.g:3479:1: ( ':' )
            {
            // InternalTheory.g:3479:1: ( ':' )
            // InternalTheory.g:3480:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalTheory.g:3489:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3493:1: ( rule__Variable__Group__3__Impl )
            // InternalTheory.g:3494:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalTheory.g:3500:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3504:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalTheory.g:3505:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalTheory.g:3505:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalTheory.g:3506:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalTheory.g:3507:2: ( rule__Variable__TypeAssignment_3 )
            // InternalTheory.g:3507:3: rule__Variable__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTheory.g:3516:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3520:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTheory.g:3521:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTheory.g:3528:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__CommentAssignment_0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3532:1: ( ( ( rule__Rule__CommentAssignment_0 )? ) )
            // InternalTheory.g:3533:1: ( ( rule__Rule__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3533:1: ( ( rule__Rule__CommentAssignment_0 )? )
            // InternalTheory.g:3534:2: ( rule__Rule__CommentAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3535:2: ( rule__Rule__CommentAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ML_COMMENT && LA47_0<=RULE_SL_COMMENT)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTheory.g:3535:3: rule__Rule__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTheory.g:3543:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3547:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTheory.g:3548:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTheory.g:3555:1: rule__Rule__Group__1__Impl : ( '@' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3559:1: ( ( '@' ) )
            // InternalTheory.g:3560:1: ( '@' )
            {
            // InternalTheory.g:3560:1: ( '@' )
            // InternalTheory.g:3561:2: '@'
            {
             before(grammarAccess.getRuleAccess().getCommercialAtKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTheory.g:3570:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3574:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalTheory.g:3575:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTheory.g:3582:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__NameAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3586:1: ( ( ( rule__Rule__NameAssignment_2 ) ) )
            // InternalTheory.g:3587:1: ( ( rule__Rule__NameAssignment_2 ) )
            {
            // InternalTheory.g:3587:1: ( ( rule__Rule__NameAssignment_2 ) )
            // InternalTheory.g:3588:2: ( rule__Rule__NameAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_2()); 
            // InternalTheory.g:3589:2: ( rule__Rule__NameAssignment_2 )
            // InternalTheory.g:3589:3: rule__Rule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalTheory.g:3597:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3601:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalTheory.g:3602:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalTheory.g:3609:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3613:1: ( ( ':' ) )
            // InternalTheory.g:3614:1: ( ':' )
            {
            // InternalTheory.g:3614:1: ( ':' )
            // InternalTheory.g:3615:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalTheory.g:3624:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3628:1: ( rule__Rule__Group__4__Impl )
            // InternalTheory.g:3629:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalTheory.g:3635:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Alternatives_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3639:1: ( ( ( rule__Rule__Alternatives_4 ) ) )
            // InternalTheory.g:3640:1: ( ( rule__Rule__Alternatives_4 ) )
            {
            // InternalTheory.g:3640:1: ( ( rule__Rule__Alternatives_4 ) )
            // InternalTheory.g:3641:2: ( rule__Rule__Alternatives_4 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_4()); 
            // InternalTheory.g:3642:2: ( rule__Rule__Alternatives_4 )
            // InternalTheory.g:3642:3: rule__Rule__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__RewriteRule__Group__0"
    // InternalTheory.g:3651:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3655:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // InternalTheory.g:3656:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RewriteRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__0"


    // $ANTLR start "rule__RewriteRule__Group__0__Impl"
    // InternalTheory.g:3663:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__PatternAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3667:1: ( ( ( rule__RewriteRule__PatternAssignment_0 ) ) )
            // InternalTheory.g:3668:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3668:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            // InternalTheory.g:3669:2: ( rule__RewriteRule__PatternAssignment_0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3670:2: ( rule__RewriteRule__PatternAssignment_0 )
            // InternalTheory.g:3670:3: rule__RewriteRule__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__0__Impl"


    // $ANTLR start "rule__RewriteRule__Group__1"
    // InternalTheory.g:3678:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3682:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // InternalTheory.g:3683:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RewriteRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__1"


    // $ANTLR start "rule__RewriteRule__Group__1__Impl"
    // InternalTheory.g:3690:1: rule__RewriteRule__Group__1__Impl : ( '==' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3694:1: ( ( '==' ) )
            // InternalTheory.g:3695:1: ( '==' )
            {
            // InternalTheory.g:3695:1: ( '==' )
            // InternalTheory.g:3696:2: '=='
            {
             before(grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__1__Impl"


    // $ANTLR start "rule__RewriteRule__Group__2"
    // InternalTheory.g:3705:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3709:1: ( rule__RewriteRule__Group__2__Impl )
            // InternalTheory.g:3710:2: rule__RewriteRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__2"


    // $ANTLR start "rule__RewriteRule__Group__2__Impl"
    // InternalTheory.g:3716:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__Alternatives_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3720:1: ( ( ( rule__RewriteRule__Alternatives_2 ) ) )
            // InternalTheory.g:3721:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            {
            // InternalTheory.g:3721:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            // InternalTheory.g:3722:2: ( rule__RewriteRule__Alternatives_2 )
            {
             before(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 
            // InternalTheory.g:3723:2: ( rule__RewriteRule__Alternatives_2 )
            // InternalTheory.g:3723:3: rule__RewriteRule__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__2__Impl"


    // $ANTLR start "rule__InferenceRule__Group__0"
    // InternalTheory.g:3732:1: rule__InferenceRule__Group__0 : rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 ;
    public final void rule__InferenceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3736:1: ( rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 )
            // InternalTheory.g:3737:2: rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__InferenceRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__0"


    // $ANTLR start "rule__InferenceRule__Group__0__Impl"
    // InternalTheory.g:3744:1: rule__InferenceRule__Group__0__Impl : ( ( rule__InferenceRule__GivenAssignment_0 )* ) ;
    public final void rule__InferenceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3748:1: ( ( ( rule__InferenceRule__GivenAssignment_0 )* ) )
            // InternalTheory.g:3749:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            {
            // InternalTheory.g:3749:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            // InternalTheory.g:3750:2: ( rule__InferenceRule__GivenAssignment_0 )*
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 
            // InternalTheory.g:3751:2: ( rule__InferenceRule__GivenAssignment_0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalTheory.g:3751:3: rule__InferenceRule__GivenAssignment_0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__InferenceRule__GivenAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__0__Impl"


    // $ANTLR start "rule__InferenceRule__Group__1"
    // InternalTheory.g:3759:1: rule__InferenceRule__Group__1 : rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 ;
    public final void rule__InferenceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3763:1: ( rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 )
            // InternalTheory.g:3764:2: rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InferenceRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__1"


    // $ANTLR start "rule__InferenceRule__Group__1__Impl"
    // InternalTheory.g:3771:1: rule__InferenceRule__Group__1__Impl : ( '|-' ) ;
    public final void rule__InferenceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3775:1: ( ( '|-' ) )
            // InternalTheory.g:3776:1: ( '|-' )
            {
            // InternalTheory.g:3776:1: ( '|-' )
            // InternalTheory.g:3777:2: '|-'
            {
             before(grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__1__Impl"


    // $ANTLR start "rule__InferenceRule__Group__2"
    // InternalTheory.g:3786:1: rule__InferenceRule__Group__2 : rule__InferenceRule__Group__2__Impl ;
    public final void rule__InferenceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3790:1: ( rule__InferenceRule__Group__2__Impl )
            // InternalTheory.g:3791:2: rule__InferenceRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__2"


    // $ANTLR start "rule__InferenceRule__Group__2__Impl"
    // InternalTheory.g:3797:1: rule__InferenceRule__Group__2__Impl : ( ( rule__InferenceRule__InferAssignment_2 ) ) ;
    public final void rule__InferenceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3801:1: ( ( ( rule__InferenceRule__InferAssignment_2 ) ) )
            // InternalTheory.g:3802:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            {
            // InternalTheory.g:3802:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            // InternalTheory.g:3803:2: ( rule__InferenceRule__InferAssignment_2 )
            {
             before(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 
            // InternalTheory.g:3804:2: ( rule__InferenceRule__InferAssignment_2 )
            // InternalTheory.g:3804:3: rule__InferenceRule__InferAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__InferAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalTheory.g:3813:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3817:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalTheory.g:3818:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalTheory.g:3825:1: rule__Given__Group__0__Impl : ( ( rule__Given__ExpressionAssignment_0 ) ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3829:1: ( ( ( rule__Given__ExpressionAssignment_0 ) ) )
            // InternalTheory.g:3830:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            {
            // InternalTheory.g:3830:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            // InternalTheory.g:3831:2: ( rule__Given__ExpressionAssignment_0 )
            {
             before(grammarAccess.getGivenAccess().getExpressionAssignment_0()); 
            // InternalTheory.g:3832:2: ( rule__Given__ExpressionAssignment_0 )
            // InternalTheory.g:3832:3: rule__Given__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Given__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalTheory.g:3840:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3844:1: ( rule__Given__Group__1__Impl )
            // InternalTheory.g:3845:2: rule__Given__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalTheory.g:3851:1: rule__Given__Group__1__Impl : ( ( rule__Given__RequiredAssignment_1 )? ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3855:1: ( ( ( rule__Given__RequiredAssignment_1 )? ) )
            // InternalTheory.g:3856:1: ( ( rule__Given__RequiredAssignment_1 )? )
            {
            // InternalTheory.g:3856:1: ( ( rule__Given__RequiredAssignment_1 )? )
            // InternalTheory.g:3857:2: ( rule__Given__RequiredAssignment_1 )?
            {
             before(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 
            // InternalTheory.g:3858:2: ( rule__Given__RequiredAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTheory.g:3858:3: rule__Given__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewrite__Group__0"
    // InternalTheory.g:3867:1: rule__ConditionalRewrite__Group__0 : rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 ;
    public final void rule__ConditionalRewrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3871:1: ( rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 )
            // InternalTheory.g:3872:2: rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConditionalRewrite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__Group__0"


    // $ANTLR start "rule__ConditionalRewrite__Group__0__Impl"
    // InternalTheory.g:3879:1: rule__ConditionalRewrite__Group__0__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) ;
    public final void rule__ConditionalRewrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3883:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) )
            // InternalTheory.g:3884:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            {
            // InternalTheory.g:3884:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            // InternalTheory.g:3885:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 
            // InternalTheory.g:3886:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            // InternalTheory.g:3886:3: rule__ConditionalRewrite__RewritesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__RewritesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__Group__0__Impl"


    // $ANTLR start "rule__ConditionalRewrite__Group__1"
    // InternalTheory.g:3894:1: rule__ConditionalRewrite__Group__1 : rule__ConditionalRewrite__Group__1__Impl ;
    public final void rule__ConditionalRewrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3898:1: ( rule__ConditionalRewrite__Group__1__Impl )
            // InternalTheory.g:3899:2: rule__ConditionalRewrite__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__Group__1"


    // $ANTLR start "rule__ConditionalRewrite__Group__1__Impl"
    // InternalTheory.g:3905:1: rule__ConditionalRewrite__Group__1__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) ;
    public final void rule__ConditionalRewrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3909:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) )
            // InternalTheory.g:3910:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            {
            // InternalTheory.g:3910:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            // InternalTheory.g:3911:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 
            // InternalTheory.g:3912:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_STRING) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalTheory.g:3912:3: rule__ConditionalRewrite__RewritesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ConditionalRewrite__RewritesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__0"
    // InternalTheory.g:3921:1: rule__ConditionalRewriteRule__Group__0 : rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 ;
    public final void rule__ConditionalRewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3925:1: ( rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 )
            // InternalTheory.g:3926:2: rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ConditionalRewriteRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__0"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__0__Impl"
    // InternalTheory.g:3933:1: rule__ConditionalRewriteRule__Group__0__Impl : ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3937:1: ( ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) )
            // InternalTheory.g:3938:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            {
            // InternalTheory.g:3938:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            // InternalTheory.g:3939:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0()); 
            // InternalTheory.g:3940:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            // InternalTheory.g:3940:3: rule__ConditionalRewriteRule__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__0__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__1"
    // InternalTheory.g:3948:1: rule__ConditionalRewriteRule__Group__1 : rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 ;
    public final void rule__ConditionalRewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3952:1: ( rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 )
            // InternalTheory.g:3953:2: rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ConditionalRewriteRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__1"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__1__Impl"
    // InternalTheory.g:3960:1: rule__ConditionalRewriteRule__Group__1__Impl : ( '=>' ) ;
    public final void rule__ConditionalRewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3964:1: ( ( '=>' ) )
            // InternalTheory.g:3965:1: ( '=>' )
            {
            // InternalTheory.g:3965:1: ( '=>' )
            // InternalTheory.g:3966:2: '=>'
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__2"
    // InternalTheory.g:3975:1: rule__ConditionalRewriteRule__Group__2 : rule__ConditionalRewriteRule__Group__2__Impl ;
    public final void rule__ConditionalRewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3979:1: ( rule__ConditionalRewriteRule__Group__2__Impl )
            // InternalTheory.g:3980:2: rule__ConditionalRewriteRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__2"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__2__Impl"
    // InternalTheory.g:3986:1: rule__ConditionalRewriteRule__Group__2__Impl : ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3990:1: ( ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) )
            // InternalTheory.g:3991:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            {
            // InternalTheory.g:3991:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            // InternalTheory.g:3992:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 
            // InternalTheory.g:3993:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            // InternalTheory.g:3993:3: rule__ConditionalRewriteRule__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__Group__2__Impl"


    // $ANTLR start "rule__Operator__UnorderedGroup_3"
    // InternalTheory.g:4002:1: rule__Operator__UnorderedGroup_3 : ( rule__Operator__UnorderedGroup_3__0 )? ;
    public final void rule__Operator__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTheory.g:4007:1: ( ( rule__Operator__UnorderedGroup_3__0 )? )
            // InternalTheory.g:4008:2: ( rule__Operator__UnorderedGroup_3__0 )?
            {
            // InternalTheory.g:4008:2: ( rule__Operator__UnorderedGroup_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 11 && LA51_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTheory.g:4008:2: rule__Operator__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_3__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_3"


    // $ANTLR start "rule__Operator__UnorderedGroup_3__Impl"
    // InternalTheory.g:4016:1: rule__Operator__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Operator__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTheory.g:4021:1: ( ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) )
            // InternalTheory.g:4022:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            {
            // InternalTheory.g:4022:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 >= 11 && LA52_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt52=2;
            }
            else if ( LA52_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt52=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalTheory.g:4023:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    {
                    // InternalTheory.g:4023:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    // InternalTheory.g:4024:4: {...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTheory.g:4024:104: ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    // InternalTheory.g:4025:5: ( ( rule__Operator__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4031:5: ( ( rule__Operator__Group_3_0__0 ) )
                    // InternalTheory.g:4032:6: ( rule__Operator__Group_3_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_0()); 
                    // InternalTheory.g:4033:6: ( rule__Operator__Group_3_0__0 )
                    // InternalTheory.g:4033:7: rule__Operator__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:4038:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    {
                    // InternalTheory.g:4038:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    // InternalTheory.g:4039:4: {...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTheory.g:4039:104: ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    // InternalTheory.g:4040:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4046:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    // InternalTheory.g:4047:6: ( rule__Operator__NotationAssignment_3_1 )
                    {
                     before(grammarAccess.getOperatorAccess().getNotationAssignment_3_1()); 
                    // InternalTheory.g:4048:6: ( rule__Operator__NotationAssignment_3_1 )
                    // InternalTheory.g:4048:7: rule__Operator__NotationAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__NotationAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getNotationAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:4053:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    {
                    // InternalTheory.g:4053:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    // InternalTheory.g:4054:4: {...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalTheory.g:4054:104: ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    // InternalTheory.g:4055:5: ( ( rule__Operator__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4061:5: ( ( rule__Operator__Group_3_2__0 ) )
                    // InternalTheory.g:4062:6: ( rule__Operator__Group_3_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_2()); 
                    // InternalTheory.g:4063:6: ( rule__Operator__Group_3_2__0 )
                    // InternalTheory.g:4063:7: rule__Operator__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Operator__UnorderedGroup_3__0"
    // InternalTheory.g:4076:1: rule__Operator__UnorderedGroup_3__0 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? ;
    public final void rule__Operator__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4080:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? )
            // InternalTheory.g:4081:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_32);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:4082:2: ( rule__Operator__UnorderedGroup_3__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 >= 11 && LA53_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTheory.g:4082:2: rule__Operator__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_3__0"


    // $ANTLR start "rule__Operator__UnorderedGroup_3__1"
    // InternalTheory.g:4088:1: rule__Operator__UnorderedGroup_3__1 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? ;
    public final void rule__Operator__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4092:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? )
            // InternalTheory.g:4093:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_32);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:4094:2: ( rule__Operator__UnorderedGroup_3__2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 >= 11 && LA54_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTheory.g:4094:2: rule__Operator__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_3__1"


    // $ANTLR start "rule__Operator__UnorderedGroup_3__2"
    // InternalTheory.g:4100:1: rule__Operator__UnorderedGroup_3__2 : rule__Operator__UnorderedGroup_3__Impl ;
    public final void rule__Operator__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4104:1: ( rule__Operator__UnorderedGroup_3__Impl )
            // InternalTheory.g:4105:2: rule__Operator__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_3__2"


    // $ANTLR start "rule__Theory__NameAssignment_1"
    // InternalTheory.g:4112:1: rule__Theory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4116:1: ( ( RULE_ID ) )
            // InternalTheory.g:4117:2: ( RULE_ID )
            {
            // InternalTheory.g:4117:2: ( RULE_ID )
            // InternalTheory.g:4118:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__NameAssignment_1"


    // $ANTLR start "rule__Theory__ParametersAssignment_2_1"
    // InternalTheory.g:4127:1: rule__Theory__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Theory__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4131:1: ( ( ruleParameter ) )
            // InternalTheory.g:4132:2: ( ruleParameter )
            {
            // InternalTheory.g:4132:2: ( ruleParameter )
            // InternalTheory.g:4133:3: ruleParameter
            {
             before(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ParametersAssignment_2_1"


    // $ANTLR start "rule__Theory__ImportsAssignment_3_1"
    // InternalTheory.g:4142:1: rule__Theory__ImportsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4146:1: ( ( RULE_ID ) )
            // InternalTheory.g:4147:2: ( RULE_ID )
            {
            // InternalTheory.g:4147:2: ( RULE_ID )
            // InternalTheory.g:4148:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ImportsAssignment_3_1"


    // $ANTLR start "rule__Theory__ImportsAssignment_3_2"
    // InternalTheory.g:4157:1: rule__Theory__ImportsAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4161:1: ( ( RULE_ID ) )
            // InternalTheory.g:4162:2: ( RULE_ID )
            {
            // InternalTheory.g:4162:2: ( RULE_ID )
            // InternalTheory.g:4163:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ImportsAssignment_3_2"


    // $ANTLR start "rule__Theory__TypesAssignment_4_0_1"
    // InternalTheory.g:4172:1: rule__Theory__TypesAssignment_4_0_1 : ( ruleType ) ;
    public final void rule__Theory__TypesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4176:1: ( ( ruleType ) )
            // InternalTheory.g:4177:2: ( ruleType )
            {
            // InternalTheory.g:4177:2: ( ruleType )
            // InternalTheory.g:4178:3: ruleType
            {
             before(grammarAccess.getTheoryAccess().getTypesTypeParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getTypesTypeParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__TypesAssignment_4_0_1"


    // $ANTLR start "rule__Theory__OperatorsAssignment_4_1_1"
    // InternalTheory.g:4187:1: rule__Theory__OperatorsAssignment_4_1_1 : ( ruleOperator ) ;
    public final void rule__Theory__OperatorsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4191:1: ( ( ruleOperator ) )
            // InternalTheory.g:4192:2: ( ruleOperator )
            {
            // InternalTheory.g:4192:2: ( ruleOperator )
            // InternalTheory.g:4193:3: ruleOperator
            {
             before(grammarAccess.getTheoryAccess().getOperatorsOperatorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getOperatorsOperatorParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__OperatorsAssignment_4_1_1"


    // $ANTLR start "rule__Theory__AxiomsAssignment_4_2_1"
    // InternalTheory.g:4202:1: rule__Theory__AxiomsAssignment_4_2_1 : ( ruleAxiom ) ;
    public final void rule__Theory__AxiomsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4206:1: ( ( ruleAxiom ) )
            // InternalTheory.g:4207:2: ( ruleAxiom )
            {
            // InternalTheory.g:4207:2: ( ruleAxiom )
            // InternalTheory.g:4208:3: ruleAxiom
            {
             before(grammarAccess.getTheoryAccess().getAxiomsAxiomParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getAxiomsAxiomParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__AxiomsAssignment_4_2_1"


    // $ANTLR start "rule__Theory__TheoremsAssignment_4_3_1"
    // InternalTheory.g:4217:1: rule__Theory__TheoremsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Theory__TheoremsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4221:1: ( ( ruleTheorem ) )
            // InternalTheory.g:4222:2: ( ruleTheorem )
            {
            // InternalTheory.g:4222:2: ( ruleTheorem )
            // InternalTheory.g:4223:3: ruleTheorem
            {
             before(grammarAccess.getTheoryAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__TheoremsAssignment_4_3_1"


    // $ANTLR start "rule__Theory__VariablesAssignment_4_4_1_1"
    // InternalTheory.g:4232:1: rule__Theory__VariablesAssignment_4_4_1_1 : ( ruleVariable ) ;
    public final void rule__Theory__VariablesAssignment_4_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4236:1: ( ( ruleVariable ) )
            // InternalTheory.g:4237:2: ( ruleVariable )
            {
            // InternalTheory.g:4237:2: ( ruleVariable )
            // InternalTheory.g:4238:3: ruleVariable
            {
             before(grammarAccess.getTheoryAccess().getVariablesVariableParserRuleCall_4_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getVariablesVariableParserRuleCall_4_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__VariablesAssignment_4_4_1_1"


    // $ANTLR start "rule__Theory__RulesAssignment_4_4_2"
    // InternalTheory.g:4247:1: rule__Theory__RulesAssignment_4_4_2 : ( ruleRule ) ;
    public final void rule__Theory__RulesAssignment_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4251:1: ( ( ruleRule ) )
            // InternalTheory.g:4252:2: ( ruleRule )
            {
            // InternalTheory.g:4252:2: ( ruleRule )
            // InternalTheory.g:4253:3: ruleRule
            {
             before(grammarAccess.getTheoryAccess().getRulesRuleParserRuleCall_4_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getRulesRuleParserRuleCall_4_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__RulesAssignment_4_4_2"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalTheory.g:4262:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4266:1: ( ( RULE_ID ) )
            // InternalTheory.g:4267:2: ( RULE_ID )
            {
            // InternalTheory.g:4267:2: ( RULE_ID )
            // InternalTheory.g:4268:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__Type__CommentAssignment_0"
    // InternalTheory.g:4277:1: rule__Type__CommentAssignment_0 : ( ( rule__Type__CommentAlternatives_0_0 ) ) ;
    public final void rule__Type__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4281:1: ( ( ( rule__Type__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4282:2: ( ( rule__Type__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4282:2: ( ( rule__Type__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4283:3: ( rule__Type__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getTypeAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4284:3: ( rule__Type__CommentAlternatives_0_0 )
            // InternalTheory.g:4284:4: rule__Type__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommentAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalTheory.g:4292:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4296:1: ( ( RULE_ID ) )
            // InternalTheory.g:4297:2: ( RULE_ID )
            {
            // InternalTheory.g:4297:2: ( RULE_ID )
            // InternalTheory.g:4298:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__ParametersAssignment_2_1"
    // InternalTheory.g:4307:1: rule__Type__ParametersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4311:1: ( ( ( RULE_ID ) ) )
            // InternalTheory.g:4312:2: ( ( RULE_ID ) )
            {
            // InternalTheory.g:4312:2: ( ( RULE_ID ) )
            // InternalTheory.g:4313:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getParametersParameterCrossReference_2_1_0()); 
            // InternalTheory.g:4314:3: ( RULE_ID )
            // InternalTheory.g:4315:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getParametersParameterIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getParametersParameterIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getParametersParameterCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ParametersAssignment_2_1"


    // $ANTLR start "rule__Type__ConstructorsAssignment_2_4"
    // InternalTheory.g:4326:1: rule__Type__ConstructorsAssignment_2_4 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4330:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4331:2: ( ruleConstructor )
            {
            // InternalTheory.g:4331:2: ( ruleConstructor )
            // InternalTheory.g:4332:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ConstructorsAssignment_2_4"


    // $ANTLR start "rule__Type__ConstructorsAssignment_2_5_1"
    // InternalTheory.g:4341:1: rule__Type__ConstructorsAssignment_2_5_1 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4345:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4346:2: ( ruleConstructor )
            {
            // InternalTheory.g:4346:2: ( ruleConstructor )
            // InternalTheory.g:4347:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ConstructorsAssignment_2_5_1"


    // $ANTLR start "rule__Constructor__CommentAssignment_0"
    // InternalTheory.g:4356:1: rule__Constructor__CommentAssignment_0 : ( ( rule__Constructor__CommentAlternatives_0_0 ) ) ;
    public final void rule__Constructor__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4360:1: ( ( ( rule__Constructor__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4361:2: ( ( rule__Constructor__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4361:2: ( ( rule__Constructor__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4362:3: ( rule__Constructor__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getConstructorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4363:3: ( rule__Constructor__CommentAlternatives_0_0 )
            // InternalTheory.g:4363:4: rule__Constructor__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__CommentAssignment_0"


    // $ANTLR start "rule__Constructor__NameAssignment_1"
    // InternalTheory.g:4371:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4375:1: ( ( RULE_ID ) )
            // InternalTheory.g:4376:2: ( RULE_ID )
            {
            // InternalTheory.g:4376:2: ( RULE_ID )
            // InternalTheory.g:4377:3: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__NameAssignment_1"


    // $ANTLR start "rule__Constructor__DestructorsAssignment_2_1"
    // InternalTheory.g:4386:1: rule__Constructor__DestructorsAssignment_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4390:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4391:2: ( ruleDestructor )
            {
            // InternalTheory.g:4391:2: ( ruleDestructor )
            // InternalTheory.g:4392:3: ruleDestructor
            {
             before(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__DestructorsAssignment_2_1"


    // $ANTLR start "rule__Constructor__DestructorsAssignment_2_2_1"
    // InternalTheory.g:4401:1: rule__Constructor__DestructorsAssignment_2_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4405:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4406:2: ( ruleDestructor )
            {
            // InternalTheory.g:4406:2: ( ruleDestructor )
            // InternalTheory.g:4407:3: ruleDestructor
            {
             before(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__DestructorsAssignment_2_2_1"


    // $ANTLR start "rule__Destructor__CommentAssignment_0"
    // InternalTheory.g:4416:1: rule__Destructor__CommentAssignment_0 : ( ( rule__Destructor__CommentAlternatives_0_0 ) ) ;
    public final void rule__Destructor__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4420:1: ( ( ( rule__Destructor__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4421:2: ( ( rule__Destructor__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4421:2: ( ( rule__Destructor__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4422:3: ( rule__Destructor__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getDestructorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4423:3: ( rule__Destructor__CommentAlternatives_0_0 )
            // InternalTheory.g:4423:4: rule__Destructor__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__CommentAssignment_0"


    // $ANTLR start "rule__Destructor__NameAssignment_1"
    // InternalTheory.g:4431:1: rule__Destructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4435:1: ( ( RULE_ID ) )
            // InternalTheory.g:4436:2: ( RULE_ID )
            {
            // InternalTheory.g:4436:2: ( RULE_ID )
            // InternalTheory.g:4437:3: RULE_ID
            {
             before(grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__NameAssignment_1"


    // $ANTLR start "rule__Destructor__TypeAssignment_3"
    // InternalTheory.g:4446:1: rule__Destructor__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Destructor__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4450:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4451:2: ( RULE_STRING )
            {
            // InternalTheory.g:4451:2: ( RULE_STRING )
            // InternalTheory.g:4452:3: RULE_STRING
            {
             before(grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destructor__TypeAssignment_3"


    // $ANTLR start "rule__Operator__CommentAssignment_0"
    // InternalTheory.g:4461:1: rule__Operator__CommentAssignment_0 : ( ( rule__Operator__CommentAlternatives_0_0 ) ) ;
    public final void rule__Operator__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4465:1: ( ( ( rule__Operator__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4466:2: ( ( rule__Operator__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4466:2: ( ( rule__Operator__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4467:3: ( rule__Operator__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getOperatorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4468:3: ( rule__Operator__CommentAlternatives_0_0 )
            // InternalTheory.g:4468:4: rule__Operator__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__CommentAssignment_0"


    // $ANTLR start "rule__Operator__NameAssignment_1"
    // InternalTheory.g:4476:1: rule__Operator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4480:1: ( ( RULE_ID ) )
            // InternalTheory.g:4481:2: ( RULE_ID )
            {
            // InternalTheory.g:4481:2: ( RULE_ID )
            // InternalTheory.g:4482:3: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__NameAssignment_1"


    // $ANTLR start "rule__Operator__ArgumentsAssignment_2_1"
    // InternalTheory.g:4491:1: rule__Operator__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4495:1: ( ( ruleArgument ) )
            // InternalTheory.g:4496:2: ( ruleArgument )
            {
            // InternalTheory.g:4496:2: ( ruleArgument )
            // InternalTheory.g:4497:3: ruleArgument
            {
             before(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__Operator__ArgumentsAssignment_2_2_1"
    // InternalTheory.g:4506:1: rule__Operator__ArgumentsAssignment_2_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4510:1: ( ( ruleArgument ) )
            // InternalTheory.g:4511:2: ( ruleArgument )
            {
            // InternalTheory.g:4511:2: ( ruleArgument )
            // InternalTheory.g:4512:3: ruleArgument
            {
             before(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ArgumentsAssignment_2_2_1"


    // $ANTLR start "rule__Operator__TypeAssignment_3_0_1"
    // InternalTheory.g:4521:1: rule__Operator__TypeAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__Operator__TypeAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4525:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4526:2: ( RULE_STRING )
            {
            // InternalTheory.g:4526:2: ( RULE_STRING )
            // InternalTheory.g:4527:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__TypeAssignment_3_0_1"


    // $ANTLR start "rule__Operator__NotationAssignment_3_1"
    // InternalTheory.g:4536:1: rule__Operator__NotationAssignment_3_1 : ( ruleNotation ) ;
    public final void rule__Operator__NotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4540:1: ( ( ruleNotation ) )
            // InternalTheory.g:4541:2: ( ruleNotation )
            {
            // InternalTheory.g:4541:2: ( ruleNotation )
            // InternalTheory.g:4542:3: ruleNotation
            {
             before(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNotation();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__NotationAssignment_3_1"


    // $ANTLR start "rule__Operator__AssociativeAssignment_3_2_0"
    // InternalTheory.g:4551:1: rule__Operator__AssociativeAssignment_3_2_0 : ( ( 'associative' ) ) ;
    public final void rule__Operator__AssociativeAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4555:1: ( ( ( 'associative' ) ) )
            // InternalTheory.g:4556:2: ( ( 'associative' ) )
            {
            // InternalTheory.g:4556:2: ( ( 'associative' ) )
            // InternalTheory.g:4557:3: ( 'associative' )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0()); 
            // InternalTheory.g:4558:3: ( 'associative' )
            // InternalTheory.g:4559:4: 'associative'
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0()); 

            }

             after(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__AssociativeAssignment_3_2_0"


    // $ANTLR start "rule__Operator__CommutativeAssignment_3_2_1"
    // InternalTheory.g:4570:1: rule__Operator__CommutativeAssignment_3_2_1 : ( ( 'commutative' ) ) ;
    public final void rule__Operator__CommutativeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4574:1: ( ( ( 'commutative' ) ) )
            // InternalTheory.g:4575:2: ( ( 'commutative' ) )
            {
            // InternalTheory.g:4575:2: ( ( 'commutative' ) )
            // InternalTheory.g:4576:3: ( 'commutative' )
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 
            // InternalTheory.g:4577:3: ( 'commutative' )
            // InternalTheory.g:4578:4: 'commutative'
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 

            }

             after(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__CommutativeAssignment_3_2_1"


    // $ANTLR start "rule__Operator__PrecedentAssignment_4_1"
    // InternalTheory.g:4589:1: rule__Operator__PrecedentAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Operator__PrecedentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4593:1: ( ( RULE_INT ) )
            // InternalTheory.g:4594:2: ( RULE_INT )
            {
            // InternalTheory.g:4594:2: ( RULE_INT )
            // InternalTheory.g:4595:3: RULE_INT
            {
             before(grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__PrecedentAssignment_4_1"


    // $ANTLR start "rule__Operator__WdAssignment_5_1"
    // InternalTheory.g:4604:1: rule__Operator__WdAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Operator__WdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4608:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4609:2: ( RULE_STRING )
            {
            // InternalTheory.g:4609:2: ( RULE_STRING )
            // InternalTheory.g:4610:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__WdAssignment_5_1"


    // $ANTLR start "rule__Operator__DefinitionAssignment_6_1_0"
    // InternalTheory.g:4619:1: rule__Operator__DefinitionAssignment_6_1_0 : ( RULE_STRING ) ;
    public final void rule__Operator__DefinitionAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4623:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4624:2: ( RULE_STRING )
            {
            // InternalTheory.g:4624:2: ( RULE_STRING )
            // InternalTheory.g:4625:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_6_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__DefinitionAssignment_6_1_0"


    // $ANTLR start "rule__Operator__CaseAssignment_6_1_1_1"
    // InternalTheory.g:4634:1: rule__Operator__CaseAssignment_6_1_1_1 : ( RULE_ID ) ;
    public final void rule__Operator__CaseAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4638:1: ( ( RULE_ID ) )
            // InternalTheory.g:4639:2: ( RULE_ID )
            {
            // InternalTheory.g:4639:2: ( RULE_ID )
            // InternalTheory.g:4640:3: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_6_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__CaseAssignment_6_1_1_1"


    // $ANTLR start "rule__Operator__CasesAssignment_6_1_1_2"
    // InternalTheory.g:4649:1: rule__Operator__CasesAssignment_6_1_1_2 : ( ruleCase ) ;
    public final void rule__Operator__CasesAssignment_6_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4653:1: ( ( ruleCase ) )
            // InternalTheory.g:4654:2: ( ruleCase )
            {
            // InternalTheory.g:4654:2: ( ruleCase )
            // InternalTheory.g:4655:3: ruleCase
            {
             before(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_6_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_6_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__CasesAssignment_6_1_1_2"


    // $ANTLR start "rule__Argument__CommentAssignment_0"
    // InternalTheory.g:4664:1: rule__Argument__CommentAssignment_0 : ( ( rule__Argument__CommentAlternatives_0_0 ) ) ;
    public final void rule__Argument__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4668:1: ( ( ( rule__Argument__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4669:2: ( ( rule__Argument__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4669:2: ( ( rule__Argument__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4670:3: ( rule__Argument__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getArgumentAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4671:3: ( rule__Argument__CommentAlternatives_0_0 )
            // InternalTheory.g:4671:4: rule__Argument__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__CommentAssignment_0"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // InternalTheory.g:4679:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4683:1: ( ( RULE_ID ) )
            // InternalTheory.g:4684:2: ( RULE_ID )
            {
            // InternalTheory.g:4684:2: ( RULE_ID )
            // InternalTheory.g:4685:3: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_1"


    // $ANTLR start "rule__Argument__TypeAssignment_3"
    // InternalTheory.g:4694:1: rule__Argument__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Argument__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4698:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4699:2: ( RULE_STRING )
            {
            // InternalTheory.g:4699:2: ( RULE_STRING )
            // InternalTheory.g:4700:3: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TypeAssignment_3"


    // $ANTLR start "rule__Case__PatternAssignment_0"
    // InternalTheory.g:4709:1: rule__Case__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Case__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4713:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4714:2: ( RULE_STRING )
            {
            // InternalTheory.g:4714:2: ( RULE_STRING )
            // InternalTheory.g:4715:3: RULE_STRING
            {
             before(grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__PatternAssignment_0"


    // $ANTLR start "rule__Case__FormulaAssignment_2"
    // InternalTheory.g:4724:1: rule__Case__FormulaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Case__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4728:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4729:2: ( RULE_STRING )
            {
            // InternalTheory.g:4729:2: ( RULE_STRING )
            // InternalTheory.g:4730:3: RULE_STRING
            {
             before(grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__FormulaAssignment_2"


    // $ANTLR start "rule__Axiom__CommentAssignment_0"
    // InternalTheory.g:4739:1: rule__Axiom__CommentAssignment_0 : ( ( rule__Axiom__CommentAlternatives_0_0 ) ) ;
    public final void rule__Axiom__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4743:1: ( ( ( rule__Axiom__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4744:2: ( ( rule__Axiom__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4744:2: ( ( rule__Axiom__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4745:3: ( rule__Axiom__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getAxiomAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4746:3: ( rule__Axiom__CommentAlternatives_0_0 )
            // InternalTheory.g:4746:4: rule__Axiom__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__CommentAssignment_0"


    // $ANTLR start "rule__Axiom__NameAssignment_2"
    // InternalTheory.g:4754:1: rule__Axiom__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Axiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4758:1: ( ( RULE_ID ) )
            // InternalTheory.g:4759:2: ( RULE_ID )
            {
            // InternalTheory.g:4759:2: ( RULE_ID )
            // InternalTheory.g:4760:3: RULE_ID
            {
             before(grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__NameAssignment_2"


    // $ANTLR start "rule__Axiom__PredicateAssignment_4"
    // InternalTheory.g:4769:1: rule__Axiom__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Axiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4773:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4774:2: ( RULE_STRING )
            {
            // InternalTheory.g:4774:2: ( RULE_STRING )
            // InternalTheory.g:4775:3: RULE_STRING
            {
             before(grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__PredicateAssignment_4"


    // $ANTLR start "rule__Theorem__CommentAssignment_0"
    // InternalTheory.g:4784:1: rule__Theorem__CommentAssignment_0 : ( ( rule__Theorem__CommentAlternatives_0_0 ) ) ;
    public final void rule__Theorem__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4788:1: ( ( ( rule__Theorem__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4789:2: ( ( rule__Theorem__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4789:2: ( ( rule__Theorem__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4790:3: ( rule__Theorem__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getTheoremAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4791:3: ( rule__Theorem__CommentAlternatives_0_0 )
            // InternalTheory.g:4791:4: rule__Theorem__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__CommentAssignment_0"


    // $ANTLR start "rule__Theorem__NameAssignment_2"
    // InternalTheory.g:4799:1: rule__Theorem__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Theorem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4803:1: ( ( RULE_ID ) )
            // InternalTheory.g:4804:2: ( RULE_ID )
            {
            // InternalTheory.g:4804:2: ( RULE_ID )
            // InternalTheory.g:4805:3: RULE_ID
            {
             before(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__NameAssignment_2"


    // $ANTLR start "rule__Theorem__PredicateAssignment_4"
    // InternalTheory.g:4814:1: rule__Theorem__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Theorem__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4818:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4819:2: ( RULE_STRING )
            {
            // InternalTheory.g:4819:2: ( RULE_STRING )
            // InternalTheory.g:4820:3: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__PredicateAssignment_4"


    // $ANTLR start "rule__Variable__CommentAssignment_0"
    // InternalTheory.g:4829:1: rule__Variable__CommentAssignment_0 : ( ( rule__Variable__CommentAlternatives_0_0 ) ) ;
    public final void rule__Variable__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4833:1: ( ( ( rule__Variable__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4834:2: ( ( rule__Variable__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4834:2: ( ( rule__Variable__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4835:3: ( rule__Variable__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getVariableAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4836:3: ( rule__Variable__CommentAlternatives_0_0 )
            // InternalTheory.g:4836:4: rule__Variable__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__CommentAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalTheory.g:4844:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4848:1: ( ( RULE_ID ) )
            // InternalTheory.g:4849:2: ( RULE_ID )
            {
            // InternalTheory.g:4849:2: ( RULE_ID )
            // InternalTheory.g:4850:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__TypeAssignment_3"
    // InternalTheory.g:4859:1: rule__Variable__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4863:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4864:2: ( RULE_STRING )
            {
            // InternalTheory.g:4864:2: ( RULE_STRING )
            // InternalTheory.g:4865:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_3"


    // $ANTLR start "rule__Rule__CommentAssignment_0"
    // InternalTheory.g:4874:1: rule__Rule__CommentAssignment_0 : ( ( rule__Rule__CommentAlternatives_0_0 ) ) ;
    public final void rule__Rule__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4878:1: ( ( ( rule__Rule__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4879:2: ( ( rule__Rule__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4879:2: ( ( rule__Rule__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4880:3: ( rule__Rule__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getRuleAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4881:3: ( rule__Rule__CommentAlternatives_0_0 )
            // InternalTheory.g:4881:4: rule__Rule__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__CommentAssignment_0"


    // $ANTLR start "rule__Rule__NameAssignment_2"
    // InternalTheory.g:4889:1: rule__Rule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4893:1: ( ( RULE_ID ) )
            // InternalTheory.g:4894:2: ( RULE_ID )
            {
            // InternalTheory.g:4894:2: ( RULE_ID )
            // InternalTheory.g:4895:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_2"


    // $ANTLR start "rule__Rule__RruleAssignment_4_0"
    // InternalTheory.g:4904:1: rule__Rule__RruleAssignment_4_0 : ( ruleRewriteRule ) ;
    public final void rule__Rule__RruleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4908:1: ( ( ruleRewriteRule ) )
            // InternalTheory.g:4909:2: ( ruleRewriteRule )
            {
            // InternalTheory.g:4909:2: ( ruleRewriteRule )
            // InternalTheory.g:4910:3: ruleRewriteRule
            {
             before(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RruleAssignment_4_0"


    // $ANTLR start "rule__Rule__IruleAssignment_4_1"
    // InternalTheory.g:4919:1: rule__Rule__IruleAssignment_4_1 : ( ruleInferenceRule ) ;
    public final void rule__Rule__IruleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4923:1: ( ( ruleInferenceRule ) )
            // InternalTheory.g:4924:2: ( ruleInferenceRule )
            {
            // InternalTheory.g:4924:2: ( ruleInferenceRule )
            // InternalTheory.g:4925:3: ruleInferenceRule
            {
             before(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__IruleAssignment_4_1"


    // $ANTLR start "rule__RewriteRule__PatternAssignment_0"
    // InternalTheory.g:4934:1: rule__RewriteRule__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RewriteRule__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4938:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4939:2: ( RULE_STRING )
            {
            // InternalTheory.g:4939:2: ( RULE_STRING )
            // InternalTheory.g:4940:3: RULE_STRING
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__PatternAssignment_0"


    // $ANTLR start "rule__RewriteRule__UruleAssignment_2_0"
    // InternalTheory.g:4949:1: rule__RewriteRule__UruleAssignment_2_0 : ( ruleUnconditionalRewrite ) ;
    public final void rule__RewriteRule__UruleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4953:1: ( ( ruleUnconditionalRewrite ) )
            // InternalTheory.g:4954:2: ( ruleUnconditionalRewrite )
            {
            // InternalTheory.g:4954:2: ( ruleUnconditionalRewrite )
            // InternalTheory.g:4955:3: ruleUnconditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnconditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__UruleAssignment_2_0"


    // $ANTLR start "rule__RewriteRule__CruleAssignment_2_1"
    // InternalTheory.g:4964:1: rule__RewriteRule__CruleAssignment_2_1 : ( ruleConditionalRewrite ) ;
    public final void rule__RewriteRule__CruleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4968:1: ( ( ruleConditionalRewrite ) )
            // InternalTheory.g:4969:2: ( ruleConditionalRewrite )
            {
            // InternalTheory.g:4969:2: ( ruleConditionalRewrite )
            // InternalTheory.g:4970:3: ruleConditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__CruleAssignment_2_1"


    // $ANTLR start "rule__InferenceRule__GivenAssignment_0"
    // InternalTheory.g:4979:1: rule__InferenceRule__GivenAssignment_0 : ( ruleGiven ) ;
    public final void rule__InferenceRule__GivenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4983:1: ( ( ruleGiven ) )
            // InternalTheory.g:4984:2: ( ruleGiven )
            {
            // InternalTheory.g:4984:2: ( ruleGiven )
            // InternalTheory.g:4985:3: ruleGiven
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__GivenAssignment_0"


    // $ANTLR start "rule__InferenceRule__InferAssignment_2"
    // InternalTheory.g:4994:1: rule__InferenceRule__InferAssignment_2 : ( ruleInfer ) ;
    public final void rule__InferenceRule__InferAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4998:1: ( ( ruleInfer ) )
            // InternalTheory.g:4999:2: ( ruleInfer )
            {
            // InternalTheory.g:4999:2: ( ruleInfer )
            // InternalTheory.g:5000:3: ruleInfer
            {
             before(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInfer();

            state._fsp--;

             after(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InferenceRule__InferAssignment_2"


    // $ANTLR start "rule__Given__ExpressionAssignment_0"
    // InternalTheory.g:5009:1: rule__Given__ExpressionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Given__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5013:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5014:2: ( RULE_STRING )
            {
            // InternalTheory.g:5014:2: ( RULE_STRING )
            // InternalTheory.g:5015:3: RULE_STRING
            {
             before(grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__ExpressionAssignment_0"


    // $ANTLR start "rule__Given__RequiredAssignment_1"
    // InternalTheory.g:5024:1: rule__Given__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Given__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5028:1: ( ( ( 'required' ) ) )
            // InternalTheory.g:5029:2: ( ( 'required' ) )
            {
            // InternalTheory.g:5029:2: ( ( 'required' ) )
            // InternalTheory.g:5030:3: ( 'required' )
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalTheory.g:5031:3: ( 'required' )
            // InternalTheory.g:5032:4: 'required'
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__RequiredAssignment_1"


    // $ANTLR start "rule__Infer__ExpressionAssignment"
    // InternalTheory.g:5043:1: rule__Infer__ExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__Infer__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5047:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5048:2: ( RULE_STRING )
            {
            // InternalTheory.g:5048:2: ( RULE_STRING )
            // InternalTheory.g:5049:3: RULE_STRING
            {
             before(grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infer__ExpressionAssignment"


    // $ANTLR start "rule__UnconditionalRewrite__RhsAssignment"
    // InternalTheory.g:5058:1: rule__UnconditionalRewrite__RhsAssignment : ( RULE_STRING ) ;
    public final void rule__UnconditionalRewrite__RhsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5062:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5063:2: ( RULE_STRING )
            {
            // InternalTheory.g:5063:2: ( RULE_STRING )
            // InternalTheory.g:5064:3: RULE_STRING
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalRewrite__RhsAssignment"


    // $ANTLR start "rule__ConditionalRewrite__RewritesAssignment_0"
    // InternalTheory.g:5073:1: rule__ConditionalRewrite__RewritesAssignment_0 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5077:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:5078:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:5078:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:5079:3: ruleConditionalRewriteRule
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__RewritesAssignment_0"


    // $ANTLR start "rule__ConditionalRewrite__RewritesAssignment_1"
    // InternalTheory.g:5088:1: rule__ConditionalRewrite__RewritesAssignment_1 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5092:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:5093:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:5093:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:5094:3: ruleConditionalRewriteRule
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewrite__RewritesAssignment_1"


    // $ANTLR start "rule__ConditionalRewriteRule__LhsAssignment_0"
    // InternalTheory.g:5103:1: rule__ConditionalRewriteRule__LhsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5107:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5108:2: ( RULE_STRING )
            {
            // InternalTheory.g:5108:2: ( RULE_STRING )
            // InternalTheory.g:5109:3: RULE_STRING
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__LhsAssignment_0"


    // $ANTLR start "rule__ConditionalRewriteRule__RhsAssignment_2"
    // InternalTheory.g:5118:1: rule__ConditionalRewriteRule__RhsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5122:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5123:2: ( RULE_STRING )
            {
            // InternalTheory.g:5123:2: ( RULE_STRING )
            // InternalTheory.g:5124:3: RULE_STRING
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalRewriteRule__RhsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FD8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000201000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000201000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001010013800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001010003802L});

}
