// Generated from sql.g4 by ANTLR 4.7.1

package bonc.antlr4;
import bonc.antlr4.entity.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, STAR=8, KW_BY=9, 
		KW_FULL=10, KW_DESC=11, KW_ORDER=12, KW_INSERT=13, KW_WHERE=14, KW_AS=15, 
		KW_ROWNUM=16, KW_GROUP=17, KW_ASC=18, KW_RIGHT=19, KW_IN=20, KW_NULL=21, 
		KW_IS=22, KW_INTO=23, KW_UNION=24, KW_FROM=25, KW_SELECT=26, KW_JOIN=27, 
		KW_ON=28, KW_LEFT=29, KW_ALL=30, KW_INNER=31, KW_CASE=32, KW_WHEN=33, 
		KW_THEN=34, KW_ELSE=35, KW_END=36, KW_NOT=37, KW_AND=38, KW_OR=39, SEMI=40, 
		LPAREN=41, RPAREN=42, PLUS=43, MINUS=44, DIV=45, MOD=46, STRING=47, INT=48, 
		DOUBLE=49, EXPONENT=50, IDENTIFIER=51, WS=52;
	public static final int
		RULE_prog = 0, RULE_dmlStatement = 1, RULE_insertStatement = 2, RULE_selectStatement = 3, 
		RULE_unionQuery = 4, RULE_selectQueryBlock = 5, RULE_selectAction = 6, 
		RULE_insertClause = 7, RULE_columnlist = 8, RULE_column = 9, RULE_orderList = 10, 
		RULE_orderItem = 11, RULE_orderType = 12, RULE_allFields = 13, RULE_selectClause = 14, 
		RULE_fromClause = 15, RULE_join_type = 16, RULE_whereClause = 17, RULE_groupByClause = 18, 
		RULE_orderByClause = 19, RULE_tableSource = 20, RULE_database = 21, RULE_alias = 22, 
		RULE_tableName = 23, RULE_booleanExpression = 24, RULE_fieldExpression = 25, 
		RULE_methodExpression = 26, RULE_caseExpression = 27, RULE_elseClause = 28, 
		RULE_fieldName = 29, RULE_operator = 30;
	public static final String[] ruleNames = {
		"prog", "dmlStatement", "insertStatement", "selectStatement", "unionQuery", 
		"selectQueryBlock", "selectAction", "insertClause", "columnlist", "column", 
		"orderList", "orderItem", "orderType", "allFields", "selectClause", "fromClause", 
		"join_type", "whereClause", "groupByClause", "orderByClause", "tableSource", 
		"database", "alias", "tableName", "booleanExpression", "fieldExpression", 
		"methodExpression", "caseExpression", "elseClause", "fieldName", "operator"
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
			setState(62);
			dmlStatement();
			setState(63);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				insertStatement();
				}
				break;
			case KW_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(69);
			insertClause();
			setState(70);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				unionQuery();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(73);
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
				setState(76);
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
		public List<SelectQueryBlockContext> selectQueryBlock() {
			return getRuleContexts(SelectQueryBlockContext.class);
		}
		public SelectQueryBlockContext selectQueryBlock(int i) {
			return getRuleContext(SelectQueryBlockContext.class,i);
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
			setState(79);
			selectQueryBlock();
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					match(KW_UNION);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_ALL) {
						{
						setState(81);
						match(KW_ALL);
						}
					}

					setState(84);
					selectQueryBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
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
			setState(89);
			selectClause();
			setState(90);
			fromClause();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					selectAction();
					}
					} 
				}
				setState(96);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				whereClause();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				groupByClause();
				}
				break;
			case KW_ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(KW_INSERT);
				setState(103);
				match(KW_INTO);
				setState(104);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(KW_INSERT);
				setState(106);
				match(KW_INTO);
				setState(107);
				tableName();
				setState(108);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(LPAREN);
				setState(113);
				column();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(114);
					match(T__0);
					setState(115);
					column();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				column();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(124);
					match(T__0);
					setState(125);
					column();
					}
					}
					setState(130);
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
			setState(133);
			fieldExpression(0);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS || _la==IDENTIFIER) {
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(134);
					match(KW_AS);
					}
				}

				setState(137);
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
			setState(140);
			orderItem();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(T__0);
					setState(142);
					orderItem();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(148);
			fieldExpression(0);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(149);
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
			setState(152);
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
			setState(154);
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
			setState(156);
			match(KW_SELECT);
			setState(157);
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
			setState(159);
			match(KW_FROM);
			setState(160);
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
			setState(162);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new TopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(KW_WHERE);
				setState(165);
				match(KW_ROWNUM);
				setState(166);
				operator();
				setState(167);
				match(INT);
				}
				break;
			case 2:
				_localctx = new WhereContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(KW_WHERE);
				setState(170);
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
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(KW_GROUP);
			setState(174);
			match(KW_BY);
			setState(175);
			fieldName();
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
			setState(177);
			match(KW_ORDER);
			setState(178);
			match(KW_BY);
			setState(179);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new SimpleTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				tableName();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(183);
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
				setState(186);
				match(LPAREN);
				setState(187);
				selectStatement();
				setState(188);
				match(RPAREN);
				setState(189);
				alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectjoinContext(new TableSourceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableSource);
					setState(193);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(200); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(194);
							join_type();
							setState(195);
							match(KW_JOIN);
							setState(196);
							tableSource(0);
							setState(197);
							match(KW_ON);
							setState(198);
							booleanExpression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(202); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(209);
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
			setState(211);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				database();
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						match(T__1);
						setState(216);
						match(IDENTIFIER);
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(225);
				match(KW_NOT);
				setState(226);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				setState(227);
				fieldExpression(0);
				setState(228);
				operator();
				setState(229);
				fieldExpression(0);
				}
				break;
			case 3:
				{
				setState(231);
				match(LPAREN);
				setState(232);
				booleanExpression(0);
				setState(233);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(235);
				fieldExpression(0);
				setState(236);
				match(KW_IS);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(237);
					match(KW_NOT);
					}
				}

				setState(240);
				match(KW_NULL);
				}
				break;
			case 5:
				{
				setState(242);
				fieldExpression(0);
				setState(243);
				match(KW_IN);
				setState(244);
				selectStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(249);
						match(KW_AND);
						setState(250);
						booleanExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						match(KW_OR);
						setState(253);
						booleanExpression(7);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(260);
				caseExpression();
				}
				break;
			case 2:
				{
				setState(261);
				methodExpression();
				}
				break;
			case 3:
				{
				setState(262);
				match(LPAREN);
				setState(263);
				fieldExpression(0);
				setState(264);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(266);
				match(MINUS);
				setState(267);
				fieldExpression(3);
				}
				break;
			case 5:
				{
				setState(268);
				fieldName();
				}
				break;
			case 6:
				{
				setState(269);
				allFields();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(272);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(273);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						fieldExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new FieldExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldExpression);
						setState(275);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(276);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						fieldExpression(5);
						}
						break;
					}
					} 
				}
				setState(282);
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

	public static class MethodExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(sqlParser.LPAREN, 0); }
		public List<FieldExpressionContext> fieldExpression() {
			return getRuleContexts(FieldExpressionContext.class);
		}
		public FieldExpressionContext fieldExpression(int i) {
			return getRuleContext(FieldExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParser.RPAREN, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IDENTIFIER);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(284);
				match(LPAREN);
				setState(285);
				fieldExpression(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(286);
					match(T__0);
					setState(287);
					fieldExpression(0);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(295);
				match(LPAREN);
				setState(296);
				match(RPAREN);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(KW_CASE);
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					match(KW_WHEN);
					setState(301);
					booleanExpression(0);
					setState(302);
					match(KW_THEN);
					setState(303);
					fieldExpression(0);
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(309);
					elseClause();
					}
				}

				setState(312);
				match(KW_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(KW_CASE);
				setState(315);
				fieldExpression(0);
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					match(KW_WHEN);
					setState(317);
					fieldExpression(0);
					setState(318);
					match(KW_THEN);
					setState(319);
					fieldExpression(0);
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(325);
					elseClause();
					}
				}

				setState(328);
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
			setState(332);
			match(KW_ELSE);
			setState(333);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(IDENTIFIER);
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						match(T__1);
						setState(337);
						match(IDENTIFIER);
						}
						} 
					}
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case INT:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
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
		enterRule(_localctx, 60, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0161\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\5\3\5\5\5M\n\5\3\5\5\5P\n\5\3"+
		"\6\3\6\3\6\5\6U\n\6\3\6\6\6X\n\6\r\6\16\6Y\3\7\3\7\3\7\7\7_\n\7\f\7\16"+
		"\7b\13\7\3\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t"+
		"\3\n\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\5\n\u0086\n\n\3\13\3\13\5\13\u008a\n\13\3\13"+
		"\5\13\u008d\n\13\3\f\3\f\3\f\7\f\u0092\n\f\f\f\16\f\u0095\13\f\3\r\3\r"+
		"\5\r\u0099\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ae\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00bb\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00c2\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00cb"+
		"\n\26\r\26\16\26\u00cc\7\26\u00cf\n\26\f\26\16\26\u00d2\13\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00dc\n\31\f\31\16\31\u00df\13\31"+
		"\5\31\u00e1\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00f1\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0101\n\32\f\32\16\32\u0104\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0111"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0119\n\33\f\33\16\33\u011c\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\7\34\u0123\n\34\f\34\16\34\u0126\13\34\3"+
		"\34\3\34\3\34\3\34\5\34\u012c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\6\35"+
		"\u0134\n\35\r\35\16\35\u0135\3\35\5\35\u0139\n\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\6\35\u0144\n\35\r\35\16\35\u0145\3\35\5\35\u0149"+
		"\n\35\3\35\3\35\5\35\u014d\n\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0155"+
		"\n\37\f\37\16\37\u0158\13\37\3\37\3\37\3\37\5\37\u015d\n\37\3 \3 \3 \2"+
		"\5*\62\64!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>\2\7\4\2\r\r\24\24\6\2\f\f\25\25\37\37!!\4\2\n\n/\60\3\2-.\3\2\5\t"+
		"\2\u0171\2@\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\f[\3\2"+
		"\2\2\16f\3\2\2\2\20p\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u0096\3\2\2\2\32\u009a\3\2\2\2\34\u009c\3\2\2\2\36\u009e\3"+
		"\2\2\2 \u00a1\3\2\2\2\"\u00a4\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b3"+
		"\3\2\2\2*\u00c1\3\2\2\2,\u00d3\3\2\2\2.\u00d5\3\2\2\2\60\u00e0\3\2\2\2"+
		"\62\u00f8\3\2\2\2\64\u0110\3\2\2\2\66\u011d\3\2\2\28\u014c\3\2\2\2:\u014e"+
		"\3\2\2\2<\u015c\3\2\2\2>\u015e\3\2\2\2@A\5\4\3\2AB\7*\2\2B\3\3\2\2\2C"+
		"F\5\6\4\2DF\5\b\5\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\5\20\t\2HI\5\b\5"+
		"\2I\7\3\2\2\2JL\5\n\6\2KM\5(\25\2LK\3\2\2\2LM\3\2\2\2MP\3\2\2\2NP\5\f"+
		"\7\2OJ\3\2\2\2ON\3\2\2\2P\t\3\2\2\2QW\5\f\7\2RT\7\32\2\2SU\7 \2\2TS\3"+
		"\2\2\2TU\3\2\2\2UV\3\2\2\2VX\5\f\7\2WR\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\13\3\2\2\2[\\\5\36\20\2\\`\5 \21\2]_\5\16\b\2^]\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2b`\3\2\2\2cg\5$\23\2dg\5&\24\2eg\5"+
		"(\25\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\17\3\2\2\2hi\7\17\2\2ij\7\31\2\2"+
		"jq\5\60\31\2kl\7\17\2\2lm\7\31\2\2mn\5\60\31\2no\5\22\n\2oq\3\2\2\2ph"+
		"\3\2\2\2pk\3\2\2\2q\21\3\2\2\2rs\7+\2\2sx\5\24\13\2tu\7\3\2\2uw\5\24\13"+
		"\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7,\2"+
		"\2|\u0086\3\2\2\2}\u0082\5\24\13\2~\177\7\3\2\2\177\u0081\5\24\13\2\u0080"+
		"~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085r\3\2\2\2\u0085}\3\2\2\2"+
		"\u0086\23\3\2\2\2\u0087\u008c\5\64\33\2\u0088\u008a\7\21\2\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5.\30\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u0093\5\30\r"+
		"\2\u008f\u0090\7\3\2\2\u0090\u0092\5\30\r\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0098\5\64\33\2\u0097\u0099\5\32\16\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\31\3\2\2\2\u009a\u009b\t\2\2"+
		"\2\u009b\33\3\2\2\2\u009c\u009d\7\n\2\2\u009d\35\3\2\2\2\u009e\u009f\7"+
		"\34\2\2\u009f\u00a0\5\22\n\2\u00a0\37\3\2\2\2\u00a1\u00a2\7\33\2\2\u00a2"+
		"\u00a3\5*\26\2\u00a3!\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5#\3\2\2\2\u00a6"+
		"\u00a7\7\20\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\5> \2\u00a9\u00aa\7\62"+
		"\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ae\5\62\32\2\u00ad"+
		"\u00a6\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\23\2\2"+
		"\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5<\37\2\u00b2\'\3\2\2\2\u00b3\u00b4"+
		"\7\16\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\5\26\f\2\u00b6)\3\2\2\2\u00b7"+
		"\u00b8\b\26\1\2\u00b8\u00ba\5\60\31\2\u00b9\u00bb\5.\30\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd"+
		"\u00be\5\b\5\2\u00be\u00bf\7,\2\2\u00bf\u00c0\5.\30\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00d0\3\2\2\2\u00c3"+
		"\u00ca\f\3\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\5"+
		"*\26\2\u00c7\u00c8\7\36\2\2\u00c8\u00c9\5\62\32\2\u00c9\u00cb\3\2\2\2"+
		"\u00ca\u00c4\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c3\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d3\u00d4\7\65\2\2\u00d4-\3\2\2\2\u00d5\u00d6\7\65\2\2\u00d6/\3\2\2"+
		"\2\u00d7\u00e1\7\65\2\2\u00d8\u00dd\5,\27\2\u00d9\u00da\7\4\2\2\u00da"+
		"\u00dc\7\65\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00d7\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1\61\3\2\2\2\u00e2\u00e3\b\32\1"+
		"\2\u00e3\u00e4\7\'\2\2\u00e4\u00f9\5\62\32\7\u00e5\u00e6\5\64\33\2\u00e6"+
		"\u00e7\5> \2\u00e7\u00e8\5\64\33\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\7+"+
		"\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\7,\2\2\u00ec\u00f9\3\2\2\2\u00ed"+
		"\u00ee\5\64\33\2\u00ee\u00f0\7\30\2\2\u00ef\u00f1\7\'\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\27\2\2"+
		"\u00f3\u00f9\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\7\26\2\2\u00f6"+
		"\u00f7\5\b\5\2\u00f7\u00f9\3\2\2\2\u00f8\u00e2\3\2\2\2\u00f8\u00e5\3\2"+
		"\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9"+
		"\u0102\3\2\2\2\u00fa\u00fb\f\t\2\2\u00fb\u00fc\7(\2\2\u00fc\u0101\5\62"+
		"\32\n\u00fd\u00fe\f\b\2\2\u00fe\u00ff\7)\2\2\u00ff\u0101\5\62\32\t\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\63\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\b\33\1\2\u0106\u0111\58\35\2\u0107\u0111\5\66\34\2\u0108\u0109\7+\2\2"+
		"\u0109\u010a\5\64\33\2\u010a\u010b\7,\2\2\u010b\u0111\3\2\2\2\u010c\u010d"+
		"\7.\2\2\u010d\u0111\5\64\33\5\u010e\u0111\5<\37\2\u010f\u0111\5\34\17"+
		"\2\u0110\u0105\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010c"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u011a\3\2\2\2\u0112"+
		"\u0113\f\7\2\2\u0113\u0114\t\4\2\2\u0114\u0119\5\64\33\b\u0115\u0116\f"+
		"\6\2\2\u0116\u0117\t\5\2\2\u0117\u0119\5\64\33\7\u0118\u0112\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\65\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u012b\7\65\2\2\u011e\u011f"+
		"\7+\2\2\u011f\u0124\5\64\33\2\u0120\u0121\7\3\2\2\u0121\u0123\5\64\33"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7,\2\2\u0128"+
		"\u012c\3\2\2\2\u0129\u012a\7+\2\2\u012a\u012c\7,\2\2\u012b\u011e\3\2\2"+
		"\2\u012b\u0129\3\2\2\2\u012c\67\3\2\2\2\u012d\u0133\7\"\2\2\u012e\u012f"+
		"\7#\2\2\u012f\u0130\5\62\32\2\u0130\u0131\7$\2\2\u0131\u0132\5\64\33\2"+
		"\u0132\u0134\3\2\2\2\u0133\u012e\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5:\36\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7&"+
		"\2\2\u013b\u014d\3\2\2\2\u013c\u013d\7\"\2\2\u013d\u0143\5\64\33\2\u013e"+
		"\u013f\7#\2\2\u013f\u0140\5\64\33\2\u0140\u0141\7$\2\2\u0141\u0142\5\64"+
		"\33\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\5:"+
		"\36\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7&\2\2\u014b\u014d\3\2\2\2\u014c\u012d\3\2\2\2\u014c\u013c\3\2"+
		"\2\2\u014d9\3\2\2\2\u014e\u014f\7%\2\2\u014f\u0150\5\64\33\2\u0150;\3"+
		"\2\2\2\u0151\u0156\7\65\2\2\u0152\u0153\7\4\2\2\u0153\u0155\7\65\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u015d\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015d\7\62\2\2\u015a"+
		"\u015d\7\63\2\2\u015b\u015d\7\61\2\2\u015c\u0151\3\2\2\2\u015c\u0159\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d=\3\2\2\2\u015e\u015f"+
		"\t\6\2\2\u015f?\3\2\2\2(ELOTY`fpx\u0082\u0085\u0089\u008c\u0093\u0098"+
		"\u00ad\u00ba\u00c1\u00cc\u00d0\u00dd\u00e0\u00f0\u00f8\u0100\u0102\u0110"+
		"\u0118\u011a\u0124\u012b\u0135\u0138\u0145\u0148\u014c\u0156\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}