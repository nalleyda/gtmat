// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g 2012-03-22 21:26:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BACKSLASH", "BLOCK", "BLOCK_END", "BREAK", "CARET", "CASE", "CATCH", "CLASSDEF", "CLOSEB", "CLOSEC", "CLOSEP", "CLOSE_BLOCK", "COLON", "COLON_ARGS", "COMMA", "COMMENT", "CONTINUE", "DIGIT", "DOT", "DOT_BACKSLASH", "DOT_CARET", "DOT_SLASH", "DOT_STAR", "DOT_TRANSPOSE", "DOUBLE_QUOTE", "ELE_AND", "ELE_OR", "ELLIPSIS", "ELSE", "ELSEIF", "EMPTY_CELL", "EMPTY_VEC", "END", "EQUALS", "EXCLAMATION", "EXPONENT", "FALSE", "FOR", "FOR_LOOP", "FUNCTION", "FUNC_ARGS", "GLOBAL", "GREATER_EQUAL", "GREATER_EQUL", "GREATER_THAN", "HCAT_CELL", "HCAT_VEC", "ID", "IF", "IF_STAT", "INTEGER", "ISEQUAL", "LESS_EQUAL", "LESS_THAN", "LETTER", "MINUS", "NEWLINE", "NOT", "NOT_EQUAL", "OPENB", "OPENC", "OPENP", "OPEN_BLOCK", "OTHERWISE", "PARFOR", "PERCENT", "PERSISTENT", "PLUS", "RETURN", "SC_AND", "SC_OR", "SEMI", "SINGLE_QUOTE", "SLASH", "SPMD", "STAR", "STRING_LITERAL", "SWITCH", "SWITCH_STAT", "TRUE", "TRY", "UNDERSCORE", "VCAT_CELL", "VCAT_VEC", "WHILE", "WHILE_LOOP", "WS"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[42+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:75:1: start : prog EOF !;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:75:7: ( prog EOF !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:75:9: prog EOF !
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:1: prog : ( ( block )+ | ( functionHeader ! ( block )* ( BLOCK_END !)? ) );
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END6=null;
        ExprParser.block_return block3 =null;

        ExprParser.functionHeader_return functionHeader4 =null;

        ExprParser.block_return block5 =null;


        CommonTree BLOCK_END6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:7: ( ( block )+ | ( functionHeader ! ( block )* ( BLOCK_END !)? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==COLON||LA4_0==DOT||(LA4_0 >= EMPTY_CELL && LA4_0 <= END)||(LA4_0 >= FALSE && LA4_0 <= FOR)||(LA4_0 >= ID && LA4_0 <= IF)||LA4_0==INTEGER||LA4_0==MINUS||LA4_0==NOT||(LA4_0 >= OPENB && LA4_0 <= OPENP)||LA4_0==PLUS||(LA4_0 >= STRING_LITERAL && LA4_0 <= SWITCH)||LA4_0==TRUE||LA4_0==WHILE) ) {
                alt4=1;
            }
            else if ( (LA4_0==FUNCTION) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:9: ( block )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:9: ( block )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COLON||LA1_0==DOT||(LA1_0 >= EMPTY_CELL && LA1_0 <= END)||(LA1_0 >= FALSE && LA1_0 <= FOR)||(LA1_0 >= ID && LA1_0 <= IF)||LA1_0==INTEGER||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= OPENB && LA1_0 <= OPENP)||LA1_0==PLUS||(LA1_0 >= STRING_LITERAL && LA1_0 <= SWITCH)||LA1_0==TRUE||LA1_0==WHILE) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:9: block
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
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:18: ( functionHeader ! ( block )* ( BLOCK_END !)? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:18: ( functionHeader ! ( block )* ( BLOCK_END !)? )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:19: functionHeader ! ( block )* ( BLOCK_END !)?
                    {
                    pushFollow(FOLLOW_functionHeader_in_prog223);
                    functionHeader4=functionHeader();

                    state._fsp--;
                    if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:35: ( block )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==COLON||LA2_0==DOT||(LA2_0 >= EMPTY_CELL && LA2_0 <= END)||(LA2_0 >= FALSE && LA2_0 <= FOR)||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==INTEGER||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= OPENB && LA2_0 <= OPENP)||LA2_0==PLUS||(LA2_0 >= STRING_LITERAL && LA2_0 <= SWITCH)||LA2_0==TRUE||LA2_0==WHILE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:35: block
                    	    {
                    	    pushFollow(FOLLOW_block_in_prog226);
                    	    block5=block();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, block5.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:42: ( BLOCK_END !)?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BLOCK_END) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:77:43: BLOCK_END !
                            {
                            BLOCK_END6=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_prog230); if (state.failed) return retval;

                            }
                            break;

                    }


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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
    public final ExprParser.functionArgs_return functionArgs() throws RecognitionException {
        ExprParser.functionArgs_return retval = new ExprParser.functionArgs_return();
        retval.start = input.LT(1);

        int functionArgs_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA8=null;
        ExprParser.expr_return expr7 =null;

        ExprParser.expr_return expr9 =null;


        CommonTree COMMA8_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs254);
            expr7=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:22: ( COMMA expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:23: COMMA expr
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionArgs257); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);


            	    pushFollow(FOLLOW_expr_in_functionArgs259);
            	    expr9=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr9.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:89:51: ( expr )*
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:1: functionCall : ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) ;
    public final ExprParser.functionCall_return functionCall() throws RecognitionException {
        ExprParser.functionCall_return retval = new ExprParser.functionCall_return();
        retval.start = input.LT(1);

        int functionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID10=null;
        Token OPENP11=null;
        Token CLOSEP13=null;
        ExprParser.functionArgs_return functionArgs12 =null;


        CommonTree ID10_tree=null;
        CommonTree OPENP11_tree=null;
        CommonTree CLOSEP13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:15: ( ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:17: ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:31: ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:32: ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_functionCall288); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID10_tree = 
            (CommonTree)adaptor.create(ID10)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID10_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:91:36: ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==OPENP) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:92:18: OPENP ! ( functionArgs )? CLOSEP !
                    {
                    OPENP11=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall296); if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:92:25: ( functionArgs )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COLON||LA6_0==DOT||(LA6_0 >= EMPTY_CELL && LA6_0 <= END)||LA6_0==FALSE||LA6_0==ID||LA6_0==INTEGER||LA6_0==MINUS||LA6_0==NOT||(LA6_0 >= OPENB && LA6_0 <= OPENP)||LA6_0==PLUS||LA6_0==STRING_LITERAL||LA6_0==TRUE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:92:25: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_functionCall299);
                            functionArgs12=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs12.getTree());

                            }
                            break;

                    }


                    CLOSEP13=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall302); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? ;
    public final ExprParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        ExprParser.functionCallOrStructure_return retval = new ExprParser.functionCallOrStructure_return();
        retval.start = input.LT(1);

        int functionCallOrStructure_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT15=null;
        Token OPENP16=null;
        Token CLOSEP18=null;
        ExprParser.functionCall_return functionCall14 =null;

        ExprParser.expr_return expr17 =null;

        ExprParser.functionCall_return functionCall19 =null;


        CommonTree DOT15_tree=null;
        CommonTree OPENP16_tree=null;
        CommonTree CLOSEP18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:25: ( functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:27: functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure323);
            functionCall14=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall14.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:40: ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==ID||LA9_1==OPENP) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:41: DOT ^ ( OPENP ! expr CLOSEP !| functionCall )
                    {
                    DOT15=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT15_tree = 
                    (CommonTree)adaptor.create(DOT15)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT15_tree, root_0);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:46: ( OPENP ! expr CLOSEP !| functionCall )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==OPENP) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==ID) ) {
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
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:47: OPENP ! expr CLOSEP !
                            {
                            OPENP16=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure330); if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_functionCallOrStructure333);
                            expr17=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr17.getTree());

                            CLOSEP18=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure335); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:99:69: functionCall
                            {
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure340);
                            functionCall19=functionCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall19.getTree());

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


    public static class functionHeader_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionHeader"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:102:1: functionHeader : FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? ;
    public final ExprParser.functionHeader_return functionHeader() throws RecognitionException {
        ExprParser.functionHeader_return retval = new ExprParser.functionHeader_return();
        retval.start = input.LT(1);

        int functionHeader_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FUNCTION20=null;
        Token OPENB21=null;
        Token ID22=null;
        Token COMMA23=null;
        Token ID24=null;
        Token CLOSEB25=null;
        Token ID26=null;
        Token EQUALS27=null;
        Token ID28=null;
        Token OPENP29=null;
        Token ID30=null;
        Token COMMA31=null;
        Token ID32=null;
        Token CLOSEP33=null;

        CommonTree FUNCTION20_tree=null;
        CommonTree OPENB21_tree=null;
        CommonTree ID22_tree=null;
        CommonTree COMMA23_tree=null;
        CommonTree ID24_tree=null;
        CommonTree CLOSEB25_tree=null;
        CommonTree ID26_tree=null;
        CommonTree EQUALS27_tree=null;
        CommonTree ID28_tree=null;
        CommonTree OPENP29_tree=null;
        CommonTree ID30_tree=null;
        CommonTree COMMA31_tree=null;
        CommonTree ID32_tree=null;
        CommonTree CLOSEP33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:102:16: ( FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:102:18: FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            {
            root_0 = (CommonTree)adaptor.nil();


            FUNCTION20=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionHeader352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION20_tree = 
            (CommonTree)adaptor.create(FUNCTION20)
            ;
            adaptor.addChild(root_0, FUNCTION20_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:103:3: ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUALS||LA14_0==OPENB) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==EQUALS) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )?
                    int alt13=3;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==OPENB) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==ID) ) {
                        alt13=2;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            {
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:6: OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB
                            {
                            OPENB21=(Token)match(input,OPENB,FOLLOW_OPENB_in_functionHeader364); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPENB21_tree = 
                            (CommonTree)adaptor.create(OPENB21)
                            ;
                            adaptor.addChild(root_0, OPENB21_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:12: ( ID ( ( COMMA )? ID )* )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==ID) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:13: ID ( ( COMMA )? ID )*
                                    {
                                    ID22=(Token)match(input,ID,FOLLOW_ID_in_functionHeader367); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ID22_tree = 
                                    (CommonTree)adaptor.create(ID22)
                                    ;
                                    adaptor.addChild(root_0, ID22_tree);
                                    }

                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:16: ( ( COMMA )? ID )*
                                    loop11:
                                    do {
                                        int alt11=2;
                                        int LA11_0 = input.LA(1);

                                        if ( (LA11_0==COMMA||LA11_0==ID) ) {
                                            alt11=1;
                                        }


                                        switch (alt11) {
                                    	case 1 :
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:17: ( COMMA )? ID
                                    	    {
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:17: ( COMMA )?
                                    	    int alt10=2;
                                    	    int LA10_0 = input.LA(1);

                                    	    if ( (LA10_0==COMMA) ) {
                                    	        alt10=1;
                                    	    }
                                    	    switch (alt10) {
                                    	        case 1 :
                                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:17: COMMA
                                    	            {
                                    	            COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader370); if (state.failed) return retval;
                                    	            if ( state.backtracking==0 ) {
                                    	            COMMA23_tree = 
                                    	            (CommonTree)adaptor.create(COMMA23)
                                    	            ;
                                    	            adaptor.addChild(root_0, COMMA23_tree);
                                    	            }

                                    	            }
                                    	            break;

                                    	    }


                                    	    ID24=(Token)match(input,ID,FOLLOW_ID_in_functionHeader373); if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) {
                                    	    ID24_tree = 
                                    	    (CommonTree)adaptor.create(ID24)
                                    	    ;
                                    	    adaptor.addChild(root_0, ID24_tree);
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop11;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            CLOSEB25=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_functionHeader379); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSEB25_tree = 
                            (CommonTree)adaptor.create(CLOSEB25)
                            ;
                            adaptor.addChild(root_0, CLOSEB25_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:104:41: ID
                            {
                            ID26=(Token)match(input,ID,FOLLOW_ID_in_functionHeader384); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID26_tree = 
                            (CommonTree)adaptor.create(ID26)
                            ;
                            adaptor.addChild(root_0, ID26_tree);
                            }

                            }
                            break;

                    }


                    EQUALS27=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_functionHeader388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS27_tree = 
                    (CommonTree)adaptor.create(EQUALS27)
                    ;
                    adaptor.addChild(root_0, EQUALS27_tree);
                    }

                    }
                    break;

            }


            }


            ID28=(Token)match(input,ID,FOLLOW_ID_in_functionHeader399); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID28_tree = 
            (CommonTree)adaptor.create(ID28)
            ;
            adaptor.addChild(root_0, ID28_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:3: ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPENP) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==COMMA) ) {
                        alt17=1;
                    }
                    else if ( (LA17_3==CLOSEP) ) {
                        alt17=1;
                    }
                }
                else if ( (LA17_1==CLOSEP) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:4: OPENP ( ID ( COMMA ID )* )? CLOSEP
                    {
                    OPENP29=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionHeader405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPENP29_tree = 
                    (CommonTree)adaptor.create(OPENP29)
                    ;
                    adaptor.addChild(root_0, OPENP29_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:10: ( ID ( COMMA ID )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:11: ID ( COMMA ID )*
                            {
                            ID30=(Token)match(input,ID,FOLLOW_ID_in_functionHeader408); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID30_tree = 
                            (CommonTree)adaptor.create(ID30)
                            ;
                            adaptor.addChild(root_0, ID30_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:14: ( COMMA ID )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==COMMA) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:107:15: COMMA ID
                            	    {
                            	    COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader411); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    COMMA31_tree = 
                            	    (CommonTree)adaptor.create(COMMA31)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA31_tree);
                            	    }

                            	    ID32=(Token)match(input,ID,FOLLOW_ID_in_functionHeader413); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    ID32_tree = 
                            	    (CommonTree)adaptor.create(ID32)
                            	    ;
                            	    adaptor.addChild(root_0, ID32_tree);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CLOSEP33=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionHeader419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSEP33_tree = 
                    (CommonTree)adaptor.create(CLOSEP33)
                    ;
                    adaptor.addChild(root_0, CLOSEP33_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 6, functionHeader_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionHeader"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:113:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER );
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);

        int term_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EMPTY_VEC34=null;
        Token EMPTY_CELL35=null;
        Token OPENP36=null;
        Token CLOSEP38=null;
        Token STRING_LITERAL39=null;
        Token END41=null;
        Token COLON44=null;
        Token TRUE45=null;
        Token FALSE46=null;
        Token INTEGER47=null;
        Token DOT48=null;
        Token INTEGER49=null;
        Token DOT50=null;
        Token INTEGER51=null;
        ExprParser.expr_return expr37 =null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure40 =null;

        ExprParser.vector_return vector42 =null;

        ExprParser.cellArray_return cellArray43 =null;


        CommonTree EMPTY_VEC34_tree=null;
        CommonTree EMPTY_CELL35_tree=null;
        CommonTree OPENP36_tree=null;
        CommonTree CLOSEP38_tree=null;
        CommonTree STRING_LITERAL39_tree=null;
        CommonTree END41_tree=null;
        CommonTree COLON44_tree=null;
        CommonTree TRUE45_tree=null;
        CommonTree FALSE46_tree=null;
        CommonTree INTEGER47_tree=null;
        CommonTree DOT48_tree=null;
        CommonTree INTEGER49_tree=null;
        CommonTree DOT50_tree=null;
        CommonTree INTEGER51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:113:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER )
            int alt19=13;
            switch ( input.LA(1) ) {
            case EMPTY_VEC:
                {
                alt19=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt19=2;
                }
                break;
            case OPENP:
                {
                alt19=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt19=4;
                }
                break;
            case ID:
                {
                alt19=5;
                }
                break;
            case END:
                {
                alt19=6;
                }
                break;
            case OPENB:
                {
                alt19=7;
                }
                break;
            case OPENC:
                {
                alt19=8;
                }
                break;
            case COLON:
                {
                alt19=9;
                }
                break;
            case TRUE:
                {
                alt19=10;
                }
                break;
            case FALSE:
                {
                alt19=11;
                }
                break;
            case INTEGER:
                {
                alt19=12;
                }
                break;
            case DOT:
                {
                alt19=13;
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:113:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_VEC34=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC34_tree = 
                    (CommonTree)adaptor.create(EMPTY_VEC34)
                    ;
                    adaptor.addChild(root_0, EMPTY_VEC34_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:114:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_CELL35=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL35_tree = 
                    (CommonTree)adaptor.create(EMPTY_CELL35)
                    ;
                    adaptor.addChild(root_0, EMPTY_CELL35_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:115:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP36=(Token)match(input,OPENP,FOLLOW_OPENP_in_term446); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term449);
                    expr37=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr37.getTree());

                    CLOSEP38=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term451); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:118:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL39=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL39_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL39)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL39_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:123:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCallOrStructure_in_term474);
                    functionCallOrStructure40=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure40.getTree());

                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:124:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END41=(Token)match(input,END,FOLLOW_END_in_term480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END41_tree = 
                    (CommonTree)adaptor.create(END41)
                    ;
                    adaptor.addChild(root_0, END41_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:125:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vector_in_term485);
                    vector42=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector42.getTree());

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:126:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cellArray_in_term490);
                    cellArray43=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray43.getTree());

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:127:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON44=(Token)match(input,COLON,FOLLOW_COLON_in_term495); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON44_tree = 
                    (CommonTree)adaptor.create(COLON44)
                    ;
                    adaptor.addChild(root_0, COLON44_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:128:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE45=(Token)match(input,TRUE,FOLLOW_TRUE_in_term500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE45_tree = 
                    (CommonTree)adaptor.create(TRUE45)
                    ;
                    adaptor.addChild(root_0, TRUE45_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:129:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE46=(Token)match(input,FALSE,FOLLOW_FALSE_in_term505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE46_tree = 
                    (CommonTree)adaptor.create(FALSE46)
                    ;
                    adaptor.addChild(root_0, FALSE46_tree);
                    }

                    }
                    break;
                case 12 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:131:4: INTEGER ( DOT ^ INTEGER )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER47=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER47_tree = 
                    (CommonTree)adaptor.create(INTEGER47)
                    ;
                    adaptor.addChild(root_0, INTEGER47_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:131:12: ( DOT ^ INTEGER )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DOT) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==INTEGER) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:131:13: DOT ^ INTEGER
                            {
                            DOT48=(Token)match(input,DOT,FOLLOW_DOT_in_term515); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT48_tree = 
                            (CommonTree)adaptor.create(DOT48)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(DOT48_tree, root_0);
                            }

                            INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term518); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTEGER49_tree = 
                            (CommonTree)adaptor.create(INTEGER49)
                            ;
                            adaptor.addChild(root_0, INTEGER49_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:132:4: DOT ^ INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOT50=(Token)match(input,DOT,FOLLOW_DOT_in_term525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT50_tree = 
                    (CommonTree)adaptor.create(DOT50)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT50_tree, root_0);
                    }

                    INTEGER51=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER51_tree = 
                    (CommonTree)adaptor.create(INTEGER51)
                    ;
                    adaptor.addChild(root_0, INTEGER51_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 7, term_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "term"


    public static class transponent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transponent"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:140:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET53=null;
        Token CARET54=null;
        Token SINGLE_QUOTE56=null;
        Token DOT_TRANSPOSE57=null;
        ExprParser.term_return term52 =null;

        ExprParser.term_return term55 =null;


        CommonTree DOT_CARET53_tree=null;
        CommonTree CARET54_tree=null;
        CommonTree SINGLE_QUOTE56_tree=null;
        CommonTree DOT_TRANSPOSE57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:146:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:146:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:146:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:146:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            pushFollow(FOLLOW_term_in_transponent554);
            term52=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term52.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:146:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt23=2;
            switch ( input.LA(1) ) {
            case CARET:
            case DOT_CARET:
                {
                alt23=1;
                }
                break;
            case DOT_STAR:
                {
                alt23=1;
                }
                break;
            case DOT_SLASH:
                {
                alt23=1;
                }
                break;
            case DOT_BACKSLASH:
                {
                alt23=1;
                }
                break;
            case STAR:
                {
                alt23=1;
                }
                break;
            case SLASH:
                {
                alt23=1;
                }
                break;
            case BACKSLASH:
                {
                alt23=1;
                }
                break;
            case PLUS:
                {
                alt23=1;
                }
                break;
            case MINUS:
                {
                alt23=1;
                }
                break;
            case LESS_THAN:
                {
                alt23=1;
                }
                break;
            case GREATER_THAN:
                {
                alt23=1;
                }
                break;
            case LESS_EQUAL:
                {
                alt23=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt23=1;
                }
                break;
            case ISEQUAL:
                {
                alt23=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt23=1;
                }
                break;
            case ELE_AND:
                {
                alt23=1;
                }
                break;
            case ELE_OR:
                {
                alt23=1;
                }
                break;
            case SC_AND:
                {
                alt23=1;
                }
                break;
            case SC_OR:
                {
                alt23=1;
                }
                break;
            case COMMA:
                {
                alt23=1;
                }
                break;
            case CLOSEP:
                {
                alt23=1;
                }
                break;
            case NOT:
                {
                alt23=1;
                }
                break;
            case EMPTY_VEC:
                {
                alt23=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt23=1;
                }
                break;
            case OPENP:
                {
                alt23=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt23=1;
                }
                break;
            case ID:
                {
                alt23=1;
                }
                break;
            case END:
                {
                alt23=1;
                }
                break;
            case OPENB:
                {
                alt23=1;
                }
                break;
            case OPENC:
                {
                alt23=1;
                }
                break;
            case COLON:
                {
                alt23=1;
                }
                break;
            case TRUE:
                {
                alt23=1;
                }
                break;
            case FALSE:
                {
                alt23=1;
                }
                break;
            case INTEGER:
                {
                alt23=1;
                }
                break;
            case DOT:
                {
                alt23=1;
                }
                break;
            case SEMI:
                {
                alt23=1;
                }
                break;
            case CLOSEB:
                {
                alt23=1;
                }
                break;
            case CLOSEC:
                {
                alt23=1;
                }
                break;
            case EOF:
                {
                alt23=1;
                }
                break;
            case IF:
                {
                alt23=1;
                }
                break;
            case SWITCH:
                {
                alt23=1;
                }
                break;
            case FOR:
                {
                alt23=1;
                }
                break;
            case WHILE:
                {
                alt23=1;
                }
                break;
            case BLOCK_END:
                {
                alt23=1;
                }
                break;
            case ELSEIF:
                {
                alt23=1;
                }
                break;
            case ELSE:
                {
                alt23=1;
                }
                break;
            case OTHERWISE:
                {
                alt23=1;
                }
                break;
            case CASE:
                {
                alt23=1;
                }
                break;
            case DOT_TRANSPOSE:
            case SINGLE_QUOTE:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:3: ( ( DOT_CARET ^| CARET ^) term )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==CARET||LA21_0==DOT_CARET) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:5: ( DOT_CARET ^| CARET ^)
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==DOT_CARET) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==CARET) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:6: DOT_CARET ^
                    	            {
                    	            DOT_CARET53=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent563); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET53_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET53)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET53_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:147:19: CARET ^
                    	            {
                    	            CARET54=(Token)match(input,CARET,FOLLOW_CARET_in_transponent568); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET54_tree = 
                    	            (CommonTree)adaptor.create(CARET54)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET54_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_term_in_transponent572);
                    	    term55=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:148:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:148:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==SINGLE_QUOTE) ) {
                            alt22=1;
                        }
                        else if ( (LA22_0==DOT_TRANSPOSE) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:148:6: SINGLE_QUOTE ^
                    	    {
                    	    SINGLE_QUOTE56=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent581); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE56_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE56)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE56_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:148:22: DOT_TRANSPOSE ^
                    	    {
                    	    DOT_TRANSPOSE57=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent586); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE57_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE57)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE57_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
            if ( state.backtracking>0 ) { memoize(input, 8, transponent_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "transponent"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS58=null;
        Token MINUS59=null;
        Token NOT60=null;
        ExprParser.transponent_return transponent61 =null;


        CommonTree PLUS58_tree=null;
        CommonTree MINUS59_tree=null;
        CommonTree NOT60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:9: ( PLUS !| MINUS ^| NOT ^)*
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt24=1;
                    }
                    break;
                case MINUS:
                    {
                    alt24=2;
                    }
                    break;
                case NOT:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:10: PLUS !
            	    {
            	    PLUS58=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary609); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:18: MINUS ^
            	    {
            	    MINUS59=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary614); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS59_tree = 
            	    (CommonTree)adaptor.create(MINUS59)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS59_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:152:27: NOT ^
            	    {
            	    NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_unary619); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT60_tree = 
            	    (CommonTree)adaptor.create(NOT60)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT60_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary624);
            transponent61=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent61.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, unary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR63=null;
        Token DOT_SLASH64=null;
        Token DOT_BACKSLASH65=null;
        Token STAR66=null;
        Token SLASH67=null;
        Token BACKSLASH68=null;
        ExprParser.unary_return unary62 =null;

        ExprParser.unary_return unary69 =null;


        CommonTree DOT_STAR63_tree=null;
        CommonTree DOT_SLASH64_tree=null;
        CommonTree DOT_BACKSLASH65_tree=null;
        CommonTree STAR66_tree=null;
        CommonTree SLASH67_tree=null;
        CommonTree BACKSLASH68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult632);
            unary62=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary62.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==BACKSLASH||LA26_0==DOT_BACKSLASH||(LA26_0 >= DOT_SLASH && LA26_0 <= DOT_STAR)||LA26_0==SLASH||LA26_0==STAR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt25=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:17: DOT_STAR ^
            	            {
            	            DOT_STAR63=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult637); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR63_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR63)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:29: DOT_SLASH ^
            	            {
            	            DOT_SLASH64=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult642); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH64_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH64)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:42: DOT_BACKSLASH ^
            	            {
            	            DOT_BACKSLASH65=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult647); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH65_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH65)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:59: STAR ^
            	            {
            	            STAR66=(Token)match(input,STAR,FOLLOW_STAR_in_mult652); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR66_tree = 
            	            (CommonTree)adaptor.create(STAR66)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:67: SLASH ^
            	            {
            	            SLASH67=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult657); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH67_tree = 
            	            (CommonTree)adaptor.create(SLASH67)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:154:76: BACKSLASH ^
            	            {
            	            BACKSLASH68=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult662); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH68_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH68)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH68_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult666);
            	    unary69=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary69.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, mult_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS71=null;
        Token MINUS72=null;
        ExprParser.mult_return mult70 =null;

        ExprParser.mult_return mult73 =null;


        CommonTree PLUS71_tree=null;
        CommonTree MINUS72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add678);
            mult70=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult70.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:12: ( ( PLUS ^| MINUS ^) mult )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PLUS) ) {
                    alt28=1;
                }
                else if ( (LA28_0==MINUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:14: ( PLUS ^| MINUS ^)
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PLUS) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==MINUS) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:15: PLUS ^
            	            {
            	            PLUS71=(Token)match(input,PLUS,FOLLOW_PLUS_in_add683); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS71_tree = 
            	            (CommonTree)adaptor.create(PLUS71)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS71_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:156:23: MINUS ^
            	            {
            	            MINUS72=(Token)match(input,MINUS,FOLLOW_MINUS_in_add688); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS72_tree = 
            	            (CommonTree)adaptor.create(MINUS72)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS72_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add692);
            	    mult73=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult73.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
            if ( state.backtracking>0 ) { memoize(input, 11, add_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "add"


    public static class colonEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colonEnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON74=null;
        ExprParser.add_return add75 =null;


        CommonTree COLON74_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:11: ( COLON add )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COLON) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:12: COLON add
            	    {
            	    COLON74=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd703); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON74);


            	    pushFollow(FOLLOW_add_in_colonEnd705);
            	    add75=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add75.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // 158:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:158:27: ^( COLON_ARGS ( add )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 12, colonEnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colonEnd"


    public static class colon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colon"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:160:1: colon : add ( colonEnd ^)? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.add_return add76 =null;

        ExprParser.colonEnd_return colonEnd77 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:160:7: ( add ( colonEnd ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:160:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_colon724);
            add76=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add76.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:160:13: ( colonEnd ^)?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COLON) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:160:14: colonEnd ^
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon727);
                    colonEnd77=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd77.getTree(), root_0);

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
            if ( state.backtracking>0 ) { memoize(input, 13, colon_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colon"


    public static class logical_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN79=null;
        Token GREATER_THAN80=null;
        Token LESS_EQUAL81=null;
        Token GREATER_EQUAL82=null;
        Token ISEQUAL83=null;
        Token NOT_EQUAL84=null;
        ExprParser.colon_return colon78 =null;

        ExprParser.colon_return colon85 =null;


        CommonTree LESS_THAN79_tree=null;
        CommonTree GREATER_THAN80_tree=null;
        CommonTree LESS_EQUAL81_tree=null;
        CommonTree GREATER_EQUAL82_tree=null;
        CommonTree ISEQUAL83_tree=null;
        CommonTree NOT_EQUAL84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_logical755);
            colon78=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon78.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==GREATER_EQUAL||LA32_0==GREATER_THAN||(LA32_0 >= ISEQUAL && LA32_0 <= LESS_THAN)||LA32_0==NOT_EQUAL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt31=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt31=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt31=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt31=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:20: LESS_THAN ^
            	            {
            	            LESS_THAN79=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical760); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN79_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN79)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN79_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:33: GREATER_THAN ^
            	            {
            	            GREATER_THAN80=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical765); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN80_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN80)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN80_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:49: LESS_EQUAL ^
            	            {
            	            LESS_EQUAL81=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical770); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL81_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL81)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL81_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:63: GREATER_EQUAL ^
            	            {
            	            GREATER_EQUAL82=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical775); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL82_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL82)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:80: ISEQUAL ^
            	            {
            	            ISEQUAL83=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical780); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL83_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL83)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:171:91: NOT_EQUAL ^
            	            {
            	            NOT_EQUAL84=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical785); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL84_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL84)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_logical789);
            	    colon85=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon85.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
            if ( state.backtracking>0 ) { memoize(input, 14, logical_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical"


    public static class eleAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:173:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND87=null;
        ExprParser.logical_return logical86 =null;

        ExprParser.logical_return logical88 =null;


        CommonTree ELE_AND87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:173:8: ( logical ( ELE_AND ^ logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:173:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logical_in_eleAnd801);
            logical86=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical86.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:173:18: ( ELE_AND ^ logical )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELE_AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:173:19: ELE_AND ^ logical
            	    {
            	    ELE_AND87=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd804); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND87_tree = 
            	    (CommonTree)adaptor.create(ELE_AND87)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_in_eleAnd807);
            	    logical88=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical88.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            if ( state.backtracking>0 ) { memoize(input, 15, eleAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleAnd"


    public static class eleOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:175:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR90=null;
        ExprParser.eleAnd_return eleAnd89 =null;

        ExprParser.eleAnd_return eleAnd91 =null;


        CommonTree ELE_OR90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:175:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:175:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr818);
            eleAnd89=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd89.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:175:16: ( ELE_OR ^ eleAnd )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ELE_OR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:175:17: ELE_OR ^ eleAnd
            	    {
            	    ELE_OR90=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr821); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR90_tree = 
            	    (CommonTree)adaptor.create(ELE_OR90)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleAnd_in_eleOr824);
            	    eleAnd91=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd91.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
            if ( state.backtracking>0 ) { memoize(input, 16, eleOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleOr"


    public static class scAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:177:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND93=null;
        ExprParser.eleOr_return eleOr92 =null;

        ExprParser.eleOr_return eleOr94 =null;


        CommonTree SC_AND93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:177:7: ( eleOr ( SC_AND ^ eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:177:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd835);
            eleOr92=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr92.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:177:15: ( SC_AND ^ eleOr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==SC_AND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:177:16: SC_AND ^ eleOr
            	    {
            	    SC_AND93=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd838); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND93_tree = 
            	    (CommonTree)adaptor.create(SC_AND93)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleOr_in_scAnd841);
            	    eleOr94=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr94.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 17, scAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scAnd"


    public static class scOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:179:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR96=null;
        ExprParser.scAnd_return scAnd95 =null;

        ExprParser.scAnd_return scAnd97 =null;


        CommonTree SC_OR96_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:179:6: ( scAnd ( SC_OR ^ scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:179:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr852);
            scAnd95=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd95.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:179:14: ( SC_OR ^ scAnd )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SC_OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:179:15: SC_OR ^ scAnd
            	    {
            	    SC_OR96=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr855); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR96_tree = 
            	    (CommonTree)adaptor.create(SC_OR96)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR96_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_scAnd_in_scOr858);
            	    scAnd97=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd97.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
            if ( state.backtracking>0 ) { memoize(input, 18, scOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scOr"


    public static class hCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA99=null;
        ExprParser.expr_return expr98 =null;

        ExprParser.expr_return expr100 =null;


        CommonTree COMMA99_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec881);
            expr98=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:16: ( ( COMMA )? expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COLON||LA38_0==COMMA||LA38_0==DOT||(LA38_0 >= EMPTY_CELL && LA38_0 <= END)||LA38_0==FALSE||LA38_0==ID||LA38_0==INTEGER||LA38_0==MINUS||LA38_0==NOT||(LA38_0 >= OPENB && LA38_0 <= OPENP)||LA38_0==PLUS||LA38_0==STRING_LITERAL||LA38_0==TRUE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:17: ( COMMA )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==COMMA) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:18: COMMA
            	            {
            	            COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec885); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA99);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatVec889);
            	    expr100=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr100.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // 193:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:193:36: ^( HCAT_VEC ( expr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 19, hCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatVec"


    public static class vCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI102=null;
        ExprParser.hCatVec_return hCatVec101 =null;

        ExprParser.hCatVec_return hCatVec103 =null;


        CommonTree SEMI102_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec908);
            hCatVec101=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec101.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:19: ( ( SEMI ) hCatVec )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SEMI) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:21: SEMI
            	    {
            	    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI102);


            	    }


            	    pushFollow(FOLLOW_hCatVec_in_vCatVec915);
            	    hCatVec103=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec103.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
            // 195:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:195:40: ^( VCAT_VEC ( hCatVec )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 20, vCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatVec"


    public static class vector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vector"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:197:1: vector : OPENB ! vCatVec CLOSEB !;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB104=null;
        Token CLOSEB106=null;
        ExprParser.vCatVec_return vCatVec105 =null;


        CommonTree OPENB104_tree=null;
        CommonTree CLOSEB106_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:197:8: ( OPENB ! vCatVec CLOSEB !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:197:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENB104=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector934); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatVec_in_vector937);
            vCatVec105=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec105.getTree());

            CLOSEB106=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector939); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 21, vector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vector"


    public static class hCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA108=null;
        ExprParser.expr_return expr107 =null;

        ExprParser.expr_return expr109 =null;


        CommonTree COMMA108_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell947);
            expr107=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr107.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:16: ( ( COMMA )? expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COLON||LA41_0==COMMA||LA41_0==DOT||(LA41_0 >= EMPTY_CELL && LA41_0 <= END)||LA41_0==FALSE||LA41_0==ID||LA41_0==INTEGER||LA41_0==MINUS||LA41_0==NOT||(LA41_0 >= OPENB && LA41_0 <= OPENP)||LA41_0==PLUS||LA41_0==STRING_LITERAL||LA41_0==TRUE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:17: ( COMMA )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==COMMA) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:18: COMMA
            	            {
            	            COMMA108=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell951); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA108);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatCell955);
            	    expr109=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr109.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
            // 199:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:199:37: ^( HCAT_CELL ( expr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 22, hCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatCell"


    public static class vCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI111=null;
        ExprParser.hCatCell_return hCatCell110 =null;

        ExprParser.hCatCell_return hCatCell112 =null;


        CommonTree SEMI111_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell974);
            hCatCell110=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell110.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:20: ( ( SEMI ) ! hCatCell )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==SEMI) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:21: ( SEMI ) ! hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:22: SEMI
            	    {
            	    SEMI111=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell978); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI111);


            	    }


            	    pushFollow(FOLLOW_hCatCell_in_vCatCell982);
            	    hCatCell112=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell112.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
            // 201:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:201:43: ^( VCAT_CELL ( hCatCell )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 23, vCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatCell"


    public static class cellArray_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellArray"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:203:1: cellArray : OPENC ! vCatCell CLOSEC !;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC113=null;
        Token CLOSEC115=null;
        ExprParser.vCatCell_return vCatCell114 =null;


        CommonTree OPENC113_tree=null;
        CommonTree CLOSEC115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:203:11: ( OPENC ! vCatCell CLOSEC !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:203:13: OPENC ! vCatCell CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENC113=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray1001); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatCell_in_cellArray1004);
            vCatCell114=vCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell114.getTree());

            CLOSEC115=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray1006); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 24, cellArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cellArray"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:205:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.scOr_return scOr116 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:205:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:205:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scOr_in_expr1019);
            scOr116=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr116.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS118=null;
        Token SEMI120=null;
        ExprParser.term_return term117 =null;

        ExprParser.expr_return expr119 =null;


        CommonTree EQUALS118_tree=null;
        CommonTree SEMI120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:29: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:29: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA43_1 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA43_3 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA43_4 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA43_5 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA43_6 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA43_7 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA43_8 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA43_9 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case TRUE:
                    {
                    int LA43_10 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case FALSE:
                    {
                    int LA43_11 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case INTEGER:
                    {
                    int LA43_12 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
                case DOT:
                    {
                    int LA43_13 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt43=1;
                    }
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:30: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:47: ( term EQUALS ^)
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:48: term EQUALS ^
                    {
                    pushFollow(FOLLOW_term_in_line1048);
                    term117=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term117.getTree());

                    EQUALS118=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line1050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS118_tree = 
                    (CommonTree)adaptor.create(EQUALS118)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS118_tree, root_0);
                    }

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_line1057);
            expr119=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:214:7: ( SEMI ^)?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SEMI) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:214:8: SEMI ^
                    {
                    SEMI120=(Token)match(input,SEMI,FOLLOW_SEMI_in_line1060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI120_tree = 
                    (CommonTree)adaptor.create(SEMI120)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SEMI120_tree, root_0);
                    }

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
            if ( state.backtracking>0 ) { memoize(input, 26, line_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line"


    public static class ifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:221:1: ifPart : IF ^ expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF121=null;
        ExprParser.expr_return expr122 =null;

        ExprParser.block_return block123 =null;


        CommonTree IF121_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:221:8: ( IF ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:221:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF121=(Token)match(input,IF,FOLLOW_IF_in_ifPart1079); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF121_tree = 
            (CommonTree)adaptor.create(IF121)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF121_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifPart1082);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:221:19: ( block )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==COLON||LA45_0==DOT||(LA45_0 >= EMPTY_CELL && LA45_0 <= END)||(LA45_0 >= FALSE && LA45_0 <= FOR)||(LA45_0 >= ID && LA45_0 <= IF)||LA45_0==INTEGER||LA45_0==MINUS||LA45_0==NOT||(LA45_0 >= OPENB && LA45_0 <= OPENP)||LA45_0==PLUS||(LA45_0 >= STRING_LITERAL && LA45_0 <= SWITCH)||LA45_0==TRUE||LA45_0==WHILE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:221:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart1084);
                    block123=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block123.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, ifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifPart"


    public static class elseifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF124=null;
        ExprParser.expr_return e2 =null;

        ExprParser.block_return b2 =null;


        CommonTree ELSEIF124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:14: ( ELSEIF ^e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:15: ELSEIF ^e2= expr (b2= block )?
            {
            ELSEIF124=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart1093); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF124_tree = 
            (CommonTree)adaptor.create(ELSEIF124)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF124_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_elseifPart1098);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:33: (b2= block )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON||LA46_0==DOT||(LA46_0 >= EMPTY_CELL && LA46_0 <= END)||(LA46_0 >= FALSE && LA46_0 <= FOR)||(LA46_0 >= ID && LA46_0 <= IF)||LA46_0==INTEGER||LA46_0==MINUS||LA46_0==NOT||(LA46_0 >= OPENB && LA46_0 <= OPENP)||LA46_0==PLUS||(LA46_0 >= STRING_LITERAL && LA46_0 <= SWITCH)||LA46_0==TRUE||LA46_0==WHILE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:222:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart1102);
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
            if ( state.backtracking>0 ) { memoize(input, 28, elseifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elseifPart"


    public static class elsePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE125=null;
        ExprParser.block_return b3 =null;


        CommonTree ELSE125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:10: ( ( ELSE ^ (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:11: ( ELSE ^ (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:12: ELSE ^ (b3= block )?
            {
            ELSE125=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart1111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE125_tree = 
            (CommonTree)adaptor.create(ELSE125)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE125_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:20: (b3= block )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COLON||LA47_0==DOT||(LA47_0 >= EMPTY_CELL && LA47_0 <= END)||(LA47_0 >= FALSE && LA47_0 <= FOR)||(LA47_0 >= ID && LA47_0 <= IF)||LA47_0==INTEGER||LA47_0==MINUS||LA47_0==NOT||(LA47_0 >= OPENB && LA47_0 <= OPENP)||LA47_0==PLUS||(LA47_0 >= STRING_LITERAL && LA47_0 <= SWITCH)||LA47_0==TRUE||LA47_0==WHILE) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:223:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart1116);
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
            if ( state.backtracking>0 ) { memoize(input, 29, elsePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elsePart"


    public static class ifBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:224:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END129=null;
        ExprParser.ifPart_return ifPart126 =null;

        ExprParser.elseifPart_return elseifPart127 =null;

        ExprParser.elsePart_return elsePart128 =null;


        CommonTree BLOCK_END129_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:224:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:225:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock1127);
            ifPart126=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart126.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:226:9: ( elseifPart )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ELSEIF) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:226:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1137);
            	    elseifPart127=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart127.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:227:9: ( elsePart )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ELSE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:227:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1148);
                    elsePart128=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart128.getTree());

                    }
                    break;

            }


            BLOCK_END129=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END129);


            // AST REWRITE
            // elements: elsePart, ifPart, elseifPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 229:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:229:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:229:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:229:41: ( elsePart )?
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
            if ( state.backtracking>0 ) { memoize(input, 30, ifBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifBlock"


    public static class switchPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:234:1: switchPart : SWITCH ^ expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH130=null;
        ExprParser.expr_return expr131 =null;


        CommonTree SWITCH130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:234:12: ( SWITCH ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:234:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH130=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH130_tree = 
            (CommonTree)adaptor.create(SWITCH130)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH130_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_switchPart1220);
            expr131=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 31, switchPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchPart"


    public static class casePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:235:1: casePart : CASE ^ expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE132=null;
        ExprParser.expr_return expr133 =null;

        ExprParser.block_return block134 =null;


        CommonTree CASE132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:235:10: ( CASE ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:235:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE132=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE132_tree = 
            (CommonTree)adaptor.create(CASE132)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE132_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_casePart1230);
            expr133=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:235:23: ( block )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON||LA50_0==DOT||(LA50_0 >= EMPTY_CELL && LA50_0 <= END)||(LA50_0 >= FALSE && LA50_0 <= FOR)||(LA50_0 >= ID && LA50_0 <= IF)||LA50_0==INTEGER||LA50_0==MINUS||LA50_0==NOT||(LA50_0 >= OPENB && LA50_0 <= OPENP)||LA50_0==PLUS||(LA50_0 >= STRING_LITERAL && LA50_0 <= SWITCH)||LA50_0==TRUE||LA50_0==WHILE) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:235:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1232);
                    block134=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block134.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, casePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "casePart"


    public static class otherwiseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "otherwiseBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:236:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE135=null;
        ExprParser.block_return block136 =null;


        CommonTree OTHERWISE135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:236:16: ( OTHERWISE ^ ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:236:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE135=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE135_tree = 
            (CommonTree)adaptor.create(OTHERWISE135)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE135_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:236:29: ( block )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON||LA51_0==DOT||(LA51_0 >= EMPTY_CELL && LA51_0 <= END)||(LA51_0 >= FALSE && LA51_0 <= FOR)||(LA51_0 >= ID && LA51_0 <= IF)||LA51_0==INTEGER||LA51_0==MINUS||LA51_0==NOT||(LA51_0 >= OPENB && LA51_0 <= OPENP)||LA51_0==PLUS||(LA51_0 >= STRING_LITERAL && LA51_0 <= SWITCH)||LA51_0==TRUE||LA51_0==WHILE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:236:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1243);
                    block136=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block136.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, otherwiseBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "otherwiseBlock"


    public static class switchBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:237:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END140=null;
        ExprParser.switchPart_return switchPart137 =null;

        ExprParser.casePart_return casePart138 =null;

        ExprParser.otherwiseBlock_return otherwiseBlock139 =null;


        CommonTree BLOCK_END140_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:237:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:238:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1253);
            switchPart137=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart137.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:239:2: ( casePart )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==CASE) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:239:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1256);
            	    casePart138=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart138.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:240:2: ( otherwiseBlock )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==OTHERWISE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:240:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1260);
                    otherwiseBlock139=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock139.getTree());

                    }
                    break;

            }


            BLOCK_END140=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END140);


            // AST REWRITE
            // elements: switchPart, otherwiseBlock, casePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:242:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:242:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:242:40: ( otherwiseBlock )?
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
            if ( state.backtracking>0 ) { memoize(input, 34, switchBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchBlock"


    public static class forPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:245:1: forPart : FOR ^ ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR141=null;
        Token ID142=null;
        Token EQUALS143=null;
        ExprParser.expr_return expr144 =null;


        CommonTree FOR141_tree=null;
        CommonTree ID142_tree=null;
        CommonTree EQUALS143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:245:9: ( FOR ^ ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:245:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR141=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR141_tree = 
            (CommonTree)adaptor.create(FOR141)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR141_tree, root_0);
            }

            ID142=(Token)match(input,ID,FOLLOW_ID_in_forPart1292); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID142_tree = 
            (CommonTree)adaptor.create(ID142)
            ;
            adaptor.addChild(root_0, ID142_tree);
            }

            EQUALS143=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS143_tree = 
            (CommonTree)adaptor.create(EQUALS143)
            ;
            adaptor.addChild(root_0, EQUALS143_tree);
            }

            pushFollow(FOLLOW_expr_in_forPart1296);
            expr144=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr144.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, forPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forPart"


    public static class forBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:246:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END147=null;
        ExprParser.forPart_return forPart145 =null;

        ExprParser.block_return block146 =null;


        CommonTree BLOCK_END147_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:246:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:247:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1306);
            forPart145=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart145.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:248:2: ( block )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLON||LA54_0==DOT||(LA54_0 >= EMPTY_CELL && LA54_0 <= END)||(LA54_0 >= FALSE && LA54_0 <= FOR)||(LA54_0 >= ID && LA54_0 <= IF)||LA54_0==INTEGER||LA54_0==MINUS||LA54_0==NOT||(LA54_0 >= OPENB && LA54_0 <= OPENP)||LA54_0==PLUS||(LA54_0 >= STRING_LITERAL && LA54_0 <= SWITCH)||LA54_0==TRUE||LA54_0==WHILE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:248:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1309);
                    block146=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block146.getTree());

                    }
                    break;

            }


            BLOCK_END147=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END147);


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
            // 250:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:250:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:250:24: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 36, forBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forBlock"


    public static class whilePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:253:1: whilePart : WHILE ^ expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE148=null;
        ExprParser.expr_return expr149 =null;


        CommonTree WHILE148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:253:11: ( WHILE ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:253:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE148=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE148_tree = 
            (CommonTree)adaptor.create(WHILE148)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE148_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whilePart1339);
            expr149=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr149.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, whilePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whilePart"


    public static class whileBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:254:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END152=null;
        ExprParser.whilePart_return whilePart150 =null;

        ExprParser.block_return block151 =null;


        CommonTree BLOCK_END152_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:254:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:255:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1348);
            whilePart150=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart150.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:256:2: ( block )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COLON||LA55_0==DOT||(LA55_0 >= EMPTY_CELL && LA55_0 <= END)||(LA55_0 >= FALSE && LA55_0 <= FOR)||(LA55_0 >= ID && LA55_0 <= IF)||LA55_0==INTEGER||LA55_0==MINUS||LA55_0==NOT||(LA55_0 >= OPENB && LA55_0 <= OPENP)||LA55_0==PLUS||(LA55_0 >= STRING_LITERAL && LA55_0 <= SWITCH)||LA55_0==TRUE||LA55_0==WHILE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:256:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1351);
                    block151=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block151.getTree());

                    }
                    break;

            }


            BLOCK_END152=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END152);


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
            // 258:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:258:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:258:28: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 38, whileBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileBlock"


    public static class blockPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock153 =null;

        ExprParser.switchBlock_return switchBlock154 =null;

        ExprParser.forBlock_return forBlock155 =null;

        ExprParser.whileBlock_return whileBlock156 =null;

        ExprParser.line_return line157 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt56=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt56=1;
                }
                break;
            case SWITCH:
                {
                alt56=2;
                }
                break;
            case FOR:
                {
                alt56=3;
                }
                break;
            case WHILE:
                {
                alt56=4;
                }
                break;
            case COLON:
            case DOT:
            case EMPTY_CELL:
            case EMPTY_VEC:
            case END:
            case FALSE:
            case ID:
            case INTEGER:
            case MINUS:
            case NOT:
            case OPENB:
            case OPENC:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
            case TRUE:
                {
                alt56=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1378);
                    ifBlock153=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock153.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1382);
                    switchBlock154=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock154.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1386);
                    forBlock155=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock155.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1390);
                    whileBlock156=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock156.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:261:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1394);
                    line157=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line157.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, blockPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockPart"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart158 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:9: ( blockPart )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case IF:
                    {
                    alt57=1;
                    }
                    break;
                case SWITCH:
                    {
                    alt57=1;
                    }
                    break;
                case FOR:
                    {
                    alt57=1;
                    }
                    break;
                case WHILE:
                    {
                    alt57=1;
                    }
                    break;
                case EMPTY_VEC:
                    {
                    alt57=1;
                    }
                    break;
                case EMPTY_CELL:
                    {
                    alt57=1;
                    }
                    break;
                case OPENP:
                    {
                    alt57=1;
                    }
                    break;
                case STRING_LITERAL:
                    {
                    alt57=1;
                    }
                    break;
                case ID:
                    {
                    alt57=1;
                    }
                    break;
                case END:
                    {
                    alt57=1;
                    }
                    break;
                case OPENB:
                    {
                    alt57=1;
                    }
                    break;
                case OPENC:
                    {
                    alt57=1;
                    }
                    break;
                case COLON:
                    {
                    alt57=1;
                    }
                    break;
                case TRUE:
                    {
                    alt57=1;
                    }
                    break;
                case FALSE:
                    {
                    alt57=1;
                    }
                    break;
                case INTEGER:
                    {
                    alt57=1;
                    }
                    break;
                case DOT:
                    {
                    alt57=1;
                    }
                    break;
                case PLUS:
                    {
                    alt57=1;
                    }
                    break;
                case MINUS:
                    {
                    alt57=1;
                    }
                    break;
                case NOT:
                    {
                    alt57=1;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1402);
            	    blockPart158=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart158.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
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
            // 262:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:262:23: ^( BLOCK ( blockPart )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 40, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"

    // $ANTLR start synpred2_Expr
    public final void synpred2_Expr_fragment() throws RecognitionException {
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:30: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/temp/Expr.g:213:31: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred2_Expr1040);
        term();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Expr1042); if (state.failed) return ;

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
    public static final BitSet FOLLOW_block_in_prog217 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_functionHeader_in_prog223 = new BitSet(new long[]{0x50B0063800820082L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_prog226 = new BitSet(new long[]{0x50B0063800820082L,0x0000000002160107L});
    public static final BitSet FOLLOW_BLOCK_END_in_prog230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_functionArgs254 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs257 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionArgs259 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_functionCall288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCall296 = new BitSet(new long[]{0x5090023800828000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall299 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure323 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure326 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure330 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure333 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionHeader352 = new BitSet(new long[]{0x0010004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OPENB_in_functionHeader364 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_ID_in_functionHeader367 = new BitSet(new long[]{0x0010000000082000L});
    public static final BitSet FOLLOW_COMMA_in_functionHeader370 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader373 = new BitSet(new long[]{0x0010000000082000L});
    public static final BitSet FOLLOW_CLOSEB_in_functionHeader379 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader384 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_functionHeader388 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionHeader405 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_ID_in_functionHeader408 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_functionHeader411 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader413 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionHeader419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term446 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_term449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_term451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term512 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_term515 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term525 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent554 = new BitSet(new long[]{0x0000000012000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent563 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_CARET_in_transponent568 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_term_in_transponent572 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent581 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent586 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_unary609 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_unary614 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_in_unary619 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_transponent_in_unary624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult632 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult637 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult642 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult647 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_STAR_in_mult652 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_SLASH_in_mult657 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult662 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_unary_in_mult666 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_mult_in_add678 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_add683 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_add688 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_mult_in_add692 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_colonEnd703 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_add_in_colonEnd705 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon724 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical755 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical760 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical765 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical770 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical775 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical780 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical785 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_colon_in_logical789 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd801 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd804 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_logical_in_eleAnd807 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr818 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr821 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr824 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd838 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleOr_in_scAnd841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_scAnd_in_scOr852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SC_OR_in_scOr855 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_scAnd_in_scOr858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_hCatVec881 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec885 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatVec889 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec912 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENB_in_vector934 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatVec_in_vector937 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell947 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell951 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatCell955 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell978 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENC_in_cellArray1001 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray1004 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line1048 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line1050 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_line1057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_line1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart1079 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_ifPart1082 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_ifPart1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart1093 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_elseifPart1098 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elseifPart1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart1111 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elsePart1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1127 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1137 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1148 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1217 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_switchPart1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1227 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_casePart1230 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_casePart1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1240 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1253 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1256 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1260 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1289 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1292 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1294 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_forPart1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1306 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_forBlock1309 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1336 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_whilePart1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1348 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_whileBlock1351 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1402 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_term_in_synpred2_Expr1040 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Expr1042 = new BitSet(new long[]{0x0000000000000002L});

}