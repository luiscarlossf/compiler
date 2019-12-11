// Generated from JavaSimple.g4 by ANTLR 4.4

	import symboltable.*;
	import java.util.HashMap;
	import java.util.Map;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaSimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, LINE_COMMENT=20, COMMENT=21, IF=22, PROGRAM=23, 
		FUNC=24, RETURN=25, ELSE=26, PRINT=27, BLOCK=28, READ=29, FOR=30, ASSIGN=31, 
		CONST=32, STRING=33, BOOLEAN=34, NUMBER=35, DOISPONTOS=36, VIRGULA=37, 
		CHAVEIN=38, CHAVEOUT=39, PARAIN=40, PARAOUT=41, PONTOVIRGULA=42, ID=43, 
		WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'float'", "'<='", "'break'", "'int'", "'*'", 
		"''", "'boolean'", "'>='", "'<'", "'=='", "'--'", "'++'", "'>'", "'!'", 
		"'string'", "'+'", "'-'", "LINE_COMMENT", "COMMENT", "'if'", "'program'", 
		"'func'", "'return'", "'else'", "'print'", "'block'", "'read'", "'for'", 
		"'='", "'const'", "STRING", "BOOLEAN", "NUMBER", "':'", "','", "'{'", 
		"'}'", "'('", "')'", "';'", "ID", "WS"
	};
	public static final int
		RULE_r = 0, RULE_stmt = 1, RULE_vars = 2, RULE_constant = 3, RULE_type = 4, 
		RULE_func_stmt = 5, RULE_rtn_stmt = 6, RULE_block_stmt = 7, RULE_block = 8, 
		RULE_builtin_stmt = 9, RULE_expr_list = 10, RULE_var_list = 11, RULE_assign = 12, 
		RULE_expr = 13, RULE_if_stmt = 14, RULE_for_stmt = 15, RULE_for_block = 16;
	public static final String[] ruleNames = {
		"r", "stmt", "vars", "constant", "type", "func_stmt", "rtn_stmt", "block_stmt", 
		"block", "builtin_stmt", "expr_list", "var_list", "assign", "expr", "if_stmt", 
		"for_stmt", "for_block"
	};

	@Override
	public String getGrammarFileName() { return "JavaSimple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		SymbolTable symtab = new SymbolTable();
		Map <String, MethodSymbol> functables = new HashMap <String, MethodSymbol>();
		int temp = 0;
		int label = 0;

	public JavaSimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaSimpleParser.ID, 0); }
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(JavaSimpleParser.PROGRAM, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(PROGRAM);
			setState(35); match(ID);
			setState(36); match(CHAVEIN);
			setState(38);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__2) | (1L << CONST))) != 0)) {
				{
				setState(37); stmt();
				}
			}

			setState(40); func_stmt();
			setState(41); block_stmt();
			setState(42); match(CHAVEOUT);
			}
			System.out.println(symtab);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(54);
			switch (_input.LA(1)) {
			case T__16:
			case T__13:
			case T__10:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); vars();
				setState(45); match(PONTOVIRGULA);
				setState(47);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__2) | (1L << CONST))) != 0)) {
					{
					setState(46); stmt();
					}
				}

				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); constant();
				setState(50); match(PONTOVIRGULA);
				setState(52);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__2) | (1L << CONST))) != 0)) {
					{
					setState(51); stmt();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(JavaSimpleParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(JavaSimpleParser.ID, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); ((VarsContext)_localctx).type = type();
			setState(57); match(DOISPONTOS);
			setState(58); ((VarsContext)_localctx).ID = match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(59); match(VIRGULA);
				setState(60); ((VarsContext)_localctx).ID = match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        System.out.println("line "+((VarsContext)_localctx).ID.getLine()+": def "+(((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null));
			    	VariableSymbol vs = new VariableSymbol((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null),((VarsContext)_localctx).type.tsym);
			    	symtab.define(vs);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(JavaSimpleParser.CONST, 0); }
		public TerminalNode ID() { return getToken(JavaSimpleParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JavaSimpleParser.NUMBER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(CONST);
			setState(69); type();
			setState(70); match(ID);
			setState(71); match(ASSIGN);
			setState(72); match(NUMBER);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type tsym;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(T__16);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("float");
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(T__13);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("int");
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); match(T__2);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("string");
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); match(T__10);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("boolean");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_stmtContext extends ParserRuleContext {
		public TypeContext a;
		public TypeContext type;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(JavaSimpleParser.ID); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(JavaSimpleParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterFunc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitFunc_stmt(this);
		}
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_stmt);
		 MethodSymbol f = new MethodSymbol();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(85); match(FUNC);
				setState(86); ((Func_stmtContext)_localctx).a = ((Func_stmtContext)_localctx).type = type();
				setState(87); ((Func_stmtContext)_localctx).ID = match(ID);

				    	f = new MethodSymbol((((Func_stmtContext)_localctx).ID!=null?((Func_stmtContext)_localctx).ID.getText():null), ((Func_stmtContext)_localctx).a.tsym, (Scope) symtab);
				    	functables.put((((Func_stmtContext)_localctx).ID!=null?((Func_stmtContext)_localctx).ID.getText():null), f); 
				      
				setState(89); match(PARAIN);
				setState(103);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__2))) != 0)) {
					{
					setState(90); ((Func_stmtContext)_localctx).type = type();
					setState(91); match(DOISPONTOS);
					setState(92); ((Func_stmtContext)_localctx).ID = match(ID);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(93); match(VIRGULA);
						setState(94); ((Func_stmtContext)_localctx).type = type();
						setState(95); match(DOISPONTOS);
						setState(96); ((Func_stmtContext)_localctx).ID = match(ID);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105); match(PARAOUT);
				setState(106); match(CHAVEIN);
				setState(107); block();
				setState(108); match(CHAVEOUT);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

				VariableSymbol vs = new VariableSymbol((((Func_stmtContext)_localctx).ID!=null?((Func_stmtContext)_localctx).ID.getText():null),((Func_stmtContext)_localctx).type.tsym);
				f.define(vs);

			}
			System.out.println(functables);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rtn_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rtn_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtn_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterRtn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitRtn_stmt(this);
		}
	}

	public final Rtn_stmtContext rtn_stmt() throws RecognitionException {
		Rtn_stmtContext _localctx = new Rtn_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rtn_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(RETURN);
			setState(118); match(PARAIN);
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119); expr(0);
				}
				break;
			case 2:
				{
				setState(120); match(T__11);
				}
				break;
			}
			setState(123); match(PARAOUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitBlock_stmt(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(BLOCK);
			setState(126); match(CHAVEIN);
			setState(127); block();
			setState(128); match(CHAVEOUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public List<Builtin_stmtContext> builtin_stmt() {
			return getRuleContexts(Builtin_stmtContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<For_stmtContext> for_stmt() {
			return getRuleContexts(For_stmtContext.class);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public Rtn_stmtContext rtn_stmt(int i) {
			return getRuleContext(Rtn_stmtContext.class,i);
		}
		public For_stmtContext for_stmt(int i) {
			return getRuleContext(For_stmtContext.class,i);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<Rtn_stmtContext> rtn_stmt() {
			return getRuleContexts(Rtn_stmtContext.class);
		}
		public Builtin_stmtContext builtin_stmt(int i) {
			return getRuleContext(Builtin_stmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(144);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(130); builtin_stmt();
						setState(131); match(PONTOVIRGULA);
						}
						break;
					case 2:
						{
						setState(133); assign();
						setState(134); match(PONTOVIRGULA);
						}
						break;
					case 3:
						{
						setState(136); if_stmt();
						}
						break;
					case 4:
						{
						setState(137); for_stmt();
						}
						break;
					case 5:
						{
						setState(138); expr(0);
						setState(139); match(PONTOVIRGULA);
						}
						break;
					case 6:
						{
						setState(141); rtn_stmt();
						setState(142); match(PONTOVIRGULA);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Builtin_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(JavaSimpleParser.PRINT, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode READ() { return getToken(JavaSimpleParser.READ, 0); }
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public Builtin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterBuiltin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitBuiltin_stmt(this);
		}
	}

	public final Builtin_stmtContext builtin_stmt() throws RecognitionException {
		Builtin_stmtContext _localctx = new Builtin_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_builtin_stmt);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); match(PRINT);
				setState(150); match(PARAIN);
				setState(151); expr_list();
				setState(152); match(PARAOUT);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(READ);
				setState(155); match(PARAIN);
				setState(156); var_list();
				setState(157); match(PARAOUT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); expr(0);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(162); match(VIRGULA);
				setState(163); expr(0);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaSimpleParser.ID, i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterVar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitVar_list(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(170); match(VIRGULA);
				setState(171); match(ID);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public String code;
		public String place;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(JavaSimpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((AssignContext)_localctx).ID = match(ID);
			setState(178); match(ASSIGN);
			setState(179); ((AssignContext)_localctx).expr = expr(0);

					((AssignContext)_localctx).place =  (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null);
					((AssignContext)_localctx).code =  ((AssignContext)_localctx).expr.code + _localctx.place "=" ((AssignContext)_localctx).expr.place;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String code;
		public String place;
		public ExprContext e1;
		public Token op;
		public Token ID;
		public Token NUMBER;
		public Token STRING;
		public Token BOOLEAN;
		public ExprContext e2;
		public Token relop;
		public TerminalNode ID() { return getToken(JavaSimpleParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JavaSimpleParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JavaSimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaSimpleParser.BOOLEAN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(183); ((ExprContext)_localctx).op = match(T__3);
				setState(184); ((ExprContext)_localctx).e1 = expr(13);

						((ExprContext)_localctx).place =  "_t"+temp;
						temp++;
						((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "="  op + ((ExprContext)_localctx).e1.place;
					
				}
				break;
			case 2:
				{
				setState(187); ((ExprContext)_localctx).op = match(T__0);
				setState(188); ((ExprContext)_localctx).e1 = expr(12);

						((ExprContext)_localctx).place =  "_t"+temp;
						temp++;
						((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "="  op + ((ExprContext)_localctx).e1.place;
					
				}
				break;
			case 3:
				{
				setState(191);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__5) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(192); ((ExprContext)_localctx).e1 = expr(11);

						((ExprContext)_localctx).place =  "_t"+temp;
						temp++;
						((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "="  op + ((ExprContext)_localctx).e1.place;
					
				}
				break;
			case 4:
				{
				}
				break;
			case 5:
				{
				setState(196); ((ExprContext)_localctx).ID = match(ID);
				setState(197); match(PARAIN);
				setState(200);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(198); expr_list();
					}
					break;
				case 2:
					{
					setState(199); match(T__11);
					}
					break;
				}
				setState(202); match(PARAOUT);
				}
				break;
			case 6:
				{
				setState(203); match(PARAIN);
				setState(204); ((ExprContext)_localctx).e1 = expr(0);
				setState(205); match(PARAOUT);

						((ExprContext)_localctx).place =  ((ExprContext)_localctx).e1.place;
						((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code;
					
				}
				break;
			case 7:
				{
				setState(208); ((ExprContext)_localctx).ID = match(ID);

						((ExprContext)_localctx).place =  (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
						((ExprContext)_localctx).code =  "";
					
				}
				break;
			case 8:
				{
				setState(210); ((ExprContext)_localctx).NUMBER = match(NUMBER);

						((ExprContext)_localctx).place =  (((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null);
						((ExprContext)_localctx).code =  "";
					
				}
				break;
			case 9:
				{
				setState(212); ((ExprContext)_localctx).STRING = match(STRING);

						((ExprContext)_localctx).place =  (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null);
						((ExprContext)_localctx).code =  "";
					
				}
				break;
			case 10:
				{
				setState(214); ((ExprContext)_localctx).BOOLEAN = match(BOOLEAN);

						((ExprContext)_localctx).place =  (((ExprContext)_localctx).BOOLEAN!=null?((ExprContext)_localctx).BOOLEAN.getText():null);
						((ExprContext)_localctx).code =  "";
					
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(219);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__12) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(220); ((ExprContext)_localctx).e2 = expr(11);

						          		((ExprContext)_localctx).place =  "_t"+temp;
						          		temp++;
						          		((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "=" ((ExprContext)_localctx).e1.place + op + ((ExprContext)_localctx).e2.place;
						          	
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(225); ((ExprContext)_localctx).e2 = expr(10);

						          		((ExprContext)_localctx).place =  "_t"+temp;
						          		temp++;
						          		((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "=" ((ExprContext)_localctx).e1.place + op + ((ExprContext)_localctx).e2.place;
						          	
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(229);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__7) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(230); ((ExprContext)_localctx).e2 = expr(9);

						          		((ExprContext)_localctx).place =  "_t"+temp;
						          		temp++;
						          		((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "=" ((ExprContext)_localctx).e1.place + op + ((ExprContext)_localctx).e2.place;
						          	
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						((ExprContext)_localctx).relop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << T__8) | (1L << T__4))) != 0)) ) {
							((ExprContext)_localctx).relop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(235); ((ExprContext)_localctx).e2 = expr(8);

						          		((ExprContext)_localctx).place =  "_t"+temp;
						          		temp++;
						          		((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code + ((ExprContext)_localctx).e2.code + _localctx.place "=" ((ExprContext)_localctx).e1.place + relop + ((ExprContext)_localctx).e2.place;
						          	
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode ELSE() { return getToken(JavaSimpleParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(JavaSimpleParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(IF);
			setState(244); match(PARAIN);
			setState(245); expr(0);
			setState(246); match(PARAOUT);
			setState(247); match(CHAVEIN);
			setState(248); ((If_stmtContext)_localctx).b1 = block();
			setState(249); match(CHAVEOUT);
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(250); match(ELSE);
				setState(251); match(CHAVEIN);
				setState(252); ((If_stmtContext)_localctx).b2 = block();
				setState(253); match(CHAVEOUT);
				}
				break;
			}

				String lelse = ".l"+label;
				label++;
				String lend = ".l"+label;
				label++;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public TerminalNode FOR() { return getToken(JavaSimpleParser.FOR, 0); }
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(FOR);
			setState(260); match(PARAIN);
			setState(269);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(261); assign();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(262); match(VIRGULA);
					setState(263); assign();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271); match(PONTOVIRGULA);
			setState(272); expr(0);
			setState(273); match(PONTOVIRGULA);
			setState(282);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(274); assign();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(275); match(VIRGULA);
					setState(276); assign();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(284); match(PARAOUT);
			setState(285); match(CHAVEIN);
			setState(286); for_block();
			setState(287); match(CHAVEOUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSimpleListener ) ((JavaSimpleListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_block);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290); match(T__14);
				setState(291); match(PONTOVIRGULA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 8);
		case 3: return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\3\3\5\3\67\n\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6V\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7e\n\7\f"+
		"\7\16\7h\13\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2\n\13"+
		"\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\r\3\r\3\r\7\r\u00af\n"+
		"\r\f\r\16\r\u00b2\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00cb\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f1"+
		"\n\17\f\17\16\17\u00f4\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0102\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u010b\n\21\f\21\16\21\u010e\13\21\5\21\u0110\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0118\n\21\f\21\16\21\u011b\13\21\5\21\u011d\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0127\n\22\3\22\2\3\34\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\17\20\4\2\3\3\t\t\3"+
		"\2\24\25\4\2\4\4\16\16\5\2\6\6\f\r\21\21\u0140\2$\3\2\2\2\48\3\2\2\2\6"+
		":\3\2\2\2\bF\3\2\2\2\nU\3\2\2\2\fr\3\2\2\2\16w\3\2\2\2\20\177\3\2\2\2"+
		"\22\u0094\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00ab\3\2\2\2\32"+
		"\u00b3\3\2\2\2\34\u00da\3\2\2\2\36\u00f5\3\2\2\2 \u0105\3\2\2\2\"\u0126"+
		"\3\2\2\2$%\7\31\2\2%&\7-\2\2&(\7(\2\2\')\5\4\3\2(\'\3\2\2\2()\3\2\2\2"+
		")*\3\2\2\2*+\5\f\7\2+,\5\20\t\2,-\7)\2\2-\3\3\2\2\2./\5\6\4\2/\61\7,\2"+
		"\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\629\3\2\2\2\63\64\5\b\5\2"+
		"\64\66\7,\2\2\65\67\5\4\3\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28."+
		"\3\2\2\28\63\3\2\2\29\5\3\2\2\2:;\5\n\6\2;<\7&\2\2<A\7-\2\2=>\7\'\2\2"+
		">@\7-\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\b\4\1\2E\7\3\2\2\2FG\7\"\2\2GH\5\n\6\2HI\7-\2\2IJ\7!\2\2JK\7%\2\2K"+
		"L\b\5\1\2L\t\3\2\2\2MN\7\5\2\2NV\b\6\1\2OP\7\b\2\2PV\b\6\1\2QR\7\23\2"+
		"\2RV\b\6\1\2ST\7\13\2\2TV\b\6\1\2UM\3\2\2\2UO\3\2\2\2UQ\3\2\2\2US\3\2"+
		"\2\2V\13\3\2\2\2WX\7\32\2\2XY\5\n\6\2YZ\7-\2\2Z[\b\7\1\2[i\7*\2\2\\]\5"+
		"\n\6\2]^\7&\2\2^f\7-\2\2_`\7\'\2\2`a\5\n\6\2ab\7&\2\2bc\7-\2\2ce\3\2\2"+
		"\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2i\\\3\2"+
		"\2\2ij\3\2\2\2jk\3\2\2\2kl\7+\2\2lm\7(\2\2mn\5\22\n\2no\7)\2\2oq\3\2\2"+
		"\2pW\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\7\1"+
		"\2v\r\3\2\2\2wx\7\33\2\2x{\7*\2\2y|\5\34\17\2z|\7\n\2\2{y\3\2\2\2{z\3"+
		"\2\2\2|}\3\2\2\2}~\7+\2\2~\17\3\2\2\2\177\u0080\7\36\2\2\u0080\u0081\7"+
		"(\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7)\2\2\u0083\21\3\2\2\2\u0084\u0085"+
		"\5\24\13\2\u0085\u0086\7,\2\2\u0086\u0093\3\2\2\2\u0087\u0088\5\32\16"+
		"\2\u0088\u0089\7,\2\2\u0089\u0093\3\2\2\2\u008a\u0093\5\36\20\2\u008b"+
		"\u0093\5 \21\2\u008c\u008d\5\34\17\2\u008d\u008e\7,\2\2\u008e\u0093\3"+
		"\2\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7,\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0084\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2"+
		"\2\2\u0092\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u0098\7\35\2\2\u0098\u0099\7*\2\2\u0099\u009a\5\26\f\2\u009a"+
		"\u009b\7+\2\2\u009b\u00a2\3\2\2\2\u009c\u009d\7\37\2\2\u009d\u009e\7*"+
		"\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\7+\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0097\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a8\5\34\17"+
		"\2\u00a4\u00a5\7\'\2\2\u00a5\u00a7\5\34\17\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\7-\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00af"+
		"\7-\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7-\2\2"+
		"\u00b4\u00b5\7!\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\b\16\1\2\u00b7\33"+
		"\3\2\2\2\u00b8\u00b9\b\17\1\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5\34\17"+
		"\17\u00bb\u00bc\b\17\1\2\u00bc\u00db\3\2\2\2\u00bd\u00be\7\25\2\2\u00be"+
		"\u00bf\5\34\17\16\u00bf\u00c0\b\17\1\2\u00c0\u00db\3\2\2\2\u00c1\u00c2"+
		"\t\2\2\2\u00c2\u00c3\5\34\17\r\u00c3\u00c4\b\17\1\2\u00c4\u00db\3\2\2"+
		"\2\u00c5\u00db\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\u00ca\7*\2\2\u00c8\u00cb"+
		"\5\26\f\2\u00c9\u00cb\7\n\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00db\7+\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf"+
		"\5\34\17\2\u00cf\u00d0\7+\2\2\u00d0\u00d1\b\17\1\2\u00d1\u00db\3\2\2\2"+
		"\u00d2\u00d3\7-\2\2\u00d3\u00db\b\17\1\2\u00d4\u00d5\7%\2\2\u00d5\u00db"+
		"\b\17\1\2\u00d6\u00d7\7#\2\2\u00d7\u00db\b\17\1\2\u00d8\u00d9\7$\2\2\u00d9"+
		"\u00db\b\17\1\2\u00da\u00b8\3\2\2\2\u00da\u00bd\3\2\2\2\u00da\u00c1\3"+
		"\2\2\2\u00da\u00c5\3\2\2\2\u00da\u00c6\3\2\2\2\u00da\u00cd\3\2\2\2\u00da"+
		"\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00f2\3\2\2\2\u00dc\u00dd\f\f\2\2\u00dd\u00de\t\3\2\2\u00de"+
		"\u00df\5\34\17\r\u00df\u00e0\b\17\1\2\u00e0\u00f1\3\2\2\2\u00e1\u00e2"+
		"\f\13\2\2\u00e2\u00e3\t\4\2\2\u00e3\u00e4\5\34\17\f\u00e4\u00e5\b\17\1"+
		"\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\f\n\2\2\u00e7\u00e8\t\5\2\2\u00e8\u00e9"+
		"\5\34\17\13\u00e9\u00ea\b\17\1\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\f\t\2"+
		"\2\u00ec\u00ed\t\6\2\2\u00ed\u00ee\5\34\17\n\u00ee\u00ef\b\17\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e6\3\2"+
		"\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\30\2"+
		"\2\u00f6\u00f7\7*\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\7+\2\2\u00f9\u00fa"+
		"\7(\2\2\u00fa\u00fb\5\22\n\2\u00fb\u0101\7)\2\2\u00fc\u00fd\7\34\2\2\u00fd"+
		"\u00fe\7(\2\2\u00fe\u00ff\5\22\n\2\u00ff\u0100\7)\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fc\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b\20\1\2\u0104\37\3\2\2\2\u0105\u0106\7 \2\2\u0106\u010f\7*\2\2"+
		"\u0107\u010c\5\32\16\2\u0108\u0109\7\'\2\2\u0109\u010b\5\32\16\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7,\2\2\u0112\u0113\5\34"+
		"\17\2\u0113\u011c\7,\2\2\u0114\u0119\5\32\16\2\u0115\u0116\7\'\2\2\u0116"+
		"\u0118\5\32\16\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0114\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7+"+
		"\2\2\u011f\u0120\7(\2\2\u0120\u0121\5\"\22\2\u0121\u0122\7)\2\2\u0122"+
		"!\3\2\2\2\u0123\u0127\5\22\n\2\u0124\u0125\7\7\2\2\u0125\u0127\7,\2\2"+
		"\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0127#\3\2\2\2\33(\61\668AUf"+
		"ir{\u0092\u0094\u00a1\u00a8\u00b0\u00ca\u00da\u00f0\u00f2\u0101\u010c"+
		"\u010f\u0119\u011c\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}