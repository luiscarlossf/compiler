// Generated from JavaSimple.g4 by ANTLR 4.4

	import symboltable.*;
	import java.util.HashMap;
	import java.util.Map;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaSimpleLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Letra", "Digito", "Inteiro", "Float", "ESC", "LINE_COMMENT", 
		"COMMENT", "IF", "PROGRAM", "FUNC", "RETURN", "ELSE", "PRINT", "BLOCK", 
		"READ", "FOR", "ASSIGN", "CONST", "STRING", "BOOLEAN", "NUMBER", "DOISPONTOS", 
		"VIRGULA", "CHAVEIN", "CHAVEOUT", "PARAIN", "PARAOUT", "PONTOVIRGULA", 
		"ID", "WS"
	};


	public JavaSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaSimple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: IF_action((RuleContext)_localctx, actionIndex); break;
		case 27: PROGRAM_action((RuleContext)_localctx, actionIndex); break;
		case 28: FUNC_action((RuleContext)_localctx, actionIndex); break;
		case 29: RETURN_action((RuleContext)_localctx, actionIndex); break;
		case 30: ELSE_action((RuleContext)_localctx, actionIndex); break;
		case 31: PRINT_action((RuleContext)_localctx, actionIndex); break;
		case 32: BLOCK_action((RuleContext)_localctx, actionIndex); break;
		case 33: READ_action((RuleContext)_localctx, actionIndex); break;
		case 34: FOR_action((RuleContext)_localctx, actionIndex); break;
		case 35: ASSIGN_action((RuleContext)_localctx, actionIndex); break;
		case 36: CONST_action((RuleContext)_localctx, actionIndex); break;
		case 37: STRING_action((RuleContext)_localctx, actionIndex); break;
		case 38: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;
		case 39: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		case 40: DOISPONTOS_action((RuleContext)_localctx, actionIndex); break;
		case 41: VIRGULA_action((RuleContext)_localctx, actionIndex); break;
		case 42: CHAVEIN_action((RuleContext)_localctx, actionIndex); break;
		case 43: CHAVEOUT_action((RuleContext)_localctx, actionIndex); break;
		case 44: PARAIN_action((RuleContext)_localctx, actionIndex); break;
		case 45: PARAOUT_action((RuleContext)_localctx, actionIndex); break;
		case 46: PONTOVIRGULA_action((RuleContext)_localctx, actionIndex); break;
		case 47: ID_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PRINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.print(" PRINT "); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.print(" NUMBER "); break;
		}
	}
	private void DOISPONTOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.print(" : "); break;
		}
	}
	private void FUNC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.print(" FUNC "); break;
		}
	}
	private void BLOCK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.print(" BLOCK "); break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.print(" FOR "); break;
		}
	}
	private void CHAVEIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.print(" { "); break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.print(" ASSIGN "); break;
		}
	}
	private void VIRGULA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: System.out.print(" , "); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.print(" BOOLEAN "); break;
		}
	}
	private void PONTOVIRGULA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: System.out.print(" ; "); break;
		}
	}
	private void READ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.print(" READ "); break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.print(" RETURN "); break;
		}
	}
	private void PARAOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: System.out.print(" ) "); break;
		}
	}
	private void CHAVEOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: System.out.print(" } "); break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.print(" CONST "); break;
		}
	}
	private void PARAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: System.out.print(" ( "); break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.print(" ELSE "); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.print(" STRING "); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: System.out.print(" ID "); break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.print(" IF "); break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.print("\n PROGRAM "); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0178\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\u00a7"+
		"\n\25\r\25\16\25\u00a8\3\26\3\26\3\27\6\27\u00ae\n\27\r\27\16\27\u00af"+
		"\3\30\6\30\u00b3\n\30\r\30\16\30\u00b4\3\30\3\30\7\30\u00b9\n\30\f\30"+
		"\16\30\u00bc\13\30\3\30\3\30\6\30\u00c0\n\30\r\30\16\30\u00c1\5\30\u00c4"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00cd\n\32\f\32\16\32\u00d0"+
		"\13\32\3\32\5\32\u00d3\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7"+
		"\33\u00dd\n\33\f\33\16\33\u00e0\13\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u0138\n\'\f\'\16\'\u013b\13\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0149\n(\3(\3(\3)\3)\5)\u014f\n"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\7\61\u016b\n\61\f\61\16\61\u016e\13\61\3\61\3\61"+
		"\3\62\6\62\u0173\n\62\r\62\16\62\u0174\3\62\3\62\5\u00ce\u00de\u0139\2"+
		"\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65\27\67\309\31;\32"+
		"=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.\3\2\6\3\2c|\3\2\62"+
		";\b\2$$^^ddppttvv\5\2\13\f\17\17\"\"\u0181\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\3e\3\2\2\2\5g\3\2\2\2\7j\3\2\2\2\tp\3\2\2\2\13s\3\2\2\2\ry\3\2\2\2"+
		"\17}\3\2\2\2\21\177\3\2\2\2\23\u0080\3\2\2\2\25\u0088\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a6"+
		"\3\2\2\2+\u00aa\3\2\2\2-\u00ad\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c8\3\2\2\2\65\u00d8\3\2\2\2\67\u00e6\3\2\2\29\u00eb\3\2\2\2;\u00f5"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u0105\3\2\2\2A\u010c\3\2\2\2C\u0114\3\2\2\2E"+
		"\u011c\3\2\2\2G\u0123\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2\2\2M\u0134\3\2"+
		"\2\2O\u0148\3\2\2\2Q\u014e\3\2\2\2S\u0152\3\2\2\2U\u0155\3\2\2\2W\u0158"+
		"\3\2\2\2Y\u015b\3\2\2\2[\u015e\3\2\2\2]\u0161\3\2\2\2_\u0164\3\2\2\2a"+
		"\u0167\3\2\2\2c\u0172\3\2\2\2ef\7\61\2\2f\4\3\2\2\2gh\7#\2\2hi\7?\2\2"+
		"i\6\3\2\2\2jk\7h\2\2kl\7n\2\2lm\7q\2\2mn\7c\2\2no\7v\2\2o\b\3\2\2\2pq"+
		"\7>\2\2qr\7?\2\2r\n\3\2\2\2st\7d\2\2tu\7t\2\2uv\7g\2\2vw\7c\2\2wx\7m\2"+
		"\2x\f\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\16\3\2\2\2}~\7,\2\2~\20\3\2"+
		"\2\2\u0080\u0081\7d\2\2\u0081\u0082\7q\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087"+
		"\24\3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a\7?\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\30\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7/\2\2\u0091\u0092\7/\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7-\2\2\u0094\u0095\7-\2\2\u0095\36\3\2\2\2\u0096\u0097\7@\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7#\2\2\u0099\"\3\2\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2"+
		"\u009f\u00a0\7i\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2&\3\2\2\2\u00a3"+
		"\u00a4\7/\2\2\u00a4(\3\2\2\2\u00a5\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9*\3\2\2\2"+
		"\u00aa\u00ab\t\3\2\2\u00ab,\3\2\2\2\u00ac\u00ae\5+\26\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		".\3\2\2\2\u00b1\u00b3\5+\26\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba"+
		"\7\60\2\2\u00b7\u00b9\5+\26\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c4\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\5+\26\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\60\3\2\2\2\u00c5"+
		"\u00c6\7^\2\2\u00c6\u00c7\t\4\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7\61\2"+
		"\2\u00c9\u00ca\7\61\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\13\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\7\17\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\f"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\32\2\2\u00d7\64\3\2\2\2\u00d8\u00d9"+
		"\7\61\2\2\u00d9\u00da\7,\2\2\u00da\u00de\3\2\2\2\u00db\u00dd\13\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2"+
		"\u00e3\7\61\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\33\2\2\u00e5\66\3\2"+
		"\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\b\34\3\2\u00ea8\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7i\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7o\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\35\4\2\u00f4:\3\2\2\2"+
		"\u00f5\u00f6\7h\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9"+
		"\7e\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\36\5\2\u00fb<\3\2\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7w\2\2"+
		"\u0100\u0101\7t\2\2\u0101\u0102\7p\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\b\37\6\2\u0104>\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7u\2\2\u0108\u0109\7g\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b \7\2\u010b"+
		"@\3\2\2\2\u010c\u010d\7r\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b!\b"+
		"\2\u0113B\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7n\2\2\u0116\u0117\7"+
		"q\2\2\u0117\u0118\7e\2\2\u0118\u0119\7m\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\b\"\t\2\u011bD\3\2\2\2\u011c\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7f\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b#\n"+
		"\2\u0122F\3\2\2\2\u0123\u0124\7h\2\2\u0124\u0125\7q\2\2\u0125\u0126\7"+
		"t\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b$\13\2\u0128H\3\2\2\2\u0129\u012a"+
		"\7?\2\2\u012a\u012b\b%\f\2\u012bJ\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7p\2\2\u012f\u0130\7u\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\b&\r\2\u0133L\3\2\2\2\u0134\u0139\7$\2\2\u0135"+
		"\u0138\5\61\31\2\u0136\u0138\13\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136"+
		"\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$\2\2\u013d\u013e\b\'"+
		"\16\2\u013eN\3\2\2\2\u013f\u0140\7V\2\2\u0140\u0141\7T\2\2\u0141\u0142"+
		"\7W\2\2\u0142\u0149\7G\2\2\u0143\u0144\7H\2\2\u0144\u0145\7C\2\2\u0145"+
		"\u0146\7N\2\2\u0146\u0147\7U\2\2\u0147\u0149\7G\2\2\u0148\u013f\3\2\2"+
		"\2\u0148\u0143\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b(\17\2\u014bP"+
		"\3\2\2\2\u014c\u014f\5-\27\2\u014d\u014f\5/\30\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b)\20\2\u0151R\3\2\2\2"+
		"\u0152\u0153\7<\2\2\u0153\u0154\b*\21\2\u0154T\3\2\2\2\u0155\u0156\7."+
		"\2\2\u0156\u0157\b+\22\2\u0157V\3\2\2\2\u0158\u0159\7}\2\2\u0159\u015a"+
		"\b,\23\2\u015aX\3\2\2\2\u015b\u015c\7\177\2\2\u015c\u015d\b-\24\2\u015d"+
		"Z\3\2\2\2\u015e\u015f\7*\2\2\u015f\u0160\b.\25\2\u0160\\\3\2\2\2\u0161"+
		"\u0162\7+\2\2\u0162\u0163\b/\26\2\u0163^\3\2\2\2\u0164\u0165\7=\2\2\u0165"+
		"\u0166\b\60\27\2\u0166`\3\2\2\2\u0167\u016c\5)\25\2\u0168\u016b\5)\25"+
		"\2\u0169\u016b\5-\27\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0170\b\61\30\2\u0170b\3\2\2\2\u0171\u0173\t\5\2"+
		"\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b\62\2\2\u0177d\3\2\2\2\23\2"+
		"\u00a8\u00af\u00b4\u00ba\u00c1\u00c3\u00ce\u00d2\u00de\u0137\u0139\u0148"+
		"\u014e\u016a\u016c\u0174\31\b\2\2\3\34\2\3\35\3\3\36\4\3\37\5\3 \6\3!"+
		"\7\3\"\b\3#\t\3$\n\3%\13\3&\f\3\'\r\3(\16\3)\17\3*\20\3+\21\3,\22\3-\23"+
		"\3.\24\3/\25\3\60\26\3\61\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}