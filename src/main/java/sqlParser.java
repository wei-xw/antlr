
// Generated from sql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class sqlParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, STAR = 9,
			KW_ROWNUM = 10, KW_TRUE = 11, KW_FALSE = 12, KW_ALL = 13, KW_NONE = 14, KW_AND = 15, KW_OR = 16,
			KW_NOT = 17, KW_LIKE = 18, KW_IF = 19, KW_EXISTS = 20, KW_ASC = 21, KW_DESC = 22, KW_NULLS = 23,
			KW_LAST = 24, KW_ORDER = 25, KW_GROUP = 26, KW_BY = 27, KW_HAVING = 28, KW_WHERE = 29, KW_FROM = 30,
			KW_AS = 31, KW_SELECT = 32, KW_DISTINCT = 33, KW_INSERT = 34, KW_OVERWRITE = 35, KW_OUTER = 36,
			KW_UNIQUEJOIN = 37, KW_PRESERVE = 38, KW_JOIN = 39, KW_LEFT = 40, KW_RIGHT = 41, KW_FULL = 42, KW_ON = 43,
			KW_PARTITION = 44, KW_PARTITIONS = 45, KW_TABLE = 46, KW_TABLES = 47, KW_COLUMNS = 48, KW_INDEX = 49,
			KW_INDEXES = 50, KW_REBUILD = 51, KW_FUNCTIONS = 52, KW_SHOW = 53, KW_MSCK = 54, KW_REPAIR = 55,
			KW_DIRECTORY = 56, KW_LOCAL = 57, KW_TRANSFORM = 58, KW_USING = 59, KW_CLUSTER = 60, KW_DISTRIBUTE = 61,
			KW_SORT = 62, KW_UNION = 63, KW_EXCEPT = 64, KW_LOAD = 65, KW_EXPORT = 66, KW_IMPORT = 67,
			KW_REPLICATION = 68, KW_METADATA = 69, KW_DATA = 70, KW_INPATH = 71, KW_IS = 72, KW_NULL = 73,
			KW_CREATE = 74, KW_EXTERNAL = 75, KW_ALTER = 76, KW_CHANGE = 77, KW_COLUMN = 78, KW_FIRST = 79,
			KW_AFTER = 80, KW_DESCRIBE = 81, KW_DROP = 82, KW_RENAME = 83, KW_TO = 84, KW_COMMENT = 85, KW_BOOLEAN = 86,
			KW_TINYINT = 87, KW_SMALLINT = 88, KW_INT = 89, KW_BIGINT = 90, KW_FLOAT = 91, KW_DOUBLE = 92,
			KW_PRECISION = 93, KW_DATE = 94, KW_DATETIME = 95, KW_TIMESTAMP = 96, KW_INTERVAL = 97, KW_DECIMAL = 98,
			KW_STRING = 99, KW_CHAR = 100, KW_VARCHAR = 101, KW_ARRAY = 102, KW_STRUCT = 103, KW_MAP = 104,
			KW_UNIONTYPE = 105, KW_REDUCE = 106, KW_PARTITIONED = 107, KW_CLUSTERED = 108, KW_SORTED = 109,
			KW_INTO = 110, KW_BUCKETS = 111, KW_ROW = 112, KW_ROWS = 113, KW_FORMAT = 114, KW_DELIMITED = 115,
			KW_FIELDS = 116, KW_TERMINATED = 117, KW_ESCAPED = 118, KW_COLLECTION = 119, KW_ITEMS = 120, KW_KEYS = 121,
			KW_KEY_TYPE = 122, KW_LINES = 123, KW_STORED = 124, KW_FILEFORMAT = 125, KW_INPUTFORMAT = 126,
			KW_OUTPUTFORMAT = 127, KW_INPUTDRIVER = 128, KW_OUTPUTDRIVER = 129, KW_ENABLE = 130, KW_DISABLE = 131,
			KW_LOCATION = 132, KW_TABLESAMPLE = 133, KW_BUCKET = 134, KW_OUT = 135, KW_OF = 136, KW_PERCENT = 137,
			KW_CAST = 138, KW_ADD = 139, KW_REPLACE = 140, KW_RLIKE = 141, KW_REGEXP = 142, KW_TEMPORARY = 143,
			KW_FUNCTION = 144, KW_MACRO = 145, KW_FILE = 146, KW_JAR = 147, KW_EXPLAIN = 148, KW_EXTENDED = 149,
			KW_FORMATTED = 150, KW_PRETTY = 151, KW_DEPENDENCY = 152, KW_LOGICAL = 153, KW_SERDE = 154, KW_WITH = 155,
			KW_DEFERRED = 156, KW_SERDEPROPERTIES = 157, KW_DBPROPERTIES = 158, KW_LIMIT = 159, KW_OFFSET = 160,
			KW_SET = 161, KW_UNSET = 162, KW_TBLPROPERTIES = 163, KW_IDXPROPERTIES = 164, KW_VALUE_TYPE = 165,
			KW_ELEM_TYPE = 166, KW_DEFINED = 167, KW_CASE = 168, KW_WHEN = 169, KW_THEN = 170, KW_ELSE = 171,
			KW_END = 172, KW_MAPJOIN = 173, KW_STREAMTABLE = 174, KW_CLUSTERSTATUS = 175, KW_UTC = 176,
			KW_UTCTIMESTAMP = 177, KW_LONG = 178, KW_DELETE = 179, KW_PLUS = 180, KW_MINUS = 181, KW_FETCH = 182,
			KW_INTERSECT = 183, KW_VIEW = 184, KW_VIEWS = 185, KW_IN = 186, KW_DATABASE = 187, KW_DATABASES = 188,
			KW_MATERIALIZED = 189, KW_SCHEMA = 190, KW_SCHEMAS = 191, KW_GRANT = 192, KW_REVOKE = 193, KW_SSL = 194,
			KW_UNDO = 195, KW_LOCK = 196, KW_LOCKS = 197, KW_UNLOCK = 198, KW_SHARED = 199, KW_EXCLUSIVE = 200,
			KW_PROCEDURE = 201, KW_UNSIGNED = 202, KW_WHILE = 203, KW_READ = 204, KW_READS = 205, KW_PURGE = 206,
			KW_RANGE = 207, KW_ANALYZE = 208, KW_BEFORE = 209, KW_BETWEEN = 210, KW_BOTH = 211, KW_BINARY = 212,
			KW_CROSS = 213, KW_CONTINUE = 214, KW_CURSOR = 215, KW_TRIGGER = 216, KW_RECORDREADER = 217,
			KW_RECORDWRITER = 218, KW_SEMI = 219, KW_LATERAL = 220, KW_TOUCH = 221, KW_ARCHIVE = 222,
			KW_UNARCHIVE = 223, KW_COMPUTE = 224, KW_STATISTICS = 225, KW_USE = 226, KW_OPTION = 227,
			KW_CONCATENATE = 228, KW_SHOW_DATABASE = 229, KW_UPDATE = 230, KW_RESTRICT = 231, KW_CASCADE = 232,
			KW_SKEWED = 233, KW_ROLLUP = 234, KW_CUBE = 235, KW_DIRECTORIES = 236, KW_FOR = 237, KW_WINDOW = 238,
			KW_UNBOUNDED = 239, KW_PRECEDING = 240, KW_FOLLOWING = 241, KW_CURRENT = 242, KW_CURRENT_DATE = 243,
			KW_CURRENT_TIMESTAMP = 244, KW_LESS = 245, KW_MORE = 246, KW_OVER = 247, KW_GROUPING = 248, KW_SETS = 249,
			KW_TRUNCATE = 250, KW_NOSCAN = 251, KW_PARTIALSCAN = 252, KW_USER = 253, KW_ROLE = 254, KW_ROLES = 255,
			KW_INNER = 256, KW_EXCHANGE = 257, KW_URI = 258, KW_SERVER = 259, KW_ADMIN = 260, KW_OWNER = 261,
			KW_PRINCIPALS = 262, KW_COMPACT = 263, KW_COMPACTIONS = 264, KW_TRANSACTIONS = 265, KW_REWRITE = 266,
			KW_AUTHORIZATION = 267, KW_CONF = 268, KW_VALUES = 269, KW_RELOAD = 270, KW_YEAR = 271, KW_QUARTER = 272,
			KW_MONTH = 273, KW_WEEK = 274, KW_DAY = 275, KW_DOW = 276, KW_HOUR = 277, KW_MINUTE = 278, KW_SECOND = 279,
			KW_START = 280, KW_TRANSACTION = 281, KW_COMMIT = 282, KW_ROLLBACK = 283, KW_WORK = 284, KW_ONLY = 285,
			KW_WRITE = 286, KW_ISOLATION = 287, KW_LEVEL = 288, KW_SNAPSHOT = 289, KW_AUTOCOMMIT = 290, KW_CACHE = 291,
			KW_PRIMARY = 292, KW_FOREIGN = 293, KW_REFERENCES = 294, KW_CONSTRAINT = 295, KW_VALIDATE = 296,
			KW_NOVALIDATE = 297, KW_RELY = 298, KW_NORELY = 299, KW_KEY = 300, KW_ABORT = 301, KW_EXTRACT = 302,
			KW_FLOOR = 303, KW_MERGE = 304, KW_MATCHED = 305, KW_REPL = 306, KW_DUMP = 307, KW_STATUS = 308,
			KW_VECTORIZATION = 309, KW_SUMMARY = 310, KW_OPERATOR = 311, KW_EXPRESSION = 312, KW_DETAIL = 313,
			KW_WAIT = 314, SEMI = 315, Identifier = 316, STRING = 317, INT = 318, WS = 319;
	public static final int RULE_prog = 0, RULE_dmlStatement = 1, RULE_insertStatement = 2, RULE_selectStatement = 3,
			RULE_unionQuery = 4, RULE_selectQueryBlock = 5, RULE_selectAction = 6, RULE_insertClause = 7,
			RULE_columnlist = 8, RULE_column = 9, RULE_orderList = 10, RULE_orderItem = 11, RULE_orderType = 12,
			RULE_allFields = 13, RULE_selectClause = 14, RULE_fromClause = 15, RULE_join_type = 16,
			RULE_whereClause = 17, RULE_groupByClause = 18, RULE_orderByClause = 19, RULE_searchCondition = 20,
			RULE_searchItem = 21, RULE_expression = 22, RULE_tableSource = 23, RULE_fieldName = 24, RULE_database = 25,
			RULE_alias = 26, RULE_tableName = 27, RULE_operator = 28;
	public static final String[] ruleNames = { "prog", "dmlStatement", "insertStatement", "selectStatement",
			"unionQuery", "selectQueryBlock", "selectAction", "insertClause", "columnlist", "column", "orderList",
			"orderItem", "orderType", "allFields", "selectClause", "fromClause", "join_type", "whereClause",
			"groupByClause", "orderByClause", "searchCondition", "searchItem", "expression", "tableSource", "fieldName",
			"database", "alias", "tableName", "operator" };

	private static final String[] _LITERAL_NAMES = { null, "'('", "','", "')'", "'.'", "'='", "'>'", "'<>'", "'<'",
			"'*'", "'ROWNUM'", "'TRUE'", "'FALSE'", "'ALL'", "'NONE'", "'AND'", "'OR'", null, "'LIKE'", "'IF'",
			"'EXISTS'", "'ASC'", "'DESC'", "'NULLS'", "'LAST'", "'ORDER'", "'GROUP'", "'BY'", "'HAVING'", "'WHERE'",
			"'FROM'", "'AS'", "'SELECT'", "'DISTINCT'", "'INSERT'", "'OVERWRITE'", "'OUTER'", "'UNIQUEJOIN'",
			"'PRESERVE'", "'JOIN'", "'LEFT'", "'RIGHT'", "'FULL'", "'ON'", "'PARTITION'", "'PARTITIONS'", "'TABLE'",
			"'TABLES'", "'COLUMNS'", "'INDEX'", "'INDEXES'", "'REBUILD'", "'FUNCTIONS'", "'SHOW'", "'MSCK'", "'REPAIR'",
			"'DIRECTORY'", "'LOCAL'", "'TRANSFORM'", "'USING'", "'CLUSTER'", "'DISTRIBUTE'", "'SORT'", "'UNION'",
			"'EXCEPT'", "'LOAD'", "'EXPORT'", "'IMPORT'", "'REPLICATION'", "'METADATA'", "'DATA'", "'INPATH'", "'IS'",
			"'NULL'", "'CREATE'", "'EXTERNAL'", "'ALTER'", "'CHANGE'", "'COLUMN'", "'FIRST'", "'AFTER'", "'DESCRIBE'",
			"'DROP'", "'RENAME'", "'TO'", "'COMMENT'", "'BOOLEAN'", "'TINYINT'", "'SMALLINT'", null, "'BIGINT'",
			"'FLOAT'", "'DOUBLE'", "'PRECISION'", "'DATE'", "'DATETIME'", "'TIMESTAMP'", "'INTERVAL'", "'DECIMAL'",
			"'STRING'", "'CHAR'", "'VARCHAR'", "'ARRAY'", "'STRUCT'", "'MAP'", "'UNIONTYPE'", "'REDUCE'",
			"'PARTITIONED'", "'CLUSTERED'", "'SORTED'", "'INTO'", "'BUCKETS'", "'ROW'", "'ROWS'", "'FORMAT'",
			"'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'ESCAPED'", "'COLLECTION'", "'ITEMS'", "'KEYS'", "'$KEY$'",
			"'LINES'", "'STORED'", "'FILEFORMAT'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", "'INPUTDRIVER'", "'OUTPUTDRIVER'",
			"'ENABLE'", "'DISABLE'", "'LOCATION'", "'TABLESAMPLE'", "'BUCKET'", "'OUT'", "'OF'", "'PERCENT'", "'CAST'",
			"'ADD'", "'REPLACE'", "'RLIKE'", "'REGEXP'", "'TEMPORARY'", "'FUNCTION'", "'MACRO'", "'FILE'", "'JAR'",
			"'EXPLAIN'", "'EXTENDED'", "'FORMATTED'", "'PRETTY'", "'DEPENDENCY'", "'LOGICAL'", "'SERDE'", "'WITH'",
			"'DEFERRED'", "'SERDEPROPERTIES'", "'DBPROPERTIES'", "'LIMIT'", "'OFFSET'", "'SET'", "'UNSET'",
			"'TBLPROPERTIES'", "'IDXPROPERTIES'", "'$VALUE$'", "'$ELEM$'", "'DEFINED'", "'CASE'", "'WHEN'", "'THEN'",
			"'ELSE'", "'END'", "'MAPJOIN'", "'STREAMTABLE'", "'CLUSTERSTATUS'", "'UTC'", "'UTC_TMESTAMP'", "'LONG'",
			"'DELETE'", "'PLUS'", "'MINUS'", "'FETCH'", "'INTERSECT'", "'VIEW'", "'VIEWS'", "'IN'", "'DATABASE'",
			"'DATABASES'", "'MATERIALIZED'", "'SCHEMA'", "'SCHEMAS'", "'GRANT'", "'REVOKE'", "'SSL'", "'UNDO'",
			"'LOCK'", "'LOCKS'", "'UNLOCK'", "'SHARED'", "'EXCLUSIVE'", "'PROCEDURE'", "'UNSIGNED'", "'WHILE'",
			"'READ'", "'READS'", "'PURGE'", "'RANGE'", "'ANALYZE'", "'BEFORE'", "'BETWEEN'", "'BOTH'", "'BINARY'",
			"'CROSS'", "'CONTINUE'", "'CURSOR'", "'TRIGGER'", "'RECORDREADER'", "'RECORDWRITER'", "'SEMI'", "'LATERAL'",
			"'TOUCH'", "'ARCHIVE'", "'UNARCHIVE'", "'COMPUTE'", "'STATISTICS'", "'USE'", "'OPTION'", "'CONCATENATE'",
			"'SHOW_DATABASE'", "'UPDATE'", "'RESTRICT'", "'CASCADE'", "'SKEWED'", "'ROLLUP'", "'CUBE'", "'DIRECTORIES'",
			"'FOR'", "'WINDOW'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'CURRENT_DATE'",
			"'CURRENT_TIMESTAMP'", "'LESS'", "'MORE'", "'OVER'", "'GROUPING'", "'SETS'", "'TRUNCATE'", "'NOSCAN'",
			"'PARTIALSCAN'", "'USER'", "'ROLE'", "'ROLES'", "'INNER'", "'EXCHANGE'", "'URI'", "'SERVER'", "'ADMIN'",
			"'OWNER'", "'PRINCIPALS'", "'COMPACT'", "'COMPACTIONS'", "'TRANSACTIONS'", "'REWRITE'", "'AUTHORIZATION'",
			"'CONF'", "'VALUES'", "'RELOAD'", null, "'QUARTER'", null, null, null, "'DAYOFWEEK'", null, null, null,
			"'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'WORK'", "'ONLY'", "'WRITE'", "'ISOLATION'",
			"'LEVEL'", "'SNAPSHOT'", "'AUTOCOMMIT'", "'CACHE'", "'PRIMARY'", "'FOREIGN'", "'REFERENCES'",
			"'CONSTRAINT'", "'VALIDATE'", "'NOVALIDATE'", "'RELY'", "'NORELY'", "'KEY'", "'ABORT'", "'EXTRACT'",
			"'FLOOR'", "'MERGE'", "'MATCHED'", "'REPL'", "'DUMP'", "'STATUS'", "'VECTORIZATION'", "'SUMMARY'",
			"'OPERATOR'", "'EXPRESSION'", "'DETAIL'", "'WAIT'", "';'" };
	private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, "STAR",
			"KW_ROWNUM", "KW_TRUE", "KW_FALSE", "KW_ALL", "KW_NONE", "KW_AND", "KW_OR", "KW_NOT", "KW_LIKE", "KW_IF",
			"KW_EXISTS", "KW_ASC", "KW_DESC", "KW_NULLS", "KW_LAST", "KW_ORDER", "KW_GROUP", "KW_BY", "KW_HAVING",
			"KW_WHERE", "KW_FROM", "KW_AS", "KW_SELECT", "KW_DISTINCT", "KW_INSERT", "KW_OVERWRITE", "KW_OUTER",
			"KW_UNIQUEJOIN", "KW_PRESERVE", "KW_JOIN", "KW_LEFT", "KW_RIGHT", "KW_FULL", "KW_ON", "KW_PARTITION",
			"KW_PARTITIONS", "KW_TABLE", "KW_TABLES", "KW_COLUMNS", "KW_INDEX", "KW_INDEXES", "KW_REBUILD",
			"KW_FUNCTIONS", "KW_SHOW", "KW_MSCK", "KW_REPAIR", "KW_DIRECTORY", "KW_LOCAL", "KW_TRANSFORM", "KW_USING",
			"KW_CLUSTER", "KW_DISTRIBUTE", "KW_SORT", "KW_UNION", "KW_EXCEPT", "KW_LOAD", "KW_EXPORT", "KW_IMPORT",
			"KW_REPLICATION", "KW_METADATA", "KW_DATA", "KW_INPATH", "KW_IS", "KW_NULL", "KW_CREATE", "KW_EXTERNAL",
			"KW_ALTER", "KW_CHANGE", "KW_COLUMN", "KW_FIRST", "KW_AFTER", "KW_DESCRIBE", "KW_DROP", "KW_RENAME",
			"KW_TO", "KW_COMMENT", "KW_BOOLEAN", "KW_TINYINT", "KW_SMALLINT", "KW_INT", "KW_BIGINT", "KW_FLOAT",
			"KW_DOUBLE", "KW_PRECISION", "KW_DATE", "KW_DATETIME", "KW_TIMESTAMP", "KW_INTERVAL", "KW_DECIMAL",
			"KW_STRING", "KW_CHAR", "KW_VARCHAR", "KW_ARRAY", "KW_STRUCT", "KW_MAP", "KW_UNIONTYPE", "KW_REDUCE",
			"KW_PARTITIONED", "KW_CLUSTERED", "KW_SORTED", "KW_INTO", "KW_BUCKETS", "KW_ROW", "KW_ROWS", "KW_FORMAT",
			"KW_DELIMITED", "KW_FIELDS", "KW_TERMINATED", "KW_ESCAPED", "KW_COLLECTION", "KW_ITEMS", "KW_KEYS",
			"KW_KEY_TYPE", "KW_LINES", "KW_STORED", "KW_FILEFORMAT", "KW_INPUTFORMAT", "KW_OUTPUTFORMAT",
			"KW_INPUTDRIVER", "KW_OUTPUTDRIVER", "KW_ENABLE", "KW_DISABLE", "KW_LOCATION", "KW_TABLESAMPLE",
			"KW_BUCKET", "KW_OUT", "KW_OF", "KW_PERCENT", "KW_CAST", "KW_ADD", "KW_REPLACE", "KW_RLIKE", "KW_REGEXP",
			"KW_TEMPORARY", "KW_FUNCTION", "KW_MACRO", "KW_FILE", "KW_JAR", "KW_EXPLAIN", "KW_EXTENDED", "KW_FORMATTED",
			"KW_PRETTY", "KW_DEPENDENCY", "KW_LOGICAL", "KW_SERDE", "KW_WITH", "KW_DEFERRED", "KW_SERDEPROPERTIES",
			"KW_DBPROPERTIES", "KW_LIMIT", "KW_OFFSET", "KW_SET", "KW_UNSET", "KW_TBLPROPERTIES", "KW_IDXPROPERTIES",
			"KW_VALUE_TYPE", "KW_ELEM_TYPE", "KW_DEFINED", "KW_CASE", "KW_WHEN", "KW_THEN", "KW_ELSE", "KW_END",
			"KW_MAPJOIN", "KW_STREAMTABLE", "KW_CLUSTERSTATUS", "KW_UTC", "KW_UTCTIMESTAMP", "KW_LONG", "KW_DELETE",
			"KW_PLUS", "KW_MINUS", "KW_FETCH", "KW_INTERSECT", "KW_VIEW", "KW_VIEWS", "KW_IN", "KW_DATABASE",
			"KW_DATABASES", "KW_MATERIALIZED", "KW_SCHEMA", "KW_SCHEMAS", "KW_GRANT", "KW_REVOKE", "KW_SSL", "KW_UNDO",
			"KW_LOCK", "KW_LOCKS", "KW_UNLOCK", "KW_SHARED", "KW_EXCLUSIVE", "KW_PROCEDURE", "KW_UNSIGNED", "KW_WHILE",
			"KW_READ", "KW_READS", "KW_PURGE", "KW_RANGE", "KW_ANALYZE", "KW_BEFORE", "KW_BETWEEN", "KW_BOTH",
			"KW_BINARY", "KW_CROSS", "KW_CONTINUE", "KW_CURSOR", "KW_TRIGGER", "KW_RECORDREADER", "KW_RECORDWRITER",
			"KW_SEMI", "KW_LATERAL", "KW_TOUCH", "KW_ARCHIVE", "KW_UNARCHIVE", "KW_COMPUTE", "KW_STATISTICS", "KW_USE",
			"KW_OPTION", "KW_CONCATENATE", "KW_SHOW_DATABASE", "KW_UPDATE", "KW_RESTRICT", "KW_CASCADE", "KW_SKEWED",
			"KW_ROLLUP", "KW_CUBE", "KW_DIRECTORIES", "KW_FOR", "KW_WINDOW", "KW_UNBOUNDED", "KW_PRECEDING",
			"KW_FOLLOWING", "KW_CURRENT", "KW_CURRENT_DATE", "KW_CURRENT_TIMESTAMP", "KW_LESS", "KW_MORE", "KW_OVER",
			"KW_GROUPING", "KW_SETS", "KW_TRUNCATE", "KW_NOSCAN", "KW_PARTIALSCAN", "KW_USER", "KW_ROLE", "KW_ROLES",
			"KW_INNER", "KW_EXCHANGE", "KW_URI", "KW_SERVER", "KW_ADMIN", "KW_OWNER", "KW_PRINCIPALS", "KW_COMPACT",
			"KW_COMPACTIONS", "KW_TRANSACTIONS", "KW_REWRITE", "KW_AUTHORIZATION", "KW_CONF", "KW_VALUES", "KW_RELOAD",
			"KW_YEAR", "KW_QUARTER", "KW_MONTH", "KW_WEEK", "KW_DAY", "KW_DOW", "KW_HOUR", "KW_MINUTE", "KW_SECOND",
			"KW_START", "KW_TRANSACTION", "KW_COMMIT", "KW_ROLLBACK", "KW_WORK", "KW_ONLY", "KW_WRITE", "KW_ISOLATION",
			"KW_LEVEL", "KW_SNAPSHOT", "KW_AUTOCOMMIT", "KW_CACHE", "KW_PRIMARY", "KW_FOREIGN", "KW_REFERENCES",
			"KW_CONSTRAINT", "KW_VALIDATE", "KW_NOVALIDATE", "KW_RELY", "KW_NORELY", "KW_KEY", "KW_ABORT", "KW_EXTRACT",
			"KW_FLOOR", "KW_MERGE", "KW_MATCHED", "KW_REPL", "KW_DUMP", "KW_STATUS", "KW_VECTORIZATION", "KW_SUMMARY",
			"KW_OPERATOR", "KW_EXPRESSION", "KW_DETAIL", "KW_WAIT", "SEMI", "Identifier", "STRING", "INT", "WS" };
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
	public String getGrammarFileName() {
		return "sql.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(sqlParser.SEMI, 0);
		}

		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterProg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitProg(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitProg(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(58);
				dmlStatement();
				setState(59);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementContext extends ParserRuleContext {
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class, 0);
		}

		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class, 0);
		}

		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dmlStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterDmlStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitDmlStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitDmlStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dmlStatement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1); {
				setState(61);
				insertStatement();
			}
				break;
			case KW_SELECT:
				enterOuterAlt(_localctx, 2); {
				setState(62);
				selectStatement();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStatementContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class, 0);
		}

		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class, 0);
		}

		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_insertStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterInsertStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitInsertStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitInsertStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(65);
				insertClause();
				setState(66);
				selectStatement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public String uuid ;
		public List<ColumnContext> columnList = new ArrayList<ColumnContext>();
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectStatement;
		}

		public SelectStatementContext() {
		}

		public void copyFrom(SelectStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class SelectContext extends SelectStatementContext {
		public SelectQueryBlockContext selectQueryBlock() {
			return getRuleContext(SelectQueryBlockContext.class, 0);
		}

		public SelectContext(SelectStatementContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSelect(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSelect(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSelect(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class UnionContext extends SelectStatementContext {
		public UnionQueryContext unionQuery() {
			return getRuleContext(UnionQueryContext.class, 0);
		}

		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class, 0);
		}

		public UnionContext(SelectStatementContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterUnion(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitUnion(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitUnion(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
			case 1:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 1); {
				setState(68);
				unionQuery();
				setState(70);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1: {
					setState(69);
					orderByClause();
				}
					break;
				}
			}
				break;
			case 2:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 2); {
				setState(72);
				selectQueryBlock();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionQueryContext extends ParserRuleContext {
		public List<SelectQueryBlockContext> selectQueryBlock() {
			return getRuleContexts(SelectQueryBlockContext.class);
		}

		public SelectQueryBlockContext selectQueryBlock(int i) {
			return getRuleContext(SelectQueryBlockContext.class, i);
		}

		public List<TerminalNode> KW_UNION() {
			return getTokens(sqlParser.KW_UNION);
		}

		public TerminalNode KW_UNION(int i) {
			return getToken(sqlParser.KW_UNION, i);
		}

		public List<TerminalNode> KW_ALL() {
			return getTokens(sqlParser.KW_ALL);
		}

		public TerminalNode KW_ALL(int i) {
			return getToken(sqlParser.KW_ALL, i);
		}

		public UnionQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unionQuery;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterUnionQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitUnionQuery(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitUnionQuery(this);
			else
				return visitor.visitChildren(this);
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
				setState(75);
				selectQueryBlock();
				setState(81);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1: {
						{
							setState(76);
							match(KW_UNION);
							setState(78);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == KW_ALL) {
								{
									setState(77);
									match(KW_ALL);
								}
							}

							setState(80);
							selectQueryBlock();
						}
					}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectQueryBlockContext extends ParserRuleContext {
		public String uuid ;
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class, 0);
		}

		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class, 0);
		}

		public List<SelectActionContext> selectAction() {
			return getRuleContexts(SelectActionContext.class);
		}

		public SelectActionContext selectAction(int i) {
			return getRuleContext(SelectActionContext.class, i);
		}

		public SelectQueryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectQueryBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSelectQueryBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSelectQueryBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSelectQueryBlock(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SelectQueryBlockContext selectQueryBlock() throws RecognitionException {
		SelectQueryBlockContext _localctx = new SelectQueryBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectQueryBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				selectClause();
				setState(86);
				fromClause();
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(87);
								selectAction();
							}
						}
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectActionContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class, 0);
		}

		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class, 0);
		}

		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class, 0);
		}

		public SelectActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectAction;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSelectAction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSelectAction(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSelectAction(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SelectActionContext selectAction() throws RecognitionException {
		SelectActionContext _localctx = new SelectActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectAction);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHERE:
				enterOuterAlt(_localctx, 1); {
				setState(93);
				whereClause();
			}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2); {
				setState(94);
				groupByClause();
			}
				break;
			case KW_ORDER:
				enterOuterAlt(_localctx, 3); {
				setState(95);
				orderByClause();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode KW_INSERT() {
			return getToken(sqlParser.KW_INSERT, 0);
		}

		public TerminalNode KW_INTO() {
			return getToken(sqlParser.KW_INTO, 0);
		}

		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class, 0);
		}

		public ColumnlistContext columnlist() {
			return getRuleContext(ColumnlistContext.class, 0);
		}

		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_insertClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterInsertClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitInsertClause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitInsertClause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_insertClause);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(98);
				match(KW_INSERT);
				setState(99);
				match(KW_INTO);
				setState(100);
				tableName();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(101);
				match(KW_INSERT);
				setState(102);
				match(KW_INTO);
				setState(103);
				tableName();
				setState(104);
				columnlist();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnlistContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}

		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class, i);
		}

		public ColumnlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_columnlist;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterColumnlist(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitColumnlist(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitColumnlist(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ColumnlistContext columnlist() throws RecognitionException {
		ColumnlistContext _localctx = new ColumnlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnlist);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1); {
				setState(108);
				match(T__0);
				setState(109);
				column();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__1) {
					{
						{
							setState(110);
							match(T__1);
							setState(111);
							column();
						}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__2);
			}
				break;
			case STAR:
			case Identifier:
				enterOuterAlt(_localctx, 2); {
				setState(119);
				column();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__1) {
					{
						{
							setState(120);
							match(T__1);
							setState(121);
							column();
						}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class, 0);
		}

		public TerminalNode KW_AS() {
			return getToken(sqlParser.KW_AS, 0);
		}

		public AliasContext alias() {
			return getRuleContext(AliasContext.class, 0);
		}

		public AllFieldsContext allFields() {
			return getRuleContext(AllFieldsContext.class, 0);
		}

		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_column;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterColumn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitColumn(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitColumn(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1); {
				setState(129);
				fieldName();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == KW_AS) {
					{
						setState(130);
						match(KW_AS);
						setState(131);
						alias();
					}
				}

			}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2); {
				setState(134);
				allFields();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderListContext extends ParserRuleContext {
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}

		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class, i);
		}

		public OrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_orderList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterOrderList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitOrderList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOrderList(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OrderListContext orderList() throws RecognitionException {
		OrderListContext _localctx = new OrderListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(137);
				orderItem();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__1) {
					{
						{
							setState(138);
							match(T__1);
							setState(139);
							orderItem();
						}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderItemContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class, 0);
		}

		public OrderTypeContext orderType() {
			return getRuleContext(OrderTypeContext.class, 0);
		}

		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_orderItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterOrderItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitOrderItem(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOrderItem(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				fieldName();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == KW_ASC || _la == KW_DESC) {
					{
						setState(146);
						orderType();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderTypeContext extends ParserRuleContext {
		public TerminalNode KW_ASC() {
			return getToken(sqlParser.KW_ASC, 0);
		}

		public TerminalNode KW_DESC() {
			return getToken(sqlParser.KW_DESC, 0);
		}

		public OrderTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_orderType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterOrderType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitOrderType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOrderType(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OrderTypeContext orderType() throws RecognitionException {
		OrderTypeContext _localctx = new OrderTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(149);
				_la = _input.LA(1);
				if (!(_la == KW_ASC || _la == KW_DESC)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllFieldsContext extends ParserRuleContext {
		public TerminalNode STAR() {
			return getToken(sqlParser.STAR, 0);
		}

		public AllFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_allFields;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterAllFields(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitAllFields(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitAllFields(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final AllFieldsContext allFields() throws RecognitionException {
		AllFieldsContext _localctx = new AllFieldsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_allFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(151);
				match(STAR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode KW_SELECT() {
			return getToken(sqlParser.KW_SELECT, 0);
		}
		public List<ColumnContext> columnListMore = new ArrayList<ColumnContext>();
		public ColumnlistContext columnlist() {
			return getRuleContext(ColumnlistContext.class, 0);
		}

		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSelectClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSelectClause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSelectClause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(153);
				match(KW_SELECT);
				setState(154);
				columnlist();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode KW_FROM() {
			return getToken(sqlParser.KW_FROM, 0);
		}

		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class, 0);
		}

		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fromClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterFromClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitFromClause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitFromClause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(156);
				match(KW_FROM);
				setState(157);
				tableSource(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode KW_LEFT() {
			return getToken(sqlParser.KW_LEFT, 0);
		}

		public TerminalNode KW_INNER() {
			return getToken(sqlParser.KW_INNER, 0);
		}

		public TerminalNode KW_RIGHT() {
			return getToken(sqlParser.KW_RIGHT, 0);
		}

		public TerminalNode KW_FULL() {
			return getToken(sqlParser.KW_FULL, 0);
		}

		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_join_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterJoin_type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitJoin_type(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitJoin_type(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(159);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0
						&& ((1L << _la) & ((1L << KW_LEFT) | (1L << KW_RIGHT) | (1L << KW_FULL))) != 0)
						|| _la == KW_INNER)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whereClause;
		}

		public WhereClauseContext() {
		}

		public void copyFrom(WhereClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class TopContext extends WhereClauseContext {
		public TerminalNode KW_WHERE() {
			return getToken(sqlParser.KW_WHERE, 0);
		}

		public TerminalNode KW_ROWNUM() {
			return getToken(sqlParser.KW_ROWNUM, 0);
		}

		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class, 0);
		}

		public TerminalNode INT() {
			return getToken(sqlParser.INT, 0);
		}

		public TopContext(WhereClauseContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterTop(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitTop(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitTop(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class WhereContext extends WhereClauseContext {
		public TerminalNode KW_WHERE() {
			return getToken(sqlParser.KW_WHERE, 0);
		}

		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class, 0);
		}

		public WhereContext(WhereClauseContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterWhere(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitWhere(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitWhere(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
			case 1:
				_localctx = new TopContext(_localctx);
				enterOuterAlt(_localctx, 1); {
				setState(161);
				match(KW_WHERE);
				setState(162);
				match(KW_ROWNUM);
				setState(163);
				operator();
				setState(164);
				match(INT);
			}
				break;
			case 2:
				_localctx = new WhereContext(_localctx);
				enterOuterAlt(_localctx, 2); {
				setState(166);
				match(KW_WHERE);
				setState(167);
				searchCondition();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode KW_GROUP() {
			return getToken(sqlParser.KW_GROUP, 0);
		}

		public TerminalNode KW_BY() {
			return getToken(sqlParser.KW_BY, 0);
		}

		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class, 0);
		}

		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_groupByClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterGroupByClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitGroupByClause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitGroupByClause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(170);
				match(KW_GROUP);
				setState(171);
				match(KW_BY);
				setState(172);
				fieldName();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode KW_ORDER() {
			return getToken(sqlParser.KW_ORDER, 0);
		}

		public TerminalNode KW_BY() {
			return getToken(sqlParser.KW_BY, 0);
		}

		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class, 0);
		}

		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_orderByClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterOrderByClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitOrderByClause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOrderByClause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(174);
				match(KW_ORDER);
				setState(175);
				match(KW_BY);
				setState(176);
				orderList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchConditionContext extends ParserRuleContext {
		public List<SearchItemContext> searchItem() {
			return getRuleContexts(SearchItemContext.class);
		}

		public SearchItemContext searchItem(int i) {
			return getRuleContext(SearchItemContext.class, i);
		}

		public List<TerminalNode> KW_AND() {
			return getTokens(sqlParser.KW_AND);
		}

		public TerminalNode KW_AND(int i) {
			return getToken(sqlParser.KW_AND, i);
		}

		public SearchConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_searchCondition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSearchCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSearchCondition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSearchCondition(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SearchConditionContext searchCondition() throws RecognitionException {
		SearchConditionContext _localctx = new SearchConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_searchCondition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(178);
				searchItem();
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(179);
								match(KW_AND);
								setState(180);
								searchItem();
							}
						}
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode KW_IS() {
			return getToken(sqlParser.KW_IS, 0);
		}

		public TerminalNode KW_NULL() {
			return getToken(sqlParser.KW_NULL, 0);
		}

		public TerminalNode KW_IN() {
			return getToken(sqlParser.KW_IN, 0);
		}

		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class, 0);
		}

		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class, 0);
		}

		public TerminalNode KW_NOT() {
			return getToken(sqlParser.KW_NOT, 0);
		}

		public SearchItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_searchItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSearchItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSearchItem(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSearchItem(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SearchItemContext searchItem() throws RecognitionException {
		SearchItemContext _localctx = new SearchItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_searchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(186);
				expression();
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__6:
				case T__7: {
					{
						setState(187);
						operator();
					}
					setState(188);
					expression();
				}
					break;
				case KW_IS: {
					setState(190);
					match(KW_IS);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == KW_NOT) {
						{
							setState(191);
							match(KW_NOT);
						}
					}

					setState(194);
					match(KW_NULL);
				}
					break;
				case KW_IN: {
					setState(195);
					match(KW_IN);
					setState(196);
					selectStatement();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}

		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class, i);
		}

		public List<TerminalNode> STRING() {
			return getTokens(sqlParser.STRING);
		}

		public TerminalNode STRING(int i) {
			return getToken(sqlParser.STRING, i);
		}

		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}

		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class, i);
		}

		public List<TerminalNode> INT() {
			return getTokens(sqlParser.INT);
		}

		public TerminalNode INT(int i) {
			return getToken(sqlParser.INT, i);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(200);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
				case 1: {
					setState(199);
					match(T__0);
				}
					break;
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(206);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case Identifier: {
								setState(202);
								fieldName();
							}
								break;
							case STRING: {
								setState(203);
								match(STRING);
							}
								break;
							case T__4:
							case T__5:
							case T__6:
							case T__7: {
								setState(204);
								operator();
							}
								break;
							case INT: {
								setState(205);
								match(INT);
							}
								break;
							default:
								throw new NoViableAltException(this);
							}
						}
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				}
				setState(212);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
				case 1: {
					setState(211);
					match(T__2);
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourceContext extends ParserRuleContext {
		// TableSource视为表，虽然可能由子查询、selectjoin或表。
		public String uuid;
		public List<ColumnContext> columnList = new ArrayList<ColumnContext>();
		public String tableName;
		public String alias;
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableSource;
		}

		public TableSourceContext() {
		}

		public void copyFrom(TableSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class SelectjoinContext extends TableSourceContext {
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}

		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class, i);
		}

		public List<Join_typeContext> join_type() {
			return getRuleContexts(Join_typeContext.class);
		}

		public Join_typeContext join_type(int i) {
			return getRuleContext(Join_typeContext.class, i);
		}

		public List<TerminalNode> KW_JOIN() {
			return getTokens(sqlParser.KW_JOIN);
		}

		public TerminalNode KW_JOIN(int i) {
			return getToken(sqlParser.KW_JOIN, i);
		}

		public List<TerminalNode> KW_ON() {
			return getTokens(sqlParser.KW_ON);
		}

		public TerminalNode KW_ON(int i) {
			return getToken(sqlParser.KW_ON, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public SelectjoinContext(TableSourceContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSelectjoin(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSelectjoin(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSelectjoin(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class SimpleTableContext extends TableSourceContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class, 0);
		}

		public AliasContext alias() {
			return getRuleContext(AliasContext.class, 0);
		}

		public SimpleTableContext(TableSourceContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSimpleTable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSimpleTable(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSimpleTable(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class SubSelectQueryContext extends TableSourceContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class, 0);
		}

		public AliasContext alias() {
			return getRuleContext(AliasContext.class, 0);
		}

		public SubSelectQueryContext(TableSourceContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterSubSelectQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitSubSelectQuery(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSubSelectQuery(this);
			else
				return visitor.visitChildren(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_tableSource, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier: {
					_localctx = new SimpleTableContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;

					setState(215);
					tableName();
					setState(217);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
					case 1: {
						setState(216);
						alias();
					}
						break;
					}
				}
					break;
				case T__0: {
					_localctx = new SubSelectQueryContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(219);
					match(T__0);
					setState(220);
					selectStatement();
					setState(221);
					match(T__2);
					setState(222);
					alias();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new SelectjoinContext(new TableSourceContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_tableSource);
								setState(226);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(233);
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1: {
										{
											setState(227);
											join_type();
											setState(228);
											match(KW_JOIN);
											setState(229);
											tableSource(0);
											setState(230);
											match(KW_ON);
											setState(231);
											expression();
										}
									}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(235);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
								} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
							}
						}
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(sqlParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(sqlParser.Identifier, i);
		}

		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterFieldName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitFieldName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitFieldName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(242);
				match(Identifier);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(243);
								match(T__3);
								setState(244);
								match(Identifier);
							}
						}
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(sqlParser.Identifier, 0);
		}

		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_database;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterDatabase(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitDatabase(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitDatabase(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(250);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(sqlParser.Identifier, 0);
		}

		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_alias;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterAlias(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitAlias(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitAlias(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(252);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(sqlParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(sqlParser.Identifier, i);
		}

		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class, 0);
		}

		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterTableName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitTableName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitTableName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableName);
		try {
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(254);
				match(Identifier);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(255);
				database();
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(256);
								match(T__3);
								setState(257);
								match(Identifier);
							}
						}
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				}
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).enterOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof sqlListener)
				((sqlListener) listener).exitOperator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOperator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(265);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0
						&& ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return tableSource_sempred((TableSourceContext) _localctx, predIndex);
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

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0141\u010e\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"
			+ "\5\3B\n\3\3\4\3\4\3\4\3\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\6\3\6\3\6\5\6Q\n"
			+ "\6\3\6\6\6T\n\6\r\6\16\6U\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b"
			+ "\3\b\5\bc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n"
			+ "\7\ns\n\n\f\n\16\nv\13\n\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13"
			+ "\n\5\n\u0082\n\n\3\13\3\13\3\13\5\13\u0087\n\13\3\13\5\13\u008a\n\13\3"
			+ "\f\3\f\3\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\r\3\r\5\r\u0096\n\r\3\16"
			+ "\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"
			+ "\3\23\3\23\3\23\3\23\5\23\u00ab\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"
			+ "\3\25\3\26\3\26\3\26\7\26\u00b8\n\26\f\26\16\26\u00bb\13\26\3\27\3\27"
			+ "\3\27\3\27\3\27\3\27\5\27\u00c3\n\27\3\27\3\27\3\27\5\27\u00c8\n\27\3"
			+ "\30\5\30\u00cb\n\30\3\30\3\30\3\30\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4"
			+ "\13\30\3\30\5\30\u00d7\n\30\3\31\3\31\3\31\5\31\u00dc\n\31\3\31\3\31\3"
			+ "\31\3\31\3\31\5\31\u00e3\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31"
			+ "\u00ec\n\31\r\31\16\31\u00ed\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31\3"
			+ "\32\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\33\3\33\3\34\3"
			+ "\34\3\35\3\35\3\35\3\35\7\35\u0105\n\35\f\35\16\35\u0108\13\35\5\35\u010a"
			+ "\n\35\3\36\3\36\3\36\2\3\60\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"
			+ " \"$&(*,.\60\62\64\668:\2\5\3\2\27\30\4\2*,\u0102\u0102\3\2\7\n\2\u0112"
			+ "\2<\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bK\3\2\2\2\nM\3\2\2\2\fW\3\2\2\2\16"
			+ "b\3\2\2\2\20l\3\2\2\2\22\u0081\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2"
			+ "\2\30\u0093\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2"
			+ " \u009e\3\2\2\2\"\u00a1\3\2\2\2$\u00aa\3\2\2\2&\u00ac\3\2\2\2(\u00b0\3"
			+ "\2\2\2*\u00b4\3\2\2\2,\u00bc\3\2\2\2.\u00ca\3\2\2\2\60\u00e2\3\2\2\2\62"
			+ "\u00f4\3\2\2\2\64\u00fc\3\2\2\2\66\u00fe\3\2\2\28\u0109\3\2\2\2:\u010b"
			+ "\3\2\2\2<=\5\4\3\2=>\7\u013d\2\2>\3\3\2\2\2?B\5\6\4\2@B\5\b\5\2A?\3\2"
			+ "\2\2A@\3\2\2\2B\5\3\2\2\2CD\5\20\t\2DE\5\b\5\2E\7\3\2\2\2FH\5\n\6\2GI"
			+ "\5(\25\2HG\3\2\2\2HI\3\2\2\2IL\3\2\2\2JL\5\f\7\2KF\3\2\2\2KJ\3\2\2\2L"
			+ "\t\3\2\2\2MS\5\f\7\2NP\7A\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"
			+ "RT\5\f\7\2SN\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WX\5\36"
			+ "\20\2X\\\5 \21\2Y[\5\16\b\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"
			+ "]\r\3\2\2\2^\\\3\2\2\2_c\5$\23\2`c\5&\24\2ac\5(\25\2b_\3\2\2\2b`\3\2\2"
			+ "\2ba\3\2\2\2c\17\3\2\2\2de\7$\2\2ef\7p\2\2fm\58\35\2gh\7$\2\2hi\7p\2\2"
			+ "ij\58\35\2jk\5\22\n\2km\3\2\2\2ld\3\2\2\2lg\3\2\2\2m\21\3\2\2\2no\7\3"
			+ "\2\2ot\5\24\13\2pq\7\4\2\2qs\5\24\13\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2t"
			+ "u\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\5\2\2x\u0082\3\2\2\2y~\5\24\13\2z{\7"
			+ "\4\2\2{}\5\24\13\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"
			+ "\u0082\3\2\2\2\u0080~\3\2\2\2\u0081n\3\2\2\2\u0081y\3\2\2\2\u0082\23\3"
			+ "\2\2\2\u0083\u0086\5\62\32\2\u0084\u0085\7!\2\2\u0085\u0087\5\66\34\2"
			+ "\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u008a"
			+ "\5\34\17\2\u0089\u0083\3\2\2\2\u0089\u0088\3\2\2\2\u008a\25\3\2\2\2\u008b"
			+ "\u0090\5\30\r\2\u008c\u008d\7\4\2\2\u008d\u008f\5\30\r\2\u008e\u008c\3"
			+ "\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"
			+ "\27\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\62\32\2\u0094\u0096\5\32"
			+ "\16\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\31\3\2\2\2\u0097\u0098"
			+ "\t\2\2\2\u0098\33\3\2\2\2\u0099\u009a\7\13\2\2\u009a\35\3\2\2\2\u009b"
			+ "\u009c\7\"\2\2\u009c\u009d\5\22\n\2\u009d\37\3\2\2\2\u009e\u009f\7 \2"
			+ "\2\u009f\u00a0\5\60\31\2\u00a0!\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2#\3\2"
			+ "\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\5:\36\2\u00a6"
			+ "\u00a7\7\u0140\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00ab"
			+ "\5*\26\2\u00aa\u00a3\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab%\3\2\2\2\u00ac"
			+ "\u00ad\7\34\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\5\62\32\2\u00af\'\3\2"
			+ "\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\5\26\f\2\u00b3"
			+ ")\3\2\2\2\u00b4\u00b9\5,\27\2\u00b5\u00b6\7\21\2\2\u00b6\u00b8\5,\27\2"
			+ "\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"
			+ "\3\2\2\2\u00ba+\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c7\5.\30\2\u00bd"
			+ "\u00be\5:\36\2\u00be\u00bf\5.\30\2\u00bf\u00c8\3\2\2\2\u00c0\u00c2\7J"
			+ "\2\2\u00c1\u00c3\7\23\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"
			+ "\u00c4\3\2\2\2\u00c4\u00c8\7K\2\2\u00c5\u00c6\7\u00bc\2\2\u00c6\u00c8"
			+ "\5\b\5\2\u00c7\u00bd\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"
			+ "-\3\2\2\2\u00c9\u00cb\7\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2"
			+ "\u00cb\u00d2\3\2\2\2\u00cc\u00d1\5\62\32\2\u00cd\u00d1\7\u013f\2\2\u00ce"
			+ "\u00d1\5:\36\2\u00cf\u00d1\7\u0140\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd"
			+ "\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"
			+ "\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"
			+ "\2\2\u00d5\u00d7\7\5\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"
			+ "/\3\2\2\2\u00d8\u00d9\b\31\1\2\u00d9\u00db\58\35\2\u00da\u00dc\5\66\34"
			+ "\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00de"
			+ "\7\3\2\2\u00de\u00df\5\b\5\2\u00df\u00e0\7\5\2\2\u00e0\u00e1\5\66\34\2"
			+ "\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\u00f1"
			+ "\3\2\2\2\u00e4\u00eb\f\3\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7)\2\2\u00e7"
			+ "\u00e8\5\60\31\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\5.\30\2\u00ea\u00ec\3"
			+ "\2\2\2\u00eb\u00e5\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"
			+ "\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e4\3\2\2\2\u00f0\u00f3\3\2"
			+ "\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\61\3\2\2\2\u00f3\u00f1"
			+ "\3\2\2\2\u00f4\u00f9\7\u013e\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f8\7\u013e"
			+ "\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"
			+ "\u00fa\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\u013e"
			+ "\2\2\u00fd\65\3\2\2\2\u00fe\u00ff\7\u013e\2\2\u00ff\67\3\2\2\2\u0100\u010a"
			+ "\7\u013e\2\2\u0101\u0106\5\64\33\2\u0102\u0103\7\6\2\2\u0103\u0105\7\u013e"
			+ "\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"
			+ "\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0100\3\2"
			+ "\2\2\u0109\u0101\3\2\2\2\u010a9\3\2\2\2\u010b\u010c\t\4\2\2\u010c;\3\2"
			+ "\2\2 AHKPU\\blt~\u0081\u0086\u0089\u0090\u0095\u00aa\u00b9\u00c2\u00c7"
			+ "\u00ca\u00d0\u00d2\u00d6\u00db\u00e2\u00ed\u00f1\u00f9\u0106\u0109";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}