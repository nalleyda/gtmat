// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g 2012-01-27 19:39:00

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BACKSLASH", "BLOCK", "BLOCK_END", "BREAK", "CARET", "CASE", "CATCH", "CLASSDEF", "CLOSEB", "CLOSEC", "CLOSEP", "CLOSE_BLOCK", "COLON", "COLON_ARGS", "COMMA", "COMMENT", "CONTINUE", "DIGIT", "DOT", "DOT_BACKSLASH", "DOT_CARET", "DOT_SLASH", "DOT_STAR", "DOT_TRANSPOSE", "DOUBLE", "DOUBLE_QUOTE", "ELE_AND", "ELE_OR", "ELLIPSIS", "ELSE", "ELSEIF", "EMPTY_CELL", "EMPTY_VEC", "END", "EQUALS", "EXCLAMATION", "EXPONENT", "FOR", "FOR_LOOP", "FUNCTION", "FUNC_ARGS", "GLOBAL", "GREATER_EQUAL", "GREATER_EQUL", "GREATER_THAN", "HCAT_CELL", "HCAT_VEC", "ID", "IF", "IF_STAT", "ISEQUAL", "LESS_EQUAL", "LESS_THAN", "LETTER", "MINUS", "NEWLINE", "NOT", "NOT_EQUAL", "OPENB", "OPENC", "OPENP", "OPEN_BLOCK", "OTHERWISE", "PARFOR", "PERCENT", "PERSISTENT", "PLUS", "RETURN", "SC_AND", "SC_OR", "SEMI", "SINGLE_QUOTE", "SLASH", "SPMD", "STAR", "STRING_LITERAL", "SWITCH", "SWITCH_STAT", "TRY", "UNDERSCORE", "VCAT_CELL", "VCAT_VEC", "WHILE", "WHILE_LOOP", "WS"
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:75:1: start : prog EOF !;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:75:7: ( prog EOF !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:75:9: prog EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_prog_in_start204);
            prog1=prog();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prog1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start206); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:77:1: prog : ( block )+ ;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.block_return block3 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:77:7: ( ( block )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:77:9: ( block )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:77:9: ( block )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COLON||LA1_0==DOUBLE||(LA1_0 >= EMPTY_CELL && LA1_0 <= END)||LA1_0==FOR||(LA1_0 >= ID && LA1_0 <= IF)||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= OPENB && LA1_0 <= OPENP)||LA1_0==PLUS||(LA1_0 >= STRING_LITERAL && LA1_0 <= SWITCH)||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:77:9: block
            	    {
            	    pushFollow(FOLLOW_block_in_prog217);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs238);
            expr4=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr4.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:22: ( COMMA expr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:23: COMMA expr
            	    {
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionArgs241); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA5);


            	    pushFollow(FOLLOW_expr_in_functionArgs243);
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
            // 89:36: -> ^( FUNC_ARGS ( expr )* )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:89:51: ( expr )*
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:1: functionCall : ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) ;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:15: ( ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:17: ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:31: ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:32: ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_functionCall272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID7_tree = 
            (CommonTree)adaptor.create(ID7)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID7_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:91:36: ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPENP) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:18: OPENP ! ( functionArgs )? CLOSEP !
                    {
                    OPENP8=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall280); if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:25: ( functionArgs )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==COLON||LA3_0==DOUBLE||(LA3_0 >= EMPTY_CELL && LA3_0 <= END)||LA3_0==ID||LA3_0==MINUS||LA3_0==NOT||(LA3_0 >= OPENB && LA3_0 <= OPENP)||LA3_0==PLUS||LA3_0==STRING_LITERAL) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:92:25: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_functionCall283);
                            functionArgs9=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs9.getTree());

                            }
                            break;

                    }


                    CLOSEP10=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall286); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? ;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:25: ( functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:27: functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure307);
            functionCall11=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall11.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:40: ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DOT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:41: DOT ^ ( OPENP ! expr CLOSEP !| functionCall )
                    {
                    DOT12=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT12_tree = 
                    (CommonTree)adaptor.create(DOT12)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT12_tree, root_0);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:46: ( OPENP ! expr CLOSEP !| functionCall )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==OPENP) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==ID) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:47: OPENP ! expr CLOSEP !
                            {
                            OPENP13=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure314); if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_functionCallOrStructure317);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());

                            CLOSEP15=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure319); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:99:69: functionCall
                            {
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure324);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:104:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | DOUBLE | functionCallOrStructure | END | vector | cellArray | COLON );
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
        Token DOUBLE23=null;
        Token END25=null;
        Token COLON28=null;
        ExprParser.expr_return expr20 =null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure24 =null;

        ExprParser.vector_return vector26 =null;

        ExprParser.cellArray_return cellArray27 =null;


        CommonTree EMPTY_VEC17_tree=null;
        CommonTree EMPTY_CELL18_tree=null;
        CommonTree OPENP19_tree=null;
        CommonTree CLOSEP21_tree=null;
        CommonTree STRING_LITERAL22_tree=null;
        CommonTree DOUBLE23_tree=null;
        CommonTree END25_tree=null;
        CommonTree COLON28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:104:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | DOUBLE | functionCallOrStructure | END | vector | cellArray | COLON )
            int alt7=10;
            switch ( input.LA(1) ) {
            case EMPTY_VEC:
                {
                alt7=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt7=2;
                }
                break;
            case OPENP:
                {
                alt7=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt7=4;
                }
                break;
            case DOUBLE:
                {
                alt7=5;
                }
                break;
            case ID:
                {
                alt7=6;
                }
                break;
            case END:
                {
                alt7=7;
                }
                break;
            case OPENB:
                {
                alt7=8;
                }
                break;
            case OPENC:
                {
                alt7=9;
                }
                break;
            case COLON:
                {
                alt7=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:104:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_VEC17=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC17_tree = 
                    (CommonTree)adaptor.create(EMPTY_VEC17)
                    ;
                    adaptor.addChild(root_0, EMPTY_VEC17_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:105:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_CELL18=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL18_tree = 
                    (CommonTree)adaptor.create(EMPTY_CELL18)
                    ;
                    adaptor.addChild(root_0, EMPTY_CELL18_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:106:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP19=(Token)match(input,OPENP,FOLLOW_OPENP_in_term348); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term351);
                    expr20=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr20.getTree());

                    CLOSEP21=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term353); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:109:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL22=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL22_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL22)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL22_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:110:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE23=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_term368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE23_tree = 
                    (CommonTree)adaptor.create(DOUBLE23)
                    ;
                    adaptor.addChild(root_0, DOUBLE23_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:114:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCallOrStructure_in_term379);
                    functionCallOrStructure24=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure24.getTree());

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:115:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END25=(Token)match(input,END,FOLLOW_END_in_term385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END25_tree = 
                    (CommonTree)adaptor.create(END25)
                    ;
                    adaptor.addChild(root_0, END25_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:116:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vector_in_term390);
                    vector26=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector26.getTree());

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:117:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cellArray_in_term395);
                    cellArray27=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray27.getTree());

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:118:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON28=(Token)match(input,COLON,FOLLOW_COLON_in_term400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON28_tree = 
                    (CommonTree)adaptor.create(COLON28)
                    ;
                    adaptor.addChild(root_0, COLON28_tree);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:124:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET30=null;
        Token CARET31=null;
        Token SINGLE_QUOTE33=null;
        Token DOT_TRANSPOSE34=null;
        ExprParser.term_return term29 =null;

        ExprParser.term_return term32 =null;


        CommonTree DOT_CARET30_tree=null;
        CommonTree CARET31_tree=null;
        CommonTree SINGLE_QUOTE33_tree=null;
        CommonTree DOT_TRANSPOSE34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:130:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:130:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:130:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:130:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            pushFollow(FOLLOW_term_in_transponent422);
            term29=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term29.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:130:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt11=2;
            switch ( input.LA(1) ) {
            case CARET:
            case DOT_CARET:
                {
                alt11=1;
                }
                break;
            case DOT_STAR:
                {
                alt11=1;
                }
                break;
            case DOT_SLASH:
                {
                alt11=1;
                }
                break;
            case DOT_BACKSLASH:
                {
                alt11=1;
                }
                break;
            case STAR:
                {
                alt11=1;
                }
                break;
            case SLASH:
                {
                alt11=1;
                }
                break;
            case BACKSLASH:
                {
                alt11=1;
                }
                break;
            case PLUS:
                {
                alt11=1;
                }
                break;
            case MINUS:
                {
                alt11=1;
                }
                break;
            case LESS_THAN:
                {
                alt11=1;
                }
                break;
            case GREATER_THAN:
                {
                alt11=1;
                }
                break;
            case LESS_EQUAL:
                {
                alt11=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt11=1;
                }
                break;
            case ISEQUAL:
                {
                alt11=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt11=1;
                }
                break;
            case ELE_AND:
                {
                alt11=1;
                }
                break;
            case ELE_OR:
                {
                alt11=1;
                }
                break;
            case SC_AND:
                {
                alt11=1;
                }
                break;
            case SC_OR:
                {
                alt11=1;
                }
                break;
            case COMMA:
                {
                alt11=1;
                }
                break;
            case CLOSEP:
                {
                alt11=1;
                }
                break;
            case NOT:
                {
                alt11=1;
                }
                break;
            case EMPTY_VEC:
                {
                alt11=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt11=1;
                }
                break;
            case OPENP:
                {
                alt11=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt11=1;
                }
                break;
            case DOUBLE:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                alt11=1;
                }
                break;
            case END:
                {
                alt11=1;
                }
                break;
            case OPENB:
                {
                alt11=1;
                }
                break;
            case OPENC:
                {
                alt11=1;
                }
                break;
            case COLON:
                {
                alt11=1;
                }
                break;
            case SEMI:
                {
                alt11=1;
                }
                break;
            case CLOSEB:
                {
                alt11=1;
                }
                break;
            case CLOSEC:
                {
                alt11=1;
                }
                break;
            case EOF:
                {
                alt11=1;
                }
                break;
            case IF:
                {
                alt11=1;
                }
                break;
            case SWITCH:
                {
                alt11=1;
                }
                break;
            case FOR:
                {
                alt11=1;
                }
                break;
            case WHILE:
                {
                alt11=1;
                }
                break;
            case ELSEIF:
                {
                alt11=1;
                }
                break;
            case ELSE:
                {
                alt11=1;
                }
                break;
            case BLOCK_END:
                {
                alt11=1;
                }
                break;
            case OTHERWISE:
                {
                alt11=1;
                }
                break;
            case CASE:
                {
                alt11=1;
                }
                break;
            case DOT_TRANSPOSE:
            case SINGLE_QUOTE:
                {
                alt11=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:3: ( ( DOT_CARET ^| CARET ^) term )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==CARET||LA9_0==DOT_CARET) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:5: ( DOT_CARET ^| CARET ^)
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==DOT_CARET) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==CARET) ) {
                    	        alt8=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:6: DOT_CARET ^
                    	            {
                    	            DOT_CARET30=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent431); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET30_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET30)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET30_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:131:19: CARET ^
                    	            {
                    	            CARET31=(Token)match(input,CARET,FOLLOW_CARET_in_transponent436); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET31_tree = 
                    	            (CommonTree)adaptor.create(CARET31)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET31_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_term_in_transponent440);
                    	    term32=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==SINGLE_QUOTE) ) {
                            alt10=1;
                        }
                        else if ( (LA10_0==DOT_TRANSPOSE) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:6: SINGLE_QUOTE ^
                    	    {
                    	    SINGLE_QUOTE33=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent449); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE33_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE33)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE33_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:132:22: DOT_TRANSPOSE ^
                    	    {
                    	    DOT_TRANSPOSE34=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent454); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE34_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE34)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE34_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS35=null;
        Token MINUS36=null;
        Token NOT37=null;
        ExprParser.transponent_return transponent38 =null;


        CommonTree PLUS35_tree=null;
        CommonTree MINUS36_tree=null;
        CommonTree NOT37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:9: ( PLUS !| MINUS ^| NOT ^)*
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt12=1;
                    }
                    break;
                case MINUS:
                    {
                    alt12=2;
                    }
                    break;
                case NOT:
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:10: PLUS !
            	    {
            	    PLUS35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary477); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:18: MINUS ^
            	    {
            	    MINUS36=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary482); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS36_tree = 
            	    (CommonTree)adaptor.create(MINUS36)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS36_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:136:27: NOT ^
            	    {
            	    NOT37=(Token)match(input,NOT,FOLLOW_NOT_in_unary487); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT37_tree = 
            	    (CommonTree)adaptor.create(NOT37)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT37_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary492);
            transponent38=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent38.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR40=null;
        Token DOT_SLASH41=null;
        Token DOT_BACKSLASH42=null;
        Token STAR43=null;
        Token SLASH44=null;
        Token BACKSLASH45=null;
        ExprParser.unary_return unary39 =null;

        ExprParser.unary_return unary46 =null;


        CommonTree DOT_STAR40_tree=null;
        CommonTree DOT_SLASH41_tree=null;
        CommonTree DOT_BACKSLASH42_tree=null;
        CommonTree STAR43_tree=null;
        CommonTree SLASH44_tree=null;
        CommonTree BACKSLASH45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult500);
            unary39=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary39.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==BACKSLASH||LA14_0==DOT_BACKSLASH||(LA14_0 >= DOT_SLASH && LA14_0 <= DOT_STAR)||LA14_0==SLASH||LA14_0==STAR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt13=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt13=6;
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
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:17: DOT_STAR ^
            	            {
            	            DOT_STAR40=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult505); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR40_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR40)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:29: DOT_SLASH ^
            	            {
            	            DOT_SLASH41=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult510); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH41_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH41)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:42: DOT_BACKSLASH ^
            	            {
            	            DOT_BACKSLASH42=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH42_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH42)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH42_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:59: STAR ^
            	            {
            	            STAR43=(Token)match(input,STAR,FOLLOW_STAR_in_mult520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR43_tree = 
            	            (CommonTree)adaptor.create(STAR43)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR43_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:67: SLASH ^
            	            {
            	            SLASH44=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult525); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH44_tree = 
            	            (CommonTree)adaptor.create(SLASH44)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH44_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:138:76: BACKSLASH ^
            	            {
            	            BACKSLASH45=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult530); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH45_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH45_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult534);
            	    unary46=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary46.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS48=null;
        Token MINUS49=null;
        ExprParser.mult_return mult47 =null;

        ExprParser.mult_return mult50 =null;


        CommonTree PLUS48_tree=null;
        CommonTree MINUS49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add546);
            mult47=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult47.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:12: ( ( PLUS ^| MINUS ^) mult )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PLUS) ) {
                    alt16=1;
                }
                else if ( (LA16_0==MINUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:14: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:15: PLUS ^
            	            {
            	            PLUS48=(Token)match(input,PLUS,FOLLOW_PLUS_in_add551); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS48_tree = 
            	            (CommonTree)adaptor.create(PLUS48)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:140:23: MINUS ^
            	            {
            	            MINUS49=(Token)match(input,MINUS,FOLLOW_MINUS_in_add556); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS49_tree = 
            	            (CommonTree)adaptor.create(MINUS49)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS49_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add560);
            	    mult50=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult50.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON51=null;
        ExprParser.add_return add52 =null;


        CommonTree COLON51_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:11: ( COLON add )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COLON) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:12: COLON add
            	    {
            	    COLON51=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd571); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON51);


            	    pushFollow(FOLLOW_add_in_colonEnd573);
            	    add52=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add52.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // 142:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:142:27: ^( COLON_ARGS ( add )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:144:1: colon : add ( colonEnd ^)? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.add_return add53 =null;

        ExprParser.colonEnd_return colonEnd54 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:144:7: ( add ( colonEnd ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:144:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_colon592);
            add53=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add53.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:144:13: ( colonEnd ^)?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COLON) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:144:14: colonEnd ^
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon595);
                    colonEnd54=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd54.getTree(), root_0);

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN56=null;
        Token GREATER_THAN57=null;
        Token LESS_EQUAL58=null;
        Token GREATER_EQUAL59=null;
        Token ISEQUAL60=null;
        Token NOT_EQUAL61=null;
        ExprParser.colon_return colon55 =null;

        ExprParser.colon_return colon62 =null;


        CommonTree LESS_THAN56_tree=null;
        CommonTree GREATER_THAN57_tree=null;
        CommonTree LESS_EQUAL58_tree=null;
        CommonTree GREATER_EQUAL59_tree=null;
        CommonTree ISEQUAL60_tree=null;
        CommonTree NOT_EQUAL61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_logical623);
            colon55=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon55.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==GREATER_EQUAL||LA20_0==GREATER_THAN||(LA20_0 >= ISEQUAL && LA20_0 <= LESS_THAN)||LA20_0==NOT_EQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt19=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt19=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:20: LESS_THAN ^
            	            {
            	            LESS_THAN56=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical628); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN56_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN56)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN56_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:33: GREATER_THAN ^
            	            {
            	            GREATER_THAN57=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical633); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN57_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN57)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN57_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:49: LESS_EQUAL ^
            	            {
            	            LESS_EQUAL58=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical638); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL58_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL58)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:63: GREATER_EQUAL ^
            	            {
            	            GREATER_EQUAL59=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical643); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL59_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL59)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:80: ISEQUAL ^
            	            {
            	            ISEQUAL60=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical648); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL60_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL60)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:155:91: NOT_EQUAL ^
            	            {
            	            NOT_EQUAL61=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL61_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL61)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_logical657);
            	    colon62=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon62.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:157:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND64=null;
        ExprParser.logical_return logical63 =null;

        ExprParser.logical_return logical65 =null;


        CommonTree ELE_AND64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:157:8: ( logical ( ELE_AND ^ logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:157:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logical_in_eleAnd669);
            logical63=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical63.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:157:18: ( ELE_AND ^ logical )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ELE_AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:157:19: ELE_AND ^ logical
            	    {
            	    ELE_AND64=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd672); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND64_tree = 
            	    (CommonTree)adaptor.create(ELE_AND64)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND64_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_in_eleAnd675);
            	    logical65=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical65.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:159:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR67=null;
        ExprParser.eleAnd_return eleAnd66 =null;

        ExprParser.eleAnd_return eleAnd68 =null;


        CommonTree ELE_OR67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:159:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:159:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr686);
            eleAnd66=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd66.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:159:16: ( ELE_OR ^ eleAnd )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELE_OR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:159:17: ELE_OR ^ eleAnd
            	    {
            	    ELE_OR67=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr689); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR67_tree = 
            	    (CommonTree)adaptor.create(ELE_OR67)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR67_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleAnd_in_eleOr692);
            	    eleAnd68=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd68.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:161:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND70=null;
        ExprParser.eleOr_return eleOr69 =null;

        ExprParser.eleOr_return eleOr71 =null;


        CommonTree SC_AND70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:161:7: ( eleOr ( SC_AND ^ eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:161:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd703);
            eleOr69=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr69.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:161:15: ( SC_AND ^ eleOr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==SC_AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:161:16: SC_AND ^ eleOr
            	    {
            	    SC_AND70=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd706); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND70_tree = 
            	    (CommonTree)adaptor.create(SC_AND70)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND70_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleOr_in_scAnd709);
            	    eleOr71=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr71.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:163:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR73=null;
        ExprParser.scAnd_return scAnd72 =null;

        ExprParser.scAnd_return scAnd74 =null;


        CommonTree SC_OR73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:163:6: ( scAnd ( SC_OR ^ scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:163:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr720);
            scAnd72=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd72.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:163:14: ( SC_OR ^ scAnd )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SC_OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:163:15: SC_OR ^ scAnd
            	    {
            	    SC_OR73=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr723); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR73_tree = 
            	    (CommonTree)adaptor.create(SC_OR73)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR73_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_scAnd_in_scOr726);
            	    scAnd74=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd74.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA76=null;
        ExprParser.expr_return expr75 =null;

        ExprParser.expr_return expr77 =null;


        CommonTree COMMA76_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec749);
            expr75=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr75.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:16: ( ( COMMA )? expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COLON||LA26_0==COMMA||LA26_0==DOUBLE||(LA26_0 >= EMPTY_CELL && LA26_0 <= END)||LA26_0==ID||LA26_0==MINUS||LA26_0==NOT||(LA26_0 >= OPENB && LA26_0 <= OPENP)||LA26_0==PLUS||LA26_0==STRING_LITERAL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:17: ( COMMA )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==COMMA) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:18: COMMA
            	            {
            	            COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec753); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatVec757);
            	    expr77=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr77.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // 177:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:177:36: ^( HCAT_VEC ( expr )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI79=null;
        ExprParser.hCatVec_return hCatVec78 =null;

        ExprParser.hCatVec_return hCatVec80 =null;


        CommonTree SEMI79_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec776);
            hCatVec78=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec78.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:19: ( ( SEMI ) hCatVec )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==SEMI) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:21: SEMI
            	    {
            	    SEMI79=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec780); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI79);


            	    }


            	    pushFollow(FOLLOW_hCatVec_in_vCatVec783);
            	    hCatVec80=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec80.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 179:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:179:40: ^( VCAT_VEC ( hCatVec )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:181:1: vector : OPENB ! vCatVec CLOSEB !;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB81=null;
        Token CLOSEB83=null;
        ExprParser.vCatVec_return vCatVec82 =null;


        CommonTree OPENB81_tree=null;
        CommonTree CLOSEB83_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:181:8: ( OPENB ! vCatVec CLOSEB !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:181:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENB81=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector802); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatVec_in_vector805);
            vCatVec82=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec82.getTree());

            CLOSEB83=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector807); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA85=null;
        ExprParser.expr_return expr84 =null;

        ExprParser.expr_return expr86 =null;


        CommonTree COMMA85_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell815);
            expr84=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr84.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:16: ( ( COMMA )? expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COLON||LA29_0==COMMA||LA29_0==DOUBLE||(LA29_0 >= EMPTY_CELL && LA29_0 <= END)||LA29_0==ID||LA29_0==MINUS||LA29_0==NOT||(LA29_0 >= OPENB && LA29_0 <= OPENP)||LA29_0==PLUS||LA29_0==STRING_LITERAL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:17: ( COMMA )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==COMMA) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:18: COMMA
            	            {
            	            COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell819); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatCell823);
            	    expr86=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr86.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // 183:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:183:37: ^( HCAT_CELL ( expr )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI88=null;
        ExprParser.hCatCell_return hCatCell87 =null;

        ExprParser.hCatCell_return hCatCell89 =null;


        CommonTree SEMI88_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell842);
            hCatCell87=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell87.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:20: ( ( SEMI ) ! hCatCell )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SEMI) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:21: ( SEMI ) ! hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:22: SEMI
            	    {
            	    SEMI88=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell846); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI88);


            	    }


            	    pushFollow(FOLLOW_hCatCell_in_vCatCell850);
            	    hCatCell89=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell89.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 185:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:185:43: ^( VCAT_CELL ( hCatCell )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:187:1: cellArray : OPENC ! vCatCell CLOSEC !;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC90=null;
        Token CLOSEC92=null;
        ExprParser.vCatCell_return vCatCell91 =null;


        CommonTree OPENC90_tree=null;
        CommonTree CLOSEC92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:187:11: ( OPENC ! vCatCell CLOSEC !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:187:13: OPENC ! vCatCell CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENC90=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray869); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatCell_in_cellArray872);
            vCatCell91=vCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell91.getTree());

            CLOSEC92=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray874); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:189:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.scOr_return scOr93 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:189:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:189:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scOr_in_expr887);
            scOr93=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr93.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS95=null;
        Token SEMI97=null;
        ExprParser.term_return term94 =null;

        ExprParser.expr_return expr96 =null;


        CommonTree EQUALS95_tree=null;
        CommonTree SEMI97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:29: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:29: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA31_1 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case DOUBLE:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA31_7 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA31_8 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA31_9 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA31_10 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt31=1;
                    }
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:30: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:47: ( term EQUALS ^)
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:48: term EQUALS ^
                    {
                    pushFollow(FOLLOW_term_in_line916);
                    term94=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term94.getTree());

                    EQUALS95=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS95_tree = 
                    (CommonTree)adaptor.create(EQUALS95)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS95_tree, root_0);
                    }

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_line925);
            expr96=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr96.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:7: ( SEMI !)?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SEMI) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:198:8: SEMI !
                    {
                    SEMI97=(Token)match(input,SEMI,FOLLOW_SEMI_in_line928); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:205:1: ifPart : IF ^ expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF98=null;
        ExprParser.expr_return expr99 =null;

        ExprParser.block_return block100 =null;


        CommonTree IF98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:205:8: ( IF ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:205:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF98=(Token)match(input,IF,FOLLOW_IF_in_ifPart947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF98_tree = 
            (CommonTree)adaptor.create(IF98)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF98_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifPart950);
            expr99=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr99.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:205:19: ( block )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==COLON||LA33_0==DOUBLE||(LA33_0 >= EMPTY_CELL && LA33_0 <= END)||LA33_0==FOR||(LA33_0 >= ID && LA33_0 <= IF)||LA33_0==MINUS||LA33_0==NOT||(LA33_0 >= OPENB && LA33_0 <= OPENP)||LA33_0==PLUS||(LA33_0 >= STRING_LITERAL && LA33_0 <= SWITCH)||LA33_0==WHILE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:205:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart952);
                    block100=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block100.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF101=null;
        ExprParser.expr_return e2 =null;

        ExprParser.block_return b2 =null;


        CommonTree ELSEIF101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:14: ( ELSEIF ^e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:15: ELSEIF ^e2= expr (b2= block )?
            {
            ELSEIF101=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF101_tree = 
            (CommonTree)adaptor.create(ELSEIF101)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF101_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_elseifPart966);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:33: (b2= block )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COLON||LA34_0==DOUBLE||(LA34_0 >= EMPTY_CELL && LA34_0 <= END)||LA34_0==FOR||(LA34_0 >= ID && LA34_0 <= IF)||LA34_0==MINUS||LA34_0==NOT||(LA34_0 >= OPENB && LA34_0 <= OPENP)||LA34_0==PLUS||(LA34_0 >= STRING_LITERAL && LA34_0 <= SWITCH)||LA34_0==WHILE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:206:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart970);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE102=null;
        ExprParser.block_return b3 =null;


        CommonTree ELSE102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:10: ( ( ELSE ^ (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:11: ( ELSE ^ (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:12: ELSE ^ (b3= block )?
            {
            ELSE102=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE102_tree = 
            (CommonTree)adaptor.create(ELSE102)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE102_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:20: (b3= block )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==COLON||LA35_0==DOUBLE||(LA35_0 >= EMPTY_CELL && LA35_0 <= END)||LA35_0==FOR||(LA35_0 >= ID && LA35_0 <= IF)||LA35_0==MINUS||LA35_0==NOT||(LA35_0 >= OPENB && LA35_0 <= OPENP)||LA35_0==PLUS||(LA35_0 >= STRING_LITERAL && LA35_0 <= SWITCH)||LA35_0==WHILE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:207:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart984);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END106=null;
        ExprParser.ifPart_return ifPart103 =null;

        ExprParser.elseifPart_return elseifPart104 =null;

        ExprParser.elsePart_return elsePart105 =null;


        CommonTree BLOCK_END106_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:208:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:209:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock995);
            ifPart103=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart103.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:210:9: ( elseifPart )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ELSEIF) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:210:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1005);
            	    elseifPart104=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart104.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:211:9: ( elsePart )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ELSE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:211:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1016);
                    elsePart105=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart105.getTree());

                    }
                    break;

            }


            BLOCK_END106=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END106);


            // AST REWRITE
            // elements: elseifPart, ifPart, elsePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 213:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:213:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:213:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:213:41: ( elsePart )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:218:1: switchPart : SWITCH ^ expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH107=null;
        ExprParser.expr_return expr108 =null;


        CommonTree SWITCH107_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:218:12: ( SWITCH ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:218:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH107=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1085); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH107_tree = 
            (CommonTree)adaptor.create(SWITCH107)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH107_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_switchPart1088);
            expr108=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr108.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:1: casePart : CASE ^ expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE109=null;
        ExprParser.expr_return expr110 =null;

        ExprParser.block_return block111 =null;


        CommonTree CASE109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:10: ( CASE ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE109=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE109_tree = 
            (CommonTree)adaptor.create(CASE109)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE109_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_casePart1098);
            expr110=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:23: ( block )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON||LA38_0==DOUBLE||(LA38_0 >= EMPTY_CELL && LA38_0 <= END)||LA38_0==FOR||(LA38_0 >= ID && LA38_0 <= IF)||LA38_0==MINUS||LA38_0==NOT||(LA38_0 >= OPENB && LA38_0 <= OPENP)||LA38_0==PLUS||(LA38_0 >= STRING_LITERAL && LA38_0 <= SWITCH)||LA38_0==WHILE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:219:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1100);
                    block111=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block111.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE112=null;
        ExprParser.block_return block113 =null;


        CommonTree OTHERWISE112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:16: ( OTHERWISE ^ ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE112=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE112_tree = 
            (CommonTree)adaptor.create(OTHERWISE112)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE112_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:29: ( block )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLON||LA39_0==DOUBLE||(LA39_0 >= EMPTY_CELL && LA39_0 <= END)||LA39_0==FOR||(LA39_0 >= ID && LA39_0 <= IF)||LA39_0==MINUS||LA39_0==NOT||(LA39_0 >= OPENB && LA39_0 <= OPENP)||LA39_0==PLUS||(LA39_0 >= STRING_LITERAL && LA39_0 <= SWITCH)||LA39_0==WHILE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:220:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1111);
                    block113=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block113.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END117=null;
        ExprParser.switchPart_return switchPart114 =null;

        ExprParser.casePart_return casePart115 =null;

        ExprParser.otherwiseBlock_return otherwiseBlock116 =null;


        CommonTree BLOCK_END117_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:221:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:222:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1121);
            switchPart114=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart114.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:223:2: ( casePart )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==CASE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:223:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1124);
            	    casePart115=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart115.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:224:2: ( otherwiseBlock )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==OTHERWISE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:224:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1128);
                    otherwiseBlock116=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock116.getTree());

                    }
                    break;

            }


            BLOCK_END117=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END117);


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
            // 226:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:226:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:226:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:226:40: ( otherwiseBlock )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:229:1: forPart : FOR ^ ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR118=null;
        Token ID119=null;
        Token EQUALS120=null;
        ExprParser.expr_return expr121 =null;


        CommonTree FOR118_tree=null;
        CommonTree ID119_tree=null;
        CommonTree EQUALS120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:229:9: ( FOR ^ ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:229:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR118=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR118_tree = 
            (CommonTree)adaptor.create(FOR118)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR118_tree, root_0);
            }

            ID119=(Token)match(input,ID,FOLLOW_ID_in_forPart1160); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID119_tree = 
            (CommonTree)adaptor.create(ID119)
            ;
            adaptor.addChild(root_0, ID119_tree);
            }

            EQUALS120=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS120_tree = 
            (CommonTree)adaptor.create(EQUALS120)
            ;
            adaptor.addChild(root_0, EQUALS120_tree);
            }

            pushFollow(FOLLOW_expr_in_forPart1164);
            expr121=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr121.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:230:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END124=null;
        ExprParser.forPart_return forPart122 =null;

        ExprParser.block_return block123 =null;


        CommonTree BLOCK_END124_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:230:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:231:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1174);
            forPart122=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart122.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:232:2: ( block )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==COLON||LA42_0==DOUBLE||(LA42_0 >= EMPTY_CELL && LA42_0 <= END)||LA42_0==FOR||(LA42_0 >= ID && LA42_0 <= IF)||LA42_0==MINUS||LA42_0==NOT||(LA42_0 >= OPENB && LA42_0 <= OPENP)||LA42_0==PLUS||(LA42_0 >= STRING_LITERAL && LA42_0 <= SWITCH)||LA42_0==WHILE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:232:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1177);
                    block123=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block123.getTree());

                    }
                    break;

            }


            BLOCK_END124=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END124);


            // AST REWRITE
            // elements: forPart, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:234:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:234:24: ( block )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:237:1: whilePart : WHILE ^ expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE125=null;
        ExprParser.expr_return expr126 =null;


        CommonTree WHILE125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:237:11: ( WHILE ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:237:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE125_tree = 
            (CommonTree)adaptor.create(WHILE125)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE125_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whilePart1207);
            expr126=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr126.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:238:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END129=null;
        ExprParser.whilePart_return whilePart127 =null;

        ExprParser.block_return block128 =null;


        CommonTree BLOCK_END129_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:238:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:239:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1216);
            whilePart127=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart127.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:240:2: ( block )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COLON||LA43_0==DOUBLE||(LA43_0 >= EMPTY_CELL && LA43_0 <= END)||LA43_0==FOR||(LA43_0 >= ID && LA43_0 <= IF)||LA43_0==MINUS||LA43_0==NOT||(LA43_0 >= OPENB && LA43_0 <= OPENP)||LA43_0==PLUS||(LA43_0 >= STRING_LITERAL && LA43_0 <= SWITCH)||LA43_0==WHILE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:240:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1219);
                    block128=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block128.getTree());

                    }
                    break;

            }


            BLOCK_END129=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END129);


            // AST REWRITE
            // elements: whilePart, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:242:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:242:28: ( block )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock130 =null;

        ExprParser.switchBlock_return switchBlock131 =null;

        ExprParser.forBlock_return forBlock132 =null;

        ExprParser.whileBlock_return whileBlock133 =null;

        ExprParser.line_return line134 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt44=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt44=1;
                }
                break;
            case SWITCH:
                {
                alt44=2;
                }
                break;
            case FOR:
                {
                alt44=3;
                }
                break;
            case WHILE:
                {
                alt44=4;
                }
                break;
            case COLON:
            case DOUBLE:
            case EMPTY_CELL:
            case EMPTY_VEC:
            case END:
            case ID:
            case MINUS:
            case NOT:
            case OPENB:
            case OPENC:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1246);
                    ifBlock130=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock130.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1250);
                    switchBlock131=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock131.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1254);
                    forBlock132=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock132.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1258);
                    whileBlock133=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock133.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:245:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1262);
                    line134=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line134.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart135 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:9: ( blockPart )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case IF:
                    {
                    alt45=1;
                    }
                    break;
                case SWITCH:
                    {
                    alt45=1;
                    }
                    break;
                case FOR:
                    {
                    alt45=1;
                    }
                    break;
                case WHILE:
                    {
                    alt45=1;
                    }
                    break;
                case EMPTY_VEC:
                    {
                    alt45=1;
                    }
                    break;
                case EMPTY_CELL:
                    {
                    alt45=1;
                    }
                    break;
                case OPENP:
                    {
                    alt45=1;
                    }
                    break;
                case STRING_LITERAL:
                    {
                    alt45=1;
                    }
                    break;
                case DOUBLE:
                    {
                    alt45=1;
                    }
                    break;
                case ID:
                    {
                    alt45=1;
                    }
                    break;
                case END:
                    {
                    alt45=1;
                    }
                    break;
                case OPENB:
                    {
                    alt45=1;
                    }
                    break;
                case OPENC:
                    {
                    alt45=1;
                    }
                    break;
                case COLON:
                    {
                    alt45=1;
                    }
                    break;
                case PLUS:
                    {
                    alt45=1;
                    }
                    break;
                case MINUS:
                    {
                    alt45=1;
                    }
                    break;
                case NOT:
                    {
                    alt45=1;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1270);
            	    blockPart135=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart135.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
            // 246:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:246:23: ^( BLOCK ( blockPart )+ )
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
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:30: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Expr.g:197:31: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred2_Expr908);
        term();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Expr910); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_prog_in_start204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog217 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_expr_in_functionArgs238 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs241 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_functionArgs243 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_functionCall272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_functionCall280 = new BitSet(new long[]{0xA810007020028000L,0x0000000000010083L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure307 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure310 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure314 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term348 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_term351 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_term353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_term368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent422 = new BitSet(new long[]{0x0000000012000202L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent431 = new BitSet(new long[]{0x8010007020020000L,0x0000000000010003L});
    public static final BitSet FOLLOW_CARET_in_transponent436 = new BitSet(new long[]{0x8010007020020000L,0x0000000000010003L});
    public static final BitSet FOLLOW_term_in_transponent440 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent449 = new BitSet(new long[]{0x0000000010000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent454 = new BitSet(new long[]{0x0000000010000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_PLUS_in_unary477 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_MINUS_in_unary482 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_NOT_in_unary487 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_transponent_in_unary492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult500 = new BitSet(new long[]{0x000000000D000022L,0x000000000000A000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult505 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult510 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult515 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_STAR_in_mult520 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_SLASH_in_mult525 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult530 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_unary_in_mult534 = new BitSet(new long[]{0x000000000D000022L,0x000000000000A000L});
    public static final BitSet FOLLOW_mult_in_add546 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_PLUS_in_add551 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_MINUS_in_add556 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_mult_in_add560 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_colonEnd571 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_add_in_colonEnd573 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon592 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical623 = new BitSet(new long[]{0x4382800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical628 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical633 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical638 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical643 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical648 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical653 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_colon_in_logical657 = new BitSet(new long[]{0x4382800000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd669 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd672 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_logical_in_eleAnd675 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr686 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr689 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr692 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd706 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_eleOr_in_scAnd709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_scAnd_in_scOr720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_OR_in_scOr723 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_scAnd_in_scOr726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_expr_in_hCatVec749 = new BitSet(new long[]{0xA8100070200A0002L,0x0000000000010083L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec753 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_hCatVec757 = new BitSet(new long[]{0xA8100070200A0002L,0x0000000000010083L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec780 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_OPENB_in_vector802 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_vCatVec_in_vector805 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell815 = new BitSet(new long[]{0xA8100070200A0002L,0x0000000000010083L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell819 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_hCatCell823 = new BitSet(new long[]{0xA8100070200A0002L,0x0000000000010083L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell846 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_OPENC_in_cellArray869 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line916 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line918 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_line925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_line928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart947 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_ifPart950 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_ifPart952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart961 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_elseifPart966 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_elseifPart970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart979 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_elsePart984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock995 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1005 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1016 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1085 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_switchPart1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1095 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_casePart1098 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_casePart1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1108 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1121 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000008L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1124 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000008L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1128 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1157 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1160 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1162 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_forPart1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1174 = new BitSet(new long[]{0xA830047020020080L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_forBlock1177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1204 = new BitSet(new long[]{0xA810007020020000L,0x0000000000010083L});
    public static final BitSet FOLLOW_expr_in_whilePart1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1216 = new BitSet(new long[]{0xA830047020020080L,0x0000000000830083L});
    public static final BitSet FOLLOW_block_in_whileBlock1219 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1270 = new BitSet(new long[]{0xA830047020020002L,0x0000000000830083L});
    public static final BitSet FOLLOW_term_in_synpred2_Expr908 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Expr910 = new BitSet(new long[]{0x0000000000000002L});

}