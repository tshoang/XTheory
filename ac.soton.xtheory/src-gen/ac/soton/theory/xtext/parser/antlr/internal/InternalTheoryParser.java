package ac.soton.theory.xtext.parser.antlr.internal;

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
import ac.soton.theory.xtext.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'theory'", "'('", "')'", "'imports'", "'types'", "'operators'", "'axioms'", "'rules'", "'variables'", "'end'", "'='", "'|'", "','", "':'", "'associative'", "'commutative'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'theorem'", "'=='", "'|-'", "'required'", "'prefix'", "'infix'", "'postfix'"
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
    // InternalTheory.g:72:1: ruleTheory returns [EObject current=null] : (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )* otherlv_18= 'end' ) ;
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
        Token otherlv_15=null;
        Token otherlv_18=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_types_9_0 = null;

        EObject lv_operators_11_0 = null;

        EObject lv_axioms_13_0 = null;

        EObject lv_variables_16_0 = null;

        EObject lv_rules_17_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:78:2: ( (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )* otherlv_18= 'end' ) )
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )* otherlv_18= 'end' )
            {
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )* otherlv_18= 'end' )
            // InternalTheory.g:80:3: otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'imports' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )* otherlv_18= 'end'
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
                    	    							"ac.soton.theory.xtext.Theory.Parameter");
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

            // InternalTheory.g:173:3: ( (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ ) | (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ ) | (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ ) | (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ ) )*
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt11=1;
                    }
                    break;
                case 16:
                    {
                    alt11=2;
                    }
                    break;
                case 17:
                    {
                    alt11=3;
                    }
                    break;
                case 18:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalTheory.g:174:4: (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ )
            	    {
            	    // InternalTheory.g:174:4: (otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+ )
            	    // InternalTheory.g:175:5: otherlv_8= 'types' ( (lv_types_9_0= ruleType ) )+
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getTheoryAccess().getTypesKeyword_4_0_0());
            	    				
            	    // InternalTheory.g:179:5: ( (lv_types_9_0= ruleType ) )+
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
            	    	    // InternalTheory.g:180:6: (lv_types_9_0= ruleType )
            	    	    {
            	    	    // InternalTheory.g:180:6: (lv_types_9_0= ruleType )
            	    	    // InternalTheory.g:181:7: lv_types_9_0= ruleType
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getTypesTypeParserRuleCall_4_0_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_types_9_0=ruleType();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"types",
            	    	    								lv_types_9_0,
            	    	    								"ac.soton.theory.xtext.Theory.Type");
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
            	    // InternalTheory.g:200:4: (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ )
            	    {
            	    // InternalTheory.g:200:4: (otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+ )
            	    // InternalTheory.g:201:5: otherlv_10= 'operators' ( (lv_operators_11_0= ruleOperator ) )+
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

            	    					newLeafNode(otherlv_10, grammarAccess.getTheoryAccess().getOperatorsKeyword_4_1_0());
            	    				
            	    // InternalTheory.g:205:5: ( (lv_operators_11_0= ruleOperator ) )+
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
            	    	    // InternalTheory.g:206:6: (lv_operators_11_0= ruleOperator )
            	    	    {
            	    	    // InternalTheory.g:206:6: (lv_operators_11_0= ruleOperator )
            	    	    // InternalTheory.g:207:7: lv_operators_11_0= ruleOperator
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getOperatorsOperatorParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_operators_11_0=ruleOperator();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"operators",
            	    	    								lv_operators_11_0,
            	    	    								"ac.soton.theory.xtext.Theory.Operator");
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
            	    // InternalTheory.g:226:4: (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ )
            	    {
            	    // InternalTheory.g:226:4: (otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+ )
            	    // InternalTheory.g:227:5: otherlv_12= 'axioms' ( (lv_axioms_13_0= ruleAxiom ) )+
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_10); 

            	    					newLeafNode(otherlv_12, grammarAccess.getTheoryAccess().getAxiomsKeyword_4_2_0());
            	    				
            	    // InternalTheory.g:231:5: ( (lv_axioms_13_0= ruleAxiom ) )+
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
            	    	    // InternalTheory.g:232:6: (lv_axioms_13_0= ruleAxiom )
            	    	    {
            	    	    // InternalTheory.g:232:6: (lv_axioms_13_0= ruleAxiom )
            	    	    // InternalTheory.g:233:7: lv_axioms_13_0= ruleAxiom
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getAxiomsAxiomParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_axioms_13_0=ruleAxiom();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"axioms",
            	    	    								lv_axioms_13_0,
            	    	    								"ac.soton.theory.xtext.Theory.Axiom");
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
            	    // InternalTheory.g:252:4: (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ )
            	    {
            	    // InternalTheory.g:252:4: (otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+ )
            	    // InternalTheory.g:253:5: otherlv_14= 'rules' (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )? ( (lv_rules_17_0= ruleRule ) )+
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_12); 

            	    					newLeafNode(otherlv_14, grammarAccess.getTheoryAccess().getRulesKeyword_4_3_0());
            	    				
            	    // InternalTheory.g:257:5: (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+ )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==19) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalTheory.g:258:6: otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) )+
            	            {
            	            otherlv_15=(Token)match(input,19,FOLLOW_8); 

            	            						newLeafNode(otherlv_15, grammarAccess.getTheoryAccess().getVariablesKeyword_4_3_1_0());
            	            					
            	            // InternalTheory.g:262:6: ( (lv_variables_16_0= ruleVariable ) )+
            	            int cnt8=0;
            	            loop8:
            	            do {
            	                int alt8=2;
            	                switch ( input.LA(1) ) {
            	                case RULE_ML_COMMENT:
            	                    {
            	                    int LA8_1 = input.LA(2);

            	                    if ( (LA8_1==RULE_ID) ) {
            	                        alt8=1;
            	                    }


            	                    }
            	                    break;
            	                case RULE_SL_COMMENT:
            	                    {
            	                    int LA8_2 = input.LA(2);

            	                    if ( (LA8_2==RULE_ID) ) {
            	                        alt8=1;
            	                    }


            	                    }
            	                    break;
            	                case RULE_ID:
            	                    {
            	                    alt8=1;
            	                    }
            	                    break;

            	                }

            	                switch (alt8) {
            	            	case 1 :
            	            	    // InternalTheory.g:263:7: (lv_variables_16_0= ruleVariable )
            	            	    {
            	            	    // InternalTheory.g:263:7: (lv_variables_16_0= ruleVariable )
            	            	    // InternalTheory.g:264:8: lv_variables_16_0= ruleVariable
            	            	    {

            	            	    								newCompositeNode(grammarAccess.getTheoryAccess().getVariablesVariableParserRuleCall_4_3_1_1_0());
            	            	    							
            	            	    pushFollow(FOLLOW_13);
            	            	    lv_variables_16_0=ruleVariable();

            	            	    state._fsp--;


            	            	    								if (current==null) {
            	            	    									current = createModelElementForParent(grammarAccess.getTheoryRule());
            	            	    								}
            	            	    								add(
            	            	    									current,
            	            	    									"variables",
            	            	    									lv_variables_16_0,
            	            	    									"ac.soton.theory.xtext.Theory.Variable");
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
            	            break;

            	    }

            	    // InternalTheory.g:282:5: ( (lv_rules_17_0= ruleRule ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>=RULE_ML_COMMENT && LA10_0<=RULE_SL_COMMENT)||LA10_0==31) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalTheory.g:283:6: (lv_rules_17_0= ruleRule )
            	    	    {
            	    	    // InternalTheory.g:283:6: (lv_rules_17_0= ruleRule )
            	    	    // InternalTheory.g:284:7: lv_rules_17_0= ruleRule
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getTheoryAccess().getRulesRuleParserRuleCall_4_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_rules_17_0=ruleRule();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"rules",
            	    	    								lv_rules_17_0,
            	    	    								"ac.soton.theory.xtext.Theory.Rule");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTheory.g:311:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTheory.g:311:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTheory.g:312:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalTheory.g:318:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:324:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTheory.g:325:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTheory.g:325:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:326:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:326:3: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:327:4: lv_name_0_0= RULE_ID
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
    // InternalTheory.g:346:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTheory.g:346:45: (iv_ruleType= ruleType EOF )
            // InternalTheory.g:347:2: iv_ruleType= ruleType EOF
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
    // InternalTheory.g:353:1: ruleType returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
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
            // InternalTheory.g:359:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )? ) )
            // InternalTheory.g:360:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )? )
            {
            // InternalTheory.g:360:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )? )
            // InternalTheory.g:361:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )?
            {
            // InternalTheory.g:361:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ML_COMMENT && LA13_0<=RULE_SL_COMMENT)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTheory.g:362:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:362:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:363:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:363:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
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
                            // InternalTheory.g:364:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getTypeAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:379:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getTypeAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalTheory.g:414:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTheory.g:415:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' otherlv_5= '=' ( (lv_constructors_6_0= ruleConstructor ) ) (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:419:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTheory.g:420:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalTheory.g:420:5: (otherlv_3= RULE_ID )
                    	    // InternalTheory.g:421:6: otherlv_3= RULE_ID
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3());
                    			
                    // InternalTheory.g:440:4: ( (lv_constructors_6_0= ruleConstructor ) )
                    // InternalTheory.g:441:5: (lv_constructors_6_0= ruleConstructor )
                    {
                    // InternalTheory.g:441:5: (lv_constructors_6_0= ruleConstructor )
                    // InternalTheory.g:442:6: lv_constructors_6_0= ruleConstructor
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_constructors_6_0=ruleConstructor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						add(
                    							current,
                    							"constructors",
                    							lv_constructors_6_0,
                    							"ac.soton.theory.xtext.Theory.Constructor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:459:4: (otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTheory.g:460:5: otherlv_7= '|' ( (lv_constructors_8_0= ruleConstructor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getVerticalLineKeyword_2_5_0());
                    	    				
                    	    // InternalTheory.g:464:5: ( (lv_constructors_8_0= ruleConstructor ) )
                    	    // InternalTheory.g:465:6: (lv_constructors_8_0= ruleConstructor )
                    	    {
                    	    // InternalTheory.g:465:6: (lv_constructors_8_0= ruleConstructor )
                    	    // InternalTheory.g:466:7: lv_constructors_8_0= ruleConstructor
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_2_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_constructors_8_0=ruleConstructor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constructors",
                    	    								lv_constructors_8_0,
                    	    								"ac.soton.theory.xtext.Theory.Constructor");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleConstructor"
    // InternalTheory.g:489:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalTheory.g:489:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalTheory.g:490:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalTheory.g:496:1: ruleConstructor returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_destructors_3_0 = null;

        EObject lv_destructors_5_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:502:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? ) )
            // InternalTheory.g:503:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? )
            {
            // InternalTheory.g:503:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )? )
            // InternalTheory.g:504:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )?
            {
            // InternalTheory.g:504:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ML_COMMENT && LA18_0<=RULE_SL_COMMENT)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTheory.g:505:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:505:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:506:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:506:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ML_COMMENT) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_SL_COMMENT) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTheory.g:507:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getConstructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:522:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getConstructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:539:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:540:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:540:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:541:5: lv_name_1_0= RULE_ID
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

            // InternalTheory.g:557:3: (otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTheory.g:558:4: otherlv_2= '(' ( (lv_destructors_3_0= ruleDestructor ) ) (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:562:4: ( (lv_destructors_3_0= ruleDestructor ) )
                    // InternalTheory.g:563:5: (lv_destructors_3_0= ruleDestructor )
                    {
                    // InternalTheory.g:563:5: (lv_destructors_3_0= ruleDestructor )
                    // InternalTheory.g:564:6: lv_destructors_3_0= ruleDestructor
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_destructors_3_0=ruleDestructor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"destructors",
                    							lv_destructors_3_0,
                    							"ac.soton.theory.xtext.Theory.Destructor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:581:4: (otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==23) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTheory.g:582:5: otherlv_4= ',' ( (lv_destructors_5_0= ruleDestructor ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTheory.g:586:5: ( (lv_destructors_5_0= ruleDestructor ) )
                    	    // InternalTheory.g:587:6: (lv_destructors_5_0= ruleDestructor )
                    	    {
                    	    // InternalTheory.g:587:6: (lv_destructors_5_0= ruleDestructor )
                    	    // InternalTheory.g:588:7: lv_destructors_5_0= ruleDestructor
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_destructors_5_0=ruleDestructor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"destructors",
                    	    								lv_destructors_5_0,
                    	    								"ac.soton.theory.xtext.Theory.Destructor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // InternalTheory.g:615:1: entryRuleDestructor returns [EObject current=null] : iv_ruleDestructor= ruleDestructor EOF ;
    public final EObject entryRuleDestructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructor = null;


        try {
            // InternalTheory.g:615:51: (iv_ruleDestructor= ruleDestructor EOF )
            // InternalTheory.g:616:2: iv_ruleDestructor= ruleDestructor EOF
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
    // InternalTheory.g:622:1: ruleDestructor returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDestructor() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:628:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:629:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:629:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:630:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:630:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ML_COMMENT && LA22_0<=RULE_SL_COMMENT)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTheory.g:631:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:631:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:632:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:632:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ML_COMMENT) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_SL_COMMENT) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalTheory.g:633:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getDestructorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDestructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:648:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getDestructorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDestructorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:665:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:666:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:666:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:667:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructorAccess().getColonKeyword_2());
            		
            // InternalTheory.g:687:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:688:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:688:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:689:5: lv_type_3_0= RULE_STRING
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
    // InternalTheory.g:709:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalTheory.g:709:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalTheory.g:710:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalTheory.g:716:1: ruleOperator returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token lv_associtive_11_0=null;
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
            // InternalTheory.g:722:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? ) )
            // InternalTheory.g:723:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? )
            {
            // InternalTheory.g:723:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )? )
            // InternalTheory.g:724:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )? (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )? (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )?
            {
            // InternalTheory.g:724:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ML_COMMENT && LA24_0<=RULE_SL_COMMENT)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTheory.g:725:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:725:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:726:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:726:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ML_COMMENT) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_SL_COMMENT) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalTheory.g:727:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getOperatorAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperatorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:742:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getOperatorAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperatorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:759:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:760:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:760:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:761:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalTheory.g:777:3: (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTheory.g:778:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:782:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalTheory.g:783:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalTheory.g:783:5: (lv_arguments_3_0= ruleArgument )
                    // InternalTheory.g:784:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"ac.soton.theory.xtext.Theory.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:801:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==23) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalTheory.g:802:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOperatorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTheory.g:806:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalTheory.g:807:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalTheory.g:807:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalTheory.g:808:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"ac.soton.theory.xtext.Theory.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalTheory.g:831:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) ) )
            // InternalTheory.g:832:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) )
            {
            // InternalTheory.g:832:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* ) )
            // InternalTheory.g:833:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            				
            // InternalTheory.g:836:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )* )
            // InternalTheory.g:837:6: ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )*
            {
            // InternalTheory.g:837:6: ( ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) ) )*
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 >= 36 && LA28_0 <= 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTheory.g:838:4: ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalTheory.g:838:4: ({...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalTheory.g:839:5: {...}? => ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTheory.g:839:105: ( ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) ) )
            	    // InternalTheory.g:840:6: ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalTheory.g:843:9: ({...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) ) )
            	    // InternalTheory.g:843:10: {...}? => (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:843:19: (otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) )
            	    // InternalTheory.g:843:20: otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_20); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperatorAccess().getColonKeyword_3_0_0());
            	    								
            	    // InternalTheory.g:847:9: ( (lv_type_9_0= RULE_STRING ) )
            	    // InternalTheory.g:848:10: (lv_type_9_0= RULE_STRING )
            	    {
            	    // InternalTheory.g:848:10: (lv_type_9_0= RULE_STRING )
            	    // InternalTheory.g:849:11: lv_type_9_0= RULE_STRING
            	    {
            	    lv_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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
            	    // InternalTheory.g:871:4: ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) )
            	    {
            	    // InternalTheory.g:871:4: ({...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) ) )
            	    // InternalTheory.g:872:5: {...}? => ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTheory.g:872:105: ( ({...}? => ( (lv_notation_10_0= ruleNotation ) ) ) )
            	    // InternalTheory.g:873:6: ({...}? => ( (lv_notation_10_0= ruleNotation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalTheory.g:876:9: ({...}? => ( (lv_notation_10_0= ruleNotation ) ) )
            	    // InternalTheory.g:876:10: {...}? => ( (lv_notation_10_0= ruleNotation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:876:19: ( (lv_notation_10_0= ruleNotation ) )
            	    // InternalTheory.g:876:20: (lv_notation_10_0= ruleNotation )
            	    {
            	    // InternalTheory.g:876:20: (lv_notation_10_0= ruleNotation )
            	    // InternalTheory.g:877:10: lv_notation_10_0= ruleNotation
            	    {

            	    										newCompositeNode(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_22);
            	    lv_notation_10_0=ruleNotation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getOperatorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"notation",
            	    											lv_notation_10_0,
            	    											"ac.soton.theory.xtext.Theory.Notation");
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
            	    // InternalTheory.g:899:4: ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) )
            	    {
            	    // InternalTheory.g:899:4: ({...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) ) )
            	    // InternalTheory.g:900:5: {...}? => ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalTheory.g:900:105: ( ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) ) )
            	    // InternalTheory.g:901:6: ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalTheory.g:904:9: ({...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? ) )
            	    // InternalTheory.g:904:10: {...}? => ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:904:19: ( ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )? )
            	    // InternalTheory.g:904:20: ( (lv_associtive_11_0= 'associative' ) ) ( (lv_commutative_12_0= 'commutative' ) )?
            	    {
            	    // InternalTheory.g:904:20: ( (lv_associtive_11_0= 'associative' ) )
            	    // InternalTheory.g:905:10: (lv_associtive_11_0= 'associative' )
            	    {
            	    // InternalTheory.g:905:10: (lv_associtive_11_0= 'associative' )
            	    // InternalTheory.g:906:11: lv_associtive_11_0= 'associative'
            	    {
            	    lv_associtive_11_0=(Token)match(input,25,FOLLOW_23); 

            	    											newLeafNode(lv_associtive_11_0, grammarAccess.getOperatorAccess().getAssocitiveAssociativeKeyword_3_2_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getOperatorRule());
            	    											}
            	    											setWithLastConsumed(current, "associtive", true, "associative");
            	    										

            	    }


            	    }

            	    // InternalTheory.g:918:9: ( (lv_commutative_12_0= 'commutative' ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==26) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalTheory.g:919:10: (lv_commutative_12_0= 'commutative' )
            	            {
            	            // InternalTheory.g:919:10: (lv_commutative_12_0= 'commutative' )
            	            // InternalTheory.g:920:11: lv_commutative_12_0= 'commutative'
            	            {
            	            lv_commutative_12_0=(Token)match(input,26,FOLLOW_22); 

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
            	    break loop28;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperatorAccess().getUnorderedGroup_3());
            				

            }

            // InternalTheory.g:945:3: (otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTheory.g:946:4: otherlv_13= '#' ( (lv_precedent_14_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperatorAccess().getNumberSignKeyword_4_0());
                    			
                    // InternalTheory.g:950:4: ( (lv_precedent_14_0= RULE_INT ) )
                    // InternalTheory.g:951:5: (lv_precedent_14_0= RULE_INT )
                    {
                    // InternalTheory.g:951:5: (lv_precedent_14_0= RULE_INT )
                    // InternalTheory.g:952:6: lv_precedent_14_0= RULE_INT
                    {
                    lv_precedent_14_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

            // InternalTheory.g:969:3: (otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTheory.g:970:4: otherlv_15= 'for' ( (lv_wd_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getOperatorAccess().getForKeyword_5_0());
                    			
                    // InternalTheory.g:974:4: ( (lv_wd_16_0= RULE_STRING ) )
                    // InternalTheory.g:975:5: (lv_wd_16_0= RULE_STRING )
                    {
                    // InternalTheory.g:975:5: (lv_wd_16_0= RULE_STRING )
                    // InternalTheory.g:976:6: lv_wd_16_0= RULE_STRING
                    {
                    lv_wd_16_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalTheory.g:993:3: (otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTheory.g:994:4: otherlv_17= '=' ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) )
                    {
                    otherlv_17=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getOperatorAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalTheory.g:998:4: ( ( (lv_definition_18_0= RULE_STRING ) ) | (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_STRING) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==29) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalTheory.g:999:5: ( (lv_definition_18_0= RULE_STRING ) )
                            {
                            // InternalTheory.g:999:5: ( (lv_definition_18_0= RULE_STRING ) )
                            // InternalTheory.g:1000:6: (lv_definition_18_0= RULE_STRING )
                            {
                            // InternalTheory.g:1000:6: (lv_definition_18_0= RULE_STRING )
                            // InternalTheory.g:1001:7: lv_definition_18_0= RULE_STRING
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
                            // InternalTheory.g:1018:5: (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ )
                            {
                            // InternalTheory.g:1018:5: (otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+ )
                            // InternalTheory.g:1019:6: otherlv_19= 'case' ( (lv_case_20_0= RULE_ID ) ) ( (lv_cases_21_0= ruleCase ) )+
                            {
                            otherlv_19=(Token)match(input,29,FOLLOW_3); 

                            						newLeafNode(otherlv_19, grammarAccess.getOperatorAccess().getCaseKeyword_6_1_1_0());
                            					
                            // InternalTheory.g:1023:6: ( (lv_case_20_0= RULE_ID ) )
                            // InternalTheory.g:1024:7: (lv_case_20_0= RULE_ID )
                            {
                            // InternalTheory.g:1024:7: (lv_case_20_0= RULE_ID )
                            // InternalTheory.g:1025:8: lv_case_20_0= RULE_ID
                            {
                            lv_case_20_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

                            // InternalTheory.g:1041:6: ( (lv_cases_21_0= ruleCase ) )+
                            int cnt31=0;
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==RULE_STRING) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // InternalTheory.g:1042:7: (lv_cases_21_0= ruleCase )
                            	    {
                            	    // InternalTheory.g:1042:7: (lv_cases_21_0= ruleCase )
                            	    // InternalTheory.g:1043:8: lv_cases_21_0= ruleCase
                            	    {

                            	    								newCompositeNode(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_6_1_1_2_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_cases_21_0=ruleCase();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOperatorRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"cases",
                            	    									lv_cases_21_0,
                            	    									"ac.soton.theory.xtext.Theory.Case");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt31 >= 1 ) break loop31;
                                        EarlyExitException eee =
                                            new EarlyExitException(31, input);
                                        throw eee;
                                }
                                cnt31++;
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
    // InternalTheory.g:1067:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalTheory.g:1067:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalTheory.g:1068:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalTheory.g:1074:1: ruleArgument returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1080:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1081:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1081:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1082:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:1082:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ML_COMMENT && LA35_0<=RULE_SL_COMMENT)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTheory.g:1083:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1083:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1084:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1084:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ML_COMMENT) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_SL_COMMENT) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalTheory.g:1085:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getArgumentAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getArgumentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1100:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getArgumentAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getArgumentRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:1117:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1118:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1118:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1119:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1139:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:1140:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:1140:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:1141:5: lv_type_3_0= RULE_STRING
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
    // InternalTheory.g:1161:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalTheory.g:1161:45: (iv_ruleCase= ruleCase EOF )
            // InternalTheory.g:1162:2: iv_ruleCase= ruleCase EOF
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
    // InternalTheory.g:1168:1: ruleCase returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        Token lv_formula_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1174:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1175:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1175:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1176:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1176:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1177:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1177:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1178:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:1198:3: ( (lv_formula_2_0= RULE_STRING ) )
            // InternalTheory.g:1199:4: (lv_formula_2_0= RULE_STRING )
            {
            // InternalTheory.g:1199:4: (lv_formula_2_0= RULE_STRING )
            // InternalTheory.g:1200:5: lv_formula_2_0= RULE_STRING
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
    // InternalTheory.g:1220:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalTheory.g:1220:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalTheory.g:1221:2: iv_ruleAxiom= ruleAxiom EOF
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
    // InternalTheory.g:1227:1: ruleAxiom returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_isTheorem_5_0= 'theorem' ) )? ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_predicate_4_0=null;
        Token lv_isTheorem_5_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1233:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_isTheorem_5_0= 'theorem' ) )? ) )
            // InternalTheory.g:1234:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_isTheorem_5_0= 'theorem' ) )? )
            {
            // InternalTheory.g:1234:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_isTheorem_5_0= 'theorem' ) )? )
            // InternalTheory.g:1235:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_isTheorem_5_0= 'theorem' ) )?
            {
            // InternalTheory.g:1235:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ML_COMMENT && LA37_0<=RULE_SL_COMMENT)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTheory.g:1236:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1236:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1237:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1237:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ML_COMMENT) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_SL_COMMENT) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalTheory.g:1238:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_30); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getAxiomAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAxiomRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1253:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_30); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getAxiomAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAxiomRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
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
            		
            // InternalTheory.g:1274:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTheory.g:1275:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTheory.g:1275:4: (lv_name_2_0= RULE_ID )
            // InternalTheory.g:1276:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAxiomAccess().getColonKeyword_3());
            		
            // InternalTheory.g:1296:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalTheory.g:1297:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalTheory.g:1297:4: (lv_predicate_4_0= RULE_STRING )
            // InternalTheory.g:1298:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            // InternalTheory.g:1314:3: ( (lv_isTheorem_5_0= 'theorem' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTheory.g:1315:4: (lv_isTheorem_5_0= 'theorem' )
                    {
                    // InternalTheory.g:1315:4: (lv_isTheorem_5_0= 'theorem' )
                    // InternalTheory.g:1316:5: lv_isTheorem_5_0= 'theorem'
                    {
                    lv_isTheorem_5_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_isTheorem_5_0, grammarAccess.getAxiomAccess().getIsTheoremTheoremKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAxiomRule());
                    					}
                    					setWithLastConsumed(current, "isTheorem", true, "theorem");
                    				

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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:1332:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTheory.g:1332:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTheory.g:1333:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTheory.g:1339:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1345:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1346:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1346:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1347:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // InternalTheory.g:1347:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ML_COMMENT && LA40_0<=RULE_SL_COMMENT)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTheory.g:1348:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1348:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1349:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1349:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
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
                            // InternalTheory.g:1350:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getVariableAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1365:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getVariableAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:1382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1383:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1384:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1404:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalTheory.g:1405:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalTheory.g:1405:4: (lv_type_3_0= RULE_STRING )
            // InternalTheory.g:1406:5: lv_type_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleRule"
    // InternalTheory.g:1426:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTheory.g:1426:45: (iv_ruleRule= ruleRule EOF )
            // InternalTheory.g:1427:2: iv_ruleRule= ruleRule EOF
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
    // InternalTheory.g:1433:1: ruleRule returns [EObject current=null] : ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_comments_0_1=null;
        Token lv_comments_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_rule_4_0 = null;

        EObject lv_rule_5_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1439:2: ( ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) ) ) )
            // InternalTheory.g:1440:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) ) )
            {
            // InternalTheory.g:1440:2: ( ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) ) )
            // InternalTheory.g:1441:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )? otherlv_1= '@' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) )
            {
            // InternalTheory.g:1441:3: ( ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ML_COMMENT && LA42_0<=RULE_SL_COMMENT)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTheory.g:1442:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    {
                    // InternalTheory.g:1442:4: ( (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT ) )
                    // InternalTheory.g:1443:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    {
                    // InternalTheory.g:1443:5: (lv_comments_0_1= RULE_ML_COMMENT | lv_comments_0_2= RULE_SL_COMMENT )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ML_COMMENT) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_SL_COMMENT) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalTheory.g:1444:6: lv_comments_0_1= RULE_ML_COMMENT
                            {
                            lv_comments_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_30); 

                            						newLeafNode(lv_comments_0_1, grammarAccess.getRuleAccess().getCommentsML_COMMENTTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRuleRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalTheory.g:1459:6: lv_comments_0_2= RULE_SL_COMMENT
                            {
                            lv_comments_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_30); 

                            						newLeafNode(lv_comments_0_2, grammarAccess.getRuleAccess().getCommentsSL_COMMENTTerminalRuleCall_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRuleRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comments",
                            							lv_comments_0_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getCommercialAtKeyword_1());
            		
            // InternalTheory.g:1480:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTheory.g:1481:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTheory.g:1481:4: (lv_name_2_0= RULE_ID )
            // InternalTheory.g:1482:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getColonKeyword_3());
            		
            // InternalTheory.g:1502:3: ( ( (lv_rule_4_0= ruleRewriteRule ) ) | ( (lv_rule_5_0= ruleInferenceRule ) ) )
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
                    // InternalTheory.g:1503:4: ( (lv_rule_4_0= ruleRewriteRule ) )
                    {
                    // InternalTheory.g:1503:4: ( (lv_rule_4_0= ruleRewriteRule ) )
                    // InternalTheory.g:1504:5: (lv_rule_4_0= ruleRewriteRule )
                    {
                    // InternalTheory.g:1504:5: (lv_rule_4_0= ruleRewriteRule )
                    // InternalTheory.g:1505:6: lv_rule_4_0= ruleRewriteRule
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getRuleRewriteRuleParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_4_0=ruleRewriteRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_4_0,
                    							"ac.soton.theory.xtext.Theory.RewriteRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1523:4: ( (lv_rule_5_0= ruleInferenceRule ) )
                    {
                    // InternalTheory.g:1523:4: ( (lv_rule_5_0= ruleInferenceRule ) )
                    // InternalTheory.g:1524:5: (lv_rule_5_0= ruleInferenceRule )
                    {
                    // InternalTheory.g:1524:5: (lv_rule_5_0= ruleInferenceRule )
                    // InternalTheory.g:1525:6: lv_rule_5_0= ruleInferenceRule
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getRuleInferenceRuleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_5_0=ruleInferenceRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_5_0,
                    							"ac.soton.theory.xtext.Theory.InferenceRule");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:1547:1: entryRuleRewriteRule returns [EObject current=null] : iv_ruleRewriteRule= ruleRewriteRule EOF ;
    public final EObject entryRuleRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriteRule = null;


        try {
            // InternalTheory.g:1547:52: (iv_ruleRewriteRule= ruleRewriteRule EOF )
            // InternalTheory.g:1548:2: iv_ruleRewriteRule= ruleRewriteRule EOF
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
    // InternalTheory.g:1554:1: ruleRewriteRule returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) ) ) ;
    public final EObject ruleRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        EObject lv_rule_2_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1560:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) ) ) )
            // InternalTheory.g:1561:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) ) )
            {
            // InternalTheory.g:1561:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) ) )
            // InternalTheory.g:1562:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) )
            {
            // InternalTheory.g:1562:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1563:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1563:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1564:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalTheory.g:1584:3: ( ( (lv_rule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_rule_3_0= ruleConditionalRewrite ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==30) ) {
                    alt44=2;
                }
                else if ( (LA44_1==EOF||(LA44_1>=RULE_ML_COMMENT && LA44_1<=RULE_SL_COMMENT)||(LA44_1>=15 && LA44_1<=18)||LA44_1==20||LA44_1==31) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTheory.g:1585:4: ( (lv_rule_2_0= ruleUnconditionalRewrite ) )
                    {
                    // InternalTheory.g:1585:4: ( (lv_rule_2_0= ruleUnconditionalRewrite ) )
                    // InternalTheory.g:1586:5: (lv_rule_2_0= ruleUnconditionalRewrite )
                    {
                    // InternalTheory.g:1586:5: (lv_rule_2_0= ruleUnconditionalRewrite )
                    // InternalTheory.g:1587:6: lv_rule_2_0= ruleUnconditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getRuleUnconditionalRewriteParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_2_0=ruleUnconditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_2_0,
                    							"ac.soton.theory.xtext.Theory.UnconditionalRewrite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1605:4: ( (lv_rule_3_0= ruleConditionalRewrite ) )
                    {
                    // InternalTheory.g:1605:4: ( (lv_rule_3_0= ruleConditionalRewrite ) )
                    // InternalTheory.g:1606:5: (lv_rule_3_0= ruleConditionalRewrite )
                    {
                    // InternalTheory.g:1606:5: (lv_rule_3_0= ruleConditionalRewrite )
                    // InternalTheory.g:1607:6: lv_rule_3_0= ruleConditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getRuleConditionalRewriteParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_3_0=ruleConditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_3_0,
                    							"ac.soton.theory.xtext.Theory.ConditionalRewrite");
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
    // InternalTheory.g:1629:1: entryRuleInferenceRule returns [EObject current=null] : iv_ruleInferenceRule= ruleInferenceRule EOF ;
    public final EObject entryRuleInferenceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInferenceRule = null;


        try {
            // InternalTheory.g:1629:54: (iv_ruleInferenceRule= ruleInferenceRule EOF )
            // InternalTheory.g:1630:2: iv_ruleInferenceRule= ruleInferenceRule EOF
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
    // InternalTheory.g:1636:1: ruleInferenceRule returns [EObject current=null] : ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) ;
    public final EObject ruleInferenceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_given_0_0 = null;

        EObject lv_infer_2_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1642:2: ( ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) )
            // InternalTheory.g:1643:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            {
            // InternalTheory.g:1643:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            // InternalTheory.g:1644:3: ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) )
            {
            // InternalTheory.g:1644:3: ( (lv_given_0_0= ruleGiven ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_STRING) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalTheory.g:1645:4: (lv_given_0_0= ruleGiven )
            	    {
            	    // InternalTheory.g:1645:4: (lv_given_0_0= ruleGiven )
            	    // InternalTheory.g:1646:5: lv_given_0_0= ruleGiven
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
            	    						"ac.soton.theory.xtext.Theory.Given");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_1=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1());
            		
            // InternalTheory.g:1667:3: ( (lv_infer_2_0= ruleInfer ) )
            // InternalTheory.g:1668:4: (lv_infer_2_0= ruleInfer )
            {
            // InternalTheory.g:1668:4: (lv_infer_2_0= ruleInfer )
            // InternalTheory.g:1669:5: lv_infer_2_0= ruleInfer
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
            						"ac.soton.theory.xtext.Theory.Infer");
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
    // InternalTheory.g:1690:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalTheory.g:1690:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalTheory.g:1691:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalTheory.g:1697:1: ruleGiven returns [EObject current=null] : ( ( (lv_predicate_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_predicate_0_0=null;
        Token lv_required_1_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1703:2: ( ( ( (lv_predicate_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) )
            // InternalTheory.g:1704:2: ( ( (lv_predicate_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            {
            // InternalTheory.g:1704:2: ( ( (lv_predicate_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            // InternalTheory.g:1705:3: ( (lv_predicate_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )?
            {
            // InternalTheory.g:1705:3: ( (lv_predicate_0_0= RULE_STRING ) )
            // InternalTheory.g:1706:4: (lv_predicate_0_0= RULE_STRING )
            {
            // InternalTheory.g:1706:4: (lv_predicate_0_0= RULE_STRING )
            // InternalTheory.g:1707:5: lv_predicate_0_0= RULE_STRING
            {
            lv_predicate_0_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_predicate_0_0, grammarAccess.getGivenAccess().getPredicateSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTheory.g:1723:3: ( (lv_required_1_0= 'required' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTheory.g:1724:4: (lv_required_1_0= 'required' )
                    {
                    // InternalTheory.g:1724:4: (lv_required_1_0= 'required' )
                    // InternalTheory.g:1725:5: lv_required_1_0= 'required'
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
    // InternalTheory.g:1741:1: entryRuleInfer returns [EObject current=null] : iv_ruleInfer= ruleInfer EOF ;
    public final EObject entryRuleInfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfer = null;


        try {
            // InternalTheory.g:1741:46: (iv_ruleInfer= ruleInfer EOF )
            // InternalTheory.g:1742:2: iv_ruleInfer= ruleInfer EOF
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
    // InternalTheory.g:1748:1: ruleInfer returns [EObject current=null] : ( (lv_predicate_0_0= RULE_STRING ) ) ;
    public final EObject ruleInfer() throws RecognitionException {
        EObject current = null;

        Token lv_predicate_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1754:2: ( ( (lv_predicate_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1755:2: ( (lv_predicate_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1755:2: ( (lv_predicate_0_0= RULE_STRING ) )
            // InternalTheory.g:1756:3: (lv_predicate_0_0= RULE_STRING )
            {
            // InternalTheory.g:1756:3: (lv_predicate_0_0= RULE_STRING )
            // InternalTheory.g:1757:4: lv_predicate_0_0= RULE_STRING
            {
            lv_predicate_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_predicate_0_0, grammarAccess.getInferAccess().getPredicateSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInferRule());
            				}
            				setWithLastConsumed(
            					current,
            					"predicate",
            					lv_predicate_0_0,
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
    // InternalTheory.g:1776:1: entryRuleUnconditionalRewrite returns [EObject current=null] : iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF ;
    public final EObject entryRuleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalRewrite = null;


        try {
            // InternalTheory.g:1776:61: (iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF )
            // InternalTheory.g:1777:2: iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF
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
    // InternalTheory.g:1783:1: ruleUnconditionalRewrite returns [EObject current=null] : ( (lv_rhs_0_0= RULE_STRING ) ) ;
    public final EObject ruleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        Token lv_rhs_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1789:2: ( ( (lv_rhs_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1790:2: ( (lv_rhs_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1790:2: ( (lv_rhs_0_0= RULE_STRING ) )
            // InternalTheory.g:1791:3: (lv_rhs_0_0= RULE_STRING )
            {
            // InternalTheory.g:1791:3: (lv_rhs_0_0= RULE_STRING )
            // InternalTheory.g:1792:4: lv_rhs_0_0= RULE_STRING
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
    // InternalTheory.g:1811:1: entryRuleConditionalRewrite returns [EObject current=null] : iv_ruleConditionalRewrite= ruleConditionalRewrite EOF ;
    public final EObject entryRuleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewrite = null;


        try {
            // InternalTheory.g:1811:59: (iv_ruleConditionalRewrite= ruleConditionalRewrite EOF )
            // InternalTheory.g:1812:2: iv_ruleConditionalRewrite= ruleConditionalRewrite EOF
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
    // InternalTheory.g:1818:1: ruleConditionalRewrite returns [EObject current=null] : ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) ;
    public final EObject ruleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject lv_rewrites_0_0 = null;

        EObject lv_rewrites_1_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1824:2: ( ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) )
            // InternalTheory.g:1825:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            {
            // InternalTheory.g:1825:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            // InternalTheory.g:1826:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            {
            // InternalTheory.g:1826:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) )
            // InternalTheory.g:1827:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            {
            // InternalTheory.g:1827:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            // InternalTheory.g:1828:5: lv_rewrites_0_0= ruleConditionalRewriteRule
            {

            					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_rewrites_0_0=ruleConditionalRewriteRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            					}
            					add(
            						current,
            						"rewrites",
            						lv_rewrites_0_0,
            						"ac.soton.theory.xtext.Theory.ConditionalRewriteRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTheory.g:1845:3: ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_STRING) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalTheory.g:1846:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    {
            	    // InternalTheory.g:1846:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    // InternalTheory.g:1847:5: lv_rewrites_1_0= ruleConditionalRewriteRule
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_rewrites_1_0=ruleConditionalRewriteRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rewrites",
            	    						lv_rewrites_1_0,
            	    						"ac.soton.theory.xtext.Theory.ConditionalRewriteRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalTheory.g:1868:1: entryRuleConditionalRewriteRule returns [EObject current=null] : iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF ;
    public final EObject entryRuleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewriteRule = null;


        try {
            // InternalTheory.g:1868:63: (iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF )
            // InternalTheory.g:1869:2: iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF
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
    // InternalTheory.g:1875:1: ruleConditionalRewriteRule returns [EObject current=null] : ( ( (lv_lsh_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_lsh_0_0=null;
        Token otherlv_1=null;
        Token lv_rhs_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1881:2: ( ( ( (lv_lsh_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1882:2: ( ( (lv_lsh_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1882:2: ( ( (lv_lsh_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1883:3: ( (lv_lsh_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1883:3: ( (lv_lsh_0_0= RULE_STRING ) )
            // InternalTheory.g:1884:4: (lv_lsh_0_0= RULE_STRING )
            {
            // InternalTheory.g:1884:4: (lv_lsh_0_0= RULE_STRING )
            // InternalTheory.g:1885:5: lv_lsh_0_0= RULE_STRING
            {
            lv_lsh_0_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_lsh_0_0, grammarAccess.getConditionalRewriteRuleAccess().getLshSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lsh",
            						lv_lsh_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:1905:3: ( (lv_rhs_2_0= RULE_STRING ) )
            // InternalTheory.g:1906:4: (lv_rhs_2_0= RULE_STRING )
            {
            // InternalTheory.g:1906:4: (lv_rhs_2_0= RULE_STRING )
            // InternalTheory.g:1907:5: lv_rhs_2_0= RULE_STRING
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
    // InternalTheory.g:1927:1: ruleNotation returns [Enumerator current=null] : ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) ;
    public final Enumerator ruleNotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTheory.g:1933:2: ( ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) )
            // InternalTheory.g:1934:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            {
            // InternalTheory.g:1934:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt48=1;
                }
                break;
            case 37:
                {
                alt48=2;
                }
                break;
            case 38:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalTheory.g:1935:3: (enumLiteral_0= 'prefix' )
                    {
                    // InternalTheory.g:1935:3: (enumLiteral_0= 'prefix' )
                    // InternalTheory.g:1936:4: enumLiteral_0= 'prefix'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1943:3: (enumLiteral_1= 'infix' )
                    {
                    // InternalTheory.g:1943:3: (enumLiteral_1= 'infix' )
                    // InternalTheory.g:1944:4: enumLiteral_1= 'infix'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:1951:3: (enumLiteral_2= 'postfix' )
                    {
                    // InternalTheory.g:1951:3: (enumLiteral_2= 'postfix' )
                    // InternalTheory.g:1952:4: enumLiteral_2= 'postfix'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000017D000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000017C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000178010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000178070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080178060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080080060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080080070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000801F8060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000701B201002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000701B200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000701F200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000002L});

}
