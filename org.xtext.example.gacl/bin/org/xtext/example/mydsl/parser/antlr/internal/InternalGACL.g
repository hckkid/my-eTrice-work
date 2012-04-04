/*
* generated by Xtext
*/
grammar InternalGACL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); 
	    }
		lv_stmts_0_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_0_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); 
    }
    this_TypeDecl_0=ruleTypeDecl
    { 
        $current = $this_TypeDecl_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRulePType
entryRulePType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPTypeRule()); }
	 iv_rulePType=rulePType 
	 { $current=$iv_rulePType.current; } 
	 EOF 
;

// Rule PType
rulePType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=RULE_INTTYPE
		{
			newLeafNode(lv_type_0_0, grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"intType");
	    }

)
)
    |(
(
		lv_type_1_0=RULE_STRTYPE
		{
			newLeafNode(lv_type_1_0, grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"strType");
	    }

)
))
;





// Entry rule entryRuleTypeDecl
entryRuleTypeDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeDeclRule()); }
	 iv_ruleTypeDecl=ruleTypeDecl 
	 { $current=$iv_ruleTypeDecl.current; } 
	 EOF 
;

// Rule TypeDecl
ruleTypeDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((	otherlv_0='type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0());
    }

    |	otherlv_1='Type' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1());
    }

    |	otherlv_2='TYPE' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2());
    }
)(
(
		lv_typename_3_0=RULE_ID
		{
			newLeafNode(lv_typename_3_0, grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"typename",
        		lv_typename_3_0, 
        		"ID");
	    }

)
))
    |((	otherlv_4='type' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0());
    }

    |	otherlv_5='Type' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1());
    }

    |	otherlv_6='TYPE' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2());
    }
)?(
(
		lv_typename_7_0=RULE_ID
		{
			newLeafNode(lv_typename_7_0, grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"typename",
        		lv_typename_7_0, 
        		"ID");
	    }

)
)(	otherlv_8='=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); 
	    }
		lv_tpcode_9_0=ruletypeCode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeDeclRule());
	        }
       		set(
       			$current, 
       			"tpcode",
        		lv_tpcode_9_0, 
        		"typeCode");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuletypeCode
entryRuletypeCode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeCodeRule()); }
	 iv_ruletypeCode=ruletypeCode 
	 { $current=$iv_ruletypeCode.current; } 
	 EOF 
;

// Rule typeCode
ruletypeCode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); 
	    }
		lv_prm_0_0=rulePType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeCodeRule());
	        }
       		set(
       			$current, 
       			"prm",
        		lv_prm_0_0, 
        		"PType");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





RULE_INTTYPE : 'int';

RULE_STRTYPE : 'string';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


