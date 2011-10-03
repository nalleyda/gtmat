// $ANTLR 3.4 C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g 2011-09-27 15:29:32

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "AND", "AXIS", "BACK", "BLOCK_END", "BODY", "CALL", "CARET", "CASE", "CATCH", "CD", "CELL", "CELLFIELD", "CELLFIELDV", "CHCAT", "CLC", "CLEAR", "CLF", "CLOSE", "CLOSEB", "CLOSEC", "CLOSEP", "COLON", "COLORBAR", "COLORMAP", "COMMA", "COMMENT", "CVCAT", "DIGIT", "DIV", "DOT", "DOTBACK", "DOTCARET", "DOTDIV", "DOTMULT", "DOTTICK", "DOUBLE", "ELLIPSES", "ELSE", "ELSEIF", "EMPTY_VECTOR", "END", "EQ", "EQUAL", "Exponent", "FIGURE", "FLAT", "FOR", "FUNCTION", "GE", "GETS", "GRID", "GT", "HCAT", "HOLD", "ID", "IF", "INDEX", "INTERP", "LE", "LETTER", "LINE", "LT", "MINUS", "MULT", "MULTI_RETURN", "NE", "NEGATE", "NEWLINE", "NOT", "OFF", "ON", "OPENB", "OPENC", "OPENP", "OR", "OTHERWISE", "PLUS", "SCAND", "SCOR", "SEMI", "SHADING", "STRING_LITERAL", "STRUCT", "STRUCTA", "STRUCTAV", "STRUCTV", "SWITCH", "TICK", "TRANSPOSE", "TRY", "VCAT", "VECFIELD", "VECFIELDV", "VECTOR", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ALL=4;
    public static final int AND=5;
    public static final int AXIS=6;
    public static final int BACK=7;
    public static final int BLOCK_END=8;
    public static final int BODY=9;
    public static final int CALL=10;
    public static final int CARET=11;
    public static final int CASE=12;
    public static final int CATCH=13;
    public static final int CD=14;
    public static final int CELL=15;
    public static final int CELLFIELD=16;
    public static final int CELLFIELDV=17;
    public static final int CHCAT=18;
    public static final int CLC=19;
    public static final int CLEAR=20;
    public static final int CLF=21;
    public static final int CLOSE=22;
    public static final int CLOSEB=23;
    public static final int CLOSEC=24;
    public static final int CLOSEP=25;
    public static final int COLON=26;
    public static final int COLORBAR=27;
    public static final int COLORMAP=28;
    public static final int COMMA=29;
    public static final int COMMENT=30;
    public static final int CVCAT=31;
    public static final int DIGIT=32;
    public static final int DIV=33;
    public static final int DOT=34;
    public static final int DOTBACK=35;
    public static final int DOTCARET=36;
    public static final int DOTDIV=37;
    public static final int DOTMULT=38;
    public static final int DOTTICK=39;
    public static final int DOUBLE=40;
    public static final int ELLIPSES=41;
    public static final int ELSE=42;
    public static final int ELSEIF=43;
    public static final int EMPTY_VECTOR=44;
    public static final int END=45;
    public static final int EQ=46;
    public static final int EQUAL=47;
    public static final int Exponent=48;
    public static final int FIGURE=49;
    public static final int FLAT=50;
    public static final int FOR=51;
    public static final int FUNCTION=52;
    public static final int GE=53;
    public static final int GETS=54;
    public static final int GRID=55;
    public static final int GT=56;
    public static final int HCAT=57;
    public static final int HOLD=58;
    public static final int ID=59;
    public static final int IF=60;
    public static final int INDEX=61;
    public static final int INTERP=62;
    public static final int LE=63;
    public static final int LETTER=64;
    public static final int LINE=65;
    public static final int LT=66;
    public static final int MINUS=67;
    public static final int MULT=68;
    public static final int MULTI_RETURN=69;
    public static final int NE=70;
    public static final int NEGATE=71;
    public static final int NEWLINE=72;
    public static final int NOT=73;
    public static final int OFF=74;
    public static final int ON=75;
    public static final int OPENB=76;
    public static final int OPENC=77;
    public static final int OPENP=78;
    public static final int OR=79;
    public static final int OTHERWISE=80;
    public static final int PLUS=81;
    public static final int SCAND=82;
    public static final int SCOR=83;
    public static final int SEMI=84;
    public static final int SHADING=85;
    public static final int STRING_LITERAL=86;
    public static final int STRUCT=87;
    public static final int STRUCTA=88;
    public static final int STRUCTAV=89;
    public static final int STRUCTV=90;
    public static final int SWITCH=91;
    public static final int TICK=92;
    public static final int TRANSPOSE=93;
    public static final int TRY=94;
    public static final int VCAT=95;
    public static final int VECFIELD=96;
    public static final int VECFIELDV=97;
    public static final int VECTOR=98;
    public static final int WHILE=99;
    public static final int WS=100;

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
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:51:1: prog : body EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.body_return body1 =null;


        CommonTree EOF2_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:51:5: ( body EOF !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:51:9: body EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_body_in_prog127);
            body1=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog129); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:55:1: body : parts -> ^( BODY parts ) ;
    public final ExprParser.body_return body() throws RecognitionException {
        ExprParser.body_return retval = new ExprParser.body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ExprParser.parts_return parts3 =null;


        RewriteRuleSubtreeStream stream_parts=new RewriteRuleSubtreeStream(adaptor,"rule parts");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:55:6: ( parts -> ^( BODY parts ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:56:9: parts
            {
            pushFollow(FOLLOW_parts_in_body149);
            parts3=parts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parts.add(parts3.getTree());

            // AST REWRITE
            // elements: parts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:15: -> ^( BODY parts )
            {
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:56:18: ^( BODY parts )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BODY, "BODY")
                , root_1);

                adaptor.addChild(root_1, stream_parts.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class parts_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parts"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:58:1: parts : ( ( stat | ifStat | switchStat | whileStat | forStat | tryCatch ) )* ;
    public final ExprParser.parts_return parts() throws RecognitionException {
        ExprParser.parts_return retval = new ExprParser.parts_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ExprParser.stat_return stat4 =null;

        ExprParser.ifStat_return ifStat5 =null;

        ExprParser.switchStat_return switchStat6 =null;

        ExprParser.whileStat_return whileStat7 =null;

        ExprParser.forStat_return forStat8 =null;

        ExprParser.tryCatch_return tryCatch9 =null;



        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:58:7: ( ( ( stat | ifStat | switchStat | whileStat | forStat | tryCatch ) )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:59:3: ( ( stat | ifStat | switchStat | whileStat | forStat | tryCatch ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:59:3: ( ( stat | ifStat | switchStat | whileStat | forStat | tryCatch ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AXIS||LA2_0==CD||(LA2_0 >= CLC && LA2_0 <= CLOSE)||(LA2_0 >= COLON && LA2_0 <= COLORMAP)||(LA2_0 >= DOUBLE && LA2_0 <= ELLIPSES)||LA2_0==END||LA2_0==FIGURE||(LA2_0 >= FOR && LA2_0 <= FUNCTION)||LA2_0==GRID||(LA2_0 >= HOLD && LA2_0 <= IF)||LA2_0==MINUS||LA2_0==NEWLINE||(LA2_0 >= OPENB && LA2_0 <= OPENP)||LA2_0==PLUS||(LA2_0 >= SHADING && LA2_0 <= STRING_LITERAL)||LA2_0==SWITCH||LA2_0==TRY||LA2_0==WHILE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:59:3: ( stat | ifStat | switchStat | whileStat | forStat | tryCatch )
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:59:3: ( stat | ifStat | switchStat | whileStat | forStat | tryCatch )
            	    int alt1=6;
            	    switch ( input.LA(1) ) {
            	    case AXIS:
            	    case CD:
            	    case CLC:
            	    case CLEAR:
            	    case CLF:
            	    case CLOSE:
            	    case COLON:
            	    case COLORBAR:
            	    case COLORMAP:
            	    case DOUBLE:
            	    case ELLIPSES:
            	    case END:
            	    case FIGURE:
            	    case FUNCTION:
            	    case GRID:
            	    case HOLD:
            	    case ID:
            	    case MINUS:
            	    case NEWLINE:
            	    case OPENB:
            	    case OPENC:
            	    case OPENP:
            	    case PLUS:
            	    case SHADING:
            	    case STRING_LITERAL:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case IF:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case SWITCH:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case WHILE:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case FOR:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case TRY:
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:59:4: stat
            	            {
            	            pushFollow(FOLLOW_stat_in_parts168);
            	            stat4=stat();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, stat4.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:60:5: ifStat
            	            {
            	            pushFollow(FOLLOW_ifStat_in_parts175);
            	            ifStat5=ifStat();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStat5.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:61:5: switchStat
            	            {
            	            pushFollow(FOLLOW_switchStat_in_parts181);
            	            switchStat6=switchStat();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStat6.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:62:5: whileStat
            	            {
            	            pushFollow(FOLLOW_whileStat_in_parts187);
            	            whileStat7=whileStat();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStat7.getTree());

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:63:5: forStat
            	            {
            	            pushFollow(FOLLOW_forStat_in_parts193);
            	            forStat8=forStat();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, forStat8.getTree());

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:64:5: tryCatch
            	            {
            	            pushFollow(FOLLOW_tryCatch_in_parts199);
            	            tryCatch9=tryCatch();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch9.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
        }
        return retval;
    }
    // $ANTLR end "parts"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:71:1: stat : ( ( ID OPENP actualParameters CLOSEP DOT ID GETS )=>str= ID OPENP actualParameters CLOSEP DOT fld= ID GETS expr ( SEMI )? -> ^( GETS ^( STRUCTA $str $fld actualParameters ) expr ( SEMI )? ) | ( ID OPENP actualParameters CLOSEP DOT OPENP )=>str= ID OPENP actualParameters CLOSEP DOT OPENP var= ID CLOSEP GETS expr ( SEMI )? -> ^( GETS ^( STRUCTAV $str $var actualParameters ) expr ( SEMI )? ) | ( ID DOT OPENP )=>str= ID DOT OPENP var= ID CLOSEP GETS expr ( SEMI )? -> ^( GETS ^( STRUCTV $str $var) expr ( SEMI )? ) | ( ID DOT ID )=>str= ID DOT fld= ID GETS expr ( SEMI )? -> ^( GETS ^( STRUCT $str $fld) expr ( SEMI )? ) | ( ID OPENP actualParameters CLOSEP GETS )=> ID OPENP actualParameters CLOSEP GETS expr ( SEMI )? -> ^( INDEX ID actualParameters expr ( SEMI )? ) | ( ID GETS )=> ID GETS expr ( SEMI )? -> ^( GETS ID expr ( SEMI )? ) | ( OPENB chCat CLOSEB GETS )=> ( OPENB chCat CLOSEB GETS fn= ID OPENP p= actualParameters CLOSEP ( SEMI )? ) -> ^( MULTI_RETURN chCat $fn $p ( SEMI )? ) | expr ( SEMI )? -> ^( GETS expr ( SEMI )? ) | CLEAR ^| COLORBAR ^| FIGURE ^| CLC ^| CLF ^| CLOSE ^ ALL | COLORMAP ^ ID | CD ^ ID | AXIS ^ ( ON | OFF | EQUAL | expr ) | GRID ^ ( ON | OFF ) | HOLD ^ ( ON | OFF ) | SHADING ^ ( FLAT | INTERP ) | NEWLINE ->| ELLIPSES NEWLINE ->| FUNCTION anything NEWLINE ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token str=null;
        Token fld=null;
        Token var=null;
        Token fn=null;
        Token OPENP10=null;
        Token CLOSEP12=null;
        Token DOT13=null;
        Token GETS14=null;
        Token SEMI16=null;
        Token OPENP17=null;
        Token CLOSEP19=null;
        Token DOT20=null;
        Token OPENP21=null;
        Token CLOSEP22=null;
        Token GETS23=null;
        Token SEMI25=null;
        Token DOT26=null;
        Token OPENP27=null;
        Token CLOSEP28=null;
        Token GETS29=null;
        Token SEMI31=null;
        Token DOT32=null;
        Token GETS33=null;
        Token SEMI35=null;
        Token ID36=null;
        Token OPENP37=null;
        Token CLOSEP39=null;
        Token GETS40=null;
        Token SEMI42=null;
        Token ID43=null;
        Token GETS44=null;
        Token SEMI46=null;
        Token OPENB47=null;
        Token CLOSEB49=null;
        Token GETS50=null;
        Token OPENP51=null;
        Token CLOSEP52=null;
        Token SEMI53=null;
        Token SEMI55=null;
        Token CLEAR56=null;
        Token COLORBAR57=null;
        Token FIGURE58=null;
        Token CLC59=null;
        Token CLF60=null;
        Token CLOSE61=null;
        Token ALL62=null;
        Token COLORMAP63=null;
        Token ID64=null;
        Token CD65=null;
        Token ID66=null;
        Token AXIS67=null;
        Token ON68=null;
        Token OFF69=null;
        Token EQUAL70=null;
        Token GRID72=null;
        Token set73=null;
        Token HOLD74=null;
        Token set75=null;
        Token SHADING76=null;
        Token set77=null;
        Token NEWLINE78=null;
        Token ELLIPSES79=null;
        Token NEWLINE80=null;
        Token FUNCTION81=null;
        Token NEWLINE83=null;
        ExprParser.actualParameters_return p =null;

        ExprParser.actualParameters_return actualParameters11 =null;

        ExprParser.expr_return expr15 =null;

        ExprParser.actualParameters_return actualParameters18 =null;

        ExprParser.expr_return expr24 =null;

        ExprParser.expr_return expr30 =null;

        ExprParser.expr_return expr34 =null;

        ExprParser.actualParameters_return actualParameters38 =null;

        ExprParser.expr_return expr41 =null;

        ExprParser.expr_return expr45 =null;

        ExprParser.chCat_return chCat48 =null;

        ExprParser.expr_return expr54 =null;

        ExprParser.expr_return expr71 =null;

        ExprParser.anything_return anything82 =null;


        CommonTree str_tree=null;
        CommonTree fld_tree=null;
        CommonTree var_tree=null;
        CommonTree fn_tree=null;
        CommonTree OPENP10_tree=null;
        CommonTree CLOSEP12_tree=null;
        CommonTree DOT13_tree=null;
        CommonTree GETS14_tree=null;
        CommonTree SEMI16_tree=null;
        CommonTree OPENP17_tree=null;
        CommonTree CLOSEP19_tree=null;
        CommonTree DOT20_tree=null;
        CommonTree OPENP21_tree=null;
        CommonTree CLOSEP22_tree=null;
        CommonTree GETS23_tree=null;
        CommonTree SEMI25_tree=null;
        CommonTree DOT26_tree=null;
        CommonTree OPENP27_tree=null;
        CommonTree CLOSEP28_tree=null;
        CommonTree GETS29_tree=null;
        CommonTree SEMI31_tree=null;
        CommonTree DOT32_tree=null;
        CommonTree GETS33_tree=null;
        CommonTree SEMI35_tree=null;
        CommonTree ID36_tree=null;
        CommonTree OPENP37_tree=null;
        CommonTree CLOSEP39_tree=null;
        CommonTree GETS40_tree=null;
        CommonTree SEMI42_tree=null;
        CommonTree ID43_tree=null;
        CommonTree GETS44_tree=null;
        CommonTree SEMI46_tree=null;
        CommonTree OPENB47_tree=null;
        CommonTree CLOSEB49_tree=null;
        CommonTree GETS50_tree=null;
        CommonTree OPENP51_tree=null;
        CommonTree CLOSEP52_tree=null;
        CommonTree SEMI53_tree=null;
        CommonTree SEMI55_tree=null;
        CommonTree CLEAR56_tree=null;
        CommonTree COLORBAR57_tree=null;
        CommonTree FIGURE58_tree=null;
        CommonTree CLC59_tree=null;
        CommonTree CLF60_tree=null;
        CommonTree CLOSE61_tree=null;
        CommonTree ALL62_tree=null;
        CommonTree COLORMAP63_tree=null;
        CommonTree ID64_tree=null;
        CommonTree CD65_tree=null;
        CommonTree ID66_tree=null;
        CommonTree AXIS67_tree=null;
        CommonTree ON68_tree=null;
        CommonTree OFF69_tree=null;
        CommonTree EQUAL70_tree=null;
        CommonTree GRID72_tree=null;
        CommonTree set73_tree=null;
        CommonTree HOLD74_tree=null;
        CommonTree set75_tree=null;
        CommonTree SHADING76_tree=null;
        CommonTree set77_tree=null;
        CommonTree NEWLINE78_tree=null;
        CommonTree ELLIPSES79_tree=null;
        CommonTree NEWLINE80_tree=null;
        CommonTree FUNCTION81_tree=null;
        CommonTree NEWLINE83_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_CLOSEB=new RewriteRuleTokenStream(adaptor,"token CLOSEB");
        RewriteRuleTokenStream stream_OPENB=new RewriteRuleTokenStream(adaptor,"token OPENB");
        RewriteRuleTokenStream stream_GETS=new RewriteRuleTokenStream(adaptor,"token GETS");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSEP=new RewriteRuleTokenStream(adaptor,"token CLOSEP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_ELLIPSES=new RewriteRuleTokenStream(adaptor,"token ELLIPSES");
        RewriteRuleTokenStream stream_OPENP=new RewriteRuleTokenStream(adaptor,"token OPENP");
        RewriteRuleSubtreeStream stream_anything=new RewriteRuleSubtreeStream(adaptor,"rule anything");
        RewriteRuleSubtreeStream stream_chCat=new RewriteRuleSubtreeStream(adaptor,"rule chCat");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:71:5: ( ( ID OPENP actualParameters CLOSEP DOT ID GETS )=>str= ID OPENP actualParameters CLOSEP DOT fld= ID GETS expr ( SEMI )? -> ^( GETS ^( STRUCTA $str $fld actualParameters ) expr ( SEMI )? ) | ( ID OPENP actualParameters CLOSEP DOT OPENP )=>str= ID OPENP actualParameters CLOSEP DOT OPENP var= ID CLOSEP GETS expr ( SEMI )? -> ^( GETS ^( STRUCTAV $str $var actualParameters ) expr ( SEMI )? ) | ( ID DOT OPENP )=>str= ID DOT OPENP var= ID CLOSEP GETS expr ( SEMI )? -> ^( GETS ^( STRUCTV $str $var) expr ( SEMI )? ) | ( ID DOT ID )=>str= ID DOT fld= ID GETS expr ( SEMI )? -> ^( GETS ^( STRUCT $str $fld) expr ( SEMI )? ) | ( ID OPENP actualParameters CLOSEP GETS )=> ID OPENP actualParameters CLOSEP GETS expr ( SEMI )? -> ^( INDEX ID actualParameters expr ( SEMI )? ) | ( ID GETS )=> ID GETS expr ( SEMI )? -> ^( GETS ID expr ( SEMI )? ) | ( OPENB chCat CLOSEB GETS )=> ( OPENB chCat CLOSEB GETS fn= ID OPENP p= actualParameters CLOSEP ( SEMI )? ) -> ^( MULTI_RETURN chCat $fn $p ( SEMI )? ) | expr ( SEMI )? -> ^( GETS expr ( SEMI )? ) | CLEAR ^| COLORBAR ^| FIGURE ^| CLC ^| CLF ^| CLOSE ^ ALL | COLORMAP ^ ID | CD ^ ID | AXIS ^ ( ON | OFF | EQUAL | expr ) | GRID ^ ( ON | OFF ) | HOLD ^ ( ON | OFF ) | SHADING ^ ( FLAT | INTERP ) | NEWLINE ->| ELLIPSES NEWLINE ->| FUNCTION anything NEWLINE ->)
            int alt12=23;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred1_Expr()) ) {
                    alt12=1;
                }
                else if ( (synpred2_Expr()) ) {
                    alt12=2;
                }
                else if ( (synpred3_Expr()) ) {
                    alt12=3;
                }
                else if ( (synpred4_Expr()) ) {
                    alt12=4;
                }
                else if ( (synpred5_Expr()) ) {
                    alt12=5;
                }
                else if ( (synpred6_Expr()) ) {
                    alt12=6;
                }
                else if ( (true) ) {
                    alt12=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
                }
                break;
            case OPENB:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred7_Expr()) ) {
                    alt12=7;
                }
                else if ( (true) ) {
                    alt12=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }
                }
                break;
            case COLON:
            case DOUBLE:
            case END:
            case MINUS:
            case OPENC:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
                {
                alt12=8;
                }
                break;
            case CLEAR:
                {
                alt12=9;
                }
                break;
            case COLORBAR:
                {
                alt12=10;
                }
                break;
            case FIGURE:
                {
                alt12=11;
                }
                break;
            case CLC:
                {
                alt12=12;
                }
                break;
            case CLF:
                {
                alt12=13;
                }
                break;
            case CLOSE:
                {
                alt12=14;
                }
                break;
            case COLORMAP:
                {
                alt12=15;
                }
                break;
            case CD:
                {
                alt12=16;
                }
                break;
            case AXIS:
                {
                alt12=17;
                }
                break;
            case GRID:
                {
                alt12=18;
                }
                break;
            case HOLD:
                {
                alt12=19;
                }
                break;
            case SHADING:
                {
                alt12=20;
                }
                break;
            case NEWLINE:
                {
                alt12=21;
                }
                break;
            case ELLIPSES:
                {
                alt12=22;
                }
                break;
            case FUNCTION:
                {
                alt12=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:72:9: ( ID OPENP actualParameters CLOSEP DOT ID GETS )=>str= ID OPENP actualParameters CLOSEP DOT fld= ID GETS expr ( SEMI )?
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_stat263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    OPENP10=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP10);


                    pushFollow(FOLLOW_actualParameters_in_stat267);
                    actualParameters11=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters11.getTree());

                    CLOSEP12=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP12);


                    DOT13=(Token)match(input,DOT,FOLLOW_DOT_in_stat272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT13);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_stat276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    GETS14=(Token)match(input,GETS,FOLLOW_GETS_in_stat278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS14);


                    pushFollow(FOLLOW_expr_in_stat280);
                    expr15=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr15.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:73:72: ( SEMI )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==SEMI) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:73:72: SEMI
                            {
                            SEMI16=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat282); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI16);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fld, GETS, SEMI, expr, str, actualParameters
                    // token labels: str, fld
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:10: -> ^( GETS ^( STRUCTA $str $fld actualParameters ) expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:74:13: ^( GETS ^( STRUCTA $str $fld actualParameters ) expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GETS.nextNode()
                        , root_1);

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:74:20: ^( STRUCTA $str $fld actualParameters )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTA, "STRUCTA")
                        , root_2);

                        adaptor.addChild(root_2, stream_str.nextNode());

                        adaptor.addChild(root_2, stream_fld.nextNode());

                        adaptor.addChild(root_2, stream_actualParameters.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:74:63: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:75:9: ( ID OPENP actualParameters CLOSEP DOT OPENP )=>str= ID OPENP actualParameters CLOSEP DOT OPENP var= ID CLOSEP GETS expr ( SEMI )?
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_stat353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    OPENP17=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP17);


                    pushFollow(FOLLOW_actualParameters_in_stat357);
                    actualParameters18=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters18.getTree());

                    CLOSEP19=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP19);


                    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_stat361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT20);


                    OPENP21=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP21);


                    var=(Token)match(input,ID,FOLLOW_ID_in_stat367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP22=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP22);


                    GETS23=(Token)match(input,GETS,FOLLOW_GETS_in_stat371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS23);


                    pushFollow(FOLLOW_expr_in_stat373);
                    expr24=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr24.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:76:84: ( SEMI )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SEMI) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:76:84: SEMI
                            {
                            SEMI25=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat375); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI25);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, var, actualParameters, str, SEMI, GETS
                    // token labels: str, var
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:10: -> ^( GETS ^( STRUCTAV $str $var actualParameters ) expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:77:13: ^( GETS ^( STRUCTAV $str $var actualParameters ) expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GETS.nextNode()
                        , root_1);

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:77:20: ^( STRUCTAV $str $var actualParameters )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTAV, "STRUCTAV")
                        , root_2);

                        adaptor.addChild(root_2, stream_str.nextNode());

                        adaptor.addChild(root_2, stream_var.nextNode());

                        adaptor.addChild(root_2, stream_actualParameters.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:77:64: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:78:7: ( ID DOT OPENP )=>str= ID DOT OPENP var= ID CLOSEP GETS expr ( SEMI )?
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_stat434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_stat436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT26);


                    OPENP27=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP27);


                    var=(Token)match(input,ID,FOLLOW_ID_in_stat442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP28=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP28);


                    GETS29=(Token)match(input,GETS,FOLLOW_GETS_in_stat446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS29);


                    pushFollow(FOLLOW_expr_in_stat448);
                    expr30=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr30.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:79:49: ( SEMI )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==SEMI) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:79:49: SEMI
                            {
                            SEMI31=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat450); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI31);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: var, expr, GETS, SEMI, str
                    // token labels: str, var
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:5: -> ^( GETS ^( STRUCTV $str $var) expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:80:8: ^( GETS ^( STRUCTV $str $var) expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GETS.nextNode()
                        , root_1);

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:80:15: ^( STRUCTV $str $var)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTV, "STRUCTV")
                        , root_2);

                        adaptor.addChild(root_2, stream_str.nextNode());

                        adaptor.addChild(root_2, stream_var.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:80:41: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:81:10: ( ID DOT ID )=>str= ID DOT fld= ID GETS expr ( SEMI )?
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_stat504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_stat506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT32);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_stat510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    GETS33=(Token)match(input,GETS,FOLLOW_GETS_in_stat512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS33);


                    pushFollow(FOLLOW_expr_in_stat514);
                    expr34=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr34.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:82:36: ( SEMI )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==SEMI) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:82:36: SEMI
                            {
                            SEMI35=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat516); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI35);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, SEMI, fld, str, GETS
                    // token labels: str, fld
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:5: -> ^( GETS ^( STRUCT $str $fld) expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:83:8: ^( GETS ^( STRUCT $str $fld) expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GETS.nextNode()
                        , root_1);

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:83:15: ^( STRUCT $str $fld)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCT, "STRUCT")
                        , root_2);

                        adaptor.addChild(root_2, stream_str.nextNode());

                        adaptor.addChild(root_2, stream_fld.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:83:40: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:84:9: ( ID OPENP actualParameters CLOSEP GETS )=> ID OPENP actualParameters CLOSEP GETS expr ( SEMI )?
                    {
                    ID36=(Token)match(input,ID,FOLLOW_ID_in_stat576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID36);


                    OPENP37=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP37);


                    pushFollow(FOLLOW_actualParameters_in_stat580);
                    actualParameters38=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters38.getTree());

                    CLOSEP39=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP39);


                    GETS40=(Token)match(input,GETS,FOLLOW_GETS_in_stat584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS40);


                    pushFollow(FOLLOW_expr_in_stat586);
                    expr41=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr41.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:85:56: ( SEMI )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==SEMI) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:85:56: SEMI
                            {
                            SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat588); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI42);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, ID, SEMI, actualParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:10: -> ^( INDEX ID actualParameters expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:86:13: ^( INDEX ID actualParameters expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INDEX, "INDEX")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_actualParameters.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:86:46: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:9: ( ID GETS )=> ID GETS expr ( SEMI )?
                    {
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_stat632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID43);


                    GETS44=(Token)match(input,GETS,FOLLOW_GETS_in_stat634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS44);


                    pushFollow(FOLLOW_expr_in_stat636);
                    expr45=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:35: ( SEMI )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==SEMI) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:35: SEMI
                            {
                            SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat638); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI46);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: SEMI, ID, GETS, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:41: -> ^( GETS ID expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:44: ^( GETS ID expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GETS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:59: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:9: ( OPENB chCat CLOSEB GETS )=> ( OPENB chCat CLOSEB GETS fn= ID OPENP p= actualParameters CLOSEP ( SEMI )? )
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:39: ( OPENB chCat CLOSEB GETS fn= ID OPENP p= actualParameters CLOSEP ( SEMI )? )
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:40: OPENB chCat CLOSEB GETS fn= ID OPENP p= actualParameters CLOSEP ( SEMI )?
                    {
                    OPENB47=(Token)match(input,OPENB,FOLLOW_OPENB_in_stat676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENB.add(OPENB47);


                    pushFollow(FOLLOW_chCat_in_stat678);
                    chCat48=chCat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_chCat.add(chCat48.getTree());

                    CLOSEB49=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_stat680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEB.add(CLOSEB49);


                    GETS50=(Token)match(input,GETS,FOLLOW_GETS_in_stat682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GETS.add(GETS50);


                    fn=(Token)match(input,ID,FOLLOW_ID_in_stat686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fn);


                    OPENP51=(Token)match(input,OPENP,FOLLOW_OPENP_in_stat688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP51);


                    pushFollow(FOLLOW_actualParameters_in_stat692);
                    p=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(p.getTree());

                    CLOSEP52=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_stat694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP52);


                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:102: ( SEMI )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==SEMI) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:102: SEMI
                            {
                            SEMI53=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat696); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI53);


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: fn, chCat, p, SEMI
                    // token labels: fn
                    // rule labels: retval, p
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_fn=new RewriteRuleTokenStream(adaptor,"token fn",fn);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:13: -> ^( MULTI_RETURN chCat $fn $p ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:89:16: ^( MULTI_RETURN chCat $fn $p ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(MULTI_RETURN, "MULTI_RETURN")
                        , root_1);

                        adaptor.addChild(root_1, stream_chCat.nextTree());

                        adaptor.addChild(root_1, stream_fn.nextNode());

                        adaptor.addChild(root_1, stream_p.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:89:44: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:90:9: expr ( SEMI )?
                    {
                    pushFollow(FOLLOW_expr_in_stat737);
                    expr54=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr54.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:90:14: ( SEMI )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==SEMI) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:90:14: SEMI
                            {
                            SEMI55=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat739); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI.add(SEMI55);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, SEMI
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:27: -> ^( GETS expr ( SEMI )? )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:90:30: ^( GETS expr ( SEMI )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(GETS, "GETS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:90:42: ( SEMI )?
                        if ( stream_SEMI.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_SEMI.nextNode()
                            );

                        }
                        stream_SEMI.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:91:9: CLEAR ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLEAR56=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_stat768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLEAR56_tree = 
                    (CommonTree)adaptor.create(CLEAR56)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(CLEAR56_tree, root_0);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:92:9: COLORBAR ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLORBAR57=(Token)match(input,COLORBAR,FOLLOW_COLORBAR_in_stat779); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLORBAR57_tree = 
                    (CommonTree)adaptor.create(COLORBAR57)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COLORBAR57_tree, root_0);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:93:9: FIGURE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FIGURE58=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_stat790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FIGURE58_tree = 
                    (CommonTree)adaptor.create(FIGURE58)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(FIGURE58_tree, root_0);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:94:9: CLC ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLC59=(Token)match(input,CLC,FOLLOW_CLC_in_stat801); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLC59_tree = 
                    (CommonTree)adaptor.create(CLC59)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(CLC59_tree, root_0);
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:95:9: CLF ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLF60=(Token)match(input,CLF,FOLLOW_CLF_in_stat812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLF60_tree = 
                    (CommonTree)adaptor.create(CLF60)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(CLF60_tree, root_0);
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:96:9: CLOSE ^ ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLOSE61=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_stat823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE61_tree = 
                    (CommonTree)adaptor.create(CLOSE61)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(CLOSE61_tree, root_0);
                    }

                    ALL62=(Token)match(input,ALL,FOLLOW_ALL_in_stat826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ALL62_tree = 
                    (CommonTree)adaptor.create(ALL62)
                    ;
                    adaptor.addChild(root_0, ALL62_tree);
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:97:9: COLORMAP ^ ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLORMAP63=(Token)match(input,COLORMAP,FOLLOW_COLORMAP_in_stat836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLORMAP63_tree = 
                    (CommonTree)adaptor.create(COLORMAP63)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COLORMAP63_tree, root_0);
                    }

                    ID64=(Token)match(input,ID,FOLLOW_ID_in_stat839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID64_tree = 
                    (CommonTree)adaptor.create(ID64)
                    ;
                    adaptor.addChild(root_0, ID64_tree);
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:98:9: CD ^ ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CD65=(Token)match(input,CD,FOLLOW_CD_in_stat849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CD65_tree = 
                    (CommonTree)adaptor.create(CD65)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(CD65_tree, root_0);
                    }

                    ID66=(Token)match(input,ID,FOLLOW_ID_in_stat852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID66_tree = 
                    (CommonTree)adaptor.create(ID66)
                    ;
                    adaptor.addChild(root_0, ID66_tree);
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:9: AXIS ^ ( ON | OFF | EQUAL | expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    AXIS67=(Token)match(input,AXIS,FOLLOW_AXIS_in_stat862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AXIS67_tree = 
                    (CommonTree)adaptor.create(AXIS67)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(AXIS67_tree, root_0);
                    }

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:15: ( ON | OFF | EQUAL | expr )
                    int alt11=4;
                    switch ( input.LA(1) ) {
                    case ON:
                        {
                        alt11=1;
                        }
                        break;
                    case OFF:
                        {
                        alt11=2;
                        }
                        break;
                    case EQUAL:
                        {
                        alt11=3;
                        }
                        break;
                    case COLON:
                    case DOUBLE:
                    case END:
                    case ID:
                    case MINUS:
                    case OPENB:
                    case OPENC:
                    case OPENP:
                    case PLUS:
                    case STRING_LITERAL:
                        {
                        alt11=4;
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
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:16: ON
                            {
                            ON68=(Token)match(input,ON,FOLLOW_ON_in_stat866); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON68_tree = 
                            (CommonTree)adaptor.create(ON68)
                            ;
                            adaptor.addChild(root_0, ON68_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:21: OFF
                            {
                            OFF69=(Token)match(input,OFF,FOLLOW_OFF_in_stat870); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OFF69_tree = 
                            (CommonTree)adaptor.create(OFF69)
                            ;
                            adaptor.addChild(root_0, OFF69_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:27: EQUAL
                            {
                            EQUAL70=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_stat874); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EQUAL70_tree = 
                            (CommonTree)adaptor.create(EQUAL70)
                            ;
                            adaptor.addChild(root_0, EQUAL70_tree);
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:99:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_stat877);
                            expr71=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr71.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 18 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:100:9: GRID ^ ( ON | OFF )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GRID72=(Token)match(input,GRID,FOLLOW_GRID_in_stat888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GRID72_tree = 
                    (CommonTree)adaptor.create(GRID72)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GRID72_tree, root_0);
                    }

                    set73=(Token)input.LT(1);

                    if ( (input.LA(1) >= OFF && input.LA(1) <= ON) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set73)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 19 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:101:9: HOLD ^ ( ON | OFF )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HOLD74=(Token)match(input,HOLD,FOLLOW_HOLD_in_stat905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HOLD74_tree = 
                    (CommonTree)adaptor.create(HOLD74)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(HOLD74_tree, root_0);
                    }

                    set75=(Token)input.LT(1);

                    if ( (input.LA(1) >= OFF && input.LA(1) <= ON) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set75)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 20 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:102:9: SHADING ^ ( FLAT | INTERP )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SHADING76=(Token)match(input,SHADING,FOLLOW_SHADING_in_stat922); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHADING76_tree = 
                    (CommonTree)adaptor.create(SHADING76)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SHADING76_tree, root_0);
                    }

                    set77=(Token)input.LT(1);

                    if ( input.LA(1)==FLAT||input.LA(1)==INTERP ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set77)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 21 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:103:9: NEWLINE
                    {
                    NEWLINE78=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE78);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:27: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 22 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:104:9: ELLIPSES NEWLINE
                    {
                    ELLIPSES79=(Token)match(input,ELLIPSES,FOLLOW_ELLIPSES_in_stat961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELLIPSES.add(ELLIPSES79);


                    NEWLINE80=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE80);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 104:27: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 23 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:105:9: FUNCTION anything NEWLINE
                    {
                    FUNCTION81=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_stat976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION81);


                    pushFollow(FOLLOW_anything_in_stat978);
                    anything82=anything();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anything.add(anything82.getTree());

                    NEWLINE83=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE83);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 105:35: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class anything_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anything"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:108:1: anything : (~ NEWLINE )* ;
    public final ExprParser.anything_return anything() throws RecognitionException {
        ExprParser.anything_return retval = new ExprParser.anything_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set84=null;

        CommonTree set84_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:108:9: ( (~ NEWLINE )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:108:11: (~ NEWLINE )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:108:11: (~ NEWLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= ALL && LA13_0 <= NEGATE)||(LA13_0 >= NOT && LA13_0 <= WS)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:
            	    {
            	    set84=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ALL && input.LA(1) <= NEGATE)||(input.LA(1) >= NOT && input.LA(1) <= WS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set84)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
        }
        return retval;
    }
    // $ANTLR end "anything"


    public static class ifStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:110:1: ifStat : IF ^e1= expr b1= body ( ELSEIF !e2= expr b2= body )* ( ELSE !b3= body )? BLOCK_END !;
    public final ExprParser.ifStat_return ifStat() throws RecognitionException {
        ExprParser.ifStat_return retval = new ExprParser.ifStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF85=null;
        Token ELSEIF86=null;
        Token ELSE87=null;
        Token BLOCK_END88=null;
        ExprParser.expr_return e1 =null;

        ExprParser.body_return b1 =null;

        ExprParser.expr_return e2 =null;

        ExprParser.body_return b2 =null;

        ExprParser.body_return b3 =null;


        CommonTree IF85_tree=null;
        CommonTree ELSEIF86_tree=null;
        CommonTree ELSE87_tree=null;
        CommonTree BLOCK_END88_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:111:5: ( IF ^e1= expr b1= body ( ELSEIF !e2= expr b2= body )* ( ELSE !b3= body )? BLOCK_END !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:111:7: IF ^e1= expr b1= body ( ELSEIF !e2= expr b2= body )* ( ELSE !b3= body )? BLOCK_END !
            {
            root_0 = (CommonTree)adaptor.nil();


            IF85=(Token)match(input,IF,FOLLOW_IF_in_ifStat1023); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF85_tree = 
            (CommonTree)adaptor.create(IF85)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF85_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_ifStat1028);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

            pushFollow(FOLLOW_body_in_ifStat1032);
            b1=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, b1.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:112:7: ( ELSEIF !e2= expr b2= body )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ELSEIF) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:112:8: ELSEIF !e2= expr b2= body
            	    {
            	    ELSEIF86=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_ifStat1042); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_ifStat1047);
            	    e2=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    pushFollow(FOLLOW_body_in_ifStat1052);
            	    b2=body();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, b2.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:113:7: ( ELSE !b3= body )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ELSE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:113:8: ELSE !b3= body
                    {
                    ELSE87=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStat1063); if (state.failed) return retval;

                    pushFollow(FOLLOW_body_in_ifStat1068);
                    b3=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b3.getTree());

                    }
                    break;

            }


            BLOCK_END88=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_ifStat1078); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "ifStat"


    public static class tryCatch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tryCatch"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:117:1: tryCatch : TRY ^b1= body CATCH !b3= body BLOCK_END !;
    public final ExprParser.tryCatch_return tryCatch() throws RecognitionException {
        ExprParser.tryCatch_return retval = new ExprParser.tryCatch_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TRY89=null;
        Token CATCH90=null;
        Token BLOCK_END91=null;
        ExprParser.body_return b1 =null;

        ExprParser.body_return b3 =null;


        CommonTree TRY89_tree=null;
        CommonTree CATCH90_tree=null;
        CommonTree BLOCK_END91_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:118:5: ( TRY ^b1= body CATCH !b3= body BLOCK_END !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:118:7: TRY ^b1= body CATCH !b3= body BLOCK_END !
            {
            root_0 = (CommonTree)adaptor.nil();


            TRY89=(Token)match(input,TRY,FOLLOW_TRY_in_tryCatch1096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TRY89_tree = 
            (CommonTree)adaptor.create(TRY89)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TRY89_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_tryCatch1101);
            b1=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, b1.getTree());

            CATCH90=(Token)match(input,CATCH,FOLLOW_CATCH_in_tryCatch1110); if (state.failed) return retval;

            pushFollow(FOLLOW_body_in_tryCatch1115);
            b3=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, b3.getTree());

            BLOCK_END91=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_tryCatch1123); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "tryCatch"


    public static class forStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:124:1: forStat : FOR ^ ID GETS ! expr body BLOCK_END !;
    public final ExprParser.forStat_return forStat() throws RecognitionException {
        ExprParser.forStat_return retval = new ExprParser.forStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOR92=null;
        Token ID93=null;
        Token GETS94=null;
        Token BLOCK_END97=null;
        ExprParser.expr_return expr95 =null;

        ExprParser.body_return body96 =null;


        CommonTree FOR92_tree=null;
        CommonTree ID93_tree=null;
        CommonTree GETS94_tree=null;
        CommonTree BLOCK_END97_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:125:3: ( FOR ^ ID GETS ! expr body BLOCK_END !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:125:3: FOR ^ ID GETS ! expr body BLOCK_END !
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR92=(Token)match(input,FOR,FOLLOW_FOR_in_forStat1138); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR92_tree = 
            (CommonTree)adaptor.create(FOR92)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR92_tree, root_0);
            }

            ID93=(Token)match(input,ID,FOLLOW_ID_in_forStat1141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID93_tree = 
            (CommonTree)adaptor.create(ID93)
            ;
            adaptor.addChild(root_0, ID93_tree);
            }

            GETS94=(Token)match(input,GETS,FOLLOW_GETS_in_forStat1143); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_forStat1146);
            expr95=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());

            pushFollow(FOLLOW_body_in_forStat1148);
            body96=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body96.getTree());

            BLOCK_END97=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_forStat1150); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "forStat"


    public static class whileStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:129:1: whileStat : WHILE ^ expr body BLOCK_END !;
    public final ExprParser.whileStat_return whileStat() throws RecognitionException {
        ExprParser.whileStat_return retval = new ExprParser.whileStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILE98=null;
        Token BLOCK_END101=null;
        ExprParser.expr_return expr99 =null;

        ExprParser.body_return body100 =null;


        CommonTree WHILE98_tree=null;
        CommonTree BLOCK_END101_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:130:3: ( WHILE ^ expr body BLOCK_END !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:130:3: WHILE ^ expr body BLOCK_END !
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE98=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStat1161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE98_tree = 
            (CommonTree)adaptor.create(WHILE98)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE98_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_whileStat1164);
            expr99=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr99.getTree());

            pushFollow(FOLLOW_body_in_whileStat1166);
            body100=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body100.getTree());

            BLOCK_END101=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_whileStat1168); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "whileStat"


    public static class switchStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchStat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:134:1: switchStat : SWITCH ^ ID ( caseClause )* ( defaultClause )? BLOCK_END !;
    public final ExprParser.switchStat_return switchStat() throws RecognitionException {
        ExprParser.switchStat_return retval = new ExprParser.switchStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SWITCH102=null;
        Token ID103=null;
        Token BLOCK_END106=null;
        ExprParser.caseClause_return caseClause104 =null;

        ExprParser.defaultClause_return defaultClause105 =null;


        CommonTree SWITCH102_tree=null;
        CommonTree ID103_tree=null;
        CommonTree BLOCK_END106_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:3: ( SWITCH ^ ID ( caseClause )* ( defaultClause )? BLOCK_END !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:3: SWITCH ^ ID ( caseClause )* ( defaultClause )? BLOCK_END !
            {
            root_0 = (CommonTree)adaptor.nil();


            SWITCH102=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStat1180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH102_tree = 
            (CommonTree)adaptor.create(SWITCH102)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SWITCH102_tree, root_0);
            }

            ID103=(Token)match(input,ID,FOLLOW_ID_in_switchStat1183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID103_tree = 
            (CommonTree)adaptor.create(ID103)
            ;
            adaptor.addChild(root_0, ID103_tree);
            }

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:14: ( caseClause )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CASE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:15: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStat1186);
            	    caseClause104=caseClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause104.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:29: ( defaultClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OTHERWISE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:135:29: defaultClause
                    {
                    pushFollow(FOLLOW_defaultClause_in_switchStat1191);
                    defaultClause105=defaultClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultClause105.getTree());

                    }
                    break;

            }


            BLOCK_END106=(Token)match(input,BLOCK_END,FOLLOW_BLOCK_END_in_switchStat1194); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "switchStat"


    public static class caseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseClause"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:137:1: caseClause : CASE ^ expr body ;
    public final ExprParser.caseClause_return caseClause() throws RecognitionException {
        ExprParser.caseClause_return retval = new ExprParser.caseClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CASE107=null;
        ExprParser.expr_return expr108 =null;

        ExprParser.body_return body109 =null;


        CommonTree CASE107_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:138:3: ( CASE ^ expr body )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:138:3: CASE ^ expr body
            {
            root_0 = (CommonTree)adaptor.nil();


            CASE107=(Token)match(input,CASE,FOLLOW_CASE_in_caseClause1204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE107_tree = 
            (CommonTree)adaptor.create(CASE107)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CASE107_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_caseClause1207);
            expr108=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr108.getTree());

            pushFollow(FOLLOW_body_in_caseClause1209);
            body109=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body109.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "caseClause"


    public static class defaultClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultClause"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:140:1: defaultClause : OTHERWISE ^ body ;
    public final ExprParser.defaultClause_return defaultClause() throws RecognitionException {
        ExprParser.defaultClause_return retval = new ExprParser.defaultClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OTHERWISE110=null;
        ExprParser.body_return body111 =null;


        CommonTree OTHERWISE110_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:141:3: ( OTHERWISE ^ body )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:141:3: OTHERWISE ^ body
            {
            root_0 = (CommonTree)adaptor.nil();


            OTHERWISE110=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_defaultClause1218); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OTHERWISE110_tree = 
            (CommonTree)adaptor.create(OTHERWISE110)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(OTHERWISE110_tree, root_0);
            }

            pushFollow(FOLLOW_body_in_defaultClause1221);
            body111=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body111.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "defaultClause"


    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actualParameters"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:143:1: actualParameters : expr ( COMMA expr )* -> ( expr )* ;
    public final ExprParser.actualParameters_return actualParameters() throws RecognitionException {
        ExprParser.actualParameters_return retval = new ExprParser.actualParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA113=null;
        ExprParser.expr_return expr112 =null;

        ExprParser.expr_return expr114 =null;


        CommonTree COMMA113_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:144:3: ( expr ( COMMA expr )* -> ( expr )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:144:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_actualParameters1229);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr112.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:144:8: ( COMMA expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:144:9: COMMA expr
            	    {
            	    COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_actualParameters1232); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA113);


            	    pushFollow(FOLLOW_expr_in_actualParameters1234);
            	    expr114=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // 144:22: -> ( expr )*
            {
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:144:25: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

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
        }
        return retval;
    }
    // $ANTLR end "actualParameters"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:146:1: term : ( ( ID OPENP actualParameters CLOSEP DOT OPENP )=>st= ID OPENP e= actualParameters CLOSEP DOT OPENP var= ID CLOSEP -> ^( STRUCTAV $st $var $e) | ( ID OPENP actualParameters CLOSEP DOT )=>st= ID OPENP e= actualParameters CLOSEP DOT fld= ID -> ^( STRUCTA $st $fld $e) | ( ID OPENP actualParameters CLOSEP )=> ID OPENP actualParameters CLOSEP -> ^( CALL ID actualParameters ) | ( ID DOT OPENP )=>st= ID DOT OPENP var= ID CLOSEP -> ^( STRUCTV $st $var) | ( ID DOT ID )=>st= ID DOT fld= ID -> ^( STRUCT $st $fld) | OPENB CLOSEB -> EMPTY_VECTOR | DOUBLE | ID | OPENP ! expr CLOSEP !| STRING_LITERAL | END );
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token st=null;
        Token var=null;
        Token fld=null;
        Token OPENP115=null;
        Token CLOSEP116=null;
        Token DOT117=null;
        Token OPENP118=null;
        Token CLOSEP119=null;
        Token OPENP120=null;
        Token CLOSEP121=null;
        Token DOT122=null;
        Token ID123=null;
        Token OPENP124=null;
        Token CLOSEP126=null;
        Token DOT127=null;
        Token OPENP128=null;
        Token CLOSEP129=null;
        Token DOT130=null;
        Token OPENB131=null;
        Token CLOSEB132=null;
        Token DOUBLE133=null;
        Token ID134=null;
        Token OPENP135=null;
        Token CLOSEP137=null;
        Token STRING_LITERAL138=null;
        Token END139=null;
        ExprParser.actualParameters_return e =null;

        ExprParser.actualParameters_return actualParameters125 =null;

        ExprParser.expr_return expr136 =null;


        CommonTree st_tree=null;
        CommonTree var_tree=null;
        CommonTree fld_tree=null;
        CommonTree OPENP115_tree=null;
        CommonTree CLOSEP116_tree=null;
        CommonTree DOT117_tree=null;
        CommonTree OPENP118_tree=null;
        CommonTree CLOSEP119_tree=null;
        CommonTree OPENP120_tree=null;
        CommonTree CLOSEP121_tree=null;
        CommonTree DOT122_tree=null;
        CommonTree ID123_tree=null;
        CommonTree OPENP124_tree=null;
        CommonTree CLOSEP126_tree=null;
        CommonTree DOT127_tree=null;
        CommonTree OPENP128_tree=null;
        CommonTree CLOSEP129_tree=null;
        CommonTree DOT130_tree=null;
        CommonTree OPENB131_tree=null;
        CommonTree CLOSEB132_tree=null;
        CommonTree DOUBLE133_tree=null;
        CommonTree ID134_tree=null;
        CommonTree OPENP135_tree=null;
        CommonTree CLOSEP137_tree=null;
        CommonTree STRING_LITERAL138_tree=null;
        CommonTree END139_tree=null;
        RewriteRuleTokenStream stream_CLOSEB=new RewriteRuleTokenStream(adaptor,"token CLOSEB");
        RewriteRuleTokenStream stream_OPENB=new RewriteRuleTokenStream(adaptor,"token OPENB");
        RewriteRuleTokenStream stream_CLOSEP=new RewriteRuleTokenStream(adaptor,"token CLOSEP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_OPENP=new RewriteRuleTokenStream(adaptor,"token OPENP");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:146:6: ( ( ID OPENP actualParameters CLOSEP DOT OPENP )=>st= ID OPENP e= actualParameters CLOSEP DOT OPENP var= ID CLOSEP -> ^( STRUCTAV $st $var $e) | ( ID OPENP actualParameters CLOSEP DOT )=>st= ID OPENP e= actualParameters CLOSEP DOT fld= ID -> ^( STRUCTA $st $fld $e) | ( ID OPENP actualParameters CLOSEP )=> ID OPENP actualParameters CLOSEP -> ^( CALL ID actualParameters ) | ( ID DOT OPENP )=>st= ID DOT OPENP var= ID CLOSEP -> ^( STRUCTV $st $var) | ( ID DOT ID )=>st= ID DOT fld= ID -> ^( STRUCT $st $fld) | OPENB CLOSEB -> EMPTY_VECTOR | DOUBLE | ID | OPENP ! expr CLOSEP !| STRING_LITERAL | END )
            int alt19=11;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (synpred8_Expr()) ) {
                    alt19=1;
                }
                else if ( (synpred9_Expr()) ) {
                    alt19=2;
                }
                else if ( (synpred10_Expr()) ) {
                    alt19=3;
                }
                else if ( (synpred11_Expr()) ) {
                    alt19=4;
                }
                else if ( (synpred12_Expr()) ) {
                    alt19=5;
                }
                else if ( (true) ) {
                    alt19=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case OPENB:
                {
                alt19=6;
                }
                break;
            case DOUBLE:
                {
                alt19=7;
                }
                break;
            case OPENP:
                {
                alt19=9;
                }
                break;
            case STRING_LITERAL:
                {
                alt19=10;
                }
                break;
            case END:
                {
                alt19=11;
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
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:146:8: ( ID OPENP actualParameters CLOSEP DOT OPENP )=>st= ID OPENP e= actualParameters CLOSEP DOT OPENP var= ID CLOSEP
                    {
                    st=(Token)match(input,ID,FOLLOW_ID_in_term1288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(st);


                    OPENP115=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP115);


                    pushFollow(FOLLOW_actualParameters_in_term1294);
                    e=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(e.getTree());

                    CLOSEP116=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP116);


                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_term1298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT117);


                    OPENP118=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP118);


                    var=(Token)match(input,ID,FOLLOW_ID_in_term1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP119=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP119);


                    // AST REWRITE
                    // elements: e, st, var
                    // token labels: var, st
                    // rule labels: retval, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleTokenStream stream_st=new RewriteRuleTokenStream(adaptor,"token st",st);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 148:21: -> ^( STRUCTAV $st $var $e)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:148:24: ^( STRUCTAV $st $var $e)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTAV, "STRUCTAV")
                        , root_1);

                        adaptor.addChild(root_1, stream_st.nextNode());

                        adaptor.addChild(root_1, stream_var.nextNode());

                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:149:11: ( ID OPENP actualParameters CLOSEP DOT )=>st= ID OPENP e= actualParameters CLOSEP DOT fld= ID
                    {
                    st=(Token)match(input,ID,FOLLOW_ID_in_term1391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(st);


                    OPENP120=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP120);


                    pushFollow(FOLLOW_actualParameters_in_term1397);
                    e=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(e.getTree());

                    CLOSEP121=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP121);


                    DOT122=(Token)match(input,DOT,FOLLOW_DOT_in_term1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT122);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_term1405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    // AST REWRITE
                    // elements: st, fld, e
                    // token labels: fld, st
                    // rule labels: retval, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleTokenStream stream_st=new RewriteRuleTokenStream(adaptor,"token st",st);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 151:21: -> ^( STRUCTA $st $fld $e)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:151:24: ^( STRUCTA $st $fld $e)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTA, "STRUCTA")
                        , root_1);

                        adaptor.addChild(root_1, stream_st.nextNode());

                        adaptor.addChild(root_1, stream_fld.nextNode());

                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:152:13: ( ID OPENP actualParameters CLOSEP )=> ID OPENP actualParameters CLOSEP
                    {
                    ID123=(Token)match(input,ID,FOLLOW_ID_in_term1466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID123);


                    OPENP124=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP124);


                    pushFollow(FOLLOW_actualParameters_in_term1470);
                    actualParameters125=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters125.getTree());

                    CLOSEP126=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP126);


                    // AST REWRITE
                    // elements: actualParameters, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:33: -> ^( CALL ID actualParameters )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:153:36: ^( CALL ID actualParameters )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_actualParameters.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:154:11: ( ID DOT OPENP )=>st= ID DOT OPENP var= ID CLOSEP
                    {
                    st=(Token)match(input,ID,FOLLOW_ID_in_term1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(st);


                    DOT127=(Token)match(input,DOT,FOLLOW_DOT_in_term1541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT127);


                    OPENP128=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP128);


                    var=(Token)match(input,ID,FOLLOW_ID_in_term1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP129=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP129);


                    // AST REWRITE
                    // elements: var, st
                    // token labels: var, st
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleTokenStream stream_st=new RewriteRuleTokenStream(adaptor,"token st",st);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 155:33: -> ^( STRUCTV $st $var)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:155:36: ^( STRUCTV $st $var)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCTV, "STRUCTV")
                        , root_1);

                        adaptor.addChild(root_1, stream_st.nextNode());

                        adaptor.addChild(root_1, stream_var.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:156:11: ( ID DOT ID )=>st= ID DOT fld= ID
                    {
                    st=(Token)match(input,ID,FOLLOW_ID_in_term1617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(st);


                    DOT130=(Token)match(input,DOT,FOLLOW_DOT_in_term1619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT130);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_term1623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    // AST REWRITE
                    // elements: fld, st
                    // token labels: fld, st
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleTokenStream stream_st=new RewriteRuleTokenStream(adaptor,"token st",st);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 157:33: -> ^( STRUCT $st $fld)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:157:36: ^( STRUCT $st $fld)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRUCT, "STRUCT")
                        , root_1);

                        adaptor.addChild(root_1, stream_st.nextNode());

                        adaptor.addChild(root_1, stream_fld.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:158:7: OPENB CLOSEB
                    {
                    OPENB131=(Token)match(input,OPENB,FOLLOW_OPENB_in_term1676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENB.add(OPENB131);


                    CLOSEB132=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_term1678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEB.add(CLOSEB132);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:20: -> EMPTY_VECTOR
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(EMPTY_VECTOR, "EMPTY_VECTOR")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:159:7: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE133=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_term1690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE133_tree = 
                    (CommonTree)adaptor.create(DOUBLE133)
                    ;
                    adaptor.addChild(root_0, DOUBLE133_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:160:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID134=(Token)match(input,ID,FOLLOW_ID_in_term1701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID134_tree = 
                    (CommonTree)adaptor.create(ID134)
                    ;
                    adaptor.addChild(root_0, ID134_tree);
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:161:9: OPENP ! expr CLOSEP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OPENP135=(Token)match(input,OPENP,FOLLOW_OPENP_in_term1711); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_term1714);
                    expr136=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr136.getTree());

                    CLOSEP137=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_term1716); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:162:7: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING_LITERAL138=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term1725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL138_tree = 
                    (CommonTree)adaptor.create(STRING_LITERAL138)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL138_tree);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:163:7: END
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END139=(Token)match(input,END,FOLLOW_END_in_term1733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END139_tree = 
                    (CommonTree)adaptor.create(END139)
                    ;
                    adaptor.addChild(root_0, END139_tree);
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
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class transponent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transponent"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:168:1: transponent : term ( ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^) term )* ;
    public final ExprParser.transponent_return transponent() throws RecognitionException {
        ExprParser.transponent_return retval = new ExprParser.transponent_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOTCARET141=null;
        Token CARET142=null;
        Token DOTTICK143=null;
        Token TICK144=null;
        ExprParser.term_return term140 =null;

        ExprParser.term_return term145 =null;


        CommonTree DOTCARET141_tree=null;
        CommonTree CARET142_tree=null;
        CommonTree DOTTICK143_tree=null;
        CommonTree TICK144_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:169:5: ( term ( ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^) term )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:169:7: term ( ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_transponent1760);
            term140=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term140.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:170:5: ( ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==CARET||LA21_0==DOTCARET||LA21_0==DOTTICK||LA21_0==TICK) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:171:5: ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^) term
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:171:5: ( DOTCARET ^| CARET ^| DOTTICK ^| TICK ^)
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case DOTCARET:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case CARET:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case DOTTICK:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case TICK:
            	        {
            	        alt20=4;
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
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:171:7: DOTCARET ^
            	            {
            	            DOTCARET141=(Token)match(input,DOTCARET,FOLLOW_DOTCARET_in_transponent1775); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOTCARET141_tree = 
            	            (CommonTree)adaptor.create(DOTCARET141)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOTCARET141_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:172:7: CARET ^
            	            {
            	            CARET142=(Token)match(input,CARET,FOLLOW_CARET_in_transponent1784); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET142_tree = 
            	            (CommonTree)adaptor.create(CARET142)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(CARET142_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:173:7: DOTTICK ^
            	            {
            	            DOTTICK143=(Token)match(input,DOTTICK,FOLLOW_DOTTICK_in_transponent1793); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOTTICK143_tree = 
            	            (CommonTree)adaptor.create(DOTTICK143)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOTTICK143_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:174:7: TICK ^
            	            {
            	            TICK144=(Token)match(input,TICK,FOLLOW_TICK_in_transponent1802); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TICK144_tree = 
            	            (CommonTree)adaptor.create(TICK144)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(TICK144_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_transponent1816);
            	    term145=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term145.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "transponent"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:179:1: unary : ( PLUS !| negation ^)* transponent ;
    public final ExprParser.unary_return unary() throws RecognitionException {
        ExprParser.unary_return retval = new ExprParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS146=null;
        ExprParser.negation_return negation147 =null;

        ExprParser.transponent_return transponent148 =null;


        CommonTree PLUS146_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:180:3: ( ( PLUS !| negation ^)* transponent )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:180:3: ( PLUS !| negation ^)* transponent
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:180:3: ( PLUS !| negation ^)*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PLUS) ) {
                    alt22=1;
                }
                else if ( (LA22_0==MINUS) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:180:4: PLUS !
            	    {
            	    PLUS146=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary1838); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:180:12: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary1843);
            	    negation147=negation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(negation147.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            pushFollow(FOLLOW_transponent_in_unary1848);
            transponent148=transponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transponent148.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:182:1: negation : MINUS -> NEGATE ;
    public final ExprParser.negation_return negation() throws RecognitionException {
        ExprParser.negation_return retval = new ExprParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MINUS149=null;

        CommonTree MINUS149_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:183:3: ( MINUS -> NEGATE )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:183:3: MINUS
            {
            MINUS149=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation1856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MINUS.add(MINUS149);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:9: -> NEGATE
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NEGATE, "NEGATE")
                );

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
        }
        return retval;
    }
    // $ANTLR end "negation"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:185:1: mult : unary ( ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^) unary )* ;
    public final ExprParser.mult_return mult() throws RecognitionException {
        ExprParser.mult_return retval = new ExprParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MULT151=null;
        Token DOTMULT152=null;
        Token DIV153=null;
        Token DOTDIV154=null;
        Token BACK155=null;
        Token DOTBACK156=null;
        ExprParser.unary_return unary150 =null;

        ExprParser.unary_return unary157 =null;


        CommonTree MULT151_tree=null;
        CommonTree DOTMULT152_tree=null;
        CommonTree DIV153_tree=null;
        CommonTree DOTDIV154_tree=null;
        CommonTree BACK155_tree=null;
        CommonTree DOTBACK156_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:186:5: ( unary ( ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^) unary )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:186:7: unary ( ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult1872);
            unary150=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary150.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:186:13: ( ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^) unary )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==BACK||LA24_0==DIV||LA24_0==DOTBACK||(LA24_0 >= DOTDIV && LA24_0 <= DOTMULT)||LA24_0==MULT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:187:5: ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^) unary
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:187:5: ( MULT ^| DOTMULT ^| DIV ^| DOTDIV ^| BACK ^| DOTBACK ^)
            	    int alt23=6;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case DOTMULT:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case DOTDIV:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case BACK:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    case DOTBACK:
            	        {
            	        alt23=6;
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
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:187:7: MULT ^
            	            {
            	            MULT151=(Token)match(input,MULT,FOLLOW_MULT_in_mult1882); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MULT151_tree = 
            	            (CommonTree)adaptor.create(MULT151)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MULT151_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:188:7: DOTMULT ^
            	            {
            	            DOTMULT152=(Token)match(input,DOTMULT,FOLLOW_DOTMULT_in_mult1891); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOTMULT152_tree = 
            	            (CommonTree)adaptor.create(DOTMULT152)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOTMULT152_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:189:7: DIV ^
            	            {
            	            DIV153=(Token)match(input,DIV,FOLLOW_DIV_in_mult1900); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV153_tree = 
            	            (CommonTree)adaptor.create(DIV153)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV153_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:190:7: DOTDIV ^
            	            {
            	            DOTDIV154=(Token)match(input,DOTDIV,FOLLOW_DOTDIV_in_mult1909); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOTDIV154_tree = 
            	            (CommonTree)adaptor.create(DOTDIV154)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOTDIV154_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:191:7: BACK ^
            	            {
            	            BACK155=(Token)match(input,BACK,FOLLOW_BACK_in_mult1918); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BACK155_tree = 
            	            (CommonTree)adaptor.create(BACK155)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BACK155_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:192:7: DOTBACK ^
            	            {
            	            DOTBACK156=(Token)match(input,DOTBACK,FOLLOW_DOTBACK_in_mult1927); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DOTBACK156_tree = 
            	            (CommonTree)adaptor.create(DOTBACK156)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DOTBACK156_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult1940);
            	    unary157=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary157.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final ExprParser.add_return add() throws RecognitionException {
        ExprParser.add_return retval = new ExprParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS159=null;
        Token MINUS160=null;
        ExprParser.mult_return mult158 =null;

        ExprParser.mult_return mult161 =null;


        CommonTree PLUS159_tree=null;
        CommonTree MINUS160_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:4: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:8: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add1961);
            mult158=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult158.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:13: ( ( PLUS ^| MINUS ^) mult )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==PLUS) ) {
                    alt26=1;
                }
                else if ( (LA26_0==MINUS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:14: ( PLUS ^| MINUS ^) mult
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:14: ( PLUS ^| MINUS ^)
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==PLUS) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==MINUS) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:15: PLUS ^
            	            {
            	            PLUS159=(Token)match(input,PLUS,FOLLOW_PLUS_in_add1965); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS159_tree = 
            	            (CommonTree)adaptor.create(PLUS159)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS159_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:197:21: MINUS ^
            	            {
            	            MINUS160=(Token)match(input,MINUS,FOLLOW_MINUS_in_add1968); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS160_tree = 
            	            (CommonTree)adaptor.create(MINUS160)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS160_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add1972);
            	    mult161=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult161.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class colonParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colonParameters"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:200:1: colonParameters : mightBeEnd ( COLON mightBeEnd )* -> ( mightBeEnd )* ;
    public final ExprParser.colonParameters_return colonParameters() throws RecognitionException {
        ExprParser.colonParameters_return retval = new ExprParser.colonParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COLON163=null;
        ExprParser.mightBeEnd_return mightBeEnd162 =null;

        ExprParser.mightBeEnd_return mightBeEnd164 =null;


        CommonTree COLON163_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_mightBeEnd=new RewriteRuleSubtreeStream(adaptor,"rule mightBeEnd");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:201:3: ( mightBeEnd ( COLON mightBeEnd )* -> ( mightBeEnd )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:201:3: mightBeEnd ( COLON mightBeEnd )*
            {
            pushFollow(FOLLOW_mightBeEnd_in_colonParameters1991);
            mightBeEnd162=mightBeEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mightBeEnd.add(mightBeEnd162.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:201:14: ( COLON mightBeEnd )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COLON) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:201:15: COLON mightBeEnd
            	    {
            	    COLON163=(Token)match(input,COLON,FOLLOW_COLON_in_colonParameters1994); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON163);


            	    pushFollow(FOLLOW_mightBeEnd_in_colonParameters1996);
            	    mightBeEnd164=mightBeEnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mightBeEnd.add(mightBeEnd164.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: mightBeEnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:34: -> ( mightBeEnd )*
            {
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:201:37: ( mightBeEnd )*
                while ( stream_mightBeEnd.hasNext() ) {
                    adaptor.addChild(root_0, stream_mightBeEnd.nextTree());

                }
                stream_mightBeEnd.reset();

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
        }
        return retval;
    }
    // $ANTLR end "colonParameters"


    public static class mightBeEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mightBeEnd"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:206:1: mightBeEnd : ( add ) ;
    public final ExprParser.mightBeEnd_return mightBeEnd() throws RecognitionException {
        ExprParser.mightBeEnd_return retval = new ExprParser.mightBeEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ExprParser.add_return add165 =null;



        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:206:11: ( ( add ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:206:13: ( add )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:206:13: ( add )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:206:14: add
            {
            pushFollow(FOLLOW_add_in_mightBeEnd2014);
            add165=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add165.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "mightBeEnd"


    public static class colon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colon"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:209:1: colon : ( ( mightBeEnd COLON )=> colonParameters -> ^( COLON colonParameters ) | mightBeEnd | COLON );
    public final ExprParser.colon_return colon() throws RecognitionException {
        ExprParser.colon_return retval = new ExprParser.colon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COLON168=null;
        ExprParser.colonParameters_return colonParameters166 =null;

        ExprParser.mightBeEnd_return mightBeEnd167 =null;


        CommonTree COLON168_tree=null;
        RewriteRuleSubtreeStream stream_colonParameters=new RewriteRuleSubtreeStream(adaptor,"rule colonParameters");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:210:5: ( ( mightBeEnd COLON )=> colonParameters -> ^( COLON colonParameters ) | mightBeEnd | COLON )
            int alt28=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                int LA28_2 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA28_3 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;

                }
                }
                break;
            case OPENB:
                {
                int LA28_4 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 4, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA28_5 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 5, input);

                    throw nvae;

                }
                }
                break;
            case OPENP:
                {
                int LA28_6 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA28_7 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 7, input);

                    throw nvae;

                }
                }
                break;
            case END:
                {
                int LA28_8 = input.LA(2);

                if ( (synpred13_Expr()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 8, input);

                    throw nvae;

                }
                }
                break;
            case COLON:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:210:7: ( mightBeEnd COLON )=> colonParameters
                    {
                    pushFollow(FOLLOW_colonParameters_in_colon2037);
                    colonParameters166=colonParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_colonParameters.add(colonParameters166.getTree());

                    // AST REWRITE
                    // elements: colonParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:45: -> ^( COLON colonParameters )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:210:48: ^( COLON colonParameters )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLON, "COLON")
                        , root_1);

                        adaptor.addChild(root_1, stream_colonParameters.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:211:8: mightBeEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mightBeEnd_in_colon2054);
                    mightBeEnd167=mightBeEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mightBeEnd167.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:212:7: COLON
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COLON168=(Token)match(input,COLON,FOLLOW_COLON_in_colon2062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON168_tree = 
                    (CommonTree)adaptor.create(COLON168)
                    ;
                    adaptor.addChild(root_0, COLON168_tree);
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
        }
        return retval;
    }
    // $ANTLR end "colon"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:216:1: relation : colon ( ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^) colon )* ;
    public final ExprParser.relation_return relation() throws RecognitionException {
        ExprParser.relation_return retval = new ExprParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LT170=null;
        Token GT171=null;
        Token LE172=null;
        Token GE173=null;
        Token EQ174=null;
        Token NE175=null;
        ExprParser.colon_return colon169 =null;

        ExprParser.colon_return colon176 =null;


        CommonTree LT170_tree=null;
        CommonTree GT171_tree=null;
        CommonTree LE172_tree=null;
        CommonTree GE173_tree=null;
        CommonTree EQ174_tree=null;
        CommonTree NE175_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:217:5: ( colon ( ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^) colon )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:217:7: colon ( ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^) colon )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_colon_in_relation2087);
            colon169=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon169.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:217:13: ( ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^) colon )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EQ||LA30_0==GE||LA30_0==GT||LA30_0==LE||LA30_0==LT||LA30_0==NE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:218:5: ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^) colon
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:218:5: ( LT ^| GT ^| LE ^| GE ^| EQ ^| NE ^)
            	    int alt29=6;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case LE:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case GE:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    case EQ:
            	        {
            	        alt29=5;
            	        }
            	        break;
            	    case NE:
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
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:218:7: LT ^
            	            {
            	            LT170=(Token)match(input,LT,FOLLOW_LT_in_relation2097); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT170_tree = 
            	            (CommonTree)adaptor.create(LT170)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LT170_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:219:7: GT ^
            	            {
            	            GT171=(Token)match(input,GT,FOLLOW_GT_in_relation2106); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT171_tree = 
            	            (CommonTree)adaptor.create(GT171)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GT171_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:220:7: LE ^
            	            {
            	            LE172=(Token)match(input,LE,FOLLOW_LE_in_relation2115); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LE172_tree = 
            	            (CommonTree)adaptor.create(LE172)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LE172_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:221:7: GE ^
            	            {
            	            GE173=(Token)match(input,GE,FOLLOW_GE_in_relation2124); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GE173_tree = 
            	            (CommonTree)adaptor.create(GE173)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GE173_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:222:7: EQ ^
            	            {
            	            EQ174=(Token)match(input,EQ,FOLLOW_EQ_in_relation2133); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQ174_tree = 
            	            (CommonTree)adaptor.create(EQ174)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ174_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:223:7: NE ^
            	            {
            	            NE175=(Token)match(input,NE,FOLLOW_NE_in_relation2142); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NE175_tree = 
            	            (CommonTree)adaptor.create(NE175)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NE175_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_colon_in_relation2155);
            	    colon176=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon176.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class eleAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleAnd"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:229:1: eleAnd : relation ( ( AND ^) relation )* ;
    public final ExprParser.eleAnd_return eleAnd() throws RecognitionException {
        ExprParser.eleAnd_return retval = new ExprParser.eleAnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND178=null;
        ExprParser.relation_return relation177 =null;

        ExprParser.relation_return relation179 =null;


        CommonTree AND178_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:230:5: ( relation ( ( AND ^) relation )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:230:7: relation ( ( AND ^) relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_eleAnd2175);
            relation177=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relation177.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:230:16: ( ( AND ^) relation )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:231:5: ( AND ^) relation
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:231:5: ( AND ^)
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:231:7: AND ^
            	    {
            	    AND178=(Token)match(input,AND,FOLLOW_AND_in_eleAnd2185); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND178_tree = 
            	    (CommonTree)adaptor.create(AND178)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND178_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_relation_in_eleAnd2198);
            	    relation179=relation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relation179.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
        }
        return retval;
    }
    // $ANTLR end "eleAnd"


    public static class eleOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eleOr"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:237:1: eleOr : eleAnd ( ( OR ^) eleAnd )* ;
    public final ExprParser.eleOr_return eleOr() throws RecognitionException {
        ExprParser.eleOr_return retval = new ExprParser.eleOr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR181=null;
        ExprParser.eleAnd_return eleAnd180 =null;

        ExprParser.eleAnd_return eleAnd182 =null;


        CommonTree OR181_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:238:5: ( eleAnd ( ( OR ^) eleAnd )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:238:7: eleAnd ( ( OR ^) eleAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleAnd_in_eleOr2218);
            eleAnd180=eleAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd180.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:238:14: ( ( OR ^) eleAnd )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:239:5: ( OR ^) eleAnd
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:239:5: ( OR ^)
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:239:7: OR ^
            	    {
            	    OR181=(Token)match(input,OR,FOLLOW_OR_in_eleOr2228); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR181_tree = 
            	    (CommonTree)adaptor.create(OR181)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR181_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_eleAnd_in_eleOr2241);
            	    eleAnd182=eleAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleAnd182.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "eleOr"


    public static class scAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scAnd"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:244:1: scAnd : eleOr ( ( SCAND ^) eleOr )* ;
    public final ExprParser.scAnd_return scAnd() throws RecognitionException {
        ExprParser.scAnd_return retval = new ExprParser.scAnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCAND184=null;
        ExprParser.eleOr_return eleOr183 =null;

        ExprParser.eleOr_return eleOr185 =null;


        CommonTree SCAND184_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:245:5: ( eleOr ( ( SCAND ^) eleOr )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:245:7: eleOr ( ( SCAND ^) eleOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_eleOr_in_scAnd2264);
            eleOr183=eleOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr183.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:245:13: ( ( SCAND ^) eleOr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SCAND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:246:5: ( SCAND ^) eleOr
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:246:5: ( SCAND ^)
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:246:7: SCAND ^
            	    {
            	    SCAND184=(Token)match(input,SCAND,FOLLOW_SCAND_in_scAnd2274); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SCAND184_tree = 
            	    (CommonTree)adaptor.create(SCAND184)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SCAND184_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_eleOr_in_scAnd2287);
            	    eleOr185=eleOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eleOr185.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "scAnd"


    public static class scOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scOr"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:251:1: scOr : scAnd ( ( SCOR ^) scAnd )* ;
    public final ExprParser.scOr_return scOr() throws RecognitionException {
        ExprParser.scOr_return retval = new ExprParser.scOr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCOR187=null;
        ExprParser.scAnd_return scAnd186 =null;

        ExprParser.scAnd_return scAnd188 =null;


        CommonTree SCOR187_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:252:5: ( scAnd ( ( SCOR ^) scAnd )* )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:252:7: scAnd ( ( SCOR ^) scAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_scAnd_in_scOr2310);
            scAnd186=scAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd186.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:252:13: ( ( SCOR ^) scAnd )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==SCOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:253:5: ( SCOR ^) scAnd
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:253:5: ( SCOR ^)
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:253:7: SCOR ^
            	    {
            	    SCOR187=(Token)match(input,SCOR,FOLLOW_SCOR_in_scOr2320); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SCOR187_tree = 
            	    (CommonTree)adaptor.create(SCOR187)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(SCOR187_tree, root_0);
            	    }

            	    }


            	    pushFollow(FOLLOW_scAnd_in_scOr2333);
            	    scAnd188=scAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scAnd188.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "scOr"


    public static class hCat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hCat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:259:1: hCat : expr ( ( ( COMMA )? ) ! expr )* -> ^( HCAT ( expr )+ ) ;
    public final ExprParser.hCat_return hCat() throws RecognitionException {
        ExprParser.hCat_return retval = new ExprParser.hCat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA190=null;
        ExprParser.expr_return expr189 =null;

        ExprParser.expr_return expr191 =null;


        CommonTree COMMA190_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:259:6: ( expr ( ( ( COMMA )? ) ! expr )* -> ^( HCAT ( expr )+ ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:1: expr ( ( ( COMMA )? ) ! expr )*
            {
            pushFollow(FOLLOW_expr_in_hCat2349);
            expr189=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr189.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:6: ( ( ( COMMA )? ) ! expr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COLON||LA36_0==COMMA||LA36_0==DOUBLE||LA36_0==END||LA36_0==ID||LA36_0==MINUS||(LA36_0 >= OPENB && LA36_0 <= OPENP)||LA36_0==PLUS||LA36_0==STRING_LITERAL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:8: ( ( COMMA )? ) ! expr
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:8: ( ( COMMA )? )
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:9: ( COMMA )?
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:9: ( COMMA )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==COMMA) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:9: COMMA
            	            {
            	            COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_hCat2354); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA190);


            	            }
            	            break;

            	    }


            	    }


            	    pushFollow(FOLLOW_expr_in_hCat2359);
            	    expr191=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr191.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
            // 260:26: -> ^( HCAT ( expr )+ )
            {
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:260:29: ^( HCAT ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HCAT, "HCAT")
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
        }
        return retval;
    }
    // $ANTLR end "hCat"


    public static class chCat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chCat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:262:1: chCat : expr ( ( ( COMMA )? ) ! expr )* -> ^( CHCAT ( expr )+ ) ;
    public final ExprParser.chCat_return chCat() throws RecognitionException {
        ExprParser.chCat_return retval = new ExprParser.chCat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA193=null;
        ExprParser.expr_return expr192 =null;

        ExprParser.expr_return expr194 =null;


        CommonTree COMMA193_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:262:7: ( expr ( ( ( COMMA )? ) ! expr )* -> ^( CHCAT ( expr )+ ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:1: expr ( ( ( COMMA )? ) ! expr )*
            {
            pushFollow(FOLLOW_expr_in_chCat2379);
            expr192=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr192.getTree());

            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:6: ( ( ( COMMA )? ) ! expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COLON||LA38_0==COMMA||LA38_0==DOUBLE||LA38_0==END||LA38_0==ID||LA38_0==MINUS||(LA38_0 >= OPENB && LA38_0 <= OPENP)||LA38_0==PLUS||LA38_0==STRING_LITERAL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:8: ( ( COMMA )? ) ! expr
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:8: ( ( COMMA )? )
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:9: ( COMMA )?
            	    {
            	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:9: ( COMMA )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==COMMA) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:9: COMMA
            	            {
            	            COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_chCat2384); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA193);


            	            }
            	            break;

            	    }


            	    }


            	    pushFollow(FOLLOW_expr_in_chCat2389);
            	    expr194=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr194.getTree());

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
            // 263:26: -> ^( CHCAT ( expr )+ )
            {
                // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:263:29: ^( CHCAT ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CHCAT, "CHCAT")
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
        }
        return retval;
    }
    // $ANTLR end "chCat"


    public static class vcatArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vcatArgs"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:266:1: vcatArgs : ( (str= ID DOT fld= ID ) -> ^( VECFIELD $str $fld) | (str= ID DOT OPENP var= ID CLOSEP ) -> ^( VECFIELDV $str $var) | hCat ( ( SEMI | NEWLINE ) hCat )* -> ^( VCAT ( hCat )+ ) );
    public final ExprParser.vcatArgs_return vcatArgs() throws RecognitionException {
        ExprParser.vcatArgs_return retval = new ExprParser.vcatArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token str=null;
        Token fld=null;
        Token var=null;
        Token DOT195=null;
        Token DOT196=null;
        Token OPENP197=null;
        Token CLOSEP198=null;
        Token SEMI200=null;
        Token NEWLINE201=null;
        ExprParser.hCat_return hCat199 =null;

        ExprParser.hCat_return hCat202 =null;


        CommonTree str_tree=null;
        CommonTree fld_tree=null;
        CommonTree var_tree=null;
        CommonTree DOT195_tree=null;
        CommonTree DOT196_tree=null;
        CommonTree OPENP197_tree=null;
        CommonTree CLOSEP198_tree=null;
        CommonTree SEMI200_tree=null;
        CommonTree NEWLINE201_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSEP=new RewriteRuleTokenStream(adaptor,"token CLOSEP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_OPENP=new RewriteRuleTokenStream(adaptor,"token OPENP");
        RewriteRuleSubtreeStream stream_hCat=new RewriteRuleSubtreeStream(adaptor,"rule hCat");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:267:6: ( (str= ID DOT fld= ID ) -> ^( VECFIELD $str $fld) | (str= ID DOT OPENP var= ID CLOSEP ) -> ^( VECFIELDV $str $var) | hCat ( ( SEMI | NEWLINE ) hCat )* -> ^( VCAT ( hCat )+ ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==DOT) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==ID) ) {
                        alt41=1;
                    }
                    else if ( (LA41_3==OPENP) ) {
                        int LA41_5 = input.LA(4);

                        if ( (LA41_5==ID) ) {
                            int LA41_6 = input.LA(5);

                            if ( (LA41_6==CLOSEP) ) {
                                alt41=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 6, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA41_1==AND||LA41_1==BACK||LA41_1==CARET||LA41_1==CLOSEB||LA41_1==COLON||LA41_1==COMMA||LA41_1==DIV||(LA41_1 >= DOTBACK && LA41_1 <= DOUBLE)||(LA41_1 >= END && LA41_1 <= EQ)||LA41_1==GE||LA41_1==GT||LA41_1==ID||LA41_1==LE||(LA41_1 >= LT && LA41_1 <= MULT)||LA41_1==NE||LA41_1==NEWLINE||(LA41_1 >= OPENB && LA41_1 <= OR)||(LA41_1 >= PLUS && LA41_1 <= SEMI)||LA41_1==STRING_LITERAL||LA41_1==TICK) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA41_0==COLON||LA41_0==DOUBLE||LA41_0==END||LA41_0==MINUS||(LA41_0 >= OPENB && LA41_0 <= OPENP)||LA41_0==PLUS||LA41_0==STRING_LITERAL) ) {
                alt41=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:267:6: (str= ID DOT fld= ID )
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:267:6: (str= ID DOT fld= ID )
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:267:7: str= ID DOT fld= ID
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_vcatArgs2420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT195=(Token)match(input,DOT,FOLLOW_DOT_in_vcatArgs2422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT195);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_vcatArgs2426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    }


                    // AST REWRITE
                    // elements: fld, str
                    // token labels: str, fld
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:27: -> ^( VECFIELD $str $fld)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:267:30: ^( VECFIELD $str $fld)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VECFIELD, "VECFIELD")
                        , root_1);

                        adaptor.addChild(root_1, stream_str.nextNode());

                        adaptor.addChild(root_1, stream_fld.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:268:6: (str= ID DOT OPENP var= ID CLOSEP )
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:268:6: (str= ID DOT OPENP var= ID CLOSEP )
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:268:7: str= ID DOT OPENP var= ID CLOSEP
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_vcatArgs2450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT196=(Token)match(input,DOT,FOLLOW_DOT_in_vcatArgs2452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT196);


                    OPENP197=(Token)match(input,OPENP,FOLLOW_OPENP_in_vcatArgs2454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP197);


                    var=(Token)match(input,ID,FOLLOW_ID_in_vcatArgs2458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP198=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_vcatArgs2460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP198);


                    }


                    // AST REWRITE
                    // elements: var, str
                    // token labels: str, var
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 268:40: -> ^( VECFIELDV $str $var)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:268:43: ^( VECFIELDV $str $var)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VECFIELDV, "VECFIELDV")
                        , root_1);

                        adaptor.addChild(root_1, stream_str.nextNode());

                        adaptor.addChild(root_1, stream_var.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:6: hCat ( ( SEMI | NEWLINE ) hCat )*
                    {
                    pushFollow(FOLLOW_hCat_in_vcatArgs2481);
                    hCat199=hCat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hCat.add(hCat199.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:11: ( ( SEMI | NEWLINE ) hCat )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==NEWLINE||LA40_0==SEMI) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:13: ( SEMI | NEWLINE ) hCat
                    	    {
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:13: ( SEMI | NEWLINE )
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==SEMI) ) {
                    	        alt39=1;
                    	    }
                    	    else if ( (LA39_0==NEWLINE) ) {
                    	        alt39=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 39, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:14: SEMI
                    	            {
                    	            SEMI200=(Token)match(input,SEMI,FOLLOW_SEMI_in_vcatArgs2486); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SEMI.add(SEMI200);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:19: NEWLINE
                    	            {
                    	            NEWLINE201=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_vcatArgs2488); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE201);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_hCat_in_vcatArgs2491);
                    	    hCat202=hCat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_hCat.add(hCat202.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: hCat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 269:36: -> ^( VCAT ( hCat )+ )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:269:39: ^( VCAT ( hCat )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VCAT, "VCAT")
                        , root_1);

                        if ( !(stream_hCat.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_hCat.hasNext() ) {
                            adaptor.addChild(root_1, stream_hCat.nextTree());

                        }
                        stream_hCat.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "vcatArgs"


    public static class cvcatArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cvcatArgs"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:271:1: cvcatArgs : ( (str= ID DOT fld= ID ) -> ^( CELLFIELD $str $fld) | (str= ID DOT OPENP var= ID CLOSEP ) -> ^( CELLFIELDV $str $var) | chCat ( ( SEMI | NEWLINE ) chCat )* -> ^( CVCAT ( chCat )+ ) );
    public final ExprParser.cvcatArgs_return cvcatArgs() throws RecognitionException {
        ExprParser.cvcatArgs_return retval = new ExprParser.cvcatArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token str=null;
        Token fld=null;
        Token var=null;
        Token DOT203=null;
        Token DOT204=null;
        Token OPENP205=null;
        Token CLOSEP206=null;
        Token SEMI208=null;
        Token NEWLINE209=null;
        ExprParser.chCat_return chCat207 =null;

        ExprParser.chCat_return chCat210 =null;


        CommonTree str_tree=null;
        CommonTree fld_tree=null;
        CommonTree var_tree=null;
        CommonTree DOT203_tree=null;
        CommonTree DOT204_tree=null;
        CommonTree OPENP205_tree=null;
        CommonTree CLOSEP206_tree=null;
        CommonTree SEMI208_tree=null;
        CommonTree NEWLINE209_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSEP=new RewriteRuleTokenStream(adaptor,"token CLOSEP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_OPENP=new RewriteRuleTokenStream(adaptor,"token OPENP");
        RewriteRuleSubtreeStream stream_chCat=new RewriteRuleSubtreeStream(adaptor,"rule chCat");
        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:272:5: ( (str= ID DOT fld= ID ) -> ^( CELLFIELD $str $fld) | (str= ID DOT OPENP var= ID CLOSEP ) -> ^( CELLFIELDV $str $var) | chCat ( ( SEMI | NEWLINE ) chCat )* -> ^( CVCAT ( chCat )+ ) )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==DOT) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==ID) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==OPENP) ) {
                        int LA44_5 = input.LA(4);

                        if ( (LA44_5==ID) ) {
                            int LA44_6 = input.LA(5);

                            if ( (LA44_6==CLOSEP) ) {
                                alt44=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 6, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 44, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA44_1==AND||LA44_1==BACK||LA44_1==CARET||LA44_1==CLOSEC||LA44_1==COLON||LA44_1==COMMA||LA44_1==DIV||(LA44_1 >= DOTBACK && LA44_1 <= DOUBLE)||(LA44_1 >= END && LA44_1 <= EQ)||LA44_1==GE||LA44_1==GT||LA44_1==ID||LA44_1==LE||(LA44_1 >= LT && LA44_1 <= MULT)||LA44_1==NE||LA44_1==NEWLINE||(LA44_1 >= OPENB && LA44_1 <= OR)||(LA44_1 >= PLUS && LA44_1 <= SEMI)||LA44_1==STRING_LITERAL||LA44_1==TICK) ) {
                    alt44=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA44_0==COLON||LA44_0==DOUBLE||LA44_0==END||LA44_0==MINUS||(LA44_0 >= OPENB && LA44_0 <= OPENP)||LA44_0==PLUS||LA44_0==STRING_LITERAL) ) {
                alt44=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:272:10: (str= ID DOT fld= ID )
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:272:10: (str= ID DOT fld= ID )
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:272:11: str= ID DOT fld= ID
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_cvcatArgs2521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT203=(Token)match(input,DOT,FOLLOW_DOT_in_cvcatArgs2523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT203);


                    fld=(Token)match(input,ID,FOLLOW_ID_in_cvcatArgs2527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(fld);


                    }


                    // AST REWRITE
                    // elements: fld, str
                    // token labels: str, fld
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_fld=new RewriteRuleTokenStream(adaptor,"token fld",fld);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 272:30: -> ^( CELLFIELD $str $fld)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:272:33: ^( CELLFIELD $str $fld)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CELLFIELD, "CELLFIELD")
                        , root_1);

                        adaptor.addChild(root_1, stream_str.nextNode());

                        adaptor.addChild(root_1, stream_fld.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:273:6: (str= ID DOT OPENP var= ID CLOSEP )
                    {
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:273:6: (str= ID DOT OPENP var= ID CLOSEP )
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:273:7: str= ID DOT OPENP var= ID CLOSEP
                    {
                    str=(Token)match(input,ID,FOLLOW_ID_in_cvcatArgs2550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(str);


                    DOT204=(Token)match(input,DOT,FOLLOW_DOT_in_cvcatArgs2552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT204);


                    OPENP205=(Token)match(input,OPENP,FOLLOW_OPENP_in_cvcatArgs2554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPENP.add(OPENP205);


                    var=(Token)match(input,ID,FOLLOW_ID_in_cvcatArgs2558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(var);


                    CLOSEP206=(Token)match(input,CLOSEP,FOLLOW_CLOSEP_in_cvcatArgs2560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSEP.add(CLOSEP206);


                    }


                    // AST REWRITE
                    // elements: var, str
                    // token labels: str, var
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
                    RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:40: -> ^( CELLFIELDV $str $var)
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:273:43: ^( CELLFIELDV $str $var)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CELLFIELDV, "CELLFIELDV")
                        , root_1);

                        adaptor.addChild(root_1, stream_str.nextNode());

                        adaptor.addChild(root_1, stream_var.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:6: chCat ( ( SEMI | NEWLINE ) chCat )*
                    {
                    pushFollow(FOLLOW_chCat_in_cvcatArgs2581);
                    chCat207=chCat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_chCat.add(chCat207.getTree());

                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:12: ( ( SEMI | NEWLINE ) chCat )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==NEWLINE||LA43_0==SEMI) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:14: ( SEMI | NEWLINE ) chCat
                    	    {
                    	    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:14: ( SEMI | NEWLINE )
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==SEMI) ) {
                    	        alt42=1;
                    	    }
                    	    else if ( (LA42_0==NEWLINE) ) {
                    	        alt42=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 42, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:15: SEMI
                    	            {
                    	            SEMI208=(Token)match(input,SEMI,FOLLOW_SEMI_in_cvcatArgs2586); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SEMI.add(SEMI208);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:20: NEWLINE
                    	            {
                    	            NEWLINE209=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_cvcatArgs2588); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE209);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_chCat_in_cvcatArgs2591);
                    	    chCat210=chCat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_chCat.add(chCat210.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: chCat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 274:38: -> ^( CVCAT ( chCat )+ )
                    {
                        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:274:41: ^( CVCAT ( chCat )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CVCAT, "CVCAT")
                        , root_1);

                        if ( !(stream_chCat.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_chCat.hasNext() ) {
                            adaptor.addChild(root_1, stream_chCat.nextTree());

                        }
                        stream_chCat.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "cvcatArgs"


    public static class vCat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vCat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:276:1: vCat : ( OPENB ! vcatArgs CLOSEB !) ;
    public final ExprParser.vCat_return vCat() throws RecognitionException {
        ExprParser.vCat_return retval = new ExprParser.vCat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OPENB211=null;
        Token CLOSEB213=null;
        ExprParser.vcatArgs_return vcatArgs212 =null;


        CommonTree OPENB211_tree=null;
        CommonTree CLOSEB213_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:277:5: ( ( OPENB ! vcatArgs CLOSEB !) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:277:7: ( OPENB ! vcatArgs CLOSEB !)
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:277:7: ( OPENB ! vcatArgs CLOSEB !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:277:8: OPENB ! vcatArgs CLOSEB !
            {
            OPENB211=(Token)match(input,OPENB,FOLLOW_OPENB_in_vCat2616); if (state.failed) return retval;

            pushFollow(FOLLOW_vcatArgs_in_vCat2619);
            vcatArgs212=vcatArgs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vcatArgs212.getTree());

            CLOSEB213=(Token)match(input,CLOSEB,FOLLOW_CLOSEB_in_vCat2621); if (state.failed) return retval;

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
        }
        return retval;
    }
    // $ANTLR end "vCat"


    public static class cellCat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cellCat"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:280:1: cellCat : ( OPENC ! cvcatArgs CLOSEC !) ;
    public final ExprParser.cellCat_return cellCat() throws RecognitionException {
        ExprParser.cellCat_return retval = new ExprParser.cellCat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OPENC214=null;
        Token CLOSEC216=null;
        ExprParser.cvcatArgs_return cvcatArgs215 =null;


        CommonTree OPENC214_tree=null;
        CommonTree CLOSEC216_tree=null;

        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:281:5: ( ( OPENC ! cvcatArgs CLOSEC !) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:281:7: ( OPENC ! cvcatArgs CLOSEC !)
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:281:7: ( OPENC ! cvcatArgs CLOSEC !)
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:281:8: OPENC ! cvcatArgs CLOSEC !
            {
            OPENC214=(Token)match(input,OPENC,FOLLOW_OPENC_in_cellCat2645); if (state.failed) return retval;

            pushFollow(FOLLOW_cvcatArgs_in_cellCat2648);
            cvcatArgs215=cvcatArgs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cvcatArgs215.getTree());

            CLOSEC216=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_cellCat2650); if (state.failed) return retval;

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
        }
        return retval;
    }
    // $ANTLR end "cellCat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:284:1: expr : ( scOr | cellCat | vCat ) ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ExprParser.scOr_return scOr217 =null;

        ExprParser.cellCat_return cellCat218 =null;

        ExprParser.vCat_return vCat219 =null;



        try {
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:5: ( ( scOr | cellCat | vCat ) )
            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:7: ( scOr | cellCat | vCat )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:7: ( scOr | cellCat | vCat )
            int alt45=3;
            switch ( input.LA(1) ) {
            case COLON:
            case DOUBLE:
            case END:
            case ID:
            case MINUS:
            case OPENP:
            case PLUS:
            case STRING_LITERAL:
                {
                alt45=1;
                }
                break;
            case OPENB:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==CLOSEB) ) {
                    alt45=1;
                }
                else if ( (LA45_2==COLON||LA45_2==DOUBLE||LA45_2==END||LA45_2==ID||LA45_2==MINUS||(LA45_2 >= OPENB && LA45_2 <= OPENP)||LA45_2==PLUS||LA45_2==STRING_LITERAL) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
                }
                break;
            case OPENC:
                {
                alt45=2;
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
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:8: scOr
                    {
                    pushFollow(FOLLOW_scOr_in_expr2674);
                    scOr217=scOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scOr217.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:15: cellCat
                    {
                    pushFollow(FOLLOW_cellCat_in_expr2678);
                    cellCat218=cellCat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cellCat218.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:285:25: vCat
                    {
                    pushFollow(FOLLOW_vCat_in_expr2682);
                    vCat219=vCat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vCat219.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expr"

    // $ANTLR start synpred1_Expr
    public final void synpred1_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:72:9: ( ID OPENP actualParameters CLOSEP DOT ID GETS )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:72:10: ID OPENP actualParameters CLOSEP DOT ID GETS
        {
        match(input,ID,FOLLOW_ID_in_synpred1_Expr235); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred1_Expr237); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred1_Expr239);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred1_Expr241); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred1_Expr243); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred1_Expr245); if (state.failed) return ;

        match(input,GETS,FOLLOW_GETS_in_synpred1_Expr247); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Expr

    // $ANTLR start synpred2_Expr
    public final void synpred2_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:75:9: ( ID OPENP actualParameters CLOSEP DOT OPENP )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:75:10: ID OPENP actualParameters CLOSEP DOT OPENP
        {
        match(input,ID,FOLLOW_ID_in_synpred2_Expr327); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred2_Expr329); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred2_Expr331);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred2_Expr333); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred2_Expr335); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred2_Expr337); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Expr

    // $ANTLR start synpred3_Expr
    public final void synpred3_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:78:7: ( ID DOT OPENP )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:78:8: ID DOT OPENP
        {
        match(input,ID,FOLLOW_ID_in_synpred3_Expr418); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred3_Expr420); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred3_Expr422); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Expr

    // $ANTLR start synpred4_Expr
    public final void synpred4_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:81:10: ( ID DOT ID )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:81:11: ID DOT ID
        {
        match(input,ID,FOLLOW_ID_in_synpred4_Expr488); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred4_Expr490); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred4_Expr492); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Expr

    // $ANTLR start synpred5_Expr
    public final void synpred5_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:84:9: ( ID OPENP actualParameters CLOSEP GETS )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:84:10: ID OPENP actualParameters CLOSEP GETS
        {
        match(input,ID,FOLLOW_ID_in_synpred5_Expr554); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred5_Expr556); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred5_Expr558);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred5_Expr560); if (state.failed) return ;

        match(input,GETS,FOLLOW_GETS_in_synpred5_Expr562); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Expr

    // $ANTLR start synpred6_Expr
    public final void synpred6_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:9: ( ID GETS )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:87:10: ID GETS
        {
        match(input,ID,FOLLOW_ID_in_synpred6_Expr625); if (state.failed) return ;

        match(input,GETS,FOLLOW_GETS_in_synpred6_Expr627); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Expr

    // $ANTLR start synpred7_Expr
    public final void synpred7_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:9: ( OPENB chCat CLOSEB GETS )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:88:10: OPENB chCat CLOSEB GETS
        {
        match(input,OPENB,FOLLOW_OPENB_in_synpred7_Expr663); if (state.failed) return ;

        pushFollow(FOLLOW_chCat_in_synpred7_Expr665);
        chCat();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEB,FOLLOW_CLOSEB_in_synpred7_Expr667); if (state.failed) return ;

        match(input,GETS,FOLLOW_GETS_in_synpred7_Expr669); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Expr

    // $ANTLR start synpred8_Expr
    public final void synpred8_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:146:8: ( ID OPENP actualParameters CLOSEP DOT OPENP )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:146:9: ID OPENP actualParameters CLOSEP DOT OPENP
        {
        match(input,ID,FOLLOW_ID_in_synpred8_Expr1250); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred8_Expr1252); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred8_Expr1254);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred8_Expr1256); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred8_Expr1258); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred8_Expr1260); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Expr

    // $ANTLR start synpred9_Expr
    public final void synpred9_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:149:11: ( ID OPENP actualParameters CLOSEP DOT )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:149:12: ID OPENP actualParameters CLOSEP DOT
        {
        match(input,ID,FOLLOW_ID_in_synpred9_Expr1354); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred9_Expr1356); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred9_Expr1358);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred9_Expr1360); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred9_Expr1362); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Expr

    // $ANTLR start synpred10_Expr
    public final void synpred10_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:152:13: ( ID OPENP actualParameters CLOSEP )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:152:14: ID OPENP actualParameters CLOSEP
        {
        match(input,ID,FOLLOW_ID_in_synpred10_Expr1455); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred10_Expr1457); if (state.failed) return ;

        pushFollow(FOLLOW_actualParameters_in_synpred10_Expr1459);
        actualParameters();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSEP,FOLLOW_CLOSEP_in_synpred10_Expr1461); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Expr

    // $ANTLR start synpred11_Expr
    public final void synpred11_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:154:11: ( ID DOT OPENP )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:154:12: ID DOT OPENP
        {
        match(input,ID,FOLLOW_ID_in_synpred11_Expr1528); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred11_Expr1530); if (state.failed) return ;

        match(input,OPENP,FOLLOW_OPENP_in_synpred11_Expr1532); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Expr

    // $ANTLR start synpred12_Expr
    public final void synpred12_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:156:11: ( ID DOT ID )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:156:12: ID DOT ID
        {
        match(input,ID,FOLLOW_ID_in_synpred12_Expr1606); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred12_Expr1608); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred12_Expr1610); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Expr

    // $ANTLR start synpred13_Expr
    public final void synpred13_Expr_fragment() throws RecognitionException {
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:210:7: ( mightBeEnd COLON )
        // C:\\Users\\dsmith\\Documents\\GT_Mat\\src\\parser\\Expr.g:210:8: mightBeEnd COLON
        {
        pushFollow(FOLLOW_mightBeEnd_in_synpred13_Expr2030);
        mightBeEnd();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred13_Expr2032); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Expr

    // Delegated rules

    public final boolean synpred1_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred13_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred8_Expr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Expr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_body_in_prog127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parts_in_body149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_parts168 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_ifStat_in_parts175 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_switchStat_in_parts181 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_whileStat_in_parts187 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_forStat_in_parts193 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_tryCatch_in_parts199 = new BitSet(new long[]{0x1C9A23001C784042L,0x0000000848627108L});
    public static final BitSet FOLLOW_ID_in_stat263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat265 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_stat267 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat269 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_stat272 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat276 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat278 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat355 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_stat357 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat359 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_stat361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat363 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat369 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat371 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat434 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_stat436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat438 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat442 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat444 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat446 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat504 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_stat506 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat510 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat512 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat578 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_stat580 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat582 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat584 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat632 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat634 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_stat636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENB_in_stat676 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_chCat_in_stat678 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSEB_in_stat680 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_stat682 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_stat688 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_stat692 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_stat694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat737 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_stat739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_stat768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORBAR_in_stat779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_stat790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLC_in_stat801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLF_in_stat812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_stat823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALL_in_stat826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORMAP_in_stat836 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CD_in_stat849 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_stat852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AXIS_in_stat862 = new BitSet(new long[]{0x0800A10004000000L,0x0000000000427C08L});
    public static final BitSet FOLLOW_ON_in_stat866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_stat870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_stat874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRID_in_stat888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_stat891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOLD_in_stat905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_stat908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHADING_in_stat922 = new BitSet(new long[]{0x4004000000000000L});
    public static final BitSet FOLLOW_set_in_stat925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSES_in_stat961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_stat976 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_anything_in_stat978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStat1023 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_ifStat1028 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_ifStat1032 = new BitSet(new long[]{0x00000C0000000100L});
    public static final BitSet FOLLOW_ELSEIF_in_ifStat1042 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_ifStat1047 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_ifStat1052 = new BitSet(new long[]{0x00000C0000000100L});
    public static final BitSet FOLLOW_ELSE_in_ifStat1063 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_ifStat1068 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BLOCK_END_in_ifStat1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryCatch1096 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_tryCatch1101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CATCH_in_tryCatch1110 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_tryCatch1115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BLOCK_END_in_tryCatch1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStat1138 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_forStat1141 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_forStat1143 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_forStat1146 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_forStat1148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BLOCK_END_in_forStat1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStat1161 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_whileStat1164 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_whileStat1166 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BLOCK_END_in_whileStat1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStat1180 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_switchStat1183 = new BitSet(new long[]{0x0000000000001100L,0x0000000000010000L});
    public static final BitSet FOLLOW_caseClause_in_switchStat1186 = new BitSet(new long[]{0x0000000000001100L,0x0000000000010000L});
    public static final BitSet FOLLOW_defaultClause_in_switchStat1191 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BLOCK_END_in_switchStat1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause1204 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_caseClause1207 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_caseClause1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_defaultClause1218 = new BitSet(new long[]{0x1C9A23001C784040L,0x0000000848627108L});
    public static final BitSet FOLLOW_body_in_defaultClause1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_actualParameters1229 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters1232 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_actualParameters1234 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ID_in_term1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_term1290 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_term1294 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1296 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_term1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_term1300 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_term1304 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_term1393 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_term1397 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1399 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_term1401 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_term1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_term1468 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_term1470 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1539 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_term1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_term1543 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_term1547 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1617 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_term1619 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_term1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENB_in_term1676 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSEB_in_term1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_term1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENP_in_term1711 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_term1714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_term1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_term1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_term1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_transponent1760 = new BitSet(new long[]{0x0000009000000802L,0x0000000010000000L});
    public static final BitSet FOLLOW_DOTCARET_in_transponent1775 = new BitSet(new long[]{0x0800210000000000L,0x0000000000405000L});
    public static final BitSet FOLLOW_CARET_in_transponent1784 = new BitSet(new long[]{0x0800210000000000L,0x0000000000405000L});
    public static final BitSet FOLLOW_DOTTICK_in_transponent1793 = new BitSet(new long[]{0x0800210000000000L,0x0000000000405000L});
    public static final BitSet FOLLOW_TICK_in_transponent1802 = new BitSet(new long[]{0x0800210000000000L,0x0000000000405000L});
    public static final BitSet FOLLOW_term_in_transponent1816 = new BitSet(new long[]{0x0000009000000802L,0x0000000010000000L});
    public static final BitSet FOLLOW_PLUS_in_unary1838 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_negation_in_unary1843 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_transponent_in_unary1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negation1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult1872 = new BitSet(new long[]{0x0000006A00000082L,0x0000000000000010L});
    public static final BitSet FOLLOW_MULT_in_mult1882 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_DOTMULT_in_mult1891 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_DIV_in_mult1900 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_DOTDIV_in_mult1909 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_BACK_in_mult1918 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_DOTBACK_in_mult1927 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_unary_in_mult1940 = new BitSet(new long[]{0x0000006A00000082L,0x0000000000000010L});
    public static final BitSet FOLLOW_mult_in_add1961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
    public static final BitSet FOLLOW_PLUS_in_add1965 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_MINUS_in_add1968 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_mult_in_add1972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
    public static final BitSet FOLLOW_mightBeEnd_in_colonParameters1991 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COLON_in_colonParameters1994 = new BitSet(new long[]{0x0800210000000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_mightBeEnd_in_colonParameters1996 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_add_in_mightBeEnd2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colonParameters_in_colon2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mightBeEnd_in_colon2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_colon2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colon_in_relation2087 = new BitSet(new long[]{0x8120400000000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_LT_in_relation2097 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_GT_in_relation2106 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_LE_in_relation2115 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_GE_in_relation2124 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_EQ_in_relation2133 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_NE_in_relation2142 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_colon_in_relation2155 = new BitSet(new long[]{0x8120400000000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_relation_in_eleAnd2175 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_eleAnd2185 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_relation_in_eleAnd2198 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr2218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_OR_in_eleOr2228 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_eleAnd_in_eleOr2241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_eleOr_in_scAnd2264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SCAND_in_scAnd2274 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_eleOr_in_scAnd2287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_scAnd_in_scOr2310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_SCOR_in_scOr2320 = new BitSet(new long[]{0x0800210004000000L,0x0000000000425008L});
    public static final BitSet FOLLOW_scAnd_in_scOr2333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_expr_in_hCat2349 = new BitSet(new long[]{0x0800210024000002L,0x0000000000427008L});
    public static final BitSet FOLLOW_COMMA_in_hCat2354 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_hCat2359 = new BitSet(new long[]{0x0800210024000002L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_chCat2379 = new BitSet(new long[]{0x0800210024000002L,0x0000000000427008L});
    public static final BitSet FOLLOW_COMMA_in_chCat2384 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_expr_in_chCat2389 = new BitSet(new long[]{0x0800210024000002L,0x0000000000427008L});
    public static final BitSet FOLLOW_ID_in_vcatArgs2420 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_vcatArgs2422 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_vcatArgs2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_vcatArgs2450 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_vcatArgs2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_vcatArgs2454 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_vcatArgs2458 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_vcatArgs2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hCat_in_vcatArgs2481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100100L});
    public static final BitSet FOLLOW_SEMI_in_vcatArgs2486 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_NEWLINE_in_vcatArgs2488 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_hCat_in_vcatArgs2491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100100L});
    public static final BitSet FOLLOW_ID_in_cvcatArgs2521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_cvcatArgs2523 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_cvcatArgs2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_cvcatArgs2550 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_cvcatArgs2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_cvcatArgs2554 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_cvcatArgs2558 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_cvcatArgs2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chCat_in_cvcatArgs2581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100100L});
    public static final BitSet FOLLOW_SEMI_in_cvcatArgs2586 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_NEWLINE_in_cvcatArgs2588 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_chCat_in_cvcatArgs2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100100L});
    public static final BitSet FOLLOW_OPENB_in_vCat2616 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_vcatArgs_in_vCat2619 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSEB_in_vCat2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENC_in_cellCat2645 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_cvcatArgs_in_cellCat2648 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLOSEC_in_cellCat2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scOr_in_expr2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cellCat_in_expr2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vCat_in_expr2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Expr235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred1_Expr237 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred1_Expr239 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred1_Expr241 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred1_Expr243 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_synpred1_Expr245 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_synpred1_Expr247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred2_Expr327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred2_Expr329 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred2_Expr331 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred2_Expr333 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred2_Expr335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred2_Expr337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred3_Expr418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred3_Expr420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred3_Expr422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred4_Expr488 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred4_Expr490 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_synpred4_Expr492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred5_Expr554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred5_Expr556 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred5_Expr558 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred5_Expr560 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_synpred5_Expr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred6_Expr625 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_synpred6_Expr627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENB_in_synpred7_Expr663 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_chCat_in_synpred7_Expr665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSEB_in_synpred7_Expr667 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GETS_in_synpred7_Expr669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred8_Expr1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred8_Expr1252 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred8_Expr1254 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred8_Expr1256 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred8_Expr1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred8_Expr1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred9_Expr1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred9_Expr1356 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred9_Expr1358 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred9_Expr1360 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred9_Expr1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred10_Expr1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred10_Expr1457 = new BitSet(new long[]{0x0800210004000000L,0x0000000000427008L});
    public static final BitSet FOLLOW_actualParameters_in_synpred10_Expr1459 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLOSEP_in_synpred10_Expr1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred11_Expr1528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred11_Expr1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPENP_in_synpred11_Expr1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred12_Expr1606 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_synpred12_Expr1608 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_synpred12_Expr1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mightBeEnd_in_synpred13_Expr2030 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred13_Expr2032 = new BitSet(new long[]{0x0000000000000002L});

}