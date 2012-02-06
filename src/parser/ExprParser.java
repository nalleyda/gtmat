// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g 2012-02-05 18:56:08

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
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNC_ARGS", "ID", "DOT", "DOT_CARET", "CARET", "SINGLE_QUOTE", "DOT_TRANSPOSE", "MINUS", "NOT", "DOT_STAR", "DOT_SLASH", "DOT_BACKSLASH", "STAR", "SLASH", "BACKSLASH", "PLUS", "COLON_ARGS", "LESS_THAN", "GREATER_THAN", "LESS_EQUAL", "GREATER_EQUL", "ISEQUAL", "NOT_EQUAL", "ELE_AND", "ELE_OR", "SC_AND", "SC_OR", "HCAT_VEC", "VCAT_VEC", "HCAT_CELL", "VCAT_CELL", "EQUALS", "IF", "ELSEIF", "ELSE", "IF_STAT", "SWITCH", "CASE", "OTHERWISE", "SWITCH_STAT", "FOR", "FOR_LOOP", "WHILE", "WHILE_LOOP", "BLOCK", "COMMA", "OPENP", "CLOSEP", "EMPTY_VEC", "EMPTY_CELL", "STRING_LITERAL", "END", "COLON", "TRUE", "FALSE", "INTEGER", "GREATER_EQUAL", "SEMI", "OPENB", "CLOSEB", "OPENC", "CLOSEC", "BLOCK_END", "BREAK", "CATCH", "CLASSDEF", "CONTINUE", "FUNCTION", "GLOBAL", "PARFOR", "PERSISTENT", "RETURN", "SPMD", "TRY", "AT", "CLOSE_BLOCK", "DOUBLE_QUOTE", "EXCLAMATION", "OPEN_BLOCK", "PERCENT", "DIGIT", "LETTER", "UNDERSCORE", "NEWLINE", "COMMENT", "ELLIPSIS", "EXPONENT", "WS"
    };
    public static final int EOF=-1;
    public static final int FUNC_ARGS=4;
    public static final int ID=5;
    public static final int DOT=6;
    public static final int DOT_CARET=7;
    public static final int CARET=8;
    public static final int SINGLE_QUOTE=9;
    public static final int DOT_TRANSPOSE=10;
    public static final int MINUS=11;
    public static final int NOT=12;
    public static final int DOT_STAR=13;
    public static final int DOT_SLASH=14;
    public static final int DOT_BACKSLASH=15;
    public static final int STAR=16;
    public static final int SLASH=17;
    public static final int BACKSLASH=18;
    public static final int PLUS=19;
    public static final int COLON_ARGS=20;
    public static final int LESS_THAN=21;
    public static final int GREATER_THAN=22;
    public static final int LESS_EQUAL=23;
    public static final int GREATER_EQUL=24;
    public static final int ISEQUAL=25;
    public static final int NOT_EQUAL=26;
    public static final int ELE_AND=27;
    public static final int ELE_OR=28;
    public static final int SC_AND=29;
    public static final int SC_OR=30;
    public static final int HCAT_VEC=31;
    public static final int VCAT_VEC=32;
    public static final int HCAT_CELL=33;
    public static final int VCAT_CELL=34;
    public static final int EQUALS=35;
    public static final int IF=36;
    public static final int ELSEIF=37;
    public static final int ELSE=38;
    public static final int IF_STAT=39;
    public static final int SWITCH=40;
    public static final int CASE=41;
    public static final int OTHERWISE=42;
    public static final int SWITCH_STAT=43;
    public static final int FOR=44;
    public static final int FOR_LOOP=45;
    public static final int WHILE=46;
    public static final int WHILE_LOOP=47;
    public static final int BLOCK=48;
    public static final int COMMA=49;
    public static final int OPENP=50;
    public static final int CLOSEP=51;
    public static final int EMPTY_VEC=52;
    public static final int EMPTY_CELL=53;
    public static final int STRING_LITERAL=54;
    public static final int END=55;
    public static final int COLON=56;
    public static final int TRUE=57;
    public static final int FALSE=58;
    public static final int INTEGER=59;
    public static final int GREATER_EQUAL=60;
    public static final int SEMI=61;
    public static final int OPENB=62;
    public static final int CLOSEB=63;
    public static final int OPENC=64;
    public static final int CLOSEC=65;
    public static final int BLOCK_END=66;
    public static final int BREAK=67;
    public static final int CATCH=68;
    public static final int CLASSDEF=69;
    public static final int CONTINUE=70;
    public static final int FUNCTION=71;
    public static final int GLOBAL=72;
    public static final int PARFOR=73;
    public static final int PERSISTENT=74;
    public static final int RETURN=75;
    public static final int SPMD=76;
    public static final int TRY=77;
    public static final int AT=78;
    public static final int CLOSE_BLOCK=79;
    public static final int DOUBLE_QUOTE=80;
    public static final int EXCLAMATION=81;
    public static final int OPEN_BLOCK=82;
    public static final int PERCENT=83;
    public static final int DIGIT=84;
    public static final int LETTER=85;
    public static final int UNDERSCORE=86;
    public static final int NEWLINE=87;
    public static final int COMMENT=88;
    public static final int ELLIPSIS=89;
    public static final int EXPONENT=90;
    public static final int WS=91;

    // delegates
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
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:1: start : prog EOF ;
    public final ExprParser.start_return start() throws RecognitionException {
        ExprParser.start_return retval = new ExprParser.start_return();
        retval.start = input.LT(1);
        int start_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.prog_return prog1 = null;


        CommonTree EOF2_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:7: ( prog EOF )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:9: prog EOF
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:1: prog : ( block )+ ;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        CommonTree root_0 = null;

        ExprParser.block_return block3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:7: ( ( block )+ )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: ( block )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: ( block )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=DOT)||(LA1_0>=MINUS && LA1_0<=NOT)||LA1_0==PLUS||LA1_0==IF||LA1_0==SWITCH||LA1_0==FOR||LA1_0==WHILE||LA1_0==OPENP||(LA1_0>=EMPTY_VEC && LA1_0<=INTEGER)||LA1_0==OPENB||LA1_0==OPENC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: block
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:1: functionArgs : expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) ;
    public final ExprParser.functionArgs_return functionArgs() throws RecognitionException {
        ExprParser.functionArgs_return retval = new ExprParser.functionArgs_return();
        retval.start = input.LT(1);
        int functionArgs_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA5=null;
        ExprParser.expr_return expr4 = null;

        ExprParser.expr_return expr6 = null;


        CommonTree COMMA5_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:17: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_functionArgs238);
            expr4=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr4.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:22: ( COMMA expr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:23: COMMA expr
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
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS"), root_1);

                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:51: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:1: functionCall : ( ID OPENP )=> ( ID ( ( OPENP ( functionArgs )? CLOSEP )? ) ) ;
    public final ExprParser.functionCall_return functionCall() throws RecognitionException {
        ExprParser.functionCall_return retval = new ExprParser.functionCall_return();
        retval.start = input.LT(1);
        int functionCall_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ID7=null;
        Token OPENP8=null;
        Token CLOSEP10=null;
        ExprParser.functionArgs_return functionArgs9 = null;


        CommonTree ID7_tree=null;
        CommonTree OPENP8_tree=null;
        CommonTree CLOSEP10_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:15: ( ( ID OPENP )=> ( ID ( ( OPENP ( functionArgs )? CLOSEP )? ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:17: ( ID OPENP )=> ( ID ( ( OPENP ( functionArgs )? CLOSEP )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:31: ( ID ( ( OPENP ( functionArgs )? CLOSEP )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:32: ID ( ( OPENP ( functionArgs )? CLOSEP )? )
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_functionCall272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID7_tree = (CommonTree)adaptor.create(ID7);
            root_0 = (CommonTree)adaptor.becomeRoot(ID7_tree, root_0);
            }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:36: ( ( OPENP ( functionArgs )? CLOSEP )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:17: ( OPENP ( functionArgs )? CLOSEP )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:17: ( OPENP ( functionArgs )? CLOSEP )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:18: OPENP ( functionArgs )? CLOSEP
                    {
                    OPENP8=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall280); if (state.failed) return retval;
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:25: ( functionArgs )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=ID && LA3_0<=DOT)||(LA3_0>=MINUS && LA3_0<=NOT)||LA3_0==PLUS||LA3_0==OPENP||(LA3_0>=EMPTY_VEC && LA3_0<=INTEGER)||LA3_0==OPENB||LA3_0==OPENC) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:25: functionArgs
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:1: functionCallOrStructure : functionCall ( DOT ( OPENP expr CLOSEP | functionCall ) )? ;
    public final ExprParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        ExprParser.functionCallOrStructure_return retval = new ExprParser.functionCallOrStructure_return();
        retval.start = input.LT(1);
        int functionCallOrStructure_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DOT12=null;
        Token OPENP13=null;
        Token CLOSEP15=null;
        ExprParser.functionCall_return functionCall11 = null;

        ExprParser.expr_return expr14 = null;

        ExprParser.functionCall_return functionCall16 = null;


        CommonTree DOT12_tree=null;
        CommonTree OPENP13_tree=null;
        CommonTree CLOSEP15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:25: ( functionCall ( DOT ( OPENP expr CLOSEP | functionCall ) )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:27: functionCall ( DOT ( OPENP expr CLOSEP | functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure307);
            functionCall11=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall11.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:40: ( DOT ( OPENP expr CLOSEP | functionCall ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DOT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID||LA6_1==OPENP) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:41: DOT ( OPENP expr CLOSEP | functionCall )
                    {
                    DOT12=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT12_tree = (CommonTree)adaptor.create(DOT12);
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT12_tree, root_0);
                    }
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:46: ( OPENP expr CLOSEP | functionCall )
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
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:47: OPENP expr CLOSEP
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
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:69: functionCall
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP expr CLOSEP | STRING_LITERAL | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT INTEGER )? | DOT INTEGER );
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
        Token END24=null;
        Token COLON27=null;
        Token TRUE28=null;
        Token FALSE29=null;
        Token INTEGER30=null;
        Token DOT31=null;
        Token INTEGER32=null;
        Token DOT33=null;
        Token INTEGER34=null;
        ExprParser.expr_return expr20 = null;

        ExprParser.functionCallOrStructure_return functionCallOrStructure23 = null;

        ExprParser.vector_return vector25 = null;

        ExprParser.cellArray_return cellArray26 = null;


        CommonTree EMPTY_VEC17_tree=null;
        CommonTree EMPTY_CELL18_tree=null;
        CommonTree OPENP19_tree=null;
        CommonTree CLOSEP21_tree=null;
        CommonTree STRING_LITERAL22_tree=null;
        CommonTree END24_tree=null;
        CommonTree COLON27_tree=null;
        CommonTree TRUE28_tree=null;
        CommonTree FALSE29_tree=null;
        CommonTree INTEGER30_tree=null;
        CommonTree DOT31_tree=null;
        CommonTree INTEGER32_tree=null;
        CommonTree DOT33_tree=null;
        CommonTree INTEGER34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:6: ( EMPTY_VEC | EMPTY_CELL | OPENP expr CLOSEP | STRING_LITERAL | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT INTEGER )? | DOT INTEGER )
            int alt8=13;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMPTY_VEC17=(Token)match(input,EMPTY_VEC,FOLLOW_EMPTY_VEC_in_term337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_VEC17_tree = (CommonTree)adaptor.create(EMPTY_VEC17);
                    adaptor.addChild(root_0, EMPTY_VEC17_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:105:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMPTY_CELL18=(Token)match(input,EMPTY_CELL,FOLLOW_EMPTY_CELL_in_term343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMPTY_CELL18_tree = (CommonTree)adaptor.create(EMPTY_CELL18);
                    adaptor.addChild(root_0, EMPTY_CELL18_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:106:4: OPENP expr CLOSEP
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
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:109:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL22=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL22_tree = (CommonTree)adaptor.create(STRING_LITERAL22);
                    adaptor.addChild(root_0, STRING_LITERAL22_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:114:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCallOrStructure_in_term376);
                    functionCallOrStructure23=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure23.getTree());

                    }
                    break;
                case 6 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:115:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    END24=(Token)match(input,END,FOLLOW_END_in_term382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END24_tree = (CommonTree)adaptor.create(END24);
                    adaptor.addChild(root_0, END24_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:116:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_vector_in_term387);
                    vector25=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector25.getTree());

                    }
                    break;
                case 8 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:117:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cellArray_in_term392);
                    cellArray26=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray26.getTree());

                    }
                    break;
                case 9 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:118:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COLON27=(Token)match(input,COLON,FOLLOW_COLON_in_term397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON27_tree = (CommonTree)adaptor.create(COLON27);
                    adaptor.addChild(root_0, COLON27_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:119:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRUE28=(Token)match(input,TRUE,FOLLOW_TRUE_in_term402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE28_tree = (CommonTree)adaptor.create(TRUE28);
                    adaptor.addChild(root_0, TRUE28_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:120:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FALSE29=(Token)match(input,FALSE,FOLLOW_FALSE_in_term407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE29_tree = (CommonTree)adaptor.create(FALSE29);
                    adaptor.addChild(root_0, FALSE29_tree);
                    }

                    }
                    break;
                case 12 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:122:4: INTEGER ( DOT INTEGER )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER30_tree = (CommonTree)adaptor.create(INTEGER30);
                    adaptor.addChild(root_0, INTEGER30_tree);
                    }
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:122:12: ( DOT INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DOT) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==INTEGER) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:122:13: DOT INTEGER
                            {
                            DOT31=(Token)match(input,DOT,FOLLOW_DOT_in_term417); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT31_tree = (CommonTree)adaptor.create(DOT31);
                            root_0 = (CommonTree)adaptor.becomeRoot(DOT31_tree, root_0);
                            }
                            INTEGER32=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term420); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTEGER32_tree = (CommonTree)adaptor.create(INTEGER32);
                            adaptor.addChild(root_0, INTEGER32_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:123:4: DOT INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT33=(Token)match(input,DOT,FOLLOW_DOT_in_term427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT33_tree = (CommonTree)adaptor.create(DOT33);
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT33_tree, root_0);
                    }
                    INTEGER34=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER34_tree = (CommonTree)adaptor.create(INTEGER34);
                    adaptor.addChild(root_0, INTEGER34_tree);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:130:1: transponent : ( term ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* ) ) ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);
        int transponent_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DOT_CARET36=null;
        Token CARET37=null;
        Token SINGLE_QUOTE39=null;
        Token DOT_TRANSPOSE40=null;
        ExprParser.term_return term35 = null;

        ExprParser.term_return term38 = null;


        CommonTree DOT_CARET36_tree=null;
        CommonTree CARET37_tree=null;
        CommonTree SINGLE_QUOTE39_tree=null;
        CommonTree DOT_TRANSPOSE40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:136:3: ( ( term ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* ) ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:136:5: ( term ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:136:5: ( term ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:136:6: term ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* )
            {
            pushFollow(FOLLOW_term_in_transponent454);
            term35=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term35.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:136:11: ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:3: ( ( DOT_CARET | CARET ) term )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:3: ( ( DOT_CARET | CARET ) term )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=DOT_CARET && LA10_0<=CARET)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:5: ( DOT_CARET | CARET ) term
                    	    {
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:5: ( DOT_CARET | CARET )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==DOT_CARET) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==CARET) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:6: DOT_CARET
                    	            {
                    	            DOT_CARET36=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent463); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET36_tree = (CommonTree)adaptor.create(DOT_CARET36);
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET36_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:137:19: CARET
                    	            {
                    	            CARET37=(Token)match(input,CARET,FOLLOW_CARET_in_transponent468); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET37_tree = (CommonTree)adaptor.create(CARET37);
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET37_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_term_in_transponent472);
                    	    term38=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:5: ( SINGLE_QUOTE | DOT_TRANSPOSE )*
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:5: ( SINGLE_QUOTE | DOT_TRANSPOSE )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==SINGLE_QUOTE) ) {
                            alt11=1;
                        }
                        else if ( (LA11_0==DOT_TRANSPOSE) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:6: SINGLE_QUOTE
                    	    {
                    	    SINGLE_QUOTE39=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent481); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE39_tree = (CommonTree)adaptor.create(SINGLE_QUOTE39);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE39_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:22: DOT_TRANSPOSE
                    	    {
                    	    DOT_TRANSPOSE40=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent486); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE40_tree = (CommonTree)adaptor.create(DOT_TRANSPOSE40);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE40_tree, root_0);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:1: unary : ( PLUS | MINUS | NOT )* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);
        int unary_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS41=null;
        Token MINUS42=null;
        Token NOT43=null;
        ExprParser.transponent_return transponent44 = null;


        CommonTree PLUS41_tree=null;
        CommonTree MINUS42_tree=null;
        CommonTree NOT43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:7: ( ( PLUS | MINUS | NOT )* transponent )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:9: ( PLUS | MINUS | NOT )* transponent
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:9: ( PLUS | MINUS | NOT )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt13=1;
                    }
                    break;
                case MINUS:
                    {
                    alt13=2;
                    }
                    break;
                case NOT:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:10: PLUS
            	    {
            	    PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary509); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:18: MINUS
            	    {
            	    MINUS42=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary514); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS42_tree = (CommonTree)adaptor.create(MINUS42);
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS42_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:27: NOT
            	    {
            	    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_unary519); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT43_tree = (CommonTree)adaptor.create(NOT43);
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT43_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_transponent_in_unary524);
            transponent44=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent44.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:1: mult : unary ( ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH ) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);
        int mult_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DOT_STAR46=null;
        Token DOT_SLASH47=null;
        Token DOT_BACKSLASH48=null;
        Token STAR49=null;
        Token SLASH50=null;
        Token BACKSLASH51=null;
        ExprParser.unary_return unary45 = null;

        ExprParser.unary_return unary52 = null;


        CommonTree DOT_STAR46_tree=null;
        CommonTree DOT_SLASH47_tree=null;
        CommonTree DOT_BACKSLASH48_tree=null;
        CommonTree STAR49_tree=null;
        CommonTree SLASH50_tree=null;
        CommonTree BACKSLASH51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:6: ( unary ( ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH ) unary )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:8: unary ( ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_in_mult532);
            unary45=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary45.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:14: ( ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH ) unary )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=DOT_STAR && LA15_0<=BACKSLASH)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:16: ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH ) unary
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:16: ( DOT_STAR | DOT_SLASH | DOT_BACKSLASH | STAR | SLASH | BACKSLASH )
            	    int alt14=6;
            	    switch ( input.LA(1) ) {
            	    case DOT_STAR:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case DOT_SLASH:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case DOT_BACKSLASH:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case STAR:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt14=5;
            	        }
            	        break;
            	    case BACKSLASH:
            	        {
            	        alt14=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:17: DOT_STAR
            	            {
            	            DOT_STAR46=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult537); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR46_tree = (CommonTree)adaptor.create(DOT_STAR46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:29: DOT_SLASH
            	            {
            	            DOT_SLASH47=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult542); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH47_tree = (CommonTree)adaptor.create(DOT_SLASH47);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:42: DOT_BACKSLASH
            	            {
            	            DOT_BACKSLASH48=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult547); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH48_tree = (CommonTree)adaptor.create(DOT_BACKSLASH48);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:59: STAR
            	            {
            	            STAR49=(Token)match(input,STAR,FOLLOW_STAR_in_mult552); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR49_tree = (CommonTree)adaptor.create(STAR49);
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR49_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:67: SLASH
            	            {
            	            SLASH50=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult557); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH50_tree = (CommonTree)adaptor.create(SLASH50);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH50_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:76: BACKSLASH
            	            {
            	            BACKSLASH51=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult562); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH51_tree = (CommonTree)adaptor.create(BACKSLASH51);
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH51_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_in_mult566);
            	    unary52=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary52.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:1: add : mult ( ( PLUS | MINUS ) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);
        int add_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS54=null;
        Token MINUS55=null;
        ExprParser.mult_return mult53 = null;

        ExprParser.mult_return mult56 = null;


        CommonTree PLUS54_tree=null;
        CommonTree MINUS55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:5: ( mult ( ( PLUS | MINUS ) mult )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:7: mult ( ( PLUS | MINUS ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add578);
            mult53=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult53.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:12: ( ( PLUS | MINUS ) mult )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:14: ( PLUS | MINUS ) mult
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:14: ( PLUS | MINUS )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:15: PLUS
            	            {
            	            PLUS54=(Token)match(input,PLUS,FOLLOW_PLUS_in_add583); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS54_tree = (CommonTree)adaptor.create(PLUS54);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS54_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:23: MINUS
            	            {
            	            MINUS55=(Token)match(input,MINUS,FOLLOW_MINUS_in_add588); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS55_tree = (CommonTree)adaptor.create(MINUS55);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS55_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add592);
            	    mult56=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult56.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final ExprParser.colonEnd_return colonEnd() throws RecognitionException {
        ExprParser.colonEnd_return retval = new ExprParser.colonEnd_return();
        retval.start = input.LT(1);
        int colonEnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COLON57=null;
        ExprParser.add_return add58 = null;


        CommonTree COLON57_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:11: ( COLON add )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:11: ( COLON add )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:12: COLON add
            	    {
            	    COLON57=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd603); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON57);

            	    pushFollow(FOLLOW_add_in_colonEnd605);
            	    add58=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add58.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // 148:24: -> ^( COLON_ARGS ( add )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:148:27: ^( COLON_ARGS ( add )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLON_ARGS, "COLON_ARGS"), root_1);

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

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:150:1: colon : add ( colonEnd )? ;
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);
        int colon_StartIndex = input.index();
        CommonTree root_0 = null;

        ExprParser.add_return add59 = null;

        ExprParser.colonEnd_return colonEnd60 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:150:7: ( add ( colonEnd )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:150:9: add ( colonEnd )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_colon624);
            add59=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add59.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:150:13: ( colonEnd )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:150:14: colonEnd
                    {
                    pushFollow(FOLLOW_colonEnd_in_colon627);
                    colonEnd60=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd60.getTree(), root_0);

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:1: logical : colon ( ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL ) colon )* ;
    public final ExprParser.logical_return logical() throws RecognitionException {
        ExprParser.logical_return retval = new ExprParser.logical_return();
        retval.start = input.LT(1);
        int logical_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LESS_THAN62=null;
        Token GREATER_THAN63=null;
        Token LESS_EQUAL64=null;
        Token GREATER_EQUAL65=null;
        Token ISEQUAL66=null;
        Token NOT_EQUAL67=null;
        ExprParser.colon_return colon61 = null;

        ExprParser.colon_return colon68 = null;


        CommonTree LESS_THAN62_tree=null;
        CommonTree GREATER_THAN63_tree=null;
        CommonTree LESS_EQUAL64_tree=null;
        CommonTree GREATER_EQUAL65_tree=null;
        CommonTree ISEQUAL66_tree=null;
        CommonTree NOT_EQUAL67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:9: ( colon ( ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL ) colon )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:11: colon ( ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL ) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_colon_in_logical655);
            colon61=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon61.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:17: ( ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL ) colon )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=LESS_THAN && LA21_0<=LESS_EQUAL)||(LA21_0>=ISEQUAL && LA21_0<=NOT_EQUAL)||LA21_0==GREATER_EQUAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:19: ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL ) colon
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:19: ( LESS_THAN | GREATER_THAN | LESS_EQUAL | GREATER_EQUAL | ISEQUAL | NOT_EQUAL )
            	    int alt20=6;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case LESS_EQUAL:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case GREATER_EQUAL:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    case ISEQUAL:
            	        {
            	        alt20=5;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt20=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:20: LESS_THAN
            	            {
            	            LESS_THAN62=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical660); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN62_tree = (CommonTree)adaptor.create(LESS_THAN62);
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:33: GREATER_THAN
            	            {
            	            GREATER_THAN63=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical665); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN63_tree = (CommonTree)adaptor.create(GREATER_THAN63);
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:49: LESS_EQUAL
            	            {
            	            LESS_EQUAL64=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical670); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL64_tree = (CommonTree)adaptor.create(LESS_EQUAL64);
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:63: GREATER_EQUAL
            	            {
            	            GREATER_EQUAL65=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical675); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL65_tree = (CommonTree)adaptor.create(GREATER_EQUAL65);
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:80: ISEQUAL
            	            {
            	            ISEQUAL66=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical680); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL66_tree = (CommonTree)adaptor.create(ISEQUAL66);
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:91: NOT_EQUAL
            	            {
            	            NOT_EQUAL67=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical685); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL67_tree = (CommonTree)adaptor.create(NOT_EQUAL67);
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL67_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_colon_in_logical689);
            	    colon68=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon68.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:1: eleAnd : logical ( ELE_AND logical )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);
        int eleAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ELE_AND70=null;
        ExprParser.logical_return logical69 = null;

        ExprParser.logical_return logical71 = null;


        CommonTree ELE_AND70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:8: ( logical ( ELE_AND logical )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:10: logical ( ELE_AND logical )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_in_eleAnd701);
            logical69=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical69.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:18: ( ELE_AND logical )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELE_AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:19: ELE_AND logical
            	    {
            	    ELE_AND70=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd704); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND70_tree = (CommonTree)adaptor.create(ELE_AND70);
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND70_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_in_eleAnd707);
            	    logical71=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical71.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:1: eleOr : eleAnd ( ELE_OR eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);
        int eleOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ELE_OR73=null;
        ExprParser.eleAnd_return eleAnd72 = null;

        ExprParser.eleAnd_return eleAnd74 = null;


        CommonTree ELE_OR73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:7: ( eleAnd ( ELE_OR eleAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:9: eleAnd ( ELE_OR eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eleAnd_in_eleOr718);
            eleAnd72=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd72.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:16: ( ELE_OR eleAnd )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ELE_OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:17: ELE_OR eleAnd
            	    {
            	    ELE_OR73=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr721); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR73_tree = (CommonTree)adaptor.create(ELE_OR73);
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR73_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_eleAnd_in_eleOr724);
            	    eleAnd74=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd74.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:167:1: scAnd : eleOr ( SC_AND eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);
        int scAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SC_AND76=null;
        ExprParser.eleOr_return eleOr75 = null;

        ExprParser.eleOr_return eleOr77 = null;


        CommonTree SC_AND76_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:167:7: ( eleOr ( SC_AND eleOr )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:167:9: eleOr ( SC_AND eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_eleOr_in_scAnd735);
            eleOr75=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr75.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:167:15: ( SC_AND eleOr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SC_AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:167:16: SC_AND eleOr
            	    {
            	    SC_AND76=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd738); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND76_tree = (CommonTree)adaptor.create(SC_AND76);
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND76_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_eleOr_in_scAnd741);
            	    eleOr77=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr77.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:169:1: scOr : scAnd ( SC_OR scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);
        int scOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SC_OR79=null;
        ExprParser.scAnd_return scAnd78 = null;

        ExprParser.scAnd_return scAnd80 = null;


        CommonTree SC_OR79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:169:6: ( scAnd ( SC_OR scAnd )* )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:169:8: scAnd ( SC_OR scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_scAnd_in_scOr752);
            scAnd78=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd78.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:169:14: ( SC_OR scAnd )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SC_OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:169:15: SC_OR scAnd
            	    {
            	    SC_OR79=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr755); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR79_tree = (CommonTree)adaptor.create(SC_OR79);
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR79_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_scAnd_in_scOr758);
            	    scAnd80=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd80.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final ExprParser.hCatVec_return hCatVec() throws RecognitionException {
        ExprParser.hCatVec_return retval = new ExprParser.hCatVec_return();
        retval.start = input.LT(1);
        int hCatVec_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA82=null;
        ExprParser.expr_return expr81 = null;

        ExprParser.expr_return expr83 = null;


        CommonTree COMMA82_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatVec781);
            expr81=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr81.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:16: ( ( COMMA )? expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=ID && LA27_0<=DOT)||(LA27_0>=MINUS && LA27_0<=NOT)||LA27_0==PLUS||(LA27_0>=COMMA && LA27_0<=OPENP)||(LA27_0>=EMPTY_VEC && LA27_0<=INTEGER)||LA27_0==OPENB||LA27_0==OPENC) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:17: ( COMMA )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==COMMA) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:18: COMMA
            	            {
            	            COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec785); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_in_hCatVec789);
            	    expr83=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 183:33: -> ^( HCAT_VEC ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:36: ^( HCAT_VEC ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HCAT_VEC, "HCAT_VEC"), root_1);

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

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final ExprParser.vCatVec_return vCatVec() throws RecognitionException {
        ExprParser.vCatVec_return retval = new ExprParser.vCatVec_return();
        retval.start = input.LT(1);
        int vCatVec_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI85=null;
        ExprParser.hCatVec_return hCatVec84 = null;

        ExprParser.hCatVec_return hCatVec86 = null;


        CommonTree SEMI85_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            pushFollow(FOLLOW_hCatVec_in_vCatVec808);
            hCatVec84=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec84.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:19: ( ( SEMI ) hCatVec )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==SEMI) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:20: ( SEMI ) hCatVec
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:20: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:21: SEMI
            	    {
            	    SEMI85=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec812); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI85);


            	    }

            	    pushFollow(FOLLOW_hCatVec_in_vCatVec815);
            	    hCatVec86=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec86.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
            // 185:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:40: ^( VCAT_VEC ( hCatVec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VCAT_VEC, "VCAT_VEC"), root_1);

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

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:1: vector : OPENB vCatVec CLOSEB ;
    public final ExprParser.vector_return vector() throws RecognitionException {
        ExprParser.vector_return retval = new ExprParser.vector_return();
        retval.start = input.LT(1);
        int vector_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OPENB87=null;
        Token CLOSEB89=null;
        ExprParser.vCatVec_return vCatVec88 = null;


        CommonTree OPENB87_tree=null;
        CommonTree CLOSEB89_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:8: ( OPENB vCatVec CLOSEB )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:10: OPENB vCatVec CLOSEB
            {
            root_0 = (CommonTree)adaptor.nil();

            OPENB87=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector834); if (state.failed) return retval;
            pushFollow(FOLLOW_vCatVec_in_vector837);
            vCatVec88=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec88.getTree());
            CLOSEB89=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector839); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final ExprParser.hCatCell_return hCatCell() throws RecognitionException {
        ExprParser.hCatCell_return retval = new ExprParser.hCatCell_return();
        retval.start = input.LT(1);
        int hCatCell_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA91=null;
        ExprParser.expr_return expr90 = null;

        ExprParser.expr_return expr92 = null;


        CommonTree COMMA91_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:11: expr ( ( COMMA )? expr )*
            {
            pushFollow(FOLLOW_expr_in_hCatCell847);
            expr90=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:16: ( ( COMMA )? expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=ID && LA30_0<=DOT)||(LA30_0>=MINUS && LA30_0<=NOT)||LA30_0==PLUS||(LA30_0>=COMMA && LA30_0<=OPENP)||(LA30_0>=EMPTY_VEC && LA30_0<=INTEGER)||LA30_0==OPENB||LA30_0==OPENC) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:17: ( COMMA )? expr
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:17: ( COMMA )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==COMMA) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:18: COMMA
            	            {
            	            COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell851); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_in_hCatCell855);
            	    expr92=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr92.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 189:34: -> ^( HCAT_CELL ( expr )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:37: ^( HCAT_CELL ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HCAT_CELL, "HCAT_CELL"), root_1);

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

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:1: vCatCell : hCatCell ( ( SEMI ) hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final ExprParser.vCatCell_return vCatCell() throws RecognitionException {
        ExprParser.vCatCell_return retval = new ExprParser.vCatCell_return();
        retval.start = input.LT(1);
        int vCatCell_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI94=null;
        ExprParser.hCatCell_return hCatCell93 = null;

        ExprParser.hCatCell_return hCatCell95 = null;


        CommonTree SEMI94_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:9: ( hCatCell ( ( SEMI ) hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:11: hCatCell ( ( SEMI ) hCatCell )*
            {
            pushFollow(FOLLOW_hCatCell_in_vCatCell874);
            hCatCell93=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell93.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:20: ( ( SEMI ) hCatCell )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==SEMI) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:21: ( SEMI ) hCatCell
            	    {
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:21: ( SEMI )
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:22: SEMI
            	    {
            	    SEMI94=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell878); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI94);


            	    }

            	    pushFollow(FOLLOW_hCatCell_in_vCatCell882);
            	    hCatCell95=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell95.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 191:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:43: ^( VCAT_CELL ( hCatCell )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VCAT_CELL, "VCAT_CELL"), root_1);

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

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:193:1: cellArray : OPENC vCatCell CLOSEC ;
    public final ExprParser.cellArray_return cellArray() throws RecognitionException {
        ExprParser.cellArray_return retval = new ExprParser.cellArray_return();
        retval.start = input.LT(1);
        int cellArray_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OPENC96=null;
        Token CLOSEC98=null;
        ExprParser.vCatCell_return vCatCell97 = null;


        CommonTree OPENC96_tree=null;
        CommonTree CLOSEC98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:193:11: ( OPENC vCatCell CLOSEC )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:193:13: OPENC vCatCell CLOSEC
            {
            root_0 = (CommonTree)adaptor.nil();

            OPENC96=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray901); if (state.failed) return retval;
            pushFollow(FOLLOW_vCatCell_in_cellArray904);
            vCatCell97=vCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell97.getTree());
            CLOSEC98=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray906); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:195:1: expr : scOr ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        CommonTree root_0 = null;

        ExprParser.scOr_return scOr99 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:195:6: ( scOr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:195:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_scOr_in_expr919);
            scOr99=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr99.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:1: line : ( ( ( term EQUALS )=> ( term EQUALS ) )? expr ( SEMI )? ) ;
    public final ExprParser.line_return line() throws RecognitionException {
        ExprParser.line_return retval = new ExprParser.line_return();
        retval.start = input.LT(1);
        int line_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EQUALS101=null;
        Token SEMI103=null;
        ExprParser.term_return term100 = null;

        ExprParser.expr_return expr102 = null;


        CommonTree EQUALS101_tree=null;
        CommonTree SEMI103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:6: ( ( ( ( term EQUALS )=> ( term EQUALS ) )? expr ( SEMI )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:28: ( ( ( term EQUALS )=> ( term EQUALS ) )? expr ( SEMI )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:28: ( ( ( term EQUALS )=> ( term EQUALS ) )? expr ( SEMI )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:29: ( ( term EQUALS )=> ( term EQUALS ) )? expr ( SEMI )?
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:29: ( ( term EQUALS )=> ( term EQUALS ) )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:30: ( term EQUALS )=> ( term EQUALS )
                    {
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:47: ( term EQUALS )
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:48: term EQUALS
                    {
                    pushFollow(FOLLOW_term_in_line948);
                    term100=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term100.getTree());
                    EQUALS101=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS101_tree = (CommonTree)adaptor.create(EQUALS101);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS101_tree, root_0);
                    }

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_line957);
            expr102=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr102.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:204:7: ( SEMI )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SEMI) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:204:8: SEMI
                    {
                    SEMI103=(Token)match(input,SEMI,FOLLOW_SEMI_in_line960); if (state.failed) return retval;

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:1: ifPart : IF expr ( block )? ;
    public final ExprParser.ifPart_return ifPart() throws RecognitionException {
        ExprParser.ifPart_return retval = new ExprParser.ifPart_return();
        retval.start = input.LT(1);
        int ifPart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF104=null;
        ExprParser.expr_return expr105 = null;

        ExprParser.block_return block106 = null;


        CommonTree IF104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:8: ( IF expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:10: IF expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();

            IF104=(Token)match(input,IF,FOLLOW_IF_in_ifPart979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF104_tree = (CommonTree)adaptor.create(IF104);
            root_0 = (CommonTree)adaptor.becomeRoot(IF104_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_ifPart982);
            expr105=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr105.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:19: ( block )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=ID && LA34_0<=DOT)||(LA34_0>=MINUS && LA34_0<=NOT)||LA34_0==PLUS||LA34_0==IF||LA34_0==SWITCH||LA34_0==FOR||LA34_0==WHILE||LA34_0==OPENP||(LA34_0>=EMPTY_VEC && LA34_0<=INTEGER)||LA34_0==OPENB||LA34_0==OPENC) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:19: block
                    {
                    pushFollow(FOLLOW_block_in_ifPart984);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block106.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:1: elseifPart : ( ELSEIF e2= expr (b2= block )? ) ;
    public final ExprParser.elseifPart_return elseifPart() throws RecognitionException {
        ExprParser.elseifPart_return retval = new ExprParser.elseifPart_return();
        retval.start = input.LT(1);
        int elseifPart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ELSEIF107=null;
        ExprParser.expr_return e2 = null;

        ExprParser.block_return b2 = null;


        CommonTree ELSEIF107_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:12: ( ( ELSEIF e2= expr (b2= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:14: ( ELSEIF e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:14: ( ELSEIF e2= expr (b2= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:15: ELSEIF e2= expr (b2= block )?
            {
            ELSEIF107=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart993); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF107_tree = (CommonTree)adaptor.create(ELSEIF107);
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF107_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_elseifPart998);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:33: (b2= block )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=ID && LA35_0<=DOT)||(LA35_0>=MINUS && LA35_0<=NOT)||LA35_0==PLUS||LA35_0==IF||LA35_0==SWITCH||LA35_0==FOR||LA35_0==WHILE||LA35_0==OPENP||(LA35_0>=EMPTY_VEC && LA35_0<=INTEGER)||LA35_0==OPENB||LA35_0==OPENC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:33: b2= block
                    {
                    pushFollow(FOLLOW_block_in_elseifPart1002);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:1: elsePart : ( ELSE (b3= block )? ) ;
    public final ExprParser.elsePart_return elsePart() throws RecognitionException {
        ExprParser.elsePart_return retval = new ExprParser.elsePart_return();
        retval.start = input.LT(1);
        int elsePart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ELSE108=null;
        ExprParser.block_return b3 = null;


        CommonTree ELSE108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:10: ( ( ELSE (b3= block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:11: ( ELSE (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:11: ( ELSE (b3= block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:12: ELSE (b3= block )?
            {
            ELSE108=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart1011); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE108_tree = (CommonTree)adaptor.create(ELSE108);
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE108_tree, root_0);
            }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:20: (b3= block )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=ID && LA36_0<=DOT)||(LA36_0>=MINUS && LA36_0<=NOT)||LA36_0==PLUS||LA36_0==IF||LA36_0==SWITCH||LA36_0==FOR||LA36_0==WHILE||LA36_0==OPENP||(LA36_0>=EMPTY_VEC && LA36_0<=INTEGER)||LA36_0==OPENB||LA36_0==OPENC) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:20: b3= block
                    {
                    pushFollow(FOLLOW_block_in_elsePart1016);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:214:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final ExprParser.ifBlock_return ifBlock() throws RecognitionException {
        ExprParser.ifBlock_return retval = new ExprParser.ifBlock_return();
        retval.start = input.LT(1);
        int ifBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BLOCK_END112=null;
        ExprParser.ifPart_return ifPart109 = null;

        ExprParser.elseifPart_return elseifPart110 = null;

        ExprParser.elsePart_return elsePart111 = null;


        CommonTree BLOCK_END112_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:214:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:215:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            pushFollow(FOLLOW_ifPart_in_ifBlock1027);
            ifPart109=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart109.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:216:9: ( elseifPart )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ELSEIF) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:216:9: elseifPart
            	    {
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1037);
            	    elseifPart110=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart110.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:217:9: ( elsePart )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ELSE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:217:9: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifBlock1048);
                    elsePart111=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart111.getTree());

                    }
                    break;

            }

            BLOCK_END112=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END112);



            // AST REWRITE
            // elements: ifPart, elsePart, elseifPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 219:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:219:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_STAT, "IF_STAT"), root_1);

                adaptor.addChild(root_1, stream_ifPart.nextTree());
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:219:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:219:41: ( elsePart )?
                if ( stream_elsePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsePart.nextTree());

                }
                stream_elsePart.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:224:1: switchPart : SWITCH expr ;
    public final ExprParser.switchPart_return switchPart() throws RecognitionException {
        ExprParser.switchPart_return retval = new ExprParser.switchPart_return();
        retval.start = input.LT(1);
        int switchPart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SWITCH113=null;
        ExprParser.expr_return expr114 = null;


        CommonTree SWITCH113_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:224:12: ( SWITCH expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:224:14: SWITCH expr
            {
            root_0 = (CommonTree)adaptor.nil();

            SWITCH113=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH113_tree = (CommonTree)adaptor.create(SWITCH113);
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH113_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_switchPart1120);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:1: casePart : CASE expr ( block )? ;
    public final ExprParser.casePart_return casePart() throws RecognitionException {
        ExprParser.casePart_return retval = new ExprParser.casePart_return();
        retval.start = input.LT(1);
        int casePart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CASE115=null;
        ExprParser.expr_return expr116 = null;

        ExprParser.block_return block117 = null;


        CommonTree CASE115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:10: ( CASE expr ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:12: CASE expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();

            CASE115=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1127); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE115_tree = (CommonTree)adaptor.create(CASE115);
            root_0 = (CommonTree)adaptor.becomeRoot(CASE115_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_casePart1130);
            expr116=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr116.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:23: ( block )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=ID && LA39_0<=DOT)||(LA39_0>=MINUS && LA39_0<=NOT)||LA39_0==PLUS||LA39_0==IF||LA39_0==SWITCH||LA39_0==FOR||LA39_0==WHILE||LA39_0==OPENP||(LA39_0>=EMPTY_VEC && LA39_0<=INTEGER)||LA39_0==OPENB||LA39_0==OPENC) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:23: block
                    {
                    pushFollow(FOLLOW_block_in_casePart1132);
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:1: otherwiseBlock : OTHERWISE ( block )? ;
    public final ExprParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        ExprParser.otherwiseBlock_return retval = new ExprParser.otherwiseBlock_return();
        retval.start = input.LT(1);
        int otherwiseBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OTHERWISE118=null;
        ExprParser.block_return block119 = null;


        CommonTree OTHERWISE118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:16: ( OTHERWISE ( block )? )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:18: OTHERWISE ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();

            OTHERWISE118=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE118_tree = (CommonTree)adaptor.create(OTHERWISE118);
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE118_tree, root_0);
            }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:29: ( block )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ID && LA40_0<=DOT)||(LA40_0>=MINUS && LA40_0<=NOT)||LA40_0==PLUS||LA40_0==IF||LA40_0==SWITCH||LA40_0==FOR||LA40_0==WHILE||LA40_0==OPENP||(LA40_0>=EMPTY_VEC && LA40_0<=INTEGER)||LA40_0==OPENB||LA40_0==OPENC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:29: block
                    {
                    pushFollow(FOLLOW_block_in_otherwiseBlock1143);
                    block119=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block119.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:227:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final ExprParser.switchBlock_return switchBlock() throws RecognitionException {
        ExprParser.switchBlock_return retval = new ExprParser.switchBlock_return();
        retval.start = input.LT(1);
        int switchBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BLOCK_END123=null;
        ExprParser.switchPart_return switchPart120 = null;

        ExprParser.casePart_return casePart121 = null;

        ExprParser.otherwiseBlock_return otherwiseBlock122 = null;


        CommonTree BLOCK_END123_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:227:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:228:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            pushFollow(FOLLOW_switchPart_in_switchBlock1153);
            switchPart120=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart120.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:229:2: ( casePart )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==CASE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:229:2: casePart
            	    {
            	    pushFollow(FOLLOW_casePart_in_switchBlock1156);
            	    casePart121=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart121.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:230:2: ( otherwiseBlock )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==OTHERWISE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:230:2: otherwiseBlock
                    {
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1160);
                    otherwiseBlock122=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock122.getTree());

                    }
                    break;

            }

            BLOCK_END123=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END123);



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
            // 232:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:232:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT"), root_1);

                adaptor.addChild(root_1, stream_switchPart.nextTree());
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:232:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:232:40: ( otherwiseBlock )?
                if ( stream_otherwiseBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_otherwiseBlock.nextTree());

                }
                stream_otherwiseBlock.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:235:1: forPart : FOR ID EQUALS expr ;
    public final ExprParser.forPart_return forPart() throws RecognitionException {
        ExprParser.forPart_return retval = new ExprParser.forPart_return();
        retval.start = input.LT(1);
        int forPart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR124=null;
        Token ID125=null;
        Token EQUALS126=null;
        ExprParser.expr_return expr127 = null;


        CommonTree FOR124_tree=null;
        CommonTree ID125_tree=null;
        CommonTree EQUALS126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:235:9: ( FOR ID EQUALS expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:235:11: FOR ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR124=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR124_tree = (CommonTree)adaptor.create(FOR124);
            root_0 = (CommonTree)adaptor.becomeRoot(FOR124_tree, root_0);
            }
            ID125=(Token)match(input,ID,FOLLOW_ID_in_forPart1192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID125_tree = (CommonTree)adaptor.create(ID125);
            adaptor.addChild(root_0, ID125_tree);
            }
            EQUALS126=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS126_tree = (CommonTree)adaptor.create(EQUALS126);
            adaptor.addChild(root_0, EQUALS126_tree);
            }
            pushFollow(FOLLOW_expr_in_forPart1196);
            expr127=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:236:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final ExprParser.forBlock_return forBlock() throws RecognitionException {
        ExprParser.forBlock_return retval = new ExprParser.forBlock_return();
        retval.start = input.LT(1);
        int forBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BLOCK_END130=null;
        ExprParser.forPart_return forPart128 = null;

        ExprParser.block_return block129 = null;


        CommonTree BLOCK_END130_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:236:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:237:2: forPart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_forPart_in_forBlock1206);
            forPart128=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart128.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:238:2: ( block )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=ID && LA43_0<=DOT)||(LA43_0>=MINUS && LA43_0<=NOT)||LA43_0==PLUS||LA43_0==IF||LA43_0==SWITCH||LA43_0==FOR||LA43_0==WHILE||LA43_0==OPENP||(LA43_0>=EMPTY_VEC && LA43_0<=INTEGER)||LA43_0==OPENB||LA43_0==OPENC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:238:2: block
                    {
                    pushFollow(FOLLOW_block_in_forBlock1209);
                    block129=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block129.getTree());

                    }
                    break;

            }

            BLOCK_END130=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END130);



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
            // 240:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:240:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP"), root_1);

                adaptor.addChild(root_1, stream_forPart.nextTree());
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:240:24: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:243:1: whilePart : WHILE expr ;
    public final ExprParser.whilePart_return whilePart() throws RecognitionException {
        ExprParser.whilePart_return retval = new ExprParser.whilePart_return();
        retval.start = input.LT(1);
        int whilePart_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE131=null;
        ExprParser.expr_return expr132 = null;


        CommonTree WHILE131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:243:11: ( WHILE expr )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:243:13: WHILE expr
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE131=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE131_tree = (CommonTree)adaptor.create(WHILE131);
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE131_tree, root_0);
            }
            pushFollow(FOLLOW_expr_in_whilePart1239);
            expr132=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:244:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final ExprParser.whileBlock_return whileBlock() throws RecognitionException {
        ExprParser.whileBlock_return retval = new ExprParser.whileBlock_return();
        retval.start = input.LT(1);
        int whileBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BLOCK_END135=null;
        ExprParser.whilePart_return whilePart133 = null;

        ExprParser.block_return block134 = null;


        CommonTree BLOCK_END135_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:244:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:245:2: whilePart ( block )? BLOCK_END
            {
            pushFollow(FOLLOW_whilePart_in_whileBlock1248);
            whilePart133=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart133.getTree());
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:246:2: ( block )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=ID && LA44_0<=DOT)||(LA44_0>=MINUS && LA44_0<=NOT)||LA44_0==PLUS||LA44_0==IF||LA44_0==SWITCH||LA44_0==FOR||LA44_0==WHILE||LA44_0==OPENP||(LA44_0>=EMPTY_VEC && LA44_0<=INTEGER)||LA44_0==OPENB||LA44_0==OPENC) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:246:2: block
                    {
                    pushFollow(FOLLOW_block_in_whileBlock1251);
                    block134=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block134.getTree());

                    }
                    break;

            }

            BLOCK_END135=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END135);



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
            // 248:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP"), root_1);

                adaptor.addChild(root_1, stream_whilePart.nextTree());
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:28: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final ExprParser.blockPart_return blockPart() throws RecognitionException {
        ExprParser.blockPart_return retval = new ExprParser.blockPart_return();
        retval.start = input.LT(1);
        int blockPart_StartIndex = input.index();
        CommonTree root_0 = null;

        ExprParser.ifBlock_return ifBlock136 = null;

        ExprParser.switchBlock_return switchBlock137 = null;

        ExprParser.forBlock_return forBlock138 = null;

        ExprParser.whileBlock_return whileBlock139 = null;

        ExprParser.line_return line140 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt45=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt45=1;
                }
                break;
            case SWITCH:
                {
                alt45=2;
                }
                break;
            case FOR:
                {
                alt45=3;
                }
                break;
            case WHILE:
                {
                alt45=4;
                }
                break;
            case ID:
            case DOT:
            case MINUS:
            case NOT:
            case PLUS:
            case OPENP:
            case EMPTY_VEC:
            case EMPTY_CELL:
            case STRING_LITERAL:
            case END:
            case COLON:
            case TRUE:
            case FALSE:
            case INTEGER:
            case OPENB:
            case OPENC:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:13: ifBlock
                    {
                    pushFollow(FOLLOW_ifBlock_in_blockPart1278);
                    ifBlock136=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock136.getTree());

                    }
                    break;
                case 2 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:23: switchBlock
                    {
                    pushFollow(FOLLOW_switchBlock_in_blockPart1282);
                    switchBlock137=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock137.getTree());

                    }
                    break;
                case 3 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:37: forBlock
                    {
                    pushFollow(FOLLOW_forBlock_in_blockPart1286);
                    forBlock138=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock138.getTree());

                    }
                    break;
                case 4 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:48: whileBlock
                    {
                    pushFollow(FOLLOW_whileBlock_in_blockPart1290);
                    whileBlock139=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock139.getTree());

                    }
                    break;
                case 5 :
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:251:61: line
                    {
                    pushFollow(FOLLOW_line_in_blockPart1294);
                    line140=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line140.getTree());

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
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final ExprParser.block_return block() throws RecognitionException {
        ExprParser.block_return retval = new ExprParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        CommonTree root_0 = null;

        ExprParser.blockPart_return blockPart141 = null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:9: ( blockPart )+
            {
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:9: ( blockPart )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:9: blockPart
            	    {
            	    pushFollow(FOLLOW_blockPart_in_block1302);
            	    blockPart141=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart141.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
            // 252:20: -> ^( BLOCK ( blockPart )+ )
            {
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:252:23: ^( BLOCK ( blockPart )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

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

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 39, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {   
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:30: ( term EQUALS )
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:203:31: term EQUALS
        {
        pushFollow(FOLLOW_term_in_synpred2_Grammar940);
        term();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Grammar942); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Grammar

    // Delegated rules

    public final boolean synpred2_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA4_eotS =
        "\65\uffff";
    static final String DFA4_eofS =
        "\1\2\64\uffff";
    static final String DFA4_minS =
        "\1\5\64\uffff";
    static final String DFA4_maxS =
        "\1\102\64\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\62\uffff";
    static final String DFA4_specialS =
        "\65\uffff}>";
    static final String[] DFA4_transitionS = {
            "\17\2\1\uffff\3\2\1\uffff\6\2\4\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\1\20\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "92:17: ( OPENP ( functionArgs )? CLOSEP )?";
        }
    }
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\5\15\uffff";
    static final String DFA8_maxS =
        "\1\100\15\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA8_specialS =
        "\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\15\53\uffff\1\3\1\uffff\1\1\1\2\1\4\1\6\1\11\1\12\1\13"+
            "\1\14\2\uffff\1\7\1\uffff\1\10",
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
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "104:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP expr CLOSEP | STRING_LITERAL | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE | INTEGER ( DOT INTEGER )? | DOT INTEGER );";
        }
    }
    static final String DFA12_eotS =
        "\64\uffff";
    static final String DFA12_eofS =
        "\1\50\63\uffff";
    static final String DFA12_minS =
        "\1\5\63\uffff";
    static final String DFA12_maxS =
        "\1\102\63\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\57\1\1\2\1\uffff";
    static final String DFA12_specialS =
        "\64\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\34\1\44\2\1\2\62\1\12\1\27\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\uffff\1\13\1\14\1\15\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\5\uffff\1\51\1\55\1\56\1\uffff\1\52\1\61\1\60\1\uffff\1\53"+
            "\1\uffff\1\54\2\uffff\1\25\1\32\1\26\1\30\1\31\1\33\1\35\1\40"+
            "\1\41\1\42\1\43\1\16\1\45\1\36\1\46\1\37\1\47\1\57",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "136:11: ( ( ( DOT_CARET | CARET ) term )* | ( SINGLE_QUOTE | DOT_TRANSPOSE )* )";
        }
    }
    static final String DFA17_eotS =
        "\52\uffff";
    static final String DFA17_eofS =
        "\1\1\51\uffff";
    static final String DFA17_minS =
        "\1\5\51\uffff";
    static final String DFA17_maxS =
        "\1\102\51\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\13\uffff\2\1\33\uffff";
    static final String DFA17_specialS =
        "\52\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\1\4\uffff\1\16\1\1\6\uffff\1\15\1\uffff\3\1\1\uffff\6\1\5"+
            "\uffff\3\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\22\1",
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
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 146:12: ( ( PLUS | MINUS ) mult )*";
        }
    }
    static final String DFA18_eotS =
        "\52\uffff";
    static final String DFA18_eofS =
        "\1\1\51\uffff";
    static final String DFA18_minS =
        "\1\5\51\uffff";
    static final String DFA18_maxS =
        "\1\102\51\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\26\uffff\1\1\21\uffff";
    static final String DFA18_specialS =
        "\52\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\1\4\uffff\2\1\6\uffff\1\1\1\uffff\3\1\1\uffff\6\1\5\uffff"+
            "\3\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\7\1\1\30\12"+
            "\1",
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
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()+ loopback of 148:11: ( COLON add )+";
        }
    }
    static final String DFA19_eotS =
        "\52\uffff";
    static final String DFA19_eofS =
        "\1\2\51\uffff";
    static final String DFA19_minS =
        "\1\5\51\uffff";
    static final String DFA19_maxS =
        "\1\102\51\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\47\uffff";
    static final String DFA19_specialS =
        "\52\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\2\4\uffff\2\2\6\uffff\1\2\1\uffff\3\2\1\uffff\6\2\5\uffff"+
            "\3\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\7\2\1\1\12"+
            "\2",
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
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "150:13: ( colonEnd )?";
        }
    }
    static final String DFA32_eotS =
        "\22\uffff";
    static final String DFA32_eofS =
        "\22\uffff";
    static final String DFA32_minS =
        "\1\5\15\0\4\uffff";
    static final String DFA32_maxS =
        "\1\100\15\0\4\uffff";
    static final String DFA32_acceptS =
        "\16\uffff\1\2\2\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\4\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\5\1\15\4\uffff\2\16\6\uffff\1\16\36\uffff\1\3\1\uffff\1\1"+
            "\1\2\1\4\1\6\1\11\1\12\1\13\1\14\2\uffff\1\7\1\uffff\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "203:29: ( ( term EQUALS )=> ( term EQUALS ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Grammar()) ) {s = 17;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\33\uffff";
    static final String DFA46_eofS =
        "\1\1\32\uffff";
    static final String DFA46_minS =
        "\1\5\32\uffff";
    static final String DFA46_maxS =
        "\1\102\32\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\24\1\5\uffff";
    static final String DFA46_specialS =
        "\33\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\12\1\22\4\uffff\1\24\1\25\6\uffff\1\23\20\uffff\1\2\2\1\1"+
            "\uffff\1\3\2\1\1\uffff\1\4\1\uffff\1\5\3\uffff\1\10\1\uffff"+
            "\1\6\1\7\1\11\1\13\1\16\1\17\1\20\1\21\2\uffff\1\14\1\uffff"+
            "\1\15\1\uffff\1\1",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()+ loopback of 252:9: ( blockPart )+";
        }
    }
 

    public static final BitSet FOLLOW_prog_in_start204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog217 = new BitSet(new long[]{0x4FF4511000081862L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_functionArgs238 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs241 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_functionArgs243 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ID_in_functionCall272 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OPENP_in_functionCall280 = new BitSet(new long[]{0x4FFE511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall283 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure307 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure310 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure314 = new BitSet(new long[]{0x4FFC511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure317 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term348 = new BitSet(new long[]{0x4FFC511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_term351 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term414 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DOT_in_term417 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term427 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_term430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent454 = new BitSet(new long[]{0x0000000000000782L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent463 = new BitSet(new long[]{0x4FF4000000000060L,0x0000000000000001L});
    public static final BitSet FOLLOW_CARET_in_transponent468 = new BitSet(new long[]{0x4FF4000000000060L,0x0000000000000001L});
    public static final BitSet FOLLOW_term_in_transponent472 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent481 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent486 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_PLUS_in_unary509 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_unary514 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_unary519 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_transponent_in_unary524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult532 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult537 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult542 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult547 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_STAR_in_mult552 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_SLASH_in_mult557 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult562 = new BitSet(new long[]{0x4FF45110000FF860L,0x0000000000000001L});
    public static final BitSet FOLLOW_unary_in_mult566 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_mult_in_add578 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_PLUS_in_add583 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_add588 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_mult_in_add592 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_COLON_in_colonEnd603 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_add_in_colonEnd605 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_add_in_colon624 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_colonEnd_in_colon627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical655 = new BitSet(new long[]{0x1000000006E00002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical660 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical665 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical670 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical675 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical680 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical685 = new BitSet(new long[]{0x5FF4511006E81860L,0x0000000000000001L});
    public static final BitSet FOLLOW_colon_in_logical689 = new BitSet(new long[]{0x1000000006E00002L});
    public static final BitSet FOLLOW_logical_in_eleAnd701 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd704 = new BitSet(new long[]{0x4FF4511008081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_logical_in_eleAnd707 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr718 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr721 = new BitSet(new long[]{0x4FF4511010081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr724 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd735 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd738 = new BitSet(new long[]{0x4FF4511020081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_eleOr_in_scAnd741 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_scAnd_in_scOr752 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SC_OR_in_scOr755 = new BitSet(new long[]{0x4FF4511040081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_scAnd_in_scOr758 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expr_in_hCatVec781 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec785 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_hCatVec789 = new BitSet(new long[]{0x4FF6511000081862L,0x0000000000000001L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec808 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec812 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec815 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_OPENB_in_vector834 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_vCatVec_in_vector837 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell847 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell851 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_hCatCell855 = new BitSet(new long[]{0x4FF6511000081862L,0x0000000000000001L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell874 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell878 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell882 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_OPENC_in_cellArray901 = new BitSet(new long[]{0x4FF6511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line948 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_EQUALS_in_line950 = new BitSet(new long[]{0x6FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_line957 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_line960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart979 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_ifPart982 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_ifPart984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart993 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_elseifPart998 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_elseifPart1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart1011 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_elsePart1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1027 = new BitSet(new long[]{0x0000006000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1037 = new BitSet(new long[]{0x0000006000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1117 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_switchPart1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1127 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_casePart1130 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_casePart1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1140 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1153 = new BitSet(new long[]{0x0000060000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1156 = new BitSet(new long[]{0x0000060000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_forPart1192 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1194 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_forPart1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1206 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000005L});
    public static final BitSet FOLLOW_block_in_forBlock1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1236 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_whilePart1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1248 = new BitSet(new long[]{0x4FF4511000081860L,0x0000000000000005L});
    public static final BitSet FOLLOW_block_in_whileBlock1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1302 = new BitSet(new long[]{0x4FF4511000081862L,0x0000000000000001L});
    public static final BitSet FOLLOW_term_in_synpred2_Grammar940 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Grammar942 = new BitSet(new long[]{0x0000000000000002L});

}