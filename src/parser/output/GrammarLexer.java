// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g 2012-01-31 15:26:38

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GrammarLexer extends Lexer {
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
    public static final int FALSE=42;
    public static final int FOR=43;
    public static final int FOR_LOOP=44;
    public static final int FUNCTION=45;
    public static final int FUNC_ARGS=46;
    public static final int GLOBAL=47;
    public static final int GREATER_EQUAL=48;
    public static final int GREATER_EQUL=49;
    public static final int GREATER_THAN=50;
    public static final int HCAT_CELL=51;
    public static final int HCAT_VEC=52;
    public static final int ID=53;
    public static final int IF=54;
    public static final int IF_STAT=55;
    public static final int ISEQUAL=56;
    public static final int LESS_EQUAL=57;
    public static final int LESS_THAN=58;
    public static final int LETTER=59;
    public static final int MINUS=60;
    public static final int NEWLINE=61;
    public static final int NOT=62;
    public static final int NOT_EQUAL=63;
    public static final int OPENB=64;
    public static final int OPENC=65;
    public static final int OPENP=66;
    public static final int OPEN_BLOCK=67;
    public static final int OTHERWISE=68;
    public static final int PARFOR=69;
    public static final int PERCENT=70;
    public static final int PERSISTENT=71;
    public static final int PLUS=72;
    public static final int RETURN=73;
    public static final int SC_AND=74;
    public static final int SC_OR=75;
    public static final int SEMI=76;
    public static final int SINGLE_QUOTE=77;
    public static final int SLASH=78;
    public static final int SPMD=79;
    public static final int STAR=80;
    public static final int STRING_LITERAL=81;
    public static final int SWITCH=82;
    public static final int SWITCH_STAT=83;
    public static final int TRUE=84;
    public static final int TRY=85;
    public static final int UNDERSCORE=86;
    public static final int VCAT_CELL=87;
    public static final int VCAT_VEC=88;
    public static final int WHILE=89;
    public static final int WHILE_LOOP=90;
    public static final int WS=91;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GrammarLexer() {} 
    public GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g"; }

    // $ANTLR start "BLOCK_END"
    public final void mBLOCK_END() throws RecognitionException {
        try {
            int _type = BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:11: ( 'end' ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:13: 'end' ( '\\r' )? '\\n'
            {
            match("end"); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:19: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:257:19: '\\r'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:258:11: ( '[' ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:258:13: '[' ']'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:259:12: ( '{' '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:259:14: '{' '}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:260:14: ( '$' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:260:16: '$'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:263:8: ( 'break' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:263:10: 'break'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:264:7: ( 'case' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:264:9: 'case'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:265:8: ( 'catch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:265:10: 'catch'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:266:10: ( 'classdef' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:266:12: 'classdef'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:267:10: ( 'continue' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:267:12: 'continue'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:268:7: ( 'else' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:268:9: 'else'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:269:9: ( 'elseif' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:269:11: 'elseif'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:270:6: ( 'end' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:270:8: 'end'
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

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:271:8: ( 'false' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:271:10: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:272:6: ( 'for' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:272:8: 'for'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:273:10: ( 'function' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:273:12: 'function'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:274:9: ( 'global' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:274:11: 'global'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:275:5: ( 'if' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:275:7: 'if'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:276:11: ( 'otherwise' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:276:13: 'otherwise'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:277:9: ( 'parfor' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:277:11: 'parfor'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:278:12: ( 'persistent' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:278:14: 'persistent'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:279:9: ( 'return' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:279:11: 'return'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:280:7: ( 'spmd' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:280:9: 'spmd'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:281:9: ( 'switch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:281:11: 'switch'
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

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:282:7: ( 'true' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:282:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:283:6: ( 'try' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:283:8: 'try'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:284:8: ( 'while' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:284:10: 'while'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:287:5: ( '@' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:287:7: '@'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:288:11: ( '\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:288:13: '\\\\'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:289:8: ( '^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:289:10: '^'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:290:13: ( '%}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:290:15: '%}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:291:9: ( ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:291:11: ']'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:292:9: ( '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:292:11: '}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:293:9: ( ')' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:293:11: ')'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:294:8: ( ':' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:294:10: ':'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:295:8: ( ',' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:295:10: ','
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:296:14: ( '\"' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:296:16: '\"'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:297:6: ( '.' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:297:8: '.'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:298:15: ( '.\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:298:17: '.\\\\'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:299:11: ( '.^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:299:13: '.^'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:301:11: ( './' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:301:13: './'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:302:10: ( '.*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:302:12: '.*'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:303:15: ( '.\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:303:17: '.\\''
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:304:10: ( '&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:304:12: '&'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:305:9: ( '|' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:305:11: '|'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:306:9: ( '=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:306:11: '='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:307:13: ( '!' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:307:15: '!'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:308:14: ( '>' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:308:16: '>'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:309:15: ( '>=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:309:17: '>='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:310:10: ( '==' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:310:12: '=='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:311:12: ( '<=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:311:14: '<='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:312:11: ( '<' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:312:13: '<'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:313:8: ( '-' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:313:10: '-'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:314:6: ( '~' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:314:8: '~'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:315:11: ( '~=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:315:13: '~='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:316:12: ( '%{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:316:14: '%{'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:317:8: ( '[' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:317:10: '['
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:318:8: ( '{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:318:10: '{'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:319:8: ( '(' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:319:10: '('
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:320:10: ( '%' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:320:12: '%'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:321:7: ( '+' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:321:9: '+'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:322:9: ( '&&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:322:11: '&&'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:323:8: ( '||' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:323:10: '||'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:324:7: ( ';' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:324:9: ';'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:326:8: ( '/' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:326:10: '/'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:327:7: ( '*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:327:9: '*'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:331:17: ( ( '0' .. '9' ) )
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:332:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:21: ( '_' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:333:23: '_'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:9: ( '\\%' ( . )* NEWLINE )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:11: '\\%' ( . )* NEWLINE
            {
            match('%'); 

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:16: ( . )*
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
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:335:16: .
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:8: ( ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ ) ( EXPONENT )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ ) ( EXPONENT )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:11: ( ( DIGIT )+ DOT ( DIGIT )* )
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:11: ( ( DIGIT )+ DOT ( DIGIT )* )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:12: ( DIGIT )+ DOT ( DIGIT )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:12: ( DIGIT )+
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


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:23: ( DIGIT )*
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:33: ( DOT ( DIGIT )+ )
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:33: ( DOT ( DIGIT )+ )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:34: DOT ( DIGIT )+
                    {
                    mDOT(); 


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:38: ( DIGIT )+
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:48: ( DIGIT )+
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:48: ( DIGIT )+
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


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:56: ( EXPONENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:336:56: EXPONENT
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:337:9: ( '...' ( NEWLINE )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:337:11: '...' ( NEWLINE )+
            {
            match("..."); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:337:17: ( NEWLINE )+
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
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:337:17: NEWLINE
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:338:9: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:338:11: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:338:23: ( '+' | '-' )?
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


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:338:36: ( '0' .. '9' )+
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:5: ( LETTER ( LETTER | DIGIT | UNDERSCORE )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:7: LETTER ( LETTER | DIGIT | UNDERSCORE )*
            {
            mLETTER(); 


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:339:14: ( LETTER | DIGIT | UNDERSCORE )*
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:9: ( ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:11: ( '\\r' )? '\\n'
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:11: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:343:11: '\\r'
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:345:8: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:345:10: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 

            StringBuilder b = new StringBuilder();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:347:11: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
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
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:347:13: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:348:13: c=~ ( '\\'' | '\\r' | '\\n' )
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:353:5: ( ( ' ' | '\\t' | '\\f' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:353:7: ( ' ' | '\\t' | '\\f' )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:353:7: ( ' ' | '\\t' | '\\f' )+
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
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:8: ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FALSE | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRUE | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | COMMENT | DOUBLE | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS )
        int alt16=73;
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
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:105: FALSE
                {
                mFALSE(); 


                }
                break;
            case 14 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:111: FOR
                {
                mFOR(); 


                }
                break;
            case 15 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:115: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 16 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:124: GLOBAL
                {
                mGLOBAL(); 


                }
                break;
            case 17 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:131: IF
                {
                mIF(); 


                }
                break;
            case 18 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:134: OTHERWISE
                {
                mOTHERWISE(); 


                }
                break;
            case 19 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:144: PARFOR
                {
                mPARFOR(); 


                }
                break;
            case 20 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:151: PERSISTENT
                {
                mPERSISTENT(); 


                }
                break;
            case 21 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:162: RETURN
                {
                mRETURN(); 


                }
                break;
            case 22 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:169: SPMD
                {
                mSPMD(); 


                }
                break;
            case 23 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:174: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 24 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:181: TRUE
                {
                mTRUE(); 


                }
                break;
            case 25 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:186: TRY
                {
                mTRY(); 


                }
                break;
            case 26 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:190: WHILE
                {
                mWHILE(); 


                }
                break;
            case 27 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:196: AT
                {
                mAT(); 


                }
                break;
            case 28 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:199: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 29 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:209: CARET
                {
                mCARET(); 


                }
                break;
            case 30 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:215: CLOSE_BLOCK
                {
                mCLOSE_BLOCK(); 


                }
                break;
            case 31 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:227: CLOSEB
                {
                mCLOSEB(); 


                }
                break;
            case 32 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:234: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 33 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:241: CLOSEP
                {
                mCLOSEP(); 


                }
                break;
            case 34 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:248: COLON
                {
                mCOLON(); 


                }
                break;
            case 35 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:254: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 36 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:260: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); 


                }
                break;
            case 37 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:273: DOT
                {
                mDOT(); 


                }
                break;
            case 38 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:277: DOT_BACKSLASH
                {
                mDOT_BACKSLASH(); 


                }
                break;
            case 39 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:291: DOT_CARET
                {
                mDOT_CARET(); 


                }
                break;
            case 40 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:301: DOT_SLASH
                {
                mDOT_SLASH(); 


                }
                break;
            case 41 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:311: DOT_STAR
                {
                mDOT_STAR(); 


                }
                break;
            case 42 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:320: DOT_TRANSPOSE
                {
                mDOT_TRANSPOSE(); 


                }
                break;
            case 43 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:334: ELE_AND
                {
                mELE_AND(); 


                }
                break;
            case 44 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:342: ELE_OR
                {
                mELE_OR(); 


                }
                break;
            case 45 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:349: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 46 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:356: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 47 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:368: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 48 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:381: GREATER_EQUAL
                {
                mGREATER_EQUAL(); 


                }
                break;
            case 49 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:395: ISEQUAL
                {
                mISEQUAL(); 


                }
                break;
            case 50 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:403: LESS_EQUAL
                {
                mLESS_EQUAL(); 


                }
                break;
            case 51 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:414: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 52 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:424: MINUS
                {
                mMINUS(); 


                }
                break;
            case 53 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:430: NOT
                {
                mNOT(); 


                }
                break;
            case 54 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:434: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 55 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:444: OPEN_BLOCK
                {
                mOPEN_BLOCK(); 


                }
                break;
            case 56 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:455: OPENB
                {
                mOPENB(); 


                }
                break;
            case 57 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:461: OPENC
                {
                mOPENC(); 


                }
                break;
            case 58 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:467: OPENP
                {
                mOPENP(); 


                }
                break;
            case 59 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:473: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 60 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:481: PLUS
                {
                mPLUS(); 


                }
                break;
            case 61 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:486: SC_AND
                {
                mSC_AND(); 


                }
                break;
            case 62 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:493: SC_OR
                {
                mSC_OR(); 


                }
                break;
            case 63 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:499: SEMI
                {
                mSEMI(); 


                }
                break;
            case 64 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:504: SLASH
                {
                mSLASH(); 


                }
                break;
            case 65 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:510: STAR
                {
                mSTAR(); 


                }
                break;
            case 66 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:515: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 67 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:523: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 68 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:530: ELLIPSIS
                {
                mELLIPSIS(); 


                }
                break;
            case 69 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:539: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 70 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:548: ID
                {
                mID(); 


                }
                break;
            case 71 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:551: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 72 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:559: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 73 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:1:574: WS
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
            return "336:10: ( ( ( DIGIT )+ DOT ( DIGIT )* ) | ( DOT ( DIGIT )+ ) | ( DIGIT )+ )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\52\1\63\1\65\1\uffff\13\52\3\uffff\1\111\6\uffff\1\121"+
        "\1\123\1\125\1\127\1\uffff\1\131\1\133\1\uffff\1\135\6\uffff\1\52"+
        "\4\uffff\2\52\1\uffff\1\60\4\uffff\10\52\1\151\10\52\1\163\1\164"+
        "\25\uffff\1\166\7\52\1\176\2\52\1\uffff\7\52\1\u0088\1\52\4\uffff"+
        "\1\u008b\1\52\1\u008d\4\52\1\uffff\6\52\1\u0098\1\52\1\u009a\1\uffff"+
        "\2\52\1\uffff\1\u009d\1\uffff\1\u009e\2\52\1\u00a1\6\52\1\uffff"+
        "\1\52\1\uffff\1\u00a9\1\u00aa\2\uffff\2\52\1\uffff\1\52\1\u00ae"+
        "\1\52\1\u00b0\1\52\1\u00b2\1\u00b3\2\uffff\3\52\1\uffff\1\52\1\uffff"+
        "\1\52\2\uffff\1\u00b9\1\u00ba\1\u00bb\2\52\3\uffff\1\u00be\1\52"+
        "\1\uffff\1\u00c0\1\uffff";
    static final String DFA16_eofS =
        "\u00c1\uffff";
    static final String DFA16_minS =
        "\1\11\1\53\1\135\1\175\1\uffff\1\162\2\141\1\154\1\146\1\164\1\141"+
        "\1\145\1\160\1\162\1\150\3\uffff\1\0\6\uffff\1\47\1\46\1\174\1\75"+
        "\1\uffff\2\75\1\uffff\1\75\6\uffff\1\53\4\uffff\1\144\1\163\1\uffff"+
        "\1\60\4\uffff\1\145\1\163\1\141\1\156\1\154\1\162\1\156\1\157\1"+
        "\60\1\150\2\162\1\164\1\155\1\151\1\165\1\151\2\0\25\uffff\1\12"+
        "\1\145\1\141\1\145\1\143\1\163\1\164\1\163\1\60\1\143\1\142\1\uffff"+
        "\1\145\1\146\1\163\1\165\1\144\1\164\1\145\1\60\1\154\4\uffff\1"+
        "\60\1\153\1\60\1\150\1\163\1\151\1\145\1\uffff\1\164\1\141\1\162"+
        "\1\157\1\151\1\162\1\60\1\143\1\60\1\uffff\1\145\1\146\1\uffff\1"+
        "\60\1\uffff\1\60\1\144\1\156\1\60\1\151\1\154\1\167\1\162\1\163"+
        "\1\156\1\uffff\1\150\1\uffff\2\60\2\uffff\1\145\1\165\1\uffff\1"+
        "\157\1\60\1\151\1\60\1\164\2\60\2\uffff\1\146\1\145\1\156\1\uffff"+
        "\1\163\1\uffff\1\145\2\uffff\3\60\1\145\1\156\3\uffff\1\60\1\164"+
        "\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\176\1\156\1\135\1\175\1\uffff\1\162\1\157\1\165\1\154\1\146\1"+
        "\164\2\145\1\167\1\162\1\150\3\uffff\1\uffff\6\uffff\1\136\1\46"+
        "\1\174\1\75\1\uffff\2\75\1\uffff\1\75\6\uffff\1\71\4\uffff\1\144"+
        "\1\163\1\uffff\1\172\4\uffff\1\145\1\164\1\141\1\156\1\154\1\162"+
        "\1\156\1\157\1\172\1\150\2\162\1\164\1\155\1\151\1\171\1\151\2\uffff"+
        "\25\uffff\1\172\1\145\1\141\1\145\1\143\1\163\1\164\1\163\1\172"+
        "\1\143\1\142\1\uffff\1\145\1\146\1\163\1\165\1\144\1\164\1\145\1"+
        "\172\1\154\4\uffff\1\172\1\153\1\172\1\150\1\163\1\151\1\145\1\uffff"+
        "\1\164\1\141\1\162\1\157\1\151\1\162\1\172\1\143\1\172\1\uffff\1"+
        "\145\1\146\1\uffff\1\172\1\uffff\1\172\1\144\1\156\1\172\1\151\1"+
        "\154\1\167\1\162\1\163\1\156\1\uffff\1\150\1\uffff\2\172\2\uffff"+
        "\1\145\1\165\1\uffff\1\157\1\172\1\151\1\172\1\164\2\172\2\uffff"+
        "\1\146\1\145\1\156\1\uffff\1\163\1\uffff\1\145\2\uffff\3\172\1\145"+
        "\1\156\3\uffff\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\13\uffff\1\33\1\34\1\35\1\uffff\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\4\uffff\1\56\2\uffff\1\64\1\uffff\1\72\1\74\1\77\1\100"+
        "\1\101\1\103\1\uffff\1\106\1\107\1\110\1\111\2\uffff\1\105\1\uffff"+
        "\1\2\1\70\1\3\1\71\23\uffff\1\73\1\102\1\46\1\47\1\50\1\51\1\52"+
        "\1\104\1\45\1\75\1\53\1\76\1\54\1\61\1\55\1\60\1\57\1\62\1\63\1"+
        "\66\1\65\13\uffff\1\21\11\uffff\1\36\1\67\1\1\1\14\7\uffff\1\16"+
        "\11\uffff\1\31\2\uffff\1\12\1\uffff\1\6\12\uffff\1\26\1\uffff\1"+
        "\30\2\uffff\1\5\1\7\2\uffff\1\15\7\uffff\1\32\1\13\3\uffff\1\20"+
        "\1\uffff\1\23\1\uffff\1\25\1\27\5\uffff\1\10\1\11\1\17\2\uffff\1"+
        "\22\1\uffff\1\24";
    static final String DFA16_specialS =
        "\23\uffff\1\2\63\uffff\1\1\1\0\170\uffff}>";
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
            "\1\72\15\uffff\1\73\5\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\3\uffff\1\101",
            "\1\102",
            "\1\103\6\uffff\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "\173\112\1\110\1\112\1\107\uff82\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117\2\uffff\1\116\3\uffff\1\120\1\115\12\50\42\uffff\1\113"+
            "\1\uffff\1\114",
            "\1\122",
            "\1\124",
            "\1\126",
            "",
            "\1\130",
            "\1\132",
            "",
            "\1\134",
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
            "\1\136",
            "\1\137",
            "",
            "\12\61\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\3\uffff\1\161",
            "\1\162",
            "\0\112",
            "\0\112",
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
            "\1\165\2\uffff\1\165\42\uffff\12\52\7\uffff\32\52\4\uffff\1"+
            "\52\1\uffff\32\52",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u008a\21"+
            "\52",
            "\1\u008c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0099",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009f",
            "\1\u00a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00af",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bf",
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
            return "1:1: Tokens : ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FALSE | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRUE | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | COMMENT | DOUBLE | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_72 = input.LA(1);

                        s = -1;
                        if ( ((LA16_72 >= '\u0000' && LA16_72 <= '\uFFFF')) ) {s = 74;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA16_71 = input.LA(1);

                        s = -1;
                        if ( ((LA16_71 >= '\u0000' && LA16_71 <= '\uFFFF')) ) {s = 74;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( (LA16_19=='}') ) {s = 71;}

                        else if ( (LA16_19=='{') ) {s = 72;}

                        else if ( ((LA16_19 >= '\u0000' && LA16_19 <= 'z')||LA16_19=='|'||(LA16_19 >= '~' && LA16_19 <= '\uFFFF')) ) {s = 74;}

                        else s = 73;

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