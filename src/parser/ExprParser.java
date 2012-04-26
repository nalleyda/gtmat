// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g 2012-04-25 21:12:56

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
//x
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
        this.state.ruleMemo = new HashMap[44+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:75:1: start : prog EOF !;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:75:7: ( prog EOF !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:75:9: prog EOF !
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:1: prog : ( ( block )+ | ( functionHeader ! ( block )* ( BLOCK_END !)? ) );
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:7: ( ( block )+ | ( functionHeader ! ( block )* ( BLOCK_END !)? ) )
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:9: ( block )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:9: ( block )+
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
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:9: block
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:18: ( functionHeader ! ( block )* ( BLOCK_END !)? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:18: ( functionHeader ! ( block )* ( BLOCK_END !)? )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:19: functionHeader ! ( block )* ( BLOCK_END !)?
                    {
                    pushFollow(FOLLOW_functionHeader_in_prog223);
                    functionHeader4=functionHeader();

                    state._fsp--;
                    if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:35: ( block )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==COLON||LA2_0==DOT||(LA2_0 >= EMPTY_CELL && LA2_0 <= END)||(LA2_0 >= FALSE && LA2_0 <= FOR)||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==INTEGER||LA2_0==MINUS||LA2_0==NOT||(LA2_0 >= OPENB && LA2_0 <= OPENP)||LA2_0==PLUS||(LA2_0 >= STRING_LITERAL && LA2_0 <= SWITCH)||LA2_0==TRUE||LA2_0==WHILE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:35: block
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


                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:42: ( BLOCK_END !)?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BLOCK_END) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:77:43: BLOCK_END !
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs254);
            expr7=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:22: ( COMMA expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:23: COMMA expr
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
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:51: ( expr )*
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:1: functionCall : ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) ) ) ;
    public final ExprParser.functionCall_return functionCall() throws RecognitionException {
        ExprParser.functionCall_return retval = new ExprParser.functionCall_return();
        retval.start = input.LT(1);

        int functionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID10=null;
        Token OPENP11=null;
        Token CLOSEP13=null;
        Token OPENC14=null;
        Token CLOSEC16=null;
        ExprParser.functionArgs_return functionArgs12 =null;

        ExprParser.functionArgs_return functionArgs15 =null;


        CommonTree ID10_tree=null;
        CommonTree OPENP11_tree=null;
        CommonTree CLOSEP13_tree=null;
        CommonTree OPENC14_tree=null;
        CommonTree CLOSEC16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:15: ( ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:17: ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:17: ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:18: ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) )
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:40: ( ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:41: ID ^ ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? )
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_functionCall293); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID10_tree = 
            (CommonTree)adaptor.create(ID10)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID10_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:91:45: ( ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:17: ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )* ( OPENC ( functionArgs )? CLOSEC )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:17: ( ( OPENP !) ( functionArgs )? ( CLOSEP !) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OPENP) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:18: ( OPENP !) ( functionArgs )? ( CLOSEP !)
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:18: ( OPENP !)
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:19: OPENP !
            	    {
            	    OPENP11=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall302); if (state.failed) return retval;

            	    }


            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:27: ( functionArgs )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COLON||LA6_0==DOT||(LA6_0 >= EMPTY_CELL && LA6_0 <= END)||LA6_0==FALSE||LA6_0==ID||LA6_0==INTEGER||LA6_0==MINUS||LA6_0==NOT||(LA6_0 >= OPENB && LA6_0 <= OPENP)||LA6_0==PLUS||LA6_0==STRING_LITERAL||LA6_0==TRUE) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:27: functionArgs
            	            {
            	            pushFollow(FOLLOW_functionArgs_in_functionCall306);
            	            functionArgs12=functionArgs();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs12.getTree());

            	            }
            	            break;

            	    }


            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:41: ( CLOSEP !)
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:42: CLOSEP !
            	    {
            	    CLOSEP13=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall310); if (state.failed) return retval;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:53: ( OPENC ( functionArgs )? CLOSEC )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OPENC) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:54: OPENC ( functionArgs )? CLOSEC
                    {
                    OPENC14=(Token)match(input,OPENC,FOLLOW_OPENC_in_functionCall317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPENC14_tree = 
                    (CommonTree)adaptor.create(OPENC14)
                    ;
                    adaptor.addChild(root_0, OPENC14_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:60: ( functionArgs )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==COLON||LA8_0==DOT||(LA8_0 >= EMPTY_CELL && LA8_0 <= END)||LA8_0==FALSE||LA8_0==ID||LA8_0==INTEGER||LA8_0==MINUS||LA8_0==NOT||(LA8_0 >= OPENB && LA8_0 <= OPENP)||LA8_0==PLUS||LA8_0==STRING_LITERAL||LA8_0==TRUE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:92:60: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_functionCall319);
                            functionArgs15=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs15.getTree());

                            }
                            break;

                    }


                    CLOSEC16=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_functionCall322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSEC16_tree = 
                    (CommonTree)adaptor.create(CLOSEC16)
                    ;
                    adaptor.addChild(root_0, CLOSEC16_tree);
                    }

                    }
                    break;

            }


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


    public static class cellIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellIndex"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:97:1: cellIndex : ( ( ID OPENC )=> ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) ) ) ;
    public final ExprParser.cellIndex_return cellIndex() throws RecognitionException {
        ExprParser.cellIndex_return retval = new ExprParser.cellIndex_return();
        retval.start = input.LT(1);

        int cellIndex_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID17=null;
        Token OPENC18=null;
        Token CLOSEC20=null;
        ExprParser.functionArgs_return functionArgs19 =null;


        CommonTree ID17_tree=null;
        CommonTree OPENC18_tree=null;
        CommonTree CLOSEC20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:2: ( ( ( ID OPENC )=> ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:4: ( ( ID OPENC )=> ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:4: ( ( ID OPENC )=> ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:5: ( ID OPENC )=> ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) )
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:19: ( ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:20: ID ^ ( ( OPENC ! ( functionArgs )? CLOSEC !)? )
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_cellIndex354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID17_tree = 
            (CommonTree)adaptor.create(ID17)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID17_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:98:24: ( ( OPENC ! ( functionArgs )? CLOSEC !)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:17: ( OPENC ! ( functionArgs )? CLOSEC !)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:17: ( OPENC ! ( functionArgs )? CLOSEC !)?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OPENC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:18: OPENC ! ( functionArgs )? CLOSEC !
                    {
                    OPENC18=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellIndex362); if (state.failed) return retval;

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:25: ( functionArgs )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COLON||LA10_0==DOT||(LA10_0 >= EMPTY_CELL && LA10_0 <= END)||LA10_0==FALSE||LA10_0==ID||LA10_0==INTEGER||LA10_0==MINUS||LA10_0==NOT||(LA10_0 >= OPENB && LA10_0 <= OPENP)||LA10_0==PLUS||LA10_0==STRING_LITERAL||LA10_0==TRUE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:25: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_cellIndex365);
                            functionArgs19=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs19.getTree());

                            }
                            break;

                    }


                    CLOSEC20=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellIndex368); if (state.failed) return retval;

                    }
                    break;

            }


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
            if ( state.backtracking>0 ) { memoize(input, 5, cellIndex_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cellIndex"


    public static class functionCallOrStructure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCallOrStructure"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )? ;
    public final ExprParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        ExprParser.functionCallOrStructure_return retval = new ExprParser.functionCallOrStructure_return();
        retval.start = input.LT(1);

        int functionCallOrStructure_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT22=null;
        Token OPENP23=null;
        Token CLOSEP25=null;
        ExprParser.functionCall_return functionCall21 =null;

        ExprParser.expr_return expr24 =null;

        ExprParser.functionCall_return functionCall26 =null;


        CommonTree DOT22_tree=null;
        CommonTree OPENP23_tree=null;
        CommonTree CLOSEP25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:25: ( functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:27: functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure388);
            functionCall21=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall21.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:40: ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DOT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==ID||LA13_1==OPENP) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:41: DOT ^ ( OPENP expr CLOSEP | functionCall )
                    {
                    DOT22=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT22_tree = 
                    (CommonTree)adaptor.create(DOT22)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT22_tree, root_0);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:46: ( OPENP expr CLOSEP | functionCall )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==OPENP) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==ID) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:47: OPENP expr CLOSEP
                            {
                            OPENP23=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure395); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPENP23_tree = 
                            (CommonTree)adaptor.create(OPENP23)
                            ;
                            adaptor.addChild(root_0, OPENP23_tree);
                            }

                            pushFollow(FOLLOW_expr_in_functionCallOrStructure397);
                            expr24=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr24.getTree());

                            CLOSEP25=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure399); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSEP25_tree = 
                            (CommonTree)adaptor.create(CLOSEP25)
                            ;
                            adaptor.addChild(root_0, CLOSEP25_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:67: functionCall
                            {
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure403);
                            functionCall26=functionCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall26.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, functionCallOrStructure_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionCallOrStructure"


    public static class functionHeader_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionHeader"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:108:1: functionHeader : FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? ;
    public final ExprParser.functionHeader_return functionHeader() throws RecognitionException {
        ExprParser.functionHeader_return retval = new ExprParser.functionHeader_return();
        retval.start = input.LT(1);

        int functionHeader_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FUNCTION27=null;
        Token OPENB28=null;
        Token ID29=null;
        Token COMMA30=null;
        Token ID31=null;
        Token CLOSEB32=null;
        Token ID33=null;
        Token EQUALS34=null;
        Token ID35=null;
        Token OPENP36=null;
        Token ID37=null;
        Token COMMA38=null;
        Token ID39=null;
        Token CLOSEP40=null;

        CommonTree FUNCTION27_tree=null;
        CommonTree OPENB28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree COMMA30_tree=null;
        CommonTree ID31_tree=null;
        CommonTree CLOSEB32_tree=null;
        CommonTree ID33_tree=null;
        CommonTree EQUALS34_tree=null;
        CommonTree ID35_tree=null;
        CommonTree OPENP36_tree=null;
        CommonTree ID37_tree=null;
        CommonTree COMMA38_tree=null;
        CommonTree ID39_tree=null;
        CommonTree CLOSEP40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:108:16: ( FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:108:18: FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            {
            root_0 = (CommonTree)adaptor.nil();


            FUNCTION27=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionHeader415); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION27_tree = 
            (CommonTree)adaptor.create(FUNCTION27)
            ;
            adaptor.addChild(root_0, FUNCTION27_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:109:3: ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUALS||LA18_0==OPENB) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EQUALS) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OPENB) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==ID) ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            {
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:6: OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB
                            {
                            OPENB28=(Token)match(input,OPENB,FOLLOW_OPENB_in_functionHeader427); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPENB28_tree = 
                            (CommonTree)adaptor.create(OPENB28)
                            ;
                            adaptor.addChild(root_0, OPENB28_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:12: ( ID ( ( COMMA )? ID )* )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==ID) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:13: ID ( ( COMMA )? ID )*
                                    {
                                    ID29=(Token)match(input,ID,FOLLOW_ID_in_functionHeader430); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ID29_tree = 
                                    (CommonTree)adaptor.create(ID29)
                                    ;
                                    adaptor.addChild(root_0, ID29_tree);
                                    }

                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:16: ( ( COMMA )? ID )*
                                    loop15:
                                    do {
                                        int alt15=2;
                                        int LA15_0 = input.LA(1);

                                        if ( (LA15_0==COMMA||LA15_0==ID) ) {
                                            alt15=1;
                                        }


                                        switch (alt15) {
                                    	case 1 :
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:17: ( COMMA )? ID
                                    	    {
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:17: ( COMMA )?
                                    	    int alt14=2;
                                    	    int LA14_0 = input.LA(1);

                                    	    if ( (LA14_0==COMMA) ) {
                                    	        alt14=1;
                                    	    }
                                    	    switch (alt14) {
                                    	        case 1 :
                                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:17: COMMA
                                    	            {
                                    	            COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader433); if (state.failed) return retval;
                                    	            if ( state.backtracking==0 ) {
                                    	            COMMA30_tree = 
                                    	            (CommonTree)adaptor.create(COMMA30)
                                    	            ;
                                    	            adaptor.addChild(root_0, COMMA30_tree);
                                    	            }

                                    	            }
                                    	            break;

                                    	    }


                                    	    ID31=(Token)match(input,ID,FOLLOW_ID_in_functionHeader436); if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) {
                                    	    ID31_tree = 
                                    	    (CommonTree)adaptor.create(ID31)
                                    	    ;
                                    	    adaptor.addChild(root_0, ID31_tree);
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


                            CLOSEB32=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_functionHeader442); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSEB32_tree = 
                            (CommonTree)adaptor.create(CLOSEB32)
                            ;
                            adaptor.addChild(root_0, CLOSEB32_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:41: ID
                            {
                            ID33=(Token)match(input,ID,FOLLOW_ID_in_functionHeader447); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID33_tree = 
                            (CommonTree)adaptor.create(ID33)
                            ;
                            adaptor.addChild(root_0, ID33_tree);
                            }

                            }
                            break;

                    }


                    EQUALS34=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_functionHeader451); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS34_tree = 
                    (CommonTree)adaptor.create(EQUALS34)
                    ;
                    adaptor.addChild(root_0, EQUALS34_tree);
                    }

                    }
                    break;

            }


            }


            ID35=(Token)match(input,ID,FOLLOW_ID_in_functionHeader462); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID35_tree = 
            (CommonTree)adaptor.create(ID35)
            ;
            adaptor.addChild(root_0, ID35_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:3: ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OPENP) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==ID) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==COMMA) ) {
                        alt21=1;
                    }
                    else if ( (LA21_3==CLOSEP) ) {
                        alt21=1;
                    }
                }
                else if ( (LA21_1==CLOSEP) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:4: OPENP ( ID ( COMMA ID )* )? CLOSEP
                    {
                    OPENP36=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionHeader468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPENP36_tree = 
                    (CommonTree)adaptor.create(OPENP36)
                    ;
                    adaptor.addChild(root_0, OPENP36_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:10: ( ID ( COMMA ID )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:11: ID ( COMMA ID )*
                            {
                            ID37=(Token)match(input,ID,FOLLOW_ID_in_functionHeader471); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID37_tree = 
                            (CommonTree)adaptor.create(ID37)
                            ;
                            adaptor.addChild(root_0, ID37_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:14: ( COMMA ID )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==COMMA) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:113:15: COMMA ID
                            	    {
                            	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader474); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    COMMA38_tree = 
                            	    (CommonTree)adaptor.create(COMMA38)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA38_tree);
                            	    }

                            	    ID39=(Token)match(input,ID,FOLLOW_ID_in_functionHeader476); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    ID39_tree = 
                            	    (CommonTree)adaptor.create(ID39)
                            	    ;
                            	    adaptor.addChild(root_0, ID39_tree);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CLOSEP40=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionHeader482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSEP40_tree = 
                    (CommonTree)adaptor.create(CLOSEP40)
                    ;
                    adaptor.addChild(root_0, CLOSEP40_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 7, functionHeader_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionHeader"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:119:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER | functionCallOrStructure );
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);

        int term_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EMPTY_VEC41=null;
        Token EMPTY_CELL42=null;
        Token OPENP43=null;
        Token CLOSEP45=null;
        Token STRING_LITERAL46=null;
        Token END47=null;
        Token COLON50=null;
        Token TRUE51=null;
        Token FALSE52=null;
        Token INTEGER53=null;
        Token DOT54=null;
        Token INTEGER55=null;
        Token DOT56=null;
        Token INTEGER57=null;
        ExprParser.expr_return expr44 =null;

        ExprParser.vector_return vector48 =null;

        ExprParser.cellArray_return cellArray49 =null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure58 =null;


        CommonTree EMPTY_VEC41_tree=null;
        CommonTree EMPTY_CELL42_tree=null;
        CommonTree OPENP43_tree=null;
        CommonTree CLOSEP45_tree=null;
        CommonTree STRING_LITERAL46_tree=null;
        CommonTree END47_tree=null;
        CommonTree COLON50_tree=null;
        CommonTree TRUE51_tree=null;
        CommonTree FALSE52_tree=null;
        CommonTree INTEGER53_tree=null;
        CommonTree DOT54_tree=null;
        CommonTree INTEGER55_tree=null;
        CommonTree DOT56_tree=null;
        CommonTree INTEGER57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:119:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER | functionCallOrStructure )
            int alt23=13;
            switch ( input.LA(1) ) {
            case EMPTY_VEC:
                {
                alt23=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt23=2;
                }
                break;
            case OPENP:
                {
                alt23=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt23=4;
                }
                break;
            case END:
                {
                alt23=5;
                }
                break;
            case OPENB:
                {
                alt23=6;
                }
                break;
            case OPENC:
                {
                alt23=7;
                }
                break;
            case COLON:
                {
                alt23=8;
                }
                break;
            case TRUE:
                {
                alt23=9;
                }
                break;
            case FALSE:
                {
                alt23=10;
                }
                break;
            case INTEGER:
                {
                alt23=11;
                }
                break;
            case DOT:
                {
                alt23=12;
                }
                break;
            case ID:
                {
                alt23=13;
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:119:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_VEC41=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC41_tree = 
                    (CommonTree)adaptor.create(EMPTY_VEC41)
                    ;
                    adaptor.addChild(root_0, EMPTY_VEC41_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:120:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_CELL42=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL42_tree = 
                    (CommonTree)adaptor.create(EMPTY_CELL42)
                    ;
                    adaptor.addChild(root_0, EMPTY_CELL42_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP43=(Token)match(input,OPENP,FOLLOW_OPENP_in_term509); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term512);
                    expr44=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr44.getTree());

                    CLOSEP45=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term514); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL46=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL46_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL46)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL46_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:130:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END47=(Token)match(input,END,FOLLOW_END_in_term539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END47_tree = 
                    (CommonTree)adaptor.create(END47)
                    ;
                    adaptor.addChild(root_0, END47_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vector_in_term544);
                    vector48=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector48.getTree());

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:132:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cellArray_in_term549);
                    cellArray49=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray49.getTree());

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_term554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON50_tree = 
                    (CommonTree)adaptor.create(COLON50)
                    ;
                    adaptor.addChild(root_0, COLON50_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:134:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE51=(Token)match(input,TRUE,FOLLOW_TRUE_in_term559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE51_tree = 
                    (CommonTree)adaptor.create(TRUE51)
                    ;
                    adaptor.addChild(root_0, TRUE51_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE52=(Token)match(input,FALSE,FOLLOW_FALSE_in_term564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE52_tree = 
                    (CommonTree)adaptor.create(FALSE52)
                    ;
                    adaptor.addChild(root_0, FALSE52_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:4: INTEGER ( DOT ^ INTEGER )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER53=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER53_tree = 
                    (CommonTree)adaptor.create(INTEGER53)
                    ;
                    adaptor.addChild(root_0, INTEGER53_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:12: ( DOT ^ INTEGER )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==DOT) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==INTEGER) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:13: DOT ^ INTEGER
                            {
                            DOT54=(Token)match(input,DOT,FOLLOW_DOT_in_term574); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT54_tree = 
                            (CommonTree)adaptor.create(DOT54)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(DOT54_tree, root_0);
                            }

                            INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term577); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTEGER55_tree = 
                            (CommonTree)adaptor.create(INTEGER55)
                            ;
                            adaptor.addChild(root_0, INTEGER55_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:138:4: DOT ^ INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOT56=(Token)match(input,DOT,FOLLOW_DOT_in_term584); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT56_tree = 
                    (CommonTree)adaptor.create(DOT56)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT56_tree, root_0);
                    }

                    INTEGER57=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER57_tree = 
                    (CommonTree)adaptor.create(INTEGER57)
                    ;
                    adaptor.addChild(root_0, INTEGER57_tree);
                    }

                    }
                    break;
                case 13 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCallOrStructure_in_term592);
                    functionCallOrStructure58=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure58.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, term_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "term"


    public static class transponent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transponent"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:147:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET60=null;
        Token CARET61=null;
        Token SINGLE_QUOTE63=null;
        Token DOT_TRANSPOSE64=null;
        ExprParser.term_return term59 =null;

        ExprParser.term_return term62 =null;


        CommonTree DOT_CARET60_tree=null;
        CommonTree CARET61_tree=null;
        CommonTree SINGLE_QUOTE63_tree=null;
        CommonTree DOT_TRANSPOSE64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:153:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:153:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:153:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:153:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            pushFollow(FOLLOW_term_in_transponent618);
            term59=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term59.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:153:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt27=2;
            switch ( input.LA(1) ) {
            case CARET:
            case DOT_CARET:
                {
                alt27=1;
                }
                break;
            case DOT_STAR:
                {
                alt27=1;
                }
                break;
            case DOT_SLASH:
                {
                alt27=1;
                }
                break;
            case DOT_BACKSLASH:
                {
                alt27=1;
                }
                break;
            case STAR:
                {
                alt27=1;
                }
                break;
            case SLASH:
                {
                alt27=1;
                }
                break;
            case BACKSLASH:
                {
                alt27=1;
                }
                break;
            case PLUS:
                {
                alt27=1;
                }
                break;
            case MINUS:
                {
                alt27=1;
                }
                break;
            case LESS_THAN:
                {
                alt27=1;
                }
                break;
            case GREATER_THAN:
                {
                alt27=1;
                }
                break;
            case LESS_EQUAL:
                {
                alt27=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt27=1;
                }
                break;
            case ISEQUAL:
                {
                alt27=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt27=1;
                }
                break;
            case ELE_AND:
                {
                alt27=1;
                }
                break;
            case ELE_OR:
                {
                alt27=1;
                }
                break;
            case SC_AND:
                {
                alt27=1;
                }
                break;
            case SC_OR:
                {
                alt27=1;
                }
                break;
            case COMMA:
                {
                alt27=1;
                }
                break;
            case CLOSEP:
                {
                alt27=1;
                }
                break;
            case CLOSEC:
                {
                alt27=1;
                }
                break;
            case NOT:
                {
                alt27=1;
                }
                break;
            case EMPTY_VEC:
                {
                alt27=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt27=1;
                }
                break;
            case OPENP:
                {
                alt27=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt27=1;
                }
                break;
            case END:
                {
                alt27=1;
                }
                break;
            case OPENB:
                {
                alt27=1;
                }
                break;
            case OPENC:
                {
                alt27=1;
                }
                break;
            case COLON:
                {
                alt27=1;
                }
                break;
            case TRUE:
                {
                alt27=1;
                }
                break;
            case FALSE:
                {
                alt27=1;
                }
                break;
            case INTEGER:
                {
                alt27=1;
                }
                break;
            case DOT:
                {
                alt27=1;
                }
                break;
            case ID:
                {
                alt27=1;
                }
                break;
            case SEMI:
                {
                alt27=1;
                }
                break;
            case CLOSEB:
                {
                alt27=1;
                }
                break;
            case EOF:
                {
                alt27=1;
                }
                break;
            case IF:
                {
                alt27=1;
                }
                break;
            case SWITCH:
                {
                alt27=1;
                }
                break;
            case FOR:
                {
                alt27=1;
                }
                break;
            case WHILE:
                {
                alt27=1;
                }
                break;
            case BLOCK_END:
                {
                alt27=1;
                }
                break;
            case ELSEIF:
                {
                alt27=1;
                }
                break;
            case ELSE:
                {
                alt27=1;
                }
                break;
            case OTHERWISE:
                {
                alt27=1;
                }
                break;
            case CASE:
                {
                alt27=1;
                }
                break;
            case DOT_TRANSPOSE:
            case SINGLE_QUOTE:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:3: ( ( DOT_CARET ^| CARET ^) term )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==CARET||LA25_0==DOT_CARET) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:5: ( DOT_CARET ^| CARET ^)
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==DOT_CARET) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==CARET) ) {
                    	        alt24=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 24, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:6: DOT_CARET ^
                    	            {
                    	            DOT_CARET60=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent627); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET60_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET60_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:19: CARET ^
                    	            {
                    	            CARET61=(Token)match(input,CARET,FOLLOW_CARET_in_transponent632); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET61_tree = 
                    	            (CommonTree)adaptor.create(CARET61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET61_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_term_in_transponent636);
                    	    term62=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:155:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:155:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==SINGLE_QUOTE) ) {
                            alt26=1;
                        }
                        else if ( (LA26_0==DOT_TRANSPOSE) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:155:6: SINGLE_QUOTE ^
                    	    {
                    	    SINGLE_QUOTE63=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent645); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE63_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE63)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE63_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:155:22: DOT_TRANSPOSE ^
                    	    {
                    	    DOT_TRANSPOSE64=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent650); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE64_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE64)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE64_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
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
            if ( state.backtracking>0 ) { memoize(input, 9, transponent_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "transponent"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS65=null;
        Token MINUS66=null;
        Token NOT67=null;
        ExprParser.transponent_return transponent68 =null;


        CommonTree PLUS65_tree=null;
        CommonTree MINUS66_tree=null;
        CommonTree NOT67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:9: ( PLUS !| MINUS ^| NOT ^)*
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt28=1;
                    }
                    break;
                case MINUS:
                    {
                    alt28=2;
                    }
                    break;
                case NOT:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:10: PLUS !
            	    {
            	    PLUS65=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary673); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:18: MINUS ^
            	    {
            	    MINUS66=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary678); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS66_tree = 
            	    (CommonTree)adaptor.create(MINUS66)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS66_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:27: NOT ^
            	    {
            	    NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_unary683); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT67_tree = 
            	    (CommonTree)adaptor.create(NOT67)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT67_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary688);
            transponent68=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent68.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, unary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR70=null;
        Token DOT_SLASH71=null;
        Token DOT_BACKSLASH72=null;
        Token STAR73=null;
        Token SLASH74=null;
        Token BACKSLASH75=null;
        ExprParser.unary_return unary69 =null;

        ExprParser.unary_return unary76 =null;


        CommonTree DOT_STAR70_tree=null;
        CommonTree DOT_SLASH71_tree=null;
        CommonTree DOT_BACKSLASH72_tree=null;
        CommonTree STAR73_tree=null;
        CommonTree SLASH74_tree=null;
        CommonTree BACKSLASH75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult696);
            unary69=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary69.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==BACKSLASH||LA30_0==DOT_BACKSLASH||(LA30_0 >= DOT_SLASH && LA30_0 <= DOT_STAR)||LA30_0==SLASH||LA30_0==STAR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt29=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt29=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt29=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:17: DOT_STAR ^
            	            {
            	            DOT_STAR70=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult701); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR70_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR70)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:29: DOT_SLASH ^
            	            {
            	            DOT_SLASH71=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult706); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH71_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH71)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH71_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:42: DOT_BACKSLASH ^
            	            {
            	            DOT_BACKSLASH72=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult711); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH72_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH72)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:59: STAR ^
            	            {
            	            STAR73=(Token)match(input,STAR,FOLLOW_STAR_in_mult716); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR73_tree = 
            	            (CommonTree)adaptor.create(STAR73)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:67: SLASH ^
            	            {
            	            SLASH74=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult721); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH74_tree = 
            	            (CommonTree)adaptor.create(SLASH74)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:76: BACKSLASH ^
            	            {
            	            BACKSLASH75=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult726); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH75_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH75)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult730);
            	    unary76=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary76.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            if ( state.backtracking>0 ) { memoize(input, 11, mult_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS78=null;
        Token MINUS79=null;
        ExprParser.mult_return mult77 =null;

        ExprParser.mult_return mult80 =null;


        CommonTree PLUS78_tree=null;
        CommonTree MINUS79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add742);
            mult77=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult77.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:12: ( ( PLUS ^| MINUS ^) mult )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PLUS) ) {
                    alt32=1;
                }
                else if ( (LA32_0==MINUS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:14: ( PLUS ^| MINUS ^)
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==PLUS) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==MINUS) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:15: PLUS ^
            	            {
            	            PLUS78=(Token)match(input,PLUS,FOLLOW_PLUS_in_add747); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS78_tree = 
            	            (CommonTree)adaptor.create(PLUS78)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS78_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:23: MINUS ^
            	            {
            	            MINUS79=(Token)match(input,MINUS,FOLLOW_MINUS_in_add752); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS79_tree = 
            	            (CommonTree)adaptor.create(MINUS79)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS79_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add756);
            	    mult80=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult80.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, add_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "add"


    public static class colonEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colonEnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON81=null;
        ExprParser.add_return add82 =null;


        CommonTree COLON81_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:11: ( COLON add )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COLON) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:12: COLON add
            	    {
            	    COLON81=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd767); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON81);


            	    pushFollow(FOLLOW_add_in_colonEnd769);
            	    add82=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add82.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
            // 165:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:27: ^( COLON_ARGS ( add )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 13, colonEnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colonEnd"


    public static class colon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colon"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:1: colon : add ( colonEnd ^)? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.add_return add83 =null;

        ExprParser.colonEnd_return colonEnd84 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:7: ( add ( colonEnd ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_colon788);
            add83=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add83.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:13: ( colonEnd ^)?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COLON) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:14: colonEnd ^
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon791);
                    colonEnd84=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd84.getTree(), root_0);

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
            if ( state.backtracking>0 ) { memoize(input, 14, colon_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "colon"


    public static class logical_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN86=null;
        Token GREATER_THAN87=null;
        Token LESS_EQUAL88=null;
        Token GREATER_EQUAL89=null;
        Token ISEQUAL90=null;
        Token NOT_EQUAL91=null;
        ExprParser.colon_return colon85 =null;

        ExprParser.colon_return colon92 =null;


        CommonTree LESS_THAN86_tree=null;
        CommonTree GREATER_THAN87_tree=null;
        CommonTree LESS_EQUAL88_tree=null;
        CommonTree GREATER_EQUAL89_tree=null;
        CommonTree ISEQUAL90_tree=null;
        CommonTree NOT_EQUAL91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_logical819);
            colon85=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon85.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==GREATER_EQUAL||LA36_0==GREATER_THAN||(LA36_0 >= ISEQUAL && LA36_0 <= LESS_THAN)||LA36_0==NOT_EQUAL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt35=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt35=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt35=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:20: LESS_THAN ^
            	            {
            	            LESS_THAN86=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical824); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN86_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN86)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN86_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:33: GREATER_THAN ^
            	            {
            	            GREATER_THAN87=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical829); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN87_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN87)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:49: LESS_EQUAL ^
            	            {
            	            LESS_EQUAL88=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical834); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL88_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL88)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL88_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:63: GREATER_EQUAL ^
            	            {
            	            GREATER_EQUAL89=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical839); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL89_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL89)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:80: ISEQUAL ^
            	            {
            	            ISEQUAL90=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical844); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL90_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL90)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL90_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:178:91: NOT_EQUAL ^
            	            {
            	            NOT_EQUAL91=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical849); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL91_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL91)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL91_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_logical853);
            	    colon92=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon92.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, logical_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical"


    public static class eleAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:180:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND94=null;
        ExprParser.logical_return logical93 =null;

        ExprParser.logical_return logical95 =null;


        CommonTree ELE_AND94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:180:8: ( logical ( ELE_AND ^ logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:180:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logical_in_eleAnd865);
            logical93=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical93.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:180:18: ( ELE_AND ^ logical )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ELE_AND) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:180:19: ELE_AND ^ logical
            	    {
            	    ELE_AND94=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd868); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND94_tree = 
            	    (CommonTree)adaptor.create(ELE_AND94)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND94_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_in_eleAnd871);
            	    logical95=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical95.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
            if ( state.backtracking>0 ) { memoize(input, 16, eleAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleAnd"


    public static class eleOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR97=null;
        ExprParser.eleAnd_return eleAnd96 =null;

        ExprParser.eleAnd_return eleAnd98 =null;


        CommonTree ELE_OR97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr882);
            eleAnd96=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd96.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:16: ( ELE_OR ^ eleAnd )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ELE_OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:17: ELE_OR ^ eleAnd
            	    {
            	    ELE_OR97=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr885); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR97_tree = 
            	    (CommonTree)adaptor.create(ELE_OR97)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR97_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleAnd_in_eleOr888);
            	    eleAnd98=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd98.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            if ( state.backtracking>0 ) { memoize(input, 17, eleOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "eleOr"


    public static class scAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND100=null;
        ExprParser.eleOr_return eleOr99 =null;

        ExprParser.eleOr_return eleOr101 =null;


        CommonTree SC_AND100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:7: ( eleOr ( SC_AND ^ eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd899);
            eleOr99=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr99.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:15: ( SC_AND ^ eleOr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SC_AND) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:16: SC_AND ^ eleOr
            	    {
            	    SC_AND100=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd902); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND100_tree = 
            	    (CommonTree)adaptor.create(SC_AND100)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND100_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleOr_in_scAnd905);
            	    eleOr101=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr101.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
            if ( state.backtracking>0 ) { memoize(input, 18, scAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scAnd"


    public static class scOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:186:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR103=null;
        ExprParser.scAnd_return scAnd102 =null;

        ExprParser.scAnd_return scAnd104 =null;


        CommonTree SC_OR103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:186:6: ( scAnd ( SC_OR ^ scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:186:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr916);
            scAnd102=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd102.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:186:14: ( SC_OR ^ scAnd )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SC_OR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:186:15: SC_OR ^ scAnd
            	    {
            	    SC_OR103=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr919); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR103_tree = 
            	    (CommonTree)adaptor.create(SC_OR103)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR103_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_scAnd_in_scOr922);
            	    scAnd104=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd104.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 19, scOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "scOr"


    public static class hCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA106=null;
        ExprParser.expr_return expr105 =null;

        ExprParser.expr_return expr107 =null;


        CommonTree COMMA106_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec945);
            expr105=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:16: ( ( COMMA )? expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COLON||LA42_0==COMMA||LA42_0==DOT||(LA42_0 >= EMPTY_CELL && LA42_0 <= END)||LA42_0==FALSE||LA42_0==ID||LA42_0==INTEGER||LA42_0==MINUS||LA42_0==NOT||(LA42_0 >= OPENB && LA42_0 <= OPENP)||LA42_0==PLUS||LA42_0==STRING_LITERAL||LA42_0==TRUE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:17: ( COMMA )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==COMMA) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:18: COMMA
            	            {
            	            COMMA106=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec949); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA106);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatVec953);
            	    expr107=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr107.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
            // 200:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:200:36: ^( HCAT_VEC ( expr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 20, hCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatVec"


    public static class vCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI109=null;
        ExprParser.hCatVec_return hCatVec108 =null;

        ExprParser.hCatVec_return hCatVec110 =null;


        CommonTree SEMI109_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec972);
            hCatVec108=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec108.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:19: ( ( SEMI ) hCatVec )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==SEMI) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:21: SEMI
            	    {
            	    SEMI109=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec976); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI109);


            	    }


            	    pushFollow(FOLLOW_hCatVec_in_vCatVec979);
            	    hCatVec110=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec110.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
            // 202:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:202:40: ^( VCAT_VEC ( hCatVec )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 21, vCatVec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatVec"


    public static class vector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vector"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:204:1: vector : OPENB ! vCatVec CLOSEB !;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB111=null;
        Token CLOSEB113=null;
        ExprParser.vCatVec_return vCatVec112 =null;


        CommonTree OPENB111_tree=null;
        CommonTree CLOSEB113_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:204:8: ( OPENB ! vCatVec CLOSEB !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:204:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENB111=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector998); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatVec_in_vector1001);
            vCatVec112=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec112.getTree());

            CLOSEB113=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector1003); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 22, vector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vector"


    public static class hCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA115=null;
        ExprParser.expr_return expr114 =null;

        ExprParser.expr_return expr116 =null;


        CommonTree COMMA115_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell1011);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:16: ( ( COMMA )? expr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COLON||LA45_0==COMMA||LA45_0==DOT||(LA45_0 >= EMPTY_CELL && LA45_0 <= END)||LA45_0==FALSE||LA45_0==ID||LA45_0==INTEGER||LA45_0==MINUS||LA45_0==NOT||(LA45_0 >= OPENB && LA45_0 <= OPENP)||LA45_0==PLUS||LA45_0==STRING_LITERAL||LA45_0==TRUE) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:17: ( COMMA )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==COMMA) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:18: COMMA
            	            {
            	            COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell1015); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA115);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatCell1019);
            	    expr116=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
            // 206:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:206:37: ^( HCAT_CELL ( expr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 23, hCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "hCatCell"


    public static class vCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI118=null;
        ExprParser.hCatCell_return hCatCell117 =null;

        ExprParser.hCatCell_return hCatCell119 =null;


        CommonTree SEMI118_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell1038);
            hCatCell117=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell117.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:20: ( ( SEMI ) ! hCatCell )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SEMI) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:21: ( SEMI ) ! hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:22: SEMI
            	    {
            	    SEMI118=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell1042); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI118);


            	    }


            	    pushFollow(FOLLOW_hCatCell_in_vCatCell1046);
            	    hCatCell119=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell119.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
            // 208:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:208:43: ^( VCAT_CELL ( hCatCell )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 24, vCatCell_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "vCatCell"


    public static class cellArray_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellArray"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:210:1: cellArray : OPENC ! ( vCatCell )? CLOSEC !;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC120=null;
        Token CLOSEC122=null;
        ExprParser.vCatCell_return vCatCell121 =null;


        CommonTree OPENC120_tree=null;
        CommonTree CLOSEC122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:210:11: ( OPENC ! ( vCatCell )? CLOSEC !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:210:13: OPENC ! ( vCatCell )? CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENC120=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray1065); if (state.failed) return retval;

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:210:20: ( vCatCell )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COLON||LA47_0==DOT||(LA47_0 >= EMPTY_CELL && LA47_0 <= END)||LA47_0==FALSE||LA47_0==ID||LA47_0==INTEGER||LA47_0==MINUS||LA47_0==NOT||(LA47_0 >= OPENB && LA47_0 <= OPENP)||LA47_0==PLUS||LA47_0==STRING_LITERAL||LA47_0==TRUE) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:210:20: vCatCell
                    {
                    pushFollow(FOLLOW_vCatCell_in_cellArray1068);
                    vCatCell121=vCatCell();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell121.getTree());

                    }
                    break;

            }


            CLOSEC122=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray1071); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 25, cellArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cellArray"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:212:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.scOr_return scOr123 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:212:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:212:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scOr_in_expr1084);
            scOr123=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr123.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS125=null;
        Token SEMI127=null;
        ExprParser.term_return term124 =null;

        ExprParser.expr_return expr126 =null;


        CommonTree EQUALS125_tree=null;
        CommonTree SEMI127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:29: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:29: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA48_1 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA48_3 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA48_4 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA48_5 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA48_6 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA48_7 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA48_8 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case TRUE:
                    {
                    int LA48_9 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case FALSE:
                    {
                    int LA48_10 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case INTEGER:
                    {
                    int LA48_11 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case DOT:
                    {
                    int LA48_12 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA48_13 = input.LA(2);

                    if ( (synpred3_Expr()) ) {
                        alt48=1;
                    }
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:30: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:47: ( term EQUALS ^)
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:48: term EQUALS ^
                    {
                    pushFollow(FOLLOW_term_in_line1113);
                    term124=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term124.getTree());

                    EQUALS125=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line1115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS125_tree = 
                    (CommonTree)adaptor.create(EQUALS125)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS125_tree, root_0);
                    }

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_line1122);
            expr126=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr126.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:221:7: ( SEMI ^)?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==SEMI) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:221:8: SEMI ^
                    {
                    SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_line1125); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI127_tree = 
                    (CommonTree)adaptor.create(SEMI127)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SEMI127_tree, root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 27, line_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line"


    public static class ifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:228:1: ifPart : IF ^ expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF128=null;
        ExprParser.expr_return expr129 =null;

        ExprParser.block_return block130 =null;


        CommonTree IF128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:228:8: ( IF ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:228:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF128=(Token)match(input,IF,FOLLOW_IF_in_ifPart1144); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF128_tree = 
            (CommonTree)adaptor.create(IF128)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF128_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifPart1147);
            expr129=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr129.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:228:19: ( block )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON||LA50_0==DOT||(LA50_0 >= EMPTY_CELL && LA50_0 <= END)||(LA50_0 >= FALSE && LA50_0 <= FOR)||(LA50_0 >= ID && LA50_0 <= IF)||LA50_0==INTEGER||LA50_0==MINUS||LA50_0==NOT||(LA50_0 >= OPENB && LA50_0 <= OPENP)||LA50_0==PLUS||(LA50_0 >= STRING_LITERAL && LA50_0 <= SWITCH)||LA50_0==TRUE||LA50_0==WHILE) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:228:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart1149);
                    block130=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block130.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, ifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifPart"


    public static class elseifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF131=null;
        ExprParser.expr_return e2 =null;

        ExprParser.block_return b2 =null;


        CommonTree ELSEIF131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:14: ( ELSEIF ^e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:15: ELSEIF ^e2= expr (b2= block )?
            {
            ELSEIF131=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart1158); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF131_tree = 
            (CommonTree)adaptor.create(ELSEIF131)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF131_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_elseifPart1163);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:33: (b2= block )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON||LA51_0==DOT||(LA51_0 >= EMPTY_CELL && LA51_0 <= END)||(LA51_0 >= FALSE && LA51_0 <= FOR)||(LA51_0 >= ID && LA51_0 <= IF)||LA51_0==INTEGER||LA51_0==MINUS||LA51_0==NOT||(LA51_0 >= OPENB && LA51_0 <= OPENP)||LA51_0==PLUS||(LA51_0 >= STRING_LITERAL && LA51_0 <= SWITCH)||LA51_0==TRUE||LA51_0==WHILE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:229:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart1167);
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
            if ( state.backtracking>0 ) { memoize(input, 29, elseifPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elseifPart"


    public static class elsePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE132=null;
        ExprParser.block_return b3 =null;


        CommonTree ELSE132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:10: ( ( ELSE ^ (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:11: ( ELSE ^ (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:12: ELSE ^ (b3= block )?
            {
            ELSE132=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart1176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE132_tree = 
            (CommonTree)adaptor.create(ELSE132)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE132_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:20: (b3= block )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COLON||LA52_0==DOT||(LA52_0 >= EMPTY_CELL && LA52_0 <= END)||(LA52_0 >= FALSE && LA52_0 <= FOR)||(LA52_0 >= ID && LA52_0 <= IF)||LA52_0==INTEGER||LA52_0==MINUS||LA52_0==NOT||(LA52_0 >= OPENB && LA52_0 <= OPENP)||LA52_0==PLUS||(LA52_0 >= STRING_LITERAL && LA52_0 <= SWITCH)||LA52_0==TRUE||LA52_0==WHILE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:230:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart1181);
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
            if ( state.backtracking>0 ) { memoize(input, 30, elsePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elsePart"


    public static class ifBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:231:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END136=null;
        ExprParser.ifPart_return ifPart133 =null;

        ExprParser.elseifPart_return elseifPart134 =null;

        ExprParser.elsePart_return elsePart135 =null;


        CommonTree BLOCK_END136_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:231:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:232:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock1192);
            ifPart133=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart133.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:233:9: ( elseifPart )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==ELSEIF) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:233:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1202);
            	    elseifPart134=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart134.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:234:9: ( elsePart )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ELSE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:234:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1213);
                    elsePart135=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart135.getTree());

                    }
                    break;

            }


            BLOCK_END136=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END136);


            // AST REWRITE
            // elements: elsePart, elseifPart, ifPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:236:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:236:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:236:41: ( elsePart )?
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
            if ( state.backtracking>0 ) { memoize(input, 31, ifBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifBlock"


    public static class switchPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:241:1: switchPart : SWITCH ^ expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH137=null;
        ExprParser.expr_return expr138 =null;


        CommonTree SWITCH137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:241:12: ( SWITCH ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:241:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH137=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH137_tree = 
            (CommonTree)adaptor.create(SWITCH137)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH137_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_switchPart1285);
            expr138=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, switchPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchPart"


    public static class casePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:242:1: casePart : CASE ^ expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE139=null;
        ExprParser.expr_return expr140 =null;

        ExprParser.block_return block141 =null;


        CommonTree CASE139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:242:10: ( CASE ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:242:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE139=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1292); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE139_tree = 
            (CommonTree)adaptor.create(CASE139)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE139_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_casePart1295);
            expr140=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr140.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:242:23: ( block )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COLON||LA55_0==DOT||(LA55_0 >= EMPTY_CELL && LA55_0 <= END)||(LA55_0 >= FALSE && LA55_0 <= FOR)||(LA55_0 >= ID && LA55_0 <= IF)||LA55_0==INTEGER||LA55_0==MINUS||LA55_0==NOT||(LA55_0 >= OPENB && LA55_0 <= OPENP)||LA55_0==PLUS||(LA55_0 >= STRING_LITERAL && LA55_0 <= SWITCH)||LA55_0==TRUE||LA55_0==WHILE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:242:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1297);
                    block141=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block141.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, casePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "casePart"


    public static class otherwiseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "otherwiseBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:243:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE142=null;
        ExprParser.block_return block143 =null;


        CommonTree OTHERWISE142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:243:16: ( OTHERWISE ^ ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:243:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE142=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1305); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE142_tree = 
            (CommonTree)adaptor.create(OTHERWISE142)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE142_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:243:29: ( block )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON||LA56_0==DOT||(LA56_0 >= EMPTY_CELL && LA56_0 <= END)||(LA56_0 >= FALSE && LA56_0 <= FOR)||(LA56_0 >= ID && LA56_0 <= IF)||LA56_0==INTEGER||LA56_0==MINUS||LA56_0==NOT||(LA56_0 >= OPENB && LA56_0 <= OPENP)||LA56_0==PLUS||(LA56_0 >= STRING_LITERAL && LA56_0 <= SWITCH)||LA56_0==TRUE||LA56_0==WHILE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:243:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1308);
                    block143=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block143.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, otherwiseBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "otherwiseBlock"


    public static class switchBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:244:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END147=null;
        ExprParser.switchPart_return switchPart144 =null;

        ExprParser.casePart_return casePart145 =null;

        ExprParser.otherwiseBlock_return otherwiseBlock146 =null;


        CommonTree BLOCK_END147_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:244:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:245:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1318);
            switchPart144=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart144.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:246:2: ( casePart )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==CASE) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:246:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1321);
            	    casePart145=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart145.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:247:2: ( otherwiseBlock )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==OTHERWISE) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:247:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1325);
                    otherwiseBlock146=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock146.getTree());

                    }
                    break;

            }


            BLOCK_END147=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END147);


            // AST REWRITE
            // elements: casePart, switchPart, otherwiseBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 249:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:249:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:249:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:249:40: ( otherwiseBlock )?
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
            if ( state.backtracking>0 ) { memoize(input, 35, switchBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchBlock"


    public static class forPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:252:1: forPart : FOR ^ ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR148=null;
        Token ID149=null;
        Token EQUALS150=null;
        ExprParser.expr_return expr151 =null;


        CommonTree FOR148_tree=null;
        CommonTree ID149_tree=null;
        CommonTree EQUALS150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:252:9: ( FOR ^ ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:252:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR148=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR148_tree = 
            (CommonTree)adaptor.create(FOR148)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR148_tree, root_0);
            }

            ID149=(Token)match(input,ID,FOLLOW_ID_in_forPart1357); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID149_tree = 
            (CommonTree)adaptor.create(ID149)
            ;
            adaptor.addChild(root_0, ID149_tree);
            }

            EQUALS150=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS150_tree = 
            (CommonTree)adaptor.create(EQUALS150)
            ;
            adaptor.addChild(root_0, EQUALS150_tree);
            }

            pushFollow(FOLLOW_expr_in_forPart1361);
            expr151=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr151.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, forPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forPart"


    public static class forBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:253:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END154=null;
        ExprParser.forPart_return forPart152 =null;

        ExprParser.block_return block153 =null;


        CommonTree BLOCK_END154_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:253:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:254:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1371);
            forPart152=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart152.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:255:2: ( block )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COLON||LA59_0==DOT||(LA59_0 >= EMPTY_CELL && LA59_0 <= END)||(LA59_0 >= FALSE && LA59_0 <= FOR)||(LA59_0 >= ID && LA59_0 <= IF)||LA59_0==INTEGER||LA59_0==MINUS||LA59_0==NOT||(LA59_0 >= OPENB && LA59_0 <= OPENP)||LA59_0==PLUS||(LA59_0 >= STRING_LITERAL && LA59_0 <= SWITCH)||LA59_0==TRUE||LA59_0==WHILE) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:255:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1374);
                    block153=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block153.getTree());

                    }
                    break;

            }


            BLOCK_END154=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END154);


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
            // 257:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:257:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:257:24: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 37, forBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forBlock"


    public static class whilePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:260:1: whilePart : WHILE ^ expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE155=null;
        ExprParser.expr_return expr156 =null;


        CommonTree WHILE155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:260:11: ( WHILE ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:260:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE155=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1401); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE155_tree = 
            (CommonTree)adaptor.create(WHILE155)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE155_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whilePart1404);
            expr156=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr156.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, whilePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whilePart"


    public static class whileBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:261:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END159=null;
        ExprParser.whilePart_return whilePart157 =null;

        ExprParser.block_return block158 =null;


        CommonTree BLOCK_END159_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:261:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:262:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1413);
            whilePart157=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart157.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:263:2: ( block )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COLON||LA60_0==DOT||(LA60_0 >= EMPTY_CELL && LA60_0 <= END)||(LA60_0 >= FALSE && LA60_0 <= FOR)||(LA60_0 >= ID && LA60_0 <= IF)||LA60_0==INTEGER||LA60_0==MINUS||LA60_0==NOT||(LA60_0 >= OPENB && LA60_0 <= OPENP)||LA60_0==PLUS||(LA60_0 >= STRING_LITERAL && LA60_0 <= SWITCH)||LA60_0==TRUE||LA60_0==WHILE) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:263:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1416);
                    block158=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block158.getTree());

                    }
                    break;

            }


            BLOCK_END159=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END159);


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
            // 265:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:265:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:265:28: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 39, whileBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileBlock"


    public static class blockPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock160 =null;

        ExprParser.switchBlock_return switchBlock161 =null;

        ExprParser.forBlock_return forBlock162 =null;

        ExprParser.whileBlock_return whileBlock163 =null;

        ExprParser.line_return line164 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt61=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt61=1;
                }
                break;
            case SWITCH:
                {
                alt61=2;
                }
                break;
            case FOR:
                {
                alt61=3;
                }
                break;
            case WHILE:
                {
                alt61=4;
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
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1443);
                    ifBlock160=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock160.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1447);
                    switchBlock161=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock161.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1451);
                    forBlock162=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock162.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1455);
                    whileBlock163=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock163.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:268:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1459);
                    line164=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line164.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, blockPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockPart"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart165 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:9: ( blockPart )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                switch ( input.LA(1) ) {
                case IF:
                    {
                    alt62=1;
                    }
                    break;
                case SWITCH:
                    {
                    alt62=1;
                    }
                    break;
                case FOR:
                    {
                    alt62=1;
                    }
                    break;
                case WHILE:
                    {
                    alt62=1;
                    }
                    break;
                case EMPTY_VEC:
                    {
                    alt62=1;
                    }
                    break;
                case EMPTY_CELL:
                    {
                    alt62=1;
                    }
                    break;
                case OPENP:
                    {
                    alt62=1;
                    }
                    break;
                case STRING_LITERAL:
                    {
                    alt62=1;
                    }
                    break;
                case END:
                    {
                    alt62=1;
                    }
                    break;
                case OPENB:
                    {
                    alt62=1;
                    }
                    break;
                case OPENC:
                    {
                    alt62=1;
                    }
                    break;
                case COLON:
                    {
                    alt62=1;
                    }
                    break;
                case TRUE:
                    {
                    alt62=1;
                    }
                    break;
                case FALSE:
                    {
                    alt62=1;
                    }
                    break;
                case INTEGER:
                    {
                    alt62=1;
                    }
                    break;
                case DOT:
                    {
                    alt62=1;
                    }
                    break;
                case ID:
                    {
                    alt62=1;
                    }
                    break;
                case PLUS:
                    {
                    alt62=1;
                    }
                    break;
                case MINUS:
                    {
                    alt62=1;
                    }
                    break;
                case NOT:
                    {
                    alt62=1;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1467);
            	    blockPart165=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart165.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
            // 269:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:269:23: ^( BLOCK ( blockPart )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 41, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"

    // $ANTLR start synpred3_Expr
    public final void synpred3_Expr_fragment() throws RecognitionException {
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:30: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:220:31: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred3_Expr1105);
        term();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS,FOLLOW_EQUALS_in_synpred3_Expr1107); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Expr

    // Delegated rules

    public final boolean synpred3_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Expr_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ID_in_functionCall293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_OPENP_in_functionCall302 = new BitSet(new long[]{0x5090023800828000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall306 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_OPENC_in_functionCall317 = new BitSet(new long[]{0x5090023800824000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall319 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_functionCall322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_cellIndex354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OPENC_in_cellIndex362 = new BitSet(new long[]{0x5090023800824000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_cellIndex365 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellIndex368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure388 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure391 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure395 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure397 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionHeader415 = new BitSet(new long[]{0x0010004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OPENB_in_functionHeader427 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_ID_in_functionHeader430 = new BitSet(new long[]{0x0010000000082000L});
    public static final BitSet FOLLOW_COMMA_in_functionHeader433 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader436 = new BitSet(new long[]{0x0010000000082000L});
    public static final BitSet FOLLOW_CLOSEB_in_functionHeader442 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader447 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_functionHeader451 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionHeader468 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_ID_in_functionHeader471 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_functionHeader474 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_functionHeader476 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionHeader482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term509 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_term512 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_term514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term571 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_term574 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term584 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent618 = new BitSet(new long[]{0x0000000012000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent627 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_CARET_in_transponent632 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_term_in_transponent636 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent645 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent650 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_unary673 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_unary678 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_in_unary683 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_transponent_in_unary688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult696 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult701 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult706 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult711 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_STAR_in_mult716 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_SLASH_in_mult721 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult726 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_unary_in_mult730 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_mult_in_add742 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_add747 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_add752 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_mult_in_add756 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_colonEnd767 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_add_in_colonEnd769 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon788 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical819 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical824 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical829 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical834 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical839 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical844 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical849 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_colon_in_logical853 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd865 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd868 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_logical_in_eleAnd871 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr882 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr885 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr888 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd902 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleOr_in_scAnd905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_scAnd_in_scOr916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SC_OR_in_scOr919 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_scAnd_in_scOr922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_hCatVec945 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec949 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatVec953 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec976 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENB_in_vector998 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatVec_in_vector1001 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell1011 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell1015 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatCell1019 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell1038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell1042 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell1046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENC_in_cellArray1065 = new BitSet(new long[]{0x5090023800824000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray1068 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line1113 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line1115 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_line1122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_line1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart1144 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_ifPart1147 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_ifPart1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart1158 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_elseifPart1163 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elseifPart1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart1176 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elsePart1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1192 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1202 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1282 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_switchPart1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1292 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_casePart1295 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_casePart1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1305 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1318 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1321 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1325 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1354 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1357 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1359 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_forPart1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1371 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_forBlock1374 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1401 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_whilePart1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1413 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_whileBlock1416 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1467 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_term_in_synpred3_Expr1105 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred3_Expr1107 = new BitSet(new long[]{0x0000000000000002L});

}