/**
  * Should take all symobls to tokens for TreeWalker (e.g., 'EXP)
  */

grammar Expr;
options {
	output = AST;
	ASTLabelType = CommonTree;
	memoize = true;	
}

tokens{
FUNC_ARGS;
ID;
DOT;
DOT_CARET;
CARET;
SINGLE_QUOTE;
DOT_TRANSPOSE;
MINUS;
NOT;
DOT_STAR;
DOT_SLASH;
DOT_BACKSLASH;
STAR;
SLASH;
BACKSLASH;
PLUS;
COLON_ARGS;
LESS_THAN;
GREATER_THAN;
LESS_EQUAL;
GREATER_EQUL;
ISEQUAL;
NOT_EQUAL;
ELE_AND;
ELE_OR;
SC_AND;
SC_OR;
HCAT_VEC;
VCAT_VEC;
HCAT_CELL;
VCAT_CELL;
EQUALS;
IF;
ELSEIF;
ELSE;
IF_STAT;
SWITCH;
CASE;
OTHERWISE;
SWITCH_STAT;
FOR;
FOR_LOOP; 
WHILE;
WHILE_LOOP;
BLOCK;
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
 
prog		: block+ | (functionHeader! block* (BLOCK_END!)?);

functionArgs	:  expr (COMMA expr)* -> ^(FUNC_ARGS expr*);

functionCall 	: ((ID (OPENP|OPENC)) => (ID^ (((OPENC) functionArgs? (CLOSEC))* (OPENP! functionArgs? CLOSEP!)?)))	
	;


functionCallOrStructure	: functionCall (DOT^ (OPENP expr CLOSEP | functionCall))?;


functionHeader	: FUNCTION 
		(
		(((OPENB (ID (COMMA? ID)*)? CLOSEB) | ID)? EQUALS)?
		) 
		ID 
		(OPENP (ID (COMMA ID)*)? CLOSEP)?	
		;

/*
 * Chain of Precedence
 */
term	: EMPTY_VEC 
	| EMPTY_CELL
	| OPENP! expr CLOSEP!
	| STRING_LITERAL
	| END
	| vector
	| cellArray
	| COLON
	| TRUE
	| FALSE
	| INTEGER (DOT^ INTEGER)?
	| DOT^ INTEGER
	| functionCallOrStructure
	;
	
transponent
		: (term (
		( (DOT_CARET^ | CARET^) term)*
		| (SINGLE_QUOTE^ | DOT_TRANSPOSE^)*)
		)
		;
	
unary	: (PLUS! | MINUS^ | NOT^)* transponent;

mult	: unary ( (DOT_STAR^ | DOT_SLASH^ | DOT_BACKSLASH^ | STAR^ | SLASH^ | BACKSLASH^) unary )* ;

add	: mult ( (PLUS^ | MINUS^) mult)*	;

colonEnd:	(COLON add)+ -> ^(COLON_ARGS add+);

colon	: add (colonEnd^)?;

logical	: colon ( (LESS_THAN^ | GREATER_THAN^ | LESS_EQUAL^ | GREATER_EQUAL^ | ISEQUAL^ | NOT_EQUAL^) colon )* ;

eleAnd	: logical (ELE_AND^ logical)* ;

eleOr	: eleAnd (ELE_OR^ eleAnd)* ;

scAnd	: eleOr (SC_AND^ eleOr)* ;

scOr	: scAnd (SC_OR^ scAnd)* ;


hCatVec	: expr ((COMMA)? expr)* -> ^(HCAT_VEC expr+);

vCatVec	: hCatVec ((SEMI) hCatVec)* -> ^(VCAT_VEC hCatVec+);

vector	: OPENB! vCatVec CLOSEB!;

hCatCell: expr ((COMMA)? expr)*  -> ^(HCAT_CELL expr+);

vCatCell: hCatCell ((SEMI)! hCatCell)* -> ^(VCAT_CELL hCatCell+);

cellArray	: OPENC! vCatCell? CLOSEC! ;	

expr	: scOr;
	
line	: (((term EQUALS) => (term EQUALS^))?
 expr (SEMI^)?);
	  
ifPart	: IF^ expr block?;
elseifPart	: (ELSEIF^ e2=expr b2=block?);
elsePart	:(ELSE^ b3=block?);
ifBlock : 
	ifPart
        elseifPart*
        elsePart?
        BLOCK_END
        -> ^(IF_STAT ifPart elseifPart* elsePart?)
        
    	;
    
switchPart	: SWITCH^ expr;
casePart	: CASE^ expr block?;
otherwiseBlock	: OTHERWISE^ block?;
switchBlock :	
	switchPart
	casePart*
	otherwiseBlock?
	BLOCK_END
	-> ^(SWITCH_STAT switchPart casePart* otherwiseBlock?)
	;

forPart	: FOR^ ID EQUALS expr;	
forBlock :	
	forPart
	block?
	BLOCK_END
	-> ^(FOR_LOOP forPart block?)
	;
	
whilePart	: WHILE^ expr;
whileBlock :	
	whilePart
	block?
	BLOCK_END
	-> ^(WHILE_LOOP whilePart block?)
	;
	
blockPart	:(ifBlock | switchBlock | forBlock | whileBlock | line);
block	: blockPart+ -> ^(BLOCK blockPart+);
	 



//Special High Priority
WS 	: (' ' | '\t' | '\f')+ {$channel = HIDDEN;};
BLOCK_END	: 'end' WS? '\r'? '\n'	;	//We insert an extra newline at the end of every file before processing to avoid last-line problems
NEWLINE	: '\r'? '\n'	{$channel = HIDDEN;};
SINGLE_QUOTE	: '$';//'\''	;

//Keywords
BREAK		: 'break'	;
CASE		: 'case'	;
CATCH		: 'catch'	;
CLASSDEF	: 'classdef'	;
CONTINUE	: 'continue'	;
ELSE		: 'else'	;
ELSEIF		: 'elseif'	;
END		: 'end'		;
FALSE		: 'false'	;
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
TRUE		: 'true'	;
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
DOT_SLASH	: './'		;
DOT_STAR	: '.*'		;
DOT_TRANSPOSE	: '.\''		;
ELE_AND		: '&'		;
ELE_OR		: '|'		;
EQUALS		: '='		;
EXCLAMATION	: '!'		;
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
SLASH		: '/'		;
STAR		: '*'		;


//Dynamically Defined
fragment DIGIT		: ('0'..'9')		;
fragment LETTER		: ('a'..'z' | 'A'..'Z')	;
fragment UNDERSCORE	: '_'			;
INTEGER	: DIGIT+;
 
COMMENT : '\%' .* NEWLINE {$channel = HIDDEN;};
//DOUBLE	: (DIGIT* '.' DIGIT+) | DIGIT+;//DIGIT* ('.' DIGIT+)?;//((DIGIT* DOT DIGIT+) | DIGIT+ /*| (DOT DIGIT+)*/) EXPONENT? ;
ELLIPSIS: '...'	NEWLINE+ {$channel = HIDDEN;}	;
EXPONENT: ('e' | 'E') ('+' | '-')? ('0'..'9')+  ;
ID 	: LETTER (LETTER | DIGIT | UNDERSCORE)*	;

STRING_LITERAL
      	: '\'' 
          {StringBuilder b = new StringBuilder();}
          ( '\'' '\''          {b.appendCodePoint('\'');}
          | c = ~('\'' | '\r' | '\n')  {b.appendCodePoint(c);}
          )*
          '\''
          {setText(b.toString());}
        ;



EMPTY_VEC	: '['']' 	;
EMPTY_CELL	: '{''}'	;



















