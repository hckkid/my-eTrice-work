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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:181:1: ruletypeCode : ( ( rule__TypeCode__PrmAssignment ) ) ;
    public final void ruletypeCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:185:2: ( ( ( rule__TypeCode__PrmAssignment ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeCode__PrmAssignment ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:186:1: ( ( rule__TypeCode__PrmAssignment ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:187:1: ( rule__TypeCode__PrmAssignment )
            {
             before(grammarAccess.getTypeCodeAccess().getPrmAssignment()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:1: ( rule__TypeCode__PrmAssignment )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:188:2: rule__TypeCode__PrmAssignment
            {
            pushFollow(FOLLOW_rule__TypeCode__PrmAssignment_in_ruletypeCode334);
            rule__TypeCode__PrmAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeCodeAccess().getPrmAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__PType__Alternatives"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:200:1: rule__PType__Alternatives : ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) );
    public final void rule__PType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:204:1: ( ( ( rule__PType__TypeAssignment_0 ) ) | ( ( rule__PType__TypeAssignment_1 ) ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:205:1: ( ( rule__PType__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:205:1: ( ( rule__PType__TypeAssignment_0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:206:1: ( rule__PType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:207:1: ( rule__PType__TypeAssignment_0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:207:2: rule__PType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives370);
                    rule__PType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:211:6: ( ( rule__PType__TypeAssignment_1 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:211:6: ( ( rule__PType__TypeAssignment_1 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:212:1: ( rule__PType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:213:1: ( rule__PType__TypeAssignment_1 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:213:2: rule__PType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives388);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:222:1: rule__TypeDecl__Alternatives : ( ( ( rule__TypeDecl__Group_0__0 ) ) | ( ( rule__TypeDecl__Group_1__0 ) ) );
    public final void rule__TypeDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:226:1: ( ( ( rule__TypeDecl__Group_0__0 ) ) | ( ( rule__TypeDecl__Group_1__0 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||LA3_5==16) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
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

                    if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||LA3_5==16) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
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

                    if ( ((LA3_5>=RULE_INTTYPE && LA3_5<=RULE_STRTYPE)||LA3_5==16) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==EOF||LA3_5==RULE_ID||(LA3_5>=13 && LA3_5<=15)) ) {
                        alt3=1;
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:227:1: ( ( rule__TypeDecl__Group_0__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:227:1: ( ( rule__TypeDecl__Group_0__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:228:1: ( rule__TypeDecl__Group_0__0 )
                    {
                     before(grammarAccess.getTypeDeclAccess().getGroup_0()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:229:1: ( rule__TypeDecl__Group_0__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:229:2: rule__TypeDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_0__0_in_rule__TypeDecl__Alternatives421);
                    rule__TypeDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:233:6: ( ( rule__TypeDecl__Group_1__0 ) )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:233:6: ( ( rule__TypeDecl__Group_1__0 ) )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:234:1: ( rule__TypeDecl__Group_1__0 )
                    {
                     before(grammarAccess.getTypeDeclAccess().getGroup_1()); 
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:235:1: ( rule__TypeDecl__Group_1__0 )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:235:2: rule__TypeDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_1__0_in_rule__TypeDecl__Alternatives439);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:244:1: rule__TypeDecl__Alternatives_0_0 : ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) );
    public final void rule__TypeDecl__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:248:1: ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:249:1: ( 'type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:249:1: ( 'type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:250:1: 'type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__TypeDecl__Alternatives_0_0473); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:6: ( 'Type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:257:6: ( 'Type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:258:1: 'Type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__TypeDecl__Alternatives_0_0493); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:265:6: ( 'TYPE' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:265:6: ( 'TYPE' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:266:1: 'TYPE'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__TypeDecl__Alternatives_0_0513); 
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


    // $ANTLR start "rule__TypeDecl__Alternatives_1_0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:278:1: rule__TypeDecl__Alternatives_1_0 : ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) );
    public final void rule__TypeDecl__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:282:1: ( ( 'type' ) | ( 'Type' ) | ( 'TYPE' ) )
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
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:283:1: ( 'type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:283:1: ( 'type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:284:1: 'type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__TypeDecl__Alternatives_1_0548); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:291:6: ( 'Type' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:291:6: ( 'Type' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:292:1: 'Type'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__TypeDecl__Alternatives_1_0568); 
                     after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:6: ( 'TYPE' )
                    {
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:299:6: ( 'TYPE' )
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:300:1: 'TYPE'
                    {
                     before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__TypeDecl__Alternatives_1_0588); 
                     after(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2()); 

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
    // $ANTLR end "rule__TypeDecl__Alternatives_1_0"


    // $ANTLR start "rule__TypeDecl__Group_0__0"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:314:1: rule__TypeDecl__Group_0__0 : rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1 ;
    public final void rule__TypeDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:318:1: ( rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:319:2: rule__TypeDecl__Group_0__0__Impl rule__TypeDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_0__0__Impl_in_rule__TypeDecl__Group_0__0620);
            rule__TypeDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_0__1_in_rule__TypeDecl__Group_0__0623);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:326:1: rule__TypeDecl__Group_0__0__Impl : ( ( rule__TypeDecl__Alternatives_0_0 ) ) ;
    public final void rule__TypeDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:330:1: ( ( ( rule__TypeDecl__Alternatives_0_0 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:331:1: ( ( rule__TypeDecl__Alternatives_0_0 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:331:1: ( ( rule__TypeDecl__Alternatives_0_0 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:332:1: ( rule__TypeDecl__Alternatives_0_0 )
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives_0_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:333:1: ( rule__TypeDecl__Alternatives_0_0 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:333:2: rule__TypeDecl__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Alternatives_0_0_in_rule__TypeDecl__Group_0__0__Impl650);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:343:1: rule__TypeDecl__Group_0__1 : rule__TypeDecl__Group_0__1__Impl ;
    public final void rule__TypeDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:347:1: ( rule__TypeDecl__Group_0__1__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:348:2: rule__TypeDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_0__1__Impl_in_rule__TypeDecl__Group_0__1680);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:354:1: rule__TypeDecl__Group_0__1__Impl : ( ( rule__TypeDecl__TypenameAssignment_0_1 ) ) ;
    public final void rule__TypeDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:358:1: ( ( ( rule__TypeDecl__TypenameAssignment_0_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:359:1: ( ( rule__TypeDecl__TypenameAssignment_0_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:359:1: ( ( rule__TypeDecl__TypenameAssignment_0_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:360:1: ( rule__TypeDecl__TypenameAssignment_0_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_0_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:361:1: ( rule__TypeDecl__TypenameAssignment_0_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:361:2: rule__TypeDecl__TypenameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__TypenameAssignment_0_1_in_rule__TypeDecl__Group_0__1__Impl707);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:375:1: rule__TypeDecl__Group_1__0 : rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1 ;
    public final void rule__TypeDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:379:1: ( rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:380:2: rule__TypeDecl__Group_1__0__Impl rule__TypeDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__0__Impl_in_rule__TypeDecl__Group_1__0741);
            rule__TypeDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1__1_in_rule__TypeDecl__Group_1__0744);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:387:1: rule__TypeDecl__Group_1__0__Impl : ( ( rule__TypeDecl__Alternatives_1_0 )? ) ;
    public final void rule__TypeDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:391:1: ( ( ( rule__TypeDecl__Alternatives_1_0 )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:392:1: ( ( rule__TypeDecl__Alternatives_1_0 )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:392:1: ( ( rule__TypeDecl__Alternatives_1_0 )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:393:1: ( rule__TypeDecl__Alternatives_1_0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives_1_0()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:394:1: ( rule__TypeDecl__Alternatives_1_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:394:2: rule__TypeDecl__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Alternatives_1_0_in_rule__TypeDecl__Group_1__0__Impl771);
                    rule__TypeDecl__Alternatives_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:404:1: rule__TypeDecl__Group_1__1 : rule__TypeDecl__Group_1__1__Impl rule__TypeDecl__Group_1__2 ;
    public final void rule__TypeDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:408:1: ( rule__TypeDecl__Group_1__1__Impl rule__TypeDecl__Group_1__2 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:409:2: rule__TypeDecl__Group_1__1__Impl rule__TypeDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__1__Impl_in_rule__TypeDecl__Group_1__1802);
            rule__TypeDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1__2_in_rule__TypeDecl__Group_1__1805);
            rule__TypeDecl__Group_1__2();

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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:416:1: rule__TypeDecl__Group_1__1__Impl : ( ( rule__TypeDecl__TypenameAssignment_1_1 ) ) ;
    public final void rule__TypeDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:420:1: ( ( ( rule__TypeDecl__TypenameAssignment_1_1 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:421:1: ( ( rule__TypeDecl__TypenameAssignment_1_1 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:421:1: ( ( rule__TypeDecl__TypenameAssignment_1_1 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:422:1: ( rule__TypeDecl__TypenameAssignment_1_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_1()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:423:1: ( rule__TypeDecl__TypenameAssignment_1_1 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:423:2: rule__TypeDecl__TypenameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__TypenameAssignment_1_1_in_rule__TypeDecl__Group_1__1__Impl832);
            rule__TypeDecl__TypenameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeDecl__Group_1__2"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:433:1: rule__TypeDecl__Group_1__2 : rule__TypeDecl__Group_1__2__Impl rule__TypeDecl__Group_1__3 ;
    public final void rule__TypeDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:437:1: ( rule__TypeDecl__Group_1__2__Impl rule__TypeDecl__Group_1__3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:438:2: rule__TypeDecl__Group_1__2__Impl rule__TypeDecl__Group_1__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__2__Impl_in_rule__TypeDecl__Group_1__2862);
            rule__TypeDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_1__3_in_rule__TypeDecl__Group_1__2865);
            rule__TypeDecl__Group_1__3();

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
    // $ANTLR end "rule__TypeDecl__Group_1__2"


    // $ANTLR start "rule__TypeDecl__Group_1__2__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:445:1: rule__TypeDecl__Group_1__2__Impl : ( ( '=' )? ) ;
    public final void rule__TypeDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:449:1: ( ( ( '=' )? ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:450:1: ( ( '=' )? )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:450:1: ( ( '=' )? )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:451:1: ( '=' )?
            {
             before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:452:1: ( '=' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:453:2: '='
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeDecl__Group_1__2__Impl894); 

                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group_1__3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:464:1: rule__TypeDecl__Group_1__3 : rule__TypeDecl__Group_1__3__Impl ;
    public final void rule__TypeDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:468:1: ( rule__TypeDecl__Group_1__3__Impl )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:469:2: rule__TypeDecl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_1__3__Impl_in_rule__TypeDecl__Group_1__3927);
            rule__TypeDecl__Group_1__3__Impl();

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
    // $ANTLR end "rule__TypeDecl__Group_1__3"


    // $ANTLR start "rule__TypeDecl__Group_1__3__Impl"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:475:1: rule__TypeDecl__Group_1__3__Impl : ( ( rule__TypeDecl__TpcodeAssignment_1_3 ) ) ;
    public final void rule__TypeDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:479:1: ( ( ( rule__TypeDecl__TpcodeAssignment_1_3 ) ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:480:1: ( ( rule__TypeDecl__TpcodeAssignment_1_3 ) )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:480:1: ( ( rule__TypeDecl__TpcodeAssignment_1_3 ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:481:1: ( rule__TypeDecl__TpcodeAssignment_1_3 )
            {
             before(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_3()); 
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:482:1: ( rule__TypeDecl__TpcodeAssignment_1_3 )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:482:2: rule__TypeDecl__TpcodeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__TypeDecl__TpcodeAssignment_1_3_in_rule__TypeDecl__Group_1__3__Impl954);
            rule__TypeDecl__TpcodeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_1__3__Impl"


    // $ANTLR start "rule__Program__StmtsAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:501:1: rule__Program__StmtsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StmtsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:505:1: ( ( ruleStatement ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:506:1: ( ruleStatement )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:506:1: ( ruleStatement )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:507:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StmtsAssignment997);
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:516:1: rule__PType__TypeAssignment_0 : ( RULE_INTTYPE ) ;
    public final void rule__PType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:520:1: ( ( RULE_INTTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:521:1: ( RULE_INTTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:521:1: ( RULE_INTTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:522:1: RULE_INTTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
            match(input,RULE_INTTYPE,FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_01028); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:531:1: rule__PType__TypeAssignment_1 : ( RULE_STRTYPE ) ;
    public final void rule__PType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:535:1: ( ( RULE_STRTYPE ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:536:1: ( RULE_STRTYPE )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:536:1: ( RULE_STRTYPE )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:537:1: RULE_STRTYPE
            {
             before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
            match(input,RULE_STRTYPE,FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_11059); 
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
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:546:1: rule__TypeDecl__TypenameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__TypenameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:550:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:551:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:552:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_0_11090); 
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


    // $ANTLR start "rule__TypeDecl__TypenameAssignment_1_1"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:561:1: rule__TypeDecl__TypenameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__TypenameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:565:1: ( ( RULE_ID ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:566:1: ( RULE_ID )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:566:1: ( RULE_ID )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:567:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_1_11121); 
             after(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TypenameAssignment_1_1"


    // $ANTLR start "rule__TypeDecl__TpcodeAssignment_1_3"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:576:1: rule__TypeDecl__TpcodeAssignment_1_3 : ( ruletypeCode ) ;
    public final void rule__TypeDecl__TpcodeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:580:1: ( ( ruletypeCode ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:1: ( ruletypeCode )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:581:1: ( ruletypeCode )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:582:1: ruletypeCode
            {
             before(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruletypeCode_in_rule__TypeDecl__TpcodeAssignment_1_31152);
            ruletypeCode();

            state._fsp--;

             after(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TpcodeAssignment_1_3"


    // $ANTLR start "rule__TypeCode__PrmAssignment"
    // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:591:1: rule__TypeCode__PrmAssignment : ( rulePType ) ;
    public final void rule__TypeCode__PrmAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:595:1: ( ( rulePType ) )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:596:1: ( rulePType )
            {
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:596:1: ( rulePType )
            // ../org.xtext.example.gacl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalGACL.g:597:1: rulePType
            {
             before(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePType_in_rule__TypeCode__PrmAssignment1183);
            rulePType();

            state._fsp--;

             after(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCode__PrmAssignment"

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
    public static final BitSet FOLLOW_rule__TypeCode__PrmAssignment_in_ruletypeCode334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_0_in_rule__PType__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PType__TypeAssignment_1_in_rule__PType__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__0_in_rule__TypeDecl__Alternatives421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__0_in_rule__TypeDecl__Alternatives439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TypeDecl__Alternatives_0_0473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Alternatives_0_0493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Alternatives_0_0513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TypeDecl__Alternatives_1_0548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDecl__Alternatives_1_0568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDecl__Alternatives_1_0588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__0__Impl_in_rule__TypeDecl__Group_0__0620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__1_in_rule__TypeDecl__Group_0__0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_0_0_in_rule__TypeDecl__Group_0__0__Impl650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_0__1__Impl_in_rule__TypeDecl__Group_0__1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TypenameAssignment_0_1_in_rule__TypeDecl__Group_0__1__Impl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__0__Impl_in_rule__TypeDecl__Group_1__0741 = new BitSet(new long[]{0x000000000000E040L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__1_in_rule__TypeDecl__Group_1__0744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_1_0_in_rule__TypeDecl__Group_1__0__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__1__Impl_in_rule__TypeDecl__Group_1__1802 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__2_in_rule__TypeDecl__Group_1__1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TypenameAssignment_1_1_in_rule__TypeDecl__Group_1__1__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__2__Impl_in_rule__TypeDecl__Group_1__2862 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__3_in_rule__TypeDecl__Group_1__2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDecl__Group_1__2__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_1__3__Impl_in_rule__TypeDecl__Group_1__3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TpcodeAssignment_1_3_in_rule__TypeDecl__Group_1__3__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StmtsAssignment997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTTYPE_in_rule__PType__TypeAssignment_01028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRTYPE_in_rule__PType__TypeAssignment_11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_0_11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__TypenameAssignment_1_11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeCode_in_rule__TypeDecl__TpcodeAssignment_1_31152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePType_in_rule__TypeCode__PrmAssignment1183 = new BitSet(new long[]{0x0000000000000002L});

}