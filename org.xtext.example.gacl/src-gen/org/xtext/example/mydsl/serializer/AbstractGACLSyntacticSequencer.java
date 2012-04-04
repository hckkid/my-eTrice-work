package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.GACLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGACLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GACLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TypeDecl_EqualsSignKeyword_1_2_q;
	protected AbstractElementAlias match_TypeDecl_TYPEKeyword_0_0_2_or_TypeKeyword_0_0_0_or_TypeKeyword_0_0_1;
	protected AbstractElementAlias match_TypeDecl___TYPEKeyword_1_0_2_or_TypeKeyword_1_0_0_or_TypeKeyword_1_0_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GACLGrammarAccess) access;
		match_TypeDecl_EqualsSignKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2());
		match_TypeDecl_TYPEKeyword_0_0_2_or_TypeKeyword_0_0_0_or_TypeKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()), new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()));
		match_TypeDecl___TYPEKeyword_1_0_2_or_TypeKeyword_1_0_0_or_TypeKeyword_1_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_TypeDecl_EqualsSignKeyword_1_2_q.equals(syntax))
				emit_TypeDecl_EqualsSignKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeDecl_TYPEKeyword_0_0_2_or_TypeKeyword_0_0_0_or_TypeKeyword_0_0_1.equals(syntax))
				emit_TypeDecl_TYPEKeyword_0_0_2_or_TypeKeyword_0_0_0_or_TypeKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeDecl___TYPEKeyword_1_0_2_or_TypeKeyword_1_0_0_or_TypeKeyword_1_0_1__q.equals(syntax))
				emit_TypeDecl___TYPEKeyword_1_0_2_or_TypeKeyword_1_0_0_or_TypeKeyword_1_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '='?
	 */
	protected void emit_TypeDecl_EqualsSignKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type' | 'Type' | 'TYPE'
	 */
	protected void emit_TypeDecl_TYPEKeyword_0_0_2_or_TypeKeyword_0_0_0_or_TypeKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('type' | 'TYPE' | 'Type')?
	 */
	protected void emit_TypeDecl___TYPEKeyword_1_0_2_or_TypeKeyword_1_0_0_or_TypeKeyword_1_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
