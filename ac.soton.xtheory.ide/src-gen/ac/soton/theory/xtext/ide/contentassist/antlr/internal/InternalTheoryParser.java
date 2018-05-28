package ac.soton.theory.xtext.ide.contentassist.antlr.internal;

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
import ac.soton.theory.xtext.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'prefix'", "'infix'", "'postfix'", "'theory'", "'end'", "'('", "')'", "'imports'", "'types'", "'operators'", "'axioms'", "'rules'", "'variables'", "'='", "'|'", "','", "':'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'=='", "'|-'", "'associative'", "'commutative'", "'theorem'", "'required'"
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


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:278:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTheory.g:279:1: ( ruleVariable EOF )
            // InternalTheory.g:280:1: ruleVariable EOF
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
    // InternalTheory.g:287:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:291:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTheory.g:292:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTheory.g:292:2: ( ( rule__Variable__Group__0 ) )
            // InternalTheory.g:293:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTheory.g:294:3: ( rule__Variable__Group__0 )
            // InternalTheory.g:294:4: rule__Variable__Group__0
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
    // InternalTheory.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTheory.g:304:1: ( ruleRule EOF )
            // InternalTheory.g:305:1: ruleRule EOF
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
    // InternalTheory.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTheory.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTheory.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalTheory.g:318:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTheory.g:319:3: ( rule__Rule__Group__0 )
            // InternalTheory.g:319:4: rule__Rule__Group__0
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
    // InternalTheory.g:328:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:329:1: ( ruleRewriteRule EOF )
            // InternalTheory.g:330:1: ruleRewriteRule EOF
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
    // InternalTheory.g:337:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:341:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // InternalTheory.g:342:2: ( ( rule__RewriteRule__Group__0 ) )
            {
            // InternalTheory.g:342:2: ( ( rule__RewriteRule__Group__0 ) )
            // InternalTheory.g:343:3: ( rule__RewriteRule__Group__0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:344:3: ( rule__RewriteRule__Group__0 )
            // InternalTheory.g:344:4: rule__RewriteRule__Group__0
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
    // InternalTheory.g:353:1: entryRuleInferenceRule : ruleInferenceRule EOF ;
    public final void entryRuleInferenceRule() throws RecognitionException {
        try {
            // InternalTheory.g:354:1: ( ruleInferenceRule EOF )
            // InternalTheory.g:355:1: ruleInferenceRule EOF
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
    // InternalTheory.g:362:1: ruleInferenceRule : ( ( rule__InferenceRule__Group__0 ) ) ;
    public final void ruleInferenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:366:2: ( ( ( rule__InferenceRule__Group__0 ) ) )
            // InternalTheory.g:367:2: ( ( rule__InferenceRule__Group__0 ) )
            {
            // InternalTheory.g:367:2: ( ( rule__InferenceRule__Group__0 ) )
            // InternalTheory.g:368:3: ( rule__InferenceRule__Group__0 )
            {
             before(grammarAccess.getInferenceRuleAccess().getGroup()); 
            // InternalTheory.g:369:3: ( rule__InferenceRule__Group__0 )
            // InternalTheory.g:369:4: rule__InferenceRule__Group__0
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
    // InternalTheory.g:378:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalTheory.g:379:1: ( ruleGiven EOF )
            // InternalTheory.g:380:1: ruleGiven EOF
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
    // InternalTheory.g:387:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:391:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalTheory.g:392:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalTheory.g:392:2: ( ( rule__Given__Group__0 ) )
            // InternalTheory.g:393:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalTheory.g:394:3: ( rule__Given__Group__0 )
            // InternalTheory.g:394:4: rule__Given__Group__0
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
    // InternalTheory.g:403:1: entryRuleInfer : ruleInfer EOF ;
    public final void entryRuleInfer() throws RecognitionException {
        try {
            // InternalTheory.g:404:1: ( ruleInfer EOF )
            // InternalTheory.g:405:1: ruleInfer EOF
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
    // InternalTheory.g:412:1: ruleInfer : ( ( rule__Infer__PredicateAssignment ) ) ;
    public final void ruleInfer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:416:2: ( ( ( rule__Infer__PredicateAssignment ) ) )
            // InternalTheory.g:417:2: ( ( rule__Infer__PredicateAssignment ) )
            {
            // InternalTheory.g:417:2: ( ( rule__Infer__PredicateAssignment ) )
            // InternalTheory.g:418:3: ( rule__Infer__PredicateAssignment )
            {
             before(grammarAccess.getInferAccess().getPredicateAssignment()); 
            // InternalTheory.g:419:3: ( rule__Infer__PredicateAssignment )
            // InternalTheory.g:419:4: rule__Infer__PredicateAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Infer__PredicateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInferAccess().getPredicateAssignment()); 

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
    // InternalTheory.g:428:1: entryRuleUnconditionalRewrite : ruleUnconditionalRewrite EOF ;
    public final void entryRuleUnconditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:429:1: ( ruleUnconditionalRewrite EOF )
            // InternalTheory.g:430:1: ruleUnconditionalRewrite EOF
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
    // InternalTheory.g:437:1: ruleUnconditionalRewrite : ( ( rule__UnconditionalRewrite__RhsAssignment ) ) ;
    public final void ruleUnconditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:441:2: ( ( ( rule__UnconditionalRewrite__RhsAssignment ) ) )
            // InternalTheory.g:442:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            {
            // InternalTheory.g:442:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            // InternalTheory.g:443:3: ( rule__UnconditionalRewrite__RhsAssignment )
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 
            // InternalTheory.g:444:3: ( rule__UnconditionalRewrite__RhsAssignment )
            // InternalTheory.g:444:4: rule__UnconditionalRewrite__RhsAssignment
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
    // InternalTheory.g:453:1: entryRuleConditionalRewrite : ruleConditionalRewrite EOF ;
    public final void entryRuleConditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:454:1: ( ruleConditionalRewrite EOF )
            // InternalTheory.g:455:1: ruleConditionalRewrite EOF
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
    // InternalTheory.g:462:1: ruleConditionalRewrite : ( ( rule__ConditionalRewrite__Group__0 ) ) ;
    public final void ruleConditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:466:2: ( ( ( rule__ConditionalRewrite__Group__0 ) ) )
            // InternalTheory.g:467:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            {
            // InternalTheory.g:467:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            // InternalTheory.g:468:3: ( rule__ConditionalRewrite__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getGroup()); 
            // InternalTheory.g:469:3: ( rule__ConditionalRewrite__Group__0 )
            // InternalTheory.g:469:4: rule__ConditionalRewrite__Group__0
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
    // InternalTheory.g:478:1: entryRuleConditionalRewriteRule : ruleConditionalRewriteRule EOF ;
    public final void entryRuleConditionalRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:479:1: ( ruleConditionalRewriteRule EOF )
            // InternalTheory.g:480:1: ruleConditionalRewriteRule EOF
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
    // InternalTheory.g:487:1: ruleConditionalRewriteRule : ( ( rule__ConditionalRewriteRule__Group__0 ) ) ;
    public final void ruleConditionalRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:491:2: ( ( ( rule__ConditionalRewriteRule__Group__0 ) ) )
            // InternalTheory.g:492:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            {
            // InternalTheory.g:492:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            // InternalTheory.g:493:3: ( rule__ConditionalRewriteRule__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:494:3: ( rule__ConditionalRewriteRule__Group__0 )
            // InternalTheory.g:494:4: rule__ConditionalRewriteRule__Group__0
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
    // InternalTheory.g:503:1: ruleNotation : ( ( rule__Notation__Alternatives ) ) ;
    public final void ruleNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:507:1: ( ( ( rule__Notation__Alternatives ) ) )
            // InternalTheory.g:508:2: ( ( rule__Notation__Alternatives ) )
            {
            // InternalTheory.g:508:2: ( ( rule__Notation__Alternatives ) )
            // InternalTheory.g:509:3: ( rule__Notation__Alternatives )
            {
             before(grammarAccess.getNotationAccess().getAlternatives()); 
            // InternalTheory.g:510:3: ( rule__Notation__Alternatives )
            // InternalTheory.g:510:4: rule__Notation__Alternatives
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
    // InternalTheory.g:518:1: rule__Theory__Alternatives_4 : ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) );
    public final void rule__Theory__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:522:1: ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTheory.g:523:2: ( ( rule__Theory__Group_4_0__0 ) )
                    {
                    // InternalTheory.g:523:2: ( ( rule__Theory__Group_4_0__0 ) )
                    // InternalTheory.g:524:3: ( rule__Theory__Group_4_0__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_0()); 
                    // InternalTheory.g:525:3: ( rule__Theory__Group_4_0__0 )
                    // InternalTheory.g:525:4: rule__Theory__Group_4_0__0
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
                    // InternalTheory.g:529:2: ( ( rule__Theory__Group_4_1__0 ) )
                    {
                    // InternalTheory.g:529:2: ( ( rule__Theory__Group_4_1__0 ) )
                    // InternalTheory.g:530:3: ( rule__Theory__Group_4_1__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_1()); 
                    // InternalTheory.g:531:3: ( rule__Theory__Group_4_1__0 )
                    // InternalTheory.g:531:4: rule__Theory__Group_4_1__0
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
                    // InternalTheory.g:535:2: ( ( rule__Theory__Group_4_2__0 ) )
                    {
                    // InternalTheory.g:535:2: ( ( rule__Theory__Group_4_2__0 ) )
                    // InternalTheory.g:536:3: ( rule__Theory__Group_4_2__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_2()); 
                    // InternalTheory.g:537:3: ( rule__Theory__Group_4_2__0 )
                    // InternalTheory.g:537:4: rule__Theory__Group_4_2__0
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
                    // InternalTheory.g:541:2: ( ( rule__Theory__Group_4_3__0 ) )
                    {
                    // InternalTheory.g:541:2: ( ( rule__Theory__Group_4_3__0 ) )
                    // InternalTheory.g:542:3: ( rule__Theory__Group_4_3__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_3()); 
                    // InternalTheory.g:543:3: ( rule__Theory__Group_4_3__0 )
                    // InternalTheory.g:543:4: rule__Theory__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_3()); 

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


    // $ANTLR start "rule__Type__CommentsAlternatives_0_0"
    // InternalTheory.g:551:1: rule__Type__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Type__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:555:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:556:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:556:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:557:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getTypeAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:562:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:562:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:563:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getTypeAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Type__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Constructor__CommentsAlternatives_0_0"
    // InternalTheory.g:572:1: rule__Constructor__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Constructor__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:576:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:577:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:577:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:578:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getConstructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getConstructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:583:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:583:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:584:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getConstructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getConstructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Constructor__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Destructor__CommentsAlternatives_0_0"
    // InternalTheory.g:593:1: rule__Destructor__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Destructor__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:597:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:598:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:598:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:599:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getDestructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDestructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:604:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:604:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:605:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getDestructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDestructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Destructor__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Operator__CommentsAlternatives_0_0"
    // InternalTheory.g:614:1: rule__Operator__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Operator__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:618:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:619:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:619:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:620:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getOperatorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:625:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:625:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:626:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getOperatorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Operator__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Operator__Alternatives_6_1"
    // InternalTheory.g:635:1: rule__Operator__Alternatives_6_1 : ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) );
    public final void rule__Operator__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:639:1: ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTheory.g:640:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    {
                    // InternalTheory.g:640:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    // InternalTheory.g:641:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    {
                     before(grammarAccess.getOperatorAccess().getDefinitionAssignment_6_1_0()); 
                    // InternalTheory.g:642:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    // InternalTheory.g:642:4: rule__Operator__DefinitionAssignment_6_1_0
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
                    // InternalTheory.g:646:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    {
                    // InternalTheory.g:646:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    // InternalTheory.g:647:3: ( rule__Operator__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_6_1_1()); 
                    // InternalTheory.g:648:3: ( rule__Operator__Group_6_1_1__0 )
                    // InternalTheory.g:648:4: rule__Operator__Group_6_1_1__0
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


    // $ANTLR start "rule__Argument__CommentsAlternatives_0_0"
    // InternalTheory.g:656:1: rule__Argument__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Argument__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:660:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:661:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:661:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:662:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getArgumentAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:667:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:667:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:668:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getArgumentAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Argument__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Axiom__CommentsAlternatives_0_0"
    // InternalTheory.g:677:1: rule__Axiom__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Axiom__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:681:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:682:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:682:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:683:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getAxiomAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAxiomAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:688:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:688:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:689:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getAxiomAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAxiomAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Axiom__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Variable__CommentsAlternatives_0_0"
    // InternalTheory.g:698:1: rule__Variable__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Variable__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:702:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:703:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:703:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:704:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getVariableAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:709:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:709:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:710:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getVariableAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Variable__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Rule__CommentsAlternatives_0_0"
    // InternalTheory.g:719:1: rule__Rule__CommentsAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Rule__CommentsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:723:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:724:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:724:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:725:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getRuleAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:730:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:730:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:731:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getRuleAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Rule__CommentsAlternatives_0_0"


    // $ANTLR start "rule__Rule__Alternatives_4"
    // InternalTheory.g:740:1: rule__Rule__Alternatives_4 : ( ( ( rule__Rule__RuleAssignment_4_0 ) ) | ( ( rule__Rule__RuleAssignment_4_1 ) ) );
    public final void rule__Rule__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:744:1: ( ( ( rule__Rule__RuleAssignment_4_0 ) ) | ( ( rule__Rule__RuleAssignment_4_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING||LA11_1==34||LA11_1==38) ) {
                    alt11=2;
                }
                else if ( (LA11_1==33) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTheory.g:745:2: ( ( rule__Rule__RuleAssignment_4_0 ) )
                    {
                    // InternalTheory.g:745:2: ( ( rule__Rule__RuleAssignment_4_0 ) )
                    // InternalTheory.g:746:3: ( rule__Rule__RuleAssignment_4_0 )
                    {
                     before(grammarAccess.getRuleAccess().getRuleAssignment_4_0()); 
                    // InternalTheory.g:747:3: ( rule__Rule__RuleAssignment_4_0 )
                    // InternalTheory.g:747:4: rule__Rule__RuleAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__RuleAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getRuleAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:751:2: ( ( rule__Rule__RuleAssignment_4_1 ) )
                    {
                    // InternalTheory.g:751:2: ( ( rule__Rule__RuleAssignment_4_1 ) )
                    // InternalTheory.g:752:3: ( rule__Rule__RuleAssignment_4_1 )
                    {
                     before(grammarAccess.getRuleAccess().getRuleAssignment_4_1()); 
                    // InternalTheory.g:753:3: ( rule__Rule__RuleAssignment_4_1 )
                    // InternalTheory.g:753:4: rule__Rule__RuleAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__RuleAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getRuleAssignment_4_1()); 

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
    // InternalTheory.g:761:1: rule__RewriteRule__Alternatives_2 : ( ( ( rule__RewriteRule__RuleAssignment_2_0 ) ) | ( ( rule__RewriteRule__RuleAssignment_2_1 ) ) );
    public final void rule__RewriteRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:765:1: ( ( ( rule__RewriteRule__RuleAssignment_2_0 ) ) | ( ( rule__RewriteRule__RuleAssignment_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==31) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||(LA12_1>=RULE_ML_COMMENT && LA12_1<=RULE_SL_COMMENT)||LA12_1==15||(LA12_1>=19 && LA12_1<=22)||LA12_1==32) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTheory.g:766:2: ( ( rule__RewriteRule__RuleAssignment_2_0 ) )
                    {
                    // InternalTheory.g:766:2: ( ( rule__RewriteRule__RuleAssignment_2_0 ) )
                    // InternalTheory.g:767:3: ( rule__RewriteRule__RuleAssignment_2_0 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getRuleAssignment_2_0()); 
                    // InternalTheory.g:768:3: ( rule__RewriteRule__RuleAssignment_2_0 )
                    // InternalTheory.g:768:4: rule__RewriteRule__RuleAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__RuleAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getRuleAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:772:2: ( ( rule__RewriteRule__RuleAssignment_2_1 ) )
                    {
                    // InternalTheory.g:772:2: ( ( rule__RewriteRule__RuleAssignment_2_1 ) )
                    // InternalTheory.g:773:3: ( rule__RewriteRule__RuleAssignment_2_1 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getRuleAssignment_2_1()); 
                    // InternalTheory.g:774:3: ( rule__RewriteRule__RuleAssignment_2_1 )
                    // InternalTheory.g:774:4: rule__RewriteRule__RuleAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__RuleAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getRuleAssignment_2_1()); 

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
    // InternalTheory.g:782:1: rule__Notation__Alternatives : ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) );
    public final void rule__Notation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:786:1: ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 13:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTheory.g:787:2: ( ( 'prefix' ) )
                    {
                    // InternalTheory.g:787:2: ( ( 'prefix' ) )
                    // InternalTheory.g:788:3: ( 'prefix' )
                    {
                     before(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 
                    // InternalTheory.g:789:3: ( 'prefix' )
                    // InternalTheory.g:789:4: 'prefix'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:793:2: ( ( 'infix' ) )
                    {
                    // InternalTheory.g:793:2: ( ( 'infix' ) )
                    // InternalTheory.g:794:3: ( 'infix' )
                    {
                     before(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 
                    // InternalTheory.g:795:3: ( 'infix' )
                    // InternalTheory.g:795:4: 'infix'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:799:2: ( ( 'postfix' ) )
                    {
                    // InternalTheory.g:799:2: ( ( 'postfix' ) )
                    // InternalTheory.g:800:3: ( 'postfix' )
                    {
                     before(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 
                    // InternalTheory.g:801:3: ( 'postfix' )
                    // InternalTheory.g:801:4: 'postfix'
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
    // InternalTheory.g:809:1: rule__Theory__Group__0 : rule__Theory__Group__0__Impl rule__Theory__Group__1 ;
    public final void rule__Theory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:813:1: ( rule__Theory__Group__0__Impl rule__Theory__Group__1 )
            // InternalTheory.g:814:2: rule__Theory__Group__0__Impl rule__Theory__Group__1
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
    // InternalTheory.g:821:1: rule__Theory__Group__0__Impl : ( 'theory' ) ;
    public final void rule__Theory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:825:1: ( ( 'theory' ) )
            // InternalTheory.g:826:1: ( 'theory' )
            {
            // InternalTheory.g:826:1: ( 'theory' )
            // InternalTheory.g:827:2: 'theory'
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
    // InternalTheory.g:836:1: rule__Theory__Group__1 : rule__Theory__Group__1__Impl rule__Theory__Group__2 ;
    public final void rule__Theory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:840:1: ( rule__Theory__Group__1__Impl rule__Theory__Group__2 )
            // InternalTheory.g:841:2: rule__Theory__Group__1__Impl rule__Theory__Group__2
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
    // InternalTheory.g:848:1: rule__Theory__Group__1__Impl : ( ( rule__Theory__NameAssignment_1 ) ) ;
    public final void rule__Theory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:852:1: ( ( ( rule__Theory__NameAssignment_1 ) ) )
            // InternalTheory.g:853:1: ( ( rule__Theory__NameAssignment_1 ) )
            {
            // InternalTheory.g:853:1: ( ( rule__Theory__NameAssignment_1 ) )
            // InternalTheory.g:854:2: ( rule__Theory__NameAssignment_1 )
            {
             before(grammarAccess.getTheoryAccess().getNameAssignment_1()); 
            // InternalTheory.g:855:2: ( rule__Theory__NameAssignment_1 )
            // InternalTheory.g:855:3: rule__Theory__NameAssignment_1
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
    // InternalTheory.g:863:1: rule__Theory__Group__2 : rule__Theory__Group__2__Impl rule__Theory__Group__3 ;
    public final void rule__Theory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:867:1: ( rule__Theory__Group__2__Impl rule__Theory__Group__3 )
            // InternalTheory.g:868:2: rule__Theory__Group__2__Impl rule__Theory__Group__3
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
    // InternalTheory.g:875:1: rule__Theory__Group__2__Impl : ( ( rule__Theory__Group_2__0 )? ) ;
    public final void rule__Theory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:879:1: ( ( ( rule__Theory__Group_2__0 )? ) )
            // InternalTheory.g:880:1: ( ( rule__Theory__Group_2__0 )? )
            {
            // InternalTheory.g:880:1: ( ( rule__Theory__Group_2__0 )? )
            // InternalTheory.g:881:2: ( rule__Theory__Group_2__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_2()); 
            // InternalTheory.g:882:2: ( rule__Theory__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTheory.g:882:3: rule__Theory__Group_2__0
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
    // InternalTheory.g:890:1: rule__Theory__Group__3 : rule__Theory__Group__3__Impl rule__Theory__Group__4 ;
    public final void rule__Theory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:894:1: ( rule__Theory__Group__3__Impl rule__Theory__Group__4 )
            // InternalTheory.g:895:2: rule__Theory__Group__3__Impl rule__Theory__Group__4
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
    // InternalTheory.g:902:1: rule__Theory__Group__3__Impl : ( ( rule__Theory__Group_3__0 )? ) ;
    public final void rule__Theory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:906:1: ( ( ( rule__Theory__Group_3__0 )? ) )
            // InternalTheory.g:907:1: ( ( rule__Theory__Group_3__0 )? )
            {
            // InternalTheory.g:907:1: ( ( rule__Theory__Group_3__0 )? )
            // InternalTheory.g:908:2: ( rule__Theory__Group_3__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_3()); 
            // InternalTheory.g:909:2: ( rule__Theory__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTheory.g:909:3: rule__Theory__Group_3__0
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
    // InternalTheory.g:917:1: rule__Theory__Group__4 : rule__Theory__Group__4__Impl rule__Theory__Group__5 ;
    public final void rule__Theory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:921:1: ( rule__Theory__Group__4__Impl rule__Theory__Group__5 )
            // InternalTheory.g:922:2: rule__Theory__Group__4__Impl rule__Theory__Group__5
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
    // InternalTheory.g:929:1: rule__Theory__Group__4__Impl : ( ( rule__Theory__Alternatives_4 )* ) ;
    public final void rule__Theory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:933:1: ( ( ( rule__Theory__Alternatives_4 )* ) )
            // InternalTheory.g:934:1: ( ( rule__Theory__Alternatives_4 )* )
            {
            // InternalTheory.g:934:1: ( ( rule__Theory__Alternatives_4 )* )
            // InternalTheory.g:935:2: ( rule__Theory__Alternatives_4 )*
            {
             before(grammarAccess.getTheoryAccess().getAlternatives_4()); 
            // InternalTheory.g:936:2: ( rule__Theory__Alternatives_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=19 && LA16_0<=22)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTheory.g:936:3: rule__Theory__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Theory__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTheory.g:944:1: rule__Theory__Group__5 : rule__Theory__Group__5__Impl ;
    public final void rule__Theory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:948:1: ( rule__Theory__Group__5__Impl )
            // InternalTheory.g:949:2: rule__Theory__Group__5__Impl
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
    // InternalTheory.g:955:1: rule__Theory__Group__5__Impl : ( 'end' ) ;
    public final void rule__Theory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:959:1: ( ( 'end' ) )
            // InternalTheory.g:960:1: ( 'end' )
            {
            // InternalTheory.g:960:1: ( 'end' )
            // InternalTheory.g:961:2: 'end'
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
    // InternalTheory.g:971:1: rule__Theory__Group_2__0 : rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 ;
    public final void rule__Theory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:975:1: ( rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 )
            // InternalTheory.g:976:2: rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1
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
    // InternalTheory.g:983:1: rule__Theory__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Theory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:987:1: ( ( '(' ) )
            // InternalTheory.g:988:1: ( '(' )
            {
            // InternalTheory.g:988:1: ( '(' )
            // InternalTheory.g:989:2: '('
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
    // InternalTheory.g:998:1: rule__Theory__Group_2__1 : rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 ;
    public final void rule__Theory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1002:1: ( rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 )
            // InternalTheory.g:1003:2: rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2
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
    // InternalTheory.g:1010:1: rule__Theory__Group_2__1__Impl : ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Theory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1014:1: ( ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1015:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1015:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1016:2: ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1016:2: ( ( rule__Theory__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1017:3: ( rule__Theory__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1018:3: ( rule__Theory__ParametersAssignment_2_1 )
            // InternalTheory.g:1018:4: rule__Theory__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Theory__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1021:2: ( ( rule__Theory__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1022:3: ( rule__Theory__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1023:3: ( rule__Theory__ParametersAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTheory.g:1023:4: rule__Theory__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTheory.g:1032:1: rule__Theory__Group_2__2 : rule__Theory__Group_2__2__Impl ;
    public final void rule__Theory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1036:1: ( rule__Theory__Group_2__2__Impl )
            // InternalTheory.g:1037:2: rule__Theory__Group_2__2__Impl
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
    // InternalTheory.g:1043:1: rule__Theory__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Theory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1047:1: ( ( ')' ) )
            // InternalTheory.g:1048:1: ( ')' )
            {
            // InternalTheory.g:1048:1: ( ')' )
            // InternalTheory.g:1049:2: ')'
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
    // InternalTheory.g:1059:1: rule__Theory__Group_3__0 : rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 ;
    public final void rule__Theory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1063:1: ( rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 )
            // InternalTheory.g:1064:2: rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1
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
    // InternalTheory.g:1071:1: rule__Theory__Group_3__0__Impl : ( 'imports' ) ;
    public final void rule__Theory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1075:1: ( ( 'imports' ) )
            // InternalTheory.g:1076:1: ( 'imports' )
            {
            // InternalTheory.g:1076:1: ( 'imports' )
            // InternalTheory.g:1077:2: 'imports'
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
    // InternalTheory.g:1086:1: rule__Theory__Group_3__1 : rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 ;
    public final void rule__Theory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1090:1: ( rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 )
            // InternalTheory.g:1091:2: rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2
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
    // InternalTheory.g:1098:1: rule__Theory__Group_3__1__Impl : ( ( rule__Theory__ImportsAssignment_3_1 ) ) ;
    public final void rule__Theory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1102:1: ( ( ( rule__Theory__ImportsAssignment_3_1 ) ) )
            // InternalTheory.g:1103:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            {
            // InternalTheory.g:1103:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            // InternalTheory.g:1104:2: ( rule__Theory__ImportsAssignment_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 
            // InternalTheory.g:1105:2: ( rule__Theory__ImportsAssignment_3_1 )
            // InternalTheory.g:1105:3: rule__Theory__ImportsAssignment_3_1
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
    // InternalTheory.g:1113:1: rule__Theory__Group_3__2 : rule__Theory__Group_3__2__Impl ;
    public final void rule__Theory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1117:1: ( rule__Theory__Group_3__2__Impl )
            // InternalTheory.g:1118:2: rule__Theory__Group_3__2__Impl
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
    // InternalTheory.g:1124:1: rule__Theory__Group_3__2__Impl : ( ( rule__Theory__ImportsAssignment_3_2 )* ) ;
    public final void rule__Theory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1128:1: ( ( ( rule__Theory__ImportsAssignment_3_2 )* ) )
            // InternalTheory.g:1129:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            {
            // InternalTheory.g:1129:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            // InternalTheory.g:1130:2: ( rule__Theory__ImportsAssignment_3_2 )*
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 
            // InternalTheory.g:1131:2: ( rule__Theory__ImportsAssignment_3_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTheory.g:1131:3: rule__Theory__ImportsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ImportsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTheory.g:1140:1: rule__Theory__Group_4_0__0 : rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 ;
    public final void rule__Theory__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1144:1: ( rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 )
            // InternalTheory.g:1145:2: rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1
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
    // InternalTheory.g:1152:1: rule__Theory__Group_4_0__0__Impl : ( 'types' ) ;
    public final void rule__Theory__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1156:1: ( ( 'types' ) )
            // InternalTheory.g:1157:1: ( 'types' )
            {
            // InternalTheory.g:1157:1: ( 'types' )
            // InternalTheory.g:1158:2: 'types'
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
    // InternalTheory.g:1167:1: rule__Theory__Group_4_0__1 : rule__Theory__Group_4_0__1__Impl ;
    public final void rule__Theory__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1171:1: ( rule__Theory__Group_4_0__1__Impl )
            // InternalTheory.g:1172:2: rule__Theory__Group_4_0__1__Impl
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
    // InternalTheory.g:1178:1: rule__Theory__Group_4_0__1__Impl : ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) ) ;
    public final void rule__Theory__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1182:1: ( ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) ) )
            // InternalTheory.g:1183:1: ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) )
            {
            // InternalTheory.g:1183:1: ( ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* ) )
            // InternalTheory.g:1184:2: ( ( rule__Theory__TypesAssignment_4_0_1 ) ) ( ( rule__Theory__TypesAssignment_4_0_1 )* )
            {
            // InternalTheory.g:1184:2: ( ( rule__Theory__TypesAssignment_4_0_1 ) )
            // InternalTheory.g:1185:3: ( rule__Theory__TypesAssignment_4_0_1 )
            {
             before(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 
            // InternalTheory.g:1186:3: ( rule__Theory__TypesAssignment_4_0_1 )
            // InternalTheory.g:1186:4: rule__Theory__TypesAssignment_4_0_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__TypesAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 

            }

            // InternalTheory.g:1189:2: ( ( rule__Theory__TypesAssignment_4_0_1 )* )
            // InternalTheory.g:1190:3: ( rule__Theory__TypesAssignment_4_0_1 )*
            {
             before(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1()); 
            // InternalTheory.g:1191:3: ( rule__Theory__TypesAssignment_4_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ML_COMMENT && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTheory.g:1191:4: rule__Theory__TypesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__TypesAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTheory.g:1201:1: rule__Theory__Group_4_1__0 : rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 ;
    public final void rule__Theory__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1205:1: ( rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 )
            // InternalTheory.g:1206:2: rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1
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
    // InternalTheory.g:1213:1: rule__Theory__Group_4_1__0__Impl : ( 'operators' ) ;
    public final void rule__Theory__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1217:1: ( ( 'operators' ) )
            // InternalTheory.g:1218:1: ( 'operators' )
            {
            // InternalTheory.g:1218:1: ( 'operators' )
            // InternalTheory.g:1219:2: 'operators'
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
    // InternalTheory.g:1228:1: rule__Theory__Group_4_1__1 : rule__Theory__Group_4_1__1__Impl ;
    public final void rule__Theory__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1232:1: ( rule__Theory__Group_4_1__1__Impl )
            // InternalTheory.g:1233:2: rule__Theory__Group_4_1__1__Impl
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
    // InternalTheory.g:1239:1: rule__Theory__Group_4_1__1__Impl : ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) ) ;
    public final void rule__Theory__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1243:1: ( ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) ) )
            // InternalTheory.g:1244:1: ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) )
            {
            // InternalTheory.g:1244:1: ( ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* ) )
            // InternalTheory.g:1245:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 ) ) ( ( rule__Theory__OperatorsAssignment_4_1_1 )* )
            {
            // InternalTheory.g:1245:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 ) )
            // InternalTheory.g:1246:3: ( rule__Theory__OperatorsAssignment_4_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 
            // InternalTheory.g:1247:3: ( rule__Theory__OperatorsAssignment_4_1_1 )
            // InternalTheory.g:1247:4: rule__Theory__OperatorsAssignment_4_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__OperatorsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 

            }

            // InternalTheory.g:1250:2: ( ( rule__Theory__OperatorsAssignment_4_1_1 )* )
            // InternalTheory.g:1251:3: ( rule__Theory__OperatorsAssignment_4_1_1 )*
            {
             before(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1()); 
            // InternalTheory.g:1252:3: ( rule__Theory__OperatorsAssignment_4_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ML_COMMENT && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTheory.g:1252:4: rule__Theory__OperatorsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__OperatorsAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTheory.g:1262:1: rule__Theory__Group_4_2__0 : rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 ;
    public final void rule__Theory__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1266:1: ( rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 )
            // InternalTheory.g:1267:2: rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1
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
    // InternalTheory.g:1274:1: rule__Theory__Group_4_2__0__Impl : ( 'axioms' ) ;
    public final void rule__Theory__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1278:1: ( ( 'axioms' ) )
            // InternalTheory.g:1279:1: ( 'axioms' )
            {
            // InternalTheory.g:1279:1: ( 'axioms' )
            // InternalTheory.g:1280:2: 'axioms'
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
    // InternalTheory.g:1289:1: rule__Theory__Group_4_2__1 : rule__Theory__Group_4_2__1__Impl ;
    public final void rule__Theory__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1293:1: ( rule__Theory__Group_4_2__1__Impl )
            // InternalTheory.g:1294:2: rule__Theory__Group_4_2__1__Impl
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
    // InternalTheory.g:1300:1: rule__Theory__Group_4_2__1__Impl : ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) ) ;
    public final void rule__Theory__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1304:1: ( ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) ) )
            // InternalTheory.g:1305:1: ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) )
            {
            // InternalTheory.g:1305:1: ( ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* ) )
            // InternalTheory.g:1306:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 ) ) ( ( rule__Theory__AxiomsAssignment_4_2_1 )* )
            {
            // InternalTheory.g:1306:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 ) )
            // InternalTheory.g:1307:3: ( rule__Theory__AxiomsAssignment_4_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 
            // InternalTheory.g:1308:3: ( rule__Theory__AxiomsAssignment_4_2_1 )
            // InternalTheory.g:1308:4: rule__Theory__AxiomsAssignment_4_2_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__AxiomsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 

            }

            // InternalTheory.g:1311:2: ( ( rule__Theory__AxiomsAssignment_4_2_1 )* )
            // InternalTheory.g:1312:3: ( rule__Theory__AxiomsAssignment_4_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1()); 
            // InternalTheory.g:1313:3: ( rule__Theory__AxiomsAssignment_4_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_SL_COMMENT)||LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTheory.g:1313:4: rule__Theory__AxiomsAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__AxiomsAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTheory.g:1323:1: rule__Theory__Group_4_3__0 : rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 ;
    public final void rule__Theory__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1327:1: ( rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 )
            // InternalTheory.g:1328:2: rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTheory.g:1335:1: rule__Theory__Group_4_3__0__Impl : ( 'rules' ) ;
    public final void rule__Theory__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1339:1: ( ( 'rules' ) )
            // InternalTheory.g:1340:1: ( 'rules' )
            {
            // InternalTheory.g:1340:1: ( 'rules' )
            // InternalTheory.g:1341:2: 'rules'
            {
             before(grammarAccess.getTheoryAccess().getRulesKeyword_4_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRulesKeyword_4_3_0()); 

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
    // InternalTheory.g:1350:1: rule__Theory__Group_4_3__1 : rule__Theory__Group_4_3__1__Impl rule__Theory__Group_4_3__2 ;
    public final void rule__Theory__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1354:1: ( rule__Theory__Group_4_3__1__Impl rule__Theory__Group_4_3__2 )
            // InternalTheory.g:1355:2: rule__Theory__Group_4_3__1__Impl rule__Theory__Group_4_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Theory__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__2();

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
    // InternalTheory.g:1362:1: rule__Theory__Group_4_3__1__Impl : ( ( rule__Theory__Group_4_3_1__0 )? ) ;
    public final void rule__Theory__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1366:1: ( ( ( rule__Theory__Group_4_3_1__0 )? ) )
            // InternalTheory.g:1367:1: ( ( rule__Theory__Group_4_3_1__0 )? )
            {
            // InternalTheory.g:1367:1: ( ( rule__Theory__Group_4_3_1__0 )? )
            // InternalTheory.g:1368:2: ( rule__Theory__Group_4_3_1__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_4_3_1()); 
            // InternalTheory.g:1369:2: ( rule__Theory__Group_4_3_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTheory.g:1369:3: rule__Theory__Group_4_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_4_3_1()); 

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


    // $ANTLR start "rule__Theory__Group_4_3__2"
    // InternalTheory.g:1377:1: rule__Theory__Group_4_3__2 : rule__Theory__Group_4_3__2__Impl ;
    public final void rule__Theory__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1381:1: ( rule__Theory__Group_4_3__2__Impl )
            // InternalTheory.g:1382:2: rule__Theory__Group_4_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__2__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_3__2"


    // $ANTLR start "rule__Theory__Group_4_3__2__Impl"
    // InternalTheory.g:1388:1: rule__Theory__Group_4_3__2__Impl : ( ( ( rule__Theory__RulesAssignment_4_3_2 ) ) ( ( rule__Theory__RulesAssignment_4_3_2 )* ) ) ;
    public final void rule__Theory__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1392:1: ( ( ( ( rule__Theory__RulesAssignment_4_3_2 ) ) ( ( rule__Theory__RulesAssignment_4_3_2 )* ) ) )
            // InternalTheory.g:1393:1: ( ( ( rule__Theory__RulesAssignment_4_3_2 ) ) ( ( rule__Theory__RulesAssignment_4_3_2 )* ) )
            {
            // InternalTheory.g:1393:1: ( ( ( rule__Theory__RulesAssignment_4_3_2 ) ) ( ( rule__Theory__RulesAssignment_4_3_2 )* ) )
            // InternalTheory.g:1394:2: ( ( rule__Theory__RulesAssignment_4_3_2 ) ) ( ( rule__Theory__RulesAssignment_4_3_2 )* )
            {
            // InternalTheory.g:1394:2: ( ( rule__Theory__RulesAssignment_4_3_2 ) )
            // InternalTheory.g:1395:3: ( rule__Theory__RulesAssignment_4_3_2 )
            {
             before(grammarAccess.getTheoryAccess().getRulesAssignment_4_3_2()); 
            // InternalTheory.g:1396:3: ( rule__Theory__RulesAssignment_4_3_2 )
            // InternalTheory.g:1396:4: rule__Theory__RulesAssignment_4_3_2
            {
            pushFollow(FOLLOW_13);
            rule__Theory__RulesAssignment_4_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getRulesAssignment_4_3_2()); 

            }

            // InternalTheory.g:1399:2: ( ( rule__Theory__RulesAssignment_4_3_2 )* )
            // InternalTheory.g:1400:3: ( rule__Theory__RulesAssignment_4_3_2 )*
            {
             before(grammarAccess.getTheoryAccess().getRulesAssignment_4_3_2()); 
            // InternalTheory.g:1401:3: ( rule__Theory__RulesAssignment_4_3_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)||LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTheory.g:1401:4: rule__Theory__RulesAssignment_4_3_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Theory__RulesAssignment_4_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getRulesAssignment_4_3_2()); 

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
    // $ANTLR end "rule__Theory__Group_4_3__2__Impl"


    // $ANTLR start "rule__Theory__Group_4_3_1__0"
    // InternalTheory.g:1411:1: rule__Theory__Group_4_3_1__0 : rule__Theory__Group_4_3_1__0__Impl rule__Theory__Group_4_3_1__1 ;
    public final void rule__Theory__Group_4_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1415:1: ( rule__Theory__Group_4_3_1__0__Impl rule__Theory__Group_4_3_1__1 )
            // InternalTheory.g:1416:2: rule__Theory__Group_4_3_1__0__Impl rule__Theory__Group_4_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3_1__1();

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
    // $ANTLR end "rule__Theory__Group_4_3_1__0"


    // $ANTLR start "rule__Theory__Group_4_3_1__0__Impl"
    // InternalTheory.g:1423:1: rule__Theory__Group_4_3_1__0__Impl : ( 'variables' ) ;
    public final void rule__Theory__Group_4_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1427:1: ( ( 'variables' ) )
            // InternalTheory.g:1428:1: ( 'variables' )
            {
            // InternalTheory.g:1428:1: ( 'variables' )
            // InternalTheory.g:1429:2: 'variables'
            {
             before(grammarAccess.getTheoryAccess().getVariablesKeyword_4_3_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getVariablesKeyword_4_3_1_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_3_1__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_3_1__1"
    // InternalTheory.g:1438:1: rule__Theory__Group_4_3_1__1 : rule__Theory__Group_4_3_1__1__Impl ;
    public final void rule__Theory__Group_4_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1442:1: ( rule__Theory__Group_4_3_1__1__Impl )
            // InternalTheory.g:1443:2: rule__Theory__Group_4_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3_1__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_3_1__1"


    // $ANTLR start "rule__Theory__Group_4_3_1__1__Impl"
    // InternalTheory.g:1449:1: rule__Theory__Group_4_3_1__1__Impl : ( ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* ) ) ;
    public final void rule__Theory__Group_4_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1453:1: ( ( ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* ) ) )
            // InternalTheory.g:1454:1: ( ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* ) )
            {
            // InternalTheory.g:1454:1: ( ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* ) )
            // InternalTheory.g:1455:2: ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) ) ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* )
            {
            // InternalTheory.g:1455:2: ( ( rule__Theory__VariablesAssignment_4_3_1_1 ) )
            // InternalTheory.g:1456:3: ( rule__Theory__VariablesAssignment_4_3_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getVariablesAssignment_4_3_1_1()); 
            // InternalTheory.g:1457:3: ( rule__Theory__VariablesAssignment_4_3_1_1 )
            // InternalTheory.g:1457:4: rule__Theory__VariablesAssignment_4_3_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__VariablesAssignment_4_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getVariablesAssignment_4_3_1_1()); 

            }

            // InternalTheory.g:1460:2: ( ( rule__Theory__VariablesAssignment_4_3_1_1 )* )
            // InternalTheory.g:1461:3: ( rule__Theory__VariablesAssignment_4_3_1_1 )*
            {
             before(grammarAccess.getTheoryAccess().getVariablesAssignment_4_3_1_1()); 
            // InternalTheory.g:1462:3: ( rule__Theory__VariablesAssignment_4_3_1_1 )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case RULE_ML_COMMENT:
                    {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        alt24=1;
                    }


                    }
                    break;
                case RULE_SL_COMMENT:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalTheory.g:1462:4: rule__Theory__VariablesAssignment_4_3_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__VariablesAssignment_4_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getVariablesAssignment_4_3_1_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_3_1__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalTheory.g:1472:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1476:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalTheory.g:1477:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalTheory.g:1484:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentsAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1488:1: ( ( ( rule__Type__CommentsAssignment_0 )? ) )
            // InternalTheory.g:1489:1: ( ( rule__Type__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:1489:1: ( ( rule__Type__CommentsAssignment_0 )? )
            // InternalTheory.g:1490:2: ( rule__Type__CommentsAssignment_0 )?
            {
             before(grammarAccess.getTypeAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:1491:2: ( rule__Type__CommentsAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ML_COMMENT && LA25_0<=RULE_SL_COMMENT)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTheory.g:1491:3: rule__Type__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:1499:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1503:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalTheory.g:1504:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalTheory.g:1511:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1515:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalTheory.g:1516:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalTheory.g:1516:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalTheory.g:1517:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalTheory.g:1518:2: ( rule__Type__NameAssignment_1 )
            // InternalTheory.g:1518:3: rule__Type__NameAssignment_1
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
    // InternalTheory.g:1526:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1530:1: ( rule__Type__Group__2__Impl )
            // InternalTheory.g:1531:2: rule__Type__Group__2__Impl
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
    // InternalTheory.g:1537:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1541:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalTheory.g:1542:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalTheory.g:1542:1: ( ( rule__Type__Group_2__0 )? )
            // InternalTheory.g:1543:2: ( rule__Type__Group_2__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_2()); 
            // InternalTheory.g:1544:2: ( rule__Type__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTheory.g:1544:3: rule__Type__Group_2__0
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
    // InternalTheory.g:1553:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1557:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalTheory.g:1558:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalTheory.g:1565:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1569:1: ( ( '(' ) )
            // InternalTheory.g:1570:1: ( '(' )
            {
            // InternalTheory.g:1570:1: ( '(' )
            // InternalTheory.g:1571:2: '('
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
    // InternalTheory.g:1580:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1584:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalTheory.g:1585:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalTheory.g:1592:1: rule__Type__Group_2__1__Impl : ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1596:1: ( ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1597:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1597:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1598:2: ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1598:2: ( ( rule__Type__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1599:3: ( rule__Type__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1600:3: ( rule__Type__ParametersAssignment_2_1 )
            // InternalTheory.g:1600:4: rule__Type__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Type__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1603:2: ( ( rule__Type__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1604:3: ( rule__Type__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1605:3: ( rule__Type__ParametersAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTheory.g:1605:4: rule__Type__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Type__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalTheory.g:1614:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1618:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalTheory.g:1619:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
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
    // InternalTheory.g:1626:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1630:1: ( ( ')' ) )
            // InternalTheory.g:1631:1: ( ')' )
            {
            // InternalTheory.g:1631:1: ( ')' )
            // InternalTheory.g:1632:2: ')'
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
    // InternalTheory.g:1641:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1645:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalTheory.g:1646:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
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
    // InternalTheory.g:1653:1: rule__Type__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1657:1: ( ( '=' ) )
            // InternalTheory.g:1658:1: ( '=' )
            {
            // InternalTheory.g:1658:1: ( '=' )
            // InternalTheory.g:1659:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTheory.g:1668:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl rule__Type__Group_2__5 ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1672:1: ( rule__Type__Group_2__4__Impl rule__Type__Group_2__5 )
            // InternalTheory.g:1673:2: rule__Type__Group_2__4__Impl rule__Type__Group_2__5
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
    // InternalTheory.g:1680:1: rule__Type__Group_2__4__Impl : ( ( rule__Type__ConstructorsAssignment_2_4 ) ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1684:1: ( ( ( rule__Type__ConstructorsAssignment_2_4 ) ) )
            // InternalTheory.g:1685:1: ( ( rule__Type__ConstructorsAssignment_2_4 ) )
            {
            // InternalTheory.g:1685:1: ( ( rule__Type__ConstructorsAssignment_2_4 ) )
            // InternalTheory.g:1686:2: ( rule__Type__ConstructorsAssignment_2_4 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_2_4()); 
            // InternalTheory.g:1687:2: ( rule__Type__ConstructorsAssignment_2_4 )
            // InternalTheory.g:1687:3: rule__Type__ConstructorsAssignment_2_4
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
    // InternalTheory.g:1695:1: rule__Type__Group_2__5 : rule__Type__Group_2__5__Impl ;
    public final void rule__Type__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1699:1: ( rule__Type__Group_2__5__Impl )
            // InternalTheory.g:1700:2: rule__Type__Group_2__5__Impl
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
    // InternalTheory.g:1706:1: rule__Type__Group_2__5__Impl : ( ( rule__Type__Group_2_5__0 )* ) ;
    public final void rule__Type__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1710:1: ( ( ( rule__Type__Group_2_5__0 )* ) )
            // InternalTheory.g:1711:1: ( ( rule__Type__Group_2_5__0 )* )
            {
            // InternalTheory.g:1711:1: ( ( rule__Type__Group_2_5__0 )* )
            // InternalTheory.g:1712:2: ( rule__Type__Group_2_5__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_2_5()); 
            // InternalTheory.g:1713:2: ( rule__Type__Group_2_5__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTheory.g:1713:3: rule__Type__Group_2_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Type__Group_2_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalTheory.g:1722:1: rule__Type__Group_2_5__0 : rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1 ;
    public final void rule__Type__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1726:1: ( rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1 )
            // InternalTheory.g:1727:2: rule__Type__Group_2_5__0__Impl rule__Type__Group_2_5__1
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
    // InternalTheory.g:1734:1: rule__Type__Group_2_5__0__Impl : ( '|' ) ;
    public final void rule__Type__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1738:1: ( ( '|' ) )
            // InternalTheory.g:1739:1: ( '|' )
            {
            // InternalTheory.g:1739:1: ( '|' )
            // InternalTheory.g:1740:2: '|'
            {
             before(grammarAccess.getTypeAccess().getVerticalLineKeyword_2_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTheory.g:1749:1: rule__Type__Group_2_5__1 : rule__Type__Group_2_5__1__Impl ;
    public final void rule__Type__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1753:1: ( rule__Type__Group_2_5__1__Impl )
            // InternalTheory.g:1754:2: rule__Type__Group_2_5__1__Impl
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
    // InternalTheory.g:1760:1: rule__Type__Group_2_5__1__Impl : ( ( rule__Type__ConstructorsAssignment_2_5_1 ) ) ;
    public final void rule__Type__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1764:1: ( ( ( rule__Type__ConstructorsAssignment_2_5_1 ) ) )
            // InternalTheory.g:1765:1: ( ( rule__Type__ConstructorsAssignment_2_5_1 ) )
            {
            // InternalTheory.g:1765:1: ( ( rule__Type__ConstructorsAssignment_2_5_1 ) )
            // InternalTheory.g:1766:2: ( rule__Type__ConstructorsAssignment_2_5_1 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_2_5_1()); 
            // InternalTheory.g:1767:2: ( rule__Type__ConstructorsAssignment_2_5_1 )
            // InternalTheory.g:1767:3: rule__Type__ConstructorsAssignment_2_5_1
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
    // InternalTheory.g:1776:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1780:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalTheory.g:1781:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
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
    // InternalTheory.g:1788:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__CommentsAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1792:1: ( ( ( rule__Constructor__CommentsAssignment_0 )? ) )
            // InternalTheory.g:1793:1: ( ( rule__Constructor__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:1793:1: ( ( rule__Constructor__CommentsAssignment_0 )? )
            // InternalTheory.g:1794:2: ( rule__Constructor__CommentsAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:1795:2: ( rule__Constructor__CommentsAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ML_COMMENT && LA29_0<=RULE_SL_COMMENT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTheory.g:1795:3: rule__Constructor__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constructor__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:1803:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1807:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // InternalTheory.g:1808:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
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
    // InternalTheory.g:1815:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 ) ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1819:1: ( ( ( rule__Constructor__NameAssignment_1 ) ) )
            // InternalTheory.g:1820:1: ( ( rule__Constructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:1820:1: ( ( rule__Constructor__NameAssignment_1 ) )
            // InternalTheory.g:1821:2: ( rule__Constructor__NameAssignment_1 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:1822:2: ( rule__Constructor__NameAssignment_1 )
            // InternalTheory.g:1822:3: rule__Constructor__NameAssignment_1
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
    // InternalTheory.g:1830:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1834:1: ( rule__Constructor__Group__2__Impl )
            // InternalTheory.g:1835:2: rule__Constructor__Group__2__Impl
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
    // InternalTheory.g:1841:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__Group_2__0 )? ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1845:1: ( ( ( rule__Constructor__Group_2__0 )? ) )
            // InternalTheory.g:1846:1: ( ( rule__Constructor__Group_2__0 )? )
            {
            // InternalTheory.g:1846:1: ( ( rule__Constructor__Group_2__0 )? )
            // InternalTheory.g:1847:2: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // InternalTheory.g:1848:2: ( rule__Constructor__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTheory.g:1848:3: rule__Constructor__Group_2__0
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
    // InternalTheory.g:1857:1: rule__Constructor__Group_2__0 : rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1861:1: ( rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 )
            // InternalTheory.g:1862:2: rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1
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
    // InternalTheory.g:1869:1: rule__Constructor__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Constructor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1873:1: ( ( '(' ) )
            // InternalTheory.g:1874:1: ( '(' )
            {
            // InternalTheory.g:1874:1: ( '(' )
            // InternalTheory.g:1875:2: '('
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
    // InternalTheory.g:1884:1: rule__Constructor__Group_2__1 : rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1888:1: ( rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 )
            // InternalTheory.g:1889:2: rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2
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
    // InternalTheory.g:1896:1: rule__Constructor__Group_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) ;
    public final void rule__Constructor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1900:1: ( ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) )
            // InternalTheory.g:1901:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            {
            // InternalTheory.g:1901:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            // InternalTheory.g:1902:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_1()); 
            // InternalTheory.g:1903:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            // InternalTheory.g:1903:3: rule__Constructor__DestructorsAssignment_2_1
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
    // InternalTheory.g:1911:1: rule__Constructor__Group_2__2 : rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 ;
    public final void rule__Constructor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1915:1: ( rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 )
            // InternalTheory.g:1916:2: rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3
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
    // InternalTheory.g:1923:1: rule__Constructor__Group_2__2__Impl : ( ( rule__Constructor__Group_2_2__0 )* ) ;
    public final void rule__Constructor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1927:1: ( ( ( rule__Constructor__Group_2_2__0 )* ) )
            // InternalTheory.g:1928:1: ( ( rule__Constructor__Group_2_2__0 )* )
            {
            // InternalTheory.g:1928:1: ( ( rule__Constructor__Group_2_2__0 )* )
            // InternalTheory.g:1929:2: ( rule__Constructor__Group_2_2__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_2()); 
            // InternalTheory.g:1930:2: ( rule__Constructor__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTheory.g:1930:3: rule__Constructor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Constructor__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalTheory.g:1938:1: rule__Constructor__Group_2__3 : rule__Constructor__Group_2__3__Impl ;
    public final void rule__Constructor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1942:1: ( rule__Constructor__Group_2__3__Impl )
            // InternalTheory.g:1943:2: rule__Constructor__Group_2__3__Impl
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
    // InternalTheory.g:1949:1: rule__Constructor__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1953:1: ( ( ')' ) )
            // InternalTheory.g:1954:1: ( ')' )
            {
            // InternalTheory.g:1954:1: ( ')' )
            // InternalTheory.g:1955:2: ')'
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
    // InternalTheory.g:1965:1: rule__Constructor__Group_2_2__0 : rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 ;
    public final void rule__Constructor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1969:1: ( rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 )
            // InternalTheory.g:1970:2: rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1
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
    // InternalTheory.g:1977:1: rule__Constructor__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1981:1: ( ( ',' ) )
            // InternalTheory.g:1982:1: ( ',' )
            {
            // InternalTheory.g:1982:1: ( ',' )
            // InternalTheory.g:1983:2: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTheory.g:1992:1: rule__Constructor__Group_2_2__1 : rule__Constructor__Group_2_2__1__Impl ;
    public final void rule__Constructor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1996:1: ( rule__Constructor__Group_2_2__1__Impl )
            // InternalTheory.g:1997:2: rule__Constructor__Group_2_2__1__Impl
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
    // InternalTheory.g:2003:1: rule__Constructor__Group_2_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) ;
    public final void rule__Constructor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2007:1: ( ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2008:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2008:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            // InternalTheory.g:2009:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_2_1()); 
            // InternalTheory.g:2010:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            // InternalTheory.g:2010:3: rule__Constructor__DestructorsAssignment_2_2_1
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
    // InternalTheory.g:2019:1: rule__Destructor__Group__0 : rule__Destructor__Group__0__Impl rule__Destructor__Group__1 ;
    public final void rule__Destructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2023:1: ( rule__Destructor__Group__0__Impl rule__Destructor__Group__1 )
            // InternalTheory.g:2024:2: rule__Destructor__Group__0__Impl rule__Destructor__Group__1
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
    // InternalTheory.g:2031:1: rule__Destructor__Group__0__Impl : ( ( rule__Destructor__CommentsAssignment_0 )? ) ;
    public final void rule__Destructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2035:1: ( ( ( rule__Destructor__CommentsAssignment_0 )? ) )
            // InternalTheory.g:2036:1: ( ( rule__Destructor__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:2036:1: ( ( rule__Destructor__CommentsAssignment_0 )? )
            // InternalTheory.g:2037:2: ( rule__Destructor__CommentsAssignment_0 )?
            {
             before(grammarAccess.getDestructorAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:2038:2: ( rule__Destructor__CommentsAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ML_COMMENT && LA32_0<=RULE_SL_COMMENT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTheory.g:2038:3: rule__Destructor__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Destructor__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDestructorAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:2046:1: rule__Destructor__Group__1 : rule__Destructor__Group__1__Impl rule__Destructor__Group__2 ;
    public final void rule__Destructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2050:1: ( rule__Destructor__Group__1__Impl rule__Destructor__Group__2 )
            // InternalTheory.g:2051:2: rule__Destructor__Group__1__Impl rule__Destructor__Group__2
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
    // InternalTheory.g:2058:1: rule__Destructor__Group__1__Impl : ( ( rule__Destructor__NameAssignment_1 ) ) ;
    public final void rule__Destructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2062:1: ( ( ( rule__Destructor__NameAssignment_1 ) ) )
            // InternalTheory.g:2063:1: ( ( rule__Destructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:2063:1: ( ( rule__Destructor__NameAssignment_1 ) )
            // InternalTheory.g:2064:2: ( rule__Destructor__NameAssignment_1 )
            {
             before(grammarAccess.getDestructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2065:2: ( rule__Destructor__NameAssignment_1 )
            // InternalTheory.g:2065:3: rule__Destructor__NameAssignment_1
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
    // InternalTheory.g:2073:1: rule__Destructor__Group__2 : rule__Destructor__Group__2__Impl rule__Destructor__Group__3 ;
    public final void rule__Destructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2077:1: ( rule__Destructor__Group__2__Impl rule__Destructor__Group__3 )
            // InternalTheory.g:2078:2: rule__Destructor__Group__2__Impl rule__Destructor__Group__3
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
    // InternalTheory.g:2085:1: rule__Destructor__Group__2__Impl : ( ':' ) ;
    public final void rule__Destructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2089:1: ( ( ':' ) )
            // InternalTheory.g:2090:1: ( ':' )
            {
            // InternalTheory.g:2090:1: ( ':' )
            // InternalTheory.g:2091:2: ':'
            {
             before(grammarAccess.getDestructorAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:2100:1: rule__Destructor__Group__3 : rule__Destructor__Group__3__Impl ;
    public final void rule__Destructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2104:1: ( rule__Destructor__Group__3__Impl )
            // InternalTheory.g:2105:2: rule__Destructor__Group__3__Impl
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
    // InternalTheory.g:2111:1: rule__Destructor__Group__3__Impl : ( ( rule__Destructor__TypeAssignment_3 ) ) ;
    public final void rule__Destructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2115:1: ( ( ( rule__Destructor__TypeAssignment_3 ) ) )
            // InternalTheory.g:2116:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            {
            // InternalTheory.g:2116:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            // InternalTheory.g:2117:2: ( rule__Destructor__TypeAssignment_3 )
            {
             before(grammarAccess.getDestructorAccess().getTypeAssignment_3()); 
            // InternalTheory.g:2118:2: ( rule__Destructor__TypeAssignment_3 )
            // InternalTheory.g:2118:3: rule__Destructor__TypeAssignment_3
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
    // InternalTheory.g:2127:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2131:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // InternalTheory.g:2132:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
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
    // InternalTheory.g:2139:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__CommentsAssignment_0 )? ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2143:1: ( ( ( rule__Operator__CommentsAssignment_0 )? ) )
            // InternalTheory.g:2144:1: ( ( rule__Operator__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:2144:1: ( ( rule__Operator__CommentsAssignment_0 )? )
            // InternalTheory.g:2145:2: ( rule__Operator__CommentsAssignment_0 )?
            {
             before(grammarAccess.getOperatorAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:2146:2: ( rule__Operator__CommentsAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ML_COMMENT && LA33_0<=RULE_SL_COMMENT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTheory.g:2146:3: rule__Operator__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:2154:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2158:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // InternalTheory.g:2159:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
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
    // InternalTheory.g:2166:1: rule__Operator__Group__1__Impl : ( ( rule__Operator__NameAssignment_1 ) ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2170:1: ( ( ( rule__Operator__NameAssignment_1 ) ) )
            // InternalTheory.g:2171:1: ( ( rule__Operator__NameAssignment_1 ) )
            {
            // InternalTheory.g:2171:1: ( ( rule__Operator__NameAssignment_1 ) )
            // InternalTheory.g:2172:2: ( rule__Operator__NameAssignment_1 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2173:2: ( rule__Operator__NameAssignment_1 )
            // InternalTheory.g:2173:3: rule__Operator__NameAssignment_1
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
    // InternalTheory.g:2181:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2185:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // InternalTheory.g:2186:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
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
    // InternalTheory.g:2193:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__Group_2__0 )? ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2197:1: ( ( ( rule__Operator__Group_2__0 )? ) )
            // InternalTheory.g:2198:1: ( ( rule__Operator__Group_2__0 )? )
            {
            // InternalTheory.g:2198:1: ( ( rule__Operator__Group_2__0 )? )
            // InternalTheory.g:2199:2: ( rule__Operator__Group_2__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_2()); 
            // InternalTheory.g:2200:2: ( rule__Operator__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTheory.g:2200:3: rule__Operator__Group_2__0
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
    // InternalTheory.g:2208:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2212:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // InternalTheory.g:2213:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
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
    // InternalTheory.g:2220:1: rule__Operator__Group__3__Impl : ( ( rule__Operator__UnorderedGroup_3 ) ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2224:1: ( ( ( rule__Operator__UnorderedGroup_3 ) ) )
            // InternalTheory.g:2225:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            {
            // InternalTheory.g:2225:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            // InternalTheory.g:2226:2: ( rule__Operator__UnorderedGroup_3 )
            {
             before(grammarAccess.getOperatorAccess().getUnorderedGroup_3()); 
            // InternalTheory.g:2227:2: ( rule__Operator__UnorderedGroup_3 )
            // InternalTheory.g:2227:3: rule__Operator__UnorderedGroup_3
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
    // InternalTheory.g:2235:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2239:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // InternalTheory.g:2240:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
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
    // InternalTheory.g:2247:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__Group_4__0 )? ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2251:1: ( ( ( rule__Operator__Group_4__0 )? ) )
            // InternalTheory.g:2252:1: ( ( rule__Operator__Group_4__0 )? )
            {
            // InternalTheory.g:2252:1: ( ( rule__Operator__Group_4__0 )? )
            // InternalTheory.g:2253:2: ( rule__Operator__Group_4__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_4()); 
            // InternalTheory.g:2254:2: ( rule__Operator__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTheory.g:2254:3: rule__Operator__Group_4__0
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
    // InternalTheory.g:2262:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl rule__Operator__Group__6 ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2266:1: ( rule__Operator__Group__5__Impl rule__Operator__Group__6 )
            // InternalTheory.g:2267:2: rule__Operator__Group__5__Impl rule__Operator__Group__6
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
    // InternalTheory.g:2274:1: rule__Operator__Group__5__Impl : ( ( rule__Operator__Group_5__0 )? ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2278:1: ( ( ( rule__Operator__Group_5__0 )? ) )
            // InternalTheory.g:2279:1: ( ( rule__Operator__Group_5__0 )? )
            {
            // InternalTheory.g:2279:1: ( ( rule__Operator__Group_5__0 )? )
            // InternalTheory.g:2280:2: ( rule__Operator__Group_5__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_5()); 
            // InternalTheory.g:2281:2: ( rule__Operator__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTheory.g:2281:3: rule__Operator__Group_5__0
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
    // InternalTheory.g:2289:1: rule__Operator__Group__6 : rule__Operator__Group__6__Impl ;
    public final void rule__Operator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2293:1: ( rule__Operator__Group__6__Impl )
            // InternalTheory.g:2294:2: rule__Operator__Group__6__Impl
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
    // InternalTheory.g:2300:1: rule__Operator__Group__6__Impl : ( ( rule__Operator__Group_6__0 )? ) ;
    public final void rule__Operator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2304:1: ( ( ( rule__Operator__Group_6__0 )? ) )
            // InternalTheory.g:2305:1: ( ( rule__Operator__Group_6__0 )? )
            {
            // InternalTheory.g:2305:1: ( ( rule__Operator__Group_6__0 )? )
            // InternalTheory.g:2306:2: ( rule__Operator__Group_6__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_6()); 
            // InternalTheory.g:2307:2: ( rule__Operator__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTheory.g:2307:3: rule__Operator__Group_6__0
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
    // InternalTheory.g:2316:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2320:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalTheory.g:2321:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
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
    // InternalTheory.g:2328:1: rule__Operator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2332:1: ( ( '(' ) )
            // InternalTheory.g:2333:1: ( '(' )
            {
            // InternalTheory.g:2333:1: ( '(' )
            // InternalTheory.g:2334:2: '('
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
    // InternalTheory.g:2343:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2347:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalTheory.g:2348:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
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
    // InternalTheory.g:2355:1: rule__Operator__Group_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2359:1: ( ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) )
            // InternalTheory.g:2360:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            {
            // InternalTheory.g:2360:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            // InternalTheory.g:2361:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_1()); 
            // InternalTheory.g:2362:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            // InternalTheory.g:2362:3: rule__Operator__ArgumentsAssignment_2_1
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
    // InternalTheory.g:2370:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2374:1: ( rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 )
            // InternalTheory.g:2375:2: rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3
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
    // InternalTheory.g:2382:1: rule__Operator__Group_2__2__Impl : ( ( rule__Operator__Group_2_2__0 )* ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2386:1: ( ( ( rule__Operator__Group_2_2__0 )* ) )
            // InternalTheory.g:2387:1: ( ( rule__Operator__Group_2_2__0 )* )
            {
            // InternalTheory.g:2387:1: ( ( rule__Operator__Group_2_2__0 )* )
            // InternalTheory.g:2388:2: ( rule__Operator__Group_2_2__0 )*
            {
             before(grammarAccess.getOperatorAccess().getGroup_2_2()); 
            // InternalTheory.g:2389:2: ( rule__Operator__Group_2_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalTheory.g:2389:3: rule__Operator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Operator__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalTheory.g:2397:1: rule__Operator__Group_2__3 : rule__Operator__Group_2__3__Impl ;
    public final void rule__Operator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2401:1: ( rule__Operator__Group_2__3__Impl )
            // InternalTheory.g:2402:2: rule__Operator__Group_2__3__Impl
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
    // InternalTheory.g:2408:1: rule__Operator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2412:1: ( ( ')' ) )
            // InternalTheory.g:2413:1: ( ')' )
            {
            // InternalTheory.g:2413:1: ( ')' )
            // InternalTheory.g:2414:2: ')'
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
    // InternalTheory.g:2424:1: rule__Operator__Group_2_2__0 : rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 ;
    public final void rule__Operator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2428:1: ( rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 )
            // InternalTheory.g:2429:2: rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1
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
    // InternalTheory.g:2436:1: rule__Operator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2440:1: ( ( ',' ) )
            // InternalTheory.g:2441:1: ( ',' )
            {
            // InternalTheory.g:2441:1: ( ',' )
            // InternalTheory.g:2442:2: ','
            {
             before(grammarAccess.getOperatorAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTheory.g:2451:1: rule__Operator__Group_2_2__1 : rule__Operator__Group_2_2__1__Impl ;
    public final void rule__Operator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2455:1: ( rule__Operator__Group_2_2__1__Impl )
            // InternalTheory.g:2456:2: rule__Operator__Group_2_2__1__Impl
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
    // InternalTheory.g:2462:1: rule__Operator__Group_2_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__Operator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2466:1: ( ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2467:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2467:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            // InternalTheory.g:2468:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_2_1()); 
            // InternalTheory.g:2469:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            // InternalTheory.g:2469:3: rule__Operator__ArgumentsAssignment_2_2_1
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
    // InternalTheory.g:2478:1: rule__Operator__Group_3_0__0 : rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 ;
    public final void rule__Operator__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2482:1: ( rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 )
            // InternalTheory.g:2483:2: rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1
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
    // InternalTheory.g:2490:1: rule__Operator__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Operator__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2494:1: ( ( ':' ) )
            // InternalTheory.g:2495:1: ( ':' )
            {
            // InternalTheory.g:2495:1: ( ':' )
            // InternalTheory.g:2496:2: ':'
            {
             before(grammarAccess.getOperatorAccess().getColonKeyword_3_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:2505:1: rule__Operator__Group_3_0__1 : rule__Operator__Group_3_0__1__Impl ;
    public final void rule__Operator__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2509:1: ( rule__Operator__Group_3_0__1__Impl )
            // InternalTheory.g:2510:2: rule__Operator__Group_3_0__1__Impl
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
    // InternalTheory.g:2516:1: rule__Operator__Group_3_0__1__Impl : ( ( rule__Operator__TypeAssignment_3_0_1 ) ) ;
    public final void rule__Operator__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2520:1: ( ( ( rule__Operator__TypeAssignment_3_0_1 ) ) )
            // InternalTheory.g:2521:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            {
            // InternalTheory.g:2521:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            // InternalTheory.g:2522:2: ( rule__Operator__TypeAssignment_3_0_1 )
            {
             before(grammarAccess.getOperatorAccess().getTypeAssignment_3_0_1()); 
            // InternalTheory.g:2523:2: ( rule__Operator__TypeAssignment_3_0_1 )
            // InternalTheory.g:2523:3: rule__Operator__TypeAssignment_3_0_1
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
    // InternalTheory.g:2532:1: rule__Operator__Group_3_2__0 : rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 ;
    public final void rule__Operator__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2536:1: ( rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 )
            // InternalTheory.g:2537:2: rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1
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
    // InternalTheory.g:2544:1: rule__Operator__Group_3_2__0__Impl : ( ( rule__Operator__AssocitiveAssignment_3_2_0 ) ) ;
    public final void rule__Operator__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2548:1: ( ( ( rule__Operator__AssocitiveAssignment_3_2_0 ) ) )
            // InternalTheory.g:2549:1: ( ( rule__Operator__AssocitiveAssignment_3_2_0 ) )
            {
            // InternalTheory.g:2549:1: ( ( rule__Operator__AssocitiveAssignment_3_2_0 ) )
            // InternalTheory.g:2550:2: ( rule__Operator__AssocitiveAssignment_3_2_0 )
            {
             before(grammarAccess.getOperatorAccess().getAssocitiveAssignment_3_2_0()); 
            // InternalTheory.g:2551:2: ( rule__Operator__AssocitiveAssignment_3_2_0 )
            // InternalTheory.g:2551:3: rule__Operator__AssocitiveAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AssocitiveAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAssocitiveAssignment_3_2_0()); 

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
    // InternalTheory.g:2559:1: rule__Operator__Group_3_2__1 : rule__Operator__Group_3_2__1__Impl ;
    public final void rule__Operator__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2563:1: ( rule__Operator__Group_3_2__1__Impl )
            // InternalTheory.g:2564:2: rule__Operator__Group_3_2__1__Impl
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
    // InternalTheory.g:2570:1: rule__Operator__Group_3_2__1__Impl : ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) ;
    public final void rule__Operator__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2574:1: ( ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) )
            // InternalTheory.g:2575:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            {
            // InternalTheory.g:2575:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            // InternalTheory.g:2576:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            {
             before(grammarAccess.getOperatorAccess().getCommutativeAssignment_3_2_1()); 
            // InternalTheory.g:2577:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTheory.g:2577:3: rule__Operator__CommutativeAssignment_3_2_1
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
    // InternalTheory.g:2586:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2590:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalTheory.g:2591:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
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
    // InternalTheory.g:2598:1: rule__Operator__Group_4__0__Impl : ( '#' ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2602:1: ( ( '#' ) )
            // InternalTheory.g:2603:1: ( '#' )
            {
            // InternalTheory.g:2603:1: ( '#' )
            // InternalTheory.g:2604:2: '#'
            {
             before(grammarAccess.getOperatorAccess().getNumberSignKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTheory.g:2613:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2617:1: ( rule__Operator__Group_4__1__Impl )
            // InternalTheory.g:2618:2: rule__Operator__Group_4__1__Impl
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
    // InternalTheory.g:2624:1: rule__Operator__Group_4__1__Impl : ( ( rule__Operator__PrecedentAssignment_4_1 ) ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2628:1: ( ( ( rule__Operator__PrecedentAssignment_4_1 ) ) )
            // InternalTheory.g:2629:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            {
            // InternalTheory.g:2629:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            // InternalTheory.g:2630:2: ( rule__Operator__PrecedentAssignment_4_1 )
            {
             before(grammarAccess.getOperatorAccess().getPrecedentAssignment_4_1()); 
            // InternalTheory.g:2631:2: ( rule__Operator__PrecedentAssignment_4_1 )
            // InternalTheory.g:2631:3: rule__Operator__PrecedentAssignment_4_1
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
    // InternalTheory.g:2640:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2644:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalTheory.g:2645:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
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
    // InternalTheory.g:2652:1: rule__Operator__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2656:1: ( ( 'for' ) )
            // InternalTheory.g:2657:1: ( 'for' )
            {
            // InternalTheory.g:2657:1: ( 'for' )
            // InternalTheory.g:2658:2: 'for'
            {
             before(grammarAccess.getOperatorAccess().getForKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTheory.g:2667:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2671:1: ( rule__Operator__Group_5__1__Impl )
            // InternalTheory.g:2672:2: rule__Operator__Group_5__1__Impl
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
    // InternalTheory.g:2678:1: rule__Operator__Group_5__1__Impl : ( ( rule__Operator__WdAssignment_5_1 ) ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2682:1: ( ( ( rule__Operator__WdAssignment_5_1 ) ) )
            // InternalTheory.g:2683:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            {
            // InternalTheory.g:2683:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            // InternalTheory.g:2684:2: ( rule__Operator__WdAssignment_5_1 )
            {
             before(grammarAccess.getOperatorAccess().getWdAssignment_5_1()); 
            // InternalTheory.g:2685:2: ( rule__Operator__WdAssignment_5_1 )
            // InternalTheory.g:2685:3: rule__Operator__WdAssignment_5_1
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
    // InternalTheory.g:2694:1: rule__Operator__Group_6__0 : rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 ;
    public final void rule__Operator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2698:1: ( rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 )
            // InternalTheory.g:2699:2: rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1
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
    // InternalTheory.g:2706:1: rule__Operator__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Operator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2710:1: ( ( '=' ) )
            // InternalTheory.g:2711:1: ( '=' )
            {
            // InternalTheory.g:2711:1: ( '=' )
            // InternalTheory.g:2712:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTheory.g:2721:1: rule__Operator__Group_6__1 : rule__Operator__Group_6__1__Impl ;
    public final void rule__Operator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2725:1: ( rule__Operator__Group_6__1__Impl )
            // InternalTheory.g:2726:2: rule__Operator__Group_6__1__Impl
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
    // InternalTheory.g:2732:1: rule__Operator__Group_6__1__Impl : ( ( rule__Operator__Alternatives_6_1 ) ) ;
    public final void rule__Operator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2736:1: ( ( ( rule__Operator__Alternatives_6_1 ) ) )
            // InternalTheory.g:2737:1: ( ( rule__Operator__Alternatives_6_1 ) )
            {
            // InternalTheory.g:2737:1: ( ( rule__Operator__Alternatives_6_1 ) )
            // InternalTheory.g:2738:2: ( rule__Operator__Alternatives_6_1 )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives_6_1()); 
            // InternalTheory.g:2739:2: ( rule__Operator__Alternatives_6_1 )
            // InternalTheory.g:2739:3: rule__Operator__Alternatives_6_1
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
    // InternalTheory.g:2748:1: rule__Operator__Group_6_1_1__0 : rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 ;
    public final void rule__Operator__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2752:1: ( rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 )
            // InternalTheory.g:2753:2: rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1
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
    // InternalTheory.g:2760:1: rule__Operator__Group_6_1_1__0__Impl : ( 'case' ) ;
    public final void rule__Operator__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2764:1: ( ( 'case' ) )
            // InternalTheory.g:2765:1: ( 'case' )
            {
            // InternalTheory.g:2765:1: ( 'case' )
            // InternalTheory.g:2766:2: 'case'
            {
             before(grammarAccess.getOperatorAccess().getCaseKeyword_6_1_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTheory.g:2775:1: rule__Operator__Group_6_1_1__1 : rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 ;
    public final void rule__Operator__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2779:1: ( rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 )
            // InternalTheory.g:2780:2: rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2
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
    // InternalTheory.g:2787:1: rule__Operator__Group_6_1_1__1__Impl : ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) ;
    public final void rule__Operator__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2791:1: ( ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) )
            // InternalTheory.g:2792:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            {
            // InternalTheory.g:2792:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            // InternalTheory.g:2793:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            {
             before(grammarAccess.getOperatorAccess().getCaseAssignment_6_1_1_1()); 
            // InternalTheory.g:2794:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            // InternalTheory.g:2794:3: rule__Operator__CaseAssignment_6_1_1_1
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
    // InternalTheory.g:2802:1: rule__Operator__Group_6_1_1__2 : rule__Operator__Group_6_1_1__2__Impl ;
    public final void rule__Operator__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2806:1: ( rule__Operator__Group_6_1_1__2__Impl )
            // InternalTheory.g:2807:2: rule__Operator__Group_6_1_1__2__Impl
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
    // InternalTheory.g:2813:1: rule__Operator__Group_6_1_1__2__Impl : ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) ;
    public final void rule__Operator__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2817:1: ( ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) )
            // InternalTheory.g:2818:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            {
            // InternalTheory.g:2818:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            // InternalTheory.g:2819:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            {
            // InternalTheory.g:2819:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) )
            // InternalTheory.g:2820:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2821:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            // InternalTheory.g:2821:4: rule__Operator__CasesAssignment_6_1_1_2
            {
            pushFollow(FOLLOW_27);
            rule__Operator__CasesAssignment_6_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 

            }

            // InternalTheory.g:2824:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            // InternalTheory.g:2825:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2826:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalTheory.g:2826:4: rule__Operator__CasesAssignment_6_1_1_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Operator__CasesAssignment_6_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalTheory.g:2836:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2840:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalTheory.g:2841:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalTheory.g:2848:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__CommentsAssignment_0 )? ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2852:1: ( ( ( rule__Argument__CommentsAssignment_0 )? ) )
            // InternalTheory.g:2853:1: ( ( rule__Argument__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:2853:1: ( ( rule__Argument__CommentsAssignment_0 )? )
            // InternalTheory.g:2854:2: ( rule__Argument__CommentsAssignment_0 )?
            {
             before(grammarAccess.getArgumentAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:2855:2: ( rule__Argument__CommentsAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ML_COMMENT && LA41_0<=RULE_SL_COMMENT)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTheory.g:2855:3: rule__Argument__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Argument__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:2863:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2867:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalTheory.g:2868:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
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
    // InternalTheory.g:2875:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2879:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalTheory.g:2880:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalTheory.g:2880:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalTheory.g:2881:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalTheory.g:2882:2: ( rule__Argument__NameAssignment_1 )
            // InternalTheory.g:2882:3: rule__Argument__NameAssignment_1
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
    // InternalTheory.g:2890:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2894:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // InternalTheory.g:2895:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
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
    // InternalTheory.g:2902:1: rule__Argument__Group__2__Impl : ( ':' ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2906:1: ( ( ':' ) )
            // InternalTheory.g:2907:1: ( ':' )
            {
            // InternalTheory.g:2907:1: ( ':' )
            // InternalTheory.g:2908:2: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:2917:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2921:1: ( rule__Argument__Group__3__Impl )
            // InternalTheory.g:2922:2: rule__Argument__Group__3__Impl
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
    // InternalTheory.g:2928:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__TypeAssignment_3 ) ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2932:1: ( ( ( rule__Argument__TypeAssignment_3 ) ) )
            // InternalTheory.g:2933:1: ( ( rule__Argument__TypeAssignment_3 ) )
            {
            // InternalTheory.g:2933:1: ( ( rule__Argument__TypeAssignment_3 ) )
            // InternalTheory.g:2934:2: ( rule__Argument__TypeAssignment_3 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_3()); 
            // InternalTheory.g:2935:2: ( rule__Argument__TypeAssignment_3 )
            // InternalTheory.g:2935:3: rule__Argument__TypeAssignment_3
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
    // InternalTheory.g:2944:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2948:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTheory.g:2949:2: rule__Case__Group__0__Impl rule__Case__Group__1
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
    // InternalTheory.g:2956:1: rule__Case__Group__0__Impl : ( ( rule__Case__PatternAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2960:1: ( ( ( rule__Case__PatternAssignment_0 ) ) )
            // InternalTheory.g:2961:1: ( ( rule__Case__PatternAssignment_0 ) )
            {
            // InternalTheory.g:2961:1: ( ( rule__Case__PatternAssignment_0 ) )
            // InternalTheory.g:2962:2: ( rule__Case__PatternAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getPatternAssignment_0()); 
            // InternalTheory.g:2963:2: ( rule__Case__PatternAssignment_0 )
            // InternalTheory.g:2963:3: rule__Case__PatternAssignment_0
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
    // InternalTheory.g:2971:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2975:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTheory.g:2976:2: rule__Case__Group__1__Impl rule__Case__Group__2
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
    // InternalTheory.g:2983:1: rule__Case__Group__1__Impl : ( '=>' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2987:1: ( ( '=>' ) )
            // InternalTheory.g:2988:1: ( '=>' )
            {
            // InternalTheory.g:2988:1: ( '=>' )
            // InternalTheory.g:2989:2: '=>'
            {
             before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTheory.g:2998:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3002:1: ( rule__Case__Group__2__Impl )
            // InternalTheory.g:3003:2: rule__Case__Group__2__Impl
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
    // InternalTheory.g:3009:1: rule__Case__Group__2__Impl : ( ( rule__Case__FormulaAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3013:1: ( ( ( rule__Case__FormulaAssignment_2 ) ) )
            // InternalTheory.g:3014:1: ( ( rule__Case__FormulaAssignment_2 ) )
            {
            // InternalTheory.g:3014:1: ( ( rule__Case__FormulaAssignment_2 ) )
            // InternalTheory.g:3015:2: ( rule__Case__FormulaAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 
            // InternalTheory.g:3016:2: ( rule__Case__FormulaAssignment_2 )
            // InternalTheory.g:3016:3: rule__Case__FormulaAssignment_2
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
    // InternalTheory.g:3025:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3029:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // InternalTheory.g:3030:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
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
    // InternalTheory.g:3037:1: rule__Axiom__Group__0__Impl : ( ( rule__Axiom__CommentsAssignment_0 )? ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3041:1: ( ( ( rule__Axiom__CommentsAssignment_0 )? ) )
            // InternalTheory.g:3042:1: ( ( rule__Axiom__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:3042:1: ( ( rule__Axiom__CommentsAssignment_0 )? )
            // InternalTheory.g:3043:2: ( rule__Axiom__CommentsAssignment_0 )?
            {
             before(grammarAccess.getAxiomAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:3044:2: ( rule__Axiom__CommentsAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ML_COMMENT && LA42_0<=RULE_SL_COMMENT)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTheory.g:3044:3: rule__Axiom__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axiom__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:3052:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3056:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // InternalTheory.g:3057:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
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
    // InternalTheory.g:3064:1: rule__Axiom__Group__1__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3068:1: ( ( '@' ) )
            // InternalTheory.g:3069:1: ( '@' )
            {
            // InternalTheory.g:3069:1: ( '@' )
            // InternalTheory.g:3070:2: '@'
            {
             before(grammarAccess.getAxiomAccess().getCommercialAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTheory.g:3079:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3083:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // InternalTheory.g:3084:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
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
    // InternalTheory.g:3091:1: rule__Axiom__Group__2__Impl : ( ( rule__Axiom__NameAssignment_2 ) ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3095:1: ( ( ( rule__Axiom__NameAssignment_2 ) ) )
            // InternalTheory.g:3096:1: ( ( rule__Axiom__NameAssignment_2 ) )
            {
            // InternalTheory.g:3096:1: ( ( rule__Axiom__NameAssignment_2 ) )
            // InternalTheory.g:3097:2: ( rule__Axiom__NameAssignment_2 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_2()); 
            // InternalTheory.g:3098:2: ( rule__Axiom__NameAssignment_2 )
            // InternalTheory.g:3098:3: rule__Axiom__NameAssignment_2
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
    // InternalTheory.g:3106:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl rule__Axiom__Group__4 ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3110:1: ( rule__Axiom__Group__3__Impl rule__Axiom__Group__4 )
            // InternalTheory.g:3111:2: rule__Axiom__Group__3__Impl rule__Axiom__Group__4
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
    // InternalTheory.g:3118:1: rule__Axiom__Group__3__Impl : ( ':' ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3122:1: ( ( ':' ) )
            // InternalTheory.g:3123:1: ( ':' )
            {
            // InternalTheory.g:3123:1: ( ':' )
            // InternalTheory.g:3124:2: ':'
            {
             before(grammarAccess.getAxiomAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:3133:1: rule__Axiom__Group__4 : rule__Axiom__Group__4__Impl rule__Axiom__Group__5 ;
    public final void rule__Axiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3137:1: ( rule__Axiom__Group__4__Impl rule__Axiom__Group__5 )
            // InternalTheory.g:3138:2: rule__Axiom__Group__4__Impl rule__Axiom__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Axiom__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__5();

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
    // InternalTheory.g:3145:1: rule__Axiom__Group__4__Impl : ( ( rule__Axiom__PredicateAssignment_4 ) ) ;
    public final void rule__Axiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3149:1: ( ( ( rule__Axiom__PredicateAssignment_4 ) ) )
            // InternalTheory.g:3150:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            {
            // InternalTheory.g:3150:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            // InternalTheory.g:3151:2: ( rule__Axiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 
            // InternalTheory.g:3152:2: ( rule__Axiom__PredicateAssignment_4 )
            // InternalTheory.g:3152:3: rule__Axiom__PredicateAssignment_4
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


    // $ANTLR start "rule__Axiom__Group__5"
    // InternalTheory.g:3160:1: rule__Axiom__Group__5 : rule__Axiom__Group__5__Impl ;
    public final void rule__Axiom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3164:1: ( rule__Axiom__Group__5__Impl )
            // InternalTheory.g:3165:2: rule__Axiom__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__Group__5__Impl();

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
    // $ANTLR end "rule__Axiom__Group__5"


    // $ANTLR start "rule__Axiom__Group__5__Impl"
    // InternalTheory.g:3171:1: rule__Axiom__Group__5__Impl : ( ( rule__Axiom__IsTheoremAssignment_5 )? ) ;
    public final void rule__Axiom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3175:1: ( ( ( rule__Axiom__IsTheoremAssignment_5 )? ) )
            // InternalTheory.g:3176:1: ( ( rule__Axiom__IsTheoremAssignment_5 )? )
            {
            // InternalTheory.g:3176:1: ( ( rule__Axiom__IsTheoremAssignment_5 )? )
            // InternalTheory.g:3177:2: ( rule__Axiom__IsTheoremAssignment_5 )?
            {
             before(grammarAccess.getAxiomAccess().getIsTheoremAssignment_5()); 
            // InternalTheory.g:3178:2: ( rule__Axiom__IsTheoremAssignment_5 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTheory.g:3178:3: rule__Axiom__IsTheoremAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axiom__IsTheoremAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getIsTheoremAssignment_5()); 

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
    // $ANTLR end "rule__Axiom__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTheory.g:3187:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3191:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTheory.g:3192:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalTheory.g:3199:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__CommentsAssignment_0 )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3203:1: ( ( ( rule__Variable__CommentsAssignment_0 )? ) )
            // InternalTheory.g:3204:1: ( ( rule__Variable__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:3204:1: ( ( rule__Variable__CommentsAssignment_0 )? )
            // InternalTheory.g:3205:2: ( rule__Variable__CommentsAssignment_0 )?
            {
             before(grammarAccess.getVariableAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:3206:2: ( rule__Variable__CommentsAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTheory.g:3206:3: rule__Variable__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:3214:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3218:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTheory.g:3219:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalTheory.g:3226:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3230:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalTheory.g:3231:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalTheory.g:3231:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalTheory.g:3232:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalTheory.g:3233:2: ( rule__Variable__NameAssignment_1 )
            // InternalTheory.g:3233:3: rule__Variable__NameAssignment_1
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
    // InternalTheory.g:3241:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3245:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalTheory.g:3246:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
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
    // InternalTheory.g:3253:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3257:1: ( ( ':' ) )
            // InternalTheory.g:3258:1: ( ':' )
            {
            // InternalTheory.g:3258:1: ( ':' )
            // InternalTheory.g:3259:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:3268:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3272:1: ( rule__Variable__Group__3__Impl )
            // InternalTheory.g:3273:2: rule__Variable__Group__3__Impl
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
    // InternalTheory.g:3279:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3283:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalTheory.g:3284:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalTheory.g:3284:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalTheory.g:3285:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalTheory.g:3286:2: ( rule__Variable__TypeAssignment_3 )
            // InternalTheory.g:3286:3: rule__Variable__TypeAssignment_3
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
    // InternalTheory.g:3295:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3299:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTheory.g:3300:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalTheory.g:3307:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__CommentsAssignment_0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3311:1: ( ( ( rule__Rule__CommentsAssignment_0 )? ) )
            // InternalTheory.g:3312:1: ( ( rule__Rule__CommentsAssignment_0 )? )
            {
            // InternalTheory.g:3312:1: ( ( rule__Rule__CommentsAssignment_0 )? )
            // InternalTheory.g:3313:2: ( rule__Rule__CommentsAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getCommentsAssignment_0()); 
            // InternalTheory.g:3314:2: ( rule__Rule__CommentsAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ML_COMMENT && LA45_0<=RULE_SL_COMMENT)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTheory.g:3314:3: rule__Rule__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__CommentsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getCommentsAssignment_0()); 

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
    // InternalTheory.g:3322:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3326:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTheory.g:3327:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalTheory.g:3334:1: rule__Rule__Group__1__Impl : ( '@' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3338:1: ( ( '@' ) )
            // InternalTheory.g:3339:1: ( '@' )
            {
            // InternalTheory.g:3339:1: ( '@' )
            // InternalTheory.g:3340:2: '@'
            {
             before(grammarAccess.getRuleAccess().getCommercialAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTheory.g:3349:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3353:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalTheory.g:3354:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalTheory.g:3361:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__NameAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3365:1: ( ( ( rule__Rule__NameAssignment_2 ) ) )
            // InternalTheory.g:3366:1: ( ( rule__Rule__NameAssignment_2 ) )
            {
            // InternalTheory.g:3366:1: ( ( rule__Rule__NameAssignment_2 ) )
            // InternalTheory.g:3367:2: ( rule__Rule__NameAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_2()); 
            // InternalTheory.g:3368:2: ( rule__Rule__NameAssignment_2 )
            // InternalTheory.g:3368:3: rule__Rule__NameAssignment_2
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
    // InternalTheory.g:3376:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3380:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalTheory.g:3381:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalTheory.g:3388:1: rule__Rule__Group__3__Impl : ( ':' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3392:1: ( ( ':' ) )
            // InternalTheory.g:3393:1: ( ':' )
            {
            // InternalTheory.g:3393:1: ( ':' )
            // InternalTheory.g:3394:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:3403:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3407:1: ( rule__Rule__Group__4__Impl )
            // InternalTheory.g:3408:2: rule__Rule__Group__4__Impl
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
    // InternalTheory.g:3414:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Alternatives_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3418:1: ( ( ( rule__Rule__Alternatives_4 ) ) )
            // InternalTheory.g:3419:1: ( ( rule__Rule__Alternatives_4 ) )
            {
            // InternalTheory.g:3419:1: ( ( rule__Rule__Alternatives_4 ) )
            // InternalTheory.g:3420:2: ( rule__Rule__Alternatives_4 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_4()); 
            // InternalTheory.g:3421:2: ( rule__Rule__Alternatives_4 )
            // InternalTheory.g:3421:3: rule__Rule__Alternatives_4
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
    // InternalTheory.g:3430:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3434:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // InternalTheory.g:3435:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTheory.g:3442:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__PatternAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3446:1: ( ( ( rule__RewriteRule__PatternAssignment_0 ) ) )
            // InternalTheory.g:3447:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3447:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            // InternalTheory.g:3448:2: ( rule__RewriteRule__PatternAssignment_0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3449:2: ( rule__RewriteRule__PatternAssignment_0 )
            // InternalTheory.g:3449:3: rule__RewriteRule__PatternAssignment_0
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
    // InternalTheory.g:3457:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3461:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // InternalTheory.g:3462:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
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
    // InternalTheory.g:3469:1: rule__RewriteRule__Group__1__Impl : ( '==' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3473:1: ( ( '==' ) )
            // InternalTheory.g:3474:1: ( '==' )
            {
            // InternalTheory.g:3474:1: ( '==' )
            // InternalTheory.g:3475:2: '=='
            {
             before(grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTheory.g:3484:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3488:1: ( rule__RewriteRule__Group__2__Impl )
            // InternalTheory.g:3489:2: rule__RewriteRule__Group__2__Impl
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
    // InternalTheory.g:3495:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__Alternatives_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3499:1: ( ( ( rule__RewriteRule__Alternatives_2 ) ) )
            // InternalTheory.g:3500:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            {
            // InternalTheory.g:3500:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            // InternalTheory.g:3501:2: ( rule__RewriteRule__Alternatives_2 )
            {
             before(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 
            // InternalTheory.g:3502:2: ( rule__RewriteRule__Alternatives_2 )
            // InternalTheory.g:3502:3: rule__RewriteRule__Alternatives_2
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
    // InternalTheory.g:3511:1: rule__InferenceRule__Group__0 : rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 ;
    public final void rule__InferenceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3515:1: ( rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 )
            // InternalTheory.g:3516:2: rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTheory.g:3523:1: rule__InferenceRule__Group__0__Impl : ( ( rule__InferenceRule__GivenAssignment_0 )* ) ;
    public final void rule__InferenceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3527:1: ( ( ( rule__InferenceRule__GivenAssignment_0 )* ) )
            // InternalTheory.g:3528:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            {
            // InternalTheory.g:3528:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            // InternalTheory.g:3529:2: ( rule__InferenceRule__GivenAssignment_0 )*
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 
            // InternalTheory.g:3530:2: ( rule__InferenceRule__GivenAssignment_0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_STRING) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalTheory.g:3530:3: rule__InferenceRule__GivenAssignment_0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__InferenceRule__GivenAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalTheory.g:3538:1: rule__InferenceRule__Group__1 : rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 ;
    public final void rule__InferenceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3542:1: ( rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 )
            // InternalTheory.g:3543:2: rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2
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
    // InternalTheory.g:3550:1: rule__InferenceRule__Group__1__Impl : ( '|-' ) ;
    public final void rule__InferenceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3554:1: ( ( '|-' ) )
            // InternalTheory.g:3555:1: ( '|-' )
            {
            // InternalTheory.g:3555:1: ( '|-' )
            // InternalTheory.g:3556:2: '|-'
            {
             before(grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTheory.g:3565:1: rule__InferenceRule__Group__2 : rule__InferenceRule__Group__2__Impl ;
    public final void rule__InferenceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3569:1: ( rule__InferenceRule__Group__2__Impl )
            // InternalTheory.g:3570:2: rule__InferenceRule__Group__2__Impl
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
    // InternalTheory.g:3576:1: rule__InferenceRule__Group__2__Impl : ( ( rule__InferenceRule__InferAssignment_2 ) ) ;
    public final void rule__InferenceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3580:1: ( ( ( rule__InferenceRule__InferAssignment_2 ) ) )
            // InternalTheory.g:3581:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            {
            // InternalTheory.g:3581:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            // InternalTheory.g:3582:2: ( rule__InferenceRule__InferAssignment_2 )
            {
             before(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 
            // InternalTheory.g:3583:2: ( rule__InferenceRule__InferAssignment_2 )
            // InternalTheory.g:3583:3: rule__InferenceRule__InferAssignment_2
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
    // InternalTheory.g:3592:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3596:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalTheory.g:3597:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalTheory.g:3604:1: rule__Given__Group__0__Impl : ( ( rule__Given__PredicateAssignment_0 ) ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3608:1: ( ( ( rule__Given__PredicateAssignment_0 ) ) )
            // InternalTheory.g:3609:1: ( ( rule__Given__PredicateAssignment_0 ) )
            {
            // InternalTheory.g:3609:1: ( ( rule__Given__PredicateAssignment_0 ) )
            // InternalTheory.g:3610:2: ( rule__Given__PredicateAssignment_0 )
            {
             before(grammarAccess.getGivenAccess().getPredicateAssignment_0()); 
            // InternalTheory.g:3611:2: ( rule__Given__PredicateAssignment_0 )
            // InternalTheory.g:3611:3: rule__Given__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Given__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getPredicateAssignment_0()); 

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
    // InternalTheory.g:3619:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3623:1: ( rule__Given__Group__1__Impl )
            // InternalTheory.g:3624:2: rule__Given__Group__1__Impl
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
    // InternalTheory.g:3630:1: rule__Given__Group__1__Impl : ( ( rule__Given__RequiredAssignment_1 )? ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3634:1: ( ( ( rule__Given__RequiredAssignment_1 )? ) )
            // InternalTheory.g:3635:1: ( ( rule__Given__RequiredAssignment_1 )? )
            {
            // InternalTheory.g:3635:1: ( ( rule__Given__RequiredAssignment_1 )? )
            // InternalTheory.g:3636:2: ( rule__Given__RequiredAssignment_1 )?
            {
             before(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 
            // InternalTheory.g:3637:2: ( rule__Given__RequiredAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTheory.g:3637:3: rule__Given__RequiredAssignment_1
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
    // InternalTheory.g:3646:1: rule__ConditionalRewrite__Group__0 : rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 ;
    public final void rule__ConditionalRewrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3650:1: ( rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 )
            // InternalTheory.g:3651:2: rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1
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
    // InternalTheory.g:3658:1: rule__ConditionalRewrite__Group__0__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) ;
    public final void rule__ConditionalRewrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3662:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) )
            // InternalTheory.g:3663:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            {
            // InternalTheory.g:3663:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            // InternalTheory.g:3664:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 
            // InternalTheory.g:3665:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            // InternalTheory.g:3665:3: rule__ConditionalRewrite__RewritesAssignment_0
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
    // InternalTheory.g:3673:1: rule__ConditionalRewrite__Group__1 : rule__ConditionalRewrite__Group__1__Impl ;
    public final void rule__ConditionalRewrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3677:1: ( rule__ConditionalRewrite__Group__1__Impl )
            // InternalTheory.g:3678:2: rule__ConditionalRewrite__Group__1__Impl
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
    // InternalTheory.g:3684:1: rule__ConditionalRewrite__Group__1__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) ;
    public final void rule__ConditionalRewrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3688:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) )
            // InternalTheory.g:3689:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            {
            // InternalTheory.g:3689:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            // InternalTheory.g:3690:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 
            // InternalTheory.g:3691:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalTheory.g:3691:3: rule__ConditionalRewrite__RewritesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ConditionalRewrite__RewritesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalTheory.g:3700:1: rule__ConditionalRewriteRule__Group__0 : rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 ;
    public final void rule__ConditionalRewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3704:1: ( rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 )
            // InternalTheory.g:3705:2: rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1
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
    // InternalTheory.g:3712:1: rule__ConditionalRewriteRule__Group__0__Impl : ( ( rule__ConditionalRewriteRule__LshAssignment_0 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3716:1: ( ( ( rule__ConditionalRewriteRule__LshAssignment_0 ) ) )
            // InternalTheory.g:3717:1: ( ( rule__ConditionalRewriteRule__LshAssignment_0 ) )
            {
            // InternalTheory.g:3717:1: ( ( rule__ConditionalRewriteRule__LshAssignment_0 ) )
            // InternalTheory.g:3718:2: ( rule__ConditionalRewriteRule__LshAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLshAssignment_0()); 
            // InternalTheory.g:3719:2: ( rule__ConditionalRewriteRule__LshAssignment_0 )
            // InternalTheory.g:3719:3: rule__ConditionalRewriteRule__LshAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__LshAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getLshAssignment_0()); 

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
    // InternalTheory.g:3727:1: rule__ConditionalRewriteRule__Group__1 : rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 ;
    public final void rule__ConditionalRewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3731:1: ( rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 )
            // InternalTheory.g:3732:2: rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2
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
    // InternalTheory.g:3739:1: rule__ConditionalRewriteRule__Group__1__Impl : ( '=>' ) ;
    public final void rule__ConditionalRewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3743:1: ( ( '=>' ) )
            // InternalTheory.g:3744:1: ( '=>' )
            {
            // InternalTheory.g:3744:1: ( '=>' )
            // InternalTheory.g:3745:2: '=>'
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTheory.g:3754:1: rule__ConditionalRewriteRule__Group__2 : rule__ConditionalRewriteRule__Group__2__Impl ;
    public final void rule__ConditionalRewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3758:1: ( rule__ConditionalRewriteRule__Group__2__Impl )
            // InternalTheory.g:3759:2: rule__ConditionalRewriteRule__Group__2__Impl
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
    // InternalTheory.g:3765:1: rule__ConditionalRewriteRule__Group__2__Impl : ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3769:1: ( ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) )
            // InternalTheory.g:3770:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            {
            // InternalTheory.g:3770:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            // InternalTheory.g:3771:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 
            // InternalTheory.g:3772:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            // InternalTheory.g:3772:3: rule__ConditionalRewriteRule__RhsAssignment_2
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
    // InternalTheory.g:3781:1: rule__Operator__UnorderedGroup_3 : ( rule__Operator__UnorderedGroup_3__0 )? ;
    public final void rule__Operator__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTheory.g:3786:1: ( ( rule__Operator__UnorderedGroup_3__0 )? )
            // InternalTheory.g:3787:2: ( rule__Operator__UnorderedGroup_3__0 )?
            {
            // InternalTheory.g:3787:2: ( rule__Operator__UnorderedGroup_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 >= 11 && LA49_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTheory.g:3787:2: rule__Operator__UnorderedGroup_3__0
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
    // InternalTheory.g:3795:1: rule__Operator__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Operator__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTheory.g:3800:1: ( ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) )
            // InternalTheory.g:3801:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            {
            // InternalTheory.g:3801:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 >= 11 && LA50_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else if ( LA50_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt50=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalTheory.g:3802:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    {
                    // InternalTheory.g:3802:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    // InternalTheory.g:3803:4: {...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTheory.g:3803:104: ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    // InternalTheory.g:3804:5: ( ( rule__Operator__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3810:5: ( ( rule__Operator__Group_3_0__0 ) )
                    // InternalTheory.g:3811:6: ( rule__Operator__Group_3_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_0()); 
                    // InternalTheory.g:3812:6: ( rule__Operator__Group_3_0__0 )
                    // InternalTheory.g:3812:7: rule__Operator__Group_3_0__0
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
                    // InternalTheory.g:3817:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    {
                    // InternalTheory.g:3817:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    // InternalTheory.g:3818:4: {...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTheory.g:3818:104: ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    // InternalTheory.g:3819:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3825:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    // InternalTheory.g:3826:6: ( rule__Operator__NotationAssignment_3_1 )
                    {
                     before(grammarAccess.getOperatorAccess().getNotationAssignment_3_1()); 
                    // InternalTheory.g:3827:6: ( rule__Operator__NotationAssignment_3_1 )
                    // InternalTheory.g:3827:7: rule__Operator__NotationAssignment_3_1
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
                    // InternalTheory.g:3832:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    {
                    // InternalTheory.g:3832:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    // InternalTheory.g:3833:4: {...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalTheory.g:3833:104: ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    // InternalTheory.g:3834:5: ( ( rule__Operator__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3840:5: ( ( rule__Operator__Group_3_2__0 ) )
                    // InternalTheory.g:3841:6: ( rule__Operator__Group_3_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_2()); 
                    // InternalTheory.g:3842:6: ( rule__Operator__Group_3_2__0 )
                    // InternalTheory.g:3842:7: rule__Operator__Group_3_2__0
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
    // InternalTheory.g:3855:1: rule__Operator__UnorderedGroup_3__0 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? ;
    public final void rule__Operator__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3859:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? )
            // InternalTheory.g:3860:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:3861:2: ( rule__Operator__UnorderedGroup_3__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 11 && LA51_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTheory.g:3861:2: rule__Operator__UnorderedGroup_3__1
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
    // InternalTheory.g:3867:1: rule__Operator__UnorderedGroup_3__1 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? ;
    public final void rule__Operator__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3871:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? )
            // InternalTheory.g:3872:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_33);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:3873:2: ( rule__Operator__UnorderedGroup_3__2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 >= 11 && LA52_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTheory.g:3873:2: rule__Operator__UnorderedGroup_3__2
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
    // InternalTheory.g:3879:1: rule__Operator__UnorderedGroup_3__2 : rule__Operator__UnorderedGroup_3__Impl ;
    public final void rule__Operator__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3883:1: ( rule__Operator__UnorderedGroup_3__Impl )
            // InternalTheory.g:3884:2: rule__Operator__UnorderedGroup_3__Impl
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
    // InternalTheory.g:3891:1: rule__Theory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3895:1: ( ( RULE_ID ) )
            // InternalTheory.g:3896:2: ( RULE_ID )
            {
            // InternalTheory.g:3896:2: ( RULE_ID )
            // InternalTheory.g:3897:3: RULE_ID
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
    // InternalTheory.g:3906:1: rule__Theory__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Theory__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3910:1: ( ( ruleParameter ) )
            // InternalTheory.g:3911:2: ( ruleParameter )
            {
            // InternalTheory.g:3911:2: ( ruleParameter )
            // InternalTheory.g:3912:3: ruleParameter
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
    // InternalTheory.g:3921:1: rule__Theory__ImportsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3925:1: ( ( RULE_ID ) )
            // InternalTheory.g:3926:2: ( RULE_ID )
            {
            // InternalTheory.g:3926:2: ( RULE_ID )
            // InternalTheory.g:3927:3: RULE_ID
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
    // InternalTheory.g:3936:1: rule__Theory__ImportsAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3940:1: ( ( RULE_ID ) )
            // InternalTheory.g:3941:2: ( RULE_ID )
            {
            // InternalTheory.g:3941:2: ( RULE_ID )
            // InternalTheory.g:3942:3: RULE_ID
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
    // InternalTheory.g:3951:1: rule__Theory__TypesAssignment_4_0_1 : ( ruleType ) ;
    public final void rule__Theory__TypesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3955:1: ( ( ruleType ) )
            // InternalTheory.g:3956:2: ( ruleType )
            {
            // InternalTheory.g:3956:2: ( ruleType )
            // InternalTheory.g:3957:3: ruleType
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
    // InternalTheory.g:3966:1: rule__Theory__OperatorsAssignment_4_1_1 : ( ruleOperator ) ;
    public final void rule__Theory__OperatorsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3970:1: ( ( ruleOperator ) )
            // InternalTheory.g:3971:2: ( ruleOperator )
            {
            // InternalTheory.g:3971:2: ( ruleOperator )
            // InternalTheory.g:3972:3: ruleOperator
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
    // InternalTheory.g:3981:1: rule__Theory__AxiomsAssignment_4_2_1 : ( ruleAxiom ) ;
    public final void rule__Theory__AxiomsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3985:1: ( ( ruleAxiom ) )
            // InternalTheory.g:3986:2: ( ruleAxiom )
            {
            // InternalTheory.g:3986:2: ( ruleAxiom )
            // InternalTheory.g:3987:3: ruleAxiom
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


    // $ANTLR start "rule__Theory__VariablesAssignment_4_3_1_1"
    // InternalTheory.g:3996:1: rule__Theory__VariablesAssignment_4_3_1_1 : ( ruleVariable ) ;
    public final void rule__Theory__VariablesAssignment_4_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4000:1: ( ( ruleVariable ) )
            // InternalTheory.g:4001:2: ( ruleVariable )
            {
            // InternalTheory.g:4001:2: ( ruleVariable )
            // InternalTheory.g:4002:3: ruleVariable
            {
             before(grammarAccess.getTheoryAccess().getVariablesVariableParserRuleCall_4_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getVariablesVariableParserRuleCall_4_3_1_1_0()); 

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
    // $ANTLR end "rule__Theory__VariablesAssignment_4_3_1_1"


    // $ANTLR start "rule__Theory__RulesAssignment_4_3_2"
    // InternalTheory.g:4011:1: rule__Theory__RulesAssignment_4_3_2 : ( ruleRule ) ;
    public final void rule__Theory__RulesAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4015:1: ( ( ruleRule ) )
            // InternalTheory.g:4016:2: ( ruleRule )
            {
            // InternalTheory.g:4016:2: ( ruleRule )
            // InternalTheory.g:4017:3: ruleRule
            {
             before(grammarAccess.getTheoryAccess().getRulesRuleParserRuleCall_4_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getRulesRuleParserRuleCall_4_3_2_0()); 

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
    // $ANTLR end "rule__Theory__RulesAssignment_4_3_2"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalTheory.g:4026:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4030:1: ( ( RULE_ID ) )
            // InternalTheory.g:4031:2: ( RULE_ID )
            {
            // InternalTheory.g:4031:2: ( RULE_ID )
            // InternalTheory.g:4032:3: RULE_ID
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


    // $ANTLR start "rule__Type__CommentsAssignment_0"
    // InternalTheory.g:4041:1: rule__Type__CommentsAssignment_0 : ( ( rule__Type__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Type__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4045:1: ( ( ( rule__Type__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4046:2: ( ( rule__Type__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4046:2: ( ( rule__Type__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4047:3: ( rule__Type__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getTypeAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4048:3: ( rule__Type__CommentsAlternatives_0_0 )
            // InternalTheory.g:4048:4: rule__Type__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Type__CommentsAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalTheory.g:4056:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4060:1: ( ( RULE_ID ) )
            // InternalTheory.g:4061:2: ( RULE_ID )
            {
            // InternalTheory.g:4061:2: ( RULE_ID )
            // InternalTheory.g:4062:3: RULE_ID
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
    // InternalTheory.g:4071:1: rule__Type__ParametersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4075:1: ( ( ( RULE_ID ) ) )
            // InternalTheory.g:4076:2: ( ( RULE_ID ) )
            {
            // InternalTheory.g:4076:2: ( ( RULE_ID ) )
            // InternalTheory.g:4077:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getParametersParameterCrossReference_2_1_0()); 
            // InternalTheory.g:4078:3: ( RULE_ID )
            // InternalTheory.g:4079:4: RULE_ID
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
    // InternalTheory.g:4090:1: rule__Type__ConstructorsAssignment_2_4 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4094:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4095:2: ( ruleConstructor )
            {
            // InternalTheory.g:4095:2: ( ruleConstructor )
            // InternalTheory.g:4096:3: ruleConstructor
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
    // InternalTheory.g:4105:1: rule__Type__ConstructorsAssignment_2_5_1 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4109:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4110:2: ( ruleConstructor )
            {
            // InternalTheory.g:4110:2: ( ruleConstructor )
            // InternalTheory.g:4111:3: ruleConstructor
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


    // $ANTLR start "rule__Constructor__CommentsAssignment_0"
    // InternalTheory.g:4120:1: rule__Constructor__CommentsAssignment_0 : ( ( rule__Constructor__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Constructor__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4124:1: ( ( ( rule__Constructor__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4125:2: ( ( rule__Constructor__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4125:2: ( ( rule__Constructor__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4126:3: ( rule__Constructor__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getConstructorAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4127:3: ( rule__Constructor__CommentsAlternatives_0_0 )
            // InternalTheory.g:4127:4: rule__Constructor__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Constructor__CommentsAssignment_0"


    // $ANTLR start "rule__Constructor__NameAssignment_1"
    // InternalTheory.g:4135:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4139:1: ( ( RULE_ID ) )
            // InternalTheory.g:4140:2: ( RULE_ID )
            {
            // InternalTheory.g:4140:2: ( RULE_ID )
            // InternalTheory.g:4141:3: RULE_ID
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
    // InternalTheory.g:4150:1: rule__Constructor__DestructorsAssignment_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4154:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4155:2: ( ruleDestructor )
            {
            // InternalTheory.g:4155:2: ( ruleDestructor )
            // InternalTheory.g:4156:3: ruleDestructor
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
    // InternalTheory.g:4165:1: rule__Constructor__DestructorsAssignment_2_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4169:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4170:2: ( ruleDestructor )
            {
            // InternalTheory.g:4170:2: ( ruleDestructor )
            // InternalTheory.g:4171:3: ruleDestructor
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


    // $ANTLR start "rule__Destructor__CommentsAssignment_0"
    // InternalTheory.g:4180:1: rule__Destructor__CommentsAssignment_0 : ( ( rule__Destructor__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Destructor__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4184:1: ( ( ( rule__Destructor__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4185:2: ( ( rule__Destructor__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4185:2: ( ( rule__Destructor__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4186:3: ( rule__Destructor__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getDestructorAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4187:3: ( rule__Destructor__CommentsAlternatives_0_0 )
            // InternalTheory.g:4187:4: rule__Destructor__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Destructor__CommentsAssignment_0"


    // $ANTLR start "rule__Destructor__NameAssignment_1"
    // InternalTheory.g:4195:1: rule__Destructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4199:1: ( ( RULE_ID ) )
            // InternalTheory.g:4200:2: ( RULE_ID )
            {
            // InternalTheory.g:4200:2: ( RULE_ID )
            // InternalTheory.g:4201:3: RULE_ID
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
    // InternalTheory.g:4210:1: rule__Destructor__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Destructor__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4214:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4215:2: ( RULE_STRING )
            {
            // InternalTheory.g:4215:2: ( RULE_STRING )
            // InternalTheory.g:4216:3: RULE_STRING
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


    // $ANTLR start "rule__Operator__CommentsAssignment_0"
    // InternalTheory.g:4225:1: rule__Operator__CommentsAssignment_0 : ( ( rule__Operator__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Operator__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4229:1: ( ( ( rule__Operator__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4230:2: ( ( rule__Operator__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4230:2: ( ( rule__Operator__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4231:3: ( rule__Operator__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getOperatorAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4232:3: ( rule__Operator__CommentsAlternatives_0_0 )
            // InternalTheory.g:4232:4: rule__Operator__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Operator__CommentsAssignment_0"


    // $ANTLR start "rule__Operator__NameAssignment_1"
    // InternalTheory.g:4240:1: rule__Operator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4244:1: ( ( RULE_ID ) )
            // InternalTheory.g:4245:2: ( RULE_ID )
            {
            // InternalTheory.g:4245:2: ( RULE_ID )
            // InternalTheory.g:4246:3: RULE_ID
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
    // InternalTheory.g:4255:1: rule__Operator__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4259:1: ( ( ruleArgument ) )
            // InternalTheory.g:4260:2: ( ruleArgument )
            {
            // InternalTheory.g:4260:2: ( ruleArgument )
            // InternalTheory.g:4261:3: ruleArgument
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
    // InternalTheory.g:4270:1: rule__Operator__ArgumentsAssignment_2_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4274:1: ( ( ruleArgument ) )
            // InternalTheory.g:4275:2: ( ruleArgument )
            {
            // InternalTheory.g:4275:2: ( ruleArgument )
            // InternalTheory.g:4276:3: ruleArgument
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
    // InternalTheory.g:4285:1: rule__Operator__TypeAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__Operator__TypeAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4289:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4290:2: ( RULE_STRING )
            {
            // InternalTheory.g:4290:2: ( RULE_STRING )
            // InternalTheory.g:4291:3: RULE_STRING
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
    // InternalTheory.g:4300:1: rule__Operator__NotationAssignment_3_1 : ( ruleNotation ) ;
    public final void rule__Operator__NotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4304:1: ( ( ruleNotation ) )
            // InternalTheory.g:4305:2: ( ruleNotation )
            {
            // InternalTheory.g:4305:2: ( ruleNotation )
            // InternalTheory.g:4306:3: ruleNotation
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


    // $ANTLR start "rule__Operator__AssocitiveAssignment_3_2_0"
    // InternalTheory.g:4315:1: rule__Operator__AssocitiveAssignment_3_2_0 : ( ( 'associative' ) ) ;
    public final void rule__Operator__AssocitiveAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4319:1: ( ( ( 'associative' ) ) )
            // InternalTheory.g:4320:2: ( ( 'associative' ) )
            {
            // InternalTheory.g:4320:2: ( ( 'associative' ) )
            // InternalTheory.g:4321:3: ( 'associative' )
            {
             before(grammarAccess.getOperatorAccess().getAssocitiveAssociativeKeyword_3_2_0_0()); 
            // InternalTheory.g:4322:3: ( 'associative' )
            // InternalTheory.g:4323:4: 'associative'
            {
             before(grammarAccess.getOperatorAccess().getAssocitiveAssociativeKeyword_3_2_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getAssocitiveAssociativeKeyword_3_2_0_0()); 

            }

             after(grammarAccess.getOperatorAccess().getAssocitiveAssociativeKeyword_3_2_0_0()); 

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
    // $ANTLR end "rule__Operator__AssocitiveAssignment_3_2_0"


    // $ANTLR start "rule__Operator__CommutativeAssignment_3_2_1"
    // InternalTheory.g:4334:1: rule__Operator__CommutativeAssignment_3_2_1 : ( ( 'commutative' ) ) ;
    public final void rule__Operator__CommutativeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4338:1: ( ( ( 'commutative' ) ) )
            // InternalTheory.g:4339:2: ( ( 'commutative' ) )
            {
            // InternalTheory.g:4339:2: ( ( 'commutative' ) )
            // InternalTheory.g:4340:3: ( 'commutative' )
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 
            // InternalTheory.g:4341:3: ( 'commutative' )
            // InternalTheory.g:4342:4: 'commutative'
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTheory.g:4353:1: rule__Operator__PrecedentAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Operator__PrecedentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4357:1: ( ( RULE_INT ) )
            // InternalTheory.g:4358:2: ( RULE_INT )
            {
            // InternalTheory.g:4358:2: ( RULE_INT )
            // InternalTheory.g:4359:3: RULE_INT
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
    // InternalTheory.g:4368:1: rule__Operator__WdAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Operator__WdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4372:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4373:2: ( RULE_STRING )
            {
            // InternalTheory.g:4373:2: ( RULE_STRING )
            // InternalTheory.g:4374:3: RULE_STRING
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
    // InternalTheory.g:4383:1: rule__Operator__DefinitionAssignment_6_1_0 : ( RULE_STRING ) ;
    public final void rule__Operator__DefinitionAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4387:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4388:2: ( RULE_STRING )
            {
            // InternalTheory.g:4388:2: ( RULE_STRING )
            // InternalTheory.g:4389:3: RULE_STRING
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
    // InternalTheory.g:4398:1: rule__Operator__CaseAssignment_6_1_1_1 : ( RULE_ID ) ;
    public final void rule__Operator__CaseAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4402:1: ( ( RULE_ID ) )
            // InternalTheory.g:4403:2: ( RULE_ID )
            {
            // InternalTheory.g:4403:2: ( RULE_ID )
            // InternalTheory.g:4404:3: RULE_ID
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
    // InternalTheory.g:4413:1: rule__Operator__CasesAssignment_6_1_1_2 : ( ruleCase ) ;
    public final void rule__Operator__CasesAssignment_6_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4417:1: ( ( ruleCase ) )
            // InternalTheory.g:4418:2: ( ruleCase )
            {
            // InternalTheory.g:4418:2: ( ruleCase )
            // InternalTheory.g:4419:3: ruleCase
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


    // $ANTLR start "rule__Argument__CommentsAssignment_0"
    // InternalTheory.g:4428:1: rule__Argument__CommentsAssignment_0 : ( ( rule__Argument__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Argument__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4432:1: ( ( ( rule__Argument__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4433:2: ( ( rule__Argument__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4433:2: ( ( rule__Argument__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4434:3: ( rule__Argument__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getArgumentAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4435:3: ( rule__Argument__CommentsAlternatives_0_0 )
            // InternalTheory.g:4435:4: rule__Argument__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Argument__CommentsAssignment_0"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // InternalTheory.g:4443:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4447:1: ( ( RULE_ID ) )
            // InternalTheory.g:4448:2: ( RULE_ID )
            {
            // InternalTheory.g:4448:2: ( RULE_ID )
            // InternalTheory.g:4449:3: RULE_ID
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
    // InternalTheory.g:4458:1: rule__Argument__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Argument__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4462:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4463:2: ( RULE_STRING )
            {
            // InternalTheory.g:4463:2: ( RULE_STRING )
            // InternalTheory.g:4464:3: RULE_STRING
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
    // InternalTheory.g:4473:1: rule__Case__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Case__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4477:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4478:2: ( RULE_STRING )
            {
            // InternalTheory.g:4478:2: ( RULE_STRING )
            // InternalTheory.g:4479:3: RULE_STRING
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
    // InternalTheory.g:4488:1: rule__Case__FormulaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Case__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4492:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4493:2: ( RULE_STRING )
            {
            // InternalTheory.g:4493:2: ( RULE_STRING )
            // InternalTheory.g:4494:3: RULE_STRING
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


    // $ANTLR start "rule__Axiom__CommentsAssignment_0"
    // InternalTheory.g:4503:1: rule__Axiom__CommentsAssignment_0 : ( ( rule__Axiom__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Axiom__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4507:1: ( ( ( rule__Axiom__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4508:2: ( ( rule__Axiom__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4508:2: ( ( rule__Axiom__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4509:3: ( rule__Axiom__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getAxiomAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4510:3: ( rule__Axiom__CommentsAlternatives_0_0 )
            // InternalTheory.g:4510:4: rule__Axiom__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Axiom__CommentsAssignment_0"


    // $ANTLR start "rule__Axiom__NameAssignment_2"
    // InternalTheory.g:4518:1: rule__Axiom__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Axiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4522:1: ( ( RULE_ID ) )
            // InternalTheory.g:4523:2: ( RULE_ID )
            {
            // InternalTheory.g:4523:2: ( RULE_ID )
            // InternalTheory.g:4524:3: RULE_ID
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
    // InternalTheory.g:4533:1: rule__Axiom__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Axiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4537:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4538:2: ( RULE_STRING )
            {
            // InternalTheory.g:4538:2: ( RULE_STRING )
            // InternalTheory.g:4539:3: RULE_STRING
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


    // $ANTLR start "rule__Axiom__IsTheoremAssignment_5"
    // InternalTheory.g:4548:1: rule__Axiom__IsTheoremAssignment_5 : ( ( 'theorem' ) ) ;
    public final void rule__Axiom__IsTheoremAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4552:1: ( ( ( 'theorem' ) ) )
            // InternalTheory.g:4553:2: ( ( 'theorem' ) )
            {
            // InternalTheory.g:4553:2: ( ( 'theorem' ) )
            // InternalTheory.g:4554:3: ( 'theorem' )
            {
             before(grammarAccess.getAxiomAccess().getIsTheoremTheoremKeyword_5_0()); 
            // InternalTheory.g:4555:3: ( 'theorem' )
            // InternalTheory.g:4556:4: 'theorem'
            {
             before(grammarAccess.getAxiomAccess().getIsTheoremTheoremKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getIsTheoremTheoremKeyword_5_0()); 

            }

             after(grammarAccess.getAxiomAccess().getIsTheoremTheoremKeyword_5_0()); 

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
    // $ANTLR end "rule__Axiom__IsTheoremAssignment_5"


    // $ANTLR start "rule__Variable__CommentsAssignment_0"
    // InternalTheory.g:4567:1: rule__Variable__CommentsAssignment_0 : ( ( rule__Variable__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Variable__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4571:1: ( ( ( rule__Variable__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4572:2: ( ( rule__Variable__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4572:2: ( ( rule__Variable__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4573:3: ( rule__Variable__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getVariableAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4574:3: ( rule__Variable__CommentsAlternatives_0_0 )
            // InternalTheory.g:4574:4: rule__Variable__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Variable__CommentsAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalTheory.g:4582:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4586:1: ( ( RULE_ID ) )
            // InternalTheory.g:4587:2: ( RULE_ID )
            {
            // InternalTheory.g:4587:2: ( RULE_ID )
            // InternalTheory.g:4588:3: RULE_ID
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
    // InternalTheory.g:4597:1: rule__Variable__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4601:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4602:2: ( RULE_STRING )
            {
            // InternalTheory.g:4602:2: ( RULE_STRING )
            // InternalTheory.g:4603:3: RULE_STRING
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


    // $ANTLR start "rule__Rule__CommentsAssignment_0"
    // InternalTheory.g:4612:1: rule__Rule__CommentsAssignment_0 : ( ( rule__Rule__CommentsAlternatives_0_0 ) ) ;
    public final void rule__Rule__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4616:1: ( ( ( rule__Rule__CommentsAlternatives_0_0 ) ) )
            // InternalTheory.g:4617:2: ( ( rule__Rule__CommentsAlternatives_0_0 ) )
            {
            // InternalTheory.g:4617:2: ( ( rule__Rule__CommentsAlternatives_0_0 ) )
            // InternalTheory.g:4618:3: ( rule__Rule__CommentsAlternatives_0_0 )
            {
             before(grammarAccess.getRuleAccess().getCommentsAlternatives_0_0()); 
            // InternalTheory.g:4619:3: ( rule__Rule__CommentsAlternatives_0_0 )
            // InternalTheory.g:4619:4: rule__Rule__CommentsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__CommentsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getCommentsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Rule__CommentsAssignment_0"


    // $ANTLR start "rule__Rule__NameAssignment_2"
    // InternalTheory.g:4627:1: rule__Rule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4631:1: ( ( RULE_ID ) )
            // InternalTheory.g:4632:2: ( RULE_ID )
            {
            // InternalTheory.g:4632:2: ( RULE_ID )
            // InternalTheory.g:4633:3: RULE_ID
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


    // $ANTLR start "rule__Rule__RuleAssignment_4_0"
    // InternalTheory.g:4642:1: rule__Rule__RuleAssignment_4_0 : ( ruleRewriteRule ) ;
    public final void rule__Rule__RuleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4646:1: ( ( ruleRewriteRule ) )
            // InternalTheory.g:4647:2: ( ruleRewriteRule )
            {
            // InternalTheory.g:4647:2: ( ruleRewriteRule )
            // InternalTheory.g:4648:3: ruleRewriteRule
            {
             before(grammarAccess.getRuleAccess().getRuleRewriteRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRuleRewriteRuleParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Rule__RuleAssignment_4_0"


    // $ANTLR start "rule__Rule__RuleAssignment_4_1"
    // InternalTheory.g:4657:1: rule__Rule__RuleAssignment_4_1 : ( ruleInferenceRule ) ;
    public final void rule__Rule__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4661:1: ( ( ruleInferenceRule ) )
            // InternalTheory.g:4662:2: ( ruleInferenceRule )
            {
            // InternalTheory.g:4662:2: ( ruleInferenceRule )
            // InternalTheory.g:4663:3: ruleInferenceRule
            {
             before(grammarAccess.getRuleAccess().getRuleInferenceRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRuleInferenceRuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Rule__RuleAssignment_4_1"


    // $ANTLR start "rule__RewriteRule__PatternAssignment_0"
    // InternalTheory.g:4672:1: rule__RewriteRule__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RewriteRule__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4676:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4677:2: ( RULE_STRING )
            {
            // InternalTheory.g:4677:2: ( RULE_STRING )
            // InternalTheory.g:4678:3: RULE_STRING
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


    // $ANTLR start "rule__RewriteRule__RuleAssignment_2_0"
    // InternalTheory.g:4687:1: rule__RewriteRule__RuleAssignment_2_0 : ( ruleUnconditionalRewrite ) ;
    public final void rule__RewriteRule__RuleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4691:1: ( ( ruleUnconditionalRewrite ) )
            // InternalTheory.g:4692:2: ( ruleUnconditionalRewrite )
            {
            // InternalTheory.g:4692:2: ( ruleUnconditionalRewrite )
            // InternalTheory.g:4693:3: ruleUnconditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getRuleUnconditionalRewriteParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnconditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getRuleUnconditionalRewriteParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__RewriteRule__RuleAssignment_2_0"


    // $ANTLR start "rule__RewriteRule__RuleAssignment_2_1"
    // InternalTheory.g:4702:1: rule__RewriteRule__RuleAssignment_2_1 : ( ruleConditionalRewrite ) ;
    public final void rule__RewriteRule__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4706:1: ( ( ruleConditionalRewrite ) )
            // InternalTheory.g:4707:2: ( ruleConditionalRewrite )
            {
            // InternalTheory.g:4707:2: ( ruleConditionalRewrite )
            // InternalTheory.g:4708:3: ruleConditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getRuleConditionalRewriteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getRuleConditionalRewriteParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RewriteRule__RuleAssignment_2_1"


    // $ANTLR start "rule__InferenceRule__GivenAssignment_0"
    // InternalTheory.g:4717:1: rule__InferenceRule__GivenAssignment_0 : ( ruleGiven ) ;
    public final void rule__InferenceRule__GivenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4721:1: ( ( ruleGiven ) )
            // InternalTheory.g:4722:2: ( ruleGiven )
            {
            // InternalTheory.g:4722:2: ( ruleGiven )
            // InternalTheory.g:4723:3: ruleGiven
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
    // InternalTheory.g:4732:1: rule__InferenceRule__InferAssignment_2 : ( ruleInfer ) ;
    public final void rule__InferenceRule__InferAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4736:1: ( ( ruleInfer ) )
            // InternalTheory.g:4737:2: ( ruleInfer )
            {
            // InternalTheory.g:4737:2: ( ruleInfer )
            // InternalTheory.g:4738:3: ruleInfer
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


    // $ANTLR start "rule__Given__PredicateAssignment_0"
    // InternalTheory.g:4747:1: rule__Given__PredicateAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Given__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4751:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4752:2: ( RULE_STRING )
            {
            // InternalTheory.g:4752:2: ( RULE_STRING )
            // InternalTheory.g:4753:3: RULE_STRING
            {
             before(grammarAccess.getGivenAccess().getPredicateSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getPredicateSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Given__PredicateAssignment_0"


    // $ANTLR start "rule__Given__RequiredAssignment_1"
    // InternalTheory.g:4762:1: rule__Given__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Given__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4766:1: ( ( ( 'required' ) ) )
            // InternalTheory.g:4767:2: ( ( 'required' ) )
            {
            // InternalTheory.g:4767:2: ( ( 'required' ) )
            // InternalTheory.g:4768:3: ( 'required' )
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalTheory.g:4769:3: ( 'required' )
            // InternalTheory.g:4770:4: 'required'
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


    // $ANTLR start "rule__Infer__PredicateAssignment"
    // InternalTheory.g:4781:1: rule__Infer__PredicateAssignment : ( RULE_STRING ) ;
    public final void rule__Infer__PredicateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4785:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4786:2: ( RULE_STRING )
            {
            // InternalTheory.g:4786:2: ( RULE_STRING )
            // InternalTheory.g:4787:3: RULE_STRING
            {
             before(grammarAccess.getInferAccess().getPredicateSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInferAccess().getPredicateSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Infer__PredicateAssignment"


    // $ANTLR start "rule__UnconditionalRewrite__RhsAssignment"
    // InternalTheory.g:4796:1: rule__UnconditionalRewrite__RhsAssignment : ( RULE_STRING ) ;
    public final void rule__UnconditionalRewrite__RhsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4800:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4801:2: ( RULE_STRING )
            {
            // InternalTheory.g:4801:2: ( RULE_STRING )
            // InternalTheory.g:4802:3: RULE_STRING
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
    // InternalTheory.g:4811:1: rule__ConditionalRewrite__RewritesAssignment_0 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4815:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:4816:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:4816:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:4817:3: ruleConditionalRewriteRule
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
    // InternalTheory.g:4826:1: rule__ConditionalRewrite__RewritesAssignment_1 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4830:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:4831:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:4831:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:4832:3: ruleConditionalRewriteRule
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


    // $ANTLR start "rule__ConditionalRewriteRule__LshAssignment_0"
    // InternalTheory.g:4841:1: rule__ConditionalRewriteRule__LshAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__LshAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4845:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4846:2: ( RULE_STRING )
            {
            // InternalTheory.g:4846:2: ( RULE_STRING )
            // InternalTheory.g:4847:3: RULE_STRING
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLshSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getLshSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__LshAssignment_0"


    // $ANTLR start "rule__ConditionalRewriteRule__RhsAssignment_2"
    // InternalTheory.g:4856:1: rule__ConditionalRewriteRule__RhsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4860:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4861:2: ( RULE_STRING )
            {
            // InternalTheory.g:4861:2: ( RULE_STRING )
            // InternalTheory.g:4862:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007D8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100800030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100800032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000808013800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000031000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000808003802L});

}
