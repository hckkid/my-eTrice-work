package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.GACLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGACLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "':'", "';'", "'type'", "'='", "'^'", "'-'", "'+'", "'*'", "'/'", "'**'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTTYPE=5;
    public static final int RULE_STRTYPE=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalGACLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGACLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGACLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g"; }



     	private GACLGrammarAccess grammarAccess;
     	
        public InternalGACLParser(TokenStream input, GACLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DetailCode";	
       	}
       	
       	@Override
       	protected GACLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDetailCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:67:1: entryRuleDetailCode returns [EObject current=null] : iv_ruleDetailCode= ruleDetailCode EOF ;
    public final EObject entryRuleDetailCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailCode = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:68:2: (iv_ruleDetailCode= ruleDetailCode EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:69:2: iv_ruleDetailCode= ruleDetailCode EOF
            {
             newCompositeNode(grammarAccess.getDetailCodeRule()); 
            pushFollow(FOLLOW_ruleDetailCode_in_entryRuleDetailCode75);
            iv_ruleDetailCode=ruleDetailCode();

            state._fsp--;

             current =iv_ruleDetailCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailCode85); 

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
    // $ANTLR end "entryRuleDetailCode"


    // $ANTLR start "ruleDetailCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:76:1: ruleDetailCode returns [EObject current=null] : ( (lv_stmts_0_0= ruleStatement ) )* ;
    public final EObject ruleDetailCode() throws RecognitionException {
        EObject current = null;

        EObject lv_stmts_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:79:28: ( ( (lv_stmts_0_0= ruleStatement ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:1: ( (lv_stmts_0_0= ruleStatement ) )*
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:1: ( (lv_stmts_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: (lv_stmts_0_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: (lv_stmts_0_0= ruleStatement )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:82:3: lv_stmts_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDetailCodeAccess().getStmtsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleDetailCode130);
            	    lv_stmts_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDetailCodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stmts",
            	            		lv_stmts_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDetailCode"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:115:1: ruleStatement returns [EObject current=null] : ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_td_0_0 = null;

        EObject lv_vd_1_0 = null;

        EObject lv_vin_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:118:28: ( ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:119:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:119:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:119:2: ( (lv_td_0_0= ruleTypeDecl ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:119:2: ( (lv_td_0_0= ruleTypeDecl ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:120:1: (lv_td_0_0= ruleTypeDecl )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:120:1: (lv_td_0_0= ruleTypeDecl )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:121:3: lv_td_0_0= ruleTypeDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDecl_in_ruleStatement222);
                    lv_td_0_0=ruleTypeDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"td",
                            		lv_td_0_0, 
                            		"TypeDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:138:6: ( (lv_vd_1_0= ruleVarDecl ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:138:6: ( (lv_vd_1_0= ruleVarDecl ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:139:1: (lv_vd_1_0= ruleVarDecl )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:139:1: (lv_vd_1_0= ruleVarDecl )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:140:3: lv_vd_1_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleStatement249);
                    lv_vd_1_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"vd",
                            		lv_vd_1_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:157:6: ( (lv_vin_2_0= ruleVarInst ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:157:6: ( (lv_vin_2_0= ruleVarInst ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:158:1: (lv_vin_2_0= ruleVarInst )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:158:1: (lv_vin_2_0= ruleVarInst )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:159:3: lv_vin_2_0= ruleVarInst
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarInst_in_ruleStatement276);
                    lv_vin_2_0=ruleVarInst();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"vin",
                            		lv_vin_2_0, 
                            		"VarInst");
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:183:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:184:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:185:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl312);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl322); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:192:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_pt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:195:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:196:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:196:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:196:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVarDecl359); 

                	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0());
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:200:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:201:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:201:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl376); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleVarDecl393); 

                	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getColonKeyword_2());
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:222:1: ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INTTYPE && LA3_0<=RULE_STRTYPE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:222:2: ( (lv_pt_3_0= rulePType ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:222:2: ( (lv_pt_3_0= rulePType ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:223:1: (lv_pt_3_0= rulePType )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:223:1: (lv_pt_3_0= rulePType )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:224:3: lv_pt_3_0= rulePType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePType_in_ruleVarDecl415);
                    lv_pt_3_0=rulePType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"pt",
                            		lv_pt_3_0, 
                            		"PType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:241:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:241:6: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:242:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:242:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:243:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl441); 

                    		newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleVarDecl454); 

                	newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:266:1: entryRulePType returns [EObject current=null] : iv_rulePType= rulePType EOF ;
    public final EObject entryRulePType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePType = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:267:2: (iv_rulePType= rulePType EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:268:2: iv_rulePType= rulePType EOF
            {
             newCompositeNode(grammarAccess.getPTypeRule()); 
            pushFollow(FOLLOW_rulePType_in_entryRulePType490);
            iv_rulePType=rulePType();

            state._fsp--;

             current =iv_rulePType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePType500); 

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
    // $ANTLR end "entryRulePType"


    // $ANTLR start "rulePType"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:275:1: rulePType returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) ;
    public final EObject rulePType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:278:28: ( ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:279:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:279:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INTTYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRTYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:279:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:279:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:280:1: (lv_type_0_0= RULE_INTTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:280:1: (lv_type_0_0= RULE_INTTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:281:3: lv_type_0_0= RULE_INTTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rulePType542); 

                    			newLeafNode(lv_type_0_0, grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"intType");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:298:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:298:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:299:1: (lv_type_1_0= RULE_STRTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:299:1: (lv_type_1_0= RULE_STRTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:300:3: lv_type_1_0= RULE_STRTYPE
                    {
                    lv_type_1_0=(Token)match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rulePType570); 

                    			newLeafNode(lv_type_1_0, grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"strType");
                    	    

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
    // $ANTLR end "rulePType"


    // $ANTLR start "entryRuleTypeDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:324:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:325:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:326:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl611);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl621); 

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:333:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:336:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:337:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:337:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:337:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeDecl658); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:341:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:342:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:342:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:343:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl675); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTypeDecl692); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:363:1: ( (lv_tp_3_0= rulePType ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:364:1: (lv_tp_3_0= rulePType )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:364:1: (lv_tp_3_0= rulePType )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:365:3: lv_tp_3_0= rulePType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePType_in_ruleTypeDecl713);
            lv_tp_3_0=rulePType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeDeclRule());
            	        }
                   		set(
                   			current, 
                   			"tp",
                    		lv_tp_3_0, 
                    		"PType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl725); 

                	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleVarInst"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:393:1: entryRuleVarInst returns [EObject current=null] : iv_ruleVarInst= ruleVarInst EOF ;
    public final EObject entryRuleVarInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInst = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:394:2: (iv_ruleVarInst= ruleVarInst EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:395:2: iv_ruleVarInst= ruleVarInst EOF
            {
             newCompositeNode(grammarAccess.getVarInstRule()); 
            pushFollow(FOLLOW_ruleVarInst_in_entryRuleVarInst761);
            iv_ruleVarInst=ruleVarInst();

            state._fsp--;

             current =iv_ruleVarInst; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInst771); 

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
    // $ANTLR end "entryRuleVarInst"


    // $ANTLR start "ruleVarInst"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:402:1: ruleVarInst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) ) ) ;
    public final EObject ruleVarInst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_strexp_2_0 = null;

        EObject lv_inexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:405:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:406:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:406:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:406:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:406:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:407:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:407:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:408:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVarInstRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarInst816); 

            		newLeafNode(otherlv_0, grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVarInst828); 

                	newLeafNode(otherlv_1, grammarAccess.getVarInstAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:423:1: ( ( (lv_strexp_2_0= ruleConcat ) ) | ( (lv_inexp_3_0= ruleSubtraction ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:423:2: ( (lv_strexp_2_0= ruleConcat ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:423:2: ( (lv_strexp_2_0= ruleConcat ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:424:1: (lv_strexp_2_0= ruleConcat )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:424:1: (lv_strexp_2_0= ruleConcat )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:425:3: lv_strexp_2_0= ruleConcat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarInstAccess().getStrexpConcatParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcat_in_ruleVarInst850);
                    lv_strexp_2_0=ruleConcat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarInstRule());
                    	        }
                           		set(
                           			current, 
                           			"strexp",
                            		lv_strexp_2_0, 
                            		"Concat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:442:6: ( (lv_inexp_3_0= ruleSubtraction ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:442:6: ( (lv_inexp_3_0= ruleSubtraction ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:443:1: (lv_inexp_3_0= ruleSubtraction )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:443:1: (lv_inexp_3_0= ruleSubtraction )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:444:3: lv_inexp_3_0= ruleSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarInstAccess().getInexpSubtractionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSubtraction_in_ruleVarInst877);
                    lv_inexp_3_0=ruleSubtraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarInstRule());
                    	        }
                           		set(
                           			current, 
                           			"inexp",
                            		lv_inexp_3_0, 
                            		"Subtraction");
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
    // $ANTLR end "ruleVarInst"


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:468:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:469:2: (iv_ruleConcat= ruleConcat EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:470:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat914);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat924); 

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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:477:1: ruleConcat returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StringLiteral_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:480:28: ( (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:481:1: (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:481:1: (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:482:5: this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConcatAccess().getStringLiteralParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleConcat971);
            this_StringLiteral_0=ruleStringLiteral();

            state._fsp--;

             
                    current = this_StringLiteral_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:490:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:490:2: () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:490:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:491:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleConcat992); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:500:1: ( (lv_right_3_0= ruleStringLiteral ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:501:1: (lv_right_3_0= ruleStringLiteral )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:501:1: (lv_right_3_0= ruleStringLiteral )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:502:3: lv_right_3_0= ruleStringLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringLiteral_in_ruleConcat1013);
            	    lv_right_3_0=ruleStringLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConcatRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"StringLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:526:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:527:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:528:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1051);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1061); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:535:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:538:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:539:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:539:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:540:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:540:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:541:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1102); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:565:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:566:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:567:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction1142);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction1152); 

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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:574:1: ruleSubtraction returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:577:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:578:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:578:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:579:5: this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1199);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:587:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:587:2: () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:587:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:588:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSubtraction1220); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:597:1: ( (lv_right_3_0= ruleAddition ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:598:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:598:1: (lv_right_3_0= ruleAddition )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:599:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1241);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubtractionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Addition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:623:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:624:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:625:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1279);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1289); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:632:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:635:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:636:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:636:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:637:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1336);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:645:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:645:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:645:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:646:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAddition1357); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:655:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:656:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:656:1: (lv_right_3_0= ruleMultiplication )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:657:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1378);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:681:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:682:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:683:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1416);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1426); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:690:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:693:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:694:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:694:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:695:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1473);
            this_Division_0=ruleDivision();

            state._fsp--;

             
                    current = this_Division_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:703:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:703:2: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:703:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:704:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleMultiplication1494); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:713:1: ( (lv_right_3_0= ruleDivision ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:714:1: (lv_right_3_0= ruleDivision )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:714:1: (lv_right_3_0= ruleDivision )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:715:3: lv_right_3_0= ruleDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1515);
            	    lv_right_3_0=ruleDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Division");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:739:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:740:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:741:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision1553);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision1563); 

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:748:1: ruleDivision returns [EObject current=null] : (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PowerOf_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:751:28: ( (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:752:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:752:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:753:5: this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1610);
            this_PowerOf_0=rulePowerOf();

            state._fsp--;

             
                    current = this_PowerOf_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:761:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:761:2: () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:761:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:762:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleDivision1631); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:771:1: ( (lv_right_3_0= rulePowerOf ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:772:1: (lv_right_3_0= rulePowerOf )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:772:1: (lv_right_3_0= rulePowerOf )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:773:3: lv_right_3_0= rulePowerOf
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1652);
            	    lv_right_3_0=rulePowerOf();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PowerOf");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePowerOf"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:797:1: entryRulePowerOf returns [EObject current=null] : iv_rulePowerOf= rulePowerOf EOF ;
    public final EObject entryRulePowerOf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOf = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:798:2: (iv_rulePowerOf= rulePowerOf EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:799:2: iv_rulePowerOf= rulePowerOf EOF
            {
             newCompositeNode(grammarAccess.getPowerOfRule()); 
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf1690);
            iv_rulePowerOf=rulePowerOf();

            state._fsp--;

             current =iv_rulePowerOf; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf1700); 

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
    // $ANTLR end "entryRulePowerOf"


    // $ANTLR start "rulePowerOf"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:806:1: rulePowerOf returns [EObject current=null] : (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* ) ;
    public final EObject rulePowerOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BasicIntExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:809:28: ( (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:810:1: (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:810:1: (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:811:5: this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBasicIntExp_in_rulePowerOf1747);
            this_BasicIntExp_0=ruleBasicIntExp();

            state._fsp--;

             
                    current = this_BasicIntExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:819:1: ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:819:2: () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:819:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:820:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePowerOf1768); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1());
            	        
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:829:1: ( (lv_right_3_0= ruleBasicIntExp ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:830:1: (lv_right_3_0= ruleBasicIntExp )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:830:1: (lv_right_3_0= ruleBasicIntExp )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:831:3: lv_right_3_0= ruleBasicIntExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicIntExp_in_rulePowerOf1789);
            	    lv_right_3_0=ruleBasicIntExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPowerOfRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BasicIntExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "rulePowerOf"


    // $ANTLR start "entryRuleBasicIntExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:855:1: entryRuleBasicIntExp returns [EObject current=null] : iv_ruleBasicIntExp= ruleBasicIntExp EOF ;
    public final EObject entryRuleBasicIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicIntExp = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:856:2: (iv_ruleBasicIntExp= ruleBasicIntExp EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:857:2: iv_ruleBasicIntExp= ruleBasicIntExp EOF
            {
             newCompositeNode(grammarAccess.getBasicIntExpRule()); 
            pushFollow(FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp1827);
            iv_ruleBasicIntExp=ruleBasicIntExp();

            state._fsp--;

             current =iv_ruleBasicIntExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicIntExp1837); 

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
    // $ANTLR end "entryRuleBasicIntExp"


    // $ANTLR start "ruleBasicIntExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:864:1: ruleBasicIntExp returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) ) ;
    public final EObject ruleBasicIntExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_IntLiteral_0 = null;

        EObject this_Subtraction_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:867:28: ( (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:868:1: (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:868:1: (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:869:5: this_IntLiteral_0= ruleIntLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleBasicIntExp1884);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;

                     
                            current = this_IntLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:878:6: (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:878:6: (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:878:8: otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleBasicIntExp1902); 

                        	newLeafNode(otherlv_1, grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSubtraction_in_ruleBasicIntExp1924);
                    this_Subtraction_2=ruleSubtraction();

                    state._fsp--;

                     
                            current = this_Subtraction_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleBasicIntExp1935); 

                        	newLeafNode(otherlv_3, grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleBasicIntExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:903:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:904:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:905:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1972);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1982); 

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:912:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:915:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:916:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:916:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:917:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:917:1: (lv_value_0_0= RULE_INT )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:918:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2023); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDetailCode_in_entryRuleDetailCode75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailCode85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDetailCode130 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleStatement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleStatement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_ruleStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarDecl359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl376 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl393 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePType_in_ruleVarDecl415 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rulePType542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rulePType570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeDecl658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl675 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDecl692 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rulePType_in_ruleTypeDecl713 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_entryRuleVarInst761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInst771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarInst816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarInst828 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleConcat_in_ruleVarInst850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleVarInst877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleConcat971 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleConcat992 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleConcat1013 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1199 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSubtraction1220 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1241 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1336 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAddition1357 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1378 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1473 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMultiplication1494 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1515 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1610 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDivision1631 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1652 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rulePowerOf1747 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulePowerOf1768 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rulePowerOf1789 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicIntExp1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleBasicIntExp1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicIntExp1902 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleBasicIntExp1924 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBasicIntExp1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2023 = new BitSet(new long[]{0x0000000000000002L});

}