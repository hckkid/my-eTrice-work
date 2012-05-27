/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.GACLGrammarAccess;

public class GACLParser extends AbstractContentAssistParser {
	
	@Inject
	private GACLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalGACLParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalGACLParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalGACLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCodeAccess().getDeclsAlternatives_0_0(), "rule__Code__DeclsAlternatives_0_0");
					put(grammarAccess.getSingleStatementAccess().getAlternatives(), "rule__SingleStatement__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getVarDeclAccess().getAlternatives_3(), "rule__VarDecl__Alternatives_3");
					put(grammarAccess.getPTypeAccess().getAlternatives(), "rule__PType__Alternatives");
					put(grammarAccess.getBasicIntExpAccess().getAlternatives(), "rule__BasicIntExp__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getIfteAccess().getAlternatives_2(), "rule__Ifte__Alternatives_2");
					put(grammarAccess.getIfteAccess().getAlternatives_3_1(), "rule__Ifte__Alternatives_3_1");
					put(grammarAccess.getCodeAccess().getGroup(), "rule__Code__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
					put(grammarAccess.getVarInstAccess().getGroup(), "rule__VarInst__Group__0");
					put(grammarAccess.getConcatAccess().getGroup(), "rule__Concat__Group__0");
					put(grammarAccess.getConcatAccess().getGroup_1(), "rule__Concat__Group_1__0");
					put(grammarAccess.getSubtractionAccess().getGroup(), "rule__Subtraction__Group__0");
					put(grammarAccess.getSubtractionAccess().getGroup_1(), "rule__Subtraction__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getPowerOfAccess().getGroup(), "rule__PowerOf__Group__0");
					put(grammarAccess.getPowerOfAccess().getGroup_1(), "rule__PowerOf__Group_1__0");
					put(grammarAccess.getBasicIntExpAccess().getGroup_1(), "rule__BasicIntExp__Group_1__0");
					put(grammarAccess.getIfteAccess().getGroup(), "rule__Ifte__Group__0");
					put(grammarAccess.getIfteAccess().getGroup_2_1(), "rule__Ifte__Group_2_1__0");
					put(grammarAccess.getIfteAccess().getGroup_3(), "rule__Ifte__Group_3__0");
					put(grammarAccess.getIfteAccess().getGroup_3_1_1(), "rule__Ifte__Group_3_1_1__0");
					put(grammarAccess.getCodeAccess().getDeclsAssignment_0(), "rule__Code__DeclsAssignment_0");
					put(grammarAccess.getCodeAccess().getStmtsAssignment_1(), "rule__Code__StmtsAssignment_1");
					put(grammarAccess.getSingleStatementAccess().getTdAssignment_0(), "rule__SingleStatement__TdAssignment_0");
					put(grammarAccess.getSingleStatementAccess().getVdAssignment_1(), "rule__SingleStatement__VdAssignment_1");
					put(grammarAccess.getSingleStatementAccess().getVinAssignment_2(), "rule__SingleStatement__VinAssignment_2");
					put(grammarAccess.getSingleStatementAccess().getIfstAssignment_3(), "rule__SingleStatement__IfstAssignment_3");
					put(grammarAccess.getStatementAccess().getVinAssignment_0(), "rule__Statement__VinAssignment_0");
					put(grammarAccess.getStatementAccess().getIfstAssignment_1(), "rule__Statement__IfstAssignment_1");
					put(grammarAccess.getVarDeclAccess().getNameAssignment_1(), "rule__VarDecl__NameAssignment_1");
					put(grammarAccess.getVarDeclAccess().getPtAssignment_3_0(), "rule__VarDecl__PtAssignment_3_0");
					put(grammarAccess.getVarDeclAccess().getTdAssignment_3_1(), "rule__VarDecl__TdAssignment_3_1");
					put(grammarAccess.getPTypeAccess().getTypeAssignment_0(), "rule__PType__TypeAssignment_0");
					put(grammarAccess.getPTypeAccess().getTypeAssignment_1(), "rule__PType__TypeAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getNameAssignment_1(), "rule__TypeDecl__NameAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getTpAssignment_3(), "rule__TypeDecl__TpAssignment_3");
					put(grammarAccess.getVarInstAccess().getNameAssignment_0(), "rule__VarInst__NameAssignment_0");
					put(grammarAccess.getVarInstAccess().getExpAssignment_2(), "rule__VarInst__ExpAssignment_2");
					put(grammarAccess.getConcatAccess().getRightAssignment_1_2(), "rule__Concat__RightAssignment_1_2");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getSubtractionAccess().getRightAssignment_1_2(), "rule__Subtraction__RightAssignment_1_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getPowerOfAccess().getRightAssignment_1_2(), "rule__PowerOf__RightAssignment_1_2");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment(), "rule__IntLiteral__ValueAssignment");
					put(grammarAccess.getExpressionAccess().getStrexpAssignment_0(), "rule__Expression__StrexpAssignment_0");
					put(grammarAccess.getExpressionAccess().getInexpAssignment_1(), "rule__Expression__InexpAssignment_1");
					put(grammarAccess.getExpressionAccess().getVexAssignment_2(), "rule__Expression__VexAssignment_2");
					put(grammarAccess.getVarExpsAccess().getVarexAssignment(), "rule__VarExps__VarexAssignment");
					put(grammarAccess.getIfteAccess().getCondAssignment_1(), "rule__Ifte__CondAssignment_1");
					put(grammarAccess.getIfteAccess().getStmtsAssignment_2_0(), "rule__Ifte__StmtsAssignment_2_0");
					put(grammarAccess.getIfteAccess().getStmtsAssignment_2_1_1(), "rule__Ifte__StmtsAssignment_2_1_1");
					put(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_0(), "rule__Ifte__EstmtsAssignment_3_1_0");
					put(grammarAccess.getIfteAccess().getEstmtsAssignment_3_1_1_1(), "rule__Ifte__EstmtsAssignment_3_1_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalGACLParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalGACLParser) parser;
			typedParser.entryRuleCode();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GACLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GACLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
