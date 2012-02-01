// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g 2012-01-27 19:40:49

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AT=4;
    public static final int BACKSLASH=5;
    public static final int BLOCK=6;
    public static final int BLOCK_END=7;
    public static final int BREAK=8;
    public static final int CARET=9;
    public static final int CASE=10;
    public static final int CATCH=11;
    public static final int CLASSDEF=12;
    public static final int CLOSEB=13;
    public static final int CLOSEC=14;
    public static final int CLOSEP=15;
    public static final int CLOSE_BLOCK=16;
    public static final int COLON=17;
    public static final int COLON_ARGS=18;
    public static final int COMMA=19;
    public static final int COMMENT=20;
    public static final int CONTINUE=21;
    public static final int DIGIT=22;
    public static final int DOT=23;
    public static final int DOT_BACKSLASH=24;
    public static final int DOT_CARET=25;
    public static final int DOT_SLASH=26;
    public static final int DOT_STAR=27;
    public static final int DOT_TRANSPOSE=28;
    public static final int DOUBLE=29;
    public static final int DOUBLE_QUOTE=30;
    public static final int ELE_AND=31;
    public static final int ELE_OR=32;
    public static final int ELLIPSIS=33;
    public static final int ELSE=34;
    public static final int ELSEIF=35;
    public static final int EMPTY_CELL=36;
    public static final int EMPTY_VEC=37;
    public static final int END=38;
    public static final int EQUALS=39;
    public static final int EXCLAMATION=40;
    public static final int EXPONENT=41;
    public static final int FOR=42;
    public static final int FOR_LOOP=43;
    public static final int FUNCTION=44;
    public static final int FUNC_ARGS=45;
    public static final int GLOBAL=46;
    public static final int GREATER_EQUAL=47;
    public static final int GREATER_EQUL=48;
    public static final int GREATER_THAN=49;
    public static final int HCAT_CELL=50;
    public static final int HCAT_VEC=51;
    public static final int ID=52;
    public static final int IF=53;
    public static final int IF_STAT=54;
    public static final int ISEQUAL=55;
    public static final int LESS_EQUAL=56;
    public static final int LESS_THAN=57;
    public static final int LETTER=58;
    public static final int MINUS=59;
    public static final int NEWLINE=60;
    public static final int NOT=61;
    public static final int NOT_EQUAL=62;
    public static final int OPENB=63;
    public static final int OPENC=64;
    public static final int OPENP=65;
    public static final int OPEN_BLOCK=66;
    public static final int OTHERWISE=67;
    public static final int PARFOR=68;
    public static final int PERCENT=69;
    public static final int PERSISTENT=70;
    public static final int PLUS=71;
    public static final int RETURN=72;
    public static final int SC_AND=73;
    public static final int SC_OR=74;
    public static final int SEMI=75;
    public static final int SINGLE_QUOTE=76;
    public static final int SLASH=77;
    public static final int SPMD=78;
    public static final int STAR=79;
    public static final int STRING_LITERAL=80;
    public static final int SWITCH=81;
    public static final int SWITCH_STAT=82;
    public static final int TRY=83;
    public static final int UNDERSCORE=84;
    public static final int VCAT_CELL=85;
    public static final int VCAT_VEC=86;
    public static final int WHILE=87;
    public static final int WHILE_LOOP=88;
    public static final int WS=89;

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
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g"; }

    // $ANTLR start "BLOCK_END"
    public final void mBLOCK_END() throws RecognitionException {
        try {
            int _type = BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:255:11: ( 'end' ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:255:13: 'end' ( '\\r' )? '\\n'
            {
            match("end"); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:255:19: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:255:19: '\\r'
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
    // $ANTLR end "BLOCK_END"

    // $ANTLR start "EMPTY_VEC"
    public final void mEMPTY_VEC() throws RecognitionException {
        try {
            int _type = EMPTY_VEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:256:11: ( '[' ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:256:13: '[' ']'
            {
            match('['); 

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EMPTY_VEC"

    // $ANTLR start "EMPTY_CELL"
    public final void mEMPTY_CELL() throws RecognitionException {
        try {
            int _type = EMPTY_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:12: ( '{' '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:14: '{' '}'
            {
            match('{'); 

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EMPTY_CELL"

    // $ANTLR start "SINGLE_QUOTE"
    public final void mSINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:258:14: ( '$' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:258:16: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_QUOTE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:261:8: ( 'break' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:261:10: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:262:7: ( 'case' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:262:9: 'case'
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

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:263:8: ( 'catch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:263:10: 'catch'
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

    // $ANTLR start "CLASSDEF"
    public final void mCLASSDEF() throws RecognitionException {
        try {
            int _type = CLASSDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:264:10: ( 'classdef' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:264:12: 'classdef'
            {
            match("classdef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASSDEF"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:265:10: ( 'continue' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:265:12: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:266:7: ( 'else' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:266:9: 'else'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:267:9: ( 'elseif' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:267:11: 'elseif'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:268:6: ( 'end' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:268:8: 'end'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:269:6: ( 'for' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:269:8: 'for'
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

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:270:10: ( 'function' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:270:12: 'function'
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

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:271:9: ( 'global' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:271:11: 'global'
            {
            match("global"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:272:5: ( 'if' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:272:7: 'if'
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

    // $ANTLR start "OTHERWISE"
    public final void mOTHERWISE() throws RecognitionException {
        try {
            int _type = OTHERWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:273:11: ( 'otherwise' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:273:13: 'otherwise'
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

    // $ANTLR start "PARFOR"
    public final void mPARFOR() throws RecognitionException {
        try {
            int _type = PARFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:274:9: ( 'parfor' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:274:11: 'parfor'
            {
            match("parfor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARFOR"

    // $ANTLR start "PERSISTENT"
    public final void mPERSISTENT() throws RecognitionException {
        try {
            int _type = PERSISTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:275:12: ( 'persistent' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:275:14: 'persistent'
            {
            match("persistent"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERSISTENT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:276:9: ( 'return' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:276:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SPMD"
    public final void mSPMD() throws RecognitionException {
        try {
            int _type = SPMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:277:7: ( 'spmd' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:277:9: 'spmd'
            {
            match("spmd"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPMD"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:278:9: ( 'switch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:278:11: 'switch'
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

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:279:6: ( 'try' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:279:8: 'try'
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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:280:8: ( 'while' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:280:10: 'while'
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

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:283:5: ( '@' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:283:7: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:284:11: ( '\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:284:13: '\\\\'
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
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:285:8: ( '^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:285:10: '^'
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

    // $ANTLR start "CLOSE_BLOCK"
    public final void mCLOSE_BLOCK() throws RecognitionException {
        try {
            int _type = CLOSE_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:286:13: ( '%}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:286:15: '%}'
            {
            match("%}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BLOCK"

    // $ANTLR start "CLOSEB"
    public final void mCLOSEB() throws RecognitionException {
        try {
            int _type = CLOSEB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:287:9: ( ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:287:11: ']'
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

    // $ANTLR start "CLOSEC"
    public final void mCLOSEC() throws RecognitionException {
        try {
            int _type = CLOSEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:288:9: ( '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:288:11: '}'
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

    // $ANTLR start "CLOSEP"
    public final void mCLOSEP() throws RecognitionException {
        try {
            int _type = CLOSEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:289:9: ( ')' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:289:11: ')'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:290:8: ( ':' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:290:10: ':'
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

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:291:8: ( ',' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:291:10: ','
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

    // $ANTLR start "DOUBLE_QUOTE"
    public final void mDOUBLE_QUOTE() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:292:14: ( '\"' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:292:16: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_QUOTE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:293:6: ( '.' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:293:8: '.'
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

    // $ANTLR start "DOT_BACKSLASH"
    public final void mDOT_BACKSLASH() throws RecognitionException {
        try {
            int _type = DOT_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:294:15: ( '.\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:294:17: '.\\\\'
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
    // $ANTLR end "DOT_BACKSLASH"

    // $ANTLR start "DOT_CARET"
    public final void mDOT_CARET() throws RecognitionException {
        try {
            int _type = DOT_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:295:11: ( '.^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:295:13: '.^'
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
    // $ANTLR end "DOT_CARET"

    // $ANTLR start "DOT_SLASH"
    public final void mDOT_SLASH() throws RecognitionException {
        try {
            int _type = DOT_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:297:11: ( './' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:297:13: './'
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
    // $ANTLR end "DOT_SLASH"

    // $ANTLR start "DOT_STAR"
    public final void mDOT_STAR() throws RecognitionException {
        try {
            int _type = DOT_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:298:10: ( '.*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:298:12: '.*'
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
    // $ANTLR end "DOT_STAR"

    // $ANTLR start "DOT_TRANSPOSE"
    public final void mDOT_TRANSPOSE() throws RecognitionException {
        try {
            int _type = DOT_TRANSPOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:299:15: ( '.\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:299:17: '.\\''
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
    // $ANTLR end "DOT_TRANSPOSE"

    // $ANTLR start "ELE_AND"
    public final void mELE_AND() throws RecognitionException {
        try {
            int _type = ELE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:300:10: ( '&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:300:12: '&'
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
    // $ANTLR end "ELE_AND"

    // $ANTLR start "ELE_OR"
    public final void mELE_OR() throws RecognitionException {
        try {
            int _type = ELE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:301:9: ( '|' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:301:11: '|'
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
    // $ANTLR end "ELE_OR"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:302:9: ( '=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:302:11: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "EXCLAMATION"
    public final void mEXCLAMATION() throws RecognitionException {
        try {
            int _type = EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:303:13: ( '!' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:303:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLAMATION"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:304:14: ( '>' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:304:16: '>'
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
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:305:15: ( '>=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:305:17: '>='
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
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "ISEQUAL"
    public final void mISEQUAL() throws RecognitionException {
        try {
            int _type = ISEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:306:10: ( '==' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:306:12: '=='
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
    // $ANTLR end "ISEQUAL"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:307:12: ( '<=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:307:14: '<='
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
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:308:11: ( '<' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:308:13: '<'
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
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:309:8: ( '-' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:309:10: '-'
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:310:6: ( '~' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:310:8: '~'
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

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:311:11: ( '~=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:311:13: '~='
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
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "OPEN_BLOCK"
    public final void mOPEN_BLOCK() throws RecognitionException {
        try {
            int _type = OPEN_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:312:12: ( '%{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:312:14: '%{'
            {
            match("%{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BLOCK"

    // $ANTLR start "OPENB"
    public final void mOPENB() throws RecognitionException {
        try {
            int _type = OPENB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:313:8: ( '[' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:313:10: '['
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

    // $ANTLR start "OPENC"
    public final void mOPENC() throws RecognitionException {
        try {
            int _type = OPENC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:314:8: ( '{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:314:10: '{'
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

    // $ANTLR start "OPENP"
    public final void mOPENP() throws RecognitionException {
        try {
            int _type = OPENP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:315:8: ( '(' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:315:10: '('
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

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:316:10: ( '%' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:316:12: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:317:7: ( '+' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:317:9: '+'
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

    // $ANTLR start "SC_AND"
    public final void mSC_AND() throws RecognitionException {
        try {
            int _type = SC_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:318:9: ( '&&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:318:11: '&&'
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
    // $ANTLR end "SC_AND"

    // $ANTLR start "SC_OR"
    public final void mSC_OR() throws RecognitionException {
        try {
            int _type = SC_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:319:8: ( '||' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:319:10: '||'
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
    // $ANTLR end "SC_OR"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:320:7: ( ';' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:320:9: ';'
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

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:322:8: ( '/' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:322:10: '/'
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
    // $ANTLR end "SLASH"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:323:7: ( '*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:323:9: '*'
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
    // $ANTLR end "STAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:327:17: ( ( '0' .. '9' ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:328:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:329:21: ( '_' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:329:23: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:331:9: ( '\\%' ( . )* NEWLINE )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:331:11: '\\%' ( . )* NEWLINE
            {
            match('%'); 

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:331:16: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\r') ) {
                    alt2=2;
                }
                else if ( (LA2_0=='\n') ) {
                    alt2=2;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:331:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            mNEWLINE(); 


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

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:8: ( ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ ) ( EXPONENT )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ ) ( EXPONENT )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:11: ( ( DIGIT )+ DOT ( DIGIT )* )
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:11: ( ( DIGIT )+ DOT ( DIGIT )* )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:12: ( DIGIT )+ DOT ( DIGIT )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:12: ( DIGIT )+
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
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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


                    mDOT(); 


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:23: ( DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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


                    }


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:33: ( DOT ( DIGIT )+ )
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:33: ( DOT ( DIGIT )+ )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:34: DOT ( DIGIT )+
                    {
                    mDOT(); 


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:38: ( DIGIT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:48: ( DIGIT )+
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:48: ( DIGIT )+
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
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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


                    }
                    break;

            }


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:56: ( EXPONENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:56: EXPONENT
                    {
                    mEXPONENT(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:9: ( '...' ( NEWLINE )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:11: '...' ( NEWLINE )+
            {
            match("..."); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:17: ( NEWLINE )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:17: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ELLIPSIS"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:334:9: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:334:11: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:334:23: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:334:36: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:5: ( LETTER ( LETTER | DIGIT | UNDERSCORE )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:7: LETTER ( LETTER | DIGIT | UNDERSCORE )*
            {
            mLETTER(); 


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:14: ( LETTER | DIGIT | UNDERSCORE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
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
            	    break loop12;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:9: ( ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:11: ( '\\r' )? '\\n'
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:11: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:341:8: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:341:10: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 

            StringBuilder b = new StringBuilder();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:11: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:13: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:344:13: c=~ ( '\\'' | '\\r' | '\\n' )
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
            	    break loop14;
                }
            } while (true);


            match('\''); 

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:349:5: ( ( ' ' | '\\t' | '\\f' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:349:7: ( ' ' | '\\t' | '\\f' )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:349:7: ( ' ' | '\\t' | '\\f' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0=='\f'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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

    public void mTokens() throws RecognitionException {
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:8: ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | COMMENT | DOUBLE | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS )
        int alt16=71;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:10: BLOCK_END
                {
                mBLOCK_END(); 


                }
                break;
            case 2 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:20: EMPTY_VEC
                {
                mEMPTY_VEC(); 


                }
                break;
            case 3 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:30: EMPTY_CELL
                {
                mEMPTY_CELL(); 


                }
                break;
            case 4 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:41: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 


                }
                break;
            case 5 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:54: BREAK
                {
                mBREAK(); 


                }
                break;
            case 6 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:60: CASE
                {
                mCASE(); 


                }
                break;
            case 7 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:65: CATCH
                {
                mCATCH(); 


                }
                break;
            case 8 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:71: CLASSDEF
                {
                mCLASSDEF(); 


                }
                break;
            case 9 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:80: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 10 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:89: ELSE
                {
                mELSE(); 


                }
                break;
            case 11 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:94: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 12 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:101: END
                {
                mEND(); 


                }
                break;
            case 13 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:105: FOR
                {
                mFOR(); 


                }
                break;
            case 14 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:109: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 15 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:118: GLOBAL
                {
                mGLOBAL(); 


                }
                break;
            case 16 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:125: IF
                {
                mIF(); 


                }
                break;
            case 17 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:128: OTHERWISE
                {
                mOTHERWISE(); 


                }
                break;
            case 18 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:138: PARFOR
                {
                mPARFOR(); 


                }
                break;
            case 19 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:145: PERSISTENT
                {
                mPERSISTENT(); 


                }
                break;
            case 20 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:156: RETURN
                {
                mRETURN(); 


                }
                break;
            case 21 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:163: SPMD
                {
                mSPMD(); 


                }
                break;
            case 22 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:168: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 23 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:175: TRY
                {
                mTRY(); 


                }
                break;
            case 24 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:179: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:185: AT
                {
                mAT(); 


                }
                break;
            case 26 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:188: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 27 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:198: CARET
                {
                mCARET(); 


                }
                break;
            case 28 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:204: CLOSE_BLOCK
                {
                mCLOSE_BLOCK(); 


                }
                break;
            case 29 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:216: CLOSEB
                {
                mCLOSEB(); 


                }
                break;
            case 30 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:223: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 31 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:230: CLOSEP
                {
                mCLOSEP(); 


                }
                break;
            case 32 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:237: COLON
                {
                mCOLON(); 


                }
                break;
            case 33 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:243: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 34 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:249: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); 


                }
                break;
            case 35 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:262: DOT
                {
                mDOT(); 


                }
                break;
            case 36 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:266: DOT_BACKSLASH
                {
                mDOT_BACKSLASH(); 


                }
                break;
            case 37 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:280: DOT_CARET
                {
                mDOT_CARET(); 


                }
                break;
            case 38 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:290: DOT_SLASH
                {
                mDOT_SLASH(); 


                }
                break;
            case 39 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:300: DOT_STAR
                {
                mDOT_STAR(); 


                }
                break;
            case 40 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:309: DOT_TRANSPOSE
                {
                mDOT_TRANSPOSE(); 


                }
                break;
            case 41 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:323: ELE_AND
                {
                mELE_AND(); 


                }
                break;
            case 42 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:331: ELE_OR
                {
                mELE_OR(); 


                }
                break;
            case 43 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:338: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 44 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:345: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 45 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:357: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 46 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:370: GREATER_EQUAL
                {
                mGREATER_EQUAL(); 


                }
                break;
            case 47 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:384: ISEQUAL
                {
                mISEQUAL(); 


                }
                break;
            case 48 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:392: LESS_EQUAL
                {
                mLESS_EQUAL(); 


                }
                break;
            case 49 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:403: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 50 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:413: MINUS
                {
                mMINUS(); 


                }
                break;
            case 51 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:419: NOT
                {
                mNOT(); 


                }
                break;
            case 52 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:423: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 53 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:433: OPEN_BLOCK
                {
                mOPEN_BLOCK(); 


                }
                break;
            case 54 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:444: OPENB
                {
                mOPENB(); 


                }
                break;
            case 55 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:450: OPENC
                {
                mOPENC(); 


                }
                break;
            case 56 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:456: OPENP
                {
                mOPENP(); 


                }
                break;
            case 57 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:462: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 58 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:470: PLUS
                {
                mPLUS(); 


                }
                break;
            case 59 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:475: SC_AND
                {
                mSC_AND(); 


                }
                break;
            case 60 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:482: SC_OR
                {
                mSC_OR(); 


                }
                break;
            case 61 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:488: SEMI
                {
                mSEMI(); 


                }
                break;
            case 62 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:493: SLASH
                {
                mSLASH(); 


                }
                break;
            case 63 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:499: STAR
                {
                mSTAR(); 


                }
                break;
            case 64 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:504: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 65 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:512: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 66 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:519: ELLIPSIS
                {
                mELLIPSIS(); 


                }
                break;
            case 67 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:528: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 68 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:537: ID
                {
                mID(); 


                }
                break;
            case 69 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:540: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 70 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:548: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 71 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:563: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA7_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\2\56\3\uffff";
    static final String DFA7_maxS =
        "\2\71\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "332:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\52\1\63\1\65\1\uffff\13\52\3\uffff\1\110\6\uffff\1\120"+
        "\1\122\1\124\1\126\1\uffff\1\130\1\132\1\uffff\1\134\6\uffff\1\52"+
        "\4\uffff\2\52\1\uffff\1\60\4\uffff\7\52\1\147\10\52\1\160\1\161"+
        "\25\uffff\1\163\6\52\1\172\2\52\1\uffff\6\52\1\u0083\1\52\4\uffff"+
        "\1\u0086\1\52\1\u0088\3\52\1\uffff\6\52\1\u0092\1\52\1\uffff\2\52"+
        "\1\uffff\1\u0096\1\uffff\1\u0097\10\52\1\uffff\1\52\1\u00a1\1\u00a2"+
        "\2\uffff\3\52\1\u00a6\1\52\1\u00a8\1\52\1\u00aa\1\u00ab\2\uffff"+
        "\3\52\1\uffff\1\52\1\uffff\1\52\2\uffff\1\u00b1\1\u00b2\1\u00b3"+
        "\2\52\3\uffff\1\u00b6\1\52\1\uffff\1\u00b8\1\uffff";
    static final String DFA16_eofS =
        "\u00b9\uffff";
    static final String DFA16_minS =
        "\1\11\1\53\1\135\1\175\1\uffff\1\162\1\141\1\157\1\154\1\146\1\164"+
        "\1\141\1\145\1\160\1\162\1\150\3\uffff\1\0\6\uffff\1\47\1\46\1\174"+
        "\1\75\1\uffff\2\75\1\uffff\1\75\6\uffff\1\53\4\uffff\1\144\1\163"+
        "\1\uffff\1\60\4\uffff\1\145\1\163\1\141\1\156\1\162\1\156\1\157"+
        "\1\60\1\150\2\162\1\164\1\155\1\151\1\171\1\151\2\0\25\uffff\1\12"+
        "\1\145\1\141\1\145\1\143\1\163\1\164\1\60\1\143\1\142\1\uffff\1"+
        "\145\1\146\1\163\1\165\1\144\1\164\1\60\1\154\4\uffff\1\60\1\153"+
        "\1\60\1\150\1\163\1\151\1\uffff\1\164\1\141\1\162\1\157\1\151\1"+
        "\162\1\60\1\143\1\uffff\1\145\1\146\1\uffff\1\60\1\uffff\1\60\1"+
        "\144\1\156\1\151\1\154\1\167\1\162\1\163\1\156\1\uffff\1\150\2\60"+
        "\2\uffff\1\145\1\165\1\157\1\60\1\151\1\60\1\164\2\60\2\uffff\1"+
        "\146\1\145\1\156\1\uffff\1\163\1\uffff\1\145\2\uffff\3\60\1\145"+
        "\1\156\3\uffff\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\176\1\156\1\135\1\175\1\uffff\1\162\1\157\1\165\1\154\1\146\1"+
        "\164\2\145\1\167\1\162\1\150\3\uffff\1\uffff\6\uffff\1\136\1\46"+
        "\1\174\1\75\1\uffff\2\75\1\uffff\1\75\6\uffff\1\71\4\uffff\1\144"+
        "\1\163\1\uffff\1\172\4\uffff\1\145\1\164\1\141\1\156\1\162\1\156"+
        "\1\157\1\172\1\150\2\162\1\164\1\155\1\151\1\171\1\151\2\uffff\25"+
        "\uffff\1\172\1\145\1\141\1\145\1\143\1\163\1\164\1\172\1\143\1\142"+
        "\1\uffff\1\145\1\146\1\163\1\165\1\144\1\164\1\172\1\154\4\uffff"+
        "\1\172\1\153\1\172\1\150\1\163\1\151\1\uffff\1\164\1\141\1\162\1"+
        "\157\1\151\1\162\1\172\1\143\1\uffff\1\145\1\146\1\uffff\1\172\1"+
        "\uffff\1\172\1\144\1\156\1\151\1\154\1\167\1\162\1\163\1\156\1\uffff"+
        "\1\150\2\172\2\uffff\1\145\1\165\1\157\1\172\1\151\1\172\1\164\2"+
        "\172\2\uffff\1\146\1\145\1\156\1\uffff\1\163\1\uffff\1\145\2\uffff"+
        "\3\172\1\145\1\156\3\uffff\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\13\uffff\1\31\1\32\1\33\1\uffff\1\35\1\36\1\37\1\40"+
        "\1\41\1\42\4\uffff\1\54\2\uffff\1\62\1\uffff\1\70\1\72\1\75\1\76"+
        "\1\77\1\101\1\uffff\1\104\1\105\1\106\1\107\2\uffff\1\103\1\uffff"+
        "\1\2\1\66\1\3\1\67\22\uffff\1\71\1\100\1\44\1\45\1\46\1\47\1\50"+
        "\1\102\1\43\1\73\1\51\1\74\1\52\1\57\1\53\1\56\1\55\1\60\1\61\1"+
        "\64\1\63\12\uffff\1\20\10\uffff\1\34\1\65\1\1\1\14\6\uffff\1\15"+
        "\10\uffff\1\27\2\uffff\1\12\1\uffff\1\6\11\uffff\1\25\3\uffff\1"+
        "\5\1\7\11\uffff\1\30\1\13\3\uffff\1\17\1\uffff\1\22\1\uffff\1\24"+
        "\1\26\5\uffff\1\10\1\11\1\16\2\uffff\1\21\1\uffff\1\23";
    static final String DFA16_specialS =
        "\23\uffff\1\2\62\uffff\1\1\1\0\161\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\55\1\53\1\uffff\1\55\1\53\22\uffff\1\55\1\36\1\31\1\uffff"+
            "\1\4\1\23\1\33\1\54\1\43\1\26\1\47\1\44\1\30\1\41\1\32\1\46"+
            "\12\50\1\27\1\45\1\40\1\35\1\37\1\uffff\1\20\4\52\1\51\25\52"+
            "\1\2\1\21\1\24\1\22\2\uffff\1\52\1\5\1\6\1\52\1\1\1\7\1\10\1"+
            "\52\1\11\5\52\1\12\1\13\1\52\1\14\1\15\1\16\2\52\1\17\3\52\1"+
            "\3\1\34\1\25\1\42",
            "\1\60\1\uffff\1\60\2\uffff\12\61\62\uffff\1\57\1\uffff\1\56",
            "\1\62",
            "\1\64",
            "",
            "\1\66",
            "\1\67\12\uffff\1\70\2\uffff\1\71",
            "\1\72\5\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100",
            "\1\101",
            "\1\102\6\uffff\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "\173\111\1\107\1\111\1\106\uff82\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116\2\uffff\1\115\3\uffff\1\117\1\114\12\50\42\uffff\1\112"+
            "\1\uffff\1\113",
            "\1\121",
            "\1\123",
            "\1\125",
            "",
            "\1\127",
            "\1\131",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\1\60\2\uffff\12\61",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\12\61\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\0\111",
            "\0\111",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162\2\uffff\1\162\42\uffff\12\52\7\uffff\32\52\4\uffff\1"+
            "\52\1\uffff\32\52",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0085\21"+
            "\52",
            "\1\u0087",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "",
            "\1\u00b0",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            return "1:1: Tokens : ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | COMMENT | DOUBLE | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_71 = input.LA(1);

                        s = -1;
                        if ( ((LA16_71 >= '\u0000' && LA16_71 <= '\uFFFF')) ) {s = 73;}

                        else s = 113;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA16_70 = input.LA(1);

                        s = -1;
                        if ( ((LA16_70 >= '\u0000' && LA16_70 <= '\uFFFF')) ) {s = 73;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( (LA16_19=='}') ) {s = 70;}

                        else if ( (LA16_19=='{') ) {s = 71;}

                        else if ( ((LA16_19 >= '\u0000' && LA16_19 <= 'z')||LA16_19=='|'||(LA16_19 >= '~' && LA16_19 <= '\uFFFF')) ) {s = 73;}

                        else s = 72;

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