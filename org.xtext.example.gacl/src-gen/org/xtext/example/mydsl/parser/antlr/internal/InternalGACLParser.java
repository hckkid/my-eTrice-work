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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'Type'", "'TYPE'", "'='"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_INTTYPE=4;
    public static final int RULE_STRTYPE=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

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
        	return "Program";	
       	}
       	
       	@Override
       	protected GACLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_stmts_0_0= ruleStatement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
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

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: (lv_stmts_0_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:81:1: (lv_stmts_0_0= ruleStatement )
            	    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:82:3: lv_stmts_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProgram130);
            	    lv_stmts_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
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
    // $ANTLR end "ruleProgram"


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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:115:1: ruleStatement returns [EObject current=null] : this_TypeDecl_0= ruleTypeDecl ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:118:28: (this_TypeDecl_0= ruleTypeDecl )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:120:5: this_TypeDecl_0= ruleTypeDecl
            {
             
                    newCompositeNode(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTypeDecl_in_ruleStatement222);
            this_TypeDecl_0=ruleTypeDecl();

            state._fsp--;

             
                    current = this_TypeDecl_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:136:1: entryRulePType returns [EObject current=null] : iv_rulePType= rulePType EOF ;
    public final EObject entryRulePType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePType = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:137:2: (iv_rulePType= rulePType EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:138:2: iv_rulePType= rulePType EOF
            {
             newCompositeNode(grammarAccess.getPTypeRule()); 
            pushFollow(FOLLOW_rulePType_in_entryRulePType256);
            iv_rulePType=rulePType();

            state._fsp--;

             current =iv_rulePType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePType266); 

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:145:1: rulePType returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) ;
    public final EObject rulePType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:148:28: ( ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:149:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:149:1: ( ( (lv_type_0_0= RULE_INTTYPE ) ) | ( (lv_type_1_0= RULE_STRTYPE ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INTTYPE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRTYPE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:149:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:149:2: ( (lv_type_0_0= RULE_INTTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:150:1: (lv_type_0_0= RULE_INTTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:150:1: (lv_type_0_0= RULE_INTTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:151:3: lv_type_0_0= RULE_INTTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rulePType308); 

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
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:168:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:168:6: ( (lv_type_1_0= RULE_STRTYPE ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:169:1: (lv_type_1_0= RULE_STRTYPE )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:169:1: (lv_type_1_0= RULE_STRTYPE )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:170:3: lv_type_1_0= RULE_STRTYPE
                    {
                    lv_type_1_0=(Token)match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rulePType336); 

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:194:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:195:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:196:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl377);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl387); 

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
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:203:1: ruleTypeDecl returns [EObject current=null] : ( ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) ) | ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) ) ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_typename_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_typename_7_0=null;
        Token otherlv_8=null;
        EObject lv_tpcode_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:206:28: ( ( ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) ) | ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:1: ( ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) ) | ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:1: ( ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) ) | ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==EOF||LA6_5==RULE_ID||(LA6_5>=13 && LA6_5<=15)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_5>=RULE_INTTYPE && LA6_5<=RULE_STRTYPE)||LA6_5==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==EOF||LA6_5==RULE_ID||(LA6_5>=13 && LA6_5<=15)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_5>=RULE_INTTYPE && LA6_5<=RULE_STRTYPE)||LA6_5==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==RULE_ID) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==EOF||LA6_5==RULE_ID||(LA6_5>=13 && LA6_5<=15)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_5>=RULE_INTTYPE && LA6_5<=RULE_STRTYPE)||LA6_5==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:2: ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:2: ( (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:3: (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' ) ( (lv_typename_3_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:3: (otherlv_0= 'type' | otherlv_1= 'Type' | otherlv_2= 'TYPE' )
                    int alt3=3;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt3=1;
                        }
                        break;
                    case 14:
                        {
                        alt3=2;
                        }
                        break;
                    case 15:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:207:5: otherlv_0= 'type'
                            {
                            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTypeDecl426); 

                                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:212:7: otherlv_1= 'Type'
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl444); 

                                	newLeafNode(otherlv_1, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:217:7: otherlv_2= 'TYPE'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl462); 

                                	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:221:2: ( (lv_typename_3_0= RULE_ID ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:222:1: (lv_typename_3_0= RULE_ID )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:222:1: (lv_typename_3_0= RULE_ID )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:223:3: lv_typename_3_0= RULE_ID
                    {
                    lv_typename_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl480); 

                    			newLeafNode(lv_typename_3_0, grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"typename",
                            		lv_typename_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:6: ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:6: ( (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:7: (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )? ( (lv_typename_7_0= RULE_ID ) ) (otherlv_8= '=' )? ( (lv_tpcode_9_0= ruletypeCode ) )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:7: (otherlv_4= 'type' | otherlv_5= 'Type' | otherlv_6= 'TYPE' )?
                    int alt4=4;
                    switch ( input.LA(1) ) {
                        case 13:
                            {
                            alt4=1;
                            }
                            break;
                        case 14:
                            {
                            alt4=2;
                            }
                            break;
                        case 15:
                            {
                            alt4=3;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:240:9: otherlv_4= 'type'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTypeDecl506); 

                                	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:245:7: otherlv_5= 'Type'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl524); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:250:7: otherlv_6= 'TYPE'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTypeDecl542); 

                                	newLeafNode(otherlv_6, grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:254:3: ( (lv_typename_7_0= RULE_ID ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:255:1: (lv_typename_7_0= RULE_ID )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:255:1: (lv_typename_7_0= RULE_ID )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:256:3: lv_typename_7_0= RULE_ID
                    {
                    lv_typename_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl561); 

                    			newLeafNode(lv_typename_7_0, grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"typename",
                            		lv_typename_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:272:2: (otherlv_8= '=' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:272:4: otherlv_8= '='
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTypeDecl579); 

                                	newLeafNode(otherlv_8, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:276:3: ( (lv_tpcode_9_0= ruletypeCode ) )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:277:1: (lv_tpcode_9_0= ruletypeCode )
                    {
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:277:1: (lv_tpcode_9_0= ruletypeCode )
                    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:278:3: lv_tpcode_9_0= ruletypeCode
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruletypeCode_in_ruleTypeDecl602);
                    lv_tpcode_9_0=ruletypeCode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"tpcode",
                            		lv_tpcode_9_0, 
                            		"typeCode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuletypeCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:302:1: entryRuletypeCode returns [EObject current=null] : iv_ruletypeCode= ruletypeCode EOF ;
    public final EObject entryRuletypeCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeCode = null;


        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:303:2: (iv_ruletypeCode= ruletypeCode EOF )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:304:2: iv_ruletypeCode= ruletypeCode EOF
            {
             newCompositeNode(grammarAccess.getTypeCodeRule()); 
            pushFollow(FOLLOW_ruletypeCode_in_entryRuletypeCode639);
            iv_ruletypeCode=ruletypeCode();

            state._fsp--;

             current =iv_ruletypeCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeCode649); 

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
    // $ANTLR end "entryRuletypeCode"


    // $ANTLR start "ruletypeCode"
    // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:311:1: ruletypeCode returns [EObject current=null] : ( (lv_prm_0_0= rulePType ) ) ;
    public final EObject ruletypeCode() throws RecognitionException {
        EObject current = null;

        EObject lv_prm_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:314:28: ( ( (lv_prm_0_0= rulePType ) ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:315:1: ( (lv_prm_0_0= rulePType ) )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:315:1: ( (lv_prm_0_0= rulePType ) )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:316:1: (lv_prm_0_0= rulePType )
            {
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:316:1: (lv_prm_0_0= rulePType )
            // ../org.xtext.example.gacl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalGACL.g:317:3: lv_prm_0_0= rulePType
            {
             
            	        newCompositeNode(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePType_in_ruletypeCode694);
            lv_prm_0_0=rulePType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeCodeRule());
            	        }
                   		set(
                   			current, 
                   			"prm",
                    		lv_prm_0_0, 
                    		"PType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruletypeCode"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram130 = new BitSet(new long[]{0x000000000000E042L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleStatement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rulePType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rulePType336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDecl426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl462 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDecl506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15_in_ruleTypeDecl542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl561 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_16_in_ruleTypeDecl579 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_ruletypeCode_in_ruleTypeDecl602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeCode_in_entryRuletypeCode639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeCode649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_ruletypeCode694 = new BitSet(new long[]{0x0000000000000002L});

}