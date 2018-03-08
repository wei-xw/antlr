// Generated from sql.g4 by ANTLR 4.7.1

package bonc.antlr4;
import bonc.antlr4.entity.*;
import java.util.HashSet;
import java.util.Set;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_dmlStatement = 1, RULE_insertStatement = 2, RULE_selectStatement = 3, 
		RULE_unionQuery = 4, RULE_selectQueryBlock = 5, RULE_selectAction = 6, 
		RULE_selectQueryBlock1 = 7, RULE_selectAction1 = 8, RULE_insertClause = 9, 
		RULE_columnlist = 10, RULE_column = 11, RULE_orderList = 12, RULE_orderItem = 13, 
		RULE_orderType = 14, RULE_allFields = 15, RULE_selectClause = 16, RULE_fromClause = 17, 
		RULE_join_type = 18, RULE_whereClause = 19, RULE_groupByClause = 20, RULE_orderByClause = 21, 
		RULE_tableSource = 22, RULE_database = 23, RULE_alias = 24, RULE_tableName = 25, 
		RULE_booleanExpression = 26, RULE_fieldExpression = 27, RULE_methodExpression = 28, 
		RULE_caseExpression = 29, RULE_elseClause = 30, RULE_fieldName = 31, RULE_aggmethod = 32, 
		RULE_operator = 33;
	public static final String[] ruleNames = {
		"prog", "dmlStatement", "insertStatement", "selectStatement", "unionQuery", 
		"selectQueryBlock", "selectAction", "selectQueryBlock1", "selectAction1", 
		"insertClause", "columnlist", "column", "orderList", "orderItem", "orderType", 
		"allFields", "selectClause", "fromClause", "join_type", "whereClause", 
		"groupByClause", "orderByClause", "tableSource", "database", "alias", 
		"tableName", "booleanExpression", "fieldExpression", "methodExpression", 
		"caseExpression", "elseClause", "fieldName", "aggmethod", "operator"
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

	@Override
	public String getGrammarFileName() { return "sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(sqlParser.SEMI, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			dmlStatement();
			setState(69);
			match(SEMI);
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

	public static class DmlStatementContext extends ParserRuleContext {
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitDmlStatement(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dmlStatement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				insertStatement();
				}
				break;
			case KW_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				selectStatement();
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

	public static class InsertStatementContext extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();;
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitInsertStatement(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			insertClause();
			setState(76);
			selectStatement();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	 
		public SelectStatementContext() { }
		public void copyFrom(SelectStatementContext ctx) {
			super.copyFrom(ctx);
			this.columnList = ctx.columnList;
		}
	}
	public static class SelectContext extends SelectStatementContext {
		public SelectQueryBlockContext selectQueryBlock() {
			return getRuleContext(SelectQueryBlockContext.class,0);
		}
		public SelectContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelect(this);
		}
	}
	public static class UnionContext extends SelectStatementContext {
		public UnionQueryContext unionQuery() {
			return getRuleContext(UnionQueryContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public UnionContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitUnion(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				unionQuery();
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(79);
					orderByClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				selectQueryBlock();
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

	public static class UnionQueryContext extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();;
		public List<SelectQueryBlock1Context> selectQueryBlock1() {
			return getRuleContexts(SelectQueryBlock1Context.class);
		}
		public SelectQueryBlock1Context selectQueryBlock1(int i) {
			return getRuleContext(SelectQueryBlock1Context.class,i);
		}
		public List<TerminalNode> KW_UNION() { return getTokens(sqlParser.KW_UNION); }
		public TerminalNode KW_UNION(int i) {
			return getToken(sqlParser.KW_UNION, i);
		}
		public List<TerminalNode> KW_ALL() { return getTokens(sqlParser.KW_ALL); }
		public TerminalNode KW_ALL(int i) {
			return getToken(sqlParser.KW_ALL, i);
		}
		public UnionQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterUnionQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitUnionQuery(this);
		}
	}

	public final UnionQueryContext unionQuery() throws RecognitionException {
		UnionQueryContext _localctx = new UnionQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unionQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			selectQueryBlock1();
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					match(KW_UNION);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_ALL) {
						{
						setState(87);
						match(KW_ALL);
						}
					}

					setState(90);
					selectQueryBlock1();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SelectQueryBlockContext extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();
		public Set<Column> columnSet = new HashSet<Column>();
		public void dd(){
		};
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<SelectActionContext> selectAction() {
			return getRuleContexts(SelectActionContext.class);
		}
		public SelectActionContext selectAction(int i) {
			return getRuleContext(SelectActionContext.class,i);
		}
		public SelectQueryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQueryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectQueryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectQueryBlock(this);
		}
	}

	public final SelectQueryBlockContext selectQueryBlock() throws RecognitionException {
		SelectQueryBlockContext _localctx = new SelectQueryBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectQueryBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			selectClause();
			setState(96);
			fromClause();
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					selectAction();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SelectActionContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SelectActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectAction(this);
		}
	}

	public final SelectActionContext selectAction() throws RecognitionException {
		SelectActionContext _localctx = new SelectActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectAction);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				whereClause();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				groupByClause();
				}
				break;
			case KW_ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				orderByClause();
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

	public static class SelectQueryBlock1Context extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();
		public Set<Column> columnSet = new HashSet<Column>();
		public void dd(){
		};
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<SelectAction1Context> selectAction1() {
			return getRuleContexts(SelectAction1Context.class);
		}
		public SelectAction1Context selectAction1(int i) {
			return getRuleContext(SelectAction1Context.class,i);
		}
		public SelectQueryBlock1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQueryBlock1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectQueryBlock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectQueryBlock1(this);
		}
	}

	public final SelectQueryBlock1Context selectQueryBlock1() throws RecognitionException {
		SelectQueryBlock1Context _localctx = new SelectQueryBlock1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectQueryBlock1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			selectClause();
			setState(109);
			fromClause();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					selectAction1();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class SelectAction1Context extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public SelectAction1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAction1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectAction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectAction1(this);
		}
	}

	public final SelectAction1Context selectAction1() throws RecognitionException {
		SelectAction1Context _localctx = new SelectAction1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectAction1);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				whereClause();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				groupByClause();
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

	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode KW_INSERT() { return getToken(sqlParser.KW_INSERT, 0); }
		public TerminalNode KW_INTO() { return getToken(sqlParser.KW_INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnlistContext columnlist() {
			return getRuleContext(ColumnlistContext.class,0);
		}
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterInsertClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitInsertClause(this);
		}
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertClause);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(KW_INSERT);
				setState(121);
				match(KW_INTO);
				setState(122);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(KW_INSERT);
				setState(124);
				match(KW_INTO);
				setState(125);
				tableName();
				setState(126);
				columnlist();
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

	public static class ColumnlistContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
		public ColumnlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterColumnlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitColumnlist(this);
		}
	}

	public final ColumnlistContext columnlist() throws RecognitionException {
		ColumnlistContext _localctx = new ColumnlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnlist);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(LPAREN);
				setState(131);
				column();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					setState(133);
					column();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				column();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(142);
					match(T__0);
					setState(143);
					column();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ColumnContext extends ParserRuleContext {
		public FieldExpressionContext fieldExpression() {
			return getRuleContext(FieldExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(sqlParser.KW_AS, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			fieldExpression(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS || _la==IDENTIFIER) {
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(152);
					match(KW_AS);
					}
				}

				setState(155);
				alias();
				}
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

	public static class OrderListContext extends ParserRuleContext {
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public OrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOrderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOrderList(this);
		}
	}

	public final OrderListContext orderList() throws RecognitionException {
		OrderListContext _localctx = new OrderListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			orderItem();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(T__0);
					setState(160);
					orderItem();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class OrderItemContext extends ParserRuleContext {
		public FieldExpressionContext fieldExpression() {
			return getRuleContext(FieldExpressionContext.class,0);
		}
		public OrderTypeContext orderType() {
			return getRuleContext(OrderTypeContext.class,0);
		}
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOrderItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOrderItem(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			fieldExpression(0);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(167);
				orderType();
				}
				break;
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

	public static class OrderTypeContext extends ParserRuleContext {
		public TerminalNode KW_ASC() { return getToken(sqlParser.KW_ASC, 0); }
		public TerminalNode KW_DESC() { return getToken(sqlParser.KW_DESC, 0); }
		public OrderTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOrderType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOrderType(this);
		}
	}

	public final OrderTypeContext orderType() throws RecognitionException {
		OrderTypeContext _localctx = new OrderTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==KW_DESC || _la==KW_ASC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AllFieldsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(sqlParser.STAR, 0); }
		public AllFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAllFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAllFields(this);
		}
	}

	public final AllFieldsContext allFields() throws RecognitionException {
		AllFieldsContext _localctx = new AllFieldsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_allFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(STAR);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode KW_SELECT() { return getToken(sqlParser.KW_SELECT, 0); }
		public ColumnlistContext columnlist() {
			return getRuleContext(ColumnlistContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectClause(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(KW_SELECT);
			setState(175);
			columnlist();
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(sqlParser.KW_FROM, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(KW_FROM);
			setState(178);
			tableSource(0);
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

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode KW_LEFT() { return getToken(sqlParser.KW_LEFT, 0); }
		public TerminalNode KW_INNER() { return getToken(sqlParser.KW_INNER, 0); }
		public TerminalNode KW_RIGHT() { return getToken(sqlParser.KW_RIGHT, 0); }
		public TerminalNode KW_FULL() { return getToken(sqlParser.KW_FULL, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitJoin_type(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_FULL) | (1L << KW_RIGHT) | (1L << KW_LEFT) | (1L << KW_INNER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	 
		public WhereClauseContext() { }
		public void copyFrom(WhereClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TopContext extends WhereClauseContext {
		public TerminalNode KW_WHERE() { return getToken(sqlParser.KW_WHERE, 0); }
		public TerminalNode KW_ROWNUM() { return getToken(sqlParser.KW_ROWNUM, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(sqlParser.INT, 0); }
		public TopContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTop(this);
		}
	}
	public static class WhereContext extends WhereClauseContext {
		public TerminalNode KW_WHERE() { return getToken(sqlParser.KW_WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitWhere(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new TopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(KW_WHERE);
				setState(183);
				match(KW_ROWNUM);
				setState(184);
				operator();
				setState(185);
				match(INT);
				}
				break;
			case 2:
				_localctx = new WhereContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(KW_WHERE);
				setState(188);
				booleanExpression(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode KW_GROUP() { return getToken(sqlParser.KW_GROUP, 0); }
		public TerminalNode KW_BY() { return getToken(sqlParser.KW_BY, 0); }
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KW_GROUP);
			setState(192);
			match(KW_BY);
			setState(193);
			fieldName();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(T__0);
					setState(195);
					fieldName();
					}
					} 
				}
				setState(200);
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
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode KW_ORDER() { return getToken(sqlParser.KW_ORDER, 0); }
		public TerminalNode KW_BY() { return getToken(sqlParser.KW_BY, 0); }
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(KW_ORDER);
			setState(202);
			match(KW_BY);
			setState(203);
			orderList();
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

	public static class TableSourceContext extends ParserRuleContext {
		public String uuid;
		public List<Column> columnList = new ArrayList<Column>();
		public String tableName;
		public String alias;
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	 
		public TableSourceContext() { }
		public void copyFrom(TableSourceContext ctx) {
			super.copyFrom(ctx);
			this.columnList = ctx.columnList;
		}
	}
	public static class SelectjoinContext extends TableSourceContext {
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}
		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class,i);
		}
		public List<Join_typeContext> join_type() {
			return getRuleContexts(Join_typeContext.class);
		}
		public Join_typeContext join_type(int i) {
			return getRuleContext(Join_typeContext.class,i);
		}
		public List<TerminalNode> KW_JOIN() { return getTokens(sqlParser.KW_JOIN); }
		public TerminalNode KW_JOIN(int i) {
			return getToken(sqlParser.KW_JOIN, i);
		}
		public List<TerminalNode> KW_ON() { return getTokens(sqlParser.KW_ON); }
		public TerminalNode KW_ON(int i) {
			return getToken(sqlParser.KW_ON, i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public SelectjoinContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectjoin(this);
		}
	}
	public static class SimpleTableContext extends TableSourceContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SimpleTableContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSimpleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSimpleTable(this);
		}
	}
	public static class SubSelectQueryContext extends TableSourceContext {
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubSelectQueryContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSubSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSubSelectQuery(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		return tableSource(0);
	}

	private TableSourceContext tableSource(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableSourceContext _localctx = new TableSourceContext(_ctx, _parentState);
		TableSourceContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_tableSource, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new SimpleTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				tableName();
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(207);
					alias();
					}
					break;
				}
				}
				break;
			case LPAREN:
				{
				_localctx = new SubSelectQueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(LPAREN);
				setState(211);
				selectStatement();
				setState(212);
				match(RPAREN);
				setState(213);
				alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectjoinContext(new TableSourceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableSource);
					setState(217);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(224); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(218);
							join_type();
							setState(219);
							match(KW_JOIN);
							setState(220);
							tableSource(0);
							setState(221);
							match(KW_ON);
							setState(222);
							booleanExpression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(226); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDENTIFIER);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENTIFIER);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableName);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				database();
				setState(239);
				match(T__1);
				setState(240);
				match(IDENTIFIER);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(sqlParser.KW_NOT, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
		public TerminalNode KW_IS() { return getToken(sqlParser.KW_IS, 0); }
		public TerminalNode KW_NULL() { return getToken(sqlParser.KW_NULL, 0); }
		public TerminalNode KW_IN() { return getToken(sqlParser.KW_IN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode KW_AND() { return getToken(sqlParser.KW_AND, 0); }
		public TerminalNode KW_OR() { return getToken(sqlParser.KW_OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(245);
				match(KW_NOT);
				setState(246);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				setState(247);
				fieldExpression(0);
				setState(248);
				operator();
				setState(249);
				fieldExpression(0);
				}
				break;
			case 3:
				{
				setState(251);
				match(LPAREN);
				setState(252);
				booleanExpression(0);
				setState(253);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(255);
				fieldExpression(0);
				setState(256);
				match(KW_IS);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(257);
					match(KW_NOT);
					}
				}

				setState(260);
				match(KW_NULL);
				}
				break;
			case 5:
				{
				setState(262);
				fieldExpression(0);
				setState(263);
				match(KW_IN);
				setState(264);
				selectStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(268);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(269);
						match(KW_AND);
						setState(270);
						booleanExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(271);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(272);
						match(KW_OR);
						setState(273);
						booleanExpression(7);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class FieldExpressionContext extends ParserRuleContext {
		public boolean isContainAggMethod;
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(sqlParser.MINUS, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public AllFieldsContext allFields() {
			return getRuleContext(AllFieldsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(sqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(sqlParser.PLUS, 0); }
		public FieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitFieldExpression(this);
		}
	}

	public final FieldExpressionContext fieldExpression() throws RecognitionException {
		return fieldExpression(0);
	}

	private FieldExpressionContext fieldExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldExpressionContext _localctx = new FieldExpressionContext(_ctx, _parentState);
		FieldExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_fieldExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(280);
				caseExpression();
				}
				break;
			case 2:
				{
				setState(281);
				methodExpression();
				}
				break;
			case 3:
				{
				setState(282);
				match(LPAREN);
				setState(283);
				fieldExpression(0);
				setState(284);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(286);
				match(MINUS);
				setState(287);
				fieldExpression(3);
				}
				break;
			case 5:
				{
				setState(288);
				fieldName();
				}
				break;
			case 6:
				{
				setState(289);
				allFields();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(292);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(293);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						fieldExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(295);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(296);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						fieldExpression(5);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class MethodExpressionContext extends ParserRuleContext {
		public AggmethodContext aggmethod() {
			return getRuleContext(AggmethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public MethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitMethodExpression(this);
		}
	}

	public final MethodExpressionContext methodExpression() throws RecognitionException {
		MethodExpressionContext _localctx = new MethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodExpression);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MAX:
			case KW_COUNT:
			case KW_SUM:
			case KW_AVG:
			case KW_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				aggmethod();
				setState(304);
				match(LPAREN);
				setState(305);
				fieldExpression(0);
				setState(306);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(IDENTIFIER);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(309);
					match(LPAREN);
					setState(310);
					fieldExpression(0);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(311);
						match(T__0);
						setState(312);
						fieldExpression(0);
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(318);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(320);
					match(LPAREN);
					setState(321);
					match(RPAREN);
					}
					break;
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CASE() { return getToken(sqlParser.KW_CASE, 0); }
		public TerminalNode KW_END() { return getToken(sqlParser.KW_END, 0); }
		public List<TerminalNode> KW_WHEN() { return getTokens(sqlParser.KW_WHEN); }
		public TerminalNode KW_WHEN(int i) {
			return getToken(sqlParser.KW_WHEN, i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(sqlParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(sqlParser.KW_THEN, i);
		}
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitCaseExpression(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseExpression);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(KW_CASE);
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(327);
					match(KW_WHEN);
					setState(328);
					booleanExpression(0);
					setState(329);
					match(KW_THEN);
					setState(330);
					fieldExpression(0);
					}
					}
					setState(334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(336);
					elseClause();
					}
				}

				setState(339);
				match(KW_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(KW_CASE);
				setState(342);
				fieldExpression(0);
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343);
					match(KW_WHEN);
					setState(344);
					fieldExpression(0);
					setState(345);
					match(KW_THEN);
					setState(346);
					fieldExpression(0);
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(352);
					elseClause();
					}
				}

				setState(355);
				match(KW_END);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(sqlParser.KW_ELSE, 0); }
		public FieldExpressionContext fieldExpression() {
			return getRuleContext(FieldExpressionContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(KW_ELSE);
			setState(360);
			fieldExpression(0);
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

	public static class FieldNameContext extends ParserRuleContext {
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
	 
		public FieldNameContext() { }
		public void copyFrom(FieldNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierFieldContext extends FieldNameContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public IdentifierFieldContext(FieldNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterIdentifierField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitIdentifierField(this);
		}
	}
	public static class DoubleFieldContext extends FieldNameContext {
		public TerminalNode DOUBLE() { return getToken(sqlParser.DOUBLE, 0); }
		public DoubleFieldContext(FieldNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterDoubleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitDoubleField(this);
		}
	}
	public static class StringFieldContext extends FieldNameContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public StringFieldContext(FieldNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterStringField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitStringField(this);
		}
	}
	public static class IntFieldContext extends FieldNameContext {
		public TerminalNode INT() { return getToken(sqlParser.INT, 0); }
		public IntFieldContext(FieldNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterIntField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitIntField(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldName);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				tableName();
				{
				setState(363);
				match(T__1);
				setState(364);
				match(IDENTIFIER);
				}
				}
				break;
			case INT:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(STRING);
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

	public static class AggmethodContext extends ParserRuleContext {
		public TerminalNode KW_COUNT() { return getToken(sqlParser.KW_COUNT, 0); }
		public TerminalNode KW_AVG() { return getToken(sqlParser.KW_AVG, 0); }
		public TerminalNode KW_MAX() { return getToken(sqlParser.KW_MAX, 0); }
		public TerminalNode KW_MIN() { return getToken(sqlParser.KW_MIN, 0); }
		public TerminalNode KW_SUM() { return getToken(sqlParser.KW_SUM, 0); }
		public AggmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggmethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAggmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAggmethod(this);
		}
	}

	public final AggmethodContext aggmethod() throws RecognitionException {
		AggmethodContext _localctx = new AggmethodContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aggmethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MAX) | (1L << KW_COUNT) | (1L << KW_SUM) | (1L << KW_AVG) | (1L << KW_MIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return tableSource_sempred((TableSourceContext)_localctx, predIndex);
		case 26:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 27:
			return fieldExpression_sempred((FieldExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tableSource_sempred(TableSourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean fieldExpression_sempred(FieldExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\5\3\5\5\5"+
		"S\n\5\3\5\5\5V\n\5\3\6\3\6\3\6\5\6[\n\6\3\6\6\6^\n\6\r\6\16\6_\3\7\3\7"+
		"\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\7\tr\n\t"+
		"\f\t\16\tu\13\t\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0083\n\13\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\5\f\u0098\n\f\3"+
		"\r\3\r\5\r\u009c\n\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\7\16\u00a4\n\16"+
		"\f\16\16\16\u00a7\13\16\3\17\3\17\5\17\u00ab\n\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00c0\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u00c7\n\26\f\26\16"+
		"\26\u00ca\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00d3\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00da\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\6\30\u00e3\n\30\r\30\16\30\u00e4\7\30\u00e7\n\30\f\30\16\30\u00ea\13"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00f5\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0105\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010d\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u0115\n\34\f\34\16\34\u0118\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0125\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u012d\n\35\f\35\16\35\u0130\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u013c\n\36\f\36\16\36\u013f"+
		"\13\36\3\36\3\36\3\36\3\36\5\36\u0145\n\36\5\36\u0147\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\6\37\u014f\n\37\r\37\16\37\u0150\3\37\5\37\u0154\n"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u015f\n\37\r\37"+
		"\16\37\u0160\3\37\5\37\u0164\n\37\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u0174\n!\3\"\3\"\3#\3#\3#\2\5.\668$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\4\2\22\22"+
		"\31\31\6\2\21\21\32\32$$&&\4\2\n\n\64\65\3\2\62\63\3\2\13\17\3\2\5\t\2"+
		"\u0189\2F\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fa\3\2\2"+
		"\2\16l\3\2\2\2\20n\3\2\2\2\22x\3\2\2\2\24\u0082\3\2\2\2\26\u0097\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u00a0\3\2\2\2\34\u00a8\3\2\2\2\36\u00ac\3\2\2\2"+
		" \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00b3\3\2\2\2&\u00b6\3\2\2\2(\u00bf\3"+
		"\2\2\2*\u00c1\3\2\2\2,\u00cb\3\2\2\2.\u00d9\3\2\2\2\60\u00eb\3\2\2\2\62"+
		"\u00ed\3\2\2\2\64\u00f4\3\2\2\2\66\u010c\3\2\2\28\u0124\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0167\3\2\2\2>\u0169\3\2\2\2@\u0173\3\2\2\2B\u0175\3\2\2\2D"+
		"\u0177\3\2\2\2FG\5\4\3\2GH\7/\2\2H\3\3\2\2\2IL\5\6\4\2JL\5\b\5\2KI\3\2"+
		"\2\2KJ\3\2\2\2L\5\3\2\2\2MN\5\24\13\2NO\5\b\5\2O\7\3\2\2\2PR\5\n\6\2Q"+
		"S\5,\27\2RQ\3\2\2\2RS\3\2\2\2SV\3\2\2\2TV\5\f\7\2UP\3\2\2\2UT\3\2\2\2"+
		"V\t\3\2\2\2W]\5\20\t\2XZ\7\37\2\2Y[\7%\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\^\5\20\t\2]X\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a"+
		"b\5\"\22\2bf\5$\23\2ce\5\16\b\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\r\3\2\2\2hf\3\2\2\2im\5(\25\2jm\5*\26\2km\5,\27\2li\3\2\2\2lj\3\2"+
		"\2\2lk\3\2\2\2m\17\3\2\2\2no\5\"\22\2os\5$\23\2pr\5\22\n\2qp\3\2\2\2r"+
		"u\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2\2us\3\2\2\2vy\5(\25\2wy\5*\26"+
		"\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\7\24\2\2{|\7\36\2\2|\u0083\5\64\33"+
		"\2}~\7\24\2\2~\177\7\36\2\2\177\u0080\5\64\33\2\u0080\u0081\5\26\f\2\u0081"+
		"\u0083\3\2\2\2\u0082z\3\2\2\2\u0082}\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\7\60\2\2\u0085\u008a\5\30\r\2\u0086\u0087\7\3\2\2\u0087\u0089\5\30\r"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\61\2\2"+
		"\u008e\u0098\3\2\2\2\u008f\u0094\5\30\r\2\u0090\u0091\7\3\2\2\u0091\u0093"+
		"\5\30\r\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0084"+
		"\3\2\2\2\u0097\u008f\3\2\2\2\u0098\27\3\2\2\2\u0099\u009e\58\35\2\u009a"+
		"\u009c\7\26\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009f\5\62\32\2\u009e\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\31\3\2\2\2\u00a0\u00a5\5\34\17\2\u00a1\u00a2\7\3\2\2\u00a2\u00a4\5\34"+
		"\17\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\58\35"+
		"\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\35\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\37\3\2\2\2\u00ae\u00af\7\n\2\2\u00af"+
		"!\3\2\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\5\26\f\2\u00b2#\3\2\2\2\u00b3"+
		"\u00b4\7 \2\2\u00b4\u00b5\5.\30\2\u00b5%\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7"+
		"\'\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb\5D#\2"+
		"\u00bb\u00bc\7\67\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00c0"+
		"\5\66\34\2\u00bf\u00b8\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0)\3\2\2\2\u00c1"+
		"\u00c2\7\30\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c8\5@!\2\u00c4\u00c5\7\3"+
		"\2\2\u00c5\u00c7\5@!\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7\23\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\5\32\16\2\u00ce-\3\2"+
		"\2\2\u00cf\u00d0\b\30\1\2\u00d0\u00d2\5\64\33\2\u00d1\u00d3\5\62\32\2"+
		"\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d5"+
		"\7\60\2\2\u00d5\u00d6\5\b\5\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\5\62\32"+
		"\2\u00d8\u00da\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\u00e8"+
		"\3\2\2\2\u00db\u00e2\f\3\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7\"\2\2\u00de"+
		"\u00df\5.\30\2\u00df\u00e0\7#\2\2\u00e0\u00e1\5\66\34\2\u00e1\u00e3\3"+
		"\2\2\2\u00e2\u00dc\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00db\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\7:\2\2\u00ec\61\3\2\2\2\u00ed\u00ee\7:\2\2\u00ee"+
		"\63\3\2\2\2\u00ef\u00f5\7:\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7\4\2"+
		"\2\u00f2\u00f3\7:\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0"+
		"\3\2\2\2\u00f5\65\3\2\2\2\u00f6\u00f7\b\34\1\2\u00f7\u00f8\7,\2\2\u00f8"+
		"\u010d\5\66\34\7\u00f9\u00fa\58\35\2\u00fa\u00fb\5D#\2\u00fb\u00fc\58"+
		"\35\2\u00fc\u010d\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\5\66\34\2\u00ff"+
		"\u0100\7\61\2\2\u0100\u010d\3\2\2\2\u0101\u0102\58\35\2\u0102\u0104\7"+
		"\35\2\2\u0103\u0105\7,\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7\34\2\2\u0107\u010d\3\2\2\2\u0108\u0109\5"+
		"8\35\2\u0109\u010a\7\33\2\2\u010a\u010b\5\b\5\2\u010b\u010d\3\2\2\2\u010c"+
		"\u00f6\3\2\2\2\u010c\u00f9\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0101\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010d\u0116\3\2\2\2\u010e\u010f\f\t\2\2\u010f"+
		"\u0110\7-\2\2\u0110\u0115\5\66\34\n\u0111\u0112\f\b\2\2\u0112\u0113\7"+
		".\2\2\u0113\u0115\5\66\34\t\u0114\u010e\3\2\2\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\67\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011a\b\35\1\2\u011a\u0125\5<\37\2\u011b"+
		"\u0125\5:\36\2\u011c\u011d\7\60\2\2\u011d\u011e\58\35\2\u011e\u011f\7"+
		"\61\2\2\u011f\u0125\3\2\2\2\u0120\u0121\7\63\2\2\u0121\u0125\58\35\5\u0122"+
		"\u0125\5@!\2\u0123\u0125\5 \21\2\u0124\u0119\3\2\2\2\u0124\u011b\3\2\2"+
		"\2\u0124\u011c\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\u012e\3\2\2\2\u0126\u0127\f\7\2\2\u0127\u0128\t\4\2\2\u0128"+
		"\u012d\58\35\b\u0129\u012a\f\6\2\2\u012a\u012b\t\5\2\2\u012b\u012d\58"+
		"\35\7\u012c\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f9\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0131\u0132\5B\"\2\u0132\u0133\7\60\2\2\u0133\u0134\58\35\2\u0134\u0135"+
		"\7\61\2\2\u0135\u0147\3\2\2\2\u0136\u0144\7:\2\2\u0137\u0138\7\60\2\2"+
		"\u0138\u013d\58\35\2\u0139\u013a\7\3\2\2\u013a\u013c\58\35\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0145\3"+
		"\2\2\2\u0142\u0143\7\60\2\2\u0143\u0145\7\61\2\2\u0144\u0137\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0131\3\2\2\2\u0146\u0136\3\2"+
		"\2\2\u0147;\3\2\2\2\u0148\u014e\7\'\2\2\u0149\u014a\7(\2\2\u014a\u014b"+
		"\5\66\34\2\u014b\u014c\7)\2\2\u014c\u014d\58\35\2\u014d\u014f\3\2\2\2"+
		"\u014e\u0149\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\5> \2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7+\2\2\u0156\u0168\3\2"+
		"\2\2\u0157\u0158\7\'\2\2\u0158\u015e\58\35\2\u0159\u015a\7(\2\2\u015a"+
		"\u015b\58\35\2\u015b\u015c\7)\2\2\u015c\u015d\58\35\2\u015d\u015f\3\2"+
		"\2\2\u015e\u0159\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\5> \2\u0163\u0162\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7+\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0148\3\2\2\2\u0167\u0157\3\2\2\2\u0168=\3\2\2\2\u0169"+
		"\u016a\7*\2\2\u016a\u016b\58\35\2\u016b?\3\2\2\2\u016c\u016d\5\64\33\2"+
		"\u016d\u016e\7\4\2\2\u016e\u016f\7:\2\2\u016f\u0174\3\2\2\2\u0170\u0174"+
		"\7\67\2\2\u0171\u0174\78\2\2\u0172\u0174\7\66\2\2\u0173\u016c\3\2\2\2"+
		"\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174A\3"+
		"\2\2\2\u0175\u0176\t\6\2\2\u0176C\3\2\2\2\u0177\u0178\t\7\2\2\u0178E\3"+
		"\2\2\2*KRUZ_flsx\u0082\u008a\u0094\u0097\u009b\u009e\u00a5\u00aa\u00bf"+
		"\u00c8\u00d2\u00d9\u00e4\u00e8\u00f4\u0104\u010c\u0114\u0116\u0124\u012c"+
		"\u012e\u013d\u0144\u0146\u0150\u0153\u0160\u0163\u0167\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}