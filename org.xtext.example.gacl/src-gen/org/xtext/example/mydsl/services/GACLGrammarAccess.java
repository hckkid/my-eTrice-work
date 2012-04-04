/*
* generated by Xtext
*/

package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GACLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Assignment cStmtsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStmtsStatementParserRuleCall_0 = (RuleCall)cStmtsAssignment.eContents().get(0);
		
		//Program:
		//	stmts+=Statement*;
		public ParserRule getRule() { return rule; }

		//stmts+=Statement*
		public Assignment getStmtsAssignment() { return cStmtsAssignment; }

		//Statement
		public RuleCall getStmtsStatementParserRuleCall_0() { return cStmtsStatementParserRuleCall_0; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statement");
		private final RuleCall cTypeDeclParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Statement:
		//	TypeDecl;
		public ParserRule getRule() { return rule; }

		//TypeDecl
		public RuleCall getTypeDeclParserRuleCall() { return cTypeDeclParserRuleCall; }
	}

	public class PTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTypeIntTypeTerminalRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTypeStrTypeTerminalRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//PType:
		//	type=intType | type=strType;
		public ParserRule getRule() { return rule; }

		//type=intType | type=strType
		public Alternatives getAlternatives() { return cAlternatives; }

		//type=intType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//intType
		public RuleCall getTypeIntTypeTerminalRuleCall_0_0() { return cTypeIntTypeTerminalRuleCall_0_0; }

		//type=strType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//strType
		public RuleCall getTypeStrTypeTerminalRuleCall_1_0() { return cTypeStrTypeTerminalRuleCall_1_0; }
	}

	public class TypeDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeDecl");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Keyword cTypeKeyword_0_0_0 = (Keyword)cAlternatives_0_0.eContents().get(0);
		private final Keyword cTypeKeyword_0_0_1 = (Keyword)cAlternatives_0_0.eContents().get(1);
		private final Keyword cTYPEKeyword_0_0_2 = (Keyword)cAlternatives_0_0.eContents().get(2);
		private final Assignment cTypenameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cTypenameIDTerminalRuleCall_0_1_0 = (RuleCall)cTypenameAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cTypeKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cTypeKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final Keyword cTYPEKeyword_1_0_2 = (Keyword)cAlternatives_1_0.eContents().get(2);
		private final Assignment cTypenameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypenameIDTerminalRuleCall_1_1_0 = (RuleCall)cTypenameAssignment_1_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cTpcodeAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cTpcodeTypeCodeParserRuleCall_1_3_0 = (RuleCall)cTpcodeAssignment_1_3.eContents().get(0);
		
		//TypeDecl:
		//	("type" | "Type" | "TYPE") typename=ID | ("type" | "Type" | "TYPE")? typename=ID "="? tpcode=typeCode;
		public ParserRule getRule() { return rule; }

		//("type" | "Type" | "TYPE") typename=ID | ("type" | "Type" | "TYPE")? typename=ID "="? tpcode=typeCode
		public Alternatives getAlternatives() { return cAlternatives; }

		//("type" | "Type" | "TYPE") typename=ID
		public Group getGroup_0() { return cGroup_0; }

		//"type" | "Type" | "TYPE"
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }

		//"type"
		public Keyword getTypeKeyword_0_0_0() { return cTypeKeyword_0_0_0; }

		//"Type"
		public Keyword getTypeKeyword_0_0_1() { return cTypeKeyword_0_0_1; }

		//"TYPE"
		public Keyword getTYPEKeyword_0_0_2() { return cTYPEKeyword_0_0_2; }

		//typename=ID
		public Assignment getTypenameAssignment_0_1() { return cTypenameAssignment_0_1; }

		//ID
		public RuleCall getTypenameIDTerminalRuleCall_0_1_0() { return cTypenameIDTerminalRuleCall_0_1_0; }

		//("type" | "Type" | "TYPE")? typename=ID "="? tpcode=typeCode
		public Group getGroup_1() { return cGroup_1; }

		//("type" | "Type" | "TYPE")?
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }

		//"type"
		public Keyword getTypeKeyword_1_0_0() { return cTypeKeyword_1_0_0; }

		//"Type"
		public Keyword getTypeKeyword_1_0_1() { return cTypeKeyword_1_0_1; }

		//"TYPE"
		public Keyword getTYPEKeyword_1_0_2() { return cTYPEKeyword_1_0_2; }

		//typename=ID
		public Assignment getTypenameAssignment_1_1() { return cTypenameAssignment_1_1; }

		//ID
		public RuleCall getTypenameIDTerminalRuleCall_1_1_0() { return cTypenameIDTerminalRuleCall_1_1_0; }

		//"="?
		public Keyword getEqualsSignKeyword_1_2() { return cEqualsSignKeyword_1_2; }

		//tpcode=typeCode
		public Assignment getTpcodeAssignment_1_3() { return cTpcodeAssignment_1_3; }

		//typeCode
		public RuleCall getTpcodeTypeCodeParserRuleCall_1_3_0() { return cTpcodeTypeCodeParserRuleCall_1_3_0; }
	}

	public class TypeCodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "typeCode");
		private final Assignment cPrmAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPrmPTypeParserRuleCall_0 = (RuleCall)cPrmAssignment.eContents().get(0);
		
		//typeCode:
		//	prm=PType;
		public ParserRule getRule() { return rule; }

		//prm=PType
		public Assignment getPrmAssignment() { return cPrmAssignment; }

		//PType
		public RuleCall getPrmPTypeParserRuleCall_0() { return cPrmPTypeParserRuleCall_0; }
	}
	
	
	private ProgramElements pProgram;
	private StatementElements pStatement;
	private PTypeElements pPType;
	private TerminalRule tIntType;
	private TerminalRule tStrType;
	private TypeDeclElements pTypeDecl;
	private TypeCodeElements pTypeCode;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public GACLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	stmts+=Statement*;
	public ProgramElements getProgramAccess() {
		return (pProgram != null) ? pProgram : (pProgram = new ProgramElements());
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Statement:
	//	TypeDecl;
	public StatementElements getStatementAccess() {
		return (pStatement != null) ? pStatement : (pStatement = new StatementElements());
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	//PType:
	//	type=intType | type=strType;
	public PTypeElements getPTypeAccess() {
		return (pPType != null) ? pPType : (pPType = new PTypeElements());
	}
	
	public ParserRule getPTypeRule() {
		return getPTypeAccess().getRule();
	}

	//terminal intType:
	//	"int";
	public TerminalRule getIntTypeRule() {
		return (tIntType != null) ? tIntType : (tIntType = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "intType"));
	} 

	//terminal strType:
	//	"string";
	public TerminalRule getStrTypeRule() {
		return (tStrType != null) ? tStrType : (tStrType = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "strType"));
	} 

	//TypeDecl:
	//	("type" | "Type" | "TYPE") typename=ID | ("type" | "Type" | "TYPE")? typename=ID "="? tpcode=typeCode;
	public TypeDeclElements getTypeDeclAccess() {
		return (pTypeDecl != null) ? pTypeDecl : (pTypeDecl = new TypeDeclElements());
	}
	
	public ParserRule getTypeDeclRule() {
		return getTypeDeclAccess().getRule();
	}

	//typeCode:
	//	prm=PType;
	public TypeCodeElements getTypeCodeAccess() {
		return (pTypeCode != null) ? pTypeCode : (pTypeCode = new TypeCodeElements());
	}
	
	public ParserRule getTypeCodeRule() {
		return getTypeCodeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}