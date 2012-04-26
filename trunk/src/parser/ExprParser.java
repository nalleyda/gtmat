// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g 2012-04-26 04:59:14

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
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

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs243);
            expr7=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:22: ( COMMA expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:23: COMMA expr
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionArgs246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);


            	    pushFollow(FOLLOW_expr_in_functionArgs248);
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
            // 79:36: -> ^( FUNC_ARGS ( expr )* )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:79:51: ( expr )*
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:1: functionCall : ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) ) ) ;
    public final ExprParser.functionCall_return functionCall() throws RecognitionException {
        ExprParser.functionCall_return retval = new ExprParser.functionCall_return();
        retval.start = input.LT(1);

        int functionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID10=null;
        Token OPENC11=null;
        Token CLOSEC13=null;
        Token OPENP14=null;
        Token CLOSEP16=null;
        ExprParser.functionArgs_return functionArgs12 =null;

        ExprParser.functionArgs_return functionArgs15 =null;


        CommonTree ID10_tree=null;
        CommonTree OPENC11_tree=null;
        CommonTree CLOSEC13_tree=null;
        CommonTree OPENP14_tree=null;
        CommonTree CLOSEP16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:15: ( ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:17: ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:17: ( ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:18: ( ID ( OPENP | OPENC ) )=> ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) )
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:40: ( ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:41: ID ^ ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? )
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_functionCall282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID10_tree = 
            (CommonTree)adaptor.create(ID10)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID10_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:45: ( ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:46: ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )* ( OPENP ( functionArgs )? CLOSEP )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:46: ( ( OPENC !) ( functionArgs )? ( CLOSEC !) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OPENC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:47: ( OPENC !) ( functionArgs )? ( CLOSEC !)
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:47: ( OPENC !)
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:48: OPENC !
            	    {
            	    OPENC11=(Token)match(input,OPENC,FOLLOW_OPENC_in_functionCall288); if (state.failed) return retval;

            	    }


            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:56: ( functionArgs )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COLON||LA6_0==DOT||(LA6_0 >= EMPTY_CELL && LA6_0 <= END)||LA6_0==FALSE||LA6_0==ID||LA6_0==INTEGER||LA6_0==MINUS||LA6_0==NOT||(LA6_0 >= OPENB && LA6_0 <= OPENP)||LA6_0==PLUS||LA6_0==STRING_LITERAL||LA6_0==TRUE) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:56: functionArgs
            	            {
            	            pushFollow(FOLLOW_functionArgs_in_functionCall292);
            	            functionArgs12=functionArgs();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs12.getTree());

            	            }
            	            break;

            	    }


            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:70: ( CLOSEC !)
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:71: CLOSEC !
            	    {
            	    CLOSEC13=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_functionCall296); if (state.failed) return retval;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:82: ( OPENP ( functionArgs )? CLOSEP )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OPENP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:83: OPENP ( functionArgs )? CLOSEP
                    {
                    OPENP14=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPENP14_tree = 
                    (CommonTree)adaptor.create(OPENP14)
                    ;
                    adaptor.addChild(root_0, OPENP14_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:89: ( functionArgs )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==COLON||LA8_0==DOT||(LA8_0 >= EMPTY_CELL && LA8_0 <= END)||LA8_0==FALSE||LA8_0==ID||LA8_0==INTEGER||LA8_0==MINUS||LA8_0==NOT||(LA8_0 >= OPENB && LA8_0 <= OPENP)||LA8_0==PLUS||LA8_0==STRING_LITERAL||LA8_0==TRUE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:81:89: functionArgs
                            {
                            pushFollow(FOLLOW_functionArgs_in_functionCall305);
                            functionArgs15=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs15.getTree());

                            }
                            break;

                    }


                    CLOSEP16=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSEP16_tree = 
                    (CommonTree)adaptor.create(CLOSEP16)
                    ;
                    adaptor.addChild(root_0, CLOSEP16_tree);
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


    public static class functionCallOrStructure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCallOrStructure"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )? ;
    public final ExprParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        ExprParser.functionCallOrStructure_return retval = new ExprParser.functionCallOrStructure_return();
        retval.start = input.LT(1);

        int functionCallOrStructure_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT18=null;
        Token OPENP19=null;
        Token CLOSEP21=null;
        ExprParser.functionCall_return functionCall17 =null;

        ExprParser.expr_return expr20 =null;

        ExprParser.functionCall_return functionCall22 =null;


        CommonTree DOT18_tree=null;
        CommonTree OPENP19_tree=null;
        CommonTree CLOSEP21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:25: ( functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:27: functionCall ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure325);
            functionCall17=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall17.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:40: ( DOT ^ ( OPENP expr CLOSEP | functionCall ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DOT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ID||LA11_1==OPENP) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:41: DOT ^ ( OPENP expr CLOSEP | functionCall )
                    {
                    DOT18=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT18_tree = 
                    (CommonTree)adaptor.create(DOT18)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT18_tree, root_0);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:46: ( OPENP expr CLOSEP | functionCall )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==OPENP) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==ID) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:47: OPENP expr CLOSEP
                            {
                            OPENP19=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure332); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPENP19_tree = 
                            (CommonTree)adaptor.create(OPENP19)
                            ;
                            adaptor.addChild(root_0, OPENP19_tree);
                            }

                            pushFollow(FOLLOW_expr_in_functionCallOrStructure334);
                            expr20=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr20.getTree());

                            CLOSEP21=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure336); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSEP21_tree = 
                            (CommonTree)adaptor.create(CLOSEP21)
                            ;
                            adaptor.addChild(root_0, CLOSEP21_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:85:67: functionCall
                            {
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure340);
                            functionCall22=functionCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall22.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:88:1: functionHeader : FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? ;
    public final ExprParser.functionHeader_return functionHeader() throws RecognitionException {
        ExprParser.functionHeader_return retval = new ExprParser.functionHeader_return();
        retval.start = input.LT(1);

        int functionHeader_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FUNCTION23=null;
        Token OPENB24=null;
        Token ID25=null;
        Token COMMA26=null;
        Token ID27=null;
        Token CLOSEB28=null;
        Token ID29=null;
        Token EQUALS30=null;
        Token ID31=null;
        Token OPENP32=null;
        Token ID33=null;
        Token COMMA34=null;
        Token ID35=null;
        Token CLOSEP36=null;

        CommonTree FUNCTION23_tree=null;
        CommonTree OPENB24_tree=null;
        CommonTree ID25_tree=null;
        CommonTree COMMA26_tree=null;
        CommonTree ID27_tree=null;
        CommonTree CLOSEB28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree EQUALS30_tree=null;
        CommonTree ID31_tree=null;
        CommonTree OPENP32_tree=null;
        CommonTree ID33_tree=null;
        CommonTree COMMA34_tree=null;
        CommonTree ID35_tree=null;
        CommonTree CLOSEP36_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:88:16: ( FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:88:18: FUNCTION ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? ) ID ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            {
            root_0 = (CommonTree)adaptor.nil();


            FUNCTION23=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionHeader352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION23_tree = 
            (CommonTree)adaptor.create(FUNCTION23)
            ;
            adaptor.addChild(root_0, FUNCTION23_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:89:3: ( ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:3: ( ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQUALS||LA16_0==OPENB) ) {
                alt16=1;
            }
            else if ( (LA16_0==ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EQUALS) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )? EQUALS
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:4: ( ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB ) | ID )?
                    int alt15=3;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==OPENB) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==ID) ) {
                        alt15=2;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            {
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:5: ( OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB )
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:6: OPENB ( ID ( ( COMMA )? ID )* )? CLOSEB
                            {
                            OPENB24=(Token)match(input,OPENB,FOLLOW_OPENB_in_functionHeader364); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPENB24_tree = 
                            (CommonTree)adaptor.create(OPENB24)
                            ;
                            adaptor.addChild(root_0, OPENB24_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:12: ( ID ( ( COMMA )? ID )* )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==ID) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:13: ID ( ( COMMA )? ID )*
                                    {
                                    ID25=(Token)match(input,ID,FOLLOW_ID_in_functionHeader367); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ID25_tree = 
                                    (CommonTree)adaptor.create(ID25)
                                    ;
                                    adaptor.addChild(root_0, ID25_tree);
                                    }

                                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:16: ( ( COMMA )? ID )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==COMMA||LA13_0==ID) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:17: ( COMMA )? ID
                                    	    {
                                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:17: ( COMMA )?
                                    	    int alt12=2;
                                    	    int LA12_0 = input.LA(1);

                                    	    if ( (LA12_0==COMMA) ) {
                                    	        alt12=1;
                                    	    }
                                    	    switch (alt12) {
                                    	        case 1 :
                                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:17: COMMA
                                    	            {
                                    	            COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader370); if (state.failed) return retval;
                                    	            if ( state.backtracking==0 ) {
                                    	            COMMA26_tree = 
                                    	            (CommonTree)adaptor.create(COMMA26)
                                    	            ;
                                    	            adaptor.addChild(root_0, COMMA26_tree);
                                    	            }

                                    	            }
                                    	            break;

                                    	    }


                                    	    ID27=(Token)match(input,ID,FOLLOW_ID_in_functionHeader373); if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) {
                                    	    ID27_tree = 
                                    	    (CommonTree)adaptor.create(ID27)
                                    	    ;
                                    	    adaptor.addChild(root_0, ID27_tree);
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop13;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            CLOSEB28=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_functionHeader379); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSEB28_tree = 
                            (CommonTree)adaptor.create(CLOSEB28)
                            ;
                            adaptor.addChild(root_0, CLOSEB28_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:90:41: ID
                            {
                            ID29=(Token)match(input,ID,FOLLOW_ID_in_functionHeader384); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID29_tree = 
                            (CommonTree)adaptor.create(ID29)
                            ;
                            adaptor.addChild(root_0, ID29_tree);
                            }

                            }
                            break;

                    }


                    EQUALS30=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_functionHeader388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS30_tree = 
                    (CommonTree)adaptor.create(EQUALS30)
                    ;
                    adaptor.addChild(root_0, EQUALS30_tree);
                    }

                    }
                    break;

            }


            }


            ID31=(Token)match(input,ID,FOLLOW_ID_in_functionHeader399); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID31_tree = 
            (CommonTree)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:3: ( OPENP ( ID ( COMMA ID )* )? CLOSEP )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==OPENP) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==COMMA) ) {
                        alt19=1;
                    }
                    else if ( (LA19_3==CLOSEP) ) {
                        alt19=1;
                    }
                }
                else if ( (LA19_1==CLOSEP) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:4: OPENP ( ID ( COMMA ID )* )? CLOSEP
                    {
                    OPENP32=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionHeader405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPENP32_tree = 
                    (CommonTree)adaptor.create(OPENP32)
                    ;
                    adaptor.addChild(root_0, OPENP32_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:10: ( ID ( COMMA ID )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:11: ID ( COMMA ID )*
                            {
                            ID33=(Token)match(input,ID,FOLLOW_ID_in_functionHeader408); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID33_tree = 
                            (CommonTree)adaptor.create(ID33)
                            ;
                            adaptor.addChild(root_0, ID33_tree);
                            }

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:14: ( COMMA ID )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==COMMA) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:93:15: COMMA ID
                            	    {
                            	    COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionHeader411); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    COMMA34_tree = 
                            	    (CommonTree)adaptor.create(COMMA34)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA34_tree);
                            	    }

                            	    ID35=(Token)match(input,ID,FOLLOW_ID_in_functionHeader413); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    ID35_tree = 
                            	    (CommonTree)adaptor.create(ID35)
                            	    ;
                            	    adaptor.addChild(root_0, ID35_tree);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CLOSEP36=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionHeader419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSEP36_tree = 
                    (CommonTree)adaptor.create(CLOSEP36)
                    ;
                    adaptor.addChild(root_0, CLOSEP36_tree);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER | functionCallOrStructure );
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);

        int term_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EMPTY_VEC37=null;
        Token EMPTY_CELL38=null;
        Token OPENP39=null;
        Token CLOSEP41=null;
        Token STRING_LITERAL42=null;
        Token END43=null;
        Token COLON46=null;
        Token TRUE47=null;
        Token FALSE48=null;
        Token INTEGER49=null;
        Token DOT50=null;
        Token INTEGER51=null;
        Token DOT52=null;
        Token INTEGER53=null;
        ExprParser.expr_return expr40 =null;

        ExprParser.vector_return vector44 =null;

        ExprParser.cellArray_return cellArray45 =null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure54 =null;


        CommonTree EMPTY_VEC37_tree=null;
        CommonTree EMPTY_CELL38_tree=null;
        CommonTree OPENP39_tree=null;
        CommonTree CLOSEP41_tree=null;
        CommonTree STRING_LITERAL42_tree=null;
        CommonTree END43_tree=null;
        CommonTree COLON46_tree=null;
        CommonTree TRUE47_tree=null;
        CommonTree FALSE48_tree=null;
        CommonTree INTEGER49_tree=null;
        CommonTree DOT50_tree=null;
        CommonTree INTEGER51_tree=null;
        CommonTree DOT52_tree=null;
        CommonTree INTEGER53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT ^ INTEGER )? | DOT ^ INTEGER | functionCallOrStructure )
            int alt21=13;
            switch ( input.LA(1) ) {
            case EMPTY_VEC:
                {
                alt21=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt21=2;
                }
                break;
            case OPENP:
                {
                alt21=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt21=4;
                }
                break;
            case END:
                {
                alt21=5;
                }
                break;
            case OPENB:
                {
                alt21=6;
                }
                break;
            case OPENC:
                {
                alt21=7;
                }
                break;
            case COLON:
                {
                alt21=8;
                }
                break;
            case TRUE:
                {
                alt21=9;
                }
                break;
            case FALSE:
                {
                alt21=10;
                }
                break;
            case INTEGER:
                {
                alt21=11;
                }
                break;
            case DOT:
                {
                alt21=12;
                }
                break;
            case ID:
                {
                alt21=13;
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:99:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_VEC37=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC37_tree = 
                    (CommonTree)adaptor.create(EMPTY_VEC37)
                    ;
                    adaptor.addChild(root_0, EMPTY_VEC37_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:100:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EMPTY_CELL38=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL38_tree = 
                    (CommonTree)adaptor.create(EMPTY_CELL38)
                    ;
                    adaptor.addChild(root_0, EMPTY_CELL38_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:101:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP39=(Token)match(input,OPENP,FOLLOW_OPENP_in_term446); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term449);
                    expr40=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr40.getTree());

                    CLOSEP41=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term451); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:102:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL42=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL42_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL42)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL42_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:103:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END43=(Token)match(input,END,FOLLOW_END_in_term462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END43_tree = 
                    (CommonTree)adaptor.create(END43)
                    ;
                    adaptor.addChild(root_0, END43_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:104:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vector_in_term467);
                    vector44=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector44.getTree());

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:105:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cellArray_in_term472);
                    cellArray45=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray45.getTree());

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:106:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON46=(Token)match(input,COLON,FOLLOW_COLON_in_term477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON46_tree = 
                    (CommonTree)adaptor.create(COLON46)
                    ;
                    adaptor.addChild(root_0, COLON46_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:107:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE47=(Token)match(input,TRUE,FOLLOW_TRUE_in_term482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE47_tree = 
                    (CommonTree)adaptor.create(TRUE47)
                    ;
                    adaptor.addChild(root_0, TRUE47_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:108:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE48=(Token)match(input,FALSE,FOLLOW_FALSE_in_term487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE48_tree = 
                    (CommonTree)adaptor.create(FALSE48)
                    ;
                    adaptor.addChild(root_0, FALSE48_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:109:4: INTEGER ( DOT ^ INTEGER )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER49_tree = 
                    (CommonTree)adaptor.create(INTEGER49)
                    ;
                    adaptor.addChild(root_0, INTEGER49_tree);
                    }

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:109:12: ( DOT ^ INTEGER )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DOT) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==INTEGER) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:109:13: DOT ^ INTEGER
                            {
                            DOT50=(Token)match(input,DOT,FOLLOW_DOT_in_term495); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT50_tree = 
                            (CommonTree)adaptor.create(DOT50)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(DOT50_tree, root_0);
                            }

                            INTEGER51=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term498); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTEGER51_tree = 
                            (CommonTree)adaptor.create(INTEGER51)
                            ;
                            adaptor.addChild(root_0, INTEGER51_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:110:4: DOT ^ INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOT52=(Token)match(input,DOT,FOLLOW_DOT_in_term505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT52_tree = 
                    (CommonTree)adaptor.create(DOT52)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT52_tree, root_0);
                    }

                    INTEGER53=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER53_tree = 
                    (CommonTree)adaptor.create(INTEGER53)
                    ;
                    adaptor.addChild(root_0, INTEGER53_tree);
                    }

                    }
                    break;
                case 13 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:111:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCallOrStructure_in_term513);
                    functionCallOrStructure54=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure54.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:114:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET56=null;
        Token CARET57=null;
        Token SINGLE_QUOTE59=null;
        Token DOT_TRANSPOSE60=null;
        ExprParser.term_return term55 =null;

        ExprParser.term_return term58 =null;


        CommonTree DOT_CARET56_tree=null;
        CommonTree CARET57_tree=null;
        CommonTree SINGLE_QUOTE59_tree=null;
        CommonTree DOT_TRANSPOSE60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:115:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:115:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:115:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:115:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            pushFollow(FOLLOW_term_in_transponent527);
            term55=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term55.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:115:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt25=2;
            switch ( input.LA(1) ) {
            case CARET:
            case DOT_CARET:
                {
                alt25=1;
                }
                break;
            case DOT_STAR:
                {
                alt25=1;
                }
                break;
            case DOT_SLASH:
                {
                alt25=1;
                }
                break;
            case DOT_BACKSLASH:
                {
                alt25=1;
                }
                break;
            case STAR:
                {
                alt25=1;
                }
                break;
            case SLASH:
                {
                alt25=1;
                }
                break;
            case BACKSLASH:
                {
                alt25=1;
                }
                break;
            case PLUS:
                {
                alt25=1;
                }
                break;
            case MINUS:
                {
                alt25=1;
                }
                break;
            case LESS_THAN:
                {
                alt25=1;
                }
                break;
            case GREATER_THAN:
                {
                alt25=1;
                }
                break;
            case LESS_EQUAL:
                {
                alt25=1;
                }
                break;
            case GREATER_EQUAL:
                {
                alt25=1;
                }
                break;
            case ISEQUAL:
                {
                alt25=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt25=1;
                }
                break;
            case ELE_AND:
                {
                alt25=1;
                }
                break;
            case ELE_OR:
                {
                alt25=1;
                }
                break;
            case SC_AND:
                {
                alt25=1;
                }
                break;
            case SC_OR:
                {
                alt25=1;
                }
                break;
            case COMMA:
                {
                alt25=1;
                }
                break;
            case CLOSEC:
                {
                alt25=1;
                }
                break;
            case CLOSEP:
                {
                alt25=1;
                }
                break;
            case NOT:
                {
                alt25=1;
                }
                break;
            case EMPTY_VEC:
                {
                alt25=1;
                }
                break;
            case EMPTY_CELL:
                {
                alt25=1;
                }
                break;
            case OPENP:
                {
                alt25=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt25=1;
                }
                break;
            case END:
                {
                alt25=1;
                }
                break;
            case OPENB:
                {
                alt25=1;
                }
                break;
            case OPENC:
                {
                alt25=1;
                }
                break;
            case COLON:
                {
                alt25=1;
                }
                break;
            case TRUE:
                {
                alt25=1;
                }
                break;
            case FALSE:
                {
                alt25=1;
                }
                break;
            case INTEGER:
                {
                alt25=1;
                }
                break;
            case DOT:
                {
                alt25=1;
                }
                break;
            case ID:
                {
                alt25=1;
                }
                break;
            case SEMI:
                {
                alt25=1;
                }
                break;
            case CLOSEB:
                {
                alt25=1;
                }
                break;
            case EOF:
                {
                alt25=1;
                }
                break;
            case IF:
                {
                alt25=1;
                }
                break;
            case SWITCH:
                {
                alt25=1;
                }
                break;
            case FOR:
                {
                alt25=1;
                }
                break;
            case WHILE:
                {
                alt25=1;
                }
                break;
            case BLOCK_END:
                {
                alt25=1;
                }
                break;
            case ELSEIF:
                {
                alt25=1;
                }
                break;
            case ELSE:
                {
                alt25=1;
                }
                break;
            case OTHERWISE:
                {
                alt25=1;
                }
                break;
            case CASE:
                {
                alt25=1;
                }
                break;
            case DOT_TRANSPOSE:
            case SINGLE_QUOTE:
                {
                alt25=2;
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:3: ( ( DOT_CARET ^| CARET ^) term )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==CARET||LA23_0==DOT_CARET) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:5: ( DOT_CARET ^| CARET ^)
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==DOT_CARET) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==CARET) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:6: DOT_CARET ^
                    	            {
                    	            DOT_CARET56=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent536); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET56_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET56)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET56_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:116:19: CARET ^
                    	            {
                    	            CARET57=(Token)match(input,CARET,FOLLOW_CARET_in_transponent541); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET57_tree = 
                    	            (CommonTree)adaptor.create(CARET57)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET57_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_term_in_transponent545);
                    	    term58=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:117:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:117:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==SINGLE_QUOTE) ) {
                            alt24=1;
                        }
                        else if ( (LA24_0==DOT_TRANSPOSE) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:117:6: SINGLE_QUOTE ^
                    	    {
                    	    SINGLE_QUOTE59=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent554); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE59_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE59)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE59_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:117:22: DOT_TRANSPOSE ^
                    	    {
                    	    DOT_TRANSPOSE60=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent559); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE60_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE60)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE60_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS61=null;
        Token MINUS62=null;
        Token NOT63=null;
        ExprParser.transponent_return transponent64 =null;


        CommonTree PLUS61_tree=null;
        CommonTree MINUS62_tree=null;
        CommonTree NOT63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:9: ( PLUS !| MINUS ^| NOT ^)*
            loop26:
            do {
                int alt26=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt26=1;
                    }
                    break;
                case MINUS:
                    {
                    alt26=2;
                    }
                    break;
                case NOT:
                    {
                    alt26=3;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:10: PLUS !
            	    {
            	    PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary580); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:18: MINUS ^
            	    {
            	    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary585); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS62_tree = 
            	    (CommonTree)adaptor.create(MINUS62)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS62_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:121:27: NOT ^
            	    {
            	    NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_unary590); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT63_tree = 
            	    (CommonTree)adaptor.create(NOT63)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT63_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary595);
            transponent64=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent64.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR66=null;
        Token DOT_SLASH67=null;
        Token DOT_BACKSLASH68=null;
        Token STAR69=null;
        Token SLASH70=null;
        Token BACKSLASH71=null;
        ExprParser.unary_return unary65 =null;

        ExprParser.unary_return unary72 =null;


        CommonTree DOT_STAR66_tree=null;
        CommonTree DOT_SLASH67_tree=null;
        CommonTree DOT_BACKSLASH68_tree=null;
        CommonTree STAR69_tree=null;
        CommonTree SLASH70_tree=null;
        CommonTree BACKSLASH71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult603);
            unary65=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary65.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==BACKSLASH||LA28_0==DOT_BACKSLASH||(LA28_0 >= DOT_SLASH && LA28_0 <= DOT_STAR)||LA28_0==SLASH||LA28_0==STAR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt27=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt27=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt27=6;
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
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:17: DOT_STAR ^
            	            {
            	            DOT_STAR66=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult608); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR66_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR66)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:29: DOT_SLASH ^
            	            {
            	            DOT_SLASH67=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult613); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH67_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH67)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:42: DOT_BACKSLASH ^
            	            {
            	            DOT_BACKSLASH68=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult618); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH68_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH68)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:59: STAR ^
            	            {
            	            STAR69=(Token)match(input,STAR,FOLLOW_STAR_in_mult623); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR69_tree = 
            	            (CommonTree)adaptor.create(STAR69)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:67: SLASH ^
            	            {
            	            SLASH70=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult628); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH70_tree = 
            	            (CommonTree)adaptor.create(SLASH70)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:123:76: BACKSLASH ^
            	            {
            	            BACKSLASH71=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult633); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH71_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH71)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult637);
            	    unary72=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary72.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS74=null;
        Token MINUS75=null;
        ExprParser.mult_return mult73 =null;

        ExprParser.mult_return mult76 =null;


        CommonTree PLUS74_tree=null;
        CommonTree MINUS75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add649);
            mult73=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult73.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:12: ( ( PLUS ^| MINUS ^) mult )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==PLUS) ) {
                    alt30=1;
                }
                else if ( (LA30_0==MINUS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:14: ( PLUS ^| MINUS ^)
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==PLUS) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==MINUS) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:15: PLUS ^
            	            {
            	            PLUS74=(Token)match(input,PLUS,FOLLOW_PLUS_in_add654); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS74_tree = 
            	            (CommonTree)adaptor.create(PLUS74)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:125:23: MINUS ^
            	            {
            	            MINUS75=(Token)match(input,MINUS,FOLLOW_MINUS_in_add659); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS75_tree = 
            	            (CommonTree)adaptor.create(MINUS75)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add663);
            	    mult76=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult76.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON77=null;
        ExprParser.add_return add78 =null;


        CommonTree COLON77_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:11: ( COLON add )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COLON) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:12: COLON add
            	    {
            	    COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd674); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON77);


            	    pushFollow(FOLLOW_add_in_colonEnd676);
            	    add78=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add78.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
            // 127:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:127:27: ^( COLON_ARGS ( add )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:1: colon : add ( colonEnd ^)? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.add_return add79 =null;

        ExprParser.colonEnd_return colonEnd80 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:7: ( add ( colonEnd ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_colon695);
            add79=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add79.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:13: ( colonEnd ^)?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:129:14: colonEnd ^
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon698);
                    colonEnd80=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd80.getTree(), root_0);

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN82=null;
        Token GREATER_THAN83=null;
        Token LESS_EQUAL84=null;
        Token GREATER_EQUAL85=null;
        Token ISEQUAL86=null;
        Token NOT_EQUAL87=null;
        ExprParser.colon_return colon81 =null;

        ExprParser.colon_return colon88 =null;


        CommonTree LESS_THAN82_tree=null;
        CommonTree GREATER_THAN83_tree=null;
        CommonTree LESS_EQUAL84_tree=null;
        CommonTree GREATER_EQUAL85_tree=null;
        CommonTree ISEQUAL86_tree=null;
        CommonTree NOT_EQUAL87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_logical709);
            colon81=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon81.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==GREATER_EQUAL||LA34_0==GREATER_THAN||(LA34_0 >= ISEQUAL && LA34_0 <= LESS_THAN)||LA34_0==NOT_EQUAL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt33=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:20: LESS_THAN ^
            	            {
            	            LESS_THAN82=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical714); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN82_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN82)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:33: GREATER_THAN ^
            	            {
            	            GREATER_THAN83=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical719); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN83_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN83)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:49: LESS_EQUAL ^
            	            {
            	            LESS_EQUAL84=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical724); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL84_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL84)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL84_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:63: GREATER_EQUAL ^
            	            {
            	            GREATER_EQUAL85=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical729); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL85_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL85)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL85_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:80: ISEQUAL ^
            	            {
            	            ISEQUAL86=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical734); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL86_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL86)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL86_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:131:91: NOT_EQUAL ^
            	            {
            	            NOT_EQUAL87=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical739); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL87_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL87)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL87_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_logical743);
            	    colon88=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon88.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND90=null;
        ExprParser.logical_return logical89 =null;

        ExprParser.logical_return logical91 =null;


        CommonTree ELE_AND90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:8: ( logical ( ELE_AND ^ logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logical_in_eleAnd755);
            logical89=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical89.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:18: ( ELE_AND ^ logical )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ELE_AND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:133:19: ELE_AND ^ logical
            	    {
            	    ELE_AND90=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd758); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND90_tree = 
            	    (CommonTree)adaptor.create(ELE_AND90)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_in_eleAnd761);
            	    logical91=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical91.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR93=null;
        ExprParser.eleAnd_return eleAnd92 =null;

        ExprParser.eleAnd_return eleAnd94 =null;


        CommonTree ELE_OR93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr772);
            eleAnd92=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd92.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:16: ( ELE_OR ^ eleAnd )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ELE_OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:135:17: ELE_OR ^ eleAnd
            	    {
            	    ELE_OR93=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr775); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR93_tree = 
            	    (CommonTree)adaptor.create(ELE_OR93)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleAnd_in_eleOr778);
            	    eleAnd94=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd94.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND96=null;
        ExprParser.eleOr_return eleOr95 =null;

        ExprParser.eleOr_return eleOr97 =null;


        CommonTree SC_AND96_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:7: ( eleOr ( SC_AND ^ eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd789);
            eleOr95=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr95.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:15: ( SC_AND ^ eleOr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==SC_AND) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:137:16: SC_AND ^ eleOr
            	    {
            	    SC_AND96=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd792); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND96_tree = 
            	    (CommonTree)adaptor.create(SC_AND96)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND96_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_eleOr_in_scAnd795);
            	    eleOr97=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr97.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR99=null;
        ExprParser.scAnd_return scAnd98 =null;

        ExprParser.scAnd_return scAnd100 =null;


        CommonTree SC_OR99_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:6: ( scAnd ( SC_OR ^ scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr806);
            scAnd98=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd98.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:14: ( SC_OR ^ scAnd )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==SC_OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:139:15: SC_OR ^ scAnd
            	    {
            	    SC_OR99=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr809); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR99_tree = 
            	    (CommonTree)adaptor.create(SC_OR99)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR99_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_scAnd_in_scOr812);
            	    scAnd100=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd100.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA102=null;
        ExprParser.expr_return expr101 =null;

        ExprParser.expr_return expr103 =null;


        CommonTree COMMA102_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec824);
            expr101=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr101.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:16: ( ( COMMA )? expr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COLON||LA40_0==COMMA||LA40_0==DOT||(LA40_0 >= EMPTY_CELL && LA40_0 <= END)||LA40_0==FALSE||LA40_0==ID||LA40_0==INTEGER||LA40_0==MINUS||LA40_0==NOT||(LA40_0 >= OPENB && LA40_0 <= OPENP)||LA40_0==PLUS||LA40_0==STRING_LITERAL||LA40_0==TRUE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:17: ( COMMA )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==COMMA) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:18: COMMA
            	            {
            	            COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec828); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA102);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatVec832);
            	    expr103=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr103.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            // 142:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:142:36: ^( HCAT_VEC ( expr )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI105=null;
        ExprParser.hCatVec_return hCatVec104 =null;

        ExprParser.hCatVec_return hCatVec106 =null;


        CommonTree SEMI105_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec851);
            hCatVec104=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec104.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:19: ( ( SEMI ) hCatVec )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==SEMI) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:21: SEMI
            	    {
            	    SEMI105=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec855); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI105);


            	    }


            	    pushFollow(FOLLOW_hCatVec_in_vCatVec858);
            	    hCatVec106=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec106.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
            // 144:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:144:40: ^( VCAT_VEC ( hCatVec )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:146:1: vector : OPENB ! vCatVec CLOSEB !;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB107=null;
        Token CLOSEB109=null;
        ExprParser.vCatVec_return vCatVec108 =null;


        CommonTree OPENB107_tree=null;
        CommonTree CLOSEB109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:146:8: ( OPENB ! vCatVec CLOSEB !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:146:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENB107=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector877); if (state.failed) return retval;

            pushFollow(FOLLOW_vCatVec_in_vector880);
            vCatVec108=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec108.getTree());

            CLOSEB109=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector882); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA111=null;
        ExprParser.expr_return expr110 =null;

        ExprParser.expr_return expr112 =null;


        CommonTree COMMA111_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell890);
            expr110=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr110.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:16: ( ( COMMA )? expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COLON||LA43_0==COMMA||LA43_0==DOT||(LA43_0 >= EMPTY_CELL && LA43_0 <= END)||LA43_0==FALSE||LA43_0==ID||LA43_0==INTEGER||LA43_0==MINUS||LA43_0==NOT||(LA43_0 >= OPENB && LA43_0 <= OPENP)||LA43_0==PLUS||LA43_0==STRING_LITERAL||LA43_0==TRUE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:17: ( COMMA )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==COMMA) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:18: COMMA
            	            {
            	            COMMA111=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell894); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA111);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_hCatCell898);
            	    expr112=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr112.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
            // 148:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:148:37: ^( HCAT_CELL ( expr )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI114=null;
        ExprParser.hCatCell_return hCatCell113 =null;

        ExprParser.hCatCell_return hCatCell115 =null;


        CommonTree SEMI114_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell917);
            hCatCell113=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell113.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:20: ( ( SEMI ) ! hCatCell )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==SEMI) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:21: ( SEMI ) ! hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:22: SEMI
            	    {
            	    SEMI114=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell921); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI114);


            	    }


            	    pushFollow(FOLLOW_hCatCell_in_vCatCell925);
            	    hCatCell115=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell115.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
            // 150:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:150:43: ^( VCAT_CELL ( hCatCell )+ )
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:152:1: cellArray : OPENC ! ( vCatCell )? CLOSEC !;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC116=null;
        Token CLOSEC118=null;
        ExprParser.vCatCell_return vCatCell117 =null;


        CommonTree OPENC116_tree=null;
        CommonTree CLOSEC118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:152:11: ( OPENC ! ( vCatCell )? CLOSEC !)
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:152:13: OPENC ! ( vCatCell )? CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            OPENC116=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray944); if (state.failed) return retval;

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:152:20: ( vCatCell )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==COLON||LA45_0==DOT||(LA45_0 >= EMPTY_CELL && LA45_0 <= END)||LA45_0==FALSE||LA45_0==ID||LA45_0==INTEGER||LA45_0==MINUS||LA45_0==NOT||(LA45_0 >= OPENB && LA45_0 <= OPENP)||LA45_0==PLUS||LA45_0==STRING_LITERAL||LA45_0==TRUE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:152:20: vCatCell
                    {
                    pushFollow(FOLLOW_vCatCell_in_cellArray947);
                    vCatCell117=vCatCell();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell117.getTree());

                    }
                    break;

            }


            CLOSEC118=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray950); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.scOr_return scOr119 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:154:8: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scOr_in_expr961);
            scOr119=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr119.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS121=null;
        Token SEMI123=null;
        ExprParser.term_return term120 =null;

        ExprParser.expr_return expr122 =null;


        CommonTree EQUALS121_tree=null;
        CommonTree SEMI123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:8: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:8: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:9: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI ^)?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:9: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA46_1 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA46_3 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA46_4 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA46_5 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA46_6 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA46_7 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA46_8 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case TRUE:
                    {
                    int LA46_9 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case FALSE:
                    {
                    int LA46_10 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case INTEGER:
                    {
                    int LA46_11 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case DOT:
                    {
                    int LA46_12 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA46_13 = input.LA(2);

                    if ( (synpred2_Expr()) ) {
                        alt46=1;
                    }
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:10: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:27: ( term EQUALS ^)
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:28: term EQUALS ^
                    {
                    pushFollow(FOLLOW_term_in_line981);
                    term120=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term120.getTree());

                    EQUALS121=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS121_tree = 
                    (CommonTree)adaptor.create(EQUALS121)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS121_tree, root_0);
                    }

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_line990);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:157:7: ( SEMI ^)?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SEMI) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:157:8: SEMI ^
                    {
                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_line993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI123_tree = 
                    (CommonTree)adaptor.create(SEMI123)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SEMI123_tree, root_0);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:1: ifPart : IF ^ expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF124=null;
        ExprParser.expr_return expr125 =null;

        ExprParser.block_return block126 =null;


        CommonTree IF124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:8: ( IF ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IF124=(Token)match(input,IF,FOLLOW_IF_in_ifPart1008); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF124_tree = 
            (CommonTree)adaptor.create(IF124)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF124_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifPart1011);
            expr125=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:19: ( block )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==COLON||LA48_0==DOT||(LA48_0 >= EMPTY_CELL && LA48_0 <= END)||(LA48_0 >= FALSE && LA48_0 <= FOR)||(LA48_0 >= ID && LA48_0 <= IF)||LA48_0==INTEGER||LA48_0==MINUS||LA48_0==NOT||(LA48_0 >= OPENB && LA48_0 <= OPENP)||LA48_0==PLUS||(LA48_0 >= STRING_LITERAL && LA48_0 <= SWITCH)||LA48_0==TRUE||LA48_0==WHILE) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:159:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart1013);
                    block126=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block126.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF127=null;
        ExprParser.expr_return e2 =null;

        ExprParser.block_return b2 =null;


        CommonTree ELSEIF127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:14: ( ELSEIF ^e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:15: ELSEIF ^e2= expr (b2= block )?
            {
            ELSEIF127=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart1022); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF127_tree = 
            (CommonTree)adaptor.create(ELSEIF127)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF127_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_elseifPart1027);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:33: (b2= block )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==COLON||LA49_0==DOT||(LA49_0 >= EMPTY_CELL && LA49_0 <= END)||(LA49_0 >= FALSE && LA49_0 <= FOR)||(LA49_0 >= ID && LA49_0 <= IF)||LA49_0==INTEGER||LA49_0==MINUS||LA49_0==NOT||(LA49_0 >= OPENB && LA49_0 <= OPENP)||LA49_0==PLUS||(LA49_0 >= STRING_LITERAL && LA49_0 <= SWITCH)||LA49_0==TRUE||LA49_0==WHILE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:160:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart1031);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE128=null;
        ExprParser.block_return b3 =null;


        CommonTree ELSE128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:10: ( ( ELSE ^ (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:11: ( ELSE ^ (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:12: ELSE ^ (b3= block )?
            {
            ELSE128=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart1040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE128_tree = 
            (CommonTree)adaptor.create(ELSE128)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE128_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:20: (b3= block )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON||LA50_0==DOT||(LA50_0 >= EMPTY_CELL && LA50_0 <= END)||(LA50_0 >= FALSE && LA50_0 <= FOR)||(LA50_0 >= ID && LA50_0 <= IF)||LA50_0==INTEGER||LA50_0==MINUS||LA50_0==NOT||(LA50_0 >= OPENB && LA50_0 <= OPENP)||LA50_0==PLUS||(LA50_0 >= STRING_LITERAL && LA50_0 <= SWITCH)||LA50_0==TRUE||LA50_0==WHILE) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:161:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart1045);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:162:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END132=null;
        ExprParser.ifPart_return ifPart129 =null;

        ExprParser.elseifPart_return elseifPart130 =null;

        ExprParser.elsePart_return elsePart131 =null;


        CommonTree BLOCK_END132_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:162:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:163:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock1056);
            ifPart129=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart129.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:164:9: ( elseifPart )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ELSEIF) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:164:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1066);
            	    elseifPart130=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart130.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:9: ( elsePart )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELSE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:165:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1077);
                    elsePart131=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart131.getTree());

                    }
                    break;

            }


            BLOCK_END132=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1088); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END132);


            // AST REWRITE
            // elements: elseifPart, elsePart, ifPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 167:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:167:41: ( elsePart )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:171:1: switchPart : SWITCH ^ expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH133=null;
        ExprParser.expr_return expr134 =null;


        CommonTree SWITCH133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:171:12: ( SWITCH ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:171:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH133=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH133_tree = 
            (CommonTree)adaptor.create(SWITCH133)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH133_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_switchPart1140);
            expr134=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:172:1: casePart : CASE ^ expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE135=null;
        ExprParser.expr_return expr136 =null;

        ExprParser.block_return block137 =null;


        CommonTree CASE135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:172:10: ( CASE ^ expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:172:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE135=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE135_tree = 
            (CommonTree)adaptor.create(CASE135)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE135_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_casePart1150);
            expr136=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr136.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:172:23: ( block )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COLON||LA53_0==DOT||(LA53_0 >= EMPTY_CELL && LA53_0 <= END)||(LA53_0 >= FALSE && LA53_0 <= FOR)||(LA53_0 >= ID && LA53_0 <= IF)||LA53_0==INTEGER||LA53_0==MINUS||LA53_0==NOT||(LA53_0 >= OPENB && LA53_0 <= OPENP)||LA53_0==PLUS||(LA53_0 >= STRING_LITERAL && LA53_0 <= SWITCH)||LA53_0==TRUE||LA53_0==WHILE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:172:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1152);
                    block137=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block137.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:173:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE138=null;
        ExprParser.block_return block139 =null;


        CommonTree OTHERWISE138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:173:16: ( OTHERWISE ^ ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:173:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE138=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1160); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE138_tree = 
            (CommonTree)adaptor.create(OTHERWISE138)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE138_tree, root_0);
            }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:173:29: ( block )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLON||LA54_0==DOT||(LA54_0 >= EMPTY_CELL && LA54_0 <= END)||(LA54_0 >= FALSE && LA54_0 <= FOR)||(LA54_0 >= ID && LA54_0 <= IF)||LA54_0==INTEGER||LA54_0==MINUS||LA54_0==NOT||(LA54_0 >= OPENB && LA54_0 <= OPENP)||LA54_0==PLUS||(LA54_0 >= STRING_LITERAL && LA54_0 <= SWITCH)||LA54_0==TRUE||LA54_0==WHILE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:173:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1163);
                    block139=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block139.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:174:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END143=null;
        ExprParser.switchPart_return switchPart140 =null;

        ExprParser.casePart_return casePart141 =null;

        ExprParser.otherwiseBlock_return otherwiseBlock142 =null;


        CommonTree BLOCK_END143_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:174:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:175:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1173);
            switchPart140=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart140.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:176:2: ( casePart )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==CASE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:176:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1176);
            	    casePart141=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart141.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:177:2: ( otherwiseBlock )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==OTHERWISE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:177:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1180);
                    otherwiseBlock142=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock142.getTree());

                    }
                    break;

            }


            BLOCK_END143=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END143);


            // AST REWRITE
            // elements: otherwiseBlock, casePart, switchPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 179:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:179:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:179:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:179:40: ( otherwiseBlock )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:1: forPart : FOR ^ ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR144=null;
        Token ID145=null;
        Token EQUALS146=null;
        ExprParser.expr_return expr147 =null;


        CommonTree FOR144_tree=null;
        CommonTree ID145_tree=null;
        CommonTree EQUALS146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:9: ( FOR ^ ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:182:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR144=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR144_tree = 
            (CommonTree)adaptor.create(FOR144)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR144_tree, root_0);
            }

            ID145=(Token)match(input,ID,FOLLOW_ID_in_forPart1212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID145_tree = 
            (CommonTree)adaptor.create(ID145)
            ;
            adaptor.addChild(root_0, ID145_tree);
            }

            EQUALS146=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1214); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS146_tree = 
            (CommonTree)adaptor.create(EQUALS146)
            ;
            adaptor.addChild(root_0, EQUALS146_tree);
            }

            pushFollow(FOLLOW_expr_in_forPart1216);
            expr147=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr147.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:183:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END150=null;
        ExprParser.forPart_return forPart148 =null;

        ExprParser.block_return block149 =null;


        CommonTree BLOCK_END150_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:183:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:184:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1226);
            forPart148=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart148.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:185:2: ( block )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON||LA57_0==DOT||(LA57_0 >= EMPTY_CELL && LA57_0 <= END)||(LA57_0 >= FALSE && LA57_0 <= FOR)||(LA57_0 >= ID && LA57_0 <= IF)||LA57_0==INTEGER||LA57_0==MINUS||LA57_0==NOT||(LA57_0 >= OPENB && LA57_0 <= OPENP)||LA57_0==PLUS||(LA57_0 >= STRING_LITERAL && LA57_0 <= SWITCH)||LA57_0==TRUE||LA57_0==WHILE) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:185:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1229);
                    block149=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block149.getTree());

                    }
                    break;

            }


            BLOCK_END150=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END150);


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
            // 187:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:187:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:187:24: ( block )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:190:1: whilePart : WHILE ^ expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE151=null;
        ExprParser.expr_return expr152 =null;


        CommonTree WHILE151_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:190:11: ( WHILE ^ expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:190:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE151=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1256); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE151_tree = 
            (CommonTree)adaptor.create(WHILE151)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE151_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whilePart1259);
            expr152=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr152.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:191:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END155=null;
        ExprParser.whilePart_return whilePart153 =null;

        ExprParser.block_return block154 =null;


        CommonTree BLOCK_END155_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:191:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:192:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1268);
            whilePart153=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart153.getTree());

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:193:2: ( block )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COLON||LA58_0==DOT||(LA58_0 >= EMPTY_CELL && LA58_0 <= END)||(LA58_0 >= FALSE && LA58_0 <= FOR)||(LA58_0 >= ID && LA58_0 <= IF)||LA58_0==INTEGER||LA58_0==MINUS||LA58_0==NOT||(LA58_0 >= OPENB && LA58_0 <= OPENP)||LA58_0==PLUS||(LA58_0 >= STRING_LITERAL && LA58_0 <= SWITCH)||LA58_0==TRUE||LA58_0==WHILE) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:193:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1271);
                    block154=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block154.getTree());

                    }
                    break;

            }


            BLOCK_END155=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END155);


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
            // 195:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:195:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:195:28: ( block )?
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock156 =null;

        ExprParser.switchBlock_return switchBlock157 =null;

        ExprParser.forBlock_return forBlock158 =null;

        ExprParser.whileBlock_return whileBlock159 =null;

        ExprParser.line_return line160 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt59=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt59=1;
                }
                break;
            case SWITCH:
                {
                alt59=2;
                }
                break;
            case FOR:
                {
                alt59=3;
                }
                break;
            case WHILE:
                {
                alt59=4;
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
                alt59=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1298);
                    ifBlock156=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock156.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1302);
                    switchBlock157=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock157.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1306);
                    forBlock158=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock158.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1310);
                    whileBlock159=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock159.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:198:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1314);
                    line160=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line160.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart161 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:9: ( blockPart )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case IF:
                    {
                    alt60=1;
                    }
                    break;
                case SWITCH:
                    {
                    alt60=1;
                    }
                    break;
                case FOR:
                    {
                    alt60=1;
                    }
                    break;
                case WHILE:
                    {
                    alt60=1;
                    }
                    break;
                case EMPTY_VEC:
                    {
                    alt60=1;
                    }
                    break;
                case EMPTY_CELL:
                    {
                    alt60=1;
                    }
                    break;
                case OPENP:
                    {
                    alt60=1;
                    }
                    break;
                case STRING_LITERAL:
                    {
                    alt60=1;
                    }
                    break;
                case END:
                    {
                    alt60=1;
                    }
                    break;
                case OPENB:
                    {
                    alt60=1;
                    }
                    break;
                case OPENC:
                    {
                    alt60=1;
                    }
                    break;
                case COLON:
                    {
                    alt60=1;
                    }
                    break;
                case TRUE:
                    {
                    alt60=1;
                    }
                    break;
                case FALSE:
                    {
                    alt60=1;
                    }
                    break;
                case INTEGER:
                    {
                    alt60=1;
                    }
                    break;
                case DOT:
                    {
                    alt60=1;
                    }
                    break;
                case ID:
                    {
                    alt60=1;
                    }
                    break;
                case PLUS:
                    {
                    alt60=1;
                    }
                    break;
                case MINUS:
                    {
                    alt60=1;
                    }
                    break;
                case NOT:
                    {
                    alt60=1;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1322);
            	    blockPart161=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart161.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
            // 199:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:199:23: ^( BLOCK ( blockPart )+ )
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
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:10: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat2/src/parser/Expr.g:156:11: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred2_Expr973);
        term();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Expr975); if (state.failed) return ;

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
    public static final BitSet FOLLOW_expr_in_functionArgs243 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs246 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionArgs248 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_functionCall282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_OPENC_in_functionCall288 = new BitSet(new long[]{0x5090023800824000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_functionCall296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_OPENP_in_functionCall303 = new BitSet(new long[]{0x5090023800828000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall305 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure325 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure328 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure332 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure334 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure336 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_STRING_LITERAL_in_term457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term492 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_term495 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term505 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent527 = new BitSet(new long[]{0x0000000012000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent536 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_CARET_in_transponent541 = new BitSet(new long[]{0x0090023800820000L,0x0000000000120007L});
    public static final BitSet FOLLOW_term_in_transponent545 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent554 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent559 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_unary580 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_unary585 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_in_unary590 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_transponent_in_unary595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult603 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult608 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult613 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult618 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_STAR_in_mult623 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_SLASH_in_mult628 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult633 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_unary_in_mult637 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_mult_in_add649 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_add654 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_add659 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_mult_in_add663 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_colonEnd674 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_add_in_colonEnd676 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon695 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical709 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical714 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical719 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical724 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical729 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical734 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical739 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_colon_in_logical743 = new BitSet(new long[]{0x8702800000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd755 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd758 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_logical_in_eleAnd761 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr772 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr775 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr778 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd792 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleOr_in_scAnd795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_scAnd_in_scOr806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SC_OR_in_scOr809 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_scAnd_in_scOr812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_hCatVec824 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec828 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatVec832 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec855 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENB_in_vector877 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatVec_in_vector880 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell890 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell894 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatCell898 = new BitSet(new long[]{0x50900238008A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell921 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENC_in_cellArray944 = new BitSet(new long[]{0x5090023800824000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray947 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line981 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line983 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_line990 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_line993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart1008 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_ifPart1011 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_ifPart1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart1022 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_elseifPart1027 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elseifPart1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart1040 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elsePart1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1056 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1066 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1077 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1137 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_switchPart1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1147 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_casePart1150 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_casePart1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1160 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1173 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1176 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1180 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1209 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1212 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1214 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_forPart1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1226 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_forBlock1229 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1256 = new BitSet(new long[]{0x5090023800820000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_whilePart1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1268 = new BitSet(new long[]{0x50B0063800820080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_whileBlock1271 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1322 = new BitSet(new long[]{0x50B0063800820002L,0x0000000002160107L});
    public static final BitSet FOLLOW_term_in_synpred2_Expr973 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Expr975 = new BitSet(new long[]{0x0000000000000002L});

}