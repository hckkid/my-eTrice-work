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
    	return "Code";	
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




// Entry rule entryRuleCode
entryRuleCode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCodeRule()); }
	 iv_ruleCode=ruleCode 
	 { $current=$iv_ruleCode.current; } 
	 EOF 
;

// Rule Code
ruleCode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
(
		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getDeclsTypeDeclParserRuleCall_0_0_0()); 
	    }
		lv_decls_0_1=ruleTypeDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		add(
       			$current, 
       			"decls",
        		lv_decls_0_1, 
        		"TypeDecl");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getDeclsVarDeclParserRuleCall_0_0_1()); 
	    }
		lv_decls_0_2=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		add(
       			$current, 
       			"decls",
        		lv_decls_0_2, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getStmtsStatementParserRuleCall_1_0()); 
	    }
		lv_stmts_1_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_1_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleSingleStatement
entryRuleSingleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleStatementRule()); }
	 iv_ruleSingleStatement=ruleSingleStatement 
	 { $current=$iv_ruleSingleStatement.current; } 
	 EOF 
;

// Rule SingleStatement
ruleSingleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getTdTypeDeclParserRuleCall_0_0()); 
	    }
		lv_td_0_0=ruleTypeDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"td",
        		lv_td_0_0, 
        		"TypeDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getVdVarDeclParserRuleCall_1_0()); 
	    }
		lv_vd_1_0=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"vd",
        		lv_vd_1_0, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getVinVarInstParserRuleCall_2_0()); 
	    }
		lv_vin_2_0=ruleVarInst		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"vin",
        		lv_vin_2_0, 
        		"VarInst");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getIfstIfteParserRuleCall_3_0()); 
	    }
		lv_ifst_3_0=ruleifte		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"ifst",
        		lv_ifst_3_0, 
        		"ifte");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getFlForlpParserRuleCall_4_0()); 
	    }
		lv_fl_4_0=ruleforlp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"fl",
        		lv_fl_4_0, 
        		"forlp");
	        afterParserOrEnumRuleCall();
	    }

)
))
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
((
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getVinVarInstParserRuleCall_0_0()); 
	    }
		lv_vin_0_0=ruleVarInst		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		set(
       			$current, 
       			"vin",
        		lv_vin_0_0, 
        		"VarInst");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getIfstIfteParserRuleCall_1_0()); 
	    }
		lv_ifst_1_0=ruleifte		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		set(
       			$current, 
       			"ifst",
        		lv_ifst_1_0, 
        		"ifte");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getFlForlpParserRuleCall_2_0()); 
	    }
		lv_fl_2_0=ruleforlp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		set(
       			$current, 
       			"fl",
        		lv_fl_2_0, 
        		"forlp");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleVarDecl
entryRuleVarDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarDeclRule()); }
	 iv_ruleVarDecl=ruleVarDecl 
	 { $current=$iv_ruleVarDecl.current; } 
	 EOF 
;

// Rule VarDecl
ruleVarDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='var' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getColonKeyword_2_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getVarDeclAccess().getPtPTypeParserRuleCall_2_1_0_0()); 
	    }
		lv_pt_3_0=rulePType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVarDeclRule());
	        }
       		set(
       			$current, 
       			"pt",
        		lv_pt_3_0, 
        		"PType");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarDeclRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getTdTypeDeclCrossReference_2_1_1_0()); 
	}

)
)))?(
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getVarDeclAccess().getVarDeclTypeAction_3(),
            $current);
    }
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getSemicolonKeyword_4());
    }
)
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
(	otherlv_0='type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0()); 
	    }
		lv_tp_3_0=rulePType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeDeclRule());
	        }
       		set(
       			$current, 
       			"tp",
        		lv_tp_3_0, 
        		"PType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleVarInst
entryRuleVarInst returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarInstRule()); }
	 iv_ruleVarInst=ruleVarInst 
	 { $current=$iv_ruleVarInst.current; } 
	 EOF 
;

// Rule VarInst
ruleVarInst returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarInstRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getVarInstAccess().getNameVarDeclCrossReference_0_0()); 
	}

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVarInstAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVarInstAccess().getExpExpressionParserRuleCall_2_0()); 
	    }
		lv_exp_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVarInstRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getVarInstAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getConcatParserRuleCall()); 
    }
    this_Concat_0=ruleConcat
    { 
        $current = $this_Concat_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleConcat
entryRuleConcat returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConcatRule()); }
	 iv_ruleConcat=ruleConcat 
	 { $current=$iv_ruleConcat.current; } 
	 EOF 
;

// Rule Concat
ruleConcat returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConcatAccess().getSubtractionParserRuleCall_0()); 
    }
    this_Subtraction_0=ruleSubtraction
    { 
        $current = $this_Subtraction_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            $current);
    }
)	otherlv_2='^' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getCircumflexAccentKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleStringLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConcatRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"StringLiteral");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleSubtraction
entryRuleSubtraction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubtractionRule()); }
	 iv_ruleSubtraction=ruleSubtraction 
	 { $current=$iv_ruleSubtraction.current; } 
	 EOF 
;

// Rule Subtraction
ruleSubtraction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
    }
    this_Addition_0=ruleAddition
    { 
        $current = $this_Addition_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            $current);
    }
)	otherlv_2='-' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAddition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubtractionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Addition");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	 iv_ruleAddition=ruleAddition 
	 { $current=$iv_ruleAddition.current; } 
	 EOF 
;

// Rule Addition
ruleAddition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
    }
    this_Multiplication_0=ruleMultiplication
    { 
        $current = $this_Multiplication_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleMultiplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Multiplication");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	 iv_ruleMultiplication=ruleMultiplication 
	 { $current=$iv_ruleMultiplication.current; } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
    }
    this_Division_0=ruleDivision
    { 
        $current = $this_Division_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            $current);
    }
)	otherlv_2='*' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleDivision		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Division");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleDivision
entryRuleDivision returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDivisionRule()); }
	 iv_ruleDivision=ruleDivision 
	 { $current=$iv_ruleDivision.current; } 
	 EOF 
;

// Rule Division
ruleDivision returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDivisionAccess().getPowerOfParserRuleCall_0()); 
    }
    this_PowerOf_0=rulePowerOf
    { 
        $current = $this_PowerOf_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            $current);
    }
)	otherlv_2='/' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePowerOf		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDivisionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PowerOf");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePowerOf
entryRulePowerOf returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPowerOfRule()); }
	 iv_rulePowerOf=rulePowerOf 
	 { $current=$iv_rulePowerOf.current; } 
	 EOF 
;

// Rule PowerOf
rulePowerOf returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPowerOfAccess().getBasicExpParserRuleCall_0()); 
    }
    this_BasicExp_0=ruleBasicExp
    { 
        $current = $this_BasicExp_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0(),
            $current);
    }
)	otherlv_2='**' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPowerOfAccess().getAsteriskAsteriskKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPowerOfAccess().getRightBasicExpParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleBasicExp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPowerOfRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"BasicExp");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleBasicExp
entryRuleBasicExp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBasicExpRule()); }
	 iv_ruleBasicExp=ruleBasicExp 
	 { $current=$iv_ruleBasicExp.current; } 
	 EOF 
;

// Rule BasicExp
ruleBasicExp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBasicExpAccess().getStringLiteralParserRuleCall_0()); 
    }
    this_StringLiteral_0=ruleStringLiteral
    { 
        $current = $this_StringLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBasicExpAccess().getIntLiteralParserRuleCall_1()); 
    }
    this_IntLiteral_1=ruleIntLiteral
    { 
        $current = $this_IntLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBasicExpAccess().getVarExpsParserRuleCall_2()); 
    }
    this_VarExps_2=ruleVarExps
    { 
        $current = $this_VarExps_2.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0());
    }

    { 
        newCompositeNode(grammarAccess.getBasicExpAccess().getConcatParserRuleCall_3_1()); 
    }
    this_Concat_4=ruleConcat
    { 
        $current = $this_Concat_4.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBasicExpAccess().getRightParenthesisKeyword_3_2());
    }
))
;





// Entry rule entryRuleIntLiteral
entryRuleIntLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntLiteralRule()); }
	 iv_ruleIntLiteral=ruleIntLiteral 
	 { $current=$iv_ruleIntLiteral.current; } 
	 EOF 
;

// Rule IntLiteral
ruleIntLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)
;





// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	 iv_ruleStringLiteral=ruleStringLiteral 
	 { $current=$iv_ruleStringLiteral.current; } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_STRING
		{
			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleVarExps
entryRuleVarExps returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarExpsRule()); }
	 iv_ruleVarExps=ruleVarExps 
	 { $current=$iv_ruleVarExps.current; } 
	 EOF 
;

// Rule VarExps
ruleVarExps returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarExpsRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getVarExpsAccess().getVrnmVarDeclCrossReference_0()); 
	}

)
)
;





// Entry rule entryRuleforlp
entryRuleforlp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getForlpRule()); }
	 iv_ruleforlp=ruleforlp 
	 { $current=$iv_ruleforlp.current; } 
	 EOF 
;

// Rule forlp
ruleforlp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='for' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getForlpAccess().getForKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getForlpAccess().getCondExpressionParserRuleCall_1_0()); 
	    }
		lv_cond_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getForlpRule());
	        }
       		set(
       			$current, 
       			"cond",
        		lv_cond_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getForlpAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
	    }
		lv_stmts_2_0=ruleSingleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getForlpRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_2_0, 
        		"SingleStatement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getForlpAccess().getLeftCurlyBracketKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getForlpAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
	    }
		lv_stmts_4_0=ruleCode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getForlpRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_4_0, 
        		"Code");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getForlpAccess().getRightCurlyBracketKeyword_2_1_2());
    }
)))
;





// Entry rule entryRuleifte
entryRuleifte returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfteRule()); }
	 iv_ruleifte=ruleifte 
	 { $current=$iv_ruleifte.current; } 
	 EOF 
;

// Rule ifte
ruleifte returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfteAccess().getIfKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfteAccess().getCondExpressionParserRuleCall_1_0()); 
	    }
		lv_cond_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfteRule());
	        }
       		set(
       			$current, 
       			"cond",
        		lv_cond_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsSingleStatementParserRuleCall_2_0_0()); 
	    }
		lv_stmts_2_0=ruleSingleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfteRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_2_0, 
        		"SingleStatement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfteAccess().getStmtsCodeParserRuleCall_2_1_1_0()); 
	    }
		lv_stmts_4_0=ruleCode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfteRule());
	        }
       		add(
       			$current, 
       			"stmts",
        		lv_stmts_4_0, 
        		"Code");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_2_1_2());
    }
))(((	'else' 
)=>	otherlv_6='else' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getIfteAccess().getElseKeyword_3_0());
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsSingleStatementParserRuleCall_3_1_0_0()); 
	    }
		lv_estmts_7_0=ruleSingleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfteRule());
	        }
       		add(
       			$current, 
       			"estmts",
        		lv_estmts_7_0, 
        		"SingleStatement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getIfteAccess().getLeftCurlyBracketKeyword_3_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfteAccess().getEstmtsCodeParserRuleCall_3_1_1_1_0()); 
	    }
		lv_estmts_9_0=ruleCode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfteRule());
	        }
       		add(
       			$current, 
       			"estmts",
        		lv_estmts_9_0, 
        		"Code");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getIfteAccess().getRightCurlyBracketKeyword_3_1_1_2());
    }
)))?)
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


