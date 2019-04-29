// Generated from io/shardingsphere/core/parsing/antlr/autogen/PostgreSQLStatement.g4 by ANTLR 4.7.1
package io.shardingsphere.core.parsing.antlr.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostgreSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ACTION=2, ADMIN=3, ARRAY=4, BEGIN=5, BIT=6, BRIN=7, BTREE=8, BYPASSRLS=9, 
		CACHE=10, CAST=11, CHARACTER=12, CHARACTERISTICS=13, CLUSTER=14, COLLATE=15, 
		COMMENTS=16, CONCURRENTLY=17, CONNECT=18, CONNECTION=19, CONSTRAINTS=20, 
		CREATEDB=21, CREATEROLE=22, CURRENT_TIMESTAMP=23, CURRENT_USER=24, CYCLE=25, 
		DATA=26, DATABASE=27, DEFAULTS=28, DEFERRABLE=29, DEFERRED=30, DEPENDS=31, 
		DOMAIN=32, DOUBLE=33, ENCRYPTED=34, EXCLUDING=35, EXECUTE=36, EXTENDED=37, 
		EXTENSION=38, EXTERNAL=39, EXTRACT=40, FILTER=41, FIRST=42, FOLLOWING=43, 
		FORCE=44, FULL=45, FUNCTIONS=46, GIN=47, GIST=48, GLOBAL=49, HASH=50, 
		HOUR=51, IDENTITY=52, IF=53, IMMEDIATE=54, INCLUDING=55, INCREMENT=56, 
		INDEXES=57, INHERIT=58, INHERITS=59, INITIALLY=60, INOUT=61, INSERT=62, 
		LANGUAGE=63, LARGE=64, LAST=65, LOCAL=66, LOGGED=67, LOGIN=68, MAIN=69, 
		MATCH=70, MAXVALUE=71, MINUTE=72, MINVALUE=73, MONTH=74, NOBYPASSRLS=75, 
		NOCREATEDB=76, NOCREATEROLE=77, NOINHERIT=78, NOLOGIN=79, NOREPLICATION=80, 
		NOSUPERUSER=81, NOTHING=82, NULLS=83, OBJECT=84, OF=85, OIDS=86, ONLY=87, 
		OUT=88, OVER=89, OWNED=90, OWNER=91, PARTIAL=92, PLAIN=93, PRECEDING=94, 
		PRECISION=95, PREPARED=96, PROCEDURE=97, PROCEDURES=98, PUBLIC=99, RANGE=100, 
		RENAME=101, REPEATABLE=102, REPLICA=103, REPLICATION=104, RESET=105, RESTART=106, 
		RESTRICT=107, ROUTINE=108, ROUTINES=109, RULE=110, SAVEPOINT=111, SCHEMA=112, 
		SECOND=113, SECURITY=114, SELECT=115, SEQUENCE=116, SEQUENCES=117, SERVER=118, 
		SESSION=119, SESSION_USER=120, SHOW=121, SIMPLE=122, SNAPSHOT=123, SPGIST=124, 
		STATISTICS=125, STORAGE=126, SUPERUSER=127, SYSID=128, TABLES=129, TABLESPACE=130, 
		TEMP=131, TEMPORARY=132, TRIGGER=133, TYPE=134, UNBOUNDED=135, UNCOMMITTED=136, 
		UNLOGGED=137, UNTIL=138, UPDATE=139, USAGE=140, USING=141, VALID=142, 
		VALIDATE=143, VARIADIC=144, VARYING=145, WITHIN=146, WITHOUT=147, WRAPPER=148, 
		WRITE=149, ZONE=150, AND_=151, OR_=152, NOT_=153, UNARY_BIT_COMPLEMENT=154, 
		BIT_INCLUSIVE_OR=155, BIT_AND=156, SIGNED_LEFT_SHIFT=157, SIGNED_RIGHT_SHIFT=158, 
		BIT_EXCLUSIVE_OR=159, MOD_=160, COLON=161, PLUS=162, MINUS=163, ASTERISK=164, 
		SLASH=165, BACKSLASH=166, DOT=167, DOT_ASTERISK=168, SAFE_EQ=169, EQ=170, 
		EQ_=171, NEQ=172, NEQ_=173, GT=174, GTE=175, LT=176, LTE=177, POUND_=178, 
		LP_=179, RP_=180, LBE_=181, RBE_=182, LBT_=183, RBT_=184, COMMA=185, DQ_=186, 
		SQ_=187, BQ_=188, UL_=189, QUESTION=190, AT_=191, SEMI_=192, ALL=193, 
		AND=194, ANY=195, ASC=196, BETWEEN=197, BINARY=198, BIT_NUM=199, BY=200, 
		DATE=201, DESC=202, DISTINCT=203, ESCAPE=204, EXISTS=205, FALSE=206, FROM=207, 
		GROUP=208, HAVING=209, HIDDEN_=210, IN=211, IS=212, KEY=213, LIKE=214, 
		LIMIT=215, MOD=216, NOT=217, NULL=218, OFFSET=219, OR=220, ORDER=221, 
		PARTITION=222, PRIMARY=223, REGEXP=224, ROLLUP=225, ROW=226, SET=227, 
		SOUNDS=228, TIME=229, TIMESTAMP=230, TRUE=231, UNION=232, UNKNOWN=233, 
		WHERE=234, WITH=235, XOR=236, ADD=237, ALTER=238, ALWAYS=239, AS=240, 
		CASCADE=241, CHECK=242, COLUMN=243, COMMIT=244, COMMITTED=245, CONSTRAINT=246, 
		CREATE=247, CURRENT=248, DAY=249, DEFAULT=250, DELETE=251, DISABLE=252, 
		DROP=253, ENABLE=254, FOR=255, FOREIGN=256, FUNCTION=257, GENERATED=258, 
		GRANT=259, INDEX=260, ISOLATION=261, LEVEL=262, NO=263, ON=264, OPTION=265, 
		PASSWORD=266, PRIVILEGES=267, READ=268, REFERENCES=269, REVOKE=270, ROLE=271, 
		ROLLBACK=272, ROWS=273, SERIALIZABLE=274, START=275, TABLE=276, TO=277, 
		TRANSACTION=278, TRUNCATE=279, UNIQUE=280, USER=281, WORK=282, YEAR=283, 
		STRING=284, NUMBER=285, INT_=286, EXP=287, HEX_DIGIT=288, WS=289, ID=290, 
		BLOCK_COMMENT=291, SL_COMMENT=292;
	public static final int
		RULE_execute = 0, RULE_columnDefinition = 1, RULE_dataType = 2, RULE_typeName = 3, 
		RULE_typeNames = 4, RULE_intervalFields = 5, RULE_intervalField = 6, RULE_collateClause = 7, 
		RULE_usingIndexType = 8, RULE_columnConstraint = 9, RULE_constraintClause = 10, 
		RULE_columnConstraintOption = 11, RULE_checkOption = 12, RULE_defaultExpr = 13, 
		RULE_sequenceOptions = 14, RULE_sequenceOption = 15, RULE_indexParameters = 16, 
		RULE_action = 17, RULE_constraintOptionalParam = 18, RULE_tableConstraint = 19, 
		RULE_tableConstraintOption = 20, RULE_foreignKeyOnAction = 21, RULE_foreignKeyOn = 22, 
		RULE_excludeElement = 23, RULE_privateExprOfDb = 24, RULE_pgExpr = 25, 
		RULE_aggregateExpression = 26, RULE_filterClause = 27, RULE_asteriskWithParen = 28, 
		RULE_windowFunction = 29, RULE_windowFunctionWithClause = 30, RULE_windowDefinition = 31, 
		RULE_orderByExpr = 32, RULE_operator = 33, RULE_frameClause = 34, RULE_frameStart = 35, 
		RULE_frameEnd = 36, RULE_castExpr = 37, RULE_castExprWithColon = 38, RULE_collateExpr = 39, 
		RULE_arrayConstructorWithCast = 40, RULE_arrayConstructor = 41, RULE_extractFromFunction = 42, 
		RULE_schemaName = 43, RULE_databaseName = 44, RULE_domainName = 45, RULE_tableName = 46, 
		RULE_columnName = 47, RULE_sequenceName = 48, RULE_tablespaceName = 49, 
		RULE_collationName = 50, RULE_indexName = 51, RULE_alias = 52, RULE_cteName = 53, 
		RULE_parserName = 54, RULE_extensionName = 55, RULE_rowName = 56, RULE_opclass = 57, 
		RULE_fileGroup = 58, RULE_groupName = 59, RULE_constraintName = 60, RULE_keyName = 61, 
		RULE_xmlSchemaCollection = 62, RULE_columnSetName = 63, RULE_directoryName = 64, 
		RULE_triggerName = 65, RULE_routineName = 66, RULE_roleName = 67, RULE_partitionName = 68, 
		RULE_rewriteRuleName = 69, RULE_ownerName = 70, RULE_userName = 71, RULE_serverName = 72, 
		RULE_dataTypeLength = 73, RULE_primaryKey = 74, RULE_matchNone = 75, RULE_ids = 76, 
		RULE_idList = 77, RULE_rangeClause = 78, RULE_rangeItem = 79, RULE_schemaNames = 80, 
		RULE_databaseNames = 81, RULE_domainNames = 82, RULE_tableList = 83, RULE_tableNames = 84, 
		RULE_columnNamesWithParen = 85, RULE_columnNames = 86, RULE_columnList = 87, 
		RULE_sequenceNames = 88, RULE_tablespaceNames = 89, RULE_indexNames = 90, 
		RULE_indexList = 91, RULE_rowNames = 92, RULE_roleNames = 93, RULE_userNames = 94, 
		RULE_serverNames = 95, RULE_bitExprs = 96, RULE_exprs = 97, RULE_exprsWithParen = 98, 
		RULE_expr = 99, RULE_exprRecursive = 100, RULE_booleanPrimary = 101, RULE_comparisonOperator = 102, 
		RULE_predicate = 103, RULE_bitExpr = 104, RULE_simpleExpr = 105, RULE_functionCall = 106, 
		RULE_distinct = 107, RULE_intervalExpr = 108, RULE_caseExpress = 109, 
		RULE_variable = 110, RULE_liter = 111, RULE_question = 112, RULE_number = 113, 
		RULE_string = 114, RULE_subquery = 115, RULE_orderByClause = 116, RULE_orderByItem = 117, 
		RULE_createIndex = 118, RULE_alterIndex = 119, RULE_alterIndexName = 120, 
		RULE_renameIndex = 121, RULE_alterIndexDependsOnExtension = 122, RULE_alterIndexSetTableSpace = 123, 
		RULE_dropIndex = 124, RULE_createTable = 125, RULE_createTableHeader = 126, 
		RULE_createDefinitions = 127, RULE_createDefinition = 128, RULE_likeOption = 129, 
		RULE_inheritClause = 130, RULE_alterTable = 131, RULE_alterTableNameWithAsterisk = 132, 
		RULE_alterTableOp = 133, RULE_alterTableActions = 134, RULE_alterTableAction = 135, 
		RULE_tableConstraintUsingIndex = 136, RULE_addColumn = 137, RULE_dropColumn = 138, 
		RULE_modifyColumn = 139, RULE_alterColumn = 140, RULE_alterColumnSetOption = 141, 
		RULE_attributeOptions = 142, RULE_attributeOption = 143, RULE_addConstraint = 144, 
		RULE_renameColumn = 145, RULE_renameConstraint = 146, RULE_storageParameterWithValue = 147, 
		RULE_storageParameter = 148, RULE_alterTableNameExists = 149, RULE_renameTable = 150, 
		RULE_dropTable = 151, RULE_truncateTable = 152, RULE_tableNameParts = 153, 
		RULE_tableNamePart = 154, RULE_setTransaction = 155, RULE_transactionMode = 156, 
		RULE_commit = 157, RULE_rollback = 158, RULE_savepoint = 159, RULE_beginTransaction = 160, 
		RULE_startTransaction = 161, RULE_workOrTransaction = 162, RULE_grant = 163, 
		RULE_privType = 164, RULE_privOnClause = 165, RULE_fdwName = 166, RULE_fdwNames = 167, 
		RULE_argMode = 168, RULE_argName = 169, RULE_langName = 170, RULE_langNames = 171, 
		RULE_loid = 172, RULE_loids = 173, RULE_roleSpecification = 174, RULE_roleSpecifications = 175, 
		RULE_grantRole = 176, RULE_revoke = 177, RULE_revokeRole = 178, RULE_createUser = 179, 
		RULE_roleOption = 180, RULE_roleOptions = 181, RULE_alterUser = 182, RULE_renameUser = 183, 
		RULE_alterUserSetConfig = 184, RULE_configName = 185, RULE_alterUserConfigOp = 186, 
		RULE_alterUserResetConfig = 187, RULE_dropUser = 188, RULE_createRole = 189, 
		RULE_alterRole = 190, RULE_renameRole = 191, RULE_alterRoleSetConfig = 192, 
		RULE_alterRoleConfigOp = 193, RULE_alterRoleResetConfig = 194, RULE_dropRole = 195, 
		RULE_show = 196, RULE_setParam = 197, RULE_scope = 198, RULE_setClause = 199, 
		RULE_timeZoneType = 200, RULE_resetParam = 201;
	public static final String[] ruleNames = {
		"execute", "columnDefinition", "dataType", "typeName", "typeNames", "intervalFields", 
		"intervalField", "collateClause", "usingIndexType", "columnConstraint", 
		"constraintClause", "columnConstraintOption", "checkOption", "defaultExpr", 
		"sequenceOptions", "sequenceOption", "indexParameters", "action", "constraintOptionalParam", 
		"tableConstraint", "tableConstraintOption", "foreignKeyOnAction", "foreignKeyOn", 
		"excludeElement", "privateExprOfDb", "pgExpr", "aggregateExpression", 
		"filterClause", "asteriskWithParen", "windowFunction", "windowFunctionWithClause", 
		"windowDefinition", "orderByExpr", "operator", "frameClause", "frameStart", 
		"frameEnd", "castExpr", "castExprWithColon", "collateExpr", "arrayConstructorWithCast", 
		"arrayConstructor", "extractFromFunction", "schemaName", "databaseName", 
		"domainName", "tableName", "columnName", "sequenceName", "tablespaceName", 
		"collationName", "indexName", "alias", "cteName", "parserName", "extensionName", 
		"rowName", "opclass", "fileGroup", "groupName", "constraintName", "keyName", 
		"xmlSchemaCollection", "columnSetName", "directoryName", "triggerName", 
		"routineName", "roleName", "partitionName", "rewriteRuleName", "ownerName", 
		"userName", "serverName", "dataTypeLength", "primaryKey", "matchNone", 
		"ids", "idList", "rangeClause", "rangeItem", "schemaNames", "databaseNames", 
		"domainNames", "tableList", "tableNames", "columnNamesWithParen", "columnNames", 
		"columnList", "sequenceNames", "tablespaceNames", "indexNames", "indexList", 
		"rowNames", "roleNames", "userNames", "serverNames", "bitExprs", "exprs", 
		"exprsWithParen", "expr", "exprRecursive", "booleanPrimary", "comparisonOperator", 
		"predicate", "bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", 
		"caseExpress", "variable", "liter", "question", "number", "string", "subquery", 
		"orderByClause", "orderByItem", "createIndex", "alterIndex", "alterIndexName", 
		"renameIndex", "alterIndexDependsOnExtension", "alterIndexSetTableSpace", 
		"dropIndex", "createTable", "createTableHeader", "createDefinitions", 
		"createDefinition", "likeOption", "inheritClause", "alterTable", "alterTableNameWithAsterisk", 
		"alterTableOp", "alterTableActions", "alterTableAction", "tableConstraintUsingIndex", 
		"addColumn", "dropColumn", "modifyColumn", "alterColumn", "alterColumnSetOption", 
		"attributeOptions", "attributeOption", "addConstraint", "renameColumn", 
		"renameConstraint", "storageParameterWithValue", "storageParameter", "alterTableNameExists", 
		"renameTable", "dropTable", "truncateTable", "tableNameParts", "tableNamePart", 
		"setTransaction", "transactionMode", "commit", "rollback", "savepoint", 
		"beginTransaction", "startTransaction", "workOrTransaction", "grant", 
		"privType", "privOnClause", "fdwName", "fdwNames", "argMode", "argName", 
		"langName", "langNames", "loid", "loids", "roleSpecification", "roleSpecifications", 
		"grantRole", "revoke", "revokeRole", "createUser", "roleOption", "roleOptions", 
		"alterUser", "renameUser", "alterUserSetConfig", "configName", "alterUserConfigOp", 
		"alterUserResetConfig", "dropUser", "createRole", "alterRole", "renameRole", 
		"alterRoleSetConfig", "alterRoleConfigOp", "alterRoleResetConfig", "dropRole", 
		"show", "setParam", "scope", "setClause", "timeZoneType", "resetParam"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Default does not match anything'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", "'!='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'_'", "'?'", 
		"'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ACTION", "ADMIN", "ARRAY", "BEGIN", "BIT", "BRIN", "BTREE", 
		"BYPASSRLS", "CACHE", "CAST", "CHARACTER", "CHARACTERISTICS", "CLUSTER", 
		"COLLATE", "COMMENTS", "CONCURRENTLY", "CONNECT", "CONNECTION", "CONSTRAINTS", 
		"CREATEDB", "CREATEROLE", "CURRENT_TIMESTAMP", "CURRENT_USER", "CYCLE", 
		"DATA", "DATABASE", "DEFAULTS", "DEFERRABLE", "DEFERRED", "DEPENDS", "DOMAIN", 
		"DOUBLE", "ENCRYPTED", "EXCLUDING", "EXECUTE", "EXTENDED", "EXTENSION", 
		"EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", "FULL", 
		"FUNCTIONS", "GIN", "GIST", "GLOBAL", "HASH", "HOUR", "IDENTITY", "IF", 
		"IMMEDIATE", "INCLUDING", "INCREMENT", "INDEXES", "INHERIT", "INHERITS", 
		"INITIALLY", "INOUT", "INSERT", "LANGUAGE", "LARGE", "LAST", "LOCAL", 
		"LOGGED", "LOGIN", "MAIN", "MATCH", "MAXVALUE", "MINUTE", "MINVALUE", 
		"MONTH", "NOBYPASSRLS", "NOCREATEDB", "NOCREATEROLE", "NOINHERIT", "NOLOGIN", 
		"NOREPLICATION", "NOSUPERUSER", "NOTHING", "NULLS", "OBJECT", "OF", "OIDS", 
		"ONLY", "OUT", "OVER", "OWNED", "OWNER", "PARTIAL", "PLAIN", "PRECEDING", 
		"PRECISION", "PREPARED", "PROCEDURE", "PROCEDURES", "PUBLIC", "RANGE", 
		"RENAME", "REPEATABLE", "REPLICA", "REPLICATION", "RESET", "RESTART", 
		"RESTRICT", "ROUTINE", "ROUTINES", "RULE", "SAVEPOINT", "SCHEMA", "SECOND", 
		"SECURITY", "SELECT", "SEQUENCE", "SEQUENCES", "SERVER", "SESSION", "SESSION_USER", 
		"SHOW", "SIMPLE", "SNAPSHOT", "SPGIST", "STATISTICS", "STORAGE", "SUPERUSER", 
		"SYSID", "TABLES", "TABLESPACE", "TEMP", "TEMPORARY", "TRIGGER", "TYPE", 
		"UNBOUNDED", "UNCOMMITTED", "UNLOGGED", "UNTIL", "UPDATE", "USAGE", "USING", 
		"VALID", "VALIDATE", "VARIADIC", "VARYING", "WITHIN", "WITHOUT", "WRAPPER", 
		"WRITE", "ZONE", "AND_", "OR_", "NOT_", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", 
		"BIT_AND", "SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", 
		"MOD_", "COLON", "PLUS", "MINUS", "ASTERISK", "SLASH", "BACKSLASH", "DOT", 
		"DOT_ASTERISK", "SAFE_EQ", "EQ", "EQ_", "NEQ", "NEQ_", "GT", "GTE", "LT", 
		"LTE", "POUND_", "LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA", 
		"DQ_", "SQ_", "BQ_", "UL_", "QUESTION", "AT_", "SEMI_", "ALL", "AND", 
		"ANY", "ASC", "BETWEEN", "BINARY", "BIT_NUM", "BY", "DATE", "DESC", "DISTINCT", 
		"ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", "HAVING", "HIDDEN_", "IN", 
		"IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", "NULL", "OFFSET", "OR", "ORDER", 
		"PARTITION", "PRIMARY", "REGEXP", "ROLLUP", "ROW", "SET", "SOUNDS", "TIME", 
		"TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", "XOR", "ADD", 
		"ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", "COMMITTED", 
		"CONSTRAINT", "CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", "DISABLE", 
		"DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", "GRANT", 
		"INDEX", "ISOLATION", "LEVEL", "NO", "ON", "OPTION", "PASSWORD", "PRIVILEGES", 
		"READ", "REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "SERIALIZABLE", 
		"START", "TABLE", "TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "WORK", 
		"YEAR", "STRING", "NUMBER", "INT_", "EXP", "HEX_DIGIT", "WS", "ID", "BLOCK_COMMENT", 
		"SL_COMMENT"
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
	public String getGrammarFileName() { return "PostgreSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public StartTransactionContext startTransaction() {
			return getRuleContext(StartTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public GrantRoleContext grantRole() {
			return getRuleContext(GrantRoleContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public RevokeRoleContext revokeRole() {
			return getRuleContext(RevokeRoleContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public AlterUserSetConfigContext alterUserSetConfig() {
			return getRuleContext(AlterUserSetConfigContext.class,0);
		}
		public AlterUserResetConfigContext alterUserResetConfig() {
			return getRuleContext(AlterUserResetConfigContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public RenameRoleContext renameRole() {
			return getRuleContext(RenameRoleContext.class,0);
		}
		public AlterRoleSetConfigContext alterRoleSetConfig() {
			return getRuleContext(AlterRoleSetConfigContext.class,0);
		}
		public AlterRoleResetConfigContext alterRoleResetConfig() {
			return getRuleContext(AlterRoleResetConfigContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public SetParamContext setParam() {
			return getRuleContext(SetParamContext.class,0);
		}
		public ResetParamContext resetParam() {
			return getRuleContext(ResetParamContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(PostgreSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(404);
				createIndex();
				}
				break;
			case 2:
				{
				setState(405);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(406);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(407);
				createTable();
				}
				break;
			case 5:
				{
				setState(408);
				alterTable();
				}
				break;
			case 6:
				{
				setState(409);
				dropTable();
				}
				break;
			case 7:
				{
				setState(410);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(411);
				beginTransaction();
				}
				break;
			case 9:
				{
				setState(412);
				startTransaction();
				}
				break;
			case 10:
				{
				setState(413);
				commit();
				}
				break;
			case 11:
				{
				setState(414);
				rollback();
				}
				break;
			case 12:
				{
				setState(415);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(416);
				savepoint();
				}
				break;
			case 14:
				{
				setState(417);
				grant();
				}
				break;
			case 15:
				{
				setState(418);
				grantRole();
				}
				break;
			case 16:
				{
				setState(419);
				revoke();
				}
				break;
			case 17:
				{
				setState(420);
				revokeRole();
				}
				break;
			case 18:
				{
				setState(421);
				createUser();
				}
				break;
			case 19:
				{
				setState(422);
				alterUser();
				}
				break;
			case 20:
				{
				setState(423);
				renameUser();
				}
				break;
			case 21:
				{
				setState(424);
				alterUserSetConfig();
				}
				break;
			case 22:
				{
				setState(425);
				alterUserResetConfig();
				}
				break;
			case 23:
				{
				setState(426);
				dropUser();
				}
				break;
			case 24:
				{
				setState(427);
				createRole();
				}
				break;
			case 25:
				{
				setState(428);
				alterRole();
				}
				break;
			case 26:
				{
				setState(429);
				renameRole();
				}
				break;
			case 27:
				{
				setState(430);
				alterRoleSetConfig();
				}
				break;
			case 28:
				{
				setState(431);
				alterRoleResetConfig();
				}
				break;
			case 29:
				{
				setState(432);
				dropRole();
				}
				break;
			case 30:
				{
				setState(433);
				show();
				}
				break;
			case 31:
				{
				setState(434);
				setParam();
				}
				break;
			case 32:
				{
				setState(435);
				resetParam();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(438);
				match(SEMI_);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			columnName();
			setState(442);
			dataType();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(443);
				collateClause();
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (KEY - 213)) | (1L << (NOT - 213)) | (1L << (NULL - 213)) | (1L << (PRIMARY - 213)) | (1L << (CHECK - 213)) | (1L << (CONSTRAINT - 213)) | (1L << (DEFAULT - 213)) | (1L << (GENERATED - 213)) | (1L << (REFERENCES - 213)))) != 0) || _la==UNIQUE) {
				{
				{
				setState(446);
				columnConstraint();
				}
				}
				setState(451);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IntervalFieldsContext intervalFields() {
			return getRuleContext(IntervalFieldsContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataType);
		try {
			int _alt;
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				typeName();
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(453);
					intervalFields();
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(456);
					dataTypeLength();
					}
					break;
				}
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(459);
					match(WITHOUT);
					setState(460);
					match(TIME);
					setState(461);
					match(ZONE);
					}
					break;
				case 2:
					{
					setState(462);
					match(WITH);
					setState(463);
					match(TIME);
					setState(464);
					match(ZONE);
					}
					break;
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(467);
						match(LBT_);
						setState(468);
						match(RBT_);
						}
						} 
					}
					setState(473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(ID);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(PostgreSQLStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PostgreSQLStatementParser.PRECISION, 0); }
		public TerminalNode CHARACTER() { return getToken(PostgreSQLStatementParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(PostgreSQLStatementParser.VARYING, 0); }
		public TerminalNode BIT() { return getToken(PostgreSQLStatementParser.BIT, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeName);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(DOUBLE);
				setState(478);
				match(PRECISION);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(CHARACTER);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(480);
					match(VARYING);
					}
					break;
				}
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(BIT);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(484);
					match(VARYING);
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(ID);
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

	public static class TypeNamesContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TypeNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNames; }
	}

	public final TypeNamesContext typeNames() throws RecognitionException {
		TypeNamesContext _localctx = new TypeNamesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeName();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(491);
				match(COMMA);
				setState(492);
				typeName();
				}
				}
				setState(497);
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

	public static class IntervalFieldsContext extends ParserRuleContext {
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IntervalFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalFields; }
	}

	public final IntervalFieldsContext intervalFields() throws RecognitionException {
		IntervalFieldsContext _localctx = new IntervalFieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intervalFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			intervalField();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(499);
				match(TO);
				setState(500);
				intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(PostgreSQLStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLStatementParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLStatementParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (HOUR - 51)) | (1L << (MINUTE - 51)) | (1L << (MONTH - 51)) | (1L << (SECOND - 51)))) != 0) || _la==DAY || _la==YEAR) ) {
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

	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(COLLATE);
			setState(506);
			collationName();
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

	public static class UsingIndexTypeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(PostgreSQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(PostgreSQLStatementParser.HASH, 0); }
		public TerminalNode GIST() { return getToken(PostgreSQLStatementParser.GIST, 0); }
		public TerminalNode SPGIST() { return getToken(PostgreSQLStatementParser.SPGIST, 0); }
		public TerminalNode GIN() { return getToken(PostgreSQLStatementParser.GIN, 0); }
		public TerminalNode BRIN() { return getToken(PostgreSQLStatementParser.BRIN, 0); }
		public UsingIndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexType; }
	}

	public final UsingIndexTypeContext usingIndexType() throws RecognitionException {
		UsingIndexTypeContext _localctx = new UsingIndexTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_usingIndexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(USING);
			setState(509);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRIN) | (1L << BTREE) | (1L << GIN) | (1L << GIST) | (1L << HASH))) != 0) || _la==SPGIST) ) {
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintOptionContext columnConstraintOption() {
			return getRuleContext(ColumnConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(511);
				constraintClause();
				}
			}

			setState(514);
			columnConstraintOption();
			setState(515);
			constraintOptionalParam();
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

	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(CONSTRAINT);
			setState(518);
			constraintName();
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

	public static class ColumnConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraintOption; }
	}

	public final ColumnConstraintOptionContext columnConstraintOption() throws RecognitionException {
		ColumnConstraintOptionContext _localctx = new ColumnConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnConstraintOption);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(520);
					match(NOT);
					}
				}

				setState(523);
				match(NULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				checkOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(DEFAULT);
				setState(526);
				defaultExpr();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				match(GENERATED);
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(528);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					setState(529);
					match(BY);
					setState(530);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(533);
				match(AS);
				setState(534);
				match(IDENTITY);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(535);
					match(LP_);
					setState(536);
					sequenceOptions();
					setState(537);
					match(RP_);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(UNIQUE);
				setState(542);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 6);
				{
				setState(543);
				primaryKey();
				setState(544);
				indexParameters();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				match(REFERENCES);
				setState(547);
				tableName();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(548);
					match(LP_);
					setState(549);
					columnName();
					setState(550);
					match(RP_);
					}
				}

				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(554);
					match(MATCH);
					setState(555);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(556);
					match(MATCH);
					setState(557);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(558);
					match(MATCH);
					setState(559);
					match(SIMPLE);
					}
					break;
				}
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(562);
					match(ON);
					setState(563);
					match(DELETE);
					setState(564);
					action();
					}
					break;
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(567);
					foreignKeyOnAction();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CheckOptionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public CheckOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOption; }
	}

	public final CheckOptionContext checkOption() throws RecognitionException {
		CheckOptionContext _localctx = new CheckOptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(CHECK);
			setState(576);
			expr(0);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(577);
				match(NO);
				setState(578);
				match(INHERIT);
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

	public static class DefaultExprContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defaultExpr);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case T__0:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case LP_:
			case LBE_:
			case QUESTION:
			case BINARY:
			case BIT_NUM:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case STRING:
			case NUMBER:
			case HEX_DIGIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				expr(0);
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

	public static class SequenceOptionsContext extends ParserRuleContext {
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public SequenceOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOptions; }
	}

	public final SequenceOptionsContext sequenceOptions() throws RecognitionException {
		SequenceOptionsContext _localctx = new SequenceOptionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sequenceOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(585);
				sequenceOption();
				}
				}
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (CACHE - 10)) | (1L << (CYCLE - 10)) | (1L << (INCREMENT - 10)) | (1L << (MAXVALUE - 10)) | (1L << (MINVALUE - 10)))) != 0) || _la==NO || _la==START );
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

	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sequenceOption);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(START);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(591);
					match(WITH);
					}
				}

				setState(594);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(INCREMENT);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(596);
					match(BY);
					}
				}

				setState(599);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(MAXVALUE);
				setState(601);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				match(NO);
				setState(603);
				match(MAXVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				match(MINVALUE);
				setState(605);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
				match(NO);
				setState(607);
				match(MINVALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(608);
				match(CYCLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(609);
				match(NO);
				setState(610);
				match(CYCLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				match(CACHE);
				setState(612);
				match(NUMBER);
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

	public static class IndexParametersContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TablespaceNameContext tablespaceName() {
			return getRuleContext(TablespaceNameContext.class,0);
		}
		public IndexParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexParameters; }
	}

	public final IndexParametersContext indexParameters() throws RecognitionException {
		IndexParametersContext _localctx = new IndexParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(615);
				match(USING);
				setState(616);
				match(INDEX);
				setState(617);
				match(TABLESPACE);
				setState(618);
				tablespaceName();
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_action);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(NO);
				setState(622);
				match(ACTION);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(625);
				match(SET);
				setState(626);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ConstraintOptionalParamContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode INITIALLY() { return getToken(PostgreSQLStatementParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public ConstraintOptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptionalParam; }
	}

	public final ConstraintOptionalParamContext constraintOptionalParam() throws RecognitionException {
		ConstraintOptionalParamContext _localctx = new ConstraintOptionalParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraintOptionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(629);
					match(NOT);
					}
				}

				setState(632);
				match(DEFERRABLE);
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALLY) {
				{
				setState(635);
				match(INITIALLY);
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintOptionContext tableConstraintOption() {
			return getRuleContext(TableConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(639);
				constraintClause();
				}
			}

			setState(642);
			tableConstraintOption();
			setState(643);
			constraintOptionalParam();
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

	public static class TableConstraintOptionContext extends ParserRuleContext {
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintOption; }
	}

	public final TableConstraintOptionContext tableConstraintOption() throws RecognitionException {
		TableConstraintOptionContext _localctx = new TableConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableConstraintOption);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				checkOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(UNIQUE);
				setState(647);
				columnList();
				setState(648);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				primaryKey();
				setState(651);
				columnList();
				setState(652);
				indexParameters();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				match(FOREIGN);
				setState(655);
				match(KEY);
				setState(656);
				columnList();
				setState(657);
				match(REFERENCES);
				setState(658);
				tableName();
				setState(659);
				columnList();
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(660);
					match(MATCH);
					setState(661);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(662);
					match(MATCH);
					setState(663);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(664);
					match(MATCH);
					setState(665);
					match(SIMPLE);
					}
					break;
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(668);
					foreignKeyOnAction();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_foreignKeyOnAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(ON);
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(677);
				match(UPDATE);
				setState(678);
				foreignKeyOn();
				}
				break;
			case DELETE:
				{
				setState(679);
				match(DELETE);
				setState(680);
				foreignKeyOn();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_foreignKeyOn);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(SET);
				setState(686);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				match(NO);
				setState(688);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				match(SET);
				setState(690);
				match(DEFAULT);
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

	public static class ExcludeElementContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpclassContext opclass() {
			return getRuleContext(OpclassContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public ExcludeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludeElement; }
	}

	public final ExcludeElementContext excludeElement() throws RecognitionException {
		ExcludeElementContext _localctx = new ExcludeElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_excludeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(693);
				columnName();
				}
				break;
			case 2:
				{
				setState(694);
				expr(0);
				}
				break;
			}
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(697);
				opclass();
				}
			}

			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(703);
				match(NULLS);
				setState(704);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public AggregateExpressionContext aggregateExpression() {
			return getRuleContext(AggregateExpressionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public ArrayConstructorWithCastContext arrayConstructorWithCast() {
			return getRuleContext(ArrayConstructorWithCastContext.class,0);
		}
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public ExtractFromFunctionContext extractFromFunction() {
			return getRuleContext(ExtractFromFunctionContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_privateExprOfDb);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				aggregateExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				windowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				arrayConstructorWithCast();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(710);
				match(TIMESTAMP);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(711);
					match(WITH);
					setState(712);
					match(TIME);
					setState(713);
					match(ZONE);
					}
				}

				setState(716);
				match(STRING);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(717);
				extractFromFunction();
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

	public static class PgExprContext extends ParserRuleContext {
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public CollateExprContext collateExpr() {
			return getRuleContext(CollateExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgExpr; }
	}

	public final PgExprContext pgExpr() throws RecognitionException {
		PgExprContext _localctx = new PgExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pgExpr);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				castExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				collateExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				expr(0);
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

	public static class AggregateExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public List<TerminalNode> LP_() { return getTokens(PostgreSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(PostgreSQLStatementParser.LP_, i);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(PostgreSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(PostgreSQLStatementParser.RP_, i);
		}
		public TerminalNode WITHIN() { return getToken(PostgreSQLStatementParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public AggregateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateExpression; }
	}

	public final AggregateExpressionContext aggregateExpression() throws RecognitionException {
		AggregateExpressionContext _localctx = new AggregateExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aggregateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(ID);
			{
			setState(726);
			match(LP_);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(730);
			exprs();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(731);
				orderByClause();
				}
			}

			setState(734);
			match(RP_);
			}
			setState(736);
			asteriskWithParen();
			{
			setState(737);
			match(LP_);
			setState(738);
			exprs();
			setState(739);
			match(RP_);
			setState(740);
			match(WITHIN);
			setState(741);
			match(GROUP);
			setState(742);
			match(LP_);
			setState(743);
			orderByClause();
			setState(744);
			match(RP_);
			}
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(746);
				filterClause();
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

	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(FILTER);
			setState(750);
			match(LP_);
			setState(751);
			match(WHERE);
			setState(752);
			booleanPrimary(0);
			setState(753);
			match(RP_);
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

	public static class AsteriskWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode ASTERISK() { return getToken(PostgreSQLStatementParser.ASTERISK, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public AsteriskWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskWithParen; }
	}

	public final AsteriskWithParenContext asteriskWithParen() throws RecognitionException {
		AsteriskWithParenContext _localctx = new AsteriskWithParenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asteriskWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LP_);
			setState(756);
			match(ASTERISK);
			setState(757);
			match(RP_);
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

	public static class WindowFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public WindowFunctionWithClauseContext windowFunctionWithClause() {
			return getRuleContext(WindowFunctionWithClauseContext.class,0);
		}
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(ID);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(760);
				exprsWithParen();
				}
				break;
			case 2:
				{
				setState(761);
				asteriskWithParen();
				}
				break;
			}
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(764);
				filterClause();
				}
			}

			setState(767);
			windowFunctionWithClause();
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

	public static class WindowFunctionWithClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public WindowFunctionWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunctionWithClause; }
	}

	public final WindowFunctionWithClauseContext windowFunctionWithClause() throws RecognitionException {
		WindowFunctionWithClauseContext _localctx = new WindowFunctionWithClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_windowFunctionWithClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(OVER);
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(770);
				match(ID);
				}
				break;
			case LP_:
				{
				setState(771);
				match(LP_);
				setState(772);
				windowDefinition();
				setState(773);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public List<OrderByExprContext> orderByExpr() {
			return getRuleContexts(OrderByExprContext.class);
		}
		public OrderByExprContext orderByExpr(int i) {
			return getRuleContext(OrderByExprContext.class,i);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_windowDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(777);
				match(ID);
				}
			}

			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(780);
				match(PARTITION);
				setState(781);
				match(BY);
				setState(782);
				exprs();
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(785);
				orderByExpr();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(786);
					match(COMMA);
					setState(787);
					orderByExpr();
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(795);
				frameClause();
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

	public static class OrderByExprContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(ORDER);
			setState(799);
			match(BY);
			setState(800);
			expr(0);
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				{
				setState(801);
				match(ASC);
				}
				break;
			case DESC:
				{
				setState(802);
				match(DESC);
				}
				break;
			case USING:
				{
				setState(803);
				match(USING);
				setState(804);
				operator();
				}
				break;
			case NULLS:
			case RANGE:
			case RP_:
			case COMMA:
			case ROWS:
				break;
			default:
				break;
			}
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(807);
				match(NULLS);
				setState(808);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SAFE_EQ() { return getToken(PostgreSQLStatementParser.SAFE_EQ, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode NEQ() { return getToken(PostgreSQLStatementParser.NEQ, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public TerminalNode GT() { return getToken(PostgreSQLStatementParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PostgreSQLStatementParser.GTE, 0); }
		public TerminalNode LT() { return getToken(PostgreSQLStatementParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PostgreSQLStatementParser.LTE, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if ( !(((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (AND_ - 151)) | (1L << (OR_ - 151)) | (1L << (NOT_ - 151)) | (1L << (SAFE_EQ - 151)) | (1L << (EQ_ - 151)) | (1L << (NEQ - 151)) | (1L << (NEQ_ - 151)) | (1L << (GT - 151)) | (1L << (GTE - 151)) | (1L << (LT - 151)) | (1L << (LTE - 151)))) != 0)) ) {
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

	public static class FrameClauseContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_frameClause);
		int _la;
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(814);
				frameStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(816);
				match(BETWEEN);
				setState(817);
				frameStart();
				setState(818);
				match(AND);
				setState(819);
				frameEnd();
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

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_frameStart);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(UNBOUNDED);
				setState(824);
				match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(NUMBER);
				setState(826);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				match(CURRENT);
				setState(828);
				match(ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				match(NUMBER);
				setState(830);
				match(FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				match(UNBOUNDED);
				setState(832);
				match(FOLLOWING);
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

	public static class FrameEndContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd; }
	}

	public final FrameEndContext frameEnd() throws RecognitionException {
		FrameEndContext _localctx = new FrameEndContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			frameStart();
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(PostgreSQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COLON() { return getTokens(PostgreSQLStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PostgreSQLStatementParser.COLON, i);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_castExpr);
		try {
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				match(CAST);
				setState(838);
				match(LP_);
				setState(839);
				expr(0);
				setState(840);
				match(AS);
				setState(841);
				dataType();
				setState(842);
				match(RP_);
				}
				break;
			case T__0:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case LP_:
			case LBE_:
			case QUESTION:
			case BINARY:
			case BIT_NUM:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case STRING:
			case NUMBER:
			case HEX_DIGIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				expr(0);
				setState(845);
				match(COLON);
				setState(846);
				match(COLON);
				setState(847);
				dataType();
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

	public static class CastExprWithColonContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(PostgreSQLStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PostgreSQLStatementParser.COLON, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public CastExprWithColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExprWithColon; }
	}

	public final CastExprWithColonContext castExprWithColon() throws RecognitionException {
		CastExprWithColonContext _localctx = new CastExprWithColonContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_castExprWithColon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(COLON);
			setState(852);
			match(COLON);
			setState(853);
			dataType();
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(854);
					match(LBT_);
					setState(855);
					match(RBT_);
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class CollateExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateExpr; }
	}

	public final CollateExprContext collateExpr() throws RecognitionException {
		CollateExprContext _localctx = new CollateExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_collateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			expr(0);
			setState(862);
			match(COLLATE);
			setState(863);
			expr(0);
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

	public static class ArrayConstructorWithCastContext extends ParserRuleContext {
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public CastExprWithColonContext castExprWithColon() {
			return getRuleContext(CastExprWithColonContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public ArrayConstructorWithCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructorWithCast; }
	}

	public final ArrayConstructorWithCastContext arrayConstructorWithCast() throws RecognitionException {
		ArrayConstructorWithCastContext _localctx = new ArrayConstructorWithCastContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayConstructorWithCast);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				arrayConstructor();
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(866);
					castExprWithColon();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(ARRAY);
				setState(870);
				match(LBT_);
				setState(871);
				match(RBT_);
				setState(872);
				castExprWithColon();
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

	public static class ArrayConstructorContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public List<ArrayConstructorContext> arrayConstructor() {
			return getRuleContexts(ArrayConstructorContext.class);
		}
		public ArrayConstructorContext arrayConstructor(int i) {
			return getRuleContext(ArrayConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayConstructor);
		int _la;
		try {
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				match(ARRAY);
				setState(876);
				match(LBT_);
				setState(877);
				exprs();
				setState(878);
				match(RBT_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(ARRAY);
				setState(881);
				match(LBT_);
				setState(882);
				arrayConstructor();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(883);
					match(COMMA);
					setState(884);
					arrayConstructor();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(890);
				match(RBT_);
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

	public static class ExtractFromFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(PostgreSQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> ID() { return getTokens(PostgreSQLStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSQLStatementParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExtractFromFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFromFunction; }
	}

	public final ExtractFromFunctionContext extractFromFunction() throws RecognitionException {
		ExtractFromFunctionContext _localctx = new ExtractFromFunctionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_extractFromFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(EXTRACT);
			setState(895);
			match(LP_);
			setState(896);
			match(ID);
			setState(897);
			match(FROM);
			setState(898);
			match(ID);
			setState(899);
			match(RP_);
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(ID);
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

	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(ID);
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

	public static class DomainNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(ID);
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
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(ID);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(ID);
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

	public static class SequenceNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public SequenceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceName; }
	}

	public final SequenceNameContext sequenceName() throws RecognitionException {
		SequenceNameContext _localctx = new SequenceNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sequenceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(ID);
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

	public static class TablespaceNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TablespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceName; }
	}

	public final TablespaceNameContext tablespaceName() throws RecognitionException {
		TablespaceNameContext _localctx = new TablespaceNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tablespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(ID);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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

	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(ID);
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
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(ID);
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

	public static class CteNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(ID);
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

	public static class ParserNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ParserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserName; }
	}

	public final ParserNameContext parserName() throws RecognitionException {
		ParserNameContext _localctx = new ParserNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parserName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(ID);
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

	public static class ExtensionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionName; }
	}

	public final ExtensionNameContext extensionName() throws RecognitionException {
		ExtensionNameContext _localctx = new ExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_extensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(ID);
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

	public static class RowNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public RowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowName; }
	}

	public final RowNameContext rowName() throws RecognitionException {
		RowNameContext _localctx = new RowNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_rowName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(ID);
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

	public static class OpclassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public OpclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opclass; }
	}

	public final OpclassContext opclass() throws RecognitionException {
		OpclassContext _localctx = new OpclassContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_opclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(ID);
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

	public static class FileGroupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(ID);
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

	public static class GroupNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(ID);
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

	public static class ConstraintNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(ID);
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

	public static class KeyNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public KeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyName; }
	}

	public final KeyNameContext keyName() throws RecognitionException {
		KeyNameContext _localctx = new KeyNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_keyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(ID);
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

	public static class XmlSchemaCollectionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public XmlSchemaCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlSchemaCollection; }
	}

	public final XmlSchemaCollectionContext xmlSchemaCollection() throws RecognitionException {
		XmlSchemaCollectionContext _localctx = new XmlSchemaCollectionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_xmlSchemaCollection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(ID);
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

	public static class ColumnSetNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ColumnSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetName; }
	}

	public final ColumnSetNameContext columnSetName() throws RecognitionException {
		ColumnSetNameContext _localctx = new ColumnSetNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_columnSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(ID);
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

	public static class DirectoryNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public DirectoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryName; }
	}

	public final DirectoryNameContext directoryName() throws RecognitionException {
		DirectoryNameContext _localctx = new DirectoryNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_directoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(ID);
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

	public static class TriggerNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_triggerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(ID);
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

	public static class RoutineNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(ID);
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

	public static class RoleNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_roleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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

	public static class PartitionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(ID);
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

	public static class RewriteRuleNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public RewriteRuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteRuleName; }
	}

	public final RewriteRuleNameContext rewriteRuleName() throws RecognitionException {
		RewriteRuleNameContext _localctx = new RewriteRuleNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rewriteRuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(ID);
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

	public static class OwnerNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public OwnerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerName; }
	}

	public final OwnerNameContext ownerName() throws RecognitionException {
		OwnerNameContext _localctx = new OwnerNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ownerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(ID);
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

	public static class UserNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_userName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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

	public static class ServerNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_serverName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(ID);
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PostgreSQLStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PostgreSQLStatementParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(PostgreSQLStatementParser.COMMA, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(LP_);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(962);
				match(NUMBER);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(963);
					match(COMMA);
					setState(964);
					match(NUMBER);
					}
				}

				}
			}

			setState(969);
			match(RP_);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(971);
				match(PRIMARY);
				}
			}

			setState(974);
			match(KEY);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T__0);
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

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PostgreSQLStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSQLStatementParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(ID);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(979);
				match(COMMA);
				setState(980);
				match(ID);
				}
				}
				setState(985);
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

	public static class IdListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_idList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(LP_);
			setState(987);
			ids();
			setState(988);
			match(RP_);
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

	public static class RangeClauseContext extends ParserRuleContext {
		public List<RangeItemContext> rangeItem() {
			return getRuleContexts(RangeItemContext.class);
		}
		public RangeItemContext rangeItem(int i) {
			return getRuleContext(RangeItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(PostgreSQLStatementParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rangeClause);
		int _la;
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				rangeItem();
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(991);
					match(COMMA);
					setState(992);
					rangeItem();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				rangeItem();
				setState(999);
				match(OFFSET);
				setState(1000);
				rangeItem();
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

	public static class RangeItemContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public RangeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeItem; }
	}

	public final RangeItemContext rangeItem() throws RecognitionException {
		RangeItemContext _localctx = new RangeItemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_rangeItem);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				number();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				question();
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

	public static class SchemaNamesContext extends ParserRuleContext {
		public List<SchemaNameContext> schemaName() {
			return getRuleContexts(SchemaNameContext.class);
		}
		public SchemaNameContext schemaName(int i) {
			return getRuleContext(SchemaNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public SchemaNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaNames; }
	}

	public final SchemaNamesContext schemaNames() throws RecognitionException {
		SchemaNamesContext _localctx = new SchemaNamesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_schemaNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			schemaName();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1009);
				match(COMMA);
				setState(1010);
				schemaName();
				}
				}
				setState(1015);
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

	public static class DatabaseNamesContext extends ParserRuleContext {
		public List<DatabaseNameContext> databaseName() {
			return getRuleContexts(DatabaseNameContext.class);
		}
		public DatabaseNameContext databaseName(int i) {
			return getRuleContext(DatabaseNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public DatabaseNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseNames; }
	}

	public final DatabaseNamesContext databaseNames() throws RecognitionException {
		DatabaseNamesContext _localctx = new DatabaseNamesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_databaseNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			databaseName();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1017);
				match(COMMA);
				setState(1018);
				databaseName();
				}
				}
				setState(1023);
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

	public static class DomainNamesContext extends ParserRuleContext {
		public List<DomainNameContext> domainName() {
			return getRuleContexts(DomainNameContext.class);
		}
		public DomainNameContext domainName(int i) {
			return getRuleContext(DomainNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public DomainNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainNames; }
	}

	public final DomainNamesContext domainNames() throws RecognitionException {
		DomainNamesContext _localctx = new DomainNamesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_domainNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			domainName();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1025);
				match(COMMA);
				setState(1026);
				domainName();
				}
				}
				setState(1031);
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

	public static class TableListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tableList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(LP_);
			setState(1033);
			tableNames();
			setState(1034);
			match(RP_);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			tableName();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1037);
				match(COMMA);
				setState(1038);
				tableName();
				}
				}
				setState(1043);
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

	public static class ColumnNamesWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ColumnNamesWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesWithParen; }
	}

	public final ColumnNamesWithParenContext columnNamesWithParen() throws RecognitionException {
		ColumnNamesWithParenContext _localctx = new ColumnNamesWithParenContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_columnNamesWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(LP_);
			setState(1045);
			columnNames();
			setState(1046);
			match(RP_);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			columnName();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1049);
				match(COMMA);
				setState(1050);
				columnName();
				}
				}
				setState(1055);
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

	public static class ColumnListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_columnList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(LP_);
			setState(1057);
			columnNames();
			setState(1058);
			match(RP_);
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

	public static class SequenceNamesContext extends ParserRuleContext {
		public List<SequenceNameContext> sequenceName() {
			return getRuleContexts(SequenceNameContext.class);
		}
		public SequenceNameContext sequenceName(int i) {
			return getRuleContext(SequenceNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public SequenceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceNames; }
	}

	public final SequenceNamesContext sequenceNames() throws RecognitionException {
		SequenceNamesContext _localctx = new SequenceNamesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_sequenceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			sequenceName();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1061);
				match(COMMA);
				setState(1062);
				sequenceName();
				}
				}
				setState(1067);
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

	public static class TablespaceNamesContext extends ParserRuleContext {
		public List<TablespaceNameContext> tablespaceName() {
			return getRuleContexts(TablespaceNameContext.class);
		}
		public TablespaceNameContext tablespaceName(int i) {
			return getRuleContext(TablespaceNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TablespaceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceNames; }
	}

	public final TablespaceNamesContext tablespaceNames() throws RecognitionException {
		TablespaceNamesContext _localctx = new TablespaceNamesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_tablespaceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			tablespaceName();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1069);
				match(COMMA);
				setState(1070);
				tablespaceName();
				}
				}
				setState(1075);
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

	public static class IndexNamesContext extends ParserRuleContext {
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			indexName();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1077);
				match(COMMA);
				setState(1078);
				indexName();
				}
				}
				setState(1083);
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

	public static class IndexListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_indexList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(LP_);
			setState(1085);
			indexNames();
			setState(1086);
			match(RP_);
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

	public static class RowNamesContext extends ParserRuleContext {
		public List<RowNameContext> rowName() {
			return getRuleContexts(RowNameContext.class);
		}
		public RowNameContext rowName(int i) {
			return getRuleContext(RowNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public RowNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowNames; }
	}

	public final RowNamesContext rowNames() throws RecognitionException {
		RowNamesContext _localctx = new RowNamesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_rowNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			rowName();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1089);
				match(COMMA);
				setState(1090);
				rowName();
				}
				}
				setState(1095);
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

	public static class RoleNamesContext extends ParserRuleContext {
		public List<RoleNameContext> roleName() {
			return getRuleContexts(RoleNameContext.class);
		}
		public RoleNameContext roleName(int i) {
			return getRuleContext(RoleNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public RoleNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleNames; }
	}

	public final RoleNamesContext roleNames() throws RecognitionException {
		RoleNamesContext _localctx = new RoleNamesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_roleNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			roleName();
			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1097);
					match(COMMA);
					setState(1098);
					roleName();
					}
					} 
				}
				setState(1103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class UserNamesContext extends ParserRuleContext {
		public List<UserNameContext> userName() {
			return getRuleContexts(UserNameContext.class);
		}
		public UserNameContext userName(int i) {
			return getRuleContext(UserNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public UserNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userNames; }
	}

	public final UserNamesContext userNames() throws RecognitionException {
		UserNamesContext _localctx = new UserNamesContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_userNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			userName();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1105);
				match(COMMA);
				setState(1106);
				userName();
				}
				}
				setState(1111);
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

	public static class ServerNamesContext extends ParserRuleContext {
		public List<ServerNameContext> serverName() {
			return getRuleContexts(ServerNameContext.class);
		}
		public ServerNameContext serverName(int i) {
			return getRuleContext(ServerNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public ServerNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverNames; }
	}

	public final ServerNamesContext serverNames() throws RecognitionException {
		ServerNamesContext _localctx = new ServerNamesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_serverNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			serverName();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1113);
				match(COMMA);
				setState(1114);
				serverName();
				}
				}
				setState(1119);
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

	public static class BitExprsContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public BitExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExprs; }
	}

	public final BitExprsContext bitExprs() throws RecognitionException {
		BitExprsContext _localctx = new BitExprsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_bitExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			bitExpr(0);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121);
				match(COMMA);
				setState(1122);
				bitExpr(0);
				}
				}
				setState(1127);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			expr(0);
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1129);
				match(COMMA);
				setState(1130);
				expr(0);
				}
				}
				setState(1135);
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

	public static class ExprsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsWithParen; }
	}

	public final ExprsWithParenContext exprsWithParen() throws RecognitionException {
		ExprsWithParenContext _localctx = new ExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_exprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(LP_);
			setState(1137);
			exprs();
			setState(1138);
			match(RP_);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(PostgreSQLStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1141);
				match(LP_);
				setState(1142);
				expr(0);
				setState(1143);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1145);
				match(NOT);
				setState(1146);
				expr(6);
				}
				break;
			case 3:
				{
				setState(1147);
				match(NOT_);
				setState(1148);
				expr(5);
				}
				break;
			case 4:
				{
				setState(1149);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(1150);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1154);
						match(AND);
						setState(1155);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1157);
						match(AND_);
						setState(1158);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1160);
						match(XOR);
						setState(1161);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1163);
						match(OR);
						setState(1164);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1166);
						match(OR_);
						setState(1167);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class ExprRecursiveContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			matchNone();
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(PostgreSQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ() { return getToken(PostgreSQLStatementParser.SAFE_EQ, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1176);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1179);
						match(IS);
						setState(1181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1180);
							match(NOT);
							}
						}

						setState(1183);
						_la = _input.LA(1);
						if ( !(((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (FALSE - 206)) | (1L << (NULL - 206)) | (1L << (TRUE - 206)) | (1L << (UNKNOWN - 206)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1185);
						match(SAFE_EQ);
						setState(1186);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1188);
						comparisonOperator();
						setState(1189);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1192);
						comparisonOperator();
						setState(1193);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1194);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode GTE() { return getToken(PostgreSQLStatementParser.GTE, 0); }
		public TerminalNode GT() { return getToken(PostgreSQLStatementParser.GT, 0); }
		public TerminalNode LTE() { return getToken(PostgreSQLStatementParser.LTE, 0); }
		public TerminalNode LT() { return getToken(PostgreSQLStatementParser.LT, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public TerminalNode NEQ() { return getToken(PostgreSQLStatementParser.NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			_la = _input.LA(1);
			if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (EQ_ - 171)) | (1L << (NEQ - 171)) | (1L << (NEQ_ - 171)) | (1L << (GT - 171)) | (1L << (GTE - 171)) | (1L << (LT - 171)) | (1L << (LTE - 171)))) != 0)) ) {
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

	public static class PredicateContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(PostgreSQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(PostgreSQLStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(PostgreSQLStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(PostgreSQLStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				bitExpr(0);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1204);
					match(NOT);
					}
				}

				setState(1207);
				match(IN);
				setState(1208);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				bitExpr(0);
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1211);
					match(NOT);
					}
				}

				setState(1214);
				match(IN);
				setState(1215);
				match(LP_);
				setState(1216);
				simpleExpr(0);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1217);
					match(COMMA);
					setState(1218);
					simpleExpr(0);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1224);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				bitExpr(0);
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1227);
					match(NOT);
					}
				}

				setState(1230);
				match(BETWEEN);
				setState(1231);
				simpleExpr(0);
				setState(1232);
				match(AND);
				setState(1233);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1235);
				bitExpr(0);
				setState(1236);
				match(SOUNDS);
				setState(1237);
				match(LIKE);
				setState(1238);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1240);
				bitExpr(0);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1241);
					match(NOT);
					}
				}

				setState(1244);
				match(LIKE);
				setState(1245);
				simpleExpr(0);
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1246);
						match(ESCAPE);
						setState(1247);
						simpleExpr(0);
						}
						} 
					}
					setState(1252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1253);
				bitExpr(0);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1254);
					match(NOT);
					}
				}

				setState(1257);
				match(REGEXP);
				setState(1258);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1260);
				bitExpr(0);
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

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode BIT_INCLUSIVE_OR() { return getToken(PostgreSQLStatementParser.BIT_INCLUSIVE_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(PostgreSQLStatementParser.BIT_AND, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT() { return getToken(PostgreSQLStatementParser.SIGNED_LEFT_SHIFT, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT() { return getToken(PostgreSQLStatementParser.SIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode PLUS() { return getToken(PostgreSQLStatementParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSQLStatementParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(PostgreSQLStatementParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(PostgreSQLStatementParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(PostgreSQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(PostgreSQLStatementParser.MOD_, 0); }
		public TerminalNode BIT_EXCLUSIVE_OR() { return getToken(PostgreSQLStatementParser.BIT_EXCLUSIVE_OR, 0); }
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1264);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1266);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1267);
						match(BIT_INCLUSIVE_OR);
						setState(1268);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1269);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1270);
						match(BIT_AND);
						setState(1271);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1272);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1273);
						match(SIGNED_LEFT_SHIFT);
						setState(1274);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1275);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1276);
						match(SIGNED_RIGHT_SHIFT);
						setState(1277);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1279);
						match(PLUS);
						setState(1280);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1282);
						match(MINUS);
						setState(1283);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1284);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1285);
						match(ASTERISK);
						setState(1286);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1287);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1288);
						match(SLASH);
						setState(1289);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1291);
						match(MOD);
						setState(1292);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1294);
						match(MOD_);
						setState(1295);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1297);
						match(BIT_EXCLUSIVE_OR);
						setState(1298);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1300);
						match(PLUS);
						setState(1301);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1303);
						match(MINUS);
						setState(1304);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiterContext liter() {
			return getRuleContext(LiterContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PostgreSQLStatementParser.PLUS, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(PostgreSQLStatementParser.MINUS, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(PostgreSQLStatementParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(PostgreSQLStatementParser.BINARY, 0); }
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1311);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1312);
				liter();
				}
				break;
			case 3:
				{
				setState(1313);
				columnName();
				}
				break;
			case 4:
				{
				setState(1314);
				variable();
				}
				break;
			case 5:
				{
				setState(1315);
				match(PLUS);
				setState(1316);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1317);
				match(MINUS);
				setState(1318);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1319);
				match(UNARY_BIT_COMPLEMENT);
				setState(1320);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1321);
				match(NOT_);
				setState(1322);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1323);
				match(BINARY);
				setState(1324);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1325);
				exprsWithParen();
				}
				break;
			case 11:
				{
				setState(1326);
				match(ROW);
				setState(1327);
				exprsWithParen();
				}
				break;
			case 12:
				{
				setState(1328);
				subquery();
				}
				break;
			case 13:
				{
				setState(1329);
				match(EXISTS);
				setState(1330);
				subquery();
				}
				break;
			case 14:
				{
				setState(1331);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1332);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1333);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1336);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1337);
						match(AND_);
						setState(1338);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1339);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1340);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(PostgreSQLStatementParser.ASTERISK, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(ID);
			setState(1347);
			match(LP_);
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1348);
				distinct();
				}
			}

			setState(1353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case LP_:
			case LBE_:
			case QUESTION:
			case BINARY:
			case BIT_NUM:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case STRING:
			case NUMBER:
			case HEX_DIGIT:
			case ID:
				{
				setState(1351);
				exprs();
				}
				break;
			case ASTERISK:
				{
				setState(1352);
				match(ASTERISK);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1355);
			match(RP_);
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(DISTINCT);
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

	public static class IntervalExprContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public IntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpr; }
	}

	public final IntervalExprContext intervalExpr() throws RecognitionException {
		IntervalExprContext _localctx = new IntervalExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			matchNone();
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

	public static class CaseExpressContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CaseExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpress; }
	}

	public final CaseExpressContext caseExpress() throws RecognitionException {
		CaseExpressContext _localctx = new CaseExpressContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			matchNone();
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

	public static class VariableContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			matchNone();
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

	public static class LiterContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(PostgreSQLStatementParser.LBE_, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode RBE_() { return getToken(PostgreSQLStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT() { return getToken(PostgreSQLStatementParser.HEX_DIGIT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(PostgreSQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM() { return getToken(PostgreSQLStatementParser.BIT_NUM, 0); }
		public LiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liter; }
	}

	public final LiterContext liter() throws RecognitionException {
		LiterContext _localctx = new LiterContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_liter);
		int _la;
		try {
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1367);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1368);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1369);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1370);
				match(LBE_);
				setState(1371);
				match(ID);
				setState(1372);
				match(STRING);
				setState(1373);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1374);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1375);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1376);
				match(ID);
				setState(1377);
				match(STRING);
				setState(1379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1378);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1381);
				_la = _input.LA(1);
				if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DATE - 201)) | (1L << (TIME - 201)) | (1L << (TIMESTAMP - 201)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1382);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1383);
					match(ID);
					}
				}

				setState(1386);
				match(BIT_NUM);
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1387);
					collateClause();
					}
					break;
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(PostgreSQLStatementParser.QUESTION, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(QUESTION);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(NUMBER);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(STRING);
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

	public static class SubqueryContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			matchNone();
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
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(ORDER);
			setState(1401);
			match(BY);
			setState(1402);
			orderByItem();
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1403);
				match(COMMA);
				setState(1404);
				orderByItem();
				}
				}
				setState(1409);
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

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1410);
				columnName();
				}
				break;
			case 2:
				{
				setState(1411);
				number();
				}
				break;
			case 3:
				{
				setState(1412);
				expr(0);
				}
				break;
			}
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1415);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			match(CREATE);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1419);
				match(UNIQUE);
				}
			}

			setState(1422);
			match(INDEX);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1423);
				match(CONCURRENTLY);
				}
			}

			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==ID) {
				{
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1426);
					match(IF);
					setState(1427);
					match(NOT);
					setState(1428);
					match(EXISTS);
					}
				}

				setState(1431);
				indexName();
				}
			}

			setState(1434);
			match(ON);
			setState(1435);
			tableName();
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

	public static class AlterIndexContext extends ParserRuleContext {
		public AlterIndexNameContext alterIndexName() {
			return getRuleContext(AlterIndexNameContext.class,0);
		}
		public RenameIndexContext renameIndex() {
			return getRuleContext(RenameIndexContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() {
			return getRuleContext(AlterIndexDependsOnExtensionContext.class,0);
		}
		public AlterIndexSetTableSpaceContext alterIndexSetTableSpace() {
			return getRuleContext(AlterIndexSetTableSpaceContext.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_alterIndex);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				alterIndexName();
				setState(1438);
				renameIndex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				alterIndexDependsOnExtension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				alterIndexSetTableSpace();
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

	public static class AlterIndexNameContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterIndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexName; }
	}

	public final AlterIndexNameContext alterIndexName() throws RecognitionException {
		AlterIndexNameContext _localctx = new AlterIndexNameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_alterIndexName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(ALTER);
			setState(1445);
			match(INDEX);
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1446);
				match(IF);
				setState(1447);
				match(EXISTS);
				}
			}

			setState(1450);
			indexName();
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

	public static class RenameIndexContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndex; }
	}

	public final RenameIndexContext renameIndex() throws RecognitionException {
		RenameIndexContext _localctx = new RenameIndexContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_renameIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(RENAME);
			setState(1453);
			match(TO);
			setState(1454);
			indexName();
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

	public static class AlterIndexDependsOnExtensionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public ExtensionNameContext extensionName() {
			return getRuleContext(ExtensionNameContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDependsOnExtension; }
	}

	public final AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() throws RecognitionException {
		AlterIndexDependsOnExtensionContext _localctx = new AlterIndexDependsOnExtensionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_alterIndexDependsOnExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(ALTER);
			setState(1457);
			match(INDEX);
			setState(1458);
			indexName();
			setState(1459);
			match(DEPENDS);
			setState(1460);
			match(ON);
			setState(1461);
			match(EXTENSION);
			setState(1462);
			extensionName();
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

	public static class AlterIndexSetTableSpaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public RowNamesContext rowNames() {
			return getRuleContext(RowNamesContext.class,0);
		}
		public AlterIndexSetTableSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexSetTableSpace; }
	}

	public final AlterIndexSetTableSpaceContext alterIndexSetTableSpace() throws RecognitionException {
		AlterIndexSetTableSpaceContext _localctx = new AlterIndexSetTableSpaceContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_alterIndexSetTableSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(ALTER);
			setState(1465);
			match(INDEX);
			setState(1466);
			match(ALL);
			setState(1467);
			match(IN);
			setState(1468);
			match(TABLESPACE);
			setState(1469);
			indexName();
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(1470);
				match(OWNED);
				setState(1471);
				match(BY);
				setState(1472);
				rowNames();
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(DROP);
			setState(1476);
			match(INDEX);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1477);
				match(CONCURRENTLY);
				}
			}

			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1480);
				match(IF);
				setState(1481);
				match(EXISTS);
				}
			}

			setState(1484);
			indexNames();
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public InheritClauseContext inheritClause() {
			return getRuleContext(InheritClauseContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			createTableHeader();
			setState(1487);
			createDefinitions();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(1488);
				inheritClause();
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(CREATE);
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case LOCAL:
			case TEMP:
			case TEMPORARY:
				{
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1492);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1495);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNLOGGED:
				{
				setState(1496);
				match(UNLOGGED);
				}
				break;
			case TABLE:
				break;
			default:
				break;
			}
			setState(1499);
			match(TABLE);
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1500);
				match(IF);
				setState(1501);
				match(NOT);
				setState(1502);
				match(EXISTS);
				}
			}

			setState(1505);
			tableName();
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(LP_);
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (KEY - 213)) | (1L << (LIKE - 213)) | (1L << (PRIMARY - 213)) | (1L << (CHECK - 213)) | (1L << (CONSTRAINT - 213)) | (1L << (FOREIGN - 213)))) != 0) || _la==UNIQUE || _la==ID) {
				{
				setState(1508);
				createDefinition();
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1509);
					match(COMMA);
					setState(1510);
					createDefinition();
					}
					}
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1518);
			match(RP_);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_createDefinition);
		int _la;
		try {
			setState(1530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				columnDefinition();
				}
				break;
			case KEY:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				tableConstraint();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				match(LIKE);
				setState(1523);
				tableName();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(1524);
					likeOption();
					}
					}
					setState(1529);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_likeOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1533);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTS) | (1L << CONSTRAINTS) | (1L << DEFAULTS) | (1L << IDENTITY) | (1L << INDEXES))) != 0) || _la==STATISTICS || _la==STORAGE || _la==ALL) ) {
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

	public static class InheritClauseContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public InheritClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClause; }
	}

	public final InheritClauseContext inheritClause() throws RecognitionException {
		InheritClauseContext _localctx = new InheritClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_inheritClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(INHERITS);
			setState(1536);
			match(LP_);
			setState(1537);
			tableName();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1538);
				match(COMMA);
				setState(1539);
				tableName();
				}
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1545);
			match(RP_);
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

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() {
			return getRuleContext(AlterTableNameWithAsteriskContext.class,0);
		}
		public AlterTableActionsContext alterTableActions() {
			return getRuleContext(AlterTableActionsContext.class,0);
		}
		public RenameColumnContext renameColumn() {
			return getRuleContext(RenameColumnContext.class,0);
		}
		public RenameConstraintContext renameConstraint() {
			return getRuleContext(RenameConstraintContext.class,0);
		}
		public AlterTableNameExistsContext alterTableNameExists() {
			return getRuleContext(AlterTableNameExistsContext.class,0);
		}
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_alterTable);
		try {
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				alterTableNameWithAsterisk();
				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1548);
					alterTableActions();
					}
					break;
				case 2:
					{
					setState(1549);
					renameColumn();
					}
					break;
				case 3:
					{
					setState(1550);
					renameConstraint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				alterTableNameExists();
				setState(1554);
				renameTable();
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

	public static class AlterTableNameWithAsteriskContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TerminalNode ASTERISK() { return getToken(PostgreSQLStatementParser.ASTERISK, 0); }
		public AlterTableNameWithAsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameWithAsterisk; }
	}

	public final AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() throws RecognitionException {
		AlterTableNameWithAsteriskContext _localctx = new AlterTableNameWithAsteriskContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_alterTableNameWithAsterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			match(ALTER);
			setState(1559);
			match(TABLE);
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1560);
				match(IF);
				setState(1561);
				match(EXISTS);
				}
			}

			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1564);
				match(ONLY);
				}
			}

			setState(1567);
			tableName();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(1568);
				match(ASTERISK);
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

	public static class AlterTableOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public AlterTableOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOp; }
	}

	public final AlterTableOpContext alterTableOp() throws RecognitionException {
		AlterTableOpContext _localctx = new AlterTableOpContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_alterTableOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(ALTER);
			setState(1572);
			match(TABLE);
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

	public static class AlterTableActionsContext extends ParserRuleContext {
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public AlterTableActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableActions; }
	}

	public final AlterTableActionsContext alterTableActions() throws RecognitionException {
		AlterTableActionsContext _localctx = new AlterTableActionsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alterTableActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			alterTableAction();
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1575);
				match(COMMA);
				setState(1576);
				alterTableAction();
				}
				}
				setState(1581);
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

	public static class AlterTableActionContext extends ParserRuleContext {
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TriggerNameContext triggerName() {
			return getRuleContext(TriggerNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public RewriteRuleNameContext rewriteRuleName() {
			return getRuleContext(RewriteRuleNameContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TablespaceNameContext tablespaceName() {
			return getRuleContext(TablespaceNameContext.class,0);
		}
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<StorageParameterWithValueContext> storageParameterWithValue() {
			return getRuleContexts(StorageParameterWithValueContext.class);
		}
		public StorageParameterWithValueContext storageParameterWithValue(int i) {
			return getRuleContext(StorageParameterWithValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public List<StorageParameterContext> storageParameter() {
			return getRuleContexts(StorageParameterContext.class);
		}
		public StorageParameterContext storageParameter(int i) {
			return getRuleContext(StorageParameterContext.class,i);
		}
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public OwnerNameContext ownerName() {
			return getRuleContext(OwnerNameContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterTableAction);
		int _la;
		try {
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				addColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583);
				dropColumn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1584);
				modifyColumn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1585);
				addConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1586);
				match(ALTER);
				setState(1587);
				match(CONSTRAINT);
				setState(1588);
				constraintName();
				setState(1589);
				constraintOptionalParam();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1591);
				match(VALIDATE);
				setState(1592);
				match(CONSTRAINT);
				setState(1593);
				constraintName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1594);
				match(DROP);
				setState(1595);
				match(CONSTRAINT);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1596);
					match(IF);
					setState(1597);
					match(EXISTS);
					}
				}

				setState(1600);
				constraintName();
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESTRICT || _la==CASCADE) {
					{
					setState(1601);
					_la = _input.LA(1);
					if ( !(_la==RESTRICT || _la==CASCADE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1604);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1605);
				match(TRIGGER);
				setState(1609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1606);
					triggerName();
					}
					break;
				case ALL:
					{
					setState(1607);
					match(ALL);
					}
					break;
				case USER:
					{
					setState(1608);
					match(USER);
					}
					break;
				case EOF:
				case COMMA:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1611);
				match(ENABLE);
				setState(1612);
				_la = _input.LA(1);
				if ( !(_la==REPLICA || _la==ALWAYS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1613);
				match(TRIGGER);
				setState(1614);
				triggerName();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1616);
				match(RULE);
				setState(1617);
				rewriteRuleName();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1618);
				match(ENABLE);
				setState(1619);
				_la = _input.LA(1);
				if ( !(_la==REPLICA || _la==ALWAYS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1620);
				match(RULE);
				setState(1621);
				rewriteRuleName();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISABLE:
					{
					setState(1622);
					match(DISABLE);
					}
					break;
				case ENABLE:
					{
					setState(1623);
					match(ENABLE);
					}
					break;
				case FORCE:
				case NO:
					{
					{
					setState(1625);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(1624);
						match(NO);
						}
					}

					setState(1627);
					match(FORCE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1630);
				match(ROW);
				setState(1631);
				match(LEVEL);
				setState(1632);
				match(SECURITY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1633);
				match(CLUSTER);
				setState(1634);
				match(ON);
				setState(1635);
				indexName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1636);
				match(SET);
				setState(1637);
				match(WITHOUT);
				setState(1638);
				match(CLUSTER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1639);
				match(SET);
				setState(1640);
				_la = _input.LA(1);
				if ( !(_la==WITHOUT || _la==WITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1641);
				match(OIDS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1642);
				match(SET);
				setState(1643);
				match(TABLESPACE);
				setState(1644);
				tablespaceName();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1645);
				match(SET);
				setState(1646);
				_la = _input.LA(1);
				if ( !(_la==LOGGED || _la==UNLOGGED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1647);
				match(SET);
				setState(1648);
				match(LP_);
				setState(1649);
				storageParameterWithValue();
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1650);
					match(COMMA);
					setState(1651);
					storageParameterWithValue();
					}
					}
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1657);
				match(RP_);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1659);
				match(RESET);
				setState(1660);
				match(LP_);
				setState(1661);
				storageParameter();
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1662);
					match(COMMA);
					setState(1663);
					storageParameter();
					}
					}
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1669);
				match(RP_);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1671);
				match(INHERIT);
				setState(1672);
				tableName();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1673);
				match(NO);
				setState(1674);
				match(INHERIT);
				setState(1675);
				tableName();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1676);
				match(OF);
				setState(1677);
				typeName();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1678);
				match(NOT);
				setState(1679);
				match(OF);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1680);
				match(OWNER);
				setState(1681);
				match(TO);
				setState(1685);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1682);
					ownerName();
					}
					break;
				case CURRENT_USER:
					{
					setState(1683);
					match(CURRENT_USER);
					}
					break;
				case SESSION_USER:
					{
					setState(1684);
					match(SESSION_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1687);
				match(REPLICA);
				setState(1688);
				match(IDENTITY);
				setState(1695);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(1689);
					match(DEFAULT);
					}
					break;
				case USING:
					{
					{
					setState(1690);
					match(USING);
					setState(1691);
					match(INDEX);
					setState(1692);
					indexName();
					}
					}
					break;
				case FULL:
					{
					setState(1693);
					match(FULL);
					}
					break;
				case NOTHING:
					{
					setState(1694);
					match(NOTHING);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class TableConstraintUsingIndexContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TableConstraintUsingIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintUsingIndex; }
	}

	public final TableConstraintUsingIndexContext tableConstraintUsingIndex() throws RecognitionException {
		TableConstraintUsingIndexContext _localctx = new TableConstraintUsingIndexContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_tableConstraintUsingIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1699);
				match(CONSTRAINT);
				setState(1700);
				constraintName();
				}
			}

			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1703);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(1704);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1707);
			match(USING);
			setState(1708);
			match(INDEX);
			setState(1709);
			indexName();
			setState(1710);
			constraintOptionalParam();
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

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_addColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(ADD);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1713);
				match(COLUMN);
				}
			}

			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1716);
				match(IF);
				setState(1717);
				match(NOT);
				setState(1718);
				match(EXISTS);
				}
			}

			setState(1721);
			columnDefinition();
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_dropColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(DROP);
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1724);
				match(COLUMN);
				}
			}

			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1727);
				match(IF);
				setState(1728);
				match(EXISTS);
				}
			}

			setState(1731);
			columnName();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTRICT || _la==CASCADE) {
				{
				setState(1732);
				_la = _input.LA(1);
				if ( !(_la==RESTRICT || _la==CASCADE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ModifyColumnContext extends ParserRuleContext {
		public AlterColumnContext alterColumn() {
			return getRuleContext(AlterColumnContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<AlterColumnSetOptionContext> alterColumnSetOption() {
			return getRuleContexts(AlterColumnSetOptionContext.class);
		}
		public AlterColumnSetOptionContext alterColumnSetOption(int i) {
			return getRuleContext(AlterColumnSetOptionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public AttributeOptionsContext attributeOptions() {
			return getRuleContext(AttributeOptionsContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_modifyColumn);
		int _la;
		try {
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				alterColumn();
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1736);
					match(SET);
					setState(1737);
					match(DATA);
					}
				}

				setState(1740);
				match(TYPE);
				setState(1741);
				dataType();
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1742);
					collateClause();
					}
				}

				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1745);
					match(USING);
					setState(1746);
					simpleExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1749);
				alterColumn();
				setState(1750);
				match(SET);
				setState(1751);
				match(DEFAULT);
				setState(1752);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1754);
				alterColumn();
				setState(1755);
				match(DROP);
				setState(1756);
				match(DEFAULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1758);
				alterColumn();
				setState(1759);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1760);
				match(NOT);
				setState(1761);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1763);
				alterColumn();
				setState(1764);
				match(ADD);
				setState(1765);
				match(GENERATED);
				setState(1769);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1766);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					{
					setState(1767);
					match(BY);
					setState(1768);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1771);
				match(AS);
				setState(1772);
				match(IDENTITY);
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1773);
					match(LP_);
					setState(1774);
					sequenceOptions();
					setState(1775);
					match(RP_);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1779);
				alterColumn();
				setState(1780);
				alterColumnSetOption();
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTART || _la==SET) {
					{
					{
					setState(1781);
					alterColumnSetOption();
					}
					}
					setState(1786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1787);
				alterColumn();
				setState(1788);
				match(DROP);
				setState(1789);
				match(IDENTITY);
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1790);
					match(IF);
					setState(1791);
					match(EXISTS);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1794);
				alterColumn();
				setState(1795);
				match(SET);
				setState(1796);
				match(STATISTICS);
				setState(1797);
				match(NUMBER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1799);
				alterColumn();
				setState(1800);
				match(SET);
				setState(1801);
				match(LP_);
				setState(1802);
				attributeOptions();
				setState(1803);
				match(RP_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1805);
				alterColumn();
				setState(1806);
				match(RESET);
				setState(1807);
				match(LP_);
				setState(1808);
				attributeOptions();
				setState(1809);
				match(RP_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1811);
				alterColumn();
				setState(1812);
				match(SET);
				setState(1813);
				match(STORAGE);
				setState(1814);
				_la = _input.LA(1);
				if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (EXTENDED - 37)) | (1L << (EXTERNAL - 37)) | (1L << (MAIN - 37)) | (1L << (PLAIN - 37)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class AlterColumnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public AlterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumn; }
	}

	public final AlterColumnContext alterColumn() throws RecognitionException {
		AlterColumnContext _localctx = new AlterColumnContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_alterColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(ALTER);
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1819);
				match(COLUMN);
				}
			}

			setState(1822);
			columnName();
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

	public static class AlterColumnSetOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public SequenceOptionContext sequenceOption() {
			return getRuleContext(SequenceOptionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public AlterColumnSetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnSetOption; }
	}

	public final AlterColumnSetOptionContext alterColumnSetOption() throws RecognitionException {
		AlterColumnSetOptionContext _localctx = new AlterColumnSetOptionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_alterColumnSetOption);
		int _la;
		try {
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				match(SET);
				setState(1832);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(1825);
					match(GENERATED);
					setState(1829);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALWAYS:
						{
						setState(1826);
						match(ALWAYS);
						}
						break;
					case BY:
						{
						setState(1827);
						match(BY);
						setState(1828);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case CACHE:
				case CYCLE:
				case INCREMENT:
				case MAXVALUE:
				case MINVALUE:
				case NO:
				case START:
					{
					setState(1831);
					sequenceOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(1834);
				match(RESTART);
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==NUMBER) {
					{
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1835);
						match(WITH);
						}
					}

					setState(1838);
					match(NUMBER);
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

	public static class AttributeOptionsContext extends ParserRuleContext {
		public List<AttributeOptionContext> attributeOption() {
			return getRuleContexts(AttributeOptionContext.class);
		}
		public AttributeOptionContext attributeOption(int i) {
			return getRuleContext(AttributeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public AttributeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOptions; }
	}

	public final AttributeOptionsContext attributeOptions() throws RecognitionException {
		AttributeOptionsContext _localctx = new AttributeOptionsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_attributeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			attributeOption();
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1844);
				match(COMMA);
				setState(1845);
				attributeOption();
				}
				}
				setState(1850);
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

	public static class AttributeOptionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public AttributeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOption; }
	}

	public final AttributeOptionContext attributeOption() throws RecognitionException {
		AttributeOptionContext _localctx = new AttributeOptionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_attributeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(ID);
			setState(1852);
			match(EQ_);
			setState(1853);
			simpleExpr(0);
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

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableConstraintUsingIndexContext tableConstraintUsingIndex() {
			return getRuleContext(TableConstraintUsingIndexContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_addConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(ADD);
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1856);
				tableConstraint();
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1857);
					match(NOT);
					setState(1858);
					match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(1861);
				tableConstraintUsingIndex();
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

	public static class RenameColumnContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public RenameColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumn; }
	}

	public final RenameColumnContext renameColumn() throws RecognitionException {
		RenameColumnContext _localctx = new RenameColumnContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_renameColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			match(RENAME);
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1865);
				match(COLUMN);
				}
			}

			setState(1868);
			columnName();
			setState(1869);
			match(TO);
			setState(1870);
			columnName();
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

	public static class RenameConstraintContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public List<ConstraintNameContext> constraintName() {
			return getRuleContexts(ConstraintNameContext.class);
		}
		public ConstraintNameContext constraintName(int i) {
			return getRuleContext(ConstraintNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraint; }
	}

	public final RenameConstraintContext renameConstraint() throws RecognitionException {
		RenameConstraintContext _localctx = new RenameConstraintContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_renameConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			match(RENAME);
			setState(1873);
			match(CONSTRAINT);
			setState(1874);
			constraintName();
			setState(1875);
			match(TO);
			setState(1876);
			constraintName();
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

	public static class StorageParameterWithValueContext extends ParserRuleContext {
		public StorageParameterContext storageParameter() {
			return getRuleContext(StorageParameterContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public StorageParameterWithValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameterWithValue; }
	}

	public final StorageParameterWithValueContext storageParameterWithValue() throws RecognitionException {
		StorageParameterWithValueContext _localctx = new StorageParameterWithValueContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_storageParameterWithValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			storageParameter();
			setState(1879);
			match(EQ_);
			setState(1880);
			simpleExpr(0);
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

	public static class StorageParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public StorageParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameter; }
	}

	public final StorageParameterContext storageParameter() throws RecognitionException {
		StorageParameterContext _localctx = new StorageParameterContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_storageParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			match(ID);
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

	public static class AlterTableNameExistsContext extends ParserRuleContext {
		public AlterTableOpContext alterTableOp() {
			return getRuleContext(AlterTableOpContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterTableNameExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameExists; }
	}

	public final AlterTableNameExistsContext alterTableNameExists() throws RecognitionException {
		AlterTableNameExistsContext _localctx = new AlterTableNameExistsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_alterTableNameExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			alterTableOp();
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1885);
				match(IF);
				setState(1886);
				match(EXISTS);
				}
			}

			setState(1889);
			tableName();
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

	public static class RenameTableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public RenameTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTable; }
	}

	public final RenameTableContext renameTable() throws RecognitionException {
		RenameTableContext _localctx = new RenameTableContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_renameTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(RENAME);
			setState(1892);
			match(TO);
			setState(1893);
			tableName();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(DROP);
			setState(1896);
			match(TABLE);
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1897);
				match(IF);
				setState(1898);
				match(EXISTS);
				}
			}

			setState(1901);
			tableNames();
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TableNamePartsContext tableNameParts() {
			return getRuleContext(TableNamePartsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(TRUNCATE);
			setState(1905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1904);
				match(TABLE);
				}
			}

			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1907);
				match(ONLY);
				}
			}

			setState(1910);
			tableNameParts();
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

	public static class TableNamePartsContext extends ParserRuleContext {
		public List<TableNamePartContext> tableNamePart() {
			return getRuleContexts(TableNamePartContext.class);
		}
		public TableNamePartContext tableNamePart(int i) {
			return getRuleContext(TableNamePartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TableNamePartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameParts; }
	}

	public final TableNamePartsContext tableNameParts() throws RecognitionException {
		TableNamePartsContext _localctx = new TableNamePartsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_tableNameParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			tableNamePart();
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1913);
				match(COMMA);
				setState(1914);
				tableNamePart();
				}
				}
				setState(1919);
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

	public static class TableNamePartContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(PostgreSQLStatementParser.ASTERISK, 0); }
		public TableNamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNamePart; }
	}

	public final TableNamePartContext tableNamePart() throws RecognitionException {
		TableNamePartContext _localctx = new TableNamePartContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_tableNamePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			tableName();
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(1921);
				match(ASTERISK);
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public TerminalNode SNAPSHOT() { return getToken(PostgreSQLStatementParser.SNAPSHOT, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_setTransaction);
		int _la;
		try {
			setState(1951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				match(SET);
				setState(1925);
				match(TRANSACTION);
				setState(1936);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFERRABLE:
				case NOT:
				case ISOLATION:
				case READ:
					{
					setState(1926);
					transactionMode();
					setState(1931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1927);
						match(COMMA);
						setState(1928);
						transactionMode();
						}
						}
						setState(1933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case SNAPSHOT:
					{
					setState(1934);
					match(SNAPSHOT);
					setState(1935);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				match(SET);
				setState(1939);
				match(SESSION);
				setState(1940);
				match(CHARACTERISTICS);
				setState(1941);
				match(AS);
				setState(1942);
				match(TRANSACTION);
				setState(1943);
				transactionMode();
				setState(1948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1944);
					match(COMMA);
					setState(1945);
					transactionMode();
					}
					}
					setState(1950);
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(PostgreSQLStatementParser.SERIALIZABLE, 0); }
		public TerminalNode REPEATABLE() { return getToken(PostgreSQLStatementParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(PostgreSQLStatementParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(PostgreSQLStatementParser.COMMITTED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(PostgreSQLStatementParser.UNCOMMITTED, 0); }
		public TerminalNode WRITE() { return getToken(PostgreSQLStatementParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_transactionMode);
		int _la;
		try {
			setState(1970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				match(ISOLATION);
				setState(1954);
				match(LEVEL);
				setState(1962);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1955);
					match(SERIALIZABLE);
					}
					break;
				case 2:
					{
					setState(1956);
					match(REPEATABLE);
					setState(1957);
					match(READ);
					}
					break;
				case 3:
					{
					setState(1958);
					match(READ);
					setState(1959);
					match(COMMITTED);
					}
					break;
				case 4:
					{
					setState(1960);
					match(READ);
					setState(1961);
					match(UNCOMMITTED);
					}
					break;
				}
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964);
				match(READ);
				setState(1965);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DEFERRABLE:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1966);
					match(NOT);
					}
				}

				setState(1969);
				match(DEFERRABLE);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public WorkOrTransactionContext workOrTransaction() {
			return getRuleContext(WorkOrTransactionContext.class,0);
		}
		public TerminalNode PREPARED() { return getToken(PostgreSQLStatementParser.PREPARED, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_commit);
		int _la;
		try {
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1972);
				match(COMMIT);
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(1973);
					workOrTransaction();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				match(COMMIT);
				setState(1977);
				match(PREPARED);
				setState(1978);
				match(ID);
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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public TerminalNode PREPARED() { return getToken(PostgreSQLStatementParser.PREPARED, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public WorkOrTransactionContext workOrTransaction() {
			return getRuleContext(WorkOrTransactionContext.class,0);
		}
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_rollback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			match(ROLLBACK);
			setState(1995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(1982);
					workOrTransaction();
					}
				}

				}
				break;
			case 2:
				{
				setState(1985);
				match(PREPARED);
				setState(1986);
				match(ID);
				}
				break;
			case 3:
				{
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(1987);
					workOrTransaction();
					}
				}

				setState(1990);
				match(TO);
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(1991);
					match(SAVEPOINT);
					}
				}

				setState(1994);
				match(ID);
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

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(SAVEPOINT);
			setState(1998);
			match(ID);
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public WorkOrTransactionContext workOrTransaction() {
			return getRuleContext(WorkOrTransactionContext.class,0);
		}
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(BEGIN);
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(2001);
				workOrTransaction();
				}
			}

			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFERRABLE || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NOT - 217)) | (1L << (ISOLATION - 217)) | (1L << (READ - 217)))) != 0)) {
				{
				setState(2004);
				transactionMode();
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2005);
					match(COMMA);
					setState(2006);
					transactionMode();
					}
					}
					setState(2011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StartTransactionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public WorkOrTransactionContext workOrTransaction() {
			return getRuleContext(WorkOrTransactionContext.class,0);
		}
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public StartTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTransaction; }
	}

	public final StartTransactionContext startTransaction() throws RecognitionException {
		StartTransactionContext _localctx = new StartTransactionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_startTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			match(START);
			setState(2015);
			match(TRANSACTION);
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(2016);
				workOrTransaction();
				}
			}

			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFERRABLE || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NOT - 217)) | (1L << (ISOLATION - 217)) | (1L << (READ - 217)))) != 0)) {
				{
				setState(2019);
				transactionMode();
				setState(2024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2020);
					match(COMMA);
					setState(2021);
					transactionMode();
					}
					}
					setState(2026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class WorkOrTransactionContext extends ParserRuleContext {
		public TerminalNode WORK() { return getToken(PostgreSQLStatementParser.WORK, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public WorkOrTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workOrTransaction; }
	}

	public final WorkOrTransactionContext workOrTransaction() throws RecognitionException {
		WorkOrTransactionContext _localctx = new WorkOrTransactionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_workOrTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==WORK) ) {
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

	public static class GrantContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(PostgreSQLStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(PostgreSQLStatementParser.GRANT, i);
		}
		public List<PrivTypeContext> privType() {
			return getRuleContexts(PrivTypeContext.class);
		}
		public PrivTypeContext privType(int i) {
			return getRuleContext(PrivTypeContext.class,i);
		}
		public PrivOnClauseContext privOnClause() {
			return getRuleContext(PrivOnClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RoleSpecificationsContext roleSpecifications() {
			return getRuleContext(RoleSpecificationsContext.class,0);
		}
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(GRANT);
			setState(2032);
			privType();
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2033);
				columnList();
				}
			}

			setState(2043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2036);
				match(COMMA);
				setState(2037);
				privType();
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2038);
					columnList();
					}
				}

				}
				}
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2046);
			privOnClause();
			setState(2047);
			match(TO);
			setState(2048);
			roleSpecifications();
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2049);
				match(WITH);
				setState(2050);
				match(GRANT);
				setState(2051);
				match(OPTION);
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

	public static class PrivTypeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLStatementParser.CONNECT, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public PrivTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privType; }
	}

	public final PrivTypeContext privType() throws RecognitionException {
		PrivTypeContext _localctx = new PrivTypeContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_privType);
		int _la;
		try {
			setState(2071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2054);
				match(ALL);
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2055);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2059);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2060);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2061);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2062);
				match(TRUNCATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(2063);
				match(REFERENCES);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(2064);
				match(TRIGGER);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2065);
				match(CREATE);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2066);
				match(CONNECT);
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 11);
				{
				setState(2067);
				match(TEMPORARY);
				}
				break;
			case TEMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(2068);
				match(TEMP);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2069);
				match(EXECUTE);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 14);
				{
				setState(2070);
				match(USAGE);
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

	public static class PrivOnClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode TABLES() { return getToken(PostgreSQLStatementParser.TABLES, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public SchemaNamesContext schemaNames() {
			return getRuleContext(SchemaNamesContext.class,0);
		}
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public SequenceNamesContext sequenceNames() {
			return getRuleContext(SequenceNamesContext.class,0);
		}
		public TerminalNode SEQUENCES() { return getToken(PostgreSQLStatementParser.SEQUENCES, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public DatabaseNamesContext databaseNames() {
			return getRuleContext(DatabaseNamesContext.class,0);
		}
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public DomainNamesContext domainNames() {
			return getRuleContext(DomainNamesContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public TerminalNode WRAPPER() { return getToken(PostgreSQLStatementParser.WRAPPER, 0); }
		public FdwNamesContext fdwNames() {
			return getRuleContext(FdwNamesContext.class,0);
		}
		public TerminalNode SERVER() { return getToken(PostgreSQLStatementParser.SERVER, 0); }
		public ServerNamesContext serverNames() {
			return getRuleContext(ServerNamesContext.class,0);
		}
		public List<RoutineNameContext> routineName() {
			return getRuleContexts(RoutineNameContext.class);
		}
		public RoutineNameContext routineName(int i) {
			return getRuleContext(RoutineNameContext.class,i);
		}
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public LangNamesContext langNames() {
			return getRuleContext(LangNamesContext.class,0);
		}
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public LoidsContext loids() {
			return getRuleContext(LoidsContext.class,0);
		}
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TablespaceNamesContext tablespaceNames() {
			return getRuleContext(TablespaceNamesContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TypeNamesContext typeNames() {
			return getRuleContext(TypeNamesContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode FUNCTIONS() { return getToken(PostgreSQLStatementParser.FUNCTIONS, 0); }
		public TerminalNode PROCEDURES() { return getToken(PostgreSQLStatementParser.PROCEDURES, 0); }
		public TerminalNode ROUTINES() { return getToken(PostgreSQLStatementParser.ROUTINES, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public List<TerminalNode> LP_() { return getTokens(PostgreSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(PostgreSQLStatementParser.LP_, i);
		}
		public List<TerminalNode> RP_() { return getTokens(PostgreSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(PostgreSQLStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<ArgModeContext> argMode() {
			return getRuleContexts(ArgModeContext.class);
		}
		public ArgModeContext argMode(int i) {
			return getRuleContext(ArgModeContext.class,i);
		}
		public List<ArgNameContext> argName() {
			return getRuleContexts(ArgNameContext.class);
		}
		public ArgNameContext argName(int i) {
			return getRuleContext(ArgNameContext.class,i);
		}
		public PrivOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privOnClause; }
	}

	public final PrivOnClauseContext privOnClause() throws RecognitionException {
		PrivOnClauseContext _localctx = new PrivOnClauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_privOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(ON);
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(2074);
					match(TABLE);
					}
				}

				setState(2077);
				tableNames();
				}
				break;
			case 2:
				{
				setState(2078);
				match(ALL);
				setState(2079);
				match(TABLES);
				setState(2080);
				match(IN);
				setState(2081);
				match(SCHEMA);
				setState(2082);
				schemaNames();
				}
				break;
			case 3:
				{
				setState(2083);
				match(SEQUENCE);
				setState(2084);
				sequenceNames();
				}
				break;
			case 4:
				{
				setState(2085);
				match(ALL);
				setState(2086);
				match(SEQUENCES);
				setState(2087);
				match(IN);
				setState(2088);
				match(SCHEMA);
				setState(2089);
				schemaNames();
				}
				break;
			case 5:
				{
				setState(2090);
				match(DATABASE);
				setState(2091);
				databaseNames();
				}
				break;
			case 6:
				{
				setState(2092);
				match(DOMAIN);
				setState(2093);
				domainNames();
				}
				break;
			case 7:
				{
				setState(2094);
				match(FOREIGN);
				setState(2095);
				match(DATA);
				setState(2096);
				match(WRAPPER);
				setState(2097);
				fdwNames();
				}
				break;
			case 8:
				{
				setState(2098);
				match(FOREIGN);
				setState(2099);
				match(SERVER);
				setState(2100);
				serverNames();
				}
				break;
			case 9:
				{
				setState(2101);
				_la = _input.LA(1);
				if ( !(_la==PROCEDURE || _la==ROUTINE || _la==FUNCTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2102);
				routineName();
				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2103);
					match(LP_);
					setState(2124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << INOUT))) != 0) || _la==OUT || _la==VARIADIC || _la==IN || _la==ID) {
						{
						setState(2105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INOUT || _la==OUT || _la==VARIADIC || _la==IN) {
							{
							setState(2104);
							argMode();
							}
						}

						setState(2108);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
						case 1:
							{
							setState(2107);
							argName();
							}
							break;
						}
						setState(2110);
						dataType();
						setState(2121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2111);
							match(COMMA);
							setState(2113);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==INOUT || _la==OUT || _la==VARIADIC || _la==IN) {
								{
								setState(2112);
								argMode();
								}
							}

							setState(2116);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
							case 1:
								{
								setState(2115);
								argName();
								}
								break;
							}
							setState(2118);
							dataType();
							}
							}
							setState(2123);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2126);
					match(RP_);
					}
				}

				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2129);
					match(COMMA);
					setState(2130);
					routineName();
					setState(2155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(2131);
						match(LP_);
						setState(2152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << INOUT))) != 0) || _la==OUT || _la==VARIADIC || _la==IN || _la==ID) {
							{
							setState(2133);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==INOUT || _la==OUT || _la==VARIADIC || _la==IN) {
								{
								setState(2132);
								argMode();
								}
							}

							setState(2136);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
							case 1:
								{
								setState(2135);
								argName();
								}
								break;
							}
							setState(2138);
							dataType();
							setState(2149);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(2139);
								match(COMMA);
								setState(2141);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==INOUT || _la==OUT || _la==VARIADIC || _la==IN) {
									{
									setState(2140);
									argMode();
									}
								}

								setState(2144);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
								case 1:
									{
									setState(2143);
									argName();
									}
									break;
								}
								setState(2146);
								dataType();
								}
								}
								setState(2151);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(2154);
						match(RP_);
						}
					}

					}
					}
					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 10:
				{
				setState(2162);
				match(ALL);
				setState(2163);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (FUNCTIONS - 46)) | (1L << (PROCEDURES - 46)) | (1L << (ROUTINES - 46)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2164);
				match(IN);
				setState(2165);
				match(SCHEMA);
				setState(2166);
				schemaNames();
				}
				break;
			case 11:
				{
				setState(2167);
				match(LANGUAGE);
				setState(2168);
				langNames();
				}
				break;
			case 12:
				{
				setState(2169);
				match(LARGE);
				setState(2170);
				match(OBJECT);
				setState(2171);
				loids();
				}
				break;
			case 13:
				{
				setState(2172);
				match(SCHEMA);
				setState(2173);
				schemaNames();
				}
				break;
			case 14:
				{
				setState(2174);
				match(TABLESPACE);
				setState(2175);
				tablespaceNames();
				}
				break;
			case 15:
				{
				setState(2176);
				match(TYPE);
				setState(2177);
				typeNames();
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

	public static class FdwNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public FdwNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdwName; }
	}

	public final FdwNameContext fdwName() throws RecognitionException {
		FdwNameContext _localctx = new FdwNameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_fdwName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			match(ID);
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

	public static class FdwNamesContext extends ParserRuleContext {
		public List<FdwNameContext> fdwName() {
			return getRuleContexts(FdwNameContext.class);
		}
		public FdwNameContext fdwName(int i) {
			return getRuleContext(FdwNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public FdwNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdwNames; }
	}

	public final FdwNamesContext fdwNames() throws RecognitionException {
		FdwNamesContext _localctx = new FdwNamesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fdwNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			fdwName();
			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2183);
				match(COMMA);
				setState(2184);
				fdwName();
				}
				}
				setState(2189);
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

	public static class ArgModeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode OUT() { return getToken(PostgreSQLStatementParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(PostgreSQLStatementParser.INOUT, 0); }
		public TerminalNode VARIADIC() { return getToken(PostgreSQLStatementParser.VARIADIC, 0); }
		public ArgModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argMode; }
	}

	public final ArgModeContext argMode() throws RecognitionException {
		ArgModeContext _localctx = new ArgModeContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_argMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			_la = _input.LA(1);
			if ( !(_la==INOUT || _la==OUT || _la==VARIADIC || _la==IN) ) {
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

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_argName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(ID);
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

	public static class LangNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public LangNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langName; }
	}

	public final LangNameContext langName() throws RecognitionException {
		LangNameContext _localctx = new LangNameContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_langName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			match(ID);
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

	public static class LangNamesContext extends ParserRuleContext {
		public List<LangNameContext> langName() {
			return getRuleContexts(LangNameContext.class);
		}
		public LangNameContext langName(int i) {
			return getRuleContext(LangNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public LangNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langNames; }
	}

	public final LangNamesContext langNames() throws RecognitionException {
		LangNamesContext _localctx = new LangNamesContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_langNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			langName();
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2197);
				match(COMMA);
				setState(2198);
				langName();
				}
				}
				setState(2203);
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

	public static class LoidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public LoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loid; }
	}

	public final LoidContext loid() throws RecognitionException {
		LoidContext _localctx = new LoidContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_loid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			match(ID);
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

	public static class LoidsContext extends ParserRuleContext {
		public List<LoidContext> loid() {
			return getRuleContexts(LoidContext.class);
		}
		public LoidContext loid(int i) {
			return getRuleContext(LoidContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public LoidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loids; }
	}

	public final LoidsContext loids() throws RecognitionException {
		LoidsContext _localctx = new LoidsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_loids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			loid();
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2207);
				match(COMMA);
				setState(2208);
				loid();
				}
				}
				setState(2213);
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

	public static class RoleSpecificationContext extends ParserRuleContext {
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public TerminalNode PUBLIC() { return getToken(PostgreSQLStatementParser.PUBLIC, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public RoleSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleSpecification; }
	}

	public final RoleSpecificationContext roleSpecification() throws RecognitionException {
		RoleSpecificationContext _localctx = new RoleSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_roleSpecification);
		int _la;
		try {
			setState(2221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(2214);
					match(GROUP);
					}
				}

				setState(2217);
				roleName();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				match(PUBLIC);
				}
				break;
			case CURRENT_USER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				match(CURRENT_USER);
				}
				break;
			case SESSION_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2220);
				match(SESSION_USER);
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

	public static class RoleSpecificationsContext extends ParserRuleContext {
		public List<RoleSpecificationContext> roleSpecification() {
			return getRuleContexts(RoleSpecificationContext.class);
		}
		public RoleSpecificationContext roleSpecification(int i) {
			return getRuleContext(RoleSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public RoleSpecificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleSpecifications; }
	}

	public final RoleSpecificationsContext roleSpecifications() throws RecognitionException {
		RoleSpecificationsContext _localctx = new RoleSpecificationsContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_roleSpecifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			roleSpecification();
			setState(2228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2224);
				match(COMMA);
				setState(2225);
				roleSpecification();
				}
				}
				setState(2230);
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

	public static class GrantRoleContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public List<RoleNamesContext> roleNames() {
			return getRuleContexts(RoleNamesContext.class);
		}
		public RoleNamesContext roleNames(int i) {
			return getRuleContext(RoleNamesContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public GrantRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRole; }
	}

	public final GrantRoleContext grantRole() throws RecognitionException {
		GrantRoleContext _localctx = new GrantRoleContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_grantRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			match(GRANT);
			setState(2232);
			roleNames();
			setState(2233);
			match(TO);
			setState(2234);
			roleNames();
			setState(2238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2235);
				match(WITH);
				setState(2236);
				match(ADMIN);
				setState(2237);
				match(OPTION);
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public List<PrivTypeContext> privType() {
			return getRuleContexts(PrivTypeContext.class);
		}
		public PrivTypeContext privType(int i) {
			return getRuleContext(PrivTypeContext.class,i);
		}
		public PrivOnClauseContext privOnClause() {
			return getRuleContext(PrivOnClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public RoleSpecificationsContext roleSpecifications() {
			return getRuleContext(RoleSpecificationsContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(REVOKE);
			setState(2244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(2241);
				match(GRANT);
				setState(2242);
				match(OPTION);
				setState(2243);
				match(FOR);
				}
			}

			setState(2246);
			privType();
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2247);
				columnList();
				}
			}

			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2250);
				match(COMMA);
				setState(2251);
				privType();
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2252);
					columnList();
					}
				}

				}
				}
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2260);
			privOnClause();
			setState(2261);
			match(FROM);
			setState(2262);
			roleSpecifications();
			setState(2264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTRICT || _la==CASCADE) {
				{
				setState(2263);
				_la = _input.LA(1);
				if ( !(_la==RESTRICT || _la==CASCADE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class RevokeRoleContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public List<RoleNamesContext> roleNames() {
			return getRuleContexts(RoleNamesContext.class);
		}
		public RoleNamesContext roleNames(int i) {
			return getRuleContext(RoleNamesContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public RevokeRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRole; }
	}

	public final RevokeRoleContext revokeRole() throws RecognitionException {
		RevokeRoleContext _localctx = new RevokeRoleContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_revokeRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			match(REVOKE);
			setState(2270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADMIN) {
				{
				setState(2267);
				match(ADMIN);
				setState(2268);
				match(OPTION);
				setState(2269);
				match(FOR);
				}
			}

			setState(2272);
			roleNames();
			setState(2273);
			match(FROM);
			setState(2274);
			roleNames();
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTRICT || _la==CASCADE) {
				{
				setState(2275);
				_la = _input.LA(1);
				if ( !(_la==RESTRICT || _la==CASCADE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public RoleOptionsContext roleOptions() {
			return getRuleContext(RoleOptionsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_createUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			match(CREATE);
			setState(2279);
			match(USER);
			setState(2280);
			userName();
			setState(2285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADMIN) | (1L << BYPASSRLS) | (1L << CONNECTION) | (1L << CREATEDB) | (1L << CREATEROLE) | (1L << ENCRYPTED) | (1L << INHERIT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LOGIN - 68)) | (1L << (NOBYPASSRLS - 68)) | (1L << (NOCREATEDB - 68)) | (1L << (NOCREATEROLE - 68)) | (1L << (NOINHERIT - 68)) | (1L << (NOLOGIN - 68)) | (1L << (NOREPLICATION - 68)) | (1L << (NOSUPERUSER - 68)) | (1L << (REPLICATION - 68)) | (1L << (SUPERUSER - 68)) | (1L << (SYSID - 68)))) != 0) || _la==VALID || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (IN - 211)) | (1L << (WITH - 211)) | (1L << (PASSWORD - 211)) | (1L << (ROLE - 211)))) != 0) || _la==USER) {
				{
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2281);
					match(WITH);
					}
				}

				setState(2284);
				roleOptions();
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

	public static class RoleOptionContext extends ParserRuleContext {
		public TerminalNode SUPERUSER() { return getToken(PostgreSQLStatementParser.SUPERUSER, 0); }
		public TerminalNode NOSUPERUSER() { return getToken(PostgreSQLStatementParser.NOSUPERUSER, 0); }
		public TerminalNode CREATEDB() { return getToken(PostgreSQLStatementParser.CREATEDB, 0); }
		public TerminalNode NOCREATEDB() { return getToken(PostgreSQLStatementParser.NOCREATEDB, 0); }
		public TerminalNode CREATEROLE() { return getToken(PostgreSQLStatementParser.CREATEROLE, 0); }
		public TerminalNode NOCREATEROLE() { return getToken(PostgreSQLStatementParser.NOCREATEROLE, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TerminalNode NOINHERIT() { return getToken(PostgreSQLStatementParser.NOINHERIT, 0); }
		public TerminalNode LOGIN() { return getToken(PostgreSQLStatementParser.LOGIN, 0); }
		public TerminalNode NOLOGIN() { return getToken(PostgreSQLStatementParser.NOLOGIN, 0); }
		public TerminalNode REPLICATION() { return getToken(PostgreSQLStatementParser.REPLICATION, 0); }
		public TerminalNode NOREPLICATION() { return getToken(PostgreSQLStatementParser.NOREPLICATION, 0); }
		public TerminalNode BYPASSRLS() { return getToken(PostgreSQLStatementParser.BYPASSRLS, 0); }
		public TerminalNode NOBYPASSRLS() { return getToken(PostgreSQLStatementParser.NOBYPASSRLS, 0); }
		public TerminalNode CONNECTION() { return getToken(PostgreSQLStatementParser.CONNECTION, 0); }
		public TerminalNode LIMIT() { return getToken(PostgreSQLStatementParser.LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode PASSWORD() { return getToken(PostgreSQLStatementParser.PASSWORD, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ENCRYPTED() { return getToken(PostgreSQLStatementParser.ENCRYPTED, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public TerminalNode UNTIL() { return getToken(PostgreSQLStatementParser.UNTIL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode SYSID() { return getToken(PostgreSQLStatementParser.SYSID, 0); }
		public RoleOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleOption; }
	}

	public final RoleOptionContext roleOption() throws RecognitionException {
		RoleOptionContext _localctx = new RoleOptionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_roleOption);
		int _la;
		try {
			setState(2326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				match(SUPERUSER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2288);
				match(NOSUPERUSER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2289);
				match(CREATEDB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2290);
				match(NOCREATEDB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2291);
				match(CREATEROLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2292);
				match(NOCREATEROLE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2293);
				match(INHERIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2294);
				match(NOINHERIT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2295);
				match(LOGIN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2296);
				match(NOLOGIN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2297);
				match(REPLICATION);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2298);
				match(NOREPLICATION);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2299);
				match(BYPASSRLS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2300);
				match(NOBYPASSRLS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2301);
				match(CONNECTION);
				setState(2302);
				match(LIMIT);
				setState(2303);
				match(NUMBER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENCRYPTED) {
					{
					setState(2304);
					match(ENCRYPTED);
					}
				}

				setState(2307);
				match(PASSWORD);
				setState(2308);
				match(STRING);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2309);
				match(VALID);
				setState(2310);
				match(UNTIL);
				setState(2311);
				match(STRING);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2312);
				match(IN);
				setState(2313);
				match(ROLE);
				setState(2314);
				roleNames();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2315);
				match(IN);
				setState(2316);
				match(GROUP);
				setState(2317);
				roleNames();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2318);
				match(ROLE);
				setState(2319);
				roleNames();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2320);
				match(ADMIN);
				setState(2321);
				roleNames();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2322);
				match(USER);
				setState(2323);
				roleNames();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2324);
				match(SYSID);
				setState(2325);
				match(STRING);
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

	public static class RoleOptionsContext extends ParserRuleContext {
		public List<RoleOptionContext> roleOption() {
			return getRuleContexts(RoleOptionContext.class);
		}
		public RoleOptionContext roleOption(int i) {
			return getRuleContext(RoleOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLStatementParser.COMMA, i);
		}
		public RoleOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleOptions; }
	}

	public final RoleOptionsContext roleOptions() throws RecognitionException {
		RoleOptionsContext _localctx = new RoleOptionsContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_roleOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			roleOption();
			setState(2333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2329);
				match(COMMA);
				setState(2330);
				roleOption();
				}
				}
				setState(2335);
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

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public RoleSpecificationContext roleSpecification() {
			return getRuleContext(RoleSpecificationContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public RoleOptionsContext roleOptions() {
			return getRuleContext(RoleOptionsContext.class,0);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			match(ALTER);
			setState(2337);
			match(USER);
			setState(2338);
			roleSpecification();
			setState(2339);
			match(WITH);
			setState(2340);
			roleOptions();
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

	public static class RenameUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public List<UserNameContext> userName() {
			return getRuleContexts(UserNameContext.class);
		}
		public UserNameContext userName(int i) {
			return getRuleContext(UserNameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_renameUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			match(ALTER);
			setState(2343);
			match(USER);
			setState(2344);
			userName();
			setState(2345);
			match(RENAME);
			setState(2346);
			match(TO);
			setState(2347);
			userName();
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

	public static class AlterUserSetConfigContext extends ParserRuleContext {
		public AlterUserConfigOpContext alterUserConfigOp() {
			return getRuleContext(AlterUserConfigOpContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public ConfigNameContext configName() {
			return getRuleContext(ConfigNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public AlterUserSetConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUserSetConfig; }
	}

	public final AlterUserSetConfigContext alterUserSetConfig() throws RecognitionException {
		AlterUserSetConfigContext _localctx = new AlterUserSetConfigContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_alterUserSetConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			alterUserConfigOp();
			setState(2350);
			match(SET);
			setState(2351);
			configName();
			setState(2356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ_:
			case TO:
				{
				setState(2352);
				_la = _input.LA(1);
				if ( !(_la==EQ_ || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2353);
				_la = _input.LA(1);
				if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (DEFAULT - 250)) | (1L << (STRING - 250)) | (1L << (NUMBER - 250)) | (1L << (ID - 250)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FROM:
				{
				setState(2354);
				match(FROM);
				setState(2355);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConfigNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ConfigNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configName; }
	}

	public final ConfigNameContext configName() throws RecognitionException {
		ConfigNameContext _localctx = new ConfigNameContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_configName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(ID);
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

	public static class AlterUserConfigOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public RoleSpecificationContext roleSpecification() {
			return getRuleContext(RoleSpecificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public AlterUserConfigOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUserConfigOp; }
	}

	public final AlterUserConfigOpContext alterUserConfigOp() throws RecognitionException {
		AlterUserConfigOpContext _localctx = new AlterUserConfigOpContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_alterUserConfigOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			match(ALTER);
			setState(2361);
			match(USER);
			setState(2364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_USER:
			case PUBLIC:
			case SESSION_USER:
			case GROUP:
			case STRING:
			case ID:
				{
				setState(2362);
				roleSpecification();
				}
				break;
			case ALL:
				{
				setState(2363);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2366);
				match(IN);
				setState(2367);
				match(DATABASE);
				setState(2368);
				databaseName();
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

	public static class AlterUserResetConfigContext extends ParserRuleContext {
		public AlterUserConfigOpContext alterUserConfigOp() {
			return getRuleContext(AlterUserConfigOpContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public ConfigNameContext configName() {
			return getRuleContext(ConfigNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public AlterUserResetConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUserResetConfig; }
	}

	public final AlterUserResetConfigContext alterUserResetConfig() throws RecognitionException {
		AlterUserResetConfigContext _localctx = new AlterUserResetConfigContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_alterUserResetConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			alterUserConfigOp();
			setState(2372);
			match(RESET);
			setState(2375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(2373);
				configName();
				}
				break;
			case ALL:
				{
				setState(2374);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_dropUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(DROP);
			setState(2378);
			match(USER);
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2379);
				match(IF);
				setState(2380);
				match(EXISTS);
				}
			}

			setState(2383);
			roleNames();
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

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public RoleOptionsContext roleOptions() {
			return getRuleContext(RoleOptionsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_createRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(CREATE);
			setState(2386);
			match(ROLE);
			setState(2387);
			roleName();
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADMIN) | (1L << BYPASSRLS) | (1L << CONNECTION) | (1L << CREATEDB) | (1L << CREATEROLE) | (1L << ENCRYPTED) | (1L << INHERIT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LOGIN - 68)) | (1L << (NOBYPASSRLS - 68)) | (1L << (NOCREATEDB - 68)) | (1L << (NOCREATEROLE - 68)) | (1L << (NOINHERIT - 68)) | (1L << (NOLOGIN - 68)) | (1L << (NOREPLICATION - 68)) | (1L << (NOSUPERUSER - 68)) | (1L << (REPLICATION - 68)) | (1L << (SUPERUSER - 68)) | (1L << (SYSID - 68)))) != 0) || _la==VALID || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (IN - 211)) | (1L << (WITH - 211)) | (1L << (PASSWORD - 211)) | (1L << (ROLE - 211)))) != 0) || _la==USER) {
				{
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2388);
					match(WITH);
					}
				}

				setState(2391);
				roleOptions();
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

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public RoleSpecificationContext roleSpecification() {
			return getRuleContext(RoleSpecificationContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public RoleOptionsContext roleOptions() {
			return getRuleContext(RoleOptionsContext.class,0);
		}
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			match(ALTER);
			setState(2395);
			match(ROLE);
			setState(2396);
			roleSpecification();
			setState(2397);
			match(WITH);
			setState(2398);
			roleOptions();
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

	public static class RenameRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public List<RoleNameContext> roleName() {
			return getRuleContexts(RoleNameContext.class);
		}
		public RoleNameContext roleName(int i) {
			return getRuleContext(RoleNameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameRole; }
	}

	public final RenameRoleContext renameRole() throws RecognitionException {
		RenameRoleContext _localctx = new RenameRoleContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_renameRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(ALTER);
			setState(2401);
			match(ROLE);
			setState(2402);
			roleName();
			setState(2403);
			match(RENAME);
			setState(2404);
			match(TO);
			setState(2405);
			roleName();
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

	public static class AlterRoleSetConfigContext extends ParserRuleContext {
		public AlterRoleConfigOpContext alterRoleConfigOp() {
			return getRuleContext(AlterRoleConfigOpContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public ConfigNameContext configName() {
			return getRuleContext(ConfigNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public AlterRoleSetConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoleSetConfig; }
	}

	public final AlterRoleSetConfigContext alterRoleSetConfig() throws RecognitionException {
		AlterRoleSetConfigContext _localctx = new AlterRoleSetConfigContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_alterRoleSetConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			alterRoleConfigOp();
			setState(2408);
			match(SET);
			setState(2409);
			configName();
			setState(2414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ_:
			case TO:
				{
				setState(2410);
				_la = _input.LA(1);
				if ( !(_la==EQ_ || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2411);
				_la = _input.LA(1);
				if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (DEFAULT - 250)) | (1L << (STRING - 250)) | (1L << (NUMBER - 250)) | (1L << (ID - 250)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FROM:
				{
				setState(2412);
				match(FROM);
				setState(2413);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AlterRoleConfigOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public RoleSpecificationContext roleSpecification() {
			return getRuleContext(RoleSpecificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public AlterRoleConfigOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoleConfigOp; }
	}

	public final AlterRoleConfigOpContext alterRoleConfigOp() throws RecognitionException {
		AlterRoleConfigOpContext _localctx = new AlterRoleConfigOpContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_alterRoleConfigOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			match(ALTER);
			setState(2417);
			match(ROLE);
			setState(2420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_USER:
			case PUBLIC:
			case SESSION_USER:
			case GROUP:
			case STRING:
			case ID:
				{
				setState(2418);
				roleSpecification();
				}
				break;
			case ALL:
				{
				setState(2419);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2422);
				match(IN);
				setState(2423);
				match(DATABASE);
				setState(2424);
				databaseName();
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

	public static class AlterRoleResetConfigContext extends ParserRuleContext {
		public AlterRoleConfigOpContext alterRoleConfigOp() {
			return getRuleContext(AlterRoleConfigOpContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public ConfigNameContext configName() {
			return getRuleContext(ConfigNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public AlterRoleResetConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoleResetConfig; }
	}

	public final AlterRoleResetConfigContext alterRoleResetConfig() throws RecognitionException {
		AlterRoleResetConfigContext _localctx = new AlterRoleResetConfigContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_alterRoleResetConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			alterRoleConfigOp();
			setState(2428);
			match(RESET);
			setState(2431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(2429);
				configName();
				}
				break;
			case ALL:
				{
				setState(2430);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dropRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(DROP);
			setState(2434);
			match(ROLE);
			setState(2437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2435);
				match(IF);
				setState(2436);
				match(EXISTS);
				}
			}

			setState(2439);
			roleNames();
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			match(SHOW);
			setState(2442);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ID) ) {
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

	public static class SetParamContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public SetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setParam; }
	}

	public final SetParamContext setParam() throws RecognitionException {
		SetParamContext _localctx = new SetParamContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_setParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			match(SET);
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==SESSION) {
				{
				setState(2445);
				scope();
				}
			}

			setState(2448);
			setClause();
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==SESSION) ) {
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TimeZoneTypeContext timeZoneType() {
			return getRuleContext(TimeZoneTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLStatementParser.STRING, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_setClause);
		int _la;
		try {
			setState(2458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				match(TIME);
				setState(2453);
				match(ZONE);
				setState(2454);
				timeZoneType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				match(ID);
				setState(2456);
				_la = _input.LA(1);
				if ( !(_la==EQ_ || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2457);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class TimeZoneTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PostgreSQLStatementParser.NUMBER, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TimeZoneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneType; }
	}

	public final TimeZoneTypeContext timeZoneType() throws RecognitionException {
		TimeZoneTypeContext _localctx = new TimeZoneTypeContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_timeZoneType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==DEFAULT || _la==NUMBER) ) {
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

	public static class ResetParamContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLStatementParser.ID, 0); }
		public ResetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetParam; }
	}

	public final ResetParamContext resetParam() throws RecognitionException {
		ResetParamContext _localctx = new ResetParamContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_resetParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			match(RESET);
			setState(2463);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ID) ) {
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
		case 99:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 101:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 104:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 105:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 15);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0126\u09a4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01b7\n\2\3\2\5\2\u01ba\n\2\3"+
		"\3\3\3\3\3\5\3\u01bf\n\3\3\3\7\3\u01c2\n\3\f\3\16\3\u01c5\13\3\3\4\3\4"+
		"\5\4\u01c9\n\4\3\4\5\4\u01cc\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01d4\n\4"+
		"\3\4\3\4\7\4\u01d8\n\4\f\4\16\4\u01db\13\4\3\4\5\4\u01de\n\4\3\5\3\5\3"+
		"\5\3\5\5\5\u01e4\n\5\3\5\3\5\5\5\u01e8\n\5\3\5\5\5\u01eb\n\5\3\6\3\6\3"+
		"\6\7\6\u01f0\n\6\f\6\16\6\u01f3\13\6\3\7\3\7\3\7\5\7\u01f8\n\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\5\13\u0203\n\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\5\r\u020c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0216\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u021e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u022b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0233\n\r\3\r\3\r\3"+
		"\r\5\r\u0238\n\r\3\r\7\r\u023b\n\r\f\r\16\r\u023e\13\r\5\r\u0240\n\r\3"+
		"\16\3\16\3\16\3\16\5\16\u0246\n\16\3\17\3\17\5\17\u024a\n\17\3\20\6\20"+
		"\u024d\n\20\r\20\16\20\u024e\3\21\3\21\5\21\u0253\n\21\3\21\3\21\3\21"+
		"\5\21\u0258\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0268\n\21\3\22\3\22\3\22\3\22\5\22\u026e\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0276\n\23\3\24\5\24\u0279\n\24\3\24"+
		"\5\24\u027c\n\24\3\24\3\24\5\24\u0280\n\24\3\25\5\25\u0283\n\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u029d\n\26\3\26\7\26"+
		"\u02a0\n\26\f\26\16\26\u02a3\13\26\5\26\u02a5\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u02ac\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02b6"+
		"\n\30\3\31\3\31\5\31\u02ba\n\31\3\31\5\31\u02bd\n\31\3\31\5\31\u02c0\n"+
		"\31\3\31\3\31\5\31\u02c4\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u02cd\n\32\3\32\3\32\5\32\u02d1\n\32\3\33\3\33\3\33\5\33\u02d6\n\33\3"+
		"\34\3\34\3\34\5\34\u02db\n\34\3\34\3\34\5\34\u02df\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02ee\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u02fd"+
		"\n\37\3\37\5\37\u0300\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u030a\n \3!"+
		"\5!\u030d\n!\3!\3!\3!\5!\u0312\n!\3!\3!\3!\7!\u0317\n!\f!\16!\u031a\13"+
		"!\5!\u031c\n!\3!\5!\u031f\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0328\n\""+
		"\3\"\3\"\5\"\u032c\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0338\n$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0344\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u0354\n\'\3(\3(\3(\3(\3(\7(\u035b\n(\f(\16"+
		"(\u035e\13(\3)\3)\3)\3)\3*\3*\5*\u0366\n*\3*\3*\3*\3*\5*\u036c\n*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0378\n+\f+\16+\u037b\13+\3+\3+\5+\u037f"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3"+
		"F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\5K\u03c8\nK\5K\u03ca\nK\3K\3"+
		"K\3L\5L\u03cf\nL\3L\3L\3M\3M\3N\3N\3N\7N\u03d8\nN\fN\16N\u03db\13N\3O"+
		"\3O\3O\3O\3P\3P\3P\7P\u03e4\nP\fP\16P\u03e7\13P\3P\3P\3P\3P\5P\u03ed\n"+
		"P\3Q\3Q\5Q\u03f1\nQ\3R\3R\3R\7R\u03f6\nR\fR\16R\u03f9\13R\3S\3S\3S\7S"+
		"\u03fe\nS\fS\16S\u0401\13S\3T\3T\3T\7T\u0406\nT\fT\16T\u0409\13T\3U\3"+
		"U\3U\3U\3V\3V\3V\7V\u0412\nV\fV\16V\u0415\13V\3W\3W\3W\3W\3X\3X\3X\7X"+
		"\u041e\nX\fX\16X\u0421\13X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u042a\nZ\fZ\16Z\u042d"+
		"\13Z\3[\3[\3[\7[\u0432\n[\f[\16[\u0435\13[\3\\\3\\\3\\\7\\\u043a\n\\\f"+
		"\\\16\\\u043d\13\\\3]\3]\3]\3]\3^\3^\3^\7^\u0446\n^\f^\16^\u0449\13^\3"+
		"_\3_\3_\7_\u044e\n_\f_\16_\u0451\13_\3`\3`\3`\7`\u0456\n`\f`\16`\u0459"+
		"\13`\3a\3a\3a\7a\u045e\na\fa\16a\u0461\13a\3b\3b\3b\7b\u0466\nb\fb\16"+
		"b\u0469\13b\3c\3c\3c\7c\u046e\nc\fc\16c\u0471\13c\3d\3d\3d\3d\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0482\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\7e\u0493\ne\fe\16e\u0496\13e\3f\3f\3g\3g\3g\3g\3g\3g\5g"+
		"\u04a0\ng\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\7g\u04af\ng\fg\16g\u04b2"+
		"\13g\3h\3h\3i\3i\5i\u04b8\ni\3i\3i\3i\3i\3i\5i\u04bf\ni\3i\3i\3i\3i\3"+
		"i\7i\u04c6\ni\fi\16i\u04c9\13i\3i\3i\3i\3i\5i\u04cf\ni\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\5i\u04dd\ni\3i\3i\3i\3i\7i\u04e3\ni\fi\16i\u04e6"+
		"\13i\3i\3i\5i\u04ea\ni\3i\3i\3i\3i\5i\u04f0\ni\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\7j\u051c\nj\fj\16j\u051f\13j\3k\3k"+
		"\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k"+
		"\u0539\nk\3k\3k\3k\3k\3k\7k\u0540\nk\fk\16k\u0543\13k\3l\3l\3l\5l\u0548"+
		"\nl\3l\3l\5l\u054c\nl\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0566\nq\3q\3q\3q\5q\u056b\nq\3q\3q\5q\u056f"+
		"\nq\5q\u0571\nq\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3v\3v\7v\u0580\nv\fv"+
		"\16v\u0583\13v\3w\3w\3w\5w\u0588\nw\3w\5w\u058b\nw\3x\3x\5x\u058f\nx\3"+
		"x\3x\5x\u0593\nx\3x\3x\3x\5x\u0598\nx\3x\5x\u059b\nx\3x\3x\3x\3y\3y\3"+
		"y\3y\3y\5y\u05a5\ny\3z\3z\3z\3z\5z\u05ab\nz\3z\3z\3{\3{\3{\3{\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u05c4\n}\3~\3~\3~\5~\u05c9"+
		"\n~\3~\3~\5~\u05cd\n~\3~\3~\3\177\3\177\3\177\5\177\u05d4\n\177\3\u0080"+
		"\3\u0080\5\u0080\u05d8\n\u0080\3\u0080\3\u0080\5\u0080\u05dc\n\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05e2\n\u0080\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u05ea\n\u0081\f\u0081\16\u0081"+
		"\u05ed\13\u0081\5\u0081\u05ef\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u05f8\n\u0082\f\u0082\16\u0082\u05fb"+
		"\13\u0082\5\u0082\u05fd\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u0607\n\u0084\f\u0084\16\u0084\u060a"+
		"\13\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0612"+
		"\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0617\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u061d\n\u0086\3\u0086\5\u0086\u0620\n\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0624\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3"+
		"\u0088\3\u0088\7\u0088\u062c\n\u0088\f\u0088\16\u0088\u062f\13\u0088\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0641"+
		"\n\u0089\3\u0089\3\u0089\5\u0089\u0645\n\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\5\u0089\u064c\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u065c\n\u0089\3\u0089\5\u0089\u065f\n\u0089\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u0677\n\u0089\f\u0089\16\u0089\u067a"+
		"\13\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089"+
		"\u0683\n\u0089\f\u0089\16\u0089\u0686\13\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0698\n\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u06a2\n\u0089"+
		"\5\u0089\u06a4\n\u0089\3\u008a\3\u008a\5\u008a\u06a8\n\u008a\3\u008a\3"+
		"\u008a\5\u008a\u06ac\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3"+
		"\u008b\3\u008b\5\u008b\u06b5\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u06ba"+
		"\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u06c0\n\u008c\3\u008c"+
		"\3\u008c\5\u008c\u06c4\n\u008c\3\u008c\3\u008c\5\u008c\u06c8\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u06cd\n\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u06d2\n\u008d\3\u008d\3\u008d\5\u008d\u06d6\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u06ec\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u06f4\n\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u06f9\n\u008d\f"+
		"\u008d\16\u008d\u06fc\13\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0703\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u071b"+
		"\n\u008d\3\u008e\3\u008e\5\u008e\u071f\n\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0728\n\u008f\3\u008f\5\u008f"+
		"\u072b\n\u008f\3\u008f\3\u008f\5\u008f\u072f\n\u008f\3\u008f\5\u008f\u0732"+
		"\n\u008f\5\u008f\u0734\n\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u0739\n"+
		"\u0090\f\u0090\16\u0090\u073c\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0746\n\u0092\3\u0092\5\u0092"+
		"\u0749\n\u0092\3\u0093\3\u0093\5\u0093\u074d\n\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u0762\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u076e\n\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\5\u009a\u0774\n\u009a\3\u009a\5\u009a\u0777\n\u009a\3\u009a\3"+
		"\u009a\3\u009b\3\u009b\3\u009b\7\u009b\u077e\n\u009b\f\u009b\16\u009b"+
		"\u0781\13\u009b\3\u009c\3\u009c\5\u009c\u0785\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\7\u009d\u078c\n\u009d\f\u009d\16\u009d\u078f"+
		"\13\u009d\3\u009d\3\u009d\5\u009d\u0793\n\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u079d\n\u009d\f\u009d"+
		"\16\u009d\u07a0\13\u009d\5\u009d\u07a2\n\u009d\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u07ad\n\u009e"+
		"\3\u009e\3\u009e\3\u009e\5\u009e\u07b2\n\u009e\3\u009e\5\u009e\u07b5\n"+
		"\u009e\3\u009f\3\u009f\5\u009f\u07b9\n\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u07be\n\u009f\3\u00a0\3\u00a0\5\u00a0\u07c2\n\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u07c7\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u07cb\n\u00a0\3"+
		"\u00a0\5\u00a0\u07ce\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5"+
		"\u00a2\u07d5\n\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u07da\n\u00a2\f\u00a2"+
		"\16\u00a2\u07dd\13\u00a2\5\u00a2\u07df\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\5\u00a3\u07e4\n\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u07e9\n\u00a3\f"+
		"\u00a3\16\u00a3\u07ec\13\u00a3\5\u00a3\u07ee\n\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u07f5\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5"+
		"\u00a5\u07fa\n\u00a5\7\u00a5\u07fc\n\u00a5\f\u00a5\16\u00a5\u07ff\13\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0807\n\u00a5"+
		"\3\u00a6\3\u00a6\5\u00a6\u080b\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u081a\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u081e\n\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u083c\n\u00a7\3\u00a7\5\u00a7\u083f\n\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\5\u00a7\u0844\n\u00a7\3\u00a7\5\u00a7\u0847\n\u00a7\3\u00a7\7\u00a7"+
		"\u084a\n\u00a7\f\u00a7\16\u00a7\u084d\13\u00a7\5\u00a7\u084f\n\u00a7\3"+
		"\u00a7\5\u00a7\u0852\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0858"+
		"\n\u00a7\3\u00a7\5\u00a7\u085b\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u0860\n\u00a7\3\u00a7\5\u00a7\u0863\n\u00a7\3\u00a7\7\u00a7\u0866\n\u00a7"+
		"\f\u00a7\16\u00a7\u0869\13\u00a7\5\u00a7\u086b\n\u00a7\3\u00a7\5\u00a7"+
		"\u086e\n\u00a7\7\u00a7\u0870\n\u00a7\f\u00a7\16\u00a7\u0873\13\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0885"+
		"\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u088c\n\u00a9"+
		"\f\u00a9\16\u00a9\u088f\13\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u089a\n\u00ad\f\u00ad\16\u00ad"+
		"\u089d\13\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u08a4"+
		"\n\u00af\f\u00af\16\u00af\u08a7\13\u00af\3\u00b0\5\u00b0\u08aa\n\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08b0\n\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\7\u00b1\u08b5\n\u00b1\f\u00b1\16\u00b1\u08b8\13\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08c1\n\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08c7\n\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u08cb\n\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08d0\n\u00b3\7"+
		"\u00b3\u08d2\n\u00b3\f\u00b3\16\u00b3\u08d5\13\u00b3\3\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\5\u00b3\u08db\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5"+
		"\u00b4\u08e1\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u08e7\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08ed\n\u00b5\3\u00b5\5\u00b5"+
		"\u08f0\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0904\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0919\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u091e\n\u00b7\f\u00b7\16\u00b7\u0921"+
		"\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0937\n\u00ba\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u093f\n\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0944\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u094a\n"+
		"\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0950\n\u00be\3\u00be\3"+
		"\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0958\n\u00bf\3\u00bf\5"+
		"\u00bf\u095b\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0971\n\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0977\n\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u097c\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0982\n"+
		"\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0988\n\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\5\u00c7\u0991\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u099d\n\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\2\6\u00c8\u00cc\u00d2\u00d4\u00cc\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\2&\b\2\65\65JJLLss\u00fb\u00fb"+
		"\u011d\u011d\6\2\t\n\61\62\64\64~~\4\2\u00dc\u00dc\u00fc\u00fc\4\2  8"+
		"8\4\2\u00c6\u00c6\u00cc\u00cc\4\2,,CC\4\2\u00c3\u00c3\u00cd\u00cd\5\2"+
		"\u0099\u009b\u00ab\u00ab\u00ad\u00b3\4\2ff\u0113\u0113\4\2\u011e\u011e"+
		"\u0124\u0124\6\2\u00d0\u00d0\u00dc\u00dc\u00e9\u00e9\u00eb\u00eb\4\2\u00c3"+
		"\u00c3\u00c5\u00c5\3\2\u00ad\u00b3\4\2\u00cb\u00cb\u00e7\u00e8\4\2\63"+
		"\63DD\3\2\u0085\u0086\4\2%%99\t\2\22\22\26\26\36\36\66\66;;\177\u0080"+
		"\u00c3\u00c3\4\2mm\u00f3\u00f3\4\2\u00fe\u00fe\u0100\u0100\4\2ii\u00f1"+
		"\u00f1\4\2\u0095\u0095\u00ed\u00ed\4\2EE\u008b\u008b\4\2\u00e5\u00e5\u00ff"+
		"\u00ff\6\2\'\'))GG__\4\2YY\u0097\u0097\4\2\u0118\u0118\u011c\u011c\5\2"+
		"ccnn\u0103\u0103\5\2\60\60ddoo\6\2??ZZ\u0092\u0092\u00d5\u00d5\4\2\u00ad"+
		"\u00ad\u0117\u0117\5\2\u00fc\u00fc\u011e\u011f\u0124\u0124\4\2\u00c3\u00c3"+
		"\u0124\u0124\4\2DDyy\4\2\u00fc\u00fc\u011e\u011e\5\2DD\u00fc\u00fc\u011f"+
		"\u011f\2\u0aaa\2\u01b6\3\2\2\2\4\u01bb\3\2\2\2\6\u01dd\3\2\2\2\b\u01ea"+
		"\3\2\2\2\n\u01ec\3\2\2\2\f\u01f4\3\2\2\2\16\u01f9\3\2\2\2\20\u01fb\3\2"+
		"\2\2\22\u01fe\3\2\2\2\24\u0202\3\2\2\2\26\u0207\3\2\2\2\30\u023f\3\2\2"+
		"\2\32\u0241\3\2\2\2\34\u0249\3\2\2\2\36\u024c\3\2\2\2 \u0267\3\2\2\2\""+
		"\u026d\3\2\2\2$\u0275\3\2\2\2&\u027b\3\2\2\2(\u0282\3\2\2\2*\u02a4\3\2"+
		"\2\2,\u02a6\3\2\2\2.\u02b5\3\2\2\2\60\u02b9\3\2\2\2\62\u02d0\3\2\2\2\64"+
		"\u02d5\3\2\2\2\66\u02d7\3\2\2\28\u02ef\3\2\2\2:\u02f5\3\2\2\2<\u02f9\3"+
		"\2\2\2>\u0303\3\2\2\2@\u030c\3\2\2\2B\u0320\3\2\2\2D\u032d\3\2\2\2F\u0337"+
		"\3\2\2\2H\u0343\3\2\2\2J\u0345\3\2\2\2L\u0353\3\2\2\2N\u0355\3\2\2\2P"+
		"\u035f\3\2\2\2R\u036b\3\2\2\2T\u037e\3\2\2\2V\u0380\3\2\2\2X\u0387\3\2"+
		"\2\2Z\u0389\3\2\2\2\\\u038b\3\2\2\2^\u038d\3\2\2\2`\u038f\3\2\2\2b\u0391"+
		"\3\2\2\2d\u0393\3\2\2\2f\u0395\3\2\2\2h\u0397\3\2\2\2j\u0399\3\2\2\2l"+
		"\u039b\3\2\2\2n\u039d\3\2\2\2p\u039f\3\2\2\2r\u03a1\3\2\2\2t\u03a3\3\2"+
		"\2\2v\u03a5\3\2\2\2x\u03a7\3\2\2\2z\u03a9\3\2\2\2|\u03ab\3\2\2\2~\u03ad"+
		"\3\2\2\2\u0080\u03af\3\2\2\2\u0082\u03b1\3\2\2\2\u0084\u03b3\3\2\2\2\u0086"+
		"\u03b5\3\2\2\2\u0088\u03b7\3\2\2\2\u008a\u03b9\3\2\2\2\u008c\u03bb\3\2"+
		"\2\2\u008e\u03bd\3\2\2\2\u0090\u03bf\3\2\2\2\u0092\u03c1\3\2\2\2\u0094"+
		"\u03c3\3\2\2\2\u0096\u03ce\3\2\2\2\u0098\u03d2\3\2\2\2\u009a\u03d4\3\2"+
		"\2\2\u009c\u03dc\3\2\2\2\u009e\u03ec\3\2\2\2\u00a0\u03f0\3\2\2\2\u00a2"+
		"\u03f2\3\2\2\2\u00a4\u03fa\3\2\2\2\u00a6\u0402\3\2\2\2\u00a8\u040a\3\2"+
		"\2\2\u00aa\u040e\3\2\2\2\u00ac\u0416\3\2\2\2\u00ae\u041a\3\2\2\2\u00b0"+
		"\u0422\3\2\2\2\u00b2\u0426\3\2\2\2\u00b4\u042e\3\2\2\2\u00b6\u0436\3\2"+
		"\2\2\u00b8\u043e\3\2\2\2\u00ba\u0442\3\2\2\2\u00bc\u044a\3\2\2\2\u00be"+
		"\u0452\3\2\2\2\u00c0\u045a\3\2\2\2\u00c2\u0462\3\2\2\2\u00c4\u046a\3\2"+
		"\2\2\u00c6\u0472\3\2\2\2\u00c8\u0481\3\2\2\2\u00ca\u0497\3\2\2\2\u00cc"+
		"\u0499\3\2\2\2\u00ce\u04b3\3\2\2\2\u00d0\u04ef\3\2\2\2\u00d2\u04f1\3\2"+
		"\2\2\u00d4\u0538\3\2\2\2\u00d6\u0544\3\2\2\2\u00d8\u054f\3\2\2\2\u00da"+
		"\u0551\3\2\2\2\u00dc\u0553\3\2\2\2\u00de\u0555\3\2\2\2\u00e0\u0570\3\2"+
		"\2\2\u00e2\u0572\3\2\2\2\u00e4\u0574\3\2\2\2\u00e6\u0576\3\2\2\2\u00e8"+
		"\u0578\3\2\2\2\u00ea\u057a\3\2\2\2\u00ec\u0587\3\2\2\2\u00ee\u058c\3\2"+
		"\2\2\u00f0\u05a4\3\2\2\2\u00f2\u05a6\3\2\2\2\u00f4\u05ae\3\2\2\2\u00f6"+
		"\u05b2\3\2\2\2\u00f8\u05ba\3\2\2\2\u00fa\u05c5\3\2\2\2\u00fc\u05d0\3\2"+
		"\2\2\u00fe\u05d5\3\2\2\2\u0100\u05e5\3\2\2\2\u0102\u05fc\3\2\2\2\u0104"+
		"\u05fe\3\2\2\2\u0106\u0601\3\2\2\2\u0108\u0616\3\2\2\2\u010a\u0618\3\2"+
		"\2\2\u010c\u0625\3\2\2\2\u010e\u0628\3\2\2\2\u0110\u06a3\3\2\2\2\u0112"+
		"\u06a7\3\2\2\2\u0114\u06b2\3\2\2\2\u0116\u06bd\3\2\2\2\u0118\u071a\3\2"+
		"\2\2\u011a\u071c\3\2\2\2\u011c\u0733\3\2\2\2\u011e\u0735\3\2\2\2\u0120"+
		"\u073d\3\2\2\2\u0122\u0741\3\2\2\2\u0124\u074a\3\2\2\2\u0126\u0752\3\2"+
		"\2\2\u0128\u0758\3\2\2\2\u012a\u075c\3\2\2\2\u012c\u075e\3\2\2\2\u012e"+
		"\u0765\3\2\2\2\u0130\u0769\3\2\2\2\u0132\u0771\3\2\2\2\u0134\u077a\3\2"+
		"\2\2\u0136\u0782\3\2\2\2\u0138\u07a1\3\2\2\2\u013a\u07b4\3\2\2\2\u013c"+
		"\u07bd\3\2\2\2\u013e\u07bf\3\2\2\2\u0140\u07cf\3\2\2\2\u0142\u07d2\3\2"+
		"\2\2\u0144\u07e0\3\2\2\2\u0146\u07ef\3\2\2\2\u0148\u07f1\3\2\2\2\u014a"+
		"\u0819\3\2\2\2\u014c\u081b\3\2\2\2\u014e\u0886\3\2\2\2\u0150\u0888\3\2"+
		"\2\2\u0152\u0890\3\2\2\2\u0154\u0892\3\2\2\2\u0156\u0894\3\2\2\2\u0158"+
		"\u0896\3\2\2\2\u015a\u089e\3\2\2\2\u015c\u08a0\3\2\2\2\u015e\u08af\3\2"+
		"\2\2\u0160\u08b1\3\2\2\2\u0162\u08b9\3\2\2\2\u0164\u08c2\3\2\2\2\u0166"+
		"\u08dc\3\2\2\2\u0168\u08e8\3\2\2\2\u016a\u0918\3\2\2\2\u016c\u091a\3\2"+
		"\2\2\u016e\u0922\3\2\2\2\u0170\u0928\3\2\2\2\u0172\u092f\3\2\2\2\u0174"+
		"\u0938\3\2\2\2\u0176\u093a\3\2\2\2\u0178\u0945\3\2\2\2\u017a\u094b\3\2"+
		"\2\2\u017c\u0953\3\2\2\2\u017e\u095c\3\2\2\2\u0180\u0962\3\2\2\2\u0182"+
		"\u0969\3\2\2\2\u0184\u0972\3\2\2\2\u0186\u097d\3\2\2\2\u0188\u0983\3\2"+
		"\2\2\u018a\u098b\3\2\2\2\u018c\u098e\3\2\2\2\u018e\u0994\3\2\2\2\u0190"+
		"\u099c\3\2\2\2\u0192\u099e\3\2\2\2\u0194\u09a0\3\2\2\2\u0196\u01b7\5\u00ee"+
		"x\2\u0197\u01b7\5\u00f0y\2\u0198\u01b7\5\u00fa~\2\u0199\u01b7\5\u00fc"+
		"\177\2\u019a\u01b7\5\u0108\u0085\2\u019b\u01b7\5\u0130\u0099\2\u019c\u01b7"+
		"\5\u0132\u009a\2\u019d\u01b7\5\u0142\u00a2\2\u019e\u01b7\5\u0144\u00a3"+
		"\2\u019f\u01b7\5\u013c\u009f\2\u01a0\u01b7\5\u013e\u00a0\2\u01a1\u01b7"+
		"\5\u0138\u009d\2\u01a2\u01b7\5\u0140\u00a1\2\u01a3\u01b7\5\u0148\u00a5"+
		"\2\u01a4\u01b7\5\u0162\u00b2\2\u01a5\u01b7\5\u0164\u00b3\2\u01a6\u01b7"+
		"\5\u0166\u00b4\2\u01a7\u01b7\5\u0168\u00b5\2\u01a8\u01b7\5\u016e\u00b8"+
		"\2\u01a9\u01b7\5\u0170\u00b9\2\u01aa\u01b7\5\u0172\u00ba\2\u01ab\u01b7"+
		"\5\u0178\u00bd\2\u01ac\u01b7\5\u017a\u00be\2\u01ad\u01b7\5\u017c\u00bf"+
		"\2\u01ae\u01b7\5\u017e\u00c0\2\u01af\u01b7\5\u0180\u00c1\2\u01b0\u01b7"+
		"\5\u0182\u00c2\2\u01b1\u01b7\5\u0186\u00c4\2\u01b2\u01b7\5\u0188\u00c5"+
		"\2\u01b3\u01b7\5\u018a\u00c6\2\u01b4\u01b7\5\u018c\u00c7\2\u01b5\u01b7"+
		"\5\u0194\u00cb\2\u01b6\u0196\3\2\2\2\u01b6\u0197\3\2\2\2\u01b6\u0198\3"+
		"\2\2\2\u01b6\u0199\3\2\2\2\u01b6\u019a\3\2\2\2\u01b6\u019b\3\2\2\2\u01b6"+
		"\u019c\3\2\2\2\u01b6\u019d\3\2\2\2\u01b6\u019e\3\2\2\2\u01b6\u019f\3\2"+
		"\2\2\u01b6\u01a0\3\2\2\2\u01b6\u01a1\3\2\2\2\u01b6\u01a2\3\2\2\2\u01b6"+
		"\u01a3\3\2\2\2\u01b6\u01a4\3\2\2\2\u01b6\u01a5\3\2\2\2\u01b6\u01a6\3\2"+
		"\2\2\u01b6\u01a7\3\2\2\2\u01b6\u01a8\3\2\2\2\u01b6\u01a9\3\2\2\2\u01b6"+
		"\u01aa\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b6\u01ac\3\2\2\2\u01b6\u01ad\3\2"+
		"\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01af\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6"+
		"\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\7\u00c2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\3\3\2\2\2\u01bb\u01bc\5`\61\2"+
		"\u01bc\u01be\5\6\4\2\u01bd\u01bf\5\20\t\2\u01be\u01bd\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c3\3\2\2\2\u01c0\u01c2\5\24\13\2\u01c1\u01c0\3\2\2\2"+
		"\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\5\3"+
		"\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\5\b\5\2\u01c7\u01c9\5\f\7\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5\u0094"+
		"K\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d3\3\2\2\2\u01cd"+
		"\u01ce\7\u0095\2\2\u01ce\u01cf\7\u00e7\2\2\u01cf\u01d4\7\u0098\2\2\u01d0"+
		"\u01d1\7\u00ed\2\2\u01d1\u01d2\7\u00e7\2\2\u01d2\u01d4\7\u0098\2\2\u01d3"+
		"\u01cd\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d9\3\2"+
		"\2\2\u01d5\u01d6\7\u00b9\2\2\u01d6\u01d8\7\u00ba\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01de"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7\u0124\2\2\u01dd\u01c6\3\2\2"+
		"\2\u01dd\u01dc\3\2\2\2\u01de\7\3\2\2\2\u01df\u01e0\7#\2\2\u01e0\u01eb"+
		"\7a\2\2\u01e1\u01e3\7\16\2\2\u01e2\u01e4\7\u0093\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01eb\3\2\2\2\u01e5\u01e7\7\b\2\2\u01e6\u01e8"+
		"\7\u0093\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2"+
		"\2\u01e9\u01eb\7\u0124\2\2\u01ea\u01df\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\t\3\2\2\2\u01ec\u01f1\5\b\5\2"+
		"\u01ed\u01ee\7\u00bb\2\2\u01ee\u01f0\5\b\5\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\13\3\2\2"+
		"\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\5\16\b\2\u01f5\u01f6\7\u0117\2\2\u01f6"+
		"\u01f8\5\16\b\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\r\3\2\2"+
		"\2\u01f9\u01fa\t\2\2\2\u01fa\17\3\2\2\2\u01fb\u01fc\7\21\2\2\u01fc\u01fd"+
		"\5f\64\2\u01fd\21\3\2\2\2\u01fe\u01ff\7\u008f\2\2\u01ff\u0200\t\3\2\2"+
		"\u0200\23\3\2\2\2\u0201\u0203\5\26\f\2\u0202\u0201\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5\30\r\2\u0205\u0206\5&\24\2"+
		"\u0206\25\3\2\2\2\u0207\u0208\7\u00f8\2\2\u0208\u0209\5z>\2\u0209\27\3"+
		"\2\2\2\u020a\u020c\7\u00db\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2"+
		"\u020c\u020d\3\2\2\2\u020d\u0240\7\u00dc\2\2\u020e\u0240\5\32\16\2\u020f"+
		"\u0210\7\u00fc\2\2\u0210\u0240\5\34\17\2\u0211\u0215\7\u0104\2\2\u0212"+
		"\u0216\7\u00f1\2\2\u0213\u0214\7\u00ca\2\2\u0214\u0216\7\u00fc\2\2\u0215"+
		"\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\u00f2"+
		"\2\2\u0218\u021d\7\66\2\2\u0219\u021a\7\u00b5\2\2\u021a\u021b\5\36\20"+
		"\2\u021b\u021c\7\u00b6\2\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0240\3\2\2\2\u021f\u0220\7\u011a\2\2\u0220\u0240"+
		"\5\"\22\2\u0221\u0222\5\u0096L\2\u0222\u0223\5\"\22\2\u0223\u0240\3\2"+
		"\2\2\u0224\u0225\7\u010f\2\2\u0225\u022a\5^\60\2\u0226\u0227\7\u00b5\2"+
		"\2\u0227\u0228\5`\61\2\u0228\u0229\7\u00b6\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0226\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0232\3\2\2\2\u022c\u022d\7H"+
		"\2\2\u022d\u0233\7/\2\2\u022e\u022f\7H\2\2\u022f\u0233\7^\2\2\u0230\u0231"+
		"\7H\2\2\u0231\u0233\7|\2\2\u0232\u022c\3\2\2\2\u0232\u022e\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0235\7\u010a"+
		"\2\2\u0235\u0236\7\u00fd\2\2\u0236\u0238\5$\23\2\u0237\u0234\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u023c\3\2\2\2\u0239\u023b\5,\27\2\u023a\u0239\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u020b\3\2\2\2\u023f\u020e\3\2"+
		"\2\2\u023f\u020f\3\2\2\2\u023f\u0211\3\2\2\2\u023f\u021f\3\2\2\2\u023f"+
		"\u0221\3\2\2\2\u023f\u0224\3\2\2\2\u0240\31\3\2\2\2\u0241\u0242\7\u00f4"+
		"\2\2\u0242\u0245\5\u00c8e\2\u0243\u0244\7\u0109\2\2\u0244\u0246\7<\2\2"+
		"\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\33\3\2\2\2\u0247\u024a"+
		"\7\31\2\2\u0248\u024a\5\u00c8e\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2"+
		"\2\u024a\35\3\2\2\2\u024b\u024d\5 \21\2\u024c\u024b\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\37\3\2\2\2\u0250"+
		"\u0252\7\u0115\2\2\u0251\u0253\7\u00ed\2\2\u0252\u0251\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0268\7\u011f\2\2\u0255\u0257\7:\2"+
		"\2\u0256\u0258\7\u00ca\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0268\7\u011f\2\2\u025a\u025b\7I\2\2\u025b\u0268"+
		"\7\u011f\2\2\u025c\u025d\7\u0109\2\2\u025d\u0268\7I\2\2\u025e\u025f\7"+
		"K\2\2\u025f\u0268\7\u011f\2\2\u0260\u0261\7\u0109\2\2\u0261\u0268\7K\2"+
		"\2\u0262\u0268\7\33\2\2\u0263\u0264\7\u0109\2\2\u0264\u0268\7\33\2\2\u0265"+
		"\u0266\7\f\2\2\u0266\u0268\7\u011f\2\2\u0267\u0250\3\2\2\2\u0267\u0255"+
		"\3\2\2\2\u0267\u025a\3\2\2\2\u0267\u025c\3\2\2\2\u0267\u025e\3\2\2\2\u0267"+
		"\u0260\3\2\2\2\u0267\u0262\3\2\2\2\u0267\u0263\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0268!\3\2\2\2\u0269\u026a\7\u008f\2\2\u026a\u026b\7\u0106\2\2\u026b"+
		"\u026c\7\u0084\2\2\u026c\u026e\5d\63\2\u026d\u0269\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e#\3\2\2\2\u026f\u0270\7\u0109\2\2\u0270\u0276\7\4\2\2\u0271"+
		"\u0276\7m\2\2\u0272\u0276\7\u00f3\2\2\u0273\u0274\7\u00e5\2\2\u0274\u0276"+
		"\t\4\2\2\u0275\u026f\3\2\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0276%\3\2\2\2\u0277\u0279\7\u00db\2\2\u0278\u0277\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\7\37\2\2\u027b"+
		"\u0278\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027e\7>"+
		"\2\2\u027e\u0280\t\5\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\'\3\2\2\2\u0281\u0283\5\26\f\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\5*\26\2\u0285\u0286\5&\24\2\u0286)"+
		"\3\2\2\2\u0287\u02a5\5\32\16\2\u0288\u0289\7\u011a\2\2\u0289\u028a\5\u00b0"+
		"Y\2\u028a\u028b\5\"\22\2\u028b\u02a5\3\2\2\2\u028c\u028d\5\u0096L\2\u028d"+
		"\u028e\5\u00b0Y\2\u028e\u028f\5\"\22\2\u028f\u02a5\3\2\2\2\u0290\u0291"+
		"\7\u0102\2\2\u0291\u0292\7\u00d7\2\2\u0292\u0293\5\u00b0Y\2\u0293\u0294"+
		"\7\u010f\2\2\u0294\u0295\5^\60\2\u0295\u029c\5\u00b0Y\2\u0296\u0297\7"+
		"H\2\2\u0297\u029d\7/\2\2\u0298\u0299\7H\2\2\u0299\u029d\7^\2\2\u029a\u029b"+
		"\7H\2\2\u029b\u029d\7|\2\2\u029c\u0296\3\2\2\2\u029c\u0298\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a1\3\2\2\2\u029e\u02a0\5,"+
		"\27\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u0287\3\2"+
		"\2\2\u02a4\u0288\3\2\2\2\u02a4\u028c\3\2\2\2\u02a4\u0290\3\2\2\2\u02a5"+
		"+\3\2\2\2\u02a6\u02ab\7\u010a\2\2\u02a7\u02a8\7\u008d\2\2\u02a8\u02ac"+
		"\5.\30\2\u02a9\u02aa\7\u00fd\2\2\u02aa\u02ac\5.\30\2\u02ab\u02a7\3\2\2"+
		"\2\u02ab\u02a9\3\2\2\2\u02ac-\3\2\2\2\u02ad\u02b6\7m\2\2\u02ae\u02b6\7"+
		"\u00f3\2\2\u02af\u02b0\7\u00e5\2\2\u02b0\u02b6\7\u00dc\2\2\u02b1\u02b2"+
		"\7\u0109\2\2\u02b2\u02b6\7\4\2\2\u02b3\u02b4\7\u00e5\2\2\u02b4\u02b6\7"+
		"\u00fc\2\2\u02b5\u02ad\3\2\2\2\u02b5\u02ae\3\2\2\2\u02b5\u02af\3\2\2\2"+
		"\u02b5\u02b1\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6/\3\2\2\2\u02b7\u02ba\5"+
		"`\61\2\u02b8\u02ba\5\u00c8e\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2"+
		"\u02ba\u02bc\3\2\2\2\u02bb\u02bd\5t;\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02c0\t\6\2\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02c2\7U\2\2\u02c2\u02c4\t\7"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\61\3\2\2\2\u02c5\u02d1"+
		"\5\66\34\2\u02c6\u02d1\5<\37\2\u02c7\u02d1\5R*\2\u02c8\u02cc\7\u00e8\2"+
		"\2\u02c9\u02ca\7\u00ed\2\2\u02ca\u02cb\7\u00e7\2\2\u02cb\u02cd\7\u0098"+
		"\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d1\7\u011e\2\2\u02cf\u02d1\5V,\2\u02d0\u02c5\3\2\2\2\u02d0\u02c6\3"+
		"\2\2\2\u02d0\u02c7\3\2\2\2\u02d0\u02c8\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1"+
		"\63\3\2\2\2\u02d2\u02d6\5L\'\2\u02d3\u02d6\5P)\2\u02d4\u02d6\5\u00c8e"+
		"\2\u02d5\u02d2\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\65"+
		"\3\2\2\2\u02d7\u02d8\7\u0124\2\2\u02d8\u02da\7\u00b5\2\2\u02d9\u02db\t"+
		"\b\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02de\5\u00c4c\2\u02dd\u02df\5\u00eav\2\u02de\u02dd\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7\u00b6\2\2\u02e1\u02e2\3\2\2"+
		"\2\u02e2\u02e3\5:\36\2\u02e3\u02e4\7\u00b5\2\2\u02e4\u02e5\5\u00c4c\2"+
		"\u02e5\u02e6\7\u00b6\2\2\u02e6\u02e7\7\u0094\2\2\u02e7\u02e8\7\u00d2\2"+
		"\2\u02e8\u02e9\7\u00b5\2\2\u02e9\u02ea\5\u00eav\2\u02ea\u02eb\7\u00b6"+
		"\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\58\35\2\u02ed\u02ec\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\67\3\2\2\2\u02ef\u02f0\7+\2\2\u02f0\u02f1\7\u00b5"+
		"\2\2\u02f1\u02f2\7\u00ec\2\2\u02f2\u02f3\5\u00ccg\2\u02f3\u02f4\7\u00b6"+
		"\2\2\u02f49\3\2\2\2\u02f5\u02f6\7\u00b5\2\2\u02f6\u02f7\7\u00a6\2\2\u02f7"+
		"\u02f8\7\u00b6\2\2\u02f8;\3\2\2\2\u02f9\u02fc\7\u0124\2\2\u02fa\u02fd"+
		"\5\u00c6d\2\u02fb\u02fd\5:\36\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2"+
		"\2\u02fd\u02ff\3\2\2\2\u02fe\u0300\58\35\2\u02ff\u02fe\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\5> \2\u0302=\3\2\2\2\u0303\u0309"+
		"\7[\2\2\u0304\u030a\7\u0124\2\2\u0305\u0306\7\u00b5\2\2\u0306\u0307\5"+
		"@!\2\u0307\u0308\7\u00b6\2\2\u0308\u030a\3\2\2\2\u0309\u0304\3\2\2\2\u0309"+
		"\u0305\3\2\2\2\u030a?\3\2\2\2\u030b\u030d\7\u0124\2\2\u030c\u030b\3\2"+
		"\2\2\u030c\u030d\3\2\2\2\u030d\u0311\3\2\2\2\u030e\u030f\7\u00e0\2\2\u030f"+
		"\u0310\7\u00ca\2\2\u0310\u0312\5\u00c4c\2\u0311\u030e\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u031b\3\2\2\2\u0313\u0318\5B\"\2\u0314\u0315\7\u00bb\2"+
		"\2\u0315\u0317\5B\"\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031b"+
		"\u0313\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\5F"+
		"$\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031fA\3\2\2\2\u0320\u0321"+
		"\7\u00df\2\2\u0321\u0322\7\u00ca\2\2\u0322\u0327\5\u00c8e\2\u0323\u0328"+
		"\7\u00c6\2\2\u0324\u0328\7\u00cc\2\2\u0325\u0326\7\u008f\2\2\u0326\u0328"+
		"\5D#\2\u0327\u0323\3\2\2\2\u0327\u0324\3\2\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u032a\7U\2\2\u032a\u032c\t\7"+
		"\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032cC\3\2\2\2\u032d\u032e"+
		"\t\t\2\2\u032eE\3\2\2\2\u032f\u0330\t\n\2\2\u0330\u0338\5H%\2\u0331\u0332"+
		"\t\n\2\2\u0332\u0333\7\u00c7\2\2\u0333\u0334\5H%\2\u0334\u0335\7\u00c4"+
		"\2\2\u0335\u0336\5J&\2\u0336\u0338\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0331"+
		"\3\2\2\2\u0338G\3\2\2\2\u0339\u033a\7\u0089\2\2\u033a\u0344\7`\2\2\u033b"+
		"\u033c\7\u011f\2\2\u033c\u0344\7`\2\2\u033d\u033e\7\u00fa\2\2\u033e\u0344"+
		"\7\u00e4\2\2\u033f\u0340\7\u011f\2\2\u0340\u0344\7-\2\2\u0341\u0342\7"+
		"\u0089\2\2\u0342\u0344\7-\2\2\u0343\u0339\3\2\2\2\u0343\u033b\3\2\2\2"+
		"\u0343\u033d\3\2\2\2\u0343\u033f\3\2\2\2\u0343\u0341\3\2\2\2\u0344I\3"+
		"\2\2\2\u0345\u0346\5H%\2\u0346K\3\2\2\2\u0347\u0348\7\r\2\2\u0348\u0349"+
		"\7\u00b5\2\2\u0349\u034a\5\u00c8e\2\u034a\u034b\7\u00f2\2\2\u034b\u034c"+
		"\5\6\4\2\u034c\u034d\7\u00b6\2\2\u034d\u0354\3\2\2\2\u034e\u034f\5\u00c8"+
		"e\2\u034f\u0350\7\u00a3\2\2\u0350\u0351\7\u00a3\2\2\u0351\u0352\5\6\4"+
		"\2\u0352\u0354\3\2\2\2\u0353\u0347\3\2\2\2\u0353\u034e\3\2\2\2\u0354M"+
		"\3\2\2\2\u0355\u0356\7\u00a3\2\2\u0356\u0357\7\u00a3\2\2\u0357\u035c\5"+
		"\6\4\2\u0358\u0359\7\u00b9\2\2\u0359\u035b\7\u00ba\2\2\u035a\u0358\3\2"+
		"\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"O\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\5\u00c8e\2\u0360\u0361\7\21"+
		"\2\2\u0361\u0362\5\u00c8e\2\u0362Q\3\2\2\2\u0363\u0365\5T+\2\u0364\u0366"+
		"\5N(\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036c\3\2\2\2\u0367"+
		"\u0368\7\6\2\2\u0368\u0369\7\u00b9\2\2\u0369\u036a\7\u00ba\2\2\u036a\u036c"+
		"\5N(\2\u036b\u0363\3\2\2\2\u036b\u0367\3\2\2\2\u036cS\3\2\2\2\u036d\u036e"+
		"\7\6\2\2\u036e\u036f\7\u00b9\2\2\u036f\u0370\5\u00c4c\2\u0370\u0371\7"+
		"\u00ba\2\2\u0371\u037f\3\2\2\2\u0372\u0373\7\6\2\2\u0373\u0374\7\u00b9"+
		"\2\2\u0374\u0379\5T+\2\u0375\u0376\7\u00bb\2\2\u0376\u0378\5T+\2\u0377"+
		"\u0375\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\7\u00ba\2\2\u037d"+
		"\u037f\3\2\2\2\u037e\u036d\3\2\2\2\u037e\u0372\3\2\2\2\u037fU\3\2\2\2"+
		"\u0380\u0381\7*\2\2\u0381\u0382\7\u00b5\2\2\u0382\u0383\7\u0124\2\2\u0383"+
		"\u0384\7\u00d1\2\2\u0384\u0385\7\u0124\2\2\u0385\u0386\7\u00b6\2\2\u0386"+
		"W\3\2\2\2\u0387\u0388\7\u0124\2\2\u0388Y\3\2\2\2\u0389\u038a\7\u0124\2"+
		"\2\u038a[\3\2\2\2\u038b\u038c\7\u0124\2\2\u038c]\3\2\2\2\u038d\u038e\7"+
		"\u0124\2\2\u038e_\3\2\2\2\u038f\u0390\7\u0124\2\2\u0390a\3\2\2\2\u0391"+
		"\u0392\7\u0124\2\2\u0392c\3\2\2\2\u0393\u0394\7\u0124\2\2\u0394e\3\2\2"+
		"\2\u0395\u0396\t\13\2\2\u0396g\3\2\2\2\u0397\u0398\7\u0124\2\2\u0398i"+
		"\3\2\2\2\u0399\u039a\7\u0124\2\2\u039ak\3\2\2\2\u039b\u039c\7\u0124\2"+
		"\2\u039cm\3\2\2\2\u039d\u039e\7\u0124\2\2\u039eo\3\2\2\2\u039f\u03a0\7"+
		"\u0124\2\2\u03a0q\3\2\2\2\u03a1\u03a2\7\u0124\2\2\u03a2s\3\2\2\2\u03a3"+
		"\u03a4\7\u0124\2\2\u03a4u\3\2\2\2\u03a5\u03a6\7\u0124\2\2\u03a6w\3\2\2"+
		"\2\u03a7\u03a8\7\u0124\2\2\u03a8y\3\2\2\2\u03a9\u03aa\7\u0124\2\2\u03aa"+
		"{\3\2\2\2\u03ab\u03ac\7\u0124\2\2\u03ac}\3\2\2\2\u03ad\u03ae\7\u0124\2"+
		"\2\u03ae\177\3\2\2\2\u03af\u03b0\7\u0124\2\2\u03b0\u0081\3\2\2\2\u03b1"+
		"\u03b2\7\u0124\2\2\u03b2\u0083\3\2\2\2\u03b3\u03b4\7\u0124\2\2\u03b4\u0085"+
		"\3\2\2\2\u03b5\u03b6\7\u0124\2\2\u03b6\u0087\3\2\2\2\u03b7\u03b8\t\13"+
		"\2\2\u03b8\u0089\3\2\2\2\u03b9\u03ba\7\u0124\2\2\u03ba\u008b\3\2\2\2\u03bb"+
		"\u03bc\7\u0124\2\2\u03bc\u008d\3\2\2\2\u03bd\u03be\7\u0124\2\2\u03be\u008f"+
		"\3\2\2\2\u03bf\u03c0\t\13\2\2\u03c0\u0091\3\2\2\2\u03c1\u03c2\7\u0124"+
		"\2\2\u03c2\u0093\3\2\2\2\u03c3\u03c9\7\u00b5\2\2\u03c4\u03c7\7\u011f\2"+
		"\2\u03c5\u03c6\7\u00bb\2\2\u03c6\u03c8\7\u011f\2\2\u03c7\u03c5\3\2\2\2"+
		"\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c4\3\2\2\2\u03c9\u03ca"+
		"\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\7\u00b6\2\2\u03cc\u0095\3\2\2"+
		"\2\u03cd\u03cf\7\u00e1\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d1\7\u00d7\2\2\u03d1\u0097\3\2\2\2\u03d2\u03d3"+
		"\7\3\2\2\u03d3\u0099\3\2\2\2\u03d4\u03d9\7\u0124\2\2\u03d5\u03d6\7\u00bb"+
		"\2\2\u03d6\u03d8\7\u0124\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u009b\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03dc\u03dd\7\u00b5\2\2\u03dd\u03de\5\u009aN\2\u03de\u03df\7\u00b6"+
		"\2\2\u03df\u009d\3\2\2\2\u03e0\u03e5\5\u00a0Q\2\u03e1\u03e2\7\u00bb\2"+
		"\2\u03e2\u03e4\5\u00a0Q\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5"+
		"\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ed\3\2\2\2\u03e7\u03e5\3\2"+
		"\2\2\u03e8\u03e9\5\u00a0Q\2\u03e9\u03ea\7\u00dd\2\2\u03ea\u03eb\5\u00a0"+
		"Q\2\u03eb\u03ed\3\2\2\2\u03ec\u03e0\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ed"+
		"\u009f\3\2\2\2\u03ee\u03f1\5\u00e4s\2\u03ef\u03f1\5\u00e2r\2\u03f0\u03ee"+
		"\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1\u00a1\3\2\2\2\u03f2\u03f7\5X-\2\u03f3"+
		"\u03f4\7\u00bb\2\2\u03f4\u03f6\5X-\2\u03f5\u03f3\3\2\2\2\u03f6\u03f9\3"+
		"\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u00a3\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03fa\u03ff\5Z.\2\u03fb\u03fc\7\u00bb\2\2\u03fc\u03fe\5"+
		"Z.\2\u03fd\u03fb\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u00a5\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0407\5\\"+
		"/\2\u0403\u0404\7\u00bb\2\2\u0404\u0406\5\\/\2\u0405\u0403\3\2\2\2\u0406"+
		"\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00a7\3\2"+
		"\2\2\u0409\u0407\3\2\2\2\u040a\u040b\7\u00b5\2\2\u040b\u040c\5\u00aaV"+
		"\2\u040c\u040d\7\u00b6\2\2\u040d\u00a9\3\2\2\2\u040e\u0413\5^\60\2\u040f"+
		"\u0410\7\u00bb\2\2\u0410\u0412\5^\60\2\u0411\u040f\3\2\2\2\u0412\u0415"+
		"\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u00ab\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0416\u0417\7\u00b5\2\2\u0417\u0418\5\u00aeX\2\u0418\u0419"+
		"\7\u00b6\2\2\u0419\u00ad\3\2\2\2\u041a\u041f\5`\61\2\u041b\u041c\7\u00bb"+
		"\2\2\u041c\u041e\5`\61\2\u041d\u041b\3\2\2\2\u041e\u0421\3\2\2\2\u041f"+
		"\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u00af\3\2\2\2\u0421\u041f\3\2"+
		"\2\2\u0422\u0423\7\u00b5\2\2\u0423\u0424\5\u00aeX\2\u0424\u0425\7\u00b6"+
		"\2\2\u0425\u00b1\3\2\2\2\u0426\u042b\5b\62\2\u0427\u0428\7\u00bb\2\2\u0428"+
		"\u042a\5b\62\2\u0429\u0427\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042b\u042c\3\2\2\2\u042c\u00b3\3\2\2\2\u042d\u042b\3\2\2\2\u042e"+
		"\u0433\5d\63\2\u042f\u0430\7\u00bb\2\2\u0430\u0432\5d\63\2\u0431\u042f"+
		"\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u00b5\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u043b\5h\65\2\u0437\u0438\7\u00bb"+
		"\2\2\u0438\u043a\5h\65\2\u0439\u0437\3\2\2\2\u043a\u043d\3\2\2\2\u043b"+
		"\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u00b7\3\2\2\2\u043d\u043b\3\2"+
		"\2\2\u043e\u043f\7\u00b5\2\2\u043f\u0440\5\u00b6\\\2\u0440\u0441\7\u00b6"+
		"\2\2\u0441\u00b9\3\2\2\2\u0442\u0447\5r:\2\u0443\u0444\7\u00bb\2\2\u0444"+
		"\u0446\5r:\2\u0445\u0443\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2"+
		"\2\u0447\u0448\3\2\2\2\u0448\u00bb\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044f"+
		"\5\u0088E\2\u044b\u044c\7\u00bb\2\2\u044c\u044e\5\u0088E\2\u044d\u044b"+
		"\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u00bd\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u0457\5\u0090I\2\u0453\u0454"+
		"\7\u00bb\2\2\u0454\u0456\5\u0090I\2\u0455\u0453\3\2\2\2\u0456\u0459\3"+
		"\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u00bf\3\2\2\2\u0459"+
		"\u0457\3\2\2\2\u045a\u045f\5\u0092J\2\u045b\u045c\7\u00bb\2\2\u045c\u045e"+
		"\5\u0092J\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2"+
		"\2\u045f\u0460\3\2\2\2\u0460\u00c1\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0467"+
		"\5\u00d2j\2\u0463\u0464\7\u00bb\2\2\u0464\u0466\5\u00d2j\2\u0465\u0463"+
		"\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u00c3\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046f\5\u00c8e\2\u046b\u046c"+
		"\7\u00bb\2\2\u046c\u046e\5\u00c8e\2\u046d\u046b\3\2\2\2\u046e\u0471\3"+
		"\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u00c5\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0473\7\u00b5\2\2\u0473\u0474\5\u00c4c\2\u0474\u0475"+
		"\7\u00b6\2\2\u0475\u00c7\3\2\2\2\u0476\u0477\be\1\2\u0477\u0478\7\u00b5"+
		"\2\2\u0478\u0479\5\u00c8e\2\u0479\u047a\7\u00b6\2\2\u047a\u0482\3\2\2"+
		"\2\u047b\u047c\7\u00db\2\2\u047c\u0482\5\u00c8e\b\u047d\u047e\7\u009b"+
		"\2\2\u047e\u0482\5\u00c8e\7\u047f\u0482\5\u00ccg\2\u0480\u0482\5\u00ca"+
		"f\2\u0481\u0476\3\2\2\2\u0481\u047b\3\2\2\2\u0481\u047d\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0481\u0480\3\2\2\2\u0482\u0494\3\2\2\2\u0483\u0484\f\f"+
		"\2\2\u0484\u0485\7\u00c4\2\2\u0485\u0493\5\u00c8e\r\u0486\u0487\f\13\2"+
		"\2\u0487\u0488\7\u0099\2\2\u0488\u0493\5\u00c8e\f\u0489\u048a\f\n\2\2"+
		"\u048a\u048b\7\u00ee\2\2\u048b\u0493\5\u00c8e\13\u048c\u048d\f\6\2\2\u048d"+
		"\u048e\7\u00de\2\2\u048e\u0493\5\u00c8e\7\u048f\u0490\f\5\2\2\u0490\u0491"+
		"\7\u009a\2\2\u0491\u0493\5\u00c8e\6\u0492\u0483\3\2\2\2\u0492\u0486\3"+
		"\2\2\2\u0492\u0489\3\2\2\2\u0492\u048c\3\2\2\2\u0492\u048f\3\2\2\2\u0493"+
		"\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u00c9\3\2"+
		"\2\2\u0496\u0494\3\2\2\2\u0497\u0498\5\u0098M\2\u0498\u00cb\3\2\2\2\u0499"+
		"\u049a\bg\1\2\u049a\u049b\5\u00d0i\2\u049b\u04b0\3\2\2\2\u049c\u049d\f"+
		"\7\2\2\u049d\u049f\7\u00d6\2\2\u049e\u04a0\7\u00db\2\2\u049f\u049e\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04af\t\f\2\2\u04a2"+
		"\u04a3\f\6\2\2\u04a3\u04a4\7\u00ab\2\2\u04a4\u04af\5\u00d0i\2\u04a5\u04a6"+
		"\f\5\2\2\u04a6\u04a7\5\u00ceh\2\u04a7\u04a8\5\u00d0i\2\u04a8\u04af\3\2"+
		"\2\2\u04a9\u04aa\f\4\2\2\u04aa\u04ab\5\u00ceh\2\u04ab\u04ac\t\r\2\2\u04ac"+
		"\u04ad\5\u00e8u\2\u04ad\u04af\3\2\2\2\u04ae\u049c\3\2\2\2\u04ae\u04a2"+
		"\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae\u04a9\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u00cd\3\2\2\2\u04b2\u04b0\3\2"+
		"\2\2\u04b3\u04b4\t\16\2\2\u04b4\u00cf\3\2\2\2\u04b5\u04b7\5\u00d2j\2\u04b6"+
		"\u04b8\7\u00db\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04ba\7\u00d5\2\2\u04ba\u04bb\5\u00e8u\2\u04bb\u04f0\3"+
		"\2\2\2\u04bc\u04be\5\u00d2j\2\u04bd\u04bf\7\u00db\2\2\u04be\u04bd\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\7\u00d5\2\2\u04c1"+
		"\u04c2\7\u00b5\2\2\u04c2\u04c7\5\u00d4k\2\u04c3\u04c4\7\u00bb\2\2\u04c4"+
		"\u04c6\5\u00d4k\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5"+
		"\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca"+
		"\u04cb\7\u00b6\2\2\u04cb\u04f0\3\2\2\2\u04cc\u04ce\5\u00d2j\2\u04cd\u04cf"+
		"\7\u00db\2\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2"+
		"\2\u04d0\u04d1\7\u00c7\2\2\u04d1\u04d2\5\u00d4k\2\u04d2\u04d3\7\u00c4"+
		"\2\2\u04d3\u04d4\5\u00d0i\2\u04d4\u04f0\3\2\2\2\u04d5\u04d6\5\u00d2j\2"+
		"\u04d6\u04d7\7\u00e6\2\2\u04d7\u04d8\7\u00d8\2\2\u04d8\u04d9\5\u00d4k"+
		"\2\u04d9\u04f0\3\2\2\2\u04da\u04dc\5\u00d2j\2\u04db\u04dd\7\u00db\2\2"+
		"\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df"+
		"\7\u00d8\2\2\u04df\u04e4\5\u00d4k\2\u04e0\u04e1\7\u00ce\2\2\u04e1\u04e3"+
		"\5\u00d4k\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2"+
		"\2\u04e4\u04e5\3\2\2\2\u04e5\u04f0\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e9"+
		"\5\u00d2j\2\u04e8\u04ea\7\u00db\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3"+
		"\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\7\u00e2\2\2\u04ec\u04ed\5\u00d4"+
		"k\2\u04ed\u04f0\3\2\2\2\u04ee\u04f0\5\u00d2j\2\u04ef\u04b5\3\2\2\2\u04ef"+
		"\u04bc\3\2\2\2\u04ef\u04cc\3\2\2\2\u04ef\u04d5\3\2\2\2\u04ef\u04da\3\2"+
		"\2\2\u04ef\u04e7\3\2\2\2\u04ef\u04ee\3\2\2\2\u04f0\u00d1\3\2\2\2\u04f1"+
		"\u04f2\bj\1\2\u04f2\u04f3\5\u00d4k\2\u04f3\u051d\3\2\2\2\u04f4\u04f5\f"+
		"\20\2\2\u04f5\u04f6\7\u009d\2\2\u04f6\u051c\5\u00d2j\21\u04f7\u04f8\f"+
		"\17\2\2\u04f8\u04f9\7\u009e\2\2\u04f9\u051c\5\u00d2j\20\u04fa\u04fb\f"+
		"\16\2\2\u04fb\u04fc\7\u009f\2\2\u04fc\u051c\5\u00d2j\17\u04fd\u04fe\f"+
		"\r\2\2\u04fe\u04ff\7\u00a0\2\2\u04ff\u051c\5\u00d2j\16\u0500\u0501\f\f"+
		"\2\2\u0501\u0502\7\u00a4\2\2\u0502\u051c\5\u00d2j\r\u0503\u0504\f\13\2"+
		"\2\u0504\u0505\7\u00a5\2\2\u0505\u051c\5\u00d2j\f\u0506\u0507\f\n\2\2"+
		"\u0507\u0508\7\u00a6\2\2\u0508\u051c\5\u00d2j\13\u0509\u050a\f\t\2\2\u050a"+
		"\u050b\7\u00a7\2\2\u050b\u051c\5\u00d2j\n\u050c\u050d\f\b\2\2\u050d\u050e"+
		"\7\u00da\2\2\u050e\u051c\5\u00d2j\t\u050f\u0510\f\7\2\2\u0510\u0511\7"+
		"\u00a2\2\2\u0511\u051c\5\u00d2j\b\u0512\u0513\f\6\2\2\u0513\u0514\7\u00a1"+
		"\2\2\u0514\u051c\5\u00d2j\7\u0515\u0516\f\5\2\2\u0516\u0517\7\u00a4\2"+
		"\2\u0517\u051c\5\u00dan\2\u0518\u0519\f\4\2\2\u0519\u051a\7\u00a5\2\2"+
		"\u051a\u051c\5\u00dan\2\u051b\u04f4\3\2\2\2\u051b\u04f7\3\2\2\2\u051b"+
		"\u04fa\3\2\2\2\u051b\u04fd\3\2\2\2\u051b\u0500\3\2\2\2\u051b\u0503\3\2"+
		"\2\2\u051b\u0506\3\2\2\2\u051b\u0509\3\2\2\2\u051b\u050c\3\2\2\2\u051b"+
		"\u050f\3\2\2\2\u051b\u0512\3\2\2\2\u051b\u0515\3\2\2\2\u051b\u0518\3\2"+
		"\2\2\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u00d3\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0521\bk\1\2\u0521\u0539\5\u00d6"+
		"l\2\u0522\u0539\5\u00e0q\2\u0523\u0539\5`\61\2\u0524\u0539\5\u00dep\2"+
		"\u0525\u0526\7\u00a4\2\2\u0526\u0539\5\u00d4k\16\u0527\u0528\7\u00a5\2"+
		"\2\u0528\u0539\5\u00d4k\r\u0529\u052a\7\u009c\2\2\u052a\u0539\5\u00d4"+
		"k\f\u052b\u052c\7\u009b\2\2\u052c\u0539\5\u00d4k\13\u052d\u052e\7\u00c8"+
		"\2\2\u052e\u0539\5\u00d4k\n\u052f\u0539\5\u00c6d\2\u0530\u0531\7\u00e4"+
		"\2\2\u0531\u0539\5\u00c6d\2\u0532\u0539\5\u00e8u\2\u0533\u0534\7\u00cf"+
		"\2\2\u0534\u0539\5\u00e8u\2\u0535\u0539\5\u00dco\2\u0536\u0539\5\u00da"+
		"n\2\u0537\u0539\5\62\32\2\u0538\u0520\3\2\2\2\u0538\u0522\3\2\2\2\u0538"+
		"\u0523\3\2\2\2\u0538\u0524\3\2\2\2\u0538\u0525\3\2\2\2\u0538\u0527\3\2"+
		"\2\2\u0538\u0529\3\2\2\2\u0538\u052b\3\2\2\2\u0538\u052d\3\2\2\2\u0538"+
		"\u052f\3\2\2\2\u0538\u0530\3\2\2\2\u0538\u0532\3\2\2\2\u0538\u0533\3\2"+
		"\2\2\u0538\u0535\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0537\3\2\2\2\u0539"+
		"\u0541\3\2\2\2\u053a\u053b\f\17\2\2\u053b\u053c\7\u0099\2\2\u053c\u0540"+
		"\5\u00d4k\20\u053d\u053e\f\21\2\2\u053e\u0540\5\20\t\2\u053f\u053a\3\2"+
		"\2\2\u053f\u053d\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541"+
		"\u0542\3\2\2\2\u0542\u00d5\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0545\7\u0124"+
		"\2\2\u0545\u0547\7\u00b5\2\2\u0546\u0548\5\u00d8m\2\u0547\u0546\3\2\2"+
		"\2\u0547\u0548\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u054c\5\u00c4c\2\u054a"+
		"\u054c\7\u00a6\2\2\u054b\u0549\3\2\2\2\u054b\u054a\3\2\2\2\u054b\u054c"+
		"\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\7\u00b6\2\2\u054e\u00d7\3\2\2"+
		"\2\u054f\u0550\7\u00cd\2\2\u0550\u00d9\3\2\2\2\u0551\u0552\5\u0098M\2"+
		"\u0552\u00db\3\2\2\2\u0553\u0554\5\u0098M\2\u0554\u00dd\3\2\2\2\u0555"+
		"\u0556\5\u0098M\2\u0556\u00df\3\2\2\2\u0557\u0571\5\u00e2r\2\u0558\u0571"+
		"\5\u00e4s\2\u0559\u0571\7\u00e9\2\2\u055a\u0571\7\u00d0\2\2\u055b\u0571"+
		"\7\u00dc\2\2\u055c\u055d\7\u00b7\2\2\u055d\u055e\7\u0124\2\2\u055e\u055f"+
		"\7\u011e\2\2\u055f\u0571\7\u00b8\2\2\u0560\u0571\7\u0122\2\2\u0561\u0571"+
		"\5\u00e6t\2\u0562\u0563\7\u0124\2\2\u0563\u0565\7\u011e\2\2\u0564\u0566"+
		"\5\20\t\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0571\3\2\2\2"+
		"\u0567\u0568\t\17\2\2\u0568\u0571\7\u011e\2\2\u0569\u056b\7\u0124\2\2"+
		"\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056e"+
		"\7\u00c9\2\2\u056d\u056f\5\20\t\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2"+
		"\2\2\u056f\u0571\3\2\2\2\u0570\u0557\3\2\2\2\u0570\u0558\3\2\2\2\u0570"+
		"\u0559\3\2\2\2\u0570\u055a\3\2\2\2\u0570\u055b\3\2\2\2\u0570\u055c\3\2"+
		"\2\2\u0570\u0560\3\2\2\2\u0570\u0561\3\2\2\2\u0570\u0562\3\2\2\2\u0570"+
		"\u0567\3\2\2\2\u0570\u056a\3\2\2\2\u0571\u00e1\3\2\2\2\u0572\u0573\7\u00c0"+
		"\2\2\u0573\u00e3\3\2\2\2\u0574\u0575\7\u011f\2\2\u0575\u00e5\3\2\2\2\u0576"+
		"\u0577\7\u011e\2\2\u0577\u00e7\3\2\2\2\u0578\u0579\5\u0098M\2\u0579\u00e9"+
		"\3\2\2\2\u057a\u057b\7\u00df\2\2\u057b\u057c\7\u00ca\2\2\u057c\u0581\5"+
		"\u00ecw\2\u057d\u057e\7\u00bb\2\2\u057e\u0580\5\u00ecw\2\u057f\u057d\3"+
		"\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582"+
		"\u00eb\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u0588\5`\61\2\u0585\u0588\5\u00e4"+
		"s\2\u0586\u0588\5\u00c8e\2\u0587\u0584\3\2\2\2\u0587\u0585\3\2\2\2\u0587"+
		"\u0586\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u058b\t\6\2\2\u058a\u0589\3\2"+
		"\2\2\u058a\u058b\3\2\2\2\u058b\u00ed\3\2\2\2\u058c\u058e\7\u00f9\2\2\u058d"+
		"\u058f\7\u011a\2\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0592\7\u0106\2\2\u0591\u0593\7\23\2\2\u0592\u0591\3\2"+
		"\2\2\u0592\u0593\3\2\2\2\u0593\u059a\3\2\2\2\u0594\u0595\7\67\2\2\u0595"+
		"\u0596\7\u00db\2\2\u0596\u0598\7\u00cf\2\2\u0597\u0594\3\2\2\2\u0597\u0598"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\5h\65\2\u059a\u0597\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\7\u010a\2\2\u059d\u059e"+
		"\5^\60\2\u059e\u00ef\3\2\2\2\u059f\u05a0\5\u00f2z\2\u05a0\u05a1\5\u00f4"+
		"{\2\u05a1\u05a5\3\2\2\2\u05a2\u05a5\5\u00f6|\2\u05a3\u05a5\5\u00f8}\2"+
		"\u05a4\u059f\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a3\3\2\2\2\u05a5\u00f1"+
		"\3\2\2\2\u05a6\u05a7\7\u00f0\2\2\u05a7\u05aa\7\u0106\2\2\u05a8\u05a9\7"+
		"\67\2\2\u05a9\u05ab\7\u00cf\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2"+
		"\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\5h\65\2\u05ad\u00f3\3\2\2\2\u05ae\u05af"+
		"\7g\2\2\u05af\u05b0\7\u0117\2\2\u05b0\u05b1\5h\65\2\u05b1\u00f5\3\2\2"+
		"\2\u05b2\u05b3\7\u00f0\2\2\u05b3\u05b4\7\u0106\2\2\u05b4\u05b5\5h\65\2"+
		"\u05b5\u05b6\7!\2\2\u05b6\u05b7\7\u010a\2\2\u05b7\u05b8\7(\2\2\u05b8\u05b9"+
		"\5p9\2\u05b9\u00f7\3\2\2\2\u05ba\u05bb\7\u00f0\2\2\u05bb\u05bc\7\u0106"+
		"\2\2\u05bc\u05bd\7\u00c3\2\2\u05bd\u05be\7\u00d5\2\2\u05be\u05bf\7\u0084"+
		"\2\2\u05bf\u05c3\5h\65\2\u05c0\u05c1\7\\\2\2\u05c1\u05c2\7\u00ca\2\2\u05c2"+
		"\u05c4\5\u00ba^\2\u05c3\u05c0\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u00f9"+
		"\3\2\2\2\u05c5\u05c6\7\u00ff\2\2\u05c6\u05c8\7\u0106\2\2\u05c7\u05c9\7"+
		"\23\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca"+
		"\u05cb\7\67\2\2\u05cb\u05cd\7\u00cf\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\5\u00b6\\\2\u05cf\u00fb\3\2\2"+
		"\2\u05d0\u05d1\5\u00fe\u0080\2\u05d1\u05d3\5\u0100\u0081\2\u05d2\u05d4"+
		"\5\u0106\u0084\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u00fd\3"+
		"\2\2\2\u05d5\u05db\7\u00f9\2\2\u05d6\u05d8\t\20\2\2\u05d7\u05d6\3\2\2"+
		"\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\t\21\2\2\u05da"+
		"\u05dc\7\u008b\2\2\u05db\u05d7\3\2\2\2\u05db\u05da\3\2\2\2\u05db\u05dc"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e1\7\u0116\2\2\u05de\u05df\7\67"+
		"\2\2\u05df\u05e0\7\u00db\2\2\u05e0\u05e2\7\u00cf\2\2\u05e1\u05de\3\2\2"+
		"\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\5^\60\2\u05e4\u00ff"+
		"\3\2\2\2\u05e5\u05ee\7\u00b5\2\2\u05e6\u05eb\5\u0102\u0082\2\u05e7\u05e8"+
		"\7\u00bb\2\2\u05e8\u05ea\5\u0102\u0082\2\u05e9\u05e7\3\2\2\2\u05ea\u05ed"+
		"\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed"+
		"\u05eb\3\2\2\2\u05ee\u05e6\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f1\7\u00b6\2\2\u05f1\u0101\3\2\2\2\u05f2\u05fd\5\4\3\2\u05f3"+
		"\u05fd\5(\25\2\u05f4\u05f5\7\u00d8\2\2\u05f5\u05f9\5^\60\2\u05f6\u05f8"+
		"\5\u0104\u0083\2\u05f7\u05f6\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3"+
		"\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc"+
		"\u05f2\3\2\2\2\u05fc\u05f3\3\2\2\2\u05fc\u05f4\3\2\2\2\u05fd\u0103\3\2"+
		"\2\2\u05fe\u05ff\t\22\2\2\u05ff\u0600\t\23\2\2\u0600\u0105\3\2\2\2\u0601"+
		"\u0602\7=\2\2\u0602\u0603\7\u00b5\2\2\u0603\u0608\5^\60\2\u0604\u0605"+
		"\7\u00bb\2\2\u0605\u0607\5^\60\2\u0606\u0604\3\2\2\2\u0607\u060a\3\2\2"+
		"\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u0608"+
		"\3\2\2\2\u060b\u060c\7\u00b6\2\2\u060c\u0107\3\2\2\2\u060d\u0611\5\u010a"+
		"\u0086\2\u060e\u0612\5\u010e\u0088\2\u060f\u0612\5\u0124\u0093\2\u0610"+
		"\u0612\5\u0126\u0094\2\u0611\u060e\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0610"+
		"\3\2\2\2\u0612\u0617\3\2\2\2\u0613\u0614\5\u012c\u0097\2\u0614\u0615\5"+
		"\u012e\u0098\2\u0615\u0617\3\2\2\2\u0616\u060d\3\2\2\2\u0616\u0613\3\2"+
		"\2\2\u0617\u0109\3\2\2\2\u0618\u0619\7\u00f0\2\2\u0619\u061c\7\u0116\2"+
		"\2\u061a\u061b\7\67\2\2\u061b\u061d\7\u00cf\2\2\u061c\u061a\3\2\2\2\u061c"+
		"\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u0620\7Y\2\2\u061f\u061e\3\2"+
		"\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\5^\60\2\u0622"+
		"\u0624\7\u00a6\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u010b"+
		"\3\2\2\2\u0625\u0626\7\u00f0\2\2\u0626\u0627\7\u0116\2\2\u0627\u010d\3"+
		"\2\2\2\u0628\u062d\5\u0110\u0089\2\u0629\u062a\7\u00bb\2\2\u062a\u062c"+
		"\5\u0110\u0089\2\u062b\u0629\3\2\2\2\u062c\u062f\3\2\2\2\u062d\u062b\3"+
		"\2\2\2\u062d\u062e\3\2\2\2\u062e\u010f\3\2\2\2\u062f\u062d\3\2\2\2\u0630"+
		"\u06a4\5\u0114\u008b\2\u0631\u06a4\5\u0116\u008c\2\u0632\u06a4\5\u0118"+
		"\u008d\2\u0633\u06a4\5\u0122\u0092\2\u0634\u0635\7\u00f0\2\2\u0635\u0636"+
		"\7\u00f8\2\2\u0636\u0637\5z>\2\u0637\u0638\5&\24\2\u0638\u06a4\3\2\2\2"+
		"\u0639\u063a\7\u0091\2\2\u063a\u063b\7\u00f8\2\2\u063b\u06a4\5z>\2\u063c"+
		"\u063d\7\u00ff\2\2\u063d\u0640\7\u00f8\2\2\u063e\u063f\7\67\2\2\u063f"+
		"\u0641\7\u00cf\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642"+
		"\3\2\2\2\u0642\u0644\5z>\2\u0643\u0645\t\24\2\2\u0644\u0643\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u06a4\3\2\2\2\u0646\u0647\t\25\2\2\u0647\u064b\7"+
		"\u0087\2\2\u0648\u064c\5\u0084C\2\u0649\u064c\7\u00c3\2\2\u064a\u064c"+
		"\7\u011b\2\2\u064b\u0648\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064a\3\2\2"+
		"\2\u064b\u064c\3\2\2\2\u064c\u06a4\3\2\2\2\u064d\u064e\7\u0100\2\2\u064e"+
		"\u064f\t\26\2\2\u064f\u0650\7\u0087\2\2\u0650\u06a4\5\u0084C\2\u0651\u0652"+
		"\t\25\2\2\u0652\u0653\7p\2\2\u0653\u06a4\5\u008cG\2\u0654\u0655\7\u0100"+
		"\2\2\u0655\u0656\t\26\2\2\u0656\u0657\7p\2\2\u0657\u06a4\5\u008cG\2\u0658"+
		"\u065f\7\u00fe\2\2\u0659\u065f\7\u0100\2\2\u065a\u065c\7\u0109\2\2\u065b"+
		"\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\7."+
		"\2\2\u065e\u0658\3\2\2\2\u065e\u0659\3\2\2\2\u065e\u065b\3\2\2\2\u065f"+
		"\u0660\3\2\2\2\u0660\u0661\7\u00e4\2\2\u0661\u0662\7\u0108\2\2\u0662\u06a4"+
		"\7t\2\2\u0663\u0664\7\20\2\2\u0664\u0665\7\u010a\2\2\u0665\u06a4\5h\65"+
		"\2\u0666\u0667\7\u00e5\2\2\u0667\u0668\7\u0095\2\2\u0668\u06a4\7\20\2"+
		"\2\u0669\u066a\7\u00e5\2\2\u066a\u066b\t\27\2\2\u066b\u06a4\7X\2\2\u066c"+
		"\u066d\7\u00e5\2\2\u066d\u066e\7\u0084\2\2\u066e\u06a4\5d\63\2\u066f\u0670"+
		"\7\u00e5\2\2\u0670\u06a4\t\30\2\2\u0671\u0672\7\u00e5\2\2\u0672\u0673"+
		"\7\u00b5\2\2\u0673\u0678\5\u0128\u0095\2\u0674\u0675\7\u00bb\2\2\u0675"+
		"\u0677\5\u0128\u0095\2\u0676\u0674\3\2\2\2\u0677\u067a\3\2\2\2\u0678\u0676"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2\2\u067a\u0678\3\2\2\2\u067b"+
		"\u067c\7\u00b6\2\2\u067c\u06a4\3\2\2\2\u067d\u067e\7k\2\2\u067e\u067f"+
		"\7\u00b5\2\2\u067f\u0684\5\u012a\u0096\2\u0680\u0681\7\u00bb\2\2\u0681"+
		"\u0683\5\u012a\u0096\2\u0682\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686\u0684\3\2\2\2\u0687"+
		"\u0688\7\u00b6\2\2\u0688\u06a4\3\2\2\2\u0689\u068a\7<\2\2\u068a\u06a4"+
		"\5^\60\2\u068b\u068c\7\u0109\2\2\u068c\u068d\7<\2\2\u068d\u06a4\5^\60"+
		"\2\u068e\u068f\7W\2\2\u068f\u06a4\5\b\5\2\u0690\u0691\7\u00db\2\2\u0691"+
		"\u06a4\7W\2\2\u0692\u0693\7]\2\2\u0693\u0697\7\u0117\2\2\u0694\u0698\5"+
		"\u008eH\2\u0695\u0698\7\32\2\2\u0696\u0698\7z\2\2\u0697\u0694\3\2\2\2"+
		"\u0697\u0695\3\2\2\2\u0697\u0696\3\2\2\2\u0698\u06a4\3\2\2\2\u0699\u069a"+
		"\7i\2\2\u069a\u06a1\7\66\2\2\u069b\u06a2\7\u00fc\2\2\u069c\u069d\7\u008f"+
		"\2\2\u069d\u069e\7\u0106\2\2\u069e\u06a2\5h\65\2\u069f\u06a2\7/\2\2\u06a0"+
		"\u06a2\7T\2\2\u06a1\u069b\3\2\2\2\u06a1\u069c\3\2\2\2\u06a1\u069f\3\2"+
		"\2\2\u06a1\u06a0\3\2\2\2\u06a2\u06a4\3\2\2\2\u06a3\u0630\3\2\2\2\u06a3"+
		"\u0631\3\2\2\2\u06a3\u0632\3\2\2\2\u06a3\u0633\3\2\2\2\u06a3\u0634\3\2"+
		"\2\2\u06a3\u0639\3\2\2\2\u06a3\u063c\3\2\2\2\u06a3\u0646\3\2\2\2\u06a3"+
		"\u064d\3\2\2\2\u06a3\u0651\3\2\2\2\u06a3\u0654\3\2\2\2\u06a3\u065e\3\2"+
		"\2\2\u06a3\u0663\3\2\2\2\u06a3\u0666\3\2\2\2\u06a3\u0669\3\2\2\2\u06a3"+
		"\u066c\3\2\2\2\u06a3\u066f\3\2\2\2\u06a3\u0671\3\2\2\2\u06a3\u067d\3\2"+
		"\2\2\u06a3\u0689\3\2\2\2\u06a3\u068b\3\2\2\2\u06a3\u068e\3\2\2\2\u06a3"+
		"\u0690\3\2\2\2\u06a3\u0692\3\2\2\2\u06a3\u0699\3\2\2\2\u06a4\u0111\3\2"+
		"\2\2\u06a5\u06a6\7\u00f8\2\2\u06a6\u06a8\5z>\2\u06a7\u06a5\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06ac\7\u011a\2\2\u06aa\u06ac"+
		"\5\u0096L\2\u06ab\u06a9\3\2\2\2\u06ab\u06aa\3\2\2\2\u06ac\u06ad\3\2\2"+
		"\2\u06ad\u06ae\7\u008f\2\2\u06ae\u06af\7\u0106\2\2\u06af\u06b0\5h\65\2"+
		"\u06b0\u06b1\5&\24\2\u06b1\u0113\3\2\2\2\u06b2\u06b4\7\u00ef\2\2\u06b3"+
		"\u06b5\7\u00f5\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b9"+
		"\3\2\2\2\u06b6\u06b7\7\67\2\2\u06b7\u06b8\7\u00db\2\2\u06b8\u06ba\7\u00cf"+
		"\2\2\u06b9\u06b6\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\5\4\3\2\u06bc\u0115\3\2\2\2\u06bd\u06bf\7\u00ff\2\2\u06be\u06c0"+
		"\7\u00f5\2\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c3\3\2\2"+
		"\2\u06c1\u06c2\7\67\2\2\u06c2\u06c4\7\u00cf\2\2\u06c3\u06c1\3\2\2\2\u06c3"+
		"\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\5`\61\2\u06c6\u06c8\t\24"+
		"\2\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u0117\3\2\2\2\u06c9"+
		"\u06cc\5\u011a\u008e\2\u06ca\u06cb\7\u00e5\2\2\u06cb\u06cd\7\34\2\2\u06cc"+
		"\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\7\u0088"+
		"\2\2\u06cf\u06d1\5\6\4\2\u06d0\u06d2\5\20\t\2\u06d1\u06d0\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d4\7\u008f\2\2\u06d4\u06d6"+
		"\5\u00d4k\2\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u071b\3\2\2"+
		"\2\u06d7\u06d8\5\u011a\u008e\2\u06d8\u06d9\7\u00e5\2\2\u06d9\u06da\7\u00fc"+
		"\2\2\u06da\u06db\5\u00c8e\2\u06db\u071b\3\2\2\2\u06dc\u06dd\5\u011a\u008e"+
		"\2\u06dd\u06de\7\u00ff\2\2\u06de\u06df\7\u00fc\2\2\u06df\u071b\3\2\2\2"+
		"\u06e0\u06e1\5\u011a\u008e\2\u06e1\u06e2\t\31\2\2\u06e2\u06e3\7\u00db"+
		"\2\2\u06e3\u06e4\7\u00dc\2\2\u06e4\u071b\3\2\2\2\u06e5\u06e6\5\u011a\u008e"+
		"\2\u06e6\u06e7\7\u00ef\2\2\u06e7\u06eb\7\u0104\2\2\u06e8\u06ec\7\u00f1"+
		"\2\2\u06e9\u06ea\7\u00ca\2\2\u06ea\u06ec\7\u00fc\2\2\u06eb\u06e8\3\2\2"+
		"\2\u06eb\u06e9\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\7\u00f2\2\2\u06ee"+
		"\u06f3\7\66\2\2\u06ef\u06f0\7\u00b5\2\2\u06f0\u06f1\5\36\20\2\u06f1\u06f2"+
		"\7\u00b6\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06ef\3\2\2\2\u06f3\u06f4\3\2\2"+
		"\2\u06f4\u071b\3\2\2\2\u06f5\u06f6\5\u011a\u008e\2\u06f6\u06fa\5\u011c"+
		"\u008f\2\u06f7\u06f9\5\u011c\u008f\2\u06f8\u06f7\3\2\2\2\u06f9\u06fc\3"+
		"\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u071b\3\2\2\2\u06fc"+
		"\u06fa\3\2\2\2\u06fd\u06fe\5\u011a\u008e\2\u06fe\u06ff\7\u00ff\2\2\u06ff"+
		"\u0702\7\66\2\2\u0700\u0701\7\67\2\2\u0701\u0703\7\u00cf\2\2\u0702\u0700"+
		"\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u071b\3\2\2\2\u0704\u0705\5\u011a\u008e"+
		"\2\u0705\u0706\7\u00e5\2\2\u0706\u0707\7\177\2\2\u0707\u0708\7\u011f\2"+
		"\2\u0708\u071b\3\2\2\2\u0709\u070a\5\u011a\u008e\2\u070a\u070b\7\u00e5"+
		"\2\2\u070b\u070c\7\u00b5\2\2\u070c\u070d\5\u011e\u0090\2\u070d\u070e\7"+
		"\u00b6\2\2\u070e\u071b\3\2\2\2\u070f\u0710\5\u011a\u008e\2\u0710\u0711"+
		"\7k\2\2\u0711\u0712\7\u00b5\2\2\u0712\u0713\5\u011e\u0090\2\u0713\u0714"+
		"\7\u00b6\2\2\u0714\u071b\3\2\2\2\u0715\u0716\5\u011a\u008e\2\u0716\u0717"+
		"\7\u00e5\2\2\u0717\u0718\7\u0080\2\2\u0718\u0719\t\32\2\2\u0719\u071b"+
		"\3\2\2\2\u071a\u06c9\3\2\2\2\u071a\u06d7\3\2\2\2\u071a\u06dc\3\2\2\2\u071a"+
		"\u06e0\3\2\2\2\u071a\u06e5\3\2\2\2\u071a\u06f5\3\2\2\2\u071a\u06fd\3\2"+
		"\2\2\u071a\u0704\3\2\2\2\u071a\u0709\3\2\2\2\u071a\u070f\3\2\2\2\u071a"+
		"\u0715\3\2\2\2\u071b\u0119\3\2\2\2\u071c\u071e\7\u00f0\2\2\u071d\u071f"+
		"\7\u00f5\2\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2"+
		"\2\u0720\u0721\5`\61\2\u0721\u011b\3\2\2\2\u0722\u072a\7\u00e5\2\2\u0723"+
		"\u0727\7\u0104\2\2\u0724\u0728\7\u00f1\2\2\u0725\u0726\7\u00ca\2\2\u0726"+
		"\u0728\7\u00fc\2\2\u0727\u0724\3\2\2\2\u0727\u0725\3\2\2\2\u0728\u072b"+
		"\3\2\2\2\u0729\u072b\5 \21\2\u072a\u0723\3\2\2\2\u072a\u0729\3\2\2\2\u072b"+
		"\u0734\3\2\2\2\u072c\u0731\7l\2\2\u072d\u072f\7\u00ed\2\2\u072e\u072d"+
		"\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0732\7\u011f\2"+
		"\2\u0731\u072e\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0722"+
		"\3\2\2\2\u0733\u072c\3\2\2\2\u0734\u011d\3\2\2\2\u0735\u073a\5\u0120\u0091"+
		"\2\u0736\u0737\7\u00bb\2\2\u0737\u0739\5\u0120\u0091\2\u0738\u0736\3\2"+
		"\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2\2\2\u073b"+
		"\u011f\3\2\2\2\u073c\u073a\3\2\2\2\u073d\u073e\7\u0124\2\2\u073e\u073f"+
		"\7\u00ad\2\2\u073f\u0740\5\u00d4k\2\u0740\u0121\3\2\2\2\u0741\u0748\7"+
		"\u00ef\2\2\u0742\u0745\5(\25\2\u0743\u0744\7\u00db\2\2\u0744\u0746\7\u0090"+
		"\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0749\3\2\2\2\u0747"+
		"\u0749\5\u0112\u008a\2\u0748\u0742\3\2\2\2\u0748\u0747\3\2\2\2\u0749\u0123"+
		"\3\2\2\2\u074a\u074c\7g\2\2\u074b\u074d\7\u00f5\2\2\u074c\u074b\3\2\2"+
		"\2\u074c\u074d\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\5`\61\2\u074f\u0750"+
		"\7\u0117\2\2\u0750\u0751\5`\61\2\u0751\u0125\3\2\2\2\u0752\u0753\7g\2"+
		"\2\u0753\u0754\7\u00f8\2\2\u0754\u0755\5z>\2\u0755\u0756\7\u0117\2\2\u0756"+
		"\u0757\5z>\2\u0757\u0127\3\2\2\2\u0758\u0759\5\u012a\u0096\2\u0759\u075a"+
		"\7\u00ad\2\2\u075a\u075b\5\u00d4k\2\u075b\u0129\3\2\2\2\u075c\u075d\7"+
		"\u0124\2\2\u075d\u012b\3\2\2\2\u075e\u0761\5\u010c\u0087\2\u075f\u0760"+
		"\7\67\2\2\u0760\u0762\7\u00cf\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2"+
		"\2\2\u0762\u0763\3\2\2\2\u0763\u0764\5^\60\2\u0764\u012d\3\2\2\2\u0765"+
		"\u0766\7g\2\2\u0766\u0767\7\u0117\2\2\u0767\u0768\5^\60\2\u0768\u012f"+
		"\3\2\2\2\u0769\u076a\7\u00ff\2\2\u076a\u076d\7\u0116\2\2\u076b\u076c\7"+
		"\67\2\2\u076c\u076e\7\u00cf\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2"+
		"\2\u076e\u076f\3\2\2\2\u076f\u0770\5\u00aaV\2\u0770\u0131\3\2\2\2\u0771"+
		"\u0773\7\u0119\2\2\u0772\u0774\7\u0116\2\2\u0773\u0772\3\2\2\2\u0773\u0774"+
		"\3\2\2\2\u0774\u0776\3\2\2\2\u0775\u0777\7Y\2\2\u0776\u0775\3\2\2\2\u0776"+
		"\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\5\u0134\u009b\2\u0779\u0133"+
		"\3\2\2\2\u077a\u077f\5\u0136\u009c\2\u077b\u077c\7\u00bb\2\2\u077c\u077e"+
		"\5\u0136\u009c\2\u077d\u077b\3\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3"+
		"\2\2\2\u077f\u0780\3\2\2\2\u0780\u0135\3\2\2\2\u0781\u077f\3\2\2\2\u0782"+
		"\u0784\5^\60\2\u0783\u0785\7\u00a6\2\2\u0784\u0783\3\2\2\2\u0784\u0785"+
		"\3\2\2\2\u0785\u0137\3\2\2\2\u0786\u0787\7\u00e5\2\2\u0787\u0792\7\u0118"+
		"\2\2\u0788\u078d\5\u013a\u009e\2\u0789\u078a\7\u00bb\2\2\u078a\u078c\5"+
		"\u013a\u009e\2\u078b\u0789\3\2\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2"+
		"\2\2\u078d\u078e\3\2\2\2\u078e\u0793\3\2\2\2\u078f\u078d\3\2\2\2\u0790"+
		"\u0791\7}\2\2\u0791\u0793\7\u0124\2\2\u0792\u0788\3\2\2\2\u0792\u0790"+
		"\3\2\2\2\u0793\u07a2\3\2\2\2\u0794\u0795\7\u00e5\2\2\u0795\u0796\7y\2"+
		"\2\u0796\u0797\7\17\2\2\u0797\u0798\7\u00f2\2\2\u0798\u0799\7\u0118\2"+
		"\2\u0799\u079e\5\u013a\u009e\2\u079a\u079b\7\u00bb\2\2\u079b\u079d\5\u013a"+
		"\u009e\2\u079c\u079a\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e"+
		"\u079f\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1\u0786\3\2"+
		"\2\2\u07a1\u0794\3\2\2\2\u07a2\u0139\3\2\2\2\u07a3\u07a4\7\u0107\2\2\u07a4"+
		"\u07ac\7\u0108\2\2\u07a5\u07ad\7\u0114\2\2\u07a6\u07a7\7h\2\2\u07a7\u07ad"+
		"\7\u010e\2\2\u07a8\u07a9\7\u010e\2\2\u07a9\u07ad\7\u00f7\2\2\u07aa\u07ab"+
		"\7\u010e\2\2\u07ab\u07ad\7\u008a\2\2\u07ac\u07a5\3\2\2\2\u07ac\u07a6\3"+
		"\2\2\2\u07ac\u07a8\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ad\u07b5\3\2\2\2\u07ae"+
		"\u07af\7\u010e\2\2\u07af\u07b5\t\33\2\2\u07b0\u07b2\7\u00db\2\2\u07b1"+
		"\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\7\37"+
		"\2\2\u07b4\u07a3\3\2\2\2\u07b4\u07ae\3\2\2\2\u07b4\u07b1\3\2\2\2\u07b5"+
		"\u013b\3\2\2\2\u07b6\u07b8\7\u00f6\2\2\u07b7\u07b9\5\u0146\u00a4\2\u07b8"+
		"\u07b7\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07be\3\2\2\2\u07ba\u07bb\7\u00f6"+
		"\2\2\u07bb\u07bc\7b\2\2\u07bc\u07be\7\u0124\2\2\u07bd\u07b6\3\2\2\2\u07bd"+
		"\u07ba\3\2\2\2\u07be\u013d\3\2\2\2\u07bf\u07cd\7\u0112\2\2\u07c0\u07c2"+
		"\5\u0146\u00a4\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07ce\3"+
		"\2\2\2\u07c3\u07c4\7b\2\2\u07c4\u07ce\7\u0124\2\2\u07c5\u07c7\5\u0146"+
		"\u00a4\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8"+
		"\u07ca\7\u0117\2\2\u07c9\u07cb\7q\2\2\u07ca\u07c9\3\2\2\2\u07ca\u07cb"+
		"\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\7\u0124\2\2\u07cd\u07c1\3\2\2"+
		"\2\u07cd\u07c3\3\2\2\2\u07cd\u07c6\3\2\2\2\u07ce\u013f\3\2\2\2\u07cf\u07d0"+
		"\7q\2\2\u07d0\u07d1\7\u0124\2\2\u07d1\u0141\3\2\2\2\u07d2\u07d4\7\7\2"+
		"\2\u07d3\u07d5\5\u0146\u00a4\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2"+
		"\u07d5\u07de\3\2\2\2\u07d6\u07db\5\u013a\u009e\2\u07d7\u07d8\7\u00bb\2"+
		"\2\u07d8\u07da\5\u013a\u009e\2\u07d9\u07d7\3\2\2\2\u07da\u07dd\3\2\2\2"+
		"\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db"+
		"\3\2\2\2\u07de\u07d6\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u0143\3\2\2\2\u07e0"+
		"\u07e1\7\u0115\2\2\u07e1\u07e3\7\u0118\2\2\u07e2\u07e4\5\u0146\u00a4\2"+
		"\u07e3\u07e2\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07ed\3\2\2\2\u07e5\u07ea"+
		"\5\u013a\u009e\2\u07e6\u07e7\7\u00bb\2\2\u07e7\u07e9\5\u013a\u009e\2\u07e8"+
		"\u07e6\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2"+
		"\2\2\u07eb\u07ee\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ed\u07e5\3\2\2\2\u07ed"+
		"\u07ee\3\2\2\2\u07ee\u0145\3\2\2\2\u07ef\u07f0\t\34\2\2\u07f0\u0147\3"+
		"\2\2\2\u07f1\u07f2\7\u0105\2\2\u07f2\u07f4\5\u014a\u00a6\2\u07f3\u07f5"+
		"\5\u00b0Y\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07fd\3\2\2"+
		"\2\u07f6\u07f7\7\u00bb\2\2\u07f7\u07f9\5\u014a\u00a6\2\u07f8\u07fa\5\u00b0"+
		"Y\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\3\2\2\2\u07fb"+
		"\u07f6\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2"+
		"\2\2\u07fe\u0800\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800\u0801\5\u014c\u00a7"+
		"\2\u0801\u0802\7\u0117\2\2\u0802\u0806\5\u0160\u00b1\2\u0803\u0804\7\u00ed"+
		"\2\2\u0804\u0805\7\u0105\2\2\u0805\u0807\7\u010b\2\2\u0806\u0803\3\2\2"+
		"\2\u0806\u0807\3\2\2\2\u0807\u0149\3\2\2\2\u0808\u080a\7\u00c3\2\2\u0809"+
		"\u080b\7\u010d\2\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u081a"+
		"\3\2\2\2\u080c\u081a\7u\2\2\u080d\u081a\7@\2\2\u080e\u081a\7\u008d\2\2"+
		"\u080f\u081a\7\u00fd\2\2\u0810\u081a\7\u0119\2\2\u0811\u081a\7\u010f\2"+
		"\2\u0812\u081a\7\u0087\2\2\u0813\u081a\7\u00f9\2\2\u0814\u081a\7\24\2"+
		"\2\u0815\u081a\7\u0086\2\2\u0816\u081a\7\u0085\2\2\u0817\u081a\7&\2\2"+
		"\u0818\u081a\7\u008e\2\2\u0819\u0808\3\2\2\2\u0819\u080c\3\2\2\2\u0819"+
		"\u080d\3\2\2\2\u0819\u080e\3\2\2\2\u0819\u080f\3\2\2\2\u0819\u0810\3\2"+
		"\2\2\u0819\u0811\3\2\2\2\u0819\u0812\3\2\2\2\u0819\u0813\3\2\2\2\u0819"+
		"\u0814\3\2\2\2\u0819\u0815\3\2\2\2\u0819\u0816\3\2\2\2\u0819\u0817\3\2"+
		"\2\2\u0819\u0818\3\2\2\2\u081a\u014b\3\2\2\2\u081b\u0884\7\u010a\2\2\u081c"+
		"\u081e\7\u0116\2\2\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f"+
		"\3\2\2\2\u081f\u0885\5\u00aaV\2\u0820\u0821\7\u00c3\2\2\u0821\u0822\7"+
		"\u0083\2\2\u0822\u0823\7\u00d5\2\2\u0823\u0824\7r\2\2\u0824\u0885\5\u00a2"+
		"R\2\u0825\u0826\7v\2\2\u0826\u0885\5\u00b2Z\2\u0827\u0828\7\u00c3\2\2"+
		"\u0828\u0829\7w\2\2\u0829\u082a\7\u00d5\2\2\u082a\u082b\7r\2\2\u082b\u0885"+
		"\5\u00a2R\2\u082c\u082d\7\35\2\2\u082d\u0885\5\u00a4S\2\u082e\u082f\7"+
		"\"\2\2\u082f\u0885\5\u00a6T\2\u0830\u0831\7\u0102\2\2\u0831\u0832\7\34"+
		"\2\2\u0832\u0833\7\u0096\2\2\u0833\u0885\5\u0150\u00a9\2\u0834\u0835\7"+
		"\u0102\2\2\u0835\u0836\7x\2\2\u0836\u0885\5\u00c0a\2\u0837\u0838\t\35"+
		"\2\2\u0838\u0851\5\u0086D\2\u0839\u084e\7\u00b5\2\2\u083a\u083c\5\u0152"+
		"\u00aa\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\3\2\2\2\u083d"+
		"\u083f\5\u0154\u00ab\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u084b\5\6\4\2\u0841\u0843\7\u00bb\2\2\u0842\u0844\5\u0152"+
		"\u00aa\2\u0843\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846\3\2\2\2\u0845"+
		"\u0847\5\u0154\u00ab\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u084a\5\6\4\2\u0849\u0841\3\2\2\2\u084a\u084d\3\2\2\2\u084b"+
		"\u0849\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084f\3\2\2\2\u084d\u084b\3\2"+
		"\2\2\u084e\u083b\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\3\2\2\2\u0850"+
		"\u0852\7\u00b6\2\2\u0851\u0839\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0871"+
		"\3\2\2\2\u0853\u0854\7\u00bb\2\2\u0854\u086d\5\u0086D\2\u0855\u086a\7"+
		"\u00b5\2\2\u0856\u0858\5\u0152\u00aa\2\u0857\u0856\3\2\2\2\u0857\u0858"+
		"\3\2\2\2\u0858\u085a\3\2\2\2\u0859\u085b\5\u0154\u00ab\2\u085a\u0859\3"+
		"\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u0867\5\6\4\2\u085d"+
		"\u085f\7\u00bb\2\2\u085e\u0860\5\u0152\u00aa\2\u085f\u085e\3\2\2\2\u085f"+
		"\u0860\3\2\2\2\u0860\u0862\3\2\2\2\u0861\u0863\5\u0154\u00ab\2\u0862\u0861"+
		"\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0866\5\6\4\2\u0865"+
		"\u085d\3\2\2\2\u0866\u0869\3\2\2\2\u0867\u0865\3\2\2\2\u0867\u0868\3\2"+
		"\2\2\u0868\u086b\3\2\2\2\u0869\u0867\3\2\2\2\u086a\u0857\3\2\2\2\u086a"+
		"\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086e\7\u00b6\2\2\u086d\u0855"+
		"\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u0853\3\2\2\2\u0870"+
		"\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0885\3\2"+
		"\2\2\u0873\u0871\3\2\2\2\u0874\u0875\7\u00c3\2\2\u0875\u0876\t\36\2\2"+
		"\u0876\u0877\7\u00d5\2\2\u0877\u0878\7r\2\2\u0878\u0885\5\u00a2R\2\u0879"+
		"\u087a\7A\2\2\u087a\u0885\5\u0158\u00ad\2\u087b\u087c\7B\2\2\u087c\u087d"+
		"\7V\2\2\u087d\u0885\5\u015c\u00af\2\u087e\u087f\7r\2\2\u087f\u0885\5\u00a2"+
		"R\2\u0880\u0881\7\u0084\2\2\u0881\u0885\5\u00b4[\2\u0882\u0883\7\u0088"+
		"\2\2\u0883\u0885\5\n\6\2\u0884\u081d\3\2\2\2\u0884\u0820\3\2\2\2\u0884"+
		"\u0825\3\2\2\2\u0884\u0827\3\2\2\2\u0884\u082c\3\2\2\2\u0884\u082e\3\2"+
		"\2\2\u0884\u0830\3\2\2\2\u0884\u0834\3\2\2\2\u0884\u0837\3\2\2\2\u0884"+
		"\u0874\3\2\2\2\u0884\u0879\3\2\2\2\u0884\u087b\3\2\2\2\u0884\u087e\3\2"+
		"\2\2\u0884\u0880\3\2\2\2\u0884\u0882\3\2\2\2\u0885\u014d\3\2\2\2\u0886"+
		"\u0887\7\u0124\2\2\u0887\u014f\3\2\2\2\u0888\u088d\5\u014e\u00a8\2\u0889"+
		"\u088a\7\u00bb\2\2\u088a\u088c\5\u014e\u00a8\2\u088b\u0889\3\2\2\2\u088c"+
		"\u088f\3\2\2\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0151\3\2"+
		"\2\2\u088f\u088d\3\2\2\2\u0890\u0891\t\37\2\2\u0891\u0153\3\2\2\2\u0892"+
		"\u0893\7\u0124\2\2\u0893\u0155\3\2\2\2\u0894\u0895\7\u0124\2\2\u0895\u0157"+
		"\3\2\2\2\u0896\u089b\5\u0156\u00ac\2\u0897\u0898\7\u00bb\2\2\u0898\u089a"+
		"\5\u0156\u00ac\2\u0899\u0897\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u0899\3"+
		"\2\2\2\u089b\u089c\3\2\2\2\u089c\u0159\3\2\2\2\u089d\u089b\3\2\2\2\u089e"+
		"\u089f\7\u0124\2\2\u089f\u015b\3\2\2\2\u08a0\u08a5\5\u015a\u00ae\2\u08a1"+
		"\u08a2\7\u00bb\2\2\u08a2\u08a4\5\u015a\u00ae\2\u08a3\u08a1\3\2\2\2\u08a4"+
		"\u08a7\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u015d\3\2"+
		"\2\2\u08a7\u08a5\3\2\2\2\u08a8\u08aa\7\u00d2\2\2\u08a9\u08a8\3\2\2\2\u08a9"+
		"\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08b0\5\u0088E\2\u08ac\u08b0"+
		"\7e\2\2\u08ad\u08b0\7\32\2\2\u08ae\u08b0\7z\2\2\u08af\u08a9\3\2\2\2\u08af"+
		"\u08ac\3\2\2\2\u08af\u08ad\3\2\2\2\u08af\u08ae\3\2\2\2\u08b0\u015f\3\2"+
		"\2\2\u08b1\u08b6\5\u015e\u00b0\2\u08b2\u08b3\7\u00bb\2\2\u08b3\u08b5\5"+
		"\u015e\u00b0\2\u08b4\u08b2\3\2\2\2\u08b5\u08b8\3\2\2\2\u08b6\u08b4\3\2"+
		"\2\2\u08b6\u08b7\3\2\2\2\u08b7\u0161\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b9"+
		"\u08ba\7\u0105\2\2\u08ba\u08bb\5\u00bc_\2\u08bb\u08bc\7\u0117\2\2\u08bc"+
		"\u08c0\5\u00bc_\2\u08bd\u08be\7\u00ed\2\2\u08be\u08bf\7\5\2\2\u08bf\u08c1"+
		"\7\u010b\2\2\u08c0\u08bd\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u0163\3\2\2"+
		"\2\u08c2\u08c6\7\u0110\2\2\u08c3\u08c4\7\u0105\2\2\u08c4\u08c5\7\u010b"+
		"\2\2\u08c5\u08c7\7\u0101\2\2\u08c6\u08c3\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7"+
		"\u08c8\3\2\2\2\u08c8\u08ca\5\u014a\u00a6\2\u08c9\u08cb\5\u00b0Y\2\u08ca"+
		"\u08c9\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08d3\3\2\2\2\u08cc\u08cd\7\u00bb"+
		"\2\2\u08cd\u08cf\5\u014a\u00a6\2\u08ce\u08d0\5\u00b0Y\2\u08cf\u08ce\3"+
		"\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08cc\3\2\2\2\u08d2"+
		"\u08d5\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\3\2"+
		"\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08d7\5\u014c\u00a7\2\u08d7\u08d8\7\u00d1"+
		"\2\2\u08d8\u08da\5\u0160\u00b1\2\u08d9\u08db\t\24\2\2\u08da\u08d9\3\2"+
		"\2\2\u08da\u08db\3\2\2\2\u08db\u0165\3\2\2\2\u08dc\u08e0\7\u0110\2\2\u08dd"+
		"\u08de\7\5\2\2\u08de\u08df\7\u010b\2\2\u08df\u08e1\7\u0101\2\2\u08e0\u08dd"+
		"\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e3\5\u00bc_"+
		"\2\u08e3\u08e4\7\u00d1\2\2\u08e4\u08e6\5\u00bc_\2\u08e5\u08e7\t\24\2\2"+
		"\u08e6\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u0167\3\2\2\2\u08e8\u08e9"+
		"\7\u00f9\2\2\u08e9\u08ea\7\u011b\2\2\u08ea\u08ef\5\u0090I\2\u08eb\u08ed"+
		"\7\u00ed\2\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2"+
		"\2\u08ee\u08f0\5\u016c\u00b7\2\u08ef\u08ec\3\2\2\2\u08ef\u08f0\3\2\2\2"+
		"\u08f0\u0169\3\2\2\2\u08f1\u0919\7\u0081\2\2\u08f2\u0919\7S\2\2\u08f3"+
		"\u0919\7\27\2\2\u08f4\u0919\7N\2\2\u08f5\u0919\7\30\2\2\u08f6\u0919\7"+
		"O\2\2\u08f7\u0919\7<\2\2\u08f8\u0919\7P\2\2\u08f9\u0919\7F\2\2\u08fa\u0919"+
		"\7Q\2\2\u08fb\u0919\7j\2\2\u08fc\u0919\7R\2\2\u08fd\u0919\7\13\2\2\u08fe"+
		"\u0919\7M\2\2\u08ff\u0900\7\25\2\2\u0900\u0901\7\u00d9\2\2\u0901\u0919"+
		"\7\u011f\2\2\u0902\u0904\7$\2\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2"+
		"\2\u0904\u0905\3\2\2\2\u0905\u0906\7\u010c\2\2\u0906\u0919\7\u011e\2\2"+
		"\u0907\u0908\7\u0090\2\2\u0908\u0909\7\u008c\2\2\u0909\u0919\7\u011e\2"+
		"\2\u090a\u090b\7\u00d5\2\2\u090b\u090c\7\u0111\2\2\u090c\u0919\5\u00bc"+
		"_\2\u090d\u090e\7\u00d5\2\2\u090e\u090f\7\u00d2\2\2\u090f\u0919\5\u00bc"+
		"_\2\u0910\u0911\7\u0111\2\2\u0911\u0919\5\u00bc_\2\u0912\u0913\7\5\2\2"+
		"\u0913\u0919\5\u00bc_\2\u0914\u0915\7\u011b\2\2\u0915\u0919\5\u00bc_\2"+
		"\u0916\u0917\7\u0082\2\2\u0917\u0919\7\u011e\2\2\u0918\u08f1\3\2\2\2\u0918"+
		"\u08f2\3\2\2\2\u0918\u08f3\3\2\2\2\u0918\u08f4\3\2\2\2\u0918\u08f5\3\2"+
		"\2\2\u0918\u08f6\3\2\2\2\u0918\u08f7\3\2\2\2\u0918\u08f8\3\2\2\2\u0918"+
		"\u08f9\3\2\2\2\u0918\u08fa\3\2\2\2\u0918\u08fb\3\2\2\2\u0918\u08fc\3\2"+
		"\2\2\u0918\u08fd\3\2\2\2\u0918\u08fe\3\2\2\2\u0918\u08ff\3\2\2\2\u0918"+
		"\u0903\3\2\2\2\u0918\u0907\3\2\2\2\u0918\u090a\3\2\2\2\u0918\u090d\3\2"+
		"\2\2\u0918\u0910\3\2\2\2\u0918\u0912\3\2\2\2\u0918\u0914\3\2\2\2\u0918"+
		"\u0916\3\2\2\2\u0919\u016b\3\2\2\2\u091a\u091f\5\u016a\u00b6\2\u091b\u091c"+
		"\7\u00bb\2\2\u091c\u091e\5\u016a\u00b6\2\u091d\u091b\3\2\2\2\u091e\u0921"+
		"\3\2\2\2\u091f\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u016d\3\2\2\2\u0921"+
		"\u091f\3\2\2\2\u0922\u0923\7\u00f0\2\2\u0923\u0924\7\u011b\2\2\u0924\u0925"+
		"\5\u015e\u00b0\2\u0925\u0926\7\u00ed\2\2\u0926\u0927\5\u016c\u00b7\2\u0927"+
		"\u016f\3\2\2\2\u0928\u0929\7\u00f0\2\2\u0929\u092a\7\u011b\2\2\u092a\u092b"+
		"\5\u0090I\2\u092b\u092c\7g\2\2\u092c\u092d\7\u0117\2\2\u092d\u092e\5\u0090"+
		"I\2\u092e\u0171\3\2\2\2\u092f\u0930\5\u0176\u00bc\2\u0930\u0931\7\u00e5"+
		"\2\2\u0931\u0936\5\u0174\u00bb\2\u0932\u0933\t \2\2\u0933\u0937\t!\2\2"+
		"\u0934\u0935\7\u00d1\2\2\u0935\u0937\7\u00fa\2\2\u0936\u0932\3\2\2\2\u0936"+
		"\u0934\3\2\2\2\u0937\u0173\3\2\2\2\u0938\u0939\7\u0124\2\2\u0939\u0175"+
		"\3\2\2\2\u093a\u093b\7\u00f0\2\2\u093b\u093e\7\u011b\2\2\u093c\u093f\5"+
		"\u015e\u00b0\2\u093d\u093f\7\u00c3\2\2\u093e\u093c\3\2\2\2\u093e\u093d"+
		"\3\2\2\2\u093f\u0943\3\2\2\2\u0940\u0941\7\u00d5\2\2\u0941\u0942\7\35"+
		"\2\2\u0942\u0944\5Z.\2\u0943\u0940\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0177"+
		"\3\2\2\2\u0945\u0946\5\u0176\u00bc\2\u0946\u0949\7k\2\2\u0947\u094a\5"+
		"\u0174\u00bb\2\u0948\u094a\7\u00c3\2\2\u0949\u0947\3\2\2\2\u0949\u0948"+
		"\3\2\2\2\u094a\u0179\3\2\2\2\u094b\u094c\7\u00ff\2\2\u094c\u094f\7\u011b"+
		"\2\2\u094d\u094e\7\67\2\2\u094e\u0950\7\u00cf\2\2\u094f\u094d\3\2\2\2"+
		"\u094f\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\5\u00bc_\2\u0952"+
		"\u017b\3\2\2\2\u0953\u0954\7\u00f9\2\2\u0954\u0955\7\u0111\2\2\u0955\u095a"+
		"\5\u0088E\2\u0956\u0958\7\u00ed\2\2\u0957\u0956\3\2\2\2\u0957\u0958\3"+
		"\2\2\2\u0958\u0959\3\2\2\2\u0959\u095b\5\u016c\u00b7\2\u095a\u0957\3\2"+
		"\2\2\u095a\u095b\3\2\2\2\u095b\u017d\3\2\2\2\u095c\u095d\7\u00f0\2\2\u095d"+
		"\u095e\7\u0111\2\2\u095e\u095f\5\u015e\u00b0\2\u095f\u0960\7\u00ed\2\2"+
		"\u0960\u0961\5\u016c\u00b7\2\u0961\u017f\3\2\2\2\u0962\u0963\7\u00f0\2"+
		"\2\u0963\u0964\7\u0111\2\2\u0964\u0965\5\u0088E\2\u0965\u0966\7g\2\2\u0966"+
		"\u0967\7\u0117\2\2\u0967\u0968\5\u0088E\2\u0968\u0181\3\2\2\2\u0969\u096a"+
		"\5\u0184\u00c3\2\u096a\u096b\7\u00e5\2\2\u096b\u0970\5\u0174\u00bb\2\u096c"+
		"\u096d\t \2\2\u096d\u0971\t!\2\2\u096e\u096f\7\u00d1\2\2\u096f\u0971\7"+
		"\u00fa\2\2\u0970\u096c\3\2\2\2\u0970\u096e\3\2\2\2\u0971\u0183\3\2\2\2"+
		"\u0972\u0973\7\u00f0\2\2\u0973\u0976\7\u0111\2\2\u0974\u0977\5\u015e\u00b0"+
		"\2\u0975\u0977\7\u00c3\2\2\u0976\u0974\3\2\2\2\u0976\u0975\3\2\2\2\u0977"+
		"\u097b\3\2\2\2\u0978\u0979\7\u00d5\2\2\u0979\u097a\7\35\2\2\u097a\u097c"+
		"\5Z.\2\u097b\u0978\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u0185\3\2\2\2\u097d"+
		"\u097e\5\u0184\u00c3\2\u097e\u0981";
	private static final String _serializedATNSegment1 =
		"\7k\2\2\u097f\u0982\5\u0174\u00bb\2\u0980\u0982\7\u00c3\2\2\u0981\u097f"+
		"\3\2\2\2\u0981\u0980\3\2\2\2\u0982\u0187\3\2\2\2\u0983\u0984\7\u00ff\2"+
		"\2\u0984\u0987\7\u0111\2\2\u0985\u0986\7\67\2\2\u0986\u0988\7\u00cf\2"+
		"\2\u0987\u0985\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a"+
		"\5\u00bc_\2\u098a\u0189\3\2\2\2\u098b\u098c\7{\2\2\u098c\u098d\t\"\2\2"+
		"\u098d\u018b\3\2\2\2\u098e\u0990\7\u00e5\2\2\u098f\u0991\5\u018e\u00c8"+
		"\2\u0990\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993"+
		"\5\u0190\u00c9\2\u0993\u018d\3\2\2\2\u0994\u0995\t#\2\2\u0995\u018f\3"+
		"\2\2\2\u0996\u0997\7\u00e7\2\2\u0997\u0998\7\u0098\2\2\u0998\u099d\5\u0192"+
		"\u00ca\2\u0999\u099a\7\u0124\2\2\u099a\u099b\t \2\2\u099b\u099d\t$\2\2"+
		"\u099c\u0996\3\2\2\2\u099c\u0999\3\2\2\2\u099d\u0191\3\2\2\2\u099e\u099f"+
		"\t%\2\2\u099f\u0193\3\2\2\2\u09a0\u09a1\7k\2\2\u09a1\u09a2\t\"\2\2\u09a2"+
		"\u0195\3\2\2\2\u0103\u01b6\u01b9\u01be\u01c3\u01c8\u01cb\u01d3\u01d9\u01dd"+
		"\u01e3\u01e7\u01ea\u01f1\u01f7\u0202\u020b\u0215\u021d\u022a\u0232\u0237"+
		"\u023c\u023f\u0245\u0249\u024e\u0252\u0257\u0267\u026d\u0275\u0278\u027b"+
		"\u027f\u0282\u029c\u02a1\u02a4\u02ab\u02b5\u02b9\u02bc\u02bf\u02c3\u02cc"+
		"\u02d0\u02d5\u02da\u02de\u02ed\u02fc\u02ff\u0309\u030c\u0311\u0318\u031b"+
		"\u031e\u0327\u032b\u0337\u0343\u0353\u035c\u0365\u036b\u0379\u037e\u03c7"+
		"\u03c9\u03ce\u03d9\u03e5\u03ec\u03f0\u03f7\u03ff\u0407\u0413\u041f\u042b"+
		"\u0433\u043b\u0447\u044f\u0457\u045f\u0467\u046f\u0481\u0492\u0494\u049f"+
		"\u04ae\u04b0\u04b7\u04be\u04c7\u04ce\u04dc\u04e4\u04e9\u04ef\u051b\u051d"+
		"\u0538\u053f\u0541\u0547\u054b\u0565\u056a\u056e\u0570\u0581\u0587\u058a"+
		"\u058e\u0592\u0597\u059a\u05a4\u05aa\u05c3\u05c8\u05cc\u05d3\u05d7\u05db"+
		"\u05e1\u05eb\u05ee\u05f9\u05fc\u0608\u0611\u0616\u061c\u061f\u0623\u062d"+
		"\u0640\u0644\u064b\u065b\u065e\u0678\u0684\u0697\u06a1\u06a3\u06a7\u06ab"+
		"\u06b4\u06b9\u06bf\u06c3\u06c7\u06cc\u06d1\u06d5\u06eb\u06f3\u06fa\u0702"+
		"\u071a\u071e\u0727\u072a\u072e\u0731\u0733\u073a\u0745\u0748\u074c\u0761"+
		"\u076d\u0773\u0776\u077f\u0784\u078d\u0792\u079e\u07a1\u07ac\u07b1\u07b4"+
		"\u07b8\u07bd\u07c1\u07c6\u07ca\u07cd\u07d4\u07db\u07de\u07e3\u07ea\u07ed"+
		"\u07f4\u07f9\u07fd\u0806\u080a\u0819\u081d\u083b\u083e\u0843\u0846\u084b"+
		"\u084e\u0851\u0857\u085a\u085f\u0862\u0867\u086a\u086d\u0871\u0884\u088d"+
		"\u089b\u08a5\u08a9\u08af\u08b6\u08c0\u08c6\u08ca\u08cf\u08d3\u08da\u08e0"+
		"\u08e6\u08ec\u08ef\u0903\u0918\u091f\u0936\u093e\u0943\u0949\u094f\u0957"+
		"\u095a\u0970\u0976\u097b\u0981\u0987\u0990\u099c";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}