package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.gACL.Addition;
import org.xtext.example.mydsl.gACL.Concat;
import org.xtext.example.mydsl.gACL.DetailCode;
import org.xtext.example.mydsl.gACL.Division;
import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.IntLiteral;
import org.xtext.example.mydsl.gACL.Multiplication;
import org.xtext.example.mydsl.gACL.PType;
import org.xtext.example.mydsl.gACL.PowerOf;
import org.xtext.example.mydsl.gACL.Statement;
import org.xtext.example.mydsl.gACL.StringLiteral;
import org.xtext.example.mydsl.gACL.Subtraction;
import org.xtext.example.mydsl.gACL.TypeDecl;
import org.xtext.example.mydsl.gACL.VarDecl;
import org.xtext.example.mydsl.gACL.VarInst;
import org.xtext.example.mydsl.services.GACLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGACLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected GACLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GACLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GACLPackage.ADDITION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_Addition(context, (Addition) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.CONCAT:
				if(context == grammarAccess.getConcatRule() ||
				   context == grammarAccess.getConcatAccess().getConcatLeftAction_1_0()) {
					sequence_Concat(context, (Concat) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.DETAIL_CODE:
				if(context == grammarAccess.getDetailCodeRule()) {
					sequence_DetailCode(context, (DetailCode) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.DIVISION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_Division(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.INT_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.MULTIPLICATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_Multiplication(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.PTYPE:
				if(context == grammarAccess.getPTypeRule()) {
					sequence_PType(context, (PType) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.POWER_OF:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PowerOf(context, (PowerOf) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.STRING_LITERAL:
				if(context == grammarAccess.getConcatRule() ||
				   context == grammarAccess.getConcatAccess().getConcatLeftAction_1_0() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.SUBTRACTION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getBasicIntExpRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getPowerOfRule() ||
				   context == grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_Subtraction(context, (Subtraction) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.TYPE_DECL:
				if(context == grammarAccess.getTypeDeclRule()) {
					sequence_TypeDecl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.VAR_INST:
				if(context == grammarAccess.getVarInstRule()) {
					sequence_VarInst(context, (VarInst) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Addition_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Addition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Concat_Concat_1_0 right=StringLiteral)
	 */
	protected void sequence_Concat(EObject context, Concat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.CONCAT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.CONCAT__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.CONCAT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.CONCAT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcatAccess().getConcatLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConcatAccess().getRightStringLiteralParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     stmts+=Statement*
	 */
	protected void sequence_DetailCode(EObject context, DetailCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Division_Division_1_0 right=PowerOf)
	 */
	protected void sequence_Division(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionAccess().getRightPowerOfParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 right=Division)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=intType | type=strType)
	 */
	protected void sequence_PType(EObject context, PType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PowerOf_PowerOf_1_0 right=BasicIntExp)
	 */
	protected void sequence_PowerOf(EObject context, PowerOf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.POWER_OF__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.POWER_OF__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.POWER_OF__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.POWER_OF__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPowerOfAccess().getPowerOfLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPowerOfAccess().getRightBasicIntExpParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (td=TypeDecl | vd=VarDecl | vin=VarInst)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Subtraction_Subtraction_1_0 right=Addition)
	 */
	protected void sequence_Subtraction(EObject context, Subtraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.SUBTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.SUBTRACTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.SUBTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.SUBTRACTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID tp=PType)
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.TYPE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.TYPE_DECL__NAME));
			if(transientValues.isValueTransient(semanticObject, GACLPackage.Literals.TYPE_DECL__TP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GACLPackage.Literals.TYPE_DECL__TP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDeclAccess().getTpPTypeParserRuleCall_3_0(), semanticObject.getTp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (pt=PType | td=[TypeDecl|ID]))
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[VarDecl|ID] (strexp=Concat | inexp=Subtraction))
	 */
	protected void sequence_VarInst(EObject context, VarInst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
