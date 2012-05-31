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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGACLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "';'", "':'", "'type'", "'='", "'^'", "'-'", "'+'", "'*'", "'/'", "'**'", "'('", "')'", "'for'", "'{'", "'}'", "'if'", "'else'"
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




    // $ANTLR start "entryRuleCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:61:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:62:1: ( ruleCode EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:63:1: ruleCode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeRule()); 
            }
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode67);
            ruleCode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:70:1: ruleCode : ( ( rule__Code__Group__0 ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:74:2: ( ( ( rule__Code__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:75:1: ( ( rule__Code__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:75:1: ( ( rule__Code__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:76:1: ( rule__Code__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:77:1: ( rule__Code__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:77:2: rule__Code__Group__0
            {
            pushFollow(FOLLOW_rule__Code__Group__0_in_ruleCode100);
            rule__Code__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeAccess().getGroup()); 
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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleSingleStatement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:89:1: entryRuleSingleStatement : ruleSingleStatement EOF ;
    public final void entryRuleSingleStatement() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:90:1: ( ruleSingleStatement EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:91:1: ruleSingleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement127);
            ruleSingleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:98:1: ruleSingleStatement : ( ( rule__SingleStatement__Alternatives ) ) ;
    public final void ruleSingleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:102:2: ( ( ( rule__SingleStatement__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:103:1: ( ( rule__SingleStatement__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:103:1: ( ( rule__SingleStatement__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:104:1: ( rule__SingleStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:105:1: ( rule__SingleStatement__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:105:2: rule__SingleStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__SingleStatement__Alternatives_in_ruleSingleStatement160);
            rule__SingleStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:117:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:118:1: ( ruleStatement EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:119:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement187);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement194); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:126:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:130:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:131:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:131:1: ( ( rule__Statement__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:132:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:133:1: ( rule__Statement__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:133:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement220);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:145:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:146:1: ( ruleVarDecl EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:147:1: ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl247);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl254); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:154:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:158:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:159:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:159:1: ( ( rule__VarDecl__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:160:1: ( rule__VarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:161:1: ( rule__VarDecl__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:161:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl280);
            rule__VarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:173:1: entryRulePType : rulePType EOF ;
    public final void entryRulePType() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:174:1: ( rulePType EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:175:1: rulePType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeRule()); 
            }
            pushFollow(FOLLOW_rulePType_in_entryRulePType307);
            rulePType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePType314); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:182:1: rulePType : ( ( rule__PType__Alternatives ) ) ;
    public final void rulePType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:2: ( ( ( rule__PType__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:187:1: ( ( rule__PType__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:187:1: ( ( rule__PType__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:1: ( rule__PType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:189:1: ( rule__PType__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:189:2: rule__PType__Alternatives
            {
            pushFollow(FOLLOW_rule__PType__Alternatives_in_rulePType340);
            rule__PType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPTypeAccess().getAlternatives()); 
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
    // $ANTLR end "rulePType"


    // $ANTLR start "entryRuleTypeDecl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:201:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:202:1: ( ruleTypeDecl EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:203:1: ruleTypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl367);
            ruleTypeDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl374); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:210:1: ruleTypeDecl : ( ( rule__TypeDecl__Group__0 ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:214:2: ( ( ( rule__TypeDecl__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:215:1: ( ( rule__TypeDecl__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:215:1: ( ( rule__TypeDecl__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:216:1: ( rule__TypeDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:217:1: ( rule__TypeDecl__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:217:2: rule__TypeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl400);
            rule__TypeDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleVarInst"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:229:1: entryRuleVarInst : ruleVarInst EOF ;
    public final void entryRuleVarInst() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:230:1: ( ruleVarInst EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:231:1: ruleVarInst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstRule()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_entryRuleVarInst427);
            ruleVarInst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInst434); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:238:1: ruleVarInst : ( ( rule__VarInst__Group__0 ) ) ;
    public final void ruleVarInst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:242:2: ( ( ( rule__VarInst__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:243:1: ( ( rule__VarInst__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:243:1: ( ( rule__VarInst__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:244:1: ( rule__VarInst__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:245:1: ( rule__VarInst__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:245:2: rule__VarInst__Group__0
            {
            pushFollow(FOLLOW_rule__VarInst__Group__0_in_ruleVarInst460);
            rule__VarInst__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getGroup()); 
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
    // $ANTLR end "ruleVarInst"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:258:1: ( ruleExpression EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:259:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression487);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:266:1: ruleExpression : ( ruleConcat ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:270:2: ( ( ruleConcat ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:271:1: ( ruleConcat )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:271:1: ( ruleConcat )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:272:1: ruleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getConcatParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_ruleExpression520);
            ruleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getConcatParserRuleCall()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:285:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:286:1: ( ruleConcat EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:287:1: ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat546);
            ruleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat553); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:294:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:298:2: ( ( ( rule__Concat__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:1: ( ( rule__Concat__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:1: ( ( rule__Concat__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:300:1: ( rule__Concat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:301:1: ( rule__Concat__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:301:2: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_rule__Concat__Group__0_in_ruleConcat579);
            rule__Concat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getGroup()); 
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:313:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:314:1: ( ruleSubtraction EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:315:1: ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction606);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction613); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:322:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:326:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:1: ( ( rule__Subtraction__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:1: ( ( rule__Subtraction__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:328:1: ( rule__Subtraction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:329:1: ( rule__Subtraction__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:329:2: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction639);
            rule__Subtraction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getGroup()); 
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:341:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:342:1: ( ruleAddition EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:343:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition666);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition673); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:350:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:354:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:355:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:355:1: ( ( rule__Addition__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:356:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:357:1: ( rule__Addition__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:357:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition699);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:369:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:370:1: ( ruleMultiplication EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:371:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication726);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication733); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:378:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:382:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:384:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:385:1: ( rule__Multiplication__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:385:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication759);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:397:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:398:1: ( ruleDivision EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:399:1: ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision786);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision793); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:406:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:410:2: ( ( ( rule__Division__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( ( rule__Division__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( ( rule__Division__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:412:1: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:413:1: ( rule__Division__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:413:2: rule__Division__Group__0
            {
            pushFollow(FOLLOW_rule__Division__Group__0_in_ruleDivision819);
            rule__Division__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getGroup()); 
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePowerOf"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:425:1: entryRulePowerOf : rulePowerOf EOF ;
    public final void entryRulePowerOf() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:426:1: ( rulePowerOf EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:427:1: rulePowerOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfRule()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf846);
            rulePowerOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf853); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:434:1: rulePowerOf : ( ( rule__PowerOf__Group__0 ) ) ;
    public final void rulePowerOf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:2: ( ( ( rule__PowerOf__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( ( rule__PowerOf__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( ( rule__PowerOf__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:440:1: ( rule__PowerOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:441:1: ( rule__PowerOf__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:441:2: rule__PowerOf__Group__0
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf879);
            rule__PowerOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getGroup()); 
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
    // $ANTLR end "rulePowerOf"


    // $ANTLR start "entryRuleBasicExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:453:1: entryRuleBasicExp : ruleBasicExp EOF ;
    public final void entryRuleBasicExp() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:454:1: ( ruleBasicExp EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:455:1: ruleBasicExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicExp_in_entryRuleBasicExp906);
            ruleBasicExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicExp913); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicExp"


    // $ANTLR start "ruleBasicExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:462:1: ruleBasicExp : ( ( rule__BasicExp__Alternatives ) ) ;
    public final void ruleBasicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:466:2: ( ( ( rule__BasicExp__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:467:1: ( ( rule__BasicExp__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:467:1: ( ( rule__BasicExp__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:468:1: ( rule__BasicExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExpAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:1: ( rule__BasicExp__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:2: rule__BasicExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicExp__Alternatives_in_ruleBasicExp939);
            rule__BasicExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBasicExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:481:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:482:1: ( ruleIntLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:483:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral966);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral973); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:490:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:494:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:495:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:495:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:496:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:1: ( rule__IntLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral999);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:509:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:510:1: ( ruleStringLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:511:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1026);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1033); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:518:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:522:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:523:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:523:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:524:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:525:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:525:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1059);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleVarExps"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:537:1: entryRuleVarExps : ruleVarExps EOF ;
    public final void entryRuleVarExps() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:538:1: ( ruleVarExps EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:539:1: ruleVarExps EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsRule()); 
            }
            pushFollow(FOLLOW_ruleVarExps_in_entryRuleVarExps1086);
            ruleVarExps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExps1093); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarExps"


    // $ANTLR start "ruleVarExps"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:546:1: ruleVarExps : ( ( rule__VarExps__VrnmAssignment ) ) ;
    public final void ruleVarExps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:550:2: ( ( ( rule__VarExps__VrnmAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( ( rule__VarExps__VrnmAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( ( rule__VarExps__VrnmAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:552:1: ( rule__VarExps__VrnmAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVrnmAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:553:1: ( rule__VarExps__VrnmAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:553:2: rule__VarExps__VrnmAssignment
            {
            pushFollow(FOLLOW_rule__VarExps__VrnmAssignment_in_ruleVarExps1119);
            rule__VarExps__VrnmAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVrnmAssignment()); 
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
    // $ANTLR end "ruleVarExps"


    // $ANTLR start "entryRuleforlp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:565:1: entryRuleforlp : ruleforlp EOF ;
    public final void entryRuleforlp() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:566:1: ( ruleforlp EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:567:1: ruleforlp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpRule()); 
            }
            pushFollow(FOLLOW_ruleforlp_in_entryRuleforlp1146);
            ruleforlp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleforlp1153); if (state.failed) return ;

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
    // $ANTLR end "entryRuleforlp"


    // $ANTLR start "ruleforlp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:574:1: ruleforlp : ( ( rule__Forlp__Group__0 ) ) ;
    public final void ruleforlp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:578:2: ( ( ( rule__Forlp__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ( rule__Forlp__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ( rule__Forlp__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:580:1: ( rule__Forlp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:1: ( rule__Forlp__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:2: rule__Forlp__Group__0
            {
            pushFollow(FOLLOW_rule__Forlp__Group__0_in_ruleforlp1179);
            rule__Forlp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getGroup()); 
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
    // $ANTLR end "ruleforlp"


    // $ANTLR start "entryRuleifte"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:593:1: entryRuleifte : ruleifte EOF ;
    public final void entryRuleifte() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:594:1: ( ruleifte EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:595:1: ruleifte EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteRule()); 
            }
            pushFollow(FOLLOW_ruleifte_in_entryRuleifte1206);
            ruleifte();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleifte1213); if (state.failed) return ;

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
    // $ANTLR end "entryRuleifte"


    // $ANTLR start "ruleifte"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:602:1: ruleifte : ( ( rule__Ifte__Group__0 ) ) ;
    public final void ruleifte() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:606:2: ( ( ( rule__Ifte__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:607:1: ( ( rule__Ifte__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:607:1: ( ( rule__Ifte__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:608:1: ( rule__Ifte__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:609:1: ( rule__Ifte__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:609:2: rule__Ifte__Group__0
            {
            pushFollow(FOLLOW_rule__Ifte__Group__0_in_ruleifte1239);
            rule__Ifte__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getGroup()); 
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
    // $ANTLR end "ruleifte"


    // $ANTLR start "rule__Code__DeclsAlternatives_0_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:621:1: rule__Code__DeclsAlternatives_0_0 : ( ( ruleTypeDecl ) | ( ruleVarDecl ) );
    public final void rule__Code__DeclsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:625:1: ( ( ruleTypeDecl ) | ( ruleVarDecl ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:626:1: ( ruleTypeDecl )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:626:1: ( ruleTypeDecl )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:627:1: ruleTypeDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeAccess().getDeclsTypeDeclParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleTypeDecl_in_rule__Code__DeclsAlternatives_0_01275);
                    ruleTypeDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeAccess().getDeclsTypeDeclParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:632:6: ( ruleVarDecl )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:632:6: ( ruleVarDecl )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:633:1: ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeAccess().getDeclsVarDeclParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarDecl_in_rule__Code__DeclsAlternatives_0_01292);
                    ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeAccess().getDeclsVarDeclParserRuleCall_0_0_1()); 
                    }

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
    // $ANTLR end "rule__Code__DeclsAlternatives_0_0"


    // $ANTLR start "rule__SingleStatement__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:643:1: rule__SingleStatement__Alternatives : ( ( ( rule__SingleStatement__TdAssignment_0 ) ) | ( ( rule__SingleStatement__VdAssignment_1 ) ) | ( ( rule__SingleStatement__VinAssignment_2 ) ) | ( ( rule__SingleStatement__IfstAssignment_3 ) ) | ( ( rule__SingleStatement__FlAssignment_4 ) ) );
    public final void rule__SingleStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:647:1: ( ( ( rule__SingleStatement__TdAssignment_0 ) ) | ( ( rule__SingleStatement__VdAssignment_1 ) ) | ( ( rule__SingleStatement__VinAssignment_2 ) ) | ( ( rule__SingleStatement__IfstAssignment_3 ) ) | ( ( rule__SingleStatement__FlAssignment_4 ) ) )
            int alt2=5;
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
            case 29:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:648:1: ( ( rule__SingleStatement__TdAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:648:1: ( ( rule__SingleStatement__TdAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:649:1: ( rule__SingleStatement__TdAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleStatementAccess().getTdAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:650:1: ( rule__SingleStatement__TdAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:650:2: rule__SingleStatement__TdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SingleStatement__TdAssignment_0_in_rule__SingleStatement__Alternatives1324);
                    rule__SingleStatement__TdAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleStatementAccess().getTdAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:654:6: ( ( rule__SingleStatement__VdAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:654:6: ( ( rule__SingleStatement__VdAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:655:1: ( rule__SingleStatement__VdAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleStatementAccess().getVdAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:656:1: ( rule__SingleStatement__VdAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:656:2: rule__SingleStatement__VdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SingleStatement__VdAssignment_1_in_rule__SingleStatement__Alternatives1342);
                    rule__SingleStatement__VdAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleStatementAccess().getVdAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:660:6: ( ( rule__SingleStatement__VinAssignment_2 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:660:6: ( ( rule__SingleStatement__VinAssignment_2 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:661:1: ( rule__SingleStatement__VinAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleStatementAccess().getVinAssignment_2()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:662:1: ( rule__SingleStatement__VinAssignment_2 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:662:2: rule__SingleStatement__VinAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SingleStatement__VinAssignment_2_in_rule__SingleStatement__Alternatives1360);
                    rule__SingleStatement__VinAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleStatementAccess().getVinAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:666:6: ( ( rule__SingleStatement__IfstAssignment_3 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:666:6: ( ( rule__SingleStatement__IfstAssignment_3 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:667:1: ( rule__SingleStatement__IfstAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleStatementAccess().getIfstAssignment_3()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:668:1: ( rule__SingleStatement__IfstAssignment_3 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:668:2: rule__SingleStatement__IfstAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SingleStatement__IfstAssignment_3_in_rule__SingleStatement__Alternatives1378);
                    rule__SingleStatement__IfstAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleStatementAccess().getIfstAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:672:6: ( ( rule__SingleStatement__FlAssignment_4 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:672:6: ( ( rule__SingleStatement__FlAssignment_4 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:673:1: ( rule__SingleStatement__FlAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleStatementAccess().getFlAssignment_4()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:674:1: ( rule__SingleStatement__FlAssignment_4 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:674:2: rule__SingleStatement__FlAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SingleStatement__FlAssignment_4_in_rule__SingleStatement__Alternatives1396);
                    rule__SingleStatement__FlAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleStatementAccess().getFlAssignment_4()); 
                    }

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
    // $ANTLR end "rule__SingleStatement__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:683:1: rule__Statement__Alternatives : ( ( ( rule__Statement__VinAssignment_0 ) ) | ( ( rule__Statement__IfstAssignment_1 ) ) | ( ( rule__Statement__FlAssignment_2 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:687:1: ( ( ( rule__Statement__VinAssignment_0 ) ) | ( ( rule__Statement__IfstAssignment_1 ) ) | ( ( rule__Statement__FlAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:688:1: ( ( rule__Statement__VinAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:688:1: ( ( rule__Statement__VinAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:689:1: ( rule__Statement__VinAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVinAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:690:1: ( rule__Statement__VinAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:690:2: rule__Statement__VinAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Statement__VinAssignment_0_in_rule__Statement__Alternatives1429);
                    rule__Statement__VinAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVinAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:694:6: ( ( rule__Statement__IfstAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:694:6: ( ( rule__Statement__IfstAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:695:1: ( rule__Statement__IfstAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfstAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:696:1: ( rule__Statement__IfstAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:696:2: rule__Statement__IfstAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Statement__IfstAssignment_1_in_rule__Statement__Alternatives1447);
                    rule__Statement__IfstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfstAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:700:6: ( ( rule__Statement__FlAssignment_2 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:700:6: ( ( rule__Statement__FlAssignment_2 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:701:1: ( rule__Statement__FlAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getFlAssignment_2()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:702:1: ( rule__Statement__FlAssignment_2 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:702:2: rule__Statement__FlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Statement__FlAssignment_2_in_rule__Statement__Alternatives1465);
                    rule__Statement__FlAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getFlAssignment_2()); 
                    }

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


    // $ANTLR start "rule__VarDecl__Alternatives_2_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:711:1: rule__VarDecl__Alternatives_2_1 : ( ( ( rule__VarDecl__PtAssignment_2_1_0 ) ) | ( ( rule__VarDecl__TdAssignment_2_1_1 ) ) );
    public final void rule__VarDecl__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:715:1: ( ( ( rule__VarDecl__PtAssignment_2_1_0 ) ) | ( ( rule__VarDecl__TdAssignment_2_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INTTYPE && LA4_0<=RULE_STRTYPE)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:716:1: ( ( rule__VarDecl__PtAssignment_2_1_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:716:1: ( ( rule__VarDecl__PtAssignment_2_1_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:717:1: ( rule__VarDecl__PtAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getPtAssignment_2_1_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:718:1: ( rule__VarDecl__PtAssignment_2_1_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:718:2: rule__VarDecl__PtAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__PtAssignment_2_1_0_in_rule__VarDecl__Alternatives_2_11498);
                    rule__VarDecl__PtAssignment_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getPtAssignment_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:722:6: ( ( rule__VarDecl__TdAssignment_2_1_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:722:6: ( ( rule__VarDecl__TdAssignment_2_1_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:723:1: ( rule__VarDecl__TdAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getTdAssignment_2_1_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:724:1: ( rule__VarDecl__TdAssignment_2_1_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:724:2: rule__VarDecl__TdAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_rule__VarDecl__TdAssignment_2_1_1_in_rule__VarDecl__Alternatives_2_11516);
                    rule__VarDecl__TdAssignment_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getTdAssignment_2_1_1()); 
                    }

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
    // $ANTLR end "rule__VarDecl__Alternatives_2_1"


    // $ANTLR start "rule__PType__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:733:1: rule__PType__Alternatives : ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) );
    public final void rule__PType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:737:1: ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INTTYPE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRTYPE) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:738:1: ( ( rule__PType__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:738:1: ( ( rule__PType__TypeAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:739:1: ( rule__PType__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:740:1: ( rule__PType__TypeAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:740:2: rule__PType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1549);
                    rule__PType__TypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:744:6: ( ( rule__PType__TypeAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:744:6: ( ( rule__PType__TypeAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:745:1: ( rule__PType__TypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:746:1: ( rule__PType__TypeAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:746:2: rule__PType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1567);
                    rule__PType__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    }

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


    // $ANTLR start "rule__BasicExp__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:755:1: rule__BasicExp__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleVarExps ) | ( ( rule__BasicExp__Group_3__0 ) ) );
    public final void rule__BasicExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:759:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleVarExps ) | ( ( rule__BasicExp__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:760:1: ( ruleStringLiteral )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:760:1: ( ruleStringLiteral )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:761:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicExpAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__BasicExp__Alternatives1600);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicExpAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:766:6: ( ruleIntLiteral )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:766:6: ( ruleIntLiteral )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:767:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicExpAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__BasicExp__Alternatives1617);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicExpAccess().getIntLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:772:6: ( ruleVarExps )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:772:6: ( ruleVarExps )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:773:1: ruleVarExps
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicExpAccess().getVarExpsParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVarExps_in_rule__BasicExp__Alternatives1634);
                    ruleVarExps();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicExpAccess().getVarExpsParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:778:6: ( ( rule__BasicExp__Group_3__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:778:6: ( ( rule__BasicExp__Group_3__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:779:1: ( rule__BasicExp__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicExpAccess().getGroup_3()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:780:1: ( rule__BasicExp__Group_3__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:780:2: rule__BasicExp__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BasicExp__Group_3__0_in_rule__BasicExp__Alternatives1651);
                    rule__BasicExp__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicExpAccess().getGroup_3()); 
                    }

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
    // $ANTLR end "rule__BasicExp__Alternatives"


    // $ANTLR start "rule__Forlp__Alternatives_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:789:1: rule__Forlp__Alternatives_2 : ( ( ( rule__Forlp__StmtsAssignment_2_0 ) ) | ( ( rule__Forlp__Group_2_1__0 ) ) );
    public final void rule__Forlp__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:793:1: ( ( ( rule__Forlp__StmtsAssignment_2_0 ) ) | ( ( rule__Forlp__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==13||LA7_0==16||LA7_0==26||LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:794:1: ( ( rule__Forlp__StmtsAssignment_2_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:794:1: ( ( rule__Forlp__StmtsAssignment_2_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:795:1: ( rule__Forlp__StmtsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForlpAccess().getStmtsAssignment_2_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:796:1: ( rule__Forlp__StmtsAssignment_2_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:796:2: rule__Forlp__StmtsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Forlp__StmtsAssignment_2_0_in_rule__Forlp__Alternatives_21684);
                    rule__Forlp__StmtsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForlpAccess().getStmtsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:800:6: ( ( rule__Forlp__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:800:6: ( ( rule__Forlp__Group_2_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:801:1: ( rule__Forlp__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForlpAccess().getGroup_2_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:802:1: ( rule__Forlp__Group_2_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:802:2: rule__Forlp__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Forlp__Group_2_1__0_in_rule__Forlp__Alternatives_21702);
                    rule__Forlp__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForlpAccess().getGroup_2_1()); 
                    }

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
    // $ANTLR end "rule__Forlp__Alternatives_2"


    // $ANTLR start "rule__Ifte__Alternatives_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:811:1: rule__Ifte__Alternatives_2 : ( ( ( rule__Ifte__StmtsAssignment_2_0 ) ) | ( ( rule__Ifte__Group_2_1__0 ) ) );
    public final void rule__Ifte__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:815:1: ( ( ( rule__Ifte__StmtsAssignment_2_0 ) ) | ( ( rule__Ifte__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==13||LA8_0==16||LA8_0==26||LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:816:1: ( ( rule__Ifte__StmtsAssignment_2_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:816:1: ( ( rule__Ifte__StmtsAssignment_2_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:817:1: ( rule__Ifte__StmtsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getStmtsAssignment_2_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:818:1: ( rule__Ifte__StmtsAssignment_2_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:818:2: rule__Ifte__StmtsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Ifte__StmtsAssignment_2_0_in_rule__Ifte__Alternatives_21735);
                    rule__Ifte__StmtsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfteAccess().getStmtsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:822:6: ( ( rule__Ifte__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:822:6: ( ( rule__Ifte__Group_2_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:823:1: ( rule__Ifte__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getGroup_2_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:824:1: ( rule__Ifte__Group_2_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:824:2: rule__Ifte__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_2_1__0_in_rule__Ifte__Alternatives_21753);
                    rule__Ifte__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfteAccess().getGroup_2_1()); 
                    }

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
    // $ANTLR end "rule__Ifte__Alternatives_2"


    // $ANTLR start "rule__Ifte__Alternatives_3_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:833:1: rule__Ifte__Alternatives_3_1 : ( ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) ) | ( ( rule__Ifte__Group_3_1_1__0 ) ) );
    public final void rule__Ifte__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:837:1: ( ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) ) | ( ( rule__Ifte__Group_3_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==13||LA9_0==16||LA9_0==26||LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:838:1: ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:838:1: ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:839:1: ( rule__Ifte__EstmtsAssignment_3_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:840:1: ( rule__Ifte__EstmtsAssignment_3_1_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:840:2: rule__Ifte__EstmtsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__Ifte__EstmtsAssignment_3_1_0_in_rule__Ifte__Alternatives_3_11786);
                    rule__Ifte__EstmtsAssignment_3_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:844:6: ( ( rule__Ifte__Group_3_1_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:844:6: ( ( rule__Ifte__Group_3_1_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:845:1: ( rule__Ifte__Group_3_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getGroup_3_1_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:846:1: ( rule__Ifte__Group_3_1_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:846:2: rule__Ifte__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__0_in_rule__Ifte__Alternatives_3_11804);
                    rule__Ifte__Group_3_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfteAccess().getGroup_3_1_1()); 
                    }

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
    // $ANTLR end "rule__Ifte__Alternatives_3_1"


    // $ANTLR start "rule__Code__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:857:1: rule__Code__Group__0 : rule__Code__Group__0__Impl rule__Code__Group__1 ;
    public final void rule__Code__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:861:1: ( rule__Code__Group__0__Impl rule__Code__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:862:2: rule__Code__Group__0__Impl rule__Code__Group__1
            {
            pushFollow(FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01835);
            rule__Code__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01838);
            rule__Code__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group__0"


    // $ANTLR start "rule__Code__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:869:1: rule__Code__Group__0__Impl : ( ( rule__Code__DeclsAssignment_0 )* ) ;
    public final void rule__Code__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:873:1: ( ( ( rule__Code__DeclsAssignment_0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:874:1: ( ( rule__Code__DeclsAssignment_0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:874:1: ( ( rule__Code__DeclsAssignment_0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:875:1: ( rule__Code__DeclsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getDeclsAssignment_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:876:1: ( rule__Code__DeclsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13||LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:876:2: rule__Code__DeclsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Code__DeclsAssignment_0_in_rule__Code__Group__0__Impl1865);
            	    rule__Code__DeclsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeAccess().getDeclsAssignment_0()); 
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
    // $ANTLR end "rule__Code__Group__0__Impl"


    // $ANTLR start "rule__Code__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:886:1: rule__Code__Group__1 : rule__Code__Group__1__Impl ;
    public final void rule__Code__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:890:1: ( rule__Code__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:891:2: rule__Code__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11896);
            rule__Code__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group__1"


    // $ANTLR start "rule__Code__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:897:1: rule__Code__Group__1__Impl : ( ( rule__Code__StmtsAssignment_1 )* ) ;
    public final void rule__Code__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:901:1: ( ( ( rule__Code__StmtsAssignment_1 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:902:1: ( ( rule__Code__StmtsAssignment_1 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:902:1: ( ( rule__Code__StmtsAssignment_1 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:903:1: ( rule__Code__StmtsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getStmtsAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:904:1: ( rule__Code__StmtsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==26||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:904:2: rule__Code__StmtsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Code__StmtsAssignment_1_in_rule__Code__Group__1__Impl1923);
            	    rule__Code__StmtsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeAccess().getStmtsAssignment_1()); 
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
    // $ANTLR end "rule__Code__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:918:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:922:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:923:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01958);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01961);
            rule__VarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:930:1: rule__VarDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:934:1: ( ( 'var' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:935:1: ( 'var' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:935:1: ( 'var' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:936:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getVarKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__VarDecl__Group__0__Impl1989); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__VarDecl__Group__0__Impl"


    // $ANTLR start "rule__VarDecl__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:949:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:953:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:954:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12020);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12023);
            rule__VarDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:961:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__NameAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:965:1: ( ( ( rule__VarDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:966:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:966:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:967:1: ( rule__VarDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:968:1: ( rule__VarDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:968:2: rule__VarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl2050);
            rule__VarDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VarDecl__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:978:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:982:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:983:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22080);
            rule__VarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22083);
            rule__VarDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:990:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__Group_2__0 )? ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:994:1: ( ( ( rule__VarDecl__Group_2__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:995:1: ( ( rule__VarDecl__Group_2__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:995:1: ( ( rule__VarDecl__Group_2__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:996:1: ( rule__VarDecl__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getGroup_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:997:1: ( rule__VarDecl__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:997:2: rule__VarDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2110);
                    rule__VarDecl__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getGroup_2()); 
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
    // $ANTLR end "rule__VarDecl__Group__2__Impl"


    // $ANTLR start "rule__VarDecl__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1007:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1011:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1012:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32141);
            rule__VarDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32144);
            rule__VarDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1019:1: rule__VarDecl__Group__3__Impl : ( () ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1023:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1024:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1024:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1025:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getVarDeclTypeAction_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1026:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1028:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getVarDeclTypeAction_3()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__3__Impl"


    // $ANTLR start "rule__VarDecl__Group__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1038:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1042:1: ( rule__VarDecl__Group__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1043:2: rule__VarDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42202);
            rule__VarDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1049:1: rule__VarDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1053:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1054:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1054:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1055:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 
            }
            match(input,14,FOLLOW_14_in_rule__VarDecl__Group__4__Impl2230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__VarDecl__Group__4__Impl"


    // $ANTLR start "rule__VarDecl__Group_2__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1078:1: rule__VarDecl__Group_2__0 : rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 ;
    public final void rule__VarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1082:1: ( rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1083:2: rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02271);
            rule__VarDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02274);
            rule__VarDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_2__0"


    // $ANTLR start "rule__VarDecl__Group_2__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1090:1: rule__VarDecl__Group_2__0__Impl : ( ':' ) ;
    public final void rule__VarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1094:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1095:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1095:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1096:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getColonKeyword_2_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__VarDecl__Group_2__0__Impl2302); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getColonKeyword_2_0()); 
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
    // $ANTLR end "rule__VarDecl__Group_2__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_2__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1109:1: rule__VarDecl__Group_2__1 : rule__VarDecl__Group_2__1__Impl ;
    public final void rule__VarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1113:1: ( rule__VarDecl__Group_2__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1114:2: rule__VarDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__12333);
            rule__VarDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_2__1"


    // $ANTLR start "rule__VarDecl__Group_2__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1120:1: rule__VarDecl__Group_2__1__Impl : ( ( rule__VarDecl__Alternatives_2_1 ) ) ;
    public final void rule__VarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1124:1: ( ( ( rule__VarDecl__Alternatives_2_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1125:1: ( ( rule__VarDecl__Alternatives_2_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1125:1: ( ( rule__VarDecl__Alternatives_2_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1126:1: ( rule__VarDecl__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getAlternatives_2_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1127:1: ( rule__VarDecl__Alternatives_2_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1127:2: rule__VarDecl__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__VarDecl__Alternatives_2_1_in_rule__VarDecl__Group_2__1__Impl2360);
            rule__VarDecl__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getAlternatives_2_1()); 
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
    // $ANTLR end "rule__VarDecl__Group_2__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1141:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1145:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1146:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02394);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02397);
            rule__TypeDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1153:1: rule__TypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1157:1: ( ( 'type' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1158:1: ( 'type' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1158:1: ( 'type' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1159:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group__0__Impl2425); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
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
    // $ANTLR end "rule__TypeDecl__Group__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1172:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1176:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1177:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12456);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12459);
            rule__TypeDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1184:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__NameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1188:1: ( ( ( rule__TypeDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1189:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1189:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1190:1: ( rule__TypeDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1191:1: ( rule__TypeDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1191:2: rule__TypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2486);
            rule__TypeDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TypeDecl__Group__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1201:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1205:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1206:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22516);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22519);
            rule__TypeDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1213:1: rule__TypeDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1217:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1218:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1218:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1219:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__TypeDecl__Group__2__Impl2547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__TypeDecl__Group__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1232:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1236:1: ( rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1237:2: rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32578);
            rule__TypeDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32581);
            rule__TypeDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1244:1: rule__TypeDecl__Group__3__Impl : ( ( rule__TypeDecl__TpAssignment_3 ) ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1248:1: ( ( ( rule__TypeDecl__TpAssignment_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1249:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1249:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1250:1: ( rule__TypeDecl__TpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTpAssignment_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1251:1: ( rule__TypeDecl__TpAssignment_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1251:2: rule__TypeDecl__TpAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl2608);
            rule__TypeDecl__TpAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getTpAssignment_3()); 
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
    // $ANTLR end "rule__TypeDecl__Group__3__Impl"


    // $ANTLR start "rule__TypeDecl__Group__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1261:1: rule__TypeDecl__Group__4 : rule__TypeDecl__Group__4__Impl ;
    public final void rule__TypeDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1265:1: ( rule__TypeDecl__Group__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1266:2: rule__TypeDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42638);
            rule__TypeDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1272:1: rule__TypeDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__TypeDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1276:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1277:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1277:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1278:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4()); 
            }
            match(input,14,FOLLOW_14_in_rule__TypeDecl__Group__4__Impl2666); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__TypeDecl__Group__4__Impl"


    // $ANTLR start "rule__VarInst__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1301:1: rule__VarInst__Group__0 : rule__VarInst__Group__0__Impl rule__VarInst__Group__1 ;
    public final void rule__VarInst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1305:1: ( rule__VarInst__Group__0__Impl rule__VarInst__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1306:2: rule__VarInst__Group__0__Impl rule__VarInst__Group__1
            {
            pushFollow(FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__02707);
            rule__VarInst__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__02710);
            rule__VarInst__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1313:1: rule__VarInst__Group__0__Impl : ( ( rule__VarInst__NameAssignment_0 ) ) ;
    public final void rule__VarInst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1317:1: ( ( ( rule__VarInst__NameAssignment_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1318:1: ( ( rule__VarInst__NameAssignment_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1318:1: ( ( rule__VarInst__NameAssignment_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1319:1: ( rule__VarInst__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1320:1: ( rule__VarInst__NameAssignment_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1320:2: rule__VarInst__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl2737);
            rule__VarInst__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__VarInst__Group__0__Impl"


    // $ANTLR start "rule__VarInst__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1330:1: rule__VarInst__Group__1 : rule__VarInst__Group__1__Impl rule__VarInst__Group__2 ;
    public final void rule__VarInst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1334:1: ( rule__VarInst__Group__1__Impl rule__VarInst__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1335:2: rule__VarInst__Group__1__Impl rule__VarInst__Group__2
            {
            pushFollow(FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__12767);
            rule__VarInst__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__12770);
            rule__VarInst__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1342:1: rule__VarInst__Group__1__Impl : ( '=' ) ;
    public final void rule__VarInst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1346:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1347:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1347:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1348:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getEqualsSignKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__VarInst__Group__1__Impl2798); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__VarInst__Group__1__Impl"


    // $ANTLR start "rule__VarInst__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1361:1: rule__VarInst__Group__2 : rule__VarInst__Group__2__Impl rule__VarInst__Group__3 ;
    public final void rule__VarInst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1365:1: ( rule__VarInst__Group__2__Impl rule__VarInst__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1366:2: rule__VarInst__Group__2__Impl rule__VarInst__Group__3
            {
            pushFollow(FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__22829);
            rule__VarInst__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__3_in_rule__VarInst__Group__22832);
            rule__VarInst__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1373:1: rule__VarInst__Group__2__Impl : ( ( rule__VarInst__ExpAssignment_2 ) ) ;
    public final void rule__VarInst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1377:1: ( ( ( rule__VarInst__ExpAssignment_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1378:1: ( ( rule__VarInst__ExpAssignment_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1378:1: ( ( rule__VarInst__ExpAssignment_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1379:1: ( rule__VarInst__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getExpAssignment_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1380:1: ( rule__VarInst__ExpAssignment_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1380:2: rule__VarInst__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__VarInst__ExpAssignment_2_in_rule__VarInst__Group__2__Impl2859);
            rule__VarInst__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getExpAssignment_2()); 
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
    // $ANTLR end "rule__VarInst__Group__2__Impl"


    // $ANTLR start "rule__VarInst__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1390:1: rule__VarInst__Group__3 : rule__VarInst__Group__3__Impl ;
    public final void rule__VarInst__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1394:1: ( rule__VarInst__Group__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1395:2: rule__VarInst__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInst__Group__3__Impl_in_rule__VarInst__Group__32889);
            rule__VarInst__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInst__Group__3"


    // $ANTLR start "rule__VarInst__Group__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1401:1: rule__VarInst__Group__3__Impl : ( ';' ) ;
    public final void rule__VarInst__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1405:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1406:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1406:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1407:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getSemicolonKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__VarInst__Group__3__Impl2917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__VarInst__Group__3__Impl"


    // $ANTLR start "rule__Concat__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1428:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1432:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1433:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02956);
            rule__Concat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02959);
            rule__Concat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1440:1: rule__Concat__Group__0__Impl : ( ruleSubtraction ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1444:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1445:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1445:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1446:1: ruleSubtraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getSubtractionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_rule__Concat__Group__0__Impl2986);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getSubtractionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Concat__Group__0__Impl"


    // $ANTLR start "rule__Concat__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1457:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1461:1: ( rule__Concat__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1462:2: rule__Concat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__13015);
            rule__Concat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1468:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Group_1__0 )* ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1472:1: ( ( ( rule__Concat__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1473:1: ( ( rule__Concat__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1473:1: ( ( rule__Concat__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1474:1: ( rule__Concat__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1475:1: ( rule__Concat__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1475:2: rule__Concat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl3042);
            	    rule__Concat__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Concat__Group__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1489:1: rule__Concat__Group_1__0 : rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 ;
    public final void rule__Concat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1493:1: ( rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1494:2: rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__03077);
            rule__Concat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__03080);
            rule__Concat__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1501:1: rule__Concat__Group_1__0__Impl : ( () ) ;
    public final void rule__Concat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1505:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1506:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1506:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1507:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1508:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1510:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1520:1: rule__Concat__Group_1__1 : rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 ;
    public final void rule__Concat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1524:1: ( rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1525:2: rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__13138);
            rule__Concat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__13141);
            rule__Concat__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1532:1: rule__Concat__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Concat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1536:1: ( ( '^' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1537:1: ( '^' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1537:1: ( '^' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1538:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Concat__Group_1__1__Impl3169); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1()); 
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
    // $ANTLR end "rule__Concat__Group_1__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1551:1: rule__Concat__Group_1__2 : rule__Concat__Group_1__2__Impl ;
    public final void rule__Concat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1555:1: ( rule__Concat__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1556:2: rule__Concat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__23200);
            rule__Concat__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1562:1: rule__Concat__Group_1__2__Impl : ( ( rule__Concat__RightAssignment_1_2 ) ) ;
    public final void rule__Concat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1566:1: ( ( ( rule__Concat__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1567:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1567:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1568:1: ( rule__Concat__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1569:1: ( rule__Concat__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1569:2: rule__Concat__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl3227);
            rule__Concat__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Concat__Group_1__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1585:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1589:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1590:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__03263);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__03266);
            rule__Subtraction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1597:1: rule__Subtraction__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1601:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1602:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1602:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1603:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl3293);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1614:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1618:1: ( rule__Subtraction__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1619:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__13322);
            rule__Subtraction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1625:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__Group_1__0 )* ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1629:1: ( ( ( rule__Subtraction__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1630:1: ( ( rule__Subtraction__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1630:1: ( ( rule__Subtraction__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1631:1: ( rule__Subtraction__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1632:1: ( rule__Subtraction__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1632:2: rule__Subtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl3349);
            	    rule__Subtraction__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1646:1: rule__Subtraction__Group_1__0 : rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 ;
    public final void rule__Subtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1650:1: ( rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1651:2: rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__03384);
            rule__Subtraction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__03387);
            rule__Subtraction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1658:1: rule__Subtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1662:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1663:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1663:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1664:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1665:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1667:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1677:1: rule__Subtraction__Group_1__1 : rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 ;
    public final void rule__Subtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1681:1: ( rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1682:2: rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__13445);
            rule__Subtraction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__13448);
            rule__Subtraction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1689:1: rule__Subtraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1693:1: ( ( '-' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1694:1: ( '-' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1694:1: ( '-' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1695:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl3476); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
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
    // $ANTLR end "rule__Subtraction__Group_1__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1708:1: rule__Subtraction__Group_1__2 : rule__Subtraction__Group_1__2__Impl ;
    public final void rule__Subtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1712:1: ( rule__Subtraction__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1713:2: rule__Subtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__23507);
            rule__Subtraction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1719:1: rule__Subtraction__Group_1__2__Impl : ( ( rule__Subtraction__RightAssignment_1_2 ) ) ;
    public final void rule__Subtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1723:1: ( ( ( rule__Subtraction__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1724:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1724:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1725:1: ( rule__Subtraction__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1726:1: ( rule__Subtraction__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1726:2: rule__Subtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl3534);
            rule__Subtraction__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Subtraction__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1742:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1746:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1747:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03570);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03573);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1754:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1758:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1759:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1759:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1760:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3600);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1771:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1775:1: ( rule__Addition__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1776:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13629);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1782:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1786:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1787:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1787:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1788:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1789:1: ( rule__Addition__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1789:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3656);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1803:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1807:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1808:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03691);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03694);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1815:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1819:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1820:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1820:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1821:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1822:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1824:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1834:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1838:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1839:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13752);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13755);
            rule__Addition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1846:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1850:1: ( ( '+' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1851:1: ( '+' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1851:1: ( '+' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1852:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Addition__Group_1__1__Impl3783); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1865:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1869:1: ( rule__Addition__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1870:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23814);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1876:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1880:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1881:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1881:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1882:1: ( rule__Addition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1883:1: ( rule__Addition__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1883:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3841);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1899:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1903:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1904:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03877);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03880);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1911:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1915:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1916:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1916:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1917:1: ruleDivision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3907);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1928:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1932:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1933:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13936);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1939:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1943:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1944:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1944:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1945:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1946:1: ( rule__Multiplication__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1946:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3963);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1960:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1964:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1965:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03998);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__04001);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1972:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1976:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1977:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1977:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1978:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1979:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1981:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1991:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1995:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1996:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__14059);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__14062);
            rule__Multiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2003:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2007:1: ( ( '*' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2008:1: ( '*' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2008:1: ( '*' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2009:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl4090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2022:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2026:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2027:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__24121);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2033:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2037:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2038:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2038:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2039:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2040:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2040:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl4148);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2056:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2060:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2061:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__04184);
            rule__Division__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group__1_in_rule__Division__Group__04187);
            rule__Division__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2068:1: rule__Division__Group__0__Impl : ( rulePowerOf ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2072:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2073:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2073:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2074:1: rulePowerOf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl4214);
            rulePowerOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
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
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2085:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2089:1: ( rule__Division__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2090:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__14243);
            rule__Division__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2096:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2100:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2101:1: ( ( rule__Division__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2101:1: ( ( rule__Division__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2102:1: ( rule__Division__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2103:1: ( rule__Division__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2103:2: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl4270);
            	    rule__Division__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2117:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2121:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2122:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__04305);
            rule__Division__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__04308);
            rule__Division__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2129:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2133:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2134:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2134:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2135:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2136:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2138:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2148:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2152:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2153:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
            {
            pushFollow(FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__14366);
            rule__Division__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__14369);
            rule__Division__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2160:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2164:1: ( ( '/' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2165:1: ( '/' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2165:1: ( '/' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2166:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Division__Group_1__1__Impl4397); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
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
    // $ANTLR end "rule__Division__Group_1__1__Impl"


    // $ANTLR start "rule__Division__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2179:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2183:1: ( rule__Division__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2184:2: rule__Division__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__24428);
            rule__Division__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2190:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2194:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2195:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2195:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2196:1: ( rule__Division__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2197:1: ( rule__Division__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2197:2: rule__Division__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl4455);
            rule__Division__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Division__Group_1__2__Impl"


    // $ANTLR start "rule__PowerOf__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2213:1: rule__PowerOf__Group__0 : rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 ;
    public final void rule__PowerOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2217:1: ( rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2218:2: rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__04491);
            rule__PowerOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__04494);
            rule__PowerOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2225:1: rule__PowerOf__Group__0__Impl : ( ruleBasicExp ) ;
    public final void rule__PowerOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2229:1: ( ( ruleBasicExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2230:1: ( ruleBasicExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2230:1: ( ruleBasicExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2231:1: ruleBasicExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getBasicExpParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicExp_in_rule__PowerOf__Group__0__Impl4521);
            ruleBasicExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getBasicExpParserRuleCall_0()); 
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
    // $ANTLR end "rule__PowerOf__Group__0__Impl"


    // $ANTLR start "rule__PowerOf__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2242:1: rule__PowerOf__Group__1 : rule__PowerOf__Group__1__Impl ;
    public final void rule__PowerOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2246:1: ( rule__PowerOf__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2247:2: rule__PowerOf__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__14550);
            rule__PowerOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2253:1: rule__PowerOf__Group__1__Impl : ( ( rule__PowerOf__Group_1__0 )* ) ;
    public final void rule__PowerOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2257:1: ( ( ( rule__PowerOf__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2258:1: ( ( rule__PowerOf__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2258:1: ( ( rule__PowerOf__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2259:1: ( rule__PowerOf__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2260:1: ( rule__PowerOf__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2260:2: rule__PowerOf__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl4577);
            	    rule__PowerOf__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PowerOf__Group__1__Impl"


    // $ANTLR start "rule__PowerOf__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2274:1: rule__PowerOf__Group_1__0 : rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 ;
    public final void rule__PowerOf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2278:1: ( rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2279:2: rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__04612);
            rule__PowerOf__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__04615);
            rule__PowerOf__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2286:1: rule__PowerOf__Group_1__0__Impl : ( () ) ;
    public final void rule__PowerOf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2290:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2291:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2291:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2292:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2293:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2295:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0()); 
            }

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2305:1: rule__PowerOf__Group_1__1 : rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 ;
    public final void rule__PowerOf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2309:1: ( rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2310:2: rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__14673);
            rule__PowerOf__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__14676);
            rule__PowerOf__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2317:1: rule__PowerOf__Group_1__1__Impl : ( '**' ) ;
    public final void rule__PowerOf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2321:1: ( ( '**' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2322:1: ( '**' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2322:1: ( '**' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2323:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl4704); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__PowerOf__Group_1__1__Impl"


    // $ANTLR start "rule__PowerOf__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2336:1: rule__PowerOf__Group_1__2 : rule__PowerOf__Group_1__2__Impl ;
    public final void rule__PowerOf__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2340:1: ( rule__PowerOf__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2341:2: rule__PowerOf__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__24735);
            rule__PowerOf__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2347:1: rule__PowerOf__Group_1__2__Impl : ( ( rule__PowerOf__RightAssignment_1_2 ) ) ;
    public final void rule__PowerOf__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2351:1: ( ( ( rule__PowerOf__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2352:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2352:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2353:1: ( rule__PowerOf__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2354:1: ( rule__PowerOf__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2354:2: rule__PowerOf__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl4762);
            rule__PowerOf__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__PowerOf__Group_1__2__Impl"


    // $ANTLR start "rule__BasicExp__Group_3__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2370:1: rule__BasicExp__Group_3__0 : rule__BasicExp__Group_3__0__Impl rule__BasicExp__Group_3__1 ;
    public final void rule__BasicExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2374:1: ( rule__BasicExp__Group_3__0__Impl rule__BasicExp__Group_3__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2375:2: rule__BasicExp__Group_3__0__Impl rule__BasicExp__Group_3__1
            {
            pushFollow(FOLLOW_rule__BasicExp__Group_3__0__Impl_in_rule__BasicExp__Group_3__04798);
            rule__BasicExp__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicExp__Group_3__1_in_rule__BasicExp__Group_3__04801);
            rule__BasicExp__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExp__Group_3__0"


    // $ANTLR start "rule__BasicExp__Group_3__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2382:1: rule__BasicExp__Group_3__0__Impl : ( '(' ) ;
    public final void rule__BasicExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2386:1: ( ( '(' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2387:1: ( '(' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2387:1: ( '(' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2388:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__BasicExp__Group_3__0__Impl4829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0()); 
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
    // $ANTLR end "rule__BasicExp__Group_3__0__Impl"


    // $ANTLR start "rule__BasicExp__Group_3__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2401:1: rule__BasicExp__Group_3__1 : rule__BasicExp__Group_3__1__Impl rule__BasicExp__Group_3__2 ;
    public final void rule__BasicExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2405:1: ( rule__BasicExp__Group_3__1__Impl rule__BasicExp__Group_3__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2406:2: rule__BasicExp__Group_3__1__Impl rule__BasicExp__Group_3__2
            {
            pushFollow(FOLLOW_rule__BasicExp__Group_3__1__Impl_in_rule__BasicExp__Group_3__14860);
            rule__BasicExp__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicExp__Group_3__2_in_rule__BasicExp__Group_3__14863);
            rule__BasicExp__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExp__Group_3__1"


    // $ANTLR start "rule__BasicExp__Group_3__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2413:1: rule__BasicExp__Group_3__1__Impl : ( ruleConcat ) ;
    public final void rule__BasicExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2417:1: ( ( ruleConcat ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2418:1: ( ruleConcat )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2418:1: ( ruleConcat )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2419:1: ruleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExpAccess().getConcatParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_rule__BasicExp__Group_3__1__Impl4890);
            ruleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExpAccess().getConcatParserRuleCall_3_1()); 
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
    // $ANTLR end "rule__BasicExp__Group_3__1__Impl"


    // $ANTLR start "rule__BasicExp__Group_3__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2430:1: rule__BasicExp__Group_3__2 : rule__BasicExp__Group_3__2__Impl ;
    public final void rule__BasicExp__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2434:1: ( rule__BasicExp__Group_3__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2435:2: rule__BasicExp__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__BasicExp__Group_3__2__Impl_in_rule__BasicExp__Group_3__24919);
            rule__BasicExp__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicExp__Group_3__2"


    // $ANTLR start "rule__BasicExp__Group_3__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2441:1: rule__BasicExp__Group_3__2__Impl : ( ')' ) ;
    public final void rule__BasicExp__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2445:1: ( ( ')' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2446:1: ( ')' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2446:1: ( ')' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2447:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicExpAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__BasicExp__Group_3__2__Impl4947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicExpAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__BasicExp__Group_3__2__Impl"


    // $ANTLR start "rule__Forlp__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2466:1: rule__Forlp__Group__0 : rule__Forlp__Group__0__Impl rule__Forlp__Group__1 ;
    public final void rule__Forlp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2470:1: ( rule__Forlp__Group__0__Impl rule__Forlp__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2471:2: rule__Forlp__Group__0__Impl rule__Forlp__Group__1
            {
            pushFollow(FOLLOW_rule__Forlp__Group__0__Impl_in_rule__Forlp__Group__04984);
            rule__Forlp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Forlp__Group__1_in_rule__Forlp__Group__04987);
            rule__Forlp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group__0"


    // $ANTLR start "rule__Forlp__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2478:1: rule__Forlp__Group__0__Impl : ( 'for' ) ;
    public final void rule__Forlp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2482:1: ( ( 'for' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2483:1: ( 'for' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2483:1: ( 'for' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2484:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getForKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Forlp__Group__0__Impl5015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getForKeyword_0()); 
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
    // $ANTLR end "rule__Forlp__Group__0__Impl"


    // $ANTLR start "rule__Forlp__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2497:1: rule__Forlp__Group__1 : rule__Forlp__Group__1__Impl rule__Forlp__Group__2 ;
    public final void rule__Forlp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2501:1: ( rule__Forlp__Group__1__Impl rule__Forlp__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2502:2: rule__Forlp__Group__1__Impl rule__Forlp__Group__2
            {
            pushFollow(FOLLOW_rule__Forlp__Group__1__Impl_in_rule__Forlp__Group__15046);
            rule__Forlp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Forlp__Group__2_in_rule__Forlp__Group__15049);
            rule__Forlp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group__1"


    // $ANTLR start "rule__Forlp__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2509:1: rule__Forlp__Group__1__Impl : ( ( rule__Forlp__CondAssignment_1 ) ) ;
    public final void rule__Forlp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2513:1: ( ( ( rule__Forlp__CondAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2514:1: ( ( rule__Forlp__CondAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2514:1: ( ( rule__Forlp__CondAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2515:1: ( rule__Forlp__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getCondAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2516:1: ( rule__Forlp__CondAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2516:2: rule__Forlp__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__Forlp__CondAssignment_1_in_rule__Forlp__Group__1__Impl5076);
            rule__Forlp__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getCondAssignment_1()); 
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
    // $ANTLR end "rule__Forlp__Group__1__Impl"


    // $ANTLR start "rule__Forlp__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2526:1: rule__Forlp__Group__2 : rule__Forlp__Group__2__Impl ;
    public final void rule__Forlp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2530:1: ( rule__Forlp__Group__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2531:2: rule__Forlp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Forlp__Group__2__Impl_in_rule__Forlp__Group__25106);
            rule__Forlp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group__2"


    // $ANTLR start "rule__Forlp__Group__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2537:1: rule__Forlp__Group__2__Impl : ( ( rule__Forlp__Alternatives_2 ) ) ;
    public final void rule__Forlp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2541:1: ( ( ( rule__Forlp__Alternatives_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2542:1: ( ( rule__Forlp__Alternatives_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2542:1: ( ( rule__Forlp__Alternatives_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2543:1: ( rule__Forlp__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getAlternatives_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2544:1: ( rule__Forlp__Alternatives_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2544:2: rule__Forlp__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Forlp__Alternatives_2_in_rule__Forlp__Group__2__Impl5133);
            rule__Forlp__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Forlp__Group__2__Impl"


    // $ANTLR start "rule__Forlp__Group_2_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2560:1: rule__Forlp__Group_2_1__0 : rule__Forlp__Group_2_1__0__Impl rule__Forlp__Group_2_1__1 ;
    public final void rule__Forlp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2564:1: ( rule__Forlp__Group_2_1__0__Impl rule__Forlp__Group_2_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2565:2: rule__Forlp__Group_2_1__0__Impl rule__Forlp__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Forlp__Group_2_1__0__Impl_in_rule__Forlp__Group_2_1__05169);
            rule__Forlp__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Forlp__Group_2_1__1_in_rule__Forlp__Group_2_1__05172);
            rule__Forlp__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group_2_1__0"


    // $ANTLR start "rule__Forlp__Group_2_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2572:1: rule__Forlp__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Forlp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2576:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2577:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2577:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2578:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Forlp__Group_2_1__0__Impl5200); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getLeftCurlyBracketKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Forlp__Group_2_1__0__Impl"


    // $ANTLR start "rule__Forlp__Group_2_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2591:1: rule__Forlp__Group_2_1__1 : rule__Forlp__Group_2_1__1__Impl rule__Forlp__Group_2_1__2 ;
    public final void rule__Forlp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2595:1: ( rule__Forlp__Group_2_1__1__Impl rule__Forlp__Group_2_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2596:2: rule__Forlp__Group_2_1__1__Impl rule__Forlp__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Forlp__Group_2_1__1__Impl_in_rule__Forlp__Group_2_1__15231);
            rule__Forlp__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Forlp__Group_2_1__2_in_rule__Forlp__Group_2_1__15234);
            rule__Forlp__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group_2_1__1"


    // $ANTLR start "rule__Forlp__Group_2_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2603:1: rule__Forlp__Group_2_1__1__Impl : ( ( rule__Forlp__StmtsAssignment_2_1_1 ) ) ;
    public final void rule__Forlp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2607:1: ( ( ( rule__Forlp__StmtsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2608:1: ( ( rule__Forlp__StmtsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2608:1: ( ( rule__Forlp__StmtsAssignment_2_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2609:1: ( rule__Forlp__StmtsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getStmtsAssignment_2_1_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2610:1: ( rule__Forlp__StmtsAssignment_2_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2610:2: rule__Forlp__StmtsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Forlp__StmtsAssignment_2_1_1_in_rule__Forlp__Group_2_1__1__Impl5261);
            rule__Forlp__StmtsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getStmtsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__Forlp__Group_2_1__1__Impl"


    // $ANTLR start "rule__Forlp__Group_2_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2620:1: rule__Forlp__Group_2_1__2 : rule__Forlp__Group_2_1__2__Impl ;
    public final void rule__Forlp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2624:1: ( rule__Forlp__Group_2_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2625:2: rule__Forlp__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Forlp__Group_2_1__2__Impl_in_rule__Forlp__Group_2_1__25291);
            rule__Forlp__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forlp__Group_2_1__2"


    // $ANTLR start "rule__Forlp__Group_2_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2631:1: rule__Forlp__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Forlp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2635:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2636:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2636:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2637:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Forlp__Group_2_1__2__Impl5319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getRightCurlyBracketKeyword_2_1_2()); 
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
    // $ANTLR end "rule__Forlp__Group_2_1__2__Impl"


    // $ANTLR start "rule__Ifte__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2656:1: rule__Ifte__Group__0 : rule__Ifte__Group__0__Impl rule__Ifte__Group__1 ;
    public final void rule__Ifte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2660:1: ( rule__Ifte__Group__0__Impl rule__Ifte__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2661:2: rule__Ifte__Group__0__Impl rule__Ifte__Group__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group__0__Impl_in_rule__Ifte__Group__05356);
            rule__Ifte__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__1_in_rule__Ifte__Group__05359);
            rule__Ifte__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group__0"


    // $ANTLR start "rule__Ifte__Group__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2668:1: rule__Ifte__Group__0__Impl : ( 'if' ) ;
    public final void rule__Ifte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2672:1: ( ( 'if' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2673:1: ( 'if' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2673:1: ( 'if' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2674:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getIfKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Ifte__Group__0__Impl5387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__Ifte__Group__0__Impl"


    // $ANTLR start "rule__Ifte__Group__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2687:1: rule__Ifte__Group__1 : rule__Ifte__Group__1__Impl rule__Ifte__Group__2 ;
    public final void rule__Ifte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2691:1: ( rule__Ifte__Group__1__Impl rule__Ifte__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2692:2: rule__Ifte__Group__1__Impl rule__Ifte__Group__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group__1__Impl_in_rule__Ifte__Group__15418);
            rule__Ifte__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__2_in_rule__Ifte__Group__15421);
            rule__Ifte__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group__1"


    // $ANTLR start "rule__Ifte__Group__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2699:1: rule__Ifte__Group__1__Impl : ( ( rule__Ifte__CondAssignment_1 ) ) ;
    public final void rule__Ifte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2703:1: ( ( ( rule__Ifte__CondAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2704:1: ( ( rule__Ifte__CondAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2704:1: ( ( rule__Ifte__CondAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2705:1: ( rule__Ifte__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getCondAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2706:1: ( rule__Ifte__CondAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2706:2: rule__Ifte__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__Ifte__CondAssignment_1_in_rule__Ifte__Group__1__Impl5448);
            rule__Ifte__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getCondAssignment_1()); 
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
    // $ANTLR end "rule__Ifte__Group__1__Impl"


    // $ANTLR start "rule__Ifte__Group__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2716:1: rule__Ifte__Group__2 : rule__Ifte__Group__2__Impl rule__Ifte__Group__3 ;
    public final void rule__Ifte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2720:1: ( rule__Ifte__Group__2__Impl rule__Ifte__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2721:2: rule__Ifte__Group__2__Impl rule__Ifte__Group__3
            {
            pushFollow(FOLLOW_rule__Ifte__Group__2__Impl_in_rule__Ifte__Group__25478);
            rule__Ifte__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__3_in_rule__Ifte__Group__25481);
            rule__Ifte__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group__2"


    // $ANTLR start "rule__Ifte__Group__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2728:1: rule__Ifte__Group__2__Impl : ( ( rule__Ifte__Alternatives_2 ) ) ;
    public final void rule__Ifte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2732:1: ( ( ( rule__Ifte__Alternatives_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2733:1: ( ( rule__Ifte__Alternatives_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2733:1: ( ( rule__Ifte__Alternatives_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2734:1: ( rule__Ifte__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getAlternatives_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2735:1: ( rule__Ifte__Alternatives_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2735:2: rule__Ifte__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Ifte__Alternatives_2_in_rule__Ifte__Group__2__Impl5508);
            rule__Ifte__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Ifte__Group__2__Impl"


    // $ANTLR start "rule__Ifte__Group__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2745:1: rule__Ifte__Group__3 : rule__Ifte__Group__3__Impl ;
    public final void rule__Ifte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2749:1: ( rule__Ifte__Group__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2750:2: rule__Ifte__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group__3__Impl_in_rule__Ifte__Group__35538);
            rule__Ifte__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group__3"


    // $ANTLR start "rule__Ifte__Group__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2756:1: rule__Ifte__Group__3__Impl : ( ( rule__Ifte__Group_3__0 )? ) ;
    public final void rule__Ifte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2760:1: ( ( ( rule__Ifte__Group_3__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2761:1: ( ( rule__Ifte__Group_3__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2761:1: ( ( rule__Ifte__Group_3__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2762:1: ( rule__Ifte__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getGroup_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2763:1: ( rule__Ifte__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred25_InternalGACL()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2763:2: rule__Ifte__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_3__0_in_rule__Ifte__Group__3__Impl5565);
                    rule__Ifte__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Ifte__Group__3__Impl"


    // $ANTLR start "rule__Ifte__Group_2_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2781:1: rule__Ifte__Group_2_1__0 : rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1 ;
    public final void rule__Ifte__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2785:1: ( rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2786:2: rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__0__Impl_in_rule__Ifte__Group_2_1__05604);
            rule__Ifte__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__1_in_rule__Ifte__Group_2_1__05607);
            rule__Ifte__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_2_1__0"


    // $ANTLR start "rule__Ifte__Group_2_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2793:1: rule__Ifte__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Ifte__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2797:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2798:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2798:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2799:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Ifte__Group_2_1__0__Impl5635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Ifte__Group_2_1__0__Impl"


    // $ANTLR start "rule__Ifte__Group_2_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2812:1: rule__Ifte__Group_2_1__1 : rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2 ;
    public final void rule__Ifte__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2816:1: ( rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2817:2: rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__1__Impl_in_rule__Ifte__Group_2_1__15666);
            rule__Ifte__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__2_in_rule__Ifte__Group_2_1__15669);
            rule__Ifte__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_2_1__1"


    // $ANTLR start "rule__Ifte__Group_2_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2824:1: rule__Ifte__Group_2_1__1__Impl : ( ( rule__Ifte__StmtsAssignment_2_1_1 ) ) ;
    public final void rule__Ifte__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2828:1: ( ( ( rule__Ifte__StmtsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2829:1: ( ( rule__Ifte__StmtsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2829:1: ( ( rule__Ifte__StmtsAssignment_2_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2830:1: ( rule__Ifte__StmtsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsAssignment_2_1_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2831:1: ( rule__Ifte__StmtsAssignment_2_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2831:2: rule__Ifte__StmtsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Ifte__StmtsAssignment_2_1_1_in_rule__Ifte__Group_2_1__1__Impl5696);
            rule__Ifte__StmtsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getStmtsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__Ifte__Group_2_1__1__Impl"


    // $ANTLR start "rule__Ifte__Group_2_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2841:1: rule__Ifte__Group_2_1__2 : rule__Ifte__Group_2_1__2__Impl ;
    public final void rule__Ifte__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2845:1: ( rule__Ifte__Group_2_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2846:2: rule__Ifte__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__2__Impl_in_rule__Ifte__Group_2_1__25726);
            rule__Ifte__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_2_1__2"


    // $ANTLR start "rule__Ifte__Group_2_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2852:1: rule__Ifte__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Ifte__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2856:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2857:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2857:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2858:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Ifte__Group_2_1__2__Impl5754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2()); 
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
    // $ANTLR end "rule__Ifte__Group_2_1__2__Impl"


    // $ANTLR start "rule__Ifte__Group_3__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2877:1: rule__Ifte__Group_3__0 : rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1 ;
    public final void rule__Ifte__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2881:1: ( rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2882:2: rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3__0__Impl_in_rule__Ifte__Group_3__05791);
            rule__Ifte__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3__1_in_rule__Ifte__Group_3__05794);
            rule__Ifte__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_3__0"


    // $ANTLR start "rule__Ifte__Group_3__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2889:1: rule__Ifte__Group_3__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Ifte__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2893:1: ( ( ( 'else' ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2894:1: ( ( 'else' ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2894:1: ( ( 'else' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2895:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getElseKeyword_3_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2896:1: ( 'else' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2897:2: 'else'
            {
            match(input,30,FOLLOW_30_in_rule__Ifte__Group_3__0__Impl5823); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getElseKeyword_3_0()); 
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
    // $ANTLR end "rule__Ifte__Group_3__0__Impl"


    // $ANTLR start "rule__Ifte__Group_3__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2908:1: rule__Ifte__Group_3__1 : rule__Ifte__Group_3__1__Impl ;
    public final void rule__Ifte__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2912:1: ( rule__Ifte__Group_3__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2913:2: rule__Ifte__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3__1__Impl_in_rule__Ifte__Group_3__15855);
            rule__Ifte__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_3__1"


    // $ANTLR start "rule__Ifte__Group_3__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2919:1: rule__Ifte__Group_3__1__Impl : ( ( rule__Ifte__Alternatives_3_1 ) ) ;
    public final void rule__Ifte__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2923:1: ( ( ( rule__Ifte__Alternatives_3_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2924:1: ( ( rule__Ifte__Alternatives_3_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2924:1: ( ( rule__Ifte__Alternatives_3_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2925:1: ( rule__Ifte__Alternatives_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getAlternatives_3_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2926:1: ( rule__Ifte__Alternatives_3_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2926:2: rule__Ifte__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Ifte__Alternatives_3_1_in_rule__Ifte__Group_3__1__Impl5882);
            rule__Ifte__Alternatives_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getAlternatives_3_1()); 
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
    // $ANTLR end "rule__Ifte__Group_3__1__Impl"


    // $ANTLR start "rule__Ifte__Group_3_1_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2940:1: rule__Ifte__Group_3_1_1__0 : rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1 ;
    public final void rule__Ifte__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2944:1: ( rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2945:2: rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__0__Impl_in_rule__Ifte__Group_3_1_1__05916);
            rule__Ifte__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__1_in_rule__Ifte__Group_3_1_1__05919);
            rule__Ifte__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_3_1_1__0"


    // $ANTLR start "rule__Ifte__Group_3_1_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2952:1: rule__Ifte__Group_3_1_1__0__Impl : ( '{' ) ;
    public final void rule__Ifte__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2956:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2957:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2957:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2958:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Ifte__Group_3_1_1__0__Impl5947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0()); 
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
    // $ANTLR end "rule__Ifte__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Ifte__Group_3_1_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2971:1: rule__Ifte__Group_3_1_1__1 : rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2 ;
    public final void rule__Ifte__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2975:1: ( rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2976:2: rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__1__Impl_in_rule__Ifte__Group_3_1_1__15978);
            rule__Ifte__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__2_in_rule__Ifte__Group_3_1_1__15981);
            rule__Ifte__Group_3_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_3_1_1__1"


    // $ANTLR start "rule__Ifte__Group_3_1_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2983:1: rule__Ifte__Group_3_1_1__1__Impl : ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) ) ;
    public final void rule__Ifte__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2987:1: ( ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2988:1: ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2988:1: ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2989:1: ( rule__Ifte__EstmtsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_1_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2990:1: ( rule__Ifte__EstmtsAssignment_3_1_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2990:2: rule__Ifte__EstmtsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Ifte__EstmtsAssignment_3_1_1_1_in_rule__Ifte__Group_3_1_1__1__Impl6008);
            rule__Ifte__EstmtsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_1_1()); 
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
    // $ANTLR end "rule__Ifte__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Ifte__Group_3_1_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3000:1: rule__Ifte__Group_3_1_1__2 : rule__Ifte__Group_3_1_1__2__Impl ;
    public final void rule__Ifte__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3004:1: ( rule__Ifte__Group_3_1_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3005:2: rule__Ifte__Group_3_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__2__Impl_in_rule__Ifte__Group_3_1_1__26038);
            rule__Ifte__Group_3_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifte__Group_3_1_1__2"


    // $ANTLR start "rule__Ifte__Group_3_1_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3011:1: rule__Ifte__Group_3_1_1__2__Impl : ( '}' ) ;
    public final void rule__Ifte__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3015:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3016:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3016:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3017:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_3_1_1_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Ifte__Group_3_1_1__2__Impl6066); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_3_1_1_2()); 
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
    // $ANTLR end "rule__Ifte__Group_3_1_1__2__Impl"


    // $ANTLR start "rule__Code__DeclsAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3037:1: rule__Code__DeclsAssignment_0 : ( ( rule__Code__DeclsAlternatives_0_0 ) ) ;
    public final void rule__Code__DeclsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3041:1: ( ( ( rule__Code__DeclsAlternatives_0_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3042:1: ( ( rule__Code__DeclsAlternatives_0_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3042:1: ( ( rule__Code__DeclsAlternatives_0_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3043:1: ( rule__Code__DeclsAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getDeclsAlternatives_0_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3044:1: ( rule__Code__DeclsAlternatives_0_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3044:2: rule__Code__DeclsAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Code__DeclsAlternatives_0_0_in_rule__Code__DeclsAssignment_06108);
            rule__Code__DeclsAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeAccess().getDeclsAlternatives_0_0()); 
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
    // $ANTLR end "rule__Code__DeclsAssignment_0"


    // $ANTLR start "rule__Code__StmtsAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3053:1: rule__Code__StmtsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Code__StmtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3057:1: ( ( ruleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3058:1: ( ruleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3058:1: ( ruleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3059:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getStmtsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Code__StmtsAssignment_16141);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeAccess().getStmtsStatementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Code__StmtsAssignment_1"


    // $ANTLR start "rule__SingleStatement__TdAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3068:1: rule__SingleStatement__TdAssignment_0 : ( ruleTypeDecl ) ;
    public final void rule__SingleStatement__TdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3072:1: ( ( ruleTypeDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3073:1: ( ruleTypeDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3073:1: ( ruleTypeDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3074:1: ruleTypeDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__SingleStatement__TdAssignment_06172);
            ruleTypeDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__SingleStatement__TdAssignment_0"


    // $ANTLR start "rule__SingleStatement__VdAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3083:1: rule__SingleStatement__VdAssignment_1 : ( ruleVarDecl ) ;
    public final void rule__SingleStatement__VdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3087:1: ( ( ruleVarDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3088:1: ( ruleVarDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3088:1: ( ruleVarDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3089:1: ruleVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_rule__SingleStatement__VdAssignment_16203);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SingleStatement__VdAssignment_1"


    // $ANTLR start "rule__SingleStatement__VinAssignment_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3098:1: rule__SingleStatement__VinAssignment_2 : ( ruleVarInst ) ;
    public final void rule__SingleStatement__VinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3102:1: ( ( ruleVarInst ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3103:1: ( ruleVarInst )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3103:1: ( ruleVarInst )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3104:1: ruleVarInst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getVinVarInstParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_rule__SingleStatement__VinAssignment_26234);
            ruleVarInst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getVinVarInstParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SingleStatement__VinAssignment_2"


    // $ANTLR start "rule__SingleStatement__IfstAssignment_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3113:1: rule__SingleStatement__IfstAssignment_3 : ( ruleifte ) ;
    public final void rule__SingleStatement__IfstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3117:1: ( ( ruleifte ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3118:1: ( ruleifte )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3118:1: ( ruleifte )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3119:1: ruleifte
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getIfstIfteParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleifte_in_rule__SingleStatement__IfstAssignment_36265);
            ruleifte();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getIfstIfteParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__SingleStatement__IfstAssignment_3"


    // $ANTLR start "rule__SingleStatement__FlAssignment_4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3128:1: rule__SingleStatement__FlAssignment_4 : ( ruleforlp ) ;
    public final void rule__SingleStatement__FlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3132:1: ( ( ruleforlp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3133:1: ( ruleforlp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3133:1: ( ruleforlp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3134:1: ruleforlp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getFlForlpParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleforlp_in_rule__SingleStatement__FlAssignment_46296);
            ruleforlp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStatementAccess().getFlForlpParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__SingleStatement__FlAssignment_4"


    // $ANTLR start "rule__Statement__VinAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3143:1: rule__Statement__VinAssignment_0 : ( ruleVarInst ) ;
    public final void rule__Statement__VinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3147:1: ( ( ruleVarInst ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3148:1: ( ruleVarInst )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3148:1: ( ruleVarInst )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3149:1: ruleVarInst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_06327);
            ruleVarInst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Statement__VinAssignment_0"


    // $ANTLR start "rule__Statement__IfstAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3158:1: rule__Statement__IfstAssignment_1 : ( ruleifte ) ;
    public final void rule__Statement__IfstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3162:1: ( ( ruleifte ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3163:1: ( ruleifte )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3163:1: ( ruleifte )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3164:1: ruleifte
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleifte_in_rule__Statement__IfstAssignment_16358);
            ruleifte();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Statement__IfstAssignment_1"


    // $ANTLR start "rule__Statement__FlAssignment_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3173:1: rule__Statement__FlAssignment_2 : ( ruleforlp ) ;
    public final void rule__Statement__FlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3177:1: ( ( ruleforlp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3178:1: ( ruleforlp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3178:1: ( ruleforlp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3179:1: ruleforlp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFlForlpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleforlp_in_rule__Statement__FlAssignment_26389);
            ruleforlp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFlForlpParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Statement__FlAssignment_2"


    // $ANTLR start "rule__VarDecl__NameAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3188:1: rule__VarDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3192:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3193:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3193:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3194:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_16420); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarDecl__NameAssignment_1"


    // $ANTLR start "rule__VarDecl__PtAssignment_2_1_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3203:1: rule__VarDecl__PtAssignment_2_1_0 : ( rulePType ) ;
    public final void rule__VarDecl__PtAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3207:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3208:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3208:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3209:1: rulePType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_2_1_06451);
            rulePType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__VarDecl__PtAssignment_2_1_0"


    // $ANTLR start "rule__VarDecl__TdAssignment_2_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3218:1: rule__VarDecl__TdAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__TdAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3222:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3223:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3223:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3224:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_2_1_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3225:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3226:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_2_1_16486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_2_1_1_0()); 
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
    // $ANTLR end "rule__VarDecl__TdAssignment_2_1_1"


    // $ANTLR start "rule__PType__TypeAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3237:1: rule__PType__TypeAssignment_0 : ( RULE_INTTYPE ) ;
    public final void rule__PType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3241:1: ( ( RULE_INTTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3242:1: ( RULE_INTTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3242:1: ( RULE_INTTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3243:1: RULE_INTTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_06521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__PType__TypeAssignment_0"


    // $ANTLR start "rule__PType__TypeAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3252:1: rule__PType__TypeAssignment_1 : ( RULE_STRTYPE ) ;
    public final void rule__PType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3256:1: ( ( RULE_STRTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3257:1: ( RULE_STRTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3257:1: ( RULE_STRTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3258:1: RULE_STRTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_16552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PType__TypeAssignment_1"


    // $ANTLR start "rule__TypeDecl__NameAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3267:1: rule__TypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3271:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3272:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3272:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3273:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_16583); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TypeDecl__NameAssignment_1"


    // $ANTLR start "rule__TypeDecl__TpAssignment_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3282:1: rule__TypeDecl__TpAssignment_3 : ( rulePType ) ;
    public final void rule__TypeDecl__TpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3286:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3287:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3287:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3288:1: rulePType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_36614);
            rulePType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__TypeDecl__TpAssignment_3"


    // $ANTLR start "rule__VarInst__NameAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3297:1: rule__VarInst__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarInst__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3301:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3302:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3302:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3303:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3304:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3305:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameVarDeclIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_06649); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getNameVarDeclIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
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
    // $ANTLR end "rule__VarInst__NameAssignment_0"


    // $ANTLR start "rule__VarInst__ExpAssignment_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3316:1: rule__VarInst__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__VarInst__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3320:1: ( ( ruleExpression ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3321:1: ( ruleExpression )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3321:1: ( ruleExpression )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3322:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VarInst__ExpAssignment_26684);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VarInst__ExpAssignment_2"


    // $ANTLR start "rule__Concat__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3331:1: rule__Concat__RightAssignment_1_2 : ( ruleStringLiteral ) ;
    public final void rule__Concat__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3335:1: ( ( ruleStringLiteral ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3336:1: ( ruleStringLiteral )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3336:1: ( ruleStringLiteral )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3337:1: ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_26715);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Concat__RightAssignment_1_2"


    // $ANTLR start "rule__Subtraction__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3346:1: rule__Subtraction__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Subtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3350:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3351:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3351:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3352:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_26746);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Subtraction__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3361:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3365:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3366:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3366:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3367:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26777);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3376:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3380:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3381:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3381:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3382:1: ruleDivision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_26808);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Division__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3391:1: rule__Division__RightAssignment_1_2 : ( rulePowerOf ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3395:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3396:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3396:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3397:1: rulePowerOf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_26839);
            rulePowerOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Division__RightAssignment_1_2"


    // $ANTLR start "rule__PowerOf__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3406:1: rule__PowerOf__RightAssignment_1_2 : ( ruleBasicExp ) ;
    public final void rule__PowerOf__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3410:1: ( ( ruleBasicExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3411:1: ( ruleBasicExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3411:1: ( ruleBasicExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3412:1: ruleBasicExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getRightBasicExpParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleBasicExp_in_rule__PowerOf__RightAssignment_1_26870);
            ruleBasicExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getRightBasicExpParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__PowerOf__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3421:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3425:1: ( ( RULE_INT ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3426:1: ( RULE_INT )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3426:1: ( RULE_INT )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3427:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment6901); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3436:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3440:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3441:1: ( RULE_STRING )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3441:1: ( RULE_STRING )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3442:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__VarExps__VrnmAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3451:1: rule__VarExps__VrnmAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarExps__VrnmAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3455:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3456:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3456:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3457:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVrnmVarDeclCrossReference_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3458:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3459:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVrnmVarDeclIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarExps__VrnmAssignment6967); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVrnmVarDeclIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVrnmVarDeclCrossReference_0()); 
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
    // $ANTLR end "rule__VarExps__VrnmAssignment"


    // $ANTLR start "rule__Forlp__CondAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3470:1: rule__Forlp__CondAssignment_1 : ( ruleExpression ) ;
    public final void rule__Forlp__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3474:1: ( ( ruleExpression ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3475:1: ( ruleExpression )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3475:1: ( ruleExpression )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3476:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getCondExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Forlp__CondAssignment_17002);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getCondExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Forlp__CondAssignment_1"


    // $ANTLR start "rule__Forlp__StmtsAssignment_2_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3485:1: rule__Forlp__StmtsAssignment_2_0 : ( ruleSingleStatement ) ;
    public final void rule__Forlp__StmtsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3489:1: ( ( ruleSingleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3490:1: ( ruleSingleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3490:1: ( ruleSingleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3491:1: ruleSingleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_rule__Forlp__StmtsAssignment_2_07033);
            ruleSingleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Forlp__StmtsAssignment_2_0"


    // $ANTLR start "rule__Forlp__StmtsAssignment_2_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3500:1: rule__Forlp__StmtsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__Forlp__StmtsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3504:1: ( ( ruleCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3505:1: ( ruleCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3505:1: ( ruleCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3506:1: ruleCode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForlpAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCode_in_rule__Forlp__StmtsAssignment_2_1_17064);
            ruleCode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForlpAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__Forlp__StmtsAssignment_2_1_1"


    // $ANTLR start "rule__Ifte__CondAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3515:1: rule__Ifte__CondAssignment_1 : ( ruleExpression ) ;
    public final void rule__Ifte__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3519:1: ( ( ruleExpression ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3520:1: ( ruleExpression )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3520:1: ( ruleExpression )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3521:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getCondExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Ifte__CondAssignment_17095);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getCondExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Ifte__CondAssignment_1"


    // $ANTLR start "rule__Ifte__StmtsAssignment_2_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3530:1: rule__Ifte__StmtsAssignment_2_0 : ( ruleSingleStatement ) ;
    public final void rule__Ifte__StmtsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3534:1: ( ( ruleSingleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3535:1: ( ruleSingleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3535:1: ( ruleSingleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3536:1: ruleSingleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_rule__Ifte__StmtsAssignment_2_07126);
            ruleSingleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Ifte__StmtsAssignment_2_0"


    // $ANTLR start "rule__Ifte__StmtsAssignment_2_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3545:1: rule__Ifte__StmtsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__Ifte__StmtsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3549:1: ( ( ruleCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3550:1: ( ruleCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3550:1: ( ruleCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3551:1: ruleCode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCode_in_rule__Ifte__StmtsAssignment_2_1_17157);
            ruleCode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__Ifte__StmtsAssignment_2_1_1"


    // $ANTLR start "rule__Ifte__EstmtsAssignment_3_1_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3560:1: rule__Ifte__EstmtsAssignment_3_1_0 : ( ruleSingleStatement ) ;
    public final void rule__Ifte__EstmtsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3564:1: ( ( ruleSingleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3565:1: ( ruleSingleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3565:1: ( ruleSingleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3566:1: ruleSingleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_rule__Ifte__EstmtsAssignment_3_1_07188);
            ruleSingleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
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
    // $ANTLR end "rule__Ifte__EstmtsAssignment_3_1_0"


    // $ANTLR start "rule__Ifte__EstmtsAssignment_3_1_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3575:1: rule__Ifte__EstmtsAssignment_3_1_1_1 : ( ruleCode ) ;
    public final void rule__Ifte__EstmtsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3579:1: ( ( ruleCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3580:1: ( ruleCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3580:1: ( ruleCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3581:1: ruleCode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCode_in_rule__Ifte__EstmtsAssignment_3_1_1_17219);
            ruleCode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
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
    // $ANTLR end "rule__Ifte__EstmtsAssignment_3_1_1_1"

    // $ANTLR start synpred25_InternalGACL
    public final void synpred25_InternalGACL_fragment() throws RecognitionException {   
        // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2763:2: ( rule__Ifte__Group_3__0 )
        // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2763:2: rule__Ifte__Group_3__0
        {
        pushFollow(FOLLOW_rule__Ifte__Group_3__0_in_synpred25_InternalGACL5565);
        rule__Ifte__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGACL

    // Delegated rules

    public final boolean synpred25_InternalGACL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGACL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__0_in_ruleCode100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Alternatives_in_ruleSingleStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__Alternatives_in_rulePType340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_entryRuleVarInst427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInst434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__0_in_ruleVarInst460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_ruleExpression520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0_in_ruleConcat579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0_in_ruleDivision819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExp_in_entryRuleBasicExp906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicExp913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExp__Alternatives_in_ruleBasicExp939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_entryRuleVarExps1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExps1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarExps__VrnmAssignment_in_ruleVarExps1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_entryRuleforlp1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleforlp1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group__0_in_ruleforlp1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_entryRuleifte1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifte1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__0_in_ruleifte1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Code__DeclsAlternatives_0_01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Code__DeclsAlternatives_0_01292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__TdAssignment_0_in_rule__SingleStatement__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__VdAssignment_1_in_rule__SingleStatement__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__VinAssignment_2_in_rule__SingleStatement__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__IfstAssignment_3_in_rule__SingleStatement__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__FlAssignment_4_in_rule__SingleStatement__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VinAssignment_0_in_rule__Statement__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IfstAssignment_1_in_rule__Statement__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FlAssignment_2_in_rule__Statement__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__PtAssignment_2_1_0_in_rule__VarDecl__Alternatives_2_11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TdAssignment_2_1_1_in_rule__VarDecl__Alternatives_2_11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__BasicExp__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__BasicExp__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_rule__BasicExp__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__0_in_rule__BasicExp__Alternatives1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__StmtsAssignment_2_0_in_rule__Forlp__Alternatives_21684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__0_in_rule__Forlp__Alternatives_21702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__StmtsAssignment_2_0_in_rule__Ifte__Alternatives_21735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__0_in_rule__Ifte__Alternatives_21753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__EstmtsAssignment_3_1_0_in_rule__Ifte__Alternatives_3_11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__0_in_rule__Ifte__Alternatives_3_11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01835 = new BitSet(new long[]{0x0000000024000010L});
    public static final BitSet FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__DeclsAssignment_0_in_rule__Code__Group__0__Impl1865 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__StmtsAssignment_1_in_rule__Code__Group__1__Impl1923 = new BitSet(new long[]{0x0000000024000012L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarDecl__Group__0__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12020 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22080 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32141 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarDecl__Group__4__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02271 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarDecl__Group_2__0__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Alternatives_2_1_in_rule__VarDecl__Group_2__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group__0__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22516 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group__2__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Group__4__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__02707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__02710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__12767 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarInst__Group__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__22829 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__VarInst__Group__3_in_rule__VarInst__Group__22832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__ExpAssignment_2_in_rule__VarInst__Group__2__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__3__Impl_in_rule__VarInst__Group__32889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarInst__Group__3__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02956 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__Concat__Group__0__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl3042 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__03077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__03080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__13138 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Concat__Group_1__1__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__23200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__03263 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__03266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__13322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl3349 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__03384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__03387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__13445 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__23507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03570 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3656 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03691 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13752 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__Group_1__1__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03877 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3963 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03998 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__04001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__14059 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__24121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__04184 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group__1_in_rule__Division__Group__04187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl4270 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__04305 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__04308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__14366 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__14369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Division__Group_1__1__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__24428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__04491 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__04494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExp_in_rule__PowerOf__Group__0__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__14550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl4577 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__04612 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__04615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__14673 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__24735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__0__Impl_in_rule__BasicExp__Group_3__04798 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__1_in_rule__BasicExp__Group_3__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BasicExp__Group_3__0__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__1__Impl_in_rule__BasicExp__Group_3__14860 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__2_in_rule__BasicExp__Group_3__14863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_rule__BasicExp__Group_3__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicExp__Group_3__2__Impl_in_rule__BasicExp__Group_3__24919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BasicExp__Group_3__2__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group__0__Impl_in_rule__Forlp__Group__04984 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Forlp__Group__1_in_rule__Forlp__Group__04987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Forlp__Group__0__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group__1__Impl_in_rule__Forlp__Group__15046 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_rule__Forlp__Group__2_in_rule__Forlp__Group__15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__CondAssignment_1_in_rule__Forlp__Group__1__Impl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group__2__Impl_in_rule__Forlp__Group__25106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Alternatives_2_in_rule__Forlp__Group__2__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__0__Impl_in_rule__Forlp__Group_2_1__05169 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__1_in_rule__Forlp__Group_2_1__05172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Forlp__Group_2_1__0__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__1__Impl_in_rule__Forlp__Group_2_1__15231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__2_in_rule__Forlp__Group_2_1__15234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__StmtsAssignment_2_1_1_in_rule__Forlp__Group_2_1__1__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forlp__Group_2_1__2__Impl_in_rule__Forlp__Group_2_1__25291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Forlp__Group_2_1__2__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__0__Impl_in_rule__Ifte__Group__05356 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__Ifte__Group__1_in_rule__Ifte__Group__05359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Ifte__Group__0__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__1__Impl_in_rule__Ifte__Group__15418 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_rule__Ifte__Group__2_in_rule__Ifte__Group__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__CondAssignment_1_in_rule__Ifte__Group__1__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__2__Impl_in_rule__Ifte__Group__25478 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group__3_in_rule__Ifte__Group__25481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Alternatives_2_in_rule__Ifte__Group__2__Impl5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__3__Impl_in_rule__Ifte__Group__35538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0_in_rule__Ifte__Group__3__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__0__Impl_in_rule__Ifte__Group_2_1__05604 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__1_in_rule__Ifte__Group_2_1__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ifte__Group_2_1__0__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__1__Impl_in_rule__Ifte__Group_2_1__15666 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__2_in_rule__Ifte__Group_2_1__15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__StmtsAssignment_2_1_1_in_rule__Ifte__Group_2_1__1__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__2__Impl_in_rule__Ifte__Group_2_1__25726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ifte__Group_2_1__2__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0__Impl_in_rule__Ifte__Group_3__05791 = new BitSet(new long[]{0x000000002C012010L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__1_in_rule__Ifte__Group_3__05794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Ifte__Group_3__0__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__1__Impl_in_rule__Ifte__Group_3__15855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Alternatives_3_1_in_rule__Ifte__Group_3__1__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__0__Impl_in_rule__Ifte__Group_3_1_1__05916 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__1_in_rule__Ifte__Group_3_1_1__05919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ifte__Group_3_1_1__0__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__1__Impl_in_rule__Ifte__Group_3_1_1__15978 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__2_in_rule__Ifte__Group_3_1_1__15981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__EstmtsAssignment_3_1_1_1_in_rule__Ifte__Group_3_1_1__1__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__2__Impl_in_rule__Ifte__Group_3_1_1__26038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ifte__Group_3_1_1__2__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__DeclsAlternatives_0_0_in_rule__Code__DeclsAssignment_06108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Code__StmtsAssignment_16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__SingleStatement__TdAssignment_06172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__SingleStatement__VdAssignment_16203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_rule__SingleStatement__VinAssignment_26234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_rule__SingleStatement__IfstAssignment_36265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_rule__SingleStatement__FlAssignment_46296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_rule__Statement__IfstAssignment_16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleforlp_in_rule__Statement__FlAssignment_26389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_16420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_2_1_06451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_2_1_16486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_06521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_16552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_16583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_36614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_06649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VarInst__ExpAssignment_26684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_26715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_26746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_26808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_26839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicExp_in_rule__PowerOf__RightAssignment_1_26870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarExps__VrnmAssignment6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Forlp__CondAssignment_17002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Forlp__StmtsAssignment_2_07033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Forlp__StmtsAssignment_2_1_17064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Ifte__CondAssignment_17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Ifte__StmtsAssignment_2_07126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Ifte__StmtsAssignment_2_1_17157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Ifte__EstmtsAssignment_3_1_07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Ifte__EstmtsAssignment_3_1_1_17219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0_in_synpred25_InternalGACL5565 = new BitSet(new long[]{0x0000000000000002L});

}