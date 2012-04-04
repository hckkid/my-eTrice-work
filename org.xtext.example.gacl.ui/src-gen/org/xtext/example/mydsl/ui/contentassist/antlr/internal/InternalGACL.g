/*
* generated by Xtext
*/
grammar InternalGACL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleProgram
entryRuleProgram 
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProgramAccess().getStmtsAssignment()); }
(rule__Program__StmtsAssignment)*
{ after(grammarAccess.getProgramAccess().getStmtsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStatement
entryRuleStatement 
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); }
	ruleTypeDecl
{ after(grammarAccess.getStatementAccess().getTypeDeclParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePType
entryRulePType 
:
{ before(grammarAccess.getPTypeRule()); }
	 rulePType
{ after(grammarAccess.getPTypeRule()); } 
	 EOF 
;

// Rule PType
rulePType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPTypeAccess().getAlternatives()); }
(rule__PType__Alternatives)
{ after(grammarAccess.getPTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeDecl
entryRuleTypeDecl 
:
{ before(grammarAccess.getTypeDeclRule()); }
	 ruleTypeDecl
{ after(grammarAccess.getTypeDeclRule()); } 
	 EOF 
;

// Rule TypeDecl
ruleTypeDecl
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeDeclAccess().getAlternatives()); }
(rule__TypeDecl__Alternatives)
{ after(grammarAccess.getTypeDeclAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuletypeCode
entryRuletypeCode 
:
{ before(grammarAccess.getTypeCodeRule()); }
	 ruletypeCode
{ after(grammarAccess.getTypeCodeRule()); } 
	 EOF 
;

// Rule typeCode
ruletypeCode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeCodeAccess().getPrmAssignment()); }
(rule__TypeCode__PrmAssignment)
{ after(grammarAccess.getTypeCodeAccess().getPrmAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__PType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPTypeAccess().getTypeAssignment_0()); }
(rule__PType__TypeAssignment_0)
{ after(grammarAccess.getPTypeAccess().getTypeAssignment_0()); }
)

    |(
{ before(grammarAccess.getPTypeAccess().getTypeAssignment_1()); }
(rule__PType__TypeAssignment_1)
{ after(grammarAccess.getPTypeAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getGroup_0()); }
(rule__TypeDecl__Group_0__0)
{ after(grammarAccess.getTypeDeclAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getTypeDeclAccess().getGroup_1()); }
(rule__TypeDecl__Group_1__0)
{ after(grammarAccess.getTypeDeclAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Alternatives_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); }

	'type' 

{ after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_0()); }
)

    |(
{ before(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); }

	'Type' 

{ after(grammarAccess.getTypeDeclAccess().getTypeKeyword_0_0_1()); }
)

    |(
{ before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()); }

	'TYPE' 

{ after(grammarAccess.getTypeDeclAccess().getTYPEKeyword_0_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Alternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0()); }

	'type' 

{ after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_0()); }
)

    |(
{ before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1()); }

	'Type' 

{ after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1_0_1()); }
)

    |(
{ before(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2()); }

	'TYPE' 

{ after(grammarAccess.getTypeDeclAccess().getTYPEKeyword_1_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__TypeDecl__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_0__0__Impl
	rule__TypeDecl__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getAlternatives_0_0()); }
(rule__TypeDecl__Alternatives_0_0)
{ after(grammarAccess.getTypeDeclAccess().getAlternatives_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDecl__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_0_1()); }
(rule__TypeDecl__TypenameAssignment_0_1)
{ after(grammarAccess.getTypeDeclAccess().getTypenameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TypeDecl__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_1__0__Impl
	rule__TypeDecl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getAlternatives_1_0()); }
(rule__TypeDecl__Alternatives_1_0)?
{ after(grammarAccess.getTypeDeclAccess().getAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDecl__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_1__1__Impl
	rule__TypeDecl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_1()); }
(rule__TypeDecl__TypenameAssignment_1_1)
{ after(grammarAccess.getTypeDeclAccess().getTypenameAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDecl__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_1__2__Impl
	rule__TypeDecl__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2()); }
(
	'=' 
)?
{ after(grammarAccess.getTypeDeclAccess().getEqualsSignKeyword_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDecl__Group_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeDecl__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_3()); }
(rule__TypeDecl__TpcodeAssignment_1_3)
{ after(grammarAccess.getTypeDeclAccess().getTpcodeAssignment_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Program__StmtsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); }
	ruleStatement{ after(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PType__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); }
	RULE_INTTYPE{ after(grammarAccess.getPTypeAccess().getTypeIntTypeTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PType__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); }
	RULE_STRTYPE{ after(grammarAccess.getPTypeAccess().getTypeStrTypeTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__TypenameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); }
	RULE_ID{ after(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__TypenameAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); }
	RULE_ID{ after(grammarAccess.getTypeDeclAccess().getTypenameIDTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__TpcodeAssignment_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); }
	ruletypeCode{ after(grammarAccess.getTypeDeclAccess().getTpcodeTypeCodeParserRuleCall_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeCode__PrmAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); }
	rulePType{ after(grammarAccess.getTypeCodeAccess().getPrmPTypeParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_INTTYPE : 'int';

RULE_STRTYPE : 'string';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

