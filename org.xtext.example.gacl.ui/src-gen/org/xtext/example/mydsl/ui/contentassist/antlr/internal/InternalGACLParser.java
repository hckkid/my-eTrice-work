package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.GACLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGACLParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g"; }


     
     	private GACLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GACLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDetailCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:60:1: entryRuleDetailCode : ruleDetailCode EOF ;
    public final void entryRuleDetailCode() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:61:1: ( ruleDetailCode EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:62:1: ruleDetailCode EOF
            {
             before(grammarAccess.getDetailCodeRule()); 
            pushFollow(FOLLOW_ruleDetailCode_in_entryRuleDetailCode61);
            ruleDetailCode();

            state._fsp--;

             after(grammarAccess.getDetailCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailCode68); 

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
    // $ANTLR end "entryRuleDetailCode"


    // $ANTLR start "ruleDetailCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:69:1: ruleDetailCode : ( ( rule__DetailCode__StmtsAssignment )* ) ;
    public final void ruleDetailCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:73:2: ( ( ( rule__DetailCode__StmtsAssignment )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:74:1: ( ( rule__DetailCode__StmtsAssignment )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:74:1: ( ( rule__DetailCode__StmtsAssignment )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:75:1: ( rule__DetailCode__StmtsAssignment )*
            {
             before(grammarAccess.getDetailCodeAccess().getStmtsAssignment()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:76:1: ( rule__DetailCode__StmtsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:76:2: rule__DetailCode__StmtsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DetailCode__StmtsAssignment_in_ruleDetailCode94);
            	    rule__DetailCode__StmtsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDetailCodeAccess().getStmtsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDetailCode"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:89:1: ( ruleStatement EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:104:1: ( rule__Statement__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement155);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:116:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:117:1: ( ruleVarDecl EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:118:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl182);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl189); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:125:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:129:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:130:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:130:1: ( ( rule__VarDecl__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:131:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:132:1: ( rule__VarDecl__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:132:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl215);
            rule__VarDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:144:1: entryRulePType : rulePType EOF ;
    public final void entryRulePType() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:145:1: ( rulePType EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:146:1: rulePType EOF
            {
             before(grammarAccess.getPTypeRule()); 
            pushFollow(FOLLOW_rulePType_in_entryRulePType242);
            rulePType();

            state._fsp--;

             after(grammarAccess.getPTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePType249); 

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
    // $ANTLR end "entryRulePType"


    // $ANTLR start "rulePType"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:153:1: rulePType : ( ( rule__PType__Alternatives ) ) ;
    public final void rulePType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:157:2: ( ( ( rule__PType__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:158:1: ( ( rule__PType__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:158:1: ( ( rule__PType__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:159:1: ( rule__PType__Alternatives )
            {
             before(grammarAccess.getPTypeAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:160:1: ( rule__PType__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:160:2: rule__PType__Alternatives
            {
            pushFollow(FOLLOW_rule__PType__Alternatives_in_rulePType275);
            rule__PType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePType"


    // $ANTLR start "entryRuleTypeDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:172:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:173:1: ( ruleTypeDecl EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:174:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl302);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl309); 

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:181:1: ruleTypeDecl : ( ( rule__TypeDecl__Group__0 ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:185:2: ( ( ( rule__TypeDecl__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeDecl__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeDecl__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:187:1: ( rule__TypeDecl__Group__0 )
            {
             before(grammarAccess.getTypeDeclAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:1: ( rule__TypeDecl__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:2: rule__TypeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl335);
            rule__TypeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleVarInst"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:200:1: entryRuleVarInst : ruleVarInst EOF ;
    public final void entryRuleVarInst() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:201:1: ( ruleVarInst EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:202:1: ruleVarInst EOF
            {
             before(grammarAccess.getVarInstRule()); 
            pushFollow(FOLLOW_ruleVarInst_in_entryRuleVarInst362);
            ruleVarInst();

            state._fsp--;

             after(grammarAccess.getVarInstRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInst369); 

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
    // $ANTLR end "entryRuleVarInst"


    // $ANTLR start "ruleVarInst"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:209:1: ruleVarInst : ( ( rule__VarInst__Group__0 ) ) ;
    public final void ruleVarInst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:213:2: ( ( ( rule__VarInst__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:214:1: ( ( rule__VarInst__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:214:1: ( ( rule__VarInst__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:215:1: ( rule__VarInst__Group__0 )
            {
             before(grammarAccess.getVarInstAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:216:1: ( rule__VarInst__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:216:2: rule__VarInst__Group__0
            {
            pushFollow(FOLLOW_rule__VarInst__Group__0_in_ruleVarInst395);
            rule__VarInst__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarInstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarInst"


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:228:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:229:1: ( ruleConcat EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:230:1: ruleConcat EOF
            {
             before(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat422);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getConcatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat429); 

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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:237:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:241:2: ( ( ( rule__Concat__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:242:1: ( ( rule__Concat__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:242:1: ( ( rule__Concat__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:243:1: ( rule__Concat__Group__0 )
            {
             before(grammarAccess.getConcatAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:244:1: ( rule__Concat__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:244:2: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_rule__Concat__Group__0_in_ruleConcat455);
            rule__Concat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:256:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:1: ( ruleStringLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:258:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral482);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral489); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:265:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:269:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:270:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:270:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:271:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:272:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:272:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral515);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:284:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:285:1: ( ruleSubtraction EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:286:1: ruleSubtraction EOF
            {
             before(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction542);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getSubtractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction549); 

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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:293:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:297:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:298:1: ( ( rule__Subtraction__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:298:1: ( ( rule__Subtraction__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:1: ( rule__Subtraction__Group__0 )
            {
             before(grammarAccess.getSubtractionAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:300:1: ( rule__Subtraction__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:300:2: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction575);
            rule__Subtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:312:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:313:1: ( ruleAddition EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:314:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition602);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition609); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:321:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:325:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:326:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:326:1: ( ( rule__Addition__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:328:1: ( rule__Addition__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:328:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition635);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:340:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:341:1: ( ruleMultiplication EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:342:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication662);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication669); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:349:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:353:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:354:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:354:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:355:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:356:1: ( rule__Multiplication__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:356:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication695);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:368:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:369:1: ( ruleDivision EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:370:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision722);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision729); 

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:377:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:381:2: ( ( ( rule__Division__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:382:1: ( ( rule__Division__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:382:1: ( ( rule__Division__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:383:1: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:384:1: ( rule__Division__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:384:2: rule__Division__Group__0
            {
            pushFollow(FOLLOW_rule__Division__Group__0_in_ruleDivision755);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePowerOf"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:396:1: entryRulePowerOf : rulePowerOf EOF ;
    public final void entryRulePowerOf() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:397:1: ( rulePowerOf EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:398:1: rulePowerOf EOF
            {
             before(grammarAccess.getPowerOfRule()); 
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf782);
            rulePowerOf();

            state._fsp--;

             after(grammarAccess.getPowerOfRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf789); 

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
    // $ANTLR end "entryRulePowerOf"


    // $ANTLR start "rulePowerOf"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:405:1: rulePowerOf : ( ( rule__PowerOf__Group__0 ) ) ;
    public final void rulePowerOf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:409:2: ( ( ( rule__PowerOf__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:410:1: ( ( rule__PowerOf__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:410:1: ( ( rule__PowerOf__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( rule__PowerOf__Group__0 )
            {
             before(grammarAccess.getPowerOfAccess().getGroup()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:412:1: ( rule__PowerOf__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:412:2: rule__PowerOf__Group__0
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf815);
            rule__PowerOf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerOfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePowerOf"


    // $ANTLR start "entryRuleBasicIntExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:424:1: entryRuleBasicIntExp : ruleBasicIntExp EOF ;
    public final void entryRuleBasicIntExp() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:425:1: ( ruleBasicIntExp EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:426:1: ruleBasicIntExp EOF
            {
             before(grammarAccess.getBasicIntExpRule()); 
            pushFollow(FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp842);
            ruleBasicIntExp();

            state._fsp--;

             after(grammarAccess.getBasicIntExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicIntExp849); 

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
    // $ANTLR end "entryRuleBasicIntExp"


    // $ANTLR start "ruleBasicIntExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:433:1: ruleBasicIntExp : ( ( rule__BasicIntExp__Alternatives ) ) ;
    public final void ruleBasicIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:437:2: ( ( ( rule__BasicIntExp__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:1: ( ( rule__BasicIntExp__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:1: ( ( rule__BasicIntExp__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( rule__BasicIntExp__Alternatives )
            {
             before(grammarAccess.getBasicIntExpAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:440:1: ( rule__BasicIntExp__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:440:2: rule__BasicIntExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Alternatives_in_ruleBasicIntExp875);
            rule__BasicIntExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicIntExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicIntExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:452:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:453:1: ( ruleIntLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:454:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral902);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral909); 

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:461:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:465:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:466:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:466:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:467:1: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:468:1: ( rule__IntLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:468:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral935);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:480:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TdAssignment_0 ) ) | ( ( rule__Statement__VdAssignment_1 ) ) | ( ( rule__Statement__VinAssignment_2 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:484:1: ( ( ( rule__Statement__TdAssignment_0 ) ) | ( ( rule__Statement__VdAssignment_1 ) ) | ( ( rule__Statement__VinAssignment_2 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:485:1: ( ( rule__Statement__TdAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:485:1: ( ( rule__Statement__TdAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:486:1: ( rule__Statement__TdAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTdAssignment_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:487:1: ( rule__Statement__TdAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:487:2: rule__Statement__TdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Statement__TdAssignment_0_in_rule__Statement__Alternatives971);
                    rule__Statement__TdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getTdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:491:6: ( ( rule__Statement__VdAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:491:6: ( ( rule__Statement__VdAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:492:1: ( rule__Statement__VdAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getVdAssignment_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:493:1: ( rule__Statement__VdAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:493:2: rule__Statement__VdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Statement__VdAssignment_1_in_rule__Statement__Alternatives989);
                    rule__Statement__VdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getVdAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:6: ( ( rule__Statement__VinAssignment_2 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:6: ( ( rule__Statement__VinAssignment_2 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:498:1: ( rule__Statement__VinAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getVinAssignment_2()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:499:1: ( rule__Statement__VinAssignment_2 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:499:2: rule__Statement__VinAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Statement__VinAssignment_2_in_rule__Statement__Alternatives1007);
                    rule__Statement__VinAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getVinAssignment_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__VarDecl__Alternatives_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:508:1: rule__VarDecl__Alternatives_3 : ( ( ( rule__VarDecl__PtAssignment_3_0 ) ) | ( ( rule__VarDecl__TdAssignment_3_1 ) ) );
    public final void rule__VarDecl__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:512:1: ( ( ( rule__VarDecl__PtAssignment_3_0 ) ) | ( ( rule__VarDecl__TdAssignment_3_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:513:1: ( ( rule__VarDecl__PtAssignment_3_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:513:1: ( ( rule__VarDecl__PtAssignment_3_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:514:1: ( rule__VarDecl__PtAssignment_3_0 )
                    {
                     before(grammarAccess.getVarDeclAccess().getPtAssignment_3_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:515:1: ( rule__VarDecl__PtAssignment_3_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:515:2: rule__VarDecl__PtAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__PtAssignment_3_0_in_rule__VarDecl__Alternatives_31040);
                    rule__VarDecl__PtAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclAccess().getPtAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:519:6: ( ( rule__VarDecl__TdAssignment_3_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:519:6: ( ( rule__VarDecl__TdAssignment_3_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:520:1: ( rule__VarDecl__TdAssignment_3_1 )
                    {
                     before(grammarAccess.getVarDeclAccess().getTdAssignment_3_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:521:1: ( rule__VarDecl__TdAssignment_3_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:521:2: rule__VarDecl__TdAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__VarDecl__TdAssignment_3_1_in_rule__VarDecl__Alternatives_31058);
                    rule__VarDecl__TdAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclAccess().getTdAssignment_3_1()); 

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
    // $ANTLR end "rule__VarDecl__Alternatives_3"


    // $ANTLR start "rule__PType__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:530:1: rule__PType__Alternatives : ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) );
    public final void rule__PType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:534:1: ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:535:1: ( ( rule__PType__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:535:1: ( ( rule__PType__TypeAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:536:1: ( rule__PType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:537:1: ( rule__PType__TypeAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:537:2: rule__PType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1091);
                    rule__PType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:541:6: ( ( rule__PType__TypeAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:541:6: ( ( rule__PType__TypeAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:542:1: ( rule__PType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:543:1: ( rule__PType__TypeAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:543:2: rule__PType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1109);
                    rule__PType__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__PType__Alternatives"


    // $ANTLR start "rule__VarInst__Alternatives_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:552:1: rule__VarInst__Alternatives_2 : ( ( ( rule__VarInst__StrexpAssignment_2_0 ) ) | ( ( rule__VarInst__InexpAssignment_2_1 ) ) );
    public final void rule__VarInst__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:556:1: ( ( ( rule__VarInst__StrexpAssignment_2_0 ) ) | ( ( rule__VarInst__InexpAssignment_2_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:557:1: ( ( rule__VarInst__StrexpAssignment_2_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:557:1: ( ( rule__VarInst__StrexpAssignment_2_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:558:1: ( rule__VarInst__StrexpAssignment_2_0 )
                    {
                     before(grammarAccess.getVarInstAccess().getStrexpAssignment_2_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:559:1: ( rule__VarInst__StrexpAssignment_2_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:559:2: rule__VarInst__StrexpAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__VarInst__StrexpAssignment_2_0_in_rule__VarInst__Alternatives_21142);
                    rule__VarInst__StrexpAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarInstAccess().getStrexpAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:563:6: ( ( rule__VarInst__InexpAssignment_2_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:563:6: ( ( rule__VarInst__InexpAssignment_2_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:564:1: ( rule__VarInst__InexpAssignment_2_1 )
                    {
                     before(grammarAccess.getVarInstAccess().getInexpAssignment_2_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:565:1: ( rule__VarInst__InexpAssignment_2_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:565:2: rule__VarInst__InexpAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__VarInst__InexpAssignment_2_1_in_rule__VarInst__Alternatives_21160);
                    rule__VarInst__InexpAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarInstAccess().getInexpAssignment_2_1()); 

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
    // $ANTLR end "rule__VarInst__Alternatives_2"


    // $ANTLR start "rule__BasicIntExp__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:574:1: rule__BasicIntExp__Alternatives : ( ( ruleIntLiteral ) | ( ( rule__BasicIntExp__Group_1__0 ) ) );
    public final void rule__BasicIntExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:578:1: ( ( ruleIntLiteral ) | ( ( rule__BasicIntExp__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ruleIntLiteral )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ruleIntLiteral )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:580:1: ruleIntLiteral
                    {
                     before(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__BasicIntExp__Alternatives1193);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:585:6: ( ( rule__BasicIntExp__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:585:6: ( ( rule__BasicIntExp__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:586:1: ( rule__BasicIntExp__Group_1__0 )
                    {
                     before(grammarAccess.getBasicIntExpAccess().getGroup_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:587:1: ( rule__BasicIntExp__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:587:2: rule__BasicIntExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicIntExp__Group_1__0_in_rule__BasicIntExp__Alternatives1210);
                    rule__BasicIntExp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicIntExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BasicIntExp__Alternatives"


    // $ANTLR start "rule__VarDecl__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:598:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:602:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:603:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01241);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01244);
            rule__VarDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__0"


    // $ANTLR start "rule__VarDecl__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:610:1: rule__VarDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:614:1: ( ( 'var' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:615:1: ( 'var' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:615:1: ( 'var' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:616:1: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__VarDecl__Group__0__Impl1272); 
             after(grammarAccess.getVarDeclAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__0__Impl"


    // $ANTLR start "rule__VarDecl__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:629:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:633:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:634:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11303);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11306);
            rule__VarDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__1"


    // $ANTLR start "rule__VarDecl__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:641:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__NameAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:645:1: ( ( ( rule__VarDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:646:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:646:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:647:1: ( rule__VarDecl__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:648:1: ( rule__VarDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:648:2: rule__VarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl1333);
            rule__VarDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:658:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:662:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:663:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__21363);
            rule__VarDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__21366);
            rule__VarDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__2"


    // $ANTLR start "rule__VarDecl__Group__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:670:1: rule__VarDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:674:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:675:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:675:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:676:1: ':'
            {
             before(grammarAccess.getVarDeclAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__VarDecl__Group__2__Impl1394); 
             after(grammarAccess.getVarDeclAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__2__Impl"


    // $ANTLR start "rule__VarDecl__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:689:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:693:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:694:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__31425);
            rule__VarDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__31428);
            rule__VarDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__3"


    // $ANTLR start "rule__VarDecl__Group__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:701:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__Alternatives_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:705:1: ( ( ( rule__VarDecl__Alternatives_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:706:1: ( ( rule__VarDecl__Alternatives_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:706:1: ( ( rule__VarDecl__Alternatives_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:707:1: ( rule__VarDecl__Alternatives_3 )
            {
             before(grammarAccess.getVarDeclAccess().getAlternatives_3()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:708:1: ( rule__VarDecl__Alternatives_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:708:2: rule__VarDecl__Alternatives_3
            {
            pushFollow(FOLLOW_rule__VarDecl__Alternatives_3_in_rule__VarDecl__Group__3__Impl1455);
            rule__VarDecl__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__3__Impl"


    // $ANTLR start "rule__VarDecl__Group__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:718:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:722:1: ( rule__VarDecl__Group__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:723:2: rule__VarDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__41485);
            rule__VarDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__4"


    // $ANTLR start "rule__VarDecl__Group__4__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:729:1: rule__VarDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:733:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:734:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:734:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:735:1: ';'
            {
             before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__VarDecl__Group__4__Impl1513); 
             after(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__4__Impl"


    // $ANTLR start "rule__TypeDecl__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:758:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:762:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:763:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__01554);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__01557);
            rule__TypeDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0"


    // $ANTLR start "rule__TypeDecl__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:770:1: rule__TypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:774:1: ( ( 'type' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:775:1: ( 'type' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:775:1: ( 'type' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:776:1: 'type'
            {
             before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group__0__Impl1585); 
             after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:789:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:793:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:794:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__11616);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__11619);
            rule__TypeDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1"


    // $ANTLR start "rule__TypeDecl__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:801:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__NameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:805:1: ( ( ( rule__TypeDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:806:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:806:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:807:1: ( rule__TypeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:808:1: ( rule__TypeDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:808:2: rule__TypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl1646);
            rule__TypeDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:818:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:822:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:823:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__21676);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__21679);
            rule__TypeDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2"


    // $ANTLR start "rule__TypeDecl__Group__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:830:1: rule__TypeDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:834:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:835:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:835:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:836:1: '='
            {
             before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__TypeDecl__Group__2__Impl1707); 
             after(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:849:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:853:1: ( rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:854:2: rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__31738);
            rule__TypeDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__31741);
            rule__TypeDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3"


    // $ANTLR start "rule__TypeDecl__Group__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:861:1: rule__TypeDecl__Group__3__Impl : ( ( rule__TypeDecl__TpAssignment_3 ) ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:865:1: ( ( ( rule__TypeDecl__TpAssignment_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:866:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:866:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:867:1: ( rule__TypeDecl__TpAssignment_3 )
            {
             before(grammarAccess.getTypeDeclAccess().getTpAssignment_3()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:868:1: ( rule__TypeDecl__TpAssignment_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:868:2: rule__TypeDecl__TpAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl1768);
            rule__TypeDecl__TpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3__Impl"


    // $ANTLR start "rule__TypeDecl__Group__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:878:1: rule__TypeDecl__Group__4 : rule__TypeDecl__Group__4__Impl ;
    public final void rule__TypeDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:882:1: ( rule__TypeDecl__Group__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:883:2: rule__TypeDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__41798);
            rule__TypeDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__4"


    // $ANTLR start "rule__TypeDecl__Group__4__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:889:1: rule__TypeDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__TypeDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:893:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:894:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:894:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:895:1: ';'
            {
             before(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__TypeDecl__Group__4__Impl1826); 
             after(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__4__Impl"


    // $ANTLR start "rule__VarInst__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:918:1: rule__VarInst__Group__0 : rule__VarInst__Group__0__Impl rule__VarInst__Group__1 ;
    public final void rule__VarInst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:922:1: ( rule__VarInst__Group__0__Impl rule__VarInst__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:923:2: rule__VarInst__Group__0__Impl rule__VarInst__Group__1
            {
            pushFollow(FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__01867);
            rule__VarInst__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__01870);
            rule__VarInst__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__0"


    // $ANTLR start "rule__VarInst__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:930:1: rule__VarInst__Group__0__Impl : ( ( rule__VarInst__NameAssignment_0 ) ) ;
    public final void rule__VarInst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:934:1: ( ( ( rule__VarInst__NameAssignment_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:935:1: ( ( rule__VarInst__NameAssignment_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:935:1: ( ( rule__VarInst__NameAssignment_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:936:1: ( rule__VarInst__NameAssignment_0 )
            {
             before(grammarAccess.getVarInstAccess().getNameAssignment_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:937:1: ( rule__VarInst__NameAssignment_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:937:2: rule__VarInst__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl1897);
            rule__VarInst__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarInstAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__0__Impl"


    // $ANTLR start "rule__VarInst__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:947:1: rule__VarInst__Group__1 : rule__VarInst__Group__1__Impl rule__VarInst__Group__2 ;
    public final void rule__VarInst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:951:1: ( rule__VarInst__Group__1__Impl rule__VarInst__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:952:2: rule__VarInst__Group__1__Impl rule__VarInst__Group__2
            {
            pushFollow(FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__11927);
            rule__VarInst__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__11930);
            rule__VarInst__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__1"


    // $ANTLR start "rule__VarInst__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:959:1: rule__VarInst__Group__1__Impl : ( '=' ) ;
    public final void rule__VarInst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:963:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:964:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:964:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:965:1: '='
            {
             before(grammarAccess.getVarInstAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__VarInst__Group__1__Impl1958); 
             after(grammarAccess.getVarInstAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__1__Impl"


    // $ANTLR start "rule__VarInst__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:978:1: rule__VarInst__Group__2 : rule__VarInst__Group__2__Impl ;
    public final void rule__VarInst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:982:1: ( rule__VarInst__Group__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:983:2: rule__VarInst__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__21989);
            rule__VarInst__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__2"


    // $ANTLR start "rule__VarInst__Group__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:989:1: rule__VarInst__Group__2__Impl : ( ( rule__VarInst__Alternatives_2 ) ) ;
    public final void rule__VarInst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:993:1: ( ( ( rule__VarInst__Alternatives_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:994:1: ( ( rule__VarInst__Alternatives_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:994:1: ( ( rule__VarInst__Alternatives_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:995:1: ( rule__VarInst__Alternatives_2 )
            {
             before(grammarAccess.getVarInstAccess().getAlternatives_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:996:1: ( rule__VarInst__Alternatives_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:996:2: rule__VarInst__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VarInst__Alternatives_2_in_rule__VarInst__Group__2__Impl2016);
            rule__VarInst__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVarInstAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__2__Impl"


    // $ANTLR start "rule__Concat__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1012:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1016:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1017:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02052);
            rule__Concat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02055);
            rule__Concat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group__0"


    // $ANTLR start "rule__Concat__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1024:1: rule__Concat__Group__0__Impl : ( ruleStringLiteral ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1028:1: ( ( ruleStringLiteral ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1029:1: ( ruleStringLiteral )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1029:1: ( ruleStringLiteral )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1030:1: ruleStringLiteral
            {
             before(grammarAccess.getConcatAccess().getStringLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Concat__Group__0__Impl2082);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getStringLiteralParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group__0__Impl"


    // $ANTLR start "rule__Concat__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1041:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1045:1: ( rule__Concat__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1046:2: rule__Concat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__12111);
            rule__Concat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group__1"


    // $ANTLR start "rule__Concat__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1052:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Group_1__0 )* ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1056:1: ( ( ( rule__Concat__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1057:1: ( ( rule__Concat__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1057:1: ( ( rule__Concat__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1058:1: ( rule__Concat__Group_1__0 )*
            {
             before(grammarAccess.getConcatAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1059:1: ( rule__Concat__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1059:2: rule__Concat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl2138);
            	    rule__Concat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConcatAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1073:1: rule__Concat__Group_1__0 : rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 ;
    public final void rule__Concat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1077:1: ( rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1078:2: rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__02173);
            rule__Concat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__02176);
            rule__Concat__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__0"


    // $ANTLR start "rule__Concat__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1085:1: rule__Concat__Group_1__0__Impl : ( () ) ;
    public final void rule__Concat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1089:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1090:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1090:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1091:1: ()
            {
             before(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1092:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1094:1: 
            {
            }

             after(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__0__Impl"


    // $ANTLR start "rule__Concat__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1104:1: rule__Concat__Group_1__1 : rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 ;
    public final void rule__Concat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1108:1: ( rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1109:2: rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__12234);
            rule__Concat__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__12237);
            rule__Concat__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__1"


    // $ANTLR start "rule__Concat__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1116:1: rule__Concat__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Concat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1120:1: ( ( '^' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1121:1: ( '^' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1121:1: ( '^' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1122:1: '^'
            {
             before(grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Concat__Group_1__1__Impl2265); 
             after(grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1135:1: rule__Concat__Group_1__2 : rule__Concat__Group_1__2__Impl ;
    public final void rule__Concat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1139:1: ( rule__Concat__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1140:2: rule__Concat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__22296);
            rule__Concat__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__2"


    // $ANTLR start "rule__Concat__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1146:1: rule__Concat__Group_1__2__Impl : ( ( rule__Concat__RightAssignment_1_2 ) ) ;
    public final void rule__Concat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1150:1: ( ( ( rule__Concat__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1151:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1151:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1152:1: ( rule__Concat__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1153:1: ( rule__Concat__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1153:2: rule__Concat__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl2323);
            rule__Concat__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1169:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1173:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1174:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__02359);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__02362);
            rule__Subtraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0"


    // $ANTLR start "rule__Subtraction__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1181:1: rule__Subtraction__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1185:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1186:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1186:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1187:1: ruleAddition
            {
             before(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl2389);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1198:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1202:1: ( rule__Subtraction__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1203:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__12418);
            rule__Subtraction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1"


    // $ANTLR start "rule__Subtraction__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1209:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__Group_1__0 )* ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1213:1: ( ( ( rule__Subtraction__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1214:1: ( ( rule__Subtraction__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1214:1: ( ( rule__Subtraction__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1215:1: ( rule__Subtraction__Group_1__0 )*
            {
             before(grammarAccess.getSubtractionAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1216:1: ( rule__Subtraction__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1216:2: rule__Subtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl2445);
            	    rule__Subtraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSubtractionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1230:1: rule__Subtraction__Group_1__0 : rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 ;
    public final void rule__Subtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1234:1: ( rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1235:2: rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__02480);
            rule__Subtraction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__02483);
            rule__Subtraction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__0"


    // $ANTLR start "rule__Subtraction__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1242:1: rule__Subtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1246:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1247:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1247:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1248:1: ()
            {
             before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1249:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1251:1: 
            {
            }

             after(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__0__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1261:1: rule__Subtraction__Group_1__1 : rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 ;
    public final void rule__Subtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1265:1: ( rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1266:2: rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__12541);
            rule__Subtraction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__12544);
            rule__Subtraction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__1"


    // $ANTLR start "rule__Subtraction__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1273:1: rule__Subtraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1277:1: ( ( '-' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1278:1: ( '-' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1278:1: ( '-' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1279:1: '-'
            {
             before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl2572); 
             after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1292:1: rule__Subtraction__Group_1__2 : rule__Subtraction__Group_1__2__Impl ;
    public final void rule__Subtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1296:1: ( rule__Subtraction__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1297:2: rule__Subtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__22603);
            rule__Subtraction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__2"


    // $ANTLR start "rule__Subtraction__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1303:1: rule__Subtraction__Group_1__2__Impl : ( ( rule__Subtraction__RightAssignment_1_2 ) ) ;
    public final void rule__Subtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1307:1: ( ( ( rule__Subtraction__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1308:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1308:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1309:1: ( rule__Subtraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1310:1: ( rule__Subtraction__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1310:2: rule__Subtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl2630);
            rule__Subtraction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1326:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1330:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1331:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__02666);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__02669);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1338:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1342:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1343:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1343:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1344:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl2696);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1355:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1359:1: ( rule__Addition__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1360:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__12725);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1366:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1370:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1371:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1371:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1372:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1373:1: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1373:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl2752);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1387:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1391:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1392:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__02787);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__02790);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1399:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1403:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1404:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1404:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1405:1: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1406:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1408:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1418:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1422:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1423:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__12848);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__12851);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1430:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1434:1: ( ( '+' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1435:1: ( '+' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1435:1: ( '+' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1436:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__Addition__Group_1__1__Impl2879); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1449:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1453:1: ( rule__Addition__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1454:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__22910);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1460:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1464:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1465:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1465:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1466:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1467:1: ( rule__Addition__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1467:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl2937);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1483:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1487:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1488:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02973);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02976);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1495:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1499:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1500:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1500:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1501:1: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3003);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1512:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1516:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1517:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13032);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1523:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1527:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1528:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1528:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1529:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1530:1: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1530:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3059);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1544:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1548:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1549:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03094);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03097);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1556:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1560:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1561:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1561:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1562:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1563:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1565:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1575:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1579:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1580:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13155);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13158);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1587:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1591:1: ( ( '*' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1592:1: ( '*' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1592:1: ( '*' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1593:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl3186); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1606:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1610:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1611:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23217);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1617:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1621:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1622:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1622:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1623:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1624:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1624:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3244);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1640:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1644:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1645:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__03280);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Division__Group__1_in_rule__Division__Group__03283);
            rule__Division__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1652:1: rule__Division__Group__0__Impl : ( rulePowerOf ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1656:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1657:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1657:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1658:1: rulePowerOf
            {
             before(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl3310);
            rulePowerOf();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1669:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1673:1: ( rule__Division__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1674:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__13339);
            rule__Division__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1680:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1684:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1685:1: ( ( rule__Division__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1685:1: ( ( rule__Division__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1686:1: ( rule__Division__Group_1__0 )*
            {
             before(grammarAccess.getDivisionAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1687:1: ( rule__Division__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1687:2: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl3366);
            	    rule__Division__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDivisionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1701:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1705:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1706:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__03401);
            rule__Division__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__03404);
            rule__Division__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__0"


    // $ANTLR start "rule__Division__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1713:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1717:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1718:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1718:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1719:1: ()
            {
             before(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1720:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1722:1: 
            {
            }

             after(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__0__Impl"


    // $ANTLR start "rule__Division__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1732:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1736:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1737:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
            {
            pushFollow(FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__13462);
            rule__Division__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__13465);
            rule__Division__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__1"


    // $ANTLR start "rule__Division__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1744:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1748:1: ( ( '/' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1749:1: ( '/' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1749:1: ( '/' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1750:1: '/'
            {
             before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Division__Group_1__1__Impl3493); 
             after(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__1__Impl"


    // $ANTLR start "rule__Division__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1763:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1767:1: ( rule__Division__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1768:2: rule__Division__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__23524);
            rule__Division__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__2"


    // $ANTLR start "rule__Division__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1774:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1778:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1779:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1779:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1780:1: ( rule__Division__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1781:1: ( rule__Division__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1781:2: rule__Division__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl3551);
            rule__Division__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__2__Impl"


    // $ANTLR start "rule__PowerOf__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1797:1: rule__PowerOf__Group__0 : rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 ;
    public final void rule__PowerOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1801:1: ( rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1802:2: rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__03587);
            rule__PowerOf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__03590);
            rule__PowerOf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group__0"


    // $ANTLR start "rule__PowerOf__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1809:1: rule__PowerOf__Group__0__Impl : ( ruleBasicIntExp ) ;
    public final void rule__PowerOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1813:1: ( ( ruleBasicIntExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1814:1: ( ruleBasicIntExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1814:1: ( ruleBasicIntExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1815:1: ruleBasicIntExp
            {
             before(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBasicIntExp_in_rule__PowerOf__Group__0__Impl3617);
            ruleBasicIntExp();

            state._fsp--;

             after(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group__0__Impl"


    // $ANTLR start "rule__PowerOf__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1826:1: rule__PowerOf__Group__1 : rule__PowerOf__Group__1__Impl ;
    public final void rule__PowerOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1830:1: ( rule__PowerOf__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1831:2: rule__PowerOf__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__13646);
            rule__PowerOf__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group__1"


    // $ANTLR start "rule__PowerOf__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1837:1: rule__PowerOf__Group__1__Impl : ( ( rule__PowerOf__Group_1__0 )* ) ;
    public final void rule__PowerOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1841:1: ( ( ( rule__PowerOf__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1842:1: ( ( rule__PowerOf__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1842:1: ( ( rule__PowerOf__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1843:1: ( rule__PowerOf__Group_1__0 )*
            {
             before(grammarAccess.getPowerOfAccess().getGroup_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1844:1: ( rule__PowerOf__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1844:2: rule__PowerOf__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl3673);
            	    rule__PowerOf__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPowerOfAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group__1__Impl"


    // $ANTLR start "rule__PowerOf__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1858:1: rule__PowerOf__Group_1__0 : rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 ;
    public final void rule__PowerOf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1862:1: ( rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1863:2: rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__03708);
            rule__PowerOf__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__03711);
            rule__PowerOf__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__0"


    // $ANTLR start "rule__PowerOf__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1870:1: rule__PowerOf__Group_1__0__Impl : ( () ) ;
    public final void rule__PowerOf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1874:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1875:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1875:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1876:1: ()
            {
             before(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1877:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1879:1: 
            {
            }

             after(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__0__Impl"


    // $ANTLR start "rule__PowerOf__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1889:1: rule__PowerOf__Group_1__1 : rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 ;
    public final void rule__PowerOf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1893:1: ( rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1894:2: rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__13769);
            rule__PowerOf__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__13772);
            rule__PowerOf__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__1"


    // $ANTLR start "rule__PowerOf__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1901:1: rule__PowerOf__Group_1__1__Impl : ( '**' ) ;
    public final void rule__PowerOf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1905:1: ( ( '**' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1906:1: ( '**' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1906:1: ( '**' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1907:1: '**'
            {
             before(grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,23,FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl3800); 
             after(grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__1__Impl"


    // $ANTLR start "rule__PowerOf__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1920:1: rule__PowerOf__Group_1__2 : rule__PowerOf__Group_1__2__Impl ;
    public final void rule__PowerOf__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1924:1: ( rule__PowerOf__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1925:2: rule__PowerOf__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__23831);
            rule__PowerOf__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__2"


    // $ANTLR start "rule__PowerOf__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1931:1: rule__PowerOf__Group_1__2__Impl : ( ( rule__PowerOf__RightAssignment_1_2 ) ) ;
    public final void rule__PowerOf__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1935:1: ( ( ( rule__PowerOf__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1936:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1936:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1937:1: ( rule__PowerOf__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowerOfAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1938:1: ( rule__PowerOf__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1938:2: rule__PowerOf__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl3858);
            rule__PowerOf__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowerOfAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__Group_1__2__Impl"


    // $ANTLR start "rule__BasicIntExp__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1954:1: rule__BasicIntExp__Group_1__0 : rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1 ;
    public final void rule__BasicIntExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1958:1: ( rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1959:2: rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__0__Impl_in_rule__BasicIntExp__Group_1__03894);
            rule__BasicIntExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__1_in_rule__BasicIntExp__Group_1__03897);
            rule__BasicIntExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__0"


    // $ANTLR start "rule__BasicIntExp__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1966:1: rule__BasicIntExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BasicIntExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1970:1: ( ( '(' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1971:1: ( '(' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1971:1: ( '(' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1972:1: '('
            {
             before(grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__BasicIntExp__Group_1__0__Impl3925); 
             after(grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__0__Impl"


    // $ANTLR start "rule__BasicIntExp__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1985:1: rule__BasicIntExp__Group_1__1 : rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2 ;
    public final void rule__BasicIntExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1989:1: ( rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1990:2: rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__1__Impl_in_rule__BasicIntExp__Group_1__13956);
            rule__BasicIntExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__2_in_rule__BasicIntExp__Group_1__13959);
            rule__BasicIntExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__1"


    // $ANTLR start "rule__BasicIntExp__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1997:1: rule__BasicIntExp__Group_1__1__Impl : ( ruleSubtraction ) ;
    public final void rule__BasicIntExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2001:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2002:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2002:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2003:1: ruleSubtraction
            {
             before(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSubtraction_in_rule__BasicIntExp__Group_1__1__Impl3986);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__1__Impl"


    // $ANTLR start "rule__BasicIntExp__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2014:1: rule__BasicIntExp__Group_1__2 : rule__BasicIntExp__Group_1__2__Impl ;
    public final void rule__BasicIntExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2018:1: ( rule__BasicIntExp__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2019:2: rule__BasicIntExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__2__Impl_in_rule__BasicIntExp__Group_1__24015);
            rule__BasicIntExp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__2"


    // $ANTLR start "rule__BasicIntExp__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2025:1: rule__BasicIntExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BasicIntExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2029:1: ( ( ')' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2030:1: ( ')' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2030:1: ( ')' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2031:1: ')'
            {
             before(grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__BasicIntExp__Group_1__2__Impl4043); 
             after(grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicIntExp__Group_1__2__Impl"


    // $ANTLR start "rule__DetailCode__StmtsAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2051:1: rule__DetailCode__StmtsAssignment : ( ruleStatement ) ;
    public final void rule__DetailCode__StmtsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2055:1: ( ( ruleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2056:1: ( ruleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2056:1: ( ruleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2057:1: ruleStatement
            {
             before(grammarAccess.getDetailCodeAccess().getStmtsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__DetailCode__StmtsAssignment4085);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDetailCodeAccess().getStmtsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DetailCode__StmtsAssignment"


    // $ANTLR start "rule__Statement__TdAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2066:1: rule__Statement__TdAssignment_0 : ( ruleTypeDecl ) ;
    public final void rule__Statement__TdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2070:1: ( ( ruleTypeDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2071:1: ( ruleTypeDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2071:1: ( ruleTypeDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2072:1: ruleTypeDecl
            {
             before(grammarAccess.getStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__Statement__TdAssignment_04116);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TdAssignment_0"


    // $ANTLR start "rule__Statement__VdAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2081:1: rule__Statement__VdAssignment_1 : ( ruleVarDecl ) ;
    public final void rule__Statement__VdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2085:1: ( ( ruleVarDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2086:1: ( ruleVarDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2086:1: ( ruleVarDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2087:1: ruleVarDecl
            {
             before(grammarAccess.getStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Statement__VdAssignment_14147);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getVdVarDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VdAssignment_1"


    // $ANTLR start "rule__Statement__VinAssignment_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2096:1: rule__Statement__VinAssignment_2 : ( ruleVarInst ) ;
    public final void rule__Statement__VinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2100:1: ( ( ruleVarInst ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2101:1: ( ruleVarInst )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2101:1: ( ruleVarInst )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2102:1: ruleVarInst
            {
             before(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_24178);
            ruleVarInst();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VinAssignment_2"


    // $ANTLR start "rule__VarDecl__NameAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2111:1: rule__VarDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2115:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2116:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2116:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2117:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_14209); 
             after(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__NameAssignment_1"


    // $ANTLR start "rule__VarDecl__PtAssignment_3_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2126:1: rule__VarDecl__PtAssignment_3_0 : ( rulePType ) ;
    public final void rule__VarDecl__PtAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2130:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2131:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2131:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2132:1: rulePType
            {
             before(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_3_04240);
            rulePType();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__PtAssignment_3_0"


    // $ANTLR start "rule__VarDecl__TdAssignment_3_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2141:1: rule__VarDecl__TdAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__TdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2145:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2146:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2146:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2147:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2148:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2149:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_3_14275); 
             after(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__TdAssignment_3_1"


    // $ANTLR start "rule__PType__TypeAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2160:1: rule__PType__TypeAssignment_0 : ( RULE_INTTYPE ) ;
    public final void rule__PType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2164:1: ( ( RULE_INTTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2165:1: ( RULE_INTTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2165:1: ( RULE_INTTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2166:1: RULE_INTTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
            match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_04310); 
             after(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PType__TypeAssignment_0"


    // $ANTLR start "rule__PType__TypeAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2175:1: rule__PType__TypeAssignment_1 : ( RULE_STRTYPE ) ;
    public final void rule__PType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2179:1: ( ( RULE_STRTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2180:1: ( RULE_STRTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2180:1: ( RULE_STRTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2181:1: RULE_STRTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
            match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_14341); 
             after(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PType__TypeAssignment_1"


    // $ANTLR start "rule__TypeDecl__NameAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2190:1: rule__TypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2194:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2195:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2195:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2196:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_14372); 
             after(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__NameAssignment_1"


    // $ANTLR start "rule__TypeDecl__TpAssignment_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2205:1: rule__TypeDecl__TpAssignment_3 : ( rulePType ) ;
    public final void rule__TypeDecl__TpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2209:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2210:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2210:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2211:1: rulePType
            {
             before(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_34403);
            rulePType();

            state._fsp--;

             after(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TpAssignment_3"


    // $ANTLR start "rule__VarInst__NameAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2220:1: rule__VarInst__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarInst__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2224:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2225:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2225:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2226:1: ( RULE_ID )
            {
             before(grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2227:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2228:1: RULE_ID
            {
             before(grammarAccess.getVarInstAccess().getNameVarDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_04438); 
             after(grammarAccess.getVarInstAccess().getNameVarDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__NameAssignment_0"


    // $ANTLR start "rule__VarInst__StrexpAssignment_2_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2239:1: rule__VarInst__StrexpAssignment_2_0 : ( ruleConcat ) ;
    public final void rule__VarInst__StrexpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2243:1: ( ( ruleConcat ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2244:1: ( ruleConcat )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2244:1: ( ruleConcat )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2245:1: ruleConcat
            {
             before(grammarAccess.getVarInstAccess().getStrexpConcatParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleConcat_in_rule__VarInst__StrexpAssignment_2_04473);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getVarInstAccess().getStrexpConcatParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__StrexpAssignment_2_0"


    // $ANTLR start "rule__VarInst__InexpAssignment_2_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2254:1: rule__VarInst__InexpAssignment_2_1 : ( ruleSubtraction ) ;
    public final void rule__VarInst__InexpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2258:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2259:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2259:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2260:1: ruleSubtraction
            {
             before(grammarAccess.getVarInstAccess().getInexpSubtractionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSubtraction_in_rule__VarInst__InexpAssignment_2_14504);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getVarInstAccess().getInexpSubtractionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__InexpAssignment_2_1"


    // $ANTLR start "rule__Concat__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2269:1: rule__Concat__RightAssignment_1_2 : ( ruleStringLiteral ) ;
    public final void rule__Concat__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2273:1: ( ( ruleStringLiteral ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2274:1: ( ruleStringLiteral )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2274:1: ( ruleStringLiteral )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2275:1: ruleStringLiteral
            {
             before(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_24535);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__RightAssignment_1_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2284:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2288:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2289:1: ( RULE_STRING )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2289:1: ( RULE_STRING )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2290:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment4566); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__Subtraction__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2299:1: rule__Subtraction__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Subtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2303:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2304:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2304:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2305:1: ruleAddition
            {
             before(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_24597);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2314:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2318:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2319:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2319:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2320:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_24628);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2329:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2333:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2334:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2334:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2335:1: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_24659);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Division__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2344:1: rule__Division__RightAssignment_1_2 : ( rulePowerOf ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2348:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2349:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2349:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2350:1: rulePowerOf
            {
             before(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_24690);
            rulePowerOf();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__RightAssignment_1_2"


    // $ANTLR start "rule__PowerOf__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2359:1: rule__PowerOf__RightAssignment_1_2 : ( ruleBasicIntExp ) ;
    public final void rule__PowerOf__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2363:1: ( ( ruleBasicIntExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2364:1: ( ruleBasicIntExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2364:1: ( ruleBasicIntExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2365:1: ruleBasicIntExp
            {
             before(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBasicIntExp_in_rule__PowerOf__RightAssignment_1_24721);
            ruleBasicIntExp();

            state._fsp--;

             after(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOf__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2374:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2378:1: ( ( RULE_INT ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2379:1: ( RULE_INT )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2379:1: ( RULE_INT )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2380:1: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment4752); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDetailCode_in_entryRuleDetailCode61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailCode68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailCode__StmtsAssignment_in_ruleDetailCode94 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__Alternatives_in_rulePType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_entryRuleVarInst362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInst369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__0_in_ruleVarInst395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0_in_ruleConcat455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0_in_ruleDivision755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicIntExp849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Alternatives_in_ruleBasicIntExp875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TdAssignment_0_in_rule__Statement__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VdAssignment_1_in_rule__Statement__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VinAssignment_2_in_rule__Statement__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__PtAssignment_3_0_in_rule__VarDecl__Alternatives_31040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TdAssignment_3_1_in_rule__VarDecl__Alternatives_31058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__StrexpAssignment_2_0_in_rule__VarInst__Alternatives_21142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__InexpAssignment_2_1_in_rule__VarInst__Alternatives_21160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__BasicIntExp__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__0_in_rule__BasicIntExp__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarDecl__Group__0__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__21363 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__21366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarDecl__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__31425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__31428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Alternatives_3_in_rule__VarDecl__Group__3__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__41485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarDecl__Group__4__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__01554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__01557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group__0__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__11616 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__21676 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__21679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group__2__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__31738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__31741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__41798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Group__4__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__01867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__01870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__11927 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__11930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarInst__Group__1__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__21989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Alternatives_2_in_rule__VarInst__Group__2__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02052 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Concat__Group__0__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl2138 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__02173 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__12234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Concat__Group_1__1__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__22296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__02359 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl2445 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__02480 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__02483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__12541 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__22603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__02666 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__02669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__12725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl2752 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__02787 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__12848 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__Group_1__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__22910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02973 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3059 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13155 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__03280 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group__1_in_rule__Division__Group__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl3366 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__03401 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__13462 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Division__Group_1__1__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__23524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__03587 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__03590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rule__PowerOf__Group__0__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__13646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl3673 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__03708 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__03711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__13769 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__13772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__23831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__0__Impl_in_rule__BasicIntExp__Group_1__03894 = new BitSet(new long[]{0x0000000001000180L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__1_in_rule__BasicIntExp__Group_1__03897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BasicIntExp__Group_1__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__1__Impl_in_rule__BasicIntExp__Group_1__13956 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__2_in_rule__BasicIntExp__Group_1__13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__BasicIntExp__Group_1__1__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__2__Impl_in_rule__BasicIntExp__Group_1__24015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BasicIntExp__Group_1__2__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__DetailCode__StmtsAssignment4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Statement__TdAssignment_04116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Statement__VdAssignment_14147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_24178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_14209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_3_04240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_3_14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_04310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_14341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_14372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_34403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_04438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_rule__VarInst__StrexpAssignment_2_04473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__VarInst__InexpAssignment_2_14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_24535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_24597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_24628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_24659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_24690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rule__PowerOf__RightAssignment_1_24721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment4752 = new BitSet(new long[]{0x0000000000000002L});

}