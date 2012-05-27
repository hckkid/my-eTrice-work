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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "':'", "';'", "'type'", "'='", "'^'", "'-'", "'+'", "'*'", "'/'", "'**'", "'('", "')'", "'if'", "'{'", "'}'", "'else'"
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

                if ( (LA3_0==RULE_ID||LA3_0==26) ) {
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:151:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_td_0_0 = null;

        EObject lv_vd_1_0 = null;

        EObject lv_vin_2_0 = null;

        EObject lv_ifst_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:154:28: ( ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:155:1: ( ( (lv_td_0_0= ruleTypeDecl ) ) | ( (lv_vd_1_0= ruleVarDecl ) ) | ( (lv_vin_2_0= ruleVarInst ) ) | ( (lv_ifst_3_0= ruleifte ) ) )
            int alt4=4;
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
            case 26:
                {
                alt4=4;
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:238:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:239:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement387);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement397); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:247:1: ruleStatement returns [EObject current=null] : ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_vin_0_0 = null;

        EObject lv_ifst_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:250:28: ( ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:251:1: ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:251:1: ( ( (lv_vin_0_0= ruleVarInst ) ) | ( (lv_ifst_1_0= ruleifte ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:251:2: ( (lv_vin_0_0= ruleVarInst ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:251:2: ( (lv_vin_0_0= ruleVarInst ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:252:1: (lv_vin_0_0= ruleVarInst )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:252:1: (lv_vin_0_0= ruleVarInst )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:253:3: lv_vin_0_0= ruleVarInst
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarInst_in_ruleStatement443);
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:6: ( (lv_ifst_1_0= ruleifte ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:270:6: ( (lv_ifst_1_0= ruleifte ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:271:1: (lv_ifst_1_0= ruleifte )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:271:1: (lv_ifst_1_0= ruleifte )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:272:3: lv_ifst_1_0= ruleifte
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleifte_in_ruleStatement470);
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:296:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:297:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:298:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl506);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl516); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:305:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) () otherlv_6= ';' ) ;
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
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:308:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) () otherlv_6= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:309:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) () otherlv_6= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:309:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) () otherlv_6= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:309:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) ) () otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVarDecl553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:313:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:314:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:314:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:315:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl570); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleVarDecl587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:335:1: ( ( (lv_pt_3_0= rulePType ) ) | ( (otherlv_4= RULE_ID ) ) )
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:335:2: ( (lv_pt_3_0= rulePType ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:335:2: ( (lv_pt_3_0= rulePType ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:336:1: (lv_pt_3_0= rulePType )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:336:1: (lv_pt_3_0= rulePType )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:337:3: lv_pt_3_0= rulePType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePType_in_ruleVarDecl609);
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:354:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:354:6: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:355:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:355:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:356:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarDeclRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:367:3: ()
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:368:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getVarDeclAccess().getVarDeclTypeAction_4(),
                          current);
                  
            }

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleVarDecl657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getSemicolonKeyword_5());
                  
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:385:1: entryRulePType returns [EObject current=null] : iv_rulePType= rulePType EOF ;
    public final EObject entryRulePType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePType = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:386:2: (iv_rulePType= rulePType EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:387:2: iv_rulePType= rulePType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPTypeRule()); 
            }
            pushFollow(FOLLOW_rulePType_in_entryRulePType693);
            iv_rulePType=rulePType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePType703); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:394:1: rulePType returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) ;
    public final EObject rulePType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:397:28: ( ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:398:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:398:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INTTYPE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRTYPE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:398:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:398:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:399:1: (lv_type_0_0= RULE_INTTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:399:1: (lv_type_0_0= RULE_INTTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:400:3: lv_type_0_0= RULE_INTTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rulePType745); if (state.failed) return current;
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:417:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:417:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:418:1: (lv_type_1_0= RULE_STRTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:418:1: (lv_type_1_0= RULE_STRTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:419:3: lv_type_1_0= RULE_STRTYPE
                    {
                    lv_type_1_0=(Token)match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rulePType773); if (state.failed) return current;
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:443:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:444:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:445:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl814);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl824); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:452:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:455:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:456:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:456:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:456:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tp_3_0= rulePType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeDecl861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:460:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:461:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:461:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:462:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl878); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTypeDecl895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:482:1: ( (lv_tp_3_0= rulePType ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:483:1: (lv_tp_3_0= rulePType )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:483:1: (lv_tp_3_0= rulePType )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:484:3: lv_tp_3_0= rulePType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePType_in_ruleTypeDecl916);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl928); if (state.failed) return current;
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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:512:1: entryRuleVarInst returns [EObject current=null] : iv_ruleVarInst= ruleVarInst EOF ;
    public final EObject entryRuleVarInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInst = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:513:2: (iv_ruleVarInst= ruleVarInst EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:514:2: iv_ruleVarInst= ruleVarInst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarInstRule()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_entryRuleVarInst964);
            iv_ruleVarInst=ruleVarInst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarInst; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInst974); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:521:1: ruleVarInst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVarInst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:524:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:525:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:525:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:525:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:525:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:526:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:526:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:527:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarInstRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarInst1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVarInst1031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVarInstAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:542:1: ( (lv_exp_2_0= ruleExpression ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:543:1: (lv_exp_2_0= ruleExpression )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:543:1: (lv_exp_2_0= ruleExpression )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:544:3: lv_exp_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVarInst1052);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVarInst1064); if (state.failed) return current;
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


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:572:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:573:2: (iv_ruleConcat= ruleConcat EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:574:2: iv_ruleConcat= ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat1100);
            iv_ruleConcat=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat1110); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:581:1: ruleConcat returns [EObject current=null] : (this_BasicStringExp_0= ruleBasicStringExp ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BasicStringExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:584:28: ( (this_BasicStringExp_0= ruleBasicStringExp ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:585:1: (this_BasicStringExp_0= ruleBasicStringExp ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:585:1: (this_BasicStringExp_0= ruleBasicStringExp ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:586:5: this_BasicStringExp_0= ruleBasicStringExp ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConcatAccess().getBasicStringExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicStringExp_in_ruleConcat1157);
            this_BasicStringExp_0=ruleBasicStringExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicStringExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:594:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:594:2: () otherlv_2= '^' ( (lv_right_3_0= ruleStringLiteral ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:594:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:595:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleConcat1178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:604:1: ( (lv_right_3_0= ruleStringLiteral ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:605:1: (lv_right_3_0= ruleStringLiteral )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:605:1: (lv_right_3_0= ruleStringLiteral )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:606:3: lv_right_3_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStringLiteral_in_ruleConcat1199);
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
            	    break loop8;
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


    // $ANTLR start "entryRuleBasicStringExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:630:1: entryRuleBasicStringExp returns [EObject current=null] : iv_ruleBasicStringExp= ruleBasicStringExp EOF ;
    public final EObject entryRuleBasicStringExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStringExp = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:631:2: (iv_ruleBasicStringExp= ruleBasicStringExp EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:632:2: iv_ruleBasicStringExp= ruleBasicStringExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicStringExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicStringExp_in_entryRuleBasicStringExp1237);
            iv_ruleBasicStringExp=ruleBasicStringExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicStringExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStringExp1247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicStringExp"


    // $ANTLR start "ruleBasicStringExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:639:1: ruleBasicStringExp returns [EObject current=null] : this_StringLiteral_0= ruleStringLiteral ;
    public final EObject ruleBasicStringExp() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:642:28: (this_StringLiteral_0= ruleStringLiteral )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:644:5: this_StringLiteral_0= ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBasicStringExpAccess().getStringLiteralParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleBasicStringExp1293);
            this_StringLiteral_0=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_StringLiteral_0; 
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
    // $ANTLR end "ruleBasicStringExp"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:660:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:661:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:662:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1327);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1337); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:669:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:672:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:673:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:673:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:674:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:674:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:675:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1378); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:699:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:700:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:701:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction1418);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtraction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction1428); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:708:1: ruleSubtraction returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:711:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:712:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:712:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:713:5: this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1475);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:721:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:721:2: () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:721:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:722:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSubtraction1496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:731:1: ( (lv_right_3_0= ruleAddition ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:732:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:732:1: (lv_right_3_0= ruleAddition )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:733:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction1517);
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:757:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:758:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:759:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1555);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1565); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:766:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:769:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:770:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:770:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:771:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1612);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:779:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:779:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:779:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:780:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAddition1633); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:789:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:790:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:790:1: (lv_right_3_0= ruleMultiplication )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:791:3: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1654);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:815:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:816:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:817:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1692);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1702); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:824:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:827:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:828:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:828:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:829:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1749);
            this_Division_0=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Division_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:837:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:837:2: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:837:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:838:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleMultiplication1770); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:847:1: ( (lv_right_3_0= ruleDivision ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:848:1: (lv_right_3_0= ruleDivision )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:848:1: (lv_right_3_0= ruleDivision )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:849:3: lv_right_3_0= ruleDivision
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication1791);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:873:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:874:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:875:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision1829);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision1839); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:882:1: ruleDivision returns [EObject current=null] : (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PowerOf_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:885:28: ( (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:886:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:886:1: (this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:887:5: this_PowerOf_0= rulePowerOf ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1886);
            this_PowerOf_0=rulePowerOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PowerOf_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:895:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:895:2: () otherlv_2= '/' ( (lv_right_3_0= rulePowerOf ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:895:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:896:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleDivision1907); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:905:1: ( (lv_right_3_0= rulePowerOf ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:906:1: (lv_right_3_0= rulePowerOf )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:906:1: (lv_right_3_0= rulePowerOf )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:907:3: lv_right_3_0= rulePowerOf
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePowerOf_in_ruleDivision1928);
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePowerOf"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:931:1: entryRulePowerOf returns [EObject current=null] : iv_rulePowerOf= rulePowerOf EOF ;
    public final EObject entryRulePowerOf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOf = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:932:2: (iv_rulePowerOf= rulePowerOf EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:933:2: iv_rulePowerOf= rulePowerOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerOfRule()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf1966);
            iv_rulePowerOf=rulePowerOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf1976); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:940:1: rulePowerOf returns [EObject current=null] : (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* ) ;
    public final EObject rulePowerOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BasicIntExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:943:28: ( (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:944:1: (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:944:1: (this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )* )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:945:5: this_BasicIntExp_0= ruleBasicIntExp ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicIntExp_in_rulePowerOf2023);
            this_BasicIntExp_0=ruleBasicIntExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicIntExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:953:1: ( () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:953:2: () otherlv_2= '**' ( (lv_right_3_0= ruleBasicIntExp ) )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:953:2: ()
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:954:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePowerOf2044); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:963:1: ( (lv_right_3_0= ruleBasicIntExp ) )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:964:1: (lv_right_3_0= ruleBasicIntExp )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:964:1: (lv_right_3_0= ruleBasicIntExp )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:965:3: lv_right_3_0= ruleBasicIntExp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicIntExp_in_rulePowerOf2065);
            	    lv_right_3_0=ruleBasicIntExp();

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
            	              		"BasicIntExp");
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
    // $ANTLR end "rulePowerOf"


    // $ANTLR start "entryRuleBasicIntExp"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:989:1: entryRuleBasicIntExp returns [EObject current=null] : iv_ruleBasicIntExp= ruleBasicIntExp EOF ;
    public final EObject entryRuleBasicIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicIntExp = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:990:2: (iv_ruleBasicIntExp= ruleBasicIntExp EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:991:2: iv_ruleBasicIntExp= ruleBasicIntExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicIntExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp2103);
            iv_ruleBasicIntExp=ruleBasicIntExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicIntExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicIntExp2113); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:998:1: ruleBasicIntExp returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) ) ;
    public final EObject ruleBasicIntExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_IntLiteral_0 = null;

        EObject this_Subtraction_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1001:28: ( (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1002:1: (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1002:1: (this_IntLiteral_0= ruleIntLiteral | (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1003:5: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleBasicIntExp2160);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1012:6: (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1012:6: (otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1012:8: otherlv_1= '(' this_Subtraction_2= ruleSubtraction otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleBasicIntExp2178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubtraction_in_ruleBasicIntExp2200);
                    this_Subtraction_2=ruleSubtraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Subtraction_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleBasicIntExp2211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleBasicIntExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1037:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1038:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1039:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2248);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral2258); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1046:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1049:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1050:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1050:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1051:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1051:1: (lv_value_0_0= RULE_INT )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1052:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2299); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1076:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1077:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1078:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2339);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2349); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1085:1: ruleExpression returns [EObject current=null] : ( ( (lv_strexp_0_0= ruleConcat ) ) | ( (lv_inexp_1_0= ruleSubtraction ) ) | ( (lv_vex_2_0= ruleVarExps ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_strexp_0_0 = null;

        EObject lv_inexp_1_0 = null;

        EObject lv_vex_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1088:28: ( ( ( (lv_strexp_0_0= ruleConcat ) ) | ( (lv_inexp_1_0= ruleSubtraction ) ) | ( (lv_vex_2_0= ruleVarExps ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1089:1: ( ( (lv_strexp_0_0= ruleConcat ) ) | ( (lv_inexp_1_0= ruleSubtraction ) ) | ( (lv_vex_2_0= ruleVarExps ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1089:1: ( ( (lv_strexp_0_0= ruleConcat ) ) | ( (lv_inexp_1_0= ruleSubtraction ) ) | ( (lv_vex_2_0= ruleVarExps ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
            case 24:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1089:2: ( (lv_strexp_0_0= ruleConcat ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1089:2: ( (lv_strexp_0_0= ruleConcat ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1090:1: (lv_strexp_0_0= ruleConcat )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1090:1: (lv_strexp_0_0= ruleConcat )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1091:3: lv_strexp_0_0= ruleConcat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getStrexpConcatParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConcat_in_ruleExpression2395);
                    lv_strexp_0_0=ruleConcat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"strexp",
                              		lv_strexp_0_0, 
                              		"Concat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1108:6: ( (lv_inexp_1_0= ruleSubtraction ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1108:6: ( (lv_inexp_1_0= ruleSubtraction ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1109:1: (lv_inexp_1_0= ruleSubtraction )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1109:1: (lv_inexp_1_0= ruleSubtraction )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1110:3: lv_inexp_1_0= ruleSubtraction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getInexpSubtractionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubtraction_in_ruleExpression2422);
                    lv_inexp_1_0=ruleSubtraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"inexp",
                              		lv_inexp_1_0, 
                              		"Subtraction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1127:6: ( (lv_vex_2_0= ruleVarExps ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1127:6: ( (lv_vex_2_0= ruleVarExps ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1128:1: (lv_vex_2_0= ruleVarExps )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1128:1: (lv_vex_2_0= ruleVarExps )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1129:3: lv_vex_2_0= ruleVarExps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getVexVarExpsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarExps_in_ruleExpression2449);
                    lv_vex_2_0=ruleVarExps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"vex",
                              		lv_vex_2_0, 
                              		"VarExps");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVarExps"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1153:1: entryRuleVarExps returns [EObject current=null] : iv_ruleVarExps= ruleVarExps EOF ;
    public final EObject entryRuleVarExps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExps = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1154:2: (iv_ruleVarExps= ruleVarExps EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1155:2: iv_ruleVarExps= ruleVarExps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExpsRule()); 
            }
            pushFollow(FOLLOW_ruleVarExps_in_entryRuleVarExps2485);
            iv_ruleVarExps=ruleVarExps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarExps; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExps2495); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1162:1: ruleVarExps returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarExps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1165:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1166:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1166:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1167:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1167:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1168:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarExpsRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarExps2539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarExpsAccess().getVarexVarDeclCrossReference_0()); 
              	
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


    // $ANTLR start "entryRuleifte"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1187:1: entryRuleifte returns [EObject current=null] : iv_ruleifte= ruleifte EOF ;
    public final EObject entryRuleifte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifte = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1188:2: (iv_ruleifte= ruleifte EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1189:2: iv_ruleifte= ruleifte EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfteRule()); 
            }
            pushFollow(FOLLOW_ruleifte_in_entryRuleifte2574);
            iv_ruleifte=ruleifte();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleifte; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleifte2584); if (state.failed) return current;

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1196:1: ruleifte returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleSubtraction ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? ) ;
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
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1199:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleSubtraction ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1200:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleSubtraction ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1200:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleSubtraction ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )? )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1200:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleSubtraction ) ) ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleifte2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfteAccess().getIfKeyword_0());
                  
            }
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1204:1: ( (lv_cond_1_0= ruleSubtraction ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1205:1: (lv_cond_1_0= ruleSubtraction )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1205:1: (lv_cond_1_0= ruleSubtraction )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1206:3: lv_cond_1_0= ruleSubtraction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfteAccess().getCondSubtractionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubtraction_in_ruleifte2642);
            lv_cond_1_0=ruleSubtraction();

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
                      		"Subtraction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:2: ( ( (lv_stmts_2_0= ruleSingleStatement ) ) | (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==13||LA16_0==16||LA16_0==26) ) {
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1222:3: ( (lv_stmts_2_0= ruleSingleStatement ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1223:1: (lv_stmts_2_0= ruleSingleStatement )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1223:1: (lv_stmts_2_0= ruleSingleStatement )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1224:3: lv_stmts_2_0= ruleSingleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSingleStatement_in_ruleifte2664);
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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1241:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1241:6: (otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1241:8: otherlv_3= '{' ( (lv_stmts_4_0= ruleCode ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleifte2683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1245:1: ( (lv_stmts_4_0= ruleCode ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1246:1: (lv_stmts_4_0= ruleCode )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1246:1: (lv_stmts_4_0= ruleCode )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1247:3: lv_stmts_4_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleifte2704);
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

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleifte2716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred1_InternalGACL()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:4: ( ( 'else' )=>otherlv_6= 'else' ) ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:4: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:5: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleifte2739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIfteAccess().getElseKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1272:2: ( ( (lv_estmts_7_0= ruleSingleStatement ) ) | (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==13||LA17_0==16||LA17_0==26) ) {
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
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1272:3: ( (lv_estmts_7_0= ruleSingleStatement ) )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1272:3: ( (lv_estmts_7_0= ruleSingleStatement ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1273:1: (lv_estmts_7_0= ruleSingleStatement )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1273:1: (lv_estmts_7_0= ruleSingleStatement )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1274:3: lv_estmts_7_0= ruleSingleStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSingleStatement_in_ruleifte2762);
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
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:6: (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:6: (otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}' )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1291:8: otherlv_8= '{' ( (lv_estmts_9_0= ruleCode ) ) otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleifte2781); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0());
                                  
                            }
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1295:1: ( (lv_estmts_9_0= ruleCode ) )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1296:1: (lv_estmts_9_0= ruleCode )
                            {
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1296:1: (lv_estmts_9_0= ruleCode )
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1297:3: lv_estmts_9_0= ruleCode
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCode_in_ruleifte2802);
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

                            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleifte2814); if (state.failed) return current;
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
        // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:5: ( 'else' )
        // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:1267:7: 'else'
        {
        match(input,29,FOLLOW_29_in_synpred1_InternalGACL2731); if (state.failed) return ;

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
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleCode133 = new BitSet(new long[]{0x0000000004012012L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleCode152 = new BitSet(new long[]{0x0000000004012012L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCode177 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleSingleStatement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleSingleStatement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_ruleSingleStatement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_ruleSingleStatement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_ruleStatement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_ruleStatement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVarDecl553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl570 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl587 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePType_in_ruleVarDecl609 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl635 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rulePType745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rulePType773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeDecl861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl878 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDecl895 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rulePType_in_ruleTypeDecl916 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_entryRuleVarInst964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInst974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarInst1019 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarInst1031 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVarInst1052 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarInst1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStringExp_in_ruleConcat1157 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleConcat1178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleConcat1199 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleBasicStringExp_in_entryRuleBasicStringExp1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStringExp1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleBasicStringExp1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1475 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSubtraction1496 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction1517 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1612 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAddition1633 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1654 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1749 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMultiplication1770 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication1791 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1886 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDivision1907 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rulePowerOf_in_ruleDivision1928 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rulePowerOf2023 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulePowerOf2044 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rulePowerOf2065 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicIntExp2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleBasicIntExp2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicIntExp2178 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleBasicIntExp2200 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBasicIntExp2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_ruleExpression2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleExpression2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_ruleExpression2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_entryRuleVarExps2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExps2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarExps2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_entryRuleifte2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifte2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleifte2621 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleifte2642 = new BitSet(new long[]{0x000000000C012010L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleifte2664 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27_in_ruleifte2683 = new BitSet(new long[]{0x0000000004012010L});
    public static final BitSet FOLLOW_ruleCode_in_ruleifte2704 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleifte2716 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleifte2739 = new BitSet(new long[]{0x000000000C012010L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleifte2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleifte2781 = new BitSet(new long[]{0x0000000004012010L});
    public static final BitSet FOLLOW_ruleCode_in_ruleifte2802 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleifte2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred1_InternalGACL2731 = new BitSet(new long[]{0x0000000000000002L});

}