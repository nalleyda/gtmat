// $ANTLR 3.4 /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g 2012-01-31 15:26:37

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


/**
  * Should take all symobls to tokens for TreeWalker (e.g., 'EXP)
  */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class GrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BACKSLASH", "BLOCK", "BLOCK_END", "BREAK", "CARET", "CASE", "CATCH", "CLASSDEF", "CLOSEB", "CLOSEC", "CLOSEP", "CLOSE_BLOCK", "COLON", "COLON_ARGS", "COMMA", "COMMENT", "CONTINUE", "DIGIT", "DOT", "DOT_BACKSLASH", "DOT_CARET", "DOT_SLASH", "DOT_STAR", "DOT_TRANSPOSE", "DOUBLE", "DOUBLE_QUOTE", "ELE_AND", "ELE_OR", "ELLIPSIS", "ELSE", "ELSEIF", "EMPTY_CELL", "EMPTY_VEC", "END", "EQUALS", "EXCLAMATION", "EXPONENT", "FALSE", "FOR", "FOR_LOOP", "FUNCTION", "FUNC_ARGS", "GLOBAL", "GREATER_EQUAL", "GREATER_EQUL", "GREATER_THAN", "HCAT_CELL", "HCAT_VEC", "ID", "IF", "IF_STAT", "ISEQUAL", "LESS_EQUAL", "LESS_THAN", "LETTER", "MINUS", "NEWLINE", "NOT", "NOT_EQUAL", "OPENB", "OPENC", "OPENP", "OPEN_BLOCK", "OTHERWISE", "PARFOR", "PERCENT", "PERSISTENT", "PLUS", "RETURN", "SC_AND", "SC_OR", "SEMI", "SINGLE_QUOTE", "SLASH", "SPMD", "STAR", "STRING_LITERAL", "SWITCH", "SWITCH_STAT", "TRUE", "TRY", "UNDERSCORE", "VCAT_CELL", "VCAT_VEC", "WHILE", "WHILE_LOOP", "WS"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "mult", "unary", "eleAnd", "scAnd", "transponent", "expr", 
    "forPart", "hCatCell", "logical", "add", "scOr", "line", "start", "colon", 
    "switchPart", "term", "vCatVec", "hCatVec", "blockPart", "whilePart", 
    "switchBlock", "functionArgs", "prog", "synpred2_Grammar", "functionCall", 
    "synpred1_Grammar", "whileBlock", "elseifPart", "cellArray", "colonEnd", 
    "vector", "ifPart", "ifBlock", "functionCallOrStructure", "forBlock", 
    "casePart", "elsePart", "vCatCell", "block", "otherwiseBlock", "eleOr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        true, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public GrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public GrammarParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[41+1];
         

        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public GrammarParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
    this.state.ruleMemo = new HashMap[41+1];
     

     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:1: start : prog EOF !;
    public final GrammarParser.start_return start() throws RecognitionException {
        GrammarParser.start_return retval = new GrammarParser.start_return();
        retval.start = input.LT(1);

        int start_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EOF2=null;
        GrammarParser.prog_return prog1 =null;


        CommonTree EOF2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:7: ( prog EOF !)
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:75:9: prog EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(75,9);
            pushFollow(FOLLOW_prog_in_start204);
            prog1=prog();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prog1.getTree());
            dbg.location(75,17);
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
        dbg.location(75, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    public final GrammarParser.prog_return prog() throws RecognitionException {
        GrammarParser.prog_return retval = new GrammarParser.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        GrammarParser.block_return block3 =null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:7: ( ( block )+ )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: ( block )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(77,9);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: ( block )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==COLON||LA1_0==DOUBLE||(LA1_0 >= EMPTY_CELL && LA1_0 <= END)||(LA1_0 >= FALSE && LA1_0 <= FOR)||(LA1_0 >= ID && LA1_0 <= IF)||LA1_0==MINUS||LA1_0==NOT||(LA1_0 >= OPENB && LA1_0 <= OPENP)||LA1_0==PLUS||(LA1_0 >= STRING_LITERAL && LA1_0 <= SWITCH)||LA1_0==TRUE||LA1_0==WHILE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:77:9: block
            	    {
            	    dbg.location(77,9);
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
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(77, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    public final GrammarParser.functionArgs_return functionArgs() throws RecognitionException {
        GrammarParser.functionArgs_return retval = new GrammarParser.functionArgs_return();
        retval.start = input.LT(1);

        int functionArgs_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA5=null;
        GrammarParser.expr_return expr4 =null;

        GrammarParser.expr_return expr6 =null;


        CommonTree COMMA5_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "functionArgs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:14: ( expr ( COMMA expr )* -> ^( FUNC_ARGS ( expr )* ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:17: expr ( COMMA expr )*
            {
            dbg.location(89,17);
            pushFollow(FOLLOW_expr_in_functionArgs238);
            expr4=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr4.getTree());
            dbg.location(89,22);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:22: ( COMMA expr )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:23: COMMA expr
            	    {
            	    dbg.location(89,23);
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionArgs241); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA5);

            	    dbg.location(89,29);
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
            } finally {dbg.exitSubRule(2);}


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
                dbg.location(89,39);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:39: ^( FUNC_ARGS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(89,41);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_ARGS, "FUNC_ARGS")
                , root_1);

                dbg.location(89,51);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:89:51: ( expr )*
                while ( stream_expr.hasNext() ) {
                    dbg.location(89,51);
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
        dbg.location(89, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionArgs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionArgs"


    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:1: functionCall : ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) ;
    public final GrammarParser.functionCall_return functionCall() throws RecognitionException {
        GrammarParser.functionCall_return retval = new GrammarParser.functionCall_return();
        retval.start = input.LT(1);

        int functionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID7=null;
        Token OPENP8=null;
        Token CLOSEP10=null;
        GrammarParser.functionArgs_return functionArgs9 =null;


        CommonTree ID7_tree=null;
        CommonTree OPENP8_tree=null;
        CommonTree CLOSEP10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "functionCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:15: ( ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:17: ( ID OPENP )=> ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(91,31);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:31: ( ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:32: ID ^ ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            {
            dbg.location(91,34);
            ID7=(Token)match(input,ID,FOLLOW_ID_in_functionCall272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID7_tree = 
            (CommonTree)adaptor.create(ID7)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ID7_tree, root_0);
            }
            dbg.location(91,36);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:91:36: ( ( OPENP ! ( functionArgs )? CLOSEP !)? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            {
            dbg.location(92,17);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:17: ( OPENP ! ( functionArgs )? CLOSEP !)?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPENP) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:18: OPENP ! ( functionArgs )? CLOSEP !
                    {
                    dbg.location(92,23);
                    OPENP8=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCall280); if (state.failed) return retval;
                    dbg.location(92,25);
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:25: ( functionArgs )?
                    int alt3=2;
                    try { dbg.enterSubRule(3);
                    try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==COLON||LA3_0==DOUBLE||(LA3_0 >= EMPTY_CELL && LA3_0 <= END)||LA3_0==FALSE||LA3_0==ID||LA3_0==MINUS||LA3_0==NOT||(LA3_0 >= OPENB && LA3_0 <= OPENP)||LA3_0==PLUS||LA3_0==STRING_LITERAL||LA3_0==TRUE) ) {
                        alt3=1;
                    }
                    } finally {dbg.exitDecision(3);}

                    switch (alt3) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:92:25: functionArgs
                            {
                            dbg.location(92,25);
                            pushFollow(FOLLOW_functionArgs_in_functionCall283);
                            functionArgs9=functionArgs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionArgs9.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(3);}

                    dbg.location(92,45);
                    CLOSEP10=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCall286); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


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
        dbg.location(95, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionCall"


    public static class functionCallOrStructure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCallOrStructure"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:1: functionCallOrStructure : functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? ;
    public final GrammarParser.functionCallOrStructure_return functionCallOrStructure() throws RecognitionException {
        GrammarParser.functionCallOrStructure_return retval = new GrammarParser.functionCallOrStructure_return();
        retval.start = input.LT(1);

        int functionCallOrStructure_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT12=null;
        Token OPENP13=null;
        Token CLOSEP15=null;
        GrammarParser.functionCall_return functionCall11 =null;

        GrammarParser.expr_return expr14 =null;

        GrammarParser.functionCall_return functionCall16 =null;


        CommonTree DOT12_tree=null;
        CommonTree OPENP13_tree=null;
        CommonTree CLOSEP15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "functionCallOrStructure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:25: ( functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:27: functionCall ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(99,27);
            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure307);
            functionCall11=functionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall11.getTree());
            dbg.location(99,40);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:40: ( DOT ^ ( OPENP ! expr CLOSEP !| functionCall ) )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==DOT) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:41: DOT ^ ( OPENP ! expr CLOSEP !| functionCall )
                    {
                    dbg.location(99,44);
                    DOT12=(Token)match(input,DOT,FOLLOW_DOT_in_functionCallOrStructure310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT12_tree = 
                    (CommonTree)adaptor.create(DOT12)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOT12_tree, root_0);
                    }
                    dbg.location(99,46);
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:46: ( OPENP ! expr CLOSEP !| functionCall )
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:47: OPENP ! expr CLOSEP !
                            {
                            dbg.location(99,52);
                            OPENP13=(Token)match(input,OPENP,FOLLOW_OPENP_in_functionCallOrStructure314); if (state.failed) return retval;
                            dbg.location(99,54);
                            pushFollow(FOLLOW_expr_in_functionCallOrStructure317);
                            expr14=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr14.getTree());
                            dbg.location(99,65);
                            CLOSEP15=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_functionCallOrStructure319); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:99:69: functionCall
                            {
                            dbg.location(99,69);
                            pushFollow(FOLLOW_functionCall_in_functionCallOrStructure324);
                            functionCall16=functionCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall16.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


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
        dbg.location(99, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCallOrStructure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionCallOrStructure"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:1: term : ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | DOUBLE | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE );
    public final GrammarParser.term_return term() throws RecognitionException {
        GrammarParser.term_return retval = new GrammarParser.term_return();
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
        Token TRUE29=null;
        Token FALSE30=null;
        GrammarParser.expr_return expr20 =null;

        GrammarParser.functionCallOrStructure_return functionCallOrStructure24 =null;

        GrammarParser.vector_return vector26 =null;

        GrammarParser.cellArray_return cellArray27 =null;


        CommonTree EMPTY_VEC17_tree=null;
        CommonTree EMPTY_CELL18_tree=null;
        CommonTree OPENP19_tree=null;
        CommonTree CLOSEP21_tree=null;
        CommonTree STRING_LITERAL22_tree=null;
        CommonTree DOUBLE23_tree=null;
        CommonTree END25_tree=null;
        CommonTree COLON28_tree=null;
        CommonTree TRUE29_tree=null;
        CommonTree FALSE30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:6: ( EMPTY_VEC | EMPTY_CELL | OPENP ! expr CLOSEP !| STRING_LITERAL | DOUBLE | functionCallOrStructure | END | vector | cellArray | COLON | TRUE | FALSE )
            int alt7=12;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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
            case TRUE:
                {
                alt7=11;
                }
                break;
            case FALSE:
                {
                alt7=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:104:8: EMPTY_VEC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(104,8);
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
                    dbg.enterAlt(2);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:105:4: EMPTY_CELL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(105,4);
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
                    dbg.enterAlt(3);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:106:4: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(106,9);
                    OPENP19=(Token)match(input,OPENP,FOLLOW_OPENP_in_term348); if (state.failed) return retval;
                    dbg.location(106,11);
                    pushFollow(FOLLOW_expr_in_term351);
                    expr20=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr20.getTree());
                    dbg.location(106,22);
                    CLOSEP21=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term353); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:109:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(109,4);
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
                    dbg.enterAlt(5);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:110:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(110,4);
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
                    dbg.enterAlt(6);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:114:4: functionCallOrStructure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(114,4);
                    pushFollow(FOLLOW_functionCallOrStructure_in_term379);
                    functionCallOrStructure24=functionCallOrStructure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallOrStructure24.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:115:4: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(115,4);
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
                    dbg.enterAlt(8);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:116:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(116,4);
                    pushFollow(FOLLOW_vector_in_term390);
                    vector26=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector26.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:117:4: cellArray
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(117,4);
                    pushFollow(FOLLOW_cellArray_in_term395);
                    cellArray27=cellArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellArray27.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:118:4: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(118,4);
                    COLON28=(Token)match(input,COLON,FOLLOW_COLON_in_term400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON28_tree = 
                    (CommonTree)adaptor.create(COLON28)
                    ;
                    adaptor.addChild(root_0, COLON28_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:119:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(119,4);
                    TRUE29=(Token)match(input,TRUE,FOLLOW_TRUE_in_term405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE29_tree = 
                    (CommonTree)adaptor.create(TRUE29)
                    ;
                    adaptor.addChild(root_0, TRUE29_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:120:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(120,4);
                    FALSE30=(Token)match(input,FALSE,FOLLOW_FALSE_in_term410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE30_tree = 
                    (CommonTree)adaptor.create(FALSE30)
                    ;
                    adaptor.addChild(root_0, FALSE30_tree);
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
        dbg.location(124, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class transponent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transponent"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:126:1: transponent : ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) ;
    public final GrammarParser.transponent_return transponent() throws RecognitionException {
        GrammarParser.transponent_return retval = new GrammarParser.transponent_return();
        retval.start = input.LT(1);

        int transponent_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_CARET32=null;
        Token CARET33=null;
        Token SINGLE_QUOTE35=null;
        Token DOT_TRANSPOSE36=null;
        GrammarParser.term_return term31 =null;

        GrammarParser.term_return term34 =null;


        CommonTree DOT_CARET32_tree=null;
        CommonTree CARET33_tree=null;
        CommonTree SINGLE_QUOTE35_tree=null;
        CommonTree DOT_TRANSPOSE36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "transponent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:132:3: ( ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:132:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(132,5);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:132:5: ( term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:132:6: term ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            {
            dbg.location(132,6);
            pushFollow(FOLLOW_term_in_transponent432);
            term31=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term31.getTree());
            dbg.location(132,11);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:132:11: ( ( ( DOT_CARET ^| CARET ^) term )* | ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)* )
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

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
            case TRUE:
                {
                alt11=1;
                }
                break;
            case FALSE:
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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:3: ( ( DOT_CARET ^| CARET ^) term )*
                    {
                    dbg.location(133,3);
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:3: ( ( DOT_CARET ^| CARET ^) term )*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==CARET||LA9_0==DOT_CARET) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:5: ( DOT_CARET ^| CARET ^) term
                    	    {
                    	    dbg.location(133,5);
                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:5: ( DOT_CARET ^| CARET ^)
                    	    int alt8=2;
                    	    try { dbg.enterSubRule(8);
                    	    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }
                    	    } finally {dbg.exitDecision(8);}

                    	    switch (alt8) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:6: DOT_CARET ^
                    	            {
                    	            dbg.location(133,15);
                    	            DOT_CARET32=(Token)match(input,DOT_CARET,FOLLOW_DOT_CARET_in_transponent441); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            DOT_CARET32_tree = 
                    	            (CommonTree)adaptor.create(DOT_CARET32)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_CARET32_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:133:19: CARET ^
                    	            {
                    	            dbg.location(133,24);
                    	            CARET33=(Token)match(input,CARET,FOLLOW_CARET_in_transponent446); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            CARET33_tree = 
                    	            (CommonTree)adaptor.create(CARET33)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(CARET33_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(8);}

                    	    dbg.location(133,27);
                    	    pushFollow(FOLLOW_term_in_transponent450);
                    	    term34=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:134:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    {
                    dbg.location(134,5);
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:134:5: ( SINGLE_QUOTE ^| DOT_TRANSPOSE ^)*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=3;
                        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==SINGLE_QUOTE) ) {
                            alt10=1;
                        }
                        else if ( (LA10_0==DOT_TRANSPOSE) ) {
                            alt10=2;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:134:6: SINGLE_QUOTE ^
                    	    {
                    	    dbg.location(134,18);
                    	    SINGLE_QUOTE35=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_transponent459); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SINGLE_QUOTE35_tree = 
                    	    (CommonTree)adaptor.create(SINGLE_QUOTE35)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(SINGLE_QUOTE35_tree, root_0);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    dbg.enterAlt(2);

                    	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:134:22: DOT_TRANSPOSE ^
                    	    {
                    	    dbg.location(134,35);
                    	    DOT_TRANSPOSE36=(Token)match(input,DOT_TRANSPOSE,FOLLOW_DOT_TRANSPOSE_in_transponent464); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT_TRANSPOSE36_tree = 
                    	    (CommonTree)adaptor.create(DOT_TRANSPOSE36)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOT_TRANSPOSE36_tree, root_0);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(136, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "transponent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "transponent"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:1: unary : ( PLUS !| MINUS ^| NOT ^)* transponent ;
    public final GrammarParser.unary_return unary() throws RecognitionException {
        GrammarParser.unary_return retval = new GrammarParser.unary_return();
        retval.start = input.LT(1);

        int unary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS37=null;
        Token MINUS38=null;
        Token NOT39=null;
        GrammarParser.transponent_return transponent40 =null;


        CommonTree PLUS37_tree=null;
        CommonTree MINUS38_tree=null;
        CommonTree NOT39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:7: ( ( PLUS !| MINUS ^| NOT ^)* transponent )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:9: ( PLUS !| MINUS ^| NOT ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(138,9);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:9: ( PLUS !| MINUS ^| NOT ^)*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=4;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

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

                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:10: PLUS !
            	    {
            	    dbg.location(138,14);
            	    PLUS37=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary487); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:18: MINUS ^
            	    {
            	    dbg.location(138,23);
            	    MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary492); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MINUS38_tree = 
            	    (CommonTree)adaptor.create(MINUS38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS38_tree, root_0);
            	    }

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:138:27: NOT ^
            	    {
            	    dbg.location(138,30);
            	    NOT39=(Token)match(input,NOT,FOLLOW_NOT_in_unary497); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT39_tree = 
            	    (CommonTree)adaptor.create(NOT39)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT39_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(138,34);
            pushFollow(FOLLOW_transponent_in_unary502);
            transponent40=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent40.getTree());

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
        dbg.location(138, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:1: mult : unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* ;
    public final GrammarParser.mult_return mult() throws RecognitionException {
        GrammarParser.mult_return retval = new GrammarParser.mult_return();
        retval.start = input.LT(1);

        int mult_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DOT_STAR42=null;
        Token DOT_SLASH43=null;
        Token DOT_BACKSLASH44=null;
        Token STAR45=null;
        Token SLASH46=null;
        Token BACKSLASH47=null;
        GrammarParser.unary_return unary41 =null;

        GrammarParser.unary_return unary48 =null;


        CommonTree DOT_STAR42_tree=null;
        CommonTree DOT_SLASH43_tree=null;
        CommonTree DOT_BACKSLASH44_tree=null;
        CommonTree STAR45_tree=null;
        CommonTree SLASH46_tree=null;
        CommonTree BACKSLASH47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:6: ( unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:8: unary ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(140,8);
            pushFollow(FOLLOW_unary_in_mult510);
            unary41=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary41.getTree());
            dbg.location(140,14);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:14: ( ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==BACKSLASH||LA14_0==DOT_BACKSLASH||(LA14_0 >= DOT_SLASH && LA14_0 <= DOT_STAR)||LA14_0==SLASH||LA14_0==STAR) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^) unary
            	    {
            	    dbg.location(140,16);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:16: ( DOT_STAR ^| DOT_SLASH ^| DOT_BACKSLASH ^| STAR ^| SLASH ^| BACKSLASH ^)
            	    int alt13=6;
            	    try { dbg.enterSubRule(13);
            	    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(13);}

            	    switch (alt13) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:17: DOT_STAR ^
            	            {
            	            dbg.location(140,25);
            	            DOT_STAR42=(Token)match(input,DOT_STAR,FOLLOW_DOT_STAR_in_mult515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_STAR42_tree = 
            	            (CommonTree)adaptor.create(DOT_STAR42)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_STAR42_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:29: DOT_SLASH ^
            	            {
            	            dbg.location(140,38);
            	            DOT_SLASH43=(Token)match(input,DOT_SLASH,FOLLOW_DOT_SLASH_in_mult520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_SLASH43_tree = 
            	            (CommonTree)adaptor.create(DOT_SLASH43)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_SLASH43_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:42: DOT_BACKSLASH ^
            	            {
            	            dbg.location(140,55);
            	            DOT_BACKSLASH44=(Token)match(input,DOT_BACKSLASH,FOLLOW_DOT_BACKSLASH_in_mult525); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOT_BACKSLASH44_tree = 
            	            (CommonTree)adaptor.create(DOT_BACKSLASH44)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOT_BACKSLASH44_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:59: STAR ^
            	            {
            	            dbg.location(140,63);
            	            STAR45=(Token)match(input,STAR,FOLLOW_STAR_in_mult530); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR45_tree = 
            	            (CommonTree)adaptor.create(STAR45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR45_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:67: SLASH ^
            	            {
            	            dbg.location(140,72);
            	            SLASH46=(Token)match(input,SLASH,FOLLOW_SLASH_in_mult535); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH46_tree = 
            	            (CommonTree)adaptor.create(SLASH46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:140:76: BACKSLASH ^
            	            {
            	            dbg.location(140,85);
            	            BACKSLASH47=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mult540); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACKSLASH47_tree = 
            	            (CommonTree)adaptor.create(BACKSLASH47)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACKSLASH47_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(13);}

            	    dbg.location(140,88);
            	    pushFollow(FOLLOW_unary_in_mult544);
            	    unary48=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary48.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


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
        dbg.location(140, 96);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final GrammarParser.add_return add() throws RecognitionException {
        GrammarParser.add_return retval = new GrammarParser.add_return();
        retval.start = input.LT(1);

        int add_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PLUS50=null;
        Token MINUS51=null;
        GrammarParser.mult_return mult49 =null;

        GrammarParser.mult_return mult52 =null;


        CommonTree PLUS50_tree=null;
        CommonTree MINUS51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:5: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:7: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(142,7);
            pushFollow(FOLLOW_mult_in_add556);
            mult49=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult49.getTree());
            dbg.location(142,12);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:12: ( ( PLUS ^| MINUS ^) mult )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==PLUS) ) {
                    alt16=1;
                }
                else if ( (LA16_0==MINUS) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    dbg.location(142,14);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:14: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    try { dbg.enterSubRule(15);
            	    try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(15);}

            	    switch (alt15) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:15: PLUS ^
            	            {
            	            dbg.location(142,19);
            	            PLUS50=(Token)match(input,PLUS,FOLLOW_PLUS_in_add561); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS50_tree = 
            	            (CommonTree)adaptor.create(PLUS50)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS50_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:142:23: MINUS ^
            	            {
            	            dbg.location(142,28);
            	            MINUS51=(Token)match(input,MINUS,FOLLOW_MINUS_in_add566); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS51_tree = 
            	            (CommonTree)adaptor.create(MINUS51)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS51_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(15);}

            	    dbg.location(142,31);
            	    pushFollow(FOLLOW_mult_in_add570);
            	    mult52=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult52.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


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
        dbg.location(142, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add"


    public static class colonEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colonEnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:1: colonEnd : ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) ;
    public final GrammarParser.colonEnd_return colonEnd() throws RecognitionException {
        GrammarParser.colonEnd_return retval = new GrammarParser.colonEnd_return();
        retval.start = input.LT(1);

        int colonEnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COLON53=null;
        GrammarParser.add_return add54 =null;


        CommonTree COLON53_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try { dbg.enterRule(getGrammarFileName(), "colonEnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:9: ( ( COLON add )+ -> ^( COLON_ARGS ( add )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:11: ( COLON add )+
            {
            dbg.location(144,11);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:11: ( COLON add )+
            int cnt17=0;
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==COLON) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:12: COLON add
            	    {
            	    dbg.location(144,12);
            	    COLON53=(Token)match(input,COLON,FOLLOW_COLON_in_colonEnd581); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON53);

            	    dbg.location(144,18);
            	    pushFollow(FOLLOW_add_in_colonEnd583);
            	    add54=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_add.add(add54.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt17++;
            } while (true);
            } finally {dbg.exitSubRule(17);}


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
            // 144:24: -> ^( COLON_ARGS ( add )+ )
            {
                dbg.location(144,27);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:144:27: ^( COLON_ARGS ( add )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(144,29);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLON_ARGS, "COLON_ARGS")
                , root_1);

                dbg.location(144,40);
                if ( !(stream_add.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_add.hasNext() ) {
                    dbg.location(144,40);
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
        dbg.location(144, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colonEnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "colonEnd"


    public static class colon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colon"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:1: colon : add ( colonEnd ^)? ;
    public final GrammarParser.colon_return colon() throws RecognitionException {
        GrammarParser.colon_return retval = new GrammarParser.colon_return();
        retval.start = input.LT(1);

        int colon_StartIndex = input.index();

        CommonTree root_0 = null;

        GrammarParser.add_return add55 =null;

        GrammarParser.colonEnd_return colonEnd56 =null;



        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:7: ( add ( colonEnd ^)? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:9: add ( colonEnd ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(146,9);
            pushFollow(FOLLOW_add_in_colon602);
            add55=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add55.getTree());
            dbg.location(146,13);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:13: ( colonEnd ^)?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==COLON) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:146:14: colonEnd ^
                    {
                    dbg.location(146,22);
                    pushFollow(FOLLOW_colonEnd_in_colon605);
                    colonEnd56=colonEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(colonEnd56.getTree(), root_0);

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}


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
        dbg.location(146, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "colon"


    public static class logical_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:1: logical : colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* ;
    public final GrammarParser.logical_return logical() throws RecognitionException {
        GrammarParser.logical_return retval = new GrammarParser.logical_return();
        retval.start = input.LT(1);

        int logical_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LESS_THAN58=null;
        Token GREATER_THAN59=null;
        Token LESS_EQUAL60=null;
        Token GREATER_EQUAL61=null;
        Token ISEQUAL62=null;
        Token NOT_EQUAL63=null;
        GrammarParser.colon_return colon57 =null;

        GrammarParser.colon_return colon64 =null;


        CommonTree LESS_THAN58_tree=null;
        CommonTree GREATER_THAN59_tree=null;
        CommonTree LESS_EQUAL60_tree=null;
        CommonTree GREATER_EQUAL61_tree=null;
        CommonTree ISEQUAL62_tree=null;
        CommonTree NOT_EQUAL63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logical");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:9: ( colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:11: colon ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(157,11);
            pushFollow(FOLLOW_colon_in_logical633);
            colon57=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon57.getTree());
            dbg.location(157,17);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:17: ( ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==GREATER_EQUAL||LA20_0==GREATER_THAN||(LA20_0 >= ISEQUAL && LA20_0 <= LESS_THAN)||LA20_0==NOT_EQUAL) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^) colon
            	    {
            	    dbg.location(157,19);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:19: ( LESS_THAN ^| GREATER_THAN ^| LESS_EQUAL ^| GREATER_EQUAL ^| ISEQUAL ^| NOT_EQUAL ^)
            	    int alt19=6;
            	    try { dbg.enterSubRule(19);
            	    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(19);}

            	    switch (alt19) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:20: LESS_THAN ^
            	            {
            	            dbg.location(157,29);
            	            LESS_THAN58=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_logical638); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_THAN58_tree = 
            	            (CommonTree)adaptor.create(LESS_THAN58)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_THAN58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:33: GREATER_THAN ^
            	            {
            	            dbg.location(157,45);
            	            GREATER_THAN59=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_logical643); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_THAN59_tree = 
            	            (CommonTree)adaptor.create(GREATER_THAN59)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_THAN59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:49: LESS_EQUAL ^
            	            {
            	            dbg.location(157,59);
            	            LESS_EQUAL60=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_logical648); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LESS_EQUAL60_tree = 
            	            (CommonTree)adaptor.create(LESS_EQUAL60)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:63: GREATER_EQUAL ^
            	            {
            	            dbg.location(157,76);
            	            GREATER_EQUAL61=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_logical653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GREATER_EQUAL61_tree = 
            	            (CommonTree)adaptor.create(GREATER_EQUAL61)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL61_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:80: ISEQUAL ^
            	            {
            	            dbg.location(157,87);
            	            ISEQUAL62=(Token)match(input,ISEQUAL,FOLLOW_ISEQUAL_in_logical658); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ISEQUAL62_tree = 
            	            (CommonTree)adaptor.create(ISEQUAL62)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ISEQUAL62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:157:91: NOT_EQUAL ^
            	            {
            	            dbg.location(157,100);
            	            NOT_EQUAL63=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_logical663); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NOT_EQUAL63_tree = 
            	            (CommonTree)adaptor.create(NOT_EQUAL63)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL63_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(19);}

            	    dbg.location(157,103);
            	    pushFollow(FOLLOW_colon_in_logical667);
            	    colon64=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon64.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


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
        dbg.location(157, 111);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logical");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logical"


    public static class eleAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:159:1: eleAnd : logical ( ELE_AND ^ logical )* ;
    public final GrammarParser.eleAnd_return eleAnd() throws RecognitionException {
        GrammarParser.eleAnd_return retval = new GrammarParser.eleAnd_return();
        retval.start = input.LT(1);

        int eleAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_AND66=null;
        GrammarParser.logical_return logical65 =null;

        GrammarParser.logical_return logical67 =null;


        CommonTree ELE_AND66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "eleAnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:159:8: ( logical ( ELE_AND ^ logical )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:159:10: logical ( ELE_AND ^ logical )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(159,10);
            pushFollow(FOLLOW_logical_in_eleAnd679);
            logical65=logical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical65.getTree());
            dbg.location(159,18);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:159:18: ( ELE_AND ^ logical )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==ELE_AND) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:159:19: ELE_AND ^ logical
            	    {
            	    dbg.location(159,26);
            	    ELE_AND66=(Token)match(input,ELE_AND,FOLLOW_ELE_AND_in_eleAnd682); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_AND66_tree = 
            	    (CommonTree)adaptor.create(ELE_AND66)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_AND66_tree, root_0);
            	    }
            	    dbg.location(159,28);
            	    pushFollow(FOLLOW_logical_in_eleAnd685);
            	    logical67=logical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical67.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}


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
        dbg.location(159, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eleAnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eleAnd"


    public static class eleOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:1: eleOr : eleAnd ( ELE_OR ^ eleAnd )* ;
    public final GrammarParser.eleOr_return eleOr() throws RecognitionException {
        GrammarParser.eleOr_return retval = new GrammarParser.eleOr_return();
        retval.start = input.LT(1);

        int eleOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELE_OR69=null;
        GrammarParser.eleAnd_return eleAnd68 =null;

        GrammarParser.eleAnd_return eleAnd70 =null;


        CommonTree ELE_OR69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "eleOr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:7: ( eleAnd ( ELE_OR ^ eleAnd )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:9: eleAnd ( ELE_OR ^ eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(161,9);
            pushFollow(FOLLOW_eleAnd_in_eleOr696);
            eleAnd68=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd68.getTree());
            dbg.location(161,16);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:16: ( ELE_OR ^ eleAnd )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELE_OR) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:161:17: ELE_OR ^ eleAnd
            	    {
            	    dbg.location(161,23);
            	    ELE_OR69=(Token)match(input,ELE_OR,FOLLOW_ELE_OR_in_eleOr699); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELE_OR69_tree = 
            	    (CommonTree)adaptor.create(ELE_OR69)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ELE_OR69_tree, root_0);
            	    }
            	    dbg.location(161,25);
            	    pushFollow(FOLLOW_eleAnd_in_eleOr702);
            	    eleAnd70=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd70.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


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
        dbg.location(161, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eleOr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eleOr"


    public static class scAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scAnd"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:1: scAnd : eleOr ( SC_AND ^ eleOr )* ;
    public final GrammarParser.scAnd_return scAnd() throws RecognitionException {
        GrammarParser.scAnd_return retval = new GrammarParser.scAnd_return();
        retval.start = input.LT(1);

        int scAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_AND72=null;
        GrammarParser.eleOr_return eleOr71 =null;

        GrammarParser.eleOr_return eleOr73 =null;


        CommonTree SC_AND72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "scAnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:7: ( eleOr ( SC_AND ^ eleOr )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:9: eleOr ( SC_AND ^ eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(163,9);
            pushFollow(FOLLOW_eleOr_in_scAnd713);
            eleOr71=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr71.getTree());
            dbg.location(163,15);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:15: ( SC_AND ^ eleOr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==SC_AND) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:163:16: SC_AND ^ eleOr
            	    {
            	    dbg.location(163,22);
            	    SC_AND72=(Token)match(input,SC_AND,FOLLOW_SC_AND_in_scAnd716); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_AND72_tree = 
            	    (CommonTree)adaptor.create(SC_AND72)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_AND72_tree, root_0);
            	    }
            	    dbg.location(163,24);
            	    pushFollow(FOLLOW_eleOr_in_scAnd719);
            	    eleOr73=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr73.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


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
        dbg.location(163, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scAnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "scAnd"


    public static class scOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scOr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:1: scOr : scAnd ( SC_OR ^ scAnd )* ;
    public final GrammarParser.scOr_return scOr() throws RecognitionException {
        GrammarParser.scOr_return retval = new GrammarParser.scOr_return();
        retval.start = input.LT(1);

        int scOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SC_OR75=null;
        GrammarParser.scAnd_return scAnd74 =null;

        GrammarParser.scAnd_return scAnd76 =null;


        CommonTree SC_OR75_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "scOr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:6: ( scAnd ( SC_OR ^ scAnd )* )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:8: scAnd ( SC_OR ^ scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(165,8);
            pushFollow(FOLLOW_scAnd_in_scOr730);
            scAnd74=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd74.getTree());
            dbg.location(165,14);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:14: ( SC_OR ^ scAnd )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==SC_OR) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:165:15: SC_OR ^ scAnd
            	    {
            	    dbg.location(165,20);
            	    SC_OR75=(Token)match(input,SC_OR,FOLLOW_SC_OR_in_scOr733); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SC_OR75_tree = 
            	    (CommonTree)adaptor.create(SC_OR75)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SC_OR75_tree, root_0);
            	    }
            	    dbg.location(165,22);
            	    pushFollow(FOLLOW_scAnd_in_scOr736);
            	    scAnd76=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd76.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(165, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scOr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "scOr"


    public static class hCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:1: hCatVec : expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) ;
    public final GrammarParser.hCatVec_return hCatVec() throws RecognitionException {
        GrammarParser.hCatVec_return retval = new GrammarParser.hCatVec_return();
        retval.start = input.LT(1);

        int hCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA78=null;
        GrammarParser.expr_return expr77 =null;

        GrammarParser.expr_return expr79 =null;


        CommonTree COMMA78_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "hCatVec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_VEC ( expr )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:11: expr ( ( COMMA )? expr )*
            {
            dbg.location(179,11);
            pushFollow(FOLLOW_expr_in_hCatVec759);
            expr77=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr77.getTree());
            dbg.location(179,16);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:16: ( ( COMMA )? expr )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==COLON||LA26_0==COMMA||LA26_0==DOUBLE||(LA26_0 >= EMPTY_CELL && LA26_0 <= END)||LA26_0==FALSE||LA26_0==ID||LA26_0==MINUS||LA26_0==NOT||(LA26_0 >= OPENB && LA26_0 <= OPENP)||LA26_0==PLUS||LA26_0==STRING_LITERAL||LA26_0==TRUE) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:17: ( COMMA )? expr
            	    {
            	    dbg.location(179,17);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:17: ( COMMA )?
            	    int alt25=2;
            	    try { dbg.enterSubRule(25);
            	    try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==COMMA) ) {
            	        alt25=1;
            	    }
            	    } finally {dbg.exitDecision(25);}

            	    switch (alt25) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:18: COMMA
            	            {
            	            dbg.location(179,18);
            	            COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatVec763); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(25);}

            	    dbg.location(179,26);
            	    pushFollow(FOLLOW_expr_in_hCatVec767);
            	    expr79=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


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
            // 179:33: -> ^( HCAT_VEC ( expr )+ )
            {
                dbg.location(179,36);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:179:36: ^( HCAT_VEC ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(179,38);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HCAT_VEC, "HCAT_VEC")
                , root_1);

                dbg.location(179,47);
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    dbg.location(179,47);
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
        dbg.location(179, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hCatVec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hCatVec"


    public static class vCatVec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatVec"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:1: vCatVec : hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) ;
    public final GrammarParser.vCatVec_return vCatVec() throws RecognitionException {
        GrammarParser.vCatVec_return retval = new GrammarParser.vCatVec_return();
        retval.start = input.LT(1);

        int vCatVec_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI81=null;
        GrammarParser.hCatVec_return hCatVec80 =null;

        GrammarParser.hCatVec_return hCatVec82 =null;


        CommonTree SEMI81_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatVec=new RewriteRuleSubtreeStream(adaptor,"rule hCatVec");
        try { dbg.enterRule(getGrammarFileName(), "vCatVec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:9: ( hCatVec ( ( SEMI ) hCatVec )* -> ^( VCAT_VEC ( hCatVec )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:11: hCatVec ( ( SEMI ) hCatVec )*
            {
            dbg.location(181,11);
            pushFollow(FOLLOW_hCatVec_in_vCatVec786);
            hCatVec80=hCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec80.getTree());
            dbg.location(181,19);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:19: ( ( SEMI ) hCatVec )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==SEMI) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:20: ( SEMI ) hCatVec
            	    {
            	    dbg.location(181,20);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:20: ( SEMI )
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:21: SEMI
            	    {
            	    dbg.location(181,21);
            	    SEMI81=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatVec790); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI81);


            	    }

            	    dbg.location(181,27);
            	    pushFollow(FOLLOW_hCatVec_in_vCatVec793);
            	    hCatVec82=hCatVec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatVec.add(hCatVec82.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}


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
            // 181:37: -> ^( VCAT_VEC ( hCatVec )+ )
            {
                dbg.location(181,40);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:181:40: ^( VCAT_VEC ( hCatVec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(181,42);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VCAT_VEC, "VCAT_VEC")
                , root_1);

                dbg.location(181,51);
                if ( !(stream_hCatVec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hCatVec.hasNext() ) {
                    dbg.location(181,51);
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
        dbg.location(181, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vCatVec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vCatVec"


    public static class vector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vector"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:1: vector : OPENB ! vCatVec CLOSEB !;
    public final GrammarParser.vector_return vector() throws RecognitionException {
        GrammarParser.vector_return retval = new GrammarParser.vector_return();
        retval.start = input.LT(1);

        int vector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENB83=null;
        Token CLOSEB85=null;
        GrammarParser.vCatVec_return vCatVec84 =null;


        CommonTree OPENB83_tree=null;
        CommonTree CLOSEB85_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:8: ( OPENB ! vCatVec CLOSEB !)
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:183:10: OPENB ! vCatVec CLOSEB !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(183,15);
            OPENB83=(Token)match(input,OPENB,FOLLOW_OPENB_in_vector812); if (state.failed) return retval;
            dbg.location(183,17);
            pushFollow(FOLLOW_vCatVec_in_vector815);
            vCatVec84=vCatVec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatVec84.getTree());
            dbg.location(183,31);
            CLOSEB85=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vector817); if (state.failed) return retval;

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
        dbg.location(183, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vector"


    public static class hCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:1: hCatCell : expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) ;
    public final GrammarParser.hCatCell_return hCatCell() throws RecognitionException {
        GrammarParser.hCatCell_return retval = new GrammarParser.hCatCell_return();
        retval.start = input.LT(1);

        int hCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA87=null;
        GrammarParser.expr_return expr86 =null;

        GrammarParser.expr_return expr88 =null;


        CommonTree COMMA87_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "hCatCell");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:9: ( expr ( ( COMMA )? expr )* -> ^( HCAT_CELL ( expr )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:11: expr ( ( COMMA )? expr )*
            {
            dbg.location(185,11);
            pushFollow(FOLLOW_expr_in_hCatCell825);
            expr86=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr86.getTree());
            dbg.location(185,16);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:16: ( ( COMMA )? expr )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==COLON||LA29_0==COMMA||LA29_0==DOUBLE||(LA29_0 >= EMPTY_CELL && LA29_0 <= END)||LA29_0==FALSE||LA29_0==ID||LA29_0==MINUS||LA29_0==NOT||(LA29_0 >= OPENB && LA29_0 <= OPENP)||LA29_0==PLUS||LA29_0==STRING_LITERAL||LA29_0==TRUE) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:17: ( COMMA )? expr
            	    {
            	    dbg.location(185,17);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:17: ( COMMA )?
            	    int alt28=2;
            	    try { dbg.enterSubRule(28);
            	    try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==COMMA) ) {
            	        alt28=1;
            	    }
            	    } finally {dbg.exitDecision(28);}

            	    switch (alt28) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:18: COMMA
            	            {
            	            dbg.location(185,18);
            	            COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCatCell829); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(28);}

            	    dbg.location(185,26);
            	    pushFollow(FOLLOW_expr_in_hCatCell833);
            	    expr88=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr88.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


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
            // 185:34: -> ^( HCAT_CELL ( expr )+ )
            {
                dbg.location(185,37);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:185:37: ^( HCAT_CELL ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(185,39);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HCAT_CELL, "HCAT_CELL")
                , root_1);

                dbg.location(185,49);
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    dbg.location(185,49);
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
        dbg.location(185, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hCatCell");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hCatCell"


    public static class vCatCell_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCatCell"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:1: vCatCell : hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) ;
    public final GrammarParser.vCatCell_return vCatCell() throws RecognitionException {
        GrammarParser.vCatCell_return retval = new GrammarParser.vCatCell_return();
        retval.start = input.LT(1);

        int vCatCell_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI90=null;
        GrammarParser.hCatCell_return hCatCell89 =null;

        GrammarParser.hCatCell_return hCatCell91 =null;


        CommonTree SEMI90_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_hCatCell=new RewriteRuleSubtreeStream(adaptor,"rule hCatCell");
        try { dbg.enterRule(getGrammarFileName(), "vCatCell");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:9: ( hCatCell ( ( SEMI ) ! hCatCell )* -> ^( VCAT_CELL ( hCatCell )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:11: hCatCell ( ( SEMI ) ! hCatCell )*
            {
            dbg.location(187,11);
            pushFollow(FOLLOW_hCatCell_in_vCatCell852);
            hCatCell89=hCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell89.getTree());
            dbg.location(187,20);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:20: ( ( SEMI ) ! hCatCell )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==SEMI) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:21: ( SEMI ) ! hCatCell
            	    {
            	    dbg.location(187,27);
            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:21: ( SEMI )
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:22: SEMI
            	    {
            	    dbg.location(187,22);
            	    SEMI90=(Token)match(input,SEMI,FOLLOW_SEMI_in_vCatCell856); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI90);


            	    }

            	    dbg.location(187,29);
            	    pushFollow(FOLLOW_hCatCell_in_vCatCell860);
            	    hCatCell91=hCatCell();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hCatCell.add(hCatCell91.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


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
            // 187:40: -> ^( VCAT_CELL ( hCatCell )+ )
            {
                dbg.location(187,43);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:187:43: ^( VCAT_CELL ( hCatCell )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(187,45);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VCAT_CELL, "VCAT_CELL")
                , root_1);

                dbg.location(187,55);
                if ( !(stream_hCatCell.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hCatCell.hasNext() ) {
                    dbg.location(187,55);
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
        dbg.location(187, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vCatCell");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vCatCell"


    public static class cellArray_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellArray"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:1: cellArray : OPENC ! vCatCell CLOSEC !;
    public final GrammarParser.cellArray_return cellArray() throws RecognitionException {
        GrammarParser.cellArray_return retval = new GrammarParser.cellArray_return();
        retval.start = input.LT(1);

        int cellArray_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPENC92=null;
        Token CLOSEC94=null;
        GrammarParser.vCatCell_return vCatCell93 =null;


        CommonTree OPENC92_tree=null;
        CommonTree CLOSEC94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cellArray");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:11: ( OPENC ! vCatCell CLOSEC !)
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:189:13: OPENC ! vCatCell CLOSEC !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(189,18);
            OPENC92=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellArray879); if (state.failed) return retval;
            dbg.location(189,20);
            pushFollow(FOLLOW_vCatCell_in_cellArray882);
            vCatCell93=vCatCell();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vCatCell93.getTree());
            dbg.location(189,35);
            CLOSEC94=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellArray884); if (state.failed) return retval;

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
        dbg.location(189, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cellArray");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cellArray"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:1: expr : scOr ;
    public final GrammarParser.expr_return expr() throws RecognitionException {
        GrammarParser.expr_return retval = new GrammarParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        GrammarParser.scOr_return scOr95 =null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:6: ( scOr )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:191:33: scOr
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(191,33);
            pushFollow(FOLLOW_scOr_in_expr897);
            scOr95=scOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr95.getTree());

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
        dbg.location(191, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:1: line : ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) ;
    public final GrammarParser.line_return line() throws RecognitionException {
        GrammarParser.line_return retval = new GrammarParser.line_return();
        retval.start = input.LT(1);

        int line_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EQUALS97=null;
        Token SEMI99=null;
        GrammarParser.term_return term96 =null;

        GrammarParser.expr_return expr98 =null;


        CommonTree EQUALS97_tree=null;
        CommonTree SEMI99_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:6: ( ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(199,28);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:28: ( ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:29: ( ( term EQUALS )=> ( term EQUALS ^) )? expr ( SEMI !)?
            {
            dbg.location(199,29);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:29: ( ( term EQUALS )=> ( term EQUALS ^) )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            switch ( input.LA(1) ) {
                case EMPTY_VEC:
                    {
                    int LA31_1 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case EMPTY_CELL:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENP:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case STRING_LITERAL:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case DOUBLE:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case ID:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA31_7 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENB:
                    {
                    int LA31_8 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case OPENC:
                    {
                    int LA31_9 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case COLON:
                    {
                    int LA31_10 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case TRUE:
                    {
                    int LA31_11 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case FALSE:
                    {
                    int LA31_12 = input.LA(2);

                    if ( (synpred2_Grammar()) ) {
                        alt31=1;
                    }
                    }
                    break;
            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:30: ( term EQUALS )=> ( term EQUALS ^)
                    {
                    dbg.location(199,47);
                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:47: ( term EQUALS ^)
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:48: term EQUALS ^
                    {
                    dbg.location(199,48);
                    pushFollow(FOLLOW_term_in_line926);
                    term96=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term96.getTree());
                    dbg.location(199,59);
                    EQUALS97=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_line928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS97_tree = 
                    (CommonTree)adaptor.create(EQUALS97)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUALS97_tree, root_0);
                    }

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(200,2);
            pushFollow(FOLLOW_expr_in_line935);
            expr98=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr98.getTree());
            dbg.location(200,7);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:200:7: ( SEMI !)?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==SEMI) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:200:8: SEMI !
                    {
                    dbg.location(200,12);
                    SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_line938); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}


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
        dbg.location(200, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "line"


    public static class ifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:207:1: ifPart : IF ^ expr ( block )? ;
    public final GrammarParser.ifPart_return ifPart() throws RecognitionException {
        GrammarParser.ifPart_return retval = new GrammarParser.ifPart_return();
        retval.start = input.LT(1);

        int ifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IF100=null;
        GrammarParser.expr_return expr101 =null;

        GrammarParser.block_return block102 =null;


        CommonTree IF100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:207:8: ( IF ^ expr ( block )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:207:10: IF ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(207,12);
            IF100=(Token)match(input,IF,FOLLOW_IF_in_ifPart957); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF100_tree = 
            (CommonTree)adaptor.create(IF100)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF100_tree, root_0);
            }
            dbg.location(207,14);
            pushFollow(FOLLOW_expr_in_ifPart960);
            expr101=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr101.getTree());
            dbg.location(207,19);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:207:19: ( block )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==COLON||LA33_0==DOUBLE||(LA33_0 >= EMPTY_CELL && LA33_0 <= END)||(LA33_0 >= FALSE && LA33_0 <= FOR)||(LA33_0 >= ID && LA33_0 <= IF)||LA33_0==MINUS||LA33_0==NOT||(LA33_0 >= OPENB && LA33_0 <= OPENP)||LA33_0==PLUS||(LA33_0 >= STRING_LITERAL && LA33_0 <= SWITCH)||LA33_0==TRUE||LA33_0==WHILE) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:207:19: block
                    {
                    dbg.location(207,19);
                    pushFollow(FOLLOW_block_in_ifPart962);
                    block102=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block102.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}


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
        dbg.location(207, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifPart"


    public static class elseifPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseifPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:1: elseifPart : ( ELSEIF ^e2= expr (b2= block )? ) ;
    public final GrammarParser.elseifPart_return elseifPart() throws RecognitionException {
        GrammarParser.elseifPart_return retval = new GrammarParser.elseifPart_return();
        retval.start = input.LT(1);

        int elseifPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSEIF103=null;
        GrammarParser.expr_return e2 =null;

        GrammarParser.block_return b2 =null;


        CommonTree ELSEIF103_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseifPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:12: ( ( ELSEIF ^e2= expr (b2= block )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:14: ( ELSEIF ^e2= expr (b2= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(208,14);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:14: ( ELSEIF ^e2= expr (b2= block )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:15: ELSEIF ^e2= expr (b2= block )?
            {
            dbg.location(208,21);
            ELSEIF103=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifPart971); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSEIF103_tree = 
            (CommonTree)adaptor.create(ELSEIF103)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSEIF103_tree, root_0);
            }
            dbg.location(208,25);
            pushFollow(FOLLOW_expr_in_elseifPart976);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
            dbg.location(208,33);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:33: (b2= block )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==COLON||LA34_0==DOUBLE||(LA34_0 >= EMPTY_CELL && LA34_0 <= END)||(LA34_0 >= FALSE && LA34_0 <= FOR)||(LA34_0 >= ID && LA34_0 <= IF)||LA34_0==MINUS||LA34_0==NOT||(LA34_0 >= OPENB && LA34_0 <= OPENP)||LA34_0==PLUS||(LA34_0 >= STRING_LITERAL && LA34_0 <= SWITCH)||LA34_0==TRUE||LA34_0==WHILE) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:208:33: b2= block
                    {
                    dbg.location(208,33);
                    pushFollow(FOLLOW_block_in_elseifPart980);
                    b2=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}


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
        dbg.location(208, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseifPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elseifPart"


    public static class elsePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:1: elsePart : ( ELSE ^ (b3= block )? ) ;
    public final GrammarParser.elsePart_return elsePart() throws RecognitionException {
        GrammarParser.elsePart_return retval = new GrammarParser.elsePart_return();
        retval.start = input.LT(1);

        int elsePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE104=null;
        GrammarParser.block_return b3 =null;


        CommonTree ELSE104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elsePart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:10: ( ( ELSE ^ (b3= block )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:11: ( ELSE ^ (b3= block )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(209,11);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:11: ( ELSE ^ (b3= block )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:12: ELSE ^ (b3= block )?
            {
            dbg.location(209,16);
            ELSE104=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsePart989); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE104_tree = 
            (CommonTree)adaptor.create(ELSE104)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ELSE104_tree, root_0);
            }
            dbg.location(209,20);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:20: (b3= block )?
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==COLON||LA35_0==DOUBLE||(LA35_0 >= EMPTY_CELL && LA35_0 <= END)||(LA35_0 >= FALSE && LA35_0 <= FOR)||(LA35_0 >= ID && LA35_0 <= IF)||LA35_0==MINUS||LA35_0==NOT||(LA35_0 >= OPENB && LA35_0 <= OPENP)||LA35_0==PLUS||(LA35_0 >= STRING_LITERAL && LA35_0 <= SWITCH)||LA35_0==TRUE||LA35_0==WHILE) ) {
                alt35=1;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:209:20: b3= block
                    {
                    dbg.location(209,20);
                    pushFollow(FOLLOW_block_in_elsePart994);
                    b3=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b3.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}


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
        dbg.location(209, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elsePart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elsePart"


    public static class ifBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:210:1: ifBlock : ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) ;
    public final GrammarParser.ifBlock_return ifBlock() throws RecognitionException {
        GrammarParser.ifBlock_return retval = new GrammarParser.ifBlock_return();
        retval.start = input.LT(1);

        int ifBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END108=null;
        GrammarParser.ifPart_return ifPart105 =null;

        GrammarParser.elseifPart_return elseifPart106 =null;

        GrammarParser.elsePart_return elsePart107 =null;


        CommonTree BLOCK_END108_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_ifPart=new RewriteRuleSubtreeStream(adaptor,"rule ifPart");
        RewriteRuleSubtreeStream stream_elseifPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifPart");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        try { dbg.enterRule(getGrammarFileName(), "ifBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:210:9: ( ifPart ( elseifPart )* ( elsePart )? BLOCK_END -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:211:2: ifPart ( elseifPart )* ( elsePart )? BLOCK_END
            {
            dbg.location(211,2);
            pushFollow(FOLLOW_ifPart_in_ifBlock1005);
            ifPart105=ifPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifPart.add(ifPart105.getTree());
            dbg.location(212,9);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:9: ( elseifPart )*
            try { dbg.enterSubRule(36);

            loop36:
            do {
                int alt36=2;
                try { dbg.enterDecision(36, decisionCanBacktrack[36]);

                int LA36_0 = input.LA(1);

                if ( (LA36_0==ELSEIF) ) {
                    alt36=1;
                }


                } finally {dbg.exitDecision(36);}

                switch (alt36) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:212:9: elseifPart
            	    {
            	    dbg.location(212,9);
            	    pushFollow(FOLLOW_elseifPart_in_ifBlock1015);
            	    elseifPart106=elseifPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elseifPart.add(elseifPart106.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);
            } finally {dbg.exitSubRule(36);}

            dbg.location(213,9);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:9: ( elsePart )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37, decisionCanBacktrack[37]);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==ELSE) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:213:9: elsePart
                    {
                    dbg.location(213,9);
                    pushFollow(FOLLOW_elsePart_in_ifBlock1026);
                    elsePart107=elsePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsePart.add(elsePart107.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(214,9);
            BLOCK_END108=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifBlock1037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END108);


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
            // 215:9: -> ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
            {
                dbg.location(215,12);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:215:12: ^( IF_STAT ifPart ( elseifPart )* ( elsePart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(215,14);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF_STAT, "IF_STAT")
                , root_1);

                dbg.location(215,22);
                adaptor.addChild(root_1, stream_ifPart.nextTree());
                dbg.location(215,29);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:215:29: ( elseifPart )*
                while ( stream_elseifPart.hasNext() ) {
                    dbg.location(215,29);
                    adaptor.addChild(root_1, stream_elseifPart.nextTree());

                }
                stream_elseifPart.reset();
                dbg.location(215,41);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:215:41: ( elsePart )?
                if ( stream_elsePart.hasNext() ) {
                    dbg.location(215,41);
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
        dbg.location(218, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifBlock"


    public static class switchPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:220:1: switchPart : SWITCH ^ expr ;
    public final GrammarParser.switchPart_return switchPart() throws RecognitionException {
        GrammarParser.switchPart_return retval = new GrammarParser.switchPart_return();
        retval.start = input.LT(1);

        int switchPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SWITCH109=null;
        GrammarParser.expr_return expr110 =null;


        CommonTree SWITCH109_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "switchPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:220:12: ( SWITCH ^ expr )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:220:14: SWITCH ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(220,20);
            SWITCH109=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchPart1095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH109_tree = 
            (CommonTree)adaptor.create(SWITCH109)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH109_tree, root_0);
            }
            dbg.location(220,22);
            pushFollow(FOLLOW_expr_in_switchPart1098);
            expr110=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

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
        dbg.location(220, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "switchPart"


    public static class casePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:221:1: casePart : CASE ^ expr ( block )? ;
    public final GrammarParser.casePart_return casePart() throws RecognitionException {
        GrammarParser.casePart_return retval = new GrammarParser.casePart_return();
        retval.start = input.LT(1);

        int casePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CASE111=null;
        GrammarParser.expr_return expr112 =null;

        GrammarParser.block_return block113 =null;


        CommonTree CASE111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "casePart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:221:10: ( CASE ^ expr ( block )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:221:12: CASE ^ expr ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(221,16);
            CASE111=(Token)match(input,CASE,FOLLOW_CASE_in_casePart1105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE111_tree = 
            (CommonTree)adaptor.create(CASE111)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE111_tree, root_0);
            }
            dbg.location(221,18);
            pushFollow(FOLLOW_expr_in_casePart1108);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr112.getTree());
            dbg.location(221,23);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:221:23: ( block )?
            int alt38=2;
            try { dbg.enterSubRule(38);
            try { dbg.enterDecision(38, decisionCanBacktrack[38]);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON||LA38_0==DOUBLE||(LA38_0 >= EMPTY_CELL && LA38_0 <= END)||(LA38_0 >= FALSE && LA38_0 <= FOR)||(LA38_0 >= ID && LA38_0 <= IF)||LA38_0==MINUS||LA38_0==NOT||(LA38_0 >= OPENB && LA38_0 <= OPENP)||LA38_0==PLUS||(LA38_0 >= STRING_LITERAL && LA38_0 <= SWITCH)||LA38_0==TRUE||LA38_0==WHILE) ) {
                alt38=1;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:221:23: block
                    {
                    dbg.location(221,23);
                    pushFollow(FOLLOW_block_in_casePart1110);
                    block113=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block113.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(38);}


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
        dbg.location(221, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "casePart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "casePart"


    public static class otherwiseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "otherwiseBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:222:1: otherwiseBlock : OTHERWISE ^ ( block )? ;
    public final GrammarParser.otherwiseBlock_return otherwiseBlock() throws RecognitionException {
        GrammarParser.otherwiseBlock_return retval = new GrammarParser.otherwiseBlock_return();
        retval.start = input.LT(1);

        int otherwiseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OTHERWISE114=null;
        GrammarParser.block_return block115 =null;


        CommonTree OTHERWISE114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "otherwiseBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:222:16: ( OTHERWISE ^ ( block )? )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:222:18: OTHERWISE ^ ( block )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(222,27);
            OTHERWISE114=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_otherwiseBlock1118); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE114_tree = 
            (CommonTree)adaptor.create(OTHERWISE114)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE114_tree, root_0);
            }
            dbg.location(222,29);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:222:29: ( block )?
            int alt39=2;
            try { dbg.enterSubRule(39);
            try { dbg.enterDecision(39, decisionCanBacktrack[39]);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLON||LA39_0==DOUBLE||(LA39_0 >= EMPTY_CELL && LA39_0 <= END)||(LA39_0 >= FALSE && LA39_0 <= FOR)||(LA39_0 >= ID && LA39_0 <= IF)||LA39_0==MINUS||LA39_0==NOT||(LA39_0 >= OPENB && LA39_0 <= OPENP)||LA39_0==PLUS||(LA39_0 >= STRING_LITERAL && LA39_0 <= SWITCH)||LA39_0==TRUE||LA39_0==WHILE) ) {
                alt39=1;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:222:29: block
                    {
                    dbg.location(222,29);
                    pushFollow(FOLLOW_block_in_otherwiseBlock1121);
                    block115=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block115.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(39);}


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
        dbg.location(222, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "otherwiseBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "otherwiseBlock"


    public static class switchBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:223:1: switchBlock : switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) ;
    public final GrammarParser.switchBlock_return switchBlock() throws RecognitionException {
        GrammarParser.switchBlock_return retval = new GrammarParser.switchBlock_return();
        retval.start = input.LT(1);

        int switchBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END119=null;
        GrammarParser.switchPart_return switchPart116 =null;

        GrammarParser.casePart_return casePart117 =null;

        GrammarParser.otherwiseBlock_return otherwiseBlock118 =null;


        CommonTree BLOCK_END119_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_switchPart=new RewriteRuleSubtreeStream(adaptor,"rule switchPart");
        RewriteRuleSubtreeStream stream_otherwiseBlock=new RewriteRuleSubtreeStream(adaptor,"rule otherwiseBlock");
        RewriteRuleSubtreeStream stream_casePart=new RewriteRuleSubtreeStream(adaptor,"rule casePart");
        try { dbg.enterRule(getGrammarFileName(), "switchBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:223:13: ( switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:224:2: switchPart ( casePart )* ( otherwiseBlock )? BLOCK_END
            {
            dbg.location(224,2);
            pushFollow(FOLLOW_switchPart_in_switchBlock1131);
            switchPart116=switchPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchPart.add(switchPart116.getTree());
            dbg.location(225,2);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:2: ( casePart )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40, decisionCanBacktrack[40]);

                int LA40_0 = input.LA(1);

                if ( (LA40_0==CASE) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:225:2: casePart
            	    {
            	    dbg.location(225,2);
            	    pushFollow(FOLLOW_casePart_in_switchBlock1134);
            	    casePart117=casePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casePart.add(casePart117.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);
            } finally {dbg.exitSubRule(40);}

            dbg.location(226,2);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:2: ( otherwiseBlock )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41, decisionCanBacktrack[41]);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==OTHERWISE) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:226:2: otherwiseBlock
                    {
                    dbg.location(226,2);
                    pushFollow(FOLLOW_otherwiseBlock_in_switchBlock1138);
                    otherwiseBlock118=otherwiseBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherwiseBlock.add(otherwiseBlock118.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(227,2);
            BLOCK_END119=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchBlock1142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END119);


            // AST REWRITE
            // elements: otherwiseBlock, switchPart, casePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:2: -> ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
            {
                dbg.location(228,5);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:228:5: ^( SWITCH_STAT switchPart ( casePart )* ( otherwiseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(228,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SWITCH_STAT, "SWITCH_STAT")
                , root_1);

                dbg.location(228,19);
                adaptor.addChild(root_1, stream_switchPart.nextTree());
                dbg.location(228,30);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:228:30: ( casePart )*
                while ( stream_casePart.hasNext() ) {
                    dbg.location(228,30);
                    adaptor.addChild(root_1, stream_casePart.nextTree());

                }
                stream_casePart.reset();
                dbg.location(228,40);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:228:40: ( otherwiseBlock )?
                if ( stream_otherwiseBlock.hasNext() ) {
                    dbg.location(228,40);
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
        dbg.location(229, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "switchBlock"


    public static class forPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:231:1: forPart : FOR ^ ID EQUALS expr ;
    public final GrammarParser.forPart_return forPart() throws RecognitionException {
        GrammarParser.forPart_return retval = new GrammarParser.forPart_return();
        retval.start = input.LT(1);

        int forPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR120=null;
        Token ID121=null;
        Token EQUALS122=null;
        GrammarParser.expr_return expr123 =null;


        CommonTree FOR120_tree=null;
        CommonTree ID121_tree=null;
        CommonTree EQUALS122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "forPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:231:9: ( FOR ^ ID EQUALS expr )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:231:11: FOR ^ ID EQUALS expr
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(231,14);
            FOR120=(Token)match(input,FOR,FOLLOW_FOR_in_forPart1167); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR120_tree = 
            (CommonTree)adaptor.create(FOR120)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR120_tree, root_0);
            }
            dbg.location(231,16);
            ID121=(Token)match(input,ID,FOLLOW_ID_in_forPart1170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID121_tree = 
            (CommonTree)adaptor.create(ID121)
            ;
            adaptor.addChild(root_0, ID121_tree);
            }
            dbg.location(231,19);
            EQUALS122=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forPart1172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQUALS122_tree = 
            (CommonTree)adaptor.create(EQUALS122)
            ;
            adaptor.addChild(root_0, EQUALS122_tree);
            }
            dbg.location(231,26);
            pushFollow(FOLLOW_expr_in_forPart1174);
            expr123=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr123.getTree());

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
        dbg.location(231, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forPart"


    public static class forBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:232:1: forBlock : forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) ;
    public final GrammarParser.forBlock_return forBlock() throws RecognitionException {
        GrammarParser.forBlock_return retval = new GrammarParser.forBlock_return();
        retval.start = input.LT(1);

        int forBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END126=null;
        GrammarParser.forPart_return forPart124 =null;

        GrammarParser.block_return block125 =null;


        CommonTree BLOCK_END126_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_forPart=new RewriteRuleSubtreeStream(adaptor,"rule forPart");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "forBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:232:10: ( forPart ( block )? BLOCK_END -> ^( FOR_LOOP forPart ( block )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:233:2: forPart ( block )? BLOCK_END
            {
            dbg.location(233,2);
            pushFollow(FOLLOW_forPart_in_forBlock1184);
            forPart124=forPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forPart.add(forPart124.getTree());
            dbg.location(234,2);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:234:2: ( block )?
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42, decisionCanBacktrack[42]);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==COLON||LA42_0==DOUBLE||(LA42_0 >= EMPTY_CELL && LA42_0 <= END)||(LA42_0 >= FALSE && LA42_0 <= FOR)||(LA42_0 >= ID && LA42_0 <= IF)||LA42_0==MINUS||LA42_0==NOT||(LA42_0 >= OPENB && LA42_0 <= OPENP)||LA42_0==PLUS||(LA42_0 >= STRING_LITERAL && LA42_0 <= SWITCH)||LA42_0==TRUE||LA42_0==WHILE) ) {
                alt42=1;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:234:2: block
                    {
                    dbg.location(234,2);
                    pushFollow(FOLLOW_block_in_forBlock1187);
                    block125=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block125.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(42);}

            dbg.location(235,2);
            BLOCK_END126=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forBlock1191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END126);


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
            // 236:2: -> ^( FOR_LOOP forPart ( block )? )
            {
                dbg.location(236,5);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:236:5: ^( FOR_LOOP forPart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(236,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                dbg.location(236,16);
                adaptor.addChild(root_1, stream_forPart.nextTree());
                dbg.location(236,24);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:236:24: ( block )?
                if ( stream_block.hasNext() ) {
                    dbg.location(236,24);
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
        dbg.location(237, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forBlock"


    public static class whilePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilePart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:239:1: whilePart : WHILE ^ expr ;
    public final GrammarParser.whilePart_return whilePart() throws RecognitionException {
        GrammarParser.whilePart_return retval = new GrammarParser.whilePart_return();
        retval.start = input.LT(1);

        int whilePart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHILE127=null;
        GrammarParser.expr_return expr128 =null;


        CommonTree WHILE127_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whilePart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(239, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:239:11: ( WHILE ^ expr )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:239:13: WHILE ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(239,18);
            WHILE127=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilePart1214); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE127_tree = 
            (CommonTree)adaptor.create(WHILE127)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE127_tree, root_0);
            }
            dbg.location(239,20);
            pushFollow(FOLLOW_expr_in_whilePart1217);
            expr128=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

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
        dbg.location(239, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whilePart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whilePart"


    public static class whileBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileBlock"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:240:1: whileBlock : whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) ;
    public final GrammarParser.whileBlock_return whileBlock() throws RecognitionException {
        GrammarParser.whileBlock_return retval = new GrammarParser.whileBlock_return();
        retval.start = input.LT(1);

        int whileBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BLOCK_END131=null;
        GrammarParser.whilePart_return whilePart129 =null;

        GrammarParser.block_return block130 =null;


        CommonTree BLOCK_END131_tree=null;
        RewriteRuleTokenStream stream_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token BLOCK_END");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_whilePart=new RewriteRuleSubtreeStream(adaptor,"rule whilePart");
        try { dbg.enterRule(getGrammarFileName(), "whileBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:240:12: ( whilePart ( block )? BLOCK_END -> ^( WHILE_LOOP whilePart ( block )? ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:241:2: whilePart ( block )? BLOCK_END
            {
            dbg.location(241,2);
            pushFollow(FOLLOW_whilePart_in_whileBlock1226);
            whilePart129=whilePart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whilePart.add(whilePart129.getTree());
            dbg.location(242,2);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:242:2: ( block )?
            int alt43=2;
            try { dbg.enterSubRule(43);
            try { dbg.enterDecision(43, decisionCanBacktrack[43]);

            int LA43_0 = input.LA(1);

            if ( (LA43_0==COLON||LA43_0==DOUBLE||(LA43_0 >= EMPTY_CELL && LA43_0 <= END)||(LA43_0 >= FALSE && LA43_0 <= FOR)||(LA43_0 >= ID && LA43_0 <= IF)||LA43_0==MINUS||LA43_0==NOT||(LA43_0 >= OPENB && LA43_0 <= OPENP)||LA43_0==PLUS||(LA43_0 >= STRING_LITERAL && LA43_0 <= SWITCH)||LA43_0==TRUE||LA43_0==WHILE) ) {
                alt43=1;
            }
            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:242:2: block
                    {
                    dbg.location(242,2);
                    pushFollow(FOLLOW_block_in_whileBlock1229);
                    block130=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block130.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(43);}

            dbg.location(243,2);
            BLOCK_END131=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileBlock1233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLOCK_END.add(BLOCK_END131);


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
            // 244:2: -> ^( WHILE_LOOP whilePart ( block )? )
            {
                dbg.location(244,5);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:244:5: ^( WHILE_LOOP whilePart ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(244,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                dbg.location(244,18);
                adaptor.addChild(root_1, stream_whilePart.nextTree());
                dbg.location(244,28);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:244:28: ( block )?
                if ( stream_block.hasNext() ) {
                    dbg.location(244,28);
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
        dbg.location(245, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileBlock"


    public static class blockPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockPart"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:1: blockPart : ( ifBlock | switchBlock | forBlock | whileBlock | line ) ;
    public final GrammarParser.blockPart_return blockPart() throws RecognitionException {
        GrammarParser.blockPart_return retval = new GrammarParser.blockPart_return();
        retval.start = input.LT(1);

        int blockPart_StartIndex = input.index();

        CommonTree root_0 = null;

        GrammarParser.ifBlock_return ifBlock132 =null;

        GrammarParser.switchBlock_return switchBlock133 =null;

        GrammarParser.forBlock_return forBlock134 =null;

        GrammarParser.whileBlock_return whileBlock135 =null;

        GrammarParser.line_return line136 =null;



        try { dbg.enterRule(getGrammarFileName(), "blockPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(247, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:11: ( ( ifBlock | switchBlock | forBlock | whileBlock | line ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(247,12);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:12: ( ifBlock | switchBlock | forBlock | whileBlock | line )
            int alt44=5;
            try { dbg.enterSubRule(44);
            try { dbg.enterDecision(44, decisionCanBacktrack[44]);

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
            case FALSE:
            case ID:
            case MINUS:
            case NOT:
            case OPENB:
            case OPENC:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
            case TRUE:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:13: ifBlock
                    {
                    dbg.location(247,13);
                    pushFollow(FOLLOW_ifBlock_in_blockPart1256);
                    ifBlock132=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock132.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:23: switchBlock
                    {
                    dbg.location(247,23);
                    pushFollow(FOLLOW_switchBlock_in_blockPart1260);
                    switchBlock133=switchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock133.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:37: forBlock
                    {
                    dbg.location(247,37);
                    pushFollow(FOLLOW_forBlock_in_blockPart1264);
                    forBlock134=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock134.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:48: whileBlock
                    {
                    dbg.location(247,48);
                    pushFollow(FOLLOW_whileBlock_in_blockPart1268);
                    whileBlock135=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock135.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:247:61: line
                    {
                    dbg.location(247,61);
                    pushFollow(FOLLOW_line_in_blockPart1272);
                    line136=line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line136.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(44);}


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
        dbg.location(247, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockPart"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:1: block : ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) ;
    public final GrammarParser.block_return block() throws RecognitionException {
        GrammarParser.block_return retval = new GrammarParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        CommonTree root_0 = null;

        GrammarParser.blockPart_return blockPart137 =null;


        RewriteRuleSubtreeStream stream_blockPart=new RewriteRuleSubtreeStream(adaptor,"rule blockPart");
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:7: ( ( blockPart )+ -> ^( BLOCK ( blockPart )+ ) )
            dbg.enterAlt(1);

            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:9: ( blockPart )+
            {
            dbg.location(248,9);
            // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:9: ( blockPart )+
            int cnt45=0;
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45, decisionCanBacktrack[45]);

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
                case TRUE:
                    {
                    alt45=1;
                    }
                    break;
                case FALSE:
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

                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:9: blockPart
            	    {
            	    dbg.location(248,9);
            	    pushFollow(FOLLOW_blockPart_in_block1280);
            	    blockPart137=blockPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockPart.add(blockPart137.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt45++;
            } while (true);
            } finally {dbg.exitSubRule(45);}


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
            // 248:20: -> ^( BLOCK ( blockPart )+ )
            {
                dbg.location(248,23);
                // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:248:23: ^( BLOCK ( blockPart )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(248,25);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(248,31);
                if ( !(stream_blockPart.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockPart.hasNext() ) {
                    dbg.location(248,31);
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
        dbg.location(248, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:30: ( term EQUALS )
        dbg.enterAlt(1);

        // /Users/zach/Workspaces/Eclipse 3.5 Classic/GoogleMat1/parser/Grammar.g:199:31: term EQUALS
        {
        dbg.location(199,31);
        pushFollow(FOLLOW_term_in_synpred2_Grammar918);
        term();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(199,36);
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred2_Grammar920); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // Delegated rules

    public final boolean synpred2_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_prog_in_start204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog217 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_expr_in_functionArgs238 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_functionArgs241 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionArgs243 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_functionCall272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCall280 = new BitSet(new long[]{0x5020047020028000L,0x0000000000120107L});
    public static final BitSet FOLLOW_functionArgs_in_functionCall283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCall286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure307 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_functionCallOrStructure310 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OPENP_in_functionCallOrStructure314 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_functionCallOrStructure317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_functionCallOrStructure319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallOrStructure324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_VEC_in_term337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_CELL_in_term343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term348 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_term351 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSEP_in_term353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_term368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallOrStructure_in_term379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_term390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellArray_in_term395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_term400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent432 = new BitSet(new long[]{0x0000000012000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_CARET_in_transponent441 = new BitSet(new long[]{0x0020047020020000L,0x0000000000120007L});
    public static final BitSet FOLLOW_CARET_in_transponent446 = new BitSet(new long[]{0x0020047020020000L,0x0000000000120007L});
    public static final BitSet FOLLOW_term_in_transponent450 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_transponent459 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_TRANSPOSE_in_transponent464 = new BitSet(new long[]{0x0000000010000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_unary487 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_unary492 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_in_unary497 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_transponent_in_unary502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult510 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_DOT_STAR_in_mult515 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_SLASH_in_mult520 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_DOT_BACKSLASH_in_mult525 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_STAR_in_mult530 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_SLASH_in_mult535 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_BACKSLASH_in_mult540 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_unary_in_mult544 = new BitSet(new long[]{0x000000000D000022L,0x0000000000014000L});
    public static final BitSet FOLLOW_mult_in_add556 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_add561 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_MINUS_in_add566 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_mult_in_add570 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_colonEnd581 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_add_in_colonEnd583 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_add_in_colon602 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_colonEnd_in_colon605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_logical633 = new BitSet(new long[]{0x8705000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_logical638 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_THAN_in_logical643 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_logical648 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_logical653 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_ISEQUAL_in_logical658 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_logical663 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_colon_in_logical667 = new BitSet(new long[]{0x8705000000000002L});
    public static final BitSet FOLLOW_logical_in_eleAnd679 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELE_AND_in_eleAnd682 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_logical_in_eleAnd685 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr696 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ELE_OR_in_eleOr699 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr702 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_eleOr_in_scAnd713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SC_AND_in_scAnd716 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_eleOr_in_scAnd719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_scAnd_in_scOr730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SC_OR_in_scOr733 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_scAnd_in_scOr736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_hCatVec759 = new BitSet(new long[]{0x50200470200A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatVec763 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatVec767 = new BitSet(new long[]{0x50200470200A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatVec790 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatVec_in_vCatVec793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENB_in_vector812 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatVec_in_vector815 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSEB_in_vector817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_hCatCell825 = new BitSet(new long[]{0x50200470200A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_COMMA_in_hCatCell829 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_hCatCell833 = new BitSet(new long[]{0x50200470200A0002L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_vCatCell856 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_hCatCell_in_vCatCell860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OPENC_in_cellArray879 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_vCatCell_in_cellArray882 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellArray884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line926 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_line928 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_line935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEMI_in_line938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifPart957 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_ifPart960 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_ifPart962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifPart971 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_elseifPart976 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elseifPart980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsePart989 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_elsePart994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ifBlock1005 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elseifPart_in_ifBlock1015 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_elsePart_in_ifBlock1026 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifBlock1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchPart1095 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_switchPart1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casePart1105 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_casePart1108 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_casePart1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_otherwiseBlock1118 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_otherwiseBlock1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchPart_in_switchBlock1131 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_casePart_in_switchBlock1134 = new BitSet(new long[]{0x0000000000000480L,0x0000000000000010L});
    public static final BitSet FOLLOW_otherwiseBlock_in_switchBlock1138 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchBlock1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forPart1167 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ID_in_forPart1170 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_forPart1172 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_forPart1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forPart_in_forBlock1184 = new BitSet(new long[]{0x50600C7020020080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_forBlock1187 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_forBlock1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilePart1214 = new BitSet(new long[]{0x5020047020020000L,0x0000000000120107L});
    public static final BitSet FOLLOW_expr_in_whilePart1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilePart_in_whileBlock1226 = new BitSet(new long[]{0x50600C7020020080L,0x0000000002160107L});
    public static final BitSet FOLLOW_block_in_whileBlock1229 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileBlock1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_blockPart1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlock_in_blockPart1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_blockPart1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_blockPart1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_blockPart1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockPart_in_block1280 = new BitSet(new long[]{0x50600C7020020002L,0x0000000002160107L});
    public static final BitSet FOLLOW_term_in_synpred2_Grammar918 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EQUALS_in_synpred2_Grammar920 = new BitSet(new long[]{0x0000000000000002L});

}