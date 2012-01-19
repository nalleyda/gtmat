/**
  * Should take all symobls to tokens for TreeWalker (e.g., 'EXP)
  */

grammar Grammar;
options {
	output = AST;
	ASTLabelType = CommonTree;
	memoize = true;	
}

tokens{
//Do we need this?
FUNC_ARGS;
FUNC_CALL;
HCAT_CELL;
HCAT_VEC;
UNARY_OP;
VCAT_CELL;
VCAT_VEC;
}

@header{
	package parser;
}

@lexer::header{
	package parser;
}

//prog 	: expr EOF;

	
/*
 * Helper Definitions
 */
 
start	: prog EOF!;
 
prog		: line ((NEWLINE*)! line)*;
 
//index		: OPENP (expr (COMMA expr)*)? CLOSEP ;

//structAccess	: DOT (OPENP expr CLOSEP | ID) ;

exprList	: expr (COMMA! expr)*	;

//idRule		: ID	;

//funcArgs	: (expr (COMMA! expr)*)?;

functionArgs	:  expr (COMMA expr)* -> ^(FUNC_ARGS expr*);

functionCall 	: (ID OPENP) => (ID^ (
	/*(OPENP) => */(OPENP! (functionArgs | ()) CLOSEP!)?//functionArgs? CLOSEP)
	//| ( )
	))
	;

//functionCall	: functionLeft;

functionCallOrStructure	: functionCall (DOT^ (OPENP! expr CLOSEP! | ID))?;//structAccess?;//((functionCall DOT) => functionCall DOT structAccess) | functionCall;

/*
 * Chain of Precedence
 */
term	: OPENP! expr CLOSEP!
	//| cellArray		//OPENC! exprList CLOSEC!
	//| vector		//OPENB! exprList CLOSEB!
	| STRING_LITERAL
	| DOUBLE
	//| idRule
	//| functionCall
	//| structure
	| functionCallOrStructure //(DOT (OPENP | ID) => DOT structAccess)
	//| functionCallOrStructure
	;
	
transponent	: term (
		( (DOT_CARET | CARET)^ term)*
		| (SINGLE_QUOTE | DOT_TRANSPOSE)^
		)
		;
	
unary	: (PLUS! | MINUS | NOT)* transponent;/// -> ((MINUS | NOT)* transponent);

mult	: unary ( (DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH) unary )* ;

add	: mult ( (PLUS | MINUS) mult)*	;

colon	: add (COLON add)* ;

logical	: colon ( (LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL) colon )* ;

eleAnd	: logical (ELE_AND logical)* ;

eleOr	: eleAnd (ELE_OR eleAnd)* ;

scAnd	: eleOr (SC_AND eleOr)* ;

scOr	: scAnd (SC_OR scAnd)* ;

//hCatArgList : (COMMA (expr | vCatCell))+ ;

//hCatVec	: ( (COMMA vecArg)* )? CLOSEB) | scOr ;

//vCatVec : ( (SEMI vecArg)* )? CLOSEB) | hCatVec ;

//hCatVec : openB ;

scOr_or_vec	: scOr | vector;

scOr_or_cell	: scOr | cellArray;

hCatVec	: expr ((COMMA)? expr)* -> ^(HCAT_VEC expr+);// -> ^(HCAT_VEC expr+);

vCatVec	: hCatVec ((SEMI) hCatVec)* -> ^(VCAT_VEC hCatVec+);// -> ^(VCAT_VEC expr+);

vector	: OPENB! vCatVec CLOSEB!;

hCatCell: scOr_or_cell ((COMMA)? scOr_or_cell)*  -> ^(HCAT_CELL scOr_or_cell+);

vCatCell: hCatCell ((SEMI)! hCatCell)* -> ^(VCAT_CELL hCatCell+);

cellArray	: OPENC! vCatCell CLOSEC! ;	

expr	: vector | cellArray | scOr;// | unary;
	/*| OPENB vCatVec CLOSEB
	| OPENC*/
	
//lhs	: (functionCallOrStructure EQUALS) => (functionCallOrStructure EQUALS);
	
line	: (((functionCallOrStructure EQUALS) => (functionCallOrStructure EQUALS)) | ( )) 
 expr SEMI?;
	 
//expr	: 'a'+;




//Special High Priority

//Keywords
BREAK		: 'break'	;
CASE		: 'case'	;
CATCH		: 'catch'	;
CLASSDEF	: 'classdef'	;
CONTINUE	: 'continue'	;
ELSE		: 'else'	;
ELSEIF		: 'elseif'	;
END		: 'end'		;
FOR		: 'for'		;
FUNCTION	: 'function'	;
GLOBAL		: 'global'	;
IF		: 'if'		;
OTHERWISE	: 'otherwise'	;
PARFOR		: 'parfor'	;
PERSISTENT	: 'persistent'	;
RETURN		: 'return'	;
SPMD		: 'spmd'	;
SWITCH		: 'switch'	;
TRY		: 'try'		;
WHILE		: 'while'	;

//Operators
AT		: '@'		;
BACKSLASH	: '\\'		;
CARET		: '^'		;
CLOSE_BLOCK	: '%}'		;
CLOSEB		: ']'		;
CLOSEC		: '}'		;
CLOSEP		: ')'		;
COLON		: ':'		;
COMMA		: ','		;
DOUBLE_QUOTE	: '"'		;
DOT		: '.'		;
DOT_BACKSLASH	: '.\\'		;
DOT_CARET	: '.^'		;
//DOT_OPENP	: '.('		;	//might need high priority
DOT_SLASH	: './'		;
DOT_STAR	: '.*'		;
DOT_TRANSPOSE	: '.\''		;
ELE_AND		: '&'		;
ELE_OR		: '|'		;
EQUALS		: '='		;
ECLAMATION	: '!'		;
GREATER_THAN	: '>'		;
GREATER_EQUAL	: '>='		;
ISEQUAL		: '=='		;
LESS_EQUAL	: '<='		;
LESS_THAN	: '<'		;
MINUS		: '-'		;
NOT		: '~'		;
NOT_EQUAL	: '~='		;
OPEN_BLOCK	: '%{'		;
OPENB		: '['		;
OPENC		: '{'		;
OPENP		: '('		;
PERCENT		: '%'		;
PLUS		: '+'		;
SC_AND		: '&&'		;
SC_OR		: '||'		;
SEMI		: ';'		;
SINGLE_QUOTE	: '\''		;
SLASH		: '/'		;
STAR		: '*'		;


//Dynamically Defined
fragment DIGIT		: ('0'..'9')		;
fragment LETTER		: ('a'..'z' | 'A'..'Z')	;
fragment UNDERSCORE	: '_'			;
 
COMMENT : '\%' .* ('\n'|'\r') {$channel = HIDDEN;};
DOUBLE	: ((DIGIT+ DOT DIGIT*) | (DOT DIGIT+) | DIGIT+) EXPONENT? ;
ELLIPSIS: '...'	NEWLINE* {$channel = HIDDEN;}	;
EXPONENT: ('e' | 'E') ('+' | '-')? ('0'..'9')+  ;
ID 	: LETTER (LETTER | DIGIT | UNDERSCORE)*	;
NEWLINE	: '\r'? '\n'	;
STRING_LITERAL
      	: SINGLE_QUOTE 
          {StringBuilder b = new StringBuilder();}
          ( SINGLE_QUOTE SINGLE_QUOTE          {b.appendCodePoint('\'');}
          | c = ~(SINGLE_QUOTE | '\r' | '\n')  {b.appendCodePoint(c);}
          )*
          SINGLE_QUOTE
          {setText(b.toString());}
        ;
WS 	: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};











