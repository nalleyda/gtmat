// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g 2012-02-20 14:18:19

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
    public static final int DOUBLE_QUOTE=29;
    public static final int ELE_AND=30;
    public static final int ELE_OR=31;
    public static final int ELLIPSIS=32;
    public static final int ELSE=33;
    public static final int ELSEIF=34;
    public static final int EMPTY_CELL=35;
    public static final int EMPTY_VEC=36;
    public static final int END=37;
    public static final int EQUALS=38;
    public static final int EXCLAMATION=39;
    public static final int EXPONENT=40;
    public static final int FALSE=41;
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
    public static final int INTEGER=55;
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

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g"; }

    // $ANTLR start "BLOCK_END"
    public final void mBLOCK_END() throws RecognitionException {
        try {
            int _type = BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:271:11: ( 'end' ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:271:13: 'end' ( '\\r' )? '\\n'
            {
            match("end"); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:271:19: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:271:19: '\\r'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:272:11: ( '[' ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:272:13: '[' ']'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:273:12: ( '{' '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:273:14: '{' '}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:274:14: ( '$' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:274:16: '$'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:277:8: ( 'break' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:277:10: 'break'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:278:7: ( 'case' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:278:9: 'case'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:279:8: ( 'catch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:279:10: 'catch'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:280:10: ( 'classdef' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:280:12: 'classdef'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:281:10: ( 'continue' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:281:12: 'continue'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:282:7: ( 'else' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:282:9: 'else'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:283:9: ( 'elseif' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:283:11: 'elseif'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:284:6: ( 'end' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:284:8: 'end'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:285:8: ( 'false' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:285:10: 'false'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:286:6: ( 'for' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:286:8: 'for'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:287:10: ( 'function' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:287:12: 'function'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:288:9: ( 'global' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:288:11: 'global'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:289:5: ( 'if' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:289:7: 'if'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:290:11: ( 'otherwise' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:290:13: 'otherwise'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:291:9: ( 'parfor' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:291:11: 'parfor'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:292:12: ( 'persistent' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:292:14: 'persistent'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:293:9: ( 'return' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:293:11: 'return'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:294:7: ( 'spmd' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:294:9: 'spmd'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:295:9: ( 'switch' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:295:11: 'switch'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:296:7: ( 'true' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:296:9: 'true'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:297:6: ( 'try' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:297:8: 'try'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:298:8: ( 'while' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:298:10: 'while'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:301:5: ( '@' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:301:7: '@'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:302:11: ( '\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:302:13: '\\\\'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:303:8: ( '^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:303:10: '^'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:304:13: ( '%}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:304:15: '%}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:305:9: ( ']' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:305:11: ']'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:306:9: ( '}' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:306:11: '}'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:307:9: ( ')' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:307:11: ')'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:308:8: ( ':' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:308:10: ':'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:309:8: ( ',' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:309:10: ','
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:310:14: ( '\"' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:310:16: '\"'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:311:6: ( '.' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:311:8: '.'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:312:15: ( '.\\\\' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:312:17: '.\\\\'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:313:11: ( '.^' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:313:13: '.^'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:315:11: ( './' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:315:13: './'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:316:10: ( '.*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:316:12: '.*'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:317:15: ( '.\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:317:17: '.\\''
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:318:10: ( '&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:318:12: '&'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:319:9: ( '|' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:319:11: '|'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:320:9: ( '=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:320:11: '='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:321:13: ( '!' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:321:15: '!'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:322:14: ( '>' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:322:16: '>'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:323:15: ( '>=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:323:17: '>='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:324:10: ( '==' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:324:12: '=='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:325:12: ( '<=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:325:14: '<='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:326:11: ( '<' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:326:13: '<'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:327:8: ( '-' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:327:10: '-'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:328:6: ( '~' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:328:8: '~'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:329:11: ( '~=' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:329:13: '~='
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:330:12: ( '%{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:330:14: '%{'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:331:8: ( '[' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:331:10: '['
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:332:8: ( '{' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:332:10: '{'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:333:8: ( '(' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:333:10: '('
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:334:10: ( '%' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:334:12: '%'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:335:7: ( '+' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:335:9: '+'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:336:9: ( '&&' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:336:11: '&&'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:337:8: ( '||' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:337:10: '||'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:338:7: ( ';' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:338:9: ';'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:340:8: ( '/' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:340:10: '/'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:341:7: ( '*' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:341:9: '*'
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:345:17: ( ( '0' .. '9' ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:346:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:347:21: ( '_' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:347:23: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:348:9: ( ( DIGIT )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:348:11: ( DIGIT )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:348:11: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:350:9: ( '\\%' ( . )* NEWLINE )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:350:11: '\\%' ( . )* NEWLINE
            {
            match('%'); 

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:350:16: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:350:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:352:9: ( '...' ( NEWLINE )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:352:11: '...' ( NEWLINE )+
            {
            match("..."); 



            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:352:17: ( NEWLINE )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:352:17: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:353:9: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:353:11: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:353:23: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:353:36: ( '0' .. '9' )+
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
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:354:5: ( LETTER ( LETTER | DIGIT | UNDERSCORE )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:354:7: LETTER ( LETTER | DIGIT | UNDERSCORE )*
            {
            mLETTER(); 


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:354:14: ( LETTER | DIGIT | UNDERSCORE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            	    break loop7;
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:358:9: ( ( '\\r' )? '\\n' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:358:11: ( '\\r' )? '\\n'
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:358:11: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:358:11: '\\r'
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:360:8: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:360:10: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 

            StringBuilder b = new StringBuilder();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:362:11: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\'') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\'') ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '&')||(LA9_0 >= '(' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:362:13: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:363:13: c=~ ( '\\'' | '\\r' | '\\n' )
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
            	    break loop9;
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
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:368:5: ( ( ' ' | '\\t' | '\\f' )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:368:7: ( ' ' | '\\t' | '\\f' )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:368:7: ( ' ' | '\\t' | '\\f' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0=='\f'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:8: ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FALSE | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRUE | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | INTEGER | COMMENT | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS )
        int alt11=73;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:10: BLOCK_END
                {
                mBLOCK_END(); 


                }
                break;
            case 2 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:20: EMPTY_VEC
                {
                mEMPTY_VEC(); 


                }
                break;
            case 3 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:30: EMPTY_CELL
                {
                mEMPTY_CELL(); 


                }
                break;
            case 4 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:41: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 


                }
                break;
            case 5 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:54: BREAK
                {
                mBREAK(); 


                }
                break;
            case 6 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:60: CASE
                {
                mCASE(); 


                }
                break;
            case 7 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:65: CATCH
                {
                mCATCH(); 


                }
                break;
            case 8 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:71: CLASSDEF
                {
                mCLASSDEF(); 


                }
                break;
            case 9 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:80: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 10 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:89: ELSE
                {
                mELSE(); 


                }
                break;
            case 11 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:94: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 12 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:101: END
                {
                mEND(); 


                }
                break;
            case 13 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:105: FALSE
                {
                mFALSE(); 


                }
                break;
            case 14 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:111: FOR
                {
                mFOR(); 


                }
                break;
            case 15 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:115: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 16 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:124: GLOBAL
                {
                mGLOBAL(); 


                }
                break;
            case 17 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:131: IF
                {
                mIF(); 


                }
                break;
            case 18 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:134: OTHERWISE
                {
                mOTHERWISE(); 


                }
                break;
            case 19 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:144: PARFOR
                {
                mPARFOR(); 


                }
                break;
            case 20 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:151: PERSISTENT
                {
                mPERSISTENT(); 


                }
                break;
            case 21 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:162: RETURN
                {
                mRETURN(); 


                }
                break;
            case 22 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:169: SPMD
                {
                mSPMD(); 


                }
                break;
            case 23 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:174: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 24 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:181: TRUE
                {
                mTRUE(); 


                }
                break;
            case 25 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:186: TRY
                {
                mTRY(); 


                }
                break;
            case 26 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:190: WHILE
                {
                mWHILE(); 


                }
                break;
            case 27 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:196: AT
                {
                mAT(); 


                }
                break;
            case 28 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:199: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 29 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:209: CARET
                {
                mCARET(); 


                }
                break;
            case 30 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:215: CLOSE_BLOCK
                {
                mCLOSE_BLOCK(); 


                }
                break;
            case 31 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:227: CLOSEB
                {
                mCLOSEB(); 


                }
                break;
            case 32 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:234: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 33 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:241: CLOSEP
                {
                mCLOSEP(); 


                }
                break;
            case 34 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:248: COLON
                {
                mCOLON(); 


                }
                break;
            case 35 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:254: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 36 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:260: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); 


                }
                break;
            case 37 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:273: DOT
                {
                mDOT(); 


                }
                break;
            case 38 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:277: DOT_BACKSLASH
                {
                mDOT_BACKSLASH(); 


                }
                break;
            case 39 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:291: DOT_CARET
                {
                mDOT_CARET(); 


                }
                break;
            case 40 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:301: DOT_SLASH
                {
                mDOT_SLASH(); 


                }
                break;
            case 41 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:311: DOT_STAR
                {
                mDOT_STAR(); 


                }
                break;
            case 42 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:320: DOT_TRANSPOSE
                {
                mDOT_TRANSPOSE(); 


                }
                break;
            case 43 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:334: ELE_AND
                {
                mELE_AND(); 


                }
                break;
            case 44 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:342: ELE_OR
                {
                mELE_OR(); 


                }
                break;
            case 45 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:349: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 46 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:356: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 47 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:368: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 48 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:381: GREATER_EQUAL
                {
                mGREATER_EQUAL(); 


                }
                break;
            case 49 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:395: ISEQUAL
                {
                mISEQUAL(); 


                }
                break;
            case 50 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:403: LESS_EQUAL
                {
                mLESS_EQUAL(); 


                }
                break;
            case 51 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:414: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 52 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:424: MINUS
                {
                mMINUS(); 


                }
                break;
            case 53 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:430: NOT
                {
                mNOT(); 


                }
                break;
            case 54 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:434: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 55 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:444: OPEN_BLOCK
                {
                mOPEN_BLOCK(); 


                }
                break;
            case 56 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:455: OPENB
                {
                mOPENB(); 


                }
                break;
            case 57 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:461: OPENC
                {
                mOPENC(); 


                }
                break;
            case 58 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:467: OPENP
                {
                mOPENP(); 


                }
                break;
            case 59 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:473: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 60 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:481: PLUS
                {
                mPLUS(); 


                }
                break;
            case 61 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:486: SC_AND
                {
                mSC_AND(); 


                }
                break;
            case 62 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:493: SC_OR
                {
                mSC_OR(); 


                }
                break;
            case 63 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:499: SEMI
                {
                mSEMI(); 


                }
                break;
            case 64 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:504: SLASH
                {
                mSLASH(); 


                }
                break;
            case 65 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:510: STAR
                {
                mSTAR(); 


                }
                break;
            case 66 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:515: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 67 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:523: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 68 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:531: ELLIPSIS
                {
                mELLIPSIS(); 


                }
                break;
            case 69 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:540: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 70 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:549: ID
                {
                mID(); 


                }
                break;
            case 71 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:552: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 72 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:560: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 73 :
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:1:575: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
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
    static final String DFA11_eofS =
        "\u00c1\uffff";
    static final String DFA11_minS =
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
    static final String DFA11_maxS =
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
    static final String DFA11_acceptS =
        "\4\uffff\1\4\13\uffff\1\33\1\34\1\35\1\uffff\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\4\uffff\1\56\2\uffff\1\64\1\uffff\1\72\1\74\1\77\1\100"+
        "\1\101\1\102\1\uffff\1\106\1\107\1\110\1\111\2\uffff\1\105\1\uffff"+
        "\1\2\1\70\1\3\1\71\23\uffff\1\73\1\103\1\46\1\47\1\50\1\51\1\52"+
        "\1\104\1\45\1\75\1\53\1\76\1\54\1\61\1\55\1\60\1\57\1\62\1\63\1"+
        "\66\1\65\13\uffff\1\21\11\uffff\1\36\1\67\1\1\1\14\7\uffff\1\16"+
        "\11\uffff\1\31\2\uffff\1\12\1\uffff\1\6\12\uffff\1\26\1\uffff\1"+
        "\30\2\uffff\1\5\1\7\2\uffff\1\15\7\uffff\1\32\1\13\3\uffff\1\20"+
        "\1\uffff\1\23\1\uffff\1\25\1\27\5\uffff\1\10\1\11\1\17\2\uffff\1"+
        "\22\1\uffff\1\24";
    static final String DFA11_specialS =
        "\23\uffff\1\2\63\uffff\1\0\1\1\170\uffff}>";
    static final String[] DFA11_transitionS = {
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
            "\1\117\2\uffff\1\116\3\uffff\1\120\1\115\54\uffff\1\113\1\uffff"+
            "\1\114",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BLOCK_END | EMPTY_VEC | EMPTY_CELL | SINGLE_QUOTE | BREAK | CASE | CATCH | CLASSDEF | CONTINUE | ELSE | ELSEIF | END | FALSE | FOR | FUNCTION | GLOBAL | IF | OTHERWISE | PARFOR | PERSISTENT | RETURN | SPMD | SWITCH | TRUE | TRY | WHILE | AT | BACKSLASH | CARET | CLOSE_BLOCK | CLOSEB | CLOSEC | CLOSEP | COLON | COMMA | DOUBLE_QUOTE | DOT | DOT_BACKSLASH | DOT_CARET | DOT_SLASH | DOT_STAR | DOT_TRANSPOSE | ELE_AND | ELE_OR | EQUALS | EXCLAMATION | GREATER_THAN | GREATER_EQUAL | ISEQUAL | LESS_EQUAL | LESS_THAN | MINUS | NOT | NOT_EQUAL | OPEN_BLOCK | OPENB | OPENC | OPENP | PERCENT | PLUS | SC_AND | SC_OR | SEMI | SLASH | STAR | INTEGER | COMMENT | ELLIPSIS | EXPONENT | ID | NEWLINE | STRING_LITERAL | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_71 = input.LA(1);

                        s = -1;
                        if ( ((LA11_71 >= '\u0000' && LA11_71 <= '\uFFFF')) ) {s = 74;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA11_72 = input.LA(1);

                        s = -1;
                        if ( ((LA11_72 >= '\u0000' && LA11_72 <= '\uFFFF')) ) {s = 74;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA11_19 = input.LA(1);

                        s = -1;
                        if ( (LA11_19=='}') ) {s = 71;}

                        else if ( (LA11_19=='{') ) {s = 72;}

                        else if ( ((LA11_19 >= '\u0000' && LA11_19 <= 'z')||LA11_19=='|'||(LA11_19 >= '~' && LA11_19 <= '\uFFFF')) ) {s = 74;}

                        else s = 73;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}