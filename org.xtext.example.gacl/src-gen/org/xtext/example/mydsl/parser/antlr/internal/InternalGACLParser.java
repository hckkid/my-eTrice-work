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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGACLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "':'", "';'", "'type'", "'='", "'^'", "'-'", "'+'", "'*'", "'/'", "'**'", "'('", "')'", "'for'", "'{'", "'}'", "'if'", "'else'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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
        	return "Code";	
       	}
       	
       	@Override
       	protected GACLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:67:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:68:2: (iv_ruleCode= ruleCode EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:69:2: iv_ruleCode= ruleCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeRule()); 
            }
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode75);
            iv_ruleCode=ruleCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:76:1: ruleCode returns [EObject current=null] : ( ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )* ( (lv_stmts_1_0= ruleStatement ) )* ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_0_1 = null;

        EObject lv_decls_0_2 = null;

        EObject lv_stmts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:79:28: ( ( ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )* ( (lv_stmts_1_0= ruleStatement ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:1: ( ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )* ( (lv_stmts_1_0= ruleStatement ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:1: ( ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )* ( (lv_stmts_1_0= ruleStatement ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:2: ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )* ( (lv_stmts_1_0= ruleStatement ) )*
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:80:2: ( ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: ( (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:82:1: (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:82:1: (lv_decls_0_1= ruleTypeDecl | lv_decls_0_2= ruleVarDecl )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==16) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==13) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:83:3: lv_decls_0_1= ruleTypeDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCodeAccess().getDeclsTypeDeclParserRuleCall_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeDecl_in_ruleCode133);
            	            lv_decls_0_1=ruleTypeDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"decls",
            	                      		lv_decls_0_1, 
            	                      		"TypeDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:98:8: lv_decls_0_2= ruleVarDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCodeAccess().getDeclsVarDeclParserRuleCall_0_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVarDecl_in_ruleCode152);
            	            lv_decls_0_2=ruleVarDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"decls",
            	                      		lv_decls_0_2, 
            	                      		"VarDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:116:3: ( (lv_stmts_1_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==26||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:117:1: (lv_stmts_1_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:117:1: (lv_stmts_1_0= ruleStatement )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:118:3: lv_stmts_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCodeAccess().getStmtsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCode177);
            	    lv_stmts_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stmts",
            	              		lv_stmts_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleSingleStatement"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:142:1: entryRuleSingleStatement returns [EObject current=null] : iv_ruleSingleStatement= ruleSingleStatement EOF ;
    public final EObject entryRuleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStatement = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:143:2: (iv_ruleSingleStatement= ruleSingleStatement EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:144:2: iv_ruleSingleStatement= ruleSingleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement214);
            iv_ruleSingleStatement=ruleSingleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement224); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:151:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) | ( (lv_fl_4_0= ruleforlp ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_td_0_0 = null;

        EObject lv_vd_1_0 = null;

        EObject lv_vin_2_0 = null;

        EObject lv_ifst_3_0 = null;

        EObject lv_fl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:154:28: ( ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) | ( (lv_fl_4_0= ruleforlp ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) | ( (lv_fl_4_0= ruleforlp ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) | ( (lv_fl_4_0= ruleforlp ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:2: ( (lv_td_0_0= ruleTypeDecl ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:2: ( (lv_td_0_0= ruleTypeDecl ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:156:1: (lv_td_0_0= ruleTypeDecl )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:156:1: (lv_td_0_0= ruleTypeDecl )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:157:3: lv_td_0_0= ruleTypeDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDecl_in_ruleSingleStatement270);
                    lv_td_0_0=ruleTypeDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
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


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:174:6: ( (lv_vd_1_0= ruleVarDecl ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:174:6: ( (lv_vd_1_0= ruleVarDecl ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:175:1: (lv_vd_1_0= ruleVarDecl )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:175:1: (lv_vd_1_0= ruleVarDecl )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:176:3: lv_vd_1_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleSingleStatement297);
                    lv_vd_1_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
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


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:193:6: ( (lv_vin_2_0= ruleVarInst ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:193:6: ( (lv_vin_2_0= ruleVarInst ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:194:1: (lv_vin_2_0= ruleVarInst )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:194:1: (lv_vin_2_0= ruleVarInst )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:195:3: lv_vin_2_0= ruleVarInst
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStatementAccess().getVinVarInstParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarInst_in_ruleSingleStatement324);
                    lv_vin_2_0=ruleVarInst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
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


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:212:6: ( (lv_ifst_3_0= ruleifte ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:212:6: ( (lv_ifst_3_0= ruleifte ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:213:1: (lv_ifst_3_0= ruleifte )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:213:1: (lv_ifst_3_0= ruleifte )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:214:3: lv_ifst_3_0= ruleifte
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStatementAccess().getIfstIfteParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleifte_in_ruleSingleStatement351);
                    lv_ifst_3_0=ruleifte();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifst",
                              		lv_ifst_3_0, 
                              		"ifte");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:231:6: ( (lv_fl_4_0= ruleforlp ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:231:6: ( (lv_fl_4_0= ruleforlp ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:232:1: (lv_fl_4_0= ruleforlp )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:232:1: (lv_fl_4_0= ruleforlp )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:233:3: lv_fl_4_0= ruleforlp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStatementAccess().getFlForlpParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleforlp_in_ruleSingleStatement378);
                    lv_fl_4_0=ruleforlp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"fl",
                              		lv_fl_4_0, 
                              		"forlp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:257:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:258:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:259:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement414);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement424); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:266:1: ruleStatement returns [EObject current=null] : ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) | ( (lv_fl_2_0= ruleforlp ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_vin_0_0 = null;

        EObject lv_ifst_1_0 = null;

        EObject lv_fl_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:269:28: ( ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) | ( (lv_fl_2_0= ruleforlp ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:1: ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) | ( (lv_fl_2_0= ruleforlp ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:1: ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) | ( (lv_fl_2_0= ruleforlp ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:2: ( (lv_vin_0_0= ruleVarInst ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:2: ( (lv_vin_0_0= ruleVarInst ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:271:1: (lv_vin_0_0= ruleVarInst )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:271:1: (lv_vin_0_0= ruleVarInst )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:272:3: lv_vin_0_0= ruleVarInst
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarInst_in_ruleStatement470);
                    lv_vin_0_0=ruleVarInst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"vin",
                              		lv_vin_0_0, 
                              		"VarInst");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:289:6: ( (lv_ifst_1_0= ruleifte ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:289:6: ( (lv_ifst_1_0= ruleifte ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:290:1: (lv_ifst_1_0= ruleifte )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:290:1: (lv_ifst_1_0= ruleifte )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:291:3: lv_ifst_1_0= ruleifte
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleifte_in_ruleStatement497);
                    lv_ifst_1_0=ruleifte();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifst",
                              		lv_ifst_1_0, 
                              		"ifte");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:308:6: ( (lv_fl_2_0= ruleforlp ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:308:6: ( (lv_fl_2_0= ruleforlp ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:309:1: (lv_fl_2_0= ruleforlp )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:309:1: (lv_fl_2_0= ruleforlp )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:310:3: lv_fl_2_0= ruleforlp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getFlForlpParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleforlp_in_ruleStatement524);
                    lv_fl_2_0=ruleforlp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"fl",
                              		lv_fl_2_0, 
                              		"forlp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:334:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:335:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:336:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl560);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl570); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:343:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )? () otherlv_6= ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:346:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )? () otherlv_6= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:347:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )? () otherlv_6= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:347:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )? () otherlv_6= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:347:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )? () otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVarDecl607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:352:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:352:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:369:2: (otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:369:4: otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleVarDecl642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:373:1: ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_INTTYPE && LA6_0<=RULE_STRTYPE)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:373:2: ( (lv_pt_3_0= rulePType ) )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:373:2: ( (lv_pt_3_0= rulePType ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:374:1: (lv_pt_3_0= rulePType )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:374:1: (lv_pt_3_0= rulePType )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:375:3: lv_pt_3_0= rulePType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePType_in_ruleVarDecl664);
                            lv_pt_3_0=rulePType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:392:6: ( (otherlv_4= RULE_ID ) )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:392:6: ( (otherlv_4= RULE_ID ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:393:1: (otherlv_4= RULE_ID )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:393:1: (otherlv_4= RULE_ID )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:394:3: otherlv_4= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getVarDeclRule());
                              	        }
                                      
                            }
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl690); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_2_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:405:5: ()
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getVarDeclAccess().getVarDeclTypeAction_3(),
                          current);
                  
            }

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleVarDecl714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:423:1: entryRulePType returns [EObject current=null] : iv_rulePType= rulePType EOF ;
    public final EObject entryRulePType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePType = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:424:2: (iv_rulePType= rulePType EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:425:2: iv_rulePType= rulePType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPTypeRule()); 
            }
            pushFollow(FOLLOW_rulePType_in_entryRulePType750);
            iv_rulePType=rulePType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePType760); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:432:1: rulePType returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) ;
    public final EObject rulePType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:435:28: ( ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:436:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:436:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INTTYPE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRTYPE) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:436:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:436:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:437:1: (lv_type_0_0= RULE_INTTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:437:1: (lv_type_0_0= RULE_INTTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:438:3: lv_type_0_0= RULE_INTTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rulePType802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_0_0, grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:455:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:455:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:456:1: (lv_type_1_0= RULE_STRTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:456:1: (lv_type_1_0= RULE_STRTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:457:3: lv_type_1_0= RULE_STRTYPE
                    {
                    lv_type_1_0=(Token)match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rulePType830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_1_0, grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePType"


    // $ANTLR start "entryRuleTypeDecl"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:481:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:482:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:483:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl871);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl881); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:490:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:493:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:494:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:494:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:494:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeDecl918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:498:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:499:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:499:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:500:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTypeDecl952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:520:1: ( (lv_tp_3_0= rulePType ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:521:1: (lv_tp_3_0= rulePType )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:521:1: (lv_tp_3_0= rulePType )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:522:3: lv_tp_3_0= rulePType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePType_in_ruleTypeDecl973);
            lv_tp_3_0=rulePType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleVarInst"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:550:1: entryRuleVarInst returns [EObject current=null] : iv_ruleVarInst= ruleVarInst EOF ;
    public final EObject entryRuleVarInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInst = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:551:2: (iv_ruleVarInst= ruleVarInst EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:552:2: iv_ruleVarInst= ruleVarInst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarInstRule()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_entryRuleVarInst1021);
            iv_ruleVarInst=ruleVarInst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarInst; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInst1031); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:559:1: ruleVarInst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVarInst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:562:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:563:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:563:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:563:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:563:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:564:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:564:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:565:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarInstRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarInst1076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVarInst1088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVarInstAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:580:1: ( (lv_exp_2_0= ruleExpression ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:581:1: (lv_exp_2_0= ruleExpression )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:581:1: (lv_exp_2_0= ruleExpression )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:582:3: lv_exp_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVarInst1109);
            lv_exp_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarInstRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVarInst1121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarInstAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarInst"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:610:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:611:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:612:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1157);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:619:1: ruleExpression returns [EObject current=null] : this_Concat_0= ruleConcat ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Concat_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:622:28: (this_Concat_0= ruleConcat )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:624:5: this_Concat_0= ruleConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleConcat_in_ruleExpression1213);
            this_Concat_0=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Concat_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:640:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:641:2: (iv_ruleConcat= ruleConcat EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:642:2: iv_ruleConcat= ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat1247);
            iv_ruleConcat=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat1257); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:649:1: ruleConcat returns [EObject current=null] : (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Subtraction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:652:28: ( (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:653:1: (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:653:1: (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:654:5: this_Subtraction_0= ruleSubtraction ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConcatAccess().getSubtractionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubtraction_in_ruleConcat1304);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Subtraction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:662:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:662:2: () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:662:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:663:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleConcat1325); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:672:1: ( (lv_right_3_0= ruleStringLiteral ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:673:1: (lv_right_3_0= ruleStringLiteral )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:673:1: (lv_right_3_0= ruleStringLiteral )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:674:3: lv_right_3_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStringLiteral_in_ruleConcat1346);
            	    lv_right_3_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:698:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:699:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:700:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction1384);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtraction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction1394); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:707:1: ruleSubtraction returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:710:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:711:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:711:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:712:5: this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1441);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:720:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:720:2: () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:720:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:721:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSubtraction1462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:730:1: ( (lv_right_3_0= ruleAddition ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:731:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:731:1: (lv_right_3_0= ruleAddition )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:732:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1483);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:756:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:757:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:758:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1521);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1531); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:765:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:768:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:769:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:769:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:770:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1578);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:778:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:778:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:778:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:779:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAddition1599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:788:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:789:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:789:1: (lv_right_3_0= ruleMultiplication )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:790:3: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1620);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:814:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:815:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:816:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1658);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1668); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:823:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:826:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:827:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:827:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:828:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1715);
            this_Division_0=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Division_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:836:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:836:2: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:836:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:837:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleMultiplication1736); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:846:1: ( (lv_right_3_0= ruleDivision ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:847:1: (lv_right_3_0= ruleDivision )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:847:1: (lv_right_3_0= ruleDivision )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:848:3: lv_right_3_0= ruleDivision
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1757);
            	    lv_right_3_0=ruleDivision();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:872:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:873:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:874:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision1795);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision1805); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:881:1: ruleDivision returns [EObject current=null] : (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PowerOf_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:884:28: ( (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:885:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:885:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:886:5: this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1852);
            this_PowerOf_0=rulePowerOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PowerOf_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:894:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:894:2: () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:894:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:895:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleDivision1873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:904:1: ( (lv_right_3_0= rulePowerOf ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:905:1: (lv_right_3_0= rulePowerOf )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:905:1: (lv_right_3_0= rulePowerOf )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:906:3: lv_right_3_0= rulePowerOf
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1894);
            	    lv_right_3_0=rulePowerOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePowerOf"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:930:1: entryRulePowerOf returns [EObject current=null] : iv_rulePowerOf= rulePowerOf EOF ;
    public final EObject entryRulePowerOf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOf = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:931:2: (iv_rulePowerOf= rulePowerOf EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:932:2: iv_rulePowerOf= rulePowerOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerOfRule()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf1932);
            iv_rulePowerOf=rulePowerOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf1942); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:939:1: rulePowerOf returns [EObject current=null] : (this_BasicExp_0= ruleBasicExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )* ) ;
    public final EObject rulePowerOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BasicExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:942:28: ( (this_BasicExp_0= ruleBasicExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:943:1: (this_BasicExp_0= ruleBasicExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:943:1: (this_BasicExp_0= ruleBasicExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:944:5: this_BasicExp_0= ruleBasicExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerOfAccess().getBasicExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicExp_in_rulePowerOf1989);
            this_BasicExp_0=ruleBasicExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:952:1: ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:952:2: () otherlv_2= '**' ( (lv_right_3_0= ruleBasicExp ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:952:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:953:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePowerOf2010); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:962:1: ( (lv_right_3_0= ruleBasicExp ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:963:1: (lv_right_3_0= ruleBasicExp )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:963:1: (lv_right_3_0= ruleBasicExp )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:964:3: lv_right_3_0= ruleBasicExp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPowerOfAccess().getRightBasicExpParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicExp_in_rulePowerOf2031);
            	    lv_right_3_0=ruleBasicExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPowerOfRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BasicExp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePowerOf"


    // $ANTLR start "entryRuleBasicExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:988:1: entryRuleBasicExp returns [EObject current=null] : iv_ruleBasicExp= ruleBasicExp EOF ;
    public final EObject entryRuleBasicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicExp = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:989:2: (iv_ruleBasicExp= ruleBasicExp EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:990:2: iv_ruleBasicExp= ruleBasicExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicExp_in_entryRuleBasicExp2069);
            iv_ruleBasicExp=ruleBasicExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicExp2079); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicExp"


    // $ANTLR start "ruleBasicExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:997:1: ruleBasicExp returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_VarExps_2= ruleVarExps | (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' ) ) ;
    public final EObject ruleBasicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_VarExps_2 = null;

        EObject this_Concat_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1000:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_VarExps_2= ruleVarExps | (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1001:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_VarExps_2= ruleVarExps | (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1001:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_VarExps_2= ruleVarExps | (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            case 24:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1002:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicExpAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleBasicExp2126);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1012:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicExpAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleBasicExp2153);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1022:5: this_VarExps_2= ruleVarExps
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicExpAccess().getVarExpsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarExps_in_ruleBasicExp2180);
                    this_VarExps_2=ruleVarExps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarExps_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1031:6: (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1031:6: (otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1031:8: otherlv_3= '(' this_Concat_4= ruleConcat otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleBasicExp2198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicExpAccess().getConcatParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConcat_in_ruleBasicExp2220);
                    this_Concat_4=ruleConcat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Concat_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleBasicExp2231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBasicExpAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1056:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1057:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1058:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2268);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral2278); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1065:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1068:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1069:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1069:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1070:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1070:1: (lv_value_0_0= RULE_INT )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1071:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1095:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1096:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1097:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2359);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2369); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1104:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1107:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1108:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1108:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1109:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1109:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1110:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleVarExps"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1134:1: entryRuleVarExps returns [EObject current=null] : iv_ruleVarExps= ruleVarExps EOF ;
    public final EObject entryRuleVarExps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExps = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1135:2: (iv_ruleVarExps= ruleVarExps EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1136:2: iv_ruleVarExps= ruleVarExps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExpsRule()); 
            }
            pushFollow(FOLLOW_ruleVarExps_in_entryRuleVarExps2450);
            iv_ruleVarExps=ruleVarExps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarExps; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExps2460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarExps"


    // $ANTLR start "ruleVarExps"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1143:1: ruleVarExps returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarExps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1146:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1147:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1147:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1148:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1148:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1149:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarExpsRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarExps2504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarExpsAccess().getVrnmVarDeclCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarExps"


    // $ANTLR start "entryRuleforlp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1168:1: entryRuleforlp returns [EObject current=null] : iv_ruleforlp= ruleforlp EOF ;
    public final EObject entryRuleforlp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleforlp = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1169:2: (iv_ruleforlp= ruleforlp EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1170:2: iv_ruleforlp= ruleforlp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForlpRule()); 
            }
            pushFollow(FOLLOW_ruleforlp_in_entryRuleforlp2539);
            iv_ruleforlp=ruleforlp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleforlp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleforlp2549); if (state.failed) return current;

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
    // $ANTLR end "entryRuleforlp"


    // $ANTLR start "ruleforlp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1177:1: ruleforlp returns [EObject current=null] : (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ) ;
    public final EObject ruleforlp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_1_0 = null;

        EObject lv_stmts_2_0 = null;

        EObject lv_stmts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1180:28: ( (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1181:1: (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1181:1: (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1181:3: otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleforlp2586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForlpAccess().getForKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1185:1: ( (lv_cond_1_0= ruleExpression ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1186:1: (lv_cond_1_0= ruleExpression )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1186:1: (lv_cond_1_0= ruleExpression )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1187:3: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForlpAccess().getCondExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleforlp2607);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForlpRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1203:2: ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==13||LA16_0==16||LA16_0==26||LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1203:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1203:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1204:1: (lv_stmts_2_0= ruleSingleStatement )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1204:1: (lv_stmts_2_0= ruleSingleStatement )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1205:3: lv_stmts_2_0= ruleSingleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForlpAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSingleStatement_in_ruleforlp2629);
                    lv_stmts_2_0=ruleSingleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForlpRule());
                      	        }
                             		add(
                             			current, 
                             			"stmts",
                              		lv_stmts_2_0, 
                              		"SingleStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:8: otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleforlp2648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForlpAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1226:1: ( (lv_stmts_4_0= ruleCode ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1227:1: (lv_stmts_4_0= ruleCode )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1227:1: (lv_stmts_4_0= ruleCode )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1228:3: lv_stmts_4_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForlpAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleforlp2669);
                    lv_stmts_4_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForlpRule());
                      	        }
                             		add(
                             			current, 
                             			"stmts",
                              		lv_stmts_4_0, 
                              		"Code");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleforlp2681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForlpAccess().getRightCurlyBracketKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleforlp"


    // $ANTLR start "entryRuleifte"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1256:1: entryRuleifte returns [EObject current=null] : iv_ruleifte= ruleifte EOF ;
    public final EObject entryRuleifte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifte = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1257:2: (iv_ruleifte= ruleifte EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1258:2: iv_ruleifte= ruleifte EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfteRule()); 
            }
            pushFollow(FOLLOW_ruleifte_in_entryRuleifte2719);
            iv_ruleifte=ruleifte();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleifte; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleifte2729); if (state.failed) return current;

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
    // $ANTLR end "entryRuleifte"


    // $ANTLR start "ruleifte"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1265:1: ruleifte returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? ) ;
    public final EObject ruleifte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_cond_1_0 = null;

        EObject lv_stmts_2_0 = null;

        EObject lv_stmts_4_0 = null;

        EObject lv_estmts_7_0 = null;

        EObject lv_estmts_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1268:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1269:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1269:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1269:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleifte2766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfteAccess().getIfKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1273:1: ( (lv_cond_1_0= ruleExpression ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1274:1: (lv_cond_1_0= ruleExpression )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1274:1: (lv_cond_1_0= ruleExpression )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1275:3: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfteAccess().getCondExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleifte2787);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfteRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:2: ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==13||LA17_0==16||LA17_0==26||LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1292:1: (lv_stmts_2_0= ruleSingleStatement )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1292:1: (lv_stmts_2_0= ruleSingleStatement )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1293:3: lv_stmts_2_0= ruleSingleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSingleStatement_in_ruleifte2809);
                    lv_stmts_2_0=ruleSingleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfteRule());
                      	        }
                             		add(
                             			current, 
                             			"stmts",
                              		lv_stmts_2_0, 
                              		"SingleStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1310:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1310:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1310:8: otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleifte2828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1314:1: ( (lv_stmts_4_0= ruleCode ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1315:1: (lv_stmts_4_0= ruleCode )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1315:1: (lv_stmts_4_0= ruleCode )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1316:3: lv_stmts_4_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleifte2849);
                    lv_stmts_4_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfteRule());
                      	        }
                             		add(
                             			current, 
                             			"stmts",
                              		lv_stmts_4_0, 
                              		"Code");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleifte2861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred1_InternalGACL()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:4: ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:4: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:5: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleifte2884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIfteAccess().getElseKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1341:2: ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==13||LA18_0==16||LA18_0==26||LA18_0==29) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==27) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1341:3: ( (lv_estmts_7_0= ruleSingleStatement ) )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1341:3: ( (lv_estmts_7_0= ruleSingleStatement ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1342:1: (lv_estmts_7_0= ruleSingleStatement )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1342:1: (lv_estmts_7_0= ruleSingleStatement )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1343:3: lv_estmts_7_0= ruleSingleStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSingleStatement_in_ruleifte2907);
                            lv_estmts_7_0=ruleSingleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getIfteRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"estmts",
                                      		lv_estmts_7_0, 
                                      		"SingleStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1360:6: (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1360:6: (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1360:8: otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleifte2926); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0());
                                  
                            }
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1364:1: ( (lv_estmts_9_0= ruleCode ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1365:1: (lv_estmts_9_0= ruleCode )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1365:1: (lv_estmts_9_0= ruleCode )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1366:3: lv_estmts_9_0= ruleCode
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCode_in_ruleifte2947);
                            lv_estmts_9_0=ruleCode();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getIfteRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"estmts",
                                      		lv_estmts_9_0, 
                                      		"Code");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleifte2959); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_3_1_1_2());
                                  
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleifte"

    // $ANTLR start synpred1_InternalGACL
    public final void synpred1_InternalGACL_fragment() throws RecognitionException {   
        // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:5: ( 'else' )
        // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1336:7: 'else'
        {
        match(input,30,FOLLOW_30_in_synpred1_InternalGACL2876); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGACL

    // Delegated rules

    public final boolean synpred1_InternalGACL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGACL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleCode133 = new BitSet(new long[]{0x0000000024012012L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleCode152 = new BitSet(new long[]{0x0000000024012012L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCode177 = new BitSet(new long[]{0x0000000024000012L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleSingleStatement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleSingleStatement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_ruleSingleStatement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_ruleSingleStatement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_ruleSingleStatement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_ruleStatement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_ruleStatement497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_ruleStatement524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarDecl607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl624 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl642 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePType_in_ruleVarDecl664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl690 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rulePType802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rulePType830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeDecl918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl935 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDecl952 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rulePType_in_ruleTypeDecl973 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_entryRuleVarInst1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInst1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarInst1076 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarInst1088 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVarInst1109 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarInst1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_ruleExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleConcat1304 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleConcat1325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleConcat1346 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1441 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSubtraction1462 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1483 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1578 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAddition1599 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1620 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1715 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMultiplication1736 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1757 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision1795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1852 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDivision1873 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1894 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExp_in_rulePowerOf1989 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulePowerOf2010 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleBasicExp_in_rulePowerOf2031 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleBasicExp_in_entryRuleBasicExp2069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicExp2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleBasicExp2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleBasicExp2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_ruleBasicExp2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicExp2198 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleConcat_in_ruleBasicExp2220 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBasicExp2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_entryRuleVarExps2450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExps2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarExps2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_entryRuleforlp2539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleforlp2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleforlp2586 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleforlp2607 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleforlp2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleforlp2648 = new BitSet(new long[]{0x0000000024012010L});
    public static final BitSet FOLLOW_ruleCode_in_ruleforlp2669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleforlp2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_entryRuleifte2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifte2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleifte2766 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleifte2787 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleifte2809 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27_in_ruleifte2828 = new BitSet(new long[]{0x0000000024012010L});
    public static final BitSet FOLLOW_ruleCode_in_ruleifte2849 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleifte2861 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleifte2884 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleifte2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleifte2926 = new BitSet(new long[]{0x0000000024012010L});
    public static final BitSet FOLLOW_ruleCode_in_ruleifte2947 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleifte2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred1_InternalGACL2876 = new BitSet(new long[]{0x0000000000000002L});

}