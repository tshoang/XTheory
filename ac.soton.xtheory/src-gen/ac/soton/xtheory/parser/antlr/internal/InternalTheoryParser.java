package ac.soton.xtheory.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtheory.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'theory'", "'('", "')'", "'imports'", "'types'", "'operators'", "'axioms'", "'theorems'", "'rules'", "'end'", "'='", "'|'", "','", "':'", "'associative'", "'commutative'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'variables'", "'=='", "'|-'", "'required'", "'prefix'", "'infix'", "'postfix'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=5;
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

        public InternalTheoryParser(TokenStream input, TheoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Theory";
       	}

       	@Override
       	protected TheoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTheory"
    // InternalTheory.g:65:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalTheory.g:65:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalTheory.g:66:2: iv_ruleTheory= ruleTheory EOF
            {
             newCompositeNode(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheory=ruleTheory();

            state._fsp--;

             current =iv_ruleTheory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheory.g:72:1: ruleTheory returns [EObject current=null] : (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )* otherlv_18= 'end' ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_imports_6_0=null;
        Token lv_imports_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_internalElements_9_0 = null;

        EObject lv_internalElements_11_0 = null;

        EObject lv_internalElements_13_0 = null;

        EObject lv_internalElements_15_0 = null;

        EObject lv_internalElements_17_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:78:2: ( (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )* otherlv_18= 'end' ) )
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )* otherlv_18= 'end' )
            {
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )* otherlv_18= 'end' )
            // InternalTheory.g:80:3: otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )* otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoryAccess().getTheoryKeyword_0());
            		
            // InternalTheory.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:102:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTheory.g:103:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:107:4: ( (lv_parameters_3_0= ruleParameter ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTheory.g:108:5: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalTheory.g:108:5: (lv_parameters_3_0= ruleParameter )
                    	    // InternalTheory.g:109:6: lv_parameters_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTheoryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_3_0,
                    	    							"ac.soton.xtheory.Theory.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalTheory.g:131:3: (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTheory.g:132:4: otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTheoryAccess().getImportsKeyword_3_0());
                    			
                    // InternalTheory.g:136:4: ( (lv_imports_6_0= RULE_ID ) )
                    // InternalTheory.g:137:5: (lv_imports_6_0= RULE_ID )
                    {
                    // InternalTheory.g:137:5: (lv_imports_6_0= RULE_ID )
                    // InternalTheory.g:138:6: lv_imports_6_0= RULE_ID
                    {
                    lv_imports_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_imports_6_0, grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTheoryRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"imports",
                    							lv_imports_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalTheory.g:154:4: ( (lv_imports_7_0= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTheory.g:155:5: (lv_imports_7_0= RULE_ID )
                    	    {
                    	    // InternalTheory.g:155:5: (lv_imports_7_0= RULE_ID )
                    	    // InternalTheory.g:156:6: lv_imports_7_0= RULE_ID
                    	    {
                    	    lv_imports_7_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(lv_imports_7_0, grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTheoryRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"imports",
                    	    							lv_imports_7_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTheory.g:173:3: ( (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ ) | (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ ) )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt10=1;
                    }
                    break;
                case 16:
                    {
                    alt10=2;
                    }
                    break;
                case 17:
                    {
                    alt10=3;
                    }
                    break;
                case 18:
                    {
                    alt10=4;
                    }
                    break;
                case 19:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalTheory.g:174:4: (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ )
            	    {
            	    // InternalTheory.g:174:4: (otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+ )
            	    // InternalTheory.g:175:5: otherlv_8= 'types' ( (lv_internalElements_9_0= ruleType ) )+
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getTheoryAccess().getTypesKeyword_4_0_0());
            	    				
            	    // InternalTheory.g:179:5: ( (lv_internalElements_9_0= ruleType ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_SL_COMMENT)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalTheory.g:180:6: (lv_internalElements_9_0= ruleType )
            	    	    {
            	    	    // InternalTheory.g:180:6: (lv_internalElements_9_0= ruleType )
            	    	    // InternalTheory.g:181:7: lv_internalElements_9_0= ruleType
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_internalElements_9_0=ruleType();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"internalElements",
            	    	    								lv_internalElements_9_0,
            	    	    								"ac.soton.xtheory.Theory.Type");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTheory.g:200:4: (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ )
            	    {
            	    // InternalTheory.g:200:4: (otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+ )
            	    // InternalTheory.g:201:5: otherlv_10= 'operators' ( (lv_internalElements_11_0= ruleOperator ) )+
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

            	    					newLeafNode(otherlv_10, grammarAccess.getTheoryAccess().getOperatorsKeyword_4_1_0());
            	    				
            	    // InternalTheory.g:205:5: ( (lv_internalElements_11_0= ruleOperator ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_SL_COMMENT)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalTheory.g:206:6: (lv_internalElements_11_0= ruleOperator )
            	    	    {
            	    	    // InternalTheory.g:206:6: (lv_internalElements_11_0= ruleOperator )
            	    	    // InternalTheory.g:207:7: lv_internalElements_11_0= ruleOperator
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_internalElements_11_0=ruleOperator();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"internalElements",
            	    	    								lv_internalElements_11_0,
            	    	    								"ac.soton.xtheory.Theory.Operator");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTheory.g:226:4: (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ )
            	    {
            	    // InternalTheory.g:226:4: (otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+ )
            	    // InternalTheory.g:227:5: otherlv_12= 'axioms' ( (lv_internalElements_13_0= ruleAxiom ) )+
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_10); 

            	    					newLeafNode(otherlv_12, grammarAccess.getTheoryAccess().getAxiomsKeyword_4_2_0());
            	    				
            	    // InternalTheory.g:231:5: ( (lv_internalElements_13_0= ruleAxiom ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=RULE_ML_COMMENT && LA7_0<=RULE_SL_COMMENT)||LA7_0==31) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalTheory.g:232:6: (lv_internalElements_13_0= ruleAxiom )
            	    	    {
            	    	    // InternalTheory.g:232:6: (lv_internalElements_13_0= ruleAxiom )
            	    	    // InternalTheory.g:233:7: lv_internalElements_13_0= ruleAxiom
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_internalElements_13_0=ruleAxiom();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"internalElements",
            	    	    								lv_internalElements_13_0,
            	    	    								"ac.soton.xtheory.Theory.Axiom");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTheory.g:252:4: (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ )
            	    {
            	    // InternalTheory.g:252:4: (otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+ )
            	    // InternalTheory.g:253:5: otherlv_14= 'theorems' ( (lv_internalElements_15_0= ruleTheorem ) )+
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_10); 

            	    					newLeafNode(otherlv_14, grammarAccess.getTheoryAccess().getTheoremsKeyword_4_3_0());
            	    				
            	    // InternalTheory.g:257:5: ( (lv_internalElements_15_0= ruleTheorem ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>=RULE_ML_COMMENT && LA8_0<=RULE_SL_COMMENT)||LA8_0==31) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalTheory.g:258:6: (lv_internalElements_15_0= ruleTheorem )
            	    	    {
            	    	    // InternalTheory.g:258:6: (lv_internalElements_15_0= ruleTheorem )
            	    	    // InternalTheory.g:259:7: lv_internalElements_15_0= ruleTheorem
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_internalElements_15_0=ruleTheorem();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"internalElements",
            	    	    								lv_internalElements_15_0,
            	    	    								"ac.soton.xtheory.Theory.Theorem");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTheory.g:278:4: (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ )
            	    {
            	    // InternalTheory.g:278:4: (otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+ )
            	    // InternalTheory.g:279:5: otherlv_16= 'rules' ( (lv_internalElements_17_0= ruleRuleBlock ) )+
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_10); 

            	    					newLeafNode(otherlv_16, grammarAccess.getTheoryAccess().getRulesKeyword_4_4_0());
            	    				
            	    // InternalTheory.g:283:5: ( (lv_internalElements_17_0= ruleRuleBlock ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>=RULE_ML_COMMENT && LA9_0<=RULE_SL_COMMENT)||LA9_0==31) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalTheory.g:284:6: (lv_internalElements_17_0= ruleRuleBlock )
            	    	    {
            	    	    // InternalTheory.g:284:6: (lv_internalElements_17_0= ruleRuleBlock )
            	    	    // InternalTheory.g:285:7: lv_internalElements_17_0= ruleRuleBlock
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsRuleBlockParserRuleCall_4_4_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_internalElements_17_0=ruleRuleBlock();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"internalElements",
            	    	    								lv_internalElements_17_0,
            	    	    								"ac.soton.xtheory.Theory.RuleBlock");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTheoryAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleParameter"
    // InternalTheory.g:312:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTheory.g:312:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTheory.g:313:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTheory.g:319:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTheory.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTheory.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:327:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:327:3: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:328:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalTheory.g:347:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTheory.g:347:45: (iv_ruleType= ruleType EOF )
            // InternalTheory.g:348:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTheory.g:354:1: ruleType returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_constructors_6_0 = null;

        EObject lv_constructors_8_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:360:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* ) )
            // InternalTheory.g:361:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )
            {
            // InternalTheory.g:361:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )
            // InternalTheory.g:362:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )? otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )*
            {
            // InternalTheory.g:362:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ML_COMMENT && LA12_0<=RULE_SL_COMMENT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTheory.g:363:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:363:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:364:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:364:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
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
                            // InternalTheory.g:365:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getTypeAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:380:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getTypeAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:398:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:415:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTheory.g:416:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:420:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTheory.g:421:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalTheory.g:421:5: (otherlv_3= RULE_ID )
                    	    // InternalTheory.g:422:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTypeRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getParametersParameterCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getEqualsSignKeyword_3());
            		
            // InternalTheory.g:442:3: ( (lv_constructors_6_0= ruleConstructor ) )
            // InternalTheory.g:443:4: (lv_constructors_6_0= ruleConstructor )
            {
            // InternalTheory.g:443:4: (lv_constructors_6_0= ruleConstructor )
            // InternalTheory.g:444:5: lv_constructors_6_0= ruleConstructor
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_constructors_6_0=ruleConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					add(
            						current,
            						"constructors",
            						lv_constructors_6_0,
            						"ac.soton.xtheory.Theory.Constructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTheory.g:461:3: (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTheory.g:462:4: otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getVerticalLineKeyword_5_0());
            	    			
            	    // InternalTheory.g:466:4: ( (lv_constructors_8_0= ruleConstructor ) )
            	    // InternalTheory.g:467:5: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // InternalTheory.g:467:5: (lv_constructors_8_0= ruleConstructor )
            	    // InternalTheory.g:468:6: lv_constructors_8_0= ruleConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_constructors_8_0=ruleConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constructors",
            	    							lv_constructors_8_0,
            	    							"ac.soton.xtheory.Theory.Constructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleConstructor"
    // InternalTheory.g:490:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalTheory.g:490:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalTheory.g:491:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalTheory.g:497:1: ruleConstructor returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_destructors_3_0 = null;

        EObject lv_destructors_5_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:503:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? ) )
            // InternalTheory.g:504:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? )
            {
            // InternalTheory.g:504:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? )
            // InternalTheory.g:505:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )?
            {
            // InternalTheory.g:505:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ML_COMMENT && LA17_0<=RULE_SL_COMMENT)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTheory.g:506:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:506:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:507:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:507:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ML_COMMENT) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_SL_COMMENT) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTheory.g:508:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getConstructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:523:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getConstructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:540:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:541:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:541:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:542:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:558:3: (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTheory.g:559:4: otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:563:4: ( (lv_destructors_3_0= ruleDestructor ) )
                    // InternalTheory.g:564:5: (lv_destructors_3_0= ruleDestructor )
                    {
                    // InternalTheory.g:564:5: (lv_destructors_3_0= ruleDestructor )
                    // InternalTheory.g:565:6: lv_destructors_3_0= ruleDestructor
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_destructors_3_0=ruleDestructor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"destructors",
                    							lv_destructors_3_0,
                    							"ac.soton.xtheory.Theory.Destructor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:582:4: (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTheory.g:583:5: otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTheory.g:587:5: ( (lv_destructors_5_0= ruleDestructor ) )
                    	    // InternalTheory.g:588:6: (lv_destructors_5_0= ruleDestructor )
                    	    {
                    	    // InternalTheory.g:588:6: (lv_destructors_5_0= ruleDestructor )
                    	    // InternalTheory.g:589:7: lv_destructors_5_0= ruleDestructor
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_destructors_5_0=ruleDestructor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"destructors",
                    	    								lv_destructors_5_0,
                    	    								"ac.soton.xtheory.Theory.Destructor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleDestructor"
    // InternalTheory.g:616:1: entryRuleDestructor returns [EObject current=null] : iv_ruleDestructor= ruleDestructor EOF ;
    public final EObject entryRuleDestructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructor = null;


        try {
            // InternalTheory.g:616:51: (iv_ruleDestructor= ruleDestructor EOF )
            // InternalTheory.g:617:2: iv_ruleDestructor= ruleDestructor EOF
            {
             newCompositeNode(grammarAccess.getDestructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestructor=ruleDestructor();

            state._fsp--;

             current =iv_ruleDestructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestructor"


    // $ANTLR start "ruleDestructor"
    // InternalTheory.g:623:1: ruleDestructor returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDestructor() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:629:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:630:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:630:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:631:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:631:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_SL_COMMENT)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTheory.g:632:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:632:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:633:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:633:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ML_COMMENT) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_SL_COMMENT) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalTheory.g:634:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getDestructorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDestructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:649:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getDestructorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDestructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:666:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:667:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:667:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:668:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructorAccess().getColonKeyword_2());
            		
            // InternalTheory.g:688:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:689:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:689:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:690:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestructor"


    // $ANTLR start "entryRuleOperator"
    // InternalTheory.g:710:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalTheory.g:710:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalTheory.g:711:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalTheory.g:717:1: ruleOperator returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token lv_associative_11_0=null;
        Token lv_commutative_12_0=null;
        Token otherlv_13=null;
        Token lv_precedent_14_0=null;
        Token otherlv_15=null;
        Token lv_wd_16_0=null;
        Token otherlv_17=null;
        Token lv_definition_18_0=null;
        Token otherlv_19=null;
        Token lv_case_20_0=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;

        Enumerator lv_notation_10_0 = null;

        EObject lv_cases_21_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:723:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? ) )
            // InternalTheory.g:724:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? )
            {
            // InternalTheory.g:724:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? )
            // InternalTheory.g:725:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )?
            {
            // InternalTheory.g:725:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTheory.g:726:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:726:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:727:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:727:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ML_COMMENT) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_SL_COMMENT) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalTheory.g:728:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getOperatorAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperatorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:743:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getOperatorAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperatorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:761:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:778:3: (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTheory.g:779:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:783:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalTheory.g:784:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalTheory.g:784:5: (lv_arguments_3_0= ruleArgument )
                    // InternalTheory.g:785:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"ac.soton.xtheory.Theory.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:802:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==23) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalTheory.g:803:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOperatorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTheory.g:807:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalTheory.g:808:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalTheory.g:808:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalTheory.g:809:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"ac.soton.xtheory.Theory.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalTheory.g:832:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) )
            // InternalTheory.g:833:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) )
            {
            // InternalTheory.g:833:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) )
            // InternalTheory.g:834:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            				
            // InternalTheory.g:837:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* )
            // InternalTheory.g:838:6: ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )*
            {
            // InternalTheory.g:838:6: ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )*
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 >= 36 && LA27_0 <= 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTheory.g:839:4: ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalTheory.g:839:4: ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalTheory.g:840:5: {...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTheory.g:840:105: ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) )
            	    // InternalTheory.g:841:6: ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalTheory.g:844:9: ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) )
            	    // InternalTheory.g:844:10: {...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:844:19: (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) )
            	    // InternalTheory.g:844:20: otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_18); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperatorAccess().getColonKeyword_3_0_0());
            	    								
            	    // InternalTheory.g:848:9: ( (lv_type_9_0= RULE_STRING ) )
            	    // InternalTheory.g:849:10: (lv_type_9_0= RULE_STRING )
            	    {
            	    // InternalTheory.g:849:10: (lv_type_9_0= RULE_STRING )
            	    // InternalTheory.g:850:11: lv_type_9_0= RULE_STRING
            	    {
            	    lv_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_type_9_0, grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getOperatorRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												lv_type_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTheory.g:872:4: ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) )
            	    {
            	    // InternalTheory.g:872:4: ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) )
            	    // InternalTheory.g:873:5: {...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTheory.g:873:105: ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) )
            	    // InternalTheory.g:874:6: ({...}? => ( (lv_notation_10_0= ruleNotation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalTheory.g:877:9: ({...}? => ( (lv_notation_10_0= ruleNotation ) ) )
            	    // InternalTheory.g:877:10: {...}? => ( (lv_notation_10_0= ruleNotation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:877:19: ( (lv_notation_10_0= ruleNotation ) )
            	    // InternalTheory.g:877:20: (lv_notation_10_0= ruleNotation )
            	    {
            	    // InternalTheory.g:877:20: (lv_notation_10_0= ruleNotation )
            	    // InternalTheory.g:878:10: lv_notation_10_0= ruleNotation
            	    {

            	    										newCompositeNode(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_notation_10_0=ruleNotation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getOperatorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"notation",
            	    											lv_notation_10_0,
            	    											"ac.soton.xtheory.Theory.Notation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTheory.g:900:4: ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) )
            	    {
            	    // InternalTheory.g:900:4: ({...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) )
            	    // InternalTheory.g:901:5: {...}? => ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalTheory.g:901:105: ( ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) )
            	    // InternalTheory.g:902:6: ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalTheory.g:905:9: ({...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) )
            	    // InternalTheory.g:905:10: {...}? => ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:905:19: ( ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? )
            	    // InternalTheory.g:905:20: ( (lv_associative_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )?
            	    {
            	    // InternalTheory.g:905:20: ( (lv_associative_11_0= 'associative' ) )
            	    // InternalTheory.g:906:10: (lv_associative_11_0= 'associative' )
            	    {
            	    // InternalTheory.g:906:10: (lv_associative_11_0= 'associative' )
            	    // InternalTheory.g:907:11: lv_associative_11_0= 'associative'
            	    {
            	    lv_associative_11_0=(Token)match(input,25,FOLLOW_21); 

            	    											newLeafNode(lv_associative_11_0, grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_3_2_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getOperatorRule());
            	    											}
            	    											setWithLastConsumed(current, "associative", true, "associative");
            	    										

            	    }


            	    }

            	    // InternalTheory.g:919:9: ( (lv_commutative_12_0= 'commutative' ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==26) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalTheory.g:920:10: (lv_commutative_12_0= 'commutative' )
            	            {
            	            // InternalTheory.g:920:10: (lv_commutative_12_0= 'commutative' )
            	            // InternalTheory.g:921:11: lv_commutative_12_0= 'commutative'
            	            {
            	            lv_commutative_12_0=(Token)match(input,26,FOLLOW_20); 

            	            											newLeafNode(lv_commutative_12_0, grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_3_2_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getOperatorRule());
            	            											}
            	            											setWithLastConsumed(current, "commutative", true, "commutative");
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            				

            }

            // InternalTheory.g:946:3: (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTheory.g:947:4: otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperatorAccess().getNumberSignKeyword_4_0());
                    			
                    // InternalTheory.g:951:4: ( (lv_precedent_14_0= RULE_INT ) )
                    // InternalTheory.g:952:5: (lv_precedent_14_0= RULE_INT )
                    {
                    // InternalTheory.g:952:5: (lv_precedent_14_0= RULE_INT )
                    // InternalTheory.g:953:6: lv_precedent_14_0= RULE_INT
                    {
                    lv_precedent_14_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_precedent_14_0, grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"precedent",
                    							lv_precedent_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:970:3: (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTheory.g:971:4: otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getOperatorAccess().getForKeyword_5_0());
                    			
                    // InternalTheory.g:975:4: ( (lv_wd_16_0= RULE_STRING ) )
                    // InternalTheory.g:976:5: (lv_wd_16_0= RULE_STRING )
                    {
                    // InternalTheory.g:976:5: (lv_wd_16_0= RULE_STRING )
                    // InternalTheory.g:977:6: lv_wd_16_0= RULE_STRING
                    {
                    lv_wd_16_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_wd_16_0, grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wd",
                    							lv_wd_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:994:3: (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTheory.g:995:4: otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) )
                    {
                    otherlv_17=(Token)match(input,21,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getOperatorAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalTheory.g:999:4: ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_STRING) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==29) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalTheory.g:1000:5: ( (lv_definition_18_0= RULE_STRING ) )
                            {
                            // InternalTheory.g:1000:5: ( (lv_definition_18_0= RULE_STRING ) )
                            // InternalTheory.g:1001:6: (lv_definition_18_0= RULE_STRING )
                            {
                            // InternalTheory.g:1001:6: (lv_definition_18_0= RULE_STRING )
                            // InternalTheory.g:1002:7: lv_definition_18_0= RULE_STRING
                            {
                            lv_definition_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_definition_18_0, grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOperatorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"definition",
                            								lv_definition_18_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1019:5: (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ )
                            {
                            // InternalTheory.g:1019:5: (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ )
                            // InternalTheory.g:1020:6: otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+
                            {
                            otherlv_19=(Token)match(input,29,FOLLOW_3); 

                            						newLeafNode(otherlv_19, grammarAccess.getOperatorAccess().getCaseKeyword_6_1_1_0());
                            					
                            // InternalTheory.g:1024:6: ( (lv_case_20_0= RULE_ID ) )
                            // InternalTheory.g:1025:7: (lv_case_20_0= RULE_ID )
                            {
                            // InternalTheory.g:1025:7: (lv_case_20_0= RULE_ID )
                            // InternalTheory.g:1026:8: lv_case_20_0= RULE_ID
                            {
                            lv_case_20_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                            								newLeafNode(lv_case_20_0, grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_6_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getOperatorRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"case",
                            									lv_case_20_0,
                            									"org.eclipse.xtext.common.Terminals.ID");
                            							

                            }


                            }

                            // InternalTheory.g:1042:6: ( (lv_cases_21_0= ruleCase ) )+
                            int cnt30=0;
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==RULE_STRING) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalTheory.g:1043:7: (lv_cases_21_0= ruleCase )
                            	    {
                            	    // InternalTheory.g:1043:7: (lv_cases_21_0= ruleCase )
                            	    // InternalTheory.g:1044:8: lv_cases_21_0= ruleCase
                            	    {

                            	    								newCompositeNode(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_6_1_1_2_0());
                            	    							
                            	    pushFollow(FOLLOW_26);
                            	    lv_cases_21_0=ruleCase();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOperatorRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"cases",
                            	    									lv_cases_21_0,
                            	    									"ac.soton.xtheory.Theory.Case");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt30 >= 1 ) break loop30;
                                        EarlyExitException eee =
                                            new EarlyExitException(30, input);
                                        throw eee;
                                }
                                cnt30++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleArgument"
    // InternalTheory.g:1068:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalTheory.g:1068:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalTheory.g:1069:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalTheory.g:1075:1: ruleArgument returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1081:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1082:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1082:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1083:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:1083:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ML_COMMENT && LA34_0<=RULE_SL_COMMENT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTheory.g:1084:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1084:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1085:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1085:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ML_COMMENT) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==RULE_SL_COMMENT) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalTheory.g:1086:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getArgumentAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getArgumentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1101:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getArgumentAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getArgumentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:1118:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1119:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1119:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1120:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1140:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:1141:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:1141:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:1142:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleCase"
    // InternalTheory.g:1162:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalTheory.g:1162:45: (iv_ruleCase= ruleCase EOF )
            // InternalTheory.g:1163:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTheory.g:1169:1: ruleCase returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        Token lv_formula_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1175:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1176:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1176:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1177:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1177:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1178:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1178:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1179:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_pattern_0_0, grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:1199:3: ( (lv_formula_2_0= RULE_STRING ) )
            // InternalTheory.g:1200:4: (lv_formula_2_0= RULE_STRING )
            {
            // InternalTheory.g:1200:4: (lv_formula_2_0= RULE_STRING )
            // InternalTheory.g:1201:5: lv_formula_2_0= RULE_STRING
            {
            lv_formula_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_formula_2_0, grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"formula",
            						lv_formula_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAxiom"
    // InternalTheory.g:1221:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalTheory.g:1221:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalTheory.g:1222:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalTheory.g:1228:1: ruleAxiom returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_predicate_4_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1234:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1235:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1235:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) )
            // InternalTheory.g:1236:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) )
            {
            // InternalTheory.g:1236:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ML_COMMENT && LA36_0<=RULE_SL_COMMENT)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTheory.g:1237:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1237:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1238:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1238:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ML_COMMENT) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_SL_COMMENT) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalTheory.g:1239:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getAxiomAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAxiomRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1254:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getAxiomAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAxiomRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAxiomAccess().getCommercialAtKeyword_1());
            		
            // InternalTheory.g:1275:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTheory.g:1276:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTheory.g:1276:4: (lv_name_2_0= RULE_ID )
            // InternalTheory.g:1277:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAxiomAccess().getColonKeyword_3());
            		
            // InternalTheory.g:1297:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalTheory.g:1298:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalTheory.g:1298:4: (lv_predicate_4_0= RULE_STRING )
            // InternalTheory.g:1299:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_4_0, grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTheorem"
    // InternalTheory.g:1319:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // InternalTheory.g:1319:48: (iv_ruleTheorem= ruleTheorem EOF )
            // InternalTheory.g:1320:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // InternalTheory.g:1326:1: ruleTheorem returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleTheorem() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_predicate_4_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1332:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1333:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1333:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) )
            // InternalTheory.g:1334:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) )
            {
            // InternalTheory.g:1334:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ML_COMMENT && LA38_0<=RULE_SL_COMMENT)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTheory.g:1335:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1335:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1336:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1336:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ML_COMMENT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_SL_COMMENT) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalTheory.g:1337:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getTheoremAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTheoremRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1352:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getTheoremAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTheoremRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremAccess().getCommercialAtKeyword_1());
            		
            // InternalTheory.g:1373:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTheory.g:1374:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTheory.g:1374:4: (lv_name_2_0= RULE_ID )
            // InternalTheory.g:1375:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoremRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getColonKeyword_3());
            		
            // InternalTheory.g:1395:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalTheory.g:1396:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalTheory.g:1396:4: (lv_predicate_4_0= RULE_STRING )
            // InternalTheory.g:1397:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_4_0, grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoremRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalTheory.g:1417:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalTheory.g:1417:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalTheory.g:1418:2: iv_ruleRuleBlock= ruleRuleBlock EOF
            {
             newCompositeNode(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBlock=ruleRuleBlock();

            state._fsp--;

             current =iv_ruleRuleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalTheory.g:1424:1: ruleRuleBlock returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) ) ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_variables_5_0 = null;

        EObject lv_rule_6_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1430:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) ) ) )
            // InternalTheory.g:1431:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) ) )
            {
            // InternalTheory.g:1431:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) ) )
            // InternalTheory.g:1432:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) )
            {
            // InternalTheory.g:1432:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ML_COMMENT && LA40_0<=RULE_SL_COMMENT)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTheory.g:1433:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1433:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1434:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1434:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ML_COMMENT) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_SL_COMMENT) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalTheory.g:1435:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getRuleBlockAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRuleBlockRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1450:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_28); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getRuleBlockAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRuleBlockRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleBlockAccess().getCommercialAtKeyword_1());
            		
            // InternalTheory.g:1471:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTheory.g:1472:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTheory.g:1472:4: (lv_name_2_0= RULE_ID )
            // InternalTheory.g:1473:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRuleBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleBlockAccess().getColonKeyword_3());
            		
            // InternalTheory.g:1493:3: ( (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) ) )
            // InternalTheory.g:1494:4: (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )? ( (lv_rule_6_0= ruleRule ) )
            {
            // InternalTheory.g:1494:4: (otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTheory.g:1495:5: otherlv_4= 'variables' ( (lv_variables_5_0= ruleVariable ) )+
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_8); 

                    					newLeafNode(otherlv_4, grammarAccess.getRuleBlockAccess().getVariablesKeyword_4_0_0());
                    				
                    // InternalTheory.g:1499:5: ( (lv_variables_5_0= ruleVariable ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_SL_COMMENT)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTheory.g:1500:6: (lv_variables_5_0= ruleVariable )
                    	    {
                    	    // InternalTheory.g:1500:6: (lv_variables_5_0= ruleVariable )
                    	    // InternalTheory.g:1501:7: lv_variables_5_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_variables_5_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_5_0,
                    	    								"ac.soton.xtheory.Theory.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }

            // InternalTheory.g:1519:4: ( (lv_rule_6_0= ruleRule ) )
            // InternalTheory.g:1520:5: (lv_rule_6_0= ruleRule )
            {
            // InternalTheory.g:1520:5: (lv_rule_6_0= ruleRule )
            // InternalTheory.g:1521:6: lv_rule_6_0= ruleRule
            {

            						newCompositeNode(grammarAccess.getRuleBlockAccess().getRuleRuleParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_rule_6_0=ruleRule();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRuleBlockRule());
            						}
            						set(
            							current,
            							"rule",
            							lv_rule_6_0,
            							"ac.soton.xtheory.Theory.Rule");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalTheory.g:1543:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTheory.g:1543:45: (iv_ruleRule= ruleRule EOF )
            // InternalTheory.g:1544:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTheory.g:1550:1: ruleRule returns [EObject current=null] : ( ( (lv_rrule_0_0= ruleRewriteRule ) ) | ( (lv_irule_1_0= ruleInferenceRule ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject lv_rrule_0_0 = null;

        EObject lv_irule_1_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1556:2: ( ( ( (lv_rrule_0_0= ruleRewriteRule ) ) | ( (lv_irule_1_0= ruleInferenceRule ) ) ) )
            // InternalTheory.g:1557:2: ( ( (lv_rrule_0_0= ruleRewriteRule ) ) | ( (lv_irule_1_0= ruleInferenceRule ) ) )
            {
            // InternalTheory.g:1557:2: ( ( (lv_rrule_0_0= ruleRewriteRule ) ) | ( (lv_irule_1_0= ruleInferenceRule ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==33) ) {
                    alt43=1;
                }
                else if ( (LA43_1==RULE_STRING||(LA43_1>=34 && LA43_1<=35)) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==34) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalTheory.g:1558:3: ( (lv_rrule_0_0= ruleRewriteRule ) )
                    {
                    // InternalTheory.g:1558:3: ( (lv_rrule_0_0= ruleRewriteRule ) )
                    // InternalTheory.g:1559:4: (lv_rrule_0_0= ruleRewriteRule )
                    {
                    // InternalTheory.g:1559:4: (lv_rrule_0_0= ruleRewriteRule )
                    // InternalTheory.g:1560:5: lv_rrule_0_0= ruleRewriteRule
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rrule_0_0=ruleRewriteRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRule());
                    					}
                    					set(
                    						current,
                    						"rrule",
                    						lv_rrule_0_0,
                    						"ac.soton.xtheory.Theory.RewriteRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1578:3: ( (lv_irule_1_0= ruleInferenceRule ) )
                    {
                    // InternalTheory.g:1578:3: ( (lv_irule_1_0= ruleInferenceRule ) )
                    // InternalTheory.g:1579:4: (lv_irule_1_0= ruleInferenceRule )
                    {
                    // InternalTheory.g:1579:4: (lv_irule_1_0= ruleInferenceRule )
                    // InternalTheory.g:1580:5: lv_irule_1_0= ruleInferenceRule
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_irule_1_0=ruleInferenceRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRule());
                    					}
                    					set(
                    						current,
                    						"irule",
                    						lv_irule_1_0,
                    						"ac.soton.xtheory.Theory.InferenceRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:1601:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTheory.g:1601:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTheory.g:1602:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTheory.g:1608:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1614:2: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1615:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1615:2: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1616:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:1616:3: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ML_COMMENT && LA45_0<=RULE_SL_COMMENT)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTheory.g:1617:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1617:4: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1618:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1618:5: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ML_COMMENT) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_SL_COMMENT) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalTheory.g:1619:6: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_1, grammarAccess.getVariableAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1634:6: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_0_2, grammarAccess.getVariableAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:1651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1652:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1673:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:1674:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:1674:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:1675:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:1695:1: entryRuleRewriteRule returns [EObject current=null] : iv_ruleRewriteRule= ruleRewriteRule EOF ;
    public final EObject entryRuleRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriteRule = null;


        try {
            // InternalTheory.g:1695:52: (iv_ruleRewriteRule= ruleRewriteRule EOF )
            // InternalTheory.g:1696:2: iv_ruleRewriteRule= ruleRewriteRule EOF
            {
             newCompositeNode(grammarAccess.getRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRewriteRule=ruleRewriteRule();

            state._fsp--;

             current =iv_ruleRewriteRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // InternalTheory.g:1702:1: ruleRewriteRule returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) ) ;
    public final EObject ruleRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        EObject lv_urule_2_0 = null;

        EObject lv_crule_3_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1708:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) ) )
            // InternalTheory.g:1709:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) )
            {
            // InternalTheory.g:1709:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) )
            // InternalTheory.g:1710:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) )
            {
            // InternalTheory.g:1710:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1711:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1711:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1712:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_pattern_0_0, grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalTheory.g:1732:3: ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==30) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF||(LA46_1>=RULE_ML_COMMENT && LA46_1<=RULE_SL_COMMENT)||(LA46_1>=15 && LA46_1<=20)||LA46_1==31) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalTheory.g:1733:4: ( (lv_urule_2_0= ruleUnconditionalRewrite ) )
                    {
                    // InternalTheory.g:1733:4: ( (lv_urule_2_0= ruleUnconditionalRewrite ) )
                    // InternalTheory.g:1734:5: (lv_urule_2_0= ruleUnconditionalRewrite )
                    {
                    // InternalTheory.g:1734:5: (lv_urule_2_0= ruleUnconditionalRewrite )
                    // InternalTheory.g:1735:6: lv_urule_2_0= ruleUnconditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_urule_2_0=ruleUnconditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"urule",
                    							lv_urule_2_0,
                    							"ac.soton.xtheory.Theory.UnconditionalRewrite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1753:4: ( (lv_crule_3_0= ruleConditionalRewrite ) )
                    {
                    // InternalTheory.g:1753:4: ( (lv_crule_3_0= ruleConditionalRewrite ) )
                    // InternalTheory.g:1754:5: (lv_crule_3_0= ruleConditionalRewrite )
                    {
                    // InternalTheory.g:1754:5: (lv_crule_3_0= ruleConditionalRewrite )
                    // InternalTheory.g:1755:6: lv_crule_3_0= ruleConditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_crule_3_0=ruleConditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"crule",
                    							lv_crule_3_0,
                    							"ac.soton.xtheory.Theory.ConditionalRewrite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleInferenceRule"
    // InternalTheory.g:1777:1: entryRuleInferenceRule returns [EObject current=null] : iv_ruleInferenceRule= ruleInferenceRule EOF ;
    public final EObject entryRuleInferenceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInferenceRule = null;


        try {
            // InternalTheory.g:1777:54: (iv_ruleInferenceRule= ruleInferenceRule EOF )
            // InternalTheory.g:1778:2: iv_ruleInferenceRule= ruleInferenceRule EOF
            {
             newCompositeNode(grammarAccess.getInferenceRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInferenceRule=ruleInferenceRule();

            state._fsp--;

             current =iv_ruleInferenceRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInferenceRule"


    // $ANTLR start "ruleInferenceRule"
    // InternalTheory.g:1784:1: ruleInferenceRule returns [EObject current=null] : ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) ;
    public final EObject ruleInferenceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_given_0_0 = null;

        EObject lv_infer_2_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1790:2: ( ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) )
            // InternalTheory.g:1791:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            {
            // InternalTheory.g:1791:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            // InternalTheory.g:1792:3: ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) )
            {
            // InternalTheory.g:1792:3: ( (lv_given_0_0= ruleGiven ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_STRING) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalTheory.g:1793:4: (lv_given_0_0= ruleGiven )
            	    {
            	    // InternalTheory.g:1793:4: (lv_given_0_0= ruleGiven )
            	    // InternalTheory.g:1794:5: lv_given_0_0= ruleGiven
            	    {

            	    					newCompositeNode(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_given_0_0=ruleGiven();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInferenceRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"given",
            	    						lv_given_0_0,
            	    						"ac.soton.xtheory.Theory.Given");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_1=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1());
            		
            // InternalTheory.g:1815:3: ( (lv_infer_2_0= ruleInfer ) )
            // InternalTheory.g:1816:4: (lv_infer_2_0= ruleInfer )
            {
            // InternalTheory.g:1816:4: (lv_infer_2_0= ruleInfer )
            // InternalTheory.g:1817:5: lv_infer_2_0= ruleInfer
            {

            					newCompositeNode(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_infer_2_0=ruleInfer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInferenceRuleRule());
            					}
            					set(
            						current,
            						"infer",
            						lv_infer_2_0,
            						"ac.soton.xtheory.Theory.Infer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInferenceRule"


    // $ANTLR start "entryRuleGiven"
    // InternalTheory.g:1838:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalTheory.g:1838:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalTheory.g:1839:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalTheory.g:1845:1: ruleGiven returns [EObject current=null] : ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;
        Token lv_required_1_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1851:2: ( ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) )
            // InternalTheory.g:1852:2: ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            {
            // InternalTheory.g:1852:2: ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            // InternalTheory.g:1853:3: ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )?
            {
            // InternalTheory.g:1853:3: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalTheory.g:1854:4: (lv_expression_0_0= RULE_STRING )
            {
            // InternalTheory.g:1854:4: (lv_expression_0_0= RULE_STRING )
            // InternalTheory.g:1855:5: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_expression_0_0, grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTheory.g:1871:3: ( (lv_required_1_0= 'required' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTheory.g:1872:4: (lv_required_1_0= 'required' )
                    {
                    // InternalTheory.g:1872:4: (lv_required_1_0= 'required' )
                    // InternalTheory.g:1873:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGivenRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleInfer"
    // InternalTheory.g:1889:1: entryRuleInfer returns [EObject current=null] : iv_ruleInfer= ruleInfer EOF ;
    public final EObject entryRuleInfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfer = null;


        try {
            // InternalTheory.g:1889:46: (iv_ruleInfer= ruleInfer EOF )
            // InternalTheory.g:1890:2: iv_ruleInfer= ruleInfer EOF
            {
             newCompositeNode(grammarAccess.getInferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfer=ruleInfer();

            state._fsp--;

             current =iv_ruleInfer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfer"


    // $ANTLR start "ruleInfer"
    // InternalTheory.g:1896:1: ruleInfer returns [EObject current=null] : ( (lv_expression_0_0= RULE_STRING ) ) ;
    public final EObject ruleInfer() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1902:2: ( ( (lv_expression_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1903:2: ( (lv_expression_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1903:2: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalTheory.g:1904:3: (lv_expression_0_0= RULE_STRING )
            {
            // InternalTheory.g:1904:3: (lv_expression_0_0= RULE_STRING )
            // InternalTheory.g:1905:4: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_expression_0_0, grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInferRule());
            				}
            				setWithLastConsumed(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfer"


    // $ANTLR start "entryRuleUnconditionalRewrite"
    // InternalTheory.g:1924:1: entryRuleUnconditionalRewrite returns [EObject current=null] : iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF ;
    public final EObject entryRuleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalRewrite = null;


        try {
            // InternalTheory.g:1924:61: (iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF )
            // InternalTheory.g:1925:2: iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF
            {
             newCompositeNode(grammarAccess.getUnconditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnconditionalRewrite=ruleUnconditionalRewrite();

            state._fsp--;

             current =iv_ruleUnconditionalRewrite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnconditionalRewrite"


    // $ANTLR start "ruleUnconditionalRewrite"
    // InternalTheory.g:1931:1: ruleUnconditionalRewrite returns [EObject current=null] : ( (lv_rhs_0_0= RULE_STRING ) ) ;
    public final EObject ruleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        Token lv_rhs_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1937:2: ( ( (lv_rhs_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1938:2: ( (lv_rhs_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1938:2: ( (lv_rhs_0_0= RULE_STRING ) )
            // InternalTheory.g:1939:3: (lv_rhs_0_0= RULE_STRING )
            {
            // InternalTheory.g:1939:3: (lv_rhs_0_0= RULE_STRING )
            // InternalTheory.g:1940:4: lv_rhs_0_0= RULE_STRING
            {
            lv_rhs_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_rhs_0_0, grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnconditionalRewriteRule());
            				}
            				addWithLastConsumed(
            					current,
            					"rhs",
            					lv_rhs_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnconditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewrite"
    // InternalTheory.g:1959:1: entryRuleConditionalRewrite returns [EObject current=null] : iv_ruleConditionalRewrite= ruleConditionalRewrite EOF ;
    public final EObject entryRuleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewrite = null;


        try {
            // InternalTheory.g:1959:59: (iv_ruleConditionalRewrite= ruleConditionalRewrite EOF )
            // InternalTheory.g:1960:2: iv_ruleConditionalRewrite= ruleConditionalRewrite EOF
            {
             newCompositeNode(grammarAccess.getConditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalRewrite=ruleConditionalRewrite();

            state._fsp--;

             current =iv_ruleConditionalRewrite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalRewrite"


    // $ANTLR start "ruleConditionalRewrite"
    // InternalTheory.g:1966:1: ruleConditionalRewrite returns [EObject current=null] : ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) ;
    public final EObject ruleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject lv_rewrites_0_0 = null;

        EObject lv_rewrites_1_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1972:2: ( ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) )
            // InternalTheory.g:1973:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            {
            // InternalTheory.g:1973:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            // InternalTheory.g:1974:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            {
            // InternalTheory.g:1974:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) )
            // InternalTheory.g:1975:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            {
            // InternalTheory.g:1975:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            // InternalTheory.g:1976:5: lv_rewrites_0_0= ruleConditionalRewriteRule
            {

            					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_rewrites_0_0=ruleConditionalRewriteRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            					}
            					add(
            						current,
            						"rewrites",
            						lv_rewrites_0_0,
            						"ac.soton.xtheory.Theory.ConditionalRewriteRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTheory.g:1993:3: ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_STRING) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalTheory.g:1994:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    {
            	    // InternalTheory.g:1994:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    // InternalTheory.g:1995:5: lv_rewrites_1_0= ruleConditionalRewriteRule
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_rewrites_1_0=ruleConditionalRewriteRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rewrites",
            	    						lv_rewrites_1_0,
            	    						"ac.soton.xtheory.Theory.ConditionalRewriteRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewriteRule"
    // InternalTheory.g:2016:1: entryRuleConditionalRewriteRule returns [EObject current=null] : iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF ;
    public final EObject entryRuleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewriteRule = null;


        try {
            // InternalTheory.g:2016:63: (iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF )
            // InternalTheory.g:2017:2: iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF
            {
             newCompositeNode(grammarAccess.getConditionalRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalRewriteRule=ruleConditionalRewriteRule();

            state._fsp--;

             current =iv_ruleConditionalRewriteRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalRewriteRule"


    // $ANTLR start "ruleConditionalRewriteRule"
    // InternalTheory.g:2023:1: ruleConditionalRewriteRule returns [EObject current=null] : ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_1=null;
        Token lv_rhs_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:2029:2: ( ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:2030:2: ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:2030:2: ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            // InternalTheory.g:2031:3: ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:2031:3: ( (lv_lhs_0_0= RULE_STRING ) )
            // InternalTheory.g:2032:4: (lv_lhs_0_0= RULE_STRING )
            {
            // InternalTheory.g:2032:4: (lv_lhs_0_0= RULE_STRING )
            // InternalTheory.g:2033:5: lv_lhs_0_0= RULE_STRING
            {
            lv_lhs_0_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_lhs_0_0, grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:2053:3: ( (lv_rhs_2_0= RULE_STRING ) )
            // InternalTheory.g:2054:4: (lv_rhs_2_0= RULE_STRING )
            {
            // InternalTheory.g:2054:4: (lv_rhs_2_0= RULE_STRING )
            // InternalTheory.g:2055:5: lv_rhs_2_0= RULE_STRING
            {
            lv_rhs_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_rhs_2_0, grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalRewriteRule"


    // $ANTLR start "ruleNotation"
    // InternalTheory.g:2075:1: ruleNotation returns [Enumerator current=null] : ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) ;
    public final Enumerator ruleNotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTheory.g:2081:2: ( ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) )
            // InternalTheory.g:2082:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            {
            // InternalTheory.g:2082:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt50=1;
                }
                break;
            case 37:
                {
                alt50=2;
                }
                break;
            case 38:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalTheory.g:2083:3: (enumLiteral_0= 'prefix' )
                    {
                    // InternalTheory.g:2083:3: (enumLiteral_0= 'prefix' )
                    // InternalTheory.g:2084:4: enumLiteral_0= 'prefix'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:2091:3: (enumLiteral_1= 'infix' )
                    {
                    // InternalTheory.g:2091:3: (enumLiteral_1= 'infix' )
                    // InternalTheory.g:2092:4: enumLiteral_1= 'infix'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:2099:3: (enumLiteral_2= 'postfix' )
                    {
                    // InternalTheory.g:2099:3: (enumLiteral_2= 'postfix' )
                    // InternalTheory.g:2100:4: enumLiteral_2= 'postfix'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FD000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F8010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F8070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000801F8060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000701B201002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000701B200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000701F200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000500000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000005000000F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});

}
