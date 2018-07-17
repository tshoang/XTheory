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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'prefix'", "'infix'", "'postfix'", "'theory'", "'end'", "'('", "')'", "'imports'", "'types'", "'operators'", "'axioms'", "'theorems'", "'rules'", "'='", "'|'", "','", "':'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'variables'", "'=='", "'|-'", "'associative'", "'commutative'", "'required'"
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


    // $ANTLR start "entryRuleRuleBlock"
    // InternalTheory.g:303:1: entryRuleRuleBlock : ruleRuleBlock EOF ;
    public final void entryRuleRuleBlock() throws RecognitionException {
        try {
            // InternalTheory.g:304:1: ( ruleRuleBlock EOF )
            // InternalTheory.g:305:1: ruleRuleBlock EOF
            {
             before(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getRuleBlockRule()); 
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
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalTheory.g:312:1: ruleRuleBlock : ( ( rule__RuleBlock__Group__0 ) ) ;
    public final void ruleRuleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:316:2: ( ( ( rule__RuleBlock__Group__0 ) ) )
            // InternalTheory.g:317:2: ( ( rule__RuleBlock__Group__0 ) )
            {
            // InternalTheory.g:317:2: ( ( rule__RuleBlock__Group__0 ) )
            // InternalTheory.g:318:3: ( rule__RuleBlock__Group__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup()); 
            // InternalTheory.g:319:3: ( rule__RuleBlock__Group__0 )
            // InternalTheory.g:319:4: rule__RuleBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBlock"


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
    // InternalTheory.g:337:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:341:2: ( ( ( rule__Rule__Alternatives ) ) )
            // InternalTheory.g:342:2: ( ( rule__Rule__Alternatives ) )
            {
            // InternalTheory.g:342:2: ( ( rule__Rule__Alternatives ) )
            // InternalTheory.g:343:3: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // InternalTheory.g:344:3: ( rule__Rule__Alternatives )
            // InternalTheory.g:344:4: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:353:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTheory.g:354:1: ( ruleVariable EOF )
            // InternalTheory.g:355:1: ruleVariable EOF
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
    // InternalTheory.g:362:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:366:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTheory.g:367:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTheory.g:367:2: ( ( rule__Variable__Group__0 ) )
            // InternalTheory.g:368:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTheory.g:369:3: ( rule__Variable__Group__0 )
            // InternalTheory.g:369:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:378:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:379:1: ( ruleRewriteRule EOF )
            // InternalTheory.g:380:1: ruleRewriteRule EOF
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
    // InternalTheory.g:387:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:391:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // InternalTheory.g:392:2: ( ( rule__RewriteRule__Group__0 ) )
            {
            // InternalTheory.g:392:2: ( ( rule__RewriteRule__Group__0 ) )
            // InternalTheory.g:393:3: ( rule__RewriteRule__Group__0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:394:3: ( rule__RewriteRule__Group__0 )
            // InternalTheory.g:394:4: rule__RewriteRule__Group__0
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
    // InternalTheory.g:403:1: entryRuleInferenceRule : ruleInferenceRule EOF ;
    public final void entryRuleInferenceRule() throws RecognitionException {
        try {
            // InternalTheory.g:404:1: ( ruleInferenceRule EOF )
            // InternalTheory.g:405:1: ruleInferenceRule EOF
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
    // InternalTheory.g:412:1: ruleInferenceRule : ( ( rule__InferenceRule__Group__0 ) ) ;
    public final void ruleInferenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:416:2: ( ( ( rule__InferenceRule__Group__0 ) ) )
            // InternalTheory.g:417:2: ( ( rule__InferenceRule__Group__0 ) )
            {
            // InternalTheory.g:417:2: ( ( rule__InferenceRule__Group__0 ) )
            // InternalTheory.g:418:3: ( rule__InferenceRule__Group__0 )
            {
             before(grammarAccess.getInferenceRuleAccess().getGroup()); 
            // InternalTheory.g:419:3: ( rule__InferenceRule__Group__0 )
            // InternalTheory.g:419:4: rule__InferenceRule__Group__0
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
    // InternalTheory.g:428:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalTheory.g:429:1: ( ruleGiven EOF )
            // InternalTheory.g:430:1: ruleGiven EOF
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
    // InternalTheory.g:437:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:441:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalTheory.g:442:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalTheory.g:442:2: ( ( rule__Given__Group__0 ) )
            // InternalTheory.g:443:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalTheory.g:444:3: ( rule__Given__Group__0 )
            // InternalTheory.g:444:4: rule__Given__Group__0
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
    // InternalTheory.g:453:1: entryRuleInfer : ruleInfer EOF ;
    public final void entryRuleInfer() throws RecognitionException {
        try {
            // InternalTheory.g:454:1: ( ruleInfer EOF )
            // InternalTheory.g:455:1: ruleInfer EOF
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
    // InternalTheory.g:462:1: ruleInfer : ( ( rule__Infer__ExpressionAssignment ) ) ;
    public final void ruleInfer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:466:2: ( ( ( rule__Infer__ExpressionAssignment ) ) )
            // InternalTheory.g:467:2: ( ( rule__Infer__ExpressionAssignment ) )
            {
            // InternalTheory.g:467:2: ( ( rule__Infer__ExpressionAssignment ) )
            // InternalTheory.g:468:3: ( rule__Infer__ExpressionAssignment )
            {
             before(grammarAccess.getInferAccess().getExpressionAssignment()); 
            // InternalTheory.g:469:3: ( rule__Infer__ExpressionAssignment )
            // InternalTheory.g:469:4: rule__Infer__ExpressionAssignment
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
    // InternalTheory.g:478:1: entryRuleUnconditionalRewrite : ruleUnconditionalRewrite EOF ;
    public final void entryRuleUnconditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:479:1: ( ruleUnconditionalRewrite EOF )
            // InternalTheory.g:480:1: ruleUnconditionalRewrite EOF
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
    // InternalTheory.g:487:1: ruleUnconditionalRewrite : ( ( rule__UnconditionalRewrite__RhsAssignment ) ) ;
    public final void ruleUnconditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:491:2: ( ( ( rule__UnconditionalRewrite__RhsAssignment ) ) )
            // InternalTheory.g:492:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            {
            // InternalTheory.g:492:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            // InternalTheory.g:493:3: ( rule__UnconditionalRewrite__RhsAssignment )
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 
            // InternalTheory.g:494:3: ( rule__UnconditionalRewrite__RhsAssignment )
            // InternalTheory.g:494:4: rule__UnconditionalRewrite__RhsAssignment
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
    // InternalTheory.g:503:1: entryRuleConditionalRewrite : ruleConditionalRewrite EOF ;
    public final void entryRuleConditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:504:1: ( ruleConditionalRewrite EOF )
            // InternalTheory.g:505:1: ruleConditionalRewrite EOF
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
    // InternalTheory.g:512:1: ruleConditionalRewrite : ( ( rule__ConditionalRewrite__Group__0 ) ) ;
    public final void ruleConditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:516:2: ( ( ( rule__ConditionalRewrite__Group__0 ) ) )
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            {
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            // InternalTheory.g:518:3: ( rule__ConditionalRewrite__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getGroup()); 
            // InternalTheory.g:519:3: ( rule__ConditionalRewrite__Group__0 )
            // InternalTheory.g:519:4: rule__ConditionalRewrite__Group__0
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
    // InternalTheory.g:528:1: entryRuleConditionalRewriteRule : ruleConditionalRewriteRule EOF ;
    public final void entryRuleConditionalRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:529:1: ( ruleConditionalRewriteRule EOF )
            // InternalTheory.g:530:1: ruleConditionalRewriteRule EOF
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
    // InternalTheory.g:537:1: ruleConditionalRewriteRule : ( ( rule__ConditionalRewriteRule__Group__0 ) ) ;
    public final void ruleConditionalRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:541:2: ( ( ( rule__ConditionalRewriteRule__Group__0 ) ) )
            // InternalTheory.g:542:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            {
            // InternalTheory.g:542:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            // InternalTheory.g:543:3: ( rule__ConditionalRewriteRule__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:544:3: ( rule__ConditionalRewriteRule__Group__0 )
            // InternalTheory.g:544:4: rule__ConditionalRewriteRule__Group__0
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
    // InternalTheory.g:553:1: ruleNotation : ( ( rule__Notation__Alternatives ) ) ;
    public final void ruleNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:557:1: ( ( ( rule__Notation__Alternatives ) ) )
            // InternalTheory.g:558:2: ( ( rule__Notation__Alternatives ) )
            {
            // InternalTheory.g:558:2: ( ( rule__Notation__Alternatives ) )
            // InternalTheory.g:559:3: ( rule__Notation__Alternatives )
            {
             before(grammarAccess.getNotationAccess().getAlternatives()); 
            // InternalTheory.g:560:3: ( rule__Notation__Alternatives )
            // InternalTheory.g:560:4: rule__Notation__Alternatives
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
    // InternalTheory.g:568:1: rule__Theory__Alternatives_4 : ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) );
    public final void rule__Theory__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:572:1: ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) )
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
                    // InternalTheory.g:573:2: ( ( rule__Theory__Group_4_0__0 ) )
                    {
                    // InternalTheory.g:573:2: ( ( rule__Theory__Group_4_0__0 ) )
                    // InternalTheory.g:574:3: ( rule__Theory__Group_4_0__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_0()); 
                    // InternalTheory.g:575:3: ( rule__Theory__Group_4_0__0 )
                    // InternalTheory.g:575:4: rule__Theory__Group_4_0__0
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
                    // InternalTheory.g:579:2: ( ( rule__Theory__Group_4_1__0 ) )
                    {
                    // InternalTheory.g:579:2: ( ( rule__Theory__Group_4_1__0 ) )
                    // InternalTheory.g:580:3: ( rule__Theory__Group_4_1__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_1()); 
                    // InternalTheory.g:581:3: ( rule__Theory__Group_4_1__0 )
                    // InternalTheory.g:581:4: rule__Theory__Group_4_1__0
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
                    // InternalTheory.g:585:2: ( ( rule__Theory__Group_4_2__0 ) )
                    {
                    // InternalTheory.g:585:2: ( ( rule__Theory__Group_4_2__0 ) )
                    // InternalTheory.g:586:3: ( rule__Theory__Group_4_2__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_2()); 
                    // InternalTheory.g:587:3: ( rule__Theory__Group_4_2__0 )
                    // InternalTheory.g:587:4: rule__Theory__Group_4_2__0
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
                    // InternalTheory.g:591:2: ( ( rule__Theory__Group_4_3__0 ) )
                    {
                    // InternalTheory.g:591:2: ( ( rule__Theory__Group_4_3__0 ) )
                    // InternalTheory.g:592:3: ( rule__Theory__Group_4_3__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_3()); 
                    // InternalTheory.g:593:3: ( rule__Theory__Group_4_3__0 )
                    // InternalTheory.g:593:4: rule__Theory__Group_4_3__0
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
                    // InternalTheory.g:597:2: ( ( rule__Theory__Group_4_4__0 ) )
                    {
                    // InternalTheory.g:597:2: ( ( rule__Theory__Group_4_4__0 ) )
                    // InternalTheory.g:598:3: ( rule__Theory__Group_4_4__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_4()); 
                    // InternalTheory.g:599:3: ( rule__Theory__Group_4_4__0 )
                    // InternalTheory.g:599:4: rule__Theory__Group_4_4__0
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
    // InternalTheory.g:607:1: rule__Type__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Type__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:611:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:612:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:612:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:613:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getTypeAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:618:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:618:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:619:3: RULE_SL_COMMENT
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
    // InternalTheory.g:628:1: rule__Constructor__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Constructor__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:632:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:633:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:633:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:634:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getConstructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getConstructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:639:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:639:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:640:3: RULE_SL_COMMENT
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
    // InternalTheory.g:649:1: rule__Destructor__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Destructor__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:653:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:654:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:654:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:655:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getDestructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDestructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:660:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:660:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:661:3: RULE_SL_COMMENT
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
    // InternalTheory.g:670:1: rule__Operator__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Operator__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:674:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:675:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:675:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:676:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getOperatorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:681:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:681:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:682:3: RULE_SL_COMMENT
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
    // InternalTheory.g:691:1: rule__Operator__Alternatives_6_1 : ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) );
    public final void rule__Operator__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:695:1: ( ( ( rule__Operator__DefinitionAssignment_6_1_0 ) ) | ( ( rule__Operator__Group_6_1_1__0 ) ) )
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
                    // InternalTheory.g:696:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    {
                    // InternalTheory.g:696:2: ( ( rule__Operator__DefinitionAssignment_6_1_0 ) )
                    // InternalTheory.g:697:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    {
                     before(grammarAccess.getOperatorAccess().getDefinitionAssignment_6_1_0()); 
                    // InternalTheory.g:698:3: ( rule__Operator__DefinitionAssignment_6_1_0 )
                    // InternalTheory.g:698:4: rule__Operator__DefinitionAssignment_6_1_0
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
                    // InternalTheory.g:702:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    {
                    // InternalTheory.g:702:2: ( ( rule__Operator__Group_6_1_1__0 ) )
                    // InternalTheory.g:703:3: ( rule__Operator__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_6_1_1()); 
                    // InternalTheory.g:704:3: ( rule__Operator__Group_6_1_1__0 )
                    // InternalTheory.g:704:4: rule__Operator__Group_6_1_1__0
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
    // InternalTheory.g:712:1: rule__Argument__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Argument__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:716:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:717:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:717:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:718:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getArgumentAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:723:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:723:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:724:3: RULE_SL_COMMENT
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
    // InternalTheory.g:733:1: rule__Axiom__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Axiom__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:737:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:738:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:738:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:739:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getAxiomAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAxiomAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:744:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:744:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:745:3: RULE_SL_COMMENT
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
    // InternalTheory.g:754:1: rule__Theorem__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Theorem__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:758:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:759:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:759:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:760:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getTheoremAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getTheoremAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:765:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:765:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:766:3: RULE_SL_COMMENT
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


    // $ANTLR start "rule__RuleBlock__CommentAlternatives_0_0"
    // InternalTheory.g:775:1: rule__RuleBlock__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__RuleBlock__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:779:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalTheory.g:780:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:780:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:781:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getRuleBlockAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleBlockAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:786:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:786:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:787:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getRuleBlockAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getRuleBlockAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__RuleBlock__CommentAlternatives_0_0"


    // $ANTLR start "rule__Rule__Alternatives"
    // InternalTheory.g:796:1: rule__Rule__Alternatives : ( ( ( rule__Rule__RruleAssignment_0 ) ) | ( ( rule__Rule__IruleAssignment_1 ) ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:800:1: ( ( ( rule__Rule__RruleAssignment_0 ) ) | ( ( rule__Rule__IruleAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==34) ) {
                    alt11=1;
                }
                else if ( (LA11_1==RULE_STRING||LA11_1==35||LA11_1==38) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTheory.g:801:2: ( ( rule__Rule__RruleAssignment_0 ) )
                    {
                    // InternalTheory.g:801:2: ( ( rule__Rule__RruleAssignment_0 ) )
                    // InternalTheory.g:802:3: ( rule__Rule__RruleAssignment_0 )
                    {
                     before(grammarAccess.getRuleAccess().getRruleAssignment_0()); 
                    // InternalTheory.g:803:3: ( rule__Rule__RruleAssignment_0 )
                    // InternalTheory.g:803:4: rule__Rule__RruleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__RruleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getRruleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:807:2: ( ( rule__Rule__IruleAssignment_1 ) )
                    {
                    // InternalTheory.g:807:2: ( ( rule__Rule__IruleAssignment_1 ) )
                    // InternalTheory.g:808:3: ( rule__Rule__IruleAssignment_1 )
                    {
                     before(grammarAccess.getRuleAccess().getIruleAssignment_1()); 
                    // InternalTheory.g:809:3: ( rule__Rule__IruleAssignment_1 )
                    // InternalTheory.g:809:4: rule__Rule__IruleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__IruleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getIruleAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__Variable__CommentAlternatives_0_0"
    // InternalTheory.g:817:1: rule__Variable__CommentAlternatives_0_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Variable__CommentAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:821:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_SL_COMMENT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTheory.g:822:2: ( RULE_ML_COMMENT )
                    {
                    // InternalTheory.g:822:2: ( RULE_ML_COMMENT )
                    // InternalTheory.g:823:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getVariableAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:828:2: ( RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:828:2: ( RULE_SL_COMMENT )
                    // InternalTheory.g:829:3: RULE_SL_COMMENT
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


    // $ANTLR start "rule__RewriteRule__Alternatives_2"
    // InternalTheory.g:838:1: rule__RewriteRule__Alternatives_2 : ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) );
    public final void rule__RewriteRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:842:1: ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_ML_COMMENT && LA13_1<=RULE_SL_COMMENT)||LA13_1==15||(LA13_1>=19 && LA13_1<=23)||LA13_1==32) ) {
                    alt13=1;
                }
                else if ( (LA13_1==31) ) {
                    alt13=2;
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
                    // InternalTheory.g:843:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    {
                    // InternalTheory.g:843:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    // InternalTheory.g:844:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0()); 
                    // InternalTheory.g:845:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    // InternalTheory.g:845:4: rule__RewriteRule__UruleAssignment_2_0
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
                    // InternalTheory.g:849:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    {
                    // InternalTheory.g:849:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    // InternalTheory.g:850:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1()); 
                    // InternalTheory.g:851:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    // InternalTheory.g:851:4: rule__RewriteRule__CruleAssignment_2_1
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
    // InternalTheory.g:859:1: rule__Notation__Alternatives : ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) );
    public final void rule__Notation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:863:1: ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) )
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
                    // InternalTheory.g:864:2: ( ( 'prefix' ) )
                    {
                    // InternalTheory.g:864:2: ( ( 'prefix' ) )
                    // InternalTheory.g:865:3: ( 'prefix' )
                    {
                     before(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 
                    // InternalTheory.g:866:3: ( 'prefix' )
                    // InternalTheory.g:866:4: 'prefix'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:870:2: ( ( 'infix' ) )
                    {
                    // InternalTheory.g:870:2: ( ( 'infix' ) )
                    // InternalTheory.g:871:3: ( 'infix' )
                    {
                     before(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 
                    // InternalTheory.g:872:3: ( 'infix' )
                    // InternalTheory.g:872:4: 'infix'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:876:2: ( ( 'postfix' ) )
                    {
                    // InternalTheory.g:876:2: ( ( 'postfix' ) )
                    // InternalTheory.g:877:3: ( 'postfix' )
                    {
                     before(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 
                    // InternalTheory.g:878:3: ( 'postfix' )
                    // InternalTheory.g:878:4: 'postfix'
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
    // InternalTheory.g:886:1: rule__Theory__Group__0 : rule__Theory__Group__0__Impl rule__Theory__Group__1 ;
    public final void rule__Theory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:890:1: ( rule__Theory__Group__0__Impl rule__Theory__Group__1 )
            // InternalTheory.g:891:2: rule__Theory__Group__0__Impl rule__Theory__Group__1
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
    // InternalTheory.g:898:1: rule__Theory__Group__0__Impl : ( 'theory' ) ;
    public final void rule__Theory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:902:1: ( ( 'theory' ) )
            // InternalTheory.g:903:1: ( 'theory' )
            {
            // InternalTheory.g:903:1: ( 'theory' )
            // InternalTheory.g:904:2: 'theory'
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
    // InternalTheory.g:913:1: rule__Theory__Group__1 : rule__Theory__Group__1__Impl rule__Theory__Group__2 ;
    public final void rule__Theory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:917:1: ( rule__Theory__Group__1__Impl rule__Theory__Group__2 )
            // InternalTheory.g:918:2: rule__Theory__Group__1__Impl rule__Theory__Group__2
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
    // InternalTheory.g:925:1: rule__Theory__Group__1__Impl : ( ( rule__Theory__NameAssignment_1 ) ) ;
    public final void rule__Theory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:929:1: ( ( ( rule__Theory__NameAssignment_1 ) ) )
            // InternalTheory.g:930:1: ( ( rule__Theory__NameAssignment_1 ) )
            {
            // InternalTheory.g:930:1: ( ( rule__Theory__NameAssignment_1 ) )
            // InternalTheory.g:931:2: ( rule__Theory__NameAssignment_1 )
            {
             before(grammarAccess.getTheoryAccess().getNameAssignment_1()); 
            // InternalTheory.g:932:2: ( rule__Theory__NameAssignment_1 )
            // InternalTheory.g:932:3: rule__Theory__NameAssignment_1
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
    // InternalTheory.g:940:1: rule__Theory__Group__2 : rule__Theory__Group__2__Impl rule__Theory__Group__3 ;
    public final void rule__Theory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:944:1: ( rule__Theory__Group__2__Impl rule__Theory__Group__3 )
            // InternalTheory.g:945:2: rule__Theory__Group__2__Impl rule__Theory__Group__3
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
    // InternalTheory.g:952:1: rule__Theory__Group__2__Impl : ( ( rule__Theory__Group_2__0 )? ) ;
    public final void rule__Theory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:956:1: ( ( ( rule__Theory__Group_2__0 )? ) )
            // InternalTheory.g:957:1: ( ( rule__Theory__Group_2__0 )? )
            {
            // InternalTheory.g:957:1: ( ( rule__Theory__Group_2__0 )? )
            // InternalTheory.g:958:2: ( rule__Theory__Group_2__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_2()); 
            // InternalTheory.g:959:2: ( rule__Theory__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTheory.g:959:3: rule__Theory__Group_2__0
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
    // InternalTheory.g:967:1: rule__Theory__Group__3 : rule__Theory__Group__3__Impl rule__Theory__Group__4 ;
    public final void rule__Theory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:971:1: ( rule__Theory__Group__3__Impl rule__Theory__Group__4 )
            // InternalTheory.g:972:2: rule__Theory__Group__3__Impl rule__Theory__Group__4
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
    // InternalTheory.g:979:1: rule__Theory__Group__3__Impl : ( ( rule__Theory__Group_3__0 )? ) ;
    public final void rule__Theory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:983:1: ( ( ( rule__Theory__Group_3__0 )? ) )
            // InternalTheory.g:984:1: ( ( rule__Theory__Group_3__0 )? )
            {
            // InternalTheory.g:984:1: ( ( rule__Theory__Group_3__0 )? )
            // InternalTheory.g:985:2: ( rule__Theory__Group_3__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_3()); 
            // InternalTheory.g:986:2: ( rule__Theory__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTheory.g:986:3: rule__Theory__Group_3__0
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
    // InternalTheory.g:994:1: rule__Theory__Group__4 : rule__Theory__Group__4__Impl rule__Theory__Group__5 ;
    public final void rule__Theory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:998:1: ( rule__Theory__Group__4__Impl rule__Theory__Group__5 )
            // InternalTheory.g:999:2: rule__Theory__Group__4__Impl rule__Theory__Group__5
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
    // InternalTheory.g:1006:1: rule__Theory__Group__4__Impl : ( ( rule__Theory__Alternatives_4 )* ) ;
    public final void rule__Theory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1010:1: ( ( ( rule__Theory__Alternatives_4 )* ) )
            // InternalTheory.g:1011:1: ( ( rule__Theory__Alternatives_4 )* )
            {
            // InternalTheory.g:1011:1: ( ( rule__Theory__Alternatives_4 )* )
            // InternalTheory.g:1012:2: ( rule__Theory__Alternatives_4 )*
            {
             before(grammarAccess.getTheoryAccess().getAlternatives_4()); 
            // InternalTheory.g:1013:2: ( rule__Theory__Alternatives_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTheory.g:1013:3: rule__Theory__Alternatives_4
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
    // InternalTheory.g:1021:1: rule__Theory__Group__5 : rule__Theory__Group__5__Impl ;
    public final void rule__Theory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1025:1: ( rule__Theory__Group__5__Impl )
            // InternalTheory.g:1026:2: rule__Theory__Group__5__Impl
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
    // InternalTheory.g:1032:1: rule__Theory__Group__5__Impl : ( 'end' ) ;
    public final void rule__Theory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1036:1: ( ( 'end' ) )
            // InternalTheory.g:1037:1: ( 'end' )
            {
            // InternalTheory.g:1037:1: ( 'end' )
            // InternalTheory.g:1038:2: 'end'
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
    // InternalTheory.g:1048:1: rule__Theory__Group_2__0 : rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 ;
    public final void rule__Theory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1052:1: ( rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 )
            // InternalTheory.g:1053:2: rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1
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
    // InternalTheory.g:1060:1: rule__Theory__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Theory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1064:1: ( ( '(' ) )
            // InternalTheory.g:1065:1: ( '(' )
            {
            // InternalTheory.g:1065:1: ( '(' )
            // InternalTheory.g:1066:2: '('
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
    // InternalTheory.g:1075:1: rule__Theory__Group_2__1 : rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 ;
    public final void rule__Theory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1079:1: ( rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 )
            // InternalTheory.g:1080:2: rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2
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
    // InternalTheory.g:1087:1: rule__Theory__Group_2__1__Impl : ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Theory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1091:1: ( ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1092:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1092:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1093:2: ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1093:2: ( ( rule__Theory__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1094:3: ( rule__Theory__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1095:3: ( rule__Theory__ParametersAssignment_2_1 )
            // InternalTheory.g:1095:4: rule__Theory__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Theory__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1098:2: ( ( rule__Theory__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1099:3: ( rule__Theory__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1100:3: ( rule__Theory__ParametersAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTheory.g:1100:4: rule__Theory__ParametersAssignment_2_1
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
    // InternalTheory.g:1109:1: rule__Theory__Group_2__2 : rule__Theory__Group_2__2__Impl ;
    public final void rule__Theory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1113:1: ( rule__Theory__Group_2__2__Impl )
            // InternalTheory.g:1114:2: rule__Theory__Group_2__2__Impl
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
    // InternalTheory.g:1120:1: rule__Theory__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Theory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1124:1: ( ( ')' ) )
            // InternalTheory.g:1125:1: ( ')' )
            {
            // InternalTheory.g:1125:1: ( ')' )
            // InternalTheory.g:1126:2: ')'
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
    // InternalTheory.g:1136:1: rule__Theory__Group_3__0 : rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 ;
    public final void rule__Theory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1140:1: ( rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 )
            // InternalTheory.g:1141:2: rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1
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
    // InternalTheory.g:1148:1: rule__Theory__Group_3__0__Impl : ( 'imports' ) ;
    public final void rule__Theory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1152:1: ( ( 'imports' ) )
            // InternalTheory.g:1153:1: ( 'imports' )
            {
            // InternalTheory.g:1153:1: ( 'imports' )
            // InternalTheory.g:1154:2: 'imports'
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
    // InternalTheory.g:1163:1: rule__Theory__Group_3__1 : rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 ;
    public final void rule__Theory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1167:1: ( rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 )
            // InternalTheory.g:1168:2: rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2
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
    // InternalTheory.g:1175:1: rule__Theory__Group_3__1__Impl : ( ( rule__Theory__ImportsAssignment_3_1 ) ) ;
    public final void rule__Theory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1179:1: ( ( ( rule__Theory__ImportsAssignment_3_1 ) ) )
            // InternalTheory.g:1180:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            {
            // InternalTheory.g:1180:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            // InternalTheory.g:1181:2: ( rule__Theory__ImportsAssignment_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 
            // InternalTheory.g:1182:2: ( rule__Theory__ImportsAssignment_3_1 )
            // InternalTheory.g:1182:3: rule__Theory__ImportsAssignment_3_1
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
    // InternalTheory.g:1190:1: rule__Theory__Group_3__2 : rule__Theory__Group_3__2__Impl ;
    public final void rule__Theory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1194:1: ( rule__Theory__Group_3__2__Impl )
            // InternalTheory.g:1195:2: rule__Theory__Group_3__2__Impl
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
    // InternalTheory.g:1201:1: rule__Theory__Group_3__2__Impl : ( ( rule__Theory__ImportsAssignment_3_2 )* ) ;
    public final void rule__Theory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1205:1: ( ( ( rule__Theory__ImportsAssignment_3_2 )* ) )
            // InternalTheory.g:1206:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            {
            // InternalTheory.g:1206:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            // InternalTheory.g:1207:2: ( rule__Theory__ImportsAssignment_3_2 )*
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 
            // InternalTheory.g:1208:2: ( rule__Theory__ImportsAssignment_3_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTheory.g:1208:3: rule__Theory__ImportsAssignment_3_2
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
    // InternalTheory.g:1217:1: rule__Theory__Group_4_0__0 : rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 ;
    public final void rule__Theory__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1221:1: ( rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 )
            // InternalTheory.g:1222:2: rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1
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
    // InternalTheory.g:1229:1: rule__Theory__Group_4_0__0__Impl : ( 'types' ) ;
    public final void rule__Theory__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1233:1: ( ( 'types' ) )
            // InternalTheory.g:1234:1: ( 'types' )
            {
            // InternalTheory.g:1234:1: ( 'types' )
            // InternalTheory.g:1235:2: 'types'
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
    // InternalTheory.g:1244:1: rule__Theory__Group_4_0__1 : rule__Theory__Group_4_0__1__Impl ;
    public final void rule__Theory__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1248:1: ( rule__Theory__Group_4_0__1__Impl )
            // InternalTheory.g:1249:2: rule__Theory__Group_4_0__1__Impl
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
    // InternalTheory.g:1255:1: rule__Theory__Group_4_0__1__Impl : ( ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* ) ) ;
    public final void rule__Theory__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1259:1: ( ( ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* ) ) )
            // InternalTheory.g:1260:1: ( ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* ) )
            {
            // InternalTheory.g:1260:1: ( ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* ) )
            // InternalTheory.g:1261:2: ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* )
            {
            // InternalTheory.g:1261:2: ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) )
            // InternalTheory.g:1262:3: ( rule__Theory__InternalElementsAssignment_4_0_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 
            // InternalTheory.g:1263:3: ( rule__Theory__InternalElementsAssignment_4_0_1 )
            // InternalTheory.g:1263:4: rule__Theory__InternalElementsAssignment_4_0_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__InternalElementsAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 

            }

            // InternalTheory.g:1266:2: ( ( rule__Theory__InternalElementsAssignment_4_0_1 )* )
            // InternalTheory.g:1267:3: ( rule__Theory__InternalElementsAssignment_4_0_1 )*
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 
            // InternalTheory.g:1268:3: ( rule__Theory__InternalElementsAssignment_4_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ML_COMMENT && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTheory.g:1268:4: rule__Theory__InternalElementsAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__InternalElementsAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 

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
    // InternalTheory.g:1278:1: rule__Theory__Group_4_1__0 : rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 ;
    public final void rule__Theory__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1282:1: ( rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 )
            // InternalTheory.g:1283:2: rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1
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
    // InternalTheory.g:1290:1: rule__Theory__Group_4_1__0__Impl : ( 'operators' ) ;
    public final void rule__Theory__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1294:1: ( ( 'operators' ) )
            // InternalTheory.g:1295:1: ( 'operators' )
            {
            // InternalTheory.g:1295:1: ( 'operators' )
            // InternalTheory.g:1296:2: 'operators'
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
    // InternalTheory.g:1305:1: rule__Theory__Group_4_1__1 : rule__Theory__Group_4_1__1__Impl ;
    public final void rule__Theory__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1309:1: ( rule__Theory__Group_4_1__1__Impl )
            // InternalTheory.g:1310:2: rule__Theory__Group_4_1__1__Impl
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
    // InternalTheory.g:1316:1: rule__Theory__Group_4_1__1__Impl : ( ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* ) ) ;
    public final void rule__Theory__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1320:1: ( ( ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* ) ) )
            // InternalTheory.g:1321:1: ( ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* ) )
            {
            // InternalTheory.g:1321:1: ( ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* ) )
            // InternalTheory.g:1322:2: ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* )
            {
            // InternalTheory.g:1322:2: ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) )
            // InternalTheory.g:1323:3: ( rule__Theory__InternalElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 
            // InternalTheory.g:1324:3: ( rule__Theory__InternalElementsAssignment_4_1_1 )
            // InternalTheory.g:1324:4: rule__Theory__InternalElementsAssignment_4_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__InternalElementsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 

            }

            // InternalTheory.g:1327:2: ( ( rule__Theory__InternalElementsAssignment_4_1_1 )* )
            // InternalTheory.g:1328:3: ( rule__Theory__InternalElementsAssignment_4_1_1 )*
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 
            // InternalTheory.g:1329:3: ( rule__Theory__InternalElementsAssignment_4_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTheory.g:1329:4: rule__Theory__InternalElementsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Theory__InternalElementsAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 

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
    // InternalTheory.g:1339:1: rule__Theory__Group_4_2__0 : rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 ;
    public final void rule__Theory__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1343:1: ( rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 )
            // InternalTheory.g:1344:2: rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1
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
    // InternalTheory.g:1351:1: rule__Theory__Group_4_2__0__Impl : ( 'axioms' ) ;
    public final void rule__Theory__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1355:1: ( ( 'axioms' ) )
            // InternalTheory.g:1356:1: ( 'axioms' )
            {
            // InternalTheory.g:1356:1: ( 'axioms' )
            // InternalTheory.g:1357:2: 'axioms'
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
    // InternalTheory.g:1366:1: rule__Theory__Group_4_2__1 : rule__Theory__Group_4_2__1__Impl ;
    public final void rule__Theory__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1370:1: ( rule__Theory__Group_4_2__1__Impl )
            // InternalTheory.g:1371:2: rule__Theory__Group_4_2__1__Impl
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
    // InternalTheory.g:1377:1: rule__Theory__Group_4_2__1__Impl : ( ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* ) ) ;
    public final void rule__Theory__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1381:1: ( ( ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* ) ) )
            // InternalTheory.g:1382:1: ( ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* ) )
            {
            // InternalTheory.g:1382:1: ( ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* ) )
            // InternalTheory.g:1383:2: ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* )
            {
            // InternalTheory.g:1383:2: ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) )
            // InternalTheory.g:1384:3: ( rule__Theory__InternalElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 
            // InternalTheory.g:1385:3: ( rule__Theory__InternalElementsAssignment_4_2_1 )
            // InternalTheory.g:1385:4: rule__Theory__InternalElementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__InternalElementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 

            }

            // InternalTheory.g:1388:2: ( ( rule__Theory__InternalElementsAssignment_4_2_1 )* )
            // InternalTheory.g:1389:3: ( rule__Theory__InternalElementsAssignment_4_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 
            // InternalTheory.g:1390:3: ( rule__Theory__InternalElementsAssignment_4_2_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ML_COMMENT && LA22_0<=RULE_SL_COMMENT)||LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTheory.g:1390:4: rule__Theory__InternalElementsAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__InternalElementsAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 

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
    // InternalTheory.g:1400:1: rule__Theory__Group_4_3__0 : rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 ;
    public final void rule__Theory__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1404:1: ( rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 )
            // InternalTheory.g:1405:2: rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1
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
    // InternalTheory.g:1412:1: rule__Theory__Group_4_3__0__Impl : ( 'theorems' ) ;
    public final void rule__Theory__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1416:1: ( ( 'theorems' ) )
            // InternalTheory.g:1417:1: ( 'theorems' )
            {
            // InternalTheory.g:1417:1: ( 'theorems' )
            // InternalTheory.g:1418:2: 'theorems'
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
    // InternalTheory.g:1427:1: rule__Theory__Group_4_3__1 : rule__Theory__Group_4_3__1__Impl ;
    public final void rule__Theory__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1431:1: ( rule__Theory__Group_4_3__1__Impl )
            // InternalTheory.g:1432:2: rule__Theory__Group_4_3__1__Impl
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
    // InternalTheory.g:1438:1: rule__Theory__Group_4_3__1__Impl : ( ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* ) ) ;
    public final void rule__Theory__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1442:1: ( ( ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* ) ) )
            // InternalTheory.g:1443:1: ( ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* ) )
            {
            // InternalTheory.g:1443:1: ( ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* ) )
            // InternalTheory.g:1444:2: ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* )
            {
            // InternalTheory.g:1444:2: ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) )
            // InternalTheory.g:1445:3: ( rule__Theory__InternalElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 
            // InternalTheory.g:1446:3: ( rule__Theory__InternalElementsAssignment_4_3_1 )
            // InternalTheory.g:1446:4: rule__Theory__InternalElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__InternalElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 

            }

            // InternalTheory.g:1449:2: ( ( rule__Theory__InternalElementsAssignment_4_3_1 )* )
            // InternalTheory.g:1450:3: ( rule__Theory__InternalElementsAssignment_4_3_1 )*
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 
            // InternalTheory.g:1451:3: ( rule__Theory__InternalElementsAssignment_4_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)||LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTheory.g:1451:4: rule__Theory__InternalElementsAssignment_4_3_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__InternalElementsAssignment_4_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 

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
    // InternalTheory.g:1461:1: rule__Theory__Group_4_4__0 : rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 ;
    public final void rule__Theory__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1465:1: ( rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 )
            // InternalTheory.g:1466:2: rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTheory.g:1473:1: rule__Theory__Group_4_4__0__Impl : ( 'rules' ) ;
    public final void rule__Theory__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1477:1: ( ( 'rules' ) )
            // InternalTheory.g:1478:1: ( 'rules' )
            {
            // InternalTheory.g:1478:1: ( 'rules' )
            // InternalTheory.g:1479:2: 'rules'
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
    // InternalTheory.g:1488:1: rule__Theory__Group_4_4__1 : rule__Theory__Group_4_4__1__Impl ;
    public final void rule__Theory__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1492:1: ( rule__Theory__Group_4_4__1__Impl )
            // InternalTheory.g:1493:2: rule__Theory__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__1__Impl();

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
    // InternalTheory.g:1499:1: rule__Theory__Group_4_4__1__Impl : ( ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* ) ) ;
    public final void rule__Theory__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1503:1: ( ( ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* ) ) )
            // InternalTheory.g:1504:1: ( ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* ) )
            {
            // InternalTheory.g:1504:1: ( ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* ) )
            // InternalTheory.g:1505:2: ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) ) ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* )
            {
            // InternalTheory.g:1505:2: ( ( rule__Theory__InternalElementsAssignment_4_4_1 ) )
            // InternalTheory.g:1506:3: ( rule__Theory__InternalElementsAssignment_4_4_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_4_1()); 
            // InternalTheory.g:1507:3: ( rule__Theory__InternalElementsAssignment_4_4_1 )
            // InternalTheory.g:1507:4: rule__Theory__InternalElementsAssignment_4_4_1
            {
            pushFollow(FOLLOW_11);
            rule__Theory__InternalElementsAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_4_1()); 

            }

            // InternalTheory.g:1510:2: ( ( rule__Theory__InternalElementsAssignment_4_4_1 )* )
            // InternalTheory.g:1511:3: ( rule__Theory__InternalElementsAssignment_4_4_1 )*
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_4_1()); 
            // InternalTheory.g:1512:3: ( rule__Theory__InternalElementsAssignment_4_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ML_COMMENT && LA24_0<=RULE_SL_COMMENT)||LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTheory.g:1512:4: rule__Theory__InternalElementsAssignment_4_4_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Theory__InternalElementsAssignment_4_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_4_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_4__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalTheory.g:1522:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1526:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalTheory.g:1527:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalTheory.g:1534:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1538:1: ( ( ( rule__Type__CommentAssignment_0 )? ) )
            // InternalTheory.g:1539:1: ( ( rule__Type__CommentAssignment_0 )? )
            {
            // InternalTheory.g:1539:1: ( ( rule__Type__CommentAssignment_0 )? )
            // InternalTheory.g:1540:2: ( rule__Type__CommentAssignment_0 )?
            {
             before(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            // InternalTheory.g:1541:2: ( rule__Type__CommentAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ML_COMMENT && LA25_0<=RULE_SL_COMMENT)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTheory.g:1541:3: rule__Type__CommentAssignment_0
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
    // InternalTheory.g:1549:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1553:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalTheory.g:1554:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTheory.g:1561:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1565:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalTheory.g:1566:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalTheory.g:1566:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalTheory.g:1567:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalTheory.g:1568:2: ( rule__Type__NameAssignment_1 )
            // InternalTheory.g:1568:3: rule__Type__NameAssignment_1
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
    // InternalTheory.g:1576:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1580:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalTheory.g:1581:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

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
    // InternalTheory.g:1588:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1592:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalTheory.g:1593:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalTheory.g:1593:1: ( ( rule__Type__Group_2__0 )? )
            // InternalTheory.g:1594:2: ( rule__Type__Group_2__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_2()); 
            // InternalTheory.g:1595:2: ( rule__Type__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTheory.g:1595:3: rule__Type__Group_2__0
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


    // $ANTLR start "rule__Type__Group__3"
    // InternalTheory.g:1603:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1607:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalTheory.g:1608:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

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
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalTheory.g:1615:1: rule__Type__Group__3__Impl : ( '=' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1619:1: ( ( '=' ) )
            // InternalTheory.g:1620:1: ( '=' )
            {
            // InternalTheory.g:1620:1: ( '=' )
            // InternalTheory.g:1621:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalTheory.g:1630:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1634:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalTheory.g:1635:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__5();

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
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalTheory.g:1642:1: rule__Type__Group__4__Impl : ( ( rule__Type__ConstructorsAssignment_4 ) ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1646:1: ( ( ( rule__Type__ConstructorsAssignment_4 ) ) )
            // InternalTheory.g:1647:1: ( ( rule__Type__ConstructorsAssignment_4 ) )
            {
            // InternalTheory.g:1647:1: ( ( rule__Type__ConstructorsAssignment_4 ) )
            // InternalTheory.g:1648:2: ( rule__Type__ConstructorsAssignment_4 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_4()); 
            // InternalTheory.g:1649:2: ( rule__Type__ConstructorsAssignment_4 )
            // InternalTheory.g:1649:3: rule__Type__ConstructorsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // InternalTheory.g:1657:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1661:1: ( rule__Type__Group__5__Impl )
            // InternalTheory.g:1662:2: rule__Type__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__5__Impl();

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
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // InternalTheory.g:1668:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1672:1: ( ( ( rule__Type__Group_5__0 )* ) )
            // InternalTheory.g:1673:1: ( ( rule__Type__Group_5__0 )* )
            {
            // InternalTheory.g:1673:1: ( ( rule__Type__Group_5__0 )* )
            // InternalTheory.g:1674:2: ( rule__Type__Group_5__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalTheory.g:1675:2: ( rule__Type__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTheory.g:1675:3: rule__Type__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Type__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalTheory.g:1684:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1688:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalTheory.g:1689:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalTheory.g:1696:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1700:1: ( ( '(' ) )
            // InternalTheory.g:1701:1: ( '(' )
            {
            // InternalTheory.g:1701:1: ( '(' )
            // InternalTheory.g:1702:2: '('
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
    // InternalTheory.g:1711:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1715:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalTheory.g:1716:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalTheory.g:1723:1: rule__Type__Group_2__1__Impl : ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1727:1: ( ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:1728:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:1728:1: ( ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:1729:2: ( ( rule__Type__ParametersAssignment_2_1 ) ) ( ( rule__Type__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:1729:2: ( ( rule__Type__ParametersAssignment_2_1 ) )
            // InternalTheory.g:1730:3: ( rule__Type__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1731:3: ( rule__Type__ParametersAssignment_2_1 )
            // InternalTheory.g:1731:4: rule__Type__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Type__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:1734:2: ( ( rule__Type__ParametersAssignment_2_1 )* )
            // InternalTheory.g:1735:3: ( rule__Type__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:1736:3: ( rule__Type__ParametersAssignment_2_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTheory.g:1736:4: rule__Type__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Type__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalTheory.g:1745:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1749:1: ( rule__Type__Group_2__2__Impl )
            // InternalTheory.g:1750:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

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
    // InternalTheory.g:1756:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1760:1: ( ( ')' ) )
            // InternalTheory.g:1761:1: ( ')' )
            {
            // InternalTheory.g:1761:1: ( ')' )
            // InternalTheory.g:1762:2: ')'
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


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalTheory.g:1772:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1776:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalTheory.g:1777:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

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
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalTheory.g:1784:1: rule__Type__Group_5__0__Impl : ( '|' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1788:1: ( ( '|' ) )
            // InternalTheory.g:1789:1: ( '|' )
            {
            // InternalTheory.g:1789:1: ( '|' )
            // InternalTheory.g:1790:2: '|'
            {
             before(grammarAccess.getTypeAccess().getVerticalLineKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getVerticalLineKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalTheory.g:1799:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1803:1: ( rule__Type__Group_5__1__Impl )
            // InternalTheory.g:1804:2: rule__Type__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1__Impl();

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
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalTheory.g:1810:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ConstructorsAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1814:1: ( ( ( rule__Type__ConstructorsAssignment_5_1 ) ) )
            // InternalTheory.g:1815:1: ( ( rule__Type__ConstructorsAssignment_5_1 ) )
            {
            // InternalTheory.g:1815:1: ( ( rule__Type__ConstructorsAssignment_5_1 ) )
            // InternalTheory.g:1816:2: ( rule__Type__ConstructorsAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_5_1()); 
            // InternalTheory.g:1817:2: ( rule__Type__ConstructorsAssignment_5_1 )
            // InternalTheory.g:1817:3: rule__Type__ConstructorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // InternalTheory.g:1826:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1830:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalTheory.g:1831:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
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
    // InternalTheory.g:1838:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__CommentAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1842:1: ( ( ( rule__Constructor__CommentAssignment_0 )? ) )
            // InternalTheory.g:1843:1: ( ( rule__Constructor__CommentAssignment_0 )? )
            {
            // InternalTheory.g:1843:1: ( ( rule__Constructor__CommentAssignment_0 )? )
            // InternalTheory.g:1844:2: ( rule__Constructor__CommentAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:1845:2: ( rule__Constructor__CommentAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ML_COMMENT && LA29_0<=RULE_SL_COMMENT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTheory.g:1845:3: rule__Constructor__CommentAssignment_0
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
    // InternalTheory.g:1853:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1857:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // InternalTheory.g:1858:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTheory.g:1865:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 ) ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1869:1: ( ( ( rule__Constructor__NameAssignment_1 ) ) )
            // InternalTheory.g:1870:1: ( ( rule__Constructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:1870:1: ( ( rule__Constructor__NameAssignment_1 ) )
            // InternalTheory.g:1871:2: ( rule__Constructor__NameAssignment_1 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:1872:2: ( rule__Constructor__NameAssignment_1 )
            // InternalTheory.g:1872:3: rule__Constructor__NameAssignment_1
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
    // InternalTheory.g:1880:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1884:1: ( rule__Constructor__Group__2__Impl )
            // InternalTheory.g:1885:2: rule__Constructor__Group__2__Impl
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
    // InternalTheory.g:1891:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__Group_2__0 )? ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1895:1: ( ( ( rule__Constructor__Group_2__0 )? ) )
            // InternalTheory.g:1896:1: ( ( rule__Constructor__Group_2__0 )? )
            {
            // InternalTheory.g:1896:1: ( ( rule__Constructor__Group_2__0 )? )
            // InternalTheory.g:1897:2: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // InternalTheory.g:1898:2: ( rule__Constructor__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTheory.g:1898:3: rule__Constructor__Group_2__0
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
    // InternalTheory.g:1907:1: rule__Constructor__Group_2__0 : rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1911:1: ( rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1 )
            // InternalTheory.g:1912:2: rule__Constructor__Group_2__0__Impl rule__Constructor__Group_2__1
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
    // InternalTheory.g:1919:1: rule__Constructor__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Constructor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1923:1: ( ( '(' ) )
            // InternalTheory.g:1924:1: ( '(' )
            {
            // InternalTheory.g:1924:1: ( '(' )
            // InternalTheory.g:1925:2: '('
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
    // InternalTheory.g:1934:1: rule__Constructor__Group_2__1 : rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1938:1: ( rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2 )
            // InternalTheory.g:1939:2: rule__Constructor__Group_2__1__Impl rule__Constructor__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalTheory.g:1946:1: rule__Constructor__Group_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) ;
    public final void rule__Constructor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1950:1: ( ( ( rule__Constructor__DestructorsAssignment_2_1 ) ) )
            // InternalTheory.g:1951:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            {
            // InternalTheory.g:1951:1: ( ( rule__Constructor__DestructorsAssignment_2_1 ) )
            // InternalTheory.g:1952:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_1()); 
            // InternalTheory.g:1953:2: ( rule__Constructor__DestructorsAssignment_2_1 )
            // InternalTheory.g:1953:3: rule__Constructor__DestructorsAssignment_2_1
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
    // InternalTheory.g:1961:1: rule__Constructor__Group_2__2 : rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 ;
    public final void rule__Constructor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1965:1: ( rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3 )
            // InternalTheory.g:1966:2: rule__Constructor__Group_2__2__Impl rule__Constructor__Group_2__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTheory.g:1973:1: rule__Constructor__Group_2__2__Impl : ( ( rule__Constructor__Group_2_2__0 )* ) ;
    public final void rule__Constructor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1977:1: ( ( ( rule__Constructor__Group_2_2__0 )* ) )
            // InternalTheory.g:1978:1: ( ( rule__Constructor__Group_2_2__0 )* )
            {
            // InternalTheory.g:1978:1: ( ( rule__Constructor__Group_2_2__0 )* )
            // InternalTheory.g:1979:2: ( rule__Constructor__Group_2_2__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_2()); 
            // InternalTheory.g:1980:2: ( rule__Constructor__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTheory.g:1980:3: rule__Constructor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalTheory.g:1988:1: rule__Constructor__Group_2__3 : rule__Constructor__Group_2__3__Impl ;
    public final void rule__Constructor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1992:1: ( rule__Constructor__Group_2__3__Impl )
            // InternalTheory.g:1993:2: rule__Constructor__Group_2__3__Impl
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
    // InternalTheory.g:1999:1: rule__Constructor__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2003:1: ( ( ')' ) )
            // InternalTheory.g:2004:1: ( ')' )
            {
            // InternalTheory.g:2004:1: ( ')' )
            // InternalTheory.g:2005:2: ')'
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
    // InternalTheory.g:2015:1: rule__Constructor__Group_2_2__0 : rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 ;
    public final void rule__Constructor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2019:1: ( rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1 )
            // InternalTheory.g:2020:2: rule__Constructor__Group_2_2__0__Impl rule__Constructor__Group_2_2__1
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
    // InternalTheory.g:2027:1: rule__Constructor__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2031:1: ( ( ',' ) )
            // InternalTheory.g:2032:1: ( ',' )
            {
            // InternalTheory.g:2032:1: ( ',' )
            // InternalTheory.g:2033:2: ','
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
    // InternalTheory.g:2042:1: rule__Constructor__Group_2_2__1 : rule__Constructor__Group_2_2__1__Impl ;
    public final void rule__Constructor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2046:1: ( rule__Constructor__Group_2_2__1__Impl )
            // InternalTheory.g:2047:2: rule__Constructor__Group_2_2__1__Impl
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
    // InternalTheory.g:2053:1: rule__Constructor__Group_2_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) ;
    public final void rule__Constructor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2057:1: ( ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2058:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2058:1: ( ( rule__Constructor__DestructorsAssignment_2_2_1 ) )
            // InternalTheory.g:2059:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_2_1()); 
            // InternalTheory.g:2060:2: ( rule__Constructor__DestructorsAssignment_2_2_1 )
            // InternalTheory.g:2060:3: rule__Constructor__DestructorsAssignment_2_2_1
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
    // InternalTheory.g:2069:1: rule__Destructor__Group__0 : rule__Destructor__Group__0__Impl rule__Destructor__Group__1 ;
    public final void rule__Destructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2073:1: ( rule__Destructor__Group__0__Impl rule__Destructor__Group__1 )
            // InternalTheory.g:2074:2: rule__Destructor__Group__0__Impl rule__Destructor__Group__1
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
    // InternalTheory.g:2081:1: rule__Destructor__Group__0__Impl : ( ( rule__Destructor__CommentAssignment_0 )? ) ;
    public final void rule__Destructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2085:1: ( ( ( rule__Destructor__CommentAssignment_0 )? ) )
            // InternalTheory.g:2086:1: ( ( rule__Destructor__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2086:1: ( ( rule__Destructor__CommentAssignment_0 )? )
            // InternalTheory.g:2087:2: ( rule__Destructor__CommentAssignment_0 )?
            {
             before(grammarAccess.getDestructorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2088:2: ( rule__Destructor__CommentAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ML_COMMENT && LA32_0<=RULE_SL_COMMENT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTheory.g:2088:3: rule__Destructor__CommentAssignment_0
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
    // InternalTheory.g:2096:1: rule__Destructor__Group__1 : rule__Destructor__Group__1__Impl rule__Destructor__Group__2 ;
    public final void rule__Destructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2100:1: ( rule__Destructor__Group__1__Impl rule__Destructor__Group__2 )
            // InternalTheory.g:2101:2: rule__Destructor__Group__1__Impl rule__Destructor__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalTheory.g:2108:1: rule__Destructor__Group__1__Impl : ( ( rule__Destructor__NameAssignment_1 ) ) ;
    public final void rule__Destructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2112:1: ( ( ( rule__Destructor__NameAssignment_1 ) ) )
            // InternalTheory.g:2113:1: ( ( rule__Destructor__NameAssignment_1 ) )
            {
            // InternalTheory.g:2113:1: ( ( rule__Destructor__NameAssignment_1 ) )
            // InternalTheory.g:2114:2: ( rule__Destructor__NameAssignment_1 )
            {
             before(grammarAccess.getDestructorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2115:2: ( rule__Destructor__NameAssignment_1 )
            // InternalTheory.g:2115:3: rule__Destructor__NameAssignment_1
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
    // InternalTheory.g:2123:1: rule__Destructor__Group__2 : rule__Destructor__Group__2__Impl rule__Destructor__Group__3 ;
    public final void rule__Destructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2127:1: ( rule__Destructor__Group__2__Impl rule__Destructor__Group__3 )
            // InternalTheory.g:2128:2: rule__Destructor__Group__2__Impl rule__Destructor__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:2135:1: rule__Destructor__Group__2__Impl : ( ':' ) ;
    public final void rule__Destructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2139:1: ( ( ':' ) )
            // InternalTheory.g:2140:1: ( ':' )
            {
            // InternalTheory.g:2140:1: ( ':' )
            // InternalTheory.g:2141:2: ':'
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
    // InternalTheory.g:2150:1: rule__Destructor__Group__3 : rule__Destructor__Group__3__Impl ;
    public final void rule__Destructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2154:1: ( rule__Destructor__Group__3__Impl )
            // InternalTheory.g:2155:2: rule__Destructor__Group__3__Impl
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
    // InternalTheory.g:2161:1: rule__Destructor__Group__3__Impl : ( ( rule__Destructor__TypeAssignment_3 ) ) ;
    public final void rule__Destructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2165:1: ( ( ( rule__Destructor__TypeAssignment_3 ) ) )
            // InternalTheory.g:2166:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            {
            // InternalTheory.g:2166:1: ( ( rule__Destructor__TypeAssignment_3 ) )
            // InternalTheory.g:2167:2: ( rule__Destructor__TypeAssignment_3 )
            {
             before(grammarAccess.getDestructorAccess().getTypeAssignment_3()); 
            // InternalTheory.g:2168:2: ( rule__Destructor__TypeAssignment_3 )
            // InternalTheory.g:2168:3: rule__Destructor__TypeAssignment_3
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
    // InternalTheory.g:2177:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2181:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // InternalTheory.g:2182:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
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
    // InternalTheory.g:2189:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__CommentAssignment_0 )? ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2193:1: ( ( ( rule__Operator__CommentAssignment_0 )? ) )
            // InternalTheory.g:2194:1: ( ( rule__Operator__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2194:1: ( ( rule__Operator__CommentAssignment_0 )? )
            // InternalTheory.g:2195:2: ( rule__Operator__CommentAssignment_0 )?
            {
             before(grammarAccess.getOperatorAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2196:2: ( rule__Operator__CommentAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ML_COMMENT && LA33_0<=RULE_SL_COMMENT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTheory.g:2196:3: rule__Operator__CommentAssignment_0
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
    // InternalTheory.g:2204:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2208:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // InternalTheory.g:2209:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalTheory.g:2216:1: rule__Operator__Group__1__Impl : ( ( rule__Operator__NameAssignment_1 ) ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2220:1: ( ( ( rule__Operator__NameAssignment_1 ) ) )
            // InternalTheory.g:2221:1: ( ( rule__Operator__NameAssignment_1 ) )
            {
            // InternalTheory.g:2221:1: ( ( rule__Operator__NameAssignment_1 ) )
            // InternalTheory.g:2222:2: ( rule__Operator__NameAssignment_1 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_1()); 
            // InternalTheory.g:2223:2: ( rule__Operator__NameAssignment_1 )
            // InternalTheory.g:2223:3: rule__Operator__NameAssignment_1
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
    // InternalTheory.g:2231:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2235:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // InternalTheory.g:2236:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTheory.g:2243:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__Group_2__0 )? ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2247:1: ( ( ( rule__Operator__Group_2__0 )? ) )
            // InternalTheory.g:2248:1: ( ( rule__Operator__Group_2__0 )? )
            {
            // InternalTheory.g:2248:1: ( ( rule__Operator__Group_2__0 )? )
            // InternalTheory.g:2249:2: ( rule__Operator__Group_2__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_2()); 
            // InternalTheory.g:2250:2: ( rule__Operator__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTheory.g:2250:3: rule__Operator__Group_2__0
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
    // InternalTheory.g:2258:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2262:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // InternalTheory.g:2263:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalTheory.g:2270:1: rule__Operator__Group__3__Impl : ( ( rule__Operator__UnorderedGroup_3 ) ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2274:1: ( ( ( rule__Operator__UnorderedGroup_3 ) ) )
            // InternalTheory.g:2275:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            {
            // InternalTheory.g:2275:1: ( ( rule__Operator__UnorderedGroup_3 ) )
            // InternalTheory.g:2276:2: ( rule__Operator__UnorderedGroup_3 )
            {
             before(grammarAccess.getOperatorAccess().getUnorderedGroup_3()); 
            // InternalTheory.g:2277:2: ( rule__Operator__UnorderedGroup_3 )
            // InternalTheory.g:2277:3: rule__Operator__UnorderedGroup_3
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
    // InternalTheory.g:2285:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2289:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // InternalTheory.g:2290:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalTheory.g:2297:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__Group_4__0 )? ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2301:1: ( ( ( rule__Operator__Group_4__0 )? ) )
            // InternalTheory.g:2302:1: ( ( rule__Operator__Group_4__0 )? )
            {
            // InternalTheory.g:2302:1: ( ( rule__Operator__Group_4__0 )? )
            // InternalTheory.g:2303:2: ( rule__Operator__Group_4__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_4()); 
            // InternalTheory.g:2304:2: ( rule__Operator__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTheory.g:2304:3: rule__Operator__Group_4__0
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
    // InternalTheory.g:2312:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl rule__Operator__Group__6 ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2316:1: ( rule__Operator__Group__5__Impl rule__Operator__Group__6 )
            // InternalTheory.g:2317:2: rule__Operator__Group__5__Impl rule__Operator__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalTheory.g:2324:1: rule__Operator__Group__5__Impl : ( ( rule__Operator__Group_5__0 )? ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2328:1: ( ( ( rule__Operator__Group_5__0 )? ) )
            // InternalTheory.g:2329:1: ( ( rule__Operator__Group_5__0 )? )
            {
            // InternalTheory.g:2329:1: ( ( rule__Operator__Group_5__0 )? )
            // InternalTheory.g:2330:2: ( rule__Operator__Group_5__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_5()); 
            // InternalTheory.g:2331:2: ( rule__Operator__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTheory.g:2331:3: rule__Operator__Group_5__0
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
    // InternalTheory.g:2339:1: rule__Operator__Group__6 : rule__Operator__Group__6__Impl ;
    public final void rule__Operator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2343:1: ( rule__Operator__Group__6__Impl )
            // InternalTheory.g:2344:2: rule__Operator__Group__6__Impl
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
    // InternalTheory.g:2350:1: rule__Operator__Group__6__Impl : ( ( rule__Operator__Group_6__0 )? ) ;
    public final void rule__Operator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2354:1: ( ( ( rule__Operator__Group_6__0 )? ) )
            // InternalTheory.g:2355:1: ( ( rule__Operator__Group_6__0 )? )
            {
            // InternalTheory.g:2355:1: ( ( rule__Operator__Group_6__0 )? )
            // InternalTheory.g:2356:2: ( rule__Operator__Group_6__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_6()); 
            // InternalTheory.g:2357:2: ( rule__Operator__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTheory.g:2357:3: rule__Operator__Group_6__0
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
    // InternalTheory.g:2366:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2370:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalTheory.g:2371:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
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
    // InternalTheory.g:2378:1: rule__Operator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2382:1: ( ( '(' ) )
            // InternalTheory.g:2383:1: ( '(' )
            {
            // InternalTheory.g:2383:1: ( '(' )
            // InternalTheory.g:2384:2: '('
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
    // InternalTheory.g:2393:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2397:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalTheory.g:2398:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalTheory.g:2405:1: rule__Operator__Group_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2409:1: ( ( ( rule__Operator__ArgumentsAssignment_2_1 ) ) )
            // InternalTheory.g:2410:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            {
            // InternalTheory.g:2410:1: ( ( rule__Operator__ArgumentsAssignment_2_1 ) )
            // InternalTheory.g:2411:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_1()); 
            // InternalTheory.g:2412:2: ( rule__Operator__ArgumentsAssignment_2_1 )
            // InternalTheory.g:2412:3: rule__Operator__ArgumentsAssignment_2_1
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
    // InternalTheory.g:2420:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2424:1: ( rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 )
            // InternalTheory.g:2425:2: rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTheory.g:2432:1: rule__Operator__Group_2__2__Impl : ( ( rule__Operator__Group_2_2__0 )* ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2436:1: ( ( ( rule__Operator__Group_2_2__0 )* ) )
            // InternalTheory.g:2437:1: ( ( rule__Operator__Group_2_2__0 )* )
            {
            // InternalTheory.g:2437:1: ( ( rule__Operator__Group_2_2__0 )* )
            // InternalTheory.g:2438:2: ( rule__Operator__Group_2_2__0 )*
            {
             before(grammarAccess.getOperatorAccess().getGroup_2_2()); 
            // InternalTheory.g:2439:2: ( rule__Operator__Group_2_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalTheory.g:2439:3: rule__Operator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalTheory.g:2447:1: rule__Operator__Group_2__3 : rule__Operator__Group_2__3__Impl ;
    public final void rule__Operator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2451:1: ( rule__Operator__Group_2__3__Impl )
            // InternalTheory.g:2452:2: rule__Operator__Group_2__3__Impl
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
    // InternalTheory.g:2458:1: rule__Operator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2462:1: ( ( ')' ) )
            // InternalTheory.g:2463:1: ( ')' )
            {
            // InternalTheory.g:2463:1: ( ')' )
            // InternalTheory.g:2464:2: ')'
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
    // InternalTheory.g:2474:1: rule__Operator__Group_2_2__0 : rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 ;
    public final void rule__Operator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2478:1: ( rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 )
            // InternalTheory.g:2479:2: rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1
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
    // InternalTheory.g:2486:1: rule__Operator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2490:1: ( ( ',' ) )
            // InternalTheory.g:2491:1: ( ',' )
            {
            // InternalTheory.g:2491:1: ( ',' )
            // InternalTheory.g:2492:2: ','
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
    // InternalTheory.g:2501:1: rule__Operator__Group_2_2__1 : rule__Operator__Group_2_2__1__Impl ;
    public final void rule__Operator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2505:1: ( rule__Operator__Group_2_2__1__Impl )
            // InternalTheory.g:2506:2: rule__Operator__Group_2_2__1__Impl
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
    // InternalTheory.g:2512:1: rule__Operator__Group_2_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__Operator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2516:1: ( ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) ) )
            // InternalTheory.g:2517:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalTheory.g:2517:1: ( ( rule__Operator__ArgumentsAssignment_2_2_1 ) )
            // InternalTheory.g:2518:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_2_1()); 
            // InternalTheory.g:2519:2: ( rule__Operator__ArgumentsAssignment_2_2_1 )
            // InternalTheory.g:2519:3: rule__Operator__ArgumentsAssignment_2_2_1
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
    // InternalTheory.g:2528:1: rule__Operator__Group_3_0__0 : rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 ;
    public final void rule__Operator__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2532:1: ( rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1 )
            // InternalTheory.g:2533:2: rule__Operator__Group_3_0__0__Impl rule__Operator__Group_3_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:2540:1: rule__Operator__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Operator__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2544:1: ( ( ':' ) )
            // InternalTheory.g:2545:1: ( ':' )
            {
            // InternalTheory.g:2545:1: ( ':' )
            // InternalTheory.g:2546:2: ':'
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
    // InternalTheory.g:2555:1: rule__Operator__Group_3_0__1 : rule__Operator__Group_3_0__1__Impl ;
    public final void rule__Operator__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2559:1: ( rule__Operator__Group_3_0__1__Impl )
            // InternalTheory.g:2560:2: rule__Operator__Group_3_0__1__Impl
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
    // InternalTheory.g:2566:1: rule__Operator__Group_3_0__1__Impl : ( ( rule__Operator__TypeAssignment_3_0_1 ) ) ;
    public final void rule__Operator__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2570:1: ( ( ( rule__Operator__TypeAssignment_3_0_1 ) ) )
            // InternalTheory.g:2571:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            {
            // InternalTheory.g:2571:1: ( ( rule__Operator__TypeAssignment_3_0_1 ) )
            // InternalTheory.g:2572:2: ( rule__Operator__TypeAssignment_3_0_1 )
            {
             before(grammarAccess.getOperatorAccess().getTypeAssignment_3_0_1()); 
            // InternalTheory.g:2573:2: ( rule__Operator__TypeAssignment_3_0_1 )
            // InternalTheory.g:2573:3: rule__Operator__TypeAssignment_3_0_1
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
    // InternalTheory.g:2582:1: rule__Operator__Group_3_2__0 : rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 ;
    public final void rule__Operator__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2586:1: ( rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1 )
            // InternalTheory.g:2587:2: rule__Operator__Group_3_2__0__Impl rule__Operator__Group_3_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTheory.g:2594:1: rule__Operator__Group_3_2__0__Impl : ( ( rule__Operator__AssociativeAssignment_3_2_0 ) ) ;
    public final void rule__Operator__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2598:1: ( ( ( rule__Operator__AssociativeAssignment_3_2_0 ) ) )
            // InternalTheory.g:2599:1: ( ( rule__Operator__AssociativeAssignment_3_2_0 ) )
            {
            // InternalTheory.g:2599:1: ( ( rule__Operator__AssociativeAssignment_3_2_0 ) )
            // InternalTheory.g:2600:2: ( rule__Operator__AssociativeAssignment_3_2_0 )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssignment_3_2_0()); 
            // InternalTheory.g:2601:2: ( rule__Operator__AssociativeAssignment_3_2_0 )
            // InternalTheory.g:2601:3: rule__Operator__AssociativeAssignment_3_2_0
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
    // InternalTheory.g:2609:1: rule__Operator__Group_3_2__1 : rule__Operator__Group_3_2__1__Impl ;
    public final void rule__Operator__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2613:1: ( rule__Operator__Group_3_2__1__Impl )
            // InternalTheory.g:2614:2: rule__Operator__Group_3_2__1__Impl
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
    // InternalTheory.g:2620:1: rule__Operator__Group_3_2__1__Impl : ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) ;
    public final void rule__Operator__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2624:1: ( ( ( rule__Operator__CommutativeAssignment_3_2_1 )? ) )
            // InternalTheory.g:2625:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            {
            // InternalTheory.g:2625:1: ( ( rule__Operator__CommutativeAssignment_3_2_1 )? )
            // InternalTheory.g:2626:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            {
             before(grammarAccess.getOperatorAccess().getCommutativeAssignment_3_2_1()); 
            // InternalTheory.g:2627:2: ( rule__Operator__CommutativeAssignment_3_2_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTheory.g:2627:3: rule__Operator__CommutativeAssignment_3_2_1
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
    // InternalTheory.g:2636:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2640:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalTheory.g:2641:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTheory.g:2648:1: rule__Operator__Group_4__0__Impl : ( '#' ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2652:1: ( ( '#' ) )
            // InternalTheory.g:2653:1: ( '#' )
            {
            // InternalTheory.g:2653:1: ( '#' )
            // InternalTheory.g:2654:2: '#'
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
    // InternalTheory.g:2663:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2667:1: ( rule__Operator__Group_4__1__Impl )
            // InternalTheory.g:2668:2: rule__Operator__Group_4__1__Impl
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
    // InternalTheory.g:2674:1: rule__Operator__Group_4__1__Impl : ( ( rule__Operator__PrecedentAssignment_4_1 ) ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2678:1: ( ( ( rule__Operator__PrecedentAssignment_4_1 ) ) )
            // InternalTheory.g:2679:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            {
            // InternalTheory.g:2679:1: ( ( rule__Operator__PrecedentAssignment_4_1 ) )
            // InternalTheory.g:2680:2: ( rule__Operator__PrecedentAssignment_4_1 )
            {
             before(grammarAccess.getOperatorAccess().getPrecedentAssignment_4_1()); 
            // InternalTheory.g:2681:2: ( rule__Operator__PrecedentAssignment_4_1 )
            // InternalTheory.g:2681:3: rule__Operator__PrecedentAssignment_4_1
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
    // InternalTheory.g:2690:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2694:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalTheory.g:2695:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:2702:1: rule__Operator__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2706:1: ( ( 'for' ) )
            // InternalTheory.g:2707:1: ( 'for' )
            {
            // InternalTheory.g:2707:1: ( 'for' )
            // InternalTheory.g:2708:2: 'for'
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
    // InternalTheory.g:2717:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2721:1: ( rule__Operator__Group_5__1__Impl )
            // InternalTheory.g:2722:2: rule__Operator__Group_5__1__Impl
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
    // InternalTheory.g:2728:1: rule__Operator__Group_5__1__Impl : ( ( rule__Operator__WdAssignment_5_1 ) ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2732:1: ( ( ( rule__Operator__WdAssignment_5_1 ) ) )
            // InternalTheory.g:2733:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            {
            // InternalTheory.g:2733:1: ( ( rule__Operator__WdAssignment_5_1 ) )
            // InternalTheory.g:2734:2: ( rule__Operator__WdAssignment_5_1 )
            {
             before(grammarAccess.getOperatorAccess().getWdAssignment_5_1()); 
            // InternalTheory.g:2735:2: ( rule__Operator__WdAssignment_5_1 )
            // InternalTheory.g:2735:3: rule__Operator__WdAssignment_5_1
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
    // InternalTheory.g:2744:1: rule__Operator__Group_6__0 : rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 ;
    public final void rule__Operator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2748:1: ( rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 )
            // InternalTheory.g:2749:2: rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTheory.g:2756:1: rule__Operator__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Operator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2760:1: ( ( '=' ) )
            // InternalTheory.g:2761:1: ( '=' )
            {
            // InternalTheory.g:2761:1: ( '=' )
            // InternalTheory.g:2762:2: '='
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
    // InternalTheory.g:2771:1: rule__Operator__Group_6__1 : rule__Operator__Group_6__1__Impl ;
    public final void rule__Operator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2775:1: ( rule__Operator__Group_6__1__Impl )
            // InternalTheory.g:2776:2: rule__Operator__Group_6__1__Impl
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
    // InternalTheory.g:2782:1: rule__Operator__Group_6__1__Impl : ( ( rule__Operator__Alternatives_6_1 ) ) ;
    public final void rule__Operator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2786:1: ( ( ( rule__Operator__Alternatives_6_1 ) ) )
            // InternalTheory.g:2787:1: ( ( rule__Operator__Alternatives_6_1 ) )
            {
            // InternalTheory.g:2787:1: ( ( rule__Operator__Alternatives_6_1 ) )
            // InternalTheory.g:2788:2: ( rule__Operator__Alternatives_6_1 )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives_6_1()); 
            // InternalTheory.g:2789:2: ( rule__Operator__Alternatives_6_1 )
            // InternalTheory.g:2789:3: rule__Operator__Alternatives_6_1
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
    // InternalTheory.g:2798:1: rule__Operator__Group_6_1_1__0 : rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 ;
    public final void rule__Operator__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2802:1: ( rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1 )
            // InternalTheory.g:2803:2: rule__Operator__Group_6_1_1__0__Impl rule__Operator__Group_6_1_1__1
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
    // InternalTheory.g:2810:1: rule__Operator__Group_6_1_1__0__Impl : ( 'case' ) ;
    public final void rule__Operator__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2814:1: ( ( 'case' ) )
            // InternalTheory.g:2815:1: ( 'case' )
            {
            // InternalTheory.g:2815:1: ( 'case' )
            // InternalTheory.g:2816:2: 'case'
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
    // InternalTheory.g:2825:1: rule__Operator__Group_6_1_1__1 : rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 ;
    public final void rule__Operator__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2829:1: ( rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2 )
            // InternalTheory.g:2830:2: rule__Operator__Group_6_1_1__1__Impl rule__Operator__Group_6_1_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:2837:1: rule__Operator__Group_6_1_1__1__Impl : ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) ;
    public final void rule__Operator__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2841:1: ( ( ( rule__Operator__CaseAssignment_6_1_1_1 ) ) )
            // InternalTheory.g:2842:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            {
            // InternalTheory.g:2842:1: ( ( rule__Operator__CaseAssignment_6_1_1_1 ) )
            // InternalTheory.g:2843:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            {
             before(grammarAccess.getOperatorAccess().getCaseAssignment_6_1_1_1()); 
            // InternalTheory.g:2844:2: ( rule__Operator__CaseAssignment_6_1_1_1 )
            // InternalTheory.g:2844:3: rule__Operator__CaseAssignment_6_1_1_1
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
    // InternalTheory.g:2852:1: rule__Operator__Group_6_1_1__2 : rule__Operator__Group_6_1_1__2__Impl ;
    public final void rule__Operator__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2856:1: ( rule__Operator__Group_6_1_1__2__Impl )
            // InternalTheory.g:2857:2: rule__Operator__Group_6_1_1__2__Impl
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
    // InternalTheory.g:2863:1: rule__Operator__Group_6_1_1__2__Impl : ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) ;
    public final void rule__Operator__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2867:1: ( ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) ) )
            // InternalTheory.g:2868:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            {
            // InternalTheory.g:2868:1: ( ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* ) )
            // InternalTheory.g:2869:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            {
            // InternalTheory.g:2869:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 ) )
            // InternalTheory.g:2870:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2871:3: ( rule__Operator__CasesAssignment_6_1_1_2 )
            // InternalTheory.g:2871:4: rule__Operator__CasesAssignment_6_1_1_2
            {
            pushFollow(FOLLOW_25);
            rule__Operator__CasesAssignment_6_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 

            }

            // InternalTheory.g:2874:2: ( ( rule__Operator__CasesAssignment_6_1_1_2 )* )
            // InternalTheory.g:2875:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2()); 
            // InternalTheory.g:2876:3: ( rule__Operator__CasesAssignment_6_1_1_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalTheory.g:2876:4: rule__Operator__CasesAssignment_6_1_1_2
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalTheory.g:2886:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2890:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalTheory.g:2891:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalTheory.g:2898:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__CommentAssignment_0 )? ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2902:1: ( ( ( rule__Argument__CommentAssignment_0 )? ) )
            // InternalTheory.g:2903:1: ( ( rule__Argument__CommentAssignment_0 )? )
            {
            // InternalTheory.g:2903:1: ( ( rule__Argument__CommentAssignment_0 )? )
            // InternalTheory.g:2904:2: ( rule__Argument__CommentAssignment_0 )?
            {
             before(grammarAccess.getArgumentAccess().getCommentAssignment_0()); 
            // InternalTheory.g:2905:2: ( rule__Argument__CommentAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ML_COMMENT && LA41_0<=RULE_SL_COMMENT)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTheory.g:2905:3: rule__Argument__CommentAssignment_0
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
    // InternalTheory.g:2913:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2917:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalTheory.g:2918:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalTheory.g:2925:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2929:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalTheory.g:2930:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalTheory.g:2930:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalTheory.g:2931:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalTheory.g:2932:2: ( rule__Argument__NameAssignment_1 )
            // InternalTheory.g:2932:3: rule__Argument__NameAssignment_1
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
    // InternalTheory.g:2940:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2944:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // InternalTheory.g:2945:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:2952:1: rule__Argument__Group__2__Impl : ( ':' ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2956:1: ( ( ':' ) )
            // InternalTheory.g:2957:1: ( ':' )
            {
            // InternalTheory.g:2957:1: ( ':' )
            // InternalTheory.g:2958:2: ':'
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
    // InternalTheory.g:2967:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2971:1: ( rule__Argument__Group__3__Impl )
            // InternalTheory.g:2972:2: rule__Argument__Group__3__Impl
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
    // InternalTheory.g:2978:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__TypeAssignment_3 ) ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2982:1: ( ( ( rule__Argument__TypeAssignment_3 ) ) )
            // InternalTheory.g:2983:1: ( ( rule__Argument__TypeAssignment_3 ) )
            {
            // InternalTheory.g:2983:1: ( ( rule__Argument__TypeAssignment_3 ) )
            // InternalTheory.g:2984:2: ( rule__Argument__TypeAssignment_3 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_3()); 
            // InternalTheory.g:2985:2: ( rule__Argument__TypeAssignment_3 )
            // InternalTheory.g:2985:3: rule__Argument__TypeAssignment_3
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
    // InternalTheory.g:2994:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2998:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTheory.g:2999:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTheory.g:3006:1: rule__Case__Group__0__Impl : ( ( rule__Case__PatternAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3010:1: ( ( ( rule__Case__PatternAssignment_0 ) ) )
            // InternalTheory.g:3011:1: ( ( rule__Case__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3011:1: ( ( rule__Case__PatternAssignment_0 ) )
            // InternalTheory.g:3012:2: ( rule__Case__PatternAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3013:2: ( rule__Case__PatternAssignment_0 )
            // InternalTheory.g:3013:3: rule__Case__PatternAssignment_0
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
    // InternalTheory.g:3021:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3025:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTheory.g:3026:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3033:1: rule__Case__Group__1__Impl : ( '=>' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3037:1: ( ( '=>' ) )
            // InternalTheory.g:3038:1: ( '=>' )
            {
            // InternalTheory.g:3038:1: ( '=>' )
            // InternalTheory.g:3039:2: '=>'
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
    // InternalTheory.g:3048:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3052:1: ( rule__Case__Group__2__Impl )
            // InternalTheory.g:3053:2: rule__Case__Group__2__Impl
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
    // InternalTheory.g:3059:1: rule__Case__Group__2__Impl : ( ( rule__Case__FormulaAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3063:1: ( ( ( rule__Case__FormulaAssignment_2 ) ) )
            // InternalTheory.g:3064:1: ( ( rule__Case__FormulaAssignment_2 ) )
            {
            // InternalTheory.g:3064:1: ( ( rule__Case__FormulaAssignment_2 ) )
            // InternalTheory.g:3065:2: ( rule__Case__FormulaAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 
            // InternalTheory.g:3066:2: ( rule__Case__FormulaAssignment_2 )
            // InternalTheory.g:3066:3: rule__Case__FormulaAssignment_2
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
    // InternalTheory.g:3075:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3079:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // InternalTheory.g:3080:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
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
    // InternalTheory.g:3087:1: rule__Axiom__Group__0__Impl : ( ( rule__Axiom__CommentAssignment_0 )? ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3091:1: ( ( ( rule__Axiom__CommentAssignment_0 )? ) )
            // InternalTheory.g:3092:1: ( ( rule__Axiom__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3092:1: ( ( rule__Axiom__CommentAssignment_0 )? )
            // InternalTheory.g:3093:2: ( rule__Axiom__CommentAssignment_0 )?
            {
             before(grammarAccess.getAxiomAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3094:2: ( rule__Axiom__CommentAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ML_COMMENT && LA42_0<=RULE_SL_COMMENT)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTheory.g:3094:3: rule__Axiom__CommentAssignment_0
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
    // InternalTheory.g:3102:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3106:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // InternalTheory.g:3107:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
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
    // InternalTheory.g:3114:1: rule__Axiom__Group__1__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3118:1: ( ( '@' ) )
            // InternalTheory.g:3119:1: ( '@' )
            {
            // InternalTheory.g:3119:1: ( '@' )
            // InternalTheory.g:3120:2: '@'
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
    // InternalTheory.g:3129:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3133:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // InternalTheory.g:3134:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalTheory.g:3141:1: rule__Axiom__Group__2__Impl : ( ( rule__Axiom__NameAssignment_2 ) ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3145:1: ( ( ( rule__Axiom__NameAssignment_2 ) ) )
            // InternalTheory.g:3146:1: ( ( rule__Axiom__NameAssignment_2 ) )
            {
            // InternalTheory.g:3146:1: ( ( rule__Axiom__NameAssignment_2 ) )
            // InternalTheory.g:3147:2: ( rule__Axiom__NameAssignment_2 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_2()); 
            // InternalTheory.g:3148:2: ( rule__Axiom__NameAssignment_2 )
            // InternalTheory.g:3148:3: rule__Axiom__NameAssignment_2
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
    // InternalTheory.g:3156:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl rule__Axiom__Group__4 ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3160:1: ( rule__Axiom__Group__3__Impl rule__Axiom__Group__4 )
            // InternalTheory.g:3161:2: rule__Axiom__Group__3__Impl rule__Axiom__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3168:1: rule__Axiom__Group__3__Impl : ( ':' ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3172:1: ( ( ':' ) )
            // InternalTheory.g:3173:1: ( ':' )
            {
            // InternalTheory.g:3173:1: ( ':' )
            // InternalTheory.g:3174:2: ':'
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
    // InternalTheory.g:3183:1: rule__Axiom__Group__4 : rule__Axiom__Group__4__Impl ;
    public final void rule__Axiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3187:1: ( rule__Axiom__Group__4__Impl )
            // InternalTheory.g:3188:2: rule__Axiom__Group__4__Impl
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
    // InternalTheory.g:3194:1: rule__Axiom__Group__4__Impl : ( ( rule__Axiom__PredicateAssignment_4 ) ) ;
    public final void rule__Axiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3198:1: ( ( ( rule__Axiom__PredicateAssignment_4 ) ) )
            // InternalTheory.g:3199:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            {
            // InternalTheory.g:3199:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            // InternalTheory.g:3200:2: ( rule__Axiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 
            // InternalTheory.g:3201:2: ( rule__Axiom__PredicateAssignment_4 )
            // InternalTheory.g:3201:3: rule__Axiom__PredicateAssignment_4
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
    // InternalTheory.g:3210:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3214:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // InternalTheory.g:3215:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
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
    // InternalTheory.g:3222:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__CommentAssignment_0 )? ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3226:1: ( ( ( rule__Theorem__CommentAssignment_0 )? ) )
            // InternalTheory.g:3227:1: ( ( rule__Theorem__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3227:1: ( ( rule__Theorem__CommentAssignment_0 )? )
            // InternalTheory.g:3228:2: ( rule__Theorem__CommentAssignment_0 )?
            {
             before(grammarAccess.getTheoremAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3229:2: ( rule__Theorem__CommentAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ML_COMMENT && LA43_0<=RULE_SL_COMMENT)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTheory.g:3229:3: rule__Theorem__CommentAssignment_0
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
    // InternalTheory.g:3237:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3241:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // InternalTheory.g:3242:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
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
    // InternalTheory.g:3249:1: rule__Theorem__Group__1__Impl : ( '@' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3253:1: ( ( '@' ) )
            // InternalTheory.g:3254:1: ( '@' )
            {
            // InternalTheory.g:3254:1: ( '@' )
            // InternalTheory.g:3255:2: '@'
            {
             before(grammarAccess.getTheoremAccess().getCommercialAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTheory.g:3264:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3268:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // InternalTheory.g:3269:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalTheory.g:3276:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__NameAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3280:1: ( ( ( rule__Theorem__NameAssignment_2 ) ) )
            // InternalTheory.g:3281:1: ( ( rule__Theorem__NameAssignment_2 ) )
            {
            // InternalTheory.g:3281:1: ( ( rule__Theorem__NameAssignment_2 ) )
            // InternalTheory.g:3282:2: ( rule__Theorem__NameAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getNameAssignment_2()); 
            // InternalTheory.g:3283:2: ( rule__Theorem__NameAssignment_2 )
            // InternalTheory.g:3283:3: rule__Theorem__NameAssignment_2
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
    // InternalTheory.g:3291:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3295:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // InternalTheory.g:3296:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3303:1: rule__Theorem__Group__3__Impl : ( ':' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3307:1: ( ( ':' ) )
            // InternalTheory.g:3308:1: ( ':' )
            {
            // InternalTheory.g:3308:1: ( ':' )
            // InternalTheory.g:3309:2: ':'
            {
             before(grammarAccess.getTheoremAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTheory.g:3318:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3322:1: ( rule__Theorem__Group__4__Impl )
            // InternalTheory.g:3323:2: rule__Theorem__Group__4__Impl
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
    // InternalTheory.g:3329:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__PredicateAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3333:1: ( ( ( rule__Theorem__PredicateAssignment_4 ) ) )
            // InternalTheory.g:3334:1: ( ( rule__Theorem__PredicateAssignment_4 ) )
            {
            // InternalTheory.g:3334:1: ( ( rule__Theorem__PredicateAssignment_4 ) )
            // InternalTheory.g:3335:2: ( rule__Theorem__PredicateAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getPredicateAssignment_4()); 
            // InternalTheory.g:3336:2: ( rule__Theorem__PredicateAssignment_4 )
            // InternalTheory.g:3336:3: rule__Theorem__PredicateAssignment_4
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


    // $ANTLR start "rule__RuleBlock__Group__0"
    // InternalTheory.g:3345:1: rule__RuleBlock__Group__0 : rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 ;
    public final void rule__RuleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3349:1: ( rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 )
            // InternalTheory.g:3350:2: rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RuleBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__1();

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
    // $ANTLR end "rule__RuleBlock__Group__0"


    // $ANTLR start "rule__RuleBlock__Group__0__Impl"
    // InternalTheory.g:3357:1: rule__RuleBlock__Group__0__Impl : ( ( rule__RuleBlock__CommentAssignment_0 )? ) ;
    public final void rule__RuleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3361:1: ( ( ( rule__RuleBlock__CommentAssignment_0 )? ) )
            // InternalTheory.g:3362:1: ( ( rule__RuleBlock__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3362:1: ( ( rule__RuleBlock__CommentAssignment_0 )? )
            // InternalTheory.g:3363:2: ( rule__RuleBlock__CommentAssignment_0 )?
            {
             before(grammarAccess.getRuleBlockAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3364:2: ( rule__RuleBlock__CommentAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTheory.g:3364:3: rule__RuleBlock__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleBlock__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleBlockAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group__1"
    // InternalTheory.g:3372:1: rule__RuleBlock__Group__1 : rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 ;
    public final void rule__RuleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3376:1: ( rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2 )
            // InternalTheory.g:3377:2: rule__RuleBlock__Group__1__Impl rule__RuleBlock__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RuleBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__2();

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
    // $ANTLR end "rule__RuleBlock__Group__1"


    // $ANTLR start "rule__RuleBlock__Group__1__Impl"
    // InternalTheory.g:3384:1: rule__RuleBlock__Group__1__Impl : ( '@' ) ;
    public final void rule__RuleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3388:1: ( ( '@' ) )
            // InternalTheory.g:3389:1: ( '@' )
            {
            // InternalTheory.g:3389:1: ( '@' )
            // InternalTheory.g:3390:2: '@'
            {
             before(grammarAccess.getRuleBlockAccess().getCommercialAtKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group__2"
    // InternalTheory.g:3399:1: rule__RuleBlock__Group__2 : rule__RuleBlock__Group__2__Impl rule__RuleBlock__Group__3 ;
    public final void rule__RuleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3403:1: ( rule__RuleBlock__Group__2__Impl rule__RuleBlock__Group__3 )
            // InternalTheory.g:3404:2: rule__RuleBlock__Group__2__Impl rule__RuleBlock__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__RuleBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__3();

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
    // $ANTLR end "rule__RuleBlock__Group__2"


    // $ANTLR start "rule__RuleBlock__Group__2__Impl"
    // InternalTheory.g:3411:1: rule__RuleBlock__Group__2__Impl : ( ( rule__RuleBlock__NameAssignment_2 ) ) ;
    public final void rule__RuleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3415:1: ( ( ( rule__RuleBlock__NameAssignment_2 ) ) )
            // InternalTheory.g:3416:1: ( ( rule__RuleBlock__NameAssignment_2 ) )
            {
            // InternalTheory.g:3416:1: ( ( rule__RuleBlock__NameAssignment_2 ) )
            // InternalTheory.g:3417:2: ( rule__RuleBlock__NameAssignment_2 )
            {
             before(grammarAccess.getRuleBlockAccess().getNameAssignment_2()); 
            // InternalTheory.g:3418:2: ( rule__RuleBlock__NameAssignment_2 )
            // InternalTheory.g:3418:3: rule__RuleBlock__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__2__Impl"


    // $ANTLR start "rule__RuleBlock__Group__3"
    // InternalTheory.g:3426:1: rule__RuleBlock__Group__3 : rule__RuleBlock__Group__3__Impl rule__RuleBlock__Group__4 ;
    public final void rule__RuleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3430:1: ( rule__RuleBlock__Group__3__Impl rule__RuleBlock__Group__4 )
            // InternalTheory.g:3431:2: rule__RuleBlock__Group__3__Impl rule__RuleBlock__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__RuleBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__4();

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
    // $ANTLR end "rule__RuleBlock__Group__3"


    // $ANTLR start "rule__RuleBlock__Group__3__Impl"
    // InternalTheory.g:3438:1: rule__RuleBlock__Group__3__Impl : ( ':' ) ;
    public final void rule__RuleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3442:1: ( ( ':' ) )
            // InternalTheory.g:3443:1: ( ':' )
            {
            // InternalTheory.g:3443:1: ( ':' )
            // InternalTheory.g:3444:2: ':'
            {
             before(grammarAccess.getRuleBlockAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__3__Impl"


    // $ANTLR start "rule__RuleBlock__Group__4"
    // InternalTheory.g:3453:1: rule__RuleBlock__Group__4 : rule__RuleBlock__Group__4__Impl ;
    public final void rule__RuleBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3457:1: ( rule__RuleBlock__Group__4__Impl )
            // InternalTheory.g:3458:2: rule__RuleBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__4__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group__4"


    // $ANTLR start "rule__RuleBlock__Group__4__Impl"
    // InternalTheory.g:3464:1: rule__RuleBlock__Group__4__Impl : ( ( rule__RuleBlock__Group_4__0 ) ) ;
    public final void rule__RuleBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3468:1: ( ( ( rule__RuleBlock__Group_4__0 ) ) )
            // InternalTheory.g:3469:1: ( ( rule__RuleBlock__Group_4__0 ) )
            {
            // InternalTheory.g:3469:1: ( ( rule__RuleBlock__Group_4__0 ) )
            // InternalTheory.g:3470:2: ( rule__RuleBlock__Group_4__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup_4()); 
            // InternalTheory.g:3471:2: ( rule__RuleBlock__Group_4__0 )
            // InternalTheory.g:3471:3: rule__RuleBlock__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group__4__Impl"


    // $ANTLR start "rule__RuleBlock__Group_4__0"
    // InternalTheory.g:3480:1: rule__RuleBlock__Group_4__0 : rule__RuleBlock__Group_4__0__Impl rule__RuleBlock__Group_4__1 ;
    public final void rule__RuleBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3484:1: ( rule__RuleBlock__Group_4__0__Impl rule__RuleBlock__Group_4__1 )
            // InternalTheory.g:3485:2: rule__RuleBlock__Group_4__0__Impl rule__RuleBlock__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__RuleBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_4__1();

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
    // $ANTLR end "rule__RuleBlock__Group_4__0"


    // $ANTLR start "rule__RuleBlock__Group_4__0__Impl"
    // InternalTheory.g:3492:1: rule__RuleBlock__Group_4__0__Impl : ( ( rule__RuleBlock__Group_4_0__0 )? ) ;
    public final void rule__RuleBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3496:1: ( ( ( rule__RuleBlock__Group_4_0__0 )? ) )
            // InternalTheory.g:3497:1: ( ( rule__RuleBlock__Group_4_0__0 )? )
            {
            // InternalTheory.g:3497:1: ( ( rule__RuleBlock__Group_4_0__0 )? )
            // InternalTheory.g:3498:2: ( rule__RuleBlock__Group_4_0__0 )?
            {
             before(grammarAccess.getRuleBlockAccess().getGroup_4_0()); 
            // InternalTheory.g:3499:2: ( rule__RuleBlock__Group_4_0__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTheory.g:3499:3: rule__RuleBlock__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleBlock__Group_4_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleBlockAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group_4__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group_4__1"
    // InternalTheory.g:3507:1: rule__RuleBlock__Group_4__1 : rule__RuleBlock__Group_4__1__Impl ;
    public final void rule__RuleBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3511:1: ( rule__RuleBlock__Group_4__1__Impl )
            // InternalTheory.g:3512:2: rule__RuleBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_4__1__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group_4__1"


    // $ANTLR start "rule__RuleBlock__Group_4__1__Impl"
    // InternalTheory.g:3518:1: rule__RuleBlock__Group_4__1__Impl : ( ( rule__RuleBlock__RuleAssignment_4_1 ) ) ;
    public final void rule__RuleBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3522:1: ( ( ( rule__RuleBlock__RuleAssignment_4_1 ) ) )
            // InternalTheory.g:3523:1: ( ( rule__RuleBlock__RuleAssignment_4_1 ) )
            {
            // InternalTheory.g:3523:1: ( ( rule__RuleBlock__RuleAssignment_4_1 ) )
            // InternalTheory.g:3524:2: ( rule__RuleBlock__RuleAssignment_4_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getRuleAssignment_4_1()); 
            // InternalTheory.g:3525:2: ( rule__RuleBlock__RuleAssignment_4_1 )
            // InternalTheory.g:3525:3: rule__RuleBlock__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group_4__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group_4_0__0"
    // InternalTheory.g:3534:1: rule__RuleBlock__Group_4_0__0 : rule__RuleBlock__Group_4_0__0__Impl rule__RuleBlock__Group_4_0__1 ;
    public final void rule__RuleBlock__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3538:1: ( rule__RuleBlock__Group_4_0__0__Impl rule__RuleBlock__Group_4_0__1 )
            // InternalTheory.g:3539:2: rule__RuleBlock__Group_4_0__0__Impl rule__RuleBlock__Group_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleBlock__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_4_0__1();

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
    // $ANTLR end "rule__RuleBlock__Group_4_0__0"


    // $ANTLR start "rule__RuleBlock__Group_4_0__0__Impl"
    // InternalTheory.g:3546:1: rule__RuleBlock__Group_4_0__0__Impl : ( 'variables' ) ;
    public final void rule__RuleBlock__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3550:1: ( ( 'variables' ) )
            // InternalTheory.g:3551:1: ( 'variables' )
            {
            // InternalTheory.g:3551:1: ( 'variables' )
            // InternalTheory.g:3552:2: 'variables'
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesKeyword_4_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getVariablesKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__Group_4_0__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group_4_0__1"
    // InternalTheory.g:3561:1: rule__RuleBlock__Group_4_0__1 : rule__RuleBlock__Group_4_0__1__Impl ;
    public final void rule__RuleBlock__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3565:1: ( rule__RuleBlock__Group_4_0__1__Impl )
            // InternalTheory.g:3566:2: rule__RuleBlock__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group_4_0__1"


    // $ANTLR start "rule__RuleBlock__Group_4_0__1__Impl"
    // InternalTheory.g:3572:1: rule__RuleBlock__Group_4_0__1__Impl : ( ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* ) ) ;
    public final void rule__RuleBlock__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3576:1: ( ( ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* ) ) )
            // InternalTheory.g:3577:1: ( ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* ) )
            {
            // InternalTheory.g:3577:1: ( ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* ) )
            // InternalTheory.g:3578:2: ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* )
            {
            // InternalTheory.g:3578:2: ( ( rule__RuleBlock__VariablesAssignment_4_0_1 ) )
            // InternalTheory.g:3579:3: ( rule__RuleBlock__VariablesAssignment_4_0_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesAssignment_4_0_1()); 
            // InternalTheory.g:3580:3: ( rule__RuleBlock__VariablesAssignment_4_0_1 )
            // InternalTheory.g:3580:4: rule__RuleBlock__VariablesAssignment_4_0_1
            {
            pushFollow(FOLLOW_9);
            rule__RuleBlock__VariablesAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getVariablesAssignment_4_0_1()); 

            }

            // InternalTheory.g:3583:2: ( ( rule__RuleBlock__VariablesAssignment_4_0_1 )* )
            // InternalTheory.g:3584:3: ( rule__RuleBlock__VariablesAssignment_4_0_1 )*
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesAssignment_4_0_1()); 
            // InternalTheory.g:3585:3: ( rule__RuleBlock__VariablesAssignment_4_0_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ML_COMMENT && LA46_0<=RULE_ID)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalTheory.g:3585:4: rule__RuleBlock__VariablesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RuleBlock__VariablesAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getRuleBlockAccess().getVariablesAssignment_4_0_1()); 

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
    // $ANTLR end "rule__RuleBlock__Group_4_0__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTheory.g:3595:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3599:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTheory.g:3600:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalTheory.g:3607:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__CommentAssignment_0 )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3611:1: ( ( ( rule__Variable__CommentAssignment_0 )? ) )
            // InternalTheory.g:3612:1: ( ( rule__Variable__CommentAssignment_0 )? )
            {
            // InternalTheory.g:3612:1: ( ( rule__Variable__CommentAssignment_0 )? )
            // InternalTheory.g:3613:2: ( rule__Variable__CommentAssignment_0 )?
            {
             before(grammarAccess.getVariableAccess().getCommentAssignment_0()); 
            // InternalTheory.g:3614:2: ( rule__Variable__CommentAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ML_COMMENT && LA47_0<=RULE_SL_COMMENT)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTheory.g:3614:3: rule__Variable__CommentAssignment_0
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
    // InternalTheory.g:3622:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3626:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTheory.g:3627:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalTheory.g:3634:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3638:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalTheory.g:3639:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalTheory.g:3639:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalTheory.g:3640:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalTheory.g:3641:2: ( rule__Variable__NameAssignment_1 )
            // InternalTheory.g:3641:3: rule__Variable__NameAssignment_1
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
    // InternalTheory.g:3649:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3653:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalTheory.g:3654:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3661:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3665:1: ( ( ':' ) )
            // InternalTheory.g:3666:1: ( ':' )
            {
            // InternalTheory.g:3666:1: ( ':' )
            // InternalTheory.g:3667:2: ':'
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
    // InternalTheory.g:3676:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3680:1: ( rule__Variable__Group__3__Impl )
            // InternalTheory.g:3681:2: rule__Variable__Group__3__Impl
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
    // InternalTheory.g:3687:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3691:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalTheory.g:3692:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalTheory.g:3692:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalTheory.g:3693:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalTheory.g:3694:2: ( rule__Variable__TypeAssignment_3 )
            // InternalTheory.g:3694:3: rule__Variable__TypeAssignment_3
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


    // $ANTLR start "rule__RewriteRule__Group__0"
    // InternalTheory.g:3703:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3707:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // InternalTheory.g:3708:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTheory.g:3715:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__PatternAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3719:1: ( ( ( rule__RewriteRule__PatternAssignment_0 ) ) )
            // InternalTheory.g:3720:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3720:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            // InternalTheory.g:3721:2: ( rule__RewriteRule__PatternAssignment_0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3722:2: ( rule__RewriteRule__PatternAssignment_0 )
            // InternalTheory.g:3722:3: rule__RewriteRule__PatternAssignment_0
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
    // InternalTheory.g:3730:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3734:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // InternalTheory.g:3735:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3742:1: rule__RewriteRule__Group__1__Impl : ( '==' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3746:1: ( ( '==' ) )
            // InternalTheory.g:3747:1: ( '==' )
            {
            // InternalTheory.g:3747:1: ( '==' )
            // InternalTheory.g:3748:2: '=='
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
    // InternalTheory.g:3757:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3761:1: ( rule__RewriteRule__Group__2__Impl )
            // InternalTheory.g:3762:2: rule__RewriteRule__Group__2__Impl
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
    // InternalTheory.g:3768:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__Alternatives_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3772:1: ( ( ( rule__RewriteRule__Alternatives_2 ) ) )
            // InternalTheory.g:3773:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            {
            // InternalTheory.g:3773:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            // InternalTheory.g:3774:2: ( rule__RewriteRule__Alternatives_2 )
            {
             before(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 
            // InternalTheory.g:3775:2: ( rule__RewriteRule__Alternatives_2 )
            // InternalTheory.g:3775:3: rule__RewriteRule__Alternatives_2
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
    // InternalTheory.g:3784:1: rule__InferenceRule__Group__0 : rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 ;
    public final void rule__InferenceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3788:1: ( rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 )
            // InternalTheory.g:3789:2: rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTheory.g:3796:1: rule__InferenceRule__Group__0__Impl : ( ( rule__InferenceRule__GivenAssignment_0 )* ) ;
    public final void rule__InferenceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3800:1: ( ( ( rule__InferenceRule__GivenAssignment_0 )* ) )
            // InternalTheory.g:3801:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            {
            // InternalTheory.g:3801:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            // InternalTheory.g:3802:2: ( rule__InferenceRule__GivenAssignment_0 )*
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 
            // InternalTheory.g:3803:2: ( rule__InferenceRule__GivenAssignment_0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalTheory.g:3803:3: rule__InferenceRule__GivenAssignment_0
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalTheory.g:3811:1: rule__InferenceRule__Group__1 : rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 ;
    public final void rule__InferenceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3815:1: ( rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 )
            // InternalTheory.g:3816:2: rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3823:1: rule__InferenceRule__Group__1__Impl : ( '|-' ) ;
    public final void rule__InferenceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3827:1: ( ( '|-' ) )
            // InternalTheory.g:3828:1: ( '|-' )
            {
            // InternalTheory.g:3828:1: ( '|-' )
            // InternalTheory.g:3829:2: '|-'
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
    // InternalTheory.g:3838:1: rule__InferenceRule__Group__2 : rule__InferenceRule__Group__2__Impl ;
    public final void rule__InferenceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3842:1: ( rule__InferenceRule__Group__2__Impl )
            // InternalTheory.g:3843:2: rule__InferenceRule__Group__2__Impl
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
    // InternalTheory.g:3849:1: rule__InferenceRule__Group__2__Impl : ( ( rule__InferenceRule__InferAssignment_2 ) ) ;
    public final void rule__InferenceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3853:1: ( ( ( rule__InferenceRule__InferAssignment_2 ) ) )
            // InternalTheory.g:3854:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            {
            // InternalTheory.g:3854:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            // InternalTheory.g:3855:2: ( rule__InferenceRule__InferAssignment_2 )
            {
             before(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 
            // InternalTheory.g:3856:2: ( rule__InferenceRule__InferAssignment_2 )
            // InternalTheory.g:3856:3: rule__InferenceRule__InferAssignment_2
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
    // InternalTheory.g:3865:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3869:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalTheory.g:3870:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTheory.g:3877:1: rule__Given__Group__0__Impl : ( ( rule__Given__ExpressionAssignment_0 ) ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3881:1: ( ( ( rule__Given__ExpressionAssignment_0 ) ) )
            // InternalTheory.g:3882:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            {
            // InternalTheory.g:3882:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            // InternalTheory.g:3883:2: ( rule__Given__ExpressionAssignment_0 )
            {
             before(grammarAccess.getGivenAccess().getExpressionAssignment_0()); 
            // InternalTheory.g:3884:2: ( rule__Given__ExpressionAssignment_0 )
            // InternalTheory.g:3884:3: rule__Given__ExpressionAssignment_0
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
    // InternalTheory.g:3892:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3896:1: ( rule__Given__Group__1__Impl )
            // InternalTheory.g:3897:2: rule__Given__Group__1__Impl
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
    // InternalTheory.g:3903:1: rule__Given__Group__1__Impl : ( ( rule__Given__RequiredAssignment_1 )? ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3907:1: ( ( ( rule__Given__RequiredAssignment_1 )? ) )
            // InternalTheory.g:3908:1: ( ( rule__Given__RequiredAssignment_1 )? )
            {
            // InternalTheory.g:3908:1: ( ( rule__Given__RequiredAssignment_1 )? )
            // InternalTheory.g:3909:2: ( rule__Given__RequiredAssignment_1 )?
            {
             before(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 
            // InternalTheory.g:3910:2: ( rule__Given__RequiredAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTheory.g:3910:3: rule__Given__RequiredAssignment_1
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
    // InternalTheory.g:3919:1: rule__ConditionalRewrite__Group__0 : rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 ;
    public final void rule__ConditionalRewrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3923:1: ( rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 )
            // InternalTheory.g:3924:2: rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:3931:1: rule__ConditionalRewrite__Group__0__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) ;
    public final void rule__ConditionalRewrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3935:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) )
            // InternalTheory.g:3936:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            {
            // InternalTheory.g:3936:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            // InternalTheory.g:3937:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 
            // InternalTheory.g:3938:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            // InternalTheory.g:3938:3: rule__ConditionalRewrite__RewritesAssignment_0
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
    // InternalTheory.g:3946:1: rule__ConditionalRewrite__Group__1 : rule__ConditionalRewrite__Group__1__Impl ;
    public final void rule__ConditionalRewrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3950:1: ( rule__ConditionalRewrite__Group__1__Impl )
            // InternalTheory.g:3951:2: rule__ConditionalRewrite__Group__1__Impl
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
    // InternalTheory.g:3957:1: rule__ConditionalRewrite__Group__1__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) ;
    public final void rule__ConditionalRewrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3961:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) )
            // InternalTheory.g:3962:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            {
            // InternalTheory.g:3962:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            // InternalTheory.g:3963:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 
            // InternalTheory.g:3964:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_STRING) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalTheory.g:3964:3: rule__ConditionalRewrite__RewritesAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalTheory.g:3973:1: rule__ConditionalRewriteRule__Group__0 : rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 ;
    public final void rule__ConditionalRewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3977:1: ( rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 )
            // InternalTheory.g:3978:2: rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTheory.g:3985:1: rule__ConditionalRewriteRule__Group__0__Impl : ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3989:1: ( ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) )
            // InternalTheory.g:3990:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            {
            // InternalTheory.g:3990:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            // InternalTheory.g:3991:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0()); 
            // InternalTheory.g:3992:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            // InternalTheory.g:3992:3: rule__ConditionalRewriteRule__LhsAssignment_0
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
    // InternalTheory.g:4000:1: rule__ConditionalRewriteRule__Group__1 : rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 ;
    public final void rule__ConditionalRewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4004:1: ( rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 )
            // InternalTheory.g:4005:2: rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTheory.g:4012:1: rule__ConditionalRewriteRule__Group__1__Impl : ( '=>' ) ;
    public final void rule__ConditionalRewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4016:1: ( ( '=>' ) )
            // InternalTheory.g:4017:1: ( '=>' )
            {
            // InternalTheory.g:4017:1: ( '=>' )
            // InternalTheory.g:4018:2: '=>'
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
    // InternalTheory.g:4027:1: rule__ConditionalRewriteRule__Group__2 : rule__ConditionalRewriteRule__Group__2__Impl ;
    public final void rule__ConditionalRewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4031:1: ( rule__ConditionalRewriteRule__Group__2__Impl )
            // InternalTheory.g:4032:2: rule__ConditionalRewriteRule__Group__2__Impl
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
    // InternalTheory.g:4038:1: rule__ConditionalRewriteRule__Group__2__Impl : ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4042:1: ( ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) )
            // InternalTheory.g:4043:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            {
            // InternalTheory.g:4043:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            // InternalTheory.g:4044:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 
            // InternalTheory.g:4045:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            // InternalTheory.g:4045:3: rule__ConditionalRewriteRule__RhsAssignment_2
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
    // InternalTheory.g:4054:1: rule__Operator__UnorderedGroup_3 : ( rule__Operator__UnorderedGroup_3__0 )? ;
    public final void rule__Operator__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTheory.g:4059:1: ( ( rule__Operator__UnorderedGroup_3__0 )? )
            // InternalTheory.g:4060:2: ( rule__Operator__UnorderedGroup_3__0 )?
            {
            // InternalTheory.g:4060:2: ( rule__Operator__UnorderedGroup_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
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
                    // InternalTheory.g:4060:2: rule__Operator__UnorderedGroup_3__0
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
    // InternalTheory.g:4068:1: rule__Operator__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Operator__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTheory.g:4073:1: ( ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) ) )
            // InternalTheory.g:4074:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            {
            // InternalTheory.g:4074:3: ( ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) ) )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
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
                    // InternalTheory.g:4075:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    {
                    // InternalTheory.g:4075:3: ({...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) ) )
                    // InternalTheory.g:4076:4: {...}? => ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTheory.g:4076:104: ( ( ( rule__Operator__Group_3_0__0 ) ) )
                    // InternalTheory.g:4077:5: ( ( rule__Operator__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4083:5: ( ( rule__Operator__Group_3_0__0 ) )
                    // InternalTheory.g:4084:6: ( rule__Operator__Group_3_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_0()); 
                    // InternalTheory.g:4085:6: ( rule__Operator__Group_3_0__0 )
                    // InternalTheory.g:4085:7: rule__Operator__Group_3_0__0
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
                    // InternalTheory.g:4090:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    {
                    // InternalTheory.g:4090:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) ) )
                    // InternalTheory.g:4091:4: {...}? => ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTheory.g:4091:104: ( ( ( rule__Operator__NotationAssignment_3_1 ) ) )
                    // InternalTheory.g:4092:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4098:5: ( ( rule__Operator__NotationAssignment_3_1 ) )
                    // InternalTheory.g:4099:6: ( rule__Operator__NotationAssignment_3_1 )
                    {
                     before(grammarAccess.getOperatorAccess().getNotationAssignment_3_1()); 
                    // InternalTheory.g:4100:6: ( rule__Operator__NotationAssignment_3_1 )
                    // InternalTheory.g:4100:7: rule__Operator__NotationAssignment_3_1
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
                    // InternalTheory.g:4105:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    {
                    // InternalTheory.g:4105:3: ({...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) ) )
                    // InternalTheory.g:4106:4: {...}? => ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalTheory.g:4106:104: ( ( ( rule__Operator__Group_3_2__0 ) ) )
                    // InternalTheory.g:4107:5: ( ( rule__Operator__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:4113:5: ( ( rule__Operator__Group_3_2__0 ) )
                    // InternalTheory.g:4114:6: ( rule__Operator__Group_3_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_3_2()); 
                    // InternalTheory.g:4115:6: ( rule__Operator__Group_3_2__0 )
                    // InternalTheory.g:4115:7: rule__Operator__Group_3_2__0
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
    // InternalTheory.g:4128:1: rule__Operator__UnorderedGroup_3__0 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? ;
    public final void rule__Operator__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4132:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )? )
            // InternalTheory.g:4133:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:4134:2: ( rule__Operator__UnorderedGroup_3__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
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
                    // InternalTheory.g:4134:2: rule__Operator__UnorderedGroup_3__1
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
    // InternalTheory.g:4140:1: rule__Operator__UnorderedGroup_3__1 : rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? ;
    public final void rule__Operator__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4144:1: ( rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )? )
            // InternalTheory.g:4145:2: rule__Operator__UnorderedGroup_3__Impl ( rule__Operator__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_30);
            rule__Operator__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTheory.g:4146:2: ( rule__Operator__UnorderedGroup_3__2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
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
                    // InternalTheory.g:4146:2: rule__Operator__UnorderedGroup_3__2
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
    // InternalTheory.g:4152:1: rule__Operator__UnorderedGroup_3__2 : rule__Operator__UnorderedGroup_3__Impl ;
    public final void rule__Operator__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4156:1: ( rule__Operator__UnorderedGroup_3__Impl )
            // InternalTheory.g:4157:2: rule__Operator__UnorderedGroup_3__Impl
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
    // InternalTheory.g:4164:1: rule__Theory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4168:1: ( ( RULE_ID ) )
            // InternalTheory.g:4169:2: ( RULE_ID )
            {
            // InternalTheory.g:4169:2: ( RULE_ID )
            // InternalTheory.g:4170:3: RULE_ID
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
    // InternalTheory.g:4179:1: rule__Theory__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Theory__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4183:1: ( ( ruleParameter ) )
            // InternalTheory.g:4184:2: ( ruleParameter )
            {
            // InternalTheory.g:4184:2: ( ruleParameter )
            // InternalTheory.g:4185:3: ruleParameter
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
    // InternalTheory.g:4194:1: rule__Theory__ImportsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4198:1: ( ( RULE_ID ) )
            // InternalTheory.g:4199:2: ( RULE_ID )
            {
            // InternalTheory.g:4199:2: ( RULE_ID )
            // InternalTheory.g:4200:3: RULE_ID
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
    // InternalTheory.g:4209:1: rule__Theory__ImportsAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4213:1: ( ( RULE_ID ) )
            // InternalTheory.g:4214:2: ( RULE_ID )
            {
            // InternalTheory.g:4214:2: ( RULE_ID )
            // InternalTheory.g:4215:3: RULE_ID
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


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_0_1"
    // InternalTheory.g:4224:1: rule__Theory__InternalElementsAssignment_4_0_1 : ( ruleType ) ;
    public final void rule__Theory__InternalElementsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4228:1: ( ( ruleType ) )
            // InternalTheory.g:4229:2: ( ruleType )
            {
            // InternalTheory.g:4229:2: ( ruleType )
            // InternalTheory.g:4230:3: ruleType
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_0_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_1_1"
    // InternalTheory.g:4239:1: rule__Theory__InternalElementsAssignment_4_1_1 : ( ruleOperator ) ;
    public final void rule__Theory__InternalElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4243:1: ( ( ruleOperator ) )
            // InternalTheory.g:4244:2: ( ruleOperator )
            {
            // InternalTheory.g:4244:2: ( ruleOperator )
            // InternalTheory.g:4245:3: ruleOperator
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_1_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_2_1"
    // InternalTheory.g:4254:1: rule__Theory__InternalElementsAssignment_4_2_1 : ( ruleAxiom ) ;
    public final void rule__Theory__InternalElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4258:1: ( ( ruleAxiom ) )
            // InternalTheory.g:4259:2: ( ruleAxiom )
            {
            // InternalTheory.g:4259:2: ( ruleAxiom )
            // InternalTheory.g:4260:3: ruleAxiom
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_2_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_3_1"
    // InternalTheory.g:4269:1: rule__Theory__InternalElementsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Theory__InternalElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4273:1: ( ( ruleTheorem ) )
            // InternalTheory.g:4274:2: ( ruleTheorem )
            {
            // InternalTheory.g:4274:2: ( ruleTheorem )
            // InternalTheory.g:4275:3: ruleTheorem
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_3_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_4_1"
    // InternalTheory.g:4284:1: rule__Theory__InternalElementsAssignment_4_4_1 : ( ruleRuleBlock ) ;
    public final void rule__Theory__InternalElementsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4288:1: ( ( ruleRuleBlock ) )
            // InternalTheory.g:4289:2: ( ruleRuleBlock )
            {
            // InternalTheory.g:4289:2: ( ruleRuleBlock )
            // InternalTheory.g:4290:3: ruleRuleBlock
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsRuleBlockParserRuleCall_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsRuleBlockParserRuleCall_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_4_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalTheory.g:4299:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4303:1: ( ( RULE_ID ) )
            // InternalTheory.g:4304:2: ( RULE_ID )
            {
            // InternalTheory.g:4304:2: ( RULE_ID )
            // InternalTheory.g:4305:3: RULE_ID
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
    // InternalTheory.g:4314:1: rule__Type__CommentAssignment_0 : ( ( rule__Type__CommentAlternatives_0_0 ) ) ;
    public final void rule__Type__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4318:1: ( ( ( rule__Type__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4319:2: ( ( rule__Type__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4319:2: ( ( rule__Type__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4320:3: ( rule__Type__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getTypeAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4321:3: ( rule__Type__CommentAlternatives_0_0 )
            // InternalTheory.g:4321:4: rule__Type__CommentAlternatives_0_0
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
    // InternalTheory.g:4329:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4333:1: ( ( RULE_ID ) )
            // InternalTheory.g:4334:2: ( RULE_ID )
            {
            // InternalTheory.g:4334:2: ( RULE_ID )
            // InternalTheory.g:4335:3: RULE_ID
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
    // InternalTheory.g:4344:1: rule__Type__ParametersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4348:1: ( ( ( RULE_ID ) ) )
            // InternalTheory.g:4349:2: ( ( RULE_ID ) )
            {
            // InternalTheory.g:4349:2: ( ( RULE_ID ) )
            // InternalTheory.g:4350:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getParametersParameterCrossReference_2_1_0()); 
            // InternalTheory.g:4351:3: ( RULE_ID )
            // InternalTheory.g:4352:4: RULE_ID
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


    // $ANTLR start "rule__Type__ConstructorsAssignment_4"
    // InternalTheory.g:4363:1: rule__Type__ConstructorsAssignment_4 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4367:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4368:2: ( ruleConstructor )
            {
            // InternalTheory.g:4368:2: ( ruleConstructor )
            // InternalTheory.g:4369:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ConstructorsAssignment_4"


    // $ANTLR start "rule__Type__ConstructorsAssignment_5_1"
    // InternalTheory.g:4378:1: rule__Type__ConstructorsAssignment_5_1 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4382:1: ( ( ruleConstructor ) )
            // InternalTheory.g:4383:2: ( ruleConstructor )
            {
            // InternalTheory.g:4383:2: ( ruleConstructor )
            // InternalTheory.g:4384:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ConstructorsAssignment_5_1"


    // $ANTLR start "rule__Constructor__CommentAssignment_0"
    // InternalTheory.g:4393:1: rule__Constructor__CommentAssignment_0 : ( ( rule__Constructor__CommentAlternatives_0_0 ) ) ;
    public final void rule__Constructor__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4397:1: ( ( ( rule__Constructor__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4398:2: ( ( rule__Constructor__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4398:2: ( ( rule__Constructor__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4399:3: ( rule__Constructor__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getConstructorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4400:3: ( rule__Constructor__CommentAlternatives_0_0 )
            // InternalTheory.g:4400:4: rule__Constructor__CommentAlternatives_0_0
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
    // InternalTheory.g:4408:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4412:1: ( ( RULE_ID ) )
            // InternalTheory.g:4413:2: ( RULE_ID )
            {
            // InternalTheory.g:4413:2: ( RULE_ID )
            // InternalTheory.g:4414:3: RULE_ID
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
    // InternalTheory.g:4423:1: rule__Constructor__DestructorsAssignment_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4427:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4428:2: ( ruleDestructor )
            {
            // InternalTheory.g:4428:2: ( ruleDestructor )
            // InternalTheory.g:4429:3: ruleDestructor
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
    // InternalTheory.g:4438:1: rule__Constructor__DestructorsAssignment_2_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4442:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4443:2: ( ruleDestructor )
            {
            // InternalTheory.g:4443:2: ( ruleDestructor )
            // InternalTheory.g:4444:3: ruleDestructor
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
    // InternalTheory.g:4453:1: rule__Destructor__CommentAssignment_0 : ( ( rule__Destructor__CommentAlternatives_0_0 ) ) ;
    public final void rule__Destructor__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4457:1: ( ( ( rule__Destructor__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4458:2: ( ( rule__Destructor__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4458:2: ( ( rule__Destructor__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4459:3: ( rule__Destructor__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getDestructorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4460:3: ( rule__Destructor__CommentAlternatives_0_0 )
            // InternalTheory.g:4460:4: rule__Destructor__CommentAlternatives_0_0
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
    // InternalTheory.g:4468:1: rule__Destructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4472:1: ( ( RULE_ID ) )
            // InternalTheory.g:4473:2: ( RULE_ID )
            {
            // InternalTheory.g:4473:2: ( RULE_ID )
            // InternalTheory.g:4474:3: RULE_ID
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
    // InternalTheory.g:4483:1: rule__Destructor__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Destructor__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4487:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4488:2: ( RULE_STRING )
            {
            // InternalTheory.g:4488:2: ( RULE_STRING )
            // InternalTheory.g:4489:3: RULE_STRING
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
    // InternalTheory.g:4498:1: rule__Operator__CommentAssignment_0 : ( ( rule__Operator__CommentAlternatives_0_0 ) ) ;
    public final void rule__Operator__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4502:1: ( ( ( rule__Operator__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4503:2: ( ( rule__Operator__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4503:2: ( ( rule__Operator__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4504:3: ( rule__Operator__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getOperatorAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4505:3: ( rule__Operator__CommentAlternatives_0_0 )
            // InternalTheory.g:4505:4: rule__Operator__CommentAlternatives_0_0
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
    // InternalTheory.g:4513:1: rule__Operator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4517:1: ( ( RULE_ID ) )
            // InternalTheory.g:4518:2: ( RULE_ID )
            {
            // InternalTheory.g:4518:2: ( RULE_ID )
            // InternalTheory.g:4519:3: RULE_ID
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
    // InternalTheory.g:4528:1: rule__Operator__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4532:1: ( ( ruleArgument ) )
            // InternalTheory.g:4533:2: ( ruleArgument )
            {
            // InternalTheory.g:4533:2: ( ruleArgument )
            // InternalTheory.g:4534:3: ruleArgument
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
    // InternalTheory.g:4543:1: rule__Operator__ArgumentsAssignment_2_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4547:1: ( ( ruleArgument ) )
            // InternalTheory.g:4548:2: ( ruleArgument )
            {
            // InternalTheory.g:4548:2: ( ruleArgument )
            // InternalTheory.g:4549:3: ruleArgument
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
    // InternalTheory.g:4558:1: rule__Operator__TypeAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__Operator__TypeAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4562:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4563:2: ( RULE_STRING )
            {
            // InternalTheory.g:4563:2: ( RULE_STRING )
            // InternalTheory.g:4564:3: RULE_STRING
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
    // InternalTheory.g:4573:1: rule__Operator__NotationAssignment_3_1 : ( ruleNotation ) ;
    public final void rule__Operator__NotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4577:1: ( ( ruleNotation ) )
            // InternalTheory.g:4578:2: ( ruleNotation )
            {
            // InternalTheory.g:4578:2: ( ruleNotation )
            // InternalTheory.g:4579:3: ruleNotation
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
    // InternalTheory.g:4588:1: rule__Operator__AssociativeAssignment_3_2_0 : ( ( 'associative' ) ) ;
    public final void rule__Operator__AssociativeAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4592:1: ( ( ( 'associative' ) ) )
            // InternalTheory.g:4593:2: ( ( 'associative' ) )
            {
            // InternalTheory.g:4593:2: ( ( 'associative' ) )
            // InternalTheory.g:4594:3: ( 'associative' )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0()); 
            // InternalTheory.g:4595:3: ( 'associative' )
            // InternalTheory.g:4596:4: 'associative'
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
    // InternalTheory.g:4607:1: rule__Operator__CommutativeAssignment_3_2_1 : ( ( 'commutative' ) ) ;
    public final void rule__Operator__CommutativeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4611:1: ( ( ( 'commutative' ) ) )
            // InternalTheory.g:4612:2: ( ( 'commutative' ) )
            {
            // InternalTheory.g:4612:2: ( ( 'commutative' ) )
            // InternalTheory.g:4613:3: ( 'commutative' )
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0()); 
            // InternalTheory.g:4614:3: ( 'commutative' )
            // InternalTheory.g:4615:4: 'commutative'
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
    // InternalTheory.g:4626:1: rule__Operator__PrecedentAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Operator__PrecedentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4630:1: ( ( RULE_INT ) )
            // InternalTheory.g:4631:2: ( RULE_INT )
            {
            // InternalTheory.g:4631:2: ( RULE_INT )
            // InternalTheory.g:4632:3: RULE_INT
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
    // InternalTheory.g:4641:1: rule__Operator__WdAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Operator__WdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4645:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4646:2: ( RULE_STRING )
            {
            // InternalTheory.g:4646:2: ( RULE_STRING )
            // InternalTheory.g:4647:3: RULE_STRING
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
    // InternalTheory.g:4656:1: rule__Operator__DefinitionAssignment_6_1_0 : ( RULE_STRING ) ;
    public final void rule__Operator__DefinitionAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4660:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4661:2: ( RULE_STRING )
            {
            // InternalTheory.g:4661:2: ( RULE_STRING )
            // InternalTheory.g:4662:3: RULE_STRING
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
    // InternalTheory.g:4671:1: rule__Operator__CaseAssignment_6_1_1_1 : ( RULE_ID ) ;
    public final void rule__Operator__CaseAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4675:1: ( ( RULE_ID ) )
            // InternalTheory.g:4676:2: ( RULE_ID )
            {
            // InternalTheory.g:4676:2: ( RULE_ID )
            // InternalTheory.g:4677:3: RULE_ID
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
    // InternalTheory.g:4686:1: rule__Operator__CasesAssignment_6_1_1_2 : ( ruleCase ) ;
    public final void rule__Operator__CasesAssignment_6_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4690:1: ( ( ruleCase ) )
            // InternalTheory.g:4691:2: ( ruleCase )
            {
            // InternalTheory.g:4691:2: ( ruleCase )
            // InternalTheory.g:4692:3: ruleCase
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
    // InternalTheory.g:4701:1: rule__Argument__CommentAssignment_0 : ( ( rule__Argument__CommentAlternatives_0_0 ) ) ;
    public final void rule__Argument__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4705:1: ( ( ( rule__Argument__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4706:2: ( ( rule__Argument__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4706:2: ( ( rule__Argument__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4707:3: ( rule__Argument__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getArgumentAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4708:3: ( rule__Argument__CommentAlternatives_0_0 )
            // InternalTheory.g:4708:4: rule__Argument__CommentAlternatives_0_0
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
    // InternalTheory.g:4716:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4720:1: ( ( RULE_ID ) )
            // InternalTheory.g:4721:2: ( RULE_ID )
            {
            // InternalTheory.g:4721:2: ( RULE_ID )
            // InternalTheory.g:4722:3: RULE_ID
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
    // InternalTheory.g:4731:1: rule__Argument__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Argument__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4735:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4736:2: ( RULE_STRING )
            {
            // InternalTheory.g:4736:2: ( RULE_STRING )
            // InternalTheory.g:4737:3: RULE_STRING
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
    // InternalTheory.g:4746:1: rule__Case__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Case__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4750:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4751:2: ( RULE_STRING )
            {
            // InternalTheory.g:4751:2: ( RULE_STRING )
            // InternalTheory.g:4752:3: RULE_STRING
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
    // InternalTheory.g:4761:1: rule__Case__FormulaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Case__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4765:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4766:2: ( RULE_STRING )
            {
            // InternalTheory.g:4766:2: ( RULE_STRING )
            // InternalTheory.g:4767:3: RULE_STRING
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
    // InternalTheory.g:4776:1: rule__Axiom__CommentAssignment_0 : ( ( rule__Axiom__CommentAlternatives_0_0 ) ) ;
    public final void rule__Axiom__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4780:1: ( ( ( rule__Axiom__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4781:2: ( ( rule__Axiom__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4781:2: ( ( rule__Axiom__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4782:3: ( rule__Axiom__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getAxiomAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4783:3: ( rule__Axiom__CommentAlternatives_0_0 )
            // InternalTheory.g:4783:4: rule__Axiom__CommentAlternatives_0_0
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
    // InternalTheory.g:4791:1: rule__Axiom__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Axiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4795:1: ( ( RULE_ID ) )
            // InternalTheory.g:4796:2: ( RULE_ID )
            {
            // InternalTheory.g:4796:2: ( RULE_ID )
            // InternalTheory.g:4797:3: RULE_ID
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
    // InternalTheory.g:4806:1: rule__Axiom__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Axiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4810:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4811:2: ( RULE_STRING )
            {
            // InternalTheory.g:4811:2: ( RULE_STRING )
            // InternalTheory.g:4812:3: RULE_STRING
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
    // InternalTheory.g:4821:1: rule__Theorem__CommentAssignment_0 : ( ( rule__Theorem__CommentAlternatives_0_0 ) ) ;
    public final void rule__Theorem__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4825:1: ( ( ( rule__Theorem__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4826:2: ( ( rule__Theorem__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4826:2: ( ( rule__Theorem__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4827:3: ( rule__Theorem__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getTheoremAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4828:3: ( rule__Theorem__CommentAlternatives_0_0 )
            // InternalTheory.g:4828:4: rule__Theorem__CommentAlternatives_0_0
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
    // InternalTheory.g:4836:1: rule__Theorem__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Theorem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4840:1: ( ( RULE_ID ) )
            // InternalTheory.g:4841:2: ( RULE_ID )
            {
            // InternalTheory.g:4841:2: ( RULE_ID )
            // InternalTheory.g:4842:3: RULE_ID
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
    // InternalTheory.g:4851:1: rule__Theorem__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Theorem__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4855:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4856:2: ( RULE_STRING )
            {
            // InternalTheory.g:4856:2: ( RULE_STRING )
            // InternalTheory.g:4857:3: RULE_STRING
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


    // $ANTLR start "rule__RuleBlock__CommentAssignment_0"
    // InternalTheory.g:4866:1: rule__RuleBlock__CommentAssignment_0 : ( ( rule__RuleBlock__CommentAlternatives_0_0 ) ) ;
    public final void rule__RuleBlock__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4870:1: ( ( ( rule__RuleBlock__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4871:2: ( ( rule__RuleBlock__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4871:2: ( ( rule__RuleBlock__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4872:3: ( rule__RuleBlock__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getRuleBlockAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4873:3: ( rule__RuleBlock__CommentAlternatives_0_0 )
            // InternalTheory.g:4873:4: rule__RuleBlock__CommentAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__CommentAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getCommentAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__CommentAssignment_0"


    // $ANTLR start "rule__RuleBlock__NameAssignment_2"
    // InternalTheory.g:4881:1: rule__RuleBlock__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleBlock__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4885:1: ( ( RULE_ID ) )
            // InternalTheory.g:4886:2: ( RULE_ID )
            {
            // InternalTheory.g:4886:2: ( RULE_ID )
            // InternalTheory.g:4887:3: RULE_ID
            {
             before(grammarAccess.getRuleBlockAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__NameAssignment_2"


    // $ANTLR start "rule__RuleBlock__VariablesAssignment_4_0_1"
    // InternalTheory.g:4896:1: rule__RuleBlock__VariablesAssignment_4_0_1 : ( ruleVariable ) ;
    public final void rule__RuleBlock__VariablesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4900:1: ( ( ruleVariable ) )
            // InternalTheory.g:4901:2: ( ruleVariable )
            {
            // InternalTheory.g:4901:2: ( ruleVariable )
            // InternalTheory.g:4902:3: ruleVariable
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__VariablesAssignment_4_0_1"


    // $ANTLR start "rule__RuleBlock__RuleAssignment_4_1"
    // InternalTheory.g:4911:1: rule__RuleBlock__RuleAssignment_4_1 : ( ruleRule ) ;
    public final void rule__RuleBlock__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4915:1: ( ( ruleRule ) )
            // InternalTheory.g:4916:2: ( ruleRule )
            {
            // InternalTheory.g:4916:2: ( ruleRule )
            // InternalTheory.g:4917:3: ruleRule
            {
             before(grammarAccess.getRuleBlockAccess().getRuleRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleBlockAccess().getRuleRuleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBlock__RuleAssignment_4_1"


    // $ANTLR start "rule__Rule__RruleAssignment_0"
    // InternalTheory.g:4926:1: rule__Rule__RruleAssignment_0 : ( ruleRewriteRule ) ;
    public final void rule__Rule__RruleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4930:1: ( ( ruleRewriteRule ) )
            // InternalTheory.g:4931:2: ( ruleRewriteRule )
            {
            // InternalTheory.g:4931:2: ( ruleRewriteRule )
            // InternalTheory.g:4932:3: ruleRewriteRule
            {
             before(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RruleAssignment_0"


    // $ANTLR start "rule__Rule__IruleAssignment_1"
    // InternalTheory.g:4941:1: rule__Rule__IruleAssignment_1 : ( ruleInferenceRule ) ;
    public final void rule__Rule__IruleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4945:1: ( ( ruleInferenceRule ) )
            // InternalTheory.g:4946:2: ( ruleInferenceRule )
            {
            // InternalTheory.g:4946:2: ( ruleInferenceRule )
            // InternalTheory.g:4947:3: ruleInferenceRule
            {
             before(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__IruleAssignment_1"


    // $ANTLR start "rule__Variable__CommentAssignment_0"
    // InternalTheory.g:4956:1: rule__Variable__CommentAssignment_0 : ( ( rule__Variable__CommentAlternatives_0_0 ) ) ;
    public final void rule__Variable__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4960:1: ( ( ( rule__Variable__CommentAlternatives_0_0 ) ) )
            // InternalTheory.g:4961:2: ( ( rule__Variable__CommentAlternatives_0_0 ) )
            {
            // InternalTheory.g:4961:2: ( ( rule__Variable__CommentAlternatives_0_0 ) )
            // InternalTheory.g:4962:3: ( rule__Variable__CommentAlternatives_0_0 )
            {
             before(grammarAccess.getVariableAccess().getCommentAlternatives_0_0()); 
            // InternalTheory.g:4963:3: ( rule__Variable__CommentAlternatives_0_0 )
            // InternalTheory.g:4963:4: rule__Variable__CommentAlternatives_0_0
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
    // InternalTheory.g:4971:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4975:1: ( ( RULE_ID ) )
            // InternalTheory.g:4976:2: ( RULE_ID )
            {
            // InternalTheory.g:4976:2: ( RULE_ID )
            // InternalTheory.g:4977:3: RULE_ID
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
    // InternalTheory.g:4986:1: rule__Variable__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4990:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4991:2: ( RULE_STRING )
            {
            // InternalTheory.g:4991:2: ( RULE_STRING )
            // InternalTheory.g:4992:3: RULE_STRING
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


    // $ANTLR start "rule__RewriteRule__PatternAssignment_0"
    // InternalTheory.g:5001:1: rule__RewriteRule__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RewriteRule__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5005:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5006:2: ( RULE_STRING )
            {
            // InternalTheory.g:5006:2: ( RULE_STRING )
            // InternalTheory.g:5007:3: RULE_STRING
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
    // InternalTheory.g:5016:1: rule__RewriteRule__UruleAssignment_2_0 : ( ruleUnconditionalRewrite ) ;
    public final void rule__RewriteRule__UruleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5020:1: ( ( ruleUnconditionalRewrite ) )
            // InternalTheory.g:5021:2: ( ruleUnconditionalRewrite )
            {
            // InternalTheory.g:5021:2: ( ruleUnconditionalRewrite )
            // InternalTheory.g:5022:3: ruleUnconditionalRewrite
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
    // InternalTheory.g:5031:1: rule__RewriteRule__CruleAssignment_2_1 : ( ruleConditionalRewrite ) ;
    public final void rule__RewriteRule__CruleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5035:1: ( ( ruleConditionalRewrite ) )
            // InternalTheory.g:5036:2: ( ruleConditionalRewrite )
            {
            // InternalTheory.g:5036:2: ( ruleConditionalRewrite )
            // InternalTheory.g:5037:3: ruleConditionalRewrite
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
    // InternalTheory.g:5046:1: rule__InferenceRule__GivenAssignment_0 : ( ruleGiven ) ;
    public final void rule__InferenceRule__GivenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5050:1: ( ( ruleGiven ) )
            // InternalTheory.g:5051:2: ( ruleGiven )
            {
            // InternalTheory.g:5051:2: ( ruleGiven )
            // InternalTheory.g:5052:3: ruleGiven
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
    // InternalTheory.g:5061:1: rule__InferenceRule__InferAssignment_2 : ( ruleInfer ) ;
    public final void rule__InferenceRule__InferAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5065:1: ( ( ruleInfer ) )
            // InternalTheory.g:5066:2: ( ruleInfer )
            {
            // InternalTheory.g:5066:2: ( ruleInfer )
            // InternalTheory.g:5067:3: ruleInfer
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
    // InternalTheory.g:5076:1: rule__Given__ExpressionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Given__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5080:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5081:2: ( RULE_STRING )
            {
            // InternalTheory.g:5081:2: ( RULE_STRING )
            // InternalTheory.g:5082:3: RULE_STRING
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
    // InternalTheory.g:5091:1: rule__Given__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Given__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5095:1: ( ( ( 'required' ) ) )
            // InternalTheory.g:5096:2: ( ( 'required' ) )
            {
            // InternalTheory.g:5096:2: ( ( 'required' ) )
            // InternalTheory.g:5097:3: ( 'required' )
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalTheory.g:5098:3: ( 'required' )
            // InternalTheory.g:5099:4: 'required'
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
    // InternalTheory.g:5110:1: rule__Infer__ExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__Infer__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5114:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5115:2: ( RULE_STRING )
            {
            // InternalTheory.g:5115:2: ( RULE_STRING )
            // InternalTheory.g:5116:3: RULE_STRING
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
    // InternalTheory.g:5125:1: rule__UnconditionalRewrite__RhsAssignment : ( RULE_STRING ) ;
    public final void rule__UnconditionalRewrite__RhsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5129:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5130:2: ( RULE_STRING )
            {
            // InternalTheory.g:5130:2: ( RULE_STRING )
            // InternalTheory.g:5131:3: RULE_STRING
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
    // InternalTheory.g:5140:1: rule__ConditionalRewrite__RewritesAssignment_0 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5144:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:5145:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:5145:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:5146:3: ruleConditionalRewriteRule
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
    // InternalTheory.g:5155:1: rule__ConditionalRewrite__RewritesAssignment_1 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5159:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:5160:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:5160:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:5161:3: ruleConditionalRewriteRule
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
    // InternalTheory.g:5170:1: rule__ConditionalRewriteRule__LhsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5174:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5175:2: ( RULE_STRING )
            {
            // InternalTheory.g:5175:2: ( RULE_STRING )
            // InternalTheory.g:5176:3: RULE_STRING
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
    // InternalTheory.g:5185:1: rule__ConditionalRewriteRule__RhsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:5189:1: ( ( RULE_STRING ) )
            // InternalTheory.g:5190:2: ( RULE_STRING )
            {
            // InternalTheory.g:5190:2: ( RULE_STRING )
            // InternalTheory.g:5191:3: RULE_STRING
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001008013800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000031000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000A00000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001008003802L});

}
