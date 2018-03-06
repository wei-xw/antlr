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
		RULE_insertClause = 7, RULE_columnlist = 8, RULE_column = 9, RULE_orderList = 10, 
		RULE_orderItem = 11, RULE_orderType = 12, RULE_allFields = 13, RULE_selectClause = 14, 
		RULE_fromClause = 15, RULE_join_type = 16, RULE_whereClause = 17, RULE_groupByClause = 18, 
		RULE_orderByClause = 19, RULE_tableSource = 20, RULE_database = 21, RULE_alias = 22, 
		RULE_tableName = 23, RULE_booleanExpression = 24, RULE_fieldExpression = 25, 
		RULE_methodExpression = 26, RULE_caseExpression = 27, RULE_elseClause = 28, 
		RULE_fieldName = 29, RULE_aggmethod = 30, RULE_operator = 31;
	public static final String[] ruleNames = {
		"prog", "dmlStatement", "insertStatement", "selectStatement", "unionQuery", 
		"selectQueryBlock", "selectAction", "insertClause", "columnlist", "column", 
		"orderList", "orderItem", "orderType", "allFields", "selectClause", "fromClause", 
		"join_type", "whereClause", "groupByClause", "orderByClause", "tableSource", 
		"database", "alias", "tableName", "booleanExpression", "fieldExpression", 
		"methodExpression", "caseExpression", "elseClause", "fieldName", "aggmethod", 
		"operator"
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
			setState(64);
			dmlStatement();
			setState(65);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				insertStatement();
				}
				break;
			case KW_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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
			setState(71);
			insertClause();
			setState(72);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				unionQuery();
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(75);
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
				setState(78);
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
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<FromClauseContext> fromClause() {
			return getRuleContexts(FromClauseContext.class);
		}
		public FromClauseContext fromClause(int i) {
			return getRuleContext(FromClauseContext.class,i);
		}
		public List<TerminalNode> KW_UNION() { return getTokens(sqlParser.KW_UNION); }
		public TerminalNode KW_UNION(int i) {
			return getToken(sqlParser.KW_UNION, i);
		}
		public List<WhereClauseContext> whereClause() {
			return getRuleContexts(WhereClauseContext.class);
		}
		public WhereClauseContext whereClause(int i) {
			return getRuleContext(WhereClauseContext.class,i);
		}
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
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
			{
			setState(81);
			selectClause();
			setState(82);
			fromClause();
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				{
				setState(83);
				whereClause();
				}
				break;
			case KW_GROUP:
				{
				setState(84);
				groupByClause();
				}
				break;
			case KW_UNION:
				break;
			default:
				break;
			}
			}
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(87);
					match(KW_UNION);
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_ALL) {
						{
						setState(88);
						match(KW_ALL);
						}
					}

					{
					setState(91);
					selectClause();
					setState(92);
					fromClause();
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(93);
						whereClause();
						}
						break;
					case 2:
						{
						setState(94);
						groupByClause();
						}
						break;
					}
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(101);
			selectClause();
			setState(102);
			fromClause();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					selectAction();
					}
					} 
				}
				setState(108);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				whereClause();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				groupByClause();
				}
				break;
			case KW_ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
		enterRule(_localctx, 14, RULE_insertClause);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(KW_INSERT);
				setState(115);
				match(KW_INTO);
				setState(116);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(KW_INSERT);
				setState(118);
				match(KW_INTO);
				setState(119);
				tableName();
				setState(120);
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
		enterRule(_localctx, 16, RULE_columnlist);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(LPAREN);
				setState(125);
				column();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(126);
					match(T__0);
					setState(127);
					column();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				column();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(136);
					match(T__0);
					setState(137);
					column();
					}
					}
					setState(142);
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
		enterRule(_localctx, 18, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			fieldExpression(0);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS || _la==IDENTIFIER) {
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(146);
					match(KW_AS);
					}
				}

				setState(149);
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
		enterRule(_localctx, 20, RULE_orderList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			orderItem();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(T__0);
					setState(154);
					orderItem();
					}
					} 
				}
				setState(159);
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
		enterRule(_localctx, 22, RULE_orderItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			fieldExpression(0);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(161);
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
		enterRule(_localctx, 24, RULE_orderType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 26, RULE_allFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 28, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(KW_SELECT);
			setState(169);
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
		enterRule(_localctx, 30, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(KW_FROM);
			setState(172);
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
		enterRule(_localctx, 32, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new TopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(KW_WHERE);
				setState(177);
				match(KW_ROWNUM);
				setState(178);
				operator();
				setState(179);
				match(INT);
				}
				break;
			case 2:
				_localctx = new WhereContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(KW_WHERE);
				setState(182);
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
		enterRule(_localctx, 36, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(KW_GROUP);
			setState(186);
			match(KW_BY);
			setState(187);
			fieldName();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(T__0);
					setState(189);
					fieldName();
					}
					} 
				}
				setState(194);
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
		enterRule(_localctx, 38, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(KW_ORDER);
			setState(196);
			match(KW_BY);
			setState(197);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_tableSource, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new SimpleTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200);
				tableName();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(201);
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
				setState(204);
				match(LPAREN);
				setState(205);
				selectStatement();
				setState(206);
				match(RPAREN);
				setState(207);
				alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
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
					setState(211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(218); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(212);
							join_type();
							setState(213);
							match(KW_JOIN);
							setState(214);
							tableSource(0);
							setState(215);
							match(KW_ON);
							setState(216);
							booleanExpression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(220); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(226);
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
		enterRule(_localctx, 42, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 44, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(sqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sqlParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 46, RULE_tableName);
		try {
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				database();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						match(T__1);
						setState(234);
						match(IDENTIFIER);
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(243);
				match(KW_NOT);
				setState(244);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				setState(245);
				fieldExpression(0);
				setState(246);
				operator();
				setState(247);
				fieldExpression(0);
				}
				break;
			case 3:
				{
				setState(249);
				match(LPAREN);
				setState(250);
				booleanExpression(0);
				setState(251);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(253);
				fieldExpression(0);
				setState(254);
				match(KW_IS);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(255);
					match(KW_NOT);
					}
				}

				setState(258);
				match(KW_NULL);
				}
				break;
			case 5:
				{
				setState(260);
				fieldExpression(0);
				setState(261);
				match(KW_IN);
				setState(262);
				selectStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(266);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(267);
						match(KW_AND);
						setState(268);
						booleanExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(269);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(270);
						match(KW_OR);
						setState(271);
						booleanExpression(7);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_fieldExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(278);
				caseExpression();
				}
				break;
			case 2:
				{
				setState(279);
				methodExpression();
				}
				break;
			case 3:
				{
				setState(280);
				match(LPAREN);
				setState(281);
				fieldExpression(0);
				setState(282);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(284);
				match(MINUS);
				setState(285);
				fieldExpression(3);
				}
				break;
			case 5:
				{
				setState(286);
				fieldName();
				}
				break;
			case 6:
				{
				setState(287);
				allFields();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(290);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(291);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						fieldExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(294);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						fieldExpression(5);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 52, RULE_methodExpression);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MAX:
			case KW_COUNT:
			case KW_SUM:
			case KW_AVG:
			case KW_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				aggmethod();
				setState(302);
				match(LPAREN);
				setState(303);
				fieldExpression(0);
				setState(304);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(IDENTIFIER);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(307);
					match(LPAREN);
					setState(308);
					fieldExpression(0);
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(309);
						match(T__0);
						setState(310);
						fieldExpression(0);
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(318);
					match(LPAREN);
					setState(319);
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
		enterRule(_localctx, 54, RULE_caseExpression);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(KW_CASE);
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(325);
					match(KW_WHEN);
					setState(326);
					booleanExpression(0);
					setState(327);
					match(KW_THEN);
					setState(328);
					fieldExpression(0);
					}
					}
					setState(332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(334);
					elseClause();
					}
				}

				setState(337);
				match(KW_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(KW_CASE);
				setState(340);
				fieldExpression(0);
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(341);
					match(KW_WHEN);
					setState(342);
					fieldExpression(0);
					setState(343);
					match(KW_THEN);
					setState(344);
					fieldExpression(0);
					}
					}
					setState(348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(350);
					elseClause();
					}
				}

				setState(353);
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
		enterRule(_localctx, 56, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(KW_ELSE);
			setState(358);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(sqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sqlParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 58, RULE_fieldName);
		try {
			int _alt;
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(IDENTIFIER);
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						match(T__1);
						setState(362);
						match(IDENTIFIER);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case INT:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
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
		enterRule(_localctx, 60, RULE_aggmethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 62, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		case 20:
			return tableSource_sempred((TableSourceContext)_localctx, predIndex);
		case 24:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u017c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\5\3\5\5\5O\n\5\3\5\5\5"+
		"R\n\5\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\5\6b"+
		"\n\6\6\6d\n\6\r\6\16\6e\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3"+
		"\b\5\bs\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0083\n\n\f\n\16\n\u0086\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n"+
		"\16\n\u0090\13\n\5\n\u0092\n\n\3\13\3\13\5\13\u0096\n\13\3\13\5\13\u0099"+
		"\n\13\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\5\r\u00a5"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ba\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u00cd\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d4\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\6\26\u00dd\n\26\r\26\16\26\u00de\7\26\u00e1"+
		"\n\26\f\26\16\26\u00e4\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7"+
		"\31\u00ee\n\31\f\31\16\31\u00f1\13\31\5\31\u00f3\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010b\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0113\n\32\f\32\16\32\u0116\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0123\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u012b\n\33\f\33\16\33\u012e\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u013a\n\34\f\34\16\34\u013d\13\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0143\n\34\5\34\u0145\n\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\6\35\u014d\n\35\r\35\16\35\u014e\3\35\5\35\u0152\n\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u015d\n\35\r\35\16\35\u015e"+
		"\3\35\5\35\u0162\n\35\3\35\3\35\5\35\u0166\n\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\7\37\u016e\n\37\f\37\16\37\u0171\13\37\3\37\3\37\3\37\5\37\u0176"+
		"\n\37\3 \3 \3!\3!\3!\2\5*\62\64\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\b\4\2\22\22\31\31\6\2\21\21\32\32$$&&"+
		"\4\2\n\n\64\65\3\2\62\63\3\2\13\17\3\2\5\t\2\u0191\2B\3\2\2\2\4G\3\2\2"+
		"\2\6I\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fg\3\2\2\2\16r\3\2\2\2\20|\3\2\2\2"+
		"\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u009a\3\2\2\2\30\u00a2\3\2\2\2\32"+
		"\u00a6\3\2\2\2\34\u00a8\3\2\2\2\36\u00aa\3\2\2\2 \u00ad\3\2\2\2\"\u00b0"+
		"\3\2\2\2$\u00b9\3\2\2\2&\u00bb\3\2\2\2(\u00c5\3\2\2\2*\u00d3\3\2\2\2,"+
		"\u00e5\3\2\2\2.\u00e7\3\2\2\2\60\u00f2\3\2\2\2\62\u010a\3\2\2\2\64\u0122"+
		"\3\2\2\2\66\u0144\3\2\2\28\u0165\3\2\2\2:\u0167\3\2\2\2<\u0175\3\2\2\2"+
		">\u0177\3\2\2\2@\u0179\3\2\2\2BC\5\4\3\2CD\7/\2\2D\3\3\2\2\2EH\5\6\4\2"+
		"FH\5\b\5\2GE\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\5\20\t\2JK\5\b\5\2K\7\3\2"+
		"\2\2LN\5\n\6\2MO\5(\25\2NM\3\2\2\2NO\3\2\2\2OR\3\2\2\2PR\5\f\7\2QL\3\2"+
		"\2\2QP\3\2\2\2R\t\3\2\2\2ST\5\36\20\2TW\5 \21\2UX\5$\23\2VX\5&\24\2WU"+
		"\3\2\2\2WV\3\2\2\2WX\3\2\2\2Xc\3\2\2\2Y[\7\37\2\2Z\\\7%\2\2[Z\3\2\2\2"+
		"[\\\3\2\2\2\\]\3\2\2\2]^\5\36\20\2^a\5 \21\2_b\5$\23\2`b\5&\24\2a_\3\2"+
		"\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2cY\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2f\13\3\2\2\2gh\5\36\20\2hl\5 \21\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2nl\3\2\2\2os\5$\23\2ps\5&\24\2qs\5(\25"+
		"\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\17\3\2\2\2tu\7\24\2\2uv\7\36\2\2v}\5"+
		"\60\31\2wx\7\24\2\2xy\7\36\2\2yz\5\60\31\2z{\5\22\n\2{}\3\2\2\2|t\3\2"+
		"\2\2|w\3\2\2\2}\21\3\2\2\2~\177\7\60\2\2\177\u0084\5\24\13\2\u0080\u0081"+
		"\7\3\2\2\u0081\u0083\5\24\13\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0092\3\2\2\2\u0089\u008e\5\24\13"+
		"\2\u008a\u008b\7\3\2\2\u008b\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091~\3\2\2\2\u0091\u0089\3\2\2\2\u0092\23\3"+
		"\2\2\2\u0093\u0098\5\64\33\2\u0094\u0096\7\26\2\2\u0095\u0094\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\5.\30\2\u0098\u0095"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u009f\5\30\r\2\u009b"+
		"\u009c\7\3\2\2\u009c\u009e\5\30\r\2\u009d\u009b\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\5\64\33\2\u00a3\u00a5\5\32\16\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7"+
		"\33\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\7!\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\37\3\2\2\2\u00ad\u00ae\7 \2\2\u00ae\u00af\5*\26"+
		"\2\u00af!\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1#\3\2\2\2\u00b2\u00b3\7\25"+
		"\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5\5@!\2\u00b5\u00b6\7\67\2\2\u00b6"+
		"\u00ba\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00ba\5\62\32\2\u00b9\u00b2"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba%\3\2\2\2\u00bb\u00bc\7\30\2\2\u00bc"+
		"\u00bd\7\20\2\2\u00bd\u00c2\5<\37\2\u00be\u00bf\7\3\2\2\u00bf\u00c1\5"+
		"<\37\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\23\2"+
		"\2\u00c6\u00c7\7\20\2\2\u00c7\u00c8\5\26\f\2\u00c8)\3\2\2\2\u00c9\u00ca"+
		"\b\26\1\2\u00ca\u00cc\5\60\31\2\u00cb\u00cd\5.\30\2\u00cc\u00cb\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf"+
		"\u00d0\5\b\5\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\5.\30\2\u00d2\u00d4\3"+
		"\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\u00e2\3\2\2\2\u00d5"+
		"\u00dc\f\3\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5"+
		"*\26\2\u00d9\u00da\7#\2\2\u00da\u00db\5\62\32\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3+\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e5\u00e6\7:\2\2\u00e6-\3\2\2\2\u00e7\u00e8\7:\2\2\u00e8/\3\2\2\2\u00e9"+
		"\u00f3\7:\2\2\u00ea\u00ef\5,\27\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee\7:\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5\b\32\1\2\u00f5\u00f6\7,\2"+
		"\2\u00f6\u010b\5\62\32\7\u00f7\u00f8\5\64\33\2\u00f8\u00f9\5@!\2\u00f9"+
		"\u00fa\5\64\33\2\u00fa\u010b\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd"+
		"\5\62\32\2\u00fd\u00fe\7\61\2\2\u00fe\u010b\3\2\2\2\u00ff\u0100\5\64\33"+
		"\2\u0100\u0102\7\35\2\2\u0101\u0103\7,\2\2\u0102\u0101\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\34\2\2\u0105\u010b\3\2\2\2"+
		"\u0106\u0107\5\64\33\2\u0107\u0108\7\33\2\2\u0108\u0109\5\b\5\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00f4\3\2\2\2\u010a\u00f7\3\2\2\2\u010a\u00fb\3\2"+
		"\2\2\u010a\u00ff\3\2\2\2\u010a\u0106\3\2\2\2\u010b\u0114\3\2\2\2\u010c"+
		"\u010d\f\t\2\2\u010d\u010e\7-\2\2\u010e\u0113\5\62\32\n\u010f\u0110\f"+
		"\b\2\2\u0110\u0111\7.\2\2\u0111\u0113\5\62\32\t\u0112\u010c\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\63\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\b\33\1\2\u0118\u0123"+
		"\58\35\2\u0119\u0123\5\66\34\2\u011a\u011b\7\60\2\2\u011b\u011c\5\64\33"+
		"\2\u011c\u011d\7\61\2\2\u011d\u0123\3\2\2\2\u011e\u011f\7\63\2\2\u011f"+
		"\u0123\5\64\33\5\u0120\u0123\5<\37\2\u0121\u0123\5\34\17\2\u0122\u0117"+
		"\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011e\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u012c\3\2\2\2\u0124\u0125\f\7"+
		"\2\2\u0125\u0126\t\4\2\2\u0126\u012b\5\64\33\b\u0127\u0128\f\6\2\2\u0128"+
		"\u0129\t\5\2\2\u0129\u012b\5\64\33\7\u012a\u0124\3\2\2\2\u012a\u0127\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\65\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\5> \2\u0130\u0131\7\60\2\2"+
		"\u0131\u0132\5\64\33\2\u0132\u0133\7\61\2\2\u0133\u0145\3\2\2\2\u0134"+
		"\u0142\7:\2\2\u0135\u0136\7\60\2\2\u0136\u013b\5\64\33\2\u0137\u0138\7"+
		"\3\2\2\u0138\u013a\5\64\33\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\7\61\2\2\u013f\u0143\3\2\2\2\u0140\u0141\7\60\2\2\u0141"+
		"\u0143\7\61\2\2\u0142\u0135\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3"+
		"\2\2\2\u0144\u012f\3\2\2\2\u0144\u0134\3\2\2\2\u0145\67\3\2\2\2\u0146"+
		"\u014c\7\'\2\2\u0147\u0148\7(\2\2\u0148\u0149\5\62\32\2\u0149\u014a\7"+
		")\2\2\u014a\u014b\5\64\33\2\u014b\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u0152\5:\36\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\7+\2\2\u0154\u0166\3\2\2\2\u0155\u0156\7\'"+
		"\2\2\u0156\u015c\5\64\33\2\u0157\u0158\7(\2\2\u0158\u0159\5\64\33\2\u0159"+
		"\u015a\7)\2\2\u015a\u015b\5\64\33\2\u015b\u015d\3\2\2\2\u015c\u0157\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u0162\5:\36\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7+\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0146\3\2\2\2\u0165\u0155\3\2\2\2\u01669\3\2\2\2\u0167\u0168\7*\2\2\u0168"+
		"\u0169\5\64\33\2\u0169;\3\2\2\2\u016a\u016f\7:\2\2\u016b\u016c\7\4\2\2"+
		"\u016c\u016e\7:\2\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0176\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0176\7\67\2\2\u0173\u0176\78\2\2\u0174\u0176\7\66\2\2\u0175\u016a\3"+
		"\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"=\3\2\2\2\u0177\u0178\t\6\2\2\u0178?\3\2\2\2\u0179\u017a\t\7\2\2\u017a"+
		"A\3\2\2\2,GNQW[aelr|\u0084\u008e\u0091\u0095\u0098\u009f\u00a4\u00b9\u00c2"+
		"\u00cc\u00d3\u00de\u00e2\u00ef\u00f2\u0102\u010a\u0112\u0114\u0122\u012a"+
		"\u012c\u013b\u0142\u0144\u014e\u0151\u015e\u0161\u0165\u016f\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}