grammar Expr;
options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}
tokens {
NEGATE;
CALL;
EMPTY_VECTOR;
VECTOR;
CELL;
STRUCT;
STRUCTA;
STRUCTAV;
STRUCTV;
VECFIELD;
CELLFIELD;
VECFIELDV;
CELLFIELDV;
MULTI_RETURN;
HCAT;
CVCAT;
CHCAT;
VCAT;
INDEX;
BODY;
LINE;
TRANSPOSE;
}


@header {
  package parser;
}


@lexer::header {
  package parser;
}




// START:stat
/** Match a series of stat rules and, for each one, print out the
 *  tree stat returns, $stat.tree.  toStringTree() prints the tree
 *  out in form: (root child1 ... childN).  ANTLR's default tree 
 *  construction mechanism will build a list (flat tree) of the stat
 *  result trees.  This tree will be the input to the tree parser.
 */
prog:   body EOF!
;


body : 
        parts -> ^(BODY parts)
;
parts :
( (stat 
  | ifStat
  | switchStat
  | whileStat
  | forStat
  | tryCatch)   )* 
        ;


// realend : (END NEWLINE) -> END;


stat:
        (ID OPENP actualParameters CLOSEP DOT ID GETS)
         => str=ID OPENP actualParameters CLOSEP  DOT fld=ID GETS expr SEMI? 
         -> ^(GETS ^(STRUCTA $str $fld actualParameters) expr SEMI?)
    |   (ID OPENP actualParameters CLOSEP DOT OPENP)
         => str=ID OPENP actualParameters CLOSEP DOT OPENP var=ID CLOSEP GETS expr SEMI? 
         -> ^(GETS ^(STRUCTAV $str $var actualParameters) expr SEMI?)
    | (ID DOT OPENP) 
    => str=ID DOT OPENP var=ID CLOSEP GETS expr SEMI?
    -> ^(GETS ^(STRUCTV $str $var) expr SEMI?)
    |    (ID DOT ID) 
    => str=ID DOT fld=ID GETS expr SEMI? 
    -> ^(GETS ^(STRUCT $str $fld) expr SEMI?)
    |   (ID OPENP actualParameters CLOSEP GETS)
         => ID OPENP actualParameters CLOSEP GETS expr SEMI? 
         -> ^(INDEX ID actualParameters expr SEMI?)
    |   (ID GETS) => ID GETS expr SEMI? -> ^(GETS ID expr SEMI?)
    |   (OPENB chCat CLOSEB GETS) =>  (OPENB chCat CLOSEB GETS fn=ID OPENP p=actualParameters CLOSEP SEMI?)
            -> ^(MULTI_RETURN chCat $fn $p SEMI?)
    |   expr SEMI?        -> ^(GETS expr SEMI?)
    |   CLEAR^
    |   COLORBAR^
    |   FIGURE^
    |   CLC^
    |   CLF^
    |   CLOSE^ ALL
    |   COLORMAP^ ID
    |   CD^ ID
    |   AXIS^ (ON | OFF | EQUAL| expr)
    |   GRID^ (ON|OFF)
    |   HOLD^ (ON|OFF)
    |   SHADING^ (FLAT|INTERP)
    |   NEWLINE           ->
    |   ELLIPSES NEWLINE  ->
    |   FUNCTION anything NEWLINE -> 
    ;
    
anything: (~NEWLINE)*;    
    
ifStat
    : IF^ e1=expr b1=body 
      (ELSEIF! e2=expr b2= body)*
      (ELSE! b3=body)?
      BLOCK_END!
    ;

tryCatch
    : TRY^ b1=body 
      CATCH! b3=body
      BLOCK_END!
    ;


forStat
: FOR^ ID GETS! expr body BLOCK_END!
;


whileStat
: WHILE^ expr body BLOCK_END!
;


switchStat 
: SWITCH^ ID (caseClause )* defaultClause? BLOCK_END!
;
caseClause 
: CASE^ expr body
;
defaultClause 
: OTHERWISE^ body
;
actualParameters
: expr (COMMA expr)* -> expr*
;
term : (ID OPENP actualParameters CLOSEP DOT OPENP) 
                    => st=ID OPENP e=actualParameters CLOSEP DOT OPENP var=ID CLOSEP
                    -> ^(STRUCTAV $st $var $e)
        | (ID OPENP actualParameters CLOSEP DOT ) 
                    => st=ID OPENP e=actualParameters CLOSEP DOT fld=ID
                    -> ^(STRUCTA $st $fld $e)
        |   (ID OPENP actualParameters CLOSEP) => ID OPENP actualParameters CLOSEP 
                                -> ^(CALL ID actualParameters)
        | (ID DOT OPENP) => st=ID DOT OPENP var=ID CLOSEP
                                -> ^(STRUCTV $st $var)
        | (ID DOT ID) => st=ID DOT fld=ID 
                                -> ^(STRUCT $st $fld)
    | OPENB CLOSEB -> EMPTY_VECTOR
    | DOUBLE 
    |   ID
    |   OPENP! expr CLOSEP!
    | STRING_LITERAL
    | END
    ;
 
    
   
transponent
    : term 
    (
    ( DOTCARET^
    | CARET^
    | DOTTICK^
    | TICK^
    ) 
    term)*
    ;
      
unary
: (PLUS! | negation^)* transponent
;
negation
: MINUS -> NEGATE
;
mult
    : unary (
    ( MULT^
    | DOTMULT^
    | DIV^
    | DOTDIV^
    | BACK^
    | DOTBACK^
    )
    unary)*
    ; 
    
add:   mult ((PLUS^|MINUS^) mult)*
    ; 
   
colonParameters
: mightBeEnd (COLON mightBeEnd)* -> mightBeEnd*
;


//endIndex: END ((PLUS^|MINUS^|MULT^|DIV^|DOTMULT^|DOTDIV^) (add | END))*;//((OPENP) END) => END;//END (COMMA | COLON | CLOSEP | SEMI) => END;
mightBeEnd: (add);//| endIndex);


colon 
    : (mightBeEnd COLON) => colonParameters -> ^(COLON colonParameters)
    |  mightBeEnd
    | COLON
    ;
   
    
relation
    : colon (
    ( LT^
    | GT^
    | LE^
    | GE^
    | EQ^
    | NE^
    )
    colon)*
    ;


eleAnd
    : relation (
    ( AND^
    )
    relation)*
    ;


eleOr
    : eleAnd (
    ( OR^
    )
    eleAnd)*
    ;
    
scAnd
    : eleOr (
    ( SCAND^
    )
    eleOr)*
    ;
    
scOr
    : scAnd (
    ( SCOR^
    )
    scAnd)*
    ;


hCat :
expr ( (COMMA?)! expr )* -> ^(HCAT expr+)
;
chCat :
expr ( (COMMA?)! expr )* -> ^(CHCAT expr+)
;
    
vcatArgs
:    (str=ID DOT fld=ID ) -> ^(VECFIELD $str $fld)
|    (str=ID DOT OPENP var=ID CLOSEP ) -> ^(VECFIELDV $str $var)
|    hCat ( (SEMI|NEWLINE) hCat )* -> ^(VCAT hCat+)
;
cvcatArgs
    :    (str=ID DOT fld=ID) -> ^(CELLFIELD $str $fld)
|    (str=ID DOT OPENP var=ID CLOSEP ) -> ^(CELLFIELDV $str $var)
|    chCat ( (SEMI|NEWLINE) chCat )* -> ^(CVCAT chCat+)
;
vCat
    : (OPENB! vcatArgs CLOSEB!)
    ;
    
cellCat
    : (OPENC! cvcatArgs CLOSEC!)
    ;
    
expr
    : (scOr | cellCat | vCat)
    ;


// END:expr




// START:tokens
//ENDIND : ~'\n' 'end'; 
BLOCK_END : 'end' '\n';//(~(')' | ';' | ':' | ',' | '/' | 'a'..'z' | 'A'..'Z' | '0'..'9'));
//THE_END : 'end' EOF;
CLEAR : 'clear';
FUNCTION : 'function';
ELLIPSES : '...';
CD : 'cd';
CLC : 'clc';
CLF : 'clf';
FIGURE : 'figure';
GRID : 'grid';
HOLD : 'hold';
EQUAL : 'equal';
ON : 'on';
OFF : 'off';
CLOSE : 'close';
ALL : 'all';
GETS : '=';
SWITCH : 'switch';
CASE : 'case';
OTHERWISE
: 'otherwise';
IF : 'if';
ELSE : 'else';
ELSEIF : 'elseif';
END : 'end';
FOR : 'for';
WHILE : 'while';
TRY : 'try';
CATCH : 'catch';
COMMA : ',';
OPENB : '[';
CLOSEB : ']';
OPENC : '{';
CLOSEC : '}';
OPENP : '(';
CLOSEP : ')';
NOT : '~';
SEMI : ';';
PLUS : '+';
MINUS : '-';
DOT : '.';
DOTMULT : '.*';
DOTDIV : './';
MULT : '*';
DIV : '/';
DOTCARET : '.^';
CARET : '^';
DOTTICK : '.\'';
TICK : '\'';
BACK : '\\';
DOTBACK : '.\\';
EQ : '==';
NE : '~=';
LT : '<';
LE : '<=';
GT : '>';
GE : '>=';
AND : '&';
OR : '|';
SCAND : '&&';
SCOR : '||';
COLORBAR : 'colorbar';
SHADING : 'shading';
FLAT : 'flat';
INTERP : 'interp';
AXIS : 'axis';
COLORMAP: 'colormap';


fragment LETTER : ('a'..'z' | 'A'..'Z' | '_') ;
fragment DIGIT : '0'..'9';
STRING_LITERAL
      : TICK 
        {StringBuilder b = new StringBuilder();}
        ( TICK TICK                 {b.appendCodePoint('\'');}
        | c = ~(TICK | '\r' | '\n')  {b.appendCodePoint(c);}
        )*
        TICK
        {setText(b.toString());}
        ;




ID : LETTER (LETTER | DIGIT)*;
COLON:  ':';
DOUBLE:   DIGIT+ '.' DIGIT* Exponent?
    |   '.' DIGIT+ Exponent?
    |   DIGIT+ Exponent?
;
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
NEWLINE:'\r'? '\n' ;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '\%' .* ('\n'|'\r') {$channel = HIDDEN;};


// END:tokens

