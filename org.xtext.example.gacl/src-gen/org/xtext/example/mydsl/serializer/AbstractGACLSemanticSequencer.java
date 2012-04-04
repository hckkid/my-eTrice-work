package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.PType;
import org.xtext.example.mydsl.gACL.Program;
import org.xtext.example.mydsl.gACL.TypeDecl;
import org.xtext.example.mydsl.gACL.element;
import org.xtext.example.mydsl.gACL.typeCode;
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
			case GACLPackage.PTYPE:
				if(context == grammarAccess.getPTypeRule()) {
					sequence_PType(context, (PType) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.TYPE_DECL:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTypeDeclRule()) {
					sequence_TypeDecl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.ELEMENT:
				if(context == grammarAccess.getElementRule()) {
					sequence_element(context, (element) semanticObject); 
					return; 
				}
				else break;
			case GACLPackage.TYPE_CODE:
				if(context == grammarAccess.getTypeCodeRule()) {
					sequence_typeCode(context, (typeCode) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     stmts+=Statement*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typename=ID | (typename=ID tpcode=typeCode))
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elemname=ID typename=ID) | (elemname=ID prmtype=PType) | (elemname=ID typename=ID? (args+=ID args+=ID?)?))
	 */
	protected void sequence_element(EObject context, element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prm=PType | (elements+=element elements+=element?))
	 */
	protected void sequence_typeCode(EObject context, typeCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
