// Generated from sql.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, STAR=8, KW_BY=9, 
		KW_FULL=10, KW_DESC=11, KW_ORDER=12, KW_INSERT=13, KW_WHERE=14, KW_AS=15, 
		KW_ROWNUM=16, KW_GROUP=17, KW_ASC=18, KW_RIGHT=19, KW_IN=20, KW_NULL=21, 
		KW_IS=22, KW_INTO=23, KW_UNION=24, KW_FROM=25, KW_SELECT=26, KW_JOIN=27, 
		KW_ON=28, KW_LEFT=29, KW_ALL=30, KW_INNER=31, KW_CASE=32, KW_WHEN=33, 
		KW_THEN=34, KW_ELSE=35, KW_END=36, KW_NOT=37, KW_AND=38, KW_OR=39, SEMI=40, 
		LPAREN=41, RPAREN=42, PLUS=43, MINUS=44, DIV=45, MOD=46, STRING=47, INT=48, 
		DOUBLE=49, EXPONENT=50, IDENTIFIER=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "STAR", "KW_BY", 
		"KW_FULL", "KW_DESC", "KW_ORDER", "KW_INSERT", "KW_WHERE", "KW_AS", "KW_ROWNUM", 
		"KW_GROUP", "KW_ASC", "KW_RIGHT", "KW_IN", "KW_NULL", "KW_IS", "KW_INTO", 
		"KW_UNION", "KW_FROM", "KW_SELECT", "KW_JOIN", "KW_ON", "KW_LEFT", "KW_ALL", 
		"KW_INNER", "KW_CASE", "KW_WHEN", "KW_THEN", "KW_ELSE", "KW_END", "KW_NOT", 
		"KW_AND", "KW_OR", "SEMI", "LPAREN", "RPAREN", "PLUS", "MINUS", "DIV", 
		"MOD", "STRING", "INT", "DOUBLE", "EXPONENT", "IDENTIFIER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'='", "'>'", "'<>'", "'<'", "'!='", "'*'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "';'", "'('", "')'", "'+'", "'-'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "STAR", "KW_BY", "KW_FULL", 
		"KW_DESC", "KW_ORDER", "KW_INSERT", "KW_WHERE", "KW_AS", "KW_ROWNUM", 
		"KW_GROUP", "KW_ASC", "KW_RIGHT", "KW_IN", "KW_NULL", "KW_IS", "KW_INTO", 
		"KW_UNION", "KW_FROM", "KW_SELECT", "KW_JOIN", "KW_ON", "KW_LEFT", "KW_ALL", 
		"KW_INNER", "KW_CASE", "KW_WHEN", "KW_THEN", "KW_ELSE", "KW_END", "KW_NOT", 
		"KW_AND", "KW_OR", "SEMI", "LPAREN", "RPAREN", "PLUS", "MINUS", "DIV", 
		"MOD", "STRING", "INT", "DOUBLE", "EXPONENT", "IDENTIFIER", "WS"
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
		case 51:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\7\60\u0124\n\60\f\60\16\60\u0127\13"+
		"\60\3\60\3\60\3\61\6\61\u012c\n\61\r\61\16\61\u012d\3\61\5\61\u0131\n"+
		"\61\3\62\3\62\3\62\3\62\5\62\u0137\n\62\3\63\3\63\3\63\3\64\3\64\7\64"+
		"\u013e\n\64\f\64\16\64\u0141\13\64\3\65\6\65\u0144\n\65\r\65\16\65\u0145"+
		"\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66\3\2\33\4\2DDdd\4\2[[{{\4\2HHhh\4\2WWww\4\2NNnn\4\2FFff\4\2GG"+
		"gg\4\2UUuu\4\2EEee\4\2QQqq\4\2TTtt\4\2KKkk\4\2PPpp\4\2VVvv\4\2YYyy\4\2"+
		"JJjj\4\2CCcc\4\2OOoo\4\2IIii\4\2RRrr\4\2LLll\3\2))\5\2C\\aac|\6\2\62;"+
		"C\\aac|\5\2\13\f\17\17\"\"\2\u014e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2"+
		"\rv\3\2\2\2\17x\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\u0080\3\2\2\2\27\u0085"+
		"\3\2\2\2\31\u008a\3\2\2\2\33\u0090\3\2\2\2\35\u0097\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u00a0\3\2\2\2#\u00a7\3\2\2\2%\u00ad\3\2\2\2\'\u00b1\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00ba\3\2\2\2-\u00bf\3\2\2\2/\u00c2\3\2\2\2\61\u00c7\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00d2\3\2\2\2\67\u00d9\3\2\2\29\u00de\3\2\2\2;\u00e1"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00ea\3\2\2\2A\u00f0\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00fa\3\2\2\2G\u00ff\3\2\2\2I\u0104\3\2\2\2K\u0108\3\2\2\2M\u010c\3\2"+
		"\2\2O\u0110\3\2\2\2Q\u0113\3\2\2\2S\u0115\3\2\2\2U\u0117\3\2\2\2W\u0119"+
		"\3\2\2\2Y\u011b\3\2\2\2[\u011d\3\2\2\2]\u011f\3\2\2\2_\u0121\3\2\2\2a"+
		"\u012b\3\2\2\2c\u0132\3\2\2\2e\u0138\3\2\2\2g\u013b\3\2\2\2i\u0143\3\2"+
		"\2\2kl\7.\2\2l\4\3\2\2\2mn\7\60\2\2n\6\3\2\2\2op\7?\2\2p\b\3\2\2\2qr\7"+
		"@\2\2r\n\3\2\2\2st\7>\2\2tu\7@\2\2u\f\3\2\2\2vw\7>\2\2w\16\3\2\2\2xy\7"+
		"#\2\2yz\7?\2\2z\20\3\2\2\2{|\7,\2\2|\22\3\2\2\2}~\t\2\2\2~\177\t\3\2\2"+
		"\177\24\3\2\2\2\u0080\u0081\t\4\2\2\u0081\u0082\t\5\2\2\u0082\u0083\t"+
		"\6\2\2\u0083\u0084\t\6\2\2\u0084\26\3\2\2\2\u0085\u0086\t\7\2\2\u0086"+
		"\u0087\t\b\2\2\u0087\u0088\t\t\2\2\u0088\u0089\t\n\2\2\u0089\30\3\2\2"+
		"\2\u008a\u008b\t\13\2\2\u008b\u008c\t\f\2\2\u008c\u008d\t\7\2\2\u008d"+
		"\u008e\t\b\2\2\u008e\u008f\t\f\2\2\u008f\32\3\2\2\2\u0090\u0091\t\r\2"+
		"\2\u0091\u0092\t\16\2\2\u0092\u0093\t\t\2\2\u0093\u0094\t\b\2\2\u0094"+
		"\u0095\t\f\2\2\u0095\u0096\t\17\2\2\u0096\34\3\2\2\2\u0097\u0098\t\20"+
		"\2\2\u0098\u0099\t\21\2\2\u0099\u009a\t\b\2\2\u009a\u009b\t\f\2\2\u009b"+
		"\u009c\t\b\2\2\u009c\36\3\2\2\2\u009d\u009e\t\22\2\2\u009e\u009f\t\t\2"+
		"\2\u009f \3\2\2\2\u00a0\u00a1\t\f\2\2\u00a1\u00a2\t\13\2\2\u00a2\u00a3"+
		"\t\20\2\2\u00a3\u00a4\t\16\2\2\u00a4\u00a5\t\5\2\2\u00a5\u00a6\t\23\2"+
		"\2\u00a6\"\3\2\2\2\u00a7\u00a8\t\24\2\2\u00a8\u00a9\t\f\2\2\u00a9\u00aa"+
		"\t\13\2\2\u00aa\u00ab\t\5\2\2\u00ab\u00ac\t\25\2\2\u00ac$\3\2\2\2\u00ad"+
		"\u00ae\t\22\2\2\u00ae\u00af\t\t\2\2\u00af\u00b0\t\n\2\2\u00b0&\3\2\2\2"+
		"\u00b1\u00b2\t\f\2\2\u00b2\u00b3\t\r\2\2\u00b3\u00b4\t\24\2\2\u00b4\u00b5"+
		"\t\21\2\2\u00b5\u00b6\t\17\2\2\u00b6(\3\2\2\2\u00b7\u00b8\t\r\2\2\u00b8"+
		"\u00b9\t\16\2\2\u00b9*\3\2\2\2\u00ba\u00bb\t\16\2\2\u00bb\u00bc\t\5\2"+
		"\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\t\6\2\2\u00be,\3\2\2\2\u00bf\u00c0"+
		"\t\r\2\2\u00c0\u00c1\t\t\2\2\u00c1.\3\2\2\2\u00c2\u00c3\t\r\2\2\u00c3"+
		"\u00c4\t\16\2\2\u00c4\u00c5\t\17\2\2\u00c5\u00c6\t\13\2\2\u00c6\60\3\2"+
		"\2\2\u00c7\u00c8\t\5\2\2\u00c8\u00c9\t\16\2\2\u00c9\u00ca\t\r\2\2\u00ca"+
		"\u00cb\t\13\2\2\u00cb\u00cc\t\16\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\t\4"+
		"\2\2\u00ce\u00cf\t\f\2\2\u00cf\u00d0\t\13\2\2\u00d0\u00d1\t\23\2\2\u00d1"+
		"\64\3\2\2\2\u00d2\u00d3\t\t\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00d5\t\6\2"+
		"\2\u00d5\u00d6\t\b\2\2\u00d6\u00d7\t\n\2\2\u00d7\u00d8\t\17\2\2\u00d8"+
		"\66\3\2\2\2\u00d9\u00da\t\26\2\2\u00da\u00db\t\13\2\2\u00db\u00dc\t\r"+
		"\2\2\u00dc\u00dd\t\16\2\2\u00dd8\3\2\2\2\u00de\u00df\t\13\2\2\u00df\u00e0"+
		"\t\16\2\2\u00e0:\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2\u00e3\t\b\2\2\u00e3"+
		"\u00e4\t\4\2\2\u00e4\u00e5\t\17\2\2\u00e5<\3\2\2\2\u00e6\u00e7\t\22\2"+
		"\2\u00e7\u00e8\t\6\2\2\u00e8\u00e9\t\6\2\2\u00e9>\3\2\2\2\u00ea\u00eb"+
		"\t\r\2\2\u00eb\u00ec\t\16\2\2\u00ec\u00ed\t\16\2\2\u00ed\u00ee\t\b\2\2"+
		"\u00ee\u00ef\t\f\2\2\u00ef@\3\2\2\2\u00f0\u00f1\t\n\2\2\u00f1\u00f2\t"+
		"\22\2\2\u00f2\u00f3\t\t\2\2\u00f3\u00f4\t\b\2\2\u00f4B\3\2\2\2\u00f5\u00f6"+
		"\t\20\2\2\u00f6\u00f7\t\21\2\2\u00f7\u00f8\t\b\2\2\u00f8\u00f9\t\16\2"+
		"\2\u00f9D\3\2\2\2\u00fa\u00fb\t\17\2\2\u00fb\u00fc\t\21\2\2\u00fc\u00fd"+
		"\t\b\2\2\u00fd\u00fe\t\16\2\2\u00feF\3\2\2\2\u00ff\u0100\t\b\2\2\u0100"+
		"\u0101\t\6\2\2\u0101\u0102\t\t\2\2\u0102\u0103\t\b\2\2\u0103H\3\2\2\2"+
		"\u0104\u0105\t\b\2\2\u0105\u0106\t\16\2\2\u0106\u0107\t\7\2\2\u0107J\3"+
		"\2\2\2\u0108\u0109\t\16\2\2\u0109\u010a\t\13\2\2\u010a\u010b\t\17\2\2"+
		"\u010bL\3\2\2\2\u010c\u010d\t\22\2\2\u010d\u010e\t\16\2\2\u010e\u010f"+
		"\t\7\2\2\u010fN\3\2\2\2\u0110\u0111\t\13\2\2\u0111\u0112\t\f\2\2\u0112"+
		"P\3\2\2\2\u0113\u0114\7=\2\2\u0114R\3\2\2\2\u0115\u0116\7*\2\2\u0116T"+
		"\3\2\2\2\u0117\u0118\7+\2\2\u0118V\3\2\2\2\u0119\u011a\7-\2\2\u011aX\3"+
		"\2\2\2\u011b\u011c\7/\2\2\u011cZ\3\2\2\2\u011d\u011e\7\61\2\2\u011e\\"+
		"\3\2\2\2\u011f\u0120\7\'\2\2\u0120^\3\2\2\2\u0121\u0125\7)\2\2\u0122\u0124"+
		"\n\27\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129"+
		"\7)\2\2\u0129`\3\2\2\2\u012a\u012c\4\62;\2\u012b\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0131\5e\63\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131b\3\2\2\2"+
		"\u0132\u0133\5a\61\2\u0133\u0134\7\60\2\2\u0134\u0136\5a\61\2\u0135\u0137"+
		"\5e\63\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137d\3\2\2\2\u0138"+
		"\u0139\t\b\2\2\u0139\u013a\5a\61\2\u013af\3\2\2\2\u013b\u013f\t\30\2\2"+
		"\u013c\u013e\t\31\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140h\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\t\32\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\65\2\2\u0148"+
		"j\3\2\2\2\t\2\u0125\u012d\u0130\u0136\u013f\u0145\3\3\65\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}