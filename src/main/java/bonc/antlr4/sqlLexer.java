// Generated from sql.g4 by ANTLR 4.7.1

package bonc.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, STAR=8, KW_MAX=9, 
		KW_COUNT=10, KW_SUM=11, KW_AVG=12, KW_MIN=13, KW_BY=14, KW_FULL=15, KW_DESC=16, 
		KW_ORDER=17, KW_INSERT=18, KW_WHERE=19, KW_AS=20, KW_ROWNUM=21, KW_GROUP=22, 
		KW_ASC=23, KW_RIGHT=24, KW_IN=25, KW_NULL=26, KW_IS=27, KW_INTO=28, KW_UNION=29, 
		KW_FROM=30, KW_SELECT=31, KW_JOIN=32, KW_ON=33, KW_LEFT=34, KW_ALL=35, 
		KW_INNER=36, KW_CASE=37, KW_WHEN=38, KW_THEN=39, KW_ELSE=40, KW_END=41, 
		KW_NOT=42, KW_AND=43, KW_OR=44, SEMI=45, LPAREN=46, RPAREN=47, PLUS=48, 
		MINUS=49, DIV=50, MOD=51, STRING=52, INT=53, DOUBLE=54, EXPONENT=55, IDENTIFIER=56, 
		WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "STAR", "KW_MAX", 
		"KW_COUNT", "KW_SUM", "KW_AVG", "KW_MIN", "KW_BY", "KW_FULL", "KW_DESC", 
		"KW_ORDER", "KW_INSERT", "KW_WHERE", "KW_AS", "KW_ROWNUM", "KW_GROUP", 
		"KW_ASC", "KW_RIGHT", "KW_IN", "KW_NULL", "KW_IS", "KW_INTO", "KW_UNION", 
		"KW_FROM", "KW_SELECT", "KW_JOIN", "KW_ON", "KW_LEFT", "KW_ALL", "KW_INNER", 
		"KW_CASE", "KW_WHEN", "KW_THEN", "KW_ELSE", "KW_END", "KW_NOT", "KW_AND", 
		"KW_OR", "SEMI", "LPAREN", "RPAREN", "PLUS", "MINUS", "DIV", "MOD", "STRING", 
		"INT", "DOUBLE", "EXPONENT", "IDENTIFIER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'='", "'>'", "'<>'", "'<'", "'!='", "'*'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "';'", 
		"'('", "')'", "'+'", "'-'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "STAR", "KW_MAX", "KW_COUNT", 
		"KW_SUM", "KW_AVG", "KW_MIN", "KW_BY", "KW_FULL", "KW_DESC", "KW_ORDER", 
		"KW_INSERT", "KW_WHERE", "KW_AS", "KW_ROWNUM", "KW_GROUP", "KW_ASC", "KW_RIGHT", 
		"KW_IN", "KW_NULL", "KW_IS", "KW_INTO", "KW_UNION", "KW_FROM", "KW_SELECT", 
		"KW_JOIN", "KW_ON", "KW_LEFT", "KW_ALL", "KW_INNER", "KW_CASE", "KW_WHEN", 
		"KW_THEN", "KW_ELSE", "KW_END", "KW_NOT", "KW_AND", "KW_OR", "SEMI", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "DIV", "MOD", "STRING", "INT", "DOUBLE", "EXPONENT", 
		"IDENTIFIER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public sqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 56:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0169\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\7\65\u0144\n\65\f\65\16\65\u0147\13\65\3\65\3\65\3\66"+
		"\6\66\u014c\n\66\r\66\16\66\u014d\3\66\5\66\u0151\n\66\3\67\3\67\3\67"+
		"\3\67\5\67\u0157\n\67\38\38\38\39\39\79\u015e\n9\f9\169\u0161\139\3:\6"+
		":\u0164\n:\r:\16:\u0165\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\35\4\2OOoo\4\2CCcc\4\2Z"+
		"Zzz\4\2EEee\4\2QQqq\4\2WWww\4\2PPpp\4\2VVvv\4\2UUuu\4\2XXxx\4\2IIii\4"+
		"\2KKkk\4\2DDdd\4\2[[{{\4\2HHhh\4\2NNnn\4\2FFff\4\2GGgg\4\2TTtt\4\2YYy"+
		"y\4\2JJjj\4\2RRrr\4\2LLll\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2"+
		"\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3\2\2\2"+
		"\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25\u008b\3\2\2\2\27\u0091\3\2\2\2\31"+
		"\u0095\3\2\2\2\33\u0099\3\2\2\2\35\u009d\3\2\2\2\37\u00a0\3\2\2\2!\u00a5"+
		"\3\2\2\2#\u00aa\3\2\2\2%\u00b0\3\2\2\2\'\u00b7\3\2\2\2)\u00bd\3\2\2\2"+
		"+\u00c0\3\2\2\2-\u00c7\3\2\2\2/\u00cd\3\2\2\2\61\u00d1\3\2\2\2\63\u00d7"+
		"\3\2\2\2\65\u00da\3\2\2\2\67\u00df\3\2\2\29\u00e2\3\2\2\2;\u00e7\3\2\2"+
		"\2=\u00ed\3\2\2\2?\u00f2\3\2\2\2A\u00f9\3\2\2\2C\u00fe\3\2\2\2E\u0101"+
		"\3\2\2\2G\u0106\3\2\2\2I\u010a\3\2\2\2K\u0110\3\2\2\2M\u0115\3\2\2\2O"+
		"\u011a\3\2\2\2Q\u011f\3\2\2\2S\u0124\3\2\2\2U\u0128\3\2\2\2W\u012c\3\2"+
		"\2\2Y\u0130\3\2\2\2[\u0133\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u0139"+
		"\3\2\2\2c\u013b\3\2\2\2e\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2\2\2k"+
		"\u014b\3\2\2\2m\u0152\3\2\2\2o\u0158\3\2\2\2q\u015b\3\2\2\2s\u0163\3\2"+
		"\2\2uv\7.\2\2v\4\3\2\2\2wx\7\60\2\2x\6\3\2\2\2yz\7?\2\2z\b\3\2\2\2{|\7"+
		"@\2\2|\n\3\2\2\2}~\7>\2\2~\177\7@\2\2\177\f\3\2\2\2\u0080\u0081\7>\2\2"+
		"\u0081\16\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7?\2\2\u0084\20\3\2\2"+
		"\2\u0085\u0086\7,\2\2\u0086\22\3\2\2\2\u0087\u0088\t\2\2\2\u0088\u0089"+
		"\t\3\2\2\u0089\u008a\t\4\2\2\u008a\24\3\2\2\2\u008b\u008c\t\5\2\2\u008c"+
		"\u008d\t\6\2\2\u008d\u008e\t\7\2\2\u008e\u008f\t\b\2\2\u008f\u0090\t\t"+
		"\2\2\u0090\26\3\2\2\2\u0091\u0092\t\n\2\2\u0092\u0093\t\7\2\2\u0093\u0094"+
		"\t\2\2\2\u0094\30\3\2\2\2\u0095\u0096\t\3\2\2\u0096\u0097\t\13\2\2\u0097"+
		"\u0098\t\f\2\2\u0098\32\3\2\2\2\u0099\u009a\t\2\2\2\u009a\u009b\t\r\2"+
		"\2\u009b\u009c\t\b\2\2\u009c\34\3\2\2\2\u009d\u009e\t\16\2\2\u009e\u009f"+
		"\t\17\2\2\u009f\36\3\2\2\2\u00a0\u00a1\t\20\2\2\u00a1\u00a2\t\7\2\2\u00a2"+
		"\u00a3\t\21\2\2\u00a3\u00a4\t\21\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\22\2"+
		"\2\u00a6\u00a7\t\23\2\2\u00a7\u00a8\t\n\2\2\u00a8\u00a9\t\5\2\2\u00a9"+
		"\"\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00ac\t\24\2\2\u00ac\u00ad\t\22\2"+
		"\2\u00ad\u00ae\t\23\2\2\u00ae\u00af\t\24\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\t\r\2\2\u00b1\u00b2\t\b\2\2\u00b2\u00b3\t\n\2\2\u00b3\u00b4\t\23\2\2"+
		"\u00b4\u00b5\t\24\2\2\u00b5\u00b6\t\t\2\2\u00b6&\3\2\2\2\u00b7\u00b8\t"+
		"\25\2\2\u00b8\u00b9\t\26\2\2\u00b9\u00ba\t\23\2\2\u00ba\u00bb\t\24\2\2"+
		"\u00bb\u00bc\t\23\2\2\u00bc(\3\2\2\2\u00bd\u00be\t\3\2\2\u00be\u00bf\t"+
		"\n\2\2\u00bf*\3\2\2\2\u00c0\u00c1\t\24\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c3"+
		"\t\25\2\2\u00c3\u00c4\t\b\2\2\u00c4\u00c5\t\7\2\2\u00c5\u00c6\t\2\2\2"+
		"\u00c6,\3\2\2\2\u00c7\u00c8\t\f\2\2\u00c8\u00c9\t\24\2\2\u00c9\u00ca\t"+
		"\6\2\2\u00ca\u00cb\t\7\2\2\u00cb\u00cc\t\27\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\t\3\2\2\u00ce\u00cf\t\n\2\2\u00cf\u00d0\t\5\2\2\u00d0\60\3\2\2\2\u00d1"+
		"\u00d2\t\24\2\2\u00d2\u00d3\t\r\2\2\u00d3\u00d4\t\f\2\2\u00d4\u00d5\t"+
		"\26\2\2\u00d5\u00d6\t\t\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\t\r\2\2\u00d8"+
		"\u00d9\t\b\2\2\u00d9\64\3\2\2\2\u00da\u00db\t\b\2\2\u00db\u00dc\t\7\2"+
		"\2\u00dc\u00dd\t\21\2\2\u00dd\u00de\t\21\2\2\u00de\66\3\2\2\2\u00df\u00e0"+
		"\t\r\2\2\u00e0\u00e1\t\n\2\2\u00e18\3\2\2\2\u00e2\u00e3\t\r\2\2\u00e3"+
		"\u00e4\t\b\2\2\u00e4\u00e5\t\t\2\2\u00e5\u00e6\t\6\2\2\u00e6:\3\2\2\2"+
		"\u00e7\u00e8\t\7\2\2\u00e8\u00e9\t\b\2\2\u00e9\u00ea\t\r\2\2\u00ea\u00eb"+
		"\t\6\2\2\u00eb\u00ec\t\b\2\2\u00ec<\3\2\2\2\u00ed\u00ee\t\20\2\2\u00ee"+
		"\u00ef\t\24\2\2\u00ef\u00f0\t\6\2\2\u00f0\u00f1\t\2\2\2\u00f1>\3\2\2\2"+
		"\u00f2\u00f3\t\n\2\2\u00f3\u00f4\t\23\2\2\u00f4\u00f5\t\21\2\2\u00f5\u00f6"+
		"\t\23\2\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\t\t\2\2\u00f8@\3\2\2\2\u00f9"+
		"\u00fa\t\30\2\2\u00fa\u00fb\t\6\2\2\u00fb\u00fc\t\r\2\2\u00fc\u00fd\t"+
		"\b\2\2\u00fdB\3\2\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0100\t\b\2\2\u0100D\3"+
		"\2\2\2\u0101\u0102\t\21\2\2\u0102\u0103\t\23\2\2\u0103\u0104\t\20\2\2"+
		"\u0104\u0105\t\t\2\2\u0105F\3\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108\t"+
		"\21\2\2\u0108\u0109\t\21\2\2\u0109H\3\2\2\2\u010a\u010b\t\r\2\2\u010b"+
		"\u010c\t\b\2\2\u010c\u010d\t\b\2\2\u010d\u010e\t\23\2\2\u010e\u010f\t"+
		"\24\2\2\u010fJ\3\2\2\2\u0110\u0111\t\5\2\2\u0111\u0112\t\3\2\2\u0112\u0113"+
		"\t\n\2\2\u0113\u0114\t\23\2\2\u0114L\3\2\2\2\u0115\u0116\t\25\2\2\u0116"+
		"\u0117\t\26\2\2\u0117\u0118\t\23\2\2\u0118\u0119\t\b\2\2\u0119N\3\2\2"+
		"\2\u011a\u011b\t\t\2\2\u011b\u011c\t\26\2\2\u011c\u011d\t\23\2\2\u011d"+
		"\u011e\t\b\2\2\u011eP\3\2\2\2\u011f\u0120\t\23\2\2\u0120\u0121\t\21\2"+
		"\2\u0121\u0122\t\n\2\2\u0122\u0123\t\23\2\2\u0123R\3\2\2\2\u0124\u0125"+
		"\t\23\2\2\u0125\u0126\t\b\2\2\u0126\u0127\t\22\2\2\u0127T\3\2\2\2\u0128"+
		"\u0129\t\b\2\2\u0129\u012a\t\6\2\2\u012a\u012b\t\t\2\2\u012bV\3\2\2\2"+
		"\u012c\u012d\t\3\2\2\u012d\u012e\t\b\2\2\u012e\u012f\t\22\2\2\u012fX\3"+
		"\2\2\2\u0130\u0131\t\6\2\2\u0131\u0132\t\24\2\2\u0132Z\3\2\2\2\u0133\u0134"+
		"\7=\2\2\u0134\\\3\2\2\2\u0135\u0136\7*\2\2\u0136^\3\2\2\2\u0137\u0138"+
		"\7+\2\2\u0138`\3\2\2\2\u0139\u013a\7-\2\2\u013ab\3\2\2\2\u013b\u013c\7"+
		"/\2\2\u013cd\3\2\2\2\u013d\u013e\7\61\2\2\u013ef\3\2\2\2\u013f\u0140\7"+
		"\'\2\2\u0140h\3\2\2\2\u0141\u0145\7)\2\2\u0142\u0144\n\31\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7)\2\2\u0149j\3\2\2\2\u014a"+
		"\u014c\4\62;\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\5o8\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151l\3\2\2\2\u0152\u0153\5k\66\2\u0153"+
		"\u0154\7\60\2\2\u0154\u0156\5k\66\2\u0155\u0157\5o8\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157n\3\2\2\2\u0158\u0159\t\23\2\2\u0159\u015a"+
		"\5k\66\2\u015ap\3\2\2\2\u015b\u015f\t\32\2\2\u015c\u015e\t\33\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160r\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\t\34\2\2\u0163\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\b:\2\2\u0168t\3\2\2\2\t\2\u0145\u014d\u0150"+
		"\u0156\u015f\u0165\3\3:\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}