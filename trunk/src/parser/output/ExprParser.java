// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g 2012-02-02 19:53:04

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
  * Should take all symobls to tokens for TreeWalker (e.g., 'EXP)
  */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BACKSLASH", "BLOCK", "BLOCK_END", "BREAK", "CARET", "CASE", "CATCH", "CLASSDEF", "CLOSEB", "CLOSEC", "CLOSEP", "CLOSE_BLOCK", "COLON", "COLON_ARGS", "COMMA", "COMMENT", "CONTINUE", "DIGIT", "DOT", "DOT_BACKSLASH", "DOT_CARET", "DOT_SLASH", "DOT_STAR", "DOT_TRANSPOSE", "DOUBLE", "DOUBLE_QUOTE", "ELE_AND", "ELE_OR", "ELLIPSIS", "ELSE", "ELSEIF", "EMPTY_CELL", "EMPTY_VEC", "END", "EQUALS", "EXCLAMATION", "EXPONENT", "FOR", "FOR_LOOP", "FUNCTION", "FUNC_ARGS", "GLOBAL", "GREATER_EQUAL", "GREATER_EQUL", "GREATER_THAN", "HCAT_CELL", "HCAT_VEC", "ID", "IF", "IF_STAT", "INT", "ISEQUAL", "LESS_EQUAL", "LESS_THAN", "LETTER", "MINUS", "NEWLINE", "NOT", "NOT_EQUAL", "OPENB", "OPENC", "OPENP", "OPEN_BLOCK", "OTHERWISE", "PARFOR", "PERCENT", "PERSISTENT", "PLUS", "RETURN", "SC_AND", "SC_OR", "SEMI", "SINGLE_QUOTE", "SLASH", "SPMD", "STAR", "STRING_LITERAL", "SWITCH", "SWITCH_STAT", "TRY", "UNDERSCORE", "VCAT_CELL", "VCAT_VEC", "WHILE", "WHILE_LOOP", "WS"
    };

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
    public static final int INT=55;
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
    public static final int TRY=84;
    public static final int UNDERSCORE=85;
    public static final int VCAT_CELL=86;
    public static final int VCAT_VEC=87;
    public static final int WHILE=88;
    public static final int WHILE_LOOP=89;
    public static final int WS=90;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[41+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:76:1: start : prog EOF !;
    public final ExprParser.start_return start() throws RecognitionException {
        ExprParser.start_return retval = new ExprParser.start_return();
        retval.start = input.LT(1);

        int start_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.prog_return prog1 =null;


        CommonTree EOF2_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:76:7: ( prog EOF !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:76:9: prog EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_prog_in_start207);
            prog1=prog();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prog1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start209); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "start"


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:78:1: prog : ( block )+ ;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.block_return block3 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:78:7: ( ( block )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:78:9: ( block )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:78:9: ( block )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:78:9: block
            	    {
            	    pushFollow(FOLLOW_block_in_prog220);
            	    block3=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, block3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, prog_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class functionArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionArgs"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
    public final ExprParser.functionArgs_return functionArgs() throws RecognitionException {
        ExprParser.functionArgs_return retval = new ExprParser.functionArgs_return();
        retval.start = input.LT(1);

        int functionArgs_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA5=null;
        ExprParser.expr_return expr4 =null;

        ExprParser.expr_return expr6 =null;


        CommonTree COMMA5_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs241);
            expr4=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr4.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:22: ( COMMA expr )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:23: COMMA expr
            	    {
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionArgs244); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA5);


            	    pushFollow(FOLLOW_expr_in_functionArgs246);
            	    expr6=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 90:36: -> ^( FUNC_ARGS ( expr )* )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:90:51: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, functionArgs_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionArgs"


    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:1: functionCall : ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) ;
    public final ExprParser.functionCall_return functionCall() throws RecognitionException {
        ExprParser.functionCall_return retval = new ExprParser.functionCall_return();
        retval.start = input.LT(1);

        int functionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID7=null;
        Token OPENP8=null;
        Token CLOSEP10=null;
        ExprParser.functionArgs_return functionArgs9 =null;


        CommonTree ID7_tree=null;
        CommonTree OPENP8_tree=null;
        CommonTree CLOSEP10_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:15: ( ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:17: ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:31: ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:32: ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_functionCall275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID7_tree = 
            (CommonTree)adaptor.create(ID7)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID7_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:36: ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:93:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:93:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            int alt4=2;
            switch ( input.LA(1) ) {
                case OPENP:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:93:18: OPENP ! ( functionArgs )? CLOSEP !
                    {
                    OPENP8=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall283); if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:93:25: ( functionArgs )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case COLON:
                        case DOT:
                        case EMPTY_CELL:
                        case EMPTY_VEC:
                        case END:
                        case ID:
                        case INT:
                        case MINUS:
                        case NOT:
                        case OPENB:
                        case OPENC:
                        case OPENP:
                        case PLUS:
                        case STRING_LITERAL:
                            {
                            alt3=1;
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:93:25: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_functionCall286);
                            functionArgs9=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs9.getTree());

                            }
                            break;

                    }


                    CLOSEP10=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall289); if (state.failed) return retval;

                    }
                    break;

            }


            }


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, functionCall_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class functionCallOrStructure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCallOrStructure"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? ;
    public final ExprParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        ExprParser.functionCallOrStructure_return retval = new ExprParser.functionCallOrStructure_return();
        retval.start = input.LT(1);

        int functionCallOrStructure_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT12=null;
        Token OPENP13=null;
        Token CLOSEP15=null;
        ExprParser.functionCall_return functionCall11 =null;

        ExprParser.expr_return expr14 =null;

        ExprParser.functionCall_return functionCall16 =null;


        CommonTree DOT12_tree=null;
        CommonTree OPENP13_tree=null;
        CommonTree CLOSEP15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:25: ( functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:27: functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure310);
            functionCall11=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall11.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:40: ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    switch ( input.LA(2) ) {
                        case ID:
                        case OPENP:
                            {
                            alt6=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:41: DOT ^ ( OPENP ! expr CLOSEP !| functionCall )
                    {
                    DOT12=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT12_tree = 
                    (CommonTree)adaptor.create(DOT12)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT12_tree, root_0);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:46: ( OPENP ! expr CLOSEP !| functionCall )
                    int alt5=2;
                    switch ( input.LA(1) ) {
                    case OPENP:
                        {
                        alt5=1;
                        }
                        break;
                    case ID:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }

                    switch (alt5) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:47: OPENP ! expr CLOSEP !
                            {
                            OPENP13=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure317); if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_functionCallOrStructure320);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());

                            CLOSEP15=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure322); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:100:69: functionCall
                            {
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure327);
                            functionCall16=functionCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall16.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, functionCallOrStructure_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionCallOrStructure"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:105:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | ( INT ( DOT ^ INT )? | ( DOT ^ INT ) ) | functionCallOrStructure | END | vector | cellArray | COLON );
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);

        int term_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EMPTY_VEC17=null;
        Token EMPTY_CELL18=null;
        Token OPENP19=null;
        Token CLOSEP21=null;
        Token STRING_LITERAL22=null;
        Token INT23=null;
        Token DOT24=null;
        Token INT25=null;
        Token DOT26=null;
        Token INT27=null;
        Token END29=null;
        Token COLON32=null;
        ExprParser.expr_return expr20 =null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure28 =null;

        ExprParser.vector_return vector30 =null;

        ExprParser.cellArray_return cellArray31 =null;


        CommonTree EMPTY_VEC17_tree=null;
        CommonTree EMPTY_CELL18_tree=null;
        CommonTree OPENP19_tree=null;
        CommonTree CLOSEP21_tree=null;
        CommonTree STRING_LITERAL22_tree=null;
        CommonTree INT23_tree=null;
        CommonTree DOT24_tree=null;
        CommonTree INT25_tree=null;
        CommonTree DOT26_tree=null;
        CommonTree INT27_tree=null;
        CommonTree END29_tree=null;
        CommonTree COLON32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:105:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | ( INT ( DOT ^ INT )? | ( DOT ^ INT ) ) | functionCallOrStructure | END | vector | cellArray | COLON )
            int alt9=10;
            switch ( input.LA(1) ) {
            case EMPTY_VEC:
                {
                alt9=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt9=2;
                }
                break;
            case OPENP:
                {
                alt9=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt9=4;
                }
                break;
            case DOT:
            case INT:
                {
                alt9=5;
                }
                break;
            case ID:
                {
                alt9=6;
                }
                break;
            case END:
                {
                alt9=7;
                }
                break;
            case OPENB:
                {
                alt9=8;
                }
                break;
            case OPENC:
                {
                alt9=9;
                }
                break;
            case COLON:
                {
                alt9=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:105:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_VEC17=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC17_tree = 
                    (CommonTree)adaptor.create(EMPTY_VEC17)
                    ;
                    adaptor.addChild(root_0, EMPTY_VEC17_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:106:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_CELL18=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL18_tree = 
                    (CommonTree)adaptor.create(EMPTY_CELL18)
                    ;
                    adaptor.addChild(root_0, EMPTY_CELL18_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:107:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP19=(Token)match(input,OPENP,FOLLOW_OPENP_in_term351); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term354);
                    expr20=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr20.getTree());

                    CLOSEP21=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term356); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:110:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL22=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL22_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL22)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL22_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:4: ( INT ( DOT ^ INT )? | ( DOT ^ INT ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:4: ( INT ( DOT ^ INT )? | ( DOT ^ INT ) )
                    int alt8=2;
                    switch ( input.LA(1) ) {
                    case INT:
                        {
                        alt8=1;
                        }
                        break;
                    case DOT:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }

                    switch (alt8) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:5: INT ( DOT ^ INT )?
                            {
                            INT23=(Token)match(input,INT,FOLLOW_INT_in_term372); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT23_tree = 
                            (CommonTree)adaptor.create(INT23)
                            ;
                            adaptor.addChild(root_0, INT23_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:9: ( DOT ^ INT )?
                            int alt7=2;
                            switch ( input.LA(1) ) {
                                case DOT:
                                    {
                                    switch ( input.LA(2) ) {
                                        case INT:
                                            {
                                            alt7=1;
                                            }
                                            break;
                                    }

                                    }
                                    break;
                            }

                            switch (alt7) {
                                case 1 :
                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:10: DOT ^ INT
                                    {
                                    DOT24=(Token)match(input,DOT,FOLLOW_DOT_in_term375); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    DOT24_tree = 
                                    (CommonTree)adaptor.create(DOT24)
                                    ;
                                    root_0 = (CommonTree)adaptor.becomeRoot(DOT24_tree, root_0);
                                    }

                                    INT25=(Token)match(input,INT,FOLLOW_INT_in_term378); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    INT25_tree = 
                                    (CommonTree)adaptor.create(INT25)
                                    ;
                                    adaptor.addChild(root_0, INT25_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:23: ( DOT ^ INT )
                            {
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:23: ( DOT ^ INT )
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:111:24: DOT ^ INT
                            {
                            DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_term385); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT26_tree = 
                            (CommonTree)adaptor.create(DOT26)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(DOT26_tree, root_0);
                            }

                            INT27=(Token)match(input,INT,FOLLOW_INT_in_term388); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT27_tree = 
                            (CommonTree)adaptor.create(INT27)
                            ;
                            adaptor.addChild(root_0, INT27_tree);
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:115:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCallOrStructure_in_term402);
                    functionCallOrStructure28=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure28.getTree());

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:116:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END29=(Token)match(input,END,FOLLOW_END_in_term408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END29_tree = 
                    (CommonTree)adaptor.create(END29)
                    ;
                    adaptor.addChild(root_0, END29_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:117:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vector_in_term413);
                    vector30=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector30.getTree());

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:118:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cellArray_in_term418);
                    cellArray31=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray31.getTree());

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:119:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON32=(Token)match(input,COLON,FOLLOW_COLON_in_term423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON32_tree = 
                    (CommonTree)adaptor.create(COLON32)
                    ;
                    adaptor.addChild(root_0, COLON32_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, term_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "term"


    public static class transponent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transponent"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:125:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET34=null;
        Token CARET35=null;
        Token SINGLE_QUOTE37=null;
        Token DOT_TRANSPOSE38=null;
        ExprParser.term_return term33 =null;

        ExprParser.term_return term36 =null;


        CommonTree DOT_CARET34_tree=null;
        CommonTree CARET35_tree=null;
        CommonTree SINGLE_QUOTE37_tree=null;
        CommonTree DOT_TRANSPOSE38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            pushFollow(FOLLOW_term_in_transponent445);
            term33=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term33.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt13=2;
            switch ( input.LA(1) ) {
            case CARET:
            case DOT_CARET:
                {
                alt13=1;
                }
                break;
            case DOT_STAR:
                {
                alt13=1;
                }
                break;
            case DOT_SLASH:
                {
                alt13=1;
                }
                break;
            case DOT_BACKSLASH:
                {
                alt13=1;
                }
                break;
            case STAR:
                {
                alt13=1;
                }
                break;
            case SLASH:
                {
                alt13=1;
                }
                break;
            case BACKSLASH:
                {
                alt13=1;
                }
                break;
            case PLUS:
                {
                alt13=1;
                }
                break;
            case MINUS:
                {
                alt13=1;
                }
                break;
            case LESS_THAN:
                {
                alt13=1;
                }
                break;
            case GREATER_THAN:
                {
                alt13=1;
                }
                break;
            case LESS_EQUAL:
                {
                alt13=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt13=1;
                }
                break;
            case ISEQUAL:
                {
                alt13=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt13=1;
                }
                break;
            case ELE_AND:
                {
                alt13=1;
                }
                break;
            case ELE_OR:
                {
                alt13=1;
                }
                break;
            case SC_AND:
                {
                alt13=1;
                }
                break;
            case SC_OR:
                {
                alt13=1;
                }
                break;
            case COMMA:
                {
                alt13=1;
                }
                break;
            case CLOSEP:
                {
                alt13=1;
                }
                break;
            case NOT:
                {
                alt13=1;
                }
                break;
            case EMPTY_VEC:
                {
                alt13=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt13=1;
                }
                break;
            case OPENP:
                {
                alt13=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt13=1;
                }
                break;
            case INT:
                {
                alt13=1;
                }
                break;
            case DOT:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                alt13=1;
                }
                break;
            case END:
                {
                alt13=1;
                }
                break;
            case OPENB:
                {
                alt13=1;
                }
                break;
            case OPENC:
                {
                alt13=1;
                }
                break;
            case COLON:
                {
                alt13=1;
                }
                break;
            case SEMI:
                {
                alt13=1;
                }
                break;
            case CLOSEB:
                {
                alt13=1;
                }
                break;
            case CLOSEC:
                {
                alt13=1;
                }
                break;
            case EOF:
                {
                alt13=1;
                }
                break;
            case IF:
                {
                alt13=1;
                }
                break;
            case SWITCH:
                {
                alt13=1;
                }
                break;
            case FOR:
                {
                alt13=1;
                }
                break;
            case WHILE:
                {
                alt13=1;
                }
                break;
            case ELSEIF:
                {
                alt13=1;
                }
                break;
            case ELSE:
                {
                alt13=1;
                }
                break;
            case BLOCK_END:
                {
                alt13=1;
                }
                break;
            case OTHERWISE:
                {
                alt13=1;
                }
                break;
            case CASE:
                {
                alt13=1;
                }
                break;
            case DOT_TRANSPOSE:
            case SINGLE_QUOTE:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:3: ( ( DOT_CARET ^| CARET ^) term )*
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case CARET:
                        case DOT_CARET:
                            {
                            alt11=1;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:5: ( DOT_CARET ^| CARET ^)
                    	    int alt10=2;
                    	    switch ( input.LA(1) ) {
                    	    case DOT_CARET:
                    	        {
                    	        alt10=1;
                    	        }
                    	        break;
                    	    case CARET:
                    	        {
                    	        alt10=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt10) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:6: DOT_CARET ^
                    	            {
                    	            DOT_CARET34=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent454); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET34_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET34)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET34_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:19: CARET ^
                    	            {
                    	            CARET35=(Token)match(input,CARET,FOLLOW_CARET_in_transponent459); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET35_tree = 
                    	            (CommonTree)adaptor.create(CARET35)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET35_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_term_in_transponent463);
                    	    term36=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:133:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:133:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    loop12:
                    do {
                        int alt12=3;
                        switch ( input.LA(1) ) {
                        case SINGLE_QUOTE:
                            {
                            alt12=1;
                            }
                            break;
                        case DOT_TRANSPOSE:
                            {
                            alt12=2;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:133:6: SINGLE_QUOTE ^
                    	    {
                    	    SINGLE_QUOTE37=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent472); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE37_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE37)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE37_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:133:22: DOT_TRANSPOSE ^
                    	    {
                    	    DOT_TRANSPOSE38=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent477); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE38_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE38)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE38_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, transponent_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "transponent"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS39=null;
        Token MINUS40=null;
        Token NOT41=null;
        ExprParser.transponent_return transponent42 =null;


        CommonTree PLUS39_tree=null;
        CommonTree MINUS40_tree=null;
        CommonTree NOT41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:9: ( PLUS !| MINUS ^| NOT ^)*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt14=1;
                    }
                    break;
                case MINUS:
                    {
                    alt14=2;
                    }
                    break;
                case NOT:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:10: PLUS !
            	    {
            	    PLUS39=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary500); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:18: MINUS ^
            	    {
            	    MINUS40=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary505); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS40_tree = 
            	    (CommonTree)adaptor.create(MINUS40)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS40_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:137:27: NOT ^
            	    {
            	    NOT41=(Token)match(input,NOT,FOLLOW_NOT_in_unary510); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT41_tree = 
            	    (CommonTree)adaptor.create(NOT41)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT41_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary515);
            transponent42=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent42.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, unary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR44=null;
        Token DOT_SLASH45=null;
        Token DOT_BACKSLASH46=null;
        Token STAR47=null;
        Token SLASH48=null;
        Token BACKSLASH49=null;
        ExprParser.unary_return unary43 =null;

        ExprParser.unary_return unary50 =null;


        CommonTree DOT_STAR44_tree=null;
        CommonTree DOT_SLASH45_tree=null;
        CommonTree DOT_BACKSLASH46_tree=null;
        CommonTree STAR47_tree=null;
        CommonTree SLASH48_tree=null;
        CommonTree BACKSLASH49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult523);
            unary43=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary43.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case BACKSLASH:
                case DOT_BACKSLASH:
                case DOT_SLASH:
                case DOT_STAR:
                case SLASH:
                case STAR:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt15=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt15=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:17: DOT_STAR ^
            	            {
            	            DOT_STAR44=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult528); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR44_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR44)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR44_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:29: DOT_SLASH ^
            	            {
            	            DOT_SLASH45=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult533); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH45_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:42: DOT_BACKSLASH ^
            	            {
            	            DOT_BACKSLASH46=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult538); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH46_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:59: STAR ^
            	            {
            	            STAR47=(Token)match(input,STAR,FOLLOW_STAR_in_mult543); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR47_tree = 
            	            (CommonTree)adaptor.create(STAR47)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:67: SLASH ^
            	            {
            	            SLASH48=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult548); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH48_tree = 
            	            (CommonTree)adaptor.create(SLASH48)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:139:76: BACKSLASH ^
            	            {
            	            BACKSLASH49=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult553); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH49_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH49)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH49_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult557);
            	    unary50=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary50.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, mult_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS52=null;
        Token MINUS53=null;
        ExprParser.mult_return mult51 =null;

        ExprParser.mult_return mult54 =null;


        CommonTree PLUS52_tree=null;
        CommonTree MINUS53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add569);
            mult51=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult51.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:12: ( ( PLUS ^| MINUS ^) mult )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt18=1;
                    }
                    break;
                case MINUS:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:14: ( PLUS ^| MINUS ^)
            	    int alt17=2;
            	    switch ( input.LA(1) ) {
            	    case PLUS:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case MINUS:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:15: PLUS ^
            	            {
            	            PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_add574); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS52_tree = 
            	            (CommonTree)adaptor.create(PLUS52)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS52_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:141:23: MINUS ^
            	            {
            	            MINUS53=(Token)match(input,MINUS,FOLLOW_MINUS_in_add579); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS53_tree = 
            	            (CommonTree)adaptor.create(MINUS53)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS53_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add583);
            	    mult54=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult54.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, add_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "add"


    public static class colonEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colonEnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON55=null;
        ExprParser.add_return add56 =null;


        CommonTree COLON55_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:11: ( COLON add )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:12: COLON add
            	    {
            	    COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd594); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON55);


            	    pushFollow(FOLLOW_add_in_colonEnd596);
            	    add56=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add56.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            // AST REWRITE
            // elements: add
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 143:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:143:27: ^( COLON_ARGS ( add )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLON_ARGS, "COLON_ARGS")
                , root_1);

                if ( !(stream_add.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_add.hasNext() ) {
                    adaptor.addChild(root_1, stream_add.nextTree());

                }
                stream_add.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, colonEnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colonEnd"


    public static class colon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colon"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:145:1: colon : add ( colonEnd ^)? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.add_return add57 =null;

        ExprParser.colonEnd_return colonEnd58 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:145:7: ( add ( colonEnd ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:145:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_colon615);
            add57=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add57.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:145:13: ( colonEnd ^)?
            int alt20=2;
            switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:145:14: colonEnd ^
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon618);
                    colonEnd58=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd58.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, colon_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colon"


    public static class logical_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN60=null;
        Token GREATER_THAN61=null;
        Token LESS_EQUAL62=null;
        Token GREATER_EQUAL63=null;
        Token ISEQUAL64=null;
        Token NOT_EQUAL65=null;
        ExprParser.colon_return colon59 =null;

        ExprParser.colon_return colon66 =null;


        CommonTree LESS_THAN60_tree=null;
        CommonTree GREATER_THAN61_tree=null;
        CommonTree LESS_EQUAL62_tree=null;
        CommonTree GREATER_EQUAL63_tree=null;
        CommonTree ISEQUAL64_tree=null;
        CommonTree NOT_EQUAL65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_logical646);
            colon59=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon59.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case GREATER_EQUAL:
                case GREATER_THAN:
                case ISEQUAL:
                case LESS_EQUAL:
                case LESS_THAN:
                case NOT_EQUAL:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt21=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:20: LESS_THAN ^
            	            {
            	            LESS_THAN60=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical651); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN60_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN60)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:33: GREATER_THAN ^
            	            {
            	            GREATER_THAN61=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical656); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN61_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN61)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN61_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:49: LESS_EQUAL ^
            	            {
            	            LESS_EQUAL62=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical661); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL62_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL62)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:63: GREATER_EQUAL ^
            	            {
            	            GREATER_EQUAL63=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical666); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL63_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL63)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:80: ISEQUAL ^
            	            {
            	            ISEQUAL64=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical671); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL64_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL64)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:156:91: NOT_EQUAL ^
            	            {
            	            NOT_EQUAL65=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical676); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL65_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL65)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_logical680);
            	    colon66=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon66.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, logical_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical"


    public static class eleAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:158:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND68=null;
        ExprParser.logical_return logical67 =null;

        ExprParser.logical_return logical69 =null;


        CommonTree ELE_AND68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:158:8: ( logical ( ELE_AND ^ logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:158:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logical_in_eleAnd692);
            logical67=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical67.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:158:18: ( ELE_AND ^ logical )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case ELE_AND:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:158:19: ELE_AND ^ logical
            	    {
            	    ELE_AND68=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd695); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND68_tree = 
            	    (CommonTree)adaptor.create(ELE_AND68)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND68_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_in_eleAnd698);
            	    logical69=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical69.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, eleAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleAnd"


    public static class eleOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:160:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR71=null;
        ExprParser.eleAnd_return eleAnd70 =null;

        ExprParser.eleAnd_return eleAnd72 =null;


        CommonTree ELE_OR71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:160:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:160:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr709);
            eleAnd70=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd70.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:160:16: ( ELE_OR ^ eleAnd )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case ELE_OR:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:160:17: ELE_OR ^ eleAnd
            	    {
            	    ELE_OR71=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR71_tree = 
            	    (CommonTree)adaptor.create(ELE_OR71)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR71_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleAnd_in_eleOr715);
            	    eleAnd72=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd72.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, eleOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleOr"


    public static class scAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:162:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND74=null;
        ExprParser.eleOr_return eleOr73 =null;

        ExprParser.eleOr_return eleOr75 =null;


        CommonTree SC_AND74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:162:7: ( eleOr ( SC_AND ^ eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:162:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd726);
            eleOr73=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr73.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:162:15: ( SC_AND ^ eleOr )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case SC_AND:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:162:16: SC_AND ^ eleOr
            	    {
            	    SC_AND74=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd729); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND74_tree = 
            	    (CommonTree)adaptor.create(SC_AND74)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND74_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleOr_in_scAnd732);
            	    eleOr75=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr75.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, scAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scAnd"


    public static class scOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:164:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR77=null;
        ExprParser.scAnd_return scAnd76 =null;

        ExprParser.scAnd_return scAnd78 =null;


        CommonTree SC_OR77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:164:6: ( scAnd ( SC_OR ^ scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:164:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr743);
            scAnd76=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd76.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:164:14: ( SC_OR ^ scAnd )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case SC_OR:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:164:15: SC_OR ^ scAnd
            	    {
            	    SC_OR77=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr746); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR77_tree = 
            	    (CommonTree)adaptor.create(SC_OR77)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR77_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_scAnd_in_scOr749);
            	    scAnd78=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd78.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, scOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scOr"


    public static class hCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA80=null;
        ExprParser.expr_return expr79 =null;

        ExprParser.expr_return expr81 =null;


        CommonTree COMMA80_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec772);
            expr79=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:16: ( ( COMMA )? expr )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case COLON:
                case COMMA:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case ID:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:17: ( COMMA )?
            	    int alt27=2;
            	    switch ( input.LA(1) ) {
            	        case COMMA:
            	            {
            	            alt27=1;
            	            }
            	            break;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:18: COMMA
            	            {
            	            COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec776); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA80);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatVec780);
            	    expr81=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr81.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 178:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:178:36: ^( HCAT_VEC ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HCAT_VEC, "HCAT_VEC")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, hCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatVec"


    public static class vCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI83=null;
        ExprParser.hCatVec_return hCatVec82 =null;

        ExprParser.hCatVec_return hCatVec84 =null;


        CommonTree SEMI83_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec799);
            hCatVec82=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec82.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:19: ( ( SEMI ) hCatVec )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case SEMI:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:21: SEMI
            	    {
            	    SEMI83=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec803); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI83);


            	    }


            	    pushFollow(FOLLOW_hCatVec_in_vCatVec806);
            	    hCatVec84=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec84.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // AST REWRITE
            // elements: hCatVec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:180:40: ^( VCAT_VEC ( hCatVec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VCAT_VEC, "VCAT_VEC")
                , root_1);

                if ( !(stream_hCatVec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hCatVec.hasNext() ) {
                    adaptor.addChild(root_1, stream_hCatVec.nextTree());

                }
                stream_hCatVec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, vCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatVec"


    public static class vector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vector"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:182:1: vector : OPENB ! vCatVec CLOSEB !;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB85=null;
        Token CLOSEB87=null;
        ExprParser.vCatVec_return vCatVec86 =null;


        CommonTree OPENB85_tree=null;
        CommonTree CLOSEB87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:182:8: ( OPENB ! vCatVec CLOSEB !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:182:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENB85=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector825); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatVec_in_vector828);
            vCatVec86=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec86.getTree());

            CLOSEB87=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector830); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, vector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vector"


    public static class hCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA89=null;
        ExprParser.expr_return expr88 =null;

        ExprParser.expr_return expr90 =null;


        CommonTree COMMA89_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell838);
            expr88=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr88.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:16: ( ( COMMA )? expr )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case COLON:
                case COMMA:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case ID:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                    {
                    alt31=1;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:17: ( COMMA )?
            	    int alt30=2;
            	    switch ( input.LA(1) ) {
            	        case COMMA:
            	            {
            	            alt30=1;
            	            }
            	            break;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:18: COMMA
            	            {
            	            COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell842); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatCell846);
            	    expr90=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 184:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:184:37: ^( HCAT_CELL ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HCAT_CELL, "HCAT_CELL")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, hCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatCell"


    public static class vCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI92=null;
        ExprParser.hCatCell_return hCatCell91 =null;

        ExprParser.hCatCell_return hCatCell93 =null;


        CommonTree SEMI92_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell865);
            hCatCell91=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell91.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:20: ( ( SEMI ) ! hCatCell )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case SEMI:
                    {
                    alt32=1;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:21: ( SEMI ) ! hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:22: SEMI
            	    {
            	    SEMI92=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell869); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI92);


            	    }


            	    pushFollow(FOLLOW_hCatCell_in_vCatCell873);
            	    hCatCell93=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell93.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // AST REWRITE
            // elements: hCatCell
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:186:43: ^( VCAT_CELL ( hCatCell )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VCAT_CELL, "VCAT_CELL")
                , root_1);

                if ( !(stream_hCatCell.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hCatCell.hasNext() ) {
                    adaptor.addChild(root_1, stream_hCatCell.nextTree());

                }
                stream_hCatCell.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, vCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatCell"


    public static class cellArray_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellArray"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:188:1: cellArray : OPENC ! vCatCell CLOSEC !;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC94=null;
        Token CLOSEC96=null;
        ExprParser.vCatCell_return vCatCell95 =null;


        CommonTree OPENC94_tree=null;
        CommonTree CLOSEC96_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:188:11: ( OPENC ! vCatCell CLOSEC !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:188:13: OPENC ! vCatCell CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENC94=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray892); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatCell_in_cellArray895);
            vCatCell95=vCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell95.getTree());

            CLOSEC96=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray897); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, cellArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cellArray"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:190:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.scOr_return scOr97 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:190:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:190:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scOr_in_expr910);
            scOr97=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr97.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS99=null;
        Token SEMI101=null;
        ExprParser.term_return term98 =null;

        ExprParser.expr_return expr100 =null;


        CommonTree EQUALS99_tree=null;
        CommonTree SEMI101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:29: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:29: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA33_1 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case INT:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case DOT:
                    {
                    int LA33_6 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA33_7 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA33_8 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA33_9 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA33_10 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA33_11 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:30: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:47: ( term EQUALS ^)
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:48: term EQUALS ^
                    {
                    pushFollow(FOLLOW_term_in_line939);
                    term98=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term98.getTree());

                    EQUALS99=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS99_tree = 
                    (CommonTree)adaptor.create(EQUALS99)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS99_tree, root_0);
                    }

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_line948);
            expr100=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr100.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:199:7: ( SEMI !)?
            int alt34=2;
            switch ( input.LA(1) ) {
                case SEMI:
                    {
                    alt34=1;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:199:8: SEMI !
                    {
                    SEMI101=(Token)match(input,SEMI,FOLLOW_SEMI_in_line951); if (state.failed) return retval;

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, line_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line"


    public static class ifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:1: ifPart : IF ^ expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF102=null;
        ExprParser.expr_return expr103 =null;

        ExprParser.block_return block104 =null;


        CommonTree IF102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:8: ( IF ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF102=(Token)match(input,IF,FOLLOW_IF_in_ifPart970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF102_tree = 
            (CommonTree)adaptor.create(IF102)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF102_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifPart973);
            expr103=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr103.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:19: ( block )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt35=1;
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart975);
                    block104=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block104.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, ifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifPart"


    public static class elseifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF105=null;
        ExprParser.expr_return e2 =null;

        ExprParser.block_return b2 =null;


        CommonTree ELSEIF105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:14: ( ELSEIF ^e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:15: ELSEIF ^e2= expr (b2= block )?
            {
            ELSEIF105=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart984); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF105_tree = 
            (CommonTree)adaptor.create(ELSEIF105)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF105_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_elseifPart989);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:33: (b2= block )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart993);
                    b2=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b2.getTree());

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, elseifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elseifPart"


    public static class elsePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE106=null;
        ExprParser.block_return b3 =null;


        CommonTree ELSE106_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:10: ( ( ELSE ^ (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:11: ( ELSE ^ (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:12: ELSE ^ (b3= block )?
            {
            ELSE106=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart1002); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE106_tree = 
            (CommonTree)adaptor.create(ELSE106)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE106_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:20: (b3= block )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart1007);
                    b3=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b3.getTree());

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, elsePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elsePart"


    public static class ifBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:209:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END110=null;
        ExprParser.ifPart_return ifPart107 =null;

        ExprParser.elseifPart_return elseifPart108 =null;

        ExprParser.elsePart_return elsePart109 =null;


        CommonTree BLOCK_END110_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:209:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:210:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock1018);
            ifPart107=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart107.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:211:9: ( elseifPart )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case ELSEIF:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:211:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1028);
            	    elseifPart108=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart108.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:212:9: ( elsePart )?
            int alt39=2;
            switch ( input.LA(1) ) {
                case ELSE:
                    {
                    alt39=1;
                    }
                    break;
            }

            switch (alt39) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:212:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1039);
                    elsePart109=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart109.getTree());

                    }
                    break;

            }


            BLOCK_END110=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1050); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END110);


            // AST REWRITE
            // elements: ifPart, elseifPart, elsePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 214:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:214:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:214:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:214:41: ( elsePart )?
                if ( stream_elsePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsePart.nextTree());

                }
                stream_elsePart.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, ifBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifBlock"


    public static class switchPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:1: switchPart : SWITCH ^ expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH111=null;
        ExprParser.expr_return expr112 =null;


        CommonTree SWITCH111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:12: ( SWITCH ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH111=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH111_tree = 
            (CommonTree)adaptor.create(SWITCH111)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH111_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_switchPart1111);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr112.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, switchPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchPart"


    public static class casePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:1: casePart : CASE ^ expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE113=null;
        ExprParser.expr_return expr114 =null;

        ExprParser.block_return block115 =null;


        CommonTree CASE113_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:10: ( CASE ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE113=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1118); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE113_tree = 
            (CommonTree)adaptor.create(CASE113)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE113_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_casePart1121);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:23: ( block )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1123);
                    block115=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block115.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, casePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "casePart"


    public static class otherwiseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "otherwiseBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE116=null;
        ExprParser.block_return block117 =null;


        CommonTree OTHERWISE116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:16: ( OTHERWISE ^ ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE116=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1131); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE116_tree = 
            (CommonTree)adaptor.create(OTHERWISE116)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE116_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:29: ( block )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt41=1;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1134);
                    block117=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block117.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, otherwiseBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "otherwiseBlock"


    public static class switchBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:222:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END121=null;
        ExprParser.switchPart_return switchPart118 =null;

        ExprParser.casePart_return casePart119 =null;

        ExprParser.otherwiseBlock_return otherwiseBlock120 =null;


        CommonTree BLOCK_END121_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:222:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:223:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1144);
            switchPart118=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart118.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:224:2: ( casePart )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case CASE:
                    {
                    alt42=1;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:224:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1147);
            	    casePart119=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart119.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:225:2: ( otherwiseBlock )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case OTHERWISE:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:225:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1151);
                    otherwiseBlock120=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock120.getTree());

                    }
                    break;

            }


            BLOCK_END121=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END121);


            // AST REWRITE
            // elements: casePart, otherwiseBlock, switchPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:227:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:227:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:227:40: ( otherwiseBlock )?
                if ( stream_otherwiseBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_otherwiseBlock.nextTree());

                }
                stream_otherwiseBlock.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, switchBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchBlock"


    public static class forPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:230:1: forPart : FOR ^ ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR122=null;
        Token ID123=null;
        Token EQUALS124=null;
        ExprParser.expr_return expr125 =null;


        CommonTree FOR122_tree=null;
        CommonTree ID123_tree=null;
        CommonTree EQUALS124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:230:9: ( FOR ^ ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:230:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR122=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR122_tree = 
            (CommonTree)adaptor.create(FOR122)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR122_tree, root_0);
            }

            ID123=(Token)match(input,ID,FOLLOW_ID_in_forPart1183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID123_tree = 
            (CommonTree)adaptor.create(ID123)
            ;
            adaptor.addChild(root_0, ID123_tree);
            }

            EQUALS124=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS124_tree = 
            (CommonTree)adaptor.create(EQUALS124)
            ;
            adaptor.addChild(root_0, EQUALS124_tree);
            }

            pushFollow(FOLLOW_expr_in_forPart1187);
            expr125=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, forPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forPart"


    public static class forBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:231:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END128=null;
        ExprParser.forPart_return forPart126 =null;

        ExprParser.block_return block127 =null;


        CommonTree BLOCK_END128_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:231:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:232:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1197);
            forPart126=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart126.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:233:2: ( block )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:233:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1200);
                    block127=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block127.getTree());

                    }
                    break;

            }


            BLOCK_END128=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1204); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END128);


            // AST REWRITE
            // elements: block, forPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 235:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:235:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:235:24: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, forBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forBlock"


    public static class whilePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:238:1: whilePart : WHILE ^ expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE129=null;
        ExprParser.expr_return expr130 =null;


        CommonTree WHILE129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:238:11: ( WHILE ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:238:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE129=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE129_tree = 
            (CommonTree)adaptor.create(WHILE129)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE129_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whilePart1230);
            expr130=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr130.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, whilePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whilePart"


    public static class whileBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:239:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END133=null;
        ExprParser.whilePart_return whilePart131 =null;

        ExprParser.block_return block132 =null;


        CommonTree BLOCK_END133_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:239:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:240:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1239);
            whilePart131=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart131.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:241:2: ( block )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case COLON:
                case DOT:
                case EMPTY_CELL:
                case EMPTY_VEC:
                case END:
                case FOR:
                case ID:
                case IF:
                case INT:
                case MINUS:
                case NOT:
                case OPENB:
                case OPENC:
                case OPENP:
                case PLUS:
                case STRING_LITERAL:
                case SWITCH:
                case WHILE:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:241:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1242);
                    block132=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block132.getTree());

                    }
                    break;

            }


            BLOCK_END133=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END133);


            // AST REWRITE
            // elements: block, whilePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:243:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:243:28: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, whileBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileBlock"


    public static class blockPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock134 =null;

        ExprParser.switchBlock_return switchBlock135 =null;

        ExprParser.forBlock_return forBlock136 =null;

        ExprParser.whileBlock_return whileBlock137 =null;

        ExprParser.line_return line138 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt46=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt46=1;
                }
                break;
            case SWITCH:
                {
                alt46=2;
                }
                break;
            case FOR:
                {
                alt46=3;
                }
                break;
            case WHILE:
                {
                alt46=4;
                }
                break;
            case COLON:
            case DOT:
            case EMPTY_CELL:
            case EMPTY_VEC:
            case END:
            case ID:
            case INT:
            case MINUS:
            case NOT:
            case OPENB:
            case OPENC:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1269);
                    ifBlock134=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock134.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1273);
                    switchBlock135=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock135.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1277);
                    forBlock136=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock136.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1281);
                    whileBlock137=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock137.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1285);
                    line138=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line138.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, blockPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockPart"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart139 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:9: ( blockPart )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case IF:
                    {
                    alt47=1;
                    }
                    break;
                case SWITCH:
                    {
                    alt47=1;
                    }
                    break;
                case FOR:
                    {
                    alt47=1;
                    }
                    break;
                case WHILE:
                    {
                    alt47=1;
                    }
                    break;
                case EMPTY_VEC:
                    {
                    alt47=1;
                    }
                    break;
                case EMPTY_CELL:
                    {
                    alt47=1;
                    }
                    break;
                case OPENP:
                    {
                    alt47=1;
                    }
                    break;
                case STRING_LITERAL:
                    {
                    alt47=1;
                    }
                    break;
                case INT:
                    {
                    alt47=1;
                    }
                    break;
                case DOT:
                    {
                    alt47=1;
                    }
                    break;
                case ID:
                    {
                    alt47=1;
                    }
                    break;
                case END:
                    {
                    alt47=1;
                    }
                    break;
                case OPENB:
                    {
                    alt47=1;
                    }
                    break;
                case OPENC:
                    {
                    alt47=1;
                    }
                    break;
                case COLON:
                    {
                    alt47=1;
                    }
                    break;
                case PLUS:
                    {
                    alt47=1;
                    }
                    break;
                case MINUS:
                    {
                    alt47=1;
                    }
                    break;
                case NOT:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1293);
            	    blockPart139=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart139.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


            // AST REWRITE
            // elements: blockPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 247:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:247:23: ^( BLOCK ( blockPart )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                if ( !(stream_blockPart.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockPart.nextTree());

                }
                stream_blockPart.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"

    // $ANTLR start synpred2_Expr
    public final void synpred2_Expr_fragment() throws RecognitionException {
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:30: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:31: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred2_Expr931);
        term();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Expr933); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Expr

    // Delegated rules

    public final boolean synpred2_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_prog_in_start207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog220 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_expr_in_functionArgs241 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs244 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_functionArgs246 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_functionCall275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCall283 = new BitSet(new long[]{0x5090007000828000L,0x0000000000020107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure310 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure313 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure317 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure320 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term351 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_term354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_term356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_term372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_term375 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_in_term378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term385 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_in_term388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent445 = new BitSet(new long[]{0x0000000012000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent454 = new BitSet(new long[]{0x0090007000820000L,0x0000000000020007L});
    public static final BitSet FOLLOW_CARET_in_transponent459 = new BitSet(new long[]{0x0090007000820000L,0x0000000000020007L});
    public static final BitSet FOLLOW_term_in_transponent463 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent472 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent477 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_unary500 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_MINUS_in_unary505 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_NOT_in_unary510 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_transponent_in_unary515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult523 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult528 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult533 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult538 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_STAR_in_mult543 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_SLASH_in_mult548 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult553 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_unary_in_mult557 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_mult_in_add569 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_add574 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_MINUS_in_add579 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_mult_in_add583 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_colonEnd594 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_add_in_colonEnd596 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon615 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical646 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical651 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical656 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical661 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical666 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical671 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical676 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_colon_in_logical680 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd692 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd695 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_logical_in_eleAnd698 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr709 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr712 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr715 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd729 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_eleOr_in_scAnd732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_scAnd_in_scOr743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SC_OR_in_scOr746 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_scAnd_in_scOr749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_hCatVec772 = new BitSet(new long[]{0x50900070008A0002L,0x0000000000020107L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec776 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_hCatVec780 = new BitSet(new long[]{0x50900070008A0002L,0x0000000000020107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec803 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENB_in_vector825 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_vCatVec_in_vector828 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell838 = new BitSet(new long[]{0x50900070008A0002L,0x0000000000020107L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell842 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_hCatCell846 = new BitSet(new long[]{0x50900070008A0002L,0x0000000000020107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell869 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENC_in_cellArray892 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray895 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line939 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line941 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_line948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_line951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart970 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_ifPart973 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_ifPart975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart984 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_elseifPart989 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_elseifPart993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart1002 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_elsePart1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1018 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1028 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1039 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1108 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_switchPart1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1118 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_casePart1121 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_casePart1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1131 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1144 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1147 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1151 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1180 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1183 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1185 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_forPart1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1197 = new BitSet(new long[]{0x50B0047000820080L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_forBlock1200 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1227 = new BitSet(new long[]{0x5090007000820000L,0x0000000000020107L});
    public static final BitSet FOLLOW_expr_in_whilePart1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1239 = new BitSet(new long[]{0x50B0047000820080L,0x0000000001060107L});
    public static final BitSet FOLLOW_block_in_whileBlock1242 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1293 = new BitSet(new long[]{0x50B0047000820002L,0x0000000001060107L});
    public static final BitSet FOLLOW_term_in_synpred2_Expr931 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Expr933 = new BitSet(new long[]{0x0000000000000002L});

}