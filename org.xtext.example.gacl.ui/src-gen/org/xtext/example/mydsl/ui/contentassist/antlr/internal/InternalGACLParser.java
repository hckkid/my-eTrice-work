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


    // $ANTLR start "entryRuleConcat"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:258:1: ( ruleConcat EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:259:1: ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_entryRuleConcat487);
            ruleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcat494); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:266:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:270:2: ( ( ( rule__Concat__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:271:1: ( ( rule__Concat__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:271:1: ( ( rule__Concat__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:272:1: ( rule__Concat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:273:1: ( rule__Concat__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:273:2: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_rule__Concat__Group__0_in_ruleConcat520);
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


    // $ANTLR start "entryRuleBasicStringExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:285:1: entryRuleBasicStringExp : ruleBasicStringExp EOF ;
    public final void entryRuleBasicStringExp() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:286:1: ( ruleBasicStringExp EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:287:1: ruleBasicStringExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicStringExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicStringExp_in_entryRuleBasicStringExp547);
            ruleBasicStringExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicStringExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStringExp554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicStringExp"


    // $ANTLR start "ruleBasicStringExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:294:1: ruleBasicStringExp : ( ruleStringLiteral ) ;
    public final void ruleBasicStringExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:298:2: ( ( ruleStringLiteral ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:1: ( ruleStringLiteral )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:1: ( ruleStringLiteral )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:300:1: ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicStringExpAccess().getStringLiteralParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleBasicStringExp580);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicStringExpAccess().getStringLiteralParserRuleCall()); 
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
    // $ANTLR end "ruleBasicStringExp"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:313:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:314:1: ( ruleStringLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:315:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral606);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral613); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:322:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:326:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:328:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:329:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:329:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral639);
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


    // $ANTLR start "entryRuleSubtraction"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:341:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:342:1: ( ruleSubtraction EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:343:1: ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction666);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubtractionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction673); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:350:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:354:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:355:1: ( ( rule__Subtraction__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:355:1: ( ( rule__Subtraction__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:356:1: ( rule__Subtraction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:357:1: ( rule__Subtraction__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:357:2: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction699);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:369:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:370:1: ( ruleAddition EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:371:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition726);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition733); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:378:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:382:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:383:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:383:1: ( ( rule__Addition__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:384:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:385:1: ( rule__Addition__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:385:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition759);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:397:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:398:1: ( ruleMultiplication EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:399:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication786);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication793); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:406:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:410:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:412:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:413:1: ( rule__Multiplication__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:413:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication819);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:425:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:426:1: ( ruleDivision EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:427:1: ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision846);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision853); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:434:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:2: ( ( ( rule__Division__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( ( rule__Division__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( ( rule__Division__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:440:1: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:441:1: ( rule__Division__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:441:2: rule__Division__Group__0
            {
            pushFollow(FOLLOW_rule__Division__Group__0_in_ruleDivision879);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:453:1: entryRulePowerOf : rulePowerOf EOF ;
    public final void entryRulePowerOf() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:454:1: ( rulePowerOf EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:455:1: rulePowerOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfRule()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_entryRulePowerOf906);
            rulePowerOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerOf913); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:462:1: rulePowerOf : ( ( rule__PowerOf__Group__0 ) ) ;
    public final void rulePowerOf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:466:2: ( ( ( rule__PowerOf__Group__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:467:1: ( ( rule__PowerOf__Group__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:467:1: ( ( rule__PowerOf__Group__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:468:1: ( rule__PowerOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getGroup()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:1: ( rule__PowerOf__Group__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:2: rule__PowerOf__Group__0
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf939);
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


    // $ANTLR start "entryRuleBasicIntExp"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:481:1: entryRuleBasicIntExp : ruleBasicIntExp EOF ;
    public final void entryRuleBasicIntExp() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:482:1: ( ruleBasicIntExp EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:483:1: ruleBasicIntExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicIntExpRule()); 
            }
            pushFollow(FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp966);
            ruleBasicIntExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicIntExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicIntExp973); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:490:1: ruleBasicIntExp : ( ( rule__BasicIntExp__Alternatives ) ) ;
    public final void ruleBasicIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:494:2: ( ( ( rule__BasicIntExp__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:495:1: ( ( rule__BasicIntExp__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:495:1: ( ( rule__BasicIntExp__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:496:1: ( rule__BasicIntExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicIntExpAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:1: ( rule__BasicIntExp__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:2: rule__BasicIntExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Alternatives_in_ruleBasicIntExp999);
            rule__BasicIntExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicIntExpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBasicIntExp"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:509:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:510:1: ( ruleIntLiteral EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:511:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1026);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1033); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:518:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:522:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:523:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:523:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:524:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:525:1: ( rule__IntLiteral__ValueAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:525:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1059);
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:537:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:538:1: ( ruleExpression EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:539:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1086);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1093); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:546:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:550:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:552:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:553:1: ( rule__Expression__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:553:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1119);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleVarExps"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:565:1: entryRuleVarExps : ruleVarExps EOF ;
    public final void entryRuleVarExps() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:566:1: ( ruleVarExps EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:567:1: ruleVarExps EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsRule()); 
            }
            pushFollow(FOLLOW_ruleVarExps_in_entryRuleVarExps1146);
            ruleVarExps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExps1153); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:574:1: ruleVarExps : ( ( rule__VarExps__VarexAssignment ) ) ;
    public final void ruleVarExps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:578:2: ( ( ( rule__VarExps__VarexAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ( rule__VarExps__VarexAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:1: ( ( rule__VarExps__VarexAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:580:1: ( rule__VarExps__VarexAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVarexAssignment()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:1: ( rule__VarExps__VarexAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:2: rule__VarExps__VarexAssignment
            {
            pushFollow(FOLLOW_rule__VarExps__VarexAssignment_in_ruleVarExps1179);
            rule__VarExps__VarexAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVarexAssignment()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:643:1: rule__SingleStatement__Alternatives : ( ( ( rule__SingleStatement__TdAssignment_0 ) ) | ( ( rule__SingleStatement__VdAssignment_1 ) ) | ( ( rule__SingleStatement__VinAssignment_2 ) ) | ( ( rule__SingleStatement__IfstAssignment_3 ) ) );
    public final void rule__SingleStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:647:1: ( ( ( rule__SingleStatement__TdAssignment_0 ) ) | ( ( rule__SingleStatement__VdAssignment_1 ) ) | ( ( rule__SingleStatement__VinAssignment_2 ) ) | ( ( rule__SingleStatement__IfstAssignment_3 ) ) )
            int alt2=4;
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
            case 26:
                {
                alt2=4;
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

            }
        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:677:1: rule__Statement__Alternatives : ( ( ( rule__Statement__VinAssignment_0 ) ) | ( ( rule__Statement__IfstAssignment_1 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:681:1: ( ( ( rule__Statement__VinAssignment_0 ) ) | ( ( rule__Statement__IfstAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:682:1: ( ( rule__Statement__VinAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:682:1: ( ( rule__Statement__VinAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:683:1: ( rule__Statement__VinAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVinAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:684:1: ( rule__Statement__VinAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:684:2: rule__Statement__VinAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Statement__VinAssignment_0_in_rule__Statement__Alternatives1411);
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:688:6: ( ( rule__Statement__IfstAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:688:6: ( ( rule__Statement__IfstAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:689:1: ( rule__Statement__IfstAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfstAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:690:1: ( rule__Statement__IfstAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:690:2: rule__Statement__IfstAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Statement__IfstAssignment_1_in_rule__Statement__Alternatives1429);
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

            }
        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:699:1: rule__VarDecl__Alternatives_3 : ( ( ( rule__VarDecl__PtAssignment_3_0 ) ) | ( ( rule__VarDecl__TdAssignment_3_1 ) ) );
    public final void rule__VarDecl__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:703:1: ( ( ( rule__VarDecl__PtAssignment_3_0 ) ) | ( ( rule__VarDecl__TdAssignment_3_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:704:1: ( ( rule__VarDecl__PtAssignment_3_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:704:1: ( ( rule__VarDecl__PtAssignment_3_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:705:1: ( rule__VarDecl__PtAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getPtAssignment_3_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:706:1: ( rule__VarDecl__PtAssignment_3_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:706:2: rule__VarDecl__PtAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__PtAssignment_3_0_in_rule__VarDecl__Alternatives_31462);
                    rule__VarDecl__PtAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getPtAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:710:6: ( ( rule__VarDecl__TdAssignment_3_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:710:6: ( ( rule__VarDecl__TdAssignment_3_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:711:1: ( rule__VarDecl__TdAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getTdAssignment_3_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:712:1: ( rule__VarDecl__TdAssignment_3_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:712:2: rule__VarDecl__TdAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__VarDecl__TdAssignment_3_1_in_rule__VarDecl__Alternatives_31480);
                    rule__VarDecl__TdAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getTdAssignment_3_1()); 
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
    // $ANTLR end "rule__VarDecl__Alternatives_3"


    // $ANTLR start "rule__PType__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:721:1: rule__PType__Alternatives : ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) );
    public final void rule__PType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:725:1: ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:726:1: ( ( rule__PType__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:726:1: ( ( rule__PType__TypeAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:727:1: ( rule__PType__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:728:1: ( rule__PType__TypeAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:728:2: rule__PType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1513);
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:732:6: ( ( rule__PType__TypeAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:732:6: ( ( rule__PType__TypeAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:733:1: ( rule__PType__TypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:734:1: ( rule__PType__TypeAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:734:2: rule__PType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1531);
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


    // $ANTLR start "rule__BasicIntExp__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:743:1: rule__BasicIntExp__Alternatives : ( ( ruleIntLiteral ) | ( ( rule__BasicIntExp__Group_1__0 ) ) );
    public final void rule__BasicIntExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:747:1: ( ( ruleIntLiteral ) | ( ( rule__BasicIntExp__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:748:1: ( ruleIntLiteral )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:748:1: ( ruleIntLiteral )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:749:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__BasicIntExp__Alternatives1564);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicIntExpAccess().getIntLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:754:6: ( ( rule__BasicIntExp__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:754:6: ( ( rule__BasicIntExp__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:755:1: ( rule__BasicIntExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicIntExpAccess().getGroup_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:756:1: ( rule__BasicIntExp__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:756:2: rule__BasicIntExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicIntExp__Group_1__0_in_rule__BasicIntExp__Alternatives1581);
                    rule__BasicIntExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicIntExpAccess().getGroup_1()); 
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
    // $ANTLR end "rule__BasicIntExp__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:765:1: rule__Expression__Alternatives : ( ( ( rule__Expression__StrexpAssignment_0 ) ) | ( ( rule__Expression__InexpAssignment_1 ) ) | ( ( rule__Expression__VexAssignment_2 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:769:1: ( ( ( rule__Expression__StrexpAssignment_0 ) ) | ( ( rule__Expression__InexpAssignment_1 ) ) | ( ( rule__Expression__VexAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
            case 24:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:770:1: ( ( rule__Expression__StrexpAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:770:1: ( ( rule__Expression__StrexpAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:771:1: ( rule__Expression__StrexpAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getStrexpAssignment_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:772:1: ( rule__Expression__StrexpAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:772:2: rule__Expression__StrexpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression__StrexpAssignment_0_in_rule__Expression__Alternatives1614);
                    rule__Expression__StrexpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getStrexpAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:776:6: ( ( rule__Expression__InexpAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:776:6: ( ( rule__Expression__InexpAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:777:1: ( rule__Expression__InexpAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getInexpAssignment_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:778:1: ( rule__Expression__InexpAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:778:2: rule__Expression__InexpAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression__InexpAssignment_1_in_rule__Expression__Alternatives1632);
                    rule__Expression__InexpAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getInexpAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:782:6: ( ( rule__Expression__VexAssignment_2 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:782:6: ( ( rule__Expression__VexAssignment_2 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:783:1: ( rule__Expression__VexAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVexAssignment_2()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:784:1: ( rule__Expression__VexAssignment_2 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:784:2: rule__Expression__VexAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Expression__VexAssignment_2_in_rule__Expression__Alternatives1650);
                    rule__Expression__VexAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVexAssignment_2()); 
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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Ifte__Alternatives_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:793:1: rule__Ifte__Alternatives_2 : ( ( ( rule__Ifte__StmtsAssignment_2_0 ) ) | ( ( rule__Ifte__Group_2_1__0 ) ) );
    public final void rule__Ifte__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:797:1: ( ( ( rule__Ifte__StmtsAssignment_2_0 ) ) | ( ( rule__Ifte__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==13||LA8_0==16||LA8_0==26) ) {
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:798:1: ( ( rule__Ifte__StmtsAssignment_2_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:798:1: ( ( rule__Ifte__StmtsAssignment_2_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:799:1: ( rule__Ifte__StmtsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getStmtsAssignment_2_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:800:1: ( rule__Ifte__StmtsAssignment_2_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:800:2: rule__Ifte__StmtsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Ifte__StmtsAssignment_2_0_in_rule__Ifte__Alternatives_21683);
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:804:6: ( ( rule__Ifte__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:804:6: ( ( rule__Ifte__Group_2_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:805:1: ( rule__Ifte__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getGroup_2_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:806:1: ( rule__Ifte__Group_2_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:806:2: rule__Ifte__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_2_1__0_in_rule__Ifte__Alternatives_21701);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:815:1: rule__Ifte__Alternatives_3_1 : ( ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) ) | ( ( rule__Ifte__Group_3_1_1__0 ) ) );
    public final void rule__Ifte__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:819:1: ( ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) ) | ( ( rule__Ifte__Group_3_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==13||LA9_0==16||LA9_0==26) ) {
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:820:1: ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:820:1: ( ( rule__Ifte__EstmtsAssignment_3_1_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:821:1: ( rule__Ifte__EstmtsAssignment_3_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_0()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:822:1: ( rule__Ifte__EstmtsAssignment_3_1_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:822:2: rule__Ifte__EstmtsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__Ifte__EstmtsAssignment_3_1_0_in_rule__Ifte__Alternatives_3_11734);
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:826:6: ( ( rule__Ifte__Group_3_1_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:826:6: ( ( rule__Ifte__Group_3_1_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:827:1: ( rule__Ifte__Group_3_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfteAccess().getGroup_3_1_1()); 
                    }
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:828:1: ( rule__Ifte__Group_3_1_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:828:2: rule__Ifte__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__0_in_rule__Ifte__Alternatives_3_11752);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:839:1: rule__Code__Group__0 : rule__Code__Group__0__Impl rule__Code__Group__1 ;
    public final void rule__Code__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:843:1: ( rule__Code__Group__0__Impl rule__Code__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:844:2: rule__Code__Group__0__Impl rule__Code__Group__1
            {
            pushFollow(FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01783);
            rule__Code__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01786);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:851:1: rule__Code__Group__0__Impl : ( ( rule__Code__DeclsAssignment_0 )* ) ;
    public final void rule__Code__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:855:1: ( ( ( rule__Code__DeclsAssignment_0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:856:1: ( ( rule__Code__DeclsAssignment_0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:856:1: ( ( rule__Code__DeclsAssignment_0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:857:1: ( rule__Code__DeclsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getDeclsAssignment_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:858:1: ( rule__Code__DeclsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13||LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:858:2: rule__Code__DeclsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Code__DeclsAssignment_0_in_rule__Code__Group__0__Impl1813);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:868:1: rule__Code__Group__1 : rule__Code__Group__1__Impl ;
    public final void rule__Code__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:872:1: ( rule__Code__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:873:2: rule__Code__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11844);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:879:1: rule__Code__Group__1__Impl : ( ( rule__Code__StmtsAssignment_1 )* ) ;
    public final void rule__Code__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:883:1: ( ( ( rule__Code__StmtsAssignment_1 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:884:1: ( ( rule__Code__StmtsAssignment_1 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:884:1: ( ( rule__Code__StmtsAssignment_1 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:885:1: ( rule__Code__StmtsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getStmtsAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:886:1: ( rule__Code__StmtsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:886:2: rule__Code__StmtsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Code__StmtsAssignment_1_in_rule__Code__Group__1__Impl1871);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:900:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:904:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:905:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01906);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01909);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:912:1: rule__VarDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:916:1: ( ( 'var' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:917:1: ( 'var' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:917:1: ( 'var' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:918:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getVarKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__VarDecl__Group__0__Impl1937); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:931:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:935:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:936:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11968);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11971);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:943:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__NameAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:947:1: ( ( ( rule__VarDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:948:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:948:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:949:1: ( rule__VarDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:950:1: ( rule__VarDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:950:2: rule__VarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl1998);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:960:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:964:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:965:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22028);
            rule__VarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22031);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:972:1: rule__VarDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:976:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:977:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:977:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:978:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getColonKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__VarDecl__Group__2__Impl2059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getColonKeyword_2()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:991:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:995:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:996:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32090);
            rule__VarDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32093);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1003:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__Alternatives_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1007:1: ( ( ( rule__VarDecl__Alternatives_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1008:1: ( ( rule__VarDecl__Alternatives_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1008:1: ( ( rule__VarDecl__Alternatives_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1009:1: ( rule__VarDecl__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getAlternatives_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1010:1: ( rule__VarDecl__Alternatives_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1010:2: rule__VarDecl__Alternatives_3
            {
            pushFollow(FOLLOW_rule__VarDecl__Alternatives_3_in_rule__VarDecl__Group__3__Impl2120);
            rule__VarDecl__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__VarDecl__Group__3__Impl"


    // $ANTLR start "rule__VarDecl__Group__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1020:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1024:1: ( rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1025:2: rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42150);
            rule__VarDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__42153);
            rule__VarDecl__Group__5();

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1032:1: rule__VarDecl__Group__4__Impl : ( () ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1036:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1037:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1037:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getVarDeclTypeAction_4()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1039:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1041:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getVarDeclTypeAction_4()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__4__Impl"


    // $ANTLR start "rule__VarDecl__Group__5"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1051:1: rule__VarDecl__Group__5 : rule__VarDecl__Group__5__Impl ;
    public final void rule__VarDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1055:1: ( rule__VarDecl__Group__5__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1056:2: rule__VarDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__52211);
            rule__VarDecl__Group__5__Impl();

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
    // $ANTLR end "rule__VarDecl__Group__5"


    // $ANTLR start "rule__VarDecl__Group__5__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1062:1: rule__VarDecl__Group__5__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1066:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1067:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1067:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1068:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 
            }
            match(input,15,FOLLOW_15_in_rule__VarDecl__Group__5__Impl2239); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__VarDecl__Group__5__Impl"


    // $ANTLR start "rule__TypeDecl__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1093:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1097:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1098:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02282);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02285);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1105:1: rule__TypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1109:1: ( ( 'type' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1110:1: ( 'type' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1110:1: ( 'type' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1111:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__TypeDecl__Group__0__Impl2313); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1124:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1128:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1129:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12344);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12347);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1136:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__NameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1140:1: ( ( ( rule__TypeDecl__NameAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1141:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1141:1: ( ( rule__TypeDecl__NameAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1142:1: ( rule__TypeDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1143:1: ( rule__TypeDecl__NameAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1143:2: rule__TypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2374);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1153:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1157:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1158:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22404);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22407);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1165:1: rule__TypeDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1169:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1170:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1170:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1171:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__TypeDecl__Group__2__Impl2435); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1184:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1188:1: ( rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1189:2: rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32466);
            rule__TypeDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32469);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1196:1: rule__TypeDecl__Group__3__Impl : ( ( rule__TypeDecl__TpAssignment_3 ) ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1200:1: ( ( ( rule__TypeDecl__TpAssignment_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1201:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1201:1: ( ( rule__TypeDecl__TpAssignment_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1202:1: ( rule__TypeDecl__TpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTpAssignment_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1203:1: ( rule__TypeDecl__TpAssignment_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1203:2: rule__TypeDecl__TpAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl2496);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1213:1: rule__TypeDecl__Group__4 : rule__TypeDecl__Group__4__Impl ;
    public final void rule__TypeDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1217:1: ( rule__TypeDecl__Group__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1218:2: rule__TypeDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42526);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1224:1: rule__TypeDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__TypeDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1228:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1229:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1229:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1230:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__TypeDecl__Group__4__Impl2554); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1253:1: rule__VarInst__Group__0 : rule__VarInst__Group__0__Impl rule__VarInst__Group__1 ;
    public final void rule__VarInst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1257:1: ( rule__VarInst__Group__0__Impl rule__VarInst__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1258:2: rule__VarInst__Group__0__Impl rule__VarInst__Group__1
            {
            pushFollow(FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__02595);
            rule__VarInst__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__02598);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1265:1: rule__VarInst__Group__0__Impl : ( ( rule__VarInst__NameAssignment_0 ) ) ;
    public final void rule__VarInst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1269:1: ( ( ( rule__VarInst__NameAssignment_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1270:1: ( ( rule__VarInst__NameAssignment_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1270:1: ( ( rule__VarInst__NameAssignment_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1271:1: ( rule__VarInst__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1272:1: ( rule__VarInst__NameAssignment_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1272:2: rule__VarInst__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl2625);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1282:1: rule__VarInst__Group__1 : rule__VarInst__Group__1__Impl rule__VarInst__Group__2 ;
    public final void rule__VarInst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1286:1: ( rule__VarInst__Group__1__Impl rule__VarInst__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1287:2: rule__VarInst__Group__1__Impl rule__VarInst__Group__2
            {
            pushFollow(FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__12655);
            rule__VarInst__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__12658);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1294:1: rule__VarInst__Group__1__Impl : ( '=' ) ;
    public final void rule__VarInst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1298:1: ( ( '=' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1299:1: ( '=' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1299:1: ( '=' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1300:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getEqualsSignKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__VarInst__Group__1__Impl2686); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1313:1: rule__VarInst__Group__2 : rule__VarInst__Group__2__Impl rule__VarInst__Group__3 ;
    public final void rule__VarInst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1317:1: ( rule__VarInst__Group__2__Impl rule__VarInst__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1318:2: rule__VarInst__Group__2__Impl rule__VarInst__Group__3
            {
            pushFollow(FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__22717);
            rule__VarInst__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInst__Group__3_in_rule__VarInst__Group__22720);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1325:1: rule__VarInst__Group__2__Impl : ( ( rule__VarInst__ExpAssignment_2 ) ) ;
    public final void rule__VarInst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1329:1: ( ( ( rule__VarInst__ExpAssignment_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1330:1: ( ( rule__VarInst__ExpAssignment_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1330:1: ( ( rule__VarInst__ExpAssignment_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1331:1: ( rule__VarInst__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getExpAssignment_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1332:1: ( rule__VarInst__ExpAssignment_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1332:2: rule__VarInst__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__VarInst__ExpAssignment_2_in_rule__VarInst__Group__2__Impl2747);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1342:1: rule__VarInst__Group__3 : rule__VarInst__Group__3__Impl ;
    public final void rule__VarInst__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1346:1: ( rule__VarInst__Group__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1347:2: rule__VarInst__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInst__Group__3__Impl_in_rule__VarInst__Group__32777);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1353:1: rule__VarInst__Group__3__Impl : ( ';' ) ;
    public final void rule__VarInst__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1357:1: ( ( ';' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1358:1: ( ';' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1358:1: ( ';' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1359:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getSemicolonKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__VarInst__Group__3__Impl2805); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1380:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1384:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1385:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02844);
            rule__Concat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02847);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1392:1: rule__Concat__Group__0__Impl : ( ruleBasicStringExp ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1396:1: ( ( ruleBasicStringExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1397:1: ( ruleBasicStringExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1397:1: ( ruleBasicStringExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1398:1: ruleBasicStringExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getBasicStringExpParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicStringExp_in_rule__Concat__Group__0__Impl2874);
            ruleBasicStringExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatAccess().getBasicStringExpParserRuleCall_0()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1409:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1413:1: ( rule__Concat__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1414:2: rule__Concat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__12903);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1420:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Group_1__0 )* ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1424:1: ( ( ( rule__Concat__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1425:1: ( ( rule__Concat__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1425:1: ( ( rule__Concat__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1426:1: ( rule__Concat__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1427:1: ( rule__Concat__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1427:2: rule__Concat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl2930);
            	    rule__Concat__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1441:1: rule__Concat__Group_1__0 : rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 ;
    public final void rule__Concat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1445:1: ( rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1446:2: rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__02965);
            rule__Concat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__02968);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1453:1: rule__Concat__Group_1__0__Impl : ( () ) ;
    public final void rule__Concat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1457:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1458:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1458:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1459:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1460:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1462:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1472:1: rule__Concat__Group_1__1 : rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 ;
    public final void rule__Concat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1476:1: ( rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1477:2: rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__13026);
            rule__Concat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__13029);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1484:1: rule__Concat__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Concat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1488:1: ( ( '^' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1489:1: ( '^' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1489:1: ( '^' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1490:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Concat__Group_1__1__Impl3057); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1503:1: rule__Concat__Group_1__2 : rule__Concat__Group_1__2__Impl ;
    public final void rule__Concat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1507:1: ( rule__Concat__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1508:2: rule__Concat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__23088);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1514:1: rule__Concat__Group_1__2__Impl : ( ( rule__Concat__RightAssignment_1_2 ) ) ;
    public final void rule__Concat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1518:1: ( ( ( rule__Concat__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1519:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1519:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1520:1: ( rule__Concat__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1521:1: ( rule__Concat__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1521:2: rule__Concat__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl3115);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1537:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1541:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1542:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__03151);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__03154);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1549:1: rule__Subtraction__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1553:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1554:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1554:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1555:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl3181);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1566:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1570:1: ( rule__Subtraction__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1571:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__13210);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1577:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__Group_1__0 )* ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1581:1: ( ( ( rule__Subtraction__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1582:1: ( ( rule__Subtraction__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1582:1: ( ( rule__Subtraction__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1583:1: ( rule__Subtraction__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1584:1: ( rule__Subtraction__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1584:2: rule__Subtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl3237);
            	    rule__Subtraction__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1598:1: rule__Subtraction__Group_1__0 : rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 ;
    public final void rule__Subtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1602:1: ( rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1603:2: rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__03272);
            rule__Subtraction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__03275);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1610:1: rule__Subtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1614:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1615:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1615:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1616:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1617:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1619:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1629:1: rule__Subtraction__Group_1__1 : rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 ;
    public final void rule__Subtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1633:1: ( rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1634:2: rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__13333);
            rule__Subtraction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__13336);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1641:1: rule__Subtraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1645:1: ( ( '-' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1646:1: ( '-' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1646:1: ( '-' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1647:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl3364); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1660:1: rule__Subtraction__Group_1__2 : rule__Subtraction__Group_1__2__Impl ;
    public final void rule__Subtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1664:1: ( rule__Subtraction__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1665:2: rule__Subtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__23395);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1671:1: rule__Subtraction__Group_1__2__Impl : ( ( rule__Subtraction__RightAssignment_1_2 ) ) ;
    public final void rule__Subtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1675:1: ( ( ( rule__Subtraction__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1676:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1676:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1677:1: ( rule__Subtraction__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1678:1: ( rule__Subtraction__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1678:2: rule__Subtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl3422);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1694:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1698:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1699:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03458);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03461);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1706:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1710:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1711:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1711:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1712:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3488);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1723:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1727:1: ( rule__Addition__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1728:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13517);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1734:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1738:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1739:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1739:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1740:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1741:1: ( rule__Addition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1741:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3544);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1755:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1759:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1760:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03579);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03582);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1767:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1771:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1772:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1772:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1773:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1774:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1776:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1786:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1790:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1791:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13640);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13643);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1798:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1802:1: ( ( '+' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1803:1: ( '+' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1803:1: ( '+' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1804:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Addition__Group_1__1__Impl3671); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1817:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1821:1: ( rule__Addition__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1822:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23702);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1828:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1832:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1833:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1833:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1834:1: ( rule__Addition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1835:1: ( rule__Addition__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1835:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3729);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1851:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1855:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1856:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03765);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03768);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1863:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1867:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1868:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1868:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1869:1: ruleDivision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3795);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1880:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1884:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1885:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13824);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1891:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1895:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1896:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1896:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1897:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1898:1: ( rule__Multiplication__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1898:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3851);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1912:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1916:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1917:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03886);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03889);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1924:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1928:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1929:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1929:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1930:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1931:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1933:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1943:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1947:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1948:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13947);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13950);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1955:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1959:1: ( ( '*' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1960:1: ( '*' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1960:1: ( '*' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1961:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl3978); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1974:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1978:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1979:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__24009);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1985:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1989:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1990:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1990:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1991:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1992:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1992:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl4036);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2008:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2012:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2013:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__04072);
            rule__Division__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group__1_in_rule__Division__Group__04075);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2020:1: rule__Division__Group__0__Impl : ( rulePowerOf ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2024:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2025:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2025:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2026:1: rulePowerOf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl4102);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2037:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2041:1: ( rule__Division__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2042:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__14131);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2048:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2052:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2053:1: ( ( rule__Division__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2053:1: ( ( rule__Division__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2054:1: ( rule__Division__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2055:1: ( rule__Division__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2055:2: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl4158);
            	    rule__Division__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2069:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2073:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2074:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__04193);
            rule__Division__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__04196);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2081:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2085:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2086:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2086:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2087:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2088:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2090:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2100:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2104:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2105:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
            {
            pushFollow(FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__14254);
            rule__Division__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__14257);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2112:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2116:1: ( ( '/' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2117:1: ( '/' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2117:1: ( '/' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2118:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Division__Group_1__1__Impl4285); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2131:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2135:1: ( rule__Division__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2136:2: rule__Division__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__24316);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2142:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2146:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2147:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2147:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2148:1: ( rule__Division__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2149:1: ( rule__Division__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2149:2: rule__Division__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl4343);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2165:1: rule__PowerOf__Group__0 : rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 ;
    public final void rule__PowerOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2169:1: ( rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2170:2: rule__PowerOf__Group__0__Impl rule__PowerOf__Group__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__04379);
            rule__PowerOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__04382);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2177:1: rule__PowerOf__Group__0__Impl : ( ruleBasicIntExp ) ;
    public final void rule__PowerOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2181:1: ( ( ruleBasicIntExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2182:1: ( ruleBasicIntExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2182:1: ( ruleBasicIntExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2183:1: ruleBasicIntExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicIntExp_in_rule__PowerOf__Group__0__Impl4409);
            ruleBasicIntExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getBasicIntExpParserRuleCall_0()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2194:1: rule__PowerOf__Group__1 : rule__PowerOf__Group__1__Impl ;
    public final void rule__PowerOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2198:1: ( rule__PowerOf__Group__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2199:2: rule__PowerOf__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__14438);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2205:1: rule__PowerOf__Group__1__Impl : ( ( rule__PowerOf__Group_1__0 )* ) ;
    public final void rule__PowerOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2209:1: ( ( ( rule__PowerOf__Group_1__0 )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2210:1: ( ( rule__PowerOf__Group_1__0 )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2210:1: ( ( rule__PowerOf__Group_1__0 )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2211:1: ( rule__PowerOf__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getGroup_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2212:1: ( rule__PowerOf__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2212:2: rule__PowerOf__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl4465);
            	    rule__PowerOf__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2226:1: rule__PowerOf__Group_1__0 : rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 ;
    public final void rule__PowerOf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2230:1: ( rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2231:2: rule__PowerOf__Group_1__0__Impl rule__PowerOf__Group_1__1
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__04500);
            rule__PowerOf__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__04503);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2238:1: rule__PowerOf__Group_1__0__Impl : ( () ) ;
    public final void rule__PowerOf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2242:1: ( ( () ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2243:1: ( () )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2243:1: ( () )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2244:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2245:1: ()
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2247:1: 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2257:1: rule__PowerOf__Group_1__1 : rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 ;
    public final void rule__PowerOf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2261:1: ( rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2262:2: rule__PowerOf__Group_1__1__Impl rule__PowerOf__Group_1__2
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__14561);
            rule__PowerOf__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__14564);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2269:1: rule__PowerOf__Group_1__1__Impl : ( '**' ) ;
    public final void rule__PowerOf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2273:1: ( ( '**' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2274:1: ( '**' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2274:1: ( '**' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2275:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl4592); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2288:1: rule__PowerOf__Group_1__2 : rule__PowerOf__Group_1__2__Impl ;
    public final void rule__PowerOf__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2292:1: ( rule__PowerOf__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2293:2: rule__PowerOf__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__24623);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2299:1: rule__PowerOf__Group_1__2__Impl : ( ( rule__PowerOf__RightAssignment_1_2 ) ) ;
    public final void rule__PowerOf__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2303:1: ( ( ( rule__PowerOf__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2304:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2304:1: ( ( rule__PowerOf__RightAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2305:1: ( rule__PowerOf__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2306:1: ( rule__PowerOf__RightAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2306:2: rule__PowerOf__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl4650);
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


    // $ANTLR start "rule__BasicIntExp__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2322:1: rule__BasicIntExp__Group_1__0 : rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1 ;
    public final void rule__BasicIntExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2326:1: ( rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2327:2: rule__BasicIntExp__Group_1__0__Impl rule__BasicIntExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__0__Impl_in_rule__BasicIntExp__Group_1__04686);
            rule__BasicIntExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__1_in_rule__BasicIntExp__Group_1__04689);
            rule__BasicIntExp__Group_1__1();

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
    // $ANTLR end "rule__BasicIntExp__Group_1__0"


    // $ANTLR start "rule__BasicIntExp__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2334:1: rule__BasicIntExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BasicIntExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2338:1: ( ( '(' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2339:1: ( '(' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2339:1: ( '(' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2340:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__BasicIntExp__Group_1__0__Impl4717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicIntExpAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__BasicIntExp__Group_1__0__Impl"


    // $ANTLR start "rule__BasicIntExp__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2353:1: rule__BasicIntExp__Group_1__1 : rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2 ;
    public final void rule__BasicIntExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2357:1: ( rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2358:2: rule__BasicIntExp__Group_1__1__Impl rule__BasicIntExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__1__Impl_in_rule__BasicIntExp__Group_1__14748);
            rule__BasicIntExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__2_in_rule__BasicIntExp__Group_1__14751);
            rule__BasicIntExp__Group_1__2();

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
    // $ANTLR end "rule__BasicIntExp__Group_1__1"


    // $ANTLR start "rule__BasicIntExp__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2365:1: rule__BasicIntExp__Group_1__1__Impl : ( ruleSubtraction ) ;
    public final void rule__BasicIntExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2369:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2370:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2370:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2371:1: ruleSubtraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_rule__BasicIntExp__Group_1__1__Impl4778);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicIntExpAccess().getSubtractionParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__BasicIntExp__Group_1__1__Impl"


    // $ANTLR start "rule__BasicIntExp__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2382:1: rule__BasicIntExp__Group_1__2 : rule__BasicIntExp__Group_1__2__Impl ;
    public final void rule__BasicIntExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2386:1: ( rule__BasicIntExp__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2387:2: rule__BasicIntExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BasicIntExp__Group_1__2__Impl_in_rule__BasicIntExp__Group_1__24807);
            rule__BasicIntExp__Group_1__2__Impl();

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
    // $ANTLR end "rule__BasicIntExp__Group_1__2"


    // $ANTLR start "rule__BasicIntExp__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2393:1: rule__BasicIntExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BasicIntExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2397:1: ( ( ')' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2398:1: ( ')' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2398:1: ( ')' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2399:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__BasicIntExp__Group_1__2__Impl4835); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicIntExpAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__BasicIntExp__Group_1__2__Impl"


    // $ANTLR start "rule__Ifte__Group__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2418:1: rule__Ifte__Group__0 : rule__Ifte__Group__0__Impl rule__Ifte__Group__1 ;
    public final void rule__Ifte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2422:1: ( rule__Ifte__Group__0__Impl rule__Ifte__Group__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2423:2: rule__Ifte__Group__0__Impl rule__Ifte__Group__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group__0__Impl_in_rule__Ifte__Group__04872);
            rule__Ifte__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__1_in_rule__Ifte__Group__04875);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2430:1: rule__Ifte__Group__0__Impl : ( 'if' ) ;
    public final void rule__Ifte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2434:1: ( ( 'if' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2435:1: ( 'if' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2435:1: ( 'if' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2436:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getIfKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Ifte__Group__0__Impl4903); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2449:1: rule__Ifte__Group__1 : rule__Ifte__Group__1__Impl rule__Ifte__Group__2 ;
    public final void rule__Ifte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2453:1: ( rule__Ifte__Group__1__Impl rule__Ifte__Group__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2454:2: rule__Ifte__Group__1__Impl rule__Ifte__Group__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group__1__Impl_in_rule__Ifte__Group__14934);
            rule__Ifte__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__2_in_rule__Ifte__Group__14937);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2461:1: rule__Ifte__Group__1__Impl : ( ( rule__Ifte__CondAssignment_1 ) ) ;
    public final void rule__Ifte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2465:1: ( ( ( rule__Ifte__CondAssignment_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2466:1: ( ( rule__Ifte__CondAssignment_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2466:1: ( ( rule__Ifte__CondAssignment_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2467:1: ( rule__Ifte__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getCondAssignment_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2468:1: ( rule__Ifte__CondAssignment_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2468:2: rule__Ifte__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__Ifte__CondAssignment_1_in_rule__Ifte__Group__1__Impl4964);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2478:1: rule__Ifte__Group__2 : rule__Ifte__Group__2__Impl rule__Ifte__Group__3 ;
    public final void rule__Ifte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2482:1: ( rule__Ifte__Group__2__Impl rule__Ifte__Group__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2483:2: rule__Ifte__Group__2__Impl rule__Ifte__Group__3
            {
            pushFollow(FOLLOW_rule__Ifte__Group__2__Impl_in_rule__Ifte__Group__24994);
            rule__Ifte__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group__3_in_rule__Ifte__Group__24997);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2490:1: rule__Ifte__Group__2__Impl : ( ( rule__Ifte__Alternatives_2 ) ) ;
    public final void rule__Ifte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2494:1: ( ( ( rule__Ifte__Alternatives_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2495:1: ( ( rule__Ifte__Alternatives_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2495:1: ( ( rule__Ifte__Alternatives_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2496:1: ( rule__Ifte__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getAlternatives_2()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2497:1: ( rule__Ifte__Alternatives_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2497:2: rule__Ifte__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Ifte__Alternatives_2_in_rule__Ifte__Group__2__Impl5024);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2507:1: rule__Ifte__Group__3 : rule__Ifte__Group__3__Impl ;
    public final void rule__Ifte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2511:1: ( rule__Ifte__Group__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2512:2: rule__Ifte__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group__3__Impl_in_rule__Ifte__Group__35054);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2518:1: rule__Ifte__Group__3__Impl : ( ( rule__Ifte__Group_3__0 )? ) ;
    public final void rule__Ifte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2522:1: ( ( ( rule__Ifte__Group_3__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2523:1: ( ( rule__Ifte__Group_3__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2523:1: ( ( rule__Ifte__Group_3__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2524:1: ( rule__Ifte__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getGroup_3()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2525:1: ( rule__Ifte__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred21_InternalGACL()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2525:2: rule__Ifte__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Ifte__Group_3__0_in_rule__Ifte__Group__3__Impl5081);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2543:1: rule__Ifte__Group_2_1__0 : rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1 ;
    public final void rule__Ifte__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2547:1: ( rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2548:2: rule__Ifte__Group_2_1__0__Impl rule__Ifte__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__0__Impl_in_rule__Ifte__Group_2_1__05120);
            rule__Ifte__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__1_in_rule__Ifte__Group_2_1__05123);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2555:1: rule__Ifte__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Ifte__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2559:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2560:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2560:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2561:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Ifte__Group_2_1__0__Impl5151); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2574:1: rule__Ifte__Group_2_1__1 : rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2 ;
    public final void rule__Ifte__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2578:1: ( rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2579:2: rule__Ifte__Group_2_1__1__Impl rule__Ifte__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__1__Impl_in_rule__Ifte__Group_2_1__15182);
            rule__Ifte__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__2_in_rule__Ifte__Group_2_1__15185);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2586:1: rule__Ifte__Group_2_1__1__Impl : ( ( rule__Ifte__StmtsAssignment_2_1_1 ) ) ;
    public final void rule__Ifte__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2590:1: ( ( ( rule__Ifte__StmtsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2591:1: ( ( rule__Ifte__StmtsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2591:1: ( ( rule__Ifte__StmtsAssignment_2_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2592:1: ( rule__Ifte__StmtsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsAssignment_2_1_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2593:1: ( rule__Ifte__StmtsAssignment_2_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2593:2: rule__Ifte__StmtsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Ifte__StmtsAssignment_2_1_1_in_rule__Ifte__Group_2_1__1__Impl5212);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2603:1: rule__Ifte__Group_2_1__2 : rule__Ifte__Group_2_1__2__Impl ;
    public final void rule__Ifte__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2607:1: ( rule__Ifte__Group_2_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2608:2: rule__Ifte__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_2_1__2__Impl_in_rule__Ifte__Group_2_1__25242);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2614:1: rule__Ifte__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Ifte__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2618:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2619:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2619:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2620:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Ifte__Group_2_1__2__Impl5270); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2639:1: rule__Ifte__Group_3__0 : rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1 ;
    public final void rule__Ifte__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2643:1: ( rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2644:2: rule__Ifte__Group_3__0__Impl rule__Ifte__Group_3__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3__0__Impl_in_rule__Ifte__Group_3__05307);
            rule__Ifte__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3__1_in_rule__Ifte__Group_3__05310);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2651:1: rule__Ifte__Group_3__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Ifte__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2655:1: ( ( ( 'else' ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2656:1: ( ( 'else' ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2656:1: ( ( 'else' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2657:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getElseKeyword_3_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2658:1: ( 'else' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2659:2: 'else'
            {
            match(input,29,FOLLOW_29_in_rule__Ifte__Group_3__0__Impl5339); if (state.failed) return ;

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2670:1: rule__Ifte__Group_3__1 : rule__Ifte__Group_3__1__Impl ;
    public final void rule__Ifte__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2674:1: ( rule__Ifte__Group_3__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2675:2: rule__Ifte__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3__1__Impl_in_rule__Ifte__Group_3__15371);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2681:1: rule__Ifte__Group_3__1__Impl : ( ( rule__Ifte__Alternatives_3_1 ) ) ;
    public final void rule__Ifte__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2685:1: ( ( ( rule__Ifte__Alternatives_3_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2686:1: ( ( rule__Ifte__Alternatives_3_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2686:1: ( ( rule__Ifte__Alternatives_3_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2687:1: ( rule__Ifte__Alternatives_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getAlternatives_3_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2688:1: ( rule__Ifte__Alternatives_3_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2688:2: rule__Ifte__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Ifte__Alternatives_3_1_in_rule__Ifte__Group_3__1__Impl5398);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2702:1: rule__Ifte__Group_3_1_1__0 : rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1 ;
    public final void rule__Ifte__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2706:1: ( rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2707:2: rule__Ifte__Group_3_1_1__0__Impl rule__Ifte__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__0__Impl_in_rule__Ifte__Group_3_1_1__05432);
            rule__Ifte__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__1_in_rule__Ifte__Group_3_1_1__05435);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2714:1: rule__Ifte__Group_3_1_1__0__Impl : ( '{' ) ;
    public final void rule__Ifte__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2718:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2719:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2719:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2720:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Ifte__Group_3_1_1__0__Impl5463); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2733:1: rule__Ifte__Group_3_1_1__1 : rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2 ;
    public final void rule__Ifte__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2737:1: ( rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2738:2: rule__Ifte__Group_3_1_1__1__Impl rule__Ifte__Group_3_1_1__2
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__1__Impl_in_rule__Ifte__Group_3_1_1__15494);
            rule__Ifte__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__2_in_rule__Ifte__Group_3_1_1__15497);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2745:1: rule__Ifte__Group_3_1_1__1__Impl : ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) ) ;
    public final void rule__Ifte__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2749:1: ( ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2750:1: ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2750:1: ( ( rule__Ifte__EstmtsAssignment_3_1_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2751:1: ( rule__Ifte__EstmtsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_1_1()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2752:1: ( rule__Ifte__EstmtsAssignment_3_1_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2752:2: rule__Ifte__EstmtsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Ifte__EstmtsAssignment_3_1_1_1_in_rule__Ifte__Group_3_1_1__1__Impl5524);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2762:1: rule__Ifte__Group_3_1_1__2 : rule__Ifte__Group_3_1_1__2__Impl ;
    public final void rule__Ifte__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2766:1: ( rule__Ifte__Group_3_1_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2767:2: rule__Ifte__Group_3_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ifte__Group_3_1_1__2__Impl_in_rule__Ifte__Group_3_1_1__25554);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2773:1: rule__Ifte__Group_3_1_1__2__Impl : ( '}' ) ;
    public final void rule__Ifte__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2777:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2778:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2778:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2779:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_3_1_1_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Ifte__Group_3_1_1__2__Impl5582); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2799:1: rule__Code__DeclsAssignment_0 : ( ( rule__Code__DeclsAlternatives_0_0 ) ) ;
    public final void rule__Code__DeclsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2803:1: ( ( ( rule__Code__DeclsAlternatives_0_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2804:1: ( ( rule__Code__DeclsAlternatives_0_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2804:1: ( ( rule__Code__DeclsAlternatives_0_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2805:1: ( rule__Code__DeclsAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getDeclsAlternatives_0_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2806:1: ( rule__Code__DeclsAlternatives_0_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2806:2: rule__Code__DeclsAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Code__DeclsAlternatives_0_0_in_rule__Code__DeclsAssignment_05624);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2815:1: rule__Code__StmtsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Code__StmtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2819:1: ( ( ruleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2820:1: ( ruleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2820:1: ( ruleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2821:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeAccess().getStmtsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Code__StmtsAssignment_15657);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2830:1: rule__SingleStatement__TdAssignment_0 : ( ruleTypeDecl ) ;
    public final void rule__SingleStatement__TdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2834:1: ( ( ruleTypeDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2835:1: ( ruleTypeDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2835:1: ( ruleTypeDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2836:1: ruleTypeDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__SingleStatement__TdAssignment_05688);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2845:1: rule__SingleStatement__VdAssignment_1 : ( ruleVarDecl ) ;
    public final void rule__SingleStatement__VdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2849:1: ( ( ruleVarDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2850:1: ( ruleVarDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2850:1: ( ruleVarDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2851:1: ruleVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_rule__SingleStatement__VdAssignment_15719);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2860:1: rule__SingleStatement__VinAssignment_2 : ( ruleVarInst ) ;
    public final void rule__SingleStatement__VinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2864:1: ( ( ruleVarInst ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2865:1: ( ruleVarInst )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2865:1: ( ruleVarInst )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2866:1: ruleVarInst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getVinVarInstParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_rule__SingleStatement__VinAssignment_25750);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2875:1: rule__SingleStatement__IfstAssignment_3 : ( ruleifte ) ;
    public final void rule__SingleStatement__IfstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2879:1: ( ( ruleifte ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2880:1: ( ruleifte )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2880:1: ( ruleifte )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2881:1: ruleifte
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStatementAccess().getIfstIfteParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleifte_in_rule__SingleStatement__IfstAssignment_35781);
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


    // $ANTLR start "rule__Statement__VinAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2890:1: rule__Statement__VinAssignment_0 : ( ruleVarInst ) ;
    public final void rule__Statement__VinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2894:1: ( ( ruleVarInst ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2895:1: ( ruleVarInst )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2895:1: ( ruleVarInst )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2896:1: ruleVarInst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_05812);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2905:1: rule__Statement__IfstAssignment_1 : ( ruleifte ) ;
    public final void rule__Statement__IfstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2909:1: ( ( ruleifte ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2910:1: ( ruleifte )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2910:1: ( ruleifte )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2911:1: ruleifte
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleifte_in_rule__Statement__IfstAssignment_15843);
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


    // $ANTLR start "rule__VarDecl__NameAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2920:1: rule__VarDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2924:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2925:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2925:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2926:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_15874); if (state.failed) return ;
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


    // $ANTLR start "rule__VarDecl__PtAssignment_3_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2935:1: rule__VarDecl__PtAssignment_3_0 : ( rulePType ) ;
    public final void rule__VarDecl__PtAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2939:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2940:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2940:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2941:1: rulePType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_3_05905);
            rulePType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__VarDecl__PtAssignment_3_0"


    // $ANTLR start "rule__VarDecl__TdAssignment_3_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2950:1: rule__VarDecl__TdAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__TdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2954:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2955:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2955:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2956:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2957:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_3_15940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getTdTypeDeclIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__VarDecl__TdAssignment_3_1"


    // $ANTLR start "rule__PType__TypeAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2969:1: rule__PType__TypeAssignment_0 : ( RULE_INTTYPE ) ;
    public final void rule__PType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2973:1: ( ( RULE_INTTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2974:1: ( RULE_INTTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2974:1: ( RULE_INTTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2975:1: RULE_INTTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_05975); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2984:1: rule__PType__TypeAssignment_1 : ( RULE_STRTYPE ) ;
    public final void rule__PType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2988:1: ( ( RULE_STRTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2989:1: ( RULE_STRTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2989:1: ( RULE_STRTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2990:1: RULE_STRTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_16006); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2999:1: rule__TypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3003:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3004:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3004:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3005:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_16037); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3014:1: rule__TypeDecl__TpAssignment_3 : ( rulePType ) ;
    public final void rule__TypeDecl__TpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3018:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3019:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3019:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3020:1: rulePType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_36068);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3029:1: rule__VarInst__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarInst__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3033:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3034:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3034:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3035:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3036:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3037:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getNameVarDeclIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_06103); if (state.failed) return ;
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3048:1: rule__VarInst__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__VarInst__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3052:1: ( ( ruleExpression ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3053:1: ( ruleExpression )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3053:1: ( ruleExpression )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3054:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VarInst__ExpAssignment_26138);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3063:1: rule__Concat__RightAssignment_1_2 : ( ruleStringLiteral ) ;
    public final void rule__Concat__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3067:1: ( ( ruleStringLiteral ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3068:1: ( ruleStringLiteral )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3068:1: ( ruleStringLiteral )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3069:1: ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_26169);
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


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3078:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3082:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3083:1: ( RULE_STRING )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3083:1: ( RULE_STRING )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3084:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6200); if (state.failed) return ;
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


    // $ANTLR start "rule__Subtraction__RightAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3093:1: rule__Subtraction__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Subtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3097:1: ( ( ruleAddition ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3098:1: ( ruleAddition )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3098:1: ( ruleAddition )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3099:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_26231);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3108:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3112:1: ( ( ruleMultiplication ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3113:1: ( ruleMultiplication )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3113:1: ( ruleMultiplication )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3114:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26262);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3123:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3127:1: ( ( ruleDivision ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3128:1: ( ruleDivision )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3128:1: ( ruleDivision )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3129:1: ruleDivision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_26293);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3138:1: rule__Division__RightAssignment_1_2 : ( rulePowerOf ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3142:1: ( ( rulePowerOf ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3143:1: ( rulePowerOf )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3143:1: ( rulePowerOf )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3144:1: rulePowerOf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_26324);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3153:1: rule__PowerOf__RightAssignment_1_2 : ( ruleBasicIntExp ) ;
    public final void rule__PowerOf__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3157:1: ( ( ruleBasicIntExp ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3158:1: ( ruleBasicIntExp )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3158:1: ( ruleBasicIntExp )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3159:1: ruleBasicIntExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleBasicIntExp_in_rule__PowerOf__RightAssignment_1_26355);
            ruleBasicIntExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3168:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3172:1: ( ( RULE_INT ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3173:1: ( RULE_INT )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3173:1: ( RULE_INT )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3174:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment6386); if (state.failed) return ;
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


    // $ANTLR start "rule__Expression__StrexpAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3183:1: rule__Expression__StrexpAssignment_0 : ( ruleConcat ) ;
    public final void rule__Expression__StrexpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3187:1: ( ( ruleConcat ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3188:1: ( ruleConcat )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3188:1: ( ruleConcat )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3189:1: ruleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getStrexpConcatParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleConcat_in_rule__Expression__StrexpAssignment_06417);
            ruleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getStrexpConcatParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Expression__StrexpAssignment_0"


    // $ANTLR start "rule__Expression__InexpAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3198:1: rule__Expression__InexpAssignment_1 : ( ruleSubtraction ) ;
    public final void rule__Expression__InexpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3202:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3203:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3203:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3204:1: ruleSubtraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getInexpSubtractionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_rule__Expression__InexpAssignment_16448);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getInexpSubtractionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Expression__InexpAssignment_1"


    // $ANTLR start "rule__Expression__VexAssignment_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3213:1: rule__Expression__VexAssignment_2 : ( ruleVarExps ) ;
    public final void rule__Expression__VexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3217:1: ( ( ruleVarExps ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3218:1: ( ruleVarExps )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3218:1: ( ruleVarExps )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3219:1: ruleVarExps
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getVexVarExpsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVarExps_in_rule__Expression__VexAssignment_26479);
            ruleVarExps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getVexVarExpsParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Expression__VexAssignment_2"


    // $ANTLR start "rule__VarExps__VarexAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3228:1: rule__VarExps__VarexAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarExps__VarexAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3232:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3233:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3233:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3234:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVarexVarDeclCrossReference_0()); 
            }
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3235:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3236:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpsAccess().getVarexVarDeclIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarExps__VarexAssignment6514); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVarexVarDeclIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpsAccess().getVarexVarDeclCrossReference_0()); 
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
    // $ANTLR end "rule__VarExps__VarexAssignment"


    // $ANTLR start "rule__Ifte__CondAssignment_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3247:1: rule__Ifte__CondAssignment_1 : ( ruleSubtraction ) ;
    public final void rule__Ifte__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3251:1: ( ( ruleSubtraction ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3252:1: ( ruleSubtraction )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3252:1: ( ruleSubtraction )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3253:1: ruleSubtraction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getCondSubtractionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubtraction_in_rule__Ifte__CondAssignment_16549);
            ruleSubtraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfteAccess().getCondSubtractionParserRuleCall_1_0()); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3262:1: rule__Ifte__StmtsAssignment_2_0 : ( ruleSingleStatement ) ;
    public final void rule__Ifte__StmtsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3266:1: ( ( ruleSingleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3267:1: ( ruleSingleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3267:1: ( ruleSingleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3268:1: ruleSingleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_rule__Ifte__StmtsAssignment_2_06580);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3277:1: rule__Ifte__StmtsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__Ifte__StmtsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3281:1: ( ( ruleCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3282:1: ( ruleCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3282:1: ( ruleCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3283:1: ruleCode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCode_in_rule__Ifte__StmtsAssignment_2_1_16611);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3292:1: rule__Ifte__EstmtsAssignment_3_1_0 : ( ruleSingleStatement ) ;
    public final void rule__Ifte__EstmtsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3296:1: ( ( ruleSingleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3297:1: ( ruleSingleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3297:1: ( ruleSingleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3298:1: ruleSingleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleSingleStatement_in_rule__Ifte__EstmtsAssignment_3_1_06642);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3307:1: rule__Ifte__EstmtsAssignment_3_1_1_1 : ( ruleCode ) ;
    public final void rule__Ifte__EstmtsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3311:1: ( ( ruleCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3312:1: ( ruleCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3312:1: ( ruleCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:3313:1: ruleCode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCode_in_rule__Ifte__EstmtsAssignment_3_1_1_16673);
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

    // $ANTLR start synpred21_InternalGACL
    public final void synpred21_InternalGACL_fragment() throws RecognitionException {   
        // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2525:2: ( rule__Ifte__Group_3__0 )
        // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:2525:2: rule__Ifte__Group_3__0
        {
        pushFollow(FOLLOW_rule__Ifte__Group_3__0_in_synpred21_InternalGACL5081);
        rule__Ifte__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalGACL

    // Delegated rules

    public final boolean synpred21_InternalGACL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGACL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleConcat_in_entryRuleConcat487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcat494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0_in_ruleConcat520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStringExp_in_entryRuleBasicStringExp547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStringExp554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleBasicStringExp580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0_in_ruleSubtraction699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0_in_ruleDivision879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_entryRulePowerOf906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerOf913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0_in_rulePowerOf939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_entryRuleBasicIntExp966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicIntExp973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Alternatives_in_ruleBasicIntExp999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_entryRuleVarExps1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExps1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarExps__VarexAssignment_in_ruleVarExps1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_entryRuleifte1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifte1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__0_in_ruleifte1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Code__DeclsAlternatives_0_01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Code__DeclsAlternatives_0_01292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__TdAssignment_0_in_rule__SingleStatement__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__VdAssignment_1_in_rule__SingleStatement__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__VinAssignment_2_in_rule__SingleStatement__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__IfstAssignment_3_in_rule__SingleStatement__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VinAssignment_0_in_rule__Statement__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IfstAssignment_1_in_rule__Statement__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__PtAssignment_3_0_in_rule__VarDecl__Alternatives_31462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TdAssignment_3_1_in_rule__VarDecl__Alternatives_31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__BasicIntExp__Alternatives1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__0_in_rule__BasicIntExp__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__StrexpAssignment_0_in_rule__Expression__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__InexpAssignment_1_in_rule__Expression__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__VexAssignment_2_in_rule__Expression__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__StmtsAssignment_2_0_in_rule__Ifte__Alternatives_21683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__0_in_rule__Ifte__Alternatives_21701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__EstmtsAssignment_3_1_0_in_rule__Ifte__Alternatives_3_11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__0_in_rule__Ifte__Alternatives_3_11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01783 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__DeclsAssignment_0_in_rule__Code__Group__0__Impl1813 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__StmtsAssignment_1_in_rule__Code__Group__1__Impl1871 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VarDecl__Group__0__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11968 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22028 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarDecl__Group__2__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32090 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Alternatives_3_in_rule__VarDecl__Group__3__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__42153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__52211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarDecl__Group__5__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group__0__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12344 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__NameAssignment_1_in_rule__TypeDecl__Group__1__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22404 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group__2__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32466 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TpAssignment_3_in_rule__TypeDecl__Group__3__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Group__4__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__0__Impl_in_rule__VarInst__Group__02595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1_in_rule__VarInst__Group__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__NameAssignment_0_in_rule__VarInst__Group__0__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__1__Impl_in_rule__VarInst__Group__12655 = new BitSet(new long[]{0x0000000001000190L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2_in_rule__VarInst__Group__12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarInst__Group__1__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__2__Impl_in_rule__VarInst__Group__22717 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarInst__Group__3_in_rule__VarInst__Group__22720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__ExpAssignment_2_in_rule__VarInst__Group__2__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInst__Group__3__Impl_in_rule__VarInst__Group__32777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarInst__Group__3__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__0__Impl_in_rule__Concat__Group__02844 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group__1_in_rule__Concat__Group__02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStringExp_in_rule__Concat__Group__0__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group__1__Impl_in_rule__Concat__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0_in_rule__Concat__Group__1__Impl2930 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__0__Impl_in_rule__Concat__Group_1__02965 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1_in_rule__Concat__Group_1__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__1__Impl_in_rule__Concat__Group_1__13026 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2_in_rule__Concat__Group_1__13029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Concat__Group_1__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__Group_1__2__Impl_in_rule__Concat__Group_1__23088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concat__RightAssignment_1_2_in_rule__Concat__Group_1__2__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__0__Impl_in_rule__Subtraction__Group__03151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1_in_rule__Subtraction__Group__03154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__Group__0__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group__1__Impl_in_rule__Subtraction__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0_in_rule__Subtraction__Group__1__Impl3237 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__0__Impl_in_rule__Subtraction__Group_1__03272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1_in_rule__Subtraction__Group_1__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__1__Impl_in_rule__Subtraction__Group_1__13333 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2_in_rule__Subtraction__Group_1__13336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subtraction__Group_1__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__Group_1__2__Impl_in_rule__Subtraction__Group_1__23395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subtraction__RightAssignment_1_2_in_rule__Subtraction__Group_1__2__Impl3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03458 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3544 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03579 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13640 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__Group_1__1__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03765 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__Group__0__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3851 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03886 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13947 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiplication__Group_1__1__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__24009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__04072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group__1_in_rule__Division__Group__04075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__Group__0__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__14131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0_in_rule__Division__Group__1__Impl4158 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__0__Impl_in_rule__Division__Group_1__04193 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1_in_rule__Division__Group_1__04196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__1__Impl_in_rule__Division__Group_1__14254 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2_in_rule__Division__Group_1__14257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Division__Group_1__1__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__Group_1__2__Impl_in_rule__Division__Group_1__24316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Division__RightAssignment_1_2_in_rule__Division__Group_1__2__Impl4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__0__Impl_in_rule__PowerOf__Group__04379 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1_in_rule__PowerOf__Group__04382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rule__PowerOf__Group__0__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group__1__Impl_in_rule__PowerOf__Group__14438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0_in_rule__PowerOf__Group__1__Impl4465 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__0__Impl_in_rule__PowerOf__Group_1__04500 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1_in_rule__PowerOf__Group_1__04503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__1__Impl_in_rule__PowerOf__Group_1__14561 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2_in_rule__PowerOf__Group_1__14564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PowerOf__Group_1__1__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__Group_1__2__Impl_in_rule__PowerOf__Group_1__24623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowerOf__RightAssignment_1_2_in_rule__PowerOf__Group_1__2__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__0__Impl_in_rule__BasicIntExp__Group_1__04686 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__1_in_rule__BasicIntExp__Group_1__04689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BasicIntExp__Group_1__0__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__1__Impl_in_rule__BasicIntExp__Group_1__14748 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__2_in_rule__BasicIntExp__Group_1__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__BasicIntExp__Group_1__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicIntExp__Group_1__2__Impl_in_rule__BasicIntExp__Group_1__24807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BasicIntExp__Group_1__2__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__0__Impl_in_rule__Ifte__Group__04872 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_rule__Ifte__Group__1_in_rule__Ifte__Group__04875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Ifte__Group__0__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__1__Impl_in_rule__Ifte__Group__14934 = new BitSet(new long[]{0x000000000C012010L});
    public static final BitSet FOLLOW_rule__Ifte__Group__2_in_rule__Ifte__Group__14937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__CondAssignment_1_in_rule__Ifte__Group__1__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__2__Impl_in_rule__Ifte__Group__24994 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group__3_in_rule__Ifte__Group__24997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Alternatives_2_in_rule__Ifte__Group__2__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group__3__Impl_in_rule__Ifte__Group__35054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0_in_rule__Ifte__Group__3__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__0__Impl_in_rule__Ifte__Group_2_1__05120 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__1_in_rule__Ifte__Group_2_1__05123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ifte__Group_2_1__0__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__1__Impl_in_rule__Ifte__Group_2_1__15182 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__2_in_rule__Ifte__Group_2_1__15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__StmtsAssignment_2_1_1_in_rule__Ifte__Group_2_1__1__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_2_1__2__Impl_in_rule__Ifte__Group_2_1__25242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ifte__Group_2_1__2__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0__Impl_in_rule__Ifte__Group_3__05307 = new BitSet(new long[]{0x000000000C012010L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__1_in_rule__Ifte__Group_3__05310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Ifte__Group_3__0__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__1__Impl_in_rule__Ifte__Group_3__15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Alternatives_3_1_in_rule__Ifte__Group_3__1__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__0__Impl_in_rule__Ifte__Group_3_1_1__05432 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__1_in_rule__Ifte__Group_3_1_1__05435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ifte__Group_3_1_1__0__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__1__Impl_in_rule__Ifte__Group_3_1_1__15494 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__2_in_rule__Ifte__Group_3_1_1__15497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__EstmtsAssignment_3_1_1_1_in_rule__Ifte__Group_3_1_1__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3_1_1__2__Impl_in_rule__Ifte__Group_3_1_1__25554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ifte__Group_3_1_1__2__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__DeclsAlternatives_0_0_in_rule__Code__DeclsAssignment_05624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Code__StmtsAssignment_15657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__SingleStatement__TdAssignment_05688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__SingleStatement__VdAssignment_15719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_rule__SingleStatement__VinAssignment_25750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_rule__SingleStatement__IfstAssignment_35781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInst_in_rule__Statement__VinAssignment_05812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifte_in_rule__Statement__IfstAssignment_15843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_15874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__VarDecl__PtAssignment_3_05905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__TdAssignment_3_15940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_05975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_16006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__NameAssignment_16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__TypeDecl__TpAssignment_36068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInst__NameAssignment_06103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VarInst__ExpAssignment_26138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Concat__RightAssignment_1_26169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Subtraction__RightAssignment_1_26231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_rule__Multiplication__RightAssignment_1_26293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerOf_in_rule__Division__RightAssignment_1_26324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicIntExp_in_rule__PowerOf__RightAssignment_1_26355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcat_in_rule__Expression__StrexpAssignment_06417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__Expression__InexpAssignment_16448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExps_in_rule__Expression__VexAssignment_26479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarExps__VarexAssignment6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_rule__Ifte__CondAssignment_16549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Ifte__StmtsAssignment_2_06580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Ifte__StmtsAssignment_2_1_16611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Ifte__EstmtsAssignment_3_1_06642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Ifte__EstmtsAssignment_3_1_1_16673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifte__Group_3__0_in_synpred21_InternalGACL5081 = new BitSet(new long[]{0x0000000000000002L});

}