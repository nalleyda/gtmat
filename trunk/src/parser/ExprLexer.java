// $ANTLR 3.4 C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g 2011-09-27 15:29:32

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ALL=4;
    public static final int AND=5;
    public static final int AXIS=6;
    public static final int BACK=7;
    public static final int BLOCK_END=8;
    public static final int BODY=9;
    public static final int CALL=10;
    public static final int CARET=11;
    public static final int CASE=12;
    public static final int CATCH=13;
    public static final int CD=14;
    public static final int CELL=15;
    public static final int CELLFIELD=16;
    public static final int CELLFIELDV=17;
    public static final int CHCAT=18;
    public static final int CLC=19;
    public static final int CLEAR=20;
    public static final int CLF=21;
    public static final int CLOSE=22;
    public static final int CLOSEB=23;
    public static final int CLOSEC=24;
    public static final int CLOSEP=25;
    public static final int COLON=26;
    public static final int COLORBAR=27;
    public static final int COLORMAP=28;
    public static final int COMMA=29;
    public static final int COMMENT=30;
    public static final int CVCAT=31;
    public static final int DIGIT=32;
    public static final int DIV=33;
    public static final int DOT=34;
    public static final int DOTBACK=35;
    public static final int DOTCARET=36;
    public static final int DOTDIV=37;
    public static final int DOTMULT=38;
    public static final int DOTTICK=39;
    public static final int DOUBLE=40;
    public static final int ELLIPSES=41;
    public static final int ELSE=42;
    public static final int ELSEIF=43;
    public static final int EMPTY_VECTOR=44;
    public static final int END=45;
    public static final int EQ=46;
    public static final int EQUAL=47;
    public static final int Exponent=48;
    public static final int FIGURE=49;
    public static final int FLAT=50;
    public static final int FOR=51;
    public static final int FUNCTION=52;
    public static final int GE=53;
    public static final int GETS=54;
    public static final int GRID=55;
    public static final int GT=56;
    public static final int HCAT=57;
    public static final int HOLD=58;
    public static final int ID=59;
    public static final int IF=60;
    public static final int INDEX=61;
    public static final int INTERP=62;
    public static final int LE=63;
    public static final int LETTER=64;
    public static final int LINE=65;
    public static final int LT=66;
    public static final int MINUS=67;
    public static final int MULT=68;
    public static final int MULTI_RETURN=69;
    public static final int NE=70;
    public static final int NEGATE=71;
    public static final int NEWLINE=72;
    public static final int NOT=73;
    public static final int OFF=74;
    public static final int ON=75;
    public static final int OPENB=76;
    public static final int OPENC=77;
    public static final int OPENP=78;
    public static final int OR=79;
    public static final int OTHERWISE=80;
    public static final int PLUS=81;
    public static final int SCAND=82;
    public static final int SCOR=83;
    public static final int SEMI=84;
    public static final int SHADING=85;
    public static final int STRING_LITERAL=86;
    public static final int STRUCT=87;
    public static final int STRUCTA=88;
    public static final int STRUCTAV=89;
    public static final int STRUCTV=90;
    public static final int SWITCH=91;
    public static final int TICK=92;
    public static final int TRANSPOSE=93;
    public static final int TRY=94;
    public static final int VCAT=95;
    public static final int VECFIELD=96;
    public static final int VECFIELDV=97;
    public static final int VECTOR=98;
    public static final int WHILE=99;
    public static final int WS=100;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g"; }

    // $ANTLR start "BLOCK_END"
    public final void mBLOCK_END() throws RecognitionException {
        try {
            int _type = BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:296:11: ( 'end' '\\n' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:296:13: 'end' '\\n'
            {
            match("end"); 



            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK_END"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:298:7: ( 'clear' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:298:9: 'clear'
            {
            match("clear"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:299:10: ( 'function' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:299:12: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "ELLIPSES"
    public final void mELLIPSES() throws RecognitionException {
        try {
            int _type = ELLIPSES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:300:10: ( '...' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:300:12: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELLIPSES"

    // $ANTLR start "CD"
    public final void mCD() throws RecognitionException {
        try {
            int _type = CD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:301:4: ( 'cd' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:301:6: 'cd'
            {
            match("cd"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CD"

    // $ANTLR start "CLC"
    public final void mCLC() throws RecognitionException {
        try {
            int _type = CLC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:302:5: ( 'clc' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:302:7: 'clc'
            {
            match("clc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLC"

    // $ANTLR start "CLF"
    public final void mCLF() throws RecognitionException {
        try {
            int _type = CLF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:303:5: ( 'clf' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:303:7: 'clf'
            {
            match("clf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLF"

    // $ANTLR start "FIGURE"
    public final void mFIGURE() throws RecognitionException {
        try {
            int _type = FIGURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:304:8: ( 'figure' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:304:10: 'figure'
            {
            match("figure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGURE"

    // $ANTLR start "GRID"
    public final void mGRID() throws RecognitionException {
        try {
            int _type = GRID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:305:6: ( 'grid' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:305:8: 'grid'
            {
            match("grid"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRID"

    // $ANTLR start "HOLD"
    public final void mHOLD() throws RecognitionException {
        try {
            int _type = HOLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:306:6: ( 'hold' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:306:8: 'hold'
            {
            match("hold"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOLD"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:307:7: ( 'equal' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:307:9: 'equal'
            {
            match("equal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:308:4: ( 'on' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:308:6: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OFF"
    public final void mOFF() throws RecognitionException {
        try {
            int _type = OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:309:5: ( 'off' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:309:7: 'off'
            {
            match("off"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OFF"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:310:7: ( 'close' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:310:9: 'close'
            {
            match("close"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:311:5: ( 'all' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:311:7: 'all'
            {
            match("all"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "GETS"
    public final void mGETS() throws RecognitionException {
        try {
            int _type = GETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:312:6: ( '=' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:312:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETS"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:313:8: ( 'switch' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:313:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:314:6: ( 'case' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:314:8: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "OTHERWISE"
    public final void mOTHERWISE() throws RecognitionException {
        try {
            int _type = OTHERWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:316:3: ( 'otherwise' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:316:3: 'otherwise'
            {
            match("otherwise"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OTHERWISE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:317:4: ( 'if' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:317:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:318:6: ( 'else' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:318:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:319:8: ( 'elseif' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:319:10: 'elseif'
            {
            match("elseif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:320:5: ( 'end' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:320:7: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:321:5: ( 'for' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:321:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:322:7: ( 'while' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:322:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:323:5: ( 'try' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:323:7: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:324:7: ( 'catch' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:324:9: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:325:7: ( ',' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:325:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPENB"
    public final void mOPENB() throws RecognitionException {
        try {
            int _type = OPENB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:326:7: ( '[' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:326:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENB"

    // $ANTLR start "CLOSEB"
    public final void mCLOSEB() throws RecognitionException {
        try {
            int _type = CLOSEB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:327:8: ( ']' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:327:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEB"

    // $ANTLR start "OPENC"
    public final void mOPENC() throws RecognitionException {
        try {
            int _type = OPENC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:328:7: ( '{' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:328:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENC"

    // $ANTLR start "CLOSEC"
    public final void mCLOSEC() throws RecognitionException {
        try {
            int _type = CLOSEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:329:8: ( '}' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:329:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEC"

    // $ANTLR start "OPENP"
    public final void mOPENP() throws RecognitionException {
        try {
            int _type = OPENP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:330:7: ( '(' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:330:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENP"

    // $ANTLR start "CLOSEP"
    public final void mCLOSEP() throws RecognitionException {
        try {
            int _type = CLOSEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:331:8: ( ')' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:331:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEP"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:332:5: ( '~' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:332:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:333:6: ( ';' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:333:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:334:6: ( '+' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:334:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:335:7: ( '-' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:335:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:336:5: ( '.' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:336:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOTMULT"
    public final void mDOTMULT() throws RecognitionException {
        try {
            int _type = DOTMULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:337:9: ( '.*' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:337:11: '.*'
            {
            match(".*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTMULT"

    // $ANTLR start "DOTDIV"
    public final void mDOTDIV() throws RecognitionException {
        try {
            int _type = DOTDIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:338:8: ( './' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:338:10: './'
            {
            match("./"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTDIV"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:339:6: ( '*' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:339:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:340:5: ( '/' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:340:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DOTCARET"
    public final void mDOTCARET() throws RecognitionException {
        try {
            int _type = DOTCARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:341:10: ( '.^' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:341:12: '.^'
            {
            match(".^"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTCARET"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:342:7: ( '^' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:342:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "DOTTICK"
    public final void mDOTTICK() throws RecognitionException {
        try {
            int _type = DOTTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:343:9: ( '.\\'' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:343:11: '.\\''
            {
            match(".'"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTTICK"

    // $ANTLR start "TICK"
    public final void mTICK() throws RecognitionException {
        try {
            int _type = TICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:344:6: ( '\\'' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:344:8: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TICK"

    // $ANTLR start "BACK"
    public final void mBACK() throws RecognitionException {
        try {
            int _type = BACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:345:6: ( '\\\\' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:345:8: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACK"

    // $ANTLR start "DOTBACK"
    public final void mDOTBACK() throws RecognitionException {
        try {
            int _type = DOTBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:346:9: ( '.\\\\' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:346:11: '.\\\\'
            {
            match(".\\"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTBACK"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:347:4: ( '==' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:347:6: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:348:4: ( '~=' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:348:6: '~='
            {
            match("~="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:349:4: ( '<' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:349:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:350:4: ( '<=' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:350:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:351:4: ( '>' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:351:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:352:4: ( '>=' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:352:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:353:5: ( '&' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:353:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:354:4: ( '|' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:354:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "SCAND"
    public final void mSCAND() throws RecognitionException {
        try {
            int _type = SCAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:355:7: ( '&&' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:355:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCAND"

    // $ANTLR start "SCOR"
    public final void mSCOR() throws RecognitionException {
        try {
            int _type = SCOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:356:6: ( '||' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:356:8: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCOR"

    // $ANTLR start "COLORBAR"
    public final void mCOLORBAR() throws RecognitionException {
        try {
            int _type = COLORBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:357:10: ( 'colorbar' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:357:12: 'colorbar'
            {
            match("colorbar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLORBAR"

    // $ANTLR start "SHADING"
    public final void mSHADING() throws RecognitionException {
        try {
            int _type = SHADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:358:9: ( 'shading' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:358:11: 'shading'
            {
            match("shading"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHADING"

    // $ANTLR start "FLAT"
    public final void mFLAT() throws RecognitionException {
        try {
            int _type = FLAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:359:6: ( 'flat' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:359:8: 'flat'
            {
            match("flat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLAT"

    // $ANTLR start "INTERP"
    public final void mINTERP() throws RecognitionException {
        try {
            int _type = INTERP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:360:8: ( 'interp' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:360:10: 'interp'
            {
            match("interp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERP"

    // $ANTLR start "AXIS"
    public final void mAXIS() throws RecognitionException {
        try {
            int _type = AXIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:361:6: ( 'axis' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:361:8: 'axis'
            {
            match("axis"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AXIS"

    // $ANTLR start "COLORMAP"
    public final void mCOLORMAP() throws RecognitionException {
        try {
            int _type = COLORMAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:362:9: ( 'colormap' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:362:11: 'colormap'
            {
            match("colormap"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLORMAP"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:365:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:366:16: ( '0' .. '9' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:368:7: ( TICK ( TICK TICK |c=~ ( TICK | '\\r' | '\\n' ) )* TICK )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:368:9: TICK ( TICK TICK |c=~ ( TICK | '\\r' | '\\n' ) )* TICK
            {
            mTICK(); 


            StringBuilder b = new StringBuilder();

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:370:9: ( TICK TICK |c=~ ( TICK | '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:370:11: TICK TICK
            	    {
            	    mTICK(); 


            	    mTICK(); 


            	    b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:371:11: c=~ ( TICK | '\\r' | '\\n' )
            	    {
            	    c= input.LA(1);

            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    b.appendCodePoint(c);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            mTICK(); 


            setText(b.toString());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:380:4: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:380:6: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:380:13: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:381:6: ( ':' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:381:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:7: ( ( DIGIT )+ '.' ( DIGIT )* ( Exponent )? | '.' ( DIGIT )+ ( Exponent )? | ( DIGIT )+ ( Exponent )? )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:11: ( DIGIT )+ '.' ( DIGIT )* ( Exponent )?
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:11: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:22: ( DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:29: ( Exponent )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:382:29: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:383:9: '.' ( DIGIT )+ ( Exponent )?
                    {
                    match('.'); 

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:383:13: ( DIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:383:20: ( Exponent )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:383:20: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:384:9: ( DIGIT )+ ( Exponent )?
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:384:9: ( DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:384:16: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:384:16: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            int _type = Exponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:386:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:386:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:386:22: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:386:33: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:387:8: ( ( '\\r' )? '\\n' )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:387:9: ( '\\r' )? '\\n'
            {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:387:9: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:387:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:388:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:388:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:388:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||(LA14_0 >= '\f' && LA14_0 <= '\r')||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:389:9: ( '\\%' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:389:11: '\\%' ( . )* ( '\\n' | '\\r' )
            {
            match('%'); 

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:389:16: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                    alt15=2;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:389:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:8: ( BLOCK_END | CLEAR | FUNCTION | ELLIPSES | CD | CLC | CLF | FIGURE | GRID | HOLD | EQUAL | ON | OFF | CLOSE | ALL | GETS | SWITCH | CASE | OTHERWISE | IF | ELSE | ELSEIF | END | FOR | WHILE | TRY | CATCH | COMMA | OPENB | CLOSEB | OPENC | CLOSEC | OPENP | CLOSEP | NOT | SEMI | PLUS | MINUS | DOT | DOTMULT | DOTDIV | MULT | DIV | DOTCARET | CARET | DOTTICK | TICK | BACK | DOTBACK | EQ | NE | LT | LE | GT | GE | AND | OR | SCAND | SCOR | COLORBAR | SHADING | FLAT | INTERP | AXIS | COLORMAP | STRING_LITERAL | ID | COLON | DOUBLE | Exponent | NEWLINE | WS | COMMENT )
        int alt16=73;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:10: BLOCK_END
                {
                mBLOCK_END(); 


                }
                break;
            case 2 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:20: CLEAR
                {
                mCLEAR(); 


                }
                break;
            case 3 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:26: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 4 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:35: ELLIPSES
                {
                mELLIPSES(); 


                }
                break;
            case 5 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:44: CD
                {
                mCD(); 


                }
                break;
            case 6 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:47: CLC
                {
                mCLC(); 


                }
                break;
            case 7 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:51: CLF
                {
                mCLF(); 


                }
                break;
            case 8 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:55: FIGURE
                {
                mFIGURE(); 


                }
                break;
            case 9 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:62: GRID
                {
                mGRID(); 


                }
                break;
            case 10 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:67: HOLD
                {
                mHOLD(); 


                }
                break;
            case 11 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:72: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 12 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:78: ON
                {
                mON(); 


                }
                break;
            case 13 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:81: OFF
                {
                mOFF(); 


                }
                break;
            case 14 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:85: CLOSE
                {
                mCLOSE(); 


                }
                break;
            case 15 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:91: ALL
                {
                mALL(); 


                }
                break;
            case 16 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:95: GETS
                {
                mGETS(); 


                }
                break;
            case 17 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:100: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 18 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:107: CASE
                {
                mCASE(); 


                }
                break;
            case 19 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:112: OTHERWISE
                {
                mOTHERWISE(); 


                }
                break;
            case 20 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:122: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:125: ELSE
                {
                mELSE(); 


                }
                break;
            case 22 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:130: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 23 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:137: END
                {
                mEND(); 


                }
                break;
            case 24 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:141: FOR
                {
                mFOR(); 


                }
                break;
            case 25 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:145: WHILE
                {
                mWHILE(); 


                }
                break;
            case 26 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:151: TRY
                {
                mTRY(); 


                }
                break;
            case 27 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:155: CATCH
                {
                mCATCH(); 


                }
                break;
            case 28 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:161: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 29 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:167: OPENB
                {
                mOPENB(); 


                }
                break;
            case 30 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:173: CLOSEB
                {
                mCLOSEB(); 


                }
                break;
            case 31 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:180: OPENC
                {
                mOPENC(); 


                }
                break;
            case 32 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:186: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 33 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:193: OPENP
                {
                mOPENP(); 


                }
                break;
            case 34 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:199: CLOSEP
                {
                mCLOSEP(); 


                }
                break;
            case 35 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:206: NOT
                {
                mNOT(); 


                }
                break;
            case 36 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:210: SEMI
                {
                mSEMI(); 


                }
                break;
            case 37 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:215: PLUS
                {
                mPLUS(); 


                }
                break;
            case 38 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:220: MINUS
                {
                mMINUS(); 


                }
                break;
            case 39 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:226: DOT
                {
                mDOT(); 


                }
                break;
            case 40 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:230: DOTMULT
                {
                mDOTMULT(); 


                }
                break;
            case 41 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:238: DOTDIV
                {
                mDOTDIV(); 


                }
                break;
            case 42 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:245: MULT
                {
                mMULT(); 


                }
                break;
            case 43 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:250: DIV
                {
                mDIV(); 


                }
                break;
            case 44 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:254: DOTCARET
                {
                mDOTCARET(); 


                }
                break;
            case 45 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:263: CARET
                {
                mCARET(); 


                }
                break;
            case 46 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:269: DOTTICK
                {
                mDOTTICK(); 


                }
                break;
            case 47 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:277: TICK
                {
                mTICK(); 


                }
                break;
            case 48 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:282: BACK
                {
                mBACK(); 


                }
                break;
            case 49 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:287: DOTBACK
                {
                mDOTBACK(); 


                }
                break;
            case 50 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:295: EQ
                {
                mEQ(); 


                }
                break;
            case 51 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:298: NE
                {
                mNE(); 


                }
                break;
            case 52 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:301: LT
                {
                mLT(); 


                }
                break;
            case 53 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:304: LE
                {
                mLE(); 


                }
                break;
            case 54 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:307: GT
                {
                mGT(); 


                }
                break;
            case 55 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:310: GE
                {
                mGE(); 


                }
                break;
            case 56 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:313: AND
                {
                mAND(); 


                }
                break;
            case 57 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:317: OR
                {
                mOR(); 


                }
                break;
            case 58 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:320: SCAND
                {
                mSCAND(); 


                }
                break;
            case 59 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:326: SCOR
                {
                mSCOR(); 


                }
                break;
            case 60 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:331: COLORBAR
                {
                mCOLORBAR(); 


                }
                break;
            case 61 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:340: SHADING
                {
                mSHADING(); 


                }
                break;
            case 62 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:348: FLAT
                {
                mFLAT(); 


                }
                break;
            case 63 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:353: INTERP
                {
                mINTERP(); 


                }
                break;
            case 64 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:360: AXIS
                {
                mAXIS(); 


                }
                break;
            case 65 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:365: COLORMAP
                {
                mCOLORMAP(); 


                }
                break;
            case 66 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:374: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 67 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:389: ID
                {
                mID(); 


                }
                break;
            case 68 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:392: COLON
                {
                mCOLON(); 


                }
                break;
            case 69 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:398: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 70 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:405: Exponent
                {
                mExponent(); 


                }
                break;
            case 71 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:414: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 72 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:422: WS
                {
                mWS(); 


                }
                break;
            case 73 :
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:1:425: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA10_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "382:1: DOUBLE : ( ( DIGIT )+ '.' ( DIGIT )* ( Exponent )? | '.' ( DIGIT )+ ( Exponent )? | ( DIGIT )+ ( Exponent )? );";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\3\45\1\75\4\45\1\106\4\45\7\uffff\1\116\6\uffff\1\117\1"+
        "\uffff\1\122\1\124\1\126\1\130\1\45\3\uffff\1\50\1\131\2\uffff\4"+
        "\45\1\uffff\1\45\1\141\6\45\7\uffff\2\45\1\153\4\45\2\uffff\2\45"+
        "\1\162\3\45\15\uffff\1\167\3\45\1\173\1\174\1\45\1\uffff\5\45\1"+
        "\u0083\3\45\1\uffff\1\u0087\1\45\1\u0089\3\45\1\uffff\2\45\1\u008f"+
        "\2\uffff\1\45\1\u0092\1\45\2\uffff\1\45\1\u0095\4\45\1\uffff\1\u009a"+
        "\1\u009b\1\u009c\1\uffff\1\45\1\uffff\1\u009e\4\45\1\uffff\1\u00a3"+
        "\1\45\1\uffff\1\u00a5\1\u00a6\1\uffff\1\u00a7\3\45\3\uffff\1\45"+
        "\1\uffff\3\45\1\u00b0\1\uffff\1\u00b1\3\uffff\3\45\1\u00b5\1\45"+
        "\1\u00b7\1\45\1\u00b9\2\uffff\3\45\1\uffff\1\45\1\uffff\1\u00be"+
        "\1\uffff\1\u00bf\1\u00c0\1\u00c1\1\45\4\uffff\1\u00c3\1\uffff";
    static final String DFA16_eofS =
        "\u00c4\uffff";
    static final String DFA16_minS =
        "\1\11\1\53\1\141\1\151\1\47\1\162\1\157\1\146\1\154\1\75\1\150\1"+
        "\146\1\150\1\162\7\uffff\1\75\6\uffff\1\0\1\uffff\2\75\1\46\1\174"+
        "\1\53\3\uffff\1\12\1\11\2\uffff\1\144\1\165\1\163\1\60\1\uffff\1"+
        "\143\1\60\1\163\1\154\1\156\1\147\1\162\1\141\7\uffff\1\151\1\154"+
        "\1\60\1\146\1\150\1\154\1\151\2\uffff\1\151\1\141\1\60\1\164\1\151"+
        "\1\171\15\uffff\1\12\1\141\1\145\1\141\2\60\1\163\1\uffff\1\145"+
        "\1\143\1\157\1\143\1\165\1\60\1\164\2\144\1\uffff\1\60\1\145\1\60"+
        "\1\163\1\164\1\144\1\uffff\1\145\1\154\1\60\2\uffff\1\154\1\60\1"+
        "\162\2\uffff\1\145\1\60\1\150\1\162\1\164\1\162\1\uffff\3\60\1\uffff"+
        "\1\162\1\uffff\1\60\1\143\1\151\1\162\1\145\1\uffff\1\60\1\146\1"+
        "\uffff\2\60\1\uffff\1\60\1\142\1\151\1\145\3\uffff\1\167\1\uffff"+
        "\1\150\1\156\1\160\1\60\1\uffff\1\60\3\uffff\2\141\1\157\1\60\1"+
        "\151\1\60\1\147\1\60\2\uffff\1\162\1\160\1\156\1\uffff\1\163\1\uffff"+
        "\1\60\1\uffff\3\60\1\145\4\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\176\1\161\1\157\1\165\1\136\1\162\1\157\1\164\1\170\1\75\1\167"+
        "\1\156\1\150\1\162\7\uffff\1\75\6\uffff\1\uffff\1\uffff\2\75\1\46"+
        "\1\174\1\71\3\uffff\1\12\1\40\2\uffff\1\144\1\165\1\163\1\71\1\uffff"+
        "\1\157\1\172\1\164\1\154\1\156\1\147\1\162\1\141\7\uffff\1\151\1"+
        "\154\1\172\1\146\1\150\1\154\1\151\2\uffff\1\151\1\141\1\172\1\164"+
        "\1\151\1\171\15\uffff\1\172\1\141\1\145\1\141\2\172\1\163\1\uffff"+
        "\1\145\1\143\1\157\1\143\1\165\1\172\1\164\2\144\1\uffff\1\172\1"+
        "\145\1\172\1\163\1\164\1\144\1\uffff\1\145\1\154\1\172\2\uffff\1"+
        "\154\1\172\1\162\2\uffff\1\145\1\172\1\150\1\162\1\164\1\162\1\uffff"+
        "\3\172\1\uffff\1\162\1\uffff\1\172\1\143\1\151\1\162\1\145\1\uffff"+
        "\1\172\1\146\1\uffff\2\172\1\uffff\1\172\1\155\1\151\1\145\3\uffff"+
        "\1\167\1\uffff\1\150\1\156\1\160\1\172\1\uffff\1\172\3\uffff\2\141"+
        "\1\157\1\172\1\151\1\172\1\147\1\172\2\uffff\1\162\1\160\1\156\1"+
        "\uffff\1\163\1\uffff\1\172\1\uffff\3\172\1\145\4\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\16\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\uffff\1\44\1\45\1"+
        "\46\1\52\1\53\1\55\1\uffff\1\60\5\uffff\1\104\1\105\1\103\2\uffff"+
        "\1\110\1\111\4\uffff\1\106\10\uffff\1\4\1\50\1\51\1\54\1\56\1\61"+
        "\1\47\7\uffff\1\62\1\20\6\uffff\1\63\1\43\1\57\1\102\1\65\1\64\1"+
        "\67\1\66\1\72\1\70\1\73\1\71\1\107\7\uffff\1\5\11\uffff\1\14\6\uffff"+
        "\1\24\3\uffff\1\1\1\27\3\uffff\1\6\1\7\6\uffff\1\30\3\uffff\1\15"+
        "\1\uffff\1\17\5\uffff\1\32\2\uffff\1\25\2\uffff\1\22\4\uffff\1\76"+
        "\1\11\1\12\1\uffff\1\100\4\uffff\1\13\1\uffff\1\2\1\16\1\33\10\uffff"+
        "\1\31\1\26\3\uffff\1\10\1\uffff\1\21\1\uffff\1\77\4\uffff\1\75\1"+
        "\74\1\101\1\3\1\uffff\1\23";
    static final String DFA16_specialS =
        "\34\uffff\1\0\u00a7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\50\1\47\1\uffff\1\50\1\46\22\uffff\1\50\4\uffff\1\51\1\40"+
            "\1\34\1\23\1\24\1\31\1\27\1\16\1\30\1\4\1\32\12\44\1\43\1\26"+
            "\1\36\1\11\1\37\2\uffff\4\45\1\42\25\45\1\17\1\35\1\20\1\33"+
            "\1\45\1\uffff\1\10\1\45\1\2\1\45\1\1\1\3\1\5\1\6\1\13\5\45\1"+
            "\7\3\45\1\12\1\15\2\45\1\14\3\45\1\21\1\41\1\22\1\25",
            "\1\56\1\uffff\1\56\2\uffff\12\55\62\uffff\1\54\1\uffff\1\52"+
            "\2\uffff\1\53",
            "\1\61\2\uffff\1\60\7\uffff\1\57\2\uffff\1\62",
            "\1\64\2\uffff\1\66\2\uffff\1\65\5\uffff\1\63",
            "\1\73\2\uffff\1\70\3\uffff\1\67\1\71\12\44\42\uffff\1\74\1"+
            "\uffff\1\72",
            "\1\76",
            "\1\77",
            "\1\101\7\uffff\1\100\5\uffff\1\102",
            "\1\103\13\uffff\1\104",
            "\1\105",
            "\1\110\16\uffff\1\107",
            "\1\111\7\uffff\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\120\1\uffff\2\120\1\uffff\ufff2\120",
            "",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127",
            "\1\56\1\uffff\1\56\2\uffff\12\55",
            "",
            "",
            "",
            "\1\47",
            "\2\50\1\uffff\2\50\22\uffff\1\50",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\55",
            "",
            "\1\136\1\uffff\1\135\1\137\10\uffff\1\140",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\142\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\161",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166\45\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32"+
            "\45",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0088",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u0090",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\u0091\21"+
            "\45",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u009d",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a4",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a8\12\uffff\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b6",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BLOCK_END | CLEAR | FUNCTION | ELLIPSES | CD | CLC | CLF | FIGURE | GRID | HOLD | EQUAL | ON | OFF | CLOSE | ALL | GETS | SWITCH | CASE | OTHERWISE | IF | ELSE | ELSEIF | END | FOR | WHILE | TRY | CATCH | COMMA | OPENB | CLOSEB | OPENC | CLOSEC | OPENP | CLOSEP | NOT | SEMI | PLUS | MINUS | DOT | DOTMULT | DOTDIV | MULT | DIV | DOTCARET | CARET | DOTTICK | TICK | BACK | DOTBACK | EQ | NE | LT | LE | GT | GE | AND | OR | SCAND | SCOR | COLORBAR | SHADING | FLAT | INTERP | AXIS | COLORMAP | STRING_LITERAL | ID | COLON | DOUBLE | Exponent | NEWLINE | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28 >= '\u0000' && LA16_28 <= '\t')||(LA16_28 >= '\u000B' && LA16_28 <= '\f')||(LA16_28 >= '\u000E' && LA16_28 <= '\uFFFF')) ) {s = 80;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}