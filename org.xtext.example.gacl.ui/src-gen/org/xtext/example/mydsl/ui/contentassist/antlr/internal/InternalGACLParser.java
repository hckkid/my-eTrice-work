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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTTYPE", "RULE_STRTYPE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'Type'", "'TYPE'", "';'", "'='", "'{'", "'}'", "','", "':'", "'('", "')'"
    };
    public static final int RULE_ID=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTTYPE=4;
    public static final int RULE_STRTYPE=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
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




    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:61:1: ( ruleProgram EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:69:1: ruleProgram : ( ( rule__Program__StmtsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:73:2: ( ( ( rule__Program__StmtsAssignment )* ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:74:1: ( ( rule__Program__StmtsAssignment )* )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:74:1: ( ( rule__Program__StmtsAssignment )* )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:75:1: ( rule__Program__StmtsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStmtsAssignment()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:76:1: ( rule__Program__StmtsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:76:2: rule__Program__StmtsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__StmtsAssignment_in_ruleProgram94);
            	    rule__Program__StmtsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStmtsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:97:1: ruleStatement : ( ruleTypeDecl ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:101:2: ( ( ruleTypeDecl ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:102:1: ( ruleTypeDecl )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:102:1: ( ruleTypeDecl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:103:1: ruleTypeDecl
            {
             before(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_ruleStatement155);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePType"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:116:1: entryRulePType : rulePType EOF ;
    public final void entryRulePType() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:117:1: ( rulePType EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:118:1: rulePType EOF
            {
             before(grammarAccess.getPTypeRule()); 
            pushFollow(FOLLOW_rulePType_in_entryRulePType181);
            rulePType();

            state._fsp--;

             after(grammarAccess.getPTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePType188); 

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:125:1: rulePType : ( ( rule__PType__Alternatives ) ) ;
    public final void rulePType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:129:2: ( ( ( rule__PType__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:130:1: ( ( rule__PType__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:130:1: ( ( rule__PType__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:131:1: ( rule__PType__Alternatives )
            {
             before(grammarAccess.getPTypeAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:132:1: ( rule__PType__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:132:2: rule__PType__Alternatives
            {
            pushFollow(FOLLOW_rule__PType__Alternatives_in_rulePType214);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:144:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:145:1: ( ruleTypeDecl EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:146:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl241);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl248); 

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:153:1: ruleTypeDecl : ( ( rule__TypeDecl__Alternatives ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:157:2: ( ( ( rule__TypeDecl__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:158:1: ( ( rule__TypeDecl__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:158:1: ( ( rule__TypeDecl__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:159:1: ( rule__TypeDecl__Alternatives )
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:160:1: ( rule__TypeDecl__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:160:2: rule__TypeDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeDecl__Alternatives_in_ruleTypeDecl274);
            rule__TypeDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuletypeCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:172:1: entryRuletypeCode : ruletypeCode EOF ;
    public final void entryRuletypeCode() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:173:1: ( ruletypeCode EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:174:1: ruletypeCode EOF
            {
             before(grammarAccess.getTypeCodeRule()); 
            pushFollow(FOLLOW_ruletypeCode_in_entryRuletypeCode301);
            ruletypeCode();

            state._fsp--;

             after(grammarAccess.getTypeCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeCode308); 

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
    // $ANTLR end "entryRuletypeCode"


    // $ANTLR start "ruletypeCode"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:181:1: ruletypeCode : ( ( rule__TypeCode__Alternatives ) ) ;
    public final void ruletypeCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:185:2: ( ( ( rule__TypeCode__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeCode__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeCode__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:187:1: ( rule__TypeCode__Alternatives )
            {
             before(grammarAccess.getTypeCodeAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:1: ( rule__TypeCode__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:2: rule__TypeCode__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeCode__Alternatives_in_ruletypeCode334);
            rule__TypeCode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeCodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeCode"


    // $ANTLR start "entryRuleelement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:200:1: entryRuleelement : ruleelement EOF ;
    public final void entryRuleelement() throws RecognitionException {
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:201:1: ( ruleelement EOF )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:202:1: ruleelement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleelement_in_entryRuleelement361);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement368); 

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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:209:1: ruleelement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleelement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:213:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:214:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:214:1: ( ( rule__Element__Alternatives ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:215:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:216:1: ( rule__Element__Alternatives )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:216:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleelement394);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement"


    // $ANTLR start "rule__PType__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:228:1: rule__PType__Alternatives : ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) );
    public final void rule__PType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:232:1: ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:233:1: ( ( rule__PType__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:233:1: ( ( rule__PType__TypeAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:234:1: ( rule__PType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:235:1: ( rule__PType__TypeAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:235:2: rule__PType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives430);
                    rule__PType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:239:6: ( ( rule__PType__TypeAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:239:6: ( ( rule__PType__TypeAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:240:1: ( rule__PType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:241:1: ( rule__PType__TypeAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:241:2: rule__PType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives448);
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


    // $ANTLR start "rule__TypeDecl__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:250:1: rule__TypeDecl__Alternatives : ( ( ( rule__TypeDecl__Group_0__0 ) ) | ( ( rule__TypeDecl__Group_1__0 ) ) );
    public final void rule__TypeDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:254:1: ( ( ( rule__TypeDecl__Group_0__0 ) ) | ( ( rule__TypeDecl__Group_1__0 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||(LA3_5>=17 && LA3_5<=18)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||(LA3_5>=17 && LA3_5<=18)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||(LA3_5>=17 && LA3_5<=18)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:255:1: ( ( rule__TypeDecl__Group_0__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:255:1: ( ( rule__TypeDecl__Group_0__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:256:1: ( rule__TypeDecl__Group_0__0 )
                    {
                     before(grammarAccess.getTypeDeclAccess().getGroup_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:1: ( rule__TypeDecl__Group_0__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:2: rule__TypeDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_0__0_in_rule__TypeDecl__Alternatives481);
                    rule__TypeDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:261:6: ( ( rule__TypeDecl__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:261:6: ( ( rule__TypeDecl__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:262:1: ( rule__TypeDecl__Group_1__0 )
                    {
                     before(grammarAccess.getTypeDeclAccess().getGroup_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:263:1: ( rule__TypeDecl__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:263:2: rule__TypeDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_1__0_in_rule__TypeDecl__Alternatives499);
                    rule__TypeDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDeclAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeDecl__Alternatives"


    // $ANTLR start "rule__TypeDecl__Alternatives_0_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:272:1: rule__TypeDecl__Alternatives_0_0 : ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) );
    public final void rule__TypeDecl__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:276:1: ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) )
            int alt4=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:277:1: ( 'type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:277:1: ( 'type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:278:1: 'type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__TypeDecl__Alternatives_0_0533); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:285:6: ( 'Type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:285:6: ( 'Type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:286:1: 'Type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__TypeDecl__Alternatives_0_0553); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:293:6: ( 'TYPE' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:293:6: ( 'TYPE' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:294:1: 'TYPE'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__TypeDecl__Alternatives_0_0573); 
                     after(grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()); 

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
    // $ANTLR end "rule__TypeDecl__Alternatives_0_0"


    // $ANTLR start "rule__TypeDecl__Alternatives_1_0_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:306:1: rule__TypeDecl__Alternatives_1_0_0 : ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) );
    public final void rule__TypeDecl__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:310:1: ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:311:1: ( 'type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:311:1: ( 'type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:312:1: 'type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__TypeDecl__Alternatives_1_0_0608); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:319:6: ( 'Type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:319:6: ( 'Type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:320:1: 'Type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__TypeDecl__Alternatives_1_0_0628); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:6: ( 'TYPE' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:327:6: ( 'TYPE' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:328:1: 'TYPE'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__TypeDecl__Alternatives_1_0_0648); 
                     after(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_0_2()); 

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
    // $ANTLR end "rule__TypeDecl__Alternatives_1_0_0"


    // $ANTLR start "rule__TypeCode__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:340:1: rule__TypeCode__Alternatives : ( ( ( rule__TypeCode__PrmAssignment_0 ) ) | ( ( rule__TypeCode__Group_1__0 ) ) );
    public final void rule__TypeCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:344:1: ( ( ( rule__TypeCode__PrmAssignment_0 ) ) | ( ( rule__TypeCode__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INTTYPE && LA6_0<=RULE_STRTYPE)) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:345:1: ( ( rule__TypeCode__PrmAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:345:1: ( ( rule__TypeCode__PrmAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:346:1: ( rule__TypeCode__PrmAssignment_0 )
                    {
                     before(grammarAccess.getTypeCodeAccess().getPrmAssignment_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:347:1: ( rule__TypeCode__PrmAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:347:2: rule__TypeCode__PrmAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeCode__PrmAssignment_0_in_rule__TypeCode__Alternatives682);
                    rule__TypeCode__PrmAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCodeAccess().getPrmAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:351:6: ( ( rule__TypeCode__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:351:6: ( ( rule__TypeCode__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:352:1: ( rule__TypeCode__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCodeAccess().getGroup_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:353:1: ( rule__TypeCode__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:353:2: rule__TypeCode__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeCode__Group_1__0_in_rule__TypeCode__Alternatives700);
                    rule__TypeCode__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeCode__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:362:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:366:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=RULE_INTTYPE && LA7_2<=RULE_STRTYPE)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RULE_ID) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==EOF||(LA7_5>=19 && LA7_5<=20)) ) {
                            alt7=1;
                        }
                        else if ( (LA7_5==22) ) {
                            alt7=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==22) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:367:1: ( ( rule__Element__Group_0__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:367:1: ( ( rule__Element__Group_0__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:368:1: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:369:1: ( rule__Element__Group_0__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:369:2: rule__Element__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_0__0_in_rule__Element__Alternatives733);
                    rule__Element__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:373:6: ( ( rule__Element__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:373:6: ( ( rule__Element__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:374:1: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:375:1: ( rule__Element__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:375:2: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_1__0_in_rule__Element__Alternatives751);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:379:6: ( ( rule__Element__Group_2__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:379:6: ( ( rule__Element__Group_2__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:380:1: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:381:1: ( rule__Element__Group_2__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:381:2: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_2__0_in_rule__Element__Alternatives769);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__TypeDecl__Group_0__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:392:1: rule__TypeDecl__Group_0__0 : rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1 ;
    public final void rule__TypeDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:396:1: ( rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:397:2: rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_0__0__Impl_in_rule__TypeDecl__Group_0__0800);
            rule__TypeDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_0__1_in_rule__TypeDecl__Group_0__0803);
            rule__TypeDecl__Group_0__1();

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
    // $ANTLR end "rule__TypeDecl__Group_0__0"


    // $ANTLR start "rule__TypeDecl__Group_0__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:404:1: rule__TypeDecl__Group_0__0__Impl : ( ( rule__TypeDecl__Alternatives_0_0 ) ) ;
    public final void rule__TypeDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:408:1: ( ( ( rule__TypeDecl__Alternatives_0_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:409:1: ( ( rule__TypeDecl__Alternatives_0_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:409:1: ( ( rule__TypeDecl__Alternatives_0_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:410:1: ( rule__TypeDecl__Alternatives_0_0 )
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives_0_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:1: ( rule__TypeDecl__Alternatives_0_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:411:2: rule__TypeDecl__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Alternatives_0_0_in_rule__TypeDecl__Group_0__0__Impl830);
            rule__TypeDecl__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_0__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_0__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:421:1: rule__TypeDecl__Group_0__1 : rule__TypeDecl__Group_0__1__Impl ;
    public final void rule__TypeDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:425:1: ( rule__TypeDecl__Group_0__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:426:2: rule__TypeDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_0__1__Impl_in_rule__TypeDecl__Group_0__1860);
            rule__TypeDecl__Group_0__1__Impl();

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
    // $ANTLR end "rule__TypeDecl__Group_0__1"


    // $ANTLR start "rule__TypeDecl__Group_0__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:432:1: rule__TypeDecl__Group_0__1__Impl : ( ( rule__TypeDecl__TypenameAssignment_0_1 ) ) ;
    public final void rule__TypeDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:436:1: ( ( ( rule__TypeDecl__TypenameAssignment_0_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:437:1: ( ( rule__TypeDecl__TypenameAssignment_0_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:437:1: ( ( rule__TypeDecl__TypenameAssignment_0_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:1: ( rule__TypeDecl__TypenameAssignment_0_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_0_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:1: ( rule__TypeDecl__TypenameAssignment_0_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:439:2: rule__TypeDecl__TypenameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__TypenameAssignment_0_1_in_rule__TypeDecl__Group_0__1__Impl887);
            rule__TypeDecl__TypenameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTypenameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_0__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:453:1: rule__TypeDecl__Group_1__0 : rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1 ;
    public final void rule__TypeDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:457:1: ( rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:458:2: rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__0__Impl_in_rule__TypeDecl__Group_1__0921);
            rule__TypeDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1__1_in_rule__TypeDecl__Group_1__0924);
            rule__TypeDecl__Group_1__1();

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
    // $ANTLR end "rule__TypeDecl__Group_1__0"


    // $ANTLR start "rule__TypeDecl__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:465:1: rule__TypeDecl__Group_1__0__Impl : ( ( rule__TypeDecl__Group_1_0__0 ) ) ;
    public final void rule__TypeDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:1: ( ( ( rule__TypeDecl__Group_1_0__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:470:1: ( ( rule__TypeDecl__Group_1_0__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:470:1: ( ( rule__TypeDecl__Group_1_0__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:471:1: ( rule__TypeDecl__Group_1_0__0 )
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:472:1: ( rule__TypeDecl__Group_1_0__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:472:2: rule__TypeDecl__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__0_in_rule__TypeDecl__Group_1__0__Impl951);
            rule__TypeDecl__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:482:1: rule__TypeDecl__Group_1__1 : rule__TypeDecl__Group_1__1__Impl ;
    public final void rule__TypeDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:486:1: ( rule__TypeDecl__Group_1__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:487:2: rule__TypeDecl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__1__Impl_in_rule__TypeDecl__Group_1__1981);
            rule__TypeDecl__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeDecl__Group_1__1"


    // $ANTLR start "rule__TypeDecl__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:493:1: rule__TypeDecl__Group_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__TypeDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:497:1: ( ( ( ';' )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:498:1: ( ( ';' )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:498:1: ( ( ';' )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:499:1: ( ';' )?
            {
             before(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:500:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:501:2: ';'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_1__1__Impl1010); 

                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1_0__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:516:1: rule__TypeDecl__Group_1_0__0 : rule__TypeDecl__Group_1_0__0__Impl rule__TypeDecl__Group_1_0__1 ;
    public final void rule__TypeDecl__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:520:1: ( rule__TypeDecl__Group_1_0__0__Impl rule__TypeDecl__Group_1_0__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:521:2: rule__TypeDecl__Group_1_0__0__Impl rule__TypeDecl__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__0__Impl_in_rule__TypeDecl__Group_1_0__01047);
            rule__TypeDecl__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__1_in_rule__TypeDecl__Group_1_0__01050);
            rule__TypeDecl__Group_1_0__1();

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
    // $ANTLR end "rule__TypeDecl__Group_1_0__0"


    // $ANTLR start "rule__TypeDecl__Group_1_0__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:528:1: rule__TypeDecl__Group_1_0__0__Impl : ( ( rule__TypeDecl__Alternatives_1_0_0 )? ) ;
    public final void rule__TypeDecl__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:532:1: ( ( ( rule__TypeDecl__Alternatives_1_0_0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:533:1: ( ( rule__TypeDecl__Alternatives_1_0_0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:533:1: ( ( rule__TypeDecl__Alternatives_1_0_0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:534:1: ( rule__TypeDecl__Alternatives_1_0_0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives_1_0_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:535:1: ( rule__TypeDecl__Alternatives_1_0_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=15)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:535:2: rule__TypeDecl__Alternatives_1_0_0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Alternatives_1_0_0_in_rule__TypeDecl__Group_1_0__0__Impl1077);
                    rule__TypeDecl__Alternatives_1_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1_0__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1_0__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:545:1: rule__TypeDecl__Group_1_0__1 : rule__TypeDecl__Group_1_0__1__Impl rule__TypeDecl__Group_1_0__2 ;
    public final void rule__TypeDecl__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:549:1: ( rule__TypeDecl__Group_1_0__1__Impl rule__TypeDecl__Group_1_0__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:550:2: rule__TypeDecl__Group_1_0__1__Impl rule__TypeDecl__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__1__Impl_in_rule__TypeDecl__Group_1_0__11108);
            rule__TypeDecl__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__2_in_rule__TypeDecl__Group_1_0__11111);
            rule__TypeDecl__Group_1_0__2();

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
    // $ANTLR end "rule__TypeDecl__Group_1_0__1"


    // $ANTLR start "rule__TypeDecl__Group_1_0__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:557:1: rule__TypeDecl__Group_1_0__1__Impl : ( ( rule__TypeDecl__TypenameAssignment_1_0_1 ) ) ;
    public final void rule__TypeDecl__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:561:1: ( ( ( rule__TypeDecl__TypenameAssignment_1_0_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:562:1: ( ( rule__TypeDecl__TypenameAssignment_1_0_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:562:1: ( ( rule__TypeDecl__TypenameAssignment_1_0_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:563:1: ( rule__TypeDecl__TypenameAssignment_1_0_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_0_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:564:1: ( rule__TypeDecl__TypenameAssignment_1_0_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:564:2: rule__TypeDecl__TypenameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__TypenameAssignment_1_0_1_in_rule__TypeDecl__Group_1_0__1__Impl1138);
            rule__TypeDecl__TypenameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1_0__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1_0__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:574:1: rule__TypeDecl__Group_1_0__2 : rule__TypeDecl__Group_1_0__2__Impl rule__TypeDecl__Group_1_0__3 ;
    public final void rule__TypeDecl__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:578:1: ( rule__TypeDecl__Group_1_0__2__Impl rule__TypeDecl__Group_1_0__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:579:2: rule__TypeDecl__Group_1_0__2__Impl rule__TypeDecl__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__2__Impl_in_rule__TypeDecl__Group_1_0__21168);
            rule__TypeDecl__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__3_in_rule__TypeDecl__Group_1_0__21171);
            rule__TypeDecl__Group_1_0__3();

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
    // $ANTLR end "rule__TypeDecl__Group_1_0__2"


    // $ANTLR start "rule__TypeDecl__Group_1_0__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:586:1: rule__TypeDecl__Group_1_0__2__Impl : ( ( '=' )? ) ;
    public final void rule__TypeDecl__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:590:1: ( ( ( '=' )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:591:1: ( ( '=' )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:591:1: ( ( '=' )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:592:1: ( '=' )?
            {
             before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_0_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:593:1: ( '=' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:594:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeDecl__Group_1_0__2__Impl1200); 

                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1_0__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1_0__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:605:1: rule__TypeDecl__Group_1_0__3 : rule__TypeDecl__Group_1_0__3__Impl ;
    public final void rule__TypeDecl__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:609:1: ( rule__TypeDecl__Group_1_0__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:610:2: rule__TypeDecl__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1_0__3__Impl_in_rule__TypeDecl__Group_1_0__31233);
            rule__TypeDecl__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__TypeDecl__Group_1_0__3"


    // $ANTLR start "rule__TypeDecl__Group_1_0__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:616:1: rule__TypeDecl__Group_1_0__3__Impl : ( ( rule__TypeDecl__TpcodeAssignment_1_0_3 ) ) ;
    public final void rule__TypeDecl__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:620:1: ( ( ( rule__TypeDecl__TpcodeAssignment_1_0_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:621:1: ( ( rule__TypeDecl__TpcodeAssignment_1_0_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:621:1: ( ( rule__TypeDecl__TpcodeAssignment_1_0_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:622:1: ( rule__TypeDecl__TpcodeAssignment_1_0_3 )
            {
             before(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_0_3()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:623:1: ( rule__TypeDecl__TpcodeAssignment_1_0_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:623:2: rule__TypeDecl__TpcodeAssignment_1_0_3
            {
            pushFollow(FOLLOW_rule__TypeDecl__TpcodeAssignment_1_0_3_in_rule__TypeDecl__Group_1_0__3__Impl1260);
            rule__TypeDecl__TpcodeAssignment_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1_0__3__Impl"


    // $ANTLR start "rule__TypeCode__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:641:1: rule__TypeCode__Group_1__0 : rule__TypeCode__Group_1__0__Impl rule__TypeCode__Group_1__1 ;
    public final void rule__TypeCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:645:1: ( rule__TypeCode__Group_1__0__Impl rule__TypeCode__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:646:2: rule__TypeCode__Group_1__0__Impl rule__TypeCode__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1__0__Impl_in_rule__TypeCode__Group_1__01298);
            rule__TypeCode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeCode__Group_1__1_in_rule__TypeCode__Group_1__01301);
            rule__TypeCode__Group_1__1();

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
    // $ANTLR end "rule__TypeCode__Group_1__0"


    // $ANTLR start "rule__TypeCode__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:653:1: rule__TypeCode__Group_1__0__Impl : ( '{' ) ;
    public final void rule__TypeCode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:657:1: ( ( '{' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:658:1: ( '{' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:658:1: ( '{' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:659:1: '{'
            {
             before(grammarAccess.getTypeCodeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__TypeCode__Group_1__0__Impl1329); 
             after(grammarAccess.getTypeCodeAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1__0__Impl"


    // $ANTLR start "rule__TypeCode__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:672:1: rule__TypeCode__Group_1__1 : rule__TypeCode__Group_1__1__Impl rule__TypeCode__Group_1__2 ;
    public final void rule__TypeCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:676:1: ( rule__TypeCode__Group_1__1__Impl rule__TypeCode__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:677:2: rule__TypeCode__Group_1__1__Impl rule__TypeCode__Group_1__2
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1__1__Impl_in_rule__TypeCode__Group_1__11360);
            rule__TypeCode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeCode__Group_1__2_in_rule__TypeCode__Group_1__11363);
            rule__TypeCode__Group_1__2();

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
    // $ANTLR end "rule__TypeCode__Group_1__1"


    // $ANTLR start "rule__TypeCode__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:684:1: rule__TypeCode__Group_1__1__Impl : ( ( rule__TypeCode__Group_1_1__0 ) ) ;
    public final void rule__TypeCode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:688:1: ( ( ( rule__TypeCode__Group_1_1__0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:689:1: ( ( rule__TypeCode__Group_1_1__0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:689:1: ( ( rule__TypeCode__Group_1_1__0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:690:1: ( rule__TypeCode__Group_1_1__0 )
            {
             before(grammarAccess.getTypeCodeAccess().getGroup_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:691:1: ( rule__TypeCode__Group_1_1__0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:691:2: rule__TypeCode__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1_1__0_in_rule__TypeCode__Group_1__1__Impl1390);
            rule__TypeCode__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeCodeAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1__1__Impl"


    // $ANTLR start "rule__TypeCode__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:701:1: rule__TypeCode__Group_1__2 : rule__TypeCode__Group_1__2__Impl ;
    public final void rule__TypeCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:705:1: ( rule__TypeCode__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:706:2: rule__TypeCode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1__2__Impl_in_rule__TypeCode__Group_1__21420);
            rule__TypeCode__Group_1__2__Impl();

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
    // $ANTLR end "rule__TypeCode__Group_1__2"


    // $ANTLR start "rule__TypeCode__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:712:1: rule__TypeCode__Group_1__2__Impl : ( '}' ) ;
    public final void rule__TypeCode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:716:1: ( ( '}' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:717:1: ( '}' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:717:1: ( '}' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:718:1: '}'
            {
             before(grammarAccess.getTypeCodeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,19,FOLLOW_19_in_rule__TypeCode__Group_1__2__Impl1448); 
             after(grammarAccess.getTypeCodeAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1__2__Impl"


    // $ANTLR start "rule__TypeCode__Group_1_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:737:1: rule__TypeCode__Group_1_1__0 : rule__TypeCode__Group_1_1__0__Impl rule__TypeCode__Group_1_1__1 ;
    public final void rule__TypeCode__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:741:1: ( rule__TypeCode__Group_1_1__0__Impl rule__TypeCode__Group_1_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:742:2: rule__TypeCode__Group_1_1__0__Impl rule__TypeCode__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1_1__0__Impl_in_rule__TypeCode__Group_1_1__01485);
            rule__TypeCode__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeCode__Group_1_1__1_in_rule__TypeCode__Group_1_1__01488);
            rule__TypeCode__Group_1_1__1();

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
    // $ANTLR end "rule__TypeCode__Group_1_1__0"


    // $ANTLR start "rule__TypeCode__Group_1_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:749:1: rule__TypeCode__Group_1_1__0__Impl : ( ( rule__TypeCode__ElementsAssignment_1_1_0 ) ) ;
    public final void rule__TypeCode__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:753:1: ( ( ( rule__TypeCode__ElementsAssignment_1_1_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:754:1: ( ( rule__TypeCode__ElementsAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:754:1: ( ( rule__TypeCode__ElementsAssignment_1_1_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:755:1: ( rule__TypeCode__ElementsAssignment_1_1_0 )
            {
             before(grammarAccess.getTypeCodeAccess().getElementsAssignment_1_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:756:1: ( rule__TypeCode__ElementsAssignment_1_1_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:756:2: rule__TypeCode__ElementsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__TypeCode__ElementsAssignment_1_1_0_in_rule__TypeCode__Group_1_1__0__Impl1515);
            rule__TypeCode__ElementsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeCodeAccess().getElementsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeCode__Group_1_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:766:1: rule__TypeCode__Group_1_1__1 : rule__TypeCode__Group_1_1__1__Impl ;
    public final void rule__TypeCode__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:770:1: ( rule__TypeCode__Group_1_1__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:771:2: rule__TypeCode__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1_1__1__Impl_in_rule__TypeCode__Group_1_1__11545);
            rule__TypeCode__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__TypeCode__Group_1_1__1"


    // $ANTLR start "rule__TypeCode__Group_1_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:777:1: rule__TypeCode__Group_1_1__1__Impl : ( ( rule__TypeCode__Group_1_1_1__0 )? ) ;
    public final void rule__TypeCode__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:781:1: ( ( ( rule__TypeCode__Group_1_1_1__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:782:1: ( ( rule__TypeCode__Group_1_1_1__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:782:1: ( ( rule__TypeCode__Group_1_1_1__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:783:1: ( rule__TypeCode__Group_1_1_1__0 )?
            {
             before(grammarAccess.getTypeCodeAccess().getGroup_1_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:784:1: ( rule__TypeCode__Group_1_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:784:2: rule__TypeCode__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeCode__Group_1_1_1__0_in_rule__TypeCode__Group_1_1__1__Impl1572);
                    rule__TypeCode__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeCodeAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypeCode__Group_1_1_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:798:1: rule__TypeCode__Group_1_1_1__0 : rule__TypeCode__Group_1_1_1__0__Impl rule__TypeCode__Group_1_1_1__1 ;
    public final void rule__TypeCode__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:802:1: ( rule__TypeCode__Group_1_1_1__0__Impl rule__TypeCode__Group_1_1_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:803:2: rule__TypeCode__Group_1_1_1__0__Impl rule__TypeCode__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1_1_1__0__Impl_in_rule__TypeCode__Group_1_1_1__01607);
            rule__TypeCode__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeCode__Group_1_1_1__1_in_rule__TypeCode__Group_1_1_1__01610);
            rule__TypeCode__Group_1_1_1__1();

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
    // $ANTLR end "rule__TypeCode__Group_1_1_1__0"


    // $ANTLR start "rule__TypeCode__Group_1_1_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:810:1: rule__TypeCode__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__TypeCode__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:814:1: ( ( ',' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:815:1: ( ',' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:815:1: ( ',' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:816:1: ','
            {
             before(grammarAccess.getTypeCodeAccess().getCommaKeyword_1_1_1_0()); 
            match(input,20,FOLLOW_20_in_rule__TypeCode__Group_1_1_1__0__Impl1638); 
             after(grammarAccess.getTypeCodeAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__TypeCode__Group_1_1_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:829:1: rule__TypeCode__Group_1_1_1__1 : rule__TypeCode__Group_1_1_1__1__Impl ;
    public final void rule__TypeCode__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:833:1: ( rule__TypeCode__Group_1_1_1__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:834:2: rule__TypeCode__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeCode__Group_1_1_1__1__Impl_in_rule__TypeCode__Group_1_1_1__11669);
            rule__TypeCode__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__TypeCode__Group_1_1_1__1"


    // $ANTLR start "rule__TypeCode__Group_1_1_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:840:1: rule__TypeCode__Group_1_1_1__1__Impl : ( ( rule__TypeCode__ElementsAssignment_1_1_1_1 ) ) ;
    public final void rule__TypeCode__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:844:1: ( ( ( rule__TypeCode__ElementsAssignment_1_1_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:845:1: ( ( rule__TypeCode__ElementsAssignment_1_1_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:845:1: ( ( rule__TypeCode__ElementsAssignment_1_1_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:846:1: ( rule__TypeCode__ElementsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getTypeCodeAccess().getElementsAssignment_1_1_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:847:1: ( rule__TypeCode__ElementsAssignment_1_1_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:847:2: rule__TypeCode__ElementsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__TypeCode__ElementsAssignment_1_1_1_1_in_rule__TypeCode__Group_1_1_1__1__Impl1696);
            rule__TypeCode__ElementsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeCodeAccess().getElementsAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Element__Group_0__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:861:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:865:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:866:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_rule__Element__Group_0__0__Impl_in_rule__Element__Group_0__01730);
            rule__Element__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_0__1_in_rule__Element__Group_0__01733);
            rule__Element__Group_0__1();

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
    // $ANTLR end "rule__Element__Group_0__0"


    // $ANTLR start "rule__Element__Group_0__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:873:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__ElemnameAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:877:1: ( ( ( rule__Element__ElemnameAssignment_0_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:878:1: ( ( rule__Element__ElemnameAssignment_0_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:878:1: ( ( rule__Element__ElemnameAssignment_0_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:879:1: ( rule__Element__ElemnameAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getElemnameAssignment_0_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:880:1: ( rule__Element__ElemnameAssignment_0_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:880:2: rule__Element__ElemnameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Element__ElemnameAssignment_0_0_in_rule__Element__Group_0__0__Impl1760);
            rule__Element__ElemnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getElemnameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__0__Impl"


    // $ANTLR start "rule__Element__Group_0__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:890:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:894:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:895:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
            {
            pushFollow(FOLLOW_rule__Element__Group_0__1__Impl_in_rule__Element__Group_0__11790);
            rule__Element__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_0__2_in_rule__Element__Group_0__11793);
            rule__Element__Group_0__2();

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
    // $ANTLR end "rule__Element__Group_0__1"


    // $ANTLR start "rule__Element__Group_0__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:902:1: rule__Element__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:906:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:907:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:907:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:908:1: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Element__Group_0__1__Impl1821); 
             after(grammarAccess.getElementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__1__Impl"


    // $ANTLR start "rule__Element__Group_0__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:921:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:925:1: ( rule__Element__Group_0__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:926:2: rule__Element__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_0__2__Impl_in_rule__Element__Group_0__21852);
            rule__Element__Group_0__2__Impl();

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
    // $ANTLR end "rule__Element__Group_0__2"


    // $ANTLR start "rule__Element__Group_0__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:932:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__TypenameAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:936:1: ( ( ( rule__Element__TypenameAssignment_0_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:937:1: ( ( rule__Element__TypenameAssignment_0_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:937:1: ( ( rule__Element__TypenameAssignment_0_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:938:1: ( rule__Element__TypenameAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getTypenameAssignment_0_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:939:1: ( rule__Element__TypenameAssignment_0_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:939:2: rule__Element__TypenameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Element__TypenameAssignment_0_2_in_rule__Element__Group_0__2__Impl1879);
            rule__Element__TypenameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getTypenameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__2__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:955:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:959:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:960:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_rule__Element__Group_1__0__Impl_in_rule__Element__Group_1__01915);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_1__1_in_rule__Element__Group_1__01918);
            rule__Element__Group_1__1();

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
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:967:1: rule__Element__Group_1__0__Impl : ( ( rule__Element__ElemnameAssignment_1_0 ) ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:971:1: ( ( ( rule__Element__ElemnameAssignment_1_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:972:1: ( ( rule__Element__ElemnameAssignment_1_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:972:1: ( ( rule__Element__ElemnameAssignment_1_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:973:1: ( rule__Element__ElemnameAssignment_1_0 )
            {
             before(grammarAccess.getElementAccess().getElemnameAssignment_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:974:1: ( rule__Element__ElemnameAssignment_1_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:974:2: rule__Element__ElemnameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Element__ElemnameAssignment_1_0_in_rule__Element__Group_1__0__Impl1945);
            rule__Element__ElemnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getElemnameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:984:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:988:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:989:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
            {
            pushFollow(FOLLOW_rule__Element__Group_1__1__Impl_in_rule__Element__Group_1__11975);
            rule__Element__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_1__2_in_rule__Element__Group_1__11978);
            rule__Element__Group_1__2();

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
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:996:1: rule__Element__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1000:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1001:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1001:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1002:1: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Element__Group_1__1__Impl2006); 
             after(grammarAccess.getElementAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1015:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1019:1: ( rule__Element__Group_1__2__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1020:2: rule__Element__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_1__2__Impl_in_rule__Element__Group_1__22037);
            rule__Element__Group_1__2__Impl();

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
    // $ANTLR end "rule__Element__Group_1__2"


    // $ANTLR start "rule__Element__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1026:1: rule__Element__Group_1__2__Impl : ( ( rule__Element__PrmtypeAssignment_1_2 ) ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1030:1: ( ( ( rule__Element__PrmtypeAssignment_1_2 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1031:1: ( ( rule__Element__PrmtypeAssignment_1_2 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1031:1: ( ( rule__Element__PrmtypeAssignment_1_2 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1032:1: ( rule__Element__PrmtypeAssignment_1_2 )
            {
             before(grammarAccess.getElementAccess().getPrmtypeAssignment_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1033:1: ( rule__Element__PrmtypeAssignment_1_2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1033:2: rule__Element__PrmtypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Element__PrmtypeAssignment_1_2_in_rule__Element__Group_1__2__Impl2064);
            rule__Element__PrmtypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getPrmtypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__2__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1049:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1053:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1054:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_rule__Element__Group_2__0__Impl_in_rule__Element__Group_2__02100);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2__1_in_rule__Element__Group_2__02103);
            rule__Element__Group_2__1();

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
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1061:1: rule__Element__Group_2__0__Impl : ( ( rule__Element__ElemnameAssignment_2_0 ) ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1065:1: ( ( ( rule__Element__ElemnameAssignment_2_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1066:1: ( ( rule__Element__ElemnameAssignment_2_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1066:1: ( ( rule__Element__ElemnameAssignment_2_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1067:1: ( rule__Element__ElemnameAssignment_2_0 )
            {
             before(grammarAccess.getElementAccess().getElemnameAssignment_2_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1068:1: ( rule__Element__ElemnameAssignment_2_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1068:2: rule__Element__ElemnameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Element__ElemnameAssignment_2_0_in_rule__Element__Group_2__0__Impl2130);
            rule__Element__ElemnameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getElemnameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1078:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl rule__Element__Group_2__2 ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1082:1: ( rule__Element__Group_2__1__Impl rule__Element__Group_2__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1083:2: rule__Element__Group_2__1__Impl rule__Element__Group_2__2
            {
            pushFollow(FOLLOW_rule__Element__Group_2__1__Impl_in_rule__Element__Group_2__12160);
            rule__Element__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2__2_in_rule__Element__Group_2__12163);
            rule__Element__Group_2__2();

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
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1090:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__Group_2_1__0 )? ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1094:1: ( ( ( rule__Element__Group_2_1__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1095:1: ( ( rule__Element__Group_2_1__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1095:1: ( ( rule__Element__Group_2_1__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1096:1: ( rule__Element__Group_2_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_2_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1097:1: ( rule__Element__Group_2_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1097:2: rule__Element__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_2_1__0_in_rule__Element__Group_2__1__Impl2190);
                    rule__Element__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__Element__Group_2__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1107:1: rule__Element__Group_2__2 : rule__Element__Group_2__2__Impl rule__Element__Group_2__3 ;
    public final void rule__Element__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1111:1: ( rule__Element__Group_2__2__Impl rule__Element__Group_2__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1112:2: rule__Element__Group_2__2__Impl rule__Element__Group_2__3
            {
            pushFollow(FOLLOW_rule__Element__Group_2__2__Impl_in_rule__Element__Group_2__22221);
            rule__Element__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2__3_in_rule__Element__Group_2__22224);
            rule__Element__Group_2__3();

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
    // $ANTLR end "rule__Element__Group_2__2"


    // $ANTLR start "rule__Element__Group_2__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1119:1: rule__Element__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Element__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1123:1: ( ( '(' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1124:1: ( '(' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1124:1: ( '(' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1125:1: '('
            {
             before(grammarAccess.getElementAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_22_in_rule__Element__Group_2__2__Impl2252); 
             after(grammarAccess.getElementAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__2__Impl"


    // $ANTLR start "rule__Element__Group_2__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1138:1: rule__Element__Group_2__3 : rule__Element__Group_2__3__Impl rule__Element__Group_2__4 ;
    public final void rule__Element__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1142:1: ( rule__Element__Group_2__3__Impl rule__Element__Group_2__4 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1143:2: rule__Element__Group_2__3__Impl rule__Element__Group_2__4
            {
            pushFollow(FOLLOW_rule__Element__Group_2__3__Impl_in_rule__Element__Group_2__32283);
            rule__Element__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2__4_in_rule__Element__Group_2__32286);
            rule__Element__Group_2__4();

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
    // $ANTLR end "rule__Element__Group_2__3"


    // $ANTLR start "rule__Element__Group_2__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1150:1: rule__Element__Group_2__3__Impl : ( ( rule__Element__Group_2_3__0 )? ) ;
    public final void rule__Element__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1154:1: ( ( ( rule__Element__Group_2_3__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1155:1: ( ( rule__Element__Group_2_3__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1155:1: ( ( rule__Element__Group_2_3__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1156:1: ( rule__Element__Group_2_3__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_2_3()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1157:1: ( rule__Element__Group_2_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1157:2: rule__Element__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_2_3__0_in_rule__Element__Group_2__3__Impl2313);
                    rule__Element__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__3__Impl"


    // $ANTLR start "rule__Element__Group_2__4"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1167:1: rule__Element__Group_2__4 : rule__Element__Group_2__4__Impl ;
    public final void rule__Element__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1171:1: ( rule__Element__Group_2__4__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1172:2: rule__Element__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_2__4__Impl_in_rule__Element__Group_2__42344);
            rule__Element__Group_2__4__Impl();

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
    // $ANTLR end "rule__Element__Group_2__4"


    // $ANTLR start "rule__Element__Group_2__4__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1178:1: rule__Element__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Element__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1182:1: ( ( ')' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1183:1: ( ')' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1183:1: ( ')' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1184:1: ')'
            {
             before(grammarAccess.getElementAccess().getRightParenthesisKeyword_2_4()); 
            match(input,23,FOLLOW_23_in_rule__Element__Group_2__4__Impl2372); 
             after(grammarAccess.getElementAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__4__Impl"


    // $ANTLR start "rule__Element__Group_2_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1207:1: rule__Element__Group_2_1__0 : rule__Element__Group_2_1__0__Impl rule__Element__Group_2_1__1 ;
    public final void rule__Element__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1211:1: ( rule__Element__Group_2_1__0__Impl rule__Element__Group_2_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1212:2: rule__Element__Group_2_1__0__Impl rule__Element__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Element__Group_2_1__0__Impl_in_rule__Element__Group_2_1__02413);
            rule__Element__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2_1__1_in_rule__Element__Group_2_1__02416);
            rule__Element__Group_2_1__1();

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
    // $ANTLR end "rule__Element__Group_2_1__0"


    // $ANTLR start "rule__Element__Group_2_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1219:1: rule__Element__Group_2_1__0__Impl : ( ':' ) ;
    public final void rule__Element__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1223:1: ( ( ':' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1224:1: ( ':' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1224:1: ( ':' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1225:1: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_2_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Element__Group_2_1__0__Impl2444); 
             after(grammarAccess.getElementAccess().getColonKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_1__0__Impl"


    // $ANTLR start "rule__Element__Group_2_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1238:1: rule__Element__Group_2_1__1 : rule__Element__Group_2_1__1__Impl ;
    public final void rule__Element__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1242:1: ( rule__Element__Group_2_1__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1243:2: rule__Element__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_2_1__1__Impl_in_rule__Element__Group_2_1__12475);
            rule__Element__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2_1__1"


    // $ANTLR start "rule__Element__Group_2_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1249:1: rule__Element__Group_2_1__1__Impl : ( ( rule__Element__TypenameAssignment_2_1_1 ) ) ;
    public final void rule__Element__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1253:1: ( ( ( rule__Element__TypenameAssignment_2_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1254:1: ( ( rule__Element__TypenameAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1254:1: ( ( rule__Element__TypenameAssignment_2_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1255:1: ( rule__Element__TypenameAssignment_2_1_1 )
            {
             before(grammarAccess.getElementAccess().getTypenameAssignment_2_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1256:1: ( rule__Element__TypenameAssignment_2_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1256:2: rule__Element__TypenameAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Element__TypenameAssignment_2_1_1_in_rule__Element__Group_2_1__1__Impl2502);
            rule__Element__TypenameAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getTypenameAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_1__1__Impl"


    // $ANTLR start "rule__Element__Group_2_3__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1270:1: rule__Element__Group_2_3__0 : rule__Element__Group_2_3__0__Impl rule__Element__Group_2_3__1 ;
    public final void rule__Element__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1274:1: ( rule__Element__Group_2_3__0__Impl rule__Element__Group_2_3__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1275:2: rule__Element__Group_2_3__0__Impl rule__Element__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Element__Group_2_3__0__Impl_in_rule__Element__Group_2_3__02536);
            rule__Element__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2_3__1_in_rule__Element__Group_2_3__02539);
            rule__Element__Group_2_3__1();

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
    // $ANTLR end "rule__Element__Group_2_3__0"


    // $ANTLR start "rule__Element__Group_2_3__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1282:1: rule__Element__Group_2_3__0__Impl : ( ( rule__Element__ArgsAssignment_2_3_0 ) ) ;
    public final void rule__Element__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1286:1: ( ( ( rule__Element__ArgsAssignment_2_3_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1287:1: ( ( rule__Element__ArgsAssignment_2_3_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1287:1: ( ( rule__Element__ArgsAssignment_2_3_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1288:1: ( rule__Element__ArgsAssignment_2_3_0 )
            {
             before(grammarAccess.getElementAccess().getArgsAssignment_2_3_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1289:1: ( rule__Element__ArgsAssignment_2_3_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1289:2: rule__Element__ArgsAssignment_2_3_0
            {
            pushFollow(FOLLOW_rule__Element__ArgsAssignment_2_3_0_in_rule__Element__Group_2_3__0__Impl2566);
            rule__Element__ArgsAssignment_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getArgsAssignment_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_3__0__Impl"


    // $ANTLR start "rule__Element__Group_2_3__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1299:1: rule__Element__Group_2_3__1 : rule__Element__Group_2_3__1__Impl ;
    public final void rule__Element__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1303:1: ( rule__Element__Group_2_3__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1304:2: rule__Element__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_2_3__1__Impl_in_rule__Element__Group_2_3__12596);
            rule__Element__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2_3__1"


    // $ANTLR start "rule__Element__Group_2_3__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1310:1: rule__Element__Group_2_3__1__Impl : ( ( rule__Element__Group_2_3_1__0 )? ) ;
    public final void rule__Element__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1314:1: ( ( ( rule__Element__Group_2_3_1__0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1315:1: ( ( rule__Element__Group_2_3_1__0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1315:1: ( ( rule__Element__Group_2_3_1__0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1316:1: ( rule__Element__Group_2_3_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_2_3_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1317:1: ( rule__Element__Group_2_3_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1317:2: rule__Element__Group_2_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_2_3_1__0_in_rule__Element__Group_2_3__1__Impl2623);
                    rule__Element__Group_2_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_3__1__Impl"


    // $ANTLR start "rule__Element__Group_2_3_1__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1331:1: rule__Element__Group_2_3_1__0 : rule__Element__Group_2_3_1__0__Impl rule__Element__Group_2_3_1__1 ;
    public final void rule__Element__Group_2_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1335:1: ( rule__Element__Group_2_3_1__0__Impl rule__Element__Group_2_3_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1336:2: rule__Element__Group_2_3_1__0__Impl rule__Element__Group_2_3_1__1
            {
            pushFollow(FOLLOW_rule__Element__Group_2_3_1__0__Impl_in_rule__Element__Group_2_3_1__02658);
            rule__Element__Group_2_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_2_3_1__1_in_rule__Element__Group_2_3_1__02661);
            rule__Element__Group_2_3_1__1();

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
    // $ANTLR end "rule__Element__Group_2_3_1__0"


    // $ANTLR start "rule__Element__Group_2_3_1__0__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1343:1: rule__Element__Group_2_3_1__0__Impl : ( ',' ) ;
    public final void rule__Element__Group_2_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1347:1: ( ( ',' ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1348:1: ( ',' )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1348:1: ( ',' )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1349:1: ','
            {
             before(grammarAccess.getElementAccess().getCommaKeyword_2_3_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Element__Group_2_3_1__0__Impl2689); 
             after(grammarAccess.getElementAccess().getCommaKeyword_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_3_1__0__Impl"


    // $ANTLR start "rule__Element__Group_2_3_1__1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1362:1: rule__Element__Group_2_3_1__1 : rule__Element__Group_2_3_1__1__Impl ;
    public final void rule__Element__Group_2_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1366:1: ( rule__Element__Group_2_3_1__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1367:2: rule__Element__Group_2_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_2_3_1__1__Impl_in_rule__Element__Group_2_3_1__12720);
            rule__Element__Group_2_3_1__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2_3_1__1"


    // $ANTLR start "rule__Element__Group_2_3_1__1__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1373:1: rule__Element__Group_2_3_1__1__Impl : ( ( rule__Element__ArgsAssignment_2_3_1_1 ) ) ;
    public final void rule__Element__Group_2_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1377:1: ( ( ( rule__Element__ArgsAssignment_2_3_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1378:1: ( ( rule__Element__ArgsAssignment_2_3_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1378:1: ( ( rule__Element__ArgsAssignment_2_3_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1379:1: ( rule__Element__ArgsAssignment_2_3_1_1 )
            {
             before(grammarAccess.getElementAccess().getArgsAssignment_2_3_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1380:1: ( rule__Element__ArgsAssignment_2_3_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1380:2: rule__Element__ArgsAssignment_2_3_1_1
            {
            pushFollow(FOLLOW_rule__Element__ArgsAssignment_2_3_1_1_in_rule__Element__Group_2_3_1__1__Impl2747);
            rule__Element__ArgsAssignment_2_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getArgsAssignment_2_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2_3_1__1__Impl"


    // $ANTLR start "rule__Program__StmtsAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1395:1: rule__Program__StmtsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StmtsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1399:1: ( ( ruleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1400:1: ( ruleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1400:1: ( ruleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1401:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StmtsAssignment2786);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StmtsAssignment"


    // $ANTLR start "rule__PType__TypeAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1410:1: rule__PType__TypeAssignment_0 : ( RULE_INTTYPE ) ;
    public final void rule__PType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1414:1: ( ( RULE_INTTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1415:1: ( RULE_INTTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1415:1: ( RULE_INTTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1416:1: RULE_INTTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
            match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_02817); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1425:1: rule__PType__TypeAssignment_1 : ( RULE_STRTYPE ) ;
    public final void rule__PType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1429:1: ( ( RULE_STRTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1430:1: ( RULE_STRTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1430:1: ( RULE_STRTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1431:1: RULE_STRTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
            match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_12848); 
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


    // $ANTLR start "rule__TypeDecl__TypenameAssignment_0_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1440:1: rule__TypeDecl__TypenameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__TypenameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1444:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1445:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1445:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1446:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_0_12879); 
             after(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TypenameAssignment_0_1"


    // $ANTLR start "rule__TypeDecl__TypenameAssignment_1_0_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1455:1: rule__TypeDecl__TypenameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__TypenameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1459:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1460:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1460:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1461:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_1_0_12910); 
             after(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TypenameAssignment_1_0_1"


    // $ANTLR start "rule__TypeDecl__TpcodeAssignment_1_0_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1470:1: rule__TypeDecl__TpcodeAssignment_1_0_3 : ( ruletypeCode ) ;
    public final void rule__TypeDecl__TpcodeAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1474:1: ( ( ruletypeCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1475:1: ( ruletypeCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1475:1: ( ruletypeCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1476:1: ruletypeCode
            {
             before(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_ruletypeCode_in_rule__TypeDecl__TpcodeAssignment_1_0_32941);
            ruletypeCode();

            state._fsp--;

             after(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TpcodeAssignment_1_0_3"


    // $ANTLR start "rule__TypeCode__PrmAssignment_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1485:1: rule__TypeCode__PrmAssignment_0 : ( rulePType ) ;
    public final void rule__TypeCode__PrmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1489:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1490:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1490:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1491:1: rulePType
            {
             before(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePType_in_rule__TypeCode__PrmAssignment_02972);
            rulePType();

            state._fsp--;

             after(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__PrmAssignment_0"


    // $ANTLR start "rule__TypeCode__ElementsAssignment_1_1_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1500:1: rule__TypeCode__ElementsAssignment_1_1_0 : ( ruleelement ) ;
    public final void rule__TypeCode__ElementsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1504:1: ( ( ruleelement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1505:1: ( ruleelement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1505:1: ( ruleelement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1506:1: ruleelement
            {
             before(grammarAccess.getTypeCodeAccess().getElementsElementParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleelement_in_rule__TypeCode__ElementsAssignment_1_1_03003);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getTypeCodeAccess().getElementsElementParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__ElementsAssignment_1_1_0"


    // $ANTLR start "rule__TypeCode__ElementsAssignment_1_1_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1515:1: rule__TypeCode__ElementsAssignment_1_1_1_1 : ( ruleelement ) ;
    public final void rule__TypeCode__ElementsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1519:1: ( ( ruleelement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1520:1: ( ruleelement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1520:1: ( ruleelement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1521:1: ruleelement
            {
             before(grammarAccess.getTypeCodeAccess().getElementsElementParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleelement_in_rule__TypeCode__ElementsAssignment_1_1_1_13034);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getTypeCodeAccess().getElementsElementParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__ElementsAssignment_1_1_1_1"


    // $ANTLR start "rule__Element__ElemnameAssignment_0_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1530:1: rule__Element__ElemnameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Element__ElemnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1534:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1535:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1535:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1536:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_0_03065); 
             after(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ElemnameAssignment_0_0"


    // $ANTLR start "rule__Element__TypenameAssignment_0_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1545:1: rule__Element__TypenameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Element__TypenameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1549:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1550:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1550:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1551:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getTypenameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__TypenameAssignment_0_23096); 
             after(grammarAccess.getElementAccess().getTypenameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypenameAssignment_0_2"


    // $ANTLR start "rule__Element__ElemnameAssignment_1_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1560:1: rule__Element__ElemnameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Element__ElemnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1564:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1565:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1565:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1566:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_1_03127); 
             after(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ElemnameAssignment_1_0"


    // $ANTLR start "rule__Element__PrmtypeAssignment_1_2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1575:1: rule__Element__PrmtypeAssignment_1_2 : ( rulePType ) ;
    public final void rule__Element__PrmtypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1579:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1580:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1580:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1581:1: rulePType
            {
             before(grammarAccess.getElementAccess().getPrmtypePTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePType_in_rule__Element__PrmtypeAssignment_1_23158);
            rulePType();

            state._fsp--;

             after(grammarAccess.getElementAccess().getPrmtypePTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__PrmtypeAssignment_1_2"


    // $ANTLR start "rule__Element__ElemnameAssignment_2_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1590:1: rule__Element__ElemnameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Element__ElemnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1594:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1595:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1595:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1596:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_2_03189); 
             after(grammarAccess.getElementAccess().getElemnameIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ElemnameAssignment_2_0"


    // $ANTLR start "rule__Element__TypenameAssignment_2_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1605:1: rule__Element__TypenameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Element__TypenameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1609:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1610:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1610:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1611:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getTypenameIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__TypenameAssignment_2_1_13220); 
             after(grammarAccess.getElementAccess().getTypenameIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypenameAssignment_2_1_1"


    // $ANTLR start "rule__Element__ArgsAssignment_2_3_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1620:1: rule__Element__ArgsAssignment_2_3_0 : ( RULE_ID ) ;
    public final void rule__Element__ArgsAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1624:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1625:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1625:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1626:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getArgsIDTerminalRuleCall_2_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__ArgsAssignment_2_3_03251); 
             after(grammarAccess.getElementAccess().getArgsIDTerminalRuleCall_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ArgsAssignment_2_3_0"


    // $ANTLR start "rule__Element__ArgsAssignment_2_3_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1635:1: rule__Element__ArgsAssignment_2_3_1_1 : ( RULE_ID ) ;
    public final void rule__Element__ArgsAssignment_2_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1639:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1640:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1640:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:1641:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getArgsIDTerminalRuleCall_2_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__ArgsAssignment_2_3_1_13282); 
             after(grammarAccess.getElementAccess().getArgsIDTerminalRuleCall_2_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ArgsAssignment_2_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StmtsAssignment_in_ruleProgram94 = new BitSet(new long[]{0x000000000000E042L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_entryRulePType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__Alternatives_in_rulePType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_in_ruleTypeDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeCode_in_entryRuletypeCode301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeCode308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Alternatives_in_ruletypeCode334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_entryRuleelement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleelement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__0_in_rule__TypeDecl__Alternatives481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__0_in_rule__TypeDecl__Alternatives499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TypeDecl__Alternatives_0_0533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Alternatives_0_0553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Alternatives_0_0573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TypeDecl__Alternatives_1_0_0608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Alternatives_1_0_0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Alternatives_1_0_0648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__PrmAssignment_0_in_rule__TypeCode__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__0_in_rule__TypeCode__Alternatives700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__0_in_rule__Element__Alternatives733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1__0_in_rule__Element__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__0_in_rule__Element__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__0__Impl_in_rule__TypeDecl__Group_0__0800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__1_in_rule__TypeDecl__Group_0__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_0_0_in_rule__TypeDecl__Group_0__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__1__Impl_in_rule__TypeDecl__Group_0__1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TypenameAssignment_0_1_in_rule__TypeDecl__Group_0__1__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__0__Impl_in_rule__TypeDecl__Group_1__0921 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__1_in_rule__TypeDecl__Group_1__0924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__0_in_rule__TypeDecl__Group_1__0__Impl951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__1__Impl_in_rule__TypeDecl__Group_1__1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_1__1__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__0__Impl_in_rule__TypeDecl__Group_1_0__01047 = new BitSet(new long[]{0x000000000000E040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__1_in_rule__TypeDecl__Group_1_0__01050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_1_0_0_in_rule__TypeDecl__Group_1_0__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__1__Impl_in_rule__TypeDecl__Group_1_0__11108 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__2_in_rule__TypeDecl__Group_1_0__11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TypenameAssignment_1_0_1_in_rule__TypeDecl__Group_1_0__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__2__Impl_in_rule__TypeDecl__Group_1_0__21168 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__3_in_rule__TypeDecl__Group_1_0__21171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeDecl__Group_1_0__2__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1_0__3__Impl_in_rule__TypeDecl__Group_1_0__31233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TpcodeAssignment_1_0_3_in_rule__TypeDecl__Group_1_0__3__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__0__Impl_in_rule__TypeCode__Group_1__01298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__1_in_rule__TypeCode__Group_1__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeCode__Group_1__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__1__Impl_in_rule__TypeCode__Group_1__11360 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__2_in_rule__TypeCode__Group_1__11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1__0_in_rule__TypeCode__Group_1__1__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1__2__Impl_in_rule__TypeCode__Group_1__21420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeCode__Group_1__2__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1__0__Impl_in_rule__TypeCode__Group_1_1__01485 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1__1_in_rule__TypeCode__Group_1_1__01488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__ElementsAssignment_1_1_0_in_rule__TypeCode__Group_1_1__0__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1__1__Impl_in_rule__TypeCode__Group_1_1__11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1_1__0_in_rule__TypeCode__Group_1_1__1__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1_1__0__Impl_in_rule__TypeCode__Group_1_1_1__01607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1_1__1_in_rule__TypeCode__Group_1_1_1__01610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeCode__Group_1_1_1__0__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__Group_1_1_1__1__Impl_in_rule__TypeCode__Group_1_1_1__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeCode__ElementsAssignment_1_1_1_1_in_rule__TypeCode__Group_1_1_1__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__0__Impl_in_rule__Element__Group_0__01730 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Element__Group_0__1_in_rule__Element__Group_0__01733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__ElemnameAssignment_0_0_in_rule__Element__Group_0__0__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__1__Impl_in_rule__Element__Group_0__11790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Element__Group_0__2_in_rule__Element__Group_0__11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Element__Group_0__1__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__2__Impl_in_rule__Element__Group_0__21852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__TypenameAssignment_0_2_in_rule__Element__Group_0__2__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1__0__Impl_in_rule__Element__Group_1__01915 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Element__Group_1__1_in_rule__Element__Group_1__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__ElemnameAssignment_1_0_in_rule__Element__Group_1__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1__1__Impl_in_rule__Element__Group_1__11975 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Element__Group_1__2_in_rule__Element__Group_1__11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Element__Group_1__1__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1__2__Impl_in_rule__Element__Group_1__22037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__PrmtypeAssignment_1_2_in_rule__Element__Group_1__2__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__0__Impl_in_rule__Element__Group_2__02100 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Element__Group_2__1_in_rule__Element__Group_2__02103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__ElemnameAssignment_2_0_in_rule__Element__Group_2__0__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__1__Impl_in_rule__Element__Group_2__12160 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Element__Group_2__2_in_rule__Element__Group_2__12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_1__0_in_rule__Element__Group_2__1__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__2__Impl_in_rule__Element__Group_2__22221 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Element__Group_2__3_in_rule__Element__Group_2__22224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Element__Group_2__2__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__3__Impl_in_rule__Element__Group_2__32283 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Element__Group_2__4_in_rule__Element__Group_2__32286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3__0_in_rule__Element__Group_2__3__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2__4__Impl_in_rule__Element__Group_2__42344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Element__Group_2__4__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_1__0__Impl_in_rule__Element__Group_2_1__02413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Element__Group_2_1__1_in_rule__Element__Group_2_1__02416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Element__Group_2_1__0__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_1__1__Impl_in_rule__Element__Group_2_1__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__TypenameAssignment_2_1_1_in_rule__Element__Group_2_1__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3__0__Impl_in_rule__Element__Group_2_3__02536 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3__1_in_rule__Element__Group_2_3__02539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__ArgsAssignment_2_3_0_in_rule__Element__Group_2_3__0__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3__1__Impl_in_rule__Element__Group_2_3__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3_1__0_in_rule__Element__Group_2_3__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3_1__0__Impl_in_rule__Element__Group_2_3_1__02658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3_1__1_in_rule__Element__Group_2_3_1__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Element__Group_2_3_1__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_2_3_1__1__Impl_in_rule__Element__Group_2_3_1__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__ArgsAssignment_2_3_1_1_in_rule__Element__Group_2_3_1__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StmtsAssignment2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_02817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_0_12879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_1_0_12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeCode_in_rule__TypeDecl__TpcodeAssignment_1_0_32941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__TypeCode__PrmAssignment_02972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_rule__TypeCode__ElementsAssignment_1_1_03003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_rule__TypeCode__ElementsAssignment_1_1_1_13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_0_03065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__TypenameAssignment_0_23096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_1_03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__Element__PrmtypeAssignment_1_23158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__ElemnameAssignment_2_03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__TypenameAssignment_2_1_13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__ArgsAssignment_2_3_03251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__ArgsAssignment_2_3_1_13282 = new BitSet(new long[]{0x0000000000000002L});

}