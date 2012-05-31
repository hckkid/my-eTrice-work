package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.GACLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGACLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GACLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BasicExp_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_BasicExp_LeftParenthesisKeyword_3_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GACLGrammarAccess) access;
		match_BasicExp_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0());
		match_BasicExp_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getBasicExpAccess().getLeftParenthesisKeyword_3_0());
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
			if(match_BasicExp_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_BasicExp_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicExp_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_BasicExp_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_BasicExp_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_BasicExp_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
